package l;

import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes2.dex */
public final class C1089 implements Iterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13788 f3984;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f3985 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f3986;

    public C1089(C13788 c13788) {
        this.f3984 = c13788;
        this.f3986 = c13788.f41105.m49973();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3985 < this.f3984.f41105.m49972();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3986;
        C13788 c13788 = this.f3984;
        int iMo11935 = c13788.mo11935(i);
        int i2 = this.f3986 + 4;
        this.f3986 = i2;
        c13788.m51008(i2, iMo11935, Charset.forName("US-ASCII"));
        int i3 = this.f3986 + iMo11935 + 4;
        this.f3986 = i3;
        int iMo11936 = c13788.mo11935(i3);
        this.f3986 += 4;
        c13788.m33107();
        byte[] bArrM51009 = c13788.m51009();
        int i4 = iMo11936 + c13788.f41105.f72219;
        if (c13788.m33107() >= 75) {
            this.f3986 += 4;
        }
        if (c13788.m33107() >= 73) {
            this.f3986 += 4;
        }
        if (c13788.m33107() >= 131) {
            this.f3986 += 4;
        }
        if (c13788.m33107() >= 127) {
            this.f3986 += 4;
        }
        if (c13788.m33107() >= 135) {
            this.f3986 += 8;
        }
        if (c13788.m33107() < 75) {
            this.f3986 = (c13788.mo11935(i4 + 96) * 4) + this.f3986;
        }
        this.f3985++;
        return new C21551(bArrM51009, i4);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
