package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1HV */
/* JADX INFO: loaded from: classes3.dex */
public final class C0762 extends C19814 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public EnumC4996 f2822;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C10662 f2823;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C0056 f2824;

    @Override // l.C19814, l.AbstractC11347
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String mo2915() {
        return "#document";
    }

    public C0762(String str) {
        super(C16305.m38357("#root", C1489.f5328), str, null);
        this.f2824 = new C0056();
        this.f2822 = EnumC4996.noQuirks;
        this.f2823 = new C10662(new C17136());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C0762 m2906(String str) {
        C0762 c0762 = new C0762(str);
        c0762.f2823 = c0762.f2823;
        C19814 c19814M45592 = c0762.m45592("html");
        c19814M45592.m45592("head");
        c19814M45592.m45592("body");
        return c0762;
    }

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final C19814 m2917() {
        C19814 c19814M45592;
        Iterator it = m45567().iterator();
        do {
            if (!it.hasNext()) {
                c19814M45592 = m45592("html");
                break;
            }
            c19814M45592 = (C19814) it.next();
        } while (!c19814M45592.m45588().equals("html"));
        for (C19814 c19814 : c19814M45592.m45567()) {
            if ("body".equals(c19814.m45588()) || "frameset".equals(c19814.m45588())) {
                return c19814;
            }
        }
        return c19814M45592.m45592("body");
    }

    static {
        new C23983("title");
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String mo2910() {
        return m45580();
    }

    @Override // l.C19814
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void mo2916(String str) {
        m2917().mo2916(str);
    }

    @Override // l.C19814, l.AbstractC11347
    /* JADX INFO: renamed from: clone */
    public final Object mo2918clone() {
        C0762 c0762 = (C0762) super.mo2918clone();
        c0762.f2824 = this.f2824.clone();
        return c0762;
    }

    @Override // l.C19814, l.AbstractC11347
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final AbstractC11347 mo2918clone() {
        C0762 c0762 = (C0762) super.mo2918clone();
        c0762.f2824 = this.f2824.clone();
        return c0762;
    }

    @Override // l.C19814, l.AbstractC11347
    /* JADX INFO: renamed from: clone */
    public final C19814 mo2918clone() {
        C0762 c0762 = (C0762) super.mo2918clone();
        c0762.f2824 = this.f2824.clone();
        return c0762;
    }

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final C0762 m2913() {
        C0762 c0762 = new C0762(mo25050());
        C15578 c15578 = this.f64008;
        if (c15578 != null) {
            c0762.f64008 = c15578.clone();
        }
        c0762.f2824 = this.f2824.clone();
        return c0762;
    }

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final C0056 m2907() {
        return this.f2824;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2912(C0056 c0056) {
        this.f2824 = c0056;
    }

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final EnumC4996 m2914() {
        return this.f2822;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2908(EnumC4996 enumC4996) {
        this.f2822 = enumC4996;
    }

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final C10662 m2911() {
        return this.f2823;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2909(C10662 c10662) {
        this.f2823 = c10662;
    }
}
