package handler

import (
	"net/http"

	"github.com/gin-gonic/gin"
)

func CheckoutHandler(c *gin.Context) {

	c.String(http.StatusOK, "OK")
}
