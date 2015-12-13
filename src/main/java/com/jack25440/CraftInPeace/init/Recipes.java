package com.jack25440.CraftInPeace.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by Jack on 13/12/2015.
 */
public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(Blocks.end_portal_frame), "ppp", "sos", "sss", 'o', new ItemStack(Blocks.obsidian), 's', new ItemStack(Blocks.end_stone), 'p', new ItemStack(Items.ender_eye));
        GameRegistry.addRecipe(new ItemStack(Blocks.end_stone), "sss", "ses", "sss", 's', new ItemStack(Blocks.sandstone), 'e', new ItemStack(Items.ender_pearl));
        GameRegistry.addRecipe(new ItemStack(Items.ender_pearl), "rgr", "gdg", "rgr", 'r', new ItemStack(Items.redstone), 'g', new ItemStack(Items.glowstone_dust), 'd', new ItemStack(Items.diamond));
        GameRegistry.addRecipe(new ItemStack(Items.slime_ball), "wdw", "dgd", "wdw", 'w', new ItemStack(Items.water_bucket), 'd', new ItemStack(Blocks.dirt), 'g', new ItemStack(Items.dye, 1, 2));
        GameRegistry.addRecipe(new ItemStack(Items.gunpowder), "s s", " f ", "s s", 's', new ItemStack(Blocks.sand), 'f', new ItemStack(Items.flint));
        GameRegistry.addRecipe(new ItemStack(Items.blaze_rod), "l n", " n ", "n l", 'l', new ItemStack(Items.lava_bucket), 'n', new ItemStack(Blocks.netherrack));
        GameRegistry.addRecipe(new ItemStack(Items.blaze_rod), "n l", " n ", "l n", 'l', new ItemStack(Items.lava_bucket), 'n', new ItemStack(Blocks.netherrack));
        GameRegistry.addRecipe(new ItemStack(Items.string, 32), "www", "wsw", "www", 'w', new ItemStack(Blocks.wool), 's', new ItemStack(Items.shears));
        GameRegistry.addRecipe(new ItemStack(Items.rotten_flesh, 5), "dbd", "bbb", "dbd", 'd', new ItemStack(Blocks.dirt), 'b', new ItemStack(Items.beef));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.bone, 8), " b ", "bmb", " b ", 'b', "stickWood", 'm', new ItemStack(Items.milk_bucket)));
        GameRegistry.addRecipe(new ItemStack(Items.ghast_tear), "pop", "pdp", "ooo", 'p', new ItemStack(Items.ender_pearl), 'o', new ItemStack(Blocks.obsidian), 'd', new ItemStack(Items.diamond));
        GameRegistry.addRecipe(new ItemStack(Items.spider_eye), "fff", "fsf", "fff", 'f', new ItemStack(Items.rotten_flesh), 's', new ItemStack(Items.slime_ball));
    }
}
