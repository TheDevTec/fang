package world.cepi.sabre.commands

import net.minestom.server.command.CommandSender
import net.minestom.server.command.builder.Arguments
import net.minestom.server.command.builder.Command
import net.minestom.server.command.builder.arguments.Argument
import net.minestom.server.command.builder.arguments.ArgumentType
import net.minestom.server.entity.Player
import net.minestom.server.utils.Position
import world.cepi.sabre.getPlayer

object TpCommand: Command("tp") {
    init {
        setDefaultExecutor { source, _ ->
            source.sendMessage("Usage: /tp <x> <y> <z>")
        }

        val x = ArgumentType.Float("x")
        val y = ArgumentType.Float("y")
        val z = ArgumentType.Float("z")
        val playerArg = ArgumentType.String("player")

        addSyntax({sender, args ->
            var target = getPlayer(args.getWord("player"))
            if (target != null && sender is Player) sender.teleport(target.position)
        }, playerArg)

        addSyntax({source: CommandSender?, args: Arguments? ->
            if (source is Player)  source.teleport(Position(args!!.getFloat("x"), args.getFloat("y"), args.getFloat("z")))
        })
    }
}