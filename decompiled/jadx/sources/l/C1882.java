package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.֫ܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C1882 extends C8232 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22343 f6392;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882(C22343 c22343) {
        super(c22343, EnumC21101.CLASS_PATH, EnumC0121.f1186);
        this.f6392 = c22343;
    }

    @Override // l.C8232
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C1176 mo6226() {
        String property = System.getProperty("env.class.path");
        if (property == null && System.getProperty("application.home") == null) {
            property = System.getProperty("java.class.path");
        }
        if (property == null) {
            property = ".";
        }
        C1176 c1176Mo6224 = mo6224();
        c1176Mo6224.m3980(property);
        return c1176Mo6224;
    }

    @Override // l.C8232
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C1176 mo6224() {
        C22343 c22343 = this.f6392;
        C1176 c1176 = new C1176(c22343);
        c1176.m3985();
        c1176.m3982(c22343.m50086(".", new String[0]));
        return c1176;
    }

    @Override // l.C8232, l.AbstractC11055
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Collection mo6225() {
        if (this.f25348 == null) {
            mo20400((Iterable) null);
        }
        return this.f25348;
    }
}
