package p067l;

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
public final class C7991 {

    /* JADX INFO: renamed from: ܿܺ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f82015 = {1698, 12259, 12268, 12256, 12264, 12286, 12281, 12287, 12260, 12259, 12266, 12192, 12268, 12287, 12287, 12268, 12276, 12286, 12281, 12287, 12260, 12259, 12266, 12285, 12257, 12280, 12287, 12268, 12257, 12286, 12240, 12246, 12260, 12281, 12264, 12256, 12268, 12287, 12287, 12268, 12276, 12215, 12284, 12280, 12268, 12259, 12281, 12260, 12281, 12276, 12285, 12257, 12280, 12287, 12268, 12257, 12286, 12215, 3289, -29674, -29695, -29673, -29685, -29679, -29674, -29689, -29695, -29673, -29673, -29680, -29674, -29683, -29686, -29693, -29673, -29680, -29674, -29683, -29686, -29693, -29623, -29691, -29674, -29674, -29691, -29667, -29676, -29688, -29679, -29674, -29691, -29688, -29673, -29686, -29691, -29687, -29695, 2232, 29521, 29486};

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
    
        if (p067l.ViewOnClickListenerC0939.f81888 <= 0) goto L28;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:124:0x068e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:82:0x0427. Please report as an issue. */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map m18502(CharSequence charSequence) throws Throwable {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        int i5;
        C20635 c20635;
        int iM559710;
        int i6;
        int i7;
        int i8;
        C20635 c20636;
        StringBuilder sb;
        StringBuilder sb2;
        String str;
        Object obj;
        C20635 c20637;
        short[] sArr;
        C20635 c20638;
        int iM559711;
        int i9;
        int i10;
        short[] sArr2;
        int iM55681;
        int i11;
        int i12;
        int iM55682;
        int i13;
        int i14;
        int i15;
        String str2;
        int iM55683;
        int i16;
        int iM559712;
        int i17;
        int i18;
        String str3;
        C20635 c20639;
        Iterator itM46632;
        int i19;
        String str4;
        int iM55684;
        int i20;
        int i21;
        int iM55685;
        int i22;
        int i23;
        CharSequence charSequence2 = charSequence;
        int i24 = 2122646456;
        int i25 = C0912.f81867;
        int i26 = C0906.f81862;
        int iM55686 = C0873.m55680("֫ܽ") ^ i26;
        int i27 = ((iM55686 ^ i25) * 25177) ^ (-439537464);
        int i28 = iM55686 ^ (-315914410);
        Iterator itM46631 = null;
        C20635 c206310 = null;
        String str5 = null;
        Object obj2 = null;
        C20635 c206311 = null;
        StringBuilder sbM11879 = null;
        C20635 c206312 = null;
        String strM45304 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i29 = 0;
        byte b = 0;
        int i30 = 0;
        short s = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        C14723 c14723 = null;
        C9729 c9729Mo28589 = null;
        C19964 c19964M46637 = null;
        String strM45305 = null;
        String str6 = null;
        Iterator itM46633 = null;
        short[] sArr5 = null;
        LinkedHashMap linkedHashMap = null;
        int i34 = 0;
        Throwable th = null;
        String str7 = null;
        Iterator it = null;
        StringBuilder sbM118710 = null;
        byte b2 = 0;
        String strM55618 = null;
        C19964 c19964M46638 = null;
        Map mapM18502 = null;
        int i35 = 0;
        while (true) {
            i24 = i28 ^ (i27 & (((i24 ^ i25) * 9273) >> 31));
            switch (i24) {
                case -2076949169:
                case 1889653046:
                    C0955.m56025();
                    if (C0992.f81922 >= 0) {
                        c206312 = c206312;
                        sbM118710 = sbM118710;
                        sbM11879 = sbM11879;
                        obj2 = obj2;
                        c206311 = c206311;
                        c206310 = c206310;
                        i34 = i34;
                        sArr5 = sArr5;
                        i5 = i32;
                        iM559710 = (i25 - C0873.m55680("۬ۚ")) * 49;
                        i6 = ((iM559710 ^ i26) * (-28083)) ^ (-166128930);
                        i7 = -1662419688;
                        i28 = iM559710 ^ i7;
                        i27 = i6;
                        sArr3 = sArr3;
                        i32 = i5;
                        c206311 = c206311;
                        sArr5 = sArr5;
                        c206312 = c206312;
                        str5 = str5;
                        sbM11879 = sbM11879;
                        i34 = i34;
                        c206310 = c206310;
                        sbM118710 = sbM118710;
                        obj2 = obj2;
                    } else {
                        iM55979 = C0946.m55979("ۙ֡") ^ i26;
                        i = ((iM55979 ^ i25) * (-9421)) ^ (-307533572);
                        i2 = -1256114123;
                        i28 = iM55979 ^ i2;
                        i27 = i;
                    }
                    break;
                case -1999671276:
                case -1323761608:
                    c206312 = c206312;
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    sArr3 = sArr3;
                    c206311 = c206311;
                    c14723 = c14723;
                    c206310 = c206310;
                    i34 = i34;
                    str5 = str5;
                    sArr5 = sArr5;
                    i32 = i32;
                    i31 = s + 1;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0873.m55680("᩷᩹") ^ i25;
                        i3 = ((iM55680 ^ i26) * 16097) ^ 69722224;
                        i4 = 1280424927;
                    } else {
                        iM55680 = (C0946.m55979("᩹۟") + i25) * 9;
                        i3 = ((iM55680 ^ i26) * 28335) ^ (-1586148276);
                        i4 = -690047526;
                    }
                    i28 = iM55680 ^ i4;
                    i27 = i3;
                    c14723 = c14723;
                    sArr3 = sArr3;
                    i32 = i32;
                    c206311 = c206311;
                    sArr5 = sArr5;
                    c206312 = c206312;
                    charSequence2 = charSequence;
                    str5 = str5;
                    sbM11879 = sbM11879;
                    i34 = i34;
                    c206310 = c206310;
                    sbM118710 = sbM118710;
                    obj2 = obj2;
                    break;
                case -1960034572:
                case 423033048:
                    c206312 = c206312;
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    sArr3 = sArr3;
                    c206311 = c206311;
                    c14723 = c14723;
                    c206310 = c206310;
                    i34 = i34;
                    str5 = str5;
                    sArr5 = sArr5;
                    i32 = i32;
                    if (charSequence2 instanceof InterfaceC21800) {
                        iM55680 = C0946.m55979("᩶۫") ^ i26;
                        i3 = ((iM55680 ^ i25) * 10467) ^ 665310522;
                        i4 = -1769650778;
                    } else {
                        iM55680 = (C0873.m55680("ۢۢ") ^ i25) * 3;
                        i3 = ((iM55680 ^ i26) * 25359) ^ (-1743735934);
                        i4 = -1191149789;
                    }
                    i28 = iM55680 ^ i4;
                    i27 = i3;
                    c14723 = c14723;
                    sArr3 = sArr3;
                    i32 = i32;
                    c206311 = c206311;
                    sArr5 = sArr5;
                    c206312 = c206312;
                    charSequence2 = charSequence;
                    str5 = str5;
                    sbM11879 = sbM11879;
                    i34 = i34;
                    c206310 = c206310;
                    sbM118710 = sbM118710;
                    obj2 = obj2;
                    break;
                case -1959345468:
                case 1918789727:
                    c206312 = c206312;
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    sArr3 = sArr3;
                    c206311 = c206311;
                    c206310 = c206310;
                    i34 = i34;
                    str5 = str5;
                    sArr5 = sArr5;
                    i5 = i32;
                    linkedHashMap = new LinkedHashMap();
                    C14723 c14724 = new C14723(charSequence2);
                    if (RunnableC0871.m55672() >= 0) {
                        c14723 = c14724;
                        iM559710 = (i25 - C0873.m55680("۬ۚ")) * 49;
                        i6 = ((iM559710 ^ i26) * (-28083)) ^ (-166128930);
                        i7 = -1662419688;
                        i28 = iM559710 ^ i7;
                        i27 = i6;
                    } else {
                        int iM559713 = (C0946.m55979("᩸ܶ") ^ i25) * (-103);
                        c14723 = c14724;
                        i27 = ((iM559713 ^ i26) * (-21717)) ^ (-811875555);
                        i28 = iM559713 ^ (-170730075);
                    }
                    sArr3 = sArr3;
                    i32 = i5;
                    c206311 = c206311;
                    sArr5 = sArr5;
                    c206312 = c206312;
                    str5 = str5;
                    sbM11879 = sbM11879;
                    i34 = i34;
                    c206310 = c206310;
                    sbM118710 = sbM118710;
                    obj2 = obj2;
                    break;
                case -1932594438:
                case 1915777230:
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    C20635 c206313 = c206310;
                    C15525.putIfAbsent(linkedHashMap, strM45305, m18503(charSequence2, c206313));
                    c20635 = c206313;
                    i5 = i32;
                    int iM55687 = (C0873.m55680("ۡۧ") + i25) * 83;
                    i28 = iM55687 ^ (-1312318539);
                    sArr3 = sArr3;
                    i32 = i5;
                    i27 = ((iM55687 ^ i26) * 77) ^ 1687041873;
                    sArr5 = sArr5;
                    c206312 = c206312;
                    c14723 = c14723;
                    str5 = str5;
                    c206311 = c206311;
                    i34 = i34;
                    c206310 = c20635;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    sbM118710 = sbM118710;
                    break;
                case -1809277627:
                case 1299372853:
                    C1194.m56385(c9729Mo28589);
                    return mapM18502;
                case -1740054562:
                case -1049358706:
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    c206311 = c206311;
                    C20635 c206314 = c206310;
                    i34 = i34;
                    short[] sArr6 = sArr4;
                    int i36 = i33;
                    String strM55986 = C0946.m55986(sArr6, i36, 1, i35);
                    c206312 = c206312;
                    String strM55750 = C0892.m55750(f82015, 32, 4, i35);
                    switch (b) {
                        case 0:
                            iM559712 = (C0946.m55979("᩹ᩴ") ^ i25) * (-89);
                            i17 = ((iM559712 ^ i26) * 2673) ^ 1495713975;
                            i18 = 836285107;
                            i28 = iM559712 ^ i18;
                            i33 = i36;
                            i34 = i34;
                            str7 = strM55986;
                            sArr4 = sArr6;
                            str6 = strM55750;
                            c206310 = c206314;
                            i27 = i17;
                            obj2 = obj2;
                            c206311 = c206311;
                            c206312 = c206312;
                            sbM11879 = sbM11879;
                            break;
                        case 1:
                            iM559712 = C0873.m55680("۟ᩳ") ^ i26;
                            i17 = ((iM559712 ^ i25) * (-1989)) ^ (-2109518083);
                            i18 = -583521903;
                            i28 = iM559712 ^ i18;
                            i33 = i36;
                            i34 = i34;
                            str7 = strM55986;
                            sArr4 = sArr6;
                            str6 = strM55750;
                            c206310 = c206314;
                            i27 = i17;
                            obj2 = obj2;
                            c206311 = c206311;
                            c206312 = c206312;
                            sbM11879 = sbM11879;
                            break;
                        case 2:
                            iM559712 = C0873.m55680("ۛ֫") ^ i25;
                            i17 = ((iM559712 ^ i26) * 28021) ^ (-175789709);
                            i18 = 1662074908;
                            i28 = iM559712 ^ i18;
                            i33 = i36;
                            i34 = i34;
                            str7 = strM55986;
                            sArr4 = sArr6;
                            str6 = strM55750;
                            c206310 = c206314;
                            i27 = i17;
                            obj2 = obj2;
                            c206311 = c206311;
                            c206312 = c206312;
                            sbM11879 = sbM11879;
                            break;
                        default:
                            i33 = i36;
                            str5 = str5;
                            str7 = strM55986;
                            sArr4 = sArr6;
                            sArr3 = sArr3;
                            str6 = strM55750;
                            c20635 = c206314;
                            c14723 = c14723;
                            i5 = i32;
                            int iM55688 = (C0873.m55680("ۡۧ") + i25) * 83;
                            i28 = iM55688 ^ (-1312318539);
                            sArr3 = sArr3;
                            i32 = i5;
                            i27 = ((iM55688 ^ i26) * 77) ^ 1687041873;
                            sArr5 = sArr5;
                            c206312 = c206312;
                            c14723 = c14723;
                            str5 = str5;
                            c206311 = c206311;
                            i34 = i34;
                            c206310 = c20635;
                            sbM11879 = sbM11879;
                            obj2 = obj2;
                            break;
                    }
                    sbM118710 = sbM118710;
                    break;
                case -1524949357:
                case -1260357072:
                    c206312 = c206312;
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    sArr3 = sArr3;
                    c206311 = c206311;
                    c14723 = c14723;
                    c206310 = c206310;
                    i34 = i34;
                    str5 = str5;
                    sArr5 = sArr5;
                    i32 = i32;
                    if ((i31 * i31) - ((s * 2) + 1) >= 0) {
                        iM55680 = C0873.m55680("ܳ۟") ^ i26;
                        i3 = ((iM55680 ^ i25) * 3033) ^ 990358048;
                        i4 = -1367546497;
                    } else {
                        iM55680 = C0873.m55680("֡۟") ^ i25;
                        i3 = ((iM55680 ^ i26) * (-2837)) ^ (-1298864445);
                        i4 = 1611730215;
                    }
                    i28 = iM55680 ^ i4;
                    i27 = i3;
                    c14723 = c14723;
                    sArr3 = sArr3;
                    i32 = i32;
                    c206311 = c206311;
                    sArr5 = sArr5;
                    c206312 = c206312;
                    charSequence2 = charSequence;
                    str5 = str5;
                    sbM11879 = sbM11879;
                    i34 = i34;
                    c206310 = c206310;
                    sbM118710 = sbM118710;
                    obj2 = obj2;
                    break;
                case -1510142043:
                case 601580525:
                    i35 = 7798;
                    iM55680 = (C0946.m55979("᩻ᩳ") + i26) * (-87);
                    i3 = ((iM55680 ^ i25) * 7577) ^ (-1151704325);
                    i4 = -1680025437;
                    i28 = iM55680 ^ i4;
                    i27 = i3;
                    c14723 = c14723;
                    sArr3 = sArr3;
                    i32 = i32;
                    c206311 = c206311;
                    sArr5 = sArr5;
                    c206312 = c206312;
                    charSequence2 = charSequence;
                    str5 = str5;
                    sbM11879 = sbM11879;
                    i34 = i34;
                    c206310 = c206310;
                    sbM118710 = sbM118710;
                    obj2 = obj2;
                    break;
                case -1501728434:
                case 2006659782:
                    break;
                case -1358538906:
                case 133481613:
                    c206312 = c206312;
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    c206311 = c206311;
                    c206310 = c206310;
                    i34 = i34;
                    str2 = str6;
                    try {
                        C0937.m55922(c9729Mo28589);
                        iM55683 = C0873.m55680("ۘۚ") ^ i26;
                        i15 = ((iM55683 ^ i25) * 1673) ^ (-2020794313);
                        i16 = 1552310219;
                        i28 = iM55683 ^ i16;
                        str6 = str2;
                        i27 = i15;
                        obj2 = obj2;
                    } catch (Throwable th2) {
                        int iM559714 = (i25 - C0946.m55979("ۚۢ")) * (-63);
                        i28 = iM559714 ^ 1705027423;
                        obj2 = th2;
                        str6 = str2;
                        i27 = ((iM559714 ^ i26) * 5255) ^ (-217500225);
                    }
                    i34 = i34;
                    c206312 = c206312;
                    c206310 = c206310;
                    c206311 = c206311;
                    sbM11879 = sbM11879;
                    sbM118710 = sbM118710;
                    break;
                case -1252350694:
                case -131584981:
                    C0854.m55595();
                    if (C0894.f81854 < 0) {
                        sbM118710 = sbM118710;
                        sbM11879 = sbM11879;
                        c206311 = c206311;
                        c206310 = c206310;
                        i34 = i34;
                        str5 = str5;
                        sArr5 = sArr5;
                        i32 = i32;
                        iM55680 = C0873.m55680("᩷᩹") ^ i25;
                        i3 = ((iM55680 ^ i26) * 16097) ^ 69722224;
                        i4 = 1280424927;
                        i28 = iM55680 ^ i4;
                        i27 = i3;
                        c14723 = c14723;
                        sArr3 = sArr3;
                        i32 = i32;
                        c206311 = c206311;
                        sArr5 = sArr5;
                        c206312 = c206312;
                        charSequence2 = charSequence;
                        str5 = str5;
                        sbM11879 = sbM11879;
                        i34 = i34;
                        c206310 = c206310;
                        sbM118710 = sbM118710;
                        obj2 = obj2;
                    } else {
                        c206312 = c206312;
                        sbM118710 = sbM118710;
                        sbM11879 = sbM11879;
                        obj2 = obj2;
                        c206311 = c206311;
                        c206310 = c206310;
                        i34 = i34;
                        str2 = str6;
                        iM55683 = (C0946.m55979("᩺֫") + i26) * 7;
                        i15 = ((iM55683 ^ i25) * (-6163)) ^ (-1886531946);
                        i16 = 782011973;
                        i28 = iM55683 ^ i16;
                        str6 = str2;
                        i27 = i15;
                        obj2 = obj2;
                        i34 = i34;
                        c206312 = c206312;
                        c206310 = c206310;
                        c206311 = c206311;
                        sbM11879 = sbM11879;
                        sbM118710 = sbM118710;
                    }
                    break;
                case -1195321385:
                case -713861175:
                    b = 2;
                    sArr2 = sArr5;
                    iM55682 = C0873.m55680("ۡ֡") ^ i25;
                    i13 = ((iM55682 ^ i26) * 16085) ^ (-1506237396);
                    i14 = 2142845805;
                    i28 = iM55682 ^ i14;
                    i27 = i13;
                    obj2 = obj2;
                    sArr5 = sArr2;
                    c206312 = c206312;
                    str5 = str5;
                    i34 = i34;
                    c206310 = c206310;
                    c206311 = c206311;
                    sbM11879 = sbM11879;
                    sbM118710 = sbM118710;
                    break;
                case -1138750914:
                case 1014184473:
                    c206312 = c206312;
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    c206311 = c206311;
                    c206310 = c206310;
                    i34 = i34;
                    str2 = str6;
                    strM55618 = C0861.m55618(f82015, 30, 1, i35);
                    if (C0989.f81920 >= 0) {
                        iM55683 = (C0946.m55979("᩺֫") + i26) * 7;
                        i15 = ((iM55683 ^ i25) * (-6163)) ^ (-1886531946);
                        i16 = 782011973;
                    } else {
                        iM55683 = C0873.m55680("۠۠") ^ i26;
                        i15 = ((iM55683 ^ i25) * (-4697)) ^ (-1768790409);
                        i16 = 2032580327;
                    }
                    i28 = iM55683 ^ i16;
                    str6 = str2;
                    i27 = i15;
                    obj2 = obj2;
                    i34 = i34;
                    c206312 = c206312;
                    c206310 = c206310;
                    c206311 = c206311;
                    sbM11879 = sbM11879;
                    sbM118710 = sbM118710;
                    break;
                case -1083409374:
                case -701571892:
                    c206312 = c206312;
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    c206311 = c206311;
                    c206310 = c206310;
                    i34 = i34;
                    str2 = str6;
                    sArr4 = f82015;
                    i33 = 31;
                    if (C1404.f82149 < 0) {
                        iM55683 = (C0873.m55680("ۛۧ") ^ i26) * (-47);
                        i15 = ((iM55683 ^ i25) * (-5253)) ^ 1217191361;
                        i16 = 470278521;
                        i28 = iM55683 ^ i16;
                        str6 = str2;
                        i27 = i15;
                        obj2 = obj2;
                        i34 = i34;
                        c206312 = c206312;
                        c206310 = c206310;
                        c206311 = c206311;
                        sbM11879 = sbM11879;
                        sbM118710 = sbM118710;
                    } else {
                        c206310 = c206310;
                        str6 = str2;
                        sArr5 = sArr5;
                        i5 = i32;
                        iM559710 = (i25 - C0873.m55680("۬ۚ")) * 49;
                        i6 = ((iM559710 ^ i26) * (-28083)) ^ (-166128930);
                        i7 = -1662419688;
                        i28 = iM559710 ^ i7;
                        i27 = i6;
                        sArr3 = sArr3;
                        i32 = i5;
                        c206311 = c206311;
                        sArr5 = sArr5;
                        c206312 = c206312;
                        str5 = str5;
                        sbM11879 = sbM11879;
                        i34 = i34;
                        c206310 = c206310;
                        sbM118710 = sbM118710;
                        obj2 = obj2;
                    }
                    break;
                case -1039481205:
                case 1820222451:
                    i8 = i34;
                    c20636 = c206312;
                    sb = sbM118710;
                    sb2 = sbM11879;
                    str = str5;
                    obj = obj2;
                    c20637 = c206311;
                    sArr = sArr5;
                    c20638 = (C20635) RunnableC0897.m55785(itM46631);
                    sArr3 = f82015;
                    i32 = 1;
                    if (C0927.f81875) {
                        iM559711 = (C0873.m55680("ۚۗ") ^ i26) * (-123);
                        i9 = ((iM559711 ^ i25) * (-8853)) ^ (-1025607751);
                        i10 = 286709501;
                    } else {
                        iM559711 = C0946.m55979("ᩳ֡") ^ i25;
                        i9 = ((iM559711 ^ i26) * (-28447)) ^ 1983648224;
                        i10 = -1551189812;
                    }
                    i28 = iM559711 ^ i10;
                    obj2 = obj;
                    c206311 = c20637;
                    sArr5 = sArr;
                    str5 = str;
                    sbM11879 = sb2;
                    i34 = i8;
                    sbM118710 = sb;
                    c206310 = c20638;
                    i27 = i9;
                    c206312 = c20636;
                    break;
                case -1035761381:
                case 132810735:
                    c206312 = (C20635) C0955.m56035(itM46633);
                    sbM118710 = sbM118710;
                    c19964M46638 = c206312.m46637(C0882.m55717(f82015, 42, 8, i35));
                    if (c19964M46638 != null) {
                        iM55685 = (C0873.m55680("ܽ᩻") + i26) * 61;
                        i22 = ((iM55685 ^ i25) * 22695) ^ 1275540706;
                        i23 = -1033078709;
                        i28 = iM55685 ^ i23;
                        i27 = i22;
                        sbM118710 = sbM118710;
                    }
                    c206310 = c206310;
                    str4 = str6;
                    int iM559715 = (i25 - C0946.m55979("ܺ֨")) * (-71);
                    i28 = iM559715 ^ 842969876;
                    i27 = ((iM559715 ^ i26) * (-3177)) ^ (-1162696173);
                    obj2 = obj2;
                    c206312 = c206312;
                    str6 = str4;
                    i34 = i34;
                    c206310 = c206310;
                    c206311 = c206311;
                    sbM11879 = sbM11879;
                    sbM118710 = sbM118710;
                    break;
                case -1035570210:
                case -161511628:
                    sbM118710 = sbM118710;
                    i30 = i34 + 1;
                    sbM11879 = sbM11879;
                    C0863.m55629(sbM11879, i34);
                    C1003.m56121(sbM11879, strM55618);
                    if (AbstractC0942.f81890 <= 0) {
                        iM55684 = (i26 - C0946.m55979("۬ۨ")) * (-19);
                        i20 = ((iM55684 ^ i25) * 31051) ^ 553900213;
                        i21 = 1978784197;
                    } else {
                        iM55684 = (C0873.m55680("᩹ܿ") ^ i25) * 25;
                        i20 = ((iM55684 ^ i26) * (-32187)) ^ (-657322544);
                        i21 = -248368528;
                    }
                    i28 = iM55684 ^ i21;
                    sbM11879 = sbM11879;
                    i27 = i20;
                    sbM118710 = sbM118710;
                    break;
                case -973158503:
                case 1276383935:
                    c206312 = c206312;
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    sArr3 = sArr3;
                    c206311 = c206311;
                    c20635 = c206310;
                    i34 = i34;
                    str5 = str5;
                    sArr5 = sArr5;
                    i5 = i32;
                    c14723 = c14723;
                    C20635 c20635M46633 = C20635.m46633((Reader) c14723, false);
                    AbstractC0942.m55962(c20635M46633);
                    itM46631 = C20635.m46631(c20635M46633);
                    int iM55689 = (C0873.m55680("ۡۧ") + i25) * 83;
                    i28 = iM55689 ^ (-1312318539);
                    sArr3 = sArr3;
                    i32 = i5;
                    i27 = ((iM55689 ^ i26) * 77) ^ 1687041873;
                    sArr5 = sArr5;
                    c206312 = c206312;
                    c14723 = c14723;
                    str5 = str5;
                    c206311 = c206311;
                    i34 = i34;
                    c206310 = c20635;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    sbM118710 = sbM118710;
                    break;
                case -931450992:
                case 551240120:
                    sbM118710 = sbM118710;
                    c206310 = c206310;
                    str4 = str6;
                    itM46633 = C20635.m46632(c206310, str4);
                    int iM559716 = (i25 - C0946.m55979("ܺ֨")) * (-71);
                    i28 = iM559716 ^ 842969876;
                    i27 = ((iM559716 ^ i26) * (-3177)) ^ (-1162696173);
                    obj2 = obj2;
                    c206312 = c206312;
                    str6 = str4;
                    i34 = i34;
                    c206310 = c206310;
                    c206311 = c206311;
                    sbM11879 = sbM11879;
                    sbM118710 = sbM118710;
                    break;
                case -835989230:
                case 963025378:
                    C0949.m56012();
                    if (C0890.f81849 != 0) {
                        iM55979 = (C0946.m55979("ᩳ᩵") ^ i25) * (-75);
                        i = ((iM55979 ^ i26) * 17151) ^ (-371169463);
                        i2 = 791095925;
                        i28 = iM55979 ^ i2;
                        i27 = i;
                    } else {
                        c20636 = c206312;
                        sb = sbM118710;
                        sb2 = sbM11879;
                        c20638 = c206310;
                        obj = obj2;
                        c20637 = c206311;
                        i8 = i34;
                        str = str5;
                        sArr = sArr5;
                        iM559711 = (C0873.m55680("ۚۗ") ^ i26) * (-123);
                        i9 = ((iM559711 ^ i25) * (-8853)) ^ (-1025607751);
                        i10 = 286709501;
                        i28 = iM559711 ^ i10;
                        obj2 = obj;
                        c206311 = c20637;
                        sArr5 = sArr;
                        str5 = str;
                        sbM11879 = sb2;
                        i34 = i8;
                        sbM118710 = sb;
                        c206310 = c20638;
                        i27 = i9;
                        c206312 = c20636;
                    }
                    break;
                case -674955558:
                case -66188682:
                    C0912.m55825(sbM118710, strM45304);
                    C1003.m56121(sbM118710, strM55618);
                    C15525.putIfAbsent(linkedHashMap, C0845.m55591(sbM118710), m18503(charSequence2, c206312));
                    sbM118710 = sbM118710;
                    c206310 = c206310;
                    str4 = str6;
                    int iM559717 = (i25 - C0946.m55979("ܺ֨")) * (-71);
                    i28 = iM559717 ^ 842969876;
                    i27 = ((iM559717 ^ i26) * (-3177)) ^ (-1162696173);
                    obj2 = obj2;
                    c206312 = c206312;
                    str6 = str4;
                    i34 = i34;
                    c206310 = c206310;
                    c206311 = c206311;
                    sbM11879 = sbM11879;
                    sbM118710 = sbM118710;
                    break;
                case -672181148:
                case 261631657:
                    if (C1003.f81929 > 0) {
                        c206312 = c206312;
                        sbM118710 = sbM118710;
                        sbM11879 = sbM11879;
                        obj2 = obj2;
                        c206311 = c206311;
                        c206310 = c206310;
                        i34 = i34;
                        str2 = str6;
                        iM55683 = (C0946.m55979("᩺֫") + i26) * 7;
                        i15 = ((iM55683 ^ i25) * (-6163)) ^ (-1886531946);
                        i16 = 782011973;
                        i28 = iM55683 ^ i16;
                        str6 = str2;
                        i27 = i15;
                        obj2 = obj2;
                        i34 = i34;
                        c206312 = c206312;
                        c206310 = c206310;
                        c206311 = c206311;
                        sbM11879 = sbM11879;
                        sbM118710 = sbM118710;
                    } else {
                        c20636 = c206312;
                        sb = sbM118710;
                        sb2 = sbM11879;
                        c20638 = c206310;
                        obj = obj2;
                        c20637 = c206311;
                        i8 = i34;
                        str = str5;
                        sArr = sArr5;
                        iM559711 = (C0873.m55680("ۚۗ") ^ i26) * (-123);
                        i9 = ((iM559711 ^ i25) * (-8853)) ^ (-1025607751);
                        i10 = 286709501;
                        i28 = iM559711 ^ i10;
                        obj2 = obj;
                        c206311 = c20637;
                        sArr5 = sArr;
                        str5 = str;
                        sbM11879 = sb2;
                        i34 = i8;
                        sbM118710 = sb;
                        c206310 = c20638;
                        i27 = i9;
                        c206312 = c20636;
                    }
                    break;
                case -653212475:
                case 1205871019:
                    c206312 = c206312;
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    sArr3 = sArr3;
                    c206311 = c206311;
                    c206310 = c206310;
                    i34 = i34;
                    str5 = str5;
                    sArr5 = sArr5;
                    i5 = i32;
                    try {
                        mapM18502 = m18502((CharSequence) c9729Mo28589);
                        iM559710 = C0873.m55680("ۛۡ") ^ i26;
                        i6 = ((iM559710 ^ i25) * (-1657)) ^ 1593064223;
                        i7 = -495274376;
                        i28 = iM559710 ^ i7;
                        i27 = i6;
                        sArr3 = sArr3;
                        i32 = i5;
                        c206311 = c206311;
                        sArr5 = sArr5;
                        c206312 = c206312;
                        str5 = str5;
                        sbM11879 = sbM11879;
                        i34 = i34;
                        c206310 = c206310;
                        sbM118710 = sbM118710;
                        obj2 = obj2;
                    } catch (Throwable th3) {
                        int iM556810 = (C0873.m55680("ۜ֫") + i25) * (-87);
                        int i37 = ((iM556810 ^ i26) * 19597) ^ (-1543267621);
                        i28 = iM556810 ^ 1522759869;
                        sArr3 = sArr3;
                        i32 = i5;
                        c206311 = c206311;
                        sArr5 = sArr5;
                        c206312 = c206312;
                        str5 = str5;
                        sbM11879 = sbM11879;
                        i34 = i34;
                        c206310 = c206310;
                        sbM118710 = sbM118710;
                        obj2 = obj2;
                        th = th3;
                        i27 = i37;
                    }
                    break;
                case -648726647:
                case -304372458:
                    b = 0;
                    sArr2 = sArr5;
                    iM55682 = C0873.m55680("ۡ֡") ^ i25;
                    i13 = ((iM55682 ^ i26) * 16085) ^ (-1506237396);
                    i14 = 2142845805;
                    i28 = iM55682 ^ i14;
                    i27 = i13;
                    obj2 = obj2;
                    sArr5 = sArr2;
                    c206312 = c206312;
                    str5 = str5;
                    i34 = i34;
                    c206310 = c206310;
                    c206311 = c206311;
                    sbM11879 = sbM11879;
                    sbM118710 = sbM118710;
                    break;
                case -532456746:
                case 392872999:
                    c206312 = c206312;
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    c206311 = c206311;
                    C20635 c206315 = c206310;
                    i34 = i34;
                    str5 = str5;
                    sArr5 = sArr5;
                    sArr3 = sArr3;
                    i5 = i32;
                    c19964M46637 = c206315.m46637(ServiceConnectionC1013.m56161(sArr3, i5, 4, i35));
                    if (c19964M46637 != null) {
                        iM559710 = C0873.m55680("ۙۙ") ^ i26;
                        c206310 = c206315;
                        i6 = ((iM559710 ^ i25) * (-25905)) ^ (-763675922);
                        i7 = -431983899;
                        i28 = iM559710 ^ i7;
                        i27 = i6;
                        sArr3 = sArr3;
                        i32 = i5;
                        c206311 = c206311;
                        sArr5 = sArr5;
                        c206312 = c206312;
                        str5 = str5;
                        sbM11879 = sbM11879;
                        i34 = i34;
                        c206310 = c206310;
                        sbM118710 = sbM118710;
                        obj2 = obj2;
                    } else {
                        c20635 = c206315;
                        c14723 = c14723;
                        int iM556811 = (C0873.m55680("ۡۧ") + i25) * 83;
                        i28 = iM556811 ^ (-1312318539);
                        sArr3 = sArr3;
                        i32 = i5;
                        i27 = ((iM556811 ^ i26) * 77) ^ 1687041873;
                        sArr5 = sArr5;
                        c206312 = c206312;
                        c14723 = c14723;
                        str5 = str5;
                        c206311 = c206311;
                        i34 = i34;
                        c206310 = c20635;
                        sbM11879 = sbM11879;
                        obj2 = obj2;
                        sbM118710 = sbM118710;
                    }
                    break;
                case -430238469:
                case 1998804846:
                    sbM118710 = C5410.m11879(C1025.m56233(f82015, 50, 8, i35), strM45305, str7);
                    strM45304 = c19964M46638.m45304();
                    if (C1012.f81938 < 0) {
                        iM55979 = (C0946.m55979("ܺۡ") ^ i25) * (-101);
                        i = ((iM55979 ^ i26) * 30701) ^ 179446894;
                        i2 = -1762574469;
                        i28 = iM55979 ^ i2;
                        i27 = i;
                    } else {
                        c206312 = c206312;
                        sbM118710 = sbM118710;
                        sbM11879 = sbM11879;
                        obj2 = obj2;
                        sArr3 = sArr3;
                        c206311 = c206311;
                        c14723 = c14723;
                        c206310 = c206310;
                        i34 = i34;
                        str5 = str5;
                        sArr5 = sArr5;
                        i32 = i32;
                        iM55680 = (C0946.m55979("ۨ۫") ^ i25) * 63;
                        i3 = ((iM55680 ^ i26) * 19329) ^ (-1356478157);
                        i4 = 1453306626;
                        i28 = iM55680 ^ i4;
                        i27 = i3;
                        c14723 = c14723;
                        sArr3 = sArr3;
                        i32 = i32;
                        c206311 = c206311;
                        sArr5 = sArr5;
                        c206312 = c206312;
                        charSequence2 = charSequence;
                        str5 = str5;
                        sbM11879 = sbM11879;
                        i34 = i34;
                        c206310 = c206310;
                        sbM118710 = sbM118710;
                        obj2 = obj2;
                    }
                    break;
                case -409790027:
                case -226969849:
                    b = 1;
                    sArr2 = sArr5;
                    iM55682 = C0873.m55680("ۡ֡") ^ i25;
                    i13 = ((iM55682 ^ i26) * 16085) ^ (-1506237396);
                    i14 = 2142845805;
                    i28 = iM55682 ^ i14;
                    i27 = i13;
                    obj2 = obj2;
                    sArr5 = sArr2;
                    c206312 = c206312;
                    str5 = str5;
                    i34 = i34;
                    c206310 = c206310;
                    c206311 = c206311;
                    sbM11879 = sbM11879;
                    sbM118710 = sbM118710;
                    break;
                case -405857791:
                case 1063339783:
                    C1028.m56247();
                    c20636 = c206312;
                    sb = sbM118710;
                    sb2 = sbM11879;
                    c20638 = c206310;
                    obj = obj2;
                    c20637 = c206311;
                    i8 = i34;
                    str = str5;
                    sArr = sArr5;
                    iM559711 = (C0873.m55680("ۚۗ") ^ i26) * (-123);
                    i9 = ((iM559711 ^ i25) * (-8853)) ^ (-1025607751);
                    i10 = 286709501;
                    i28 = iM559711 ^ i10;
                    obj2 = obj;
                    c206311 = c20637;
                    sArr5 = sArr;
                    str5 = str;
                    sbM11879 = sb2;
                    i34 = i8;
                    sbM118710 = sb;
                    c206310 = c20638;
                    i27 = i9;
                    c206312 = c20636;
                    break;
                case -394575619:
                case 887704083:
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    C0949.m56011(th, obj2);
                    c206311 = c206311;
                    c206312 = c206312;
                    c206310 = c206310;
                    i34 = i34;
                    str2 = str6;
                    iM55683 = C0873.m55680("ۘۚ") ^ i26;
                    i15 = ((iM55683 ^ i25) * 1673) ^ (-2020794313);
                    i16 = 1552310219;
                    i28 = iM55683 ^ i16;
                    str6 = str2;
                    i27 = i15;
                    obj2 = obj2;
                    i34 = i34;
                    c206312 = c206312;
                    c206310 = c206310;
                    c206311 = c206311;
                    sbM11879 = sbM11879;
                    sbM118710 = sbM118710;
                    break;
                case -339647689:
                case 1109912262:
                    c206312 = c206312;
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    c206311 = c206311;
                    c206310 = c206310;
                    i34 = i34;
                    str5 = str5;
                    sArr2 = sArr5;
                    if (C0906.m55806(str5, C1028.m56235(f82015, 5, 12, i35))) {
                        iM55682 = C0873.m55680("ܰ۟") ^ i26;
                        i13 = ((iM55682 ^ i25) * 11339) ^ (-118616529);
                        i14 = 1985831949;
                    } else {
                        b = b2;
                        iM55682 = C0873.m55680("ۡ֡") ^ i25;
                        i13 = ((iM55682 ^ i26) * 16085) ^ (-1506237396);
                        i14 = 2142845805;
                    }
                    i28 = iM55682 ^ i14;
                    i27 = i13;
                    obj2 = obj2;
                    sArr5 = sArr2;
                    c206312 = c206312;
                    str5 = str5;
                    i34 = i34;
                    c206310 = c206310;
                    c206311 = c206311;
                    sbM11879 = sbM11879;
                    sbM118710 = sbM118710;
                    break;
                case -298062401:
                case 1158107388:
                    c206312 = c206312;
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    c206311 = c206311;
                    c206310 = c206310;
                    i34 = i34;
                    str5 = str5;
                    if (!ViewOnClickListenerC0939.m55949(str5, RunnableC0938.m55936(f82015, 23, 7, i35))) {
                        sArr2 = sArr5;
                        b = b2;
                        iM55682 = C0873.m55680("ۡ֡") ^ i25;
                        i13 = ((iM55682 ^ i26) * 16085) ^ (-1506237396);
                        i14 = 2142845805;
                        i28 = iM55682 ^ i14;
                        i27 = i13;
                        obj2 = obj2;
                        sArr5 = sArr2;
                        c206312 = c206312;
                        str5 = str5;
                        i34 = i34;
                        c206310 = c206310;
                        c206311 = c206311;
                        sbM11879 = sbM11879;
                        sbM118710 = sbM118710;
                    } else {
                        int iM559718 = (C0946.m55979("۟ۧ") + i26) * 67;
                        i15 = ((iM559718 ^ i25) * (-30621)) ^ (-1038183111);
                        i28 = iM559718 ^ 2000809262;
                        str5 = str5;
                        i27 = i15;
                        obj2 = obj2;
                        i34 = i34;
                        c206312 = c206312;
                        c206310 = c206310;
                        c206311 = c206311;
                        sbM11879 = sbM11879;
                        sbM118710 = sbM118710;
                    }
                    break;
                case -247765665:
                case 438917110:
                    C0898.m55800();
                    if (C1071.m56343() == 0) {
                        iM55979 = C0946.m55979("֫ۖ") ^ i26;
                        i = ((iM55979 ^ i25) * (-31625)) ^ 1529609692;
                        i2 = 1629737394;
                        i28 = iM55979 ^ i2;
                        i27 = i;
                    } else {
                        c206312 = c206312;
                        sbM118710 = sbM118710;
                        sbM11879 = sbM11879;
                        obj2 = obj2;
                        c206311 = c206311;
                        c206310 = c206310;
                        i34 = i34;
                        str2 = str6;
                        iM55683 = (C0946.m55979("᩺֫") + i26) * 7;
                        i15 = ((iM55683 ^ i25) * (-6163)) ^ (-1886531946);
                        i16 = 782011973;
                        i28 = iM55683 ^ i16;
                        str6 = str2;
                        i27 = i15;
                        obj2 = obj2;
                        i34 = i34;
                        c206312 = c206312;
                        c206310 = c206310;
                        c206311 = c206311;
                        sbM11879 = sbM11879;
                        sbM118710 = sbM118710;
                    }
                    break;
                case -208784670:
                case 813640688:
                    throw th;
                case -135970669:
                case 208756308:
                    RunnableC0897.m55784();
                    C0927.m55873();
                    return null;
                case -115168995:
                case 700282121:
                    c206312 = c206312;
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    c206311 = c206311;
                    c206310 = c206310;
                    i34 = i34;
                    str5 = str5;
                    sArr2 = sArr5;
                    if (C0906.m55806(str5, C1404.m56462(f82015, 17, 6, i35))) {
                        iM55682 = (C0873.m55680("᩻ܶ") ^ i25) * 49;
                        i13 = ((iM55682 ^ i26) * (-32585)) ^ 301981790;
                        i14 = 506874858;
                    } else {
                        b = b2;
                        iM55682 = C0873.m55680("ۡ֡") ^ i25;
                        i13 = ((iM55682 ^ i26) * 16085) ^ (-1506237396);
                        i14 = 2142845805;
                    }
                    i28 = iM55682 ^ i14;
                    i27 = i13;
                    obj2 = obj2;
                    sArr5 = sArr2;
                    c206312 = c206312;
                    str5 = str5;
                    i34 = i34;
                    c206310 = c206310;
                    c206311 = c206311;
                    sbM11879 = sbM11879;
                    sbM118710 = sbM118710;
                    break;
                case 12746274:
                case 2055532842:
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    if (C0930.m55886(itM46633)) {
                        iM55684 = C0946.m55979("᩶֨") ^ i25;
                        i20 = ((iM55684 ^ i26) * 12103) ^ (-307131729);
                        i21 = -2121634947;
                        i28 = iM55684 ^ i21;
                        sbM11879 = sbM11879;
                        i27 = i20;
                        sbM118710 = sbM118710;
                    }
                    c20635 = c206310;
                    i5 = i32;
                    int iM556812 = (C0873.m55680("ۡۧ") + i25) * 83;
                    i28 = iM556812 ^ (-1312318539);
                    sArr3 = sArr3;
                    i32 = i5;
                    i27 = ((iM556812 ^ i26) * 77) ^ 1687041873;
                    sArr5 = sArr5;
                    c206312 = c206312;
                    c14723 = c14723;
                    str5 = str5;
                    c206311 = c206311;
                    i34 = i34;
                    c206310 = c20635;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    sbM118710 = sbM118710;
                    break;
                case 22254241:
                case 2062909073:
                    return linkedHashMap;
                case 24425816:
                case 916063427:
                    i35 = 12173;
                    iM55680 = (C0946.m55979("᩻ᩳ") + i26) * (-87);
                    i3 = ((iM55680 ^ i25) * 7577) ^ (-1151704325);
                    i4 = -1680025437;
                    i28 = iM55680 ^ i4;
                    i27 = i3;
                    c14723 = c14723;
                    sArr3 = sArr3;
                    i32 = i32;
                    c206311 = c206311;
                    sArr5 = sArr5;
                    c206312 = c206312;
                    charSequence2 = charSequence;
                    str5 = str5;
                    sbM11879 = sbM11879;
                    i34 = i34;
                    c206310 = c206310;
                    sbM118710 = sbM118710;
                    obj2 = obj2;
                    break;
                case 30568943:
                case 1870977362:
                    C15525.putIfAbsent(linkedHashMap, C0863.m55639(sbM11879), m18503(charSequence2, c206311));
                    itM46632 = it;
                    i19 = i30;
                    str3 = str6;
                    c20639 = c206310;
                    int iM556813 = C0873.m55680("۬ܰ") ^ i26;
                    Iterator it2 = itM46632;
                    i27 = ((iM556813 ^ i25) * (-16455)) ^ (-598675238);
                    i28 = iM556813 ^ (-414829949);
                    c206310 = c20639;
                    obj2 = obj2;
                    c206311 = c206311;
                    sbM11879 = sbM11879;
                    sbM118710 = sbM118710;
                    str6 = str3;
                    i34 = i19;
                    it = it2;
                    break;
                case 215366299:
                case 748533225:
                    C1012.m56134();
                    if (C0898.m55800() <= 0) {
                        sbM118710 = sbM118710;
                        sbM11879 = sbM11879;
                        iM55684 = (i26 - C0946.m55979("۬ۨ")) * (-19);
                        i20 = ((iM55684 ^ i25) * 31051) ^ 553900213;
                        i21 = 1978784197;
                        i28 = iM55684 ^ i21;
                        sbM11879 = sbM11879;
                        i27 = i20;
                        sbM118710 = sbM118710;
                    }
                    c206312 = c206312;
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    c206311 = c206311;
                    c206310 = c206310;
                    i34 = i34;
                    str2 = str6;
                    iM55683 = (C0946.m55979("᩺֫") + i26) * 7;
                    i15 = ((iM55683 ^ i25) * (-6163)) ^ (-1886531946);
                    i16 = 782011973;
                    i28 = iM55683 ^ i16;
                    str6 = str2;
                    i27 = i15;
                    obj2 = obj2;
                    i34 = i34;
                    c206312 = c206312;
                    c206310 = c206310;
                    c206311 = c206311;
                    sbM11879 = sbM11879;
                    sbM118710 = sbM118710;
                    break;
                case 404351069:
                case 1250898298:
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    c206311 = (C20635) RunnableC0897.m55785(it);
                    sArr5 = f82015;
                    i29 = 36;
                    if (C1003.f81929 > 0) {
                        iM55684 = C0873.m55680("᩶֡") ^ i26;
                        i20 = ((iM55684 ^ i25) * (-21269)) ^ (-934639254);
                        i21 = -392924527;
                        i28 = iM55684 ^ i21;
                        sbM11879 = sbM11879;
                        i27 = i20;
                        sbM118710 = sbM118710;
                    } else {
                        c206311 = c206311;
                        c206310 = c206310;
                        i34 = i34;
                        str5 = str5;
                        sArr5 = sArr5;
                        i32 = i32;
                        iM55680 = C0873.m55680("᩷᩹") ^ i25;
                        i3 = ((iM55680 ^ i26) * 16097) ^ 69722224;
                        i4 = 1280424927;
                        i28 = iM55680 ^ i4;
                        i27 = i3;
                        c14723 = c14723;
                        sArr3 = sArr3;
                        i32 = i32;
                        c206311 = c206311;
                        sArr5 = sArr5;
                        c206312 = c206312;
                        charSequence2 = charSequence;
                        str5 = str5;
                        sbM11879 = sbM11879;
                        i34 = i34;
                        c206310 = c206310;
                        sbM118710 = sbM118710;
                        obj2 = obj2;
                    }
                    break;
                case 965658808:
                case 987517404:
                    c206312 = c206312;
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    sArr3 = sArr3;
                    c206311 = c206311;
                    c206310 = c206310;
                    i34 = i34;
                    str5 = str5;
                    sArr5 = sArr5;
                    i5 = i32;
                    c9729Mo28589 = ((InterfaceC21800) charSequence2).mo28589();
                    iM559710 = C0946.m55979("᩺ۖ") ^ i26;
                    i6 = ((iM559710 ^ i25) * 22411) ^ (-540061841);
                    i7 = -387208164;
                    i28 = iM559710 ^ i7;
                    i27 = i6;
                    sArr3 = sArr3;
                    i32 = i5;
                    c206311 = c206311;
                    sArr5 = sArr5;
                    c206312 = c206312;
                    str5 = str5;
                    sbM11879 = sbM11879;
                    i34 = i34;
                    c206310 = c206310;
                    sbM118710 = sbM118710;
                    obj2 = obj2;
                    break;
                case 1039983701:
                case 1213094252:
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    if (C0930.m55886(it)) {
                        iM55684 = (C0873.m55680("ۧܶ") + i25) * (-119);
                        i20 = ((iM55684 ^ i26) * (-5935)) ^ (-1588023465);
                        i21 = 918694945;
                        i28 = iM55684 ^ i21;
                        sbM11879 = sbM11879;
                        i27 = i20;
                        sbM118710 = sbM118710;
                    }
                    c20635 = c206310;
                    i5 = i32;
                    int iM556814 = (C0873.m55680("ۡۧ") + i25) * 83;
                    i28 = iM556814 ^ (-1312318539);
                    sArr3 = sArr3;
                    i32 = i5;
                    i27 = ((iM556814 ^ i26) * 77) ^ 1687041873;
                    sArr5 = sArr5;
                    c206312 = c206312;
                    c14723 = c14723;
                    str5 = str5;
                    c206311 = c206311;
                    i34 = i34;
                    c206310 = c20635;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    sbM118710 = sbM118710;
                    break;
                case 1079967874:
                case 1109624719:
                    c206312 = c206312;
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    sArr3 = sArr3;
                    c206311 = c206311;
                    c14723 = c14723;
                    c206310 = c206310;
                    i34 = i34;
                    str5 = str5;
                    sArr5 = sArr5;
                    i32 = i32;
                    s = f82015[0];
                    if (C0937.m55918() >= 0) {
                        iM55680 = (C0946.m55979("ۨ۫") ^ i25) * 63;
                        i3 = ((iM55680 ^ i26) * 19329) ^ (-1356478157);
                        i4 = 1453306626;
                    } else {
                        iM55680 = (i26 - C0873.m55680("۠۬")) * 99;
                        i3 = ((iM55680 ^ i25) * (-8415)) ^ 28456613;
                        i4 = 952510953;
                    }
                    i28 = iM55680 ^ i4;
                    i27 = i3;
                    c14723 = c14723;
                    sArr3 = sArr3;
                    i32 = i32;
                    c206311 = c206311;
                    sArr5 = sArr5;
                    c206312 = c206312;
                    charSequence2 = charSequence;
                    str5 = str5;
                    sbM11879 = sbM11879;
                    i34 = i34;
                    c206310 = c206310;
                    sbM118710 = sbM118710;
                    obj2 = obj2;
                    break;
                case 1201501585:
                case 1229463534:
                    c206312 = c206312;
                    sArr2 = sArr5;
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    c206311 = c206311;
                    c206310 = c206310;
                    i34 = i34;
                    strM45305 = c19964M46637.m45304();
                    String strM46644 = c206310.m46644();
                    AbstractC0942.m55962(strM46644);
                    b2 = -1;
                    switch (C0873.m55680(strM46644)) {
                        case -1024600675:
                            iM55681 = (C0873.m55680("ۙ᩺") + i25) * (-65);
                            i11 = ((iM55681 ^ i26) * (-6285)) ^ 1716401969;
                            i12 = -1956230483;
                            i28 = iM55681 ^ i12;
                            obj2 = obj2;
                            sArr5 = sArr2;
                            i34 = i34;
                            str5 = strM46644;
                            c206310 = c206310;
                            i27 = i11;
                            c206311 = c206311;
                            c206312 = c206312;
                            break;
                        case -891985903:
                            iM55681 = (i25 - C0873.m55680("᩻ۘ")) * 55;
                            i11 = ((iM55681 ^ i26) * 1791) ^ (-2103179022);
                            i12 = -1503780296;
                            i28 = iM55681 ^ i12;
                            obj2 = obj2;
                            sArr5 = sArr2;
                            i34 = i34;
                            str5 = strM46644;
                            c206310 = c206310;
                            i27 = i11;
                            c206311 = c206311;
                            c206312 = c206312;
                            break;
                        case -475309713:
                            iM55681 = (i26 - C0873.m55680("ۨۚ")) * 61;
                            i11 = ((iM55681 ^ i25) * (-1991)) ^ (-913492870);
                            i12 = 1524969258;
                            i28 = iM55681 ^ i12;
                            obj2 = obj2;
                            sArr5 = sArr2;
                            i34 = i34;
                            str5 = strM46644;
                            c206310 = c206310;
                            i27 = i11;
                            c206311 = c206311;
                            c206312 = c206312;
                            break;
                        default:
                            str5 = strM46644;
                            b = b2;
                            iM55682 = C0873.m55680("ۡ֡") ^ i25;
                            i13 = ((iM55682 ^ i26) * 16085) ^ (-1506237396);
                            i14 = 2142845805;
                            i28 = iM55682 ^ i14;
                            i27 = i13;
                            obj2 = obj2;
                            sArr5 = sArr2;
                            c206312 = c206312;
                            str5 = str5;
                            i34 = i34;
                            c206310 = c206310;
                            c206311 = c206311;
                            break;
                    }
                    sbM11879 = sbM11879;
                    sbM118710 = sbM118710;
                    break;
                case 1201667409:
                case 1780067623:
                    sbM118710 = sbM118710;
                    sbM11879 = C5410.m11879(C0937.m55921(sArr5, i29, 6, i35), strM45305, str7);
                    if (C1017.m56187() <= 0) {
                        iM55685 = (C0946.m55979("᩵ۖ") ^ i26) * (-19);
                        i22 = ((iM55685 ^ i25) * (-23579)) ^ (-1787021833);
                        i23 = 1921340628;
                    } else {
                        iM55685 = (i26 - C0873.m55680("᩻ۢ")) * 93;
                        i22 = ((iM55685 ^ i25) * 11249) ^ (-1048566486);
                        i23 = 1455097226;
                    }
                    i28 = iM55685 ^ i23;
                    i27 = i22;
                    sbM118710 = sbM118710;
                    break;
                case 1254820603:
                case 1803216075:
                    c206312 = c206312;
                    sbM118710 = sbM118710;
                    sbM11879 = sbM11879;
                    obj2 = obj2;
                    sArr3 = sArr3;
                    c206311 = c206311;
                    c206310 = c206310;
                    i34 = i34;
                    str5 = str5;
                    sArr5 = sArr5;
                    i5 = i32;
                    if (C0930.m55886(itM46631)) {
                        iM559710 = (C0873.m55680("֫᩷") + i25) * (-127);
                        i6 = ((iM559710 ^ i26) * (-5529)) ^ (-1162029835);
                        i7 = -1611529397;
                    } else {
                        iM559710 = C0873.m55680("ۧۙ") ^ i26;
                        i6 = ((iM559710 ^ i25) * 1805) ^ 588911033;
                        i7 = -704834456;
                    }
                    i28 = iM559710 ^ i7;
                    i27 = i6;
                    sArr3 = sArr3;
                    i32 = i5;
                    c206311 = c206311;
                    sArr5 = sArr5;
                    c206312 = c206312;
                    str5 = str5;
                    sbM11879 = sbM11879;
                    i34 = i34;
                    c206310 = c206310;
                    sbM118710 = sbM118710;
                    obj2 = obj2;
                    break;
                case 1597237498:
                case 2059537167:
                    str3 = str6;
                    c20639 = c206310;
                    itM46632 = C20635.m46632(c20639, str3);
                    i19 = 0;
                    int iM556815 = C0873.m55680("۬ܰ") ^ i26;
                    Iterator it3 = itM46632;
                    i27 = ((iM556815 ^ i25) * (-16455)) ^ (-598675238);
                    i28 = iM556815 ^ (-414829949);
                    c206310 = c20639;
                    obj2 = obj2;
                    c206311 = c206311;
                    sbM11879 = sbM11879;
                    sbM118710 = sbM118710;
                    str6 = str3;
                    i34 = i19;
                    it = it3;
                    break;
                default:
                    C0854.m55595();
                    if (C1028.f81950 > 0) {
                        iM55979 = C0946.m55979("֫ۖ") ^ i26;
                        i = ((iM55979 ^ i25) * (-31625)) ^ 1529609692;
                        i2 = 1629737394;
                    } else {
                        iM55979 = C0946.m55979("ۙ֡") ^ i26;
                        i = ((iM55979 ^ i25) * (-9421)) ^ (-307533572);
                        i2 = -1256114123;
                    }
                    i28 = iM55979 ^ i2;
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
    
        if (p067l.C0894.f81854 < 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dd, code lost:
    
        r33 = r1;
        r35 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ea, code lost:
    
        if (p067l.C0949.f81897 >= 0) goto L14;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m18505(GetChars getChars) throws Throwable {
        boolean z;
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int iM559710;
        int i4;
        int i5;
        int iM559711;
        int i6;
        int i7;
        int iM559712;
        int i8;
        int i9;
        C14723 c14723;
        int i10;
        boolean zM55806 = false;
        boolean zM55807 = false;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i11 = 0;
        int i12 = 0;
        short s2 = 0;
        int i13 = 0;
        int i14 = 296529616;
        int i15 = RunnableC1014.f81941;
        int i16 = C1003.f81929;
        int iM55681 = (C0873.m55680("᩹᩵") + i15) * 97;
        int i17 = ((iM55681 ^ i16) * 28983) ^ 1880702540;
        int i18 = iM55681 ^ 159217319;
        C9729 c9729Mo28589 = null;
        Throwable th = null;
        Object obj = null;
        String strM21173 = null;
        int i19 = 0;
        int iM21163 = 0;
        C9196 c9196 = null;
        int iM21167 = 0;
        int i20 = 0;
        boolean z2 = false;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        boolean zM55949 = false;
        boolean zM559410 = false;
        boolean zM559411 = false;
        boolean zM18505 = false;
        boolean z3 = false;
        C14723 c14724 = null;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i16) * 27965) >> 31));
            switch (i14) {
                case -2076712042:
                case 1444517926:
                    i19 = i19;
                    c14724 = c14724;
                    s = sArr[c];
                    if (C1012.f81938 >= 0) {
                        iM559711 = C0873.m55680("᩶ۨ") ^ i15;
                        i6 = ((iM559711 ^ i16) * (-21971)) ^ 1844570899;
                        i7 = 826069866;
                    } else {
                        iM559711 = (C0946.m55979("ᩳ۬") ^ i15) * (-3);
                        i6 = ((iM559711 ^ i16) * (-10281)) ^ (-1609021784);
                        i7 = 664613527;
                    }
                    i10 = iM559711 ^ i7;
                    c14724 = c14724;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -2073942633:
                case 1849106669:
                    if (zM55807) {
                        iM559710 = C0946.m55979("ۡ۠") ^ i16;
                        i = ((iM559710 ^ i15) * 32501) ^ 1714312636;
                        i4 = -2099528307;
                    } else {
                        iM559710 = (C0946.m55979("ۘ۟") ^ i15) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM559710 ^ i16) * 20361) ^ (-1842163508);
                        i4 = 1986779934;
                    }
                    i18 = iM559710 ^ i4;
                    i17 = i;
                    break;
                case -2061831772:
                case -592096851:
                    iM21167 = iM21167;
                    z2 = z2;
                    if (zM559411) {
                        iM55680 = (C0873.m55680("ۖۘ") ^ i15) * (-5);
                        i = ((iM55680 ^ i16) * (-25251)) ^ 1479924608;
                        i3 = -1605027198;
                    } else {
                        iM55680 = (C0946.m55979("ۚۘ") ^ i16) * 19;
                        i = ((iM55680 ^ i15) * (-32237)) ^ 781676279;
                        i3 = -991308641;
                    }
                    i5 = iM55680 ^ i3;
                    z2 = z2;
                    iM21167 = iM21167;
                    i18 = i5;
                    i17 = i;
                    break;
                case -2026190518:
                case 258930784:
                    i20 = 35940;
                    iM559711 = (C0946.m55979("ۜۡ") ^ i15) * (-103);
                    i6 = ((iM559711 ^ i16) * 29915) ^ 2034254150;
                    i7 = 1926284205;
                    i10 = iM559711 ^ i7;
                    c14724 = c14724;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -1944744148:
                case 1057649652:
                    iM21167 = iM21167;
                    z2 = z2;
                    if (zM559410) {
                        iM55680 = (C0873.m55680("ۖۘ") ^ i15) * (-5);
                        i = ((iM55680 ^ i16) * (-25251)) ^ 1479924608;
                        i3 = -1605027198;
                    } else {
                        iM55680 = C0873.m55680("ۜ᩻") ^ i16;
                        i = ((iM55680 ^ i15) * 26065) ^ 1159681692;
                        i3 = -1067958522;
                    }
                    i5 = iM55680 ^ i3;
                    z2 = z2;
                    iM21167 = iM21167;
                    i18 = i5;
                    i17 = i;
                    break;
                case -1931648523:
                case 802016797:
                    z2 = true;
                    if (iM21167 != 1) {
                        iM559710 = C0873.m55680("᩵ܳ") ^ i15;
                        i = ((iM559710 ^ i16) * (-22807)) ^ (-1928666827);
                        i4 = 2124531623;
                    } else {
                        iM559710 = (C0946.m55979("֨ۙ") + i16) * 27;
                        i = ((iM559710 ^ i15) * (-17571)) ^ 3804556;
                        i4 = 949977531;
                    }
                    i18 = iM559710 ^ i4;
                    i17 = i;
                    break;
                case -1903856692:
                case 1714696687:
                    if (C1229.f82066 < 0) {
                        iM559710 = C0946.m55979("۠᩹") ^ i15;
                        i = ((iM559710 ^ i16) * 11259) ^ (-8039440);
                        i4 = 203274913;
                        i18 = iM559710 ^ i4;
                        i17 = i;
                    } else {
                        i19 = i19;
                        c14724 = c14724;
                        iM559711 = (C0873.m55680("ۘۨ") ^ i15) * (-33);
                        i6 = ((iM559711 ^ i16) * (-22237)) ^ (-1179408003);
                        i7 = 1880103155;
                        i10 = iM559711 ^ i7;
                        c14724 = c14724;
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
                    iM559712 = C0873.m55680("᩷ᩴ") ^ i16;
                    i6 = ((iM559712 ^ i15) * 997) ^ 1055434413;
                    i8 = 1507270614;
                    i10 = iM559712 ^ i8;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -1789614255:
                case 1844942997:
                    C0877.m55696();
                    i19 = i19;
                    c14724 = c14724;
                    iM559711 = (C0873.m55680("ۘۨ") ^ i15) * (-33);
                    i6 = ((iM559711 ^ i16) * (-22237)) ^ (-1179408003);
                    i7 = 1880103155;
                    i10 = iM559711 ^ i7;
                    c14724 = c14724;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -1757103636:
                case 281217360:
                    C1036.m56257();
                    return false;
                case -1707078760:
                case 342605442:
                    return z3;
                case -1655134388:
                case -692737888:
                    iM21167 = iM21167;
                    z2 = z2;
                    if (i19 >= iM21163) {
                        i22 = i23;
                        z2 = z2;
                        iM21167 = iM21167;
                        iM559712 = C0873.m55680("᩷ᩴ") ^ i16;
                        i6 = ((iM559712 ^ i15) * 997) ^ 1055434413;
                        i8 = 1507270614;
                        i10 = iM559712 ^ i8;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    } else {
                        iM55680 = (C0873.m55680("᩸ᩴ") ^ i15) * 17;
                        i = ((iM55680 ^ i16) * (-22409)) ^ (-1028869887);
                        i3 = 1064533300;
                        i5 = iM55680 ^ i3;
                        z2 = z2;
                        iM21167 = iM21167;
                        i18 = i5;
                        i17 = i;
                    }
                    break;
                case -1635163645:
                case 1270848275:
                    C1229.m56410();
                    break;
                case -1634958422:
                case 34867368:
                    i19++;
                    iM55680 = (i16 - C0873.m55680("۫۬")) * (-27);
                    i = ((iM55680 ^ i15) * 30633) ^ (-672347298);
                    i3 = -655388695;
                    i5 = iM55680 ^ i3;
                    z2 = z2;
                    iM21167 = iM21167;
                    i18 = i5;
                    i17 = i;
                    break;
                case -1599981062:
                case -322791964:
                    return z2;
                case -1577190449:
                case -35706061:
                    i19 = i19;
                    c14724 = c14724;
                    i11 = s + 1;
                    if (C0906.m55809() <= 0) {
                        iM559711 = (C0946.m55979("᩵۟") + i16) * (-67);
                        i6 = ((iM559711 ^ i15) * (-783)) ^ 1064065964;
                        i7 = -2040927980;
                    } else {
                        iM559711 = C0946.m55979("ܽ۟") ^ i16;
                        i6 = ((iM559711 ^ i15) * (-6889)) ^ 683580148;
                        i7 = -1739959904;
                    }
                    i10 = iM559711 ^ i7;
                    c14724 = c14724;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -1533998937:
                case -907583044:
                    iM21167 = iM21167;
                    z2 = z2;
                    try {
                        C1194.m56385(c9729Mo28589);
                        iM55680 = (C0946.m55979("ܺ֡") ^ i16) * 23;
                        i = ((iM55680 ^ i15) * (-8027)) ^ 1034619705;
                        i3 = 1585240044;
                        i5 = iM55680 ^ i3;
                        z2 = z2;
                        iM21167 = iM21167;
                        i18 = i5;
                        i17 = i;
                    } catch (Throwable th2) {
                        int iM559713 = C0946.m55979("ܳۜ") ^ i15;
                        obj = th2;
                        i17 = ((iM559713 ^ i16) * (-11113)) ^ (-535690223);
                        z2 = z2;
                        iM21167 = iM21167;
                        i18 = iM559713 ^ 372269010;
                    }
                    break;
                case -1436951677:
                case -402532795:
                    i19 = i19;
                    c14724 = c14724;
                    if (getChars instanceof InterfaceC21800) {
                        iM559711 = C0873.m55680("ۤۗ") ^ i16;
                        i6 = ((iM559711 ^ i15) * (-27549)) ^ 596720406;
                        i7 = -1754304754;
                    } else {
                        iM559711 = C0946.m55979("ۘ᩺") ^ i16;
                        i6 = ((iM559711 ^ i15) * 13511) ^ 1521804481;
                        i7 = 1735875185;
                    }
                    i10 = iM559711 ^ i7;
                    c14724 = c14724;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -1256789227:
                case 1750821217:
                    c9729Mo28589 = ((InterfaceC21800) getChars).mo28589();
                    iM559712 = (C0873.m55680("ۢ۠") + i15) * (-85);
                    i19 = i19;
                    i6 = ((iM559712 ^ i16) * 29229) ^ 836455237;
                    i8 = 1085118784;
                    i10 = iM559712 ^ i8;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -1254627423:
                case 1082957604:
                    if (C1046.f81962 <= 0) {
                        i19 = i19;
                        c14724 = c14724;
                        iM559711 = C0873.m55680("᩶ۨ") ^ i15;
                        i6 = ((iM559711 ^ i16) * (-21971)) ^ 1844570899;
                        i7 = 826069866;
                        i10 = iM559711 ^ i7;
                        c14724 = c14724;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    }
                    i19 = i19;
                    c14724 = c14724;
                    iM559711 = (C0873.m55680("ۘۨ") ^ i15) * (-33);
                    i6 = ((iM559711 ^ i16) * (-22237)) ^ (-1179408003);
                    i7 = 1880103155;
                    i10 = iM559711 ^ i7;
                    c14724 = c14724;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -1237798825:
                case 807148670:
                    i19 = 0;
                    iM55680 = (i16 - C0873.m55680("۫۬")) * (-27);
                    i = ((iM55680 ^ i15) * 30633) ^ (-672347298);
                    i3 = -655388695;
                    i5 = iM55680 ^ i3;
                    z2 = z2;
                    iM21167 = iM21167;
                    i18 = i5;
                    i17 = i;
                    break;
                case -1171001718:
                case 396786015:
                    i19 = i19;
                    c14724 = c14724;
                    i12 = i11 * i11;
                    s2 = 2;
                    if (RunnableC0938.m55938() != 0) {
                        iM559711 = (C0873.m55680("ۘۨ") ^ i15) * (-33);
                        i6 = ((iM559711 ^ i16) * (-22237)) ^ (-1179408003);
                        i7 = 1880103155;
                    } else {
                        iM559711 = C0946.m55979("ᩳܽ") ^ i15;
                        i6 = ((iM559711 ^ i16) * (-30595)) ^ (-1048817221);
                        i7 = -1728294681;
                    }
                    i10 = iM559711 ^ i7;
                    c14724 = c14724;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -1152479762:
                case 1091309815:
                    iM21167 = iM21167;
                    z2 = z2;
                    int i25 = i24 + 1;
                    if (i25 != 10) {
                        i24 = i25;
                        i22 = i23;
                        z2 = z2;
                        iM21167 = iM21167;
                        iM559712 = C0873.m55680("᩷ᩴ") ^ i16;
                        i6 = ((iM559712 ^ i15) * 997) ^ 1055434413;
                        i8 = 1507270614;
                        i10 = iM559712 ^ i8;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    } else {
                        z2 = z2;
                        iM21167 = iM21167;
                        iM559710 = (C0946.m55979("֨ۙ") + i16) * 27;
                        i = ((iM559710 ^ i15) * (-17571)) ^ 3804556;
                        i4 = 949977531;
                        i18 = iM559710 ^ i4;
                        i17 = i;
                    }
                    break;
                case -1117468852:
                case 2033271028:
                    i19 = i19;
                    c14724 = c14724;
                    if ((i13 + 1) - i12 <= 0) {
                        iM559711 = (i15 - C0873.m55680("᩸۫")) * 63;
                        i6 = ((iM559711 ^ i16) * 639) ^ 281083896;
                        i7 = 412222502;
                    } else {
                        iM559711 = C0946.m55979("۟۟") ^ i16;
                        i6 = ((iM559711 ^ i15) * (-18957)) ^ 1910329461;
                        i7 = 2059928841;
                    }
                    i10 = iM559711 ^ i7;
                    c14724 = c14724;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -1074608811:
                case 1240692859:
                    z2 = z2;
                    try {
                        iM21167 = iM21167;
                        zM55807 = C0906.m55806(c9196.m21164(i19), C1404.m56462(f82015, 93, 4, i20));
                        iM55680 = (C0946.m55979("᩺֡") + i16) * 41;
                        i = ((iM55680 ^ i15) * (-2513)) ^ 163643948;
                        i3 = 26322608;
                        i5 = iM55680 ^ i3;
                        z2 = z2;
                        iM21167 = iM21167;
                        i18 = i5;
                    } catch (Exception unused) {
                        iM21167 = iM21167;
                        z2 = z2;
                        iM21167 = iM21167;
                        iM559710 = (C0946.m55979("֨ۙ") + i16) * 27;
                        i = ((iM559710 ^ i15) * (-17571)) ^ 3804556;
                        i4 = 949977531;
                        i18 = iM559710 ^ i4;
                    }
                    i17 = i;
                    break;
                case -1036834748:
                case -985194185:
                    i22--;
                    iM559712 = C0873.m55680("᩷ᩴ") ^ i16;
                    i6 = ((iM559712 ^ i15) * 997) ^ 1055434413;
                    i8 = 1507270614;
                    i10 = iM559712 ^ i8;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -1029438477:
                case 288377683:
                    C0937.m55918();
                    if (!C0863.m55643()) {
                        i19 = i19;
                        iM559712 = C0946.m55979("᩻۫") ^ i16;
                        i6 = ((iM559712 ^ i15) * (-26247)) ^ 1374066382;
                        i8 = 1145983575;
                        i10 = iM559712 ^ i8;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    } else {
                        iM559710 = C0946.m55979("۠᩹") ^ i15;
                        i = ((iM559710 ^ i16) * 11259) ^ (-8039440);
                        i4 = 203274913;
                        i18 = iM559710 ^ i4;
                        i17 = i;
                    }
                    break;
                case -1001289940:
                case 2146611294:
                    iM21167 = iM21167;
                    z2 = z2;
                    zM55949 = ViewOnClickListenerC0939.m55949(c9196.m21173(), C1053.m56325(f82015, 59, 9, i20));
                    iM55680 = (C0873.m55680("ۚ᩵") + i16) * 127;
                    i = ((iM55680 ^ i15) * (-29221)) ^ 262682512;
                    i3 = 1056329223;
                    i5 = iM55680 ^ i3;
                    z2 = z2;
                    iM21167 = iM21167;
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
                    iM21167 = iM21167;
                    z2 = z2;
                    strM21173 = c9196.m21173();
                    zM559410 = ViewOnClickListenerC0939.m55949(strM21173, C0927.m55863(f82015, 68, 6, i20));
                    iM55680 = C0946.m55979("۟ۨ") ^ i15;
                    i = ((iM55680 ^ i16) * (-19559)) ^ (-1483112300);
                    i3 = -302016152;
                    i5 = iM55680 ^ i3;
                    z2 = z2;
                    iM21167 = iM21167;
                    i18 = i5;
                    i17 = i;
                    break;
                case -754403417:
                case 1754221773:
                    i19 = i19;
                    if (C1964.f83032 <= 0) {
                        int iM559714 = C0946.m55979("᩵ۘ") ^ i16;
                        i6 = ((iM559714 ^ i15) * (-23651)) ^ (-1731526874);
                        i10 = iM559714 ^ 725173812;
                        c14724 = null;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                    } else {
                        C14723 c14725 = new C14723(getChars);
                        if (C0861.m55626()) {
                            c14724 = c14725;
                            iM559712 = C0946.m55979("᩻۫") ^ i16;
                            i6 = ((iM559712 ^ i15) * (-26247)) ^ 1374066382;
                            i8 = 1145983575;
                            i10 = iM559712 ^ i8;
                            i9 = i19;
                            i18 = i10;
                            i17 = i6;
                        } else {
                            int iM559715 = C0946.m55979("۠۬") ^ i16;
                            i17 = ((iM559715 ^ i15) * (-32641)) ^ 15631148;
                            c14724 = c14725;
                            i9 = i19;
                            i18 = iM559715 ^ (-3054255);
                        }
                    }
                    i19 = i9;
                    break;
                case -712867605:
                case 1488029313:
                    i20 = 44732;
                    iM559711 = (C0946.m55979("ۜۡ") ^ i15) * (-103);
                    i6 = ((iM559711 ^ i16) * 29915) ^ 2034254150;
                    i7 = 1926284205;
                    i10 = iM559711 ^ i7;
                    c14724 = c14724;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -622123696:
                case 1668532169:
                    i19 = i19;
                    c14724 = c14724;
                    c = ':';
                    if (C0861.f81831) {
                        iM559711 = C0946.m55979("ۜ۟") ^ i16;
                        i6 = ((iM559711 ^ i15) * (-23763)) ^ (-1889849346);
                        i7 = -1504812931;
                    } else {
                        iM559711 = C0946.m55979("ܰ᩵") ^ i16;
                        i6 = ((iM559711 ^ i15) * 29193) ^ (-705980384);
                        i7 = -522345762;
                    }
                    i10 = iM559711 ^ i7;
                    c14724 = c14724;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -576134859:
                case 1013676206:
                    i19 = i19;
                    c14723 = c14724;
                    c9196.m21166(c14723);
                    z3 = false;
                    if (C0861.f81831) {
                        c14724 = c14723;
                        iM559711 = C0946.m55979("᩻᩵") ^ i15;
                        i6 = ((iM559711 ^ i16) * (-14011)) ^ 960560843;
                        i7 = -558926154;
                    } else {
                        iM559711 = C0946.m55979("᩺۟") ^ i15;
                        c14724 = c14723;
                        i6 = ((iM559711 ^ i16) * (-24351)) ^ (-168576144);
                        i7 = -10447861;
                    }
                    i10 = iM559711 ^ i7;
                    c14724 = c14724;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case -501118863:
                case -35548393:
                    iM21167 = iM21167;
                    z2 = z2;
                    zM559411 = ViewOnClickListenerC0939.m55949(strM21173, C1017.m56189(f82015, 74, 12, i20));
                    iM55680 = (C0946.m55979("ᩴۚ") + i16) * 89;
                    i = ((iM55680 ^ i15) * (-3227)) ^ 102471318;
                    i3 = 2018887610;
                    i5 = iM55680 ^ i3;
                    z2 = z2;
                    iM21167 = iM21167;
                    i18 = i5;
                    i17 = i;
                    break;
                case -250333576:
                case 881971434:
                    i23 = i22 + 1;
                    if (i23 == z2) {
                        iM559710 = (C0946.m55979("ᩳᩴ") + i16) * 123;
                        i = ((iM559710 ^ i15) * (-17153)) ^ (-1661935184);
                        i4 = -300510515;
                    } else {
                        iM559710 = (C0873.m55680("᩶ۧ") ^ i15) * (-75);
                        i = ((iM559710 ^ i16) * 29397) ^ (-1280637925);
                        i4 = 109825202;
                    }
                    i18 = iM559710 ^ i4;
                    i17 = i;
                    break;
                case -116021664:
                case 332174696:
                    i19 = i19;
                    c14724 = c14724;
                    i13 = s * s2;
                    if (C1012.f81938 >= 0) {
                        int iM559716 = C0946.m55979("᩵ۘ") ^ i16;
                        i6 = ((iM559716 ^ i15) * (-23651)) ^ (-1731526874);
                        i10 = iM559716 ^ 725173812;
                        c14724 = null;
                    } else {
                        iM559711 = C0873.m55680("ܿۡ") ^ i16;
                        i6 = ((iM559711 ^ i15) * 25225) ^ 1609749063;
                        i7 = 1531510558;
                        i10 = iM559711 ^ i7;
                        c14724 = c14724;
                    }
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case 147052550:
                case 506128252:
                    z = z2;
                    if (iM21167 == 3) {
                        iM55979 = (C0946.m55979("᩻ܶ") ^ i15) * (-33);
                        i = ((iM55979 ^ i16) * 31387) ^ (-1758013275);
                        i2 = -1562050610;
                        i5 = iM55979 ^ i2;
                        z2 = z;
                        i18 = i5;
                        i17 = i;
                    } else {
                        z2 = z;
                        iM559712 = C0873.m55680("᩷ᩴ") ^ i16;
                        i6 = ((iM559712 ^ i15) * 997) ^ 1055434413;
                        i8 = 1507270614;
                        i10 = iM559712 ^ i8;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    }
                    break;
                case 155395423:
                case 1907661591:
                    C1194.m56396();
                    if (C0873.f81841 > 0) {
                        iM559710 = C0946.m55979("۠᩹") ^ i15;
                        i = ((iM559710 ^ i16) * 11259) ^ (-8039440);
                        i4 = 203274913;
                    } else {
                        iM559710 = C0946.m55979("ۘ֨") ^ i15;
                        i = ((iM559710 ^ i16) * (-1441)) ^ 583621003;
                        i4 = 316511860;
                    }
                    i18 = iM559710 ^ i4;
                    i17 = i;
                    break;
                case 306552462:
                case 699739701:
                    i19 = i19;
                    c14724 = c14724;
                    sArr = f82015;
                    if (C1012.f81938 < 0) {
                        iM559711 = (i15 - C0946.m55979("ܶۙ")) * (-87);
                        i6 = ((iM559711 ^ i16) * (-17859)) ^ (-832051725);
                        i7 = -621698541;
                        i10 = iM559711 ^ i7;
                        c14724 = c14724;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    }
                    c14724 = c14724;
                    iM559712 = C0946.m55979("᩻۫") ^ i16;
                    i6 = ((iM559712 ^ i15) * (-26247)) ^ 1374066382;
                    i8 = 1145983575;
                    i10 = iM559712 ^ i8;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case 333073715:
                case 2010805366:
                    iM21167 = iM21167;
                    z2 = z2;
                    C0949.m56011(th, obj);
                    iM55680 = (C0946.m55979("ܺ֡") ^ i16) * 23;
                    i = ((iM55680 ^ i15) * (-8027)) ^ 1034619705;
                    i3 = 1585240044;
                    i5 = iM55680 ^ i3;
                    z2 = z2;
                    iM21167 = iM21167;
                    i18 = i5;
                    i17 = i;
                    break;
                case 375100689:
                case 1459555582:
                    iM21167 = iM21167;
                    z2 = z2;
                    if (i23 == i21) {
                        iM55680 = C0946.m55979("᩶۫") ^ i15;
                        i = ((iM55680 ^ i16) * (-13959)) ^ 397783440;
                        i3 = 2128822483;
                    } else {
                        iM55680 = (C0946.m55979("ۢۜ") + i16) * (-59);
                        i = ((iM55680 ^ i15) * 30363) ^ 1723277860;
                        i3 = 1289342557;
                    }
                    i5 = iM55680 ^ i3;
                    z2 = z2;
                    iM21167 = iM21167;
                    i18 = i5;
                    i17 = i;
                    break;
                case 524824916:
                case 856604018:
                    i21 = 2;
                    if (iM21167 != 2) {
                        iM559710 = C0946.m55979("۟ܰ") ^ i15;
                        i = ((iM559710 ^ i16) * 11043) ^ (-328849626);
                        i4 = 1764346266;
                    } else {
                        iM559710 = C0873.m55680("ۗ᩺") ^ i16;
                        i = ((iM559710 ^ i15) * (-5593)) ^ 1532634424;
                        i4 = 384329217;
                    }
                    i18 = iM559710 ^ i4;
                    i17 = i;
                    break;
                case 553065605:
                case 2134671422:
                    if (C0866.f81837 < 0) {
                        iM559710 = C0946.m55979("ܰܽ") ^ i16;
                        i = ((iM559710 ^ i15) * 20519) ^ (-1440850947);
                        i4 = 1660232001;
                        i18 = iM559710 ^ i4;
                        i17 = i;
                    } else {
                        i19 = i19;
                        c14723 = c14724;
                        iM559711 = C0946.m55979("᩺۟") ^ i15;
                        c14724 = c14723;
                        i6 = ((iM559711 ^ i16) * (-24351)) ^ (-168576144);
                        i7 = -10447861;
                        i10 = iM559711 ^ i7;
                        c14724 = c14724;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    }
                    break;
                case 610210874:
                case 1045158810:
                    iM21167 = iM21167;
                    z2 = z2;
                    if (!zM55949) {
                        z2 = z2;
                        iM21167 = iM21167;
                        iM559710 = (C0946.m55979("֨ۙ") + i16) * 27;
                        i = ((iM559710 ^ i15) * (-17571)) ^ 3804556;
                        i4 = 949977531;
                        i18 = iM559710 ^ i4;
                        i17 = i;
                    } else {
                        i22 = i23;
                        z2 = z2;
                        iM21167 = iM21167;
                        iM559712 = C0873.m55680("᩷ᩴ") ^ i16;
                        i6 = ((iM559712 ^ i15) * 997) ^ 1055434413;
                        i8 = 1507270614;
                        i10 = iM559712 ^ i8;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    }
                    break;
                case 876447714:
                case 1698805230:
                    C0937.m55922(c9729Mo28589);
                    return zM18505;
                case 977970775:
                case 1273850877:
                    try {
                        z = z2;
                        try {
                            zM55806 = C0906.m55806(strM21173, C0912.m55822(f82015, 86, 7, i20));
                            iM55979 = C0946.m55979("ۚܰ") ^ i15;
                            i = ((iM55979 ^ i16) * 24241) ^ (-689069527);
                            i2 = 384864919;
                            i5 = iM55979 ^ i2;
                            z2 = z;
                            i18 = i5;
                        } catch (Exception unused2) {
                            z2 = z;
                            iM559710 = (C0946.m55979("֨ۙ") + i16) * 27;
                            i = ((iM559710 ^ i15) * (-17571)) ^ 3804556;
                            i4 = 949977531;
                            i18 = iM559710 ^ i4;
                        }
                    } catch (Exception unused3) {
                        z = z2;
                    }
                    i17 = i;
                    break;
                case 1013779897:
                case 1853342081:
                    try {
                        zM18505 = m18505((GetChars) c9729Mo28589);
                        iM559710 = C0873.m55680("ۧۤ") ^ i16;
                        i = ((iM559710 ^ i15) * (-7359)) ^ 677504276;
                        i4 = 373556055;
                        i18 = iM559710 ^ i4;
                        i17 = i;
                    } catch (Throwable th3) {
                        int iM559717 = C0946.m55979("ۡۤ") ^ i16;
                        i18 = iM559717 ^ (-2031579924);
                        th = th3;
                        i17 = ((iM559717 ^ i15) * 8015) ^ (-586101023);
                    }
                    break;
                case 1158606011:
                case 1661981035:
                    i19 = i19;
                    c14724 = c14724;
                    c9196 = new C9196();
                    if (C1048.f81963) {
                        iM559711 = C0946.m55979("ܽ۫") ^ i15;
                        i6 = ((iM559711 ^ i16) * (-9091)) ^ (-110847307);
                        i7 = -1293771452;
                        i10 = iM559711 ^ i7;
                        c14724 = c14724;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    }
                    c14724 = c14724;
                    iM559712 = C0946.m55979("᩻۫") ^ i16;
                    i6 = ((iM559712 ^ i15) * (-26247)) ^ 1374066382;
                    i8 = 1145983575;
                    i10 = iM559712 ^ i8;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case 1356146165:
                case 2021853581:
                    if (C0912.f81867 > 0) {
                        i19 = i19;
                        int iM559718 = C0946.m55979("᩵ۘ") ^ i16;
                        i6 = ((iM559718 ^ i15) * (-23651)) ^ (-1731526874);
                        i10 = iM559718 ^ 725173812;
                        c14724 = null;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    }
                    i19 = i19;
                    c14723 = c14724;
                    iM559711 = C0946.m55979("᩺۟") ^ i15;
                    c14724 = c14723;
                    i6 = ((iM559711 ^ i16) * (-24351)) ^ (-168576144);
                    i7 = -10447861;
                    i10 = iM559711 ^ i7;
                    c14724 = c14724;
                    i9 = i19;
                    i18 = i10;
                    i17 = i6;
                    i19 = i9;
                    break;
                case 1717627830:
                case 2074937699:
                    try {
                        iM21167 = c9196.m21167();
                        iM559710 = C0873.m55680("ۨۡ") ^ i15;
                        i = ((iM559710 ^ i16) * (-32201)) ^ (-1517708276);
                        i4 = 1311235913;
                    } catch (Exception unused4) {
                        iM559710 = (C0946.m55979("֨ۙ") + i16) * 27;
                        i = ((iM559710 ^ i15) * (-17571)) ^ 3804556;
                        i4 = 949977531;
                    }
                    i18 = iM559710 ^ i4;
                    i17 = i;
                    break;
                case 1852606438:
                case 1998226604:
                    iM21167 = iM21167;
                    z2 = z2;
                    if (!zM55806) {
                        i22 = i23;
                        z2 = z2;
                        iM21167 = iM21167;
                        iM559712 = C0873.m55680("᩷ᩴ") ^ i16;
                        i6 = ((iM559712 ^ i15) * 997) ^ 1055434413;
                        i8 = 1507270614;
                        i10 = iM559712 ^ i8;
                        i9 = i19;
                        i18 = i10;
                        i17 = i6;
                        i19 = i9;
                    } else {
                        iM55680 = (C0873.m55680("ۖۘ") ^ i15) * (-5);
                        i = ((iM55680 ^ i16) * (-25251)) ^ 1479924608;
                        i3 = -1605027198;
                        i5 = iM55680 ^ i3;
                        z2 = z2;
                        iM21167 = iM21167;
                        i18 = i5;
                        i17 = i;
                    }
                    break;
                default:
                    iM21167 = iM21167;
                    z2 = z2;
                    try {
                        iM21163 = c9196.m21163();
                        iM55680 = (i15 - C0946.m55979("᩺ܽ")) * (-125);
                        i = ((iM55680 ^ i16) * 30295) ^ 1444165654;
                        i3 = -1397393230;
                        i5 = iM55680 ^ i3;
                        z2 = z2;
                        iM21167 = iM21167;
                        i18 = i5;
                    } catch (Exception unused5) {
                        z2 = z2;
                        iM21167 = iM21167;
                        iM559710 = (C0946.m55979("֨ۙ") + i16) * 27;
                        i = ((iM559710 ^ i15) * (-17571)) ^ 3804556;
                        i4 = 949977531;
                        i18 = iM559710 ^ i4;
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
    
        if (p067l.C0898.f81858 <= 0) goto L11;
     */
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C22739 m18506(CharSequence charSequence) throws Throwable {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        int i4;
        int i5;
        Iterator itM55615 = null;
        Map.Entry entry = null;
        Object value = null;
        C12015 c12015 = null;
        String str = null;
        String str2 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short[] sArr = null;
        int i9 = 0;
        int i10 = -575561587;
        int i11 = C1404.f82149;
        int i12 = C0992.f81922;
        int iM55682 = (i12 - C0873.m55680("ۙ᩷")) * (-31);
        int i13 = ((iM55682 ^ i11) * 5373) ^ (-926419444);
        int i14 = iM55682 ^ 715982885;
        int i15 = 0;
        C22739 c22739 = null;
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
                    if (!C1024.f81946) {
                        iM55680 = C0873.m55680("ۧ֫") ^ i12;
                        i = ((iM55680 ^ i11) * (-24135)) ^ 1698214;
                        i2 = 1406983180;
                        i14 = iM55680 ^ i2;
                        i13 = i;
                    } else {
                        itM55615 = itM55615;
                        iM55681 = (C0873.m55680("ۤ۠") + i11) * 83;
                        i3 = ((iM55681 ^ i12) * (-5263)) ^ (-1393862860);
                        i4 = 879577889;
                        i5 = iM55681 ^ i4;
                        Iterator it = itM55615;
                        i14 = i5;
                        i13 = i3;
                        itM55615 = it;
                    }
                    break;
                case -1837129907:
                case 647261457:
                    RunnableC0871.m55672();
                    return null;
                case -1757740115:
                case -1702861689:
                    ServiceConnectionC1013.m56157();
                    break;
                case -1614009877:
                case 1131743558:
                    return c22739;
                case -1606775833:
                case 403763702:
                    itM55615 = itM55615;
                    i6 = i16 * i16;
                    i7 = s * 2;
                    if (C0947.f81895) {
                        iM55681 = (C0873.m55680("ۤ۠") + i11) * 83;
                        i3 = ((iM55681 ^ i12) * (-5263)) ^ (-1393862860);
                        i4 = 879577889;
                    } else {
                        iM55681 = C0946.m55979("ۤܿ") ^ i12;
                        i3 = ((iM55681 ^ i11) * (-1889)) ^ (-461276161);
                        i4 = -817390202;
                    }
                    i5 = iM55681 ^ i4;
                    Iterator it2 = itM55615;
                    i14 = i5;
                    i13 = i3;
                    itM55615 = it2;
                    break;
                case -1536387301:
                case 585549997:
                    itM55615 = itM55615;
                    if ((i7 + 1) - i6 > 0) {
                        iM55681 = C0946.m55979("ۛۡ") ^ i11;
                        i3 = ((iM55681 ^ i12) * (-2353)) ^ 1194347787;
                        i4 = -1375395968;
                    } else {
                        iM55681 = (C0946.m55979("᩺ۗ") ^ i11) * (-87);
                        i3 = ((iM55681 ^ i12) * (-8003)) ^ 1032892174;
                        i4 = -135210884;
                    }
                    i5 = iM55681 ^ i4;
                    Iterator it3 = itM55615;
                    i14 = i5;
                    i13 = i3;
                    itM55615 = it3;
                    break;
                case -1439098422:
                case -1321590601:
                    if (C1071.m56345(str, C0947.m55993(sArr, i9, 1, i8))) {
                        iM55680 = (C0873.m55680("۬ۗ") ^ i12) * 27;
                        i = ((iM55680 ^ i11) * 13105) ^ (-814056794);
                        i2 = -635615440;
                    } else {
                        iM55680 = C0946.m55979("ۖ᩸") ^ i11;
                        i = ((iM55680 ^ i12) * 25585) ^ (-695902298);
                        i2 = -1257588701;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -1312947435:
                case 1629516157:
                    str2 = c12015.f33487;
                    sArr3 = f82015;
                    i15 = 99;
                    if (C0898.m55800() > 0) {
                        iM55680 = C0873.m55680("᩹᩸") ^ i12;
                        i = ((iM55680 ^ i11) * (-5611)) ^ 1596202582;
                        i2 = -1094514791;
                        i14 = iM55680 ^ i2;
                        i13 = i;
                    } else {
                        itM55615 = itM55615;
                        int iM55683 = (C0873.m55680("ۤܺ") ^ i11) * (-71);
                        i3 = ((iM55683 ^ i12) * 9133) ^ 670023949;
                        i5 = iM55683 ^ (-152854275);
                        c22739 = null;
                        Iterator it4 = itM55615;
                        i14 = i5;
                        i13 = i3;
                        itM55615 = it4;
                    }
                    break;
                case -1099067816:
                case 1800546262:
                    C0937.m55918();
                    if (C1012.f81938 < 0) {
                        iM55680 = C0873.m55680("۬֫") ^ i12;
                        i = ((iM55680 ^ i11) * 25997) ^ (-1147975171);
                        i2 = 2056935010;
                        i14 = iM55680 ^ i2;
                        i13 = i;
                    } else {
                        itM55615 = itM55615;
                        iM55681 = C0946.m55979("֫᩵") ^ i12;
                        i3 = ((iM55681 ^ i11) * 14303) ^ (-1477329914);
                        i4 = 2145311895;
                        i5 = iM55681 ^ i4;
                        Iterator it5 = itM55615;
                        i14 = i5;
                        i13 = i3;
                        itM55615 = it5;
                    }
                    break;
                case -965414066:
                case 1354868974:
                    c12015 = (C12015) value;
                    if (C11345.m26283(c12015.f33487)) {
                        iM55680 = C0946.m55979("᩺۠") ^ i11;
                        i = ((iM55680 ^ i12) * (-19241)) ^ 2091276549;
                        i2 = -1234391663;
                    } else {
                        iM55680 = (C0873.m55680("۬ۗ") ^ i12) * 27;
                        i = ((iM55680 ^ i11) * 13105) ^ (-814056794);
                        i2 = -635615440;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -903959703:
                case -622732134:
                    if (C0866.m55647(itM55615)) {
                        iM55680 = C0946.m55979("᩸ۙ") ^ i11;
                        i = ((iM55680 ^ i12) * (-20615)) ^ (-1481187958);
                        i2 = -1666780892;
                    } else {
                        iM55680 = C0873.m55680("ۚۙ") ^ i11;
                        i = ((iM55680 ^ i12) * 15331) ^ (-161368108);
                        i2 = -1755318971;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -787798552:
                case 1228138775:
                    itM55615 = itM55615;
                    c = 'a';
                    if (C0989.f81920 >= 0) {
                        iM55681 = C0946.m55979("֫᩵") ^ i12;
                        i3 = ((iM55681 ^ i11) * 14303) ^ (-1477329914);
                        i4 = 2145311895;
                    } else {
                        iM55681 = C0946.m55979("ۧ۟") ^ i11;
                        i3 = ((iM55681 ^ i12) * (-8971)) ^ 2021285960;
                        i4 = 249118117;
                    }
                    i5 = iM55681 ^ i4;
                    Iterator it6 = itM55615;
                    i14 = i5;
                    i13 = i3;
                    itM55615 = it6;
                    break;
                case -723453139:
                case -621558207:
                    itM55615 = itM55615;
                    s = sArr2[c];
                    if (C1048.f81963) {
                        iM55681 = C0873.m55680("ۚ۫") ^ i11;
                        i3 = ((iM55681 ^ i12) * 15921) ^ (-1037870661);
                        i4 = -847182605;
                    } else {
                        iM55681 = C0946.m55979("֫᩵") ^ i12;
                        i3 = ((iM55681 ^ i11) * 14303) ^ (-1477329914);
                        i4 = 2145311895;
                    }
                    i5 = iM55681 ^ i4;
                    Iterator it7 = itM55615;
                    i14 = i5;
                    i13 = i3;
                    itM55615 = it7;
                    break;
                case -608572408:
                case 1648734475:
                    str = c12015.f33487;
                    sArr = f82015;
                    i9 = 98;
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0873.m55680("ۧ֫") ^ i12;
                        i = ((iM55680 ^ i11) * (-24135)) ^ 1698214;
                        i2 = 1406983180;
                    } else {
                        iM55680 = (C0873.m55680("ۧܺ") + i12) * 51;
                        i = ((iM55680 ^ i11) * 16801) ^ 1589220760;
                        i2 = -43806157;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -428670820:
                case -380770794:
                    Map mapM18502 = m18502(charSequence);
                    if (C0854.f81826 != 0 || RunnableC0897.m55784()) {
                        itM55615 = itM55615;
                        int iM55684 = (C0873.m55680("ۤܺ") ^ i11) * (-71);
                        i3 = ((iM55684 ^ i12) * 9133) ^ 670023949;
                        i5 = iM55684 ^ (-152854275);
                        c22739 = null;
                        Iterator it8 = itM55615;
                        i14 = i5;
                        i13 = i3;
                        itM55615 = it8;
                    } else {
                        c22739 = new C22739(0, true);
                        itM55615 = C0861.m55615(mapM18502.entrySet());
                        iM55680 = (C0873.m55680("۬ۗ") ^ i12) * 27;
                        i = ((iM55680 ^ i11) * 13105) ^ (-814056794);
                        i2 = -635615440;
                        i14 = iM55680 ^ i2;
                        i13 = i;
                    }
                    break;
                case -320260434:
                case 301440309:
                    i8 = 29457;
                    iM55681 = C0873.m55680("ᩳۜ") ^ i12;
                    i3 = ((iM55681 ^ i11) * 13601) ^ (-1098974417);
                    i4 = 82793775;
                    i5 = iM55681 ^ i4;
                    Iterator it9 = itM55615;
                    i14 = i5;
                    i13 = i3;
                    itM55615 = it9;
                    break;
                case -124273809:
                case 1398915446:
                    if (C1229.m56404(str2, C0937.m55921(sArr3, i15, 1, i8))) {
                        iM55680 = (C0873.m55680("۬ۗ") ^ i12) * 27;
                        i = ((iM55680 ^ i11) * 13105) ^ (-814056794);
                        i2 = -635615440;
                    } else {
                        iM55680 = (i11 - C0873.m55680("ܿ֡")) * (-3);
                        i = ((iM55680 ^ i12) * 9025) ^ 330066780;
                        i2 = 551693416;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -39878775:
                case 2065331045:
                    C0930.m55885();
                    itM55615 = itM55615;
                    iM55681 = C0946.m55979("֫᩵") ^ i12;
                    i3 = ((iM55681 ^ i11) * 14303) ^ (-1477329914);
                    i4 = 2145311895;
                    i5 = iM55681 ^ i4;
                    Iterator it10 = itM55615;
                    i14 = i5;
                    i13 = i3;
                    itM55615 = it10;
                    break;
                case 296036392:
                case 430700702:
                    itM55615 = itM55615;
                    i16 = s + 1;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        int iM55685 = (C0873.m55680("ۤܺ") ^ i11) * (-71);
                        i3 = ((iM55685 ^ i12) * 9133) ^ 670023949;
                        i5 = iM55685 ^ (-152854275);
                        c22739 = null;
                    } else {
                        iM55681 = (C0946.m55979("ۧ۫") ^ i12) * 87;
                        i3 = ((iM55681 ^ i11) * 28267) ^ 1048503361;
                        i4 = 1642684971;
                        i5 = iM55681 ^ i4;
                    }
                    Iterator it11 = itM55615;
                    i14 = i5;
                    i13 = i3;
                    itM55615 = it11;
                    break;
                case 320879831:
                case 810377293:
                    itM55615 = itM55615;
                    sArr2 = f82015;
                    if (C0861.f81831) {
                        iM55681 = C0873.m55680("ۡۨ") ^ i12;
                        i3 = ((iM55681 ^ i11) * (-23597)) ^ 1560843342;
                        i4 = -1533887296;
                        i5 = iM55681 ^ i4;
                    } else {
                        int iM55686 = (C0873.m55680("ۤܺ") ^ i11) * (-71);
                        i3 = ((iM55686 ^ i12) * 9133) ^ 670023949;
                        i5 = iM55686 ^ (-152854275);
                        c22739 = null;
                    }
                    Iterator it12 = itM55615;
                    i14 = i5;
                    i13 = i3;
                    itM55615 = it12;
                    break;
                case 352989494:
                case 1217391993:
                    entry = (Map.Entry) C0955.m56035(itM55615);
                    value = entry.getValue();
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0873.m55680("ۧ֫") ^ i12;
                        i = ((iM55680 ^ i11) * (-24135)) ^ 1698214;
                        i2 = 1406983180;
                    } else {
                        iM55680 = (i12 - C0873.m55680("᩶ۧ")) * (-125);
                        i = ((iM55680 ^ i11) * (-16633)) ^ (-1408060377);
                        i2 = -1452137389;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case 674508455:
                case 2049958874:
                    i8 = 12507;
                    iM55681 = C0873.m55680("ᩳۜ") ^ i12;
                    i3 = ((iM55681 ^ i11) * 13601) ^ (-1098974417);
                    i4 = 82793775;
                    i5 = iM55681 ^ i4;
                    Iterator it13 = itM55615;
                    i14 = i5;
                    i13 = i3;
                    itM55615 = it13;
                    break;
                default:
                    c22739.m50886((String) entry.getKey(), c12015.f33487);
                    iM55680 = (C0873.m55680("۬ۗ") ^ i12) * 27;
                    i = ((iM55680 ^ i11) * 13105) ^ (-814056794);
                    i2 = -635615440;
                    i14 = iM55680 ^ i2;
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
    
        if (p067l.C0917.m55854() != false) goto L10;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m18504(C22739 c22739, InterfaceC9768 interfaceC9768) throws Throwable {
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        int iM55681;
        int i4;
        C22739 c227310 = c22739;
        int i5 = 0;
        int i6 = 0;
        Map.Entry entry = null;
        Object key = null;
        String str = null;
        C12015 c12015 = null;
        String strM50890 = null;
        int iM55719 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int iM55878 = 0;
        String str2 = null;
        int i10 = -1873481051;
        int i11 = C1124.f82007;
        int i12 = C1017.f81942;
        int iM55682 = C0873.m55680("ۗۡ") ^ i11;
        int i13 = ((iM55682 ^ i12) * (-5807)) ^ 2143406488;
        int i14 = iM55682 ^ (-1864015347);
        Set setEntrySet = null;
        Iterator itM55615 = null;
        int i15 = 0;
        int iM55879 = 0;
        C23141 c23141 = null;
        Map mapM18502 = null;
        int i16 = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * 3397) >> 31));
            switch (i10) {
                case -1959820781:
                case -691461979:
                    Selection.setSelection(interfaceC9768, i6);
                    i16 = i16;
                    iM55680 = C0946.m55979("ܰۘ") ^ i12;
                    i = ((iM55680 ^ i11) * 18009) ^ (-406382739);
                    i2 = -1277349359;
                    i14 = iM55680 ^ i2;
                    c227310 = c22739;
                    i16 = i16;
                    i13 = i;
                    break;
                case -1856314555:
                case 1070173013:
                    C1048.m56305();
                    if (C0937.m55918() >= 0) {
                        iM55681 = (i12 - C0873.m55680("᩺ᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i13 = ((iM55681 ^ i11) * (-817)) ^ 1642050008;
                        i4 = -1045553691;
                        i14 = iM55681 ^ i4;
                        c227310 = c22739;
                    } else {
                        i16 = i16;
                        int iM55683 = C0873.m55680("ܶ۟") ^ i11;
                        i = ((iM55683 ^ i12) * 14767) ^ 395400468;
                        i14 = iM55683 ^ (-1738589786);
                        c23141 = null;
                        c227310 = c22739;
                        i16 = i16;
                        i13 = i;
                    }
                    break;
                case -1742605445:
                case -620398461:
                    c12015 = (C12015) entry.getValue();
                    if (c227310.containsKey(str)) {
                        iM55979 = C0946.m55979("ۛ۟") ^ i12;
                        i = ((iM55979 ^ i11) * 7455) ^ 1728265843;
                        i3 = 2124324023;
                        i14 = iM55979 ^ i3;
                        i13 = i;
                    }
                    iM55680 = (C0946.m55979("ۙ᩻") ^ i12) * 59;
                    i = ((iM55680 ^ i11) * 1267) ^ 1060429556;
                    i2 = 2126028303;
                    i14 = iM55680 ^ i2;
                    c227310 = c22739;
                    i16 = i16;
                    i13 = i;
                    break;
                case -1722123208:
                case 271165456:
                    if (C0873.f81841 <= 0) {
                        iM55979 = (C0873.m55680("ۜ۠") + i12) * (-121);
                        i = ((iM55979 ^ i11) * (-20449)) ^ (-1145702746);
                        i3 = 1168483375;
                        i14 = iM55979 ^ i3;
                        i13 = i;
                    }
                    i16 = i16;
                    int iM55684 = C0873.m55680("ܶ۟") ^ i11;
                    i = ((iM55684 ^ i12) * 14767) ^ 395400468;
                    i14 = iM55684 ^ (-1738589786);
                    c23141 = null;
                    c227310 = c22739;
                    i16 = i16;
                    i13 = i;
                    break;
                case -1702573171:
                case 914760576:
                    C1048.m56305();
                    C1046.m56302();
                    i16 = i16;
                    int iM55685 = C0873.m55680("ܶ۟") ^ i11;
                    i = ((iM55685 ^ i12) * 14767) ^ 395400468;
                    i14 = iM55685 ^ (-1738589786);
                    c23141 = null;
                    c227310 = c22739;
                    i16 = i16;
                    i13 = i;
                    break;
                case -1687660963:
                case 135193710:
                    i6 = -1;
                    iM55719 = 0;
                    iM55680 = (C0946.m55979("ۙ᩻") ^ i12) * 59;
                    i = ((iM55680 ^ i11) * 1267) ^ 1060429556;
                    i2 = 2126028303;
                    i14 = iM55680 ^ i2;
                    c227310 = c22739;
                    i16 = i16;
                    i13 = i;
                    break;
                case -1665636466:
                case 325591353:
                    iM55719 = (iM55719 - C0882.m55719(str2)) + C0882.m55719(strM50890);
                    i6 = iM55878;
                    iM55680 = (C0946.m55979("ۙ᩻") ^ i12) * 59;
                    i = ((iM55680 ^ i11) * 1267) ^ 1060429556;
                    i2 = 2126028303;
                    i14 = iM55680 ^ i2;
                    c227310 = c22739;
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
                    strM50890 = c227310.m50890(str);
                    if (!C0906.m55806(strM50890, c12015.f33487)) {
                        iM55979 = (C0946.m55979("ۨܽ") + i11) * 43;
                        i = ((iM55979 ^ i12) * 18195) ^ 1524807479;
                        i3 = -1645126817;
                        i14 = iM55979 ^ i3;
                        i13 = i;
                    }
                    iM55680 = (C0946.m55979("ۙ᩻") ^ i12) * 59;
                    i = ((iM55680 ^ i11) * 1267) ^ 1060429556;
                    i2 = 2126028303;
                    i14 = iM55680 ^ i2;
                    c227310 = c22739;
                    i16 = i16;
                    i13 = i;
                    break;
                case -1261583534:
                case 203660494:
                    str = (String) key;
                    if (C1017.f81942 >= 0) {
                        iM55979 = (i11 - C0873.m55680("ܳۡ")) * 31;
                        i = ((iM55979 ^ i12) * 21965) ^ 511398057;
                        i3 = 684453266;
                    } else {
                        iM55979 = (i12 - C0946.m55979("֨᩺")) * 69;
                        i = ((iM55979 ^ i11) * (-747)) ^ (-1265832509);
                        i3 = 512235811;
                    }
                    i14 = iM55979 ^ i3;
                    i13 = i;
                    break;
                case -1250940658:
                case 936996021:
                    c23141.m51595();
                    i16 = i16;
                    if (i6 == i16) {
                        iM55680 = C0946.m55979("ܰۘ") ^ i12;
                        i = ((iM55680 ^ i11) * 18009) ^ (-406382739);
                        i2 = -1277349359;
                        i14 = iM55680 ^ i2;
                        c227310 = c22739;
                        i16 = i16;
                        i13 = i;
                    } else {
                        int iM559710 = C0946.m55979("۠ۗ") ^ i11;
                        i14 = iM559710 ^ 1006557957;
                        i16 = i16;
                        i13 = ((iM559710 ^ i12) * 6507) ^ 403823224;
                        c227310 = c22739;
                    }
                    break;
                case -1196742094:
                case 79332779:
                    i15 = i8 + iM55719;
                    iM55879 = C0927.m55878(strM50890);
                    if (C0930.m55885() <= 0) {
                        iM55979 = (i11 - C0873.m55680("ܳۡ")) * 31;
                        i = ((iM55979 ^ i12) * 21965) ^ 511398057;
                        i3 = 684453266;
                    } else {
                        iM55979 = C0946.m55979("ۡۙ") ^ i12;
                        i = ((iM55979 ^ i11) * (-7431)) ^ 1065092550;
                        i3 = 446040077;
                    }
                    i14 = iM55979 ^ i3;
                    i13 = i;
                    break;
                case -1075247439:
                case 1905400491:
                    itM55615 = C0861.m55615(setEntrySet);
                    i5 = 0;
                    i16 = -1;
                    if (C1048.f81963) {
                        iM55681 = C0873.m55680("ۙ֡") ^ i11;
                        i13 = ((iM55681 ^ i12) * 7551) ^ (-1347520584);
                        i4 = -449241647;
                    } else {
                        iM55681 = (i12 - C0873.m55680("᩺ᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i13 = ((iM55681 ^ i11) * (-817)) ^ 1642050008;
                        i4 = -1045553691;
                    }
                    i14 = iM55681 ^ i4;
                    c227310 = c22739;
                    break;
                case -886056865:
                case -759889084:
                    c23141.delete(i7, i15);
                    c23141.m51594(i7, i5, iM55879, strM50890);
                    i9 = c12015.f33489;
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = (i11 - C0873.m55680("ܳۡ")) * 31;
                        i = ((iM55979 ^ i12) * 21965) ^ 511398057;
                        i3 = 684453266;
                    } else {
                        iM55979 = (C0946.m55979("ܺۨ") ^ i12) * 9;
                        i = ((iM55979 ^ i11) * 23703) ^ (-1874875838);
                        i3 = 326272602;
                    }
                    i14 = iM55979 ^ i3;
                    i13 = i;
                    break;
                case -874859368:
                case 1457165209:
                    i16 = i16;
                    if (C1036.f81953 >= 0) {
                        int iM55686 = C0873.m55680("ܶ۟") ^ i11;
                        i = ((iM55686 ^ i12) * 14767) ^ 395400468;
                        i14 = iM55686 ^ (-1738589786);
                        c23141 = null;
                    } else {
                        c23141 = new C23141(interfaceC9768);
                        setEntrySet = mapM18502.entrySet();
                        if (C0927.m55873() <= 0) {
                            iM55680 = C0946.m55979("ۢ᩺") ^ i11;
                            i = ((iM55680 ^ i12) * 5589) ^ (-1851007039);
                            i2 = -48339041;
                        } else {
                            iM55680 = C0873.m55680("ܿۙ") ^ i11;
                            i = ((iM55680 ^ i12) * 24773) ^ (-397264295);
                            i2 = 1390330268;
                        }
                        i14 = iM55680 ^ i2;
                    }
                    c227310 = c22739;
                    i16 = i16;
                    i13 = i;
                    break;
                case -380416866:
                case 728738647:
                    i16 = i16;
                    if (C0930.m55886(itM55615)) {
                        iM55680 = C0873.m55680("᩸ᩳ") ^ i11;
                        i = ((iM55680 ^ i12) * (-9731)) ^ (-185565970);
                        i2 = 384626610;
                    } else {
                        iM55680 = C0946.m55979("ۖۗ") ^ i12;
                        i = ((iM55680 ^ i11) * (-7869)) ^ 187478575;
                        i2 = -429868482;
                    }
                    i14 = iM55680 ^ i2;
                    c227310 = c22739;
                    i16 = i16;
                    i13 = i;
                    break;
                case -69697250:
                case 1115770558:
                    entry = (Map.Entry) C0955.m56035(itM55615);
                    key = entry.getKey();
                    if (C0947.f81895) {
                        iM55979 = (i11 - C0873.m55680("ܳۡ")) * 31;
                        i = ((iM55979 ^ i12) * 21965) ^ 511398057;
                        i3 = 684453266;
                    } else {
                        iM55979 = (C0946.m55979("ۨܿ") ^ i11) * 81;
                        i = ((iM55979 ^ i12) * 12047) ^ 484505290;
                        i3 = -1166356910;
                    }
                    i14 = iM55979 ^ i3;
                    i13 = i;
                    break;
                case 498688105:
                case 1291565470:
                    iM55878 = i9 + iM55719 + C0927.m55878(strM50890);
                    str2 = c12015.f33487;
                    if (C0861.f81831) {
                        iM55979 = (C0946.m55979("ۛۜ") + i11) * (-93);
                        i = ((iM55979 ^ i12) * (-355)) ^ 1338733741;
                        i3 = -1044271343;
                        i14 = iM55979 ^ i3;
                        i13 = i;
                    }
                    i16 = i16;
                    iM55680 = C0946.m55979("ۢ᩺") ^ i11;
                    i = ((iM55680 ^ i12) * 5589) ^ (-1851007039);
                    i2 = -48339041;
                    i14 = iM55680 ^ i2;
                    c227310 = c22739;
                    i16 = i16;
                    i13 = i;
                    break;
                case 1167507643:
                case 1759704166:
                    i7 = c12015.f33489 + iM55719;
                    i8 = c12015.f33488;
                    if (C0854.f81826 == 0) {
                        iM55979 = C0873.m55680("ۙ۠") ^ i11;
                        i = ((iM55979 ^ i12) * (-9377)) ^ 1933832991;
                        i3 = 1436340546;
                        i14 = iM55979 ^ i3;
                        i13 = i;
                    } else {
                        iM55681 = (i12 - C0873.m55680("᩺ᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i13 = ((iM55681 ^ i11) * (-817)) ^ 1642050008;
                        i4 = -1045553691;
                        i14 = iM55681 ^ i4;
                        c227310 = c22739;
                    }
                    break;
                case 1380553664:
                case 1969815448:
                    RunnableC0897.m55784();
                    break;
                default:
                    i16 = i16;
                    mapM18502 = m18502((CharSequence) interfaceC9768);
                    if (C0898.f81858 <= 0) {
                        iM55680 = C0946.m55979("ۢ᩺") ^ i11;
                        i = ((iM55680 ^ i12) * 5589) ^ (-1851007039);
                        i2 = -48339041;
                    } else {
                        iM55680 = C0873.m55680("᩹ۢ") ^ i12;
                        i = ((iM55680 ^ i11) * 7561) ^ (-30587595);
                        i2 = 442532699;
                    }
                    i14 = iM55680 ^ i2;
                    c227310 = c22739;
                    i16 = i16;
                    i13 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12015 m18503(CharSequence charSequence, C20635 c20635) {
        ArrayList arrayListM46639 = null;
        Object objM56563 = null;
        AbstractC10576 abstractC10576 = null;
        int iM24372 = 0;
        int iM55989 = 0;
        int i = 0;
        int i2 = 0;
        AbstractC10576 abstractC10577 = null;
        int iM24371 = 0;
        int iLastIndexOf = 0;
        int i3 = -785162225;
        int i4 = C1028.f81950;
        int i5 = RunnableC0938.f81886;
        int iM55680 = (C0873.m55680("ۜۗ") ^ i4) * 83;
        int i6 = ((iM55680 ^ i5) * 19253) ^ (-1203242387);
        int i7 = 1623898247;
        while (true) {
            i3 = ((((i3 ^ i5) * 9311) >> 31) & i6) ^ (iM55680 ^ i7);
            switch (i3) {
                case -2082702681:
                case 431477432:
                    C0873.m55678();
                    if (C0873.f81841 <= 0) {
                        iM55680 = (i5 - C0873.m55680("۬ۛ")) * 5;
                        i6 = ((iM55680 ^ i4) * 23991) ^ (-426945102);
                        i7 = -2117618438;
                    } else {
                        iM55680 = C0946.m55979("ᩳ᩵") ^ i5;
                        i6 = ((iM55680 ^ i4) * 3315) ^ (-302278717);
                        i7 = 966695270;
                    }
                    break;
                case -1865014540:
                case 1981034887:
                    if (!RunnableC0897.f81856) {
                        iM55680 = C0873.m55680("᩶۟") ^ i4;
                        i6 = ((iM55680 ^ i5) * 18041) ^ (-1540520623);
                        i7 = 1730090953;
                    } else {
                        iM55680 = C0946.m55979("ᩳ᩵") ^ i5;
                        i6 = ((iM55680 ^ i4) * 3315) ^ (-302278717);
                        i7 = 966695270;
                    }
                    break;
                case -1842785503:
                case -261927676:
                    iM24372 = abstractC10576.m24372();
                    if (C1194.m56396() <= 0) {
                        iM55680 = C0946.m55979("ᩳ᩵") ^ i5;
                        i6 = ((iM55680 ^ i4) * 3315) ^ (-302278717);
                        i7 = 966695270;
                    } else {
                        iM55680 = C0946.m55979("᩵᩺") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-6797)) ^ 1066369609;
                        i7 = -1120445240;
                    }
                    break;
                case -1579935025:
                case 1644843475:
                    i2 = iM55989 + i;
                    if (C1194.m56396() <= 0) {
                        iM55680 = (C0946.m55979("ۙܳ") + i4) * (-67);
                        i6 = ((iM55680 ^ i5) * 1977) ^ (-326213218);
                        i7 = -1758199420;
                    } else {
                        iM55680 = (C0946.m55979("᩵ۖ") + i4) * (-95);
                        i6 = ((iM55680 ^ i5) * 29259) ^ (-1251328147);
                        i7 = 280067917;
                    }
                    break;
                case -1522876414:
                case -212287245:
                    iLastIndexOf = TextUtils.lastIndexOf(charSequence, '<', c20635.m24371());
                    if (C0890.f81849 != 0) {
                        iM55680 = C0946.m55979("۫ۜ") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-9033)) ^ 1861160321;
                        i7 = -166742208;
                    } else {
                        iM55680 = C0873.m55680("ܺۜ") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-20751)) ^ 1756163336;
                        i7 = -1141802776;
                    }
                    break;
                case -1468135378:
                case 664282330:
                    C0967.m56074();
                    iM55680 = C0873.m55680("᩶۟") ^ i4;
                    i6 = ((iM55680 ^ i5) * 18041) ^ (-1540520623);
                    i7 = 1730090953;
                    break;
                case -1368896894:
                case -996510997:
                    abstractC10577 = (AbstractC10576) C1929.m56563(arrayListM46639, i2);
                    if (C1194.f82045 != 0) {
                        iM55680 = C0946.m55979("۫ۜ") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-9033)) ^ 1861160321;
                        i7 = -166742208;
                    } else {
                        iM55680 = (i5 - C0873.m55680("ۧ۫")) * (-119);
                        i6 = ((iM55680 ^ i4) * (-20923)) ^ (-1285033526);
                        i7 = 865354471;
                    }
                    break;
                case -430558320:
                case 752340295:
                    iM55989 = C0947.m55989(arrayListM46639);
                    i = -1;
                    if (C1044.m56286() <= 0) {
                        iM55680 = (i5 - C0873.m55680("۬ۛ")) * 5;
                        i6 = ((iM55680 ^ i4) * 23991) ^ (-426945102);
                        i7 = -2117618438;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ۛܰ")) * 33;
                        i6 = ((iM55680 ^ i5) * 849) ^ 552053030;
                        i7 = 602686179;
                    }
                    break;
                case -388256374:
                case 778777439:
                    objM56563 = C1929.m56563(arrayListM46639, 0);
                    if (C0892.m55749()) {
                        iM55680 = (C0873.m55680("ۖۚ") + i4) * 23;
                        i6 = ((iM55680 ^ i5) * 15663) ^ (-1977726627);
                        i7 = -1007539130;
                    } else {
                        iM55680 = C0873.m55680("᩶۟") ^ i4;
                        i6 = ((iM55680 ^ i5) * 18041) ^ (-1540520623);
                        i7 = 1730090953;
                    }
                    break;
                case -211112764:
                case 485340049:
                    iM24371 = abstractC10577.m24371();
                    if (C0927.f81875) {
                        iM55680 = (i5 - C0873.m55680("۬ۛ")) * 5;
                        i6 = ((iM55680 ^ i4) * 23991) ^ (-426945102);
                        i7 = -2117618438;
                    } else {
                        iM55680 = (i5 - C0946.m55979("ۚۢ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM55680 ^ i4) * (-7271)) ^ 107991680;
                        i7 = -1568845405;
                    }
                    break;
                case -156971904:
                case 943744189:
                    if (C1053.f81965 <= 0) {
                        iM55680 = (i5 - C0873.m55680("۬ۛ")) * 5;
                        i6 = ((iM55680 ^ i4) * 23991) ^ (-426945102);
                        i7 = -2117618438;
                    } else {
                        iM55680 = (i5 - C0873.m55680("᩺ۜ")) * (-127);
                        i6 = ((iM55680 ^ i4) * 26177) ^ (-683813909);
                        i7 = -1822073492;
                    }
                    break;
                case -21364543:
                case 1487453277:
                    AbstractC0942.m55971();
                    if (C1053.f81965 <= 0) {
                        iM55680 = C0946.m55979("۫ۜ") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-9033)) ^ 1861160321;
                        i7 = -166742208;
                    } else {
                        iM55680 = C0873.m55680("᩶۟") ^ i4;
                        i6 = ((iM55680 ^ i5) * 18041) ^ (-1540520623);
                        i7 = 1730090953;
                    }
                    break;
                case 29713413:
                case 979467746:
                    C0877.m55696();
                    C0892.m55749();
                    return null;
                case 705839392:
                case 1199213941:
                    return new C12015("", iLastIndexOf, iLastIndexOf);
                case 854295268:
                case 1715777954:
                    arrayListM46639 = c20635.m46639();
                    if (C0877.m55704(arrayListM46639)) {
                        iM55680 = C0873.m55680("۠᩵") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-26897)) ^ (-811394825);
                        i7 = -1008507022;
                    } else {
                        iM55680 = C0873.m55680("ۙᩴ") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-10353)) ^ 2055658777;
                        i7 = 1219663105;
                    }
                    break;
                case 1241221998:
                case 1952564753:
                    if (!C0947.f81895) {
                        return new C12015(C0845.m55591(charSequence.subSequence(iM24372, iM24371)), iM24372, iM24371);
                    }
                    iM55680 = C0946.m55979("ᩳ᩵") ^ i5;
                    i6 = ((iM55680 ^ i4) * 3315) ^ (-302278717);
                    i7 = 966695270;
                    break;
                default:
                    abstractC10576 = (AbstractC10576) objM56563;
                    if (C1053.f81965 <= 0) {
                        iM55680 = C0873.m55680("᩶۟") ^ i4;
                        i6 = ((iM55680 ^ i5) * 18041) ^ (-1540520623);
                        i7 = 1730090953;
                    } else {
                        iM55680 = (i5 - C0946.m55979("۫᩺")) * (-79);
                        i6 = ((iM55680 ^ i4) * (-28205)) ^ 677782223;
                        i7 = 1758537962;
                    }
                    break;
            }
        }
    }
}
