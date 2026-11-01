package p067l;

import android.R;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.p080ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.ۜܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79RC */
/* JADX INFO: loaded from: classes2.dex */
public final class C8837 {

    /* JADX INFO: renamed from: ۘܿۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f82036 = {5384, 12509, 12511, 12488, 12501, 12490, 12501, 12488, 12485, 12492, 12494, 12499, 12490, 12501, 12504, 12505, 12494, 12494, 12505, 12511, 12505, 12501, 12490, 12505, 12494, 12509, 12511, 12488, 12501, 12490, 12501, 12488, 12485, 12433, 12509, 12496, 12501, 12509, 12495, 12509, 12492, 12492, 12496, 12501, 12511, 12509, 12488, 12501, 12499, 12498, 12509, 12492, 12492, 12491, 12501, 12504, 12507, 12505, 12488, 12433, 12492, 12494, 12499, 12490, 12501, 12504, 12505, 12494, 12495, 12505, 12494, 12490, 12501, 12511, 12505, 12509, 12498, 12504, 12494, 12499, 12501, 12504, 12422, 12511, 12499, 12498, 12495, 12488, 12494, 12509, 12501, 12498, 12488, 12515, 12494, 12505, 12506, 12505, 12494, 12505, 12498, 12511, 12505, 12504, 12515, 12501, 12504, 12495, 12496, 12509, 12485, 12499, 12489, 12488, 12515, 12511, 12499, 12498, 12495, 12488, 12494, 12509, 12501, 12498, 12488, 12536, 12501, 12497, 12505, 12498, 12495, 12501, 12499, 12498, 12526, 12509, 12488, 12501, 12499, 12496, 12509, 12510, 12505, 12496, 12496, 12509, 12485, 12499, 12489, 12488, 12529, 12509, 12498, 12509, 12507, 12505, 12494, 12488, 12501, 12488, 12496, 12505, 12543, 12496, 12509, 12495, 12495, 12498, 12509, 12497, 12505, 12519, 12509, 12433, 12486, 12513, 12439, 12436, 12512, 12434, 12519, 12509, 12433, 12486, 12513, 12439, 12437, 12439, 12512, 12434, 12519, 12512, 12491, 12440, 12513, 12439, 12488, 12505, 12484, 12488, 12495, 12505, 12492, 12509, 12494, 12509, 12488, 12499, 12494, 12509, 12492, 12492, 12422, 12504, 12505, 12495, 12511, 12494, 12501, 12492, 12488, 12501, 12499, 12498, 12500, 12501, 12498, 12488, 12495, 12489, 12497, 12497, 12509, 12494, 12485, 12511, 12499, 12497, 12497, 12505, 12498, 12488, 12503, 12505, 12485, 12490, 12509, 12496, 12489, 12505, 12492, 12509, 12488, 12500, 12495, 12489, 12510, 12502, 12505, 12511, 12488};

    /* JADX INFO: renamed from: ֫ */
    public List f23982;

    /* JADX INFO: renamed from: ۧ */
    public String f23983;

    /* JADX INFO: renamed from: ܽ */
    public C16820 f23984;

