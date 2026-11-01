package p067l;

/* JADX INFO: renamed from: l.۬ۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E7M5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14804 implements InterfaceC13110 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14134 f42229;

    public C14804(C14134 c14134) {
        this.f42229 = c14134;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33811() {
        C14134 c14134 = this.f42229;
        int i = c14134.f40147 - 1;
        c14134.f40147 = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (C19144 c19144 : c14134.f40155) {
            i2 += c19144.m43625().f21837;
        }
        C15020[] c15020Arr = new C15020[i2];
        int i3 = 0;
        for (C19144 c19145 : c14134.f40155) {
            int i4 = c19145.m43625().f21837;
            int i5 = 0;
            while (i5 < i4) {
                c15020Arr[i3] = c19145.m43625().m19034(i5);
                i5++;
                i3++;
            }
        }
        c14134.f40139 = new C8243(c15020Arr);
        c14134.f40138.mo13096((InterfaceC11441) c14134);
    }

    @Override // p067l.InterfaceC20985
    /* JADX INFO: renamed from: ֫ */
    public final void mo13095(InterfaceC2878 interfaceC2878) {
        C14134 c14134 = this.f42229;
        c14134.f40138.mo13095((InterfaceC2878) c14134);
    }
}
