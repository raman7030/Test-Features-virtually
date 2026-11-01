package p067l;

import java.nio.CharBuffer;

/* JADX INFO: renamed from: l.ۜ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56Q4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9079 {

    /* JADX INFO: renamed from: ֫ */
    public final Object f24614 = new Object();

    /* JADX INFO: renamed from: ۧ */
    public C13773 f24615;

    public C9079(C22902 c22902) {
        this.f24615 = C13773.m31388(c22902 == null ? 2048 : c22902.f72072, c22902 == null ? 16 : c22902.f72076, c22902);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m20997() {
        m20993();
        return this.f24615.m31402();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20996(char[] cArr, int i) {
        m20993();
        C12432 c12432M31397 = this.f24615.m31397(0, i, CharBuffer.wrap(cArr, 0, i));
        try {
            C13773 c13773 = this.f24615;
            this.f24615 = c13773.m31400(c13773.m31402(), this.f24615.m31402(), c12432M31397, this.f24614);
            c12432M31397.close();
        } catch (Throwable th) {
            try {
                c12432M31397.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final char m20994(int i) {
        m20993();
        if (i < 0 || i >= this.f24615.m31402()) {
            throw new IndexOutOfBoundsException();
        }
        return this.f24615.m31395(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m20998(int i) {
        m20993();
        this.f24615 = this.f24615.m31398(0, i);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m20999() {
        m20993();
        C13773 c13773 = this.f24615;
        if (c13773.f38940 != null) {
            m20992(c13773.f38939, 2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m20992(AbstractC21820 abstractC21820, int i) {
        if (abstractC21820 == null) {
            return i;
        }
        if (abstractC21820 instanceof C23161) {
            this.f24615.f38940.f72073.m6169(((C23161) abstractC21820).f72769);
            return i - 1;
        }
        AbstractC21820[] abstractC21820Arr = ((C25172) abstractC21820).f80530;
        int length = abstractC21820Arr.length;
        while (true) {
            length--;
            if (length < 0 || i <= 0) {
                break;
            }
            i = m20992(abstractC21820Arr[length], i);
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13773 m20995() {
        m20993();
        C13773 c13773 = this.f24615;
        this.f24615 = null;
        return c13773;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m20993() {
        if (this.f24615 == null) {
            throw new IllegalStateException("Text builder is finished");
        }
    }
}
