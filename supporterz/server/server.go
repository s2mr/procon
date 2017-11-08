package server

import (
	"github.com/gin-gonic/gin"
	"github.com/shimokp/procon/supporterz/handler"
)

func Init() {
	router := gin.Default()

	v1 := router.Group("/api")
	{
		v1.POST("/checkout", handler.CheckoutHandler)
	}

	router.Run()
}
