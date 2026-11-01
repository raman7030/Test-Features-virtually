package bin.p000mt.plugin.api.drawable;

import android.graphics.drawable.Drawable;
import bin.p000mt.plugin.api.util.ServiceLoader;
import p067l.C17117;
import p067l.C21466;
import p067l.C21813;
import p067l.InterfaceC5509;

/* JADX INFO: loaded from: classes.dex */
public class MaterialIconsImpl implements InterfaceC5509 {
    public static void register() {
        ServiceLoader.register(InterfaceC5509.class, new MaterialIconsImpl());
    }

    @Override // p067l.InterfaceC5509
    public Drawable get(String str) {
        C17117 c17117M49182 = C21813.m49182(str, true);
        if (c17117M49182 != null) {
            return c17117M49182;
        }
        throw new IllegalArgumentException(C21466.m48631("Filled material icon not found: ", str));
    }

    @Override // p067l.InterfaceC5509
    public Drawable getOutlined(String str) {
        C17117 c17117M49182 = C21813.m49182(str, false);
        if (c17117M49182 != null) {
            return c17117M49182;
        }
        throw new IllegalArgumentException(C21466.m48631("Outlined material icon not found: ", str));
    }
}
