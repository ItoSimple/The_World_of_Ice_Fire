package net.itosimple.twoif.item;

import net.itosimple.twoif.TWOIF;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PlaceOnWaterBlockItem;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TWOIF.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab PLANETOS_ITEMS;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        PLANETOS_ITEMS =event.registerCreativeModeTab(new ResourceLocation(TWOIF.MOD_ID, "planetos_items"),
                builder -> builder.icon(() -> new ItemStack(ModItems.STEEL_INGOT.get()))
                        .title(Component.translatable("creativemodetab.planetos_items")));
    }
}
