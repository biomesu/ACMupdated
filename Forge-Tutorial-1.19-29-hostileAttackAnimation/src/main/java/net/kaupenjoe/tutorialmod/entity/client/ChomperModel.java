package net.kaupenjoe.tutorialmod.entity.client;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.entity.custom.ChomperEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ChomperModel extends AnimatedGeoModel<ChomperEntity> {
    @Override
    public ResourceLocation getModelResource(ChomperEntity object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "geo/jose.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ChomperEntity object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/jose.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ChomperEntity animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "animations/jose.animation.json");
    }
}
