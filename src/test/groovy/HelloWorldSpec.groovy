import spock.lang.Specification

class HelloWorldSpec extends Specification {

    def 'say hello'() {
        given:
            def name = "Edgar"
        when:
            def saludo = "Hello "
        and:
            saludo = saludo + name
        then:
            saludo == "Hello Edgar"
        
        when:
            saludo = "Hello " + "Spock"
        then:
            saludo == "Hello Spock"
    }

    def "length of Spock's and his friend's names"(){
        expect:
            name.size() == length
        
        where:
        name    | length
        "Spock" | 5
        "Kirk"  | 4
        "Scotty"| 6
    }
}