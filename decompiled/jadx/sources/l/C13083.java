package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.۬ۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes3.dex */
public final class C13083 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f39174;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f39175;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13788 f39176;

    public C13083(C13788 c13788, AbstractC3206 abstractC3206) {
        this.f39176 = c13788;
        int iMo9846 = abstractC3206.mo9846();
        this.f39174 = iMo9846;
        int iMo9845 = abstractC3206.mo9845();
        this.f39175 = iMo9845;
        if (iMo9846 + iMo9845 > c13788.length()) {
            throw new C8145("String table extends past end of file");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m31719(int i) {
        int i2 = this.f39175;
        if (i >= i2) {
            throw new C8145("String index is out of bounds");
        }
        int i3 = this.f39174;
        int i4 = i + i3;
        int i5 = i4;
        do {
            C13788 c13788 = this.f39176;
            if (c13788.mo11933(i5) == 0) {
                return c13788.m51008(i4, i5 - i4, Charset.forName("US-ASCII"));
            }
            i5++;
        } while (i5 < i3 + i2);
        throw new C8145("String extends past end of string table");
    }
}
