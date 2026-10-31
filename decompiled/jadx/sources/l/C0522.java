package l;

/* JADX INFO: renamed from: l.֡ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: RA0U */
/* JADX INFO: loaded from: classes2.dex */
public final class C0522 extends AbstractC6167 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f2178;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C8284[] f2179;

    @Override // l.AbstractC6167
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo2235(C13222 c13222) {
        c13222.m32063(4);
        c13222.m32069(this.f2178);
        c13222.m32060(this.f2179);
        if (this.f2179 != null) {
            C13222 c13223 = c13222.f39585;
            int i = this.f2178;
            c13223.m32069(i);
            int i2 = c13223.f39586;
            c13223.m32059(i * 4);
            C13222 c13222M32066 = c13223.m32066(i2);
            for (int i3 = 0; i3 < i; i3++) {
                this.f2179[i3].mo2235(c13222M32066);
            }
        }
    }

    @Override // l.AbstractC6167
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2234(C13222 c13222) throws C12517 {
        c13222.m32063(4);
        this.f2178 = c13222.m32058();
        if (c13222.m32058() != 0) {
            C13222 c13223 = c13222.f39585;
            int iM32058 = c13223.m32058();
            int i = c13223.f39586;
            c13223.m32059(iM32058 * 4);
            if (this.f2179 == null) {
                if (iM32058 < 0 || iM32058 > 65535) {
                    throw new C12517("invalid array conformance");
                }
                this.f2179 = new C8284[iM32058];
            }
            C13222 c13222M32066 = c13223.m32066(i);
            for (int i2 = 0; i2 < iM32058; i2++) {
                C8284[] c8284Arr = this.f2179;
                if (c8284Arr[i2] == null) {
                    c8284Arr[i2] = new C8284();
                }
                c8284Arr[i2].mo2234(c13222M32066);
            }
        }
    }
}
