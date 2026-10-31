package l;

import android.R;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.ۜܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79RC */
/* JADX INFO: loaded from: classes2.dex */
public final class C6806 {

    /* JADX INFO: renamed from: ۘܿۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f21104 = {5384, 12509, 12511, 12488, 12501, 12490, 12501, 12488, 12485, 12492, 12494, 12499, 12490, 12501, 12504, 12505, 12494, 12494, 12505, 12511, 12505, 12501, 12490, 12505, 12494, 12509, 12511, 12488, 12501, 12490, 12501, 12488, 12485, 12433, 12509, 12496, 12501, 12509, 12495, 12509, 12492, 12492, 12496, 12501, 12511, 12509, 12488, 12501, 12499, 12498, 12509, 12492, 12492, 12491, 12501, 12504, 12507, 12505, 12488, 12433, 12492, 12494, 12499, 12490, 12501, 12504, 12505, 12494, 12495, 12505, 12494, 12490, 12501, 12511, 12505, 12509, 12498, 12504, 12494, 12499, 12501, 12504, 12422, 12511, 12499, 12498, 12495, 12488, 12494, 12509, 12501, 12498, 12488, 12515, 12494, 12505, 12506, 12505, 12494, 12505, 12498, 12511, 12505, 12504, 12515, 12501, 12504, 12495, 12496, 12509, 12485, 12499, 12489, 12488, 12515, 12511, 12499, 12498, 12495, 12488, 12494, 12509, 12501, 12498, 12488, 12536, 12501, 12497, 12505, 12498, 12495, 12501, 12499, 12498, 12526, 12509, 12488, 12501, 12499, 12496, 12509, 12510, 12505, 12496, 12496, 12509, 12485, 12499, 12489, 12488, 12529, 12509, 12498, 12509, 12507, 12505, 12494, 12488, 12501, 12488, 12496, 12505, 12543, 12496, 12509, 12495, 12495, 12498, 12509, 12497, 12505, 12519, 12509, 12433, 12486, 12513, 12439, 12436, 12512, 12434, 12519, 12509, 12433, 12486, 12513, 12439, 12437, 12439, 12512, 12434, 12519, 12512, 12491, 12440, 12513, 12439, 12488, 12505, 12484, 12488, 12495, 12505, 12492, 12509, 12494, 12509, 12488, 12499, 12494, 12509, 12492, 12492, 12422, 12504, 12505, 12495, 12511, 12494, 12501, 12492, 12488, 12501, 12499, 12498, 12500, 12501, 12498, 12488, 12495, 12489, 12497, 12497, 12509, 12494, 12485, 12511, 12499, 12497, 12497, 12505, 12498, 12488, 12503, 12505, 12485, 12490, 12509, 12496, 12489, 12505, 12492, 12509, 12488, 12500, 12495, 12489, 12510, 12502, 12505, 12511, 12488};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public List f21105;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f21106;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15206 f21107;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m18455() {
        return this.f21106;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m18456() {
        return this.f21105;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15206 m18457() {
        return this.f21107;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b9 A[PHI: r10
      0x00b9: PHI (r10v3 java.lang.Object) = (r10v2 java.lang.Object), (r10v1 java.lang.Object) binds: [B:33:0x00b7, B:15:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0213 A[PHI: r2
      0x0213: PHI (r2v3 l.ۜܰܽ) = (r2v1 l.ۜܰܽ), (r2v2 l.ۜܰܽ), (r2v1 l.ۜܰܽ), (r2v1 l.ۜܰܽ), (r2v1 l.ۜܰܽ), (r2v1 l.ۜܰܽ) binds: [B:113:0x0213, B:66:0x0211, B:20:0x0060, B:18:0x005c, B:15:0x0056, B:126:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x028d  */
    /* JADX WARN: Code duplicated, block: B:79:0x02bf A[PHI: r7
      0x02bf: PHI (r7v2 l.ܿܰܽ) = (r7v1 l.ܿܰܽ), (r7v3 l.ܿܰܽ) binds: [B:78:0x02bd, B:44:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6806 m18453(String str, byte[] bArr) {
        int iM6981;
        int i;
        int i2;
        C15206 c15206M35978 = null;
        C6806 c6806 = null;
        C4488 c4488 = null;
        XmlResourceParserC10269 xmlResourceParserC10269M35994 = null;
        int next = 0;
        InterfaceC17664 interfaceC17664M2810 = null;
        InterfaceC17664 interfaceC17664Filter = null;
        InterfaceC11688 list = null;
        Object objCollect = null;
        List list2 = null;
        int i3 = -2114985828;
        int i4 = RunnableC3474.f10992;
        int i5 = C1773.f6144;
        int iM2566 = (i5 - C0630.m2566("֡᩺")) * (-13);
        int i6 = ((iM2566 ^ i4) * (-29855)) ^ (-1130027264);
        int i7 = iM2566 ^ (-1434204776);
        C17389 c17389 = null;
        C6806 c6807 = null;
        while (true) {
            i3 = i7 ^ (i6 & (((i3 ^ i4) * 4999) >> 31));
            switch (i3) {
                case -2106963785:
                case 1221874869:
                    interfaceC17664M2810 = C0714.m2810(c4488.values());
                    if (C1128.f4106 > 0) {
                        iM6981 = C2105.m6981("ۖۜ") ^ i4;
                        i = ((iM6981 ^ i5) * 15753) ^ 607277425;
                        i2 = 702974338;
                        int i8 = i;
                        i7 = iM6981 ^ i2;
                        i6 = i8;
                    } else {
                        int iM6982 = C2105.m6981("ۗۜ") ^ i4;
                        i7 = (-302754552) ^ iM6982;
                        i6 = ((iM6982 ^ i5) * 7489) ^ 239071700;
                        c17389 = null;
                    }
                    break;
                case -1970542715:
                case 557143619:
                    C4263.m12819();
                    RunnableC1108.m3790();
                    return null;
                case -1945421888:
                case 1280131315:
                    if (next != 1) {
                        iM6981 = C0630.m2566("ᩳۤ") ^ i4;
                        i = ((iM6981 ^ i5) * (-22597)) ^ (-1782738014);
                        i2 = 1358296311;
                    } else {
                        iM6981 = (i5 - C2105.m6981("᩹ᩴ")) * (-103);
                        i = ((iM6981 ^ i4) * 20747) ^ (-1071275688);
                        i2 = 2079735126;
                    }
                    int i9 = i;
                    i7 = iM6981 ^ i2;
                    i6 = i9;
                    break;
                case -1944174016:
                case -1886838870:
                    if (C4263.f13799 > 0) {
                        iM6981 = C0630.m2566("ۗۚ") ^ i4;
                        i = ((iM6981 ^ i5) * (-13373)) ^ (-4855826);
                        i2 = 1088373005;
                    } else {
                        iM6981 = C2105.m6981("ܶ۫") ^ i4;
                        i = ((iM6981 ^ i5) * (-24673)) ^ 601735247;
                        i2 = -1578496289;
                    }
                    int i10 = i;
                    i7 = iM6981 ^ i2;
                    i6 = i10;
                    break;
                case -1864369618:
                case 1811442261:
                    if (C1711.m5736() > 0) {
                        int iM6983 = C2105.m6981("ۗۜ") ^ i4;
                        i7 = (-302754552) ^ iM6983;
                        i6 = ((iM6983 ^ i5) * 7489) ^ 239071700;
                        c17389 = null;
                    } else {
                        iM6981 = C0630.m2566("ۗۚ") ^ i4;
                        i = ((iM6981 ^ i5) * (-13373)) ^ (-4855826);
                        i2 = 1088373005;
                        int i11 = i;
                        i7 = iM6981 ^ i2;
                        i6 = i11;
                    }
                    break;
                case -1764584642:
                case 3520314:
                    list2 = (List) objCollect;
                    if (C2167.m7161(list2)) {
                        iM6981 = (i5 - C0630.m2566("֨ۗ")) * 67;
                        i = ((iM6981 ^ i4) * 1877) ^ 1563440864;
                        i2 = 1822249071;
                    } else {
                        iM6981 = (i5 - C0630.m2566("ۗ᩻")) * 3;
                        i = ((iM6981 ^ i4) * (-21393)) ^ 347443390;
                        i2 = 937659304;
                    }
                    int i12 = i;
                    i7 = iM6981 ^ i2;
                    i6 = i12;
                    break;
                case -1713145553:
                case 1232446368:
                    interfaceC17664Filter = interfaceC17664M2810.filter(c17389);
                    list = C22976.toList();
                    if (!C1711.f5919) {
                        iM6981 = (C0630.m2566("᩹֫") + i5) * 9;
                        i = ((iM6981 ^ i4) * 9711) ^ 131308425;
                        i2 = -1370072315;
                        int i13 = i;
                        i7 = iM6981 ^ i2;
                        i6 = i13;
                    } else {
                        int iM6984 = (C2105.m6981("ܺۢ") + i5) * 67;
                        i6 = ((iM6984 ^ i4) * 20279) ^ 1472010538;
                        i7 = iM6984 ^ 1345681487;
                    }
                    break;
                case -1550877196:
                case 761985197:
                    C0714.m2805();
                    iM6981 = C0630.m2566("ۗۚ") ^ i4;
                    i = ((iM6981 ^ i5) * (-13373)) ^ (-4855826);
                    i2 = 1088373005;
                    int i14 = i;
                    i7 = iM6981 ^ i2;
                    i6 = i14;
                    break;
                case -1312812034:
                case -582969561:
                    return c6807;
                case -1143549442:
                case 1769457813:
                    c6806.f21105 = list2;
                    c6806.f21107 = c15206M35978;
                    return c6806;
                case -1073732345:
                case -674872870:
                    if (C4263.f13799 <= 0) {
                        iM6981 = C0630.m2566("ۗۚ") ^ i4;
                        i = ((iM6981 ^ i5) * (-13373)) ^ (-4855826);
                        i2 = 1088373005;
                    } else {
                        iM6981 = (i5 - C0630.m2566("᩻ۗ")) * (-5);
                        i = ((iM6981 ^ i4) * 19841) ^ 132929706;
                        i2 = 993507443;
                    }
                    int i15 = i;
                    i7 = iM6981 ^ i2;
                    i6 = i15;
                    break;
                case -574861694:
                case 1476240762:
                    return c6807;
                case -248764785:
                case 177415565:
                    objCollect = interfaceC17664Filter.collect(list);
                    if (C4263.f13799 <= 0) {
                        iM6981 = C2105.m6981("ܶ۫") ^ i4;
                        i = ((iM6981 ^ i5) * (-24673)) ^ 601735247;
                        i2 = -1578496289;
                    } else {
                        iM6981 = (i4 - C2105.m6981("۫֨")) * 55;
                        i = ((iM6981 ^ i5) * (-17703)) ^ (-1617272558);
                        i2 = -1617922354;
                    }
                    int i16 = i;
                    i7 = iM6981 ^ i2;
                    i6 = i16;
                    break;
                case 75030147:
                case 950442436:
                    next = xmlResourceParserC10269M35994.next();
                    iM6981 = C2105.m6981("ۧ᩷") ^ i4;
                    i = ((iM6981 ^ i5) * (-11651)) ^ (-883019316);
                    i2 = -304018915;
                    int i17 = i;
                    i7 = iM6981 ^ i2;
                    i6 = i17;
                    break;
                case 156139442:
                case 2131124360:
                    try {
                        c15206M35978 = C15206.m35978(bArr);
                        iM6981 = C2105.m6981("᩺۬") ^ i4;
                        i = ((iM6981 ^ i5) * 28761) ^ (-1818205138);
                        i2 = 753392505;
                    } catch (IOException unused) {
                        iM6981 = (C0630.m2566("ۖܽ") ^ i4) * 53;
                        i = ((iM6981 ^ i5) * 30329) ^ (-1886142819);
                        i2 = -189351572;
                    }
                    int i18 = i;
                    i7 = iM6981 ^ i2;
                    i6 = i18;
                    break;
                case 172856292:
                case 537798327:
                    C4075.m12263();
                    if (C5695.m16023() >= 0) {
                        int iM6985 = (C2105.m6981("ܺۢ") + i5) * 67;
                        i6 = ((iM6985 ^ i4) * 20279) ^ 1472010538;
                        i7 = iM6985 ^ 1345681487;
                    } else {
                        iM6981 = C0630.m2566("ۗۚ") ^ i4;
                        i = ((iM6981 ^ i5) * (-13373)) ^ (-4855826);
                        i2 = 1088373005;
                        int i19 = i;
                        i7 = iM6981 ^ i2;
                        i6 = i19;
                    }
                    break;
                case 183500479:
                case 322732533:
                    if (!C1711.f5919) {
                        iM6981 = (i5 - C2105.m6981("۬᩵")) * 9;
                        i = ((iM6981 ^ i4) * 23733) ^ (-832935695);
                        i2 = -1683466052;
                        int i110 = i;
                        i7 = iM6981 ^ i2;
                        i6 = i110;
                    } else {
                        int iM6986 = C2105.m6981("ۗۜ") ^ i4;
                        i7 = (-302754552) ^ iM6986;
                        i6 = ((iM6986 ^ i5) * 7489) ^ 239071700;
                        c17389 = null;
                    }
                    break;
                case 184189888:
                case 1120415271:
                    c4488 = new C4488();
                    iM6981 = (i4 - C0630.m2566("᩵ۖ")) * (-69);
                    i = ((iM6981 ^ i5) * 11913) ^ 1325063242;
                    i2 = 581632854;
                    int i111 = i;
                    i7 = iM6981 ^ i2;
                    i6 = i111;
                    break;
                case 520536475:
                case 2050094743:
                    if (C4616.f14690 <= 0) {
                        iM6981 = (i5 - C0630.m2566("᩻ۗ")) * (-5);
                        i = ((iM6981 ^ i4) * 19841) ^ 132929706;
                        i2 = 993507443;
                    } else {
                        iM6981 = (C0630.m2566("ܶ֡") ^ i4) * (-35);
                        i = ((iM6981 ^ i5) * 2843) ^ (-1891411727);
                        i2 = -1105519749;
                    }
                    int i112 = i;
                    i7 = iM6981 ^ i2;
                    i6 = i112;
                    break;
                case 556739741:
                case 1208786665:
                    if (RunnableC0588.f2309 < 0) {
                        c17389 = new C17389(0);
                        if (C1047.f3863 >= 0) {
                            iM6981 = (i4 - C0630.m2566("۫۟")) * 89;
                            i = ((iM6981 ^ i5) * (-18361)) ^ 1541728162;
                            i2 = 1645845;
                        } else {
                            iM6981 = C0630.m2566("᩺ܰ") ^ i5;
                            i = ((iM6981 ^ i4) * 17151) ^ 80442844;
                            i2 = -1218632913;
                        }
                        int i113 = i;
                        i7 = iM6981 ^ i2;
                        i6 = i113;
                    } else {
                        int iM6987 = C2105.m6981("ۗۜ") ^ i4;
                        i7 = (-302754552) ^ iM6987;
                        i6 = ((iM6987 ^ i5) * 7489) ^ 239071700;
                        c17389 = null;
                    }
                    break;
                case 585592533:
                case 890821484:
                    c6807 = null;
                    iM6981 = (i5 - C0630.m2566("ܿܽ")) * (-115);
                    i = ((iM6981 ^ i4) * 26441) ^ (-1202468793);
                    i2 = 136009866;
                    int i114 = i;
                    i7 = iM6981 ^ i2;
                    i6 = i114;
                    break;
                case 620331308:
                case 1886265152:
                    c6806.f21106 = str;
                    if (C7811.f24123 < 0) {
                        iM6981 = (C2105.m6981("۟۬") ^ i5) * (-121);
                        i = ((iM6981 ^ i4) * (-14777)) ^ 1406029335;
                        i2 = -1432672486;
                        int i115 = i;
                        i7 = iM6981 ^ i2;
                        i6 = i115;
                    } else {
                        int iM6988 = (C2105.m6981("ܺۢ") + i5) * 67;
                        i6 = ((iM6988 ^ i4) * 20279) ^ 1472010538;
                        i7 = iM6988 ^ 1345681487;
                    }
                    break;
                case 785542375:
                case 823919499:
                    m18454(next, xmlResourceParserC10269M35994, c4488);
                    iM6981 = C2105.m6981("ܶۛ") ^ i5;
                    i = ((iM6981 ^ i4) * (-12115)) ^ 2093993121;
                    i2 = 717576464;
                    int i116 = i;
                    i7 = iM6981 ^ i2;
                    i6 = i116;
                    break;
                case 1060610281:
                case 1244233792:
                    if (C2272.f7362) {
                        iM6981 = (i4 - C0630.m2566("۫۟")) * 89;
                        i = ((iM6981 ^ i5) * (-18361)) ^ 1541728162;
                        i2 = 1645845;
                    } else {
                        iM6981 = C2105.m6981("۫ܰ") ^ i4;
                        i = ((iM6981 ^ i5) * 8473) ^ 1611458754;
                        i2 = 2129449363;
                    }
                    int i117 = i;
                    i7 = iM6981 ^ i2;
                    i6 = i117;
                    break;
                case 1215334729:
                case 1292774758:
                    c6806 = new C6806();
                    if (C0798.f2919) {
                        iM6981 = C0630.m2566("ۗۚ") ^ i4;
                        i = ((iM6981 ^ i5) * (-13373)) ^ (-4855826);
                        i2 = 1088373005;
                    } else {
                        iM6981 = (C0630.m2566("ᩳᩳ") + i5) * (-15);
                        i = ((iM6981 ^ i4) * 11681) ^ 1354588503;
                        i2 = 853259702;
                    }
                    int i118 = i;
                    i7 = iM6981 ^ i2;
                    i6 = i118;
                    break;
                default:
                    try {
                        xmlResourceParserC10269M35994 = c15206M35978.m35994();
                        iM6981 = C2105.m6981("ܶۛ") ^ i5;
                        i = ((iM6981 ^ i4) * (-12115)) ^ 2093993121;
                        i2 = 717576464;
                    } catch (Exception unused2) {
                        iM6981 = (i5 - C2105.m6981("᩹ᩴ")) * (-103);
                        i = ((iM6981 ^ i4) * 20747) ^ (-1071275688);
                        i2 = 2079735126;
                    }
                    int i119 = i;
                    i7 = iM6981 ^ i2;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18454(int i, XmlResourceParserC10269 xmlResourceParserC10269, final C4488 c4488) {
        int iM2566;
        int i2;
        int i3;
        int iM6981;
        int i4;
        String str;
        int iM6982;
        int i5;
        int i6;
        InterfaceC5982 interfaceC5982;
        int iM6983;
        int i7;
        int i8;
        int iM6984;
        int i9;
        int i10;
        int iM2567;
        int i11;
        int i12;
        ?? r9;
        int iM2568;
        int i13;
        int i14;
        InterfaceC5982 interfaceC5983;
        XmlResourceParserC10269 xmlResourceParserC102610 = xmlResourceParserC10269;
        int i15 = 0;
        boolean z = false;
        int i16 = -93437694;
        int i17 = C7811.f24123;
        int i18 = C0714.f2697;
        int iM6985 = C2105.m6981("ܰ᩸") ^ i17;
        int i19 = ((iM6985 ^ i18) * (-12511)) ^ (-1473296073);
        int i20 = iM6985 ^ (-377589143);
        C23739 c23739 = null;
        String attributeName = null;
        String strM4902 = null;
        String strM6378 = null;
        String attributeValue = null;
        InterfaceC5982 interfaceC5984 = null;
        int iM26015 = 0;
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
                    c23739.f76866 = r10;
                    i27 = i27;
                    attributeName = attributeName;
                    iM6981 = (i18 - C0630.m2566("᩵ۜ")) * 81;
                    i19 = ((iM6981 ^ i17) * 11073) ^ (-815762842);
                    i4 = 1281695252;
                    i3 = iM6981 ^ i4;
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
                    strM4902 = strM4902;
                    if (!C1294.m4369(str2, C3746.m11357(f21104, 1, 8, i21))) {
                        i25 = i25;
                        iM6984 = (C2105.m6981("ܳܳ") ^ i18) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        str = str2;
                        i9 = ((iM6984 ^ i17) * 5699) ^ 157243267;
                        i10 = 897507926;
                        r10 = r10;
                        int i29 = iM6984 ^ i10;
                        i19 = i9;
                        i27 = i27;
                        xmlResourceParserC102610 = xmlResourceParserC10269;
                        String str4 = attributeName;
                        i20 = i29;
                        attributeName = str4;
                        String str5 = str;
                        i25 = i25;
                        strM4902 = strM4902;
                        str2 = str5;
                    } else {
                        iM2566 = (i17 - C0630.m2566("۫֡")) * (-51);
                        i19 = ((iM2566 ^ i18) * 22093) ^ (-332403916);
                        i2 = -2106312819;
                        i3 = iM2566 ^ i2;
                        i27 = i27;
                        strM4902 = strM4902;
                        str2 = str2;
                        xmlResourceParserC102610 = xmlResourceParserC10269;
                        String str6 = attributeName;
                        i20 = i3;
                        attributeName = str6;
                    }
                    break;
                case -1925236330:
                case 1613344779:
                    interfaceC5982 = interfaceC5984;
                    if (C0422.m1945(strM6378, C0630.m2575(f21104, 250, 4, i21))) {
                        iM6983 = (C0630.m2566("ۙۙ") ^ i17) * 53;
                        i7 = ((iM6983 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM6983 = C2105.m6981("ۗۧ") ^ i17;
                        i7 = ((iM6983 ^ i18) * 32409) ^ (-846685559);
                        i8 = 751990392;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case -1868056784:
                case 589979971:
                    interfaceC5982 = interfaceC5984;
                    if (C9445.m24273(xmlResourceParserC102610.getAttributeValue(i23))) {
                        iM6983 = C0630.m2566("ۤۙ") ^ i18;
                        i7 = ((iM6983 ^ i17) * (-17617)) ^ 998923974;
                        i8 = 1984360154;
                    } else {
                        iM6983 = C2105.m6981("ܿ۟") ^ i18;
                        i7 = ((iM6983 ^ i17) * (-20687)) ^ (-976860491);
                        i8 = 317388440;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case -1790529514:
                case 1806724371:
                    i26 = -1;
                    strM4902 = strM4902;
                    iM2566 = C0630.m2566("۬֫") ^ i17;
                    i19 = ((iM2566 ^ i18) * 28095) ^ (-365593897);
                    i2 = 396391031;
                    i3 = iM2566 ^ i2;
                    i27 = i27;
                    strM4902 = strM4902;
                    str2 = str2;
                    xmlResourceParserC102610 = xmlResourceParserC10269;
                    String str7 = attributeName;
                    i20 = i3;
                    attributeName = str7;
                    break;
                case -1779308321:
                case 1249131431:
                    interfaceC5982 = interfaceC5984;
                    if (attributeValue.matches(ViewOnClickListenerC1958.m6435(f21104, 171, 25, i21))) {
                        iM6983 = C2105.m6981("ܿ۟") ^ i18;
                        i7 = ((iM6983 ^ i17) * (-20687)) ^ (-976860491);
                        i8 = 317388440;
                    } else {
                        iM6983 = C0630.m2566("ۤܿ") ^ i17;
                        i7 = ((iM6983 ^ i18) * (-3701)) ^ (-1772344843);
                        i8 = -1748067895;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case -1770068331:
                case -25212033:
                    interfaceC5982 = interfaceC5984;
                    attributeValue = xmlResourceParserC102610.getAttributeValue(i23);
                    if (C1128.m3850(attributeName, C2105.m6988(f21104, 162, 5, i21))) {
                        iM6983 = (C0630.m2566("ܽܳ") ^ i17) * 87;
                        i7 = ((iM6983 ^ i18) * (-19387)) ^ (-2040149638);
                        i8 = -311804456;
                    } else {
                        iM6983 = C0630.m2566("ۤܿ") ^ i17;
                        i7 = ((iM6983 ^ i18) * (-3701)) ^ (-1772344843);
                        i8 = -1748067895;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case -1760453705:
                case -555878520:
                    String str8 = attributeName;
                    String str9 = str2;
                    String str10 = strM4902;
                    interfaceC5984 = new InterfaceC5982() { // from class: l.ܳܰܽ
                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final /* bridge */ /* synthetic */ void n(Object obj3) {
                            mo16796((Integer) obj3);
                        }

