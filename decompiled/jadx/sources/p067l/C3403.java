package p067l;

import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes2.dex */
public final class C3403 implements Iterator {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C15472 f6755;

    /* JADX INFO: renamed from: ᩸ */
    public int f6756 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public int f6757;

    public C3403(C15472 c15472) {
        this.f6755 = c15472;
        this.f6757 = c15472.f44183.m52301();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6756 < this.f6755.f44183.m52300();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f6757;
        C15472 c15472 = this.f6755;
        int iMo13855 = c15472.mo13855(i);
        int i2 = this.f6757 + 4;
        this.f6757 = i2;
        c15472.m53399(i2, iMo13855, Charset.forName("US-ASCII"));
        int i3 = this.f6757 + iMo13855 + 4;
        this.f6757 = i3;
        int iMo13856 = c15472.mo13855(i3);
        this.f6757 += 4;
        c15472.m35223();
        byte[] bArrM53400 = c15472.m53400();
        int i4 = iMo13856 + c15472.f44183.f74943;
        if (c15472.m35223() >= 75) {
            this.f6757 += 4;
        }
        if (c15472.m35223() >= 73) {
            this.f6757 += 4;
        }
        if (c15472.m35223() >= 131) {
            this.f6757 += 4;
        }
        if (c15472.m35223() >= 127) {
            this.f6757 += 4;
        }
        if (c15472.m35223() >= 135) {
            this.f6757 += 8;
        }
        if (c15472.m35223() < 75) {
            this.f6757 = (c15472.mo13855(i4 + 96) * 4) + this.f6757;
        }
        this.f6756++;
        return new C22850(bArrM53400, i4);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
