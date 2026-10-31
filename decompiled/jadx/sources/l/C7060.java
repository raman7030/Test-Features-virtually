package l;

import java.nio.CharBuffer;

/* JADX INFO: renamed from: l.ۜ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56Q4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7060 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f21733 = new Object();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C11999 f21734;

    public C7060(C21605 c21605) {
        this.f21734 = C11999.m29333(c21605 == null ? 2048 : c21605.f69369, c21605 == null ? 16 : c21605.f69373, c21605);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m19040() {
        m19036();
        return this.f21734.m29347();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19039(char[] cArr, int i) {
        m19036();
        C10588 c10588M29342 = this.f21734.m29342(0, i, CharBuffer.wrap(cArr, 0, i));
        try {
            C11999 c11999 = this.f21734;
            this.f21734 = c11999.m29345(c11999.m29347(), this.f21734.m29347(), c10588M29342, this.f21733);
            c10588M29342.close();
        } catch (Throwable th) {
            try {
                c10588M29342.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char m19037(int i) {
        m19036();
        if (i < 0 || i >= this.f21734.m29347()) {
            throw new IndexOutOfBoundsException();
        }
        return this.f21734.m29340(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19041(int i) {
        m19036();
        this.f21734 = this.f21734.m29343(0, i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m19042() {
        m19036();
        C11999 c11999 = this.f21734;
        if (c11999.f35930 != null) {
            m19035(c11999.f35929, 2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m19035(AbstractC20466 abstractC20466, int i) {
        if (abstractC20466 == null) {
            return i;
        }
        if (abstractC20466 instanceof C21877) {
            this.f21734.f35930.f69370.m3928(((C21877) abstractC20466).f70059);
            return i - 1;
        }
        AbstractC20466[] abstractC20466Arr = ((C23993) abstractC20466).f77779;
        int length = abstractC20466Arr.length;
        while (true) {
            length--;
            if (length < 0 || i <= 0) {
                break;
            }
            i = m19035(abstractC20466Arr[length], i);
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11999 m19038() {
        m19036();
        C11999 c11999 = this.f21734;
        this.f21734 = null;
        return c11999;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m19036() {
        if (this.f21734 == null) {
            throw new IllegalStateException("Text builder is finished");
        }
    }
}
