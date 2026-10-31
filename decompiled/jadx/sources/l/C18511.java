package l;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩴۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8J4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18511 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f57369;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f57370;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19217 f57368 = new C19217();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17714 f57367 = new C17714(new byte[65025], 0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f57366 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m43018(InterfaceC8424 interfaceC8424) {
        int i;
        C22632.m50634(interfaceC8424 != null);
        boolean z = this.f57370;
        C17714 c17714 = this.f57367;
        if (z) {
            this.f57370 = false;
            c17714.m41481(0);
        }
        while (!this.f57370) {
            int i2 = this.f57366;
            C19217 c19217 = this.f57368;
            if (i2 < 0) {
                if (c19217.m44335(interfaceC8424, -1L) && c19217.m44336(interfaceC8424, true)) {
                    int iM43016 = c19217.f60514;
                    if ((c19217.f60517 & 1) == 1 && c17714.m41483() == 0) {
                        iM43016 += m43016(0);
                        i = this.f57369;
                    } else {
                        i = 0;
                    }
                    try {
                        interfaceC8424.mo22070(iM43016);
                        this.f57366 = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iM43017 = m43016(this.f57366);
            int i3 = this.f57366 + this.f57369;
            if (iM43017 > 0) {
                c17714.m41460(c17714.m41483() + iM43017);
                try {
                    interfaceC8424.readFully(c17714.m41482(), c17714.m41483(), iM43017);
                    c17714.m41486(c17714.m41483() + iM43017);
                    this.f57370 = c19217.f60516[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == c19217.f60515) {
                i3 = -1;
            }
            this.f57366 = i3;
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m43020() {
        C19217 c19217 = this.f57368;
        c19217.f60517 = 0;
        c19217.f60512 = 0L;
        c19217.f60515 = 0;
        c19217.f60514 = 0;
        c19217.f60511 = 0;
        this.f57367.m41481(0);
        this.f57366 = -1;
        this.f57370 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19217 m43017() {
        return this.f57368;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17714 m43019() {
        return this.f57367;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m43021() {
        C17714 c17714 = this.f57367;
        if (c17714.m41482().length == 65025) {
            return;
        }
        c17714.m41462(c17714.m41483(), Arrays.copyOf(c17714.m41482(), Math.max(65025, c17714.m41483())));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m43016(int i) {
        int i2;
        int i3 = 0;
        this.f57369 = 0;
        do {
            int i4 = this.f57369;
            int i5 = i + i4;
            C19217 c19217 = this.f57368;
            if (i5 >= c19217.f60515) {
                break;
            }
            int[] iArr = c19217.f60516;
            this.f57369 = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
