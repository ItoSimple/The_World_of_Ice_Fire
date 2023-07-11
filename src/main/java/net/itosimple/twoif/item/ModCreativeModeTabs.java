package net.itosimple.twoif.item;

import net.itosimple.twoif.TWOIF;
import net.itosimple.twoif.block.ModBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PlaceOnWaterBlockItem;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TWOIF.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ModCreativeModeTabs {
    public static CreativeModeTab PLANETOS_ITEMS;
    public static CreativeModeTab PLANETOS_BLOCKS;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        PLANETOS_ITEMS =event.registerCreativeModeTab(new ResourceLocation(TWOIF.MOD_ID, "planetos_items"),
                builder -> builder.icon(() -> new ItemStack(ModItems.RUBY.get()))
                        .title(Component.translatable("creativemodetab.planetos_items")));
        PLANETOS_BLOCKS =event.registerCreativeModeTab(new ResourceLocation(TWOIF.MOD_ID, "planetos_blocks"),
                builder -> builder.icon(() -> new ItemStack(ModBlocks.RUBY_BLOCK.get()))
                        .title(Component.translatable("creativemodetab.planetos_blocks")));
    }
}



