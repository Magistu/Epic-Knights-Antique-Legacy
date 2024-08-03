package com.magistuarmory.antiquelegacy.client.render.model.shield;

import com.magistuarmory.client.render.model.item.MedievalShieldModel;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@Environment(EnvType.CLIENT)
public class TureosModel extends MedievalShieldModel
{
	public TureosModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition plate = partdefinition.addOrReplaceChild("plate", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -11.0F, -1.0F, 12.0F, 22.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 40).addBox(-1.0F, -11.0F, -2.0F, 2.0F, 22.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 59).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 47).addBox(-2.0F, 10.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 49).addBox(-4.0F, 8.0F, -1.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 55).addBox(-5.0F, 5.0F, -1.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 53).addBox(-6.0F, -5.0F, -1.0F, 12.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 51).addBox(-5.0F, -8.0F, -1.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 59).addBox(-4.0F, -10.0F, -1.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 62).addBox(-2.0F, -11.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone3 = plate.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition handle = partdefinition.addOrReplaceChild("handle", CubeListBuilder.create().texOffs(6, 43).addBox(-3.0F, -0.5F, 0.0F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}