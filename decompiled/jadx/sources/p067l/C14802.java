package p067l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.۬ۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes3.dex */
public final class C14802 {

    /* JADX INFO: renamed from: ֫ */
    public final int f42222;

    /* JADX INFO: renamed from: ۧ */
    public final int f42223;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C15472 f42224;

    public C14802(C15472 c15472, AbstractC5415 abstractC5415) {
        this.f42224 = c15472;
        int iMo11893 = abstractC5415.mo11893();
        this.f42222 = iMo11893;
        int iMo11892 = abstractC5415.mo11892();
        this.f42223 = iMo11892;
        if (iMo11893 + iMo11892 > c15472.length()) {
            throw new C10109("String table extends past end of file");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m33809(int i) {
        int i2 = this.f42223;
        if (i >= i2) {
            throw new C10109("String index is out of bounds");
        }
        int i3 = this.f42222;
        int i4 = i + i3;
        int i5 = i4;
        do {
            C15472 c15472 = this.f42224;
            if (c15472.mo13853(i5) == 0) {
                return c15472.m53399(i4, i5 - i4, Charset.forName("US-ASCII"));
            }
            i5++;
        } while (i5 < i3 + i2);
        throw new C10109("String extends past end of string table");
    }
}
