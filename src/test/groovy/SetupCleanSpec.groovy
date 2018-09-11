import spock.lang.Specification

class SetupCleanSpec extends Specification {

    def pais

    def setupSpec() {
        println 'setup spec'
    }

    def setup() {
        println "setup"
        pais = "Peru"
    }

    def 'metodo uno'() {
        given:
            println "metodo uno"
        when:
            pais = pais.reverse()
        then:
            pais == "ureP"
    }

    def 'metodo dos'() {
        given:
            println "metodo dos"
        when:
            pais = pais.toUpperCase()
        then:
            pais == "PERU"
    }
}