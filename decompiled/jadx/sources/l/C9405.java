package l;

import android.content.DialogInterface;
import android.graphics.RectF;
import bin.mt.plus.R;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۢۛܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7Z8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9405 extends AbstractC7548 {

    /* JADX INFO: renamed from: ᩸᩷֡, reason: not valid java name and contains not printable characters */
    private static final short[] f28546 = {8650, -12020, -11950, -11956, -11963};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f28547;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f28548;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f28549;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C16312 f28550;

    public C9405(C16560 c16560, AbstractC15440 abstractC15440) {
        this.f28549 = c16560;
        this.f28547 = abstractC15440;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f28549.m39056(), R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        RectF rectFM38408 = this.f28550.m38408();
        int iM38410 = (int) this.f28550.m38410();
        int iM38405 = (int) this.f28550.m38405();
        if (iM38410 == -1 && iM38405 == -1) {
            iM38410 = (int) (rectFM38408.right - rectFM38408.left);
            iM38405 = (int) (rectFM38408.bottom - rectFM38408.top);
        } else if (rectFM38408 == null) {
            this.f28550.m38400(iM38410, iM38405);
        }
        int i = iM38410;
        int i2 = iM38405;
        new C20694(this, this.f28549.m39056(), i, i2, i, i2);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f28549.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x0151 A[PHI: r4 r5
      0x0151: PHI (r4v3 java.lang.StringBuilder) = (r4v2 java.lang.StringBuilder), (r4v1 java.lang.StringBuilder), (r4v1 java.lang.StringBuilder) binds: [B:45:0x014f, B:12:0x0072, B:9:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v1 java.lang.String), (r5v1 java.lang.String) binds: [B:45:0x014f, B:12:0x0072, B:9:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02ba A[PHI: r7 r8 r14
      0x02ba: PHI (r7v3 java.lang.String) = 
      (r7v1 java.lang.String)
      (r7v2 java.lang.String)
      (r7v1 java.lang.String)
      (r7v1 java.lang.String)
      (r7v1 java.lang.String)
     binds: [B:73:0x02b8, B:33:0x00e7, B:21:0x009e, B:18:0x0084, B:12:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x02ba: PHI (r8v3 boolean) = (r8v1 boolean), (r8v2 boolean), (r8v1 boolean), (r8v1 boolean), (r8v1 boolean) binds: [B:73:0x02b8, B:33:0x00e7, B:21:0x009e, B:18:0x0084, B:12:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x02ba: PHI (r14v3 int) = (r14v2 int), (r14v1 int), (r14v1 int), (r14v1 int), (r14v1 int) binds: [B:73:0x02b8, B:33:0x00e7, B:21:0x009e, B:18:0x0084, B:12:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02ec A[PHI: r15 r16 r24
      0x02ec: PHI (r15v3 int) = (r15v1 int), (r15v2 int), (r15v1 int) binds: [B:77:0x02ea, B:69:0x0299, B:9:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x02ec: PHI (r16v3 int) = (r16v1 int), (r16v2 int), (r16v1 int) binds: [B:77:0x02ea, B:69:0x0299, B:9:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x02ec: PHI (r24v5 short) = (r24v4 short), (r24v3 short), (r24v3 short) binds: [B:77:0x02ea, B:69:0x0299, B:9:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x031f A[PHI: r6 r18
      0x031f: PHI (r6v2 java.lang.String) = (r6v1 java.lang.String), (r6v4 java.lang.String) binds: [B:81:0x031d, B:37:0x0109] A[DONT_GENERATE, DONT_INLINE]
      0x031f: PHI (r18v4 char) = (r18v3 char), (r18v2 char) binds: [B:81:0x031d, B:37:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x034f A[PHI: r9 r12 r17
      0x034f: PHI (r9v3 l.ܽۢܳ) = (r9v1 l.ܽۢܳ), (r9v1 l.ܽۢܳ), (r9v2 l.ܽۢܳ), (r9v1 l.ܽۢܳ) binds: [B:85:0x034d, B:41:0x012a, B:29:0x00c1, B:15:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x034f: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:85:0x034d, B:41:0x012a, B:29:0x00c1, B:15:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x034f: PHI (r17v4 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:85:0x034d, B:41:0x012a, B:29:0x00c1, B:15:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public void mo1009() throws Throwable {
        int iM6981;
        int i;
        int i2;
        InputStream inputStreamM9930 = null;
        Throwable th = null;
        StringBuilder sb = null;
        String strM36517 = null;
        String strM9031 = null;
        String strM1959 = null;
        boolean z = false;
        C16560 c16560 = null;
        Object obj = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1741944456;
        int i7 = C4616.f14690;
        int i8 = C11340.f33930;
        int iM2566 = C0630.m2566("ۤܳ") ^ i7;
        int i9 = ((iM2566 ^ i8) * (-18211)) ^ 993994620;
        int i10 = iM2566 ^ 281725928;
        short[] sArr = null;
        short[] sArr2 = null;
        int i11 = 0;
        char c = 0;
        AbstractC15440 abstractC15440 = null;
        short s = 0;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i8) * 8165) >> 31));
            switch (i6) {
                case -1953520941:
                case -1327114272:
                    C2167.m7154(th, obj);
                    iM6981 = C0630.m2566("ܳܶ") ^ i8;
                    i = ((iM6981 ^ i7) * (-709)) ^ 1224855524;
                    i2 = 11978990;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1780934261:
                case 1590091350:
                    c = 0;
                    if (C3019.f9544 >= 0) {
                        iM6981 = C2105.m6981("ܳ۬") ^ i7;
                        i = ((iM6981 ^ i8) * 26921) ^ (-1118188223);
                        i2 = -474489522;
                    } else {
                        iM6981 = C2105.m6981("ۗ۫") ^ i8;
                        i = ((iM6981 ^ i7) * 8955) ^ 292777175;
                        i2 = -1539737861;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1718080612:
                case 913426919:
                    sArr = f28546;
                    if (C21923.f70183 != 0) {
                        iM6981 = (C2105.m6981("ܶۗ") + i8) * (-25);
                        i = ((iM6981 ^ i7) * (-13457)) ^ 1478127552;
                        i2 = 744637208;
                    } else {
                        iM6981 = C2105.m6981("ۧܳ") ^ i7;
                        i = ((iM6981 ^ i8) * 7139) ^ (-1366666323);
                        i2 = -1285416345;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1712942799:
                case 591562886:
                    sb = new StringBuilder();
                    strM36517 = abstractC15440.m36517();
                    if (C2272.f7362) {
                        iM6981 = C2105.m6981("۬᩹") ^ i8;
                        i = ((iM6981 ^ i7) * (-25767)) ^ (-892190684);
                        i2 = -1228707180;
                    } else {
                        iM6981 = C2105.m6981("ᩴܶ") ^ i7;
                        i = ((iM6981 ^ i8) * (-27233)) ^ 893355028;
                        i2 = 1948228475;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1670451264:
                case -1368764744:
                    RunnableC1108.m3785(inputStreamM9930);
                    iM6981 = C0630.m2566("ܳ᩷") ^ i7;
                    i = ((iM6981 ^ i8) * (-26025)) ^ 327160927;
                    i2 = -1084377515;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1480227884:
                case 798773823:
                    this.f28548 = c16560.m38993(strM1959, z).m36492(true);
                    return;
                case -1450267920:
                case -727971407:
                    throw th;
                case -1277232568:
                case 1659485349:
                    if (RunnableC1937.m6387() != 0) {
                        iM6981 = C0630.m2566("᩶ۖ") ^ i7;
                        i = ((iM6981 ^ i8) * (-26539)) ^ (-542598330);
                        i2 = 1027110914;
                    } else {
                        iM6981 = (C2105.m6981("ܶۗ") + i8) * (-25);
                        i = ((iM6981 ^ i7) * (-13457)) ^ 1478127552;
                        i2 = 744637208;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1210557747:
                case 24459099:
                    try {
                        RunnableC1108.m3785(inputStreamM9930);
                        iM6981 = C0630.m2566("ܳܶ") ^ i8;
                        i = ((iM6981 ^ i7) * (-709)) ^ 1224855524;
                        i2 = 11978990;
                        i10 = iM6981 ^ i2;
                    } catch (Throwable th2) {
                        int iM6982 = C2105.m6981("ܰۚ") ^ i8;
                        i = ((iM6982 ^ i7) * 30143) ^ 2002585369;
                        i10 = iM6982 ^ 1691293046;
                        obj = th2;
                    }
                    i9 = i;
                    break;
                case -1130581730:
                case -183542756:
                    C1420.m4905(sb, strM9031);
                    strM1959 = C0422.m1959(sb);
                    z = false;
                    if (C0382.f1805) {
                        iM6981 = C0630.m2566("ۗ᩵") ^ i8;
                        i = ((iM6981 ^ i7) * 8219) ^ (-98263663);
                        i2 = -1800859670;
                    } else {
                        iM6981 = C0630.m2566("᩺ܽ") ^ i7;
                        i = ((iM6981 ^ i8) * (-25511)) ^ (-1902167243);
                        i2 = 1974603763;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1090328049:
                case -950457928:
                    i3 = s + 1;
                    if (C2105.f7037 != 0) {
                        iM6981 = C0630.m2566("᩺ܽ") ^ i7;
                        i = ((iM6981 ^ i8) * (-25511)) ^ (-1902167243);
                        i2 = 1974603763;
                    } else {
                        iM6981 = C0630.m2566("ۤ֡") ^ i8;
                        i = ((iM6981 ^ i7) * 32661) ^ 1838664336;
                        i2 = -2032056529;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -994032362:
                case 1806297267:
                    C3245.m9925();
                    if (C1711.m5736() <= 0) {
                        iM6981 = C0630.m2566("᩺ܽ") ^ i7;
                        i = ((iM6981 ^ i8) * (-25511)) ^ (-1902167243);
                        i2 = 1974603763;
                    } else {
                        iM6981 = C0630.m2566("᩶ۖ") ^ i7;
                        i = ((iM6981 ^ i8) * (-26539)) ^ (-542598330);
                        i2 = 1027110914;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -989010537:
                case 654712955:
                    if (C3911.f12484 < 0) {
                        iM6981 = C2105.m6981("۬᩹") ^ i8;
                        i = ((iM6981 ^ i7) * (-25767)) ^ (-892190684);
                        i2 = -1228707180;
                    } else {
                        iM6981 = (C0630.m2566("ܿ۬") ^ i7) * (-47);
                        i = ((iM6981 ^ i8) * (-1233)) ^ (-2067782388);
                        i2 = 609855738;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -939929049:
                case 1034428516:
                    C3019.m9255();
                    if (C3911.m11924() > 0) {
                        iM6981 = C0630.m2566("᩺ܽ") ^ i7;
                        i = ((iM6981 ^ i8) * (-25511)) ^ (-1902167243);
                        i2 = 1974603763;
                    } else {
                        iM6981 = C2105.m6981("۬᩹") ^ i8;
                        i = ((iM6981 ^ i7) * (-25767)) ^ (-892190684);
                        i2 = -1228707180;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -670074822:
                case 871434724:
                    if (inputStreamM9930 != null) {
                        iM6981 = (C0630.m2566("ܳۧ") + i8) * (-111);
                        i = ((iM6981 ^ i7) * 5283) ^ (-1604605402);
                        i2 = 2100491;
                    } else {
                        iM6981 = C0630.m2566("ܳܶ") ^ i8;
                        i = ((iM6981 ^ i7) * (-709)) ^ 1224855524;
                        i2 = 11978990;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -185223533:
                case 1618972349:
                    strM9031 = C2958.m9031(sArr2, 1, 4, i11);
                    if (C2958.f9394 >= 0) {
                        iM6981 = C2105.m6981("ܳ۬") ^ i7;
                        i = ((iM6981 ^ i8) * 26921) ^ (-1118188223);
                        i2 = -474489522;
                    } else {
                        iM6981 = C2105.m6981("۠ܳ") ^ i7;
                        i = ((iM6981 ^ i8) * (-6259)) ^ 617629537;
                        i2 = -1708674163;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case 43704719:
                case 1082377896:
                    c16560 = this.f28549;
                    if (C1420.f5096 <= 0) {
                        iM6981 = (C2105.m6981("ܶۗ") + i8) * (-25);
                        i = ((iM6981 ^ i7) * (-13457)) ^ 1478127552;
                        i2 = 744637208;
                    } else {
                        iM6981 = (C0630.m2566("᩺۠") + i8) * 7;
                        i = ((iM6981 ^ i7) * (-9697)) ^ 423513913;
                        i2 = 1794652154;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case 76276065:
                case 827646549:
                    if (inputStreamM9930 != null) {
                        iM6981 = (C0630.m2566("֫ۙ") ^ i7) * (-45);
                        i = ((iM6981 ^ i8) * (-13843)) ^ 2054569286;
                        i2 = -1620777742;
                    } else {
                        iM6981 = C0630.m2566("ܳ᩷") ^ i7;
                        i = ((iM6981 ^ i8) * (-26025)) ^ 327160927;
                        i2 = -1084377515;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case 300583147:
                case 1389083438:
                    i4 = i3 * i3;
                    i5 = s * 2;
                    if (C3746.f11829 <= 0) {
                        iM6981 = (C0630.m2566("ܿ۬") ^ i7) * (-47);
                        i = ((iM6981 ^ i8) * (-1233)) ^ (-2067782388);
                        i2 = 609855738;
                    } else {
                        iM6981 = (C2105.m6981("֫ۢ") ^ i8) * (-21);
                        i = ((iM6981 ^ i7) * (-22895)) ^ (-2108596303);
                        i2 = 920218027;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case 452558781:
                case 763998132:
                    i11 = 59581;
                    iM6981 = (i7 - C0630.m2566("ۡۗ")) * 29;
                    i = ((iM6981 ^ i8) * (-13057)) ^ 774127255;
                    i2 = 874295660;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case 461413858:
                case 800675240:
                    C1773.m5908();
                    iM6981 = C0630.m2566("᩺ܽ") ^ i7;
                    i = ((iM6981 ^ i8) * (-25511)) ^ (-1902167243);
                    i2 = 1974603763;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case 574287778:
                case 1393225008:
                    C2958.m9034();
                    return;
                case 602212510:
                case 699038853:
                    i11 = 53538;
                    iM6981 = (i7 - C0630.m2566("ۡۗ")) * 29;
                    i = ((iM6981 ^ i8) * (-13057)) ^ 774127255;
                    i2 = 874295660;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case 911831279:
                case 1386708729:
                    C1420.m4905(sb, strM36517);
                    sArr2 = f28546;
                    if (C21923.f70183 != 0) {
                        iM6981 = (C2105.m6981("ܶۗ") + i8) * (-25);
                        i = ((iM6981 ^ i7) * (-13457)) ^ 1478127552;
                        i2 = 744637208;
                    } else {
                        iM6981 = C0630.m2566("ۡۚ") ^ i8;
                        i = ((iM6981 ^ i7) * 12191) ^ (-627987435);
                        i2 = 551505334;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case 1305786683:
                case 1463024686:
                    AbstractC15440 abstractC15441 = this.f28547;
                    inputStreamM9930 = C3245.m9930(abstractC15441);
                    int iM2567 = (i7 - C0630.m2566("ܽۛ")) * (-77);
                    i9 = ((iM2567 ^ i8) * 22921) ^ 118082832;
                    abstractC15440 = abstractC15441;
                    i10 = iM2567 ^ 768425981;
                    break;
                case 1567967137:
                case 1947120155:
                    try {
                        this.f28550 = C16312.m38391(inputStreamM9930);
                        iM6981 = C2105.m6981("۠᩹") ^ i7;
                        i = ((iM6981 ^ i8) * 18793) ^ (-381943975);
                        i2 = 573624376;
                    } catch (Throwable th3) {
                        th = th3;
                        iM6981 = C0630.m2566("᩶ܰ") ^ i8;
                        i = ((iM6981 ^ i7) * (-19599)) ^ 96206584;
                        i2 = -405269086;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case 1880329011:
                case 2073333564:
                    s = sArr[c];
                    if (C0382.f1805) {
                        iM6981 = C0630.m2566("ܳۛ") ^ i7;
                        i = ((iM6981 ^ i8) * (-1595)) ^ (-912905869);
                        i2 = -505278096;
                    } else {
                        iM6981 = (C0630.m2566("ܿ۬") ^ i7) * (-47);
                        i = ((iM6981 ^ i8) * (-1233)) ^ (-2067782388);
                        i2 = 609855738;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                default:
                    if ((i5 + 1) - i4 > 0) {
                        iM6981 = C0630.m2566("۬ۧ") ^ i8;
                        i = ((iM6981 ^ i7) * (-691)) ^ 1967830930;
                        i2 = -824998406;
                    } else {
                        iM6981 = (C0630.m2566("ۛᩳ") ^ i7) * 81;
                        i = ((iM6981 ^ i8) * 2783) ^ 1996816615;
                        i2 = 1754283325;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
            }
        }
    }
}
