import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

fun String.getIdade(): Int{
    val formatoPadrao = DateTimeFormatter.ofPattern("dd/mm/yyyy")
    val dataString = LocalDate.parse(this, formatoPadrao)
    return Period.between(dataString, LocalDate.now()).years
}