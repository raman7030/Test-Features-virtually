package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import java.util.Map;
import l.C18637;

/* JADX INFO: loaded from: classes.dex */
public class ResourcesLoaderColorResourcesOverride implements ColorResourcesOverride {
    public ResourcesLoaderColorResourcesOverride() {
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    public boolean applyIfPossible(Context context, Map map) {
        if (!ResourcesLoaderUtils.addResourcesLoaderToContext(context, map)) {
            return false;
        }
        ThemeUtils.applyThemeOverlay(context, C18637.f58122);
        return true;
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    public Context wrapContextIfPossible(Context context, Map map) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, C18637.f58122);
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        return ResourcesLoaderUtils.addResourcesLoaderToContext(contextThemeWrapper, map) ? contextThemeWrapper : context;
    }

    public static ColorResourcesOverride getInstance() {
        return ResourcesLoaderColorResourcesOverrideSingleton.INSTANCE;
    }

    public class ResourcesLoaderColorResourcesOverrideSingleton {
        public static final ResourcesLoaderColorResourcesOverride INSTANCE = new ResourcesLoaderColorResourcesOverride();
    }
}
