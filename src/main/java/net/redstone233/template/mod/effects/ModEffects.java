package net.redstone233.template.mod.effects;

import net.redstone233.template.mod.TemplateMod;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffects {

    public static final StatusEffect FIRE_STATUS_EFFECT = 
        registerModEffects("fire_effect",
            new FireEffects());

    public static final StatusEffect GREAT_FIRE_STATUS = 
        registerModEffects("great_fire_effect",
            new GreatFireEffect());

    private static final StatusEffect registerModEffects(String name,StatusEffect effect) {
        return Registry.register(Registries.STATUS_EFFECT, 
            new Identifier(TemplateMod.MOD_ID, name), effect);
    }

    public static void registerModEffects() {
        
    }
}
