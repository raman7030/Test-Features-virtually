package p067l;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z556 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18155 extends AbstractC20206 implements InterfaceC19897 {

    /* JADX INFO: renamed from: ۟ */
    public static final C2582 f54209 = new C2582(C19110.f57020 * 2);

    /* JADX INFO: renamed from: ܰ */
    public static final /* synthetic */ int f54210 = 0;

    /* JADX INFO: renamed from: ۗ */
    public final int f54211;

    /* JADX INFO: renamed from: ۙ */
    public final C14645 f54212;

    /* JADX INFO: renamed from: ۛ */
    public final int f54213;

    /* JADX INFO: renamed from: ۤ */
    public final int f54214;

    /* JADX INFO: renamed from: ۨ */
    public int f54215 = -1;

    /* JADX INFO: renamed from: ۫ */
    public int f54216;

    /* JADX INFO: renamed from: ۬ */
    public final int f54217;

    /* JADX INFO: renamed from: ᩶ */
    public final int f54218;

    /* JADX INFO: renamed from: ᩸ */
    public final int f54219;

    /* JADX INFO: renamed from: ᩹ */
    public final C9952 f54220;

    /* JADX INFO: renamed from: ᩺ */
    public int f54221;

    public C18155(C14645 c14645, C20168 c20168, C9952 c9952, int i, InterfaceC15529 interfaceC15529, InterfaceC15529 interfaceC155210, int i2) {
        this.f54212 = c14645;
        this.f54220 = c9952;
        c20168.getClass();
        int iM45630 = c20168.m45630() + i;
        this.f54214 = iM45630;
        this.f54219 = c20168.m45635();
        this.f54218 = c20168.m45635();
        this.f54211 = i2;
        this.f54217 = interfaceC15529.seekTo(iM45630);
        this.f54213 = interfaceC155210.seekTo(iM45630);
    }

    @Override // p067l.InterfaceC7568
    /* JADX INFO: renamed from: ܳ */
    public final String mo5853() {
        return this.f54220.getType();
    }

    @Override // p067l.InterfaceC19897
    /* JADX INFO: renamed from: ܽ */
    public final int mo5854() {
        return this.f54219;
    }

    @Override // p067l.InterfaceC7568
    public final String getName() {
        C14645 c14645 = this.f54212;
        return c14645.m33508(c14645.m33504().mo13855(m41349() + 4));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41358(Writer writer) {
        C14645 c14645 = this.f54212;
        c14645.m33471(c14645.m33504().mo13855(m41349() + 4), writer, false);
    }

    @Override // p067l.InterfaceC7568
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5855() {
        C14645 c14645 = this.f54212;
        return c14645.m33487(c14645.m33504().mo13855(m41354() + 4));
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m41362(Writer writer) {
        C14645 c14645 = this.f54212;
        c14645.m33472(writer, c14645.m33504().mo13855(m41354() + 4));
    }

    @Override // p067l.InterfaceC19897
    public final List getParameters() {
        if (m41353() > 0) {
            return new ArrayList(new C7940(this, mo5852()));
        }
        return AbstractC16192.m36872of();
    }

    /* JADX INFO: renamed from: ֡ */
    public final List m41355() {
        return AbstractC12674.m29152(this.f54212, this.f54213);
    }

    @Override // p067l.InterfaceC7568
    /* JADX INFO: renamed from: ۘ */
    public final List mo5852() {
        int iM41353 = m41353();
        if (iM41353 > 0) {
            return new C13305(this, iM41353 + 4, this.f54212.m33504().mo13855(iM41353));
        }
        return AbstractC16192.m36872of();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m41361(Writer writer) {
        int iM41353 = m41353();
        if (iM41353 > 0) {
            C14645 c14645 = this.f54212;
            int iMo13855 = c14645.m33504().mo13855(iM41353);
            int i = iM41353 + 4;
            for (int i2 = 0; i2 < iMo13855; i2++) {
                c14645.m33472(writer, c14645.m33504().m13856((i2 * 2) + i));
            }
        }
    }

    @Override // p067l.InterfaceC19897
    public final Set getAnnotations() {
        return AbstractC12674.m29151(this.f54212, this.f54217);
    }

    @Override // p067l.InterfaceC19897
    /* JADX INFO: renamed from: ᩵ */
    public final Set mo5856() {
        int i = this.f54211;
        if (i == 7) {
            return AbstractC8146.m18915of();
        }
        return EnumSet.copyOf((Collection) EnumC19932.m45246(i));
    }

    @Override // p067l.InterfaceC19897
    /* JADX INFO: renamed from: ᩷ۧ */
    public final C22180 mo5857() {
        int i = this.f54218;
        if (i > 0) {
            return new C22180(this.f54212, this, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41359(InterfaceC9281 interfaceC9281) {
        C14645 c14645 = this.f54212;
        if (c14645.m33506()) {
            throw new AssertionError("replaceNeverExecutedInstructionsWithNop is unsupported for direct const-string scan");
        }
        int i = this.f54218;
        if (i <= 0) {
            return;
        }
        AbstractC6086 abstractC6086M33504 = c14645.m33504();
        int iMo13855 = abstractC6086M33504.mo13855(i + 12);
        int i2 = i + 16;
        long j = (((long) iMo13855) * 2) + ((long) i2);
        if (j > 2147483647L) {
            throw new C17034(null, "Instruction list for method %s is out of range", this);
        }
        int i3 = (int) j;
        while (i2 < i3) {
            int iM13862 = abstractC6086M33504.m13862(i2);
            if (iM13862 == 0) {
                iM13862 = abstractC6086M33504.m13856(i2);
            }
            EnumC3167 enumC3167M23155 = c14645.mo29499().m23155(iM13862);
            int iM41350 = m41350(abstractC6086M33504, i2, enumC3167M23155);
            if (iM41350 <= 0) {
                throw new C17034(null, "Invalid instruction size in method %s at offset 0x%x", this, Integer.valueOf(i2));
            }
            long j2 = (((long) iM41350) * 2) + ((long) i2);
            if (j2 > i3) {
                throw new C17034(null, "The last instruction in method %s is truncated", this);
            }
            if (enumC3167M23155 == EnumC3167.f5911) {
                interfaceC9281.mo21483(abstractC6086M33504.m13856(i2 + 2));
            } else if (enumC3167M23155 == EnumC3167.f5994) {
                interfaceC9281.mo21483(abstractC6086M33504.mo13855(i2 + 2));
            }
            i2 = (int) j2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00bc A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final int m41356(int i, InterfaceC4074 interfaceC4074) {
        int iMo13853;
        long jMo13863;
        boolean zMo8178;
        C14645 c14645 = this.f54212;
        if (c14645.m33506()) {
            throw new AssertionError("replaceNeverExecutedInstructionsWithNop is unsupported for direct literal scan");
        }
        int i2 = this.f54218;
        if (i2 <= 0) {
            return -1;
        }
        AbstractC6086 abstractC6086M33504 = c14645.m33504();
        int iMo13855 = abstractC6086M33504.mo13855(i2 + 12);
        int i3 = i2 + 16;
        long j = 2;
        long j2 = (((long) iMo13855) * 2) + ((long) i3);
        if (j2 > 2147483647L) {
            throw new C17034(null, "Instruction list for method %s is out of range", this);
        }
        int i4 = (int) j2;
        int i5 = 0;
        while (i3 < i4) {
            int iM13862 = abstractC6086M33504.m13862(i3);
            if (iM13862 == 0) {
                iM13862 = abstractC6086M33504.m13856(i3);
            }
            EnumC3167 enumC3167M23155 = c14645.mo29499().m23155(iM13862);
            int iM41350 = m41350(abstractC6086M33504, i3, enumC3167M23155);
            if (iM41350 <= 0) {
                throw new C17034(null, "Invalid instruction size in method %s at offset 0x%x", this, Integer.valueOf(i3));
            }
            long j3 = (((long) iM41350) * j) + ((long) i3);
            if (j3 > i4) {
                throw new C17034(null, "The last instruction in method %s is truncated", this);
            }
            int i6 = i5 + 1;
            if (i5 >= i && enumC3167M23155 != null) {
                switch (C15315.f43712[enumC3167M23155.f6090.ordinal()]) {
                    case 8:
                        iMo13853 = (abstractC6086M33504.mo13853(i3 + 1) << 24) >> 28;
                        jMo13863 = iMo13853;
                        zMo8178 = interfaceC4074.mo8178(enumC3167M23155, jMo13863);
                        if (!zMo8178) {
                            return i6;
                        }
                        break;
                        break;
                    case 9:
                        iMo13853 = abstractC6086M33504.mo13863(i3 + 2);
                        jMo13863 = iMo13853;
                        zMo8178 = interfaceC4074.mo8178(enumC3167M23155, jMo13863);
                        if (!zMo8178) {
                            return i6;
                        }
                        break;
                    case 10:
                        iMo13853 = ((short) abstractC6086M33504.mo13863(i3 + 2)) << 16;
                        jMo13863 = iMo13853;
                        zMo8178 = interfaceC4074.mo8178(enumC3167M23155, jMo13863);
                        if (!zMo8178) {
                            return i6;
                        }
                        break;
                    case 11:
                        jMo13863 = ((long) ((short) abstractC6086M33504.mo13863(i3 + 2))) << 48;
                        zMo8178 = interfaceC4074.mo8178(enumC3167M23155, jMo13863);
                        if (!zMo8178) {
                            return i6;
                        }
                        break;
                    case 12:
                        iMo13853 = abstractC6086M33504.mo13853(i3 + 3);
                        jMo13863 = iMo13853;
                        zMo8178 = interfaceC4074.mo8178(enumC3167M23155, jMo13863);
                        if (!zMo8178) {
                            return i6;
                        }
                        break;
                    case 13:
                        iMo13853 = abstractC6086M33504.mo13863(i3 + 2);
                        jMo13863 = iMo13853;
                        zMo8178 = interfaceC4074.mo8178(enumC3167M23155, jMo13863);
                        if (!zMo8178) {
                            return i6;
                        }
                        break;
                    case 14:
                        iMo13853 = abstractC6086M33504.mo13857(i3 + 2);
                        jMo13863 = iMo13853;
                        zMo8178 = interfaceC4074.mo8178(enumC3167M23155, jMo13863);
                        if (!zMo8178) {
                            return i6;
                        }
                        break;
                    case 15:
                        jMo13863 = abstractC6086M33504.mo13860(i3 + 2);
                        zMo8178 = interfaceC4074.mo8178(enumC3167M23155, jMo13863);
                        if (!zMo8178) {
                            return i6;
                        }
                        break;
                    default:
                        zMo8178 = true;
                        if (!zMo8178) {
                            return i6;
                        }
                        break;
                }
            }
            i3 = (int) j3;
            i5 = i6;
            j = 2;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX INFO: renamed from: ֫ */
    public final int m41357(int i, InterfaceC12792 interfaceC12792) {
        int iM13856;
        C14645 c14645 = this.f54212;
        if (c14645.m33506()) {
            throw new AssertionError("replaceNeverExecutedInstructionsWithNop is unsupported for direct reference scan");
        }
        int i2 = this.f54218;
        if (i2 <= 0) {
            return -1;
        }
        AbstractC6086 abstractC6086M33504 = c14645.m33504();
        int iMo13855 = abstractC6086M33504.mo13855(i2 + 12);
        int i3 = i2 + 16;
        long j = 2;
        long j2 = (((long) iMo13855) * 2) + ((long) i3);
        if (j2 > 2147483647L) {
            throw new C17034(null, "Instruction list for method %s is out of range", this);
        }
        int i4 = (int) j2;
        int i5 = 0;
        while (i3 < i4) {
            int iM13862 = abstractC6086M33504.m13862(i3);
            if (iM13862 == 0) {
                iM13862 = abstractC6086M33504.m13856(i3);
            }
            EnumC3167 enumC3167M23155 = c14645.mo29499().m23155(iM13862);
            int iM41350 = m41350(abstractC6086M33504, i3, enumC3167M23155);
            if (iM41350 <= 0) {
                throw new C17034(null, "Invalid instruction size in method %s at offset 0x%x", this, Integer.valueOf(i3));
            }
            long j3 = (((long) iM41350) * j) + ((long) i3);
            if (j3 > i4) {
                throw new C17034(null, "The last instruction in method %s is truncated", this);
            }
            int i6 = i5 + 1;
            if (i5 >= i && enumC3167M23155 != null && enumC3167M23155.f6092 != 7) {
                switch (C15315.f43712[enumC3167M23155.f6090.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        iM13856 = abstractC6086M33504.m13856(i3 + 2);
                        break;
                    case 7:
                        iM13856 = abstractC6086M33504.mo13855(i3 + 2);
                        break;
                    default:
                        iM13856 = -1;
                        break;
                }
                if (iM13856 >= 0) {
                    if (!interfaceC12792.mo29342(i5, enumC3167M23155.f6092, iM13856, enumC3167M23155)) {
                        return i6;
                    }
                }
            }
            i3 = (int) j3;
            i5 = i6;
            j = 2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m41350(AbstractC6086 abstractC6086, int i, EnumC3167 enumC3167) {
        if (enumC3167 == null) {
            return 1;
        }
        int i2 = C15315.f43713[enumC3167.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return (abstractC6086.m13856(i + 2) * 2) + 4;
            }
            if (i2 == 3) {
                return (abstractC6086.m13856(i + 2) * 4) + 2;
            }
            return enumC3167.f6090.f14399 / 2;
        }
        int iM13856 = abstractC6086.m13856(i + 2);
        if (iM13856 == 0) {
            return 4;
        }
        int iMo13857 = abstractC6086.mo13857(i + 4);
        if (iMo13857 < 0) {
            throw new C17034(null, "Invalid array-payload instruction: negative element count", new Object[0]);
        }
        long j = ((long) iM13856) * ((long) iMo13857);
        if (j > 2147483647L) {
            throw new C17034(null, "Invalid array-payload instruction: element width*count overflows", new Object[0]);
        }
        return ((((int) j) + 1) / 2) + 4;
    }

    /* JADX INFO: renamed from: ֨ */
    private int m41349() {
        if (this.f54216 == 0) {
            this.f54216 = this.f54212.m33501(this.f54214);
        }
        return this.f54216;
    }

    /* JADX INFO: renamed from: ᩸ */
    private int m41354() {
        if (this.f54221 == 0) {
            C14645 c14645 = this.f54212;
            this.f54221 = c14645.m33485(c14645.m33504().m13856(m41349() + 2));
        }
        return this.f54221;
    }

    /* JADX INFO: renamed from: ۠ */
    private int m41353() {
        if (this.f54215 == -1) {
            this.f54215 = this.f54212.m33504().mo13855(m41354() + 8);
        }
        return this.f54215;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x011d A[PHI: r8
      0x011d: PHI (r8v3 l.ۨۖܽ) = (r8v2 l.ۨۖܽ), (r8v4 l.ۨۖܽ) binds: [B:66:0x011b, B:59:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m41360(C18155 c18155, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C2582 c2582 = f54209;
        if (this.f54220.getType().equals(c18155.f54220.getType()) && getName().equals(c18155.getName()) && mo5855().equals(c18155.mo5855()) && C3624.m6845(mo5852(), c18155.mo5852()) && this.f54219 == c18155.f54219 && (((this.f54217 == 0 && c18155.f54217 == 0) || C5755.m12839(getAnnotations(), c18155.getAnnotations())) && ((this.f54211 == 7 && c18155.f54211 == 7) || C5755.m12839(mo5856(), c18155.mo5856())))) {
            C22180 c22180Mo5857 = mo5857();
            C22180 c22180Mo5858 = c18155.mo5857();
            boolean z6 = c22180Mo5857 == null || c22180Mo5857.m49997() == 0;
            boolean z7 = c22180Mo5858 == null || c22180Mo5858.m49997() == 0;
            if (z6 && z7) {
                return true;
            }
            if (!z6 && !z7 && (z3 || c22180Mo5857.mo6075() == c22180Mo5858.mo6075())) {
                C23616 c23616 = new C23616();
                c23616.f75164 = false;
                c23616.f75168 = true;
                c23616.f75166 = !z;
                c23616.f75163 = z3;
                c23616.f75167 = z4;
                c23616.f75165 = true;
                c23616.f75169 = z2;
                c23616.f75161 = this.f54212.mo29499().f27379;
                C3499 c3499 = new C3499(c23616, this, c22180Mo5857);
                C3499 c34910 = new C3499(c23616, c18155, c22180Mo5858);
                C13220 c13220M41351 = null;
                try {
                    try {
                        c13220M41351 = m41351(c3499, z5);
                        C9399 c9399 = new C9399(c13220M41351);
                        c34910.m6257(new C24033(c9399, z5));
                        c9399.m21894();
                        c3499.m6260();
                        c34910.m6260();
                        c2582.m3890(c13220M41351);
                        return true;
                    } catch (IOException e) {
                        e.printStackTrace(System.out);
                        c3499.m6260();
                        c34910.m6260();
                        if (c13220M41351 != null) {
                            c2582.m3890(c13220M41351);
                        }
                    } catch (C15433 unused) {
                        c3499.m6260();
                        c34910.m6260();
                        if (c13220M41351 != null) {
                            c2582.m3890(c13220M41351);
                        }
                    }
                } catch (Throwable th) {
                    c3499.m6260();
                    c34910.m6260();
                    if (c13220M41351 != null) {
                        c2582.m3890(c13220M41351);
                    }
                    throw th;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13220 m41351(C3499 c3499, boolean z) {
        C2582 c2582 = f54209;
        C13220 c13220 = (C13220) c2582.m3892();
        if (c13220 == null) {
            c13220 = new C13220();
        } else {
            c13220.m30229(0);
        }
        try {
            c3499.m6257(new C24033(new C23948(c13220), z));
            return c13220;
        } catch (IOException | RuntimeException e) {
            c2582.m3890(c13220);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۚ */
    public static void m41352() {
        f54209.m3891();
    }
}
