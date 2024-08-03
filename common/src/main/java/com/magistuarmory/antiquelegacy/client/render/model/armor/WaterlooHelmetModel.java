package com.magistuarmory.antiquelegacy.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;


public class WaterlooHelmetModel
{

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.6F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 6).mirror().addBox(-1.8F, -8.6F, -1.2F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.25F)).mirror(false)
				.texOffs(12, 6).mirror().addBox(-1.8F, -8.6F, -1.2F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.6F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -6.45F, 0.0F, 0.0F, 0.0F, -0.8378F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 6).addBox(-1.2F, -8.6F, -1.2F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.6F))
				.texOffs(0, 6).addBox(-1.2F, -8.6F, -1.2F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(2.0F, -6.45F, 0.0F, 0.0F, 0.0F, 0.8378F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);
		return LayerDefinition.create(meshdefinition, 32, 32);
	}
}