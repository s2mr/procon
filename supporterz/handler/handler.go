package handler

import (
	"net/http"

	"io/ioutil"
	"log"

	"encoding/json"

	"github.com/gin-gonic/gin"
)

type Request struct {
	Order []string `json:"order"`
}

func CheckoutHandler(c *gin.Context) {

	bytes, _ := ioutil.ReadAll(c.Request.Body)
	log.Printf("%s", bytes)

	var request Request

	if err := json.Unmarshal(bytes, &request); err != nil {
		log.Fatal(err)
	}

	log.Printf("order[0]: %s\n", request.Order[0])

	c.String(http.StatusOK, "OK")
}
