package db.de.springshelldemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.shell.command.annotation.CommandScan
import org.springframework.shell.command.annotation.EnableCommand

@SpringBootApplication
@CommandScan
@EnableCommand(HelloCommand::class)
class SpringShellDemoApplication

fun main(args: Array<String>) {
    runApplication<SpringShellDemoApplication>(*args)
}
