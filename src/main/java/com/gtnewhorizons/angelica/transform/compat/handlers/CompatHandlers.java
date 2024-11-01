package com.gtnewhorizons.angelica.transform.compat.handlers;

import com.gtnewhorizons.angelica.config.AngelicaConfig;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public enum CompatHandlers {

    STACKS_ON_STACKS(() -> AngelicaConfig.fixStacksOnStacksSodiumCompat, new StacksOnStacksCompatHandler()),
    EXTRA_UTILS(() -> AngelicaConfig.fixExtraUtilsSodiumCompat, new ExtraUtilsCompatHandler());

    private final Supplier<Boolean> applyIf;

    @Getter
    private final CompatHandler handler;

    CompatHandlers(Supplier<Boolean> applyIf, CompatHandler handler) {
        this.applyIf = applyIf;
        this.handler = handler;
    }

    public boolean shouldBeLoaded() {
        return applyIf.get();
    }

    public static List<CompatHandler> getHandlers() {
        final List<CompatHandler> list = new ArrayList<>();
        for (CompatHandlers handler : values()) {
            if (handler.shouldBeLoaded()) {
                list.add(handler.getHandler());
            }
        }
        return list;
    }
}
