package p067l;

import java.util.Collection;

/* JADX INFO: renamed from: l.֫ܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C4157 extends C10192 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C23603 f9174;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4157(C23603 c23603) {
        super(c23603, EnumC22423.CLASS_PATH, EnumC2483.f3962);
        this.f9174 = c23603;
    }

    @Override // p067l.C10192
    /* JADX INFO: renamed from: ᩻ */
    public final C3486 mo8428() {
        String property = System.getProperty("env.class.path");
        if (property == null && System.getProperty("application.home") == null) {
            property = System.getProperty("java.class.path");
        }
        if (property == null) {
            property = ".";
        }
        C3486 c3486Mo8426 = mo8426();
        c3486Mo8426.m6222(property);
        return c3486Mo8426;
    }

    @Override // p067l.C10192
    /* JADX INFO: renamed from: ۜ */
    public final C3486 mo8426() {
        C23603 c23603 = this.f9174;
        C3486 c3486 = new C3486(c23603);
        c3486.m6227();
        c3486.m6224(c23603.m52425(".", new String[0]));
        return c3486;
    }

    @Override // p067l.C10192, p067l.AbstractC12875
    /* JADX INFO: renamed from: ܽ */
    public final Collection mo8427() {
        if (this.f28258 == null) {
            mo22379((Iterable) null);
        }
        return this.f28258;
    }
}
