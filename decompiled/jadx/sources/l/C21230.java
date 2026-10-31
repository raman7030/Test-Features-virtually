package l;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.᩸֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8S4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21230 implements InterfaceC15583 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f68423;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f68424;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C14878 f68426;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f68429;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f68432;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14318 f68435;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean[] f68430 = new boolean[3];

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C5707 f68425 = new C5707(32);

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C5707 f68427 = new C5707(33);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5707 f68433 = new C5707(34);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C5707 f68436 = new C5707(39);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C5707 f68431 = new C5707(40);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f68434 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C17714 f68428 = new C17714();

    public C21230(C14318 c14318) {
        this.f68435 = c14318;
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1000() {
        this.f68424 = 0L;
        this.f68434 = -9223372036854775807L;
        C16509.m38887(this.f68430);
        this.f68425.m16117();
        this.f68427.m16117();
        this.f68433.m16117();
        this.f68436.m16117();
        this.f68431.m16117();
        this.f68435.m34182();
        C14878 c14878 = this.f68426;
        if (c14878 != null) {
            c14878.m35311();
        }
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1003(InterfaceC21830 interfaceC21830, C19259 c19259) {
        c19259.m44443();
        this.f68423 = c19259.m44444();
        InterfaceC19383 interfaceC19383Mo3429 = interfaceC21830.mo3429(c19259.m44445(), 2);
        this.f68432 = interfaceC19383Mo3429;
        this.f68426 = new C14878(interfaceC19383Mo3429);
        this.f68435.m34185(interfaceC21830, c19259);
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1001(int i, long j) {
        this.f68434 = j;
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m48186(int i, int i2, long j, long j2) {
        this.f68426.m35312(i, i2, j, j2, this.f68429);
        if (!this.f68429) {
            this.f68425.m16118(i2);
            this.f68427.m16118(i2);
            this.f68433.m16118(i2);
        }
        this.f68436.m16118(i2);
        this.f68431.m16118(i2);
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48185(int i, int i2, byte[] bArr) {
        this.f68426.m35313(i, i2, bArr);
        if (!this.f68429) {
            this.f68425.m16114(i, i2, bArr);
            this.f68427.m16114(i, i2, bArr);
            this.f68433.m16114(i, i2, bArr);
        }
        this.f68436.m16114(i, i2, bArr);
        this.f68431.m16114(i, i2, bArr);
    }

    @RequiresNonNull({"output", "sampleReader"})
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48184(int i, int i2, long j, long j2) {
        this.f68426.m35314(j, i, this.f68429);
        boolean z = this.f68429;
        C14318 c14318 = this.f68435;
        if (!z) {
            C5707 c5707 = this.f68425;
            c5707.m16116(i2);
            C5707 c5708 = this.f68427;
            c5708.m16116(i2);
            C5707 c5709 = this.f68433;
            c5709.m16116(i2);
            if (c5707.m16115() && c5708.m16115() && c5709.m16115()) {
                String str = this.f68423;
                int i3 = c5707.f17588;
                byte[] bArr = new byte[c5708.f17588 + i3 + c5709.f17588];
                System.arraycopy(c5707.f17586, 0, bArr, 0, i3);
                System.arraycopy(c5708.f17586, 0, bArr, c5707.f17588, c5708.f17588);
                System.arraycopy(c5709.f17586, 0, bArr, c5707.f17588 + c5708.f17588, c5709.f17588);
                String strM41769 = null;
                C11365 c11365M38886 = C16509.m38886(c5708.f17586, 3, c5708.f17588, (C7131) null);
                C2898 c2898 = c11365M38886.f34013;
                if (c2898 != null) {
                    strM41769 = C17839.m41769(c2898.f9240, c2898.f9241, c2898.f9239, c2898.f9236, c2898.f9238, c2898.f9237);
                }
                C1297 c1297 = new C1297();
                c1297.m4469(str);
                c1297.m4462("video/mp2t");
                c1297.m4465("video/hevc");
                c1297.m4445(strM41769);
                c1297.m4453(c11365M38886.f34007);
                c1297.m4457(c11365M38886.f34008);
                c1297.m4455(c11365M38886.f34018);
                c1297.m4480(c11365M38886.f34012);
                C6942 c6942 = new C6942();
                c6942.m18755(c11365M38886.f34016);
                c6942.m18754(c11365M38886.f34014);
                c6942.m18757(c11365M38886.f34015);
                c6942.m18756(c11365M38886.f34011 + 8);
                c6942.m18752(c11365M38886.f34006 + 8);
                c1297.m4448(c6942.m18751());
                c1297.m4460(c11365M38886.f34009);
                c1297.m4452(c11365M38886.f34017);
                c1297.m4474(c11365M38886.f34010 + 1);
                c1297.m4446(Collections.singletonList(bArr));
                C8353 c8353M4440 = c1297.m4440();
                int i4 = c8353M4440.f25617;
                this.f68432.mo8456(c8353M4440);
                C4025.m12116(i4 != -1);
                c14318.m34183(i4);
                this.f68429 = true;
            }
        }
        C5707 c57010 = this.f68436;
        boolean zM16116 = c57010.m16116(i2);
        C17714 c17714 = this.f68428;
        if (zM16116) {
            c17714.m41462(C16509.m38880(c57010.f17588, c57010.f17586), c57010.f17586);
            c17714.m41478(5);
            c14318.m34184(j2, c17714);
        }
        C5707 c57011 = this.f68431;
        if (c57011.m16116(i2)) {
            c17714.m41462(C16509.m38880(c57011.f17588, c57011.f17586), c57011.f17586);
            c17714.m41478(5);
            c14318.m34184(j2, c17714);
        }
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1002(C17714 c17714) {
        int i;
        int i2;
        C22632.m50632(this.f68432);
        String str = C3603.f11424;
        while (c17714.m41457() > 0) {
            int iM41485 = c17714.m41485();
            int iM41483 = c17714.m41483();
            byte[] bArrM41482 = c17714.m41482();
            this.f68424 += (long) c17714.m41457();
            this.f68432.mo8453(c17714.m41457(), c17714);
            while (iM41485 < iM41483) {
                int iM38879 = C16509.m38879(iM41485, iM41483, bArrM41482, this.f68430);
                if (iM38879 == iM41483) {
                    m48185(iM41485, iM41483, bArrM41482);
                    return;
                }
                int i3 = (bArrM41482[iM38879 + 3] & 126) >> 1;
                if (iM38879 <= 0 || bArrM41482[iM38879 - 1] != 0) {
                    i = iM38879;
                    i2 = 3;
                } else {
                    i = iM38879 - 1;
                    i2 = 4;
                }
                int i4 = i - iM41485;
                if (i4 > 0) {
                    m48185(iM41485, i, bArrM41482);
                }
                int i5 = iM41483 - i;
                long j = this.f68424 - ((long) i5);
                m48184(i5, i4 < 0 ? -i4 : 0, j, this.f68434);
                m48186(i5, i3, j, this.f68434);
                iM41485 = i + i2;
            }
        }
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1004(boolean z) {
        C22632.m50632(this.f68432);
        String str = C3603.f11424;
        if (z) {
            this.f68435.m34186();
            m48184(0, 0, this.f68424, this.f68434);
            m48186(0, 48, this.f68424, this.f68434);
        }
    }
}
