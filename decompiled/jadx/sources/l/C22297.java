package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7QW */
/* JADX INFO: loaded from: classes.dex */
public final class C22297 extends HashMap {
    public static final long serialVersionUID = 1812267524140424433L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C4314 f72304 = new C4314();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22297 m50018(C2903 c2903) {
        C4314 c4314 = f72304;
        C22297 c22297 = (C22297) c2903.m8838(c4314);
        if (c22297 != null) {
            return c22297;
        }
        C22297 c22298 = new C22297();
        c2903.m8841(c4314, c22298);
        return c22298;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50019(C1755 c1755, EnumC21592 enumC21592) {
        EnumC21592 enumC21593 = (EnumC21592) get(c1755);
        return (enumC21593 == null || enumC21592.m48773(enumC21593)) ? false : true;
    }
}
