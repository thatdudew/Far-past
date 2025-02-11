package bedrock.farpast.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import bedrock.farpast.entity.TrexEntity;

public class TrexModel extends GeoModel<TrexEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrexEntity entity) {
		return ResourceLocation.parse("far_past:animations/pa_tre.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrexEntity entity) {
		return ResourceLocation.parse("far_past:geo/pa_tre.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrexEntity entity) {
		return ResourceLocation.parse("far_past:textures/entities/" + entity.getTexture() + ".png");
	}

}
