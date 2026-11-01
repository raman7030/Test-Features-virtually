package p067l;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩴۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8J4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19961 {

    /* JADX INFO: renamed from: ܿ */
    public int f60590;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f60591;

    /* JADX INFO: renamed from: ܽ */
    public final C20632 f60589 = new C20632();

    /* JADX INFO: renamed from: ۧ */
    public final C19203 f60588 = new C19203(new byte[65025], 0);

    /* JADX INFO: renamed from: ֫ */
    public int f60587 = -1;

    /* JADX INFO: renamed from: ֫ */
    public final boolean m45296(InterfaceC10375 interfaceC10375) {
        int i;
        C23877.m52960(interfaceC10375 != null);
        boolean z = this.f60591;
        C19203 c19203 = this.f60588;
        if (z) {
            this.f60591 = false;
            c19203.m43727(0);
        }
        while (!this.f60591) {
            int i2 = this.f60587;
            C20632 c20632 = this.f60589;
            if (i2 < 0) {
                if (c20632.m46629(interfaceC10375, -1L) && c20632.m46630(interfaceC10375, true)) {
                    int iM45294 = c20632.f63745;
                    if ((c20632.f63748 & 1) == 1 && c19203.m43729() == 0) {
                        iM45294 += m45294(0);
                        i = this.f60590;
                    } else {
                        i = 0;
                    }
                    try {
                        interfaceC10375.mo24040(iM45294);
                        this.f60587 = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iM45295 = m45294(this.f60587);
            int i3 = this.f60587 + this.f60590;
            if (iM45295 > 0) {
                c19203.m43706(c19203.m43729() + iM45295);
                try {
                    interfaceC10375.readFully(c19203.m43728(), c19203.m43729(), iM45295);
                    c19203.m43732(c19203.m43729() + iM45295);
                    this.f60591 = c20632.f63747[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == c20632.f63746) {
                i3 = -1;
            }
            this.f60587 = i3;
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m45298() {
        C20632 c20632 = this.f60589;
        c20632.f63748 = 0;
        c20632.f63743 = 0L;
        c20632.f63746 = 0;
        c20632.f63745 = 0;
        c20632.f63742 = 0;
        this.f60588.m43727(0);
        this.f60587 = -1;
        this.f60591 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20632 m45295() {
        return this.f60589;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C19203 m45297() {
        return this.f60588;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m45299() {
        C19203 c19203 = this.f60588;
        if (c19203.m43728().length == 65025) {
            return;
        }
        c19203.m43708(c19203.m43729(), Arrays.copyOf(c19203.m43728(), Math.max(65025, c19203.m43729())));
    }

    /* JADX INFO: renamed from: ֫ */
    private int m45294(int i) {
        int i2;
        int i3 = 0;
        this.f60590 = 0;
        do {
            int i4 = this.f60590;
            int i5 = i + i4;
            C20632 c20632 = this.f60589;
            if (i5 >= c20632.f63746) {
                break;
            }
            int[] iArr = c20632.f63747;
            this.f60590 = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
