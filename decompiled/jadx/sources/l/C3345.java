package l;

/* JADX INFO: renamed from: l.ۗܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 9A0K */
/* JADX INFO: loaded from: classes2.dex */
public final class C3345 extends AbstractC6167 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C20279[] f10573;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f10574;

    @Override // l.AbstractC6167
    /* JADX INFO: renamed from: ۧ */
    public final void mo2235(C13222 c13222) {
        c13222.m32063(4);
        c13222.m32069(this.f10574);
        c13222.m32060(this.f10573);
        if (this.f10573 != null) {
            C13222 c13223 = c13222.f39585;
            int i = this.f10574;
            c13223.m32069(i);
            int i2 = c13223.f39586;
            c13223.m32059(i * 12);
            C13222 c13222M32066 = c13223.m32066(i2);
            for (int i3 = 0; i3 < i; i3++) {
                this.f10573[i3].mo2235(c13222M32066);
            }
        }
    }

    @Override // l.AbstractC6167
    /* JADX INFO: renamed from: ֫ */
    public final void mo2234(C13222 c13222) throws C12517 {
        c13222.m32063(4);
        this.f10574 = c13222.m32058();
        if (c13222.m32058() != 0) {
            C13222 c13223 = c13222.f39585;
            int iM32058 = c13223.m32058();
            int i = c13223.f39586;
            c13223.m32059(iM32058 * 12);
            if (this.f10573 == null) {
                if (iM32058 < 0 || iM32058 > 65535) {
                    throw new C12517("invalid array conformance");
                }
                this.f10573 = new C20279[iM32058];
            }
            C13222 c13222M32066 = c13223.m32066(i);
            for (int i2 = 0; i2 < iM32058; i2++) {
                C20279[] c20279Arr = this.f10573;
                if (c20279Arr[i2] == null) {
                    c20279Arr[i2] = new C20279();
                }
                c20279Arr[i2].mo2234(c13222M32066);
            }
        }
    }
}
