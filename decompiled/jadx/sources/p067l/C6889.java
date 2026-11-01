package p067l;

/* JADX INFO: renamed from: l.ۙܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 9A0K */
/* JADX INFO: loaded from: classes3.dex */
public final class C6889 extends AbstractC8230 {

    /* JADX INFO: renamed from: ֫ */
    public C23653[] f17915;

    /* JADX INFO: renamed from: ۧ */
    public int f17916;

    @Override // p067l.AbstractC8230
    /* JADX INFO: renamed from: ۧ */
    public final void mo4602(C14935 c14935) {
        c14935.m34161(4);
        c14935.m34167(this.f17916);
        c14935.m34158(this.f17915);
        if (this.f17915 != null) {
            C14935 c14936 = c14935.f42649;
            int i = this.f17916;
            c14936.m34167(i);
            int i2 = c14936.f42650;
            c14936.m34157(i * 4);
            C14935 c14935M34164 = c14936.m34164(i2);
            for (int i3 = 0; i3 < i; i3++) {
                this.f17915[i3].mo4602(c14935M34164);
            }
        }
    }

    @Override // p067l.AbstractC8230
    /* JADX INFO: renamed from: ֫ */
    public final void mo4601(C14935 c14935) throws C14265 {
        c14935.m34161(4);
        this.f17916 = c14935.m34156();
        if (c14935.m34156() != 0) {
            C14935 c14936 = c14935.f42649;
            int iM34156 = c14936.m34156();
            int i = c14936.f42650;
            c14936.m34157(iM34156 * 4);
            if (this.f17915 == null) {
                if (iM34156 < 0 || iM34156 > 65535) {
                    throw new C14265("invalid array conformance");
                }
                this.f17915 = new C23653[iM34156];
            }
            C14935 c14935M34164 = c14936.m34164(i);
            for (int i2 = 0; i2 < iM34156; i2++) {
                C23653[] c23653Arr = this.f17915;
                if (c23653Arr[i2] == null) {
                    c23653Arr[i2] = new C23653();
                }
                c23653Arr[i2].mo4601(c14935M34164);
            }
        }
    }
}
