package net.itosimple.twoif;

import com.mojang.logging.LogUtils;
import net.itosimple.twoif.block.ModBlocks;
import net.itosimple.twoif.item.ModCreativeModeTabs;
import net.itosimple.twoif.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TWOIF.MOD_ID)
public class TWOIF {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "twoif";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public TWOIF() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == ModCreativeModeTabs.PLANETOS_ITEMS) {
            event.accept(ModItems.PIG_IRON);
            event.accept(ModItems.STEEL_INGOT);
            event.accept(ModItems.RUBY);
            event.accept(ModItems.GOLD_CHAIN);
            event.accept(ModItems.CHAINMAIL);
            event.accept(ModItems.GOLD_CHAINMAIL);
            event.accept(ModItems.KRAKEN_TENTACLE);
        }
        if(event.getTab() == ModCreativeModeTabs.PLANETOS_BLOCKS){
            event.accept(ModBlocks.RUBY_BLOCK);
            event.accept(ModBlocks.RUBY_ORE);
            event.accept(ModBlocks.DEEPSLATE_RUBY_ORE);
            event.accept(ModBlocks.STEEL_BLOCK);
            event.accept(ModBlocks.PIG_IRON_BLOCK);

        }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
    }}