                        @Override // l.InterfaceC5982
                        /* JADX INFO: renamed from: ܽ */
                        public final /* synthetic */ void mo16796(Integer num) {
                            C10216.m25642((InterfaceC5982) this, num);
                        }

                        public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                            return C10216.m25641((InterfaceC5982) this, intConsumer);
                        }

                        public final Consumer andThen(Consumer consumer) {
                            return C23517.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.IntConsumer
                        public final void accept(int i30) {
                            C4488 c4489 = null;
                            Object obj3 = null;
                            Object c237310 = null;
                            int i31 = 218260276;
                            int i32 = C0422.f1886;
                            int i33 = C4616.f14690;
                            int iM2569 = C0630.m2566("֡ۙ") ^ i33;
                            int i34 = ((iM2569 ^ i32) * (-7735)) ^ (-1951939897);
                            int i35 = 213138896;
                            while (true) {
                                i31 = ((((i31 ^ i32) * (-17595)) >> 31) & i34) ^ (iM2569 ^ i35);
                                switch (i31) {
                                    case -1974038208:
                                    case -514870348:
                                        if (C2105.f7037 != 0) {
                                            iM2569 = C2105.m6981("֡ۛ") ^ i33;
                                            i34 = ((iM2569 ^ i32) * (-13091)) ^ 4892428;
                                            i35 = 208359721;
                                        } else {
                                            iM2569 = C0630.m2566("ۙ᩺") ^ i33;
                                            i34 = ((iM2569 ^ i32) * 22505) ^ 1759563019;
                                            i35 = 728901990;
                                        }
                                        break;
                                    case -1716662866:
                                    case 705648200:
                                        if (C0237.f1507 != 0) {
                                            iM2569 = C2105.m6981("֡ۛ") ^ i33;
                                            i34 = ((iM2569 ^ i32) * (-13091)) ^ 4892428;
                                            i35 = 208359721;
                                        } else {
                                            iM2569 = (C2105.m6981("ۛ᩶") + i33) * (-47);
                                            i34 = ((iM2569 ^ i32) * 16513) ^ (-1007900496);
                                            i35 = -1298707436;
                                        }
                                        break;
                                    case -1683540868:
                                    case 830001664:
                                        if (C3245.f10203 <= 0) {
                                            iM2569 = (C0630.m2566("֫۬") ^ i32) * 89;
                                            i34 = ((iM2569 ^ i33) * 5045) ^ 1842322909;
                                            i35 = -781770950;
                                        } else {
                                            iM2569 = (C0630.m2566("ܶܳ") ^ i32) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i34 = ((iM2569 ^ i33) * (-11917)) ^ 904076789;
                                            i35 = -1471112794;
                                        }
                                        break;
                                    case -1470841254:
                                    case -1261612453:
                                        if (C0798.f2919) {
                                            iM2569 = C2105.m6981("֡ۛ") ^ i33;
                                            i34 = ((iM2569 ^ i32) * (-13091)) ^ 4892428;
                                            i35 = 208359721;
                                        } else {
                                            iM2569 = C0630.m2566("᩵۟") ^ i33;
                                            i34 = ((iM2569 ^ i32) * (-2455)) ^ 1830517306;
                                            i35 = -642900498;
                                        }
                                        break;
                                    case -1469510544:
                                    case 718289587:
                                        if (!AbstractC2021.m6574()) {
                                            iM2569 = (C0630.m2566("֫۬") ^ i32) * 89;
                                            i34 = ((iM2569 ^ i33) * 5045) ^ 1842322909;
                                            i35 = -781770950;
                                        } else {
                                            iM2569 = C2105.m6981("ۛ۫") ^ i32;
                                            i34 = ((iM2569 ^ i33) * (-4259)) ^ 1440378863;
                                            i35 = 565896680;
                                        }
                                        break;
                                    case -1429663579:
                                    case 1371633343:
                                        if (RunnableC3474.f10992 <= 0) {
                                            iM2569 = (C0630.m2566("֫۬") ^ i32) * 89;
                                            i34 = ((iM2569 ^ i33) * 5045) ^ 1842322909;
                                            i35 = -781770950;
                                        } else {
                                            iM2569 = (i32 - C2105.m6981("᩷ܳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i34 = ((iM2569 ^ i33) * 8749) ^ 576164062;
                                            i35 = -1715331169;
                                        }
                                        break;
                                    case -951647321:
                                    case 2070903706:
                                        if (C2958.f9394 >= 0) {
                                            iM2569 = C2105.m6981("ۛ۫") ^ i32;
                                            i34 = ((iM2569 ^ i33) * (-4259)) ^ 1440378863;
                                            i35 = 565896680;
                                        } else {
                                            iM2569 = (C2105.m6981("ܿܿ") ^ i33) * 19;
                                            i34 = ((iM2569 ^ i32) * (-18143)) ^ (-1381479797);
                                            i35 = -650371055;
                                        }
                                        break;
                                    case -683135352:
                                    case 123688325:
                                        if (C4616.f14690 <= 0) {
                                            iM2569 = C2105.m6981("֡ۛ") ^ i33;
                                            i34 = ((iM2569 ^ i32) * (-13091)) ^ 4892428;
                                            i35 = 208359721;
                                        } else {
                                            iM2569 = C0630.m2566("᩸۟") ^ i33;
                                            i34 = ((iM2569 ^ i32) * (-2807)) ^ (-1222018533);
                                            i35 = 234197271;
                                        }
                                        break;
                                    case -641271459:
                                    case -15271900:
                                        if (C1294.f4556 >= 0) {
                                            iM2569 = (C0630.m2566("֫۬") ^ i32) * 89;
                                            i34 = ((iM2569 ^ i33) * 5045) ^ 1842322909;
                                            i35 = -781770950;
                                        } else {
                                            iM2569 = C2105.m6981("ܳܿ") ^ i32;
                                            i34 = ((iM2569 ^ i33) * (-6043)) ^ (-633345972);
                                            i35 = -811365403;
                                        }
                                        break;
                                    case -480021642:
                                    case -182290923:
                                        ((C23739) c237310).f76866 = true;
                                        iM2569 = (i32 - C2105.m6981("ܰۘ")) * 39;
                                        i34 = ((iM2569 ^ i33) * 13635) ^ (-2088743483);
                                        i35 = -137979634;
                                        break;
                                    case -366653975:
                                    case 1014145409:
                                        break;
                                    case -359699299:
                                    case 407506947:
                                        c237310 = new C23739(i30);
                                        c4489.mo2318(i30, c237310);
                                        iM2569 = C2105.m6981("ܺۜ") ^ i33;
                                        i34 = ((iM2569 ^ i32) * (-3699)) ^ (-1923235804);
                                        i35 = -744927689;
                                        break;
                                    case -70680906:
                                    case 1427129245:
                                        if (RunnableC3474.m10630()) {
                                            iM2569 = C0630.m2566("֡ۗ") ^ i32;
                                            i34 = ((iM2569 ^ i33) * 13819) ^ (-605671943);
                                            i35 = -106674717;
                                        } else {
                                            iM2569 = (C0630.m2566("֫۬") ^ i32) * 89;
                                            i34 = ((iM2569 ^ i33) * 5045) ^ 1842322909;
                                            i35 = -781770950;
                                        }
                                        break;
                                    case 77838205:
                                    case 726496432:
                                        if (C0483.f2088 >= 0) {
                                            iM2569 = C2105.m6981("֡ۛ") ^ i33;
                                            i34 = ((iM2569 ^ i32) * (-13091)) ^ 4892428;
                                            i35 = 208359721;
                                        } else {
                                            iM2569 = (C0630.m2566("ܰۙ") ^ i32) * (-81);
                                            i34 = ((iM2569 ^ i33) * 30725) ^ (-1323509245);
                                            i35 = 1194153753;
                                        }
                                        break;
                                    case 231283047:
                                    case 1801748332:
                                        if (RunnableC3474.f10992 <= 0) {
                                            iM2569 = C2105.m6981("ۛ۫") ^ i32;
                                            i34 = ((iM2569 ^ i33) * (-4259)) ^ 1440378863;
                                            i35 = 565896680;
                                        } else {
                                            iM2569 = (i33 - C2105.m6981("ܳۨ")) * 81;
                                            i34 = ((iM2569 ^ i32) * 13593) ^ (-18386954);
                                            i35 = -628123033;
                                        }
                                        break;
                                    case 587005755:
                                    case 961641881:
                                        C4075.m12263();
                                        C3683.m11222();
                                        break;
                                    case 695231835:
                                    case 1833623085:
                                        if (c4489.mo2422(i30)) {
                                            c237310 = obj3;
                                            iM2569 = C2105.m6981("ܺۜ") ^ i33;
                                            i34 = ((iM2569 ^ i32) * (-3699)) ^ (-1923235804);
                                            i35 = -744927689;
                                        } else {
                                            iM2569 = C0630.m2566("᩸᩺") ^ i33;
                                            i34 = ((iM2569 ^ i32) * (-7701)) ^ (-492199777);
                                            i35 = -868745889;
                                        }
                                        break;
                                    case 1360304368:
                                    case 2133167159:
                                        C1005.m3501();
                                        iM2569 = C2105.m6981("ۛ۫") ^ i32;
                                        i34 = ((iM2569 ^ i33) * (-4259)) ^ 1440378863;
                                        i35 = 565896680;
                                        break;
                                    case 1516049345:
                                    case 1886686138:
                                        if (i30 != -1) {
                                            iM2569 = (C2105.m6981("ۜ᩵") ^ i33) * 51;
                                            i34 = ((iM2569 ^ i32) * 12829) ^ 1518440636;
                                            i35 = -923133573;
                                        } else {
                                            iM2569 = (i32 - C2105.m6981("ܰۘ")) * 39;
                                            i34 = ((iM2569 ^ i33) * 13635) ^ (-2088743483);
                                            i35 = -137979634;
                                        }
                                        break;
                                    case 1544852590:
                                    case 2142304064:
                                        c4489 = c4488;
                                        obj3 = c4489.get(i30);
                                        if (obj3 == null) {
                                            iM2569 = (C0630.m2566("ܳۜ") + i32) * (-17);
                                            i34 = ((iM2569 ^ i33) * (-27691)) ^ (-234639944);
                                            i35 = 891000955;
                                        } else {
                                            c237310 = obj3;
                                            iM2569 = C2105.m6981("ܺۜ") ^ i33;
                                            i34 = ((iM2569 ^ i32) * (-3699)) ^ (-1923235804);
                                            i35 = -744927689;
                                        }
                                        break;
                                    default:
                                        C4263.m12819();
                                        if (C1420.f5096 <= 0) {
                                            iM2569 = C2105.m6981("ۛ۫") ^ i32;
                                            i34 = ((iM2569 ^ i33) * (-4259)) ^ 1440378863;
                                            i35 = 565896680;
                                        } else {
                                            iM2569 = C0630.m2566("ۘۜ") ^ i32;
                                            i34 = ((iM2569 ^ i33) * 7293) ^ 448859894;
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
                        iM2567 = C0630.m2566("ۧ᩻") ^ i17;
                        i11 = ((iM2567 ^ i18) * 4369) ^ (-183306466);
                        i12 = -127165264;
                    } else {
                        iM2567 = C0630.m2566("ۧۧ") ^ i17;
                        i11 = ((iM2567 ^ i18) * 19535) ^ 1935534530;
                        i12 = 1645432737;
                    }
                    i19 = i11;
                    strM4902 = str10;
                    attributeName = str8;
                    i20 = iM2567 ^ i12;
                    str2 = str9;
                    i25 = 4;
                    xmlResourceParserC102610 = xmlResourceParserC10269;
                    break;
                case -1709807486:
                case -1106161130:
                    attributeCount = xmlResourceParserC10269.getAttributeCount();
                    i22 = xmlResourceParserC102610.f30939;
                    i23 = i28;
                    iM6981 = (i17 - C0630.m2566("ᩴۖ")) * 69;
                    i19 = ((iM6981 ^ i18) * (-843)) ^ 362872438;
                    i4 = -1360697700;
                    i3 = iM6981 ^ i4;
                    i27 = i27;
                    String str11 = attributeName;
                    i20 = i3;
                    attributeName = str11;
                    break;
                case -1666905339:
                case -335567350:
                    interfaceC5982 = interfaceC5984;
                    if (!c23739.f76866) {
                        iM6983 = (C2105.m6981("ᩴ᩶") ^ i17) * (-7);
                        i7 = ((iM6983 ^ i18) * 32401) ^ (-434598064);
                        i8 = 611754226;
                        interfaceC5983 = interfaceC5982;
                        i20 = iM6983 ^ i8;
                        i19 = i7;
                        interfaceC5984 = interfaceC5983;
                    } else {
                        interfaceC5984 = interfaceC5982;
                        i27 = i27;
                        attributeName = attributeName;
                        iM6981 = (i18 - C0630.m2566("᩵ۜ")) * 81;
                        i19 = ((iM6981 ^ i17) * 11073) ^ (-815762842);
                        i4 = 1281695252;
                        i3 = iM6981 ^ i4;
                        i27 = i27;
                        String str12 = attributeName;
                        i20 = i3;
                        attributeName = str12;
                    }
                    break;
                case -1658689073:
                case 1298071004:
                    interfaceC5982 = interfaceC5984;
                    if (C0422.m1945(strM6378, C2272.m7507(f21104, Scalar25519.TARGET_LENGTH, 7, i21))) {
                        iM6983 = (C0630.m2566("ۙۙ") ^ i17) * 53;
                        i7 = ((iM6983 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM6983 = C2105.m6981("ܿ۟") ^ i18;
                        i7 = ((iM6983 ^ i17) * (-20687)) ^ (-976860491);
                        i8 = 317388440;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case -1619418141:
                case 1674730566:
                    String str13 = str2;
                    i27 = i27;
                    strM4902 = strM4902;
                    i25 = i25;
                    if (i == i25) {
                        attributeName = attributeName;
                        iM6984 = (C0630.m2566("֫ᩴ") ^ i18) * 109;
                        str = str13;
                        i9 = ((iM6984 ^ i17) * 2889) ^ 888363178;
                        i10 = -1969543950;
                        r10 = r10;
                        int i210 = iM6984 ^ i10;
                        i19 = i9;
                        i27 = i27;
                        xmlResourceParserC102610 = xmlResourceParserC10269;
                        String str14 = attributeName;
                        i20 = i210;
                        attributeName = str14;
                        String str15 = str;
                        i25 = i25;
                        strM4902 = strM4902;
                        str2 = str15;
                    } else {
                        int iM6986 = (C2105.m6981("֫᩵") ^ i18) * 3;
                        i19 = ((iM6986 ^ i17) * 7987) ^ 970219952;
                        i27 = i27;
                        attributeName = attributeName;
                        i20 = iM6986 ^ (-499245046);
                        i25 = i25;
                        strM4902 = strM4902;
                        str2 = str13;
                        xmlResourceParserC102610 = xmlResourceParserC10269;
                    }
                    break;
                case -1606579880:
                case 1722682419:
                    interfaceC5982 = interfaceC5984;
                    if (C1294.m4369(attributeName, C2167.m7159(f21104, 144, 13, i21))) {
                        iM6983 = C2105.m6981("ܿ۟") ^ i18;
                        i7 = ((iM6983 ^ i17) * (-20687)) ^ (-976860491);
                        i8 = 317388440;
                    } else {
                        iM6983 = (i18 - C0630.m2566("֨ܰ")) * (-35);
                        i7 = ((iM6983 ^ i17) * (-18675)) ^ 998137156;
                        i8 = 1966549470;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case -1603156979:
                case 616172388:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM4902 = strM4902;
                    if (!C1294.m4369(str2, C2520.m8030(f21104, 9, 8, i21))) {
                        i25 = i25;
                        iM6984 = (C2105.m6981("ܳܳ") ^ i18) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        str = str2;
                        i9 = ((iM6984 ^ i17) * 5699) ^ 157243267;
                        i10 = 897507926;
                        r10 = r10;
                        int i211 = iM6984 ^ i10;
                        i19 = i9;
                        i27 = i27;
                        xmlResourceParserC102610 = xmlResourceParserC10269;
                        String str16 = attributeName;
                        i20 = i211;
                        attributeName = str16;
                        String str17 = str;
                        i25 = i25;
                        strM4902 = strM4902;
                        str2 = str17;
                    } else {
                        iM2566 = C0630.m2566("ۜᩳ") ^ i17;
                        i19 = ((iM2566 ^ i18) * 21773) ^ (-957957042);
                        i2 = -1212545501;
                        i3 = iM2566 ^ i2;
                        i27 = i27;
                        strM4902 = strM4902;
                        str2 = str2;
                        xmlResourceParserC102610 = xmlResourceParserC10269;
                        String str18 = attributeName;
                        i20 = i3;
                        attributeName = str18;
                    }
                    break;
                case -1581129282:
                case -1289155521:
                    interfaceC5982 = interfaceC5984;
                    c23739.f76863.add(i24);
                    if (c23739.f76865 != null) {
                        interfaceC5984 = interfaceC5982;
                        i27 = i27;
                        attributeName = attributeName;
                        iM6981 = (i18 - C0630.m2566("᩵ۜ")) * 81;
                        i19 = ((iM6981 ^ i17) * 11073) ^ (-815762842);
                        i4 = 1281695252;
                        i3 = iM6981 ^ i4;
                        i27 = i27;
                        String str19 = attributeName;
                        i20 = i3;
                        attributeName = str19;
                    } else {
                        iM6983 = C0630.m2566("ܶۢ") ^ i18;
                        i7 = ((iM6983 ^ i17) * (-28939)) ^ (-255712316);
                        i8 = -156570892;
                        interfaceC5983 = interfaceC5982;
                        i20 = iM6983 ^ i8;
                        i19 = i7;
                        interfaceC5984 = interfaceC5983;
                    }
                    break;
                case -1575922196:
                case 1509371853:
                    interfaceC5982 = interfaceC5984;
                    if (C0050.m938(strM6378, C4075.m12252(f21104, 235, 7, i21))) {
                        iM6983 = (C0630.m2566("ۙۙ") ^ i17) * 53;
                        i7 = ((iM6983 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM6983 = (C0630.m2566("᩻᩻") ^ i17) * (-3);
                        i7 = ((iM6983 ^ i18) * 13101) ^ (-1860019671);
                        i8 = -655287349;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
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
                            iM6981 = C2105.m6981("۬᩺") ^ i18;
                            i19 = ((iM6981 ^ i17) * 2387) ^ 1553013821;
                            i4 = -1183488456;
                            i3 = iM6981 ^ i4;
                            i27 = i27;
                            String str110 = attributeName;
                            i20 = i3;
                            attributeName = str110;
                            break;
                        default:
                            String str20 = str2;
                            strM4902 = strM4902;
                            i25 = i25;
                            str = str20;
                            iM6984 = (C2105.m6981("ۨܽ") ^ i17) * (-119);
                            i9 = ((iM6984 ^ i18) * (-23169)) ^ 468356565;
                            i10 = -2007252300;
                            r10 = r10;
                            int i212 = iM6984 ^ i10;
                            i19 = i9;
                            i27 = i27;
                            xmlResourceParserC102610 = xmlResourceParserC10269;
                            String str111 = attributeName;
                            i20 = i212;
                            attributeName = str111;
                            String str112 = str;
                            i25 = i25;
                            strM4902 = strM4902;
                            str2 = str112;
                            break;
                    }
                    break;
                case -1420139801:
                case 1347420261:
                    c23739.f76865 = attributeName;
                    i27 = i27;
                    attributeName = attributeName;
                    iM6981 = (i18 - C0630.m2566("᩵ۜ")) * 81;
                    i19 = ((iM6981 ^ i17) * 11073) ^ (-815762842);
                    i4 = 1281695252;
                    i3 = iM6981 ^ i4;
                    i27 = i27;
                    String str113 = attributeName;
                    i20 = i3;
                    attributeName = str113;
                    break;
                case -1404370714:
                case -1034294318:
                    str = str2;
                    i21 = 30114;
                    iM6984 = C0630.m2566("۟ۗ") ^ i18;
                    i9 = ((iM6984 ^ i17) * (-29145)) ^ (-270817295);
                    i10 = 425613938;
                    r10 = r10;
                    int i213 = iM6984 ^ i10;
                    i19 = i9;
                    i27 = i27;
                    xmlResourceParserC102610 = xmlResourceParserC10269;
                    String str114 = attributeName;
                    i20 = i213;
                    attributeName = str114;
                    String str115 = str;
                    i25 = i25;
                    strM4902 = strM4902;
                    str2 = str115;
                    break;
                case -1375503405:
                case 1524465336:
                    interfaceC5982 = interfaceC5984;
                    strM6378 = RunnableC1937.m6378(attributeName);
                    if (C0422.m1945(strM6378, C2105.m6988(f21104, 139, 5, i21))) {
                        iM6983 = (C0630.m2566("ۙۙ") ^ i17) * 53;
                        i7 = ((iM6983 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM6983 = C0630.m2566("ۧۗ") ^ i18;
                        i7 = ((iM6983 ^ i17) * 19961) ^ (-1395154383);
                        i8 = -1343144175;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case -1372534828:
                case 325022258:
                    interfaceC5982 = interfaceC5984;
                    if (C9445.m24273(xmlResourceParserC102610.getAttributeValue(i23))) {
                        iM6983 = (i17 - C0630.m2566("᩵᩷")) * 13;
                        i7 = ((iM6983 ^ i18) * (-28267)) ^ 522769735;
                        i8 = 1406302425;
                    } else {
                        iM6983 = C2105.m6981("ܿ۟") ^ i18;
                        i7 = ((iM6983 ^ i17) * (-20687)) ^ (-976860491);
                        i8 = 317388440;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case -1346736465:
                case -569052645:
                    interfaceC5982 = interfaceC5984;
                    C23739 c237310 = new C23739(iM26015);
                    c4488.mo2318(iM26015, c237310);
                    obj = c237310;
                    iM6983 = C0630.m2566("ܰ֫") ^ i18;
                    i7 = ((iM6983 ^ i17) * 30757) ^ (-1558797455);
                    i8 = -724911051;
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case -1212721952:
                case -818716075:
                    i26 = 2;
                    strM4902 = strM4902;
                    iM2566 = C0630.m2566("۬֫") ^ i17;
                    i19 = ((iM2566 ^ i18) * 28095) ^ (-365593897);
                    i2 = 396391031;
                    i3 = iM2566 ^ i2;
                    i27 = i27;
                    strM4902 = strM4902;
                    str2 = str2;
                    xmlResourceParserC102610 = xmlResourceParserC10269;
                    String str116 = attributeName;
                    i20 = i3;
                    attributeName = str116;
                    break;
                case -1177039243:
                case 1248103394:
                    i23++;
                    iM6981 = (i17 - C0630.m2566("ᩴۖ")) * 69;
                    i19 = ((iM6981 ^ i18) * (-843)) ^ 362872438;
                    i4 = -1360697700;
                    i3 = iM6981 ^ i4;
                    i27 = i27;
                    String str117 = attributeName;
                    i20 = i3;
                    attributeName = str117;
                    break;
                case -1105920445:
                case -6915204:
                    interfaceC5984.accept(xmlResourceParserC10269.m26019());
                    interfaceC5984.accept(xmlResourceParserC10269.m26022());
                    break;
                case -1099055092:
                case 1781482560:
                    attributeName = attributeName;
                    i27 = i27;
                    str2 = str2;
                    if (!ViewOnClickListenerC1958.m6437(str2, C0483.m2128(f21104, 68, 7, i21))) {
                        strM4902 = strM4902;
                        i25 = i25;
                        iM6984 = (C2105.m6981("ܳܳ") ^ i18) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        str = str2;
                        i9 = ((iM6984 ^ i17) * 5699) ^ 157243267;
                        i10 = 897507926;
                        r10 = r10;
                        int i214 = iM6984 ^ i10;
                        i19 = i9;
                        i27 = i27;
                        xmlResourceParserC102610 = xmlResourceParserC10269;
                        String str118 = attributeName;
                        i20 = i214;
                        attributeName = str118;
                        String str119 = str;
                        i25 = i25;
                        strM4902 = strM4902;
                        str2 = str119;
                    } else {
                        int iM6987 = (i17 - C2105.m6981("᩹۫")) * (-47);
                        i19 = ((iM6987 ^ i18) * (-29375)) ^ (-592506904);
                        i3 = iM6987 ^ 179513206;
                        str2 = str2;
                        i27 = i27;
                        xmlResourceParserC102610 = xmlResourceParserC10269;
                        String str1110 = attributeName;
                        i20 = i3;
                        attributeName = str1110;
                    }
                    break;
                case -1052832490:
                case -485383166:
                    z = false;
                    iM6981 = C0630.m2566("ۙۡ") ^ i17;
                    i19 = ((iM6981 ^ i18) * 2881) ^ 1085684838;
                    i4 = 736524013;
                    i3 = iM6981 ^ i4;
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
                    strM4902 = strM4902;
                    i25 = i25;
                    str = str21;
                    interfaceC5984.accept(xmlResourceParserC10269.m26019());
                    interfaceC5984.accept(xmlResourceParserC10269.m26022());
                    prefix = xmlResourceParserC10269.getPrefix();
                    i28 = 0;
                    r9 = 1;
                    r10 = 1;
                    if (prefix != null) {
                        iM6984 = (C2105.m6981("ᩴۘ") + i18) * 119;
                        i9 = ((iM6984 ^ i17) * 20789) ^ 827682208;
                        i10 = 1553464799;
                    } else {
                        iM6984 = C2105.m6981("ۜܳ") ^ i18;
                        i9 = ((iM6984 ^ i17) * (-19301)) ^ 1489603415;
                        i10 = 1829617058;
                        r10 = r9;
                    }
                    int i215 = iM6984 ^ i10;
                    i19 = i9;
                    i27 = i27;
                    xmlResourceParserC102610 = xmlResourceParserC10269;
                    String str1112 = attributeName;
                    i20 = i215;
                    attributeName = str1112;
                    String str1113 = str;
                    i25 = i25;
                    strM4902 = strM4902;
                    str2 = str1113;
                    break;
                case -914424818:
                case 1800360158:
                    interfaceC5982 = interfaceC5984;
                    if (C0422.m1945(strM6378, C21923.m49334(f21104, 245, 5, i21))) {
                        iM6983 = (C0630.m2566("ۙۙ") ^ i17) * 53;
                        i7 = ((iM6983 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM6983 = (i18 - C2105.m6981("ܺ᩻")) * 19;
                        i7 = ((iM6983 ^ i17) * 20215) ^ 1770264840;
                        i8 = -270145377;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case -840919371:
                case 1131574264:
                    interfaceC5982 = interfaceC5984;
                    if (C1294.m4369(attributeName, C1128.m3841(f21104, 83, 25, i21))) {
                        iM6983 = C2105.m6981("ܿ۟") ^ i18;
                        i7 = ((iM6983 ^ i17) * (-20687)) ^ (-976860491);
                        i8 = 317388440;
                    } else {
                        iM6983 = C2105.m6981("ܰۘ") ^ i17;
                        i7 = ((iM6983 ^ i18) * 2559) ^ 501189016;
                        i8 = -1699657994;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case -646650544:
                case 1900303693:
                    interfaceC5982 = interfaceC5984;
                    c23739.f76865 = C4117.m12351(C1711.m5726(f21104, 209, 4, i21), attributeName);
                    interfaceC5984 = interfaceC5982;
                    i27 = i27;
                    attributeName = attributeName;
                    iM6981 = (i18 - C0630.m2566("᩵ۜ")) * 81;
                    i19 = ((iM6981 ^ i17) * 11073) ^ (-815762842);
                    i4 = 1281695252;
                    i3 = iM6981 ^ i4;
                    i27 = i27;
                    String str1114 = attributeName;
                    i20 = i3;
                    attributeName = str1114;
                    break;
                case -622522373:
                case 975383017:
                    interfaceC5982 = interfaceC5984;
                    if (C0050.m938(strM6378, C21923.m49334(f21104, 196, 4, i21))) {
                        iM6983 = (C0630.m2566("ۙۙ") ^ i17) * 53;
                        i7 = ((iM6983 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM6983 = (C0630.m2566("ᩳۤ") ^ i17) * 65;
                        i7 = ((iM6983 ^ i18) * (-4487)) ^ 83719298;
                        i8 = 2116437201;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case -606015061:
                case 641630293:
                    interfaceC5982 = interfaceC5984;
                    if (C9445.m24273(xmlResourceParserC102610.getAttributeValue(i23))) {
                        iM6983 = C0630.m2566("ۗ᩹") ^ i18;
                        i7 = ((iM6983 ^ i17) * 19905) ^ (-1629054401);
                        i8 = 1761737227;
                    } else {
                        iM6983 = C2105.m6981("ܿ۟") ^ i18;
                        i7 = ((iM6983 ^ i17) * (-20687)) ^ (-976860491);
                        i8 = 317388440;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case -587320956:
                case 1126544281:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM4902 = strM4902;
                    if (!C1294.m4369(str2, C4263.m12817(f21104, 50, 18, i21))) {
                        i25 = i25;
                        iM6984 = (C2105.m6981("ܳܳ") ^ i18) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        str = str2;
                        i9 = ((iM6984 ^ i17) * 5699) ^ 157243267;
                        i10 = 897507926;
                        r10 = r10;
                        int i216 = iM6984 ^ i10;
                        i19 = i9;
                        i27 = i27;
                        xmlResourceParserC102610 = xmlResourceParserC10269;
                        String str1115 = attributeName;
                        i20 = i216;
                        attributeName = str1115;
                        String str1116 = str;
                        i25 = i25;
                        strM4902 = strM4902;
                        str2 = str1116;
                    } else {
                        iM2566 = C0630.m2566("᩻ܶ") ^ i18;
                        i19 = ((iM2566 ^ i17) * (-13583)) ^ 1239498667;
                        i2 = -1790825227;
                        i3 = iM2566 ^ i2;
                        i27 = i27;
                        strM4902 = strM4902;
                        str2 = str2;
                        xmlResourceParserC102610 = xmlResourceParserC10269;
                        String str1117 = attributeName;
                        i20 = i3;
                        attributeName = str1117;
                    }
                    break;
                case -482182040:
                case 1489375840:
                    attributeName = attributeName;
                    strM4902 = strM4902;
                    i25 = i25;
                    i27 = i27;
                    String name = xmlResourceParserC10269.getName();
                    AbstractC2021.m6565(name);
                    switch (C0630.m2566(name)) {
                        case -1655966961:
                            str = name;
                            iM6984 = C0630.m2566("ۗ᩶") ^ i17;
                            i9 = ((iM6984 ^ i18) * (-5935)) ^ 2080846945;
                            i10 = 1433112840;
                            r10 = r10;
                            int i217 = iM6984 ^ i10;
                            i19 = i9;
                            i27 = i27;
                            xmlResourceParserC102610 = xmlResourceParserC10269;
                            String str1118 = attributeName;
                            i20 = i217;
                            attributeName = str1118;
                            String str1119 = str;
                            i25 = i25;
                            strM4902 = strM4902;
                            str2 = str1119;
                            break;
                        case -987494927:
                            str = name;
                            iM6984 = (i18 - C0630.m2566("ۤۨ")) * (-17);
                            i9 = ((iM6984 ^ i17) * 16673) ^ (-373317383);
                            i10 = 750529754;
                            r10 = r10;
                            int i218 = iM6984 ^ i10;
                            i19 = i9;
                            i27 = i27;
                            xmlResourceParserC102610 = xmlResourceParserC10269;
                            String str11110 = attributeName;
                            i20 = i218;
                            attributeName = str11110;
                            String str11111 = str;
                            i25 = i25;
                            strM4902 = strM4902;
                            str2 = str11111;
                            break;
                        case -808719889:
                            str = name;
                            iM6984 = (i17 - C0630.m2566("᩶۫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i9 = ((iM6984 ^ i18) * 8961) ^ 1393341104;
                            i10 = -1190472331;
                            r10 = r10;
                            int i219 = iM6984 ^ i10;
                            i19 = i9;
                            i27 = i27;
                            xmlResourceParserC102610 = xmlResourceParserC10269;
                            String str11112 = attributeName;
                            i20 = i219;
                            attributeName = str11112;
                            String str11113 = str;
                            i25 = i25;
                            strM4902 = strM4902;
                            str2 = str11113;
                            break;
                        case 790287890:
                            str = name;
                            iM6984 = C2105.m6981("ܽۢ") ^ i18;
                            i9 = ((iM6984 ^ i17) * 11503) ^ (-19014691);
                            i10 = 1732156260;
                            r10 = r10;
                            int i2110 = iM6984 ^ i10;
                            i19 = i9;
                            i27 = i27;
                            xmlResourceParserC102610 = xmlResourceParserC10269;
                            String str11114 = attributeName;
                            i20 = i2110;
                            attributeName = str11114;
                            String str11115 = str;
                            i25 = i25;
                            strM4902 = strM4902;
                            str2 = str11115;
                            break;
                        case 1554253136:
                            str = name;
                            iM6984 = (i17 - C0630.m2566("᩵ۙ")) * 35;
                            i9 = ((iM6984 ^ i18) * 6527) ^ (-1014900334);
                            i10 = 1722302175;
                            r10 = r10;
                            int i2111 = iM6984 ^ i10;
                            i19 = i9;
                            i27 = i27;
                            xmlResourceParserC102610 = xmlResourceParserC10269;
                            String str11116 = attributeName;
                            i20 = i2111;
                            attributeName = str11116;
                            String str11117 = str;
                            i25 = i25;
                            strM4902 = strM4902;
                            str2 = str11117;
                            break;
                        case 1723095833:
                            str = name;
                            iM6984 = C0630.m2566("ۧܿ") ^ i17;
                            i9 = ((iM6984 ^ i18) * 9077) ^ (-1606091049);
                            i10 = -220877850;
                            r10 = r10;
                            int i2112 = iM6984 ^ i10;
                            i19 = i9;
                            i27 = i27;
                            xmlResourceParserC102610 = xmlResourceParserC10269;
                            String str11118 = attributeName;
                            i20 = i2112;
                            attributeName = str11118;
                            String str11119 = str;
                            i25 = i25;
                            strM4902 = strM4902;
                            str2 = str11119;
                            break;
                        case 1984153269:
                            int iM2569 = C0630.m2566("ܶܳ") ^ i18;
                            i19 = ((iM2569 ^ i17) * 10481) ^ 809705019;
                            i27 = i27;
                            attributeName = attributeName;
                            i20 = iM2569 ^ 808598700;
                            xmlResourceParserC102610 = xmlResourceParserC10269;
                            i25 = i25;
                            strM4902 = strM4902;
                            str2 = name;
                            break;
                        default:
                            str2 = name;
                            iM6984 = (C2105.m6981("ܳܳ") ^ i18) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            str = str2;
                            i9 = ((iM6984 ^ i17) * 5699) ^ 157243267;
                            i10 = 897507926;
                            r10 = r10;
                            int i2113 = iM6984 ^ i10;
                            i19 = i9;
                            i27 = i27;
                            xmlResourceParserC102610 = xmlResourceParserC10269;
                            String str111110 = attributeName;
                            i20 = i2113;
                            attributeName = str111110;
                            String str111111 = str;
                            i25 = i25;
                            strM4902 = strM4902;
                            str2 = str111111;
                            break;
                    }
                    break;
                case -447902107:
                case 839832259:
                    interfaceC5982 = interfaceC5984;
                    i24 = (i23 * 20) + i22;
                    iM26015 = xmlResourceParserC102610.m26015(i23);
                    obj2 = c4488.get(iM26015);
                    if (obj2 == null) {
                        iM6983 = C0630.m2566("ܺᩴ") ^ i18;
                        i7 = ((iM6983 ^ i17) * (-873)) ^ (-1672953273);
                        i8 = -1854973942;
                    } else {
                        obj = obj2;
                        iM6983 = C0630.m2566("ܰ֫") ^ i18;
                        i7 = ((iM6983 ^ i17) * 30757) ^ (-1558797455);
                        i8 = -724911051;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case -431626491:
                case 1340006758:
                    interfaceC5982 = interfaceC5984;
                    c23739.f76863.add(i24);
                    if (c23739.f76865 != null) {
                        interfaceC5984 = interfaceC5982;
                        i27 = i27;
                        attributeName = attributeName;
                        iM6981 = (i18 - C0630.m2566("᩵ۜ")) * 81;
                        i19 = ((iM6981 ^ i17) * 11073) ^ (-815762842);
                        i4 = 1281695252;
                        i3 = iM6981 ^ i4;
                        i27 = i27;
                        String str11120 = attributeName;
                        i20 = i3;
                        attributeName = str11120;
                    } else {
                        iM6983 = C2105.m6981("ۧ᩵") ^ i17;
                        i7 = ((iM6983 ^ i18) * (-20163)) ^ (-872984090);
                        i8 = 447371214;
                        interfaceC5983 = interfaceC5982;
                        i20 = iM6983 ^ i8;
                        i19 = i7;
                        interfaceC5984 = interfaceC5983;
                    }
                    break;
                case -414314860:
                case -393601165:
                    interfaceC5982 = interfaceC5984;
                    c23739.f76863.add(i24);
                    if (c23739.f76865 != null) {
                        interfaceC5984 = interfaceC5982;
                        i27 = i27;
                        attributeName = attributeName;
                        iM6981 = (i18 - C0630.m2566("᩵ۜ")) * 81;
                        i19 = ((iM6981 ^ i17) * 11073) ^ (-815762842);
                        i4 = 1281695252;
                        i3 = iM6981 ^ i4;
                        i27 = i27;
                        String str11121 = attributeName;
                        i20 = i3;
                        attributeName = str11121;
                    } else {
                        iM6983 = (C0630.m2566("ܺۨ") + i17) * (-59);
                        i7 = ((iM6983 ^ i18) * (-15559)) ^ (-1524553687);
                        i8 = 607759001;
                        interfaceC5983 = interfaceC5982;
                        i20 = iM6983 ^ i8;
                        i19 = i7;
                        interfaceC5984 = interfaceC5983;
                    }
                    break;
                case -378444228:
                case 1988494608:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM4902 = strM4902;
                    if (!ViewOnClickListenerC1958.m6437(str2, ServiceConnectionC3453.m10568(f21104, 25, 14, i21))) {
                        i25 = i25;
                        iM6984 = (C2105.m6981("ܳܳ") ^ i18) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        str = str2;
                        i9 = ((iM6984 ^ i17) * 5699) ^ 157243267;
                        i10 = 897507926;
                        r10 = r10;
                        int i2114 = iM6984 ^ i10;
                        i19 = i9;
                        i27 = i27;
                        xmlResourceParserC102610 = xmlResourceParserC10269;
                        String str111112 = attributeName;
                        i20 = i2114;
                        attributeName = str111112;
                        String str111113 = str;
                        i25 = i25;
                        strM4902 = strM4902;
                        str2 = str111113;
                    } else {
                        iM2566 = C2105.m6981("۫ܺ") ^ i18;
                        i19 = ((iM2566 ^ i17) * 23191) ^ (-1315544474);
                        i2 = -494717880;
                        i3 = iM2566 ^ i2;
                        i27 = i27;
                        strM4902 = strM4902;
                        str2 = str2;
                        xmlResourceParserC102610 = xmlResourceParserC10269;
                        String str11122 = attributeName;
                        i20 = i3;
                        attributeName = str11122;
                    }
                    break;
                case -354652900:
                case 1378500261:
                    str = str2;
                    i21 = 12476;
                    iM6984 = C0630.m2566("۟ۗ") ^ i18;
                    i9 = ((iM6984 ^ i17) * (-29145)) ^ (-270817295);
                    i10 = 425613938;
                    r10 = r10;
                    int i2115 = iM6984 ^ i10;
                    i19 = i9;
                    i27 = i27;
                    xmlResourceParserC102610 = xmlResourceParserC10269;
                    String str111114 = attributeName;
                    i20 = i2115;
                    attributeName = str111114;
                    String str111115 = str;
                    i25 = i25;
                    strM4902 = strM4902;
                    str2 = str111115;
                    break;
                case -346967896:
                case 902945270:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM4902 = strM4902;
                    if (!ViewOnClickListenerC1958.m6437(str2, C3432.m10488(f21104, 39, 11, i21))) {
                        i25 = i25;
                        iM6984 = (C2105.m6981("ܳܳ") ^ i18) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        str = str2;
                        i9 = ((iM6984 ^ i17) * 5699) ^ 157243267;
                        i10 = 897507926;
                        r10 = r10;
                        int i2116 = iM6984 ^ i10;
                        i19 = i9;
                        i27 = i27;
                        xmlResourceParserC102610 = xmlResourceParserC10269;
                        String str111116 = attributeName;
                        i20 = i2116;
                        attributeName = str111116;
                        String str111117 = str;
                        i25 = i25;
                        strM4902 = strM4902;
                        str2 = str111117;
                    } else {
                        i26 = i25;
                        iM2566 = C0630.m2566("۬֫") ^ i17;
                        i19 = ((iM2566 ^ i18) * 28095) ^ (-365593897);
                        i2 = 396391031;
                        i3 = iM2566 ^ i2;
                        i27 = i27;
                        strM4902 = strM4902;
                        str2 = str2;
                        xmlResourceParserC102610 = xmlResourceParserC10269;
                        String str11123 = attributeName;
                        i20 = i3;
                        attributeName = str11123;
                    }
                    break;
                case -302254573:
                case 849398354:
                    interfaceC5984.accept(xmlResourceParserC102610.m26008(i23));
                    interfaceC5984.accept(xmlResourceParserC102610.m26014(i23));
                    interfaceC5984.accept(xmlResourceParserC102610.m26017(i23));
                    i27 = i27;
                    if (xmlResourceParserC102610.m26023(i23) != i27) {
                        attributeName = attributeName;
                        iM6981 = (i18 - C0630.m2566("᩵ۜ")) * 81;
                        i19 = ((iM6981 ^ i17) * 11073) ^ (-815762842);
                        i4 = 1281695252;
                        i3 = iM6981 ^ i4;
                        i27 = i27;
                        String str11124 = attributeName;
                        i20 = i3;
                        attributeName = str11124;
                    } else {
                        iM6982 = C2105.m6981("ۛ᩵") ^ i17;
                        attributeName = attributeName;
                        i5 = ((iM6982 ^ i18) * (-10683)) ^ 120028294;
                        i6 = 1421714904;
                        int i30 = iM6982 ^ i6;
                        i27 = i27;
                        i19 = i5;
                        attributeName = attributeName;
                        i20 = i30;
                    }
                    break;
                case -133617486:
                case -71918379:
                    interfaceC5982 = interfaceC5984;
                    c23739.f76863.add(i24);
                    if (c23739.f76865 != null) {
                        interfaceC5984 = interfaceC5982;
                        i27 = i27;
                        attributeName = attributeName;
                        iM6981 = (i18 - C0630.m2566("᩵ۜ")) * 81;
                        i19 = ((iM6981 ^ i17) * 11073) ^ (-815762842);
                        i4 = 1281695252;
                        i3 = iM6981 ^ i4;
                        i27 = i27;
                        String str11125 = attributeName;
                        i20 = i3;
                        attributeName = str11125;
                    } else {
                        iM6983 = C0630.m2566("ۡۙ") ^ i18;
                        i7 = ((iM6983 ^ i17) * 23951) ^ (-542601755);
                        i8 = -1440279850;
                        interfaceC5983 = interfaceC5982;
                        i20 = iM6983 ^ i8;
                        i19 = i7;
                        interfaceC5984 = interfaceC5983;
                    }
                    break;
                case -105666345:
                case 566163932:
                    interfaceC5982 = interfaceC5984;
                    if (C0422.m1945(strM6378, C2520.m8030(f21104, 157, 5, i21))) {
                        iM6983 = (C0630.m2566("ۙۙ") ^ i17) * 53;
                        i7 = ((iM6983 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM6983 = C0630.m2566("᩺۫") ^ i18;
                        i7 = ((iM6983 ^ i17) * 19511) ^ (-1897971037);
                        i8 = -430795304;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case -78834826:
                case 1356177863:
                    interfaceC5982 = interfaceC5984;
                    if (C0050.m938(strM6378, C7811.m20837(f21104, 200, 9, i21))) {
                        iM6983 = (C0630.m2566("ۙۙ") ^ i17) * 53;
                        i7 = ((iM6983 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM6983 = C0630.m2566("ۧۘ") ^ i18;
                        i7 = ((iM6983 ^ i17) * (-1455)) ^ (-1336987988);
                        i8 = -960399010;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case 63007855:
                case 640653964:
                    InterfaceC5982 interfaceC5985 = interfaceC5984;
                    int attributeNameResource = (xmlResourceParserC102610.getAttributeNameResource(i23) >>> 24) & 255;
                    if (attributeNameResource > r10) {
                        iM2568 = C2105.m6981("᩺᩶") ^ i17;
                        i13 = ((iM2568 ^ i18) * 21181) ^ (-85614077);
                        i14 = 2081627342;
                    } else {
                        iM2568 = (C0630.m2566("ᩴ֨") ^ i18) * 57;
                        i13 = ((iM2568 ^ i17) * (-27197)) ^ 1840424792;
                        i14 = -2134266266;
                    }
                    int i31 = iM2568 ^ i14;
                    i15 = attributeNameResource;
                    i19 = i13;
                    interfaceC5983 = interfaceC5985;
                    i20 = i31;
                    interfaceC5984 = interfaceC5983;
                    break;
                case 69309160:
                case 610850003:
                    c23739.f76865 = C20094.m46315(strM4902, attributeName);
                    i27 = i27;
                    attributeName = attributeName;
                    iM6981 = (i18 - C0630.m2566("᩵ۜ")) * 81;
                    i19 = ((iM6981 ^ i17) * 11073) ^ (-815762842);
                    i4 = 1281695252;
                    i3 = iM6981 ^ i4;
                    i27 = i27;
                    String str11126 = attributeName;
                    i20 = i3;
                    attributeName = str11126;
                    break;
                case 73536941:
                case 775577287:
                    interfaceC5982 = interfaceC5984;
                    if (i15 == 0) {
                        iM6983 = C2105.m6981("ᩴ֫") ^ i17;
                        i7 = ((iM6983 ^ i18) * 25757) ^ 1549895359;
                        i8 = 532888356;
                    } else {
                        iM6983 = C2105.m6981("ܿ۟") ^ i18;
                        i7 = ((iM6983 ^ i17) * (-20687)) ^ (-976860491);
                        i8 = 317388440;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case 105524339:
                case 1997771988:
                    i26 = 1;
                    strM4902 = strM4902;
                    iM2566 = C0630.m2566("۬֫") ^ i17;
                    i19 = ((iM2566 ^ i18) * 28095) ^ (-365593897);
                    i2 = 396391031;
                    i3 = iM2566 ^ i2;
                    i27 = i27;
                    strM4902 = strM4902;
                    str2 = str2;
                    xmlResourceParserC102610 = xmlResourceParserC10269;
                    String str11127 = attributeName;
                    i20 = i3;
                    attributeName = str11127;
                    break;
                case 137848874:
                case 926584107:
                    z = true;
                    iM6981 = C0630.m2566("ۙۡ") ^ i17;
                    i19 = ((iM6981 ^ i18) * 2881) ^ 1085684838;
                    i4 = 736524013;
                    i3 = iM6981 ^ i4;
                    i27 = i27;
                    String str11128 = attributeName;
                    i20 = i3;
                    attributeName = str11128;
                    break;
                case 235984527:
                case 725706265:
                    interfaceC5982 = interfaceC5984;
                    if (C1294.m4369(attributeName, C11340.m28025(f21104, 108, 31, i21))) {
                        iM6983 = C2105.m6981("ܿ۟") ^ i18;
                        i7 = ((iM6983 ^ i17) * (-20687)) ^ (-976860491);
                        i8 = 317388440;
                    } else {
                        iM6983 = (i18 - C0630.m2566("ۗۨ")) * (-119);
                        i7 = ((iM6983 ^ i17) * 3343) ^ (-144120178);
                        i8 = -1089556801;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case 255900848:
                case 1837379876:
                    i26 = 0;
                    strM4902 = strM4902;
                    iM2566 = C0630.m2566("۬֫") ^ i17;
                    i19 = ((iM2566 ^ i18) * 28095) ^ (-365593897);
                    i2 = 396391031;
                    i3 = iM2566 ^ i2;
                    i27 = i27;
                    strM4902 = strM4902;
                    str2 = str2;
                    xmlResourceParserC102610 = xmlResourceParserC10269;
                    String str11129 = attributeName;
                    i20 = i3;
                    attributeName = str11129;
                    break;
                case 281870859:
                case 1214712852:
                    interfaceC5982 = interfaceC5984;
                    if (C0050.m938(strM6378, C0714.m2816(f21104, BERTags.FLAGS, 4, i21))) {
                        iM6983 = (C0630.m2566("ۙۙ") ^ i17) * 53;
                        i7 = ((iM6983 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM6983 = (C0630.m2566("ܽۤ") ^ i18) * 19;
                        i7 = ((iM6983 ^ i17) * (-13463)) ^ 987830881;
                        i8 = -889631357;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case 348462442:
                case 1682102411:
                    interfaceC5982 = interfaceC5984;
                    if (z) {
                        iM6983 = C2105.m6981("۟ܶ") ^ i18;
                        i7 = ((iM6983 ^ i17) * (-4545)) ^ (-230032480);
                        i8 = 518549786;
                    } else {
                        iM6983 = C2105.m6981("ܿ۟") ^ i18;
                        i7 = ((iM6983 ^ i17) * (-20687)) ^ (-976860491);
                        i8 = 317388440;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case 388736294:
                case 736981375:
                    interfaceC5982 = interfaceC5984;
                    if (C9445.m24273(xmlResourceParserC102610.getAttributeValue(i23))) {
                        iM6983 = C2105.m6981("ܰ֨") ^ i17;
                        i7 = ((iM6983 ^ i18) * (-11129)) ^ (-1387873425);
                        i8 = 47787264;
                    } else {
                        iM6983 = C2105.m6981("ܿ۟") ^ i18;
                        i7 = ((iM6983 ^ i17) * (-20687)) ^ (-976860491);
                        i8 = 317388440;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case 390038659:
                case 1607504051:
                    i26 = 6;
                    strM4902 = strM4902;
                    iM2566 = C0630.m2566("۬֫") ^ i17;
                    i19 = ((iM2566 ^ i18) * 28095) ^ (-365593897);
                    i2 = 396391031;
                    i3 = iM2566 ^ i2;
                    i27 = i27;
                    strM4902 = strM4902;
                    str2 = str2;
                    xmlResourceParserC102610 = xmlResourceParserC10269;
                    String str111210 = attributeName;
                    i20 = i3;
                    attributeName = str111210;
                    break;
                case 453905139:
                case 2047676265:
                    i26 = 5;
                    strM4902 = strM4902;
                    iM2566 = C0630.m2566("۬֫") ^ i17;
                    i19 = ((iM2566 ^ i18) * 28095) ^ (-365593897);
                    i2 = 396391031;
                    i3 = iM2566 ^ i2;
                    i27 = i27;
                    strM4902 = strM4902;
                    str2 = str2;
                    xmlResourceParserC102610 = xmlResourceParserC10269;
                    String str111211 = attributeName;
                    i20 = i3;
                    attributeName = str111211;
                    break;
                case 492864214:
                case 2132230727:
                    interfaceC5984.accept(xmlResourceParserC10269.m26019());
                    break;
                case 502165791:
                case 1825371130:
                    i26 = 3;
                    strM4902 = strM4902;
                    iM2566 = C0630.m2566("۬֫") ^ i17;
                    i19 = ((iM2566 ^ i18) * 28095) ^ (-365593897);
                    i2 = 396391031;
                    i3 = iM2566 ^ i2;
                    i27 = i27;
                    strM4902 = strM4902;
                    str2 = str2;
                    xmlResourceParserC102610 = xmlResourceParserC10269;
                    String str111212 = attributeName;
                    i20 = i3;
                    attributeName = str111212;
                    break;
                case 507649994:
                case 522238061:
                    interfaceC5982 = interfaceC5984;
                    if (c4488.mo2422(iM26015)) {
                        obj = obj2;
                        iM6983 = C0630.m2566("ܰ֫") ^ i18;
                        i7 = ((iM6983 ^ i17) * 30757) ^ (-1558797455);
                        i8 = -724911051;
                    } else {
                        iM6983 = C2105.m6981("ܰۤ") ^ i17;
                        i7 = ((iM6983 ^ i18) * 24979) ^ 1636669470;
                        i8 = 508186204;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case 592118954:
                case 1746842740:
                    interfaceC5982 = interfaceC5984;
                    if (C0422.m1945(strM6378, C7106.m19110(f21104, 167, 4, i21))) {
                        iM6983 = (C0630.m2566("ۙۙ") ^ i17) * 53;
                        i7 = ((iM6983 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM6983 = C0630.m2566("۠֫") ^ i18;
                        i7 = ((iM6983 ^ i17) * (-26409)) ^ 267182805;
                        i8 = 1420480301;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case 600367847:
                case 1518682707:
                    interfaceC5982 = interfaceC5984;
                    c23739 = (C23739) obj;
                    attributeName = xmlResourceParserC102610.getAttributeName(i23);
                    int attributeNameResource2 = xmlResourceParserC102610.getAttributeNameResource(i23);
                    strM4902 = C1420.m4902(f21104, 75, 8, i21);
                    switch (attributeNameResource2) {
                        case R.attr.label:
                            iM6983 = C0630.m2566("ۗᩳ") ^ i17;
                            i7 = ((iM6983 ^ i18) * 5191) ^ (-312845205);
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
                            iM6983 = (C2105.m6981("ۛۛ") + i17) * 77;
                            i7 = ((iM6983 ^ i18) * (-13961)) ^ (-731280397);
                            i8 = -1371528380;
                            break;
                        default:
                            iM6983 = C0630.m2566("۟ۤ") ^ i18;
                            i7 = ((iM6983 ^ i17) * 6293) ^ 661741000;
                            i8 = -1920029289;
                            break;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case 852785728:
                case 2124462903:
                    interfaceC5982 = interfaceC5984;
                    if (C0050.m938(strM6378, RunnableC1937.m6385(f21104, 242, 3, i21))) {
                        iM6983 = (C0630.m2566("ۙۙ") ^ i17) * 53;
                        i7 = ((iM6983 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM6983 = (C0630.m2566("۬ܳ") + i17) * 43;
                        i7 = ((iM6983 ^ i18) * (-7027)) ^ 364225739;
                        i8 = 719888212;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case 1159102509:
                case 1914040541:
                    interfaceC5982 = interfaceC5984;
                    if (C0422.m1945(strM6378, C2126.m7036(f21104, 228, 7, i21))) {
                        iM6983 = (C0630.m2566("ۙۙ") ^ i17) * 53;
                        i7 = ((iM6983 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM6983 = C0630.m2566("ܽۙ") ^ i18;
                        i7 = ((iM6983 ^ i17) * (-30197)) ^ 1658720835;
                        i8 = 744401101;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case 1217314706:
                case 1234914757:
                    interfaceC5982 = interfaceC5984;
                    if (C0422.m1945(strM6378, C3019.m9250(f21104, 213, 11, i21))) {
                        iM6983 = (C0630.m2566("ۙۙ") ^ i17) * 53;
                        i7 = ((iM6983 ^ i18) * (-16713)) ^ (-86506335);
                        i8 = 821275734;
                    } else {
                        iM6983 = (i17 - C0630.m2566("ۜۧ")) * 53;
                        i7 = ((iM6983 ^ i18) * 12933) ^ (-1775345110);
                        i8 = -966368793;
                    }
                    interfaceC5983 = interfaceC5982;
                    i20 = iM6983 ^ i8;
                    i19 = i7;
                    interfaceC5984 = interfaceC5983;
                    break;
                case 1221677231:
                case 1330817817:
                    break;
                case 1234938243:
                case 1365077651:
                    attributeName = attributeName;
                    i27 = i27;
                    String str22 = str2;
                    strM4902 = strM4902;
                    i25 = i25;
                    str = str22;
                    if (i != i27) {
                        iM6984 = (C0630.m2566("ᩳ۟") ^ i18) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i9 = ((iM6984 ^ i17) * 10913) ^ 746501099;
                        i10 = -561897174;
                        r10 = r10;
                    } else {
                        iM6984 = (C0630.m2566("᩷᩷") + i17) * (-113);
                        i9 = ((iM6984 ^ i18) * (-1467)) ^ (-1380596709);
                        i10 = -849877878;
                        r10 = r10;
                    }
                    int i2117 = iM6984 ^ i10;
                    i19 = i9;
                    i27 = i27;
                    xmlResourceParserC102610 = xmlResourceParserC10269;
                    String str111118 = attributeName;
                    i20 = i2117;
                    attributeName = str111118;
                    String str111119 = str;
                    i25 = i25;
                    strM4902 = strM4902;
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
                        strM4902 = strM4902;
                        i25 = i25;
                        str = str23;
                        iM6984 = (C0630.m2566("᩷᩷") + i17) * (-113);
                        i9 = ((iM6984 ^ i18) * (-1467)) ^ (-1380596709);
                        i10 = -849877878;
                        r10 = r10;
                        int i2118 = iM6984 ^ i10;
                        i19 = i9;
                        i27 = i27;
                        xmlResourceParserC102610 = xmlResourceParserC10269;
                        String str1111110 = attributeName;
                        i20 = i2118;
                        attributeName = str1111110;
                        String str1111111 = str;
                        i25 = i25;
                        strM4902 = strM4902;
                        str2 = str1111111;
                    } else {
                        iM6982 = C0630.m2566("ᩴۢ") ^ i17;
                        attributeCount = i32;
                        i5 = ((iM6982 ^ i18) * 11811) ^ 2000847837;
                        i6 = 1544030650;
                        int i33 = iM6982 ^ i6;
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
                    strM4902 = strM4902;
                    i25 = i25;
                    str = str24;
                    short s = f21104[0];
                    if (((s * s) + 386358336) - (39312 * s) >= 0) {
                        iM6984 = C2105.m6981("ܿۖ") ^ i17;
                        i9 = ((iM6984 ^ i18) * 25055) ^ 1127001994;
                        i10 = -472245099;
                        r10 = r10;
                    } else {
                        iM6984 = (C2105.m6981("ۡۧ") ^ i18) * (-93);
                        i9 = ((iM6984 ^ i17) * (-24881)) ^ 1698968382;
                        i10 = -1889724605;
                        r10 = r10;
                    }
                    int i2119 = iM6984 ^ i10;
                    i19 = i9;
                    i27 = i27;
                    xmlResourceParserC102610 = xmlResourceParserC10269;
                    String str1111112 = attributeName;
                    i20 = i2119;
                    attributeName = str1111112;
                    String str1111113 = str;
                    i25 = i25;
                    strM4902 = strM4902;
                    str2 = str1111113;
                    break;
                case 1386250735:
                case 2028279429:
                    c23739.f76865 = C20094.m46315(strM4902, attributeName);
                    i27 = i27;
                    attributeName = attributeName;
                    iM6981 = (i18 - C0630.m2566("᩵ۜ")) * 81;
                    i19 = ((iM6981 ^ i17) * 11073) ^ (-815762842);
                    i4 = 1281695252;
                    i3 = iM6981 ^ i4;
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
                    strM4902 = strM4902;
                    i25 = i25;
                    str = str25;
                    r9 = r10;
                    if (C0798.m3007(prefix) == 0) {
                        iM6984 = C2105.m6981("ۜܳ") ^ i18;
                        i9 = ((iM6984 ^ i17) * (-19301)) ^ 1489603415;
                        i10 = 1829617058;
                        r10 = r9;
                    } else {
                        iM6984 = (C2105.m6981("ۨܽ") ^ i17) * (-119);
                        i9 = ((iM6984 ^ i18) * (-23169)) ^ 468356565;
                        i10 = -2007252300;
                        r10 = r10;
                    }
                    int i21110 = iM6984 ^ i10;
                    i19 = i9;
                    i27 = i27;
                    xmlResourceParserC102610 = xmlResourceParserC10269;
                    String str1111114 = attributeName;
                    i20 = i21110;
                    attributeName = str1111114;
                    String str1111115 = str;
                    i25 = i25;
                    strM4902 = strM4902;
                    str2 = str1111115;
                    break;
                default:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM4902 = strM4902;
                    if (!C1294.m4369(str2, C22628.m50602(f21104, 17, 8, i21))) {
                        i25 = i25;
                        iM6984 = (C2105.m6981("ܳܳ") ^ i18) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        str = str2;
                        i9 = ((iM6984 ^ i17) * 5699) ^ 157243267;
                        i10 = 897507926;
                        r10 = r10;
                        int i21111 = iM6984 ^ i10;
                        i19 = i9;
                        i27 = i27;
                        xmlResourceParserC102610 = xmlResourceParserC10269;
                        String str1111116 = attributeName;
                        i20 = i21111;
                        attributeName = str1111116;
                        String str1111117 = str;
                        i25 = i25;
                        strM4902 = strM4902;
                        str2 = str1111117;
                    } else {
                        iM2566 = (C0630.m2566("ۢ֡") ^ i18) * 69;
                        i19 = ((iM2566 ^ i17) * 1311) ^ 1457351238;
                        i2 = -322328566;
                        i3 = iM2566 ^ i2;
                        i27 = i27;
                        strM4902 = strM4902;
                        str2 = str2;
                        xmlResourceParserC102610 = xmlResourceParserC10269;
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
