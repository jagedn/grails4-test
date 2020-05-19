package test4

class BootStrap {
def grailsApplication
    def init = { servletContext ->
println grailsApplication.config.hola
    }
    def destroy = {
    }
}
