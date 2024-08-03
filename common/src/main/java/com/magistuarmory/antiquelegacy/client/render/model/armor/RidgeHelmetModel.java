package com.magistuarmory.antiquelegacy.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class RidgeHelmetModel
{

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.5F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.55F))
		.texOffs(32, 0).addBox(-4.0F, -8.25F, -4.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.75F))
		.texOffs(32, 51).addBox(-4.0F, -8.25F, -4.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(1.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 56).addBox(-2.025F, -3.5F, 0.4F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(0.0F, -3.775F, -5.025F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(7, 51).addBox(-4.0F, 1.0F, -0.05F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.75F)), PartPose.offsetAndRotation(0.0F, -1.9342F, 4.5657F, -0.6109F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}