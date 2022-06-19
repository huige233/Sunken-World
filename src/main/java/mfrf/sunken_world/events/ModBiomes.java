package mfrf.sunken_world.events;

import mfrf.sunken_world.SunkenWorld;
import mfrf.sunken_world.registry.Biomes;
import mfrf.sunken_world.worldgen.BiomesGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBiomes {
    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event) {
        IForgeRegistry<Biome> registry = event.getRegistry();
        registry.register(BiomesGenerator.mysteryOcean().setRegistryName(Biomes.MYSTERY_OCEAN.getRegistryName()));
    }
}