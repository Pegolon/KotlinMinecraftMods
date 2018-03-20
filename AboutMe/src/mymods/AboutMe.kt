package mymods

import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin

class AboutMe : JavaPlugin() {
  override fun onCommand(sender: CommandSender?, command: Command?, label: String?, args: Array<out String>?): Boolean {
    if (sender is Player) {
      if (label == "myname") {
        val myName: String = sender.displayName
        sender.sendMessage("Hallo " + myName)
        return true
      } else if (label == "mystats") {
        sender.sendMessage("Food level: ${sender.foodLevel}")
        sender.sendMessage("Health: ${sender.health}")
        return true
      } else if (label == "ouch") {
        sender.foodLevel -= 1
        sender.sendMessage("New food level: ${sender.foodLevel}")
        return true
      } else if (label == "yammie") {
        sender.foodLevel += 1
        sender.sendMessage("New food level: ${sender.foodLevel}")
        return true
      }
    }
    return false
  }
}
