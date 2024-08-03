package com.magistuarmory.antiquelegacy.client.render.model.shield;

import com.magistuarmory.client.render.model.item.MedievalShieldModel;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@Environment(EnvType.CLIENT)
public class PeltaModel extends MedievalShieldModel
{
	public PeltaModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition plate = partdefinition.addOrReplaceChild("plate", CubeListBuilder.create().texOffs(0, 0).addBox(-7.4F, -6.2F, -1.0F, 15.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 25).addBox(-4.4F, -5.2F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 25).addBox(2.6F, -5.2F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(2.6F, -4.2F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 23).addBox(-5.4F, -4.2F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 13).addBox(-6.4F, -3.2F, -1.0F, 13.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 19).addBox(-5.4F, 1.8F, -1.0F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(-4.4F, 2.8F, -1.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 23).addBox(-2.4F, 3.8F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition handle = partdefinition.addOrReplaceChild("handle", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		handle.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 19).addBox(-0.5F, -3.0F, -2.6F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -24.0F, 2.0F, 0.0F, 0.0F, -0.5236F));

		handle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(20, 19).addBox(-0.5F, -3.0F, -2.5F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -24.0F, 2.0F, 0.0F, 0.0F, 0.5236F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}
}