package l;

/* JADX INFO: renamed from: l.ۙܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 9A0K */
/* JADX INFO: loaded from: classes3.dex */
public final class C4756 extends AbstractC6167 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C22395[] f15085;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f15086;

    @Override // l.AbstractC6167
    /* JADX INFO: renamed from: ۧ */
    public final void mo2235(C13222 c13222) {
        c13222.m32063(4);
        c13222.m32069(this.f15086);
        c13222.m32060(this.f15085);
        if (this.f15085 != null) {
            C13222 c13223 = c13222.f39585;
            int i = this.f15086;
            c13223.m32069(i);
            int i2 = c13223.f39586;
            c13223.m32059(i * 4);
            C13222 c13222M32066 = c13223.m32066(i2);
            for (int i3 = 0; i3 < i; i3++) {
                this.f15085[i3].mo2235(c13222M32066);
            }
        }
    }

    @Override // l.AbstractC6167
    /* JADX INFO: renamed from: ֫ */
    public final void mo2234(C13222 c13222) throws C12517 {
        c13222.m32063(4);
        this.f15086 = c13222.m32058();
        if (c13222.m32058() != 0) {
            C13222 c13223 = c13222.f39585;
            int iM32058 = c13223.m32058();
            int i = c13223.f39586;
            c13223.m32059(iM32058 * 4);
            if (this.f15085 == null) {
                if (iM32058 < 0 || iM32058 > 65535) {
                    throw new C12517("invalid array conformance");
                }
                this.f15085 = new C22395[iM32058];
            }
            C13222 c13222M32066 = c13223.m32066(i);
            for (int i2 = 0; i2 < iM32058; i2++) {
                C22395[] c22395Arr = this.f15085;
                if (c22395Arr[i2] == null) {
                    c22395Arr[i2] = new C22395();
                }
                c22395Arr[i2].mo2234(c13222M32066);
            }
        }
    }
}
