package p067l;

/* JADX INFO: renamed from: l.ܰܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6N8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15543 {

    /* JADX INFO: renamed from: ֫ */
    public C9509 f44406;

    /* JADX INFO: renamed from: ۧ */
    public int f44407;

    /* JADX INFO: renamed from: ܽ */
    public int f44409;

    /* JADX INFO: renamed from: ܿ */
    public int f44410;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C12688 f44412;

    /* JADX INFO: renamed from: ܳ */
    public int f44408 = -1;

    /* JADX INFO: renamed from: ᩳ */
    public final C13533 f44411 = new C13533();

    public C15543(C12688 c12688) {
        this.f44412 = c12688;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13533 m35335(int i) {
        int i2;
        int i3;
        C12688 c12688 = this.f44412;
        c12688.m29171(i);
        if (this.f44408 != c12688.f35592 || i < (i3 = this.f44409) || i >= i3 + this.f44406.f26018) {
            C9509 c9509 = c12688.f35591;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                C9509 c95010 = c9509.f26035;
                int i7 = c95010 == null ? 0 : c95010.f26026;
                i2 = i4 + i7;
                if (i < i2) {
                    i5 += c9509.f26030;
                    i6 += c9509.f26027;
                    c9509 = c95010;
                } else {
                    int i8 = c9509.f26018;
                    if (i < i2 + i8) {
                        break;
                    }
                    i4 += i7 + i8;
                    i5 += c9509.f26030;
                    i6 += c9509.f26027;
                    c9509 = c9509.f26021;
                }
            }
            this.f44406 = c9509;
            this.f44409 = i2;
            this.f44407 = i5 + c9509.f26019;
            this.f44410 = i6 + c9509.f26034;
            this.f44408 = c12688.f35592;
        }
        int i9 = i - this.f44409;
        int iM22129 = this.f44406.m22129(i9) + this.f44407;
        C9509 c95011 = this.f44406;
        char[] cArr = c95011.f26023;
        int i10 = cArr != null ? cArr[i9] : c95011.f26022[i9];
        int iM22127 = c95011.m22127(i9) + this.f44410;
        C13533 c13533 = this.f44411;
        c13533.m30799(iM22129, i10 + iM22129, iM22127);
        c13533.m30801(this.f44406.m22126(i9));
        return c13533;
    }
}
