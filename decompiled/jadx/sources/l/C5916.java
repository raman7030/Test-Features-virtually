package l;

import android.text.GetChars;
import android.text.Selection;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۛ۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9A1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5916 {

    /* JADX INFO: renamed from: ܿܺ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f18152 = {1698, 12259, 12268, 12256, 12264, 12286, 12281, 12287, 12260, 12259, 12266, 12192, 12268, 12287, 12287, 12268, 12276, 12286, 12281, 12287, 12260, 12259, 12266, 12285, 12257, 12280, 12287, 12268, 12257, 12286, 12240, 12246, 12260, 12281, 12264, 12256, 12268, 12287, 12287, 12268, 12276, 12215, 12284, 12280, 12268, 12259, 12281, 12260, 12281, 12276, 12285, 12257, 12280, 12287, 12268, 12257, 12286, 12215, 3289, -29674, -29695, -29673, -29685, -29679, -29674, -29689, -29695, -29673, -29673, -29680, -29674, -29683, -29686, -29693, -29673, -29680, -29674, -29683, -29686, -29693, -29623, -29691, -29674, -29674, -29691, -29667, -29676, -29688, -29679, -29674, -29691, -29688, -29673, -29686, -29691, -29687, -29695, 2232, 29521, 29486};

    /* JADX WARN: Code duplicated, block: B:132:0x06e9 A[PHI: r3 r4 r8 r10 r12 r17 r21 r27 r31 r34 r35
      0x06e9: PHI (r3v45 l.᩵ۘܽ) = (r3v42 l.᩵ۘܽ), (r3v43 l.᩵ۘܽ), (r3v44 l.᩵ۘܽ), (r3v46 l.᩵ۘܽ) binds: [B:125:0x0691, B:117:0x0643, B:113:0x060a, B:108:0x05c4] A[DONT_GENERATE, DONT_INLINE]
      0x06e9: PHI (r4v37 java.lang.String) = (r4v34 java.lang.String), (r4v35 java.lang.String), (r4v36 java.lang.String), (r4v40 java.lang.String) binds: [B:125:0x0691, B:117:0x0643, B:113:0x060a, B:108:0x05c4] A[DONT_GENERATE, DONT_INLINE]
      0x06e9: PHI (r8v25 java.lang.StringBuilder) = 
      (r8v22 java.lang.StringBuilder)
      (r8v23 java.lang.StringBuilder)
      (r8v24 java.lang.StringBuilder)
      (r8v26 java.lang.StringBuilder)
     binds: [B:125:0x0691, B:117:0x0643, B:113:0x060a, B:108:0x05c4] A[DONT_GENERATE, DONT_INLINE]
      0x06e9: PHI (r10v4 java.lang.String) = (r10v3 java.lang.String), (r10v2 java.lang.String), (r10v2 java.lang.String), (r10v2 java.lang.String) binds: [B:125:0x0691, B:117:0x0643, B:113:0x060a, B:108:0x05c4] A[DONT_GENERATE, DONT_INLINE]
      0x06e9: PHI (r12v35 java.lang.Object) = (r12v32 java.lang.Object), (r12v33 java.lang.Object), (r12v34 java.lang.Object), (r12v36 java.lang.Object) binds: [B:125:0x0691, B:117:0x0643, B:113:0x060a, B:108:0x05c4] A[DONT_GENERATE, DONT_INLINE]
      0x06e9: PHI (r17v4 byte) = (r17v3 byte), (r17v2 byte), (r17v2 byte), (r17v2 byte) binds: [B:125:0x0691, B:117:0x0643, B:113:0x060a, B:108:0x05c4] A[DONT_GENERATE, DONT_INLINE]
      0x06e9: PHI (r21v22 l.᩵ۘܽ) = (r21v19 l.᩵ۘܽ), (r21v20 l.᩵ۘܽ), (r21v21 l.᩵ۘܽ), (r21v23 l.᩵ۘܽ) binds: [B:125:0x0691, B:117:0x0643, B:113:0x060a, B:108:0x05c4] A[DONT_GENERATE, DONT_INLINE]
      0x06e9: PHI (r27v22 short[]) = (r27v18 short[]), (r27v20 short[]), (r27v21 short[]), (r27v26 short[]) binds: [B:125:0x0691, B:117:0x0643, B:113:0x060a, B:108:0x05c4] A[DONT_GENERATE, DONT_INLINE]
      0x06e9: PHI (r31v23 int) = (r31v19 int), (r31v21 int), (r31v22 int), (r31v24 int) binds: [B:125:0x0691, B:117:0x0643, B:113:0x060a, B:108:0x05c4] A[DONT_GENERATE, DONT_INLINE]
      0x06e9: PHI (r34v28 java.lang.StringBuilder) = 
      (r34v25 java.lang.StringBuilder)
      (r34v26 java.lang.StringBuilder)
      (r34v27 java.lang.StringBuilder)
      (r34v29 java.lang.StringBuilder)
     binds: [B:125:0x0691, B:117:0x0643, B:113:0x060a, B:108:0x05c4] A[DONT_GENERATE, DONT_INLINE]
      0x06e9: PHI (r35v19 l.᩵ۘܽ) = (r35v16 l.᩵ۘܽ), (r35v17 l.᩵ۘܽ), (r35v18 l.᩵ۘܽ), (r35v20 l.᩵ۘܽ) binds: [B:125:0x0691, B:117:0x0643, B:113:0x060a, B:108:0x05c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0153, code lost:
    
        if (l.ViewOnClickListenerC1958.f6529 <= 0) goto L28;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:124:0x068e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:82:0x0427. Please report as an issue. */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map m16576(CharSequence charSequence) throws Throwable {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        int i5;
        C19220 c19220;
        int iM6982;
        int i6;
        int i7;
        int i8;
        C19220 c19221;
        StringBuilder sb;
        StringBuilder sb2;
        String str;
        Object obj;
        C19220 c19222;
        short[] sArr;
        C19220 c19223;
        int iM6983;
        int i9;
        int i10;
        short[] sArr2;
        int iM2567;
        int i11;
        int i12;
        int iM2568;
        int i13;
        int i14;
        int i15;
        String str2;
        int iM2569;
        int i16;
        int iM6984;
        int i17;
        int i18;
        String str3;
        C19220 c19224;
        Iterator itM44338;
        int i19;
        String str4;
        int iM25610;
        int i20;
        int i21;
        int iM25611;
        int i22;
        int i23;
        CharSequence charSequence2 = charSequence;
        int i24 = 2122646456;
        int i25 = C1420.f5096;
        int i26 = C1294.f4556;
        int iM25612 = C0630.m2566("֫ܽ") ^ i26;
        int i27 = ((iM25612 ^ i25) * 25177) ^ (-439537464);
        int i28 = iM25612 ^ (-315914410);
        Iterator itM44337 = null;
        C19220 c19225 = null;
        String str5 = null;
        Object obj2 = null;
        C19220 c19226 = null;
        StringBuilder sbM9834 = null;
        C19220 c19227 = null;
        String strM43026 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i29 = 0;
        byte b = 0;
        int i30 = 0;
        short s = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        C13000 c13000 = null;
        C7744 c7744Mo26556 = null;
        C18514 c18514M44343 = null;
        String strM43027 = null;
        String str6 = null;
        Iterator itM44339 = null;
        short[] sArr5 = null;
        LinkedHashMap linkedHashMap = null;
        int i34 = 0;
        Throwable th = null;
        String str7 = null;
        Iterator it = null;
        StringBuilder sbM9835 = null;
        byte b2 = 0;
        String strM1840 = null;
        C18514 c18514M44344 = null;
        Map mapM16576 = null;
        int i35 = 0;
        while (true) {
            i24 = i28 ^ (i27 & (((i24 ^ i25) * 9273) >> 31));
            switch (i24) {
                case -2076949169:
                case 1889653046:
                    C2272.m7503();
                    if (C3019.f9544 >= 0) {
                        c19227 = c19227;
                        sbM9835 = sbM9835;
                        sbM9834 = sbM9834;
                        obj2 = obj2;
                        c19226 = c19226;
                        c19225 = c19225;
                        i34 = i34;
                        sArr5 = sArr5;
                        i5 = i32;
                        iM6982 = (i25 - C0630.m2566("۬ۚ")) * 49;
                        i6 = ((iM6982 ^ i26) * (-28083)) ^ (-166128930);
                        i7 = -1662419688;
                        i28 = iM6982 ^ i7;
                        i27 = i6;
                        sArr3 = sArr3;
                        i32 = i5;
                        c19226 = c19226;
                        sArr5 = sArr5;
                        c19227 = c19227;
                        str5 = str5;
                        sbM9834 = sbM9834;
                        i34 = i34;
                        c19225 = c19225;
                        sbM9835 = sbM9835;
                        obj2 = obj2;
                    } else {
                        iM6981 = C2105.m6981("ۙ֡") ^ i26;
                        i = ((iM6981 ^ i25) * (-9421)) ^ (-307533572);
                        i2 = -1256114123;
                        i28 = iM6981 ^ i2;
                        i27 = i;
                    }
                    break;
                case -1999671276:
                case -1323761608:
                    c19227 = c19227;
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    sArr3 = sArr3;
                    c19226 = c19226;
                    c13000 = c13000;
                    c19225 = c19225;
                    i34 = i34;
                    str5 = str5;
                    sArr5 = sArr5;
                    i32 = i32;
                    i31 = s + 1;
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C0630.m2566("᩷᩹") ^ i25;
                        i3 = ((iM2566 ^ i26) * 16097) ^ 69722224;
                        i4 = 1280424927;
                    } else {
                        iM2566 = (C2105.m6981("᩹۟") + i25) * 9;
                        i3 = ((iM2566 ^ i26) * 28335) ^ (-1586148276);
                        i4 = -690047526;
                    }
                    i28 = iM2566 ^ i4;
                    i27 = i3;
                    c13000 = c13000;
                    sArr3 = sArr3;
                    i32 = i32;
                    c19226 = c19226;
                    sArr5 = sArr5;
                    c19227 = c19227;
                    charSequence2 = charSequence;
                    str5 = str5;
                    sbM9834 = sbM9834;
                    i34 = i34;
                    c19225 = c19225;
                    sbM9835 = sbM9835;
                    obj2 = obj2;
                    break;
                case -1960034572:
                case 423033048:
                    c19227 = c19227;
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    sArr3 = sArr3;
                    c19226 = c19226;
                    c13000 = c13000;
                    c19225 = c19225;
                    i34 = i34;
                    str5 = str5;
                    sArr5 = sArr5;
                    i32 = i32;
                    if (charSequence2 instanceof InterfaceC20445) {
                        iM2566 = C2105.m6981("᩶۫") ^ i26;
                        i3 = ((iM2566 ^ i25) * 10467) ^ 665310522;
                        i4 = -1769650778;
                    } else {
                        iM2566 = (C0630.m2566("ۢۢ") ^ i25) * 3;
                        i3 = ((iM2566 ^ i26) * 25359) ^ (-1743735934);
                        i4 = -1191149789;
                    }
                    i28 = iM2566 ^ i4;
                    i27 = i3;
                    c13000 = c13000;
                    sArr3 = sArr3;
                    i32 = i32;
                    c19226 = c19226;
                    sArr5 = sArr5;
                    c19227 = c19227;
                    charSequence2 = charSequence;
                    str5 = str5;
                    sbM9834 = sbM9834;
                    i34 = i34;
                    c19225 = c19225;
                    sbM9835 = sbM9835;
                    obj2 = obj2;
                    break;
                case -1959345468:
                case 1918789727:
                    c19227 = c19227;
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    sArr3 = sArr3;
                    c19226 = c19226;
                    c19225 = c19225;
                    i34 = i34;
                    str5 = str5;
                    sArr5 = sArr5;
                    i5 = i32;
                    linkedHashMap = new LinkedHashMap();
                    C13000 c13001 = new C13000(charSequence2);
                    if (RunnableC0588.m2441() >= 0) {
                        c13000 = c13001;
                        iM6982 = (i25 - C0630.m2566("۬ۚ")) * 49;
                        i6 = ((iM6982 ^ i26) * (-28083)) ^ (-166128930);
                        i7 = -1662419688;
                        i28 = iM6982 ^ i7;
                        i27 = i6;
                    } else {
                        int iM6985 = (C2105.m6981("᩸ܶ") ^ i25) * (-103);
                        c13000 = c13001;
                        i27 = ((iM6985 ^ i26) * (-21717)) ^ (-811875555);
                        i28 = iM6985 ^ (-170730075);
                    }
                    sArr3 = sArr3;
                    i32 = i5;
                    c19226 = c19226;
                    sArr5 = sArr5;
                    c19227 = c19227;
                    str5 = str5;
                    sbM9834 = sbM9834;
                    i34 = i34;
                    c19225 = c19225;
                    sbM9835 = sbM9835;
                    obj2 = obj2;
                    break;
                case -1932594438:
                case 1915777230:
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    C19220 c19228 = c19225;
                    C13843.putIfAbsent(linkedHashMap, strM43027, m16577(charSequence2, c19228));
                    c19220 = c19228;
                    i5 = i32;
                    int iM25613 = (C0630.m2566("ۡۧ") + i25) * 83;
                    i28 = iM25613 ^ (-1312318539);
                    sArr3 = sArr3;
                    i32 = i5;
                    i27 = ((iM25613 ^ i26) * 77) ^ 1687041873;
                    sArr5 = sArr5;
                    c19227 = c19227;
                    c13000 = c13000;
                    str5 = str5;
                    c19226 = c19226;
                    i34 = i34;
                    c19225 = c19220;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    sbM9835 = sbM9835;
                    break;
                case -1809277627:
                case 1299372853:
                    C7106.m19109(c7744Mo26556);
                    return mapM16576;
                case -1740054562:
                case -1049358706:
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    c19226 = c19226;
                    C19220 c19229 = c19225;
                    i34 = i34;
                    short[] sArr6 = sArr4;
                    int i36 = i33;
                    String strM6988 = C2105.m6988(sArr6, i36, 1, i35);
                    c19227 = c19227;
                    String strM3502 = C1005.m3502(f18152, 32, 4, i35);
                    switch (b) {
                        case 0:
                            iM6984 = (C2105.m6981("᩹ᩴ") ^ i25) * (-89);
                            i17 = ((iM6984 ^ i26) * 2673) ^ 1495713975;
                            i18 = 836285107;
                            i28 = iM6984 ^ i18;
                            i33 = i36;
                            i34 = i34;
                            str7 = strM6988;
                            sArr4 = sArr6;
                            str6 = strM3502;
                            c19225 = c19229;
                            i27 = i17;
                            obj2 = obj2;
                            c19226 = c19226;
                            c19227 = c19227;
                            sbM9834 = sbM9834;
                            break;
                        case 1:
                            iM6984 = C0630.m2566("۟ᩳ") ^ i26;
                            i17 = ((iM6984 ^ i25) * (-1989)) ^ (-2109518083);
                            i18 = -583521903;
                            i28 = iM6984 ^ i18;
                            i33 = i36;
                            i34 = i34;
                            str7 = strM6988;
                            sArr4 = sArr6;
                            str6 = strM3502;
                            c19225 = c19229;
                            i27 = i17;
                            obj2 = obj2;
                            c19226 = c19226;
                            c19227 = c19227;
                            sbM9834 = sbM9834;
                            break;
                        case 2:
                            iM6984 = C0630.m2566("ۛ֫") ^ i25;
                            i17 = ((iM6984 ^ i26) * 28021) ^ (-175789709);
                            i18 = 1662074908;
                            i28 = iM6984 ^ i18;
                            i33 = i36;
                            i34 = i34;
                            str7 = strM6988;
                            sArr4 = sArr6;
                            str6 = strM3502;
                            c19225 = c19229;
                            i27 = i17;
                            obj2 = obj2;
                            c19226 = c19226;
                            c19227 = c19227;
                            sbM9834 = sbM9834;
                            break;
                        default:
                            i33 = i36;
                            str5 = str5;
                            str7 = strM6988;
                            sArr4 = sArr6;
                            sArr3 = sArr3;
                            str6 = strM3502;
                            c19220 = c19229;
                            c13000 = c13000;
                            i5 = i32;
                            int iM25614 = (C0630.m2566("ۡۧ") + i25) * 83;
                            i28 = iM25614 ^ (-1312318539);
                            sArr3 = sArr3;
                            i32 = i5;
                            i27 = ((iM25614 ^ i26) * 77) ^ 1687041873;
                            sArr5 = sArr5;
                            c19227 = c19227;
                            c13000 = c13000;
                            str5 = str5;
                            c19226 = c19226;
                            i34 = i34;
                            c19225 = c19220;
                            sbM9834 = sbM9834;
                            obj2 = obj2;
                            break;
                    }
                    sbM9835 = sbM9835;
                    break;
                case -1524949357:
                case -1260357072:
                    c19227 = c19227;
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    sArr3 = sArr3;
                    c19226 = c19226;
                    c13000 = c13000;
                    c19225 = c19225;
                    i34 = i34;
                    str5 = str5;
                    sArr5 = sArr5;
                    i32 = i32;
                    if ((i31 * i31) - ((s * 2) + 1) >= 0) {
                        iM2566 = C0630.m2566("ܳ۟") ^ i26;
                        i3 = ((iM2566 ^ i25) * 3033) ^ 990358048;
                        i4 = -1367546497;
                    } else {
                        iM2566 = C0630.m2566("֡۟") ^ i25;
                        i3 = ((iM2566 ^ i26) * (-2837)) ^ (-1298864445);
                        i4 = 1611730215;
                    }
                    i28 = iM2566 ^ i4;
                    i27 = i3;
                    c13000 = c13000;
                    sArr3 = sArr3;
                    i32 = i32;
                    c19226 = c19226;
                    sArr5 = sArr5;
                    c19227 = c19227;
                    charSequence2 = charSequence;
                    str5 = str5;
                    sbM9834 = sbM9834;
                    i34 = i34;
                    c19225 = c19225;
                    sbM9835 = sbM9835;
                    obj2 = obj2;
                    break;
                case -1510142043:
                case 601580525:
                    i35 = 7798;
                    iM2566 = (C2105.m6981("᩻ᩳ") + i26) * (-87);
                    i3 = ((iM2566 ^ i25) * 7577) ^ (-1151704325);
                    i4 = -1680025437;
                    i28 = iM2566 ^ i4;
                    i27 = i3;
                    c13000 = c13000;
                    sArr3 = sArr3;
                    i32 = i32;
                    c19226 = c19226;
                    sArr5 = sArr5;
                    c19227 = c19227;
                    charSequence2 = charSequence;
                    str5 = str5;
                    sbM9834 = sbM9834;
                    i34 = i34;
                    c19225 = c19225;
                    sbM9835 = sbM9835;
                    obj2 = obj2;
                    break;
                case -1501728434:
                case 2006659782:
                    break;
                case -1358538906:
                case 133481613:
                    c19227 = c19227;
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    c19226 = c19226;
                    c19225 = c19225;
                    i34 = i34;
                    str2 = str6;
                    try {
                        C1916.m6312(c7744Mo26556);
                        iM2569 = C0630.m2566("ۘۚ") ^ i26;
                        i15 = ((iM2569 ^ i25) * 1673) ^ (-2020794313);
                        i16 = 1552310219;
                        i28 = iM2569 ^ i16;
                        str6 = str2;
                        i27 = i15;
                        obj2 = obj2;
                    } catch (Throwable th2) {
                        int iM6986 = (i25 - C2105.m6981("ۚۢ")) * (-63);
                        i28 = iM6986 ^ 1705027423;
                        obj2 = th2;
                        str6 = str2;
                        i27 = ((iM6986 ^ i26) * 5255) ^ (-217500225);
                    }
                    i34 = i34;
                    c19227 = c19227;
                    c19225 = c19225;
                    c19226 = c19226;
                    sbM9834 = sbM9834;
                    sbM9835 = sbM9835;
                    break;
                case -1252350694:
                case -131584981:
                    C0237.m1481();
                    if (C1047.f3863 < 0) {
                        sbM9835 = sbM9835;
                        sbM9834 = sbM9834;
                        c19226 = c19226;
                        c19225 = c19225;
                        i34 = i34;
                        str5 = str5;
                        sArr5 = sArr5;
                        i32 = i32;
                        iM2566 = C0630.m2566("᩷᩹") ^ i25;
                        i3 = ((iM2566 ^ i26) * 16097) ^ 69722224;
                        i4 = 1280424927;
                        i28 = iM2566 ^ i4;
                        i27 = i3;
                        c13000 = c13000;
                        sArr3 = sArr3;
                        i32 = i32;
                        c19226 = c19226;
                        sArr5 = sArr5;
                        c19227 = c19227;
                        charSequence2 = charSequence;
                        str5 = str5;
                        sbM9834 = sbM9834;
                        i34 = i34;
                        c19225 = c19225;
                        sbM9835 = sbM9835;
                        obj2 = obj2;
                    } else {
                        c19227 = c19227;
                        sbM9835 = sbM9835;
                        sbM9834 = sbM9834;
                        obj2 = obj2;
                        c19226 = c19226;
                        c19225 = c19225;
                        i34 = i34;
                        str2 = str6;
                        iM2569 = (C2105.m6981("᩺֫") + i26) * 7;
                        i15 = ((iM2569 ^ i25) * (-6163)) ^ (-1886531946);
                        i16 = 782011973;
                        i28 = iM2569 ^ i16;
                        str6 = str2;
                        i27 = i15;
                        obj2 = obj2;
                        i34 = i34;
                        c19227 = c19227;
                        c19225 = c19225;
                        c19226 = c19226;
                        sbM9834 = sbM9834;
                        sbM9835 = sbM9835;
                    }
                    break;
                case -1195321385:
                case -713861175:
                    b = 2;
                    sArr2 = sArr5;
                    iM2568 = C0630.m2566("ۡ֡") ^ i25;
                    i13 = ((iM2568 ^ i26) * 16085) ^ (-1506237396);
                    i14 = 2142845805;
                    i28 = iM2568 ^ i14;
                    i27 = i13;
                    obj2 = obj2;
                    sArr5 = sArr2;
                    c19227 = c19227;
                    str5 = str5;
                    i34 = i34;
                    c19225 = c19225;
                    c19226 = c19226;
                    sbM9834 = sbM9834;
                    sbM9835 = sbM9835;
                    break;
                case -1138750914:
                case 1014184473:
                    c19227 = c19227;
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    c19226 = c19226;
                    c19225 = c19225;
                    i34 = i34;
                    str2 = str6;
                    strM1840 = C0382.m1840(f18152, 30, 1, i35);
                    if (C2958.f9394 >= 0) {
                        iM2569 = (C2105.m6981("᩺֫") + i26) * 7;
                        i15 = ((iM2569 ^ i25) * (-6163)) ^ (-1886531946);
                        i16 = 782011973;
                    } else {
                        iM2569 = C0630.m2566("۠۠") ^ i26;
                        i15 = ((iM2569 ^ i25) * (-4697)) ^ (-1768790409);
                        i16 = 2032580327;
                    }
                    i28 = iM2569 ^ i16;
                    str6 = str2;
                    i27 = i15;
                    obj2 = obj2;
                    i34 = i34;
                    c19227 = c19227;
                    c19225 = c19225;
                    c19226 = c19226;
                    sbM9834 = sbM9834;
                    sbM9835 = sbM9835;
                    break;
                case -1083409374:
                case -701571892:
                    c19227 = c19227;
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    c19226 = c19226;
                    c19225 = c19225;
                    i34 = i34;
                    str2 = str6;
                    sArr4 = f18152;
                    i33 = 31;
                    if (C11340.f33930 < 0) {
                        iM2569 = (C0630.m2566("ۛۧ") ^ i26) * (-47);
                        i15 = ((iM2569 ^ i25) * (-5253)) ^ 1217191361;
                        i16 = 470278521;
                        i28 = iM2569 ^ i16;
                        str6 = str2;
                        i27 = i15;
                        obj2 = obj2;
                        i34 = i34;
                        c19227 = c19227;
                        c19225 = c19225;
                        c19226 = c19226;
                        sbM9834 = sbM9834;
                        sbM9835 = sbM9835;
                    } else {
                        c19225 = c19225;
                        str6 = str2;
                        sArr5 = sArr5;
                        i5 = i32;
                        iM6982 = (i25 - C0630.m2566("۬ۚ")) * 49;
                        i6 = ((iM6982 ^ i26) * (-28083)) ^ (-166128930);
                        i7 = -1662419688;
                        i28 = iM6982 ^ i7;
                        i27 = i6;
                        sArr3 = sArr3;
                        i32 = i5;
                        c19226 = c19226;
                        sArr5 = sArr5;
                        c19227 = c19227;
                        str5 = str5;
                        sbM9834 = sbM9834;
                        i34 = i34;
                        c19225 = c19225;
                        sbM9835 = sbM9835;
                        obj2 = obj2;
                    }
                    break;
                case -1039481205:
                case 1820222451:
                    i8 = i34;
                    c19221 = c19227;
                    sb = sbM9835;
                    sb2 = sbM9834;
                    str = str5;
                    obj = obj2;
                    c19222 = c19226;
                    sArr = sArr5;
                    c19223 = (C19220) RunnableC1108.m3791(itM44337);
                    sArr3 = f18152;
                    i32 = 1;
                    if (C1711.f5919) {
                        iM6983 = (C0630.m2566("ۚۗ") ^ i26) * (-123);
                        i9 = ((iM6983 ^ i25) * (-8853)) ^ (-1025607751);
                        i10 = 286709501;
                    } else {
                        iM6983 = C2105.m6981("ᩳ֡") ^ i25;
                        i9 = ((iM6983 ^ i26) * (-28447)) ^ 1983648224;
                        i10 = -1551189812;
                    }
                    i28 = iM6983 ^ i10;
                    obj2 = obj;
                    c19226 = c19222;
                    sArr5 = sArr;
                    str5 = str;
                    sbM9834 = sb2;
                    i34 = i8;
                    sbM9835 = sb;
                    c19225 = c19223;
                    i27 = i9;
                    c19227 = c19221;
                    break;
                case -1035761381:
                case 132810735:
                    c19227 = (C19220) C2272.m7513(itM44339);
                    sbM9835 = sbM9835;
                    c18514M44344 = c19227.m44343(C0798.m3005(f18152, 42, 8, i35));
                    if (c18514M44344 != null) {
                        iM25611 = (C0630.m2566("ܽ᩻") + i26) * 61;
                        i22 = ((iM25611 ^ i25) * 22695) ^ 1275540706;
                        i23 = -1033078709;
                        i28 = iM25611 ^ i23;
                        i27 = i22;
                        sbM9835 = sbM9835;
                    }
                    c19225 = c19225;
                    str4 = str6;
                    int iM6987 = (i25 - C2105.m6981("ܺ֨")) * (-71);
                    i28 = iM6987 ^ 842969876;
                    i27 = ((iM6987 ^ i26) * (-3177)) ^ (-1162696173);
                    obj2 = obj2;
                    c19227 = c19227;
                    str6 = str4;
                    i34 = i34;
                    c19225 = c19225;
                    c19226 = c19226;
                    sbM9834 = sbM9834;
                    sbM9835 = sbM9835;
                    break;
                case -1035570210:
                case -161511628:
                    sbM9835 = sbM9835;
                    i30 = i34 + 1;
                    sbM9834 = sbM9834;
                    C0422.m1944(sbM9834, i34);
                    C3245.m9923(sbM9834, strM1840);
                    if (AbstractC2021.f6743 <= 0) {
                        iM25610 = (i26 - C2105.m6981("۬ۨ")) * (-19);
                        i20 = ((iM25610 ^ i25) * 31051) ^ 553900213;
                        i21 = 1978784197;
                    } else {
                        iM25610 = (C0630.m2566("᩹ܿ") ^ i25) * 25;
                        i20 = ((iM25610 ^ i26) * (-32187)) ^ (-657322544);
                        i21 = -248368528;
                    }
                    i28 = iM25610 ^ i21;
                    sbM9834 = sbM9834;
                    i27 = i20;
                    sbM9835 = sbM9835;
                    break;
                case -973158503:
                case 1276383935:
                    c19227 = c19227;
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    sArr3 = sArr3;
                    c19226 = c19226;
                    c19220 = c19225;
                    i34 = i34;
                    str5 = str5;
                    sArr5 = sArr5;
                    i5 = i32;
                    c13000 = c13000;
                    C19220 c19220M44339 = C19220.m44339((Reader) c13000, false);
                    AbstractC2021.m6565(c19220M44339);
                    itM44337 = C19220.m44337(c19220M44339);
                    int iM25615 = (C0630.m2566("ۡۧ") + i25) * 83;
                    i28 = iM25615 ^ (-1312318539);
                    sArr3 = sArr3;
                    i32 = i5;
                    i27 = ((iM25615 ^ i26) * 77) ^ 1687041873;
                    sArr5 = sArr5;
                    c19227 = c19227;
                    c13000 = c13000;
                    str5 = str5;
                    c19226 = c19226;
                    i34 = i34;
                    c19225 = c19220;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    sbM9835 = sbM9835;
                    break;
                case -931450992:
                case 551240120:
                    sbM9835 = sbM9835;
                    c19225 = c19225;
                    str4 = str6;
                    itM44339 = C19220.m44338(c19225, str4);
                    int iM6988 = (i25 - C2105.m6981("ܺ֨")) * (-71);
                    i28 = iM6988 ^ 842969876;
                    i27 = ((iM6988 ^ i26) * (-3177)) ^ (-1162696173);
                    obj2 = obj2;
                    c19227 = c19227;
                    str6 = str4;
                    i34 = i34;
                    c19225 = c19225;
                    c19226 = c19226;
                    sbM9834 = sbM9834;
                    sbM9835 = sbM9835;
                    break;
                case -835989230:
                case 963025378:
                    C2167.m7155();
                    if (C0964.f3626 != 0) {
                        iM6981 = (C2105.m6981("ᩳ᩵") ^ i25) * (-75);
                        i = ((iM6981 ^ i26) * 17151) ^ (-371169463);
                        i2 = 791095925;
                        i28 = iM6981 ^ i2;
                        i27 = i;
                    } else {
                        c19221 = c19227;
                        sb = sbM9835;
                        sb2 = sbM9834;
                        c19223 = c19225;
                        obj = obj2;
                        c19222 = c19226;
                        i8 = i34;
                        str = str5;
                        sArr = sArr5;
                        iM6983 = (C0630.m2566("ۚۗ") ^ i26) * (-123);
                        i9 = ((iM6983 ^ i25) * (-8853)) ^ (-1025607751);
                        i10 = 286709501;
                        i28 = iM6983 ^ i10;
                        obj2 = obj;
                        c19226 = c19222;
                        sArr5 = sArr;
                        str5 = str;
                        sbM9834 = sb2;
                        i34 = i8;
                        sbM9835 = sb;
                        c19225 = c19223;
                        i27 = i9;
                        c19227 = c19221;
                    }
                    break;
                case -674955558:
                case -66188682:
                    C1420.m4905(sbM9835, strM43026);
                    C3245.m9923(sbM9835, strM1840);
                    C13843.putIfAbsent(linkedHashMap, C0050.m947(sbM9835), m16577(charSequence2, c19227));
                    sbM9835 = sbM9835;
                    c19225 = c19225;
                    str4 = str6;
                    int iM6989 = (i25 - C2105.m6981("ܺ֨")) * (-71);
                    i28 = iM6989 ^ 842969876;
                    i27 = ((iM6989 ^ i26) * (-3177)) ^ (-1162696173);
                    obj2 = obj2;
                    c19227 = c19227;
                    str6 = str4;
                    i34 = i34;
                    c19225 = c19225;
                    c19226 = c19226;
                    sbM9834 = sbM9834;
                    sbM9835 = sbM9835;
                    break;
                case -672181148:
                case 261631657:
                    if (C3245.f10203 > 0) {
                        c19227 = c19227;
                        sbM9835 = sbM9835;
                        sbM9834 = sbM9834;
                        obj2 = obj2;
                        c19226 = c19226;
                        c19225 = c19225;
                        i34 = i34;
                        str2 = str6;
                        iM2569 = (C2105.m6981("᩺֫") + i26) * 7;
                        i15 = ((iM2569 ^ i25) * (-6163)) ^ (-1886531946);
                        i16 = 782011973;
                        i28 = iM2569 ^ i16;
                        str6 = str2;
                        i27 = i15;
                        obj2 = obj2;
                        i34 = i34;
                        c19227 = c19227;
                        c19225 = c19225;
                        c19226 = c19226;
                        sbM9834 = sbM9834;
                        sbM9835 = sbM9835;
                    } else {
                        c19221 = c19227;
                        sb = sbM9835;
                        sb2 = sbM9834;
                        c19223 = c19225;
                        obj = obj2;
                        c19222 = c19226;
                        i8 = i34;
                        str = str5;
                        sArr = sArr5;
                        iM6983 = (C0630.m2566("ۚۗ") ^ i26) * (-123);
                        i9 = ((iM6983 ^ i25) * (-8853)) ^ (-1025607751);
                        i10 = 286709501;
                        i28 = iM6983 ^ i10;
                        obj2 = obj;
                        c19226 = c19222;
                        sArr5 = sArr;
                        str5 = str;
                        sbM9834 = sb2;
                        i34 = i8;
                        sbM9835 = sb;
                        c19225 = c19223;
                        i27 = i9;
                        c19227 = c19221;
                    }
                    break;
                case -653212475:
                case 1205871019:
                    c19227 = c19227;
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    sArr3 = sArr3;
                    c19226 = c19226;
                    c19225 = c19225;
                    i34 = i34;
                    str5 = str5;
                    sArr5 = sArr5;
                    i5 = i32;
                    try {
                        mapM16576 = m16576((CharSequence) c7744Mo26556);
                        iM6982 = C0630.m2566("ۛۡ") ^ i26;
                        i6 = ((iM6982 ^ i25) * (-1657)) ^ 1593064223;
                        i7 = -495274376;
                        i28 = iM6982 ^ i7;
                        i27 = i6;
                        sArr3 = sArr3;
                        i32 = i5;
                        c19226 = c19226;
                        sArr5 = sArr5;
                        c19227 = c19227;
                        str5 = str5;
                        sbM9834 = sbM9834;
                        i34 = i34;
                        c19225 = c19225;
                        sbM9835 = sbM9835;
                        obj2 = obj2;
                    } catch (Throwable th3) {
                        int iM25616 = (C0630.m2566("ۜ֫") + i25) * (-87);
                        int i37 = ((iM25616 ^ i26) * 19597) ^ (-1543267621);
                        i28 = iM25616 ^ 1522759869;
                        sArr3 = sArr3;
                        i32 = i5;
                        c19226 = c19226;
                        sArr5 = sArr5;
                        c19227 = c19227;
                        str5 = str5;
                        sbM9834 = sbM9834;
                        i34 = i34;
                        c19225 = c19225;
                        sbM9835 = sbM9835;
                        obj2 = obj2;
                        th = th3;
                        i27 = i37;
                    }
                    break;
                case -648726647:
                case -304372458:
                    b = 0;
                    sArr2 = sArr5;
                    iM2568 = C0630.m2566("ۡ֡") ^ i25;
                    i13 = ((iM2568 ^ i26) * 16085) ^ (-1506237396);
                    i14 = 2142845805;
                    i28 = iM2568 ^ i14;
                    i27 = i13;
                    obj2 = obj2;
                    sArr5 = sArr2;
                    c19227 = c19227;
                    str5 = str5;
                    i34 = i34;
                    c19225 = c19225;
                    c19226 = c19226;
                    sbM9834 = sbM9834;
                    sbM9835 = sbM9835;
                    break;
                case -532456746:
                case 392872999:
                    c19227 = c19227;
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    c19226 = c19226;
                    C19220 c192210 = c19225;
                    i34 = i34;
                    str5 = str5;
                    sArr5 = sArr5;
                    sArr3 = sArr3;
                    i5 = i32;
                    c18514M44343 = c192210.m44343(ServiceConnectionC3453.m10568(sArr3, i5, 4, i35));
                    if (c18514M44343 != null) {
                        iM6982 = C0630.m2566("ۙۙ") ^ i26;
                        c19225 = c192210;
                        i6 = ((iM6982 ^ i25) * (-25905)) ^ (-763675922);
                        i7 = -431983899;
                        i28 = iM6982 ^ i7;
                        i27 = i6;
                        sArr3 = sArr3;
                        i32 = i5;
                        c19226 = c19226;
                        sArr5 = sArr5;
                        c19227 = c19227;
                        str5 = str5;
                        sbM9834 = sbM9834;
                        i34 = i34;
                        c19225 = c19225;
                        sbM9835 = sbM9835;
                        obj2 = obj2;
                    } else {
                        c19220 = c192210;
                        c13000 = c13000;
                        int iM25617 = (C0630.m2566("ۡۧ") + i25) * 83;
                        i28 = iM25617 ^ (-1312318539);
                        sArr3 = sArr3;
                        i32 = i5;
                        i27 = ((iM25617 ^ i26) * 77) ^ 1687041873;
                        sArr5 = sArr5;
                        c19227 = c19227;
                        c13000 = c13000;
                        str5 = str5;
                        c19226 = c19226;
                        i34 = i34;
                        c19225 = c19220;
                        sbM9834 = sbM9834;
                        obj2 = obj2;
                        sbM9835 = sbM9835;
                    }
                    break;
                case -430238469:
                case 1998804846:
                    sbM9835 = C3200.m9834(C3683.m11225(f18152, 50, 8, i35), strM43027, str7);
                    strM43026 = c18514M44344.m43026();
                    if (C3432.f10845 < 0) {
                        iM6981 = (C2105.m6981("ܺۡ") ^ i25) * (-101);
                        i = ((iM6981 ^ i26) * 30701) ^ 179446894;
                        i2 = -1762574469;
                        i28 = iM6981 ^ i2;
                        i27 = i;
                    } else {
                        c19227 = c19227;
                        sbM9835 = sbM9835;
                        sbM9834 = sbM9834;
                        obj2 = obj2;
                        sArr3 = sArr3;
                        c19226 = c19226;
                        c13000 = c13000;
                        c19225 = c19225;
                        i34 = i34;
                        str5 = str5;
                        sArr5 = sArr5;
                        i32 = i32;
                        iM2566 = (C2105.m6981("ۨ۫") ^ i25) * 63;
                        i3 = ((iM2566 ^ i26) * 19329) ^ (-1356478157);
                        i4 = 1453306626;
                        i28 = iM2566 ^ i4;
                        i27 = i3;
                        c13000 = c13000;
                        sArr3 = sArr3;
                        i32 = i32;
                        c19226 = c19226;
                        sArr5 = sArr5;
                        c19227 = c19227;
                        charSequence2 = charSequence;
                        str5 = str5;
                        sbM9834 = sbM9834;
                        i34 = i34;
                        c19225 = c19225;
                        sbM9835 = sbM9835;
                        obj2 = obj2;
                    }
                    break;
                case -409790027:
                case -226969849:
                    b = 1;
                    sArr2 = sArr5;
                    iM2568 = C0630.m2566("ۡ֡") ^ i25;
                    i13 = ((iM2568 ^ i26) * 16085) ^ (-1506237396);
                    i14 = 2142845805;
                    i28 = iM2568 ^ i14;
                    i27 = i13;
                    obj2 = obj2;
                    sArr5 = sArr2;
                    c19227 = c19227;
                    str5 = str5;
                    i34 = i34;
                    c19225 = c19225;
                    c19226 = c19226;
                    sbM9834 = sbM9834;
                    sbM9835 = sbM9835;
                    break;
                case -405857791:
                case 1063339783:
                    C3746.m11369();
                    c19221 = c19227;
                    sb = sbM9835;
                    sb2 = sbM9834;
                    c19223 = c19225;
                    obj = obj2;
                    c19222 = c19226;
                    i8 = i34;
                    str = str5;
                    sArr = sArr5;
                    iM6983 = (C0630.m2566("ۚۗ") ^ i26) * (-123);
                    i9 = ((iM6983 ^ i25) * (-8853)) ^ (-1025607751);
                    i10 = 286709501;
                    i28 = iM6983 ^ i10;
                    obj2 = obj;
                    c19226 = c19222;
                    sArr5 = sArr;
                    str5 = str;
                    sbM9834 = sb2;
                    i34 = i8;
                    sbM9835 = sb;
                    c19225 = c19223;
                    i27 = i9;
                    c19227 = c19221;
                    break;
                case -394575619:
                case 887704083:
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    C2167.m7154(th, obj2);
                    c19226 = c19226;
                    c19227 = c19227;
                    c19225 = c19225;
                    i34 = i34;
                    str2 = str6;
                    iM2569 = C0630.m2566("ۘۚ") ^ i26;
                    i15 = ((iM2569 ^ i25) * 1673) ^ (-2020794313);
                    i16 = 1552310219;
                    i28 = iM2569 ^ i16;
                    str6 = str2;
                    i27 = i15;
                    obj2 = obj2;
                    i34 = i34;
                    c19227 = c19227;
                    c19225 = c19225;
                    c19226 = c19226;
                    sbM9834 = sbM9834;
                    sbM9835 = sbM9835;
                    break;
                case -339647689:
                case 1109912262:
                    c19227 = c19227;
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    c19226 = c19226;
                    c19225 = c19225;
                    i34 = i34;
                    str5 = str5;
                    sArr2 = sArr5;
                    if (C1294.m4369(str5, C3746.m11357(f18152, 5, 12, i35))) {
                        iM2568 = C0630.m2566("ܰ۟") ^ i26;
                        i13 = ((iM2568 ^ i25) * 11339) ^ (-118616529);
                        i14 = 1985831949;
                    } else {
                        b = b2;
                        iM2568 = C0630.m2566("ۡ֡") ^ i25;
                        i13 = ((iM2568 ^ i26) * 16085) ^ (-1506237396);
                        i14 = 2142845805;
                    }
                    i28 = iM2568 ^ i14;
                    i27 = i13;
                    obj2 = obj2;
                    sArr5 = sArr2;
                    c19227 = c19227;
                    str5 = str5;
                    i34 = i34;
                    c19225 = c19225;
                    c19226 = c19226;
                    sbM9834 = sbM9834;
                    sbM9835 = sbM9835;
                    break;
                case -298062401:
                case 1158107388:
                    c19227 = c19227;
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    c19226 = c19226;
                    c19225 = c19225;
                    i34 = i34;
                    str5 = str5;
                    if (!ViewOnClickListenerC1958.m6437(str5, RunnableC1937.m6385(f18152, 23, 7, i35))) {
                        sArr2 = sArr5;
                        b = b2;
                        iM2568 = C0630.m2566("ۡ֡") ^ i25;
                        i13 = ((iM2568 ^ i26) * 16085) ^ (-1506237396);
                        i14 = 2142845805;
                        i28 = iM2568 ^ i14;
                        i27 = i13;
                        obj2 = obj2;
                        sArr5 = sArr2;
                        c19227 = c19227;
                        str5 = str5;
                        i34 = i34;
                        c19225 = c19225;
                        c19226 = c19226;
                        sbM9834 = sbM9834;
                        sbM9835 = sbM9835;
                    } else {
                        int iM69810 = (C2105.m6981("۟ۧ") + i26) * 67;
                        i15 = ((iM69810 ^ i25) * (-30621)) ^ (-1038183111);
                        i28 = iM69810 ^ 2000809262;
                        str5 = str5;
                        i27 = i15;
                        obj2 = obj2;
                        i34 = i34;
                        c19227 = c19227;
                        c19225 = c19225;
                        c19226 = c19226;
                        sbM9834 = sbM9834;
                        sbM9835 = sbM9835;
                    }
                    break;
                case -247765665:
                case 438917110:
                    C1128.m3851();
                    if (C4616.m13552() == 0) {
                        iM6981 = C2105.m6981("֫ۖ") ^ i26;
                        i = ((iM6981 ^ i25) * (-31625)) ^ 1529609692;
                        i2 = 1629737394;
                        i28 = iM6981 ^ i2;
                        i27 = i;
                    } else {
                        c19227 = c19227;
                        sbM9835 = sbM9835;
                        sbM9834 = sbM9834;
                        obj2 = obj2;
                        c19226 = c19226;
                        c19225 = c19225;
                        i34 = i34;
                        str2 = str6;
                        iM2569 = (C2105.m6981("᩺֫") + i26) * 7;
                        i15 = ((iM2569 ^ i25) * (-6163)) ^ (-1886531946);
                        i16 = 782011973;
                        i28 = iM2569 ^ i16;
                        str6 = str2;
                        i27 = i15;
                        obj2 = obj2;
                        i34 = i34;
                        c19227 = c19227;
                        c19225 = c19225;
                        c19226 = c19226;
                        sbM9834 = sbM9834;
                        sbM9835 = sbM9835;
                    }
                    break;
                case -208784670:
                case 813640688:
                    throw th;
                case -135970669:
                case 208756308:
                    RunnableC1108.m3790();
                    C1711.m5736();
                    return null;
                case -115168995:
                case 700282121:
                    c19227 = c19227;
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    c19226 = c19226;
                    c19225 = c19225;
                    i34 = i34;
                    str5 = str5;
                    sArr2 = sArr5;
                    if (C1294.m4369(str5, C11340.m28025(f18152, 17, 6, i35))) {
                        iM2568 = (C0630.m2566("᩻ܶ") ^ i25) * 49;
                        i13 = ((iM2568 ^ i26) * (-32585)) ^ 301981790;
                        i14 = 506874858;
                    } else {
                        b = b2;
                        iM2568 = C0630.m2566("ۡ֡") ^ i25;
                        i13 = ((iM2568 ^ i26) * 16085) ^ (-1506237396);
                        i14 = 2142845805;
                    }
                    i28 = iM2568 ^ i14;
                    i27 = i13;
                    obj2 = obj2;
                    sArr5 = sArr2;
                    c19227 = c19227;
                    str5 = str5;
                    i34 = i34;
                    c19225 = c19225;
                    c19226 = c19226;
                    sbM9834 = sbM9834;
                    sbM9835 = sbM9835;
                    break;
                case 12746274:
                case 2055532842:
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    if (C1773.m5910(itM44339)) {
                        iM25610 = C2105.m6981("᩶֨") ^ i25;
                        i20 = ((iM25610 ^ i26) * 12103) ^ (-307131729);
                        i21 = -2121634947;
                        i28 = iM25610 ^ i21;
                        sbM9834 = sbM9834;
                        i27 = i20;
                        sbM9835 = sbM9835;
                    }
                    c19220 = c19225;
                    i5 = i32;
                    int iM25618 = (C0630.m2566("ۡۧ") + i25) * 83;
                    i28 = iM25618 ^ (-1312318539);
                    sArr3 = sArr3;
                    i32 = i5;
                    i27 = ((iM25618 ^ i26) * 77) ^ 1687041873;
                    sArr5 = sArr5;
                    c19227 = c19227;
                    c13000 = c13000;
                    str5 = str5;
                    c19226 = c19226;
                    i34 = i34;
                    c19225 = c19220;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    sbM9835 = sbM9835;
                    break;
                case 22254241:
                case 2062909073:
                    return linkedHashMap;
                case 24425816:
                case 916063427:
                    i35 = 12173;
                    iM2566 = (C2105.m6981("᩻ᩳ") + i26) * (-87);
                    i3 = ((iM2566 ^ i25) * 7577) ^ (-1151704325);
                    i4 = -1680025437;
                    i28 = iM2566 ^ i4;
                    i27 = i3;
                    c13000 = c13000;
                    sArr3 = sArr3;
                    i32 = i32;
                    c19226 = c19226;
                    sArr5 = sArr5;
                    c19227 = c19227;
                    charSequence2 = charSequence;
                    str5 = str5;
                    sbM9834 = sbM9834;
                    i34 = i34;
                    c19225 = c19225;
                    sbM9835 = sbM9835;
                    obj2 = obj2;
                    break;
                case 30568943:
                case 1870977362:
                    C13843.putIfAbsent(linkedHashMap, C0422.m1959(sbM9834), m16577(charSequence2, c19226));
                    itM44338 = it;
                    i19 = i30;
                    str3 = str6;
                    c19224 = c19225;
                    int iM25619 = C0630.m2566("۬ܰ") ^ i26;
                    Iterator it2 = itM44338;
                    i27 = ((iM25619 ^ i25) * (-16455)) ^ (-598675238);
                    i28 = iM25619 ^ (-414829949);
                    c19225 = c19224;
                    obj2 = obj2;
                    c19226 = c19226;
                    sbM9834 = sbM9834;
                    sbM9835 = sbM9835;
                    str6 = str3;
                    i34 = i19;
                    it = it2;
                    break;
                case 215366299:
                case 748533225:
                    C3432.m10477();
                    if (C1128.m3851() <= 0) {
                        sbM9835 = sbM9835;
                        sbM9834 = sbM9834;
                        iM25610 = (i26 - C2105.m6981("۬ۨ")) * (-19);
                        i20 = ((iM25610 ^ i25) * 31051) ^ 553900213;
                        i21 = 1978784197;
                        i28 = iM25610 ^ i21;
                        sbM9834 = sbM9834;
                        i27 = i20;
                        sbM9835 = sbM9835;
                    }
                    c19227 = c19227;
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    c19226 = c19226;
                    c19225 = c19225;
                    i34 = i34;
                    str2 = str6;
                    iM2569 = (C2105.m6981("᩺֫") + i26) * 7;
                    i15 = ((iM2569 ^ i25) * (-6163)) ^ (-1886531946);
                    i16 = 782011973;
                    i28 = iM2569 ^ i16;
                    str6 = str2;
                    i27 = i15;
                    obj2 = obj2;
                    i34 = i34;
                    c19227 = c19227;
                    c19225 = c19225;
                    c19226 = c19226;
                    sbM9834 = sbM9834;
                    sbM9835 = sbM9835;
                    break;
                case 404351069:
                case 1250898298:
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    c19226 = (C19220) RunnableC1108.m3791(it);
                    sArr5 = f18152;
                    i29 = 36;
                    if (C3245.f10203 > 0) {
                        iM25610 = C0630.m2566("᩶֡") ^ i26;
                        i20 = ((iM25610 ^ i25) * (-21269)) ^ (-934639254);
                        i21 = -392924527;
                        i28 = iM25610 ^ i21;
                        sbM9834 = sbM9834;
                        i27 = i20;
                        sbM9835 = sbM9835;
                    } else {
                        c19226 = c19226;
                        c19225 = c19225;
                        i34 = i34;
                        str5 = str5;
                        sArr5 = sArr5;
                        i32 = i32;
                        iM2566 = C0630.m2566("᩷᩹") ^ i25;
                        i3 = ((iM2566 ^ i26) * 16097) ^ 69722224;
                        i4 = 1280424927;
                        i28 = iM2566 ^ i4;
                        i27 = i3;
                        c13000 = c13000;
                        sArr3 = sArr3;
                        i32 = i32;
                        c19226 = c19226;
                        sArr5 = sArr5;
                        c19227 = c19227;
                        charSequence2 = charSequence;
                        str5 = str5;
                        sbM9834 = sbM9834;
                        i34 = i34;
                        c19225 = c19225;
                        sbM9835 = sbM9835;
                        obj2 = obj2;
                    }
                    break;
                case 965658808:
                case 987517404:
                    c19227 = c19227;
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    sArr3 = sArr3;
                    c19226 = c19226;
                    c19225 = c19225;
                    i34 = i34;
                    str5 = str5;
                    sArr5 = sArr5;
                    i5 = i32;
                    c7744Mo26556 = ((InterfaceC20445) charSequence2).mo26556();
                    iM6982 = C2105.m6981("᩺ۖ") ^ i26;
                    i6 = ((iM6982 ^ i25) * 22411) ^ (-540061841);
                    i7 = -387208164;
                    i28 = iM6982 ^ i7;
                    i27 = i6;
                    sArr3 = sArr3;
                    i32 = i5;
                    c19226 = c19226;
                    sArr5 = sArr5;
                    c19227 = c19227;
                    str5 = str5;
                    sbM9834 = sbM9834;
                    i34 = i34;
                    c19225 = c19225;
                    sbM9835 = sbM9835;
                    obj2 = obj2;
                    break;
                case 1039983701:
                case 1213094252:
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    if (C1773.m5910(it)) {
                        iM25610 = (C0630.m2566("ۧܶ") + i25) * (-119);
                        i20 = ((iM25610 ^ i26) * (-5935)) ^ (-1588023465);
                        i21 = 918694945;
                        i28 = iM25610 ^ i21;
                        sbM9834 = sbM9834;
                        i27 = i20;
                        sbM9835 = sbM9835;
                    }
                    c19220 = c19225;
                    i5 = i32;
                    int iM256110 = (C0630.m2566("ۡۧ") + i25) * 83;
                    i28 = iM256110 ^ (-1312318539);
                    sArr3 = sArr3;
                    i32 = i5;
                    i27 = ((iM256110 ^ i26) * 77) ^ 1687041873;
                    sArr5 = sArr5;
                    c19227 = c19227;
                    c13000 = c13000;
                    str5 = str5;
                    c19226 = c19226;
                    i34 = i34;
                    c19225 = c19220;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    sbM9835 = sbM9835;
                    break;
                case 1079967874:
                case 1109624719:
                    c19227 = c19227;
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    sArr3 = sArr3;
                    c19226 = c19226;
                    c13000 = c13000;
                    c19225 = c19225;
                    i34 = i34;
                    str5 = str5;
                    sArr5 = sArr5;
                    i32 = i32;
                    s = f18152[0];
                    if (C1916.m6308() >= 0) {
                        iM2566 = (C2105.m6981("ۨ۫") ^ i25) * 63;
                        i3 = ((iM2566 ^ i26) * 19329) ^ (-1356478157);
                        i4 = 1453306626;
                    } else {
                        iM2566 = (i26 - C0630.m2566("۠۬")) * 99;
                        i3 = ((iM2566 ^ i25) * (-8415)) ^ 28456613;
                        i4 = 952510953;
                    }
                    i28 = iM2566 ^ i4;
                    i27 = i3;
                    c13000 = c13000;
                    sArr3 = sArr3;
                    i32 = i32;
                    c19226 = c19226;
                    sArr5 = sArr5;
                    c19227 = c19227;
                    charSequence2 = charSequence;
                    str5 = str5;
                    sbM9834 = sbM9834;
                    i34 = i34;
                    c19225 = c19225;
                    sbM9835 = sbM9835;
                    obj2 = obj2;
                    break;
                case 1201501585:
                case 1229463534:
                    c19227 = c19227;
                    sArr2 = sArr5;
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    c19226 = c19226;
                    c19225 = c19225;
                    i34 = i34;
                    strM43027 = c18514M44343.m43026();
                    String strM44350 = c19225.m44350();
                    AbstractC2021.m6565(strM44350);
                    b2 = -1;
                    switch (C0630.m2566(strM44350)) {
                        case -1024600675:
                            iM2567 = (C0630.m2566("ۙ᩺") + i25) * (-65);
                            i11 = ((iM2567 ^ i26) * (-6285)) ^ 1716401969;
                            i12 = -1956230483;
                            i28 = iM2567 ^ i12;
                            obj2 = obj2;
                            sArr5 = sArr2;
                            i34 = i34;
                            str5 = strM44350;
                            c19225 = c19225;
                            i27 = i11;
                            c19226 = c19226;
                            c19227 = c19227;
                            break;
                        case -891985903:
                            iM2567 = (i25 - C0630.m2566("᩻ۘ")) * 55;
                            i11 = ((iM2567 ^ i26) * 1791) ^ (-2103179022);
                            i12 = -1503780296;
                            i28 = iM2567 ^ i12;
                            obj2 = obj2;
                            sArr5 = sArr2;
                            i34 = i34;
                            str5 = strM44350;
                            c19225 = c19225;
                            i27 = i11;
                            c19226 = c19226;
                            c19227 = c19227;
                            break;
                        case -475309713:
                            iM2567 = (i26 - C0630.m2566("ۨۚ")) * 61;
                            i11 = ((iM2567 ^ i25) * (-1991)) ^ (-913492870);
                            i12 = 1524969258;
                            i28 = iM2567 ^ i12;
                            obj2 = obj2;
                            sArr5 = sArr2;
                            i34 = i34;
                            str5 = strM44350;
                            c19225 = c19225;
                            i27 = i11;
                            c19226 = c19226;
                            c19227 = c19227;
                            break;
                        default:
                            str5 = strM44350;
                            b = b2;
                            iM2568 = C0630.m2566("ۡ֡") ^ i25;
                            i13 = ((iM2568 ^ i26) * 16085) ^ (-1506237396);
                            i14 = 2142845805;
                            i28 = iM2568 ^ i14;
                            i27 = i13;
                            obj2 = obj2;
                            sArr5 = sArr2;
                            c19227 = c19227;
                            str5 = str5;
                            i34 = i34;
                            c19225 = c19225;
                            c19226 = c19226;
                            break;
                    }
                    sbM9834 = sbM9834;
                    sbM9835 = sbM9835;
                    break;
                case 1201667409:
                case 1780067623:
                    sbM9835 = sbM9835;
                    sbM9834 = C3200.m9834(C1916.m6311(sArr5, i29, 6, i35), strM43027, str7);
                    if (C3537.m10746() <= 0) {
                        iM25611 = (C2105.m6981("᩵ۖ") ^ i26) * (-19);
                        i22 = ((iM25611 ^ i25) * (-23579)) ^ (-1787021833);
                        i23 = 1921340628;
                    } else {
                        iM25611 = (i26 - C0630.m2566("᩻ۢ")) * 93;
                        i22 = ((iM25611 ^ i25) * 11249) ^ (-1048566486);
                        i23 = 1455097226;
                    }
                    i28 = iM25611 ^ i23;
                    i27 = i22;
                    sbM9835 = sbM9835;
                    break;
                case 1254820603:
                case 1803216075:
                    c19227 = c19227;
                    sbM9835 = sbM9835;
                    sbM9834 = sbM9834;
                    obj2 = obj2;
                    sArr3 = sArr3;
                    c19226 = c19226;
                    c19225 = c19225;
                    i34 = i34;
                    str5 = str5;
                    sArr5 = sArr5;
                    i5 = i32;
                    if (C1773.m5910(itM44337)) {
                        iM6982 = (C0630.m2566("֫᩷") + i25) * (-127);
                        i6 = ((iM6982 ^ i26) * (-5529)) ^ (-1162029835);
                        i7 = -1611529397;
                    } else {
                        iM6982 = C0630.m2566("ۧۙ") ^ i26;
                        i6 = ((iM6982 ^ i25) * 1805) ^ 588911033;
                        i7 = -704834456;
                    }
                    i28 = iM6982 ^ i7;
                    i27 = i6;
                    sArr3 = sArr3;
                    i32 = i5;
                    c19226 = c19226;
                    sArr5 = sArr5;
                    c19227 = c19227;
                    str5 = str5;
                    sbM9834 = sbM9834;
                    i34 = i34;
                    c19225 = c19225;
                    sbM9835 = sbM9835;
                    obj2 = obj2;
                    break;
                case 1597237498:
                case 2059537167:
                    str3 = str6;
                    c19224 = c19225;
                    itM44338 = C19220.m44338(c19224, str3);
                    i19 = 0;
                    int iM256111 = C0630.m2566("۬ܰ") ^ i26;
                    Iterator it3 = itM44338;
                    i27 = ((iM256111 ^ i25) * (-16455)) ^ (-598675238);
                    i28 = iM256111 ^ (-414829949);
                    c19225 = c19224;
                    obj2 = obj2;
                    c19226 = c19226;
                    sbM9834 = sbM9834;
                    sbM9835 = sbM9835;
                    str6 = str3;
                    i34 = i19;
                    it = it3;
                    break;
                default:
                    C0237.m1481();
                    if (C3746.f11829 > 0) {
                        iM6981 = C2105.m6981("֫ۖ") ^ i26;
                        i = ((iM6981 ^ i25) * (-31625)) ^ 1529609692;
                        i2 = 1629737394;
                    } else {
                        iM6981 = C2105.m6981("ۙ֡") ^ i26;
                        i = ((iM6981 ^ i25) * (-9421)) ^ (-307533572);
                        i2 = -1256114123;
                    }
                    i28 = iM6981 ^ i2;
                    i27 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:168:0x0629 A[PHI: r28 r33
      0x0629: PHI (r28v3 int) = (r28v2 int), (r28v1 int), (r28v1 int) binds: [B:167:0x0627, B:145:0x0524, B:19:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x0629: PHI (r33v80 int) = (r33v58 int), (r33v67 int), (r33v81 int) binds: [B:167:0x0627, B:145:0x0524, B:19:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x026f A[PHI: r33 r35
      0x026f: PHI (r33v37 boolean) = (r33v12 boolean), (r33v34 boolean), (r33v38 boolean) binds: [B:265:0x026f, B:75:0x0258, B:63:0x01c1] A[DONT_GENERATE, DONT_INLINE]
      0x026f: PHI (r35v18 int) = (r35v8 int), (r35v15 int), (r35v19 int) binds: [B:265:0x026f, B:75:0x0258, B:63:0x01c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
    
        if (l.C1047.f3863 < 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dd, code lost:
    
        r33 = r1;
        r35 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ea, code lost:
    
        if (l.C2167.f7158 >= 0) goto L14;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m16579(GetChars getChars) throws Throwable {
        boolean z;
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int iM6982;
        int i4;
        int i5;
        int iM6983;
        int i6;
        int i7;
        int iM6984;
        int i8;
        int i9;
        C13000 c13000;
        int i10;
        boolean zM4369 = false;
        boolean zM43610 = false;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i11 = 0;
        int i12 = 0;
        short s2 = 0;
        int i13 = 0;
        int i14 = 296529616;
        int i15 = RunnableC3474.f10992;
        int i16 = C3245.f10203;
        int iM2567 = (C0630.m2566("᩹᩵") + i15) * 97;
        int i17 = ((iM2567 ^ i16) * 28983) ^ 1880702540;
        int i18 = iM2567 ^ 159217319;
        C7744 c7744Mo26556 = null;
        Throwable th = null;
        Object obj = null;
        String strM19226 = null;
        int i19 = 0;
        int iM19216 = 0;
        C7184 c7184 = null;
        int iM19220 = 0;
        int i20 = 0;
        boolean z2 = false;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        boolean zM6437 = false;
        boolean zM6438 = false;
        boolean zM6439 = false;
        boolean zM16579 = false;
        boolean z3 = false;
        C13000 c13001 = null;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i16) * 27965) >> 31));
            switch (i14) {
                case -2076712042:
                case 1444517926:
                    i19 = i19;
                    c13001 = c13001;
                    s = sArr[c];
                    if (C3432.f10845 >= 0) {
                        iM6983 = C0630.m2566("᩶ۨ") ^ i15;
                        i6 = ((iM6983 ^ i16) * (-21971)) ^ 1844570899;
                        i7 = 826069866;
                    } else {
                        iM6983 = (C2105.m6981("ᩳ۬") ^ i15) * (-3);
                        i6 = ((iM6983 ^ i16) * (-10281)) ^ (-1609021784);
                        i7 = 664613527;
                    }
                    i10 = iM6983 ^ i7;
                    c13001 = c13001;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -2073942633:
                case 1849106669:
                    if (zM43610) {
                        iM6982 = C2105.m6981("ۡ۠") ^ i16;
                        i = ((iM6982 ^ i15) * 32501) ^ 1714312636;
                        i4 = -2099528307;
                    } else {
                        iM6982 = (C2105.m6981("ۘ۟") ^ i15) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM6982 ^ i16) * 20361) ^ (-1842163508);
                        i4 = 1986779934;
                    }
                    i18 = iM6982 ^ i4;
                    i17 = i;
                    break;
                case -2061831772:
                case -592096851:
                    iM19220 = iM19220;
                    z2 = z2;
                    if (zM6439) {
                        iM2566 = (C0630.m2566("ۖۘ") ^ i15) * (-5);
                        i = ((iM2566 ^ i16) * (-25251)) ^ 1479924608;
                        i3 = -1605027198;
                    } else {
                        iM2566 = (C2105.m6981("ۚۘ") ^ i16) * 19;
                        i = ((iM2566 ^ i15) * (-32237)) ^ 781676279;
                        i3 = -991308641;
                    }
                    i5 = iM2566 ^ i3;
                    z2 = z2;
                    iM19220 = iM19220;
                    i18 = i5;
                    i17 = i;
                    break;
                case -2026190518:
                case 258930784:
                    i20 = 35940;
                    iM6983 = (C2105.m6981("ۜۡ") ^ i15) * (-103);
                    i6 = ((iM6983 ^ i16) * 29915) ^ 2034254150;
                    i7 = 1926284205;
                    i10 = iM6983 ^ i7;
                    c13001 = c13001;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -1944744148:
                case 1057649652:
                    iM19220 = iM19220;
                    z2 = z2;
                    if (zM6438) {
                        iM2566 = (C0630.m2566("ۖۘ") ^ i15) * (-5);
                        i = ((iM2566 ^ i16) * (-25251)) ^ 1479924608;
                        i3 = -1605027198;
                    } else {
                        iM2566 = C0630.m2566("ۜ᩻") ^ i16;
                        i = ((iM2566 ^ i15) * 26065) ^ 1159681692;
                        i3 = -1067958522;
                    }
                    i5 = iM2566 ^ i3;
                    z2 = z2;
                    iM19220 = iM19220;
                    i18 = i5;
                    i17 = i;
                    break;
                case -1931648523:
                case 802016797:
                    z2 = true;
                    if (iM19220 != 1) {
                        iM6982 = C0630.m2566("᩵ܳ") ^ i15;
                        i = ((iM6982 ^ i16) * (-22807)) ^ (-1928666827);
                        i4 = 2124531623;
                    } else {
                        iM6982 = (C2105.m6981("֨ۙ") + i16) * 27;
                        i = ((iM6982 ^ i15) * (-17571)) ^ 3804556;
                        i4 = 949977531;
                    }
                    i18 = iM6982 ^ i4;
                    i17 = i;
                    break;
                case -1903856692:
                case 1714696687:
                    if (C7811.f24123 < 0) {
                        iM6982 = C2105.m6981("۠᩹") ^ i15;
                        i = ((iM6982 ^ i16) * 11259) ^ (-8039440);
                        i4 = 203274913;
                        i18 = iM6982 ^ i4;
                        i17 = i;
                    } else {
                        i19 = i19;
                        c13001 = c13001;
                        iM6983 = (C0630.m2566("ۘۨ") ^ i15) * (-33);
                        i6 = ((iM6983 ^ i16) * (-22237)) ^ (-1179408003);
                        i7 = 1880103155;
                        i10 = iM6983 ^ i7;
                        c13001 = c13001;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    }
                    break;
                case -1860908719:
                case -1085868991:
                    i22 = 0;
                    i24 = 0;
                    iM6984 = C0630.m2566("᩷ᩴ") ^ i16;
                    i6 = ((iM6984 ^ i15) * 997) ^ 1055434413;
                    i8 = 1507270614;
                    i10 = iM6984 ^ i8;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -1789614255:
                case 1844942997:
                    C0714.m2805();
                    i19 = i19;
                    c13001 = c13001;
                    iM6983 = (C0630.m2566("ۘۨ") ^ i15) * (-33);
                    i6 = ((iM6983 ^ i16) * (-22237)) ^ (-1179408003);
                    i7 = 1880103155;
                    i10 = iM6983 ^ i7;
                    c13001 = c13001;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -1757103636:
                case 281217360:
                    C3911.m11924();
                    return false;
                case -1707078760:
                case 342605442:
                    return z3;
                case -1655134388:
                case -692737888:
                    iM19220 = iM19220;
                    z2 = z2;
                    if (i19 >= iM19216) {
                        i22 = i23;
                        z2 = z2;
                        iM19220 = iM19220;
                        iM6984 = C0630.m2566("᩷ᩴ") ^ i16;
                        i6 = ((iM6984 ^ i15) * 997) ^ 1055434413;
                        i8 = 1507270614;
                        i10 = iM6984 ^ i8;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    } else {
                        iM2566 = (C0630.m2566("᩸ᩴ") ^ i15) * 17;
                        i = ((iM2566 ^ i16) * (-22409)) ^ (-1028869887);
                        i3 = 1064533300;
                        i5 = iM2566 ^ i3;
                        z2 = z2;
                        iM19220 = iM19220;
                        i18 = i5;
                        i17 = i;
                    }
                    break;
                case -1635163645:
                case 1270848275:
                    C7811.m20844();
                    break;
                case -1634958422:
                case 34867368:
                    i19++;
                    iM2566 = (i16 - C0630.m2566("۫۬")) * (-27);
                    i = ((iM2566 ^ i15) * 30633) ^ (-672347298);
                    i3 = -655388695;
                    i5 = iM2566 ^ i3;
                    z2 = z2;
                    iM19220 = iM19220;
                    i18 = i5;
                    i17 = i;
                    break;
                case -1599981062:
                case -322791964:
                    return z2;
                case -1577190449:
                case -35706061:
                    i19 = i19;
                    c13001 = c13001;
                    i11 = s + 1;
                    if (C1294.m4372() <= 0) {
                        iM6983 = (C2105.m6981("᩵۟") + i16) * (-67);
                        i6 = ((iM6983 ^ i15) * (-783)) ^ 1064065964;
                        i7 = -2040927980;
                    } else {
                        iM6983 = C2105.m6981("ܽ۟") ^ i16;
                        i6 = ((iM6983 ^ i15) * (-6889)) ^ 683580148;
                        i7 = -1739959904;
                    }
                    i10 = iM6983 ^ i7;
                    c13001 = c13001;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -1533998937:
                case -907583044:
                    iM19220 = iM19220;
                    z2 = z2;
                    try {
                        C7106.m19109(c7744Mo26556);
                        iM2566 = (C2105.m6981("ܺ֡") ^ i16) * 23;
                        i = ((iM2566 ^ i15) * (-8027)) ^ 1034619705;
                        i3 = 1585240044;
                        i5 = iM2566 ^ i3;
                        z2 = z2;
                        iM19220 = iM19220;
                        i18 = i5;
                        i17 = i;
                    } catch (Throwable th2) {
                        int iM6985 = C2105.m6981("ܳۜ") ^ i15;
                        obj = th2;
                        i17 = ((iM6985 ^ i16) * (-11113)) ^ (-535690223);
                        z2 = z2;
                        iM19220 = iM19220;
                        i18 = iM6985 ^ 372269010;
                    }
                    break;
                case -1436951677:
                case -402532795:
                    i19 = i19;
                    c13001 = c13001;
                    if (getChars instanceof InterfaceC20445) {
                        iM6983 = C0630.m2566("ۤۗ") ^ i16;
                        i6 = ((iM6983 ^ i15) * (-27549)) ^ 596720406;
                        i7 = -1754304754;
                    } else {
                        iM6983 = C2105.m6981("ۘ᩺") ^ i16;
                        i6 = ((iM6983 ^ i15) * 13511) ^ 1521804481;
                        i7 = 1735875185;
                    }
                    i10 = iM6983 ^ i7;
                    c13001 = c13001;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -1256789227:
                case 1750821217:
                    c7744Mo26556 = ((InterfaceC20445) getChars).mo26556();
                    iM6984 = (C0630.m2566("ۢ۠") + i15) * (-85);
                    i19 = i19;
                    i6 = ((iM6984 ^ i16) * 29229) ^ 836455237;
                    i8 = 1085118784;
                    i10 = iM6984 ^ i8;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -1254627423:
                case 1082957604:
                    if (C4117.f13076 <= 0) {
                        i19 = i19;
                        c13001 = c13001;
                        iM6983 = C0630.m2566("᩶ۨ") ^ i15;
                        i6 = ((iM6983 ^ i16) * (-21971)) ^ 1844570899;
                        i7 = 826069866;
                        i10 = iM6983 ^ i7;
                        c13001 = c13001;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    }
                    i19 = i19;
                    c13001 = c13001;
                    iM6983 = (C0630.m2566("ۘۨ") ^ i15) * (-33);
                    i6 = ((iM6983 ^ i16) * (-22237)) ^ (-1179408003);
                    i7 = 1880103155;
                    i10 = iM6983 ^ i7;
                    c13001 = c13001;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -1237798825:
                case 807148670:
                    i19 = 0;
                    iM2566 = (i16 - C0630.m2566("۫۬")) * (-27);
                    i = ((iM2566 ^ i15) * 30633) ^ (-672347298);
                    i3 = -655388695;
                    i5 = iM2566 ^ i3;
                    z2 = z2;
                    iM19220 = iM19220;
                    i18 = i5;
                    i17 = i;
                    break;
                case -1171001718:
                case 396786015:
                    i19 = i19;
                    c13001 = c13001;
                    i12 = i11 * i11;
                    s2 = 2;
                    if (RunnableC1937.m6387() != 0) {
                        iM6983 = (C0630.m2566("ۘۨ") ^ i15) * (-33);
                        i6 = ((iM6983 ^ i16) * (-22237)) ^ (-1179408003);
                        i7 = 1880103155;
                    } else {
                        iM6983 = C2105.m6981("ᩳܽ") ^ i15;
                        i6 = ((iM6983 ^ i16) * (-30595)) ^ (-1048817221);
                        i7 = -1728294681;
                    }
                    i10 = iM6983 ^ i7;
                    c13001 = c13001;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -1152479762:
                case 1091309815:
                    iM19220 = iM19220;
                    z2 = z2;
                    int i25 = i24 + 1;
                    if (i25 != 10) {
                        i24 = i25;
                        i22 = i23;
                        z2 = z2;
                        iM19220 = iM19220;
                        iM6984 = C0630.m2566("᩷ᩴ") ^ i16;
                        i6 = ((iM6984 ^ i15) * 997) ^ 1055434413;
                        i8 = 1507270614;
                        i10 = iM6984 ^ i8;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    } else {
                        z2 = z2;
                        iM19220 = iM19220;
                        iM6982 = (C2105.m6981("֨ۙ") + i16) * 27;
                        i = ((iM6982 ^ i15) * (-17571)) ^ 3804556;
                        i4 = 949977531;
                        i18 = iM6982 ^ i4;
                        i17 = i;
                    }
                    break;
                case -1117468852:
                case 2033271028:
                    i19 = i19;
                    c13001 = c13001;
                    if ((i13 + 1) - i12 <= 0) {
                        iM6983 = (i15 - C0630.m2566("᩸۫")) * 63;
                        i6 = ((iM6983 ^ i16) * 639) ^ 281083896;
                        i7 = 412222502;
                    } else {
                        iM6983 = C2105.m6981("۟۟") ^ i16;
                        i6 = ((iM6983 ^ i15) * (-18957)) ^ 1910329461;
                        i7 = 2059928841;
                    }
                    i10 = iM6983 ^ i7;
                    c13001 = c13001;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -1074608811:
                case 1240692859:
                    z2 = z2;
                    try {
                        iM19220 = iM19220;
                        zM43610 = C1294.m4369(c7184.m19217(i19), C11340.m28025(f18152, 93, 4, i20));
                        iM2566 = (C2105.m6981("᩺֡") + i16) * 41;
                        i = ((iM2566 ^ i15) * (-2513)) ^ 163643948;
                        i3 = 26322608;
                        i5 = iM2566 ^ i3;
                        z2 = z2;
                        iM19220 = iM19220;
                        i18 = i5;
                    } catch (Exception unused) {
                        iM19220 = iM19220;
                        z2 = z2;
                        iM19220 = iM19220;
                        iM6982 = (C2105.m6981("֨ۙ") + i16) * 27;
                        i = ((iM6982 ^ i15) * (-17571)) ^ 3804556;
                        i4 = 949977531;
                        i18 = iM6982 ^ i4;
                    }
                    i17 = i;
                    break;
                case -1036834748:
                case -985194185:
                    i22--;
                    iM6984 = C0630.m2566("᩷ᩴ") ^ i16;
                    i6 = ((iM6984 ^ i15) * 997) ^ 1055434413;
                    i8 = 1507270614;
                    i10 = iM6984 ^ i8;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -1029438477:
                case 288377683:
                    C1916.m6308();
                    if (!C0422.m1963()) {
                        i19 = i19;
                        iM6984 = C2105.m6981("᩻۫") ^ i16;
                        i6 = ((iM6984 ^ i15) * (-26247)) ^ 1374066382;
                        i8 = 1145983575;
                        i10 = iM6984 ^ i8;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    } else {
                        iM6982 = C2105.m6981("۠᩹") ^ i15;
                        i = ((iM6982 ^ i16) * 11259) ^ (-8039440);
                        i4 = 203274913;
                        i18 = iM6982 ^ i4;
                        i17 = i;
                    }
                    break;
                case -1001289940:
                case 2146611294:
                    iM19220 = iM19220;
                    z2 = z2;
                    zM6437 = ViewOnClickListenerC1958.m6437(c7184.m19226(), C4263.m12817(f18152, 59, 9, i20));
                    iM2566 = (C0630.m2566("ۚ᩵") + i16) * 127;
                    i = ((iM2566 ^ i15) * (-29221)) ^ 262682512;
                    i3 = 1056329223;
                    i5 = iM2566 ^ i3;
                    z2 = z2;
                    iM19220 = iM19220;
                    i18 = i5;
                    i17 = i;
                    break;
                case -854544184:
                case 1183636085:
                    throw th;
                case -836868535:
                case 1933017609:
                    break;
                case -781051733:
                case 520795723:
                    iM19220 = iM19220;
                    z2 = z2;
                    strM19226 = c7184.m19226();
                    zM6438 = ViewOnClickListenerC1958.m6437(strM19226, C1711.m5726(f18152, 68, 6, i20));
                    iM2566 = C2105.m6981("۟ۨ") ^ i15;
                    i = ((iM2566 ^ i16) * (-19559)) ^ (-1483112300);
                    i3 = -302016152;
                    i5 = iM2566 ^ i3;
                    z2 = z2;
                    iM19220 = iM19220;
                    i18 = i5;
                    i17 = i;
                    break;
                case -754403417:
                case 1754221773:
                    i19 = i19;
                    if (C22628.f73083 <= 0) {
                        int iM6986 = C2105.m6981("᩵ۘ") ^ i16;
                        i6 = ((iM6986 ^ i15) * (-23651)) ^ (-1731526874);
                        i10 = iM6986 ^ 725173812;
                        c13001 = null;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                    } else {
                        C13000 c13002 = new C13000(getChars);
                        if (C0382.m1848()) {
                            c13001 = c13002;
                            iM6984 = C2105.m6981("᩻۫") ^ i16;
                            i6 = ((iM6984 ^ i15) * (-26247)) ^ 1374066382;
                            i8 = 1145983575;
                            i10 = iM6984 ^ i8;
                            i9 = i19;
                            i18 = i10;
                            i17 = i6;
                        } else {
                            int iM6987 = C2105.m6981("۠۬") ^ i16;
                            i17 = ((iM6987 ^ i15) * (-32641)) ^ 15631148;
                            c13001 = c13002;
                            i9 = i19;
                            i18 = iM6987 ^ (-3054255);
                        }
                    }
                    i19 = i9;
                    break;
                case -712867605:
                case 1488029313:
                    i20 = 44732;
                    iM6983 = (C2105.m6981("ۜۡ") ^ i15) * (-103);
                    i6 = ((iM6983 ^ i16) * 29915) ^ 2034254150;
                    i7 = 1926284205;
                    i10 = iM6983 ^ i7;
                    c13001 = c13001;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -622123696:
                case 1668532169:
                    i19 = i19;
                    c13001 = c13001;
                    c = ':';
                    if (C0382.f1805) {
                        iM6983 = C2105.m6981("ۜ۟") ^ i16;
                        i6 = ((iM6983 ^ i15) * (-23763)) ^ (-1889849346);
                        i7 = -1504812931;
                    } else {
                        iM6983 = C2105.m6981("ܰ᩵") ^ i16;
                        i6 = ((iM6983 ^ i15) * 29193) ^ (-705980384);
                        i7 = -522345762;
                    }
                    i10 = iM6983 ^ i7;
                    c13001 = c13001;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -576134859:
                case 1013676206:
                    i19 = i19;
                    c13000 = c13001;
                    c7184.m19219(c13000);
                    z3 = false;
                    if (C0382.f1805) {
                        c13001 = c13000;
                        iM6983 = C2105.m6981("᩻᩵") ^ i15;
                        i6 = ((iM6983 ^ i16) * (-14011)) ^ 960560843;
                        i7 = -558926154;
                    } else {
                        iM6983 = C2105.m6981("᩺۟") ^ i15;
                        c13001 = c13000;
                        i6 = ((iM6983 ^ i16) * (-24351)) ^ (-168576144);
                        i7 = -10447861;
                    }
                    i10 = iM6983 ^ i7;
                    c13001 = c13001;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -501118863:
                case -35548393:
                    iM19220 = iM19220;
                    z2 = z2;
                    zM6439 = ViewOnClickListenerC1958.m6437(strM19226, C3537.m10748(f18152, 74, 12, i20));
                    iM2566 = (C2105.m6981("ᩴۚ") + i16) * 89;
                    i = ((iM2566 ^ i15) * (-3227)) ^ 102471318;
                    i3 = 2018887610;
                    i5 = iM2566 ^ i3;
                    z2 = z2;
                    iM19220 = iM19220;
                    i18 = i5;
                    i17 = i;
                    break;
                case -250333576:
                case 881971434:
                    i23 = i22 + 1;
                    if (i23 == z2) {
                        iM6982 = (C2105.m6981("ᩳᩴ") + i16) * 123;
                        i = ((iM6982 ^ i15) * (-17153)) ^ (-1661935184);
                        i4 = -300510515;
                    } else {
                        iM6982 = (C0630.m2566("᩶ۧ") ^ i15) * (-75);
                        i = ((iM6982 ^ i16) * 29397) ^ (-1280637925);
                        i4 = 109825202;
                    }
                    i18 = iM6982 ^ i4;
                    i17 = i;
                    break;
                case -116021664:
                case 332174696:
                    i19 = i19;
                    c13001 = c13001;
                    i13 = s * s2;
                    if (C3432.f10845 >= 0) {
                        int iM6988 = C2105.m6981("᩵ۘ") ^ i16;
                        i6 = ((iM6988 ^ i15) * (-23651)) ^ (-1731526874);
                        i10 = iM6988 ^ 725173812;
                        c13001 = null;
                    } else {
                        iM6983 = C0630.m2566("ܿۡ") ^ i16;
                        i6 = ((iM6983 ^ i15) * 25225) ^ 1609749063;
                        i7 = 1531510558;
                        i10 = iM6983 ^ i7;
                        c13001 = c13001;
                    }
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case 147052550:
                case 506128252:
                    z = z2;
                    if (iM19220 == 3) {
                        iM6981 = (C2105.m6981("᩻ܶ") ^ i15) * (-33);
                        i = ((iM6981 ^ i16) * 31387) ^ (-1758013275);
                        i2 = -1562050610;
                        i5 = iM6981 ^ i2;
                        z2 = z;
                        i18 = i5;
                        i17 = i;
                    } else {
                        z2 = z;
                        iM6984 = C0630.m2566("᩷ᩴ") ^ i16;
                        i6 = ((iM6984 ^ i15) * 997) ^ 1055434413;
                        i8 = 1507270614;
                        i10 = iM6984 ^ i8;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    }
                    break;
                case 155395423:
                case 1907661591:
                    C7106.m19120();
                    if (C0630.f2410 > 0) {
                        iM6982 = C2105.m6981("۠᩹") ^ i15;
                        i = ((iM6982 ^ i16) * 11259) ^ (-8039440);
                        i4 = 203274913;
                    } else {
                        iM6982 = C2105.m6981("ۘ֨") ^ i15;
                        i = ((iM6982 ^ i16) * (-1441)) ^ 583621003;
                        i4 = 316511860;
                    }
                    i18 = iM6982 ^ i4;
                    i17 = i;
                    break;
                case 306552462:
                case 699739701:
                    i19 = i19;
                    c13001 = c13001;
                    sArr = f18152;
                    if (C3432.f10845 < 0) {
                        iM6983 = (i15 - C2105.m6981("ܶۙ")) * (-87);
                        i6 = ((iM6983 ^ i16) * (-17859)) ^ (-832051725);
                        i7 = -621698541;
                        i10 = iM6983 ^ i7;
                        c13001 = c13001;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    }
                    c13001 = c13001;
                    iM6984 = C2105.m6981("᩻۫") ^ i16;
                    i6 = ((iM6984 ^ i15) * (-26247)) ^ 1374066382;
                    i8 = 1145983575;
                    i10 = iM6984 ^ i8;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case 333073715:
                case 2010805366:
                    iM19220 = iM19220;
                    z2 = z2;
                    C2167.m7154(th, obj);
                    iM2566 = (C2105.m6981("ܺ֡") ^ i16) * 23;
                    i = ((iM2566 ^ i15) * (-8027)) ^ 1034619705;
                    i3 = 1585240044;
                    i5 = iM2566 ^ i3;
                    z2 = z2;
                    iM19220 = iM19220;
                    i18 = i5;
                    i17 = i;
                    break;
                case 375100689:
                case 1459555582:
                    iM19220 = iM19220;
                    z2 = z2;
                    if (i23 == i21) {
                        iM2566 = C2105.m6981("᩶۫") ^ i15;
                        i = ((iM2566 ^ i16) * (-13959)) ^ 397783440;
                        i3 = 2128822483;
                    } else {
                        iM2566 = (C2105.m6981("ۢۜ") + i16) * (-59);
                        i = ((iM2566 ^ i15) * 30363) ^ 1723277860;
                        i3 = 1289342557;
                    }
                    i5 = iM2566 ^ i3;
                    z2 = z2;
                    iM19220 = iM19220;
                    i18 = i5;
                    i17 = i;
                    break;
                case 524824916:
                case 856604018:
                    i21 = 2;
                    if (iM19220 != 2) {
                        iM6982 = C2105.m6981("۟ܰ") ^ i15;
                        i = ((iM6982 ^ i16) * 11043) ^ (-328849626);
                        i4 = 1764346266;
                    } else {
                        iM6982 = C0630.m2566("ۗ᩺") ^ i16;
                        i = ((iM6982 ^ i15) * (-5593)) ^ 1532634424;
                        i4 = 384329217;
                    }
                    i18 = iM6982 ^ i4;
                    i17 = i;
                    break;
                case 553065605:
                case 2134671422:
                    if (C0483.f2088 < 0) {
                        iM6982 = C2105.m6981("ܰܽ") ^ i16;
                        i = ((iM6982 ^ i15) * 20519) ^ (-1440850947);
                        i4 = 1660232001;
                        i18 = iM6982 ^ i4;
                        i17 = i;
                    } else {
                        i19 = i19;
                        c13000 = c13001;
                        iM6983 = C2105.m6981("᩺۟") ^ i15;
                        c13001 = c13000;
                        i6 = ((iM6983 ^ i16) * (-24351)) ^ (-168576144);
                        i7 = -10447861;
                        i10 = iM6983 ^ i7;
                        c13001 = c13001;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    }
                    break;
                case 610210874:
                case 1045158810:
                    iM19220 = iM19220;
                    z2 = z2;
                    if (!zM6437) {
                        z2 = z2;
                        iM19220 = iM19220;
                        iM6982 = (C2105.m6981("֨ۙ") + i16) * 27;
                        i = ((iM6982 ^ i15) * (-17571)) ^ 3804556;
                        i4 = 949977531;
                        i18 = iM6982 ^ i4;
                        i17 = i;
                    } else {
                        i22 = i23;
                        z2 = z2;
                        iM19220 = iM19220;
                        iM6984 = C0630.m2566("᩷ᩴ") ^ i16;
                        i6 = ((iM6984 ^ i15) * 997) ^ 1055434413;
                        i8 = 1507270614;
                        i10 = iM6984 ^ i8;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    }
                    break;
                case 876447714:
                case 1698805230:
                    C1916.m6312(c7744Mo26556);
                    return zM16579;
                case 977970775:
                case 1273850877:
                    try {
                        z = z2;
                        try {
                            zM4369 = C1294.m4369(strM19226, C1420.m4902(f18152, 86, 7, i20));
                            iM6981 = C2105.m6981("ۚܰ") ^ i15;
                            i = ((iM6981 ^ i16) * 24241) ^ (-689069527);
                            i2 = 384864919;
                            i5 = iM6981 ^ i2;
                            z2 = z;
                            i18 = i5;
                        } catch (Exception unused2) {
                            z2 = z;
                            iM6982 = (C2105.m6981("֨ۙ") + i16) * 27;
                            i = ((iM6982 ^ i15) * (-17571)) ^ 3804556;
                            i4 = 949977531;
                            i18 = iM6982 ^ i4;
                        }
                    } catch (Exception unused3) {
                        z = z2;
                    }
                    i17 = i;
                    break;
                case 1013779897:
                case 1853342081:
                    try {
                        zM16579 = m16579((GetChars) c7744Mo26556);
                        iM6982 = C0630.m2566("ۧۤ") ^ i16;
                        i = ((iM6982 ^ i15) * (-7359)) ^ 677504276;
                        i4 = 373556055;
                        i18 = iM6982 ^ i4;
                        i17 = i;
                    } catch (Throwable th3) {
                        int iM6989 = C2105.m6981("ۡۤ") ^ i16;
                        i18 = iM6989 ^ (-2031579924);
                        th = th3;
                        i17 = ((iM6989 ^ i15) * 8015) ^ (-586101023);
                    }
                    break;
                case 1158606011:
                case 1661981035:
                    i19 = i19;
                    c13001 = c13001;
                    c7184 = new C7184();
                    if (C4159.f13567) {
                        iM6983 = C2105.m6981("ܽ۫") ^ i15;
                        i6 = ((iM6983 ^ i16) * (-9091)) ^ (-110847307);
                        i7 = -1293771452;
                        i10 = iM6983 ^ i7;
                        c13001 = c13001;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    }
                    c13001 = c13001;
                    iM6984 = C2105.m6981("᩻۫") ^ i16;
                    i6 = ((iM6984 ^ i15) * (-26247)) ^ 1374066382;
                    i8 = 1145983575;
                    i10 = iM6984 ^ i8;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case 1356146165:
                case 2021853581:
                    if (C1420.f5096 > 0) {
                        i19 = i19;
                        int iM69810 = C2105.m6981("᩵ۘ") ^ i16;
                        i6 = ((iM69810 ^ i15) * (-23651)) ^ (-1731526874);
                        i10 = iM69810 ^ 725173812;
                        c13001 = null;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    }
                    i19 = i19;
                    c13000 = c13001;
                    iM6983 = C2105.m6981("᩺۟") ^ i15;
                    c13001 = c13000;
                    i6 = ((iM6983 ^ i16) * (-24351)) ^ (-168576144);
                    i7 = -10447861;
                    i10 = iM6983 ^ i7;
                    c13001 = c13001;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case 1717627830:
                case 2074937699:
                    try {
                        iM19220 = c7184.m19220();
                        iM6982 = C0630.m2566("ۨۡ") ^ i15;
                        i = ((iM6982 ^ i16) * (-32201)) ^ (-1517708276);
                        i4 = 1311235913;
                    } catch (Exception unused4) {
                        iM6982 = (C2105.m6981("֨ۙ") + i16) * 27;
                        i = ((iM6982 ^ i15) * (-17571)) ^ 3804556;
                        i4 = 949977531;
                    }
                    i18 = iM6982 ^ i4;
                    i17 = i;
                    break;
                case 1852606438:
                case 1998226604:
                    iM19220 = iM19220;
                    z2 = z2;
                    if (!zM4369) {
                        i22 = i23;
                        z2 = z2;
                        iM19220 = iM19220;
                        iM6984 = C0630.m2566("᩷ᩴ") ^ i16;
                        i6 = ((iM6984 ^ i15) * 997) ^ 1055434413;
                        i8 = 1507270614;
                        i10 = iM6984 ^ i8;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    } else {
                        iM2566 = (C0630.m2566("ۖۘ") ^ i15) * (-5);
                        i = ((iM2566 ^ i16) * (-25251)) ^ 1479924608;
                        i3 = -1605027198;
                        i5 = iM2566 ^ i3;
                        z2 = z2;
                        iM19220 = iM19220;
                        i18 = i5;
                        i17 = i;
                    }
                    break;
                default:
                    iM19220 = iM19220;
                    z2 = z2;
                    try {
                        iM19216 = c7184.m19216();
                        iM2566 = (i15 - C2105.m6981("᩺ܽ")) * (-125);
                        i = ((iM2566 ^ i16) * 30295) ^ 1444165654;
                        i3 = -1397393230;
                        i5 = iM2566 ^ i3;
                        z2 = z2;
                        iM19220 = iM19220;
                        i18 = i5;
                    } catch (Exception unused5) {
                        z2 = z2;
                        iM19220 = iM19220;
                        iM6982 = (C2105.m6981("֨ۙ") + i16) * 27;
                        i = ((iM6982 ^ i15) * (-17571)) ^ 3804556;
                        i4 = 949977531;
                        i18 = iM6982 ^ i4;
                    }
                    i17 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0156 A[PHI: r2 r3 r5 r14 r15
      0x0156: PHI (r2v5 java.util.Map$Entry) = (r2v3 java.util.Map$Entry), (r2v1 java.util.Map$Entry), (r2v1 java.util.Map$Entry) binds: [B:37:0x0154, B:30:0x0109, B:107:0x0156] A[DONT_GENERATE, DONT_INLINE]
      0x0156: PHI (r3v4 java.lang.Object) = (r3v2 java.lang.Object), (r3v1 java.lang.Object), (r3v1 java.lang.Object) binds: [B:37:0x0154, B:30:0x0109, B:107:0x0156] A[DONT_GENERATE, DONT_INLINE]
      0x0156: PHI (r5v4 java.lang.String) = (r5v1 java.lang.String), (r5v2 java.lang.String), (r5v1 java.lang.String) binds: [B:37:0x0154, B:30:0x0109, B:107:0x0156] A[DONT_GENERATE, DONT_INLINE]
      0x0156: PHI (r14v4 short[]) = (r14v1 short[]), (r14v2 short[]), (r14v1 short[]) binds: [B:37:0x0154, B:30:0x0109, B:107:0x0156] A[DONT_GENERATE, DONT_INLINE]
      0x0156: PHI (r15v4 int) = (r15v1 int), (r15v2 int), (r15v1 int) binds: [B:37:0x0154, B:30:0x0109, B:107:0x0156] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01d7 A[PHI: r1 r4 r9
      0x01d7: PHI (r1v26 java.util.Iterator) = 
      (r1v1 java.util.Iterator)
      (r1v1 java.util.Iterator)
      (r1v1 java.util.Iterator)
      (r1v1 java.util.Iterator)
      (r1v28 java.util.Iterator)
     binds: [B:34:0x012f, B:27:0x00e7, B:20:0x009e, B:5:0x004c, B:51:0x01ca] A[DONT_GENERATE, DONT_INLINE]
      0x01d7: PHI (r4v4 l.ۤ۟ܽ) = (r4v3 l.ۤ۟ܽ), (r4v1 l.ۤ۟ܽ), (r4v1 l.ۤ۟ܽ), (r4v1 l.ۤ۟ܽ), (r4v1 l.ۤ۟ܽ) binds: [B:34:0x012f, B:27:0x00e7, B:20:0x009e, B:5:0x004c, B:51:0x01ca] A[DONT_GENERATE, DONT_INLINE]
      0x01d7: PHI (r9v3 l.᩸۟ۡ) = (r9v2 l.᩸۟ۡ), (r9v2 l.᩸۟ۡ), (r9v2 l.᩸۟ۡ), (r9v2 l.᩸۟ۡ), (r9v4 l.᩸۟ۡ) binds: [B:34:0x012f, B:27:0x00e7, B:20:0x009e, B:5:0x004c, B:51:0x01ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02c2 A[PHI: r17 r21 r22
      0x02c2: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:74:0x02c0, B:70:0x02a3, B:11:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x02c2: PHI (r21v36 java.util.Iterator) = (r21v21 java.util.Iterator), (r21v22 java.util.Iterator), (r21v37 java.util.Iterator) binds: [B:74:0x02c0, B:70:0x02a3, B:11:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x02c2: PHI (r22v5 short) = (r22v3 short), (r22v4 short), (r22v3 short) binds: [B:74:0x02c0, B:70:0x02a3, B:11:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x02f2 A[PHI: r6 r7 r8 r16 r21 r23
      0x02f2: PHI (r6v2 java.lang.String) = (r6v1 java.lang.String), (r6v1 java.lang.String), (r6v3 java.lang.String) binds: [B:78:0x02f0, B:66:0x0283, B:50:0x01c6] A[DONT_GENERATE, DONT_INLINE]
      0x02f2: PHI (r7v3 short[]) = (r7v2 short[]), (r7v2 short[]), (r7v4 short[]) binds: [B:78:0x02f0, B:66:0x0283, B:50:0x01c6] A[DONT_GENERATE, DONT_INLINE]
      0x02f2: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:78:0x02f0, B:66:0x0283, B:50:0x01c6] A[DONT_GENERATE, DONT_INLINE]
      0x02f2: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:78:0x02f0, B:66:0x0283, B:50:0x01c6] A[DONT_GENERATE, DONT_INLINE]
      0x02f2: PHI (r21v32 java.util.Iterator) = (r21v20 java.util.Iterator), (r21v23 java.util.Iterator), (r21v33 java.util.Iterator) binds: [B:78:0x02f0, B:66:0x0283, B:50:0x01c6] A[DONT_GENERATE, DONT_INLINE]
      0x02f2: PHI (r23v3 int) = (r23v1 int), (r23v2 int), (r23v1 int) binds: [B:78:0x02f0, B:66:0x0283, B:50:0x01c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0089, code lost:
    
        if (l.C1128.f4106 <= 0) goto L11;
     */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C21434 m16580(CharSequence charSequence) throws Throwable {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int i4;
        int i5;
        Iterator itM1837 = null;
        Map.Entry entry = null;
        Object value = null;
        C10150 c10150 = null;
        String str = null;
        String str2 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short[] sArr = null;
        int i9 = 0;
        int i10 = -575561587;
        int i11 = C11340.f33930;
        int i12 = C3019.f9544;
        int iM2568 = (i12 - C0630.m2566("ۙ᩷")) * (-31);
        int i13 = ((iM2568 ^ i11) * 5373) ^ (-926419444);
        int i14 = iM2568 ^ 715982885;
        int i15 = 0;
        C21434 c21434 = null;
        char c = 0;
        short s = 0;
        int i16 = 0;
        short[] sArr2 = null;
        short[] sArr3 = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i11) * 2305) >> 31));
            switch (i10) {
                case -1956747064:
                case -554204441:
                    if (!C3663.f11553) {
                        iM2566 = C0630.m2566("ۧ֫") ^ i12;
                        i = ((iM2566 ^ i11) * (-24135)) ^ 1698214;
                        i2 = 1406983180;
                        i14 = iM2566 ^ i2;
                        i13 = i;
                    } else {
                        itM1837 = itM1837;
                        iM2567 = (C0630.m2566("ۤ۠") + i11) * 83;
                        i3 = ((iM2567 ^ i12) * (-5263)) ^ (-1393862860);
                        i4 = 879577889;
                        i5 = iM2567 ^ i4;
                        Iterator it = itM1837;
                        i14 = i5;
                        i13 = i3;
                        itM1837 = it;
                    }
                    break;
                case -1837129907:
                case 647261457:
                    RunnableC0588.m2441();
                    return null;
                case -1757740115:
                case -1702861689:
                    ServiceConnectionC3453.m10564();
                    break;
                case -1614009877:
                case 1131743558:
                    return c21434;
                case -1606775833:
                case 403763702:
                    itM1837 = itM1837;
                    i6 = i16 * i16;
                    i7 = s * 2;
                    if (C2126.f7087) {
                        iM2567 = (C0630.m2566("ۤ۠") + i11) * 83;
                        i3 = ((iM2567 ^ i12) * (-5263)) ^ (-1393862860);
                        i4 = 879577889;
                    } else {
                        iM2567 = C2105.m6981("ۤܿ") ^ i12;
                        i3 = ((iM2567 ^ i11) * (-1889)) ^ (-461276161);
                        i4 = -817390202;
                    }
                    i5 = iM2567 ^ i4;
                    Iterator it2 = itM1837;
                    i14 = i5;
                    i13 = i3;
                    itM1837 = it2;
                    break;
                case -1536387301:
                case 585549997:
                    itM1837 = itM1837;
                    if ((i7 + 1) - i6 > 0) {
                        iM2567 = C2105.m6981("ۛۡ") ^ i11;
                        i3 = ((iM2567 ^ i12) * (-2353)) ^ 1194347787;
                        i4 = -1375395968;
                    } else {
                        iM2567 = (C2105.m6981("᩺ۗ") ^ i11) * (-87);
                        i3 = ((iM2567 ^ i12) * (-8003)) ^ 1032892174;
                        i4 = -135210884;
                    }
                    i5 = iM2567 ^ i4;
                    Iterator it3 = itM1837;
                    i14 = i5;
                    i13 = i3;
                    itM1837 = it3;
                    break;
                case -1439098422:
                case -1321590601:
                    if (C4616.m13554(str, C2126.m7036(sArr, i9, 1, i8))) {
                        iM2566 = (C0630.m2566("۬ۗ") ^ i12) * 27;
                        i = ((iM2566 ^ i11) * 13105) ^ (-814056794);
                        i2 = -635615440;
                    } else {
                        iM2566 = C2105.m6981("ۖ᩸") ^ i11;
                        i = ((iM2566 ^ i12) * 25585) ^ (-695902298);
                        i2 = -1257588701;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -1312947435:
                case 1629516157:
                    str2 = c10150.f30526;
                    sArr3 = f18152;
                    i15 = 99;
                    if (C1128.m3851() > 0) {
                        iM2566 = C0630.m2566("᩹᩸") ^ i12;
                        i = ((iM2566 ^ i11) * (-5611)) ^ 1596202582;
                        i2 = -1094514791;
                        i14 = iM2566 ^ i2;
                        i13 = i;
                    } else {
                        itM1837 = itM1837;
                        int iM2569 = (C0630.m2566("ۤܺ") ^ i11) * (-71);
                        i3 = ((iM2569 ^ i12) * 9133) ^ 670023949;
                        i5 = iM2569 ^ (-152854275);
                        c21434 = null;
                        Iterator it4 = itM1837;
                        i14 = i5;
                        i13 = i3;
                        itM1837 = it4;
                    }
                    break;
                case -1099067816:
                case 1800546262:
                    C1916.m6308();
                    if (C3432.f10845 < 0) {
                        iM2566 = C0630.m2566("۬֫") ^ i12;
                        i = ((iM2566 ^ i11) * 25997) ^ (-1147975171);
                        i2 = 2056935010;
                        i14 = iM2566 ^ i2;
                        i13 = i;
                    } else {
                        itM1837 = itM1837;
                        iM2567 = C2105.m6981("֫᩵") ^ i12;
                        i3 = ((iM2567 ^ i11) * 14303) ^ (-1477329914);
                        i4 = 2145311895;
                        i5 = iM2567 ^ i4;
                        Iterator it5 = itM1837;
                        i14 = i5;
                        i13 = i3;
                        itM1837 = it5;
                    }
                    break;
                case -965414066:
                case 1354868974:
                    c10150 = (C10150) value;
                    if (C9445.m24273(c10150.f30526)) {
                        iM2566 = C2105.m6981("᩺۠") ^ i11;
                        i = ((iM2566 ^ i12) * (-19241)) ^ 2091276549;
                        i2 = -1234391663;
                    } else {
                        iM2566 = (C0630.m2566("۬ۗ") ^ i12) * 27;
                        i = ((iM2566 ^ i11) * 13105) ^ (-814056794);
                        i2 = -635615440;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -903959703:
                case -622732134:
                    if (C0483.m2123(itM1837)) {
                        iM2566 = C2105.m6981("᩸ۙ") ^ i11;
                        i = ((iM2566 ^ i12) * (-20615)) ^ (-1481187958);
                        i2 = -1666780892;
                    } else {
                        iM2566 = C0630.m2566("ۚۙ") ^ i11;
                        i = ((iM2566 ^ i12) * 15331) ^ (-161368108);
                        i2 = -1755318971;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -787798552:
                case 1228138775:
                    itM1837 = itM1837;
                    c = 'a';
                    if (C2958.f9394 >= 0) {
                        iM2567 = C2105.m6981("֫᩵") ^ i12;
                        i3 = ((iM2567 ^ i11) * 14303) ^ (-1477329914);
                        i4 = 2145311895;
                    } else {
                        iM2567 = C2105.m6981("ۧ۟") ^ i11;
                        i3 = ((iM2567 ^ i12) * (-8971)) ^ 2021285960;
                        i4 = 249118117;
                    }
                    i5 = iM2567 ^ i4;
                    Iterator it6 = itM1837;
                    i14 = i5;
                    i13 = i3;
                    itM1837 = it6;
                    break;
                case -723453139:
                case -621558207:
                    itM1837 = itM1837;
                    s = sArr2[c];
                    if (C4159.f13567) {
                        iM2567 = C0630.m2566("ۚ۫") ^ i11;
                        i3 = ((iM2567 ^ i12) * 15921) ^ (-1037870661);
                        i4 = -847182605;
                    } else {
                        iM2567 = C2105.m6981("֫᩵") ^ i12;
                        i3 = ((iM2567 ^ i11) * 14303) ^ (-1477329914);
                        i4 = 2145311895;
                    }
                    i5 = iM2567 ^ i4;
                    Iterator it7 = itM1837;
                    i14 = i5;
                    i13 = i3;
                    itM1837 = it7;
                    break;
                case -608572408:
                case 1648734475:
                    str = c10150.f30526;
                    sArr = f18152;
                    i9 = 98;
                    if (C3019.f9544 >= 0) {
                        iM2566 = C0630.m2566("ۧ֫") ^ i12;
                        i = ((iM2566 ^ i11) * (-24135)) ^ 1698214;
                        i2 = 1406983180;
                    } else {
                        iM2566 = (C0630.m2566("ۧܺ") + i12) * 51;
                        i = ((iM2566 ^ i11) * 16801) ^ 1589220760;
                        i2 = -43806157;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -428670820:
                case -380770794:
                    Map mapM16576 = m16576(charSequence);
                    if (C0237.f1507 != 0 || RunnableC1108.m3790()) {
                        itM1837 = itM1837;
                        int iM25610 = (C0630.m2566("ۤܺ") ^ i11) * (-71);
                        i3 = ((iM25610 ^ i12) * 9133) ^ 670023949;
                        i5 = iM25610 ^ (-152854275);
                        c21434 = null;
                        Iterator it8 = itM1837;
                        i14 = i5;
                        i13 = i3;
                        itM1837 = it8;
                    } else {
                        c21434 = new C21434(0, true);
                        itM1837 = C0382.m1837(mapM16576.entrySet());
                        iM2566 = (C0630.m2566("۬ۗ") ^ i12) * 27;
                        i = ((iM2566 ^ i11) * 13105) ^ (-814056794);
                        i2 = -635615440;
                        i14 = iM2566 ^ i2;
                        i13 = i;
                    }
                    break;
                case -320260434:
                case 301440309:
                    i8 = 29457;
                    iM2567 = C0630.m2566("ᩳۜ") ^ i12;
                    i3 = ((iM2567 ^ i11) * 13601) ^ (-1098974417);
                    i4 = 82793775;
                    i5 = iM2567 ^ i4;
                    Iterator it9 = itM1837;
                    i14 = i5;
                    i13 = i3;
                    itM1837 = it9;
                    break;
                case -124273809:
                case 1398915446:
                    if (C7811.m20838(str2, C1916.m6311(sArr3, i15, 1, i8))) {
                        iM2566 = (C0630.m2566("۬ۗ") ^ i12) * 27;
                        i = ((iM2566 ^ i11) * 13105) ^ (-814056794);
                        i2 = -635615440;
                    } else {
                        iM2566 = (i11 - C0630.m2566("ܿ֡")) * (-3);
                        i = ((iM2566 ^ i12) * 9025) ^ 330066780;
                        i2 = 551693416;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -39878775:
                case 2065331045:
                    C1773.m5908();
                    itM1837 = itM1837;
                    iM2567 = C2105.m6981("֫᩵") ^ i12;
                    i3 = ((iM2567 ^ i11) * 14303) ^ (-1477329914);
                    i4 = 2145311895;
                    i5 = iM2567 ^ i4;
                    Iterator it10 = itM1837;
                    i14 = i5;
                    i13 = i3;
                    itM1837 = it10;
                    break;
                case 296036392:
                case 430700702:
                    itM1837 = itM1837;
                    i16 = s + 1;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        int iM25611 = (C0630.m2566("ۤܺ") ^ i11) * (-71);
                        i3 = ((iM25611 ^ i12) * 9133) ^ 670023949;
                        i5 = iM25611 ^ (-152854275);
                        c21434 = null;
                    } else {
                        iM2567 = (C2105.m6981("ۧ۫") ^ i12) * 87;
                        i3 = ((iM2567 ^ i11) * 28267) ^ 1048503361;
                        i4 = 1642684971;
                        i5 = iM2567 ^ i4;
                    }
                    Iterator it11 = itM1837;
                    i14 = i5;
                    i13 = i3;
                    itM1837 = it11;
                    break;
                case 320879831:
                case 810377293:
                    itM1837 = itM1837;
                    sArr2 = f18152;
                    if (C0382.f1805) {
                        iM2567 = C0630.m2566("ۡۨ") ^ i12;
                        i3 = ((iM2567 ^ i11) * (-23597)) ^ 1560843342;
                        i4 = -1533887296;
                        i5 = iM2567 ^ i4;
                    } else {
                        int iM25612 = (C0630.m2566("ۤܺ") ^ i11) * (-71);
                        i3 = ((iM25612 ^ i12) * 9133) ^ 670023949;
                        i5 = iM25612 ^ (-152854275);
                        c21434 = null;
                    }
                    Iterator it12 = itM1837;
                    i14 = i5;
                    i13 = i3;
                    itM1837 = it12;
                    break;
                case 352989494:
                case 1217391993:
                    entry = (Map.Entry) C2272.m7513(itM1837);
                    value = entry.getValue();
                    if (C7811.f24123 >= 0) {
                        iM2566 = C0630.m2566("ۧ֫") ^ i12;
                        i = ((iM2566 ^ i11) * (-24135)) ^ 1698214;
                        i2 = 1406983180;
                    } else {
                        iM2566 = (i12 - C0630.m2566("᩶ۧ")) * (-125);
                        i = ((iM2566 ^ i11) * (-16633)) ^ (-1408060377);
                        i2 = -1452137389;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case 674508455:
                case 2049958874:
                    i8 = 12507;
                    iM2567 = C0630.m2566("ᩳۜ") ^ i12;
                    i3 = ((iM2567 ^ i11) * 13601) ^ (-1098974417);
                    i4 = 82793775;
                    i5 = iM2567 ^ i4;
                    Iterator it13 = itM1837;
                    i14 = i5;
                    i13 = i3;
                    itM1837 = it13;
                    break;
                default:
                    c21434.m48549((String) entry.getKey(), c10150.f30526);
                    iM2566 = (C0630.m2566("۬ۗ") ^ i12) * 27;
                    i = ((iM2566 ^ i11) * 13105) ^ (-814056794);
                    i2 = -635615440;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01c7 A[PHI: r3 r4 r9 r10 r11 r19
      0x01c7: PHI (r3v3 int) = (r3v1 int), (r3v1 int), (r3v2 int), (r3v1 int) binds: [B:53:0x01c5, B:49:0x019e, B:32:0x0105, B:28:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:53:0x01c5, B:49:0x019e, B:32:0x0105, B:28:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r9v4 java.util.Map$Entry) = (r9v3 java.util.Map$Entry), (r9v1 java.util.Map$Entry), (r9v1 java.util.Map$Entry), (r9v1 java.util.Map$Entry) binds: [B:53:0x01c5, B:49:0x019e, B:32:0x0105, B:28:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r10v3 java.lang.Object) = (r10v2 java.lang.Object), (r10v1 java.lang.Object), (r10v1 java.lang.Object), (r10v1 java.lang.Object) binds: [B:53:0x01c5, B:49:0x019e, B:32:0x0105, B:28:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r11v4 java.lang.String) = (r11v1 java.lang.String), (r11v3 java.lang.String), (r11v1 java.lang.String), (r11v1 java.lang.String) binds: [B:53:0x01c5, B:49:0x019e, B:32:0x0105, B:28:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r19v2 int) = (r19v1 int), (r19v1 int), (r19v1 int), (r19v3 int) binds: [B:53:0x01c5, B:49:0x019e, B:32:0x0105, B:28:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02fe A[PHI: r2 r7 r18 r20 r21 r26
      0x02fe: PHI (r2v61 int) = (r2v5 int), (r2v59 int), (r2v62 int) binds: [B:77:0x02e6, B:14:0x0070, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x02fe: PHI (r7v4 l.᩸᩸ᩳ) = (r7v3 l.᩸᩸ᩳ), (r7v2 l.᩸᩸ᩳ), (r7v2 l.᩸᩸ᩳ) binds: [B:77:0x02e6, B:14:0x0070, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x02fe: PHI (r18v4 java.util.Set) = (r18v3 java.util.Set), (r18v2 java.util.Set), (r18v2 java.util.Set) binds: [B:77:0x02e6, B:14:0x0070, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x02fe: PHI (r20v4 int) = (r20v1 int), (r20v3 int), (r20v1 int) binds: [B:77:0x02e6, B:14:0x0070, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x02fe: PHI (r21v4 java.lang.String) = (r21v1 java.lang.String), (r21v3 java.lang.String), (r21v1 java.lang.String) binds: [B:77:0x02e6, B:14:0x0070, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x02fe: PHI (r26v2 java.util.Map) = (r26v1 java.util.Map), (r26v1 java.util.Map), (r26v3 java.util.Map) binds: [B:77:0x02e6, B:14:0x0070, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006d, code lost:
    
        if (l.C1504.m5179() != false) goto L10;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m16578(C21434 c21434, InterfaceC7785 interfaceC7785) throws Throwable {
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        int iM2567;
        int i4;
        C21434 c21435 = c21434;
        int i5 = 0;
        int i6 = 0;
        Map.Entry entry = null;
        Object key = null;
        String str = null;
        C10150 c10150 = null;
        String strM48553 = null;
        int iM3007 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int iM5741 = 0;
        String str2 = null;
        int i10 = -1873481051;
        int i11 = C5695.f17556;
        int i12 = C3537.f11231;
        int iM2568 = C0630.m2566("ۗۡ") ^ i11;
        int i13 = ((iM2568 ^ i12) * (-5807)) ^ 2143406488;
        int i14 = iM2568 ^ (-1864015347);
        Set setEntrySet = null;
        Iterator itM1837 = null;
        int i15 = 0;
        int iM5742 = 0;
        C21856 c21856 = null;
        Map mapM16576 = null;
        int i16 = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * 3397) >> 31));
            switch (i10) {
                case -1959820781:
                case -691461979:
                    Selection.setSelection(interfaceC7785, i6);
                    i16 = i16;
                    iM2566 = C2105.m6981("ܰۘ") ^ i12;
                    i = ((iM2566 ^ i11) * 18009) ^ (-406382739);
                    i2 = -1277349359;
                    i14 = iM2566 ^ i2;
                    c21435 = c21434;
                    i16 = i16;
                    i13 = i;
                    break;
                case -1856314555:
                case 1070173013:
                    C4159.m12565();
                    if (C1916.m6308() >= 0) {
                        iM2567 = (i12 - C0630.m2566("᩺ᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i13 = ((iM2567 ^ i11) * (-817)) ^ 1642050008;
                        i4 = -1045553691;
                        i14 = iM2567 ^ i4;
                        c21435 = c21434;
                    } else {
                        i16 = i16;
                        int iM2569 = C0630.m2566("ܶ۟") ^ i11;
                        i = ((iM2569 ^ i12) * 14767) ^ 395400468;
                        i14 = iM2569 ^ (-1738589786);
                        c21856 = null;
                        c21435 = c21434;
                        i16 = i16;
                        i13 = i;
                    }
                    break;
                case -1742605445:
                case -620398461:
                    c10150 = (C10150) entry.getValue();
                    if (c21435.containsKey(str)) {
                        iM6981 = C2105.m6981("ۛ۟") ^ i12;
                        i = ((iM6981 ^ i11) * 7455) ^ 1728265843;
                        i3 = 2124324023;
                        i14 = iM6981 ^ i3;
                        i13 = i;
                    }
                    iM2566 = (C2105.m6981("ۙ᩻") ^ i12) * 59;
                    i = ((iM2566 ^ i11) * 1267) ^ 1060429556;
                    i2 = 2126028303;
                    i14 = iM2566 ^ i2;
                    c21435 = c21434;
                    i16 = i16;
                    i13 = i;
                    break;
                case -1722123208:
                case 271165456:
                    if (C0630.f2410 <= 0) {
                        iM6981 = (C0630.m2566("ۜ۠") + i12) * (-121);
                        i = ((iM6981 ^ i11) * (-20449)) ^ (-1145702746);
                        i3 = 1168483375;
                        i14 = iM6981 ^ i3;
                        i13 = i;
                    }
                    i16 = i16;
                    int iM25610 = C0630.m2566("ܶ۟") ^ i11;
                    i = ((iM25610 ^ i12) * 14767) ^ 395400468;
                    i14 = iM25610 ^ (-1738589786);
                    c21856 = null;
                    c21435 = c21434;
                    i16 = i16;
                    i13 = i;
                    break;
                case -1702573171:
                case 914760576:
                    C4159.m12565();
                    C4117.m12364();
                    i16 = i16;
                    int iM25611 = C0630.m2566("ܶ۟") ^ i11;
                    i = ((iM25611 ^ i12) * 14767) ^ 395400468;
                    i14 = iM25611 ^ (-1738589786);
                    c21856 = null;
                    c21435 = c21434;
                    i16 = i16;
                    i13 = i;
                    break;
                case -1687660963:
                case 135193710:
                    i6 = -1;
                    iM3007 = 0;
                    iM2566 = (C2105.m6981("ۙ᩻") ^ i12) * 59;
                    i = ((iM2566 ^ i11) * 1267) ^ 1060429556;
                    i2 = 2126028303;
                    i14 = iM2566 ^ i2;
                    c21435 = c21434;
                    i16 = i16;
                    i13 = i;
                    break;
                case -1665636466:
                case 325591353:
                    iM3007 = (iM3007 - C0798.m3007(str2)) + C0798.m3007(strM48553);
                    i6 = iM5741;
                    iM2566 = (C2105.m6981("ۙ᩻") ^ i12) * 59;
                    i = ((iM2566 ^ i11) * 1267) ^ 1060429556;
                    i2 = 2126028303;
                    i14 = iM2566 ^ i2;
                    c21435 = c21434;
                    i16 = i16;
                    i13 = i;
                    break;
                case -1654107789:
                case 1650777075:
                    break;
                case -1582232427:
                case 1121296324:
                    break;
                case -1356379239:
                case 1333582157:
                    strM48553 = c21435.m48553(str);
                    if (!C1294.m4369(strM48553, c10150.f30526)) {
                        iM6981 = (C2105.m6981("ۨܽ") + i11) * 43;
                        i = ((iM6981 ^ i12) * 18195) ^ 1524807479;
                        i3 = -1645126817;
                        i14 = iM6981 ^ i3;
                        i13 = i;
                    }
                    iM2566 = (C2105.m6981("ۙ᩻") ^ i12) * 59;
                    i = ((iM2566 ^ i11) * 1267) ^ 1060429556;
                    i2 = 2126028303;
                    i14 = iM2566 ^ i2;
                    c21435 = c21434;
                    i16 = i16;
                    i13 = i;
                    break;
                case -1261583534:
                case 203660494:
                    str = (String) key;
                    if (C3537.f11231 >= 0) {
                        iM6981 = (i11 - C0630.m2566("ܳۡ")) * 31;
                        i = ((iM6981 ^ i12) * 21965) ^ 511398057;
                        i3 = 684453266;
                    } else {
                        iM6981 = (i12 - C2105.m6981("֨᩺")) * 69;
                        i = ((iM6981 ^ i11) * (-747)) ^ (-1265832509);
                        i3 = 512235811;
                    }
                    i14 = iM6981 ^ i3;
                    i13 = i;
                    break;
                case -1250940658:
                case 936996021:
                    c21856.m49244();
                    i16 = i16;
                    if (i6 == i16) {
                        iM2566 = C2105.m6981("ܰۘ") ^ i12;
                        i = ((iM2566 ^ i11) * 18009) ^ (-406382739);
                        i2 = -1277349359;
                        i14 = iM2566 ^ i2;
                        c21435 = c21434;
                        i16 = i16;
                        i13 = i;
                    } else {
                        int iM6982 = C2105.m6981("۠ۗ") ^ i11;
                        i14 = iM6982 ^ 1006557957;
                        i16 = i16;
                        i13 = ((iM6982 ^ i12) * 6507) ^ 403823224;
                        c21435 = c21434;
                    }
                    break;
                case -1196742094:
                case 79332779:
                    i15 = i8 + iM3007;
                    iM5742 = C1711.m5741(strM48553);
                    if (C1773.m5908() <= 0) {
                        iM6981 = (i11 - C0630.m2566("ܳۡ")) * 31;
                        i = ((iM6981 ^ i12) * 21965) ^ 511398057;
                        i3 = 684453266;
                    } else {
                        iM6981 = C2105.m6981("ۡۙ") ^ i12;
                        i = ((iM6981 ^ i11) * (-7431)) ^ 1065092550;
                        i3 = 446040077;
                    }
                    i14 = iM6981 ^ i3;
                    i13 = i;
                    break;
                case -1075247439:
                case 1905400491:
                    itM1837 = C0382.m1837(setEntrySet);
                    i5 = 0;
                    i16 = -1;
                    if (C4159.f13567) {
                        iM2567 = C0630.m2566("ۙ֡") ^ i11;
                        i13 = ((iM2567 ^ i12) * 7551) ^ (-1347520584);
                        i4 = -449241647;
                    } else {
                        iM2567 = (i12 - C0630.m2566("᩺ᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i13 = ((iM2567 ^ i11) * (-817)) ^ 1642050008;
                        i4 = -1045553691;
                    }
                    i14 = iM2567 ^ i4;
                    c21435 = c21434;
                    break;
                case -886056865:
                case -759889084:
                    c21856.delete(i7, i15);
                    c21856.m49243(i7, i5, iM5742, strM48553);
                    i9 = c10150.f30528;
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = (i11 - C0630.m2566("ܳۡ")) * 31;
                        i = ((iM6981 ^ i12) * 21965) ^ 511398057;
                        i3 = 684453266;
                    } else {
                        iM6981 = (C2105.m6981("ܺۨ") ^ i12) * 9;
                        i = ((iM6981 ^ i11) * 23703) ^ (-1874875838);
                        i3 = 326272602;
                    }
                    i14 = iM6981 ^ i3;
                    i13 = i;
                    break;
                case -874859368:
                case 1457165209:
                    i16 = i16;
                    if (C3911.f12484 >= 0) {
                        int iM25612 = C0630.m2566("ܶ۟") ^ i11;
                        i = ((iM25612 ^ i12) * 14767) ^ 395400468;
                        i14 = iM25612 ^ (-1738589786);
                        c21856 = null;
                    } else {
                        c21856 = new C21856(interfaceC7785);
                        setEntrySet = mapM16576.entrySet();
                        if (C1711.m5736() <= 0) {
                            iM2566 = C2105.m6981("ۢ᩺") ^ i11;
                            i = ((iM2566 ^ i12) * 5589) ^ (-1851007039);
                            i2 = -48339041;
                        } else {
                            iM2566 = C0630.m2566("ܿۙ") ^ i11;
                            i = ((iM2566 ^ i12) * 24773) ^ (-397264295);
                            i2 = 1390330268;
                        }
                        i14 = iM2566 ^ i2;
                    }
                    c21435 = c21434;
                    i16 = i16;
                    i13 = i;
                    break;
                case -380416866:
                case 728738647:
                    i16 = i16;
                    if (C1773.m5910(itM1837)) {
                        iM2566 = C0630.m2566("᩸ᩳ") ^ i11;
                        i = ((iM2566 ^ i12) * (-9731)) ^ (-185565970);
                        i2 = 384626610;
                    } else {
                        iM2566 = C2105.m6981("ۖۗ") ^ i12;
                        i = ((iM2566 ^ i11) * (-7869)) ^ 187478575;
                        i2 = -429868482;
                    }
                    i14 = iM2566 ^ i2;
                    c21435 = c21434;
                    i16 = i16;
                    i13 = i;
                    break;
                case -69697250:
                case 1115770558:
                    entry = (Map.Entry) C2272.m7513(itM1837);
                    key = entry.getKey();
                    if (C2126.f7087) {
                        iM6981 = (i11 - C0630.m2566("ܳۡ")) * 31;
                        i = ((iM6981 ^ i12) * 21965) ^ 511398057;
                        i3 = 684453266;
                    } else {
                        iM6981 = (C2105.m6981("ۨܿ") ^ i11) * 81;
                        i = ((iM6981 ^ i12) * 12047) ^ 484505290;
                        i3 = -1166356910;
                    }
                    i14 = iM6981 ^ i3;
                    i13 = i;
                    break;
                case 498688105:
                case 1291565470:
                    iM5741 = i9 + iM3007 + C1711.m5741(strM48553);
                    str2 = c10150.f30526;
                    if (C0382.f1805) {
                        iM6981 = (C2105.m6981("ۛۜ") + i11) * (-93);
                        i = ((iM6981 ^ i12) * (-355)) ^ 1338733741;
                        i3 = -1044271343;
                        i14 = iM6981 ^ i3;
                        i13 = i;
                    }
                    i16 = i16;
                    iM2566 = C2105.m6981("ۢ᩺") ^ i11;
                    i = ((iM2566 ^ i12) * 5589) ^ (-1851007039);
                    i2 = -48339041;
                    i14 = iM2566 ^ i2;
                    c21435 = c21434;
                    i16 = i16;
                    i13 = i;
                    break;
                case 1167507643:
                case 1759704166:
                    i7 = c10150.f30528 + iM3007;
                    i8 = c10150.f30527;
                    if (C0237.f1507 == 0) {
                        iM6981 = C0630.m2566("ۙ۠") ^ i11;
                        i = ((iM6981 ^ i12) * (-9377)) ^ 1933832991;
                        i3 = 1436340546;
                        i14 = iM6981 ^ i3;
                        i13 = i;
                    } else {
                        iM2567 = (i12 - C0630.m2566("᩺ᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i13 = ((iM2567 ^ i11) * (-817)) ^ 1642050008;
                        i4 = -1045553691;
                        i14 = iM2567 ^ i4;
                        c21435 = c21434;
                    }
                    break;
                case 1380553664:
                case 1969815448:
                    RunnableC1108.m3790();
                    break;
                default:
                    i16 = i16;
                    mapM16576 = m16576((CharSequence) interfaceC7785);
                    if (C1128.f4106 <= 0) {
                        iM2566 = C2105.m6981("ۢ᩺") ^ i11;
                        i = ((iM2566 ^ i12) * 5589) ^ (-1851007039);
                        i2 = -48339041;
                    } else {
                        iM2566 = C0630.m2566("᩹ۢ") ^ i12;
                        i = ((iM2566 ^ i11) * 7561) ^ (-30587595);
                        i2 = 442532699;
                    }
                    i14 = iM2566 ^ i2;
                    c21435 = c21434;
                    i16 = i16;
                    i13 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10150 m16577(CharSequence charSequence, C19220 c19220) {
        ArrayList arrayListM44345 = null;
        Object objM49339 = null;
        AbstractC8636 abstractC8636 = null;
        int iM22403 = 0;
        int iM7032 = 0;
        int i = 0;
        int i2 = 0;
        AbstractC8636 abstractC8637 = null;
        int iM22402 = 0;
        int iLastIndexOf = 0;
        int i3 = -785162225;
        int i4 = C3746.f11829;
        int i5 = RunnableC1937.f6483;
        int iM2566 = (C0630.m2566("ۜۗ") ^ i4) * 83;
        int i6 = ((iM2566 ^ i5) * 19253) ^ (-1203242387);
        int i7 = 1623898247;
        while (true) {
            i3 = ((((i3 ^ i5) * 9311) >> 31) & i6) ^ (iM2566 ^ i7);
            switch (i3) {
                case -2082702681:
                case 431477432:
                    C0630.m2564();
                    if (C0630.f2410 <= 0) {
                        iM2566 = (i5 - C0630.m2566("۬ۛ")) * 5;
                        i6 = ((iM2566 ^ i4) * 23991) ^ (-426945102);
                        i7 = -2117618438;
                    } else {
                        iM2566 = C2105.m6981("ᩳ᩵") ^ i5;
                        i6 = ((iM2566 ^ i4) * 3315) ^ (-302278717);
                        i7 = 966695270;
                    }
                    break;
                case -1865014540:
                case 1981034887:
                    if (!RunnableC1108.f4040) {
                        iM2566 = C0630.m2566("᩶۟") ^ i4;
                        i6 = ((iM2566 ^ i5) * 18041) ^ (-1540520623);
                        i7 = 1730090953;
                    } else {
                        iM2566 = C2105.m6981("ᩳ᩵") ^ i5;
                        i6 = ((iM2566 ^ i4) * 3315) ^ (-302278717);
                        i7 = 966695270;
                    }
                    break;
                case -1842785503:
                case -261927676:
                    iM22403 = abstractC8636.m22403();
                    if (C7106.m19120() <= 0) {
                        iM2566 = C2105.m6981("ᩳ᩵") ^ i5;
                        i6 = ((iM2566 ^ i4) * 3315) ^ (-302278717);
                        i7 = 966695270;
                    } else {
                        iM2566 = C2105.m6981("᩵᩺") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-6797)) ^ 1066369609;
                        i7 = -1120445240;
                    }
                    break;
                case -1579935025:
                case 1644843475:
                    i2 = iM7032 + i;
                    if (C7106.m19120() <= 0) {
                        iM2566 = (C2105.m6981("ۙܳ") + i4) * (-67);
                        i6 = ((iM2566 ^ i5) * 1977) ^ (-326213218);
                        i7 = -1758199420;
                    } else {
                        iM2566 = (C2105.m6981("᩵ۖ") + i4) * (-95);
                        i6 = ((iM2566 ^ i5) * 29259) ^ (-1251328147);
                        i7 = 280067917;
                    }
                    break;
                case -1522876414:
                case -212287245:
                    iLastIndexOf = TextUtils.lastIndexOf(charSequence, '<', c19220.m22402());
                    if (C0964.f3626 != 0) {
                        iM2566 = C2105.m6981("۫ۜ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-9033)) ^ 1861160321;
                        i7 = -166742208;
                    } else {
                        iM2566 = C0630.m2566("ܺۜ") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-20751)) ^ 1756163336;
                        i7 = -1141802776;
                    }
                    break;
                case -1468135378:
                case 664282330:
                    C2520.m8026();
                    iM2566 = C0630.m2566("᩶۟") ^ i4;
                    i6 = ((iM2566 ^ i5) * 18041) ^ (-1540520623);
                    i7 = 1730090953;
                    break;
                case -1368896894:
                case -996510997:
                    abstractC8637 = (AbstractC8636) C21923.m49339(arrayListM44345, i2);
                    if (C7106.f21815 != 0) {
                        iM2566 = C2105.m6981("۫ۜ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-9033)) ^ 1861160321;
                        i7 = -166742208;
                    } else {
                        iM2566 = (i5 - C0630.m2566("ۧ۫")) * (-119);
                        i6 = ((iM2566 ^ i4) * (-20923)) ^ (-1285033526);
                        i7 = 865354471;
                    }
                    break;
                case -430558320:
                case 752340295:
                    iM7032 = C2126.m7032(arrayListM44345);
                    i = -1;
                    if (C4075.m12263() <= 0) {
                        iM2566 = (i5 - C0630.m2566("۬ۛ")) * 5;
                        i6 = ((iM2566 ^ i4) * 23991) ^ (-426945102);
                        i7 = -2117618438;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ۛܰ")) * 33;
                        i6 = ((iM2566 ^ i5) * 849) ^ 552053030;
                        i7 = 602686179;
                    }
                    break;
                case -388256374:
                case 778777439:
                    objM49339 = C21923.m49339(arrayListM44345, 0);
                    if (C1005.m3501()) {
                        iM2566 = (C0630.m2566("ۖۚ") + i4) * 23;
                        i6 = ((iM2566 ^ i5) * 15663) ^ (-1977726627);
                        i7 = -1007539130;
                    } else {
                        iM2566 = C0630.m2566("᩶۟") ^ i4;
                        i6 = ((iM2566 ^ i5) * 18041) ^ (-1540520623);
                        i7 = 1730090953;
                    }
                    break;
                case -211112764:
                case 485340049:
                    iM22402 = abstractC8637.m22402();
                    if (C1711.f5919) {
                        iM2566 = (i5 - C0630.m2566("۬ۛ")) * 5;
                        i6 = ((iM2566 ^ i4) * 23991) ^ (-426945102);
                        i7 = -2117618438;
                    } else {
                        iM2566 = (i5 - C2105.m6981("ۚۢ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM2566 ^ i4) * (-7271)) ^ 107991680;
                        i7 = -1568845405;
                    }
                    break;
                case -156971904:
                case 943744189:
                    if (C4263.f13799 <= 0) {
                        iM2566 = (i5 - C0630.m2566("۬ۛ")) * 5;
                        i6 = ((iM2566 ^ i4) * 23991) ^ (-426945102);
                        i7 = -2117618438;
                    } else {
                        iM2566 = (i5 - C0630.m2566("᩺ۜ")) * (-127);
                        i6 = ((iM2566 ^ i4) * 26177) ^ (-683813909);
                        i7 = -1822073492;
                    }
                    break;
                case -21364543:
                case 1487453277:
                    AbstractC2021.m6574();
                    if (C4263.f13799 <= 0) {
                        iM2566 = C2105.m6981("۫ۜ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-9033)) ^ 1861160321;
                        i7 = -166742208;
                    } else {
                        iM2566 = C0630.m2566("᩶۟") ^ i4;
                        i6 = ((iM2566 ^ i5) * 18041) ^ (-1540520623);
                        i7 = 1730090953;
                    }
                    break;
                case 29713413:
                case 979467746:
                    C0714.m2805();
                    C1005.m3501();
                    return null;
                case 705839392:
                case 1199213941:
                    return new C10150("", iLastIndexOf, iLastIndexOf);
                case 854295268:
                case 1715777954:
                    arrayListM44345 = c19220.m44345();
                    if (C0714.m2813(arrayListM44345)) {
                        iM2566 = C0630.m2566("۠᩵") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-26897)) ^ (-811394825);
                        i7 = -1008507022;
                    } else {
                        iM2566 = C0630.m2566("ۙᩴ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-10353)) ^ 2055658777;
                        i7 = 1219663105;
                    }
                    break;
                case 1241221998:
                case 1952564753:
                    if (!C2126.f7087) {
                        return new C10150(C0050.m947(charSequence.subSequence(iM22403, iM22402)), iM22403, iM22402);
                    }
                    iM2566 = C2105.m6981("ᩳ᩵") ^ i5;
                    i6 = ((iM2566 ^ i4) * 3315) ^ (-302278717);
                    i7 = 966695270;
                    break;
                default:
                    abstractC8636 = (AbstractC8636) objM49339;
                    if (C4263.f13799 <= 0) {
                        iM2566 = C0630.m2566("᩶۟") ^ i4;
                        i6 = ((iM2566 ^ i5) * 18041) ^ (-1540520623);
                        i7 = 1730090953;
                    } else {
                        iM2566 = (i5 - C2105.m6981("۫᩺")) * (-79);
                        i6 = ((iM2566 ^ i4) * (-28205)) ^ 677782223;
                        i7 = 1758537962;
                    }
                    break;
            }
        }
    }
}
