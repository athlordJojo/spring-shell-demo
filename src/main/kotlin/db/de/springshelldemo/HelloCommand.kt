package db.de.springshelldemo

import org.springframework.shell.command.annotation.Command

@Command
class HelloCommand {

    @Command(command = ["hello"])
    fun hello():String = "Hello Joan"
}