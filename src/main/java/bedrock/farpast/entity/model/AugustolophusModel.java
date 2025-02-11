package bedrock.farpast.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import bedrock.farpast.entity.AugustolophusEntity;

public class AugustolophusModel extends GeoModel<AugustolophusEntity> {
	@Override
	public ResourceLocation getAnimationResource(AugustolophusEntity entity) {
		return ResourceLocation.parse("far_past:animations/augustolophus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AugustolophusEntity entity) {
		return ResourceLocation.parse("far_past:geo/augustolophus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AugustolophusEntity entity) {
		return ResourceLocation.parse("far_past:textures/entities/" + entity.getTexture() + ".png");
	}

}
