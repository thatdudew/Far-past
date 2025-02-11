package bedrock.farpast.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import bedrock.farpast.entity.OuranoEntity;

public class OuranoModel extends GeoModel<OuranoEntity> {
	@Override
	public ResourceLocation getAnimationResource(OuranoEntity entity) {
		return ResourceLocation.parse("far_past:animations/ourano.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OuranoEntity entity) {
		return ResourceLocation.parse("far_past:geo/ourano.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OuranoEntity entity) {
		return ResourceLocation.parse("far_past:textures/entities/" + entity.getTexture() + ".png");
	}

}
