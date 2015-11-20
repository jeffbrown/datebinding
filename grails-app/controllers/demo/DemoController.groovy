package demo

import org.grails.databinding.BindingFormat

class DemoController {

    def create(SomeCommand sc) {
        [command: sc]
    }
}

class SomeCommand {
    @BindingFormat('yyyy-MM-dd')
    Date dutyDate
}
