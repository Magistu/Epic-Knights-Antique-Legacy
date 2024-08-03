package com.magistuarmory.antiquelegacy.client.render.model.shield;

import com.magistuarmory.client.render.model.item.MedievalShieldModel;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@Environment(EnvType.CLIENT)
public class RepublicScutumModel extends MedievalShieldModel
{
	public RepublicScutumModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition plate = partdefinition.addOrReplaceChild("plate", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -11.5F, -1.0F, 5.0F, 23.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 0).addBox(-1.5F, -2.5F, -2.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 0).addBox(-0.5F, -10.5F, -2.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 0).addBox(-0.5F, 2.5F, -2.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = plate.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(21, 44).addBox(5.5F, -18.0F, -1.0F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 44).addBox(4.5F, -20.0F, -1.0F, 1.0F, 19.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 42).addBox(2.5F, -21.0F, -1.0F, 2.0F, 21.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 0).addBox(2.5F, -21.0F, -1.0F, 4.0F, 21.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0921F, 10.5F, -1.7286F, 0.0F, -0.6545F, 0.0F));

		PartDefinition cube_r2 = plate.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(6, 42).mirror().addBox(-4.5F, -21.0F, -1.0F, 2.0F, 21.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(16, 44).mirror().addBox(-5.5F, -20.0F, -1.0F, 1.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 44).mirror().addBox(-6.5F, -18.0F, -1.0F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 0).addBox(-6.5F, -21.0F, -1.0F, 4.0F, 21.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0921F, 10.5F, -1.7286F, 0.0F, 0.6545F, 0.0F));

		PartDefinition handle = partdefinition.addOrReplaceChild("handle", CubeListBuilder.create().texOffs(0, 29).addBox(-3.0F, -0.5F, 0.0F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}