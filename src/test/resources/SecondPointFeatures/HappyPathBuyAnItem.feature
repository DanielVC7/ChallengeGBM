Feature: Compra de un art�culo en l�nea

Scenario: Como usuario existente quiero realizar la compra de un producto

	Given: Cree un usuario en con mis datos personales
	And Cuento con el saldo suficiente en mi cuenta para realizar la compra de un art�culo
	When Realizo la b�squeda del art�culo que deseo comprar
	And Selecciono el art�culo deseado
	And Selecciono el carrito de compras
	And Selecciono el bot�n de realizar compra
	And Selecciono el m�todo de pago Saldo de cuenta
	And Selecciono el bot�n confirmar pago
	Then Deber�a ser avisado que mi compra se realiz� con �xito
	And Deber�a recibir en mi correo personal ligado a la cuenta el aviso que la compra fue realizada
