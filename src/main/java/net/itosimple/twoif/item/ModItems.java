package net.itosimple.twoif.item;

import net.itosimple.twoif.TWOIF;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TWOIF.MOD_ID);

    public static final RegistryObject <Item> PIG_IRON = ITEMS.register("pig_iron",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject <Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject <Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject <Item> GOLD_CHAIN = ITEMS.register("gold_chain",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject <Item> CHAINMAIL = ITEMS.register("chainmail",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject <Item> GOLD_CHAINMAIL = ITEMS.register("gold_chainmail",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject <Item> KRAKEN_TENTACLE = ITEMS.register("kraken_tentacle",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
