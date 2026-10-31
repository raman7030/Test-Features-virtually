package l;

/* JADX INFO: renamed from: l.ܰܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6N8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13862 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7513 f41327;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f41328;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f41330;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f41331;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10858 f41333;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f41329 = -1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11747 f41332 = new C11747();

    public C13862(C10858 c10858) {
        this.f41333 = c10858;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11747 m33216(int i) {
        int i2;
        int i3;
        C10858 c10858 = this.f41333;
        c10858.m27126(i);
        if (this.f41329 != c10858.f32616 || i < (i3 = this.f41330) || i >= i3 + this.f41327.f23106) {
            C7513 c7513 = c10858.f32615;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                C7513 c7514 = c7513.f23123;
                int i7 = c7514 == null ? 0 : c7514.f23114;
                i2 = i4 + i7;
                if (i < i2) {
                    i5 += c7513.f23118;
                    i6 += c7513.f23115;
                    c7513 = c7514;
                } else {
                    int i8 = c7513.f23106;
                    if (i < i2 + i8) {
                        break;
                    }
                    i4 += i7 + i8;
                    i5 += c7513.f23118;
                    i6 += c7513.f23115;
                    c7513 = c7513.f23109;
                }
            }
            this.f41327 = c7513;
            this.f41330 = i2;
            this.f41328 = i5 + c7513.f23107;
            this.f41331 = i6 + c7513.f23122;
            this.f41329 = c10858.f32616;
        }
        int i9 = i - this.f41330;
        int iM20153 = this.f41327.m20153(i9) + this.f41328;
        C7513 c7515 = this.f41327;
        char[] cArr = c7515.f23111;
        int i10 = cArr != null ? cArr[i9] : c7515.f23110[i9];
        int iM20151 = c7515.m20151(i9) + this.f41331;
        C11747 c11747 = this.f41332;
        c11747.m28751(iM20153, i10 + iM20153, iM20151);
        c11747.m28753(this.f41327.m20150(i9));
        return c11747;
    }
}
