package bedrock.farpast.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import bedrock.farpast.entity.HadroEntity;

public class HadroModel extends GeoModel<HadroEntity> {
	@Override
	public ResourceLocation getAnimationResource(HadroEntity entity) {
		return ResourceLocation.parse("far_past:animations/hadro.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HadroEntity entity) {
		return ResourceLocation.parse("far_past:geo/hadro.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HadroEntity entity) {
		return ResourceLocation.parse("far_past:textures/entities/" + entity.getTexture() + ".png");
	}

}