    /* JADX INFO: renamed from: ֫ */
    public final String m20404() {
        return this.f23983;
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m20405() {
        return this.f23982;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C16820 m20406() {
        return this.f23984;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b9 A[PHI: r10
      0x00b9: PHI (r10v3 java.lang.Object) = (r10v2 java.lang.Object), (r10v1 java.lang.Object) binds: [B:33:0x00b7, B:15:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0213 A[PHI: r2
      0x0213: PHI (r2v3 l.ۜܰܽ) = (r2v1 l.ۜܰܽ), (r2v2 l.ۜܰܽ), (r2v1 l.ۜܰܽ), (r2v1 l.ۜܰܽ), (r2v1 l.ۜܰܽ), (r2v1 l.ۜܰܽ) binds: [B:113:0x0213, B:66:0x0211, B:20:0x0060, B:18:0x005c, B:15:0x0056, B:126:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x028d  */
    /* JADX WARN: Code duplicated, block: B:79:0x02bf A[PHI: r7
      0x02bf: PHI (r7v2 l.ܿܰܽ) = (r7v1 l.ܿܰܽ), (r7v3 l.ܿܰܽ) binds: [B:78:0x02bd, B:44:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static C8837 m20402(String str, byte[] bArr) {
        int iM55979;
        int i;
        int i2;
        C16820 c16820M38138 = null;
        C8837 c8837 = null;
        C6634 c6634 = null;
        XmlResourceParserC12128 xmlResourceParserC12128M38154 = null;
        int next = 0;
        InterfaceC19157 interfaceC19157M55701 = null;
        InterfaceC19157 interfaceC19157Filter = null;
        InterfaceC13477 list = null;
        Object objCollect = null;
        List list2 = null;
        int i3 = -2114985828;
        int i4 = RunnableC1014.f81941;
        int i5 = C0930.f81879;
        int iM55680 = (i5 - C0873.m55680("֡᩺")) * (-13);
        int i6 = ((iM55680 ^ i4) * (-29855)) ^ (-1130027264);
        int i7 = iM55680 ^ (-1434204776);
        C18895 c18895 = null;
        C8837 c8838 = null;
        while (true) {
            i3 = i7 ^ (i6 & (((i3 ^ i4) * 4999) >> 31));
            switch (i3) {
                case -2106963785:
                case 1221874869:
                    interfaceC19157M55701 = C0877.m55701(c6634.values());
                    if (C0898.f81858 > 0) {
                        iM55979 = C0946.m55979("ۖۜ") ^ i4;
                        i = ((iM55979 ^ i5) * 15753) ^ 607277425;
                        i2 = 702974338;
                        int i8 = i;
                        i7 = iM55979 ^ i2;
                        i6 = i8;
                    } else {
                        int iM559710 = C0946.m55979("ۗۜ") ^ i4;
                        i7 = (-302754552) ^ iM559710;
                        i6 = ((iM559710 ^ i5) * 7489) ^ 239071700;
                        c18895 = null;
                    }
                    break;
                case -1970542715:
                case 557143619:
                    C1053.m56327();
                    RunnableC0897.m55784();
                    return null;
                case -1945421888:
                case 1280131315:
                    if (next != 1) {
                        iM55979 = C0873.m55680("ᩳۤ") ^ i4;
                        i = ((iM55979 ^ i5) * (-22597)) ^ (-1782738014);
                        i2 = 1358296311;
                    } else {
                        iM55979 = (i5 - C0946.m55979("᩹ᩴ")) * (-103);
                        i = ((iM55979 ^ i4) * 20747) ^ (-1071275688);
                        i2 = 2079735126;
                    }
                    int i9 = i;
                    i7 = iM55979 ^ i2;
                    i6 = i9;
                    break;
                case -1944174016:
                case -1886838870:
                    if (C1053.f81965 > 0) {
                        iM55979 = C0873.m55680("ۗۚ") ^ i4;
                        i = ((iM55979 ^ i5) * (-13373)) ^ (-4855826);
                        i2 = 1088373005;
                    } else {
                        iM55979 = C0946.m55979("ܶ۫") ^ i4;
                        i = ((iM55979 ^ i5) * (-24673)) ^ 601735247;
                        i2 = -1578496289;
                    }
                    int i10 = i;
                    i7 = iM55979 ^ i2;
                    i6 = i10;
                    break;
                case -1864369618:
                case 1811442261:
                    if (C0927.m55873() > 0) {
                        int iM559711 = C0946.m55979("ۗۜ") ^ i4;
                        i7 = (-302754552) ^ iM559711;
                        i6 = ((iM559711 ^ i5) * 7489) ^ 239071700;
                        c18895 = null;
                    } else {
                        iM55979 = C0873.m55680("ۗۚ") ^ i4;
                        i = ((iM55979 ^ i5) * (-13373)) ^ (-4855826);
                        i2 = 1088373005;
                        int i11 = i;
                        i7 = iM55979 ^ i2;
                        i6 = i11;
                    }
                    break;
                case -1764584642:
                case 3520314:
                    list2 = (List) objCollect;
                    if (C0949.m56018(list2)) {
                        iM55979 = (i5 - C0873.m55680("֨ۗ")) * 67;
                        i = ((iM55979 ^ i4) * 1877) ^ 1563440864;
                        i2 = 1822249071;
                    } else {
                        iM55979 = (i5 - C0873.m55680("ۗ᩻")) * 3;
                        i = ((iM55979 ^ i4) * (-21393)) ^ 347443390;
                        i2 = 937659304;
                    }
                    int i12 = i;
                    i7 = iM55979 ^ i2;
                    i6 = i12;
                    break;
                case -1713145553:
                case 1232446368:
                    interfaceC19157Filter = interfaceC19157M55701.filter(c18895);
                    list = C24205.toList();
                    if (!C0927.f81875) {
                        iM55979 = (C0873.m55680("᩹֫") + i5) * 9;
                        i = ((iM55979 ^ i4) * 9711) ^ 131308425;
                        i2 = -1370072315;
                        int i13 = i;
                        i7 = iM55979 ^ i2;
                        i6 = i13;
                    } else {
                        int iM559712 = (C0946.m55979("ܺۢ") + i5) * 67;
                        i6 = ((iM559712 ^ i4) * 20279) ^ 1472010538;
                        i7 = iM559712 ^ 1345681487;
                    }
                    break;
                case -1550877196:
                case 761985197:
                    C0877.m55696();
                    iM55979 = C0873.m55680("ۗۚ") ^ i4;
                    i = ((iM55979 ^ i5) * (-13373)) ^ (-4855826);
                    i2 = 1088373005;
                    int i14 = i;
                    i7 = iM55979 ^ i2;
                    i6 = i14;
                    break;
                case -1312812034:
                case -582969561:
                    return c8838;
                case -1143549442:
                case 1769457813:
                    c8837.f23982 = list2;
                    c8837.f23984 = c16820M38138;
                    return c8837;
                case -1073732345:
                case -674872870:
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0873.m55680("ۗۚ") ^ i4;
                        i = ((iM55979 ^ i5) * (-13373)) ^ (-4855826);
                        i2 = 1088373005;
                    } else {
                        iM55979 = (i5 - C0873.m55680("᩻ۗ")) * (-5);
                        i = ((iM55979 ^ i4) * 19841) ^ 132929706;
                        i2 = 993507443;
                    }
                    int i15 = i;
                    i7 = iM55979 ^ i2;
                    i6 = i15;
                    break;
                case -574861694:
                case 1476240762:
                    return c8838;
                case -248764785:
                case 177415565:
                    objCollect = interfaceC19157Filter.collect(list);
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0946.m55979("ܶ۫") ^ i4;
                        i = ((iM55979 ^ i5) * (-24673)) ^ 601735247;
                        i2 = -1578496289;
                    } else {
                        iM55979 = (i4 - C0946.m55979("۫֨")) * 55;
                        i = ((iM55979 ^ i5) * (-17703)) ^ (-1617272558);
                        i2 = -1617922354;
                    }
                    int i16 = i;
                    i7 = iM55979 ^ i2;
                    i6 = i16;
                    break;
                case 75030147:
                case 950442436:
                    next = xmlResourceParserC12128M38154.next();
                    iM55979 = C0946.m55979("ۧ᩷") ^ i4;
                    i = ((iM55979 ^ i5) * (-11651)) ^ (-883019316);
                    i2 = -304018915;
                    int i17 = i;
                    i7 = iM55979 ^ i2;
                    i6 = i17;
                    break;
                case 156139442:
                case 2131124360:
                    try {
                        c16820M38138 = C16820.m38138(bArr);
                        iM55979 = C0946.m55979("᩺۬") ^ i4;
                        i = ((iM55979 ^ i5) * 28761) ^ (-1818205138);
                        i2 = 753392505;
                    } catch (IOException unused) {
                        iM55979 = (C0873.m55680("ۖܽ") ^ i4) * 53;
                        i = ((iM55979 ^ i5) * 30329) ^ (-1886142819);
                        i2 = -189351572;
                    }
                    int i18 = i;
                    i7 = iM55979 ^ i2;
                    i6 = i18;
                    break;
                case 172856292:
                case 537798327:
                    C1044.m56286();
                    if (C1124.m56367() >= 0) {
                        int iM559713 = (C0946.m55979("ܺۢ") + i5) * 67;
                        i6 = ((iM559713 ^ i4) * 20279) ^ 1472010538;
                        i7 = iM559713 ^ 1345681487;
                    } else {
                        iM55979 = C0873.m55680("ۗۚ") ^ i4;
                        i = ((iM55979 ^ i5) * (-13373)) ^ (-4855826);
                        i2 = 1088373005;
                        int i19 = i;
                        i7 = iM55979 ^ i2;
                        i6 = i19;
                    }
                    break;
                case 183500479:
                case 322732533:
                    if (!C0927.f81875) {
                        iM55979 = (i5 - C0946.m55979("۬᩵")) * 9;
                        i = ((iM55979 ^ i4) * 23733) ^ (-832935695);
                        i2 = -1683466052;
                        int i110 = i;
                        i7 = iM55979 ^ i2;
                        i6 = i110;
                    } else {
                        int iM559714 = C0946.m55979("ۗۜ") ^ i4;
                        i7 = (-302754552) ^ iM559714;
                        i6 = ((iM559714 ^ i5) * 7489) ^ 239071700;
                        c18895 = null;
                    }
                    break;
                case 184189888:
                case 1120415271:
                    c6634 = new C6634();
                    iM55979 = (i4 - C0873.m55680("᩵ۖ")) * (-69);
                    i = ((iM55979 ^ i5) * 11913) ^ 1325063242;
                    i2 = 581632854;
                    int i111 = i;
                    i7 = iM55979 ^ i2;
                    i6 = i111;
                    break;
                case 520536475:
                case 2050094743:
                    if (C1071.f81975 <= 0) {
                        iM55979 = (i5 - C0873.m55680("᩻ۗ")) * (-5);
                        i = ((iM55979 ^ i4) * 19841) ^ 132929706;
                        i2 = 993507443;
                    } else {
                        iM55979 = (C0873.m55680("ܶ֡") ^ i4) * (-35);
                        i = ((iM55979 ^ i5) * 2843) ^ (-1891411727);
                        i2 = -1105519749;
                    }
                    int i112 = i;
                    i7 = iM55979 ^ i2;
                    i6 = i112;
                    break;
                case 556739741:
                case 1208786665:
                    if (RunnableC0871.f81839 < 0) {
                        c18895 = new C18895(0);
                        if (C0894.f81854 >= 0) {
                            iM55979 = (i4 - C0873.m55680("۫۟")) * 89;
                            i = ((iM55979 ^ i5) * (-18361)) ^ 1541728162;
                            i2 = 1645845;
                        } else {
                            iM55979 = C0873.m55680("᩺ܰ") ^ i5;
                            i = ((iM55979 ^ i4) * 17151) ^ 80442844;
                            i2 = -1218632913;
                        }
                        int i113 = i;
                        i7 = iM55979 ^ i2;
                        i6 = i113;
                    } else {
                        int iM559715 = C0946.m55979("ۗۜ") ^ i4;
                        i7 = (-302754552) ^ iM559715;
                        i6 = ((iM559715 ^ i5) * 7489) ^ 239071700;
                        c18895 = null;
                    }
                    break;
                case 585592533:
                case 890821484:
                    c8838 = null;
                    iM55979 = (i5 - C0873.m55680("ܿܽ")) * (-115);
                    i = ((iM55979 ^ i4) * 26441) ^ (-1202468793);
                    i2 = 136009866;
                    int i114 = i;
                    i7 = iM55979 ^ i2;
                    i6 = i114;
                    break;
                case 620331308:
                case 1886265152:
                    c8837.f23983 = str;
                    if (C1229.f82066 < 0) {
                        iM55979 = (C0946.m55979("۟۬") ^ i5) * (-121);
                        i = ((iM55979 ^ i4) * (-14777)) ^ 1406029335;
                        i2 = -1432672486;
                        int i115 = i;
                        i7 = iM55979 ^ i2;
                        i6 = i115;
                    } else {
                        int iM559716 = (C0946.m55979("ܺۢ") + i5) * 67;
                        i6 = ((iM559716 ^ i4) * 20279) ^ 1472010538;
                        i7 = iM559716 ^ 1345681487;
                    }
                    break;
                case 785542375:
                case 823919499:
                    m20403(next, xmlResourceParserC12128M38154, c6634);
                    iM55979 = C0946.m55979("ܶۛ") ^ i5;
                    i = ((iM55979 ^ i4) * (-12115)) ^ 2093993121;
                    i2 = 717576464;
                    int i116 = i;
                    i7 = iM55979 ^ i2;
                    i6 = i116;
                    break;
                case 1060610281:
                case 1244233792:
                    if (C0955.f81898) {
                        iM55979 = (i4 - C0873.m55680("۫۟")) * 89;
                        i = ((iM55979 ^ i5) * (-18361)) ^ 1541728162;
                        i2 = 1645845;
                    } else {
                        iM55979 = C0946.m55979("۫ܰ") ^ i4;
                        i = ((iM55979 ^ i5) * 8473) ^ 1611458754;
                        i2 = 2129449363;
                    }
                    int i117 = i;
                    i7 = iM55979 ^ i2;
                    i6 = i117;
                    break;
                case 1215334729:
                case 1292774758:
                    c8837 = new C8837();
                    if (C0882.f81846) {
                        iM55979 = C0873.m55680("ۗۚ") ^ i4;
                        i = ((iM55979 ^ i5) * (-13373)) ^ (-4855826);
                        i2 = 1088373005;
                    } else {
                        iM55979 = (C0873.m55680("ᩳᩳ") + i5) * (-15);
                        i = ((iM55979 ^ i4) * 11681) ^ 1354588503;
                        i2 = 853259702;
                    }
                    int i118 = i;
                    i7 = iM55979 ^ i2;
                    i6 = i118;
                    break;
                default:
                    try {
                        xmlResourceParserC12128M38154 = c16820M38138.m38154();
                        iM55979 = C0946.m55979("ܶۛ") ^ i5;
                        i = ((iM55979 ^ i4) * (-12115)) ^ 2093993121;
                        i2 = 717576464;
                    } catch (Exception unused2) {
                        iM55979 = (i5 - C0946.m55979("᩹ᩴ")) * (-103);
                        i = ((iM55979 ^ i4) * 20747) ^ (-1071275688);
                        i2 = 2079735126;
                    }
                    int i119 = i;
                    i7 = iM55979 ^ i2;
                    i6 = i119;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x053e A[PHI: r29
      0x053e: PHI (r29v111 l.ۛۢᩴ) = 
      (r29v78 l.ۛۢᩴ)
      (r29v79 l.ۛۢᩴ)
      (r29v84 l.ۛۢᩴ)
      (r29v85 l.ۛۢᩴ)
      (r29v86 l.ۛۢᩴ)
      (r29v87 l.ۛۢᩴ)
      (r29v88 l.ۛۢᩴ)
      (r29v90 l.ۛۢᩴ)
      (r29v94 l.ۛۢᩴ)
      (r29v96 l.ۛۢᩴ)
      (r29v112 l.ۛۢᩴ)
     binds: [B:108:0x0527, B:105:0x050e, B:91:0x047a, B:85:0x0439, B:82:0x0420, B:74:0x03c7, B:71:0x03a4, B:63:0x0330, B:46:0x0256, B:43:0x0248, B:9:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:123:0x05ef A[PHI: r8 r15 r17 r29
      0x05ef: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:121:0x05d9, B:112:0x0559] A[DONT_GENERATE, DONT_INLINE]
      0x05ef: PHI (r15v4 int) = (r15v3 int), (r15v2 int) binds: [B:121:0x05d9, B:112:0x0559] A[DONT_GENERATE, DONT_INLINE]
      0x05ef: PHI (r17v4 java.lang.Object) = (r17v3 java.lang.Object), (r17v2 java.lang.Object) binds: [B:121:0x05d9, B:112:0x0559] A[DONT_GENERATE, DONT_INLINE]
      0x05ef: PHI (r29v76 l.ۛۢᩴ) = (r29v74 l.ۛۢᩴ), (r29v77 l.ۛۢᩴ) binds: [B:121:0x05d9, B:112:0x0559] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:216:0x0abf A[PHI: r5 r6 r9 r16 r19 r20 r23 r29
      0x0abf: PHI (r5v44 int) = (r5v39 int), (r5v46 int) binds: [B:214:0x0aa5, B:195:0x092d] A[DONT_GENERATE, DONT_INLINE]
      0x0abf: PHI (r6v58 int) = (r6v54 int), (r6v60 int) binds: [B:214:0x0aa5, B:195:0x092d] A[DONT_GENERATE, DONT_INLINE]
      0x0abf: PHI (r9v4 ??) = (r9v3 ??), (r9v23 ??) binds: [B:214:0x0aa5, B:195:0x092d] A[DONT_GENERATE, DONT_INLINE]
      0x0abf: PHI (r16v4 int) = (r16v3 int), (r16v2 int) binds: [B:214:0x0aa5, B:195:0x092d] A[DONT_GENERATE, DONT_INLINE]
      0x0abf: PHI (r19v4 java.lang.String) = (r19v3 java.lang.String), (r19v2 java.lang.String) binds: [B:214:0x0aa5, B:195:0x092d] A[DONT_GENERATE, DONT_INLINE]
      0x0abf: PHI (r20v22 java.lang.String) = (r20v10 java.lang.String), (r20v24 java.lang.String) binds: [B:214:0x0aa5, B:195:0x092d] A[DONT_GENERATE, DONT_INLINE]
      0x0abf: PHI (r23v33 java.lang.String) = (r23v28 java.lang.String), (r23v35 java.lang.String) binds: [B:214:0x0aa5, B:195:0x092d] A[DONT_GENERATE, DONT_INLINE]
      0x0abf: PHI (r29v61 java.lang.String) = (r29v56 java.lang.String), (r29v63 java.lang.String) binds: [B:214:0x0aa5, B:195:0x092d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x02c5 A[PHI: r11 r29
      0x02c5: PHI (r11v4 java.lang.String) = (r11v3 java.lang.String), (r11v2 java.lang.String) binds: [B:53:0x02ac, B:43:0x0248] A[DONT_GENERATE, DONT_INLINE]
      0x02c5: PHI (r29v95 l.ۛۢᩴ) = (r29v92 l.ۛۢᩴ), (r29v96 l.ۛۢᩴ) binds: [B:53:0x02ac, B:43:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0373 A[PHI: r10 r29
      0x0373: PHI (r10v4 java.lang.String) = 
      (r10v3 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
     binds: [B:66:0x035c, B:57:0x02e9, B:49:0x027c, B:40:0x021f, B:34:0x01d7, B:30:0x019b, B:27:0x0172, B:24:0x014c, B:21:0x0124, B:18:0x00fc, B:15:0x00d4, B:12:0x00ae, B:9:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x0373: PHI (r29v106 l.ۛۢᩴ) = 
      (r29v89 l.ۛۢᩴ)
      (r29v91 l.ۛۢᩴ)
      (r29v93 l.ۛۢᩴ)
      (r29v97 l.ۛۢᩴ)
      (r29v98 l.ۛۢᩴ)
      (r29v99 l.ۛۢᩴ)
      (r29v100 l.ۛۢᩴ)
      (r29v101 l.ۛۢᩴ)
      (r29v102 l.ۛۢᩴ)
      (r29v103 l.ۛۢᩴ)
      (r29v104 l.ۛۢᩴ)
      (r29v105 l.ۛۢᩴ)
      (r29v112 l.ۛۢᩴ)
     binds: [B:66:0x035c, B:57:0x02e9, B:49:0x027c, B:40:0x021f, B:34:0x01d7, B:30:0x019b, B:27:0x0172, B:24:0x014c, B:21:0x0124, B:18:0x00fc, B:15:0x00d4, B:12:0x00ae, B:9:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:144:0x06f4. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: ֫ */
    public static void m20403(int i, XmlResourceParserC12128 xmlResourceParserC12128, final C6634 c6634) {
        int iM55680;
        int i2;
        int i3;
        int iM55979;
        int i4;
        String str;
        int iM559710;
        int i5;
        int i6;
        InterfaceC8054 interfaceC8054;
        int iM559711;
        int i7;
        int i8;
        int iM559712;
        int i9;
        int i10;
        int iM55681;
        int i11;
        int i12;
        ?? r9;
        int iM55682;
        int i13;
        int i14;
        InterfaceC8054 interfaceC8055;
        XmlResourceParserC12128 xmlResourceParserC12129 = xmlResourceParserC12128;
        int i15 = 0;
        boolean z = false;
        int i16 = -93437694;
        int i17 = C1229.f82066;
        int i18 = C0877.f81843;
        int iM559713 = C0946.m55979("ܰ᩸") ^ i17;
        int i19 = ((iM559713 ^ i18) * (-12511)) ^ (-1473296073);
        int i20 = iM559713 ^ (-377589143);
        C24930 c24930 = null;
        String attributeName = null;
        String strM55822 = null;
        String strM55929 = null;
        String attributeValue = null;
        InterfaceC8054 interfaceC8056 = null;
        int iM28037 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int attributeCount = 0;
        int i27 = 0;
        String prefix = null;
        String str2 = null;
        Object obj = null;
        ?? r10 = 0;
        Object obj2 = null;
        int i28 = 0;
        while (true) {
            i16 = i20 ^ (i19 & (((i16 ^ i18) * 15803) >> 31));
            switch (i16) {
                case -2060358209:
                case 102862191:
                    c24930.f79617 = r10;
                    i27 = i27;
                    attributeName = attributeName;
                    iM55979 = (i18 - C0873.m55680("᩵ۜ")) * 81;
                    i19 = ((iM55979 ^ i17) * 11073) ^ (-815762842);
                    i4 = 1281695252;
                    i3 = iM55979 ^ i4;
                    i27 = i27;
                    String str3 = attributeName;
                    i20 = i3;
                    attributeName = str3;
                    break;
                case -2031670940:
                case -459556304:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM55822 = strM55822;
                    if (!C0906.m55806(str2, C1028.m56235(f82036, 1, 8, i21))) {
                        i25 = i25;
                        iM559712 = (C0946.m55979("ܳܳ") ^ i18) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        str = str2;
                        i9 = ((iM559712 ^ i17) * 5699) ^ 157243267;
                        i10 = 897507926;
                        r10 = r10;
                        int i29 = iM559712 ^ i10;
                        i19 = i9;
                        i27 = i27;
                        xmlResourceParserC12129 = xmlResourceParserC12128;
                        String str4 = attributeName;
                        i20 = i29;
                        attributeName = str4;
                        String str5 = str;
                        i25 = i25;
                        strM55822 = strM55822;
                        str2 = str5;
                    } else {
                        iM55680 = (i17 - C0873.m55680("۫֡")) * (-51);
                        i19 = ((iM55680 ^ i18) * 22093) ^ (-332403916);
                        i2 = -2106312819;
                        i3 = iM55680 ^ i2;
                        i27 = i27;
                        strM55822 = strM55822;
                        str2 = str2;
                        xmlResourceParserC12129 = xmlResourceParserC12128;
                        String str6 = attributeName;
                        i20 = i3;
                        attributeName = str6;
                    }
                    break;
                case -1925236330:
                case 1613344779:
                    interfaceC8054 = interfaceC8056;
                    if (C0863.m55630(strM55929, C0873.m55689(f82036, 250, 4, i21))) {
                        iM559711 = (C0873.m55680("ۙۙ") ^ i17) * 53;
                        i7 = ((iM559711 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM559711 = C0946.m55979("ۗۧ") ^ i17;
                        i7 = ((iM559711 ^ i18) * 32409) ^ (-846685559);
                        i8 = 751990392;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case -1868056784:
                case 589979971:
                    interfaceC8054 = interfaceC8056;
                    if (C11345.m26283(xmlResourceParserC12129.getAttributeValue(i23))) {
                        iM559711 = C0873.m55680("ۤۙ") ^ i18;
                        i7 = ((iM559711 ^ i17) * (-17617)) ^ 998923974;
                        i8 = 1984360154;
                    } else {
                        iM559711 = C0946.m55979("ܿ۟") ^ i18;
                        i7 = ((iM559711 ^ i17) * (-20687)) ^ (-976860491);
                        i8 = 317388440;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case -1790529514:
                case 1806724371:
                    i26 = -1;
                    strM55822 = strM55822;
                    iM55680 = C0873.m55680("۬֫") ^ i17;
                    i19 = ((iM55680 ^ i18) * 28095) ^ (-365593897);
                    i2 = 396391031;
                    i3 = iM55680 ^ i2;
                    i27 = i27;
                    strM55822 = strM55822;
                    str2 = str2;
                    xmlResourceParserC12129 = xmlResourceParserC12128;
                    String str7 = attributeName;
                    i20 = i3;
                    attributeName = str7;
                    break;
                case -1779308321:
                case 1249131431:
                    interfaceC8054 = interfaceC8056;
                    if (attributeValue.matches(ViewOnClickListenerC0939.m55947(f82036, 171, 25, i21))) {
                        iM559711 = C0946.m55979("ܿ۟") ^ i18;
                        i7 = ((iM559711 ^ i17) * (-20687)) ^ (-976860491);
                        i8 = 317388440;
                    } else {
                        iM559711 = C0873.m55680("ۤܿ") ^ i17;
                        i7 = ((iM559711 ^ i18) * (-3701)) ^ (-1772344843);
                        i8 = -1748067895;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case -1770068331:
                case -25212033:
                    interfaceC8054 = interfaceC8056;
                    attributeValue = xmlResourceParserC12129.getAttributeValue(i23);
                    if (C0898.m55799(attributeName, C0946.m55986(f82036, 162, 5, i21))) {
                        iM559711 = (C0873.m55680("ܽܳ") ^ i17) * 87;
                        i7 = ((iM559711 ^ i18) * (-19387)) ^ (-2040149638);
                        i8 = -311804456;
                    } else {
                        iM559711 = C0873.m55680("ۤܿ") ^ i17;
                        i7 = ((iM559711 ^ i18) * (-3701)) ^ (-1772344843);
                        i8 = -1748067895;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case -1760453705:
                case -555878520:
                    String str8 = attributeName;
                    String str9 = str2;
                    String str10 = strM55822;
                    interfaceC8056 = new InterfaceC8054() { // from class: l.ܳܰܽ
                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final /* bridge */ /* synthetic */ void m45213n(Object obj3) {
                            mo18722((Integer) obj3);
                        }

                        @Override // p067l.InterfaceC8054
                        /* JADX INFO: renamed from: ܽ */
                        public final /* synthetic */ void mo18722(Integer num) {
                            C12078.m27664((InterfaceC8054) this, num);
                        }

                        public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                            return C12078.m27663((InterfaceC8054) this, intConsumer);
                        }

                        public final Consumer andThen(Consumer consumer) {
                            return C24719.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.IntConsumer
                        public final void accept(int i30) {
                            C6634 c6635 = null;
                            Object obj3 = null;
                            Object c24931 = null;
                            int i31 = 218260276;
                            int i32 = C0863.f81833;
                            int i33 = C1071.f81975;
                            int iM55683 = C0873.m55680("֡ۙ") ^ i33;
                            int i34 = ((iM55683 ^ i32) * (-7735)) ^ (-1951939897);
                            int i35 = 213138896;
                            while (true) {
                                i31 = ((((i31 ^ i32) * (-17595)) >> 31) & i34) ^ (iM55683 ^ i35);
                                switch (i31) {
                                    case -1974038208:
                                    case -514870348:
                                        if (C0946.f81894 != 0) {
                                            iM55683 = C0946.m55979("֡ۛ") ^ i33;
                                            i34 = ((iM55683 ^ i32) * (-13091)) ^ 4892428;
                                            i35 = 208359721;
                                        } else {
                                            iM55683 = C0873.m55680("ۙ᩺") ^ i33;
                                            i34 = ((iM55683 ^ i32) * 22505) ^ 1759563019;
                                            i35 = 728901990;
                                        }
                                        break;
                                    case -1716662866:
                                    case 705648200:
                                        if (C0854.f81826 != 0) {
                                            iM55683 = C0946.m55979("֡ۛ") ^ i33;
                                            i34 = ((iM55683 ^ i32) * (-13091)) ^ 4892428;
                                            i35 = 208359721;
                                        } else {
                                            iM55683 = (C0946.m55979("ۛ᩶") + i33) * (-47);
                                            i34 = ((iM55683 ^ i32) * 16513) ^ (-1007900496);
                                            i35 = -1298707436;
                                        }
                                        break;
                                    case -1683540868:
                                    case 830001664:
                                        if (C1003.f81929 <= 0) {
                                            iM55683 = (C0873.m55680("֫۬") ^ i32) * 89;
                                            i34 = ((iM55683 ^ i33) * 5045) ^ 1842322909;
                                            i35 = -781770950;
                                        } else {
                                            iM55683 = (C0873.m55680("ܶܳ") ^ i32) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i34 = ((iM55683 ^ i33) * (-11917)) ^ 904076789;
                                            i35 = -1471112794;
                                        }
                                        break;
                                    case -1470841254:
                                    case -1261612453:
                                        if (C0882.f81846) {
                                            iM55683 = C0946.m55979("֡ۛ") ^ i33;
                                            i34 = ((iM55683 ^ i32) * (-13091)) ^ 4892428;
                                            i35 = 208359721;
                                        } else {
                                            iM55683 = C0873.m55680("᩵۟") ^ i33;
                                            i34 = ((iM55683 ^ i32) * (-2455)) ^ 1830517306;
                                            i35 = -642900498;
                                        }
                                        break;
                                    case -1469510544:
                                    case 718289587:
                                        if (!AbstractC0942.m55971()) {
                                            iM55683 = (C0873.m55680("֫۬") ^ i32) * 89;
                                            i34 = ((iM55683 ^ i33) * 5045) ^ 1842322909;
                                            i35 = -781770950;
                                        } else {
                                            iM55683 = C0946.m55979("ۛ۫") ^ i32;
                                            i34 = ((iM55683 ^ i33) * (-4259)) ^ 1440378863;
                                            i35 = 565896680;
                                        }
                                        break;
                                    case -1429663579:
                                    case 1371633343:
                                        if (RunnableC1014.f81941 <= 0) {
                                            iM55683 = (C0873.m55680("֫۬") ^ i32) * 89;
                                            i34 = ((iM55683 ^ i33) * 5045) ^ 1842322909;
                                            i35 = -781770950;
                                        } else {
                                            iM55683 = (i32 - C0946.m55979("᩷ܳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i34 = ((iM55683 ^ i33) * 8749) ^ 576164062;
                                            i35 = -1715331169;
                                        }
                                        break;
                                    case -951647321:
                                    case 2070903706:
                                        if (C0989.f81920 >= 0) {
                                            iM55683 = C0946.m55979("ۛ۫") ^ i32;
                                            i34 = ((iM55683 ^ i33) * (-4259)) ^ 1440378863;
                                            i35 = 565896680;
                                        } else {
                                            iM55683 = (C0946.m55979("ܿܿ") ^ i33) * 19;
                                            i34 = ((iM55683 ^ i32) * (-18143)) ^ (-1381479797);
                                            i35 = -650371055;
                                        }
                                        break;
                                    case -683135352:
                                    case 123688325:
                                        if (C1071.f81975 <= 0) {
                                            iM55683 = C0946.m55979("֡ۛ") ^ i33;
                                            i34 = ((iM55683 ^ i32) * (-13091)) ^ 4892428;
                                            i35 = 208359721;
                                        } else {
                                            iM55683 = C0873.m55680("᩸۟") ^ i33;
                                            i34 = ((iM55683 ^ i32) * (-2807)) ^ (-1222018533);
                                            i35 = 234197271;
                                        }
                                        break;
                                    case -641271459:
                                    case -15271900:
                                        if (C0906.f81862 >= 0) {
                                            iM55683 = (C0873.m55680("֫۬") ^ i32) * 89;
                                            i34 = ((iM55683 ^ i33) * 5045) ^ 1842322909;
                                            i35 = -781770950;
                                        } else {
                                            iM55683 = C0946.m55979("ܳܿ") ^ i32;
                                            i34 = ((iM55683 ^ i33) * (-6043)) ^ (-633345972);
                                            i35 = -811365403;
                                        }
                                        break;
                                    case -480021642:
                                    case -182290923:
                                        ((C24930) c24931).f79617 = true;
                                        iM55683 = (i32 - C0946.m55979("ܰۘ")) * 39;
                                        i34 = ((iM55683 ^ i33) * 13635) ^ (-2088743483);
                                        i35 = -137979634;
                                        break;
                                    case -366653975:
                                    case 1014145409:
                                        break;
                                    case -359699299:
                                    case 407506947:
                                        c24931 = new C24930(i30);
                                        c6635.mo4686(i30, c24931);
                                        iM55683 = C0946.m55979("ܺۜ") ^ i33;
                                        i34 = ((iM55683 ^ i32) * (-3699)) ^ (-1923235804);
                                        i35 = -744927689;
                                        break;
                                    case -70680906:
                                    case 1427129245:
                                        if (RunnableC1014.m56177()) {
                                            iM55683 = C0873.m55680("֡ۗ") ^ i32;
                                            i34 = ((iM55683 ^ i33) * 13819) ^ (-605671943);
                                            i35 = -106674717;
                                        } else {
                                            iM55683 = (C0873.m55680("֫۬") ^ i32) * 89;
                                            i34 = ((iM55683 ^ i33) * 5045) ^ 1842322909;
                                            i35 = -781770950;
                                        }
                                        break;
                                    case 77838205:
                                    case 726496432:
                                        if (C0866.f81837 >= 0) {
                                            iM55683 = C0946.m55979("֡ۛ") ^ i33;
                                            i34 = ((iM55683 ^ i32) * (-13091)) ^ 4892428;
                                            i35 = 208359721;
                                        } else {
                                            iM55683 = (C0873.m55680("ܰۙ") ^ i32) * (-81);
                                            i34 = ((iM55683 ^ i33) * 30725) ^ (-1323509245);
                                            i35 = 1194153753;
                                        }
                                        break;
                                    case 231283047:
                                    case 1801748332:
                                        if (RunnableC1014.f81941 <= 0) {
                                            iM55683 = C0946.m55979("ۛ۫") ^ i32;
                                            i34 = ((iM55683 ^ i33) * (-4259)) ^ 1440378863;
                                            i35 = 565896680;
                                        } else {
                                            iM55683 = (i33 - C0946.m55979("ܳۨ")) * 81;
                                            i34 = ((iM55683 ^ i32) * 13593) ^ (-18386954);
                                            i35 = -628123033;
                                        }
                                        break;
                                    case 587005755:
                                    case 961641881:
                                        C1044.m56286();
                                        C1025.m56230();
                                        break;
                                    case 695231835:
                                    case 1833623085:
                                        if (c6635.mo4793(i30)) {
                                            c24931 = obj3;
                                            iM55683 = C0946.m55979("ܺۜ") ^ i33;
                                            i34 = ((iM55683 ^ i32) * (-3699)) ^ (-1923235804);
                                            i35 = -744927689;
                                        } else {
                                            iM55683 = C0873.m55680("᩸᩺") ^ i33;
                                            i34 = ((iM55683 ^ i32) * (-7701)) ^ (-492199777);
                                            i35 = -868745889;
                                        }
                                        break;
                                    case 1360304368:
                                    case 2133167159:
                                        C0892.m55749();
                                        iM55683 = C0946.m55979("ۛ۫") ^ i32;
                                        i34 = ((iM55683 ^ i33) * (-4259)) ^ 1440378863;
                                        i35 = 565896680;
                                        break;
                                    case 1516049345:
                                    case 1886686138:
                                        if (i30 != -1) {
                                            iM55683 = (C0946.m55979("ۜ᩵") ^ i33) * 51;
                                            i34 = ((iM55683 ^ i32) * 12829) ^ 1518440636;
                                            i35 = -923133573;
                                        } else {
                                            iM55683 = (i32 - C0946.m55979("ܰۘ")) * 39;
                                            i34 = ((iM55683 ^ i33) * 13635) ^ (-2088743483);
                                            i35 = -137979634;
                                        }
                                        break;
                                    case 1544852590:
                                    case 2142304064:
                                        c6635 = c6634;
                                        obj3 = c6635.get(i30);
                                        if (obj3 == null) {
                                            iM55683 = (C0873.m55680("ܳۜ") + i32) * (-17);
                                            i34 = ((iM55683 ^ i33) * (-27691)) ^ (-234639944);
                                            i35 = 891000955;
                                        } else {
                                            c24931 = obj3;
                                            iM55683 = C0946.m55979("ܺۜ") ^ i33;
                                            i34 = ((iM55683 ^ i32) * (-3699)) ^ (-1923235804);
                                            i35 = -744927689;
                                        }
                                        break;
                                    default:
                                        C1053.m56327();
                                        if (C0912.f81867 <= 0) {
                                            iM55683 = C0946.m55979("ۛ۫") ^ i32;
                                            i34 = ((iM55683 ^ i33) * (-4259)) ^ 1440378863;
                                            i35 = 565896680;
                                        } else {
                                            iM55683 = C0873.m55680("ۘۜ") ^ i32;
                                            i34 = ((iM55683 ^ i33) * 7293) ^ 448859894;
                                            i35 = 1241448693;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    i27 = 3;
                    if (i != 2) {
                        iM55681 = C0873.m55680("ۧ᩻") ^ i17;
                        i11 = ((iM55681 ^ i18) * 4369) ^ (-183306466);
                        i12 = -127165264;
                    } else {
                        iM55681 = C0873.m55680("ۧۧ") ^ i17;
                        i11 = ((iM55681 ^ i18) * 19535) ^ 1935534530;
                        i12 = 1645432737;
                    }
                    i19 = i11;
                    strM55822 = str10;
                    attributeName = str8;
                    i20 = iM55681 ^ i12;
                    str2 = str9;
                    i25 = 4;
                    xmlResourceParserC12129 = xmlResourceParserC12128;
                    break;
                case -1709807486:
                case -1106161130:
                    attributeCount = xmlResourceParserC12128.getAttributeCount();
                    i22 = xmlResourceParserC12129.f33903;
                    i23 = i28;
                    iM55979 = (i17 - C0873.m55680("ᩴۖ")) * 69;
                    i19 = ((iM55979 ^ i18) * (-843)) ^ 362872438;
                    i4 = -1360697700;
                    i3 = iM55979 ^ i4;
                    i27 = i27;
                    String str11 = attributeName;
                    i20 = i3;
                    attributeName = str11;
                    break;
                case -1666905339:
                case -335567350:
                    interfaceC8054 = interfaceC8056;
                    if (!c24930.f79617) {
                        iM559711 = (C0946.m55979("ᩴ᩶") ^ i17) * (-7);
                        i7 = ((iM559711 ^ i18) * 32401) ^ (-434598064);
                        i8 = 611754226;
                        interfaceC8055 = interfaceC8054;
                        i20 = iM559711 ^ i8;
                        i19 = i7;
                        interfaceC8056 = interfaceC8055;
                    } else {
                        interfaceC8056 = interfaceC8054;
                        i27 = i27;
                        attributeName = attributeName;
                        iM55979 = (i18 - C0873.m55680("᩵ۜ")) * 81;
                        i19 = ((iM55979 ^ i17) * 11073) ^ (-815762842);
                        i4 = 1281695252;
                        i3 = iM55979 ^ i4;
                        i27 = i27;
                        String str12 = attributeName;
                        i20 = i3;
                        attributeName = str12;
                    }
                    break;
                case -1658689073:
                case 1298071004:
                    interfaceC8054 = interfaceC8056;
                    if (C0863.m55630(strM55929, C0955.m56029(f82036, Scalar25519.TARGET_LENGTH, 7, i21))) {
                        iM559711 = (C0873.m55680("ۙۙ") ^ i17) * 53;
                        i7 = ((iM559711 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM559711 = C0946.m55979("ܿ۟") ^ i18;
                        i7 = ((iM559711 ^ i17) * (-20687)) ^ (-976860491);
                        i8 = 317388440;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case -1619418141:
                case 1674730566:
                    String str13 = str2;
                    i27 = i27;
                    strM55822 = strM55822;
                    i25 = i25;
                    if (i == i25) {
                        attributeName = attributeName;
                        iM559712 = (C0873.m55680("֫ᩴ") ^ i18) * 109;
                        str = str13;
                        i9 = ((iM559712 ^ i17) * 2889) ^ 888363178;
                        i10 = -1969543950;
                        r10 = r10;
                        int i210 = iM559712 ^ i10;
                        i19 = i9;
                        i27 = i27;
                        xmlResourceParserC12129 = xmlResourceParserC12128;
                        String str14 = attributeName;
                        i20 = i210;
                        attributeName = str14;
                        String str15 = str;
                        i25 = i25;
                        strM55822 = strM55822;
                        str2 = str15;
                    } else {
                        int iM559714 = (C0946.m55979("֫᩵") ^ i18) * 3;
                        i19 = ((iM559714 ^ i17) * 7987) ^ 970219952;
                        i27 = i27;
                        attributeName = attributeName;
                        i20 = iM559714 ^ (-499245046);
                        i25 = i25;
                        strM55822 = strM55822;
                        str2 = str13;
                        xmlResourceParserC12129 = xmlResourceParserC12128;
                    }
                    break;
                case -1606579880:
                case 1722682419:
                    interfaceC8054 = interfaceC8056;
                    if (C0906.m55806(attributeName, C0949.m56016(f82036, 144, 13, i21))) {
                        iM559711 = C0946.m55979("ܿ۟") ^ i18;
                        i7 = ((iM559711 ^ i17) * (-20687)) ^ (-976860491);
                        i8 = 317388440;
                    } else {
                        iM559711 = (i18 - C0873.m55680("֨ܰ")) * (-35);
                        i7 = ((iM559711 ^ i17) * (-18675)) ^ 998137156;
                        i8 = 1966549470;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case -1603156979:
                case 616172388:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM55822 = strM55822;
                    if (!C0906.m55806(str2, C0967.m56077(f82036, 9, 8, i21))) {
                        i25 = i25;
                        iM559712 = (C0946.m55979("ܳܳ") ^ i18) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        str = str2;
                        i9 = ((iM559712 ^ i17) * 5699) ^ 157243267;
                        i10 = 897507926;
                        r10 = r10;
                        int i211 = iM559712 ^ i10;
                        i19 = i9;
                        i27 = i27;
                        xmlResourceParserC12129 = xmlResourceParserC12128;
                        String str16 = attributeName;
                        i20 = i211;
                        attributeName = str16;
                        String str17 = str;
                        i25 = i25;
                        strM55822 = strM55822;
                        str2 = str17;
                    } else {
                        iM55680 = C0873.m55680("ۜᩳ") ^ i17;
                        i19 = ((iM55680 ^ i18) * 21773) ^ (-957957042);
                        i2 = -1212545501;
                        i3 = iM55680 ^ i2;
                        i27 = i27;
                        strM55822 = strM55822;
                        str2 = str2;
                        xmlResourceParserC12129 = xmlResourceParserC12128;
                        String str18 = attributeName;
                        i20 = i3;
                        attributeName = str18;
                    }
                    break;
                case -1581129282:
                case -1289155521:
                    interfaceC8054 = interfaceC8056;
                    c24930.f79614.add(i24);
                    if (c24930.f79616 != null) {
                        interfaceC8056 = interfaceC8054;
                        i27 = i27;
                        attributeName = attributeName;
                        iM55979 = (i18 - C0873.m55680("᩵ۜ")) * 81;
                        i19 = ((iM55979 ^ i17) * 11073) ^ (-815762842);
                        i4 = 1281695252;
                        i3 = iM55979 ^ i4;
                        i27 = i27;
                        String str19 = attributeName;
                        i20 = i3;
                        attributeName = str19;
                    } else {
                        iM559711 = C0873.m55680("ܶۢ") ^ i18;
                        i7 = ((iM559711 ^ i17) * (-28939)) ^ (-255712316);
                        i8 = -156570892;
                        interfaceC8055 = interfaceC8054;
                        i20 = iM559711 ^ i8;
                        i19 = i7;
                        interfaceC8056 = interfaceC8055;
                    }
                    break;
                case -1575922196:
                case 1509371853:
                    interfaceC8054 = interfaceC8056;
                    if (C0845.m55582(strM55929, C1044.m56276(f82036, 235, 7, i21))) {
                        iM559711 = (C0873.m55680("ۙۙ") ^ i17) * 53;
                        i7 = ((iM559711 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM559711 = (C0873.m55680("᩻᩻") ^ i17) * (-3);
                        i7 = ((iM559711 ^ i18) * 13101) ^ (-1860019671);
                        i8 = -655287349;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case -1504679153:
                case -1349478269:
                    attributeName = attributeName;
                    i27 = i27;
                    switch (i26) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            iM55979 = C0946.m55979("۬᩺") ^ i18;
                            i19 = ((iM55979 ^ i17) * 2387) ^ 1553013821;
                            i4 = -1183488456;
                            i3 = iM55979 ^ i4;
                            i27 = i27;
                            String str110 = attributeName;
                            i20 = i3;
                            attributeName = str110;
                            break;
                        default:
                            String str20 = str2;
                            strM55822 = strM55822;
                            i25 = i25;
                            str = str20;
                            iM559712 = (C0946.m55979("ۨܽ") ^ i17) * (-119);
                            i9 = ((iM559712 ^ i18) * (-23169)) ^ 468356565;
                            i10 = -2007252300;
                            r10 = r10;
                            int i212 = iM559712 ^ i10;
                            i19 = i9;
                            i27 = i27;
                            xmlResourceParserC12129 = xmlResourceParserC12128;
                            String str111 = attributeName;
                            i20 = i212;
                            attributeName = str111;
                            String str112 = str;
                            i25 = i25;
                            strM55822 = strM55822;
                            str2 = str112;
                            break;
                    }
                    break;
                case -1420139801:
                case 1347420261:
                    c24930.f79616 = attributeName;
                    i27 = i27;
                    attributeName = attributeName;
                    iM55979 = (i18 - C0873.m55680("᩵ۜ")) * 81;
                    i19 = ((iM55979 ^ i17) * 11073) ^ (-815762842);
                    i4 = 1281695252;
                    i3 = iM55979 ^ i4;
                    i27 = i27;
                    String str113 = attributeName;
                    i20 = i3;
                    attributeName = str113;
                    break;
                case -1404370714:
                case -1034294318:
                    str = str2;
                    i21 = 30114;
                    iM559712 = C0873.m55680("۟ۗ") ^ i18;
                    i9 = ((iM559712 ^ i17) * (-29145)) ^ (-270817295);
                    i10 = 425613938;
                    r10 = r10;
                    int i213 = iM559712 ^ i10;
                    i19 = i9;
                    i27 = i27;
                    xmlResourceParserC12129 = xmlResourceParserC12128;
                    String str114 = attributeName;
                    i20 = i213;
                    attributeName = str114;
                    String str115 = str;
                    i25 = i25;
                    strM55822 = strM55822;
                    str2 = str115;
                    break;
                case -1375503405:
                case 1524465336:
                    interfaceC8054 = interfaceC8056;
                    strM55929 = RunnableC0938.m55929(attributeName);
                    if (C0863.m55630(strM55929, C0946.m55986(f82036, 139, 5, i21))) {
                        iM559711 = (C0873.m55680("ۙۙ") ^ i17) * 53;
                        i7 = ((iM559711 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM559711 = C0873.m55680("ۧۗ") ^ i18;
                        i7 = ((iM559711 ^ i17) * 19961) ^ (-1395154383);
                        i8 = -1343144175;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case -1372534828:
                case 325022258:
                    interfaceC8054 = interfaceC8056;
                    if (C11345.m26283(xmlResourceParserC12129.getAttributeValue(i23))) {
                        iM559711 = (i17 - C0873.m55680("᩵᩷")) * 13;
                        i7 = ((iM559711 ^ i18) * (-28267)) ^ 522769735;
                        i8 = 1406302425;
                    } else {
                        iM559711 = C0946.m55979("ܿ۟") ^ i18;
                        i7 = ((iM559711 ^ i17) * (-20687)) ^ (-976860491);
                        i8 = 317388440;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case -1346736465:
                case -569052645:
                    interfaceC8054 = interfaceC8056;
                    C24930 c24931 = new C24930(iM28037);
                    c6634.mo4686(iM28037, c24931);
                    obj = c24931;
                    iM559711 = C0873.m55680("ܰ֫") ^ i18;
                    i7 = ((iM559711 ^ i17) * 30757) ^ (-1558797455);
                    i8 = -724911051;
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case -1212721952:
                case -818716075:
                    i26 = 2;
                    strM55822 = strM55822;
                    iM55680 = C0873.m55680("۬֫") ^ i17;
                    i19 = ((iM55680 ^ i18) * 28095) ^ (-365593897);
                    i2 = 396391031;
                    i3 = iM55680 ^ i2;
                    i27 = i27;
                    strM55822 = strM55822;
                    str2 = str2;
                    xmlResourceParserC12129 = xmlResourceParserC12128;
                    String str116 = attributeName;
                    i20 = i3;
                    attributeName = str116;
                    break;
                case -1177039243:
                case 1248103394:
                    i23++;
                    iM55979 = (i17 - C0873.m55680("ᩴۖ")) * 69;
                    i19 = ((iM55979 ^ i18) * (-843)) ^ 362872438;
                    i4 = -1360697700;
                    i3 = iM55979 ^ i4;
                    i27 = i27;
                    String str117 = attributeName;
                    i20 = i3;
                    attributeName = str117;
                    break;
                case -1105920445:
                case -6915204:
                    interfaceC8056.accept(xmlResourceParserC12128.m28041());
                    interfaceC8056.accept(xmlResourceParserC12128.m28044());
                    break;
                case -1099055092:
                case 1781482560:
                    attributeName = attributeName;
                    i27 = i27;
                    str2 = str2;
                    if (!ViewOnClickListenerC0939.m55949(str2, C0866.m55652(f82036, 68, 7, i21))) {
                        strM55822 = strM55822;
                        i25 = i25;
                        iM559712 = (C0946.m55979("ܳܳ") ^ i18) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        str = str2;
                        i9 = ((iM559712 ^ i17) * 5699) ^ 157243267;
                        i10 = 897507926;
                        r10 = r10;
                        int i214 = iM559712 ^ i10;
                        i19 = i9;
                        i27 = i27;
                        xmlResourceParserC12129 = xmlResourceParserC12128;
                        String str118 = attributeName;
                        i20 = i214;
                        attributeName = str118;
                        String str119 = str;
                        i25 = i25;
                        strM55822 = strM55822;
                        str2 = str119;
                    } else {
                        int iM559715 = (i17 - C0946.m55979("᩹۫")) * (-47);
                        i19 = ((iM559715 ^ i18) * (-29375)) ^ (-592506904);
                        i3 = iM559715 ^ 179513206;
                        str2 = str2;
                        i27 = i27;
                        xmlResourceParserC12129 = xmlResourceParserC12128;
                        String str1110 = attributeName;
                        i20 = i3;
                        attributeName = str1110;
                    }
                    break;
                case -1052832490:
                case -485383166:
                    z = false;
                    iM55979 = C0873.m55680("ۙۡ") ^ i17;
                    i19 = ((iM55979 ^ i18) * 2881) ^ 1085684838;
                    i4 = 736524013;
                    i3 = iM55979 ^ i4;
                    i27 = i27;
                    String str1111 = attributeName;
                    i20 = i3;
                    attributeName = str1111;
                    break;
                case -1045175902:
                case -740076026:
                    attributeName = attributeName;
                    i27 = i27;
                    String str21 = str2;
                    strM55822 = strM55822;
                    i25 = i25;
                    str = str21;
                    interfaceC8056.accept(xmlResourceParserC12128.m28041());
                    interfaceC8056.accept(xmlResourceParserC12128.m28044());
                    prefix = xmlResourceParserC12128.getPrefix();
                    i28 = 0;
                    r9 = 1;
                    r10 = 1;
                    if (prefix != null) {
                        iM559712 = (C0946.m55979("ᩴۘ") + i18) * 119;
                        i9 = ((iM559712 ^ i17) * 20789) ^ 827682208;
                        i10 = 1553464799;
                    } else {
                        iM559712 = C0946.m55979("ۜܳ") ^ i18;
                        i9 = ((iM559712 ^ i17) * (-19301)) ^ 1489603415;
                        i10 = 1829617058;
                        r10 = r9;
                    }
                    int i215 = iM559712 ^ i10;
                    i19 = i9;
                    i27 = i27;
                    xmlResourceParserC12129 = xmlResourceParserC12128;
                    String str1112 = attributeName;
                    i20 = i215;
                    attributeName = str1112;
                    String str1113 = str;
                    i25 = i25;
                    strM55822 = strM55822;
                    str2 = str1113;
                    break;
                case -914424818:
                case 1800360158:
                    interfaceC8054 = interfaceC8056;
                    if (C0863.m55630(strM55929, C1929.m56558(f82036, 245, 5, i21))) {
                        iM559711 = (C0873.m55680("ۙۙ") ^ i17) * 53;
                        i7 = ((iM559711 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM559711 = (i18 - C0946.m55979("ܺ᩻")) * 19;
                        i7 = ((iM559711 ^ i17) * 20215) ^ 1770264840;
                        i8 = -270145377;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case -840919371:
                case 1131574264:
                    interfaceC8054 = interfaceC8056;
                    if (C0906.m55806(attributeName, C0898.m55792(f82036, 83, 25, i21))) {
                        iM559711 = C0946.m55979("ܿ۟") ^ i18;
                        i7 = ((iM559711 ^ i17) * (-20687)) ^ (-976860491);
                        i8 = 317388440;
                    } else {
                        iM559711 = C0946.m55979("ܰۘ") ^ i17;
                        i7 = ((iM559711 ^ i18) * 2559) ^ 501189016;
                        i8 = -1699657994;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case -646650544:
                case 1900303693:
                    interfaceC8054 = interfaceC8056;
                    c24930.f79616 = C1046.m56289(C0927.m55863(f82036, 209, 4, i21), attributeName);
                    interfaceC8056 = interfaceC8054;
                    i27 = i27;
                    attributeName = attributeName;
                    iM55979 = (i18 - C0873.m55680("᩵ۜ")) * 81;
                    i19 = ((iM55979 ^ i17) * 11073) ^ (-815762842);
                    i4 = 1281695252;
                    i3 = iM55979 ^ i4;
                    i27 = i27;
                    String str1114 = attributeName;
                    i20 = i3;
                    attributeName = str1114;
                    break;
                case -622522373:
                case 975383017:
                    interfaceC8054 = interfaceC8056;
                    if (C0845.m55582(strM55929, C1929.m56558(f82036, 196, 4, i21))) {
                        iM559711 = (C0873.m55680("ۙۙ") ^ i17) * 53;
                        i7 = ((iM559711 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM559711 = (C0873.m55680("ᩳۤ") ^ i17) * 65;
                        i7 = ((iM559711 ^ i18) * (-4487)) ^ 83719298;
                        i8 = 2116437201;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case -606015061:
                case 641630293:
                    interfaceC8054 = interfaceC8056;
                    if (C11345.m26283(xmlResourceParserC12129.getAttributeValue(i23))) {
                        iM559711 = C0873.m55680("ۗ᩹") ^ i18;
                        i7 = ((iM559711 ^ i17) * 19905) ^ (-1629054401);
                        i8 = 1761737227;
                    } else {
                        iM559711 = C0946.m55979("ܿ۟") ^ i18;
                        i7 = ((iM559711 ^ i17) * (-20687)) ^ (-976860491);
                        i8 = 317388440;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case -587320956:
                case 1126544281:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM55822 = strM55822;
                    if (!C0906.m55806(str2, C1053.m56325(f82036, 50, 18, i21))) {
                        i25 = i25;
                        iM559712 = (C0946.m55979("ܳܳ") ^ i18) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        str = str2;
                        i9 = ((iM559712 ^ i17) * 5699) ^ 157243267;
                        i10 = 897507926;
                        r10 = r10;
                        int i216 = iM559712 ^ i10;
                        i19 = i9;
                        i27 = i27;
                        xmlResourceParserC12129 = xmlResourceParserC12128;
                        String str1115 = attributeName;
                        i20 = i216;
                        attributeName = str1115;
                        String str1116 = str;
                        i25 = i25;
                        strM55822 = strM55822;
                        str2 = str1116;
                    } else {
                        iM55680 = C0873.m55680("᩻ܶ") ^ i18;
                        i19 = ((iM55680 ^ i17) * (-13583)) ^ 1239498667;
                        i2 = -1790825227;
                        i3 = iM55680 ^ i2;
                        i27 = i27;
                        strM55822 = strM55822;
                        str2 = str2;
                        xmlResourceParserC12129 = xmlResourceParserC12128;
                        String str1117 = attributeName;
                        i20 = i3;
                        attributeName = str1117;
                    }
                    break;
                case -482182040:
                case 1489375840:
                    attributeName = attributeName;
                    strM55822 = strM55822;
                    i25 = i25;
                    i27 = i27;
                    String name = xmlResourceParserC12128.getName();
                    AbstractC0942.m55962(name);
                    switch (C0873.m55680(name)) {
                        case -1655966961:
                            str = name;
                            iM559712 = C0873.m55680("ۗ᩶") ^ i17;
                            i9 = ((iM559712 ^ i18) * (-5935)) ^ 2080846945;
                            i10 = 1433112840;
                            r10 = r10;
                            int i217 = iM559712 ^ i10;
                            i19 = i9;
                            i27 = i27;
                            xmlResourceParserC12129 = xmlResourceParserC12128;
                            String str1118 = attributeName;
                            i20 = i217;
                            attributeName = str1118;
                            String str1119 = str;
                            i25 = i25;
                            strM55822 = strM55822;
                            str2 = str1119;
                            break;
                        case -987494927:
                            str = name;
                            iM559712 = (i18 - C0873.m55680("ۤۨ")) * (-17);
                            i9 = ((iM559712 ^ i17) * 16673) ^ (-373317383);
                            i10 = 750529754;
                            r10 = r10;
                            int i218 = iM559712 ^ i10;
                            i19 = i9;
                            i27 = i27;
                            xmlResourceParserC12129 = xmlResourceParserC12128;
                            String str11110 = attributeName;
                            i20 = i218;
                            attributeName = str11110;
                            String str11111 = str;
                            i25 = i25;
                            strM55822 = strM55822;
                            str2 = str11111;
                            break;
                        case -808719889:
                            str = name;
                            iM559712 = (i17 - C0873.m55680("᩶۫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i9 = ((iM559712 ^ i18) * 8961) ^ 1393341104;
                            i10 = -1190472331;
                            r10 = r10;
                            int i219 = iM559712 ^ i10;
                            i19 = i9;
                            i27 = i27;
                            xmlResourceParserC12129 = xmlResourceParserC12128;
                            String str11112 = attributeName;
                            i20 = i219;
                            attributeName = str11112;
                            String str11113 = str;
                            i25 = i25;
                            strM55822 = strM55822;
                            str2 = str11113;
                            break;
                        case 790287890:
                            str = name;
                            iM559712 = C0946.m55979("ܽۢ") ^ i18;
                            i9 = ((iM559712 ^ i17) * 11503) ^ (-19014691);
                            i10 = 1732156260;
                            r10 = r10;
                            int i2110 = iM559712 ^ i10;
                            i19 = i9;
                            i27 = i27;
                            xmlResourceParserC12129 = xmlResourceParserC12128;
                            String str11114 = attributeName;
                            i20 = i2110;
                            attributeName = str11114;
                            String str11115 = str;
                            i25 = i25;
                            strM55822 = strM55822;
                            str2 = str11115;
                            break;
                        case 1554253136:
                            str = name;
                            iM559712 = (i17 - C0873.m55680("᩵ۙ")) * 35;
                            i9 = ((iM559712 ^ i18) * 6527) ^ (-1014900334);
                            i10 = 1722302175;
                            r10 = r10;
                            int i2111 = iM559712 ^ i10;
                            i19 = i9;
                            i27 = i27;
                            xmlResourceParserC12129 = xmlResourceParserC12128;
                            String str11116 = attributeName;
                            i20 = i2111;
                            attributeName = str11116;
                            String str11117 = str;
                            i25 = i25;
                            strM55822 = strM55822;
                            str2 = str11117;
                            break;
                        case 1723095833:
                            str = name;
                            iM559712 = C0873.m55680("ۧܿ") ^ i17;
                            i9 = ((iM559712 ^ i18) * 9077) ^ (-1606091049);
                            i10 = -220877850;
                            r10 = r10;
                            int i2112 = iM559712 ^ i10;
                            i19 = i9;
                            i27 = i27;
                            xmlResourceParserC12129 = xmlResourceParserC12128;
                            String str11118 = attributeName;
                            i20 = i2112;
                            attributeName = str11118;
                            String str11119 = str;
                            i25 = i25;
                            strM55822 = strM55822;
                            str2 = str11119;
                            break;
                        case 1984153269:
                            int iM55683 = C0873.m55680("ܶܳ") ^ i18;
                            i19 = ((iM55683 ^ i17) * 10481) ^ 809705019;
                            i27 = i27;
                            attributeName = attributeName;
                            i20 = iM55683 ^ 808598700;
                            xmlResourceParserC12129 = xmlResourceParserC12128;
                            i25 = i25;
                            strM55822 = strM55822;
                            str2 = name;
                            break;
                        default:
                            str2 = name;
                            iM559712 = (C0946.m55979("ܳܳ") ^ i18) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            str = str2;
                            i9 = ((iM559712 ^ i17) * 5699) ^ 157243267;
                            i10 = 897507926;
                            r10 = r10;
                            int i2113 = iM559712 ^ i10;
                            i19 = i9;
                            i27 = i27;
                            xmlResourceParserC12129 = xmlResourceParserC12128;
                            String str111110 = attributeName;
                            i20 = i2113;
                            attributeName = str111110;
                            String str111111 = str;
                            i25 = i25;
                            strM55822 = strM55822;
                            str2 = str111111;
                            break;
                    }
                    break;
                case -447902107:
                case 839832259:
                    interfaceC8054 = interfaceC8056;
                    i24 = (i23 * 20) + i22;
                    iM28037 = xmlResourceParserC12129.m28037(i23);
                    obj2 = c6634.get(iM28037);
                    if (obj2 == null) {
                        iM559711 = C0873.m55680("ܺᩴ") ^ i18;
                        i7 = ((iM559711 ^ i17) * (-873)) ^ (-1672953273);
                        i8 = -1854973942;
                    } else {
                        obj = obj2;
                        iM559711 = C0873.m55680("ܰ֫") ^ i18;
                        i7 = ((iM559711 ^ i17) * 30757) ^ (-1558797455);
                        i8 = -724911051;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case -431626491:
                case 1340006758:
                    interfaceC8054 = interfaceC8056;
                    c24930.f79614.add(i24);
                    if (c24930.f79616 != null) {
                        interfaceC8056 = interfaceC8054;
                        i27 = i27;
                        attributeName = attributeName;
                        iM55979 = (i18 - C0873.m55680("᩵ۜ")) * 81;
                        i19 = ((iM55979 ^ i17) * 11073) ^ (-815762842);
                        i4 = 1281695252;
                        i3 = iM55979 ^ i4;
                        i27 = i27;
                        String str11120 = attributeName;
                        i20 = i3;
                        attributeName = str11120;
                    } else {
                        iM559711 = C0946.m55979("ۧ᩵") ^ i17;
                        i7 = ((iM559711 ^ i18) * (-20163)) ^ (-872984090);
                        i8 = 447371214;
                        interfaceC8055 = interfaceC8054;
                        i20 = iM559711 ^ i8;
                        i19 = i7;
                        interfaceC8056 = interfaceC8055;
                    }
                    break;
                case -414314860:
                case -393601165:
                    interfaceC8054 = interfaceC8056;
                    c24930.f79614.add(i24);
                    if (c24930.f79616 != null) {
                        interfaceC8056 = interfaceC8054;
                        i27 = i27;
                        attributeName = attributeName;
                        iM55979 = (i18 - C0873.m55680("᩵ۜ")) * 81;
                        i19 = ((iM55979 ^ i17) * 11073) ^ (-815762842);
                        i4 = 1281695252;
                        i3 = iM55979 ^ i4;
                        i27 = i27;
                        String str11121 = attributeName;
                        i20 = i3;
                        attributeName = str11121;
                    } else {
                        iM559711 = (C0873.m55680("ܺۨ") + i17) * (-59);
                        i7 = ((iM559711 ^ i18) * (-15559)) ^ (-1524553687);
                        i8 = 607759001;
                        interfaceC8055 = interfaceC8054;
                        i20 = iM559711 ^ i8;
                        i19 = i7;
                        interfaceC8056 = interfaceC8055;
                    }
                    break;
                case -378444228:
                case 1988494608:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM55822 = strM55822;
                    if (!ViewOnClickListenerC0939.m55949(str2, ServiceConnectionC1013.m56161(f82036, 25, 14, i21))) {
                        i25 = i25;
                        iM559712 = (C0946.m55979("ܳܳ") ^ i18) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        str = str2;
                        i9 = ((iM559712 ^ i17) * 5699) ^ 157243267;
                        i10 = 897507926;
                        r10 = r10;
                        int i2114 = iM559712 ^ i10;
                        i19 = i9;
                        i27 = i27;
                        xmlResourceParserC12129 = xmlResourceParserC12128;
                        String str111112 = attributeName;
                        i20 = i2114;
                        attributeName = str111112;
                        String str111113 = str;
                        i25 = i25;
                        strM55822 = strM55822;
                        str2 = str111113;
                    } else {
                        iM55680 = C0946.m55979("۫ܺ") ^ i18;
                        i19 = ((iM55680 ^ i17) * 23191) ^ (-1315544474);
                        i2 = -494717880;
                        i3 = iM55680 ^ i2;
                        i27 = i27;
                        strM55822 = strM55822;
                        str2 = str2;
                        xmlResourceParserC12129 = xmlResourceParserC12128;
                        String str11122 = attributeName;
                        i20 = i3;
                        attributeName = str11122;
                    }
                    break;
                case -354652900:
                case 1378500261:
                    str = str2;
                    i21 = 12476;
                    iM559712 = C0873.m55680("۟ۗ") ^ i18;
                    i9 = ((iM559712 ^ i17) * (-29145)) ^ (-270817295);
                    i10 = 425613938;
                    r10 = r10;
                    int i2115 = iM559712 ^ i10;
                    i19 = i9;
                    i27 = i27;
                    xmlResourceParserC12129 = xmlResourceParserC12128;
                    String str111114 = attributeName;
                    i20 = i2115;
                    attributeName = str111114;
                    String str111115 = str;
                    i25 = i25;
                    strM55822 = strM55822;
                    str2 = str111115;
                    break;
                case -346967896:
                case 902945270:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM55822 = strM55822;
                    if (!ViewOnClickListenerC0939.m55949(str2, C1012.m56144(f82036, 39, 11, i21))) {
                        i25 = i25;
                        iM559712 = (C0946.m55979("ܳܳ") ^ i18) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        str = str2;
                        i9 = ((iM559712 ^ i17) * 5699) ^ 157243267;
                        i10 = 897507926;
                        r10 = r10;
                        int i2116 = iM559712 ^ i10;
                        i19 = i9;
                        i27 = i27;
                        xmlResourceParserC12129 = xmlResourceParserC12128;
                        String str111116 = attributeName;
                        i20 = i2116;
                        attributeName = str111116;
                        String str111117 = str;
                        i25 = i25;
                        strM55822 = strM55822;
                        str2 = str111117;
                    } else {
                        i26 = i25;
                        iM55680 = C0873.m55680("۬֫") ^ i17;
                        i19 = ((iM55680 ^ i18) * 28095) ^ (-365593897);
                        i2 = 396391031;
                        i3 = iM55680 ^ i2;
                        i27 = i27;
                        strM55822 = strM55822;
                        str2 = str2;
                        xmlResourceParserC12129 = xmlResourceParserC12128;
                        String str11123 = attributeName;
                        i20 = i3;
                        attributeName = str11123;
                    }
                    break;
                case -302254573:
                case 849398354:
                    interfaceC8056.accept(xmlResourceParserC12129.m28030(i23));
                    interfaceC8056.accept(xmlResourceParserC12129.m28036(i23));
                    interfaceC8056.accept(xmlResourceParserC12129.m28039(i23));
                    i27 = i27;
                    if (xmlResourceParserC12129.m28045(i23) != i27) {
                        attributeName = attributeName;
                        iM55979 = (i18 - C0873.m55680("᩵ۜ")) * 81;
                        i19 = ((iM55979 ^ i17) * 11073) ^ (-815762842);
                        i4 = 1281695252;
                        i3 = iM55979 ^ i4;
                        i27 = i27;
                        String str11124 = attributeName;
                        i20 = i3;
                        attributeName = str11124;
                    } else {
                        iM559710 = C0946.m55979("ۛ᩵") ^ i17;
                        attributeName = attributeName;
                        i5 = ((iM559710 ^ i18) * (-10683)) ^ 120028294;
                        i6 = 1421714904;
                        int i30 = iM559710 ^ i6;
                        i27 = i27;
                        i19 = i5;
                        attributeName = attributeName;
                        i20 = i30;
                    }
                    break;
                case -133617486:
                case -71918379:
                    interfaceC8054 = interfaceC8056;
                    c24930.f79614.add(i24);
                    if (c24930.f79616 != null) {
                        interfaceC8056 = interfaceC8054;
                        i27 = i27;
                        attributeName = attributeName;
                        iM55979 = (i18 - C0873.m55680("᩵ۜ")) * 81;
                        i19 = ((iM55979 ^ i17) * 11073) ^ (-815762842);
                        i4 = 1281695252;
                        i3 = iM55979 ^ i4;
                        i27 = i27;
                        String str11125 = attributeName;
                        i20 = i3;
                        attributeName = str11125;
                    } else {
                        iM559711 = C0873.m55680("ۡۙ") ^ i18;
                        i7 = ((iM559711 ^ i17) * 23951) ^ (-542601755);
                        i8 = -1440279850;
                        interfaceC8055 = interfaceC8054;
                        i20 = iM559711 ^ i8;
                        i19 = i7;
                        interfaceC8056 = interfaceC8055;
                    }
                    break;
                case -105666345:
                case 566163932:
                    interfaceC8054 = interfaceC8056;
                    if (C0863.m55630(strM55929, C0967.m56077(f82036, 157, 5, i21))) {
                        iM559711 = (C0873.m55680("ۙۙ") ^ i17) * 53;
                        i7 = ((iM559711 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM559711 = C0873.m55680("᩺۫") ^ i18;
                        i7 = ((iM559711 ^ i17) * 19511) ^ (-1897971037);
                        i8 = -430795304;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case -78834826:
                case 1356177863:
                    interfaceC8054 = interfaceC8056;
                    if (C0845.m55582(strM55929, C1229.m56403(f82036, 200, 9, i21))) {
                        iM559711 = (C0873.m55680("ۙۙ") ^ i17) * 53;
                        i7 = ((iM559711 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM559711 = C0873.m55680("ۧۘ") ^ i18;
                        i7 = ((iM559711 ^ i17) * (-1455)) ^ (-1336987988);
                        i8 = -960399010;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case 63007855:
                case 640653964:
                    InterfaceC8054 interfaceC8057 = interfaceC8056;
                    int attributeNameResource = (xmlResourceParserC12129.getAttributeNameResource(i23) >>> 24) & 255;
                    if (attributeNameResource > r10) {
                        iM55682 = C0946.m55979("᩺᩶") ^ i17;
                        i13 = ((iM55682 ^ i18) * 21181) ^ (-85614077);
                        i14 = 2081627342;
                    } else {
                        iM55682 = (C0873.m55680("ᩴ֨") ^ i18) * 57;
                        i13 = ((iM55682 ^ i17) * (-27197)) ^ 1840424792;
                        i14 = -2134266266;
                    }
                    int i31 = iM55682 ^ i14;
                    i15 = attributeNameResource;
                    i19 = i13;
                    interfaceC8055 = interfaceC8057;
                    i20 = i31;
                    interfaceC8056 = interfaceC8055;
                    break;
                case 69309160:
                case 610850003:
                    c24930.f79616 = C21466.m48631(strM55822, attributeName);
                    i27 = i27;
                    attributeName = attributeName;
                    iM55979 = (i18 - C0873.m55680("᩵ۜ")) * 81;
                    i19 = ((iM55979 ^ i17) * 11073) ^ (-815762842);
                    i4 = 1281695252;
                    i3 = iM55979 ^ i4;
                    i27 = i27;
                    String str11126 = attributeName;
                    i20 = i3;
                    attributeName = str11126;
                    break;
                case 73536941:
                case 775577287:
                    interfaceC8054 = interfaceC8056;
                    if (i15 == 0) {
                        iM559711 = C0946.m55979("ᩴ֫") ^ i17;
                        i7 = ((iM559711 ^ i18) * 25757) ^ 1549895359;
                        i8 = 532888356;
                    } else {
                        iM559711 = C0946.m55979("ܿ۟") ^ i18;
                        i7 = ((iM559711 ^ i17) * (-20687)) ^ (-976860491);
                        i8 = 317388440;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case 105524339:
                case 1997771988:
                    i26 = 1;
                    strM55822 = strM55822;
                    iM55680 = C0873.m55680("۬֫") ^ i17;
                    i19 = ((iM55680 ^ i18) * 28095) ^ (-365593897);
                    i2 = 396391031;
                    i3 = iM55680 ^ i2;
                    i27 = i27;
                    strM55822 = strM55822;
                    str2 = str2;
                    xmlResourceParserC12129 = xmlResourceParserC12128;
                    String str11127 = attributeName;
                    i20 = i3;
                    attributeName = str11127;
                    break;
                case 137848874:
                case 926584107:
                    z = true;
                    iM55979 = C0873.m55680("ۙۡ") ^ i17;
                    i19 = ((iM55979 ^ i18) * 2881) ^ 1085684838;
                    i4 = 736524013;
                    i3 = iM55979 ^ i4;
                    i27 = i27;
                    String str11128 = attributeName;
                    i20 = i3;
                    attributeName = str11128;
                    break;
                case 235984527:
                case 725706265:
                    interfaceC8054 = interfaceC8056;
                    if (C0906.m55806(attributeName, C1404.m56462(f82036, 108, 31, i21))) {
                        iM559711 = C0946.m55979("ܿ۟") ^ i18;
                        i7 = ((iM559711 ^ i17) * (-20687)) ^ (-976860491);
                        i8 = 317388440;
                    } else {
                        iM559711 = (i18 - C0873.m55680("ۗۨ")) * (-119);
                        i7 = ((iM559711 ^ i17) * 3343) ^ (-144120178);
                        i8 = -1089556801;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case 255900848:
                case 1837379876:
                    i26 = 0;
                    strM55822 = strM55822;
                    iM55680 = C0873.m55680("۬֫") ^ i17;
                    i19 = ((iM55680 ^ i18) * 28095) ^ (-365593897);
                    i2 = 396391031;
                    i3 = iM55680 ^ i2;
                    i27 = i27;
                    strM55822 = strM55822;
                    str2 = str2;
                    xmlResourceParserC12129 = xmlResourceParserC12128;
                    String str11129 = attributeName;
                    i20 = i3;
                    attributeName = str11129;
                    break;
                case 281870859:
                case 1214712852:
                    interfaceC8054 = interfaceC8056;
                    if (C0845.m55582(strM55929, C0877.m55707(f82036, BERTags.FLAGS, 4, i21))) {
                        iM559711 = (C0873.m55680("ۙۙ") ^ i17) * 53;
                        i7 = ((iM559711 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM559711 = (C0873.m55680("ܽۤ") ^ i18) * 19;
                        i7 = ((iM559711 ^ i17) * (-13463)) ^ 987830881;
                        i8 = -889631357;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case 348462442:
                case 1682102411:
                    interfaceC8054 = interfaceC8056;
                    if (z) {
                        iM559711 = C0946.m55979("۟ܶ") ^ i18;
                        i7 = ((iM559711 ^ i17) * (-4545)) ^ (-230032480);
                        i8 = 518549786;
                    } else {
                        iM559711 = C0946.m55979("ܿ۟") ^ i18;
                        i7 = ((iM559711 ^ i17) * (-20687)) ^ (-976860491);
                        i8 = 317388440;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case 388736294:
                case 736981375:
                    interfaceC8054 = interfaceC8056;
                    if (C11345.m26283(xmlResourceParserC12129.getAttributeValue(i23))) {
                        iM559711 = C0946.m55979("ܰ֨") ^ i17;
                        i7 = ((iM559711 ^ i18) * (-11129)) ^ (-1387873425);
                        i8 = 47787264;
                    } else {
                        iM559711 = C0946.m55979("ܿ۟") ^ i18;
                        i7 = ((iM559711 ^ i17) * (-20687)) ^ (-976860491);
                        i8 = 317388440;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case 390038659:
                case 1607504051:
                    i26 = 6;
                    strM55822 = strM55822;
                    iM55680 = C0873.m55680("۬֫") ^ i17;
                    i19 = ((iM55680 ^ i18) * 28095) ^ (-365593897);
                    i2 = 396391031;
                    i3 = iM55680 ^ i2;
                    i27 = i27;
                    strM55822 = strM55822;
                    str2 = str2;
                    xmlResourceParserC12129 = xmlResourceParserC12128;
                    String str111210 = attributeName;
                    i20 = i3;
                    attributeName = str111210;
                    break;
                case 453905139:
                case 2047676265:
                    i26 = 5;
                    strM55822 = strM55822;
                    iM55680 = C0873.m55680("۬֫") ^ i17;
                    i19 = ((iM55680 ^ i18) * 28095) ^ (-365593897);
                    i2 = 396391031;
                    i3 = iM55680 ^ i2;
                    i27 = i27;
                    strM55822 = strM55822;
                    str2 = str2;
                    xmlResourceParserC12129 = xmlResourceParserC12128;
                    String str111211 = attributeName;
                    i20 = i3;
                    attributeName = str111211;
                    break;
                case 492864214:
                case 2132230727:
                    interfaceC8056.accept(xmlResourceParserC12128.m28041());
                    break;
                case 502165791:
                case 1825371130:
                    i26 = 3;
                    strM55822 = strM55822;
                    iM55680 = C0873.m55680("۬֫") ^ i17;
                    i19 = ((iM55680 ^ i18) * 28095) ^ (-365593897);
                    i2 = 396391031;
                    i3 = iM55680 ^ i2;
                    i27 = i27;
                    strM55822 = strM55822;
                    str2 = str2;
                    xmlResourceParserC12129 = xmlResourceParserC12128;
                    String str111212 = attributeName;
                    i20 = i3;
                    attributeName = str111212;
                    break;
                case 507649994:
                case 522238061:
                    interfaceC8054 = interfaceC8056;
                    if (c6634.mo4793(iM28037)) {
                        obj = obj2;
                        iM559711 = C0873.m55680("ܰ֫") ^ i18;
                        i7 = ((iM559711 ^ i17) * 30757) ^ (-1558797455);
                        i8 = -724911051;
                    } else {
                        iM559711 = C0946.m55979("ܰۤ") ^ i17;
                        i7 = ((iM559711 ^ i18) * 24979) ^ 1636669470;
                        i8 = 508186204;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case 592118954:
                case 1746842740:
                    interfaceC8054 = interfaceC8056;
                    if (C0863.m55630(strM55929, C1194.m56386(f82036, 167, 4, i21))) {
                        iM559711 = (C0873.m55680("ۙۙ") ^ i17) * 53;
                        i7 = ((iM559711 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM559711 = C0873.m55680("۠֫") ^ i18;
                        i7 = ((iM559711 ^ i17) * (-26409)) ^ 267182805;
                        i8 = 1420480301;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case 600367847:
                case 1518682707:
                    interfaceC8054 = interfaceC8056;
                    c24930 = (C24930) obj;
                    attributeName = xmlResourceParserC12129.getAttributeName(i23);
                    int attributeNameResource2 = xmlResourceParserC12129.getAttributeNameResource(i23);
                    strM55822 = C0912.m55822(f82036, 75, 8, i21);
                    switch (attributeNameResource2) {
                        case R.attr.label:
                            iM559711 = C0873.m55680("ۗᩳ") ^ i17;
                            i7 = ((iM559711 ^ i18) * 5191) ^ (-312845205);
                            i8 = -1523239343;
                            break;
                        case R.attr.textOn:
                        case R.attr.textOff:
                        case R.attr.text:
                        case R.attr.hint:
                        case R.attr.title:
                        case R.attr.titleCondensed:
                        case R.attr.summary:
                        case R.attr.summaryOn:
                        case R.attr.summaryOff:
                        case R.attr.dialogTitle:
                        case R.attr.dialogMessage:
                        case R.attr.popupCharacters:
                        case R.attr.keyOutputText:
                        case R.attr.keyLabel:
                        case R.attr.imeActionLabel:
                        case R.attr.contentDescription:
                        case R.attr.queryHint:
                        case R.attr.switchTextOn:
                        case R.attr.switchTextOff:
                        case R.attr.format12Hour:
                        case R.attr.format24Hour:
                        case R.attr.tooltipText:
                        case R.attr.autofillHints:
                            iM559711 = (C0946.m55979("ۛۛ") + i17) * 77;
                            i7 = ((iM559711 ^ i18) * (-13961)) ^ (-731280397);
                            i8 = -1371528380;
                            break;
                        default:
                            iM559711 = C0873.m55680("۟ۤ") ^ i18;
                            i7 = ((iM559711 ^ i17) * 6293) ^ 661741000;
                            i8 = -1920029289;
                            break;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case 852785728:
                case 2124462903:
                    interfaceC8054 = interfaceC8056;
                    if (C0845.m55582(strM55929, RunnableC0938.m55936(f82036, 242, 3, i21))) {
                        iM559711 = (C0873.m55680("ۙۙ") ^ i17) * 53;
                        i7 = ((iM559711 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM559711 = (C0873.m55680("۬ܳ") + i17) * 43;
                        i7 = ((iM559711 ^ i18) * (-7027)) ^ 364225739;
                        i8 = 719888212;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case 1159102509:
                case 1914040541:
                    interfaceC8054 = interfaceC8056;
                    if (C0863.m55630(strM55929, C0947.m55993(f82036, 228, 7, i21))) {
                        iM559711 = (C0873.m55680("ۙۙ") ^ i17) * 53;
                        i7 = ((iM559711 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM559711 = C0873.m55680("ܽۙ") ^ i18;
                        i7 = ((iM559711 ^ i17) * (-30197)) ^ 1658720835;
                        i8 = 744401101;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case 1217314706:
                case 1234914757:
                    interfaceC8054 = interfaceC8056;
                    if (C0863.m55630(strM55929, C0992.m56102(f82036, 213, 11, i21))) {
                        iM559711 = (C0873.m55680("ۙۙ") ^ i17) * 53;
                        i7 = ((iM559711 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM559711 = (i17 - C0873.m55680("ۜۧ")) * 53;
                        i7 = ((iM559711 ^ i18) * 12933) ^ (-1775345110);
                        i8 = -966368793;
                    }
                    interfaceC8055 = interfaceC8054;
                    i20 = iM559711 ^ i8;
                    i19 = i7;
                    interfaceC8056 = interfaceC8055;
                    break;
                case 1221677231:
                case 1330817817:
                    break;
                case 1234938243:
                case 1365077651:
                    attributeName = attributeName;
                    i27 = i27;
                    String str22 = str2;
                    strM55822 = strM55822;
                    i25 = i25;
                    str = str22;
                    if (i != i27) {
                        iM559712 = (C0873.m55680("ᩳ۟") ^ i18) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i9 = ((iM559712 ^ i17) * 10913) ^ 746501099;
                        i10 = -561897174;
                        r10 = r10;
                    } else {
                        iM559712 = (C0873.m55680("᩷᩷") + i17) * (-113);
                        i9 = ((iM559712 ^ i18) * (-1467)) ^ (-1380596709);
                        i10 = -849877878;
                        r10 = r10;
                    }
                    int i2117 = iM559712 ^ i10;
                    i19 = i9;
                    i27 = i27;
                    xmlResourceParserC12129 = xmlResourceParserC12128;
                    String str111118 = attributeName;
                    i20 = i2117;
                    attributeName = str111118;
                    String str111119 = str;
                    i25 = i25;
                    strM55822 = strM55822;
                    str2 = str111119;
                    break;
                case 1262344615:
                case 1541614501:
                    attributeName = attributeName;
                    int i32 = attributeCount;
                    i27 = i27;
                    if (i23 == i32) {
                        attributeCount = i32;
                        String str23 = str2;
                        strM55822 = strM55822;
                        i25 = i25;
                        str = str23;
                        iM559712 = (C0873.m55680("᩷᩷") + i17) * (-113);
                        i9 = ((iM559712 ^ i18) * (-1467)) ^ (-1380596709);
                        i10 = -849877878;
                        r10 = r10;
                        int i2118 = iM559712 ^ i10;
                        i19 = i9;
                        i27 = i27;
                        xmlResourceParserC12129 = xmlResourceParserC12128;
                        String str1111110 = attributeName;
                        i20 = i2118;
                        attributeName = str1111110;
                        String str1111111 = str;
                        i25 = i25;
                        strM55822 = strM55822;
                        str2 = str1111111;
                    } else {
                        iM559710 = C0873.m55680("ᩴۢ") ^ i17;
                        attributeCount = i32;
                        i5 = ((iM559710 ^ i18) * 11811) ^ 2000847837;
                        i6 = 1544030650;
                        int i33 = iM559710 ^ i6;
                        i27 = i27;
                        i19 = i5;
                        attributeName = attributeName;
                        i20 = i33;
                    }
                    break;
                case 1375432963:
                case 1485721190:
                    attributeName = attributeName;
                    i27 = i27;
                    String str24 = str2;
                    strM55822 = strM55822;
                    i25 = i25;
                    str = str24;
                    short s = f82036[0];
                    if (((s * s) + 386358336) - (39312 * s) >= 0) {
                        iM559712 = C0946.m55979("ܿۖ") ^ i17;
                        i9 = ((iM559712 ^ i18) * 25055) ^ 1127001994;
                        i10 = -472245099;
                        r10 = r10;
                    } else {
                        iM559712 = (C0946.m55979("ۡۧ") ^ i18) * (-93);
                        i9 = ((iM559712 ^ i17) * (-24881)) ^ 1698968382;
                        i10 = -1889724605;
                        r10 = r10;
                    }
                    int i2119 = iM559712 ^ i10;
                    i19 = i9;
                    i27 = i27;
                    xmlResourceParserC12129 = xmlResourceParserC12128;
                    String str1111112 = attributeName;
                    i20 = i2119;
                    attributeName = str1111112;
                    String str1111113 = str;
                    i25 = i25;
                    strM55822 = strM55822;
                    str2 = str1111113;
                    break;
                case 1386250735:
                case 2028279429:
                    c24930.f79616 = C21466.m48631(strM55822, attributeName);
                    i27 = i27;
                    attributeName = attributeName;
                    iM55979 = (i18 - C0873.m55680("᩵ۜ")) * 81;
                    i19 = ((iM55979 ^ i17) * 11073) ^ (-815762842);
                    i4 = 1281695252;
                    i3 = iM55979 ^ i4;
                    i27 = i27;
                    String str111213 = attributeName;
                    i20 = i3;
                    attributeName = str111213;
                    break;
                case 1748739320:
                case 1959952040:
                    attributeName = attributeName;
                    i27 = i27;
                    String str25 = str2;
                    strM55822 = strM55822;
                    i25 = i25;
                    str = str25;
                    r9 = r10;
                    if (C0882.m55719(prefix) == 0) {
                        iM559712 = C0946.m55979("ۜܳ") ^ i18;
                        i9 = ((iM559712 ^ i17) * (-19301)) ^ 1489603415;
                        i10 = 1829617058;
                        r10 = r9;
                    } else {
                        iM559712 = (C0946.m55979("ۨܽ") ^ i17) * (-119);
                        i9 = ((iM559712 ^ i18) * (-23169)) ^ 468356565;
                        i10 = -2007252300;
                        r10 = r10;
                    }
                    int i21110 = iM559712 ^ i10;
                    i19 = i9;
                    i27 = i27;
                    xmlResourceParserC12129 = xmlResourceParserC12128;
                    String str1111114 = attributeName;
                    i20 = i21110;
                    attributeName = str1111114;
                    String str1111115 = str;
                    i25 = i25;
                    strM55822 = strM55822;
                    str2 = str1111115;
                    break;
                default:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM55822 = strM55822;
                    if (!C0906.m55806(str2, C1964.m56584(f82036, 17, 8, i21))) {
                        i25 = i25;
                        iM559712 = (C0946.m55979("ܳܳ") ^ i18) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        str = str2;
                        i9 = ((iM559712 ^ i17) * 5699) ^ 157243267;
                        i10 = 897507926;
                        r10 = r10;
                        int i21111 = iM559712 ^ i10;
                        i19 = i9;
                        i27 = i27;
                        xmlResourceParserC12129 = xmlResourceParserC12128;
                        String str1111116 = attributeName;
                        i20 = i21111;
                        attributeName = str1111116;
                        String str1111117 = str;
                        i25 = i25;
                        strM55822 = strM55822;
                        str2 = str1111117;
                    } else {
                        iM55680 = (C0873.m55680("ۢ֡") ^ i18) * 69;
                        i19 = ((iM55680 ^ i17) * 1311) ^ 1457351238;
                        i2 = -322328566;
                        i3 = iM55680 ^ i2;
                        i27 = i27;
                        strM55822 = strM55822;
                        str2 = str2;
                        xmlResourceParserC12129 = xmlResourceParserC12128;
                        String str111214 = attributeName;
                        i20 = i3;
                        attributeName = str111214;
                    }
                    break;
            }
            return;
        }
    }
}
