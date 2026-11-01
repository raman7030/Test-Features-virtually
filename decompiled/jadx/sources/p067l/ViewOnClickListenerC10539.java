package p067l;

import android.R;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.AdapterView;
import com.alipay.sdk.p010m.p041p.C0184a;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.TwofishEngine;

/* JADX INFO: renamed from: l.ۡۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5MD */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC10539 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܶܺ᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f82088 = {5508, -23451, -31245, -26665, 2949, -18799, -18799, -18702, -18689, -18799, -18690, -18699, -18705, -18711, -18718, -18694, -18699, -18689, -18711, -18700, -18702, -18689, -18783, -18764, -18702, -18689, -18799, -18709, -18694, -18711, -18690, -18699, -18705, -18778, 9114, 12833, 4878, 12540, 12538, 12527, 12519, 12423, 3028, 7478, 7711, 9038, 9029, 9034, 9033, 9031, 9038, 9076, 9033, 9026, 9029, 9076, 9032, 9028, 9029, 9053, 9038, 9049, 9055, 9038, 9029, 9034, 9033, 9031, 9038, 9076, 9028, 9032, 9055, 9076, 9032, 9028, 9029, 9053, 9038, 9049, 9055, 8968, 9085, 9034, 9031, 9054, 9038, 8993, 8987, 9033, 9076, 8971, 8993, 9060, 9032, 9055, 8993, 9071, 9038, 9032, 8993, 9059, 9038, 9043, 8987, 9043, 9034, 9055, 9055, 9049, 8993, 9065, 9026, 9029, 9065, 9026, 9029, 9059, 9038, 9043, 8993, 8987, 9033, 8993, 8987, 9043, 8987, 8980, 8980, 8980, 9060, 9032, 9055, 9071, 9038, 9032, 8993, 9026, 9039, 8974, 8987, 8979, 9043, 8971, 697, 8971, 8980, 8980, 8980, 8993, 8987, 6086, 29630, -24655, -22313, -16484, 28055, -29381, -16569, 31475, -19569, -17247, -25820, -18918, 30720, -30711, 32354};

    /* JADX INFO: renamed from: ۙ */
    public final C17243 f29172;

    /* JADX INFO: renamed from: ᩶ */
    public final C14281 f29173;

    /* JADX INFO: renamed from: ᩸ */
    public final ViewOnClickListenerC14071 f29174;

    /* JADX INFO: renamed from: ᩹ */
    public final C21939 f29175;

    /* JADX WARN: Code duplicated, block: B:66:0x0267 A[PHI: r4 r7 r8 r18
      0x0267: PHI (r4v4 java.lang.String) = (r4v2 java.lang.String), (r4v3 java.lang.String), (r4v2 java.lang.String) binds: [B:65:0x0265, B:37:0x0124, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0267: PHI (r7v20 l.ۜۖᩳ) = (r7v5 l.ۜۖᩳ), (r7v13 l.ۜۖᩳ), (r7v21 l.ۜۖᩳ) binds: [B:65:0x0265, B:37:0x0124, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0267: PHI (r8v4 char) = (r8v3 char), (r8v2 char), (r8v2 char) binds: [B:65:0x0265, B:37:0x0124, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0267: PHI (r18v16 android.text.Editable) = (r18v3 android.text.Editable), (r18v11 android.text.Editable), (r18v17 android.text.Editable) binds: [B:65:0x0265, B:37:0x0124, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x029a A[PHI: r7 r12 r18 r19
      0x029a: PHI (r7v19 l.ۜۖᩳ) = (r7v4 l.ۜۖᩳ), (r7v8 l.ۜۖᩳ), (r7v22 l.ۜۖᩳ) binds: [B:69:0x0298, B:53:0x01db, B:11:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r12v4 short) = (r12v2 short), (r12v3 short), (r12v2 short) binds: [B:69:0x0298, B:53:0x01db, B:11:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r18v15 android.text.Editable) = (r18v2 android.text.Editable), (r18v6 android.text.Editable), (r18v18 android.text.Editable) binds: [B:69:0x0298, B:53:0x01db, B:11:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:69:0x0298, B:53:0x01db, B:11:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        if (p067l.C0946.f81894 == 0) goto L10;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m24285(ViewOnClickListenerC10539 viewOnClickListenerC10539) {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        int i5 = C0906.f81862;
        int i6 = C0930.f81879;
        int iM55681 = (C0873.m55680("ܽ֫") ^ i6) * (-13);
        int i7 = ((iM55681 ^ i5) * 28639) ^ 1297815354;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM55681 ^ (-1670499919);
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i9 = 0;
        short s3 = 0;
        int i10 = 0;
        int i11 = 179901928;
        Editable editableM56089 = null;
        C8527 c8527 = null;
        String strM55639 = null;
        Editable editableM56288 = null;
        C17243 c17243 = null;
        while (true) {
            i11 = i8 ^ (i7 & (((i11 ^ i5) * 8749) >> 31));
            switch (i11) {
                case -1944156068:
                case 2494223:
                    C1124.m56367();
                    break;
                case -1941935107:
                case -117009665:
                    c8527 = c8527;
                    editableM56089 = editableM56089;
                    if ((s * s3) - i9 <= 0) {
                        iM55979 = (C0946.m55979("ۧܺ") + i6) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55979 ^ i5) * (-31229)) ^ (-575819015);
                        i2 = 157388104;
                    } else {
                        iM55979 = C0873.m55680("ۨۖ") ^ i5;
                        i = ((iM55979 ^ i6) * 19051) ^ 469408824;
                        i2 = 1910686604;
                    }
                    int i12 = iM55979 ^ i2;
                    editableM56089 = editableM56089;
                    i8 = i12;
                    i7 = i;
                    c8527 = c8527;
                    break;
                case -1916687509:
                case 1685358531:
                    C1194.m56396();
                    C0892.m55749();
                    break;
                case -1877482595:
                case 1806200855:
                    c8527 = viewOnClickListenerC10539.f29175.f68971;
                    editableM56089 = C0989.m56089(c17243);
                    if (C0917.f81868) {
                        iM55680 = C0873.m55680("ᩳ᩻") ^ i6;
                        i3 = ((iM55680 ^ i5) * 24609) ^ (-1105905914);
                        i4 = -1566529598;
                    } else {
                        iM55680 = (C0873.m55680("۠ۘ") ^ i6) * 55;
                        i3 = ((iM55680 ^ i5) * 16143) ^ 514172322;
                        i4 = -550510323;
                    }
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    break;
                case -1802385862:
                case 2066652552:
                    C1036.m56257();
                    if (C0866.f81837 < 0) {
                        c8527 = c8527;
                        editableM56089 = editableM56089;
                        iM55979 = (i5 - C0946.m55979("ᩴ᩹")) * (-59);
                        i = ((iM55979 ^ i6) * 18851) ^ 1310469860;
                        i2 = 1323684210;
                        int i13 = iM55979 ^ i2;
                        editableM56089 = editableM56089;
                        i8 = i13;
                        i7 = i;
                        c8527 = c8527;
                    }
                    c8527 = c8527;
                    editableM56089 = editableM56089;
                    iM55979 = (C0873.m55680("ܺ᩷") + i6) * (-67);
                    i = ((iM55979 ^ i5) * (-8269)) ^ (-692468);
                    i2 = -1604761052;
                    int i14 = iM55979 ^ i2;
                    editableM56089 = editableM56089;
                    i8 = i14;
                    i7 = i;
                    c8527 = c8527;
                    break;
                case -1751541733:
                case 112402640:
                    c8527 = c8527;
                    editableM56089 = editableM56089;
                    int i15 = s + s2;
                    i9 = i15 * i15;
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0873.m55680("ۘۙ") ^ i5;
                        i = ((iM55979 ^ i6) * 23353) ^ 421247239;
                        i2 = -693820763;
                    } else {
                        iM55979 = C0873.m55680("֫ᩳ") ^ i6;
                        i = ((iM55979 ^ i5) * 29979) ^ (-1648343143);
                        i2 = 1974355179;
                    }
                    int i16 = iM55979 ^ i2;
                    editableM56089 = editableM56089;
                    i8 = i16;
                    i7 = i;
                    c8527 = c8527;
                    break;
                case -1380758528:
                case 541508038:
                    c8527 = c8527;
                    editableM56089 = editableM56089;
                    s = sArr[c];
                    s2 = 5879;
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0873.m55680("ᩴۤ") ^ i5;
                        i = ((iM55979 ^ i6) * (-9493)) ^ 67654141;
                        i2 = 999967457;
                    } else {
                        iM55979 = (C0873.m55680("ۨ۟") + i5) * 95;
                        i = ((iM55979 ^ i6) * (-27613)) ^ (-1160990989);
                        i2 = -230770354;
                    }
                    int i17 = iM55979 ^ i2;
                    editableM56089 = editableM56089;
                    i8 = i17;
                    i7 = i;
                    c8527 = c8527;
                    break;
                case -1378751607:
                case 1277141562:
                    c8527 = c8527;
                    editableM56089 = editableM56089;
                    sArr2 = f82088;
                    if (C1404.f82149 < 0) {
                        iM55979 = (C0946.m55979("֨ۧ") ^ i6) * (-85);
                        i = ((iM55979 ^ i5) * (-22931)) ^ 1456713427;
                        i2 = -1184070837;
                        int i18 = iM55979 ^ i2;
                        editableM56089 = editableM56089;
                        i8 = i18;
                        i7 = i;
                        c8527 = c8527;
                    } else {
                        c8527 = c8527;
                        editableM56089 = editableM56089;
                        iM55680 = C0873.m55680("ᩳ᩻") ^ i6;
                        i3 = ((iM55680 ^ i5) * 24609) ^ (-1105905914);
                        i4 = -1566529598;
                        i8 = iM55680 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -1315737709:
                case -1013196536:
                    c8527 = c8527;
                    editableM56089 = editableM56089;
                    if (C1028.m56248(strM55639, C0955.m56029(sArr2, 35, 1, i10))) {
                        iM55979 = C0946.m55979("ۢ᩷") ^ i5;
                        i = ((iM55979 ^ i6) * 25899) ^ (-1288437038);
                        i2 = -996136471;
                    } else {
                        iM55979 = C0873.m55680("֡ۧ") ^ i5;
                        i = ((iM55979 ^ i6) * (-10039)) ^ 150851340;
                        i2 = 329841404;
                    }
                    int i19 = iM55979 ^ i2;
                    editableM56089 = editableM56089;
                    i8 = i19;
                    i7 = i;
                    c8527 = c8527;
                    break;
                case -1307014789:
                case 1528033077:
                    c8527 = c8527;
                    editableM56089 = editableM56089;
                    s3 = 23516;
                    if (C1044.m56286() <= 0) {
                        iM55979 = (i5 - C0946.m55979("ᩴ᩹")) * (-59);
                        i = ((iM55979 ^ i6) * 18851) ^ 1310469860;
                        i2 = 1323684210;
                    } else {
                        iM55979 = (i5 - C0946.m55979("ܶܽ")) * (-59);
                        i = ((iM55979 ^ i6) * (-26439)) ^ 1372490352;
                        i2 = 628316169;
                    }
                    int i110 = iM55979 ^ i2;
                    editableM56089 = editableM56089;
                    i8 = i110;
                    i7 = i;
                    c8527 = c8527;
                    break;
                case -1130301007:
                case -878675346:
                    break;
                case -1091835970:
                case 1007561177:
                    c8527 = c8527;
                    editableM56089 = editableM56089;
                    sArr = f82088;
                    if (C0861.f81831) {
                        iM55979 = (i5 - C0946.m55979("ۘۡ")) * (-101);
                        i = ((iM55979 ^ i6) * 689) ^ (-476226139);
                        i2 = 701211477;
                    } else {
                        iM55979 = (i5 - C0946.m55979("ᩴ᩹")) * (-59);
                        i = ((iM55979 ^ i6) * 18851) ^ 1310469860;
                        i2 = 1323684210;
                    }
                    int i111 = iM55979 ^ i2;
                    editableM56089 = editableM56089;
                    i8 = i111;
                    i7 = i;
                    c8527 = c8527;
                    break;
                case -940907465:
                case 1448788786:
                    i10 = 12814;
                    iM55979 = C0946.m55979("ᩴܳ") ^ i6;
                    i = ((iM55979 ^ i5) * (-25639)) ^ 484535622;
                    i2 = 415547273;
                    int i112 = iM55979 ^ i2;
                    editableM56089 = editableM56089;
                    i8 = i112;
                    i7 = i;
                    c8527 = c8527;
                    break;
                case -705882097:
                case 1260193738:
                    c8527.filter(editableM56089, c17243);
                    if (!C0882.f81846) {
                        c8527 = c8527;
                        editableM56089 = editableM56089;
                        ViewOnClickListenerC0939.m55955(new RunnableC15902(0, c17243), 100L);
                        iM55979 = C0873.m55680("֡ۧ") ^ i5;
                        i = ((iM55979 ^ i6) * (-10039)) ^ 150851340;
                        i2 = 329841404;
                        int i113 = iM55979 ^ i2;
                        editableM56089 = editableM56089;
                        i8 = i113;
                        i7 = i;
                        c8527 = c8527;
                    }
                    c8527 = c8527;
                    editableM56089 = editableM56089;
                    iM55979 = (C0873.m55680("ܺ᩷") + i6) * (-67);
                    i = ((iM55979 ^ i5) * (-8269)) ^ (-692468);
                    i2 = -1604761052;
                    int i114 = iM55979 ^ i2;
                    editableM56089 = editableM56089;
                    i8 = i114;
                    i7 = i;
                    c8527 = c8527;
                    break;
                case -668129085:
                case 500283654:
                    c8527 = c8527;
                    editableM56089 = editableM56089;
                    c = '\"';
                    if (C1404.f82149 >= 0) {
                        iM55979 = (C0873.m55680("ܺ᩷") + i6) * (-67);
                        i = ((iM55979 ^ i5) * (-8269)) ^ (-692468);
                        i2 = -1604761052;
                    } else {
                        iM55979 = C0946.m55979("ܰܺ") ^ i6;
                        i = ((iM55979 ^ i5) * (-24595)) ^ (-517398323);
                        i2 = -2096182276;
                    }
                    int i115 = iM55979 ^ i2;
                    editableM56089 = editableM56089;
                    i8 = i115;
                    i7 = i;
                    c8527 = c8527;
                    break;
                case -555046583:
                case 1324898592:
                    i10 = 56167;
                    iM55979 = C0946.m55979("ᩴܳ") ^ i6;
                    i = ((iM55979 ^ i5) * (-25639)) ^ 484535622;
                    i2 = 415547273;
                    int i116 = iM55979 ^ i2;
                    editableM56089 = editableM56089;
                    i8 = i116;
                    i7 = i;
                    c8527 = c8527;
                    break;
                case -503174764:
                case 914023744:
                    c8527 = c8527;
                    editableM56089 = editableM56089;
                    c17243 = viewOnClickListenerC10539.f29172;
                    editableM56288 = C1046.m56288(c17243);
                    if (!C0866.m55645()) {
                        c8527 = c8527;
                        editableM56089 = editableM56089;
                        iM55680 = C0873.m55680("ᩳ᩻") ^ i6;
                        i3 = ((iM55680 ^ i5) * 24609) ^ (-1105905914);
                        i4 = -1566529598;
                        i8 = iM55680 ^ i4;
                        i7 = i3;
                    } else {
                        iM55979 = (i6 - C0873.m55680("۟ۡ")) * 83;
                        i = ((iM55979 ^ i5) * 15101) ^ (-1991560192);
                        i2 = 1718440984;
                        int i117 = iM55979 ^ i2;
                        editableM56089 = editableM56089;
                        i8 = i117;
                        i7 = i;
                        c8527 = c8527;
                    }
                    break;
                case 746568095:
                case 1098001508:
                    c8527 = c8527;
                    editableM56089 = editableM56089;
                    strM55639 = C0863.m55639(editableM56288);
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0873.m55680("ܺ᩷") + i6) * (-67);
                        i = ((iM55979 ^ i5) * (-8269)) ^ (-692468);
                        i2 = -1604761052;
                    } else {
                        iM55979 = C0946.m55979("ۨ۠") ^ i5;
                        i = ((iM55979 ^ i6) * 1329) ^ (-1122987354);
                        i2 = -484980503;
                    }
                    int i118 = iM55979 ^ i2;
                    editableM56089 = editableM56089;
                    i8 = i118;
                    i7 = i;
                    c8527 = c8527;
                    break;
                case 1549067892:
                case 2041401231:
                    C0927.m55873();
                    C0912.m55833();
                    c8527 = c8527;
                    editableM56089 = editableM56089;
                    iM55979 = (C0873.m55680("ܺ᩷") + i6) * (-67);
                    i = ((iM55979 ^ i5) * (-8269)) ^ (-692468);
                    i2 = -1604761052;
                    int i119 = iM55979 ^ i2;
                    editableM56089 = editableM56089;
                    i8 = i119;
                    i7 = i;
                    c8527 = c8527;
                    break;
                default:
                    RunnableC0938.m55938();
                    if (!RunnableC0897.f81856) {
                        c8527 = c8527;
                        editableM56089 = editableM56089;
                        iM55979 = C0873.m55680("ۘۙ") ^ i5;
                        i = ((iM55979 ^ i6) * 23353) ^ 421247239;
                        i2 = -693820763;
                        int i1110 = iM55979 ^ i2;
                        editableM56089 = editableM56089;
                        i8 = i1110;
                        i7 = i;
                        c8527 = c8527;
                    } else {
                        iM55680 = C0873.m55680("ᩳ᩻") ^ i6;
                        i3 = ((iM55680 ^ i5) * 24609) ^ (-1105905914);
                        i4 = -1566529598;
                        i8 = iM55680 ^ i4;
                        i7 = i3;
                    }
                    break;
            }
            return;
        }
    }

    public ViewOnClickListenerC10539(ViewOnClickListenerC14071 viewOnClickListenerC14071, View view, C14281 c14281) {
        short[] sArr;
        int iM55979;
        int i;
        int i2;
        View viewM55755 = null;
        C17243 c17243 = null;
        int i3 = 0;
        int iM559710 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = -242229087;
        int i6 = C1012.f81938;
        int i7 = C0894.f81854;
        short s = f82088[0];
        int i8 = s + 19852;
        int i9 = (s * 79408) - (i8 * i8) > 0 ? 22906 : 55407;
        int iM559711 = C0946.m55979("ۗۡ") ^ i6;
        int i10 = ((iM559711 ^ i7) * 6011) ^ (-871346423);
        int i11 = -1059070423;
        while (true) {
            int i12 = iM559711 ^ i11;
            while (true) {
                i5 = ((((i5 ^ i7) * (-24691)) >> 31) & i10) ^ i12;
                switch (i5) {
                    case -2124953488:
                    case -818573941:
                        c17243 = (C17243) viewM55755;
                        if (C1044.f81959 < 0) {
                            iM559711 = (C0873.m55680("ۖᩴ") + i6) * (-13);
                            i10 = ((iM559711 ^ i7) * 18275) ^ (-27448269);
                            i11 = -1967482319;
                        }
                        sArr = sArr2;
                        iM55979 = C0946.m55979("ۘܶ") ^ i6;
                        i = ((iM55979 ^ i7) * 2767) ^ 387596840;
                        i2 = -259401963;
                        sArr2 = sArr;
                        i12 = iM55979 ^ i2;
                        i10 = i;
                        break;
                    case -1953715741:
                    case 798841027:
                        c17243.addTextChangedListener(new C11210());
                        if (C1003.f81929 > 0) {
                            iM559711 = (C0873.m55680("ۛܶ") + i6) * (-29);
                            i10 = ((iM559711 ^ i7) * 10399) ^ 2119151965;
                            i11 = 1605784588;
                        } else {
                            iM559711 = C0946.m55979("᩸ۤ") ^ i7;
                            i10 = ((iM559711 ^ i6) * 26017) ^ (-1224614499);
                            i11 = 905656239;
                        }
                        break;
                    case -1904881830:
                    case 1167939427:
                        if (C1044.f81959 < 0) {
                            iM559711 = C0946.m55979("᩸ۤ") ^ i7;
                            i10 = ((iM559711 ^ i6) * 26017) ^ (-1224614499);
                            i11 = 905656239;
                            break;
                        }
                        iM559711 = C0873.m55680("ۢܽ") ^ i7;
                        i10 = ((iM559711 ^ i6) * (-29073)) ^ (-1155416423);
                        i11 = -1254931660;
                    case -1895654569:
                    case 538910006:
                        i4 = 1;
                        if (C1025.f81947 < 0) {
                            iM559711 = C0873.m55680("ۖܿ") ^ i6;
                            i10 = ((iM559711 ^ i7) * 7557) ^ 1754020452;
                            i11 = -1948557432;
                        } else {
                            iM559711 = C0873.m55680("ۢܽ") ^ i7;
                            i10 = ((iM559711 ^ i6) * (-29073)) ^ (-1155416423);
                            i11 = -1254931660;
                        }
                        break;
                    case -1481798439:
                    case 944478918:
                        C1044.m56286();
                        throw new RuntimeException();
                    case -1199568470:
                    case 2138617466:
                        C0927.m55873();
                        C0892.m55749();
                        iM559711 = C0873.m55680("ۢܽ") ^ i7;
                        i10 = ((iM559711 ^ i6) * (-29073)) ^ (-1155416423);
                        i11 = -1254931660;
                        break;
                    case -1159677241:
                    case -1077728444:
                        C1048.m56305();
                        if (C0937.m55918() < 0) {
                            iM559711 = C0946.m55979("ۘܺ") ^ i6;
                            i10 = ((iM559711 ^ i7) * (-24893)) ^ 1562435853;
                            i11 = -558317605;
                        } else {
                            iM559711 = C0946.m55979("᩸ۤ") ^ i7;
                            i10 = ((iM559711 ^ i6) * 26017) ^ (-1224614499);
                            i11 = 905656239;
                        }
                        break;
                    case -851578139:
                    case 1053810569:
                        iM559710 = C0946.m55979(C1404.m56462(sArr2, i4, 3, i9));
                        if (!C0927.f81875) {
                            iM559711 = C0873.m55680("۠ۢ") ^ i6;
                            i10 = ((iM559711 ^ i7) * (-7395)) ^ 813786912;
                            i11 = -1682325154;
                        } else {
                            iM559711 = C0873.m55680("ۢܽ") ^ i7;
                            i10 = ((iM559711 ^ i6) * (-29073)) ^ (-1155416423);
                            i11 = -1254931660;
                        }
                        break;
                    case -566065432:
                    case -565674580:
                        C1048.m56304(C0892.m55755(view, i3), this);
                        if (!C0967.m56074()) {
                            iM559711 = (C0873.m55680("ۚܺ") ^ i7) * 41;
                            i10 = ((iM559711 ^ i6) * (-20953)) ^ 2126357999;
                            i11 = 601294802;
                        } else {
                            iM559711 = (C0873.m55680("ᩴܳ") ^ i7) * (-75);
                            i10 = ((iM559711 ^ i6) * 1907) ^ (-1733498927);
                            i11 = 858232714;
                        }
                        break;
                    case 128256963:
                    case 783107700:
                        viewM55755 = C0892.m55755(view, 2128037467 ^ iM559710);
                        if (!C0947.f81895) {
                            iM559711 = C0873.m55680("᩷᩺") ^ i7;
                            i10 = ((iM559711 ^ i6) * 12297) ^ (-2123911095);
                            i11 = 204243962;
                        } else {
                            iM559711 = C0946.m55979("᩸ۤ") ^ i7;
                            i10 = ((iM559711 ^ i6) * 26017) ^ (-1224614499);
                            i11 = 905656239;
                        }
                        break;
                    case 130894840:
                    case 590257221:
                        c17243.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ܿۖᩳ
                            @Override // android.widget.AdapterView.OnItemClickListener
                            public final void onItemClick(AdapterView adapterView, View view2, int i13, long j) {
                                ViewOnClickListenerC10539.m24285(this.f55498);
                            }
                        });
                        return;
                    case 782968193:
                    case 1005262691:
                        i3 = R.id.button1;
                        if (!RunnableC0897.f81856) {
                            iM559711 = (C0873.m55680("ᩴܳ") ^ i7) * (-75);
                            i10 = ((iM559711 ^ i6) * 1907) ^ (-1733498927);
                            i11 = 858232714;
                            break;
                        }
                        iM559711 = (C0946.m55979("ۧܽ") ^ i6) * (-21);
                        i10 = ((iM559711 ^ i7) * (-18705)) ^ 632709289;
                        i11 = -82675358;
                        break;
                    case 1196547587:
                    case 1763602689:
                        this.f29172 = c17243;
                        if (C1024.m56209() < 0) {
                            C21939 c21939 = new C21939(this, viewOnClickListenerC14071);
                            this.f29175 = c21939;
                            c17243.setAdapter(c21939);
                            if (!RunnableC0897.f81856) {
                                iM559711 = C0946.m55979("᩸ۤ") ^ i7;
                                i10 = ((iM559711 ^ i6) * 26017) ^ (-1224614499);
                                i11 = 905656239;
                                break;
                            }
                            iM559711 = C0946.m55979("᩵ۧ") ^ i7;
                            i10 = ((iM559711 ^ i6) * (-17203)) ^ (-1895160427);
                            i11 = -1546642438;
                            break;
                        }
                        iM559711 = (C0873.m55680("ᩴܳ") ^ i7) * (-75);
                        i10 = ((iM559711 ^ i6) * 1907) ^ (-1733498927);
                        i11 = 858232714;
                        break;
                    case 1708395467:
                    case 1976262635:
                        this.f29174 = viewOnClickListenerC14071;
                        this.f29173 = c14281;
                        sArr = f82088;
                        if (C1017.f81942 >= 0) {
                            iM55979 = C0946.m55979("ۘܶ") ^ i6;
                            i = ((iM55979 ^ i7) * 2767) ^ 387596840;
                            i2 = -259401963;
                        } else {
                            iM55979 = C0946.m55979("ۤ᩹") ^ i7;
                            i = ((iM55979 ^ i6) * (-8135)) ^ 1433786069;
                            i2 = -1385699254;
                        }
                        sArr2 = sArr;
                        i12 = iM55979 ^ i2;
                        i10 = i;
                        break;
                    default:
                        C0946.m55980();
                        if (C1024.f81946) {
                            iM559711 = C0873.m55680("ۢܽ") ^ i7;
                            i10 = ((iM559711 ^ i6) * (-29073)) ^ (-1155416423);
                            i11 = -1254931660;
                        }
                        sArr = sArr2;
                        iM55979 = C0946.m55979("ۘܶ") ^ i6;
                        i = ((iM55979 ^ i7) * 2767) ^ 387596840;
                        i2 = -259401963;
                        sArr2 = sArr;
                        i12 = iM55979 ^ i2;
                        i10 = i;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x018c A[PHI: r5 r10 r11 r12 r14 r15
      0x018c: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:47:0x018a, B:24:0x0091, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:47:0x018a, B:24:0x0091, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:47:0x018a, B:24:0x0091, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:47:0x018a, B:24:0x0091, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:47:0x018a, B:24:0x0091, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:47:0x018a, B:24:0x0091, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01ff A[PHI: r9 r21
      0x01ff: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:59:0x01fd, B:51:0x01bc] A[DONT_GENERATE, DONT_INLINE]
      0x01ff: PHI (r21v5 char) = (r21v4 char), (r21v3 char) binds: [B:59:0x01fd, B:51:0x01bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0231 A[PHI: r4 r16
      0x0231: PHI (r4v5 java.lang.Object[]) = 
      (r4v2 java.lang.Object[])
      (r4v3 java.lang.Object[])
      (r4v2 java.lang.Object[])
      (r4v2 java.lang.Object[])
      (r4v2 java.lang.Object[])
     binds: [B:63:0x022f, B:32:0x00d4, B:28:0x00b2, B:16:0x006f, B:89:0x0231] A[DONT_GENERATE, DONT_INLINE]
      0x0231: PHI (r16v5 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:63:0x022f, B:32:0x00d4, B:28:0x00b2, B:16:0x006f, B:89:0x0231] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x025b A[PHI: r7 r8
      0x025b: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:55:0x01dd, B:18:0x0073, B:16:0x006f, B:9:0x0059, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:55:0x01dd, B:18:0x0073, B:16:0x006f, B:9:0x0059, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m24286(ViewOnClickListenerC10539 viewOnClickListenerC10539, int i) {
        int iM55979;
        int i2;
        int i3;
        int i4 = C1017.f81942;
        int i5 = C0866.f81837;
        int iM559710 = (C0946.m55979("ܿۢ") ^ i5) * (-3);
        int i6 = ((iM559710 ^ i4) * 8365) ^ 1783381351;
        Integer numM55836 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM559710 ^ (-2008347371);
        C17243 c17243 = null;
        int i8 = 0;
        short s = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -1321919106;
        char c = 0;
        Object[] objArr = null;
        int i16 = 0;
        while (true) {
            i15 = i7 ^ (i6 & (((i15 ^ i4) * 26133) >> 31));
            switch (i15) {
                case -2055129973:
                case -1306629179:
                    objArr = new Object[i16];
                    if (C1404.m56468()) {
                        iM55979 = C0873.m55680("ۢ֨") ^ i5;
                        i2 = ((iM55979 ^ i4) * 12609) ^ 1353114265;
                        i3 = 205490981;
                    } else {
                        iM55979 = C0946.m55979("᩷ۧ") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-20149)) ^ 440026963;
                        i3 = -1053920454;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -1837231121:
                case 1913469912:
                    C1024.m56209();
                    break;
                case -1753850053:
                case 373605323:
                    if (C1012.f81938 >= 0) {
                        iM55979 = C0946.m55979("ۘ᩻") ^ i4;
                        i2 = ((iM55979 ^ i5) * 4187) ^ 1010812697;
                        i3 = -1548429007;
                    } else {
                        iM55979 = C0873.m55680("᩺۫") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-18131)) ^ 3800787;
                        i3 = -1739002706;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -1501214311:
                case -1250792123:
                    c17243 = viewOnClickListenerC10539.f29172;
                    numM55836 = C0912.m55836(i);
                    i16 = 1;
                    if (RunnableC0871.f81839 < 0) {
                        iM55979 = C0946.m55979("۫ۧ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-12423)) ^ 1689357475;
                        i3 = 1832771738;
                        i7 = iM55979 ^ i3;
                        i6 = i2;
                    } else {
                        int iM55680 = (i5 - C0873.m55680("ۡۢ")) * 95;
                        i6 = ((iM55680 ^ i4) * 19597) ^ 1435352128;
                        i7 = iM55680 ^ 986501233;
                    }
                    break;
                case -1272379135:
                case -776297791:
                    sArr = f82088;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0946.m55979("᩷ۧ") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-20149)) ^ 440026963;
                        i3 = -1053920454;
                    } else {
                        iM55979 = C0946.m55979("ۖۚ") ^ i4;
                        i2 = ((iM55979 ^ i5) * 1557) ^ (-1286629181);
                        i3 = -2090605240;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -1207457731:
                case -573698375:
                    sArr2 = f82088;
                    i14 = 37;
                    i8 = 5;
                    if (AbstractC0942.m55971()) {
                        iM55979 = C0873.m55680("᩺۫") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-18131)) ^ 3800787;
                        i3 = -1739002706;
                    } else {
                        iM55979 = (C0873.m55680("ۜܺ") + i5) * (-7);
                        i2 = ((iM55979 ^ i4) * (-27857)) ^ (-1705536442);
                        i3 = 69845829;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -1002434378:
                case -753138144:
                    objArr[0] = numM55836;
                    if (C1036.f81953 >= 0) {
                        iM55979 = C0946.m55979("᩷ۧ") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-20149)) ^ 440026963;
                        i3 = -1053920454;
                    } else {
                        iM55979 = (i4 - C0873.m55680("᩺᩷")) * (-37);
                        i2 = ((iM55979 ^ i5) * (-26131)) ^ (-1504603544);
                        i3 = 1836426150;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -986006808:
                case 1707468495:
                    i9 = s + s2;
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0873.m55680("ۚᩴ") ^ i4;
                        i2 = ((iM55979 ^ i5) * 7445) ^ 941091839;
                        i3 = 1188019627;
                    } else {
                        iM55979 = (C0873.m55680("᩵ᩳ") ^ i5) * (-37);
                        i2 = ((iM55979 ^ i4) * (-12443)) ^ 1218703866;
                        i3 = -1142037209;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -500473444:
                case 710705191:
                    C0894.m55771(c17243, String.format(C1024.m56203(sArr2, i14, i8, i13), objArr));
                    break;
                case -318633122:
                case 1281034108:
                    s = sArr[c];
                    s2 = 11905;
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0946.m55979("ۘ᩻") ^ i4;
                        i2 = ((iM55979 ^ i5) * 4187) ^ 1010812697;
                        i3 = -1548429007;
                    } else {
                        iM55979 = (C0873.m55680("᩷ۢ") + i5) * (-87);
                        i2 = ((iM55979 ^ i4) * 11915) ^ 200074779;
                        i3 = 1277262001;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -150476113:
                case 831629675:
                    C0989.m56095();
                    if (C0912.f81867 > 0) {
                        iM55979 = C0946.m55979("ۘ᩻") ^ i4;
                        i2 = ((iM55979 ^ i5) * 4187) ^ 1010812697;
                        i3 = -1548429007;
                    } else {
                        iM55979 = C0946.m55979("᩷ۧ") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-20149)) ^ 440026963;
                        i3 = -1053920454;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -78202848:
                case 278152224:
                    C0927.m55873();
                    iM55979 = C0946.m55979("ۘ᩻") ^ i4;
                    i2 = ((iM55979 ^ i5) * 4187) ^ 1010812697;
                    i3 = -1548429007;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case 234675193:
                case 556965676:
                    int i17 = i11 + i12;
                    if (i10 - (i17 + i17) <= 0) {
                        iM55979 = (C0946.m55979("۬ۤ") + i5) * (-67);
                        i2 = ((iM55979 ^ i4) * 22951) ^ 1284583986;
                        i3 = -1097956521;
                    } else {
                        iM55979 = (C0873.m55680("ۘܿ") ^ i4) * 65;
                        i2 = ((iM55979 ^ i5) * 1019) ^ 597366341;
                        i3 = 511055969;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case 294533227:
                case 2075235432:
                    i10 = i9 * i9;
                    i11 = s * s;
                    i12 = 141729025;
                    if (RunnableC0897.f81856) {
                        iM55979 = C0873.m55680("֡᩸") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-15755)) ^ 299190275;
                        i3 = -599449788;
                    } else {
                        iM55979 = C0873.m55680("᩺۫") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-18131)) ^ 3800787;
                        i3 = -1739002706;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case 654837144:
                case 1392684649:
                    i13 = 12511;
                    iM55979 = C0873.m55680("֨ۡ") ^ i4;
                    i2 = ((iM55979 ^ i5) * (-8497)) ^ 673802828;
                    i3 = 2000483306;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case 809136788:
                case 1390031814:
                    c = '$';
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0873.m55680("ۚᩴ") ^ i4;
                        i2 = ((iM55979 ^ i5) * 7445) ^ 941091839;
                        i3 = 1188019627;
                    } else {
                        iM55979 = (C0946.m55979("ۢ۫") ^ i4) * (-31);
                        i2 = ((iM55979 ^ i5) * 18305) ^ 52282754;
                        i3 = 2004731133;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case 1099632471:
                case 1199079708:
                    RunnableC0938.m55938();
                    if (AbstractC0942.f81890 <= 0) {
                        int iM55681 = (i5 - C0873.m55680("ۡۢ")) * 95;
                        i6 = ((iM55681 ^ i4) * 19597) ^ 1435352128;
                        i7 = iM55681 ^ 986501233;
                    } else {
                        iM55979 = C0946.m55979("᩷ۧ") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-20149)) ^ 440026963;
                        i3 = -1053920454;
                        i7 = iM55979 ^ i3;
                        i6 = i2;
                    }
                    break;
                case 1582938636:
                case 1699896723:
                    i13 = 21803;
                    iM55979 = C0873.m55680("֨ۡ") ^ i4;
                    i2 = ((iM55979 ^ i5) * (-8497)) ^ 673802828;
                    i3 = 2000483306;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                default:
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0946.m55979("ۘ᩻") ^ i4;
                        i2 = ((iM55979 ^ i5) * 4187) ^ 1010812697;
                        i3 = -1548429007;
                    } else {
                        iM55979 = (C0873.m55680("ܺ֡") ^ i5) * 115;
                        i2 = ((iM55979 ^ i4) * 17837) ^ (-210283346);
                        i3 = -323809171;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00dc A[PHI: r4 r5 r13 r14
      0x00dc: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v2 java.lang.String) binds: [B:29:0x00da, B:25:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v4 java.lang.String) binds: [B:29:0x00da, B:25:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r13v4 short[]) = (r13v3 short[]), (r13v2 short[]) binds: [B:29:0x00da, B:25:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r14v4 int) = (r14v3 int), (r14v2 int) binds: [B:29:0x00da, B:25:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0219 A[PHI: r3 r19
      0x0219: PHI (r3v4 java.lang.Object) = (r3v2 java.lang.Object), (r3v3 java.lang.Object), (r3v2 java.lang.Object) binds: [B:55:0x0217, B:33:0x0110, B:88:0x0219] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:55:0x0217, B:33:0x0110, B:88:0x0219] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0260 A[PHI: r8 r9
      0x0260: PHI (r8v4 short) = (r8v2 short), (r8v2 short), (r8v3 short), (r8v2 short) binds: [B:63:0x025e, B:59:0x0244, B:51:0x01f9, B:89:0x0260] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r9v4 short) = (r9v2 short), (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:63:0x025e, B:59:0x0244, B:51:0x01f9, B:89:0x0260] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m24287(ViewOnClickListenerC10539 viewOnClickListenerC10539, DialogInterfaceC2564 dialogInterfaceC2564, ArrayList arrayList, int i) {
        int iM55979;
        int i2;
        int i3;
        int i4 = C1017.f81942;
        int i5 = C0894.f81854;
        int iM559710 = (C0946.m55979("֫ۧ") + i4) * (-123);
        int i6 = ((iM559710 ^ i5) * (-20731)) ^ (-565420080);
        String strM56289 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM559710 ^ 1926811003;
        int iM55935 = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -982368052;
        String strMo50216 = null;
        Object obj = null;
        Object objM56115 = null;
        C17243 c17243 = null;
        while (true) {
            i12 = i7 ^ (i6 & (((i12 ^ i5) * 4235) >> 31));
            switch (i12) {
                case -1977361125:
                case -442515605:
                    C0894.m55771(c17243, strM56289);
                    iM55935 = RunnableC0938.m55935(c17243);
                    if (!C0882.f81846) {
                        iM55979 = C0946.m55979("ۤ᩻") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-13427)) ^ (-1281007557);
                        i3 = 2056615732;
                        i7 = iM55979 ^ i3;
                        i6 = i2;
                    } else {
                        int iM559711 = (i4 - C0946.m55979("ᩴ᩵")) * 11;
                        i6 = ((iM559711 ^ i5) * (-17841)) ^ (-1203569320);
                        i7 = iM559711 ^ (-1717381278);
                    }
                    break;
                case -1687293759:
                case 1697615311:
                    C0845.m55584();
                    C1025.m56230();
                    break;
                case -1435066411:
                case -135429558:
                    c17243.setSelection(0, iM55935);
                    C0927.m55877(c17243);
                    c17243.performHapticFeedback(0);
                    break;
                case -1398028179:
                case 777285316:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0946.m55979("ۚᩳ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-25795)) ^ (-922220786);
                        i3 = -1015481885;
                    } else {
                        iM55979 = C0873.m55680("᩻᩵") ^ i5;
                        i2 = ((iM55979 ^ i4) * 9187) ^ 1549203389;
                        i3 = 933685643;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -1293315963:
                case 402378278:
                    strM56289 = C1046.m56289(C1025.m56233(sArr2, i11, 1, i10), strMo50216);
                    if (C0927.f81875) {
                        iM55979 = (i4 - C0873.m55680("ۘۘ")) * 83;
                        i2 = ((iM55979 ^ i5) * 24609) ^ (-1289547742);
                        i3 = 1114102100;
                    } else {
                        iM55979 = C0946.m55979("֡۬") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-30675)) ^ 309344984;
                        i3 = 123432217;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -1159879752:
                case 694967374:
                    sArr = f82088;
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0946.m55979("֡᩶") ^ i4;
                        i2 = ((iM55979 ^ i5) * 31533) ^ 1672416883;
                        i3 = -1450296497;
                    } else {
                        iM55979 = C0873.m55680("ۜۗ") ^ i5;
                        i2 = ((iM55979 ^ i4) * 323) ^ 59970025;
                        i3 = -1345050426;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -1127210070:
                case -497311233:
                    C0845.m55584();
                    if (C1046.m56302() != 0) {
                        iM55979 = (C0946.m55979("ۙ᩹") ^ i5) * (-7);
                        i2 = ((iM55979 ^ i4) * (-4663)) ^ 1168002915;
                        i3 = 1143518189;
                        i7 = iM55979 ^ i3;
                        i6 = i2;
                    } else {
                        int iM559712 = (i4 - C0946.m55979("ᩴ᩵")) * 11;
                        i6 = ((iM559712 ^ i5) * (-17841)) ^ (-1203569320);
                        i7 = iM559712 ^ (-1717381278);
                    }
                    break;
                case -766812788:
                case 758612899:
                    C1024.m56208(dialogInterfaceC2564);
                    c17243 = viewOnClickListenerC10539.f29172;
                    objM56115 = C0992.m56115(arrayList, i);
                    if (C0946.m55980() == 0) {
                        iM55979 = C0873.m55680("ܳۤ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-24367)) ^ (-1592270822);
                        i3 = 1637372224;
                        i7 = iM55979 ^ i3;
                        i6 = i2;
                    } else {
                        int iM559713 = (i4 - C0946.m55979("ᩴ᩵")) * 11;
                        i6 = ((iM559713 ^ i5) * (-17841)) ^ (-1203569320);
                        i7 = iM559713 ^ (-1717381278);
                    }
                    break;
                case -414802426:
                case -317115243:
                    strMo50216 = ((InterfaceC22528) obj).mo50216();
                    sArr2 = f82088;
                    i11 = 43;
                    if (C1404.f82149 >= 0) {
                        iM55979 = (i4 - C0873.m55680("ۘۘ")) * 83;
                        i2 = ((iM55979 ^ i5) * 24609) ^ (-1289547742);
                        i3 = 1114102100;
                    } else {
                        iM55979 = C0873.m55680("֨ᩳ") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-15963)) ^ (-1082498261);
                        i3 = -968750169;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -377501738:
                case 1092329157:
                    i10 = 7542;
                    iM55979 = (C0873.m55680("᩹ۘ") + i5) * (-115);
                    i2 = ((iM55979 ^ i4) * 20525) ^ 395045877;
                    i3 = 1553355883;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -367568158:
                case 10845659:
                    if (i8 - (i9 + 1) < 0) {
                        iM55979 = C0873.m55680("֨ۜ") ^ i4;
                        i2 = ((iM55979 ^ i5) * 24741) ^ (-1044521623);
                        i3 = 94957441;
                    } else {
                        iM55979 = C0946.m55979("ۤۤ") ^ i5;
                        i2 = ((iM55979 ^ i4) * 31037) ^ 273525700;
                        i3 = 1678188095;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -365672794:
                case 1231525381:
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0946.m55979("ۚᩳ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-25795)) ^ (-922220786);
                        i3 = -1015481885;
                    } else {
                        iM55979 = (C0946.m55979("۬ۨ") ^ i4) * 83;
                        i2 = ((iM55979 ^ i5) * 16247) ^ 241946516;
                        i3 = -781534650;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -320818632:
                case 1297536496:
                    obj = ((C1349) objM56115).f33658;
                    if (C0927.f81875) {
                        iM55979 = C0946.m55979("֡᩶") ^ i4;
                        i2 = ((iM55979 ^ i5) * 31533) ^ 1672416883;
                        i3 = -1450296497;
                    } else {
                        iM55979 = (C0873.m55680("ۡ۠") + i4) * 47;
                        i2 = ((iM55979 ^ i5) * 26563) ^ 2000389529;
                        i3 = 1815650258;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -184389588:
                case 1704541580:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0946.m55979("֡᩶") ^ i4;
                        i2 = ((iM55979 ^ i5) * 31533) ^ 1672416883;
                        i3 = -1450296497;
                        i7 = iM55979 ^ i3;
                        i6 = i2;
                    } else {
                        int iM559714 = (i4 - C0946.m55979("ᩴ᩵")) * 11;
                        i6 = ((iM559714 ^ i5) * (-17841)) ^ (-1203569320);
                        i7 = iM559714 ^ (-1717381278);
                    }
                    break;
                case 514240975:
                case 1308627539:
                    C0947.m55997();
                    C0854.m55595();
                    int iM559715 = (i4 - C0946.m55979("ᩴ᩵")) * 11;
                    i6 = ((iM559715 ^ i5) * (-17841)) ^ (-1203569320);
                    i7 = iM559715 ^ (-1717381278);
                    break;
                case 581760724:
                case 699630133:
                    s = sArr[42];
                    s2 = 1;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0946.m55979("ۚᩳ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-25795)) ^ (-922220786);
                        i3 = -1015481885;
                    } else {
                        iM55979 = (C0946.m55979("᩹ۤ") ^ i4) * 87;
                        i2 = ((iM55979 ^ i5) * (-6401)) ^ 524097404;
                        i3 = 127744634;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case 847242643:
                case 1104529645:
                    int i13 = s + s2;
                    i8 = i13 * i13;
                    i9 = s * 2;
                    if (C1024.m56209() >= 0) {
                        iM55979 = (C0946.m55979("ۙ᩹") ^ i5) * (-7);
                        i2 = ((iM55979 ^ i4) * (-4663)) ^ 1168002915;
                        i3 = 1143518189;
                    } else {
                        iM55979 = C0873.m55680("֫᩻") ^ i4;
                        i2 = ((iM55979 ^ i5) * 11943) ^ (-1178497956);
                        i3 = 1001299096;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case 2016935920:
                case 2108167453:
                    ViewOnClickListenerC0939.m55941();
                    if (C1964.f83032 > 0) {
                        iM55979 = C0946.m55979("ۚᩳ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-25795)) ^ (-922220786);
                        i3 = -1015481885;
                        i7 = iM55979 ^ i3;
                        i6 = i2;
                    } else {
                        int iM559716 = (i4 - C0946.m55979("ᩴ᩵")) * 11;
                        i6 = ((iM559716 ^ i5) * (-17841)) ^ (-1203569320);
                        i7 = iM559716 ^ (-1717381278);
                    }
                    break;
                default:
                    i10 = 57781;
                    iM55979 = (C0873.m55680("᩹ۘ") + i5) * (-115);
                    i2 = ((iM55979 ^ i4) * 20525) ^ 395045877;
                    i3 = 1553355883;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 21881. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫ */
    public final void m24294() {
        /*
            Method dump skipped, instruction units count: 2188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.ViewOnClickListenerC10539.m24294():void");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:49:0x0122  */
    /* JADX WARN: Code duplicated, block: B:54:0x0163  */
    /* JADX INFO: renamed from: ֫ */
    public static void m24283(SpannableStringBuilder spannableStringBuilder, String str) {
        int iM55680;
        int i;
        int iM55762 = 0;
        int iM55763 = 0;
        int i2 = 809150045;
        int i3 = C1964.f83032;
        int i4 = ServiceConnectionC1013.f81940;
        int iM55681 = C0873.m55680("֡ۢ") ^ i3;
        int i5 = ((iM55681 ^ i4) * 32607) ^ 781228;
        int i6 = 194482409;
        while (true) {
            int i7 = iM55681 ^ i6;
            StyleSpan styleSpan = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-31559)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1994935138:
                    case 72084479:
                        C0967.m56074();
                        if (C1025.f81947 >= 0) {
                            iM55680 = (i3 - C0946.m55979("ۙᩴ")) * 123;
                            i5 = ((iM55680 ^ i4) * 32069) ^ 2049960134;
                            i = -1509118633;
                        } else {
                            iM55680 = C0873.m55680("ۡ۟") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-28983)) ^ 236319445;
                            i = 2092470274;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1957310278:
                    case -418520320:
                        if (C0917.m55854()) {
                            iM55680 = (C0873.m55680("᩹ܳ") + i4) * 35;
                            i5 = ((iM55680 ^ i3) * 1979) ^ (-1285137940);
                            i = -1668046260;
                        } else {
                            iM55680 = (C0873.m55680("ۘۧ") + i4) * 87;
                            i5 = ((iM55680 ^ i3) * (-9555)) ^ 957266659;
                            i = 26832823;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1803984373:
                    case -1283043964:
                        if (C0877.m55696()) {
                            iM55680 = (i3 - C0946.m55979("ۙᩴ")) * 123;
                            i5 = ((iM55680 ^ i4) * 32069) ^ 2049960134;
                            i = -1509118633;
                        } else {
                            iM55680 = C0873.m55680("۫ۨ") ^ i3;
                            i5 = ((iM55680 ^ i4) * 18313) ^ (-481673415);
                            i = -1556690211;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1764421277:
                    case -1319698332:
                        if (C0949.f81897 >= 0) {
                            iM55680 = (i3 - C0946.m55979("ۙᩴ")) * 123;
                            i5 = ((iM55680 ^ i4) * 32069) ^ 2049960134;
                            i = -1509118633;
                        } else {
                            iM55680 = (C0873.m55680("ۘۧ") + i4) * 87;
                            i5 = ((iM55680 ^ i3) * (-9555)) ^ 957266659;
                            i = 26832823;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1627436492:
                    case 794019204:
                        if (C0947.f81895) {
                            iM55680 = (C0873.m55680("ۘۧ") + i4) * 87;
                            i5 = ((iM55680 ^ i3) * (-9555)) ^ 957266659;
                            i = 26832823;
                        } else {
                            iM55680 = C0946.m55979("ۢۢ") ^ i3;
                            i5 = ((iM55680 ^ i4) * 12155) ^ 1830978779;
                            i = -756139613;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1547196151:
                    case 1047798635:
                        if (C0854.m55595() < 0) {
                            iM55680 = (i3 - C0873.m55680("ۜ᩵")) * (-13);
                            i5 = ((iM55680 ^ i4) * (-4105)) ^ (-1382686881);
                            i = -2009983955;
                            i7 = iM55680 ^ i;
                        }
                        break;
                    case -958996466:
                    case -877207917:
                        if (C1964.f83032 <= 0) {
                            iM55680 = C0873.m55680("ۡ۟") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-28983)) ^ 236319445;
                            i = 2092470274;
                        } else {
                            iM55680 = (C0873.m55680("ۡ۠") ^ i4) * (-51);
                            i5 = ((iM55680 ^ i3) * 30417) ^ (-864539521);
                            i = 245516637;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -595394115:
                    case -27694879:
                        iM55763 = C0894.m55762(spannableStringBuilder);
                        if (C0898.f81858 > 0) {
                            iM55680 = (i4 - C0946.m55979("ۜܰ")) * (-47);
                            i5 = ((iM55680 ^ i3) * (-24515)) ^ 2136489516;
                            i = 1266300912;
                            i7 = iM55680 ^ i;
                        }
                        break;
                    case -87810222:
                    case 1602976369:
                        iM55762 = C0894.m55762(spannableStringBuilder);
                        if (!C0861.f81831) {
                        }
                        iM55680 = C0873.m55680("۬ۤ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 6115) ^ 2103233614;
                        i = -911508989;
                        i7 = iM55680 ^ i;
                        break;
                        break;
                    case 204971850:
                    case 1833322762:
                        if (C0890.f81849 != 0) {
                            iM55680 = (i3 - C0946.m55979("ۙᩴ")) * 123;
                            i5 = ((iM55680 ^ i4) * 32069) ^ 2049960134;
                            i = -1509118633;
                        } else {
                            iM55680 = C0946.m55979("ۡۨ") ^ i4;
                            i5 = ((iM55680 ^ i3) * 13219) ^ (-1929923540);
                            i = 1913152355;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case 354167076:
                    case 626807307:
                        C1036.m56254(spannableStringBuilder, str);
                        if (C1194.f82045 == 0) {
                            styleSpan = new StyleSpan(1);
                            if (C1012.f81938 < 0) {
                                iM55680 = C0873.m55680("ۛۤ") ^ i3;
                                i5 = ((iM55680 ^ i4) * (-20547)) ^ (-1070510130);
                                i = -379528137;
                                i7 = iM55680 ^ i;
                            }
                        }
                        break;
                    case 887239583:
                    case 1230719743:
                        C1053.m56327();
                        iM55680 = (i3 - C0946.m55979("ۙᩴ")) * 123;
                        i5 = ((iM55680 ^ i4) * 32069) ^ 2049960134;
                        i = -1509118633;
                        i7 = iM55680 ^ i;
                        break;
                    case 903379884:
                    case 940009987:
                        C0946.m55983(spannableStringBuilder, styleSpan, iM55762, iM55763, 33);
                        break;
                    case 1168979567:
                    case 1772502977:
                        ServiceConnectionC1013.m56157();
                        RunnableC1014.m56177();
                        break;
                    default:
                        if (AbstractC0942.f81890 <= 0) {
                            iM55680 = C0873.m55680("ۡ۟") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-28983)) ^ 236319445;
                            i = 2092470274;
                        } else {
                            iM55680 = C0946.m55979("᩵ܽ") ^ i3;
                            i5 = ((iM55680 ^ i4) * 32501) ^ 434058359;
                            i = 1487303809;
                        }
                        i7 = iM55680 ^ i;
                        break;
                }
                return;
            }
            iM55681 = (i4 - C0873.m55680("۫۫")) * (-103);
            i5 = ((iM55681 ^ i3) * 12963) ^ 2022771638;
            i6 = 454237204;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24295(String str) {
        C17243 c17243 = null;
        int i = 0;
        boolean z = false;
        int i2 = 1193394028;
        int i3 = C0906.f81862;
        int i4 = RunnableC0938.f81886;
        int iM55979 = (C0946.m55979("ᩴ᩵") + i4) * (-11);
        int i5 = ((iM55979 ^ i3) * 22369) ^ (-667078159);
        int i6 = -413100867;
        while (true) {
            i2 = ((((i2 ^ i3) * (-979)) >> 31) & i5) ^ (iM55979 ^ i6);
            switch (i2) {
                case -2108830820:
                case -1443613554:
                    if (!C0861.f81831) {
                        iM55979 = C0946.m55979("ۨۛ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 4533) ^ (-866897898);
                        i6 = 1892052371;
                    } else {
                        iM55979 = C0873.m55680("᩸۬") ^ i4;
                        i5 = ((iM55979 ^ i3) * 6253) ^ 506771304;
                        i6 = 1591013772;
                    }
                    break;
                case -2104349153:
                case -990934918:
                    C1028.m56247();
                    C0890.m55740();
                    break;
                case -1957964972:
                case -1819458148:
                    if (C0882.f81846) {
                        iM55979 = C0946.m55979("ۨۛ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 4533) ^ (-866897898);
                        i6 = 1892052371;
                    } else {
                        iM55979 = (C0873.m55680("ۙᩴ") ^ i4) * 115;
                        i5 = ((iM55979 ^ i3) * (-8487)) ^ 146197454;
                        i6 = 1868859179;
                    }
                    break;
                case -1068888050:
                case -429145336:
                    if (C0898.m55800() <= 0) {
                        iM55979 = C0873.m55680("۟۠") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-30083)) ^ 147211568;
                        i6 = 1409447774;
                    } else {
                        iM55979 = (i4 - C0873.m55680("᩺ܿ")) * (-67);
                        i5 = ((iM55979 ^ i3) * (-10425)) ^ 307909776;
                        i6 = -633255233;
                    }
                    break;
                case -818670126:
                case 1101443435:
                    if (!C0892.m55749()) {
                        iM55979 = C0873.m55680("۟۠") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-30083)) ^ 147211568;
                        i6 = 1409447774;
                    } else {
                        iM55979 = (i4 - C0946.m55979("۟ܿ")) * (-83);
                        i5 = ((iM55979 ^ i3) * (-24009)) ^ 843816330;
                        i6 = 838082621;
                    }
                    break;
                case -769031359:
                case 806045657:
                    c17243.setSelection(i, C0894.m55770(c17243));
                    break;
                case -725325912:
                case 141821934:
                    if (C0906.m55809() <= 0) {
                        iM55979 = C0873.m55680("᩸۬") ^ i4;
                        i5 = ((iM55979 ^ i3) * 6253) ^ 506771304;
                        i6 = 1591013772;
                    } else {
                        iM55979 = C0946.m55979("ۚ۬") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-32499)) ^ 618601925;
                        i6 = -398954560;
                    }
                    break;
                case -644447001:
                case 1550949658:
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0946.m55979("ۨۛ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 4533) ^ (-866897898);
                        i6 = 1892052371;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۜ᩶")) * 109;
                        i5 = ((iM55979 ^ i4) * (-8371)) ^ 1142134588;
                        i6 = 1999193711;
                    }
                    break;
                case -609905177:
                case 1166010239:
                    RunnableC0938.m55928(c17243, str);
                    z = true;
                    if (C0955.f81898) {
                        iM55979 = (i4 - C0946.m55979("۟ܿ")) * (-83);
                        i5 = ((iM55979 ^ i3) * (-24009)) ^ 843816330;
                        i6 = 838082621;
                    } else {
                        iM55979 = C0946.m55979("֡ܿ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-7049)) ^ (-103091217);
                        i6 = 1688515946;
                    }
                    break;
                case -540145845:
                case 807829831:
                    C0927.m55873();
                    C1964.m56597();
                    iM55979 = (i4 - C0946.m55979("۟ܿ")) * (-83);
                    i5 = ((iM55979 ^ i3) * (-24009)) ^ 843816330;
                    i6 = 838082621;
                    break;
                case -412137276:
                case -83223916:
                    C0947.m55997();
                    if (!C0890.m55740()) {
                        iM55979 = (i4 - C0946.m55979("۟ܿ")) * (-83);
                        i5 = ((iM55979 ^ i3) * (-24009)) ^ 843816330;
                        i6 = 838082621;
                    } else {
                        iM55979 = C0946.m55979("ۨۛ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 4533) ^ (-866897898);
                        i6 = 1892052371;
                    }
                    break;
                case -244939694:
                case 1517411205:
                    if (C0912.f81867 <= 0) {
                        iM55979 = C0873.m55680("۟۠") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-30083)) ^ 147211568;
                        i6 = 1409447774;
                    } else {
                        iM55979 = (C0946.m55979("᩸۟") ^ i4) * (-61);
                        i5 = ((iM55979 ^ i3) * 26759) ^ (-1719302122);
                        i6 = 782092083;
                    }
                    break;
                case -179838978:
                case 2145621208:
                    c17243.m39016(z);
                    if (C0955.f81898) {
                        iM55979 = C0946.m55979("ۨۛ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 4533) ^ (-866897898);
                        i6 = 1892052371;
                    } else {
                        iM55979 = (C0873.m55680("ܿۤ") + i3) * 109;
                        i5 = ((iM55979 ^ i4) * (-24205)) ^ 847211382;
                        i6 = -1223465943;
                    }
                    break;
                case 334782100:
                case 652289110:
                    if (C0877.m55696()) {
                        iM55979 = C0873.m55680("ܿ۬") ^ i3;
                        i5 = ((iM55979 ^ i4) * 25191) ^ 1704027292;
                        i6 = 1015354426;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ۢܶ")) * 75;
                        i5 = ((iM55979 ^ i3) * 14935) ^ 1516706733;
                        i6 = 1070336622;
                    }
                    break;
                case 661651019:
                case 1194328761:
                    c17243 = this.f29172;
                    if (C0873.f81841 <= 0) {
                        iM55979 = (i4 - C0946.m55979("۟ܿ")) * (-83);
                        i5 = ((iM55979 ^ i3) * (-24009)) ^ 843816330;
                        i6 = 838082621;
                    } else {
                        iM55979 = (i4 - C0873.m55680("᩻ۛ")) * (-85);
                        i5 = ((iM55979 ^ i3) * (-8791)) ^ 1987644652;
                        i6 = 1614796805;
                    }
                    break;
                default:
                    i = 0;
                    c17243.m39016(false);
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = (i4 - C0873.m55680("ۢܶ")) * 75;
                        i5 = ((iM55979 ^ i3) * 14935) ^ 1516706733;
                        i6 = 1070336622;
                    } else {
                        iM55979 = C0946.m55979("ܶܿ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 21209) ^ 1465942544;
                        i6 = 1957545221;
                    }
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 107901. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r70) {
        /*
            Method dump skipped, instruction units count: 10790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.ViewOnClickListenerC10539.onClick(android.view.View):void");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:41:0x0102 A[PHI: r2
      0x0102: PHI (r2v4 int) = (r2v2 int), (r2v3 int), (r2v2 int) binds: [B:40:0x0100, B:21:0x005b, B:13:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x014c A[PHI: r0
      0x014c: PHI (r0v4 int) = (r0v2 int), (r0v3 int), (r0v2 int), (r0v2 int), (r0v2 int), (r0v2 int) binds: [B:48:0x014a, B:32:0x00b8, B:15:0x0040, B:13:0x003c, B:10:0x0033, B:7:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0195  */
    /* JADX INFO: renamed from: ᩳ */
    public static void m24293(SpannableStringBuilder spannableStringBuilder, String str) {
        int iM55680;
        int i;
        int iM55933 = 0;
        int iM55762 = 0;
        int i2 = -822544764;
        int i3 = C1012.f81938;
        int i4 = RunnableC0871.f81839;
        int iM55979 = C0946.m55979("ܳܰ") ^ i3;
        int i5 = ((iM55979 ^ i4) * 743) ^ 496168876;
        int i6 = 978823719;
        while (true) {
            int i7 = iM55979 ^ i6;
            RelativeSizeSpan relativeSizeSpan = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-17599)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2014396101:
                    case 2128186383:
                        if (C1044.f81959 >= 0) {
                            iM55680 = (C0946.m55979("ܶ۠") + i3) * 93;
                            i5 = ((iM55680 ^ i4) * 24125) ^ (-733207775);
                            i = 1147339126;
                        } else {
                            iM55680 = (i3 - C0873.m55680("᩵ۗ")) * 53;
                            i5 = ((iM55680 ^ i4) * 26023) ^ (-1725164916);
                            i = 1116677318;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1968836396:
                    case 53515212:
                        C0854.m55604(spannableStringBuilder, str);
                        if (!C0861.f81831) {
                        }
                        relativeSizeSpan = new RelativeSizeSpan(0.8f);
                        if (C1003.f81929 > 0) {
                            iM55680 = C0946.m55979("ᩴ᩸") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-5939)) ^ 361811452;
                            i = 143865832;
                            i7 = iM55680 ^ i;
                        }
                        break;
                        break;
                        break;
                    case -1931750532:
                    case 1599309324:
                        C1044.m56286();
                        RunnableC0897.m55784();
                        break;
                    case -1891428526:
                    case -121962936:
                        if (C0946.f81894 != 0) {
                            iM55680 = C0873.m55680("ۤ᩻") ^ i4;
                            i5 = ((iM55680 ^ i3) * 9925) ^ (-2052290095);
                            i = 2030984332;
                        } else {
                            iM55680 = C0873.m55680("ۢ۠") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-15463)) ^ (-1857174026);
                            i = 923122708;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1855224125:
                    case 1195136856:
                        iM55762 = C0894.m55762(spannableStringBuilder);
                        if (C0955.f81898) {
                            iM55680 = (i3 - C0873.m55680("ᩳۘ")) * (-31);
                            i5 = ((iM55680 ^ i4) * (-9569)) ^ 815182686;
                            i = 457223377;
                        } else {
                            iM55680 = (i4 - C0873.m55680("ۤ۬")) * (-21);
                            i5 = ((iM55680 ^ i3) * (-4023)) ^ 915040782;
                            i = -402506930;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1668486603:
                    case 121987443:
                        if (C0882.m55710() != 0) {
                            iM55680 = (i3 - C0873.m55680("ᩳۘ")) * (-31);
                            i5 = ((iM55680 ^ i4) * (-9569)) ^ 815182686;
                            i = 457223377;
                        } else {
                            iM55680 = C0946.m55979("᩻۟") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-23059)) ^ 1474820485;
                            i = 1826053925;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1614448206:
                    case 239434603:
                        iM55933 = RunnableC0938.m55933(spannableStringBuilder);
                        if (C0989.f81920 >= 0) {
                            iM55680 = (C0946.m55979("ܶ۠") + i3) * 93;
                            i5 = ((iM55680 ^ i4) * 24125) ^ (-733207775);
                            i = 1147339126;
                        } else {
                            iM55680 = C0873.m55680("ۤ᩺") ^ i3;
                            i5 = ((iM55680 ^ i4) * 11035) ^ 2045191507;
                            i = -1239140110;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1359044731:
                    case -186102814:
                        if (C0930.m55885() <= 0) {
                            iM55680 = C0873.m55680("ۤ᩻") ^ i4;
                            i5 = ((iM55680 ^ i3) * 9925) ^ (-2052290095);
                            i = 2030984332;
                        } else {
                            iM55680 = C0946.m55979("֡ܽ") ^ i3;
                            i5 = ((iM55680 ^ i4) * 20143) ^ 2006682721;
                            i = 855257007;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1234950525:
                    case 2143923136:
                        C0873.m55690(spannableStringBuilder, relativeSizeSpan, iM55933, iM55762, 33);
                        break;
                    case -981738408:
                    case 162379986:
                        C0989.m56095();
                        C1194.m56396();
                        iM55680 = (C0946.m55979("ܶ۠") + i3) * 93;
                        i5 = ((iM55680 ^ i4) * 24125) ^ (-733207775);
                        i = 1147339126;
                        i7 = iM55680 ^ i;
                        break;
                    case -658849076:
                    case -181429426:
                        if (C0927.f81875) {
                            iM55680 = C0873.m55680("ۧۨ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-47)) ^ (-1479027083);
                            i = -547542703;
                        } else {
                            iM55680 = C0946.m55979("ۚ۬") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-10671)) ^ 2102297276;
                            i = -1152255215;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -520793292:
                    case 2145429557:
                        RunnableC0897.m55784();
                        if (C1229.f82066 >= 0) {
                            iM55680 = (C0946.m55979("ܶ۠") + i3) * 93;
                            i5 = ((iM55680 ^ i4) * 24125) ^ (-733207775);
                            i = 1147339126;
                        } else {
                            iM55680 = (i3 - C0873.m55680("ᩳۘ")) * (-31);
                            i5 = ((iM55680 ^ i4) * (-9569)) ^ 815182686;
                            i = 457223377;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case 561592620:
                    case 1185286687:
                        C0894.m55769();
                        if (C0949.f81897 < 0) {
                            iM55680 = (C0946.m55979("ܶ۠") + i3) * 93;
                            i5 = ((iM55680 ^ i4) * 24125) ^ (-733207775);
                            i = 1147339126;
                        } else {
                            iM55680 = C0873.m55680("ۤ᩻") ^ i4;
                            i5 = ((iM55680 ^ i3) * 9925) ^ (-2052290095);
                            i = 2030984332;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case 1040483096:
                    case 1476843299:
                        if (C1053.m56327() >= 0) {
                            iM55680 = C0873.m55680("ۤ᩻") ^ i4;
                            i5 = ((iM55680 ^ i3) * 9925) ^ (-2052290095);
                            i = 2030984332;
                        } else {
                            iM55680 = C0873.m55680("᩷᩸") ^ i4;
                            i5 = ((iM55680 ^ i3) * 28363) ^ (-144950876);
                            i = 91511675;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    default:
                        if (C0927.f81875) {
                            iM55680 = (C0946.m55979("ܶ۠") + i3) * 93;
                            i5 = ((iM55680 ^ i4) * 24125) ^ (-733207775);
                            i = 1147339126;
                        } else {
                            iM55680 = C0873.m55680("ۧۨ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-47)) ^ (-1479027083);
                            i = -547542703;
                        }
                        i7 = iM55680 ^ i;
                        break;
                }
                return;
            }
            iM55979 = C0946.m55979("ۛ۠") ^ i3;
            i5 = ((iM55979 ^ i4) * 15949) ^ (-789242609);
            i6 = 1831888718;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m24292(SpannableStringBuilder spannableStringBuilder, String str) {
        int iM55762 = 0;
        UnderlineSpan underlineSpan = null;
        int iM55763 = 0;
        int i = 0;
        int i2 = 1843894545;
        int i3 = C1036.f81953;
        int i4 = C1012.f81938;
        int iM55680 = (C0873.m55680("ۤ᩺") ^ i3) * (-95);
        int i5 = ((iM55680 ^ i4) * (-11687)) ^ (-2112778838);
        int i6 = 446373954;
        while (true) {
            i2 = ((((i2 ^ i4) * (-19007)) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -1910545644:
                case -1659533898:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0873.m55680("֫۟") ^ i4;
                        i5 = ((iM55680 ^ i3) * 8413) ^ 868064150;
                        i6 = 1693018391;
                    } else {
                        iM55680 = (C0873.m55680("᩶ܺ") ^ i4) * 123;
                        i5 = ((iM55680 ^ i3) * (-30141)) ^ (-1808183910);
                        i6 = 1047592133;
                    }
                    break;
                case -1809846312:
                case -771914581:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = C0946.m55979("ۨۘ") ^ i4;
                        i5 = ((iM55680 ^ i3) * TwofishEngine.GF256_FDBK) ^ 1642810385;
                        i6 = 1470158907;
                    } else {
                        iM55680 = C0946.m55979("᩶ܽ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 30551) ^ (-947756411);
                        i6 = -1073410339;
                    }
                    break;
                case -1712474026:
                case -1385868112:
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0873.m55680("֫۟") ^ i4;
                        i5 = ((iM55680 ^ i3) * 8413) ^ 868064150;
                        i6 = 1693018391;
                    } else {
                        iM55680 = C0946.m55979("ۢۡ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 17207) ^ 360193340;
                        i6 = 1331088510;
                    }
                    break;
                case -1447741868:
                case 1704605190:
                    C0861.m55626();
                    iM55680 = C0946.m55979("ۨۘ") ^ i4;
                    i5 = ((iM55680 ^ i3) * TwofishEngine.GF256_FDBK) ^ 1642810385;
                    i6 = 1470158907;
                    break;
                case -1127654827:
                case -971183596:
                    underlineSpan = new UnderlineSpan();
                    if (C1194.f82045 != 0) {
                        iM55680 = (i4 - C0946.m55979("ܿܶ")) * 115;
                        i5 = ((iM55680 ^ i3) * (-11543)) ^ 125236864;
                        i6 = -833522379;
                    } else {
                        iM55680 = (C0946.m55979("ܳܺ") + i4) * (-89);
                        i5 = ((iM55680 ^ i3) * 31393) ^ (-528977543);
                        i6 = -965060485;
                    }
                    break;
                case -1044703081:
                case -840536782:
                    iM55763 = C0894.m55762(spannableStringBuilder);
                    if (C0892.f81851) {
                        iM55680 = (C0946.m55979("᩶ᩴ") ^ i3) * 57;
                        i5 = ((iM55680 ^ i4) * 10887) ^ (-1355389428);
                        i6 = 1176565803;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ܿܶ")) * 115;
                        i5 = ((iM55680 ^ i3) * (-11543)) ^ 125236864;
                        i6 = -833522379;
                    }
                    break;
                case -518281686:
                case 1693526607:
                    C1036.m56254(spannableStringBuilder, str);
                    if (C1017.f81942 >= 0) {
                        iM55680 = (i4 - C0946.m55979("ܿܶ")) * 115;
                        i5 = ((iM55680 ^ i3) * (-11543)) ^ 125236864;
                        i6 = -833522379;
                    } else {
                        iM55680 = (C0873.m55680("ܶۢ") + i3) * (-95);
                        i5 = ((iM55680 ^ i4) * (-27829)) ^ (-1792439582);
                        i6 = -308935052;
                    }
                    break;
                case -491495453:
                case -345228825:
                    C0877.m55696();
                    C0892.m55749();
                    break;
                case -175960324:
                case 652546895:
                    ViewOnClickListenerC0939.m55941();
                    if (!C0927.f81875) {
                        iM55680 = C0946.m55979("ۨۘ") ^ i4;
                        i5 = ((iM55680 ^ i3) * TwofishEngine.GF256_FDBK) ^ 1642810385;
                        i6 = 1470158907;
                    } else {
                        iM55680 = C0946.m55979("ۢۡ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 17207) ^ 360193340;
                        i6 = 1331088510;
                    }
                    break;
                case -103141335:
                case 567785016:
                    i = 33;
                    C0946.m55983(spannableStringBuilder, underlineSpan, iM55762, iM55763, 33);
                    if (C0892.m55749()) {
                        iM55680 = C0873.m55680("۫ۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 22621) ^ (-61891918);
                        i6 = -223274361;
                    } else {
                        iM55680 = C0946.m55979("ۢۡ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 17207) ^ 360193340;
                        i6 = 1331088510;
                    }
                    break;
                case 68351260:
                case 1585686639:
                    iM55762 = C0894.m55762(spannableStringBuilder);
                    if (C0866.f81837 >= 0) {
                        iM55680 = C0946.m55979("ۨۘ") ^ i4;
                        i5 = ((iM55680 ^ i3) * TwofishEngine.GF256_FDBK) ^ 1642810385;
                        i6 = 1470158907;
                    } else {
                        iM55680 = C0873.m55680("֨ᩴ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 721) ^ (-112322908);
                        i6 = 133712371;
                    }
                    break;
                case 154794648:
                case 1273541793:
                    if (C0890.f81849 != 0) {
                        iM55680 = C0946.m55979("ۢۡ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 17207) ^ 360193340;
                        i6 = 1331088510;
                    } else {
                        iM55680 = C0946.m55979("᩸ᩴ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-20361)) ^ (-1520609259);
                        i6 = 2079714655;
                    }
                    break;
                case 469228680:
                case 1202035940:
                    if (C0854.f81826 == 0 && !C0861.m55626()) {
                        C0946.m55983(spannableStringBuilder, new RelativeSizeSpan(0.8f), iM55762, RunnableC0938.m55933(spannableStringBuilder), i);
                    }
                    iM55680 = (i4 - C0946.m55979("ܿܶ")) * 115;
                    i5 = ((iM55680 ^ i3) * (-11543)) ^ 125236864;
                    i6 = -833522379;
                    break;
                default:
                    if (C0906.f81862 >= 0) {
                        iM55680 = (i4 - C0946.m55979("ܿܶ")) * 115;
                        i5 = ((iM55680 ^ i3) * (-11543)) ^ 125236864;
                        i6 = -833522379;
                    } else {
                        iM55680 = (C0873.m55680("᩵ۜ") ^ i4) * 75;
                        i5 = ((iM55680 ^ i3) * (-10501)) ^ 1097345411;
                        i6 = 164354265;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0077 A[PHI: r3
      0x0077: PHI (r3v4 int) = (r3v3 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:30:0x0075, B:25:0x0060, B:18:0x0048, B:16:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6 A[PHI: r9
      0x00d6: PHI (r9v6 android.text.style.StyleSpan) = 
      (r9v5 android.text.style.StyleSpan)
      (r9v4 android.text.style.StyleSpan)
      (r9v4 android.text.style.StyleSpan)
      (r9v4 android.text.style.StyleSpan)
     binds: [B:41:0x00d4, B:16:0x0045, B:13:0x003d, B:10:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0126  */
    /* JADX WARN: Code duplicated, block: B:54:0x0156  */
    /* JADX INFO: renamed from: ۧ */
    public static void m24289(SpannableStringBuilder spannableStringBuilder, String str) {
        int iM55680;
        int i;
        int iM55933 = 0;
        int iM55762 = 0;
        int i2 = 0;
        int i3 = -135809065;
        int i4 = C0866.f81837;
        int i5 = C1017.f81942;
        int iM55681 = (i5 - C0873.m55680("ܿۢ")) * 53;
        int i6 = ((iM55681 ^ i4) * (-16001)) ^ 835317870;
        int i7 = -186620827;
        while (true) {
            int i8 = iM55681 ^ i7;
            StyleSpan styleSpan = null;
            while (true) {
                i3 = ((((i3 ^ i4) * (-7219)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -1927833471:
                    case -1535762579:
                        i2 = 33;
                        C0873.m55690(spannableStringBuilder, styleSpan, iM55933, iM55762, 33);
                        if (ServiceConnectionC1013.f81940 >= 0) {
                            iM55680 = (C0873.m55680("᩵ܽ") ^ i5) * C0254q.f1218h;
                            i6 = ((iM55680 ^ i4) * (-28723)) ^ 605142645;
                            i = -677911026;
                        } else {
                            iM55680 = (C0946.m55979("᩷ۜ") ^ i4) * (-39);
                            i6 = ((iM55680 ^ i5) * 11213) ^ 956915095;
                            i = 1546978632;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1447376811:
                    case -790720521:
                        iM55762 = C0894.m55762(spannableStringBuilder);
                        if (C0854.f81826 == 0) {
                            iM55680 = (C0873.m55680("۟᩸") ^ i4) * 85;
                            i6 = ((iM55680 ^ i5) * 21157) ^ 652192260;
                            i = -1681191677;
                            i8 = iM55680 ^ i;
                        }
                        break;
                    case -1441060940:
                    case 1062252845:
                        C1046.m56302();
                        if (C1024.f81946) {
                            iM55680 = (i5 - C0873.m55680("ۤܶ")) * (-3);
                            i6 = ((iM55680 ^ i4) * 18637) ^ (-1840253982);
                            i = 2094717216;
                        } else {
                            iM55680 = C0873.m55680("ۢ᩵") ^ i4;
                            i6 = ((iM55680 ^ i5) * 19379) ^ 1477992990;
                            i = -656528429;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1334112876:
                    case -541001372:
                        RunnableC0871.m55672();
                        C1017.m56187();
                        break;
                    case -1260405827:
                    case -10918111:
                        if (C1929.m56553()) {
                            iM55680 = (C0873.m55680("᩵ܽ") ^ i5) * C0254q.f1218h;
                            i6 = ((iM55680 ^ i4) * (-28723)) ^ 605142645;
                            i = -677911026;
                        } else {
                            iM55680 = C0873.m55680("ۢ᩵") ^ i4;
                            i6 = ((iM55680 ^ i5) * 19379) ^ 1477992990;
                            i = -656528429;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1098102207:
                    case -323341633:
                        C0854.m55604(spannableStringBuilder, str);
                        if (C1053.f81965 > 0) {
                            styleSpan = new StyleSpan(2);
                            if (C1024.f81946) {
                                iM55680 = C0873.m55680("ۢ᩵") ^ i4;
                                i6 = ((iM55680 ^ i5) * 19379) ^ 1477992990;
                                i = -656528429;
                            } else {
                                iM55680 = (C0873.m55680("᩶֡") ^ i5) * (-111);
                                i6 = ((iM55680 ^ i4) * 29795) ^ (-370961932);
                                i = -1063505722;
                            }
                            i8 = iM55680 ^ i;
                        }
                        break;
                    case -837484333:
                    case 2122469711:
                        if (ServiceConnectionC1013.m56157() <= 0) {
                            iM55680 = (i5 - C0873.m55680("ۤܶ")) * (-3);
                            i6 = ((iM55680 ^ i4) * 18637) ^ (-1840253982);
                            i = 2094717216;
                        } else {
                            iM55680 = (i5 - C0873.m55680("᩺᩸")) * (-39);
                            i6 = ((iM55680 ^ i4) * 19917) ^ 413650871;
                            i = 601951451;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -695932749:
                    case 134058499:
                        C1048.m56305();
                        iM55680 = (C0873.m55680("᩵ܽ") ^ i5) * C0254q.f1218h;
                        i6 = ((iM55680 ^ i4) * (-28723)) ^ 605142645;
                        i = -677911026;
                        i8 = iM55680 ^ i;
                        break;
                    case -166877000:
                    case 467997765:
                        if (C0917.f81868) {
                            iM55680 = C0873.m55680("ۢ᩵") ^ i4;
                            i6 = ((iM55680 ^ i5) * 19379) ^ 1477992990;
                            i = -656528429;
                        } else {
                            iM55680 = (C0946.m55979("ܽۧ") ^ i5) * (-15);
                            i6 = ((iM55680 ^ i4) * 25111) ^ 1179266521;
                            i = 1229085729;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case 230808035:
                    case 783368183:
                        if (C1071.f81975 <= 0) {
                            iM55680 = (C0946.m55979("ܽۧ") ^ i5) * (-15);
                            i6 = ((iM55680 ^ i4) * 25111) ^ 1179266521;
                            i = 1229085729;
                        } else {
                            iM55680 = (C0873.m55680("ܰۚ") ^ i5) * (-59);
                            i6 = ((iM55680 ^ i4) * (-17765)) ^ (-534524787);
                            i = -144922221;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case 381584015:
                    case 1568387315:
                        iM55933 = RunnableC0938.m55933(spannableStringBuilder);
                        if (C1036.m56257() > 0) {
                            iM55680 = (C0946.m55979("ۘܿ") + i4) * (-43);
                            i6 = ((iM55680 ^ i5) * (-19085)) ^ 1143317014;
                            i = 979892595;
                            i8 = iM55680 ^ i;
                        }
                        break;
                    case 1313516261:
                    case 1580883742:
                        if (C1017.f81942 >= 0) {
                            iM55680 = (C0946.m55979("ܽۧ") ^ i5) * (-15);
                            i6 = ((iM55680 ^ i4) * 25111) ^ 1179266521;
                            i = 1229085729;
                        } else {
                            if (!C0882.f81846) {
                                C0946.m55983(spannableStringBuilder, new RelativeSizeSpan(0.8f), iM55933, C0894.m55762(spannableStringBuilder), i2);
                            }
                            iM55680 = (C0873.m55680("᩵ܽ") ^ i5) * C0254q.f1218h;
                            i6 = ((iM55680 ^ i4) * (-28723)) ^ 605142645;
                            i = -677911026;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    default:
                        if (C0877.f81843 < 0) {
                            iM55680 = C0873.m55680("ۢ᩸") ^ i4;
                            i6 = ((iM55680 ^ i5) * (-1135)) ^ (-259811949);
                            i = 288798982;
                            i8 = iM55680 ^ i;
                        }
                        break;
                }
                return;
            }
            iM55681 = (i4 - C0946.m55979("۠ۤ")) * (-63);
            i6 = ((iM55681 ^ i5) * (-8293)) ^ (-1817856690);
            i7 = -1130832501;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:60:0x023b A[PHI: r7
      0x023b: PHI (r7v5 int) = (r7v4 int), (r7v2 int), (r7v2 int) binds: [B:59:0x0239, B:32:0x0114, B:24:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    private void m24284(SpannableStringBuilder spannableStringBuilder, ArrayList arrayList, boolean z, char c) {
        int iM55680;
        int i;
        int i2;
        int i3;
        int iM55979;
        int i4;
        int i5;
        int iM55681;
        int i6;
        int i7;
        int iM559710;
        int i8;
        int i9;
        int iM55682;
        int i10;
        int iM559711;
        int i11;
        int i12;
        StringBuilder sb;
        int i13;
        StringBuilder sb2;
        String str;
        int i14;
        int i15;
        int i16;
        int iM559712;
        int i17;
        int i18;
        int iM559713;
        int i19;
        int i20;
        int i21;
        int iM55683;
        int i22;
        int i23;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        short[] sArr = null;
        char c2 = 0;
        int i24 = 1886387801;
        int i25 = C0877.f81843;
        int i26 = C0930.f81879;
        int iM55684 = C0873.m55680("ۧۢ") ^ i26;
        int i27 = ((iM55684 ^ i25) * (-15341)) ^ (-2138022758);
        int i28 = iM55684 ^ (-1149255138);
        InterfaceC22528 interfaceC22528 = null;
        String strM56180 = null;
        StringBuilder sb3 = null;
        Iterator itM55925 = null;
        StringBuilder sb4 = null;
        int i29 = 0;
        int i30 = 0;
        int value = 0;
        int i31 = 0;
        int iM56261 = 0;
        int i32 = 0;
        InterfaceC3751 interfaceC3751 = null;
        String strM55639 = null;
        Iterator itM56399 = null;
        C14281 c14281 = null;
        String strMo20694 = null;
        StringBuilder sb5 = null;
        InterfaceC22528 interfaceC22529 = null;
        while (true) {
            i24 = i28 ^ (i27 & (((i24 ^ i25) * 26215) >> 31));
            switch (i24) {
                case -2103744489:
                case 83545406:
                    sb = sb4;
                    i13 = i29;
                    sb2 = sb3;
                    str = strM56180;
                    i14 = i30;
                    i15 = i32;
                    i16 = value;
                    if (C0947.m55989(arrayList) > i15) {
                        iM559712 = C0873.m55680("ۢܺ") ^ i26;
                        i17 = ((iM559712 ^ i25) * 27369) ^ (-929063409);
                        i18 = -998539153;
                    } else {
                        iM559712 = C0946.m55979("۬᩵") ^ i26;
                        i17 = ((iM559712 ^ i25) * 5007) ^ (-1392213333);
                        i18 = -1339386939;
                    }
                    sb3 = sb2;
                    i29 = i13;
                    int i33 = i14;
                    strM56180 = str;
                    sb4 = sb;
                    i28 = iM559712 ^ i18;
                    i27 = i17;
                    value = i16;
                    i32 = i15;
                    i30 = i33;
                    break;
                case -2072127147:
                case -1383010315:
                    iM56261 = C1036.m56261(sb4) + C0894.m55762(spannableStringBuilder);
                    C1003.m56121(sb4, c14281.m32838(interfaceC3751));
                    if (C0845.f81821 >= 0) {
                        iM55683 = (i25 - C0946.m55979("۟ܺ")) * (-111);
                        i22 = ((iM55683 ^ i26) * (-11249)) ^ 61300019;
                        i23 = 1111630627;
                    } else {
                        iM55683 = C0873.m55680("ۖۡ") ^ i25;
                        i22 = ((iM55683 ^ i26) * (-6099)) ^ 1925390953;
                        i23 = -1163991131;
                    }
                    i28 = iM55683 ^ i23;
                    i27 = i22;
                    break;
                case -1981535974:
                case 901438639:
                    sb4 = sb4;
                    i29 = i29;
                    strM56180 = strM56180;
                    i30 = i30;
                    i32 = i32;
                    value = value;
                    m24283(spannableStringBuilder2, C1036.m56252(f82088, 6, 3, i31));
                    if (C0917.f81868) {
                        iM55979 = C0946.m55979("ܽ۬") ^ i25;
                        i4 = ((iM55979 ^ i26) * (-26675)) ^ 2013535423;
                        i5 = -46292298;
                    } else {
                        StringBuilder sb6 = new StringBuilder(strM56180);
                        C0873.m55681(sb6, c);
                        C0912.m55825(sb6, interfaceC22528.mo50216());
                        C1017.m56183(spannableStringBuilder2, C0845.m55591(sb6));
                        iM55979 = C0946.m55979("᩻ۡ") ^ i25;
                        i4 = ((iM55979 ^ i26) * 2239) ^ 409070778;
                        i5 = 215435724;
                    }
                    i7 = iM55979 ^ i5;
                    value = value;
                    i32 = i32;
                    i30 = i30;
                    strM56180 = strM56180;
                    sb4 = sb4;
                    i28 = i7;
                    i27 = i4;
                    i29 = i29;
                    break;
                case -1941657608:
                case -127340889:
                    sb4 = sb4;
                    i29 = i29;
                    strM56180 = strM56180;
                    i30 = i30;
                    i32 = i32;
                    value = value;
                    m24283(spannableStringBuilder2, C1017.m56189(f82088, 9, 6, i31));
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = (C0873.m55680("ۧۘ") + i26) * (-83);
                        i4 = ((iM55979 ^ i25) * (-31653)) ^ (-796717351);
                        i5 = -426337754;
                    } else {
                        iM55979 = C0873.m55680("ۡܺ") ^ i26;
                        i4 = ((iM55979 ^ i25) * 30095) ^ (-1927019678);
                        i5 = 1615244981;
                    }
                    i7 = iM55979 ^ i5;
                    value = value;
                    i32 = i32;
                    i30 = i30;
                    strM56180 = strM56180;
                    sb4 = sb4;
                    i28 = i7;
                    i27 = i4;
                    i29 = i29;
                    break;
                case -1895613041:
                case -757155089:
                    itM56399 = C1229.m56399(interfaceC22529.values());
                    iM55682 = C0946.m55979("᩵᩻") ^ i25;
                    i27 = ((iM55682 ^ i26) * 14043) ^ 2105202844;
                    i10 = 1196515449;
                    i21 = iM55682 ^ i10;
                    i29 = i29;
                    StringBuilder sb7 = sb4;
                    i28 = i21;
                    sb4 = sb7;
                    break;
                case -1842276740:
                case 107033940:
                    C0947.m55997();
                    iM55683 = (C0946.m55979("᩷ۧ") ^ i25) * 101;
                    i22 = ((iM55683 ^ i26) * (-25217)) ^ (-330781242);
                    i23 = -402524862;
                    i28 = iM55683 ^ i23;
                    i27 = i22;
                    break;
                case -1782415565:
                case 125897529:
                    sb4 = sb4;
                    i29 = i29;
                    strM56180 = strM56180;
                    i30 = i30;
                    i32 = i32;
                    value = value;
                    if (C1071.f81975 <= 0) {
                        i12 = i32;
                        i30 = i30;
                        i29 = i29;
                        int iM55685 = C0873.m55680("᩷֡") ^ i25;
                        int i34 = ((iM55685 ^ i26) * 23405) ^ 91717034;
                        int i35 = iM55685 ^ (-1026955423);
                        i27 = i34;
                        value = value;
                        spannableStringBuilder2 = spannableStringBuilder;
                        i32 = i12;
                        strM56180 = strM56180;
                        sb4 = sb4;
                        i28 = i35;
                    } else {
                        int iM55686 = (i25 - C0873.m55680("ۗܰ")) * 41;
                        i27 = ((iM55686 ^ i26) * 26565) ^ 1797975391;
                        value = value;
                        i29 = i29;
                        i32 = i32;
                        i30 = i30;
                        strM56180 = strM56180;
                        sb4 = sb4;
                        i28 = iM55686 ^ 1744137135;
                        spannableStringBuilder2 = spannableStringBuilder;
                    }
                    break;
                case -1756086959:
                case 1845995644:
                    sb4 = sb4;
                    i29 = i29;
                    interfaceC22529 = (InterfaceC22528) RunnableC0897.m55785(itM55925);
                    strM56180 = strM56180;
                    sb5 = new StringBuilder(strM56180);
                    strMo20694 = interfaceC22529.mo31472().mo20694();
                    if (RunnableC0871.f81839 >= 0) {
                        iM559710 = C0873.m55680("ۜۚ") ^ i25;
                        i8 = ((iM559710 ^ i26) * 2829) ^ (-475321210);
                        i9 = -2055795492;
                    } else {
                        iM559710 = (C0946.m55979("᩶ܳ") ^ i26) * 69;
                        i8 = ((iM559710 ^ i25) * (-31921)) ^ (-1528621760);
                        i9 = -1862714632;
                    }
                    i3 = iM559710 ^ i9;
                    strM56180 = strM56180;
                    i27 = i8;
                    sb4 = sb4;
                    i28 = i3;
                    i29 = i29;
                    break;
                case -1657894237:
                case 151157347:
                    i31 = 46747;
                    iM55680 = C0946.m55979("ۨۚ") ^ i25;
                    i = ((iM55680 ^ i26) * (-30353)) ^ (-1894789990);
                    i2 = 1471344262;
                    i3 = iM55680 ^ i2;
                    i27 = i;
                    value = value;
                    i32 = i32;
                    i30 = i30;
                    strM56180 = strM56180;
                    sb4 = sb4;
                    i28 = i3;
                    i29 = i29;
                    break;
                case -1655627620:
                case 2014783854:
                    C1036.m56257();
                    if (C1124.f82007 >= 0) {
                        sb4 = sb4;
                        i29 = i29;
                        strM56180 = strM56180;
                        i30 = i30;
                        i32 = i32;
                        value = value;
                        iM55979 = C0946.m55979("ܽ۬") ^ i25;
                        i4 = ((iM55979 ^ i26) * (-26675)) ^ 2013535423;
                        i5 = -46292298;
                        i7 = iM55979 ^ i5;
                        value = value;
                        i32 = i32;
                        i30 = i30;
                        strM56180 = strM56180;
                        sb4 = sb4;
                        i28 = i7;
                        i27 = i4;
                        i29 = i29;
                    } else {
                        iM55683 = (i26 - C0946.m55979("᩹֡")) * 57;
                        i22 = ((iM55683 ^ i25) * (-11235)) ^ 1417424099;
                        i23 = -972158601;
                        i28 = iM55683 ^ i23;
                        i27 = i22;
                    }
                    break;
                case -1585652535:
                case 961573213:
                    C0845.m55584();
                    if (C0863.f81833 <= 0) {
                        sb4 = sb4;
                        i29 = i29;
                        strM56180 = strM56180;
                        i30 = i30;
                        i32 = i32;
                        value = value;
                        iM55979 = (C0873.m55680("ۧۘ") + i26) * (-83);
                        i4 = ((iM55979 ^ i25) * (-31653)) ^ (-796717351);
                        i5 = -426337754;
                        i7 = iM55979 ^ i5;
                        value = value;
                        i32 = i32;
                        i30 = i30;
                        strM56180 = strM56180;
                        sb4 = sb4;
                        i28 = i7;
                        i27 = i4;
                        i29 = i29;
                    } else {
                        iM55683 = (C0946.m55979("᩷ۧ") ^ i25) * 101;
                        i22 = ((iM55683 ^ i26) * (-25217)) ^ (-330781242);
                        i23 = -402524862;
                        i28 = iM55683 ^ i23;
                        i27 = i22;
                    }
                    break;
                case -1523702644:
                case 683188790:
                    i31 = 19738;
                    iM55680 = C0946.m55979("ۨۚ") ^ i25;
                    i = ((iM55680 ^ i26) * (-30353)) ^ (-1894789990);
                    i2 = 1471344262;
                    i3 = iM55680 ^ i2;
                    i27 = i;
                    value = value;
                    i32 = i32;
                    i30 = i30;
                    strM56180 = strM56180;
                    sb4 = sb4;
                    i28 = i3;
                    i29 = i29;
                    break;
                case -1417990108:
                case -637720471:
                    sb4 = sb4;
                    value = value;
                    strM56180 = strM56180;
                    int i36 = i30;
                    i29 = 0;
                    interfaceC22528 = (InterfaceC22528) C1929.m56563(arrayList, 0);
                    if (C0927.f81875) {
                        i30 = i36;
                        i12 = 1;
                        int iM55687 = C0873.m55680("᩷֡") ^ i25;
                        int i37 = ((iM55687 ^ i26) * 23405) ^ 91717034;
                        int i38 = iM55687 ^ (-1026955423);
                        i27 = i37;
                        value = value;
                        spannableStringBuilder2 = spannableStringBuilder;
                        i32 = i12;
                        strM56180 = strM56180;
                        sb4 = sb4;
                        i28 = i38;
                    } else {
                        int iM55688 = (C0873.m55680("ܳۜ") ^ i26) * 29;
                        i27 = ((iM55688 ^ i25) * (-18463)) ^ 2142482056;
                        value = value;
                        i30 = i36;
                        i29 = 0;
                        i32 = 1;
                        strM56180 = strM56180;
                        sb4 = sb4;
                        i28 = iM55688 ^ 2007186207;
                    }
                    break;
                case -1384285909:
                case -658300722:
                    sb4 = sb4;
                    i29 = i29;
                    strM56180 = strM56180;
                    i30 = i30;
                    i32 = i32;
                    value = value;
                    sArr = f82088;
                    c2 = 4;
                    if (C1036.f81953 < 0) {
                        iM55680 = C0873.m55680("ܰۨ") ^ i26;
                        i = ((iM55680 ^ i25) * 23137) ^ 1143977903;
                        i2 = 1935135240;
                        i3 = iM55680 ^ i2;
                        i27 = i;
                        value = value;
                        i32 = i32;
                        i30 = i30;
                        strM56180 = strM56180;
                        sb4 = sb4;
                        i28 = i3;
                        i29 = i29;
                    } else {
                        i12 = i32;
                        i30 = i30;
                        i29 = i29;
                        int iM55689 = C0873.m55680("᩷֡") ^ i25;
                        int i39 = ((iM55689 ^ i26) * 23405) ^ 91717034;
                        int i310 = iM55689 ^ (-1026955423);
                        i27 = i39;
                        value = value;
                        spannableStringBuilder2 = spannableStringBuilder;
                        i32 = i12;
                        strM56180 = strM56180;
                        sb4 = sb4;
                        i28 = i310;
                    }
                    break;
                case -1364041314:
                case 965967466:
                    break;
                case -1357693343:
                case 781979107:
                    sb4 = sb4;
                    i29 = i29;
                    StringBuilder sb8 = sb3;
                    strM56180 = strM56180;
                    i30 = i30;
                    i32 = i32;
                    value = value;
                    C1003.m56121(sb8, interfaceC22528.mo31468());
                    C1017.m56183(spannableStringBuilder2, C0845.m55591(sb8));
                    iM55979 = C0946.m55979("᩻ۡ") ^ i25;
                    i4 = ((iM55979 ^ i26) * 2239) ^ 409070778;
                    i5 = 215435724;
                    i7 = iM55979 ^ i5;
                    value = value;
                    i32 = i32;
                    i30 = i30;
                    strM56180 = strM56180;
                    sb4 = sb4;
                    i28 = i7;
                    i27 = i4;
                    i29 = i29;
                    break;
                case -1302714842:
                case 1082221024:
                    sb4 = sb4;
                    i29 = i29;
                    C0992.m56113(spannableStringBuilder2, C1046.m56289(C0937.m55921(f82088, 26, 8, i31), c14281.m32849(interfaceC22529.getParent())));
                    iM559713 = (C0946.m55979("֫᩹") ^ i25) * (-125);
                    i19 = ((iM559713 ^ i26) * 11355) ^ (-1619059307);
                    i20 = 201616022;
                    i21 = iM559713 ^ i20;
                    i27 = i19;
                    i29 = i29;
                    StringBuilder sb9 = sb4;
                    i28 = i21;
                    sb4 = sb9;
                    break;
                case -1175660532:
                case -871836125:
                    C0927.m55873();
                    break;
                case -1091408845:
                case 1221787510:
                    if (interfaceC3751.mo7247() > 31) {
                        iM55682 = C0946.m55979("᩵᩻") ^ i25;
                        i27 = ((iM55682 ^ i26) * 14043) ^ 2105202844;
                        i10 = 1196515449;
                        i21 = iM55682 ^ i10;
                        i29 = i29;
                        StringBuilder sb10 = sb4;
                        i28 = i21;
                        sb4 = sb10;
                    } else {
                        iM55683 = C0946.m55979("᩷ۛ") ^ i26;
                        i22 = ((iM55683 ^ i25) * (-19137)) ^ 1839214205;
                        i23 = 1453435085;
                        i28 = iM55683 ^ i23;
                        i27 = i22;
                    }
                    break;
                case -1067088374:
                case -825649546:
                    sb4 = sb4;
                    i29 = i29;
                    if (interfaceC22529.getParent() != 0) {
                        iM55682 = (C0946.m55979("۟ܰ") + i26) * (-119);
                        i27 = ((iM55682 ^ i25) * 12407) ^ (-1772325144);
                        i10 = 84965951;
                        i21 = iM55682 ^ i10;
                        i29 = i29;
                        StringBuilder sb11 = sb4;
                        i28 = i21;
                        sb4 = sb11;
                    }
                    iM559713 = (C0946.m55979("֫᩹") ^ i25) * (-125);
                    i19 = ((iM559713 ^ i26) * 11355) ^ (-1619059307);
                    i20 = 201616022;
                    i21 = iM559713 ^ i20;
                    i27 = i19;
                    i29 = i29;
                    StringBuilder sb12 = sb4;
                    i28 = i21;
                    sb4 = sb12;
                    break;
                case -1045382070:
                case 1021009148:
                    sb4 = sb4;
                    i29 = i29;
                    i30 = i30;
                    i32 = i32;
                    value = value;
                    strM56180 = RunnableC1014.m56180(f82088, 5, 1, i31);
                    if (z) {
                        iM55979 = C0873.m55680("ۚܽ") ^ i25;
                        i4 = ((iM55979 ^ i26) * 29007) ^ (-1212975257);
                        i5 = 1982279449;
                    } else {
                        iM55979 = C0946.m55979("ܺۙ") ^ i26;
                        i4 = ((iM55979 ^ i25) * 30987) ^ 719626377;
                        i5 = -1487294925;
                    }
                    i7 = iM55979 ^ i5;
                    value = value;
                    i32 = i32;
                    i30 = i30;
                    strM56180 = strM56180;
                    sb4 = sb4;
                    i28 = i7;
                    i27 = i4;
                    i29 = i29;
                    break;
                case -920832830:
                case 1005664897:
                    sb4 = sb4;
                    i29 = i29;
                    if (!C0930.m55886(itM56399)) {
                        iM559710 = (C0946.m55979("ۜ᩺") + i25) * 9;
                        i8 = ((iM559710 ^ i26) * 18283) ^ (-1784805042);
                        i9 = 157991545;
                        i3 = iM559710 ^ i9;
                        strM56180 = strM56180;
                        i27 = i8;
                        sb4 = sb4;
                        i28 = i3;
                        i29 = i29;
                    } else {
                        iM55682 = C0873.m55680("ۗ᩻") ^ i26;
                        i27 = ((iM55682 ^ i25) * 411) ^ 252543372;
                        i10 = 352343356;
                        i21 = iM55682 ^ i10;
                        i29 = i29;
                        StringBuilder sb13 = sb4;
                        i28 = i21;
                        sb4 = sb13;
                    }
                    break;
                case -845588550:
                case 886122355:
                    C1017.m56183(spannableStringBuilder2, C0863.m55639(sb4));
                    if (interfaceC3751.mo7247() < 28) {
                        iM55682 = C0946.m55979("᩵᩻") ^ i25;
                        i27 = ((iM55682 ^ i26) * 14043) ^ 2105202844;
                        i10 = 1196515449;
                        i21 = iM55682 ^ i10;
                        i29 = i29;
                        StringBuilder sb14 = sb4;
                        i28 = i21;
                        sb4 = sb14;
                    } else {
                        iM55683 = C0946.m55979("ᩴܿ") ^ i25;
                        i22 = ((iM55683 ^ i26) * 17853) ^ 782714213;
                        i23 = -962666976;
                        i28 = iM55683 ^ i23;
                        i27 = i22;
                    }
                    break;
                case -765331021:
                case 1328524295:
                    C0912.m55825(sb4, c14281.m32844(interfaceC3751.mo7249()));
                    m24292(spannableStringBuilder2, C0863.m55639(sb4));
                    sb4.setLength(i29);
                    C0946.m55977(sb4, C0184a.f880h);
                    iM55683 = (C0873.m55680("۠ۗ") ^ i25) * (-45);
                    i22 = ((iM55683 ^ i26) * (-7027)) ^ (-1939035992);
                    i23 = 1449788971;
                    i28 = iM55683 ^ i23;
                    i27 = i22;
                    break;
                case -731273563:
                case -356107007:
                    sb4 = sb4;
                    i29 = i29;
                    strM56180 = strM56180;
                    i30 = i30;
                    i32 = i32;
                    strM55639 = "";
                    value = value;
                    iM559711 = (C0873.m55680("ۡ֨") + i25) * (-27);
                    i4 = ((iM559711 ^ i26) * 6239) ^ 549830263;
                    i11 = 152518383;
                    i7 = iM559711 ^ i11;
                    value = value;
                    i32 = i32;
                    i30 = i30;
                    strM56180 = strM56180;
                    sb4 = sb4;
                    i28 = i7;
                    i27 = i4;
                    i29 = i29;
                    break;
                case -559799970:
                case 240191521:
                    if (C0949.f81897 >= 0) {
                        sb = sb4;
                        i13 = i29;
                        sb2 = sb3;
                        str = strM56180;
                        i14 = i30;
                        i15 = i32;
                        i16 = value;
                        iM559712 = C0873.m55680("᩶ᩴ") ^ i26;
                        i17 = ((iM559712 ^ i25) * 28365) ^ 306321465;
                        i18 = 685709852;
                        sb3 = sb2;
                        i29 = i13;
                        int i311 = i14;
                        strM56180 = str;
                        sb4 = sb;
                        i28 = iM559712 ^ i18;
                        i27 = i17;
                        value = i16;
                        i32 = i15;
                        i30 = i311;
                    } else {
                        iM55683 = (C0946.m55979("᩷ۧ") ^ i25) * 101;
                        i22 = ((iM55683 ^ i26) * (-25217)) ^ (-330781242);
                        i23 = -402524862;
                        i28 = iM55683 ^ i23;
                        i27 = i22;
                    }
                    break;
                case -548435114:
                case 226294599:
                    sb4 = sb4;
                    i29 = i29;
                    itM55925 = RunnableC0938.m55925(arrayList);
                    iM559710 = (C0946.m55979("ۜ᩺") + i25) * 9;
                    i8 = ((iM559710 ^ i26) * 18283) ^ (-1784805042);
                    i9 = 157991545;
                    i3 = iM559710 ^ i9;
                    strM56180 = strM56180;
                    i27 = i8;
                    sb4 = sb4;
                    i28 = i3;
                    i29 = i29;
                    break;
                case -430244958:
                case 1023811405:
                    sb4 = sb4;
                    i29 = i29;
                    strM56180 = strM56180;
                    i30 = i30;
                    if (C0906.m55806(C1046.m56291(interfaceC22528.getType()), RunnableC0897.m55783(f82088, 24, 2, i31))) {
                        i32 = i32;
                        iM55681 = C0946.m55979("ۗۚ") ^ i25;
                        i4 = ((iM55681 ^ i26) * (-31073)) ^ (-1026216948);
                        i6 = 553492832;
                        i7 = iM55681 ^ i6;
                        i32 = i32;
                    } else {
                        int iM556810 = C0873.m55680("᩸۫") ^ i26;
                        i4 = ((iM556810 ^ i25) * (-30621)) ^ (-180892967);
                        i7 = iM556810 ^ 599957954;
                    }
                    i30 = i30;
                    strM56180 = strM56180;
                    sb4 = sb4;
                    i28 = i7;
                    i27 = i4;
                    i29 = i29;
                    break;
                case -242506398:
                case 1427003856:
                    sb4 = sb4;
                    i29 = i29;
                    strM56180 = strM56180;
                    i30 = i30;
                    i32 = i32;
                    value = value;
                    C1003.m56121(sb3, C1025.m56233(f82088, 15, 8, i31));
                    iM55979 = C0946.m55979("᩹᩺") ^ i25;
                    i4 = ((iM55979 ^ i26) * (-16143)) ^ 2044176353;
                    i5 = -580848260;
                    i7 = iM55979 ^ i5;
                    value = value;
                    i32 = i32;
                    i30 = i30;
                    strM56180 = strM56180;
                    sb4 = sb4;
                    i28 = i7;
                    i27 = i4;
                    i29 = i29;
                    break;
                case -227755655:
                case 163011983:
                    sb4 = sb4;
                    i29 = i29;
                    C1003.m56121(sb5, strMo20694);
                    C0912.m55825(sb5, strM55639);
                    m24283(spannableStringBuilder2, C0845.m55591(sb5));
                    boolean zMo31474 = interfaceC22529.mo31474();
                    c14281 = this.f29173;
                    if (zMo31474) {
                        iM559713 = C0946.m55979("᩹֫") ^ i26;
                        i19 = ((iM559713 ^ i25) * (-23267)) ^ 1985724041;
                        i20 = -529019438;
                    } else {
                        iM559713 = (C0946.m55979("֫᩹") ^ i25) * (-125);
                        i19 = ((iM559713 ^ i26) * 11355) ^ (-1619059307);
                        i20 = 201616022;
                    }
                    i21 = iM559713 ^ i20;
                    i27 = i19;
                    i29 = i29;
                    StringBuilder sb15 = sb4;
                    i28 = i21;
                    sb4 = sb15;
                    break;
                case -192539013:
                case 1343472466:
                    sb4 = sb4;
                    i29 = i29;
                    strM56180 = strM56180;
                    i30 = i30;
                    i32 = i32;
                    if (interfaceC22528.mo31469().mo14722() != i32) {
                        iM55681 = (C0873.m55680("ۖۗ") + i26) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55681 ^ i25) * (-9311)) ^ 548217489;
                        i6 = 1643618542;
                    } else {
                        iM55681 = C0946.m55979("ۗۚ") ^ i25;
                        i4 = ((iM55681 ^ i26) * (-31073)) ^ (-1026216948);
                        i6 = 553492832;
                    }
                    i7 = iM55681 ^ i6;
                    i32 = i32;
                    i30 = i30;
                    strM56180 = strM56180;
                    sb4 = sb4;
                    i28 = i7;
                    i27 = i4;
                    i29 = i29;
                    break;
                case -120292845:
                case 2015359615:
                    value = interfaceC3751.getValue();
                    C0946.m55983(spannableStringBuilder2, new BackgroundColorSpan(value), iM56261, C0894.m55762(spannableStringBuilder), 33);
                    if (C1229.f82066 >= 0) {
                        sb4 = sb4;
                        i12 = i32;
                        strM56180 = strM56180;
                        i30 = 33;
                        value = value;
                        int iM556811 = C0873.m55680("᩷֡") ^ i25;
                        int i312 = ((iM556811 ^ i26) * 23405) ^ 91717034;
                        int i313 = iM556811 ^ (-1026955423);
                        i27 = i312;
                        value = value;
                        spannableStringBuilder2 = spannableStringBuilder;
                        i32 = i12;
                        strM56180 = strM56180;
                        sb4 = sb4;
                        i28 = i313;
                    } else {
                        int iM559714 = (i25 - C0946.m55979("ᩳۨ")) * 109;
                        i28 = iM559714 ^ (-1586236941);
                        i27 = ((iM559714 ^ i26) * (-6197)) ^ (-991927850);
                        i30 = 33;
                    }
                    break;
                case 14073105:
                case 1283835766:
                    C1404.m56468();
                    if (!RunnableC0897.m55784()) {
                        sb4 = sb4;
                        i29 = i29;
                        strM56180 = strM56180;
                        i30 = i30;
                        i32 = i32;
                        value = value;
                        iM559711 = C0946.m55979("֫ܳ") ^ i26;
                        i4 = ((iM559711 ^ i25) * (-10845)) ^ (-673625246);
                        i11 = 873258406;
                        i7 = iM559711 ^ i11;
                        value = value;
                        i32 = i32;
                        i30 = i30;
                        strM56180 = strM56180;
                        sb4 = sb4;
                        i28 = i7;
                        i27 = i4;
                        i29 = i29;
                    } else {
                        iM55683 = (C0946.m55979("᩷ۧ") ^ i25) * 101;
                        i22 = ((iM55683 ^ i26) * (-25217)) ^ (-330781242);
                        i23 = -402524862;
                        i28 = iM55683 ^ i23;
                        i27 = i22;
                    }
                    break;
                case 163221866:
                case 753225875:
                    sb4 = sb4;
                    i29 = i29;
                    strM56180 = strM56180;
                    if (!C0866.m55647(itM55925)) {
                        i30 = i30;
                        i32 = i32;
                        iM55681 = C0946.m55979("ۗۚ") ^ i25;
                        i4 = ((iM55681 ^ i26) * (-31073)) ^ (-1026216948);
                        i6 = 553492832;
                        i7 = iM55681 ^ i6;
                        i32 = i32;
                        i30 = i30;
                        strM56180 = strM56180;
                        sb4 = sb4;
                        i28 = i7;
                        i27 = i4;
                        i29 = i29;
                    } else {
                        iM559710 = C0946.m55979("᩺ᩳ") ^ i25;
                        i8 = ((iM559710 ^ i26) * (-8963)) ^ (-610255193);
                        i9 = -531890856;
                        i3 = iM559710 ^ i9;
                        strM56180 = strM56180;
                        i27 = i8;
                        sb4 = sb4;
                        i28 = i3;
                        i29 = i29;
                    }
                    break;
                case 188272063:
                case 1907060648:
                    RunnableC1014.m56177();
                    if (C0866.f81837 < 0) {
                        iM55683 = (i26 - C0946.m55979("᩹֡")) * 57;
                        i22 = ((iM55683 ^ i25) * (-11235)) ^ 1417424099;
                        i23 = -972158601;
                    } else {
                        iM55683 = C0946.m55979("ۨ᩻") ^ i26;
                        i22 = ((iM55683 ^ i25) * (-19831)) ^ (-569894198);
                        i23 = 1454028811;
                    }
                    i28 = iM55683 ^ i23;
                    i27 = i22;
                    break;
                case 234767574:
                case 1325077306:
                    sb4 = sb4;
                    i29 = i29;
                    strM56180 = strM56180;
                    i30 = i30;
                    i32 = i32;
                    value = value;
                    StringBuilder sb16 = new StringBuilder(strM56180);
                    C0946.m55977(sb16, c);
                    if (interfaceC22528.mo31469().mo14722() != i32) {
                        sb3 = sb16;
                        iM55979 = C0946.m55979("᩹᩺") ^ i25;
                        i4 = ((iM55979 ^ i26) * (-16143)) ^ 2044176353;
                        i5 = -580848260;
                        i7 = iM55979 ^ i5;
                        value = value;
                        i32 = i32;
                        i30 = i30;
                        strM56180 = strM56180;
                        sb4 = sb4;
                        i28 = i7;
                        i27 = i4;
                        i29 = i29;
                    } else {
                        int iM556812 = (C0873.m55680("֨۟") + i25) * (-27);
                        i = ((iM556812 ^ i26) * 15175) ^ 2070091404;
                        i3 = iM556812 ^ 203334214;
                        sb3 = sb16;
                        i27 = i;
                        value = value;
                        i32 = i32;
                        i30 = i30;
                        strM56180 = strM56180;
                        sb4 = sb4;
                        i28 = i3;
                        i29 = i29;
                    }
                    break;
                case 281898247:
                case 926802011:
                    if (((value >>> 24) & 255) <= 64) {
                        iM55682 = C0946.m55979("᩵᩻") ^ i25;
                        i27 = ((iM55682 ^ i26) * 14043) ^ 2105202844;
                        i10 = 1196515449;
                        i21 = iM55682 ^ i10;
                        i29 = i29;
                        StringBuilder sb17 = sb4;
                        i28 = i21;
                        sb4 = sb17;
                    } else {
                        iM55683 = (C0873.m55680("᩵۫") + i26) * (-113);
                        i22 = ((iM55683 ^ i25) * (-8893)) ^ 378728589;
                        i23 = 1637200480;
                        i28 = iM55683 ^ i23;
                        i27 = i22;
                    }
                    break;
                case 447810232:
                case 2134984243:
                    if (C0992.f81922 >= 0) {
                        sb4 = sb4;
                        i29 = i29;
                        strM56180 = strM56180;
                        iM559710 = C0873.m55680("ۜۚ") ^ i25;
                        i8 = ((iM559710 ^ i26) * 2829) ^ (-475321210);
                        i9 = -2055795492;
                        i3 = iM559710 ^ i9;
                        strM56180 = strM56180;
                        i27 = i8;
                        sb4 = sb4;
                        i28 = i3;
                        i29 = i29;
                    }
                    sb4 = sb4;
                    i29 = i29;
                    strM56180 = strM56180;
                    i30 = i30;
                    i32 = i32;
                    value = value;
                    iM55979 = C0946.m55979("ܽ۬") ^ i25;
                    i4 = ((iM55979 ^ i26) * (-26675)) ^ 2013535423;
                    i5 = -46292298;
                    i7 = iM55979 ^ i5;
                    value = value;
                    i32 = i32;
                    i30 = i30;
                    strM56180 = strM56180;
                    sb4 = sb4;
                    i28 = i7;
                    i27 = i4;
                    i29 = i29;
                    break;
                case 521876875:
                case 1395433536:
                    sb = sb4;
                    i13 = i29;
                    sb2 = sb3;
                    str = strM56180;
                    i14 = i30;
                    i15 = i32;
                    i16 = value;
                    C1003.m56121(sb2, C1046.m56291(interfaceC22528.getType()));
                    C0873.m55681(sb2, '/');
                    if (C1964.f83032 <= 0) {
                        iM559712 = C0873.m55680("᩶ᩴ") ^ i26;
                        i17 = ((iM559712 ^ i25) * 28365) ^ 306321465;
                        i18 = 685709852;
                    } else {
                        iM559712 = (C0946.m55979("۫۠") ^ i26) * 19;
                        i17 = ((iM559712 ^ i25) * (-9909)) ^ (-203411282);
                        i18 = 1451822586;
                    }
                    sb3 = sb2;
                    i29 = i13;
                    int i314 = i14;
                    strM56180 = str;
                    sb4 = sb;
                    i28 = iM559712 ^ i18;
                    i27 = i17;
                    value = i16;
                    i32 = i15;
                    i30 = i314;
                    break;
                case 1002297934:
                case 1371910903:
                    interfaceC3751 = (InterfaceC3751) C0955.m56035(itM56399);
                    sb4 = new StringBuilder();
                    C0873.m55681(sb4, '\n');
                    if (interfaceC3751.mo7249() != -1) {
                        iM55683 = C0873.m55680("ۧۚ") ^ i26;
                        i22 = ((iM55683 ^ i25) * 10499) ^ 584169500;
                        i23 = 1636962594;
                    } else {
                        iM55683 = (C0873.m55680("۠ۗ") ^ i25) * (-45);
                        i22 = ((iM55683 ^ i26) * (-7027)) ^ (-1939035992);
                        i23 = 1449788971;
                    }
                    i28 = iM55683 ^ i23;
                    i27 = i22;
                    break;
                case 1030692820:
                case 1720654178:
                    C0946.m55983(spannableStringBuilder2, new ForegroundColorSpan(C9464.m21980(value, C23223.f72995)), iM56261, C0894.m55762(spannableStringBuilder), i30);
                    iM55682 = C0946.m55979("᩵᩻") ^ i25;
                    i27 = ((iM55682 ^ i26) * 14043) ^ 2105202844;
                    i10 = 1196515449;
                    i21 = iM55682 ^ i10;
                    i29 = i29;
                    StringBuilder sb18 = sb4;
                    i28 = i21;
                    sb4 = sb18;
                    break;
                case 1053245277:
                case 1451004102:
                    if (C0947.m55997()) {
                        iM55683 = (C0946.m55979("᩷ۧ") ^ i25) * 101;
                        i22 = ((iM55683 ^ i26) * (-25217)) ^ (-330781242);
                        i23 = -402524862;
                    } else {
                        iM55683 = (i25 - C0946.m55979("۟ܺ")) * (-111);
                        i22 = ((iM55683 ^ i26) * (-11249)) ^ 61300019;
                        i23 = 1111630627;
                    }
                    i28 = iM55683 ^ i23;
                    i27 = i22;
                    break;
                case 1575638598:
                case 1582484122:
                    sb4 = sb4;
                    i29 = i29;
                    strM56180 = strM56180;
                    i30 = i30;
                    i32 = i32;
                    value = value;
                    short s = sArr[c2];
                    if (((s * s) + 188348176) - (s * 27448) >= 0) {
                        iM55680 = C0873.m55680("֫ܶ") ^ i25;
                        i = ((iM55680 ^ i26) * 30983) ^ (-1113297984);
                        i2 = 325133909;
                    } else {
                        iM55680 = (C0873.m55680("᩷᩻") ^ i26) * 17;
                        i = ((iM55680 ^ i25) * 1537) ^ (-1478634859);
                        i2 = 840532484;
                    }
                    i3 = iM55680 ^ i2;
                    i27 = i;
                    value = value;
                    i32 = i32;
                    i30 = i30;
                    strM56180 = strM56180;
                    sb4 = sb4;
                    i28 = i3;
                    i29 = i29;
                    break;
                case 1803446287:
                case 1936875492:
                    AbstractC0942.m55971();
                    if (C1053.f81965 > 0) {
                        iM55683 = (i25 - C0946.m55979("۟ܺ")) * (-111);
                        i22 = ((iM55683 ^ i26) * (-11249)) ^ 61300019;
                        i23 = 1111630627;
                    } else {
                        iM55683 = (i26 - C0946.m55979("᩹֡")) * 57;
                        i22 = ((iM55683 ^ i25) * (-11235)) ^ 1417424099;
                        i23 = -972158601;
                    }
                    i28 = iM55683 ^ i23;
                    i27 = i22;
                    break;
                default:
                    sb4 = sb4;
                    i29 = i29;
                    strM56180 = strM56180;
                    i30 = i30;
                    i32 = i32;
                    value = value;
                    String strM56029 = C0955.m56029(f82088, 23, 1, i31);
                    if (C1003.f81929 <= 0) {
                        iM559711 = C0946.m55979("֫ܳ") ^ i26;
                        i4 = ((iM559711 ^ i25) * (-10845)) ^ (-673625246);
                        i11 = 873258406;
                    } else {
                        StringBuilder sb19 = new StringBuilder(strM56029);
                        C0912.m55825(sb19, interfaceC22528.mo31468());
                        strM55639 = C0863.m55639(sb19);
                        iM559711 = (C0873.m55680("ۡ֨") + i25) * (-27);
                        i4 = ((iM559711 ^ i26) * 6239) ^ 549830263;
                        i11 = 152518383;
                    }
                    i7 = iM559711 ^ i11;
                    value = value;
                    i32 = i32;
                    i30 = i30;
                    strM56180 = strM56180;
                    sb4 = sb4;
                    i28 = i7;
                    i27 = i4;
                    i29 = i29;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0152 A[PHI: r0 r2 r3
      0x0152: PHI (r0v4 int) = (r0v2 int), (r0v3 int), (r0v2 int), (r0v2 int), (r0v2 int) binds: [B:52:0x0150, B:44:0x0119, B:36:0x00c5, B:32:0x00a3, B:27:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r2v4 int) = (r2v2 int), (r2v2 int), (r2v3 int), (r2v2 int), (r2v2 int) binds: [B:52:0x0150, B:44:0x0119, B:36:0x00c5, B:32:0x00a3, B:27:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:52:0x0150, B:44:0x0119, B:36:0x00c5, B:32:0x00a3, B:27:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0180  */
    /* JADX INFO: renamed from: ܽ */
    public static void m24291(SpannableStringBuilder spannableStringBuilder, String str) {
        int iM55680;
        int i;
        int iM55762 = 0;
        int iM55933 = 0;
        int i2 = 0;
        int i3 = 447926174;
        int i4 = C0845.f81821;
        int i5 = C0992.f81922;
        int iM55681 = C0873.m55680("ܿ֡") ^ i4;
        int i6 = ((iM55681 ^ i5) * (-1577)) ^ (-306560813);
        int i7 = 1346199669;
        while (true) {
            int i8 = iM55681 ^ i7;
            StyleSpan styleSpan = null;
            while (true) {
                i3 = ((((i3 ^ i5) * (-15343)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2045029254:
                    case 14058452:
                        if (C1048.f81963) {
                            iM55680 = (C0946.m55979("᩸֫") ^ i5) * 79;
                            i6 = ((iM55680 ^ i4) * (-1243)) ^ (-1758030876);
                            i = 1560738871;
                        } else {
                            iM55680 = C0873.m55680("᩻ۛ") ^ i4;
                            i6 = ((iM55680 ^ i5) * (-5623)) ^ (-1846267525);
                            i = -847431663;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1741673300:
                    case 1195375763:
                        C0947.m55997();
                        if (!C0892.f81851) {
                            iM55680 = (C0873.m55680("ۚۗ") + i4) * 41;
                            i6 = ((iM55680 ^ i5) * (-17953)) ^ (-340315290);
                            i = 1984056860;
                            i8 = iM55680 ^ i;
                        }
                        break;
                    case -1655074439:
                    case 809003479:
                        if (C1053.m56327() >= 0) {
                            iM55680 = C0873.m55680("᩻ۛ") ^ i4;
                            i6 = ((iM55680 ^ i5) * (-5623)) ^ (-1846267525);
                            i = -847431663;
                        } else {
                            iM55680 = (C0873.m55680("ۘ᩶") ^ i5) * 99;
                            i6 = ((iM55680 ^ i4) * 14605) ^ 1273263160;
                            i = 1115357079;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1557472952:
                    case 1372180128:
                        if (C0992.f81922 < 0) {
                            if (!C0927.f81875) {
                                C0873.m55690(spannableStringBuilder, new RelativeSizeSpan(1.1f), iM55762, C0894.m55762(spannableStringBuilder), i2);
                            }
                            iM55680 = (C0873.m55680("ۜۢ") ^ i5) * 45;
                            i6 = ((iM55680 ^ i4) * (-7487)) ^ 907900298;
                            i = -2107342291;
                            i8 = iM55680 ^ i;
                            break;
                        }
                        break;
                    case -1512470965:
                    case -131254185:
                        if (C0866.f81837 >= 0) {
                            iM55680 = (C0873.m55680("ۜۢ") ^ i5) * 45;
                            i6 = ((iM55680 ^ i4) * (-7487)) ^ 907900298;
                            i = -2107342291;
                        } else {
                            iM55680 = (C0873.m55680("ܰ᩷") ^ i5) * 59;
                            i6 = ((iM55680 ^ i4) * 2825) ^ (-277644232);
                            i = 1500343124;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1492123619:
                    case 1979648232:
                        iM55762 = C0894.m55762(spannableStringBuilder);
                        if (C0937.f81884) {
                            iM55680 = (C0873.m55680("᩵ۗ") + i4) * 45;
                            i6 = ((iM55680 ^ i5) * 965) ^ (-1479755140);
                            i = 896682440;
                        } else {
                            iM55680 = (C0873.m55680("ۜۢ") ^ i5) * 45;
                            i6 = ((iM55680 ^ i4) * (-7487)) ^ 907900298;
                            i = -2107342291;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1399284868:
                    case 1790254000:
                        if (C1404.f82149 >= 0) {
                            iM55680 = C0873.m55680("᩻ۛ") ^ i4;
                            i6 = ((iM55680 ^ i5) * (-5623)) ^ (-1846267525);
                            i = -847431663;
                        } else {
                            iM55680 = C0873.m55680("۬ۢ") ^ i4;
                            i6 = ((iM55680 ^ i5) * 29643) ^ 913908371;
                            i = 1501316726;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -613146092:
                    case -68659461:
                        iM55933 = RunnableC0938.m55933(spannableStringBuilder);
                        if (C1194.m56396() <= 0) {
                            iM55680 = (C0873.m55680("ۜۢ") ^ i5) * 45;
                            i6 = ((iM55680 ^ i4) * (-7487)) ^ 907900298;
                            i = -2107342291;
                        } else {
                            iM55680 = (C0946.m55979("ۘۜ") + i4) * 17;
                            i6 = ((iM55680 ^ i5) * 20839) ^ 1907720669;
                            i = 822581136;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -563833541:
                    case -167581009:
                        i2 = 33;
                        C0946.m55983(spannableStringBuilder, styleSpan, iM55762, iM55933, 33);
                        if (C1024.m56209() >= 0) {
                            iM55680 = (C0873.m55680("ۜۢ") ^ i5) * 45;
                            i6 = ((iM55680 ^ i4) * (-7487)) ^ 907900298;
                            i = -2107342291;
                        } else {
                            iM55680 = (C0873.m55680("ۤ᩺") ^ i5) * (-47);
                            i6 = ((iM55680 ^ i4) * 24951) ^ (-25328541);
                            i = -59750514;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case 137594138:
                    case 820875840:
                        C0992.m56107();
                        break;
                    case 825558790:
                    case 1056297230:
                        C0949.m56012();
                        break;
                    case 836443802:
                    case 1344255666:
                        C0861.m55626();
                        if (C1017.f81942 < 0) {
                        }
                        iM55680 = (C0946.m55979("᩸֫") ^ i5) * 79;
                        i6 = ((iM55680 ^ i4) * (-1243)) ^ (-1758030876);
                        i = 1560738871;
                        i8 = iM55680 ^ i;
                        break;
                    default:
                        C0854.m55604(spannableStringBuilder, str);
                        if (RunnableC0938.f81886 < 0) {
                            styleSpan = new StyleSpan(1);
                            if (C0906.m55809() > 0) {
                                iM55680 = C0873.m55680("֫ۢ") ^ i5;
                                i6 = ((iM55680 ^ i4) * (-15605)) ^ (-1617654005);
                                i = 373909916;
                                i8 = iM55680 ^ i;
                            }
                        }
                        break;
                }
                return;
            }
            iM55681 = (C0946.m55979("᩸֡") ^ i4) * (-97);
            i6 = ((iM55681 ^ i5) * (-15105)) ^ 168566234;
            i7 = 2080293584;
        }
    }
}
