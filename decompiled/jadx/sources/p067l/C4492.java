package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۖۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes2.dex */
public final class C4492 extends AbstractC3150 implements InterfaceC5614 {

    /* JADX INFO: renamed from: ۫ */
    public static final Comparator f10086 = new C10527();

    /* JADX INFO: renamed from: ۗ */
    public C19441 f10087;

    /* JADX INFO: renamed from: ۙ */
    public final int f10088;

    /* JADX INFO: renamed from: ۬ */
    public final C11198 f10089;

    /* JADX INFO: renamed from: ᩶ */
    public final String f10090;

    /* JADX INFO: renamed from: ܺ */
    public final int m9500() {
        return this.f10088;
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC24548 mo3533() {
        return this.f10087;
    }

    @Override // p067l.AbstractC3150
    public final String getName() {
        return this.f10087.getName();
    }

    @Override // p067l.InterfaceC5614
    public final int getNumber() {
        return this.f10087.m44211();
    }

    public final String toString() {
        return this.f10087.getName();
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ܿ */
    public final String mo3542() {
        return this.f10090;
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ۧ */
    public final C7174 mo3535() {
        return this.f10089.f31111;
    }

    public final C11198 getType() {
        return this.f10089;
    }

    public C4492(C19441 c19441, C7174 c7174, C11198 c11198, int i) {
        super(0);
        this.f5767 = c11198;
        this.f10088 = i;
        this.f10087 = c19441;
        this.f10089 = c11198;
        this.f10090 = c11198.mo3542() + '.' + c19441.getName();
        c7174.f18731.m54247(this);
    }

    public C4492(C11198 c11198, Integer num) {
        super(0);
        String str = "UNKNOWN_ENUM_VALUE_" + c11198.getName() + "_" + num;
        C18099 c18099NewBuilder = C19441.newBuilder();
        c18099NewBuilder.m41161(str);
        c18099NewBuilder.m41160(num.intValue());
        C19441 c19441BuildPartial = c18099NewBuilder.buildPartial();
        if (c19441BuildPartial.isInitialized()) {
            this.f5767 = c11198;
            this.f10088 = -1;
            this.f10087 = c19441BuildPartial;
            this.f10089 = c11198;
            this.f10090 = c11198.mo3542() + '.' + c19441BuildPartial.getName();
            return;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c19441BuildPartial);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9499(C4492 c4492) {
        c4492.m5384(c4492.f10087.m44214().m54499());
    }
}
