package com.beyyt.randomchance;

import java.util.Random;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

// Mob imports
// change {mob} with mob name
// import org.bukkit.entity.{mob};

public class RandomChance extends JavaPlugin {
	
	// does thing when plugin is enabled
    @Override
    public void onEnable() {
    	System.out.println("Booting Up...");
    	getServer().getPluginManager().registerEvents(new Checks(), this);
    }
    // does thing when plugin is disabled
    @Override
    public void onDisable() {
    	// Unless You Plan To Do Anything here, leave this empty
    }
    
    // drop chance thing
    public class Checks implements Listener {
	    @EventHandler
	    // on mob death
	    public void onDeath(EntityDeathEvent e){
	      // Imports Func.java
	      Func drops = new Func();
	      
	      // Gets Dead Mob Entity.
	      
	      // Use if you are checking if a specific mod is killed.
	      // for ex: if(chance == some_int && instanceof Zombie)
	      
	      // Entity mob = e.getEntity();
	      
	      // Gets The Killer (Player)
	      Entity killer = e.getEntity().getKiller();
	    
	      // if killer is player
	      if (killer instanceof Player){
	    	  // not gambling 100%
	    	  Random r = new Random();
	    	  
	    	  // 1 in 10 chance to drop
	    	  int test = r.nextInt(10);

	    	  // Dog Core Drop
	    	  if(test == 5) {
	    		  drops.test(killer);
	    	  }
	      	}
	    }
    }
}
