package bin.mt.plugin.api.drawable;

import android.graphics.drawable.Drawable;
import bin.mt.plugin.api.util.ServiceLoader;
import l.C15518;
import l.C20094;
import l.C20459;
import l.InterfaceC3304;

/* JADX INFO: loaded from: classes.dex */
public class MaterialIconsImpl implements InterfaceC3304 {
    public static void register() {
        ServiceLoader.register(InterfaceC3304.class, new MaterialIconsImpl());
    }

    @Override // l.InterfaceC3304
    public Drawable get(String str) {
        C15518 c15518M46859 = C20459.m46859(str, true);
        if (c15518M46859 != null) {
            return c15518M46859;
        }
        throw new IllegalArgumentException(C20094.m46315("Filled material icon not found: ", str));
    }

    @Override // l.InterfaceC3304
    public Drawable getOutlined(String str) {
        C15518 c15518M46859 = C20459.m46859(str, false);
        if (c15518M46859 != null) {
            return c15518M46859;
        }
        throw new IllegalArgumentException(C20094.m46315("Outlined material icon not found: ", str));
    }
}
