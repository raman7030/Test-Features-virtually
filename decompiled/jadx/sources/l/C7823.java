package l;

import com.umeng.analytics.pro.bo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.۠֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7823 implements InterfaceC15583 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f24207;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C0767 f24212;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f24213;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C14318 f24215;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f24216;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f24217;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f24218;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f24219;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f24220;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean[] f24210 = new boolean[3];

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C5707 f24209 = new C5707(7);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C5707 f24221 = new C5707(8);

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C5707 f24211 = new C5707(6);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f24214 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C17714 f24208 = new C17714();

    public C7823(C14318 c14318, boolean z, boolean z2) {
        this.f24215 = c14318;
        this.f24207 = z;
        this.f24213 = z2;
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1000() {
        this.f24219 = 0L;
        this.f24220 = false;
        this.f24214 = -9223372036854775807L;
        C16509.m38887(this.f24210);
        this.f24209.m16117();
        this.f24221.m16117();
        this.f24211.m16117();
        this.f24215.m34182();
        C0767 c0767 = this.f24212;
        if (c0767 != null) {
            c0767.m2927();
        }
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1003(InterfaceC21830 interfaceC21830, C19259 c19259) {
        c19259.m44443();
        this.f24216 = c19259.m44444();
        InterfaceC19383 interfaceC19383Mo3429 = interfaceC21830.mo3429(c19259.m44445(), 2);
        this.f24217 = interfaceC19383Mo3429;
        this.f24212 = new C0767(interfaceC19383Mo3429, this.f24207, this.f24213);
        this.f24215.m34185(interfaceC21830, c19259);
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1001(int i, long j) {
        this.f24214 = j;
        this.f24220 = ((i & 2) != 0) | this.f24220;
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20924(long j, int i, long j2) {
        if (!this.f24218 || this.f24212.m2925()) {
            this.f24209.m16118(i);
            this.f24221.m16118(i);
        }
        this.f24211.m16118(i);
        this.f24212.m2922(i, j, j2, this.f24220);
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20923(int i, int i2, byte[] bArr) {
        if (!this.f24218 || this.f24212.m2925()) {
            this.f24209.m16114(i, i2, bArr);
            this.f24221.m16114(i, i2, bArr);
        }
        this.f24211.m16114(i, i2, bArr);
        this.f24212.m2921(i, i2, bArr);
    }

    @RequiresNonNull({"output", "sampleReader"})
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20922(int i, int i2, long j, long j2) {
        boolean z = this.f24218;
        C14318 c14318 = this.f24215;
        if (!z || this.f24212.m2925()) {
            C5707 c5707 = this.f24209;
            c5707.m16116(i2);
            C5707 c5708 = this.f24221;
            c5708.m16116(i2);
            if (!this.f24218) {
                if (c5707.m16115() && c5708.m16115()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(c5707.f17586, c5707.f17588));
                    arrayList.add(Arrays.copyOf(c5708.f17586, c5708.f17588));
                    C10866 c10866M38891 = C16509.m38891(3, c5707.f17588, c5707.f17586);
                    int i3 = c10866M38891.f32651;
                    C17921 c17921 = new C17921(c5708.f17586, 4, c5708.f17588);
                    int iM41928 = c17921.m41928();
                    int iM41929 = c17921.m41928();
                    c17921.m41925();
                    C1693 c1693 = new C1693(iM41928, iM41929, c17921.m41927());
                    int i4 = c10866M38891.f32656;
                    int i5 = c10866M38891.f32650;
                    int i6 = c10866M38891.f32647;
                    int i7 = C17839.f54488;
                    String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
                    InterfaceC19383 interfaceC19383 = this.f24217;
                    C1297 c1297 = new C1297();
                    c1297.m4469(this.f24216);
                    c1297.m4462("video/mp2t");
                    c1297.m4465("video/avc");
                    c1297.m4445(str);
                    c1297.m4453(c10866M38891.f32641);
                    c1297.m4457(c10866M38891.f32648);
                    C6942 c6942 = new C6942();
                    c6942.m18755(c10866M38891.f32654);
                    c6942.m18754(c10866M38891.f32652);
                    c6942.m18757(c10866M38891.f32653);
                    c6942.m18756(c10866M38891.f32649 + 8);
                    c6942.m18752(c10866M38891.f32642 + 8);
                    c1297.m4448(c6942.m18751());
                    c1297.m4460(c10866M38891.f32655);
                    c1297.m4446((List) arrayList);
                    c1297.m4452(i3);
                    interfaceC19383.mo8456(c1297.m4440());
                    this.f24218 = true;
                    c14318.m34183(i3);
                    this.f24212.m2924(c10866M38891);
                    this.f24212.m2923(c1693);
                    c5707.m16117();
                    c5708.m16117();
                }
            } else if (c5707.m16115()) {
                C10866 c10866M38892 = C16509.m38891(3, c5707.f17588, c5707.f17586);
                c14318.m34183(c10866M38892.f32651);
                this.f24212.m2924(c10866M38892);
                c5707.m16117();
            } else if (c5708.m16115()) {
                C17921 c17922 = new C17921(c5708.f17586, 4, c5708.f17588);
                int iM419210 = c17922.m41928();
                int iM419211 = c17922.m41928();
                c17922.m41925();
                this.f24212.m2923(new C1693(iM419210, iM419211, c17922.m41927()));
                c5708.m16117();
            }
        }
        C5707 c5709 = this.f24211;
        if (c5709.m16116(i2)) {
            int iM38880 = C16509.m38880(c5709.f17588, c5709.f17586);
            byte[] bArr = c5709.f17586;
            C17714 c17714 = this.f24208;
            c17714.m41462(iM38880, bArr);
            c17714.m41484(4);
            c14318.m34184(j2, c17714);
        }
        if (this.f24212.m2926(j, i, this.f24218)) {
            this.f24220 = false;
        }
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1002(C17714 c17714) {
        int i;
        int i2;
        C22632.m50632(this.f24217);
        String str = C3603.f11424;
        int iM41485 = c17714.m41485();
        int iM41483 = c17714.m41483();
        byte[] bArrM41482 = c17714.m41482();
        this.f24219 += (long) c17714.m41457();
        this.f24217.mo8453(c17714.m41457(), c17714);
        while (true) {
            int iM38879 = C16509.m38879(iM41485, iM41483, bArrM41482, this.f24210);
            if (iM38879 == iM41483) {
                m20923(iM41485, iM41483, bArrM41482);
                return;
            }
            int i3 = bArrM41482[iM38879 + 3] & bo.j;
            if (iM38879 <= 0 || bArrM41482[iM38879 - 1] != 0) {
                i = iM38879;
                i2 = 3;
            } else {
                i = iM38879 - 1;
                i2 = 4;
            }
            int i4 = i - iM41485;
            if (i4 > 0) {
                m20923(iM41485, i, bArrM41482);
            }
            int i5 = iM41483 - i;
            long j = this.f24219 - ((long) i5);
            m20922(i5, i4 < 0 ? -i4 : 0, j, this.f24214);
            m20924(j, i3, this.f24214);
            iM41485 = i + i2;
        }
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1004(boolean z) {
        C22632.m50632(this.f24217);
        String str = C3603.f11424;
        if (z) {
            this.f24215.m34186();
            m20922(0, 0, this.f24219, this.f24214);
            m20924(this.f24219, 9, this.f24214);
            m20922(0, 0, this.f24219, this.f24214);
        }
    }
}
