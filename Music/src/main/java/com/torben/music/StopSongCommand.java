package com.torben.music;

import com.xxmicloxx.NoteBlockAPI.songplayer.RadioSongPlayer;
import com.xxmicloxx.NoteBlockAPI.utils.NBSDecoder;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.File;

public class StopSongCommand implements CommandExecutor {

    private Main main;

    public StopSongCommand(Main  main){
        this.main = main;

    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;

            RadioSongPlayer rsp = new RadioSongPlayer(NBSDecoder.parse(new File(main.getDataFolder(), "AllStar.nbs")));
            rsp.destroy();

        }
        return false;
    }
}
