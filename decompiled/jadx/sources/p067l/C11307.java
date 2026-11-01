package p067l;

import android.content.DialogInterface;
import android.graphics.RectF;
import bin.p000mt.plus.R;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۢۛܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7Z8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11307 extends AbstractC9542 {

    /* JADX INFO: renamed from: ᩸᩷֡, reason: not valid java name and contains not printable characters */
    private static final short[] f82104 = {8650, -12020, -11950, -11956, -11963};

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ AbstractC17043 f31494;

    /* JADX INFO: renamed from: ܳ */
    public AbstractC17043 f31495;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C18107 f31496;

    /* JADX INFO: renamed from: ᩻ */
    public C17871 f31497;

    public C11307(C18107 c18107, AbstractC17043 abstractC17043) {
        this.f31496 = c18107;
        this.f31494 = abstractC17043;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f31496.m41282(), R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        RectF rectFM40623 = this.f31497.m40623();
        int iM40625 = (int) this.f31497.m40625();
        int iM40620 = (int) this.f31497.m40620();
        if (iM40625 == -1 && iM40620 == -1) {
            iM40625 = (int) (rectFM40623.right - rectFM40623.left);
            iM40620 = (int) (rectFM40623.bottom - rectFM40623.top);
        } else if (rectFM40623 == null) {
            this.f31497.m40615(iM40625, iM40620);
        }
        int i = iM40625;
        int i2 = iM40620;
        new C22036(this, this.f31496.m41282(), i, i2, i, i2);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f31496.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
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
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public void mo3405() throws Throwable {
        int iM55979;
        int i;
        int i2;
        InputStream inputStreamM56128 = null;
        Throwable th = null;
        StringBuilder sb = null;
        String strM38675 = null;
        String strM56092 = null;
        String strM55639 = null;
        boolean z = false;
        C18107 c18107 = null;
        Object obj = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1741944456;
        int i7 = C1071.f81975;
        int i8 = C1404.f82149;
        int iM55680 = C0873.m55680("ۤܳ") ^ i7;
        int i9 = ((iM55680 ^ i8) * (-18211)) ^ 993994620;
        int i10 = iM55680 ^ 281725928;
        short[] sArr = null;
        short[] sArr2 = null;
        int i11 = 0;
        char c = 0;
        AbstractC17043 abstractC17043 = null;
        short s = 0;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i8) * 8165) >> 31));
            switch (i6) {
                case -1953520941:
                case -1327114272:
                    C0949.m56011(th, obj);
                    iM55979 = C0873.m55680("ܳܶ") ^ i8;
                    i = ((iM55979 ^ i7) * (-709)) ^ 1224855524;
                    i2 = 11978990;
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -1780934261:
                case 1590091350:
                    c = 0;
                    if (C0992.f81922 >= 0) {
                        iM55979 = C0946.m55979("ܳ۬") ^ i7;
                        i = ((iM55979 ^ i8) * 26921) ^ (-1118188223);
                        i2 = -474489522;
                    } else {
                        iM55979 = C0946.m55979("ۗ۫") ^ i8;
                        i = ((iM55979 ^ i7) * 8955) ^ 292777175;
                        i2 = -1539737861;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -1718080612:
                case 913426919:
                    sArr = f82104;
                    if (C1929.f83011 != 0) {
                        iM55979 = (C0946.m55979("ܶۗ") + i8) * (-25);
                        i = ((iM55979 ^ i7) * (-13457)) ^ 1478127552;
                        i2 = 744637208;
                    } else {
                        iM55979 = C0946.m55979("ۧܳ") ^ i7;
                        i = ((iM55979 ^ i8) * 7139) ^ (-1366666323);
                        i2 = -1285416345;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -1712942799:
                case 591562886:
                    sb = new StringBuilder();
                    strM38675 = abstractC17043.m38675();
                    if (C0955.f81898) {
                        iM55979 = C0946.m55979("۬᩹") ^ i8;
                        i = ((iM55979 ^ i7) * (-25767)) ^ (-892190684);
                        i2 = -1228707180;
                    } else {
                        iM55979 = C0946.m55979("ᩴܶ") ^ i7;
                        i = ((iM55979 ^ i8) * (-27233)) ^ 893355028;
                        i2 = 1948228475;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -1670451264:
                case -1368764744:
                    RunnableC0897.m55779(inputStreamM56128);
                    iM55979 = C0873.m55680("ܳ᩷") ^ i7;
                    i = ((iM55979 ^ i8) * (-26025)) ^ 327160927;
                    i2 = -1084377515;
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -1480227884:
                case 798773823:
                    this.f31495 = c18107.m41219(strM55639, z).m38650(true);
                    return;
                case -1450267920:
                case -727971407:
                    throw th;
                case -1277232568:
                case 1659485349:
                    if (RunnableC0938.m55938() != 0) {
                        iM55979 = C0873.m55680("᩶ۖ") ^ i7;
                        i = ((iM55979 ^ i8) * (-26539)) ^ (-542598330);
                        i2 = 1027110914;
                    } else {
                        iM55979 = (C0946.m55979("ܶۗ") + i8) * (-25);
                        i = ((iM55979 ^ i7) * (-13457)) ^ 1478127552;
                        i2 = 744637208;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -1210557747:
                case 24459099:
                    try {
                        RunnableC0897.m55779(inputStreamM56128);
                        iM55979 = C0873.m55680("ܳܶ") ^ i8;
                        i = ((iM55979 ^ i7) * (-709)) ^ 1224855524;
                        i2 = 11978990;
                        i10 = iM55979 ^ i2;
                    } catch (Throwable th2) {
                        int iM559710 = C0946.m55979("ܰۚ") ^ i8;
                        i = ((iM559710 ^ i7) * 30143) ^ 2002585369;
                        i10 = iM559710 ^ 1691293046;
                        obj = th2;
                    }
                    i9 = i;
                    break;
                case -1130581730:
                case -183542756:
                    C0912.m55825(sb, strM56092);
                    strM55639 = C0863.m55639(sb);
                    z = false;
                    if (C0861.f81831) {
                        iM55979 = C0873.m55680("ۗ᩵") ^ i8;
                        i = ((iM55979 ^ i7) * 8219) ^ (-98263663);
                        i2 = -1800859670;
                    } else {
                        iM55979 = C0873.m55680("᩺ܽ") ^ i7;
                        i = ((iM55979 ^ i8) * (-25511)) ^ (-1902167243);
                        i2 = 1974603763;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -1090328049:
                case -950457928:
                    i3 = s + 1;
                    if (C0946.f81894 != 0) {
                        iM55979 = C0873.m55680("᩺ܽ") ^ i7;
                        i = ((iM55979 ^ i8) * (-25511)) ^ (-1902167243);
                        i2 = 1974603763;
                    } else {
                        iM55979 = C0873.m55680("ۤ֡") ^ i8;
                        i = ((iM55979 ^ i7) * 32661) ^ 1838664336;
                        i2 = -2032056529;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -994032362:
                case 1806297267:
                    C1003.m56123();
                    if (C0927.m55873() <= 0) {
                        iM55979 = C0873.m55680("᩺ܽ") ^ i7;
                        i = ((iM55979 ^ i8) * (-25511)) ^ (-1902167243);
                        i2 = 1974603763;
                    } else {
                        iM55979 = C0873.m55680("᩶ۖ") ^ i7;
                        i = ((iM55979 ^ i8) * (-26539)) ^ (-542598330);
                        i2 = 1027110914;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -989010537:
                case 654712955:
                    if (C1036.f81953 < 0) {
                        iM55979 = C0946.m55979("۬᩹") ^ i8;
                        i = ((iM55979 ^ i7) * (-25767)) ^ (-892190684);
                        i2 = -1228707180;
                    } else {
                        iM55979 = (C0873.m55680("ܿ۬") ^ i7) * (-47);
                        i = ((iM55979 ^ i8) * (-1233)) ^ (-2067782388);
                        i2 = 609855738;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -939929049:
                case 1034428516:
                    C0992.m56107();
                    if (C1036.m56257() > 0) {
                        iM55979 = C0873.m55680("᩺ܽ") ^ i7;
                        i = ((iM55979 ^ i8) * (-25511)) ^ (-1902167243);
                        i2 = 1974603763;
                    } else {
                        iM55979 = C0946.m55979("۬᩹") ^ i8;
                        i = ((iM55979 ^ i7) * (-25767)) ^ (-892190684);
                        i2 = -1228707180;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -670074822:
                case 871434724:
                    if (inputStreamM56128 != null) {
                        iM55979 = (C0873.m55680("ܳۧ") + i8) * (-111);
                        i = ((iM55979 ^ i7) * 5283) ^ (-1604605402);
                        i2 = 2100491;
                    } else {
                        iM55979 = C0873.m55680("ܳܶ") ^ i8;
                        i = ((iM55979 ^ i7) * (-709)) ^ 1224855524;
                        i2 = 11978990;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -185223533:
                case 1618972349:
                    strM56092 = C0989.m56092(sArr2, 1, 4, i11);
                    if (C0989.f81920 >= 0) {
                        iM55979 = C0946.m55979("ܳ۬") ^ i7;
                        i = ((iM55979 ^ i8) * 26921) ^ (-1118188223);
                        i2 = -474489522;
                    } else {
                        iM55979 = C0946.m55979("۠ܳ") ^ i7;
                        i = ((iM55979 ^ i8) * (-6259)) ^ 617629537;
                        i2 = -1708674163;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case 43704719:
                case 1082377896:
                    c18107 = this.f31496;
                    if (C0912.f81867 <= 0) {
                        iM55979 = (C0946.m55979("ܶۗ") + i8) * (-25);
                        i = ((iM55979 ^ i7) * (-13457)) ^ 1478127552;
                        i2 = 744637208;
                    } else {
                        iM55979 = (C0873.m55680("᩺۠") + i8) * 7;
                        i = ((iM55979 ^ i7) * (-9697)) ^ 423513913;
                        i2 = 1794652154;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case 76276065:
                case 827646549:
                    if (inputStreamM56128 != null) {
                        iM55979 = (C0873.m55680("֫ۙ") ^ i7) * (-45);
                        i = ((iM55979 ^ i8) * (-13843)) ^ 2054569286;
                        i2 = -1620777742;
                    } else {
                        iM55979 = C0873.m55680("ܳ᩷") ^ i7;
                        i = ((iM55979 ^ i8) * (-26025)) ^ 327160927;
                        i2 = -1084377515;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case 300583147:
                case 1389083438:
                    i4 = i3 * i3;
                    i5 = s * 2;
                    if (C1028.f81950 <= 0) {
                        iM55979 = (C0873.m55680("ܿ۬") ^ i7) * (-47);
                        i = ((iM55979 ^ i8) * (-1233)) ^ (-2067782388);
                        i2 = 609855738;
                    } else {
                        iM55979 = (C0946.m55979("֫ۢ") ^ i8) * (-21);
                        i = ((iM55979 ^ i7) * (-22895)) ^ (-2108596303);
                        i2 = 920218027;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case 452558781:
                case 763998132:
                    i11 = 59581;
                    iM55979 = (i7 - C0873.m55680("ۡۗ")) * 29;
                    i = ((iM55979 ^ i8) * (-13057)) ^ 774127255;
                    i2 = 874295660;
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case 461413858:
                case 800675240:
                    C0930.m55885();
                    iM55979 = C0873.m55680("᩺ܽ") ^ i7;
                    i = ((iM55979 ^ i8) * (-25511)) ^ (-1902167243);
                    i2 = 1974603763;
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case 574287778:
                case 1393225008:
                    C0989.m56095();
                    return;
                case 602212510:
                case 699038853:
                    i11 = 53538;
                    iM55979 = (i7 - C0873.m55680("ۡۗ")) * 29;
                    i = ((iM55979 ^ i8) * (-13057)) ^ 774127255;
                    i2 = 874295660;
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case 911831279:
                case 1386708729:
                    C0912.m55825(sb, strM38675);
                    sArr2 = f82104;
                    if (C1929.f83011 != 0) {
                        iM55979 = (C0946.m55979("ܶۗ") + i8) * (-25);
                        i = ((iM55979 ^ i7) * (-13457)) ^ 1478127552;
                        i2 = 744637208;
                    } else {
                        iM55979 = C0873.m55680("ۡۚ") ^ i8;
                        i = ((iM55979 ^ i7) * 12191) ^ (-627987435);
                        i2 = 551505334;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case 1305786683:
                case 1463024686:
                    AbstractC17043 abstractC17044 = this.f31494;
                    inputStreamM56128 = C1003.m56128(abstractC17044);
                    int iM55681 = (i7 - C0873.m55680("ܽۛ")) * (-77);
                    i9 = ((iM55681 ^ i8) * 22921) ^ 118082832;
                    abstractC17043 = abstractC17044;
                    i10 = iM55681 ^ 768425981;
                    break;
                case 1567967137:
                case 1947120155:
                    try {
                        this.f31497 = C17871.m40606(inputStreamM56128);
                        iM55979 = C0946.m55979("۠᩹") ^ i7;
                        i = ((iM55979 ^ i8) * 18793) ^ (-381943975);
                        i2 = 573624376;
                    } catch (Throwable th3) {
                        th = th3;
                        iM55979 = C0873.m55680("᩶ܰ") ^ i8;
                        i = ((iM55979 ^ i7) * (-19599)) ^ 96206584;
                        i2 = -405269086;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case 1880329011:
                case 2073333564:
                    s = sArr[c];
                    if (C0861.f81831) {
                        iM55979 = C0873.m55680("ܳۛ") ^ i7;
                        i = ((iM55979 ^ i8) * (-1595)) ^ (-912905869);
                        i2 = -505278096;
                    } else {
                        iM55979 = (C0873.m55680("ܿ۬") ^ i7) * (-47);
                        i = ((iM55979 ^ i8) * (-1233)) ^ (-2067782388);
                        i2 = 609855738;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                default:
                    if ((i5 + 1) - i4 > 0) {
                        iM55979 = C0873.m55680("۬ۧ") ^ i8;
                        i = ((iM55979 ^ i7) * (-691)) ^ 1967830930;
                        i2 = -824998406;
                    } else {
                        iM55979 = (C0873.m55680("ۛᩳ") ^ i7) * 81;
                        i = ((iM55979 ^ i8) * 2783) ^ 1996816615;
                        i2 = 1754283325;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
            }
        }
    }
}
