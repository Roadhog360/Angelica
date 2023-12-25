package net.coderbot.iris.pipeline;

import com.gtnewhorizons.angelica.compat.toremove.RenderLayer;

public enum WorldRenderingPhase {
	NONE,
	SKY,
	SUNSET,
	CUSTOM_SKY, // Unused, just here to match OptiFine ordinals
	SUN,
	MOON,
	STARS,
	VOID,
	TERRAIN_SOLID,
	TERRAIN_CUTOUT_MIPPED,
	TERRAIN_CUTOUT,
	ENTITIES,
	BLOCK_ENTITIES,
	DESTROY,
	OUTLINE,
	DEBUG,
	HAND_SOLID,
	TERRAIN_TRANSLUCENT,
	TRIPWIRE,
	PARTICLES,
	CLOUDS,
	RAIN_SNOW,
	WORLD_BORDER,
	HAND_TRANSLUCENT;

}
