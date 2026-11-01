package bin.p000mt.plugin.api.drawable;

import android.graphics.drawable.Drawable;
import bin.p000mt.plugin.api.util.ServiceLoader;
import p067l.InterfaceC5509;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialIcons {
    public static Drawable get(String str) {
        return ((InterfaceC5509) ServiceLoader.get(InterfaceC5509.class)).get(str);
    }

    public static Drawable getOutlined(String str) {
        return ((InterfaceC5509) ServiceLoader.get(InterfaceC5509.class)).getOutlined(str);
    }
}
