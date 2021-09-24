Feature: Compra de un artículo en línea

Scenario: Como usuario existente quiero realizar la compra de un producto

	Given: Cree un usuario en con mis datos personales
	And Cuento con el saldo suficiente en mi cuenta para realizar la compra de un artículo
	When Realizo la búsqueda del artículo que deseo comprar
	And Selecciono el artículo deseado
	And Selecciono el carrito de compras
	And Selecciono el botón de realizar compra
	And Selecciono el método de pago Saldo de cuenta
	And Selecciono el botón confirmar pago
	Then Debería ser avisado que mi compra se realizó con éxito
	And Debería recibir en mi correo personal ligado a la cuenta el aviso que la compra fue realizada
