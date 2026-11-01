package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7QW */
/* JADX INFO: loaded from: classes.dex */
public final class C23559 extends HashMap {
    public static final long serialVersionUID = 1812267524140424433L;

    /* JADX INFO: renamed from: ᩸ */
    public static final C6468 f75031 = new C6468();

    /* JADX INFO: renamed from: ֫ */
    public static C23559 m52348(C5127 c5127) {
        C6468 c6468 = f75031;
        C23559 c23559 = (C23559) c5127.m10905(c6468);
        if (c23559 != null) {
            return c23559;
        }
        C23559 c235510 = new C23559();
        c5127.m10908(c6468, c235510);
        return c235510;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m52349(C4036 c4036, EnumC22889 enumC22889) {
        EnumC22889 enumC228810 = (EnumC22889) get(c4036);
        return (enumC228810 == null || enumC22889.m51120(enumC228810)) ? false : true;
    }
}
