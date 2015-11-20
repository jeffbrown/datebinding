package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(DemoController)
class DemoControllerSpec extends Specification {

    void "test date format"() {
        when:
        params.dutyDate = '1969-11-15'
        def model = controller.create()
        def command = model.command

        then:
        command.dutyDate.year == 69
        command.dutyDate.month == Calendar.NOVEMBER
        command.dutyDate.date == 15
    }
}
