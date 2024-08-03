package com.magistuarmory.antiquelegacy.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;


public class ThracianHelmetModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.6F))
		.texOffs(0, 17).addBox(-4.0F, -9.0F, -5.0F, 8.0F, 9.0F, 9.0F, new CubeDeformation(0.8F))
		.texOffs(48, 0).addBox(-0.5F, -10.6F, -2.4F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(51, 8).addBox(-0.5F, -11.6F, -2.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(44, 15).addBox(-5.0F, -8.0F, -2.0F, 9.0F, 8.0F, 1.0F, new CubeDeformation(0.29F)), PartPose.offsetAndRotation(0.5F, 4.075F, -4.625F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 35).addBox(-4.0F, -1.0F, -1.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.799F))
		.texOffs(0, 46).addBox(-4.0F, -1.0F, -1.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.599F)), PartPose.offsetAndRotation(0.0F, -4.6358F, -4.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);
		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}