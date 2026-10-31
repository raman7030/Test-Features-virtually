package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ResourcesLoaderUtils {
    public static boolean isColorResource(int i) {
        return 28 <= i && i <= 31;
    }

    public static boolean addResourcesLoaderToContext(Context context, Map map) throws Throwable {
        ResourcesLoader resourcesLoaderCreate = ColorResourcesLoaderCreator.create(context, map);
        if (resourcesLoaderCreate == null) {
            return false;
        }
        context.getResources().addLoaders(resourcesLoaderCreate);
        return true;
    }
}
