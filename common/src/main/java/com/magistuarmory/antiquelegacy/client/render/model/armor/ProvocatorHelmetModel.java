package com.magistuarmory.antiquelegacy.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;


public class ProvocatorHelmetModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.6F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 39).addBox(-7.0F, -2.0F, -10.0F, 14.0F, 1.0F, 7.0F, new CubeDeformation(0.6F)), PartPose.offsetAndRotation(0.0F, 5.225F, 9.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 23).addBox(-6.0F, -2.0F, -10.0F, 12.0F, 1.0F, 6.0F, new CubeDeformation(0.6F)), PartPose.offsetAndRotation(0.0F, -0.15F, 4.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(18, 30).addBox(-4.0F, -3.0F, -4.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.8F)), PartPose.offsetAndRotation(0.0F, -3.6743F, -1.4067F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 35).addBox(-4.0F, -3.0F, -4.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.59F)), PartPose.offsetAndRotation(0.0F, -3.4003F, -1.4186F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(24, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.8F))
		.texOffs(0, 30).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.59F)), PartPose.offsetAndRotation(0.0F, -1.1701F, -0.312F, 0.2618F, 0.0F, 0.0F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);
		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}