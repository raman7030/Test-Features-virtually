package bin.mt.plugin.api.drawable;

import android.graphics.drawable.Drawable;
import bin.mt.plugin.api.util.ServiceLoader;
import l.InterfaceC3304;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialIcons {
    public static Drawable get(String str) {
        return ((InterfaceC3304) ServiceLoader.get(InterfaceC3304.class)).get(str);
    }

    public static Drawable getOutlined(String str) {
        return ((InterfaceC3304) ServiceLoader.get(InterfaceC3304.class)).getOutlined(str);
    }
}
