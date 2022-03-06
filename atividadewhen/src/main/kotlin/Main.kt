fun main(args: Array<String>) {
    atividade1()
    atividade2()
}

fun atividade1(): Unit {
    println("Digite o número de crianças nascidas:")
    val num1 = readLine()!!.toFloat()
    println("Digite o número de habitantes:")
    val num2 = readLine()!!.toFloat()
    println("Digite o número de óbitos:")
    val num3 = readLine()!!.toFloat()
    println("Escolha a operação:\n1 - TaxaDeNatalidade\n2 - TaxaDeMortalidade")
    val operacao = readLine()!!.toInt()

    when (operacao) {
        1 -> println("A taxa de natalidade é ${(num1 * 1000) / num2}")
        2 -> println("A taxa de mortalidade é ${(num3 * 1000) / num2}")
        else -> println("Inválido!!")
    }
}

fun atividade2(): Unit {
    println("Digite o valor do produtp:")
    val valorDoProduto = readLine()!!.toFloat()
    println("Digite a forma de pagamento:")
    println("Escolha o tipo de cliente?:\n1 - à vista\n2 - à prazo(30 dias)\n3 - à prazo parcelado")
    val formaDePagamento = readLine()!!.toInt()

    when (formaDePagamento) {
        1 -> println("total a pagar: ${formaDePagamento - formaDePagamento * 0.10}")
        2 -> println("Total a pagar: ${formaDePagamento - formaDePagamento + 0.05}")
        3 -> println("Total a pagar: ${formaDePagamento - formaDePagamento + 1.50}")
        else -> println("Total a pagar: $valorDoProduto")
    }
}