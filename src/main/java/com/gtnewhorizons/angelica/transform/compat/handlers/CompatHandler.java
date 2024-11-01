package com.gtnewhorizons.angelica.transform.compat.handlers;

import com.gtnewhorizons.angelica.transform.compat.CompatHandlerVisitor;

import java.util.List;
import java.util.Map;

public interface CompatHandler {

    default void accept(CompatHandlerVisitor visitor) {
        visitor.visit(this);
    }

     Map<String, List<String>> getFieldLevelTessellator();

     Map<String, List<String>> getTileEntityNullGuard();

     Map<String, Boolean> getThreadSafeISBRHAnnotations();

}
