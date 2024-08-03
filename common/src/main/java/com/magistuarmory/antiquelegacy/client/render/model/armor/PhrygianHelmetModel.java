package com.magistuarmory.antiquelegacy.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;


public class PhrygianHelmetModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -8.3F, -5.0F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.25F))
		.texOffs(28, 21).addBox(-4.0F, -10.4F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.1F))
		.texOffs(27, 13).addBox(-3.0F, -11.4F, -2.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.1F))
		.texOffs(0, 13).addBox(-4.5F, -5.0F, -4.5F, 9.0F, 7.0F, 9.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -6.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.5F, -13.956F, 3.2442F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -0.5F, -4.5F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.09F)), PartPose.offsetAndRotation(-0.5F, -10.8536F, 1.7804F, -1.0472F, 0.0F, 0.0F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);
		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}