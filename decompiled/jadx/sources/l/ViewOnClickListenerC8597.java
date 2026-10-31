package l;

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
import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.TwofishEngine;

/* JADX INFO: renamed from: l.ۡۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5MD */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC8597 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܶܺ᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f26255 = {5508, -23451, -31245, -26665, 2949, -18799, -18799, -18702, -18689, -18799, -18690, -18699, -18705, -18711, -18718, -18694, -18699, -18689, -18711, -18700, -18702, -18689, -18783, -18764, -18702, -18689, -18799, -18709, -18694, -18711, -18690, -18699, -18705, -18778, 9114, 12833, 4878, 12540, 12538, 12527, 12519, 12423, 3028, 7478, 7711, 9038, 9029, 9034, 9033, 9031, 9038, 9076, 9033, 9026, 9029, 9076, 9032, 9028, 9029, 9053, 9038, 9049, 9055, 9038, 9029, 9034, 9033, 9031, 9038, 9076, 9028, 9032, 9055, 9076, 9032, 9028, 9029, 9053, 9038, 9049, 9055, 8968, 9085, 9034, 9031, 9054, 9038, 8993, 8987, 9033, 9076, 8971, 8993, 9060, 9032, 9055, 8993, 9071, 9038, 9032, 8993, 9059, 9038, 9043, 8987, 9043, 9034, 9055, 9055, 9049, 8993, 9065, 9026, 9029, 9065, 9026, 9029, 9059, 9038, 9043, 8993, 8987, 9033, 8993, 8987, 9043, 8987, 8980, 8980, 8980, 9060, 9032, 9055, 9071, 9038, 9032, 8993, 9026, 9039, 8974, 8987, 8979, 9043, 8971, 697, 8971, 8980, 8980, 8980, 8993, 8987, 6086, 29630, -24655, -22313, -16484, 28055, -29381, -16569, 31475, -19569, -17247, -25820, -18918, 30720, -30711, 32354};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15651 f26256;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12534 f26257;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ViewOnClickListenerC12313 f26258;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C20592 f26259;

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
    
        if (l.C2105.f7037 == 0) goto L10;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m22316(ViewOnClickListenerC8597 viewOnClickListenerC8597) {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        int i5 = C1294.f4556;
        int i6 = C1773.f6144;
        int iM2567 = (C0630.m2566("ܽ֫") ^ i6) * (-13);
        int i7 = ((iM2567 ^ i5) * 28639) ^ 1297815354;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM2567 ^ (-1670499919);
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i9 = 0;
        short s3 = 0;
        int i10 = 0;
        int i11 = 179901928;
        Editable editableM9028 = null;
        C6480 c6480 = null;
        String strM1959 = null;
        Editable editableM12350 = null;
        C15651 c15651 = null;
        while (true) {
            i11 = i8 ^ (i7 & (((i11 ^ i5) * 8749) >> 31));
            switch (i11) {
                case -1944156068:
                case 2494223:
                    C5695.m16023();
                    break;
                case -1941935107:
                case -117009665:
                    c6480 = c6480;
                    editableM9028 = editableM9028;
                    if ((s * s3) - i9 <= 0) {
                        iM6981 = (C2105.m6981("ۧܺ") + i6) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM6981 ^ i5) * (-31229)) ^ (-575819015);
                        i2 = 157388104;
                    } else {
                        iM6981 = C0630.m2566("ۨۖ") ^ i5;
                        i = ((iM6981 ^ i6) * 19051) ^ 469408824;
                        i2 = 1910686604;
                    }
                    int i12 = iM6981 ^ i2;
                    editableM9028 = editableM9028;
                    i8 = i12;
                    i7 = i;
                    c6480 = c6480;
                    break;
                case -1916687509:
                case 1685358531:
                    C7106.m19120();
                    C1005.m3501();
                    break;
                case -1877482595:
                case 1806200855:
                    c6480 = viewOnClickListenerC8597.f26259.f66290;
                    editableM9028 = C2958.m9028(c15651);
                    if (C1504.f5354) {
                        iM2566 = C0630.m2566("ᩳ᩻") ^ i6;
                        i3 = ((iM2566 ^ i5) * 24609) ^ (-1105905914);
                        i4 = -1566529598;
                    } else {
                        iM2566 = (C0630.m2566("۠ۘ") ^ i6) * 55;
                        i3 = ((iM2566 ^ i5) * 16143) ^ 514172322;
                        i4 = -550510323;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case -1802385862:
                case 2066652552:
                    C3911.m11924();
                    if (C0483.f2088 < 0) {
                        c6480 = c6480;
                        editableM9028 = editableM9028;
                        iM6981 = (i5 - C2105.m6981("ᩴ᩹")) * (-59);
                        i = ((iM6981 ^ i6) * 18851) ^ 1310469860;
                        i2 = 1323684210;
                        int i13 = iM6981 ^ i2;
                        editableM9028 = editableM9028;
                        i8 = i13;
                        i7 = i;
                        c6480 = c6480;
                    }
                    c6480 = c6480;
                    editableM9028 = editableM9028;
                    iM6981 = (C0630.m2566("ܺ᩷") + i6) * (-67);
                    i = ((iM6981 ^ i5) * (-8269)) ^ (-692468);
                    i2 = -1604761052;
                    int i14 = iM6981 ^ i2;
                    editableM9028 = editableM9028;
                    i8 = i14;
                    i7 = i;
                    c6480 = c6480;
                    break;
                case -1751541733:
                case 112402640:
                    c6480 = c6480;
                    editableM9028 = editableM9028;
                    int i15 = s + s2;
                    i9 = i15 * i15;
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C0630.m2566("ۘۙ") ^ i5;
                        i = ((iM6981 ^ i6) * 23353) ^ 421247239;
                        i2 = -693820763;
                    } else {
                        iM6981 = C0630.m2566("֫ᩳ") ^ i6;
                        i = ((iM6981 ^ i5) * 29979) ^ (-1648343143);
                        i2 = 1974355179;
                    }
                    int i16 = iM6981 ^ i2;
                    editableM9028 = editableM9028;
                    i8 = i16;
                    i7 = i;
                    c6480 = c6480;
                    break;
                case -1380758528:
                case 541508038:
                    c6480 = c6480;
                    editableM9028 = editableM9028;
                    s = sArr[c];
                    s2 = 5879;
                    if (C7811.f24123 >= 0) {
                        iM6981 = C0630.m2566("ᩴۤ") ^ i5;
                        i = ((iM6981 ^ i6) * (-9493)) ^ 67654141;
                        i2 = 999967457;
                    } else {
                        iM6981 = (C0630.m2566("ۨ۟") + i5) * 95;
                        i = ((iM6981 ^ i6) * (-27613)) ^ (-1160990989);
                        i2 = -230770354;
                    }
                    int i17 = iM6981 ^ i2;
                    editableM9028 = editableM9028;
                    i8 = i17;
                    i7 = i;
                    c6480 = c6480;
                    break;
                case -1378751607:
                case 1277141562:
                    c6480 = c6480;
                    editableM9028 = editableM9028;
                    sArr2 = f26255;
                    if (C11340.f33930 < 0) {
                        iM6981 = (C2105.m6981("֨ۧ") ^ i6) * (-85);
                        i = ((iM6981 ^ i5) * (-22931)) ^ 1456713427;
                        i2 = -1184070837;
                        int i18 = iM6981 ^ i2;
                        editableM9028 = editableM9028;
                        i8 = i18;
                        i7 = i;
                        c6480 = c6480;
                    } else {
                        c6480 = c6480;
                        editableM9028 = editableM9028;
                        iM2566 = C0630.m2566("ᩳ᩻") ^ i6;
                        i3 = ((iM2566 ^ i5) * 24609) ^ (-1105905914);
                        i4 = -1566529598;
                        i8 = iM2566 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -1315737709:
                case -1013196536:
                    c6480 = c6480;
                    editableM9028 = editableM9028;
                    if (C3746.m11370(strM1959, C2272.m7507(sArr2, 35, 1, i10))) {
                        iM6981 = C2105.m6981("ۢ᩷") ^ i5;
                        i = ((iM6981 ^ i6) * 25899) ^ (-1288437038);
                        i2 = -996136471;
                    } else {
                        iM6981 = C0630.m2566("֡ۧ") ^ i5;
                        i = ((iM6981 ^ i6) * (-10039)) ^ 150851340;
                        i2 = 329841404;
                    }
                    int i19 = iM6981 ^ i2;
                    editableM9028 = editableM9028;
                    i8 = i19;
                    i7 = i;
                    c6480 = c6480;
                    break;
                case -1307014789:
                case 1528033077:
                    c6480 = c6480;
                    editableM9028 = editableM9028;
                    s3 = 23516;
                    if (C4075.m12263() <= 0) {
                        iM6981 = (i5 - C2105.m6981("ᩴ᩹")) * (-59);
                        i = ((iM6981 ^ i6) * 18851) ^ 1310469860;
                        i2 = 1323684210;
                    } else {
                        iM6981 = (i5 - C2105.m6981("ܶܽ")) * (-59);
                        i = ((iM6981 ^ i6) * (-26439)) ^ 1372490352;
                        i2 = 628316169;
                    }
                    int i110 = iM6981 ^ i2;
                    editableM9028 = editableM9028;
                    i8 = i110;
                    i7 = i;
                    c6480 = c6480;
                    break;
                case -1130301007:
                case -878675346:
                    break;
                case -1091835970:
                case 1007561177:
                    c6480 = c6480;
                    editableM9028 = editableM9028;
                    sArr = f26255;
                    if (C0382.f1805) {
                        iM6981 = (i5 - C2105.m6981("ۘۡ")) * (-101);
                        i = ((iM6981 ^ i6) * 689) ^ (-476226139);
                        i2 = 701211477;
                    } else {
                        iM6981 = (i5 - C2105.m6981("ᩴ᩹")) * (-59);
                        i = ((iM6981 ^ i6) * 18851) ^ 1310469860;
                        i2 = 1323684210;
                    }
                    int i111 = iM6981 ^ i2;
                    editableM9028 = editableM9028;
                    i8 = i111;
                    i7 = i;
                    c6480 = c6480;
                    break;
                case -940907465:
                case 1448788786:
                    i10 = 12814;
                    iM6981 = C2105.m6981("ᩴܳ") ^ i6;
                    i = ((iM6981 ^ i5) * (-25639)) ^ 484535622;
                    i2 = 415547273;
                    int i112 = iM6981 ^ i2;
                    editableM9028 = editableM9028;
                    i8 = i112;
                    i7 = i;
                    c6480 = c6480;
                    break;
                case -705882097:
                case 1260193738:
                    c6480.filter(editableM9028, c15651);
                    if (!C0798.f2919) {
                        c6480 = c6480;
                        editableM9028 = editableM9028;
                        ViewOnClickListenerC1958.m6443(new RunnableC14240(0, c15651), 100L);
                        iM6981 = C0630.m2566("֡ۧ") ^ i5;
                        i = ((iM6981 ^ i6) * (-10039)) ^ 150851340;
                        i2 = 329841404;
                        int i113 = iM6981 ^ i2;
                        editableM9028 = editableM9028;
                        i8 = i113;
                        i7 = i;
                        c6480 = c6480;
                    }
                    c6480 = c6480;
                    editableM9028 = editableM9028;
                    iM6981 = (C0630.m2566("ܺ᩷") + i6) * (-67);
                    i = ((iM6981 ^ i5) * (-8269)) ^ (-692468);
                    i2 = -1604761052;
                    int i114 = iM6981 ^ i2;
                    editableM9028 = editableM9028;
                    i8 = i114;
                    i7 = i;
                    c6480 = c6480;
                    break;
                case -668129085:
                case 500283654:
                    c6480 = c6480;
                    editableM9028 = editableM9028;
                    c = '\"';
                    if (C11340.f33930 >= 0) {
                        iM6981 = (C0630.m2566("ܺ᩷") + i6) * (-67);
                        i = ((iM6981 ^ i5) * (-8269)) ^ (-692468);
                        i2 = -1604761052;
                    } else {
                        iM6981 = C2105.m6981("ܰܺ") ^ i6;
                        i = ((iM6981 ^ i5) * (-24595)) ^ (-517398323);
                        i2 = -2096182276;
                    }
                    int i115 = iM6981 ^ i2;
                    editableM9028 = editableM9028;
                    i8 = i115;
                    i7 = i;
                    c6480 = c6480;
                    break;
                case -555046583:
                case 1324898592:
                    i10 = 56167;
                    iM6981 = C2105.m6981("ᩴܳ") ^ i6;
                    i = ((iM6981 ^ i5) * (-25639)) ^ 484535622;
                    i2 = 415547273;
                    int i116 = iM6981 ^ i2;
                    editableM9028 = editableM9028;
                    i8 = i116;
                    i7 = i;
                    c6480 = c6480;
                    break;
                case -503174764:
                case 914023744:
                    c6480 = c6480;
                    editableM9028 = editableM9028;
                    c15651 = viewOnClickListenerC8597.f26256;
                    editableM12350 = C4117.m12350(c15651);
                    if (!C0483.m2121()) {
                        c6480 = c6480;
                        editableM9028 = editableM9028;
                        iM2566 = C0630.m2566("ᩳ᩻") ^ i6;
                        i3 = ((iM2566 ^ i5) * 24609) ^ (-1105905914);
                        i4 = -1566529598;
                        i8 = iM2566 ^ i4;
                        i7 = i3;
                    } else {
                        iM6981 = (i6 - C0630.m2566("۟ۡ")) * 83;
                        i = ((iM6981 ^ i5) * 15101) ^ (-1991560192);
                        i2 = 1718440984;
                        int i117 = iM6981 ^ i2;
                        editableM9028 = editableM9028;
                        i8 = i117;
                        i7 = i;
                        c6480 = c6480;
                    }
                    break;
                case 746568095:
                case 1098001508:
                    c6480 = c6480;
                    editableM9028 = editableM9028;
                    strM1959 = C0422.m1959(editableM12350);
                    if (C0050.f910 >= 0) {
                        iM6981 = (C0630.m2566("ܺ᩷") + i6) * (-67);
                        i = ((iM6981 ^ i5) * (-8269)) ^ (-692468);
                        i2 = -1604761052;
                    } else {
                        iM6981 = C2105.m6981("ۨ۠") ^ i5;
                        i = ((iM6981 ^ i6) * 1329) ^ (-1122987354);
                        i2 = -484980503;
                    }
                    int i118 = iM6981 ^ i2;
                    editableM9028 = editableM9028;
                    i8 = i118;
                    i7 = i;
                    c6480 = c6480;
                    break;
                case 1549067892:
                case 2041401231:
                    C1711.m5736();
                    C1420.m4913();
                    c6480 = c6480;
                    editableM9028 = editableM9028;
                    iM6981 = (C0630.m2566("ܺ᩷") + i6) * (-67);
                    i = ((iM6981 ^ i5) * (-8269)) ^ (-692468);
                    i2 = -1604761052;
                    int i119 = iM6981 ^ i2;
                    editableM9028 = editableM9028;
                    i8 = i119;
                    i7 = i;
                    c6480 = c6480;
                    break;
                default:
                    RunnableC1937.m6387();
                    if (!RunnableC1108.f4040) {
                        c6480 = c6480;
                        editableM9028 = editableM9028;
                        iM6981 = C0630.m2566("ۘۙ") ^ i5;
                        i = ((iM6981 ^ i6) * 23353) ^ 421247239;
                        i2 = -693820763;
                        int i1110 = iM6981 ^ i2;
                        editableM9028 = editableM9028;
                        i8 = i1110;
                        i7 = i;
                        c6480 = c6480;
                    } else {
                        iM2566 = C0630.m2566("ᩳ᩻") ^ i6;
                        i3 = ((iM2566 ^ i5) * 24609) ^ (-1105905914);
                        i4 = -1566529598;
                        i8 = iM2566 ^ i4;
                        i7 = i3;
                    }
                    break;
            }
            return;
        }
    }

    public ViewOnClickListenerC8597(ViewOnClickListenerC12313 viewOnClickListenerC12313, View view, C12534 c12534) {
        short[] sArr;
        int iM6981;
        int i;
        int i2;
        View viewM3507 = null;
        C15651 c15651 = null;
        int i3 = 0;
        int iM6982 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = -242229087;
        int i6 = C3432.f10845;
        int i7 = C1047.f3863;
        short s = f26255[0];
        int i8 = s + 19852;
        int i9 = (s * 79408) - (i8 * i8) > 0 ? 22906 : 55407;
        int iM6983 = C2105.m6981("ۗۡ") ^ i6;
        int i10 = ((iM6983 ^ i7) * 6011) ^ (-871346423);
        int i11 = -1059070423;
        while (true) {
            int i12 = iM6983 ^ i11;
            while (true) {
                i5 = ((((i5 ^ i7) * (-24691)) >> 31) & i10) ^ i12;
                switch (i5) {
                    case -2124953488:
                    case -818573941:
                        c15651 = (C15651) viewM3507;
                        if (C4075.f12947 < 0) {
                            iM6983 = (C0630.m2566("ۖᩴ") + i6) * (-13);
                            i10 = ((iM6983 ^ i7) * 18275) ^ (-27448269);
                            i11 = -1967482319;
                        }
                        sArr = sArr2;
                        iM6981 = C2105.m6981("ۘܶ") ^ i6;
                        i = ((iM6981 ^ i7) * 2767) ^ 387596840;
                        i2 = -259401963;
                        sArr2 = sArr;
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -1953715741:
                    case 798841027:
                        c15651.addTextChangedListener(new C9303());
                        if (C3245.f10203 > 0) {
                            iM6983 = (C0630.m2566("ۛܶ") + i6) * (-29);
                            i10 = ((iM6983 ^ i7) * 10399) ^ 2119151965;
                            i11 = 1605784588;
                        } else {
                            iM6983 = C2105.m6981("᩸ۤ") ^ i7;
                            i10 = ((iM6983 ^ i6) * 26017) ^ (-1224614499);
                            i11 = 905656239;
                        }
                        break;
                    case -1904881830:
                    case 1167939427:
                        if (C4075.f12947 < 0) {
                            iM6983 = C2105.m6981("᩸ۤ") ^ i7;
                            i10 = ((iM6983 ^ i6) * 26017) ^ (-1224614499);
                            i11 = 905656239;
                            break;
                        }
                        iM6983 = C0630.m2566("ۢܽ") ^ i7;
                        i10 = ((iM6983 ^ i6) * (-29073)) ^ (-1155416423);
                        i11 = -1254931660;
                    case -1895654569:
                    case 538910006:
                        i4 = 1;
                        if (C3683.f11629 < 0) {
                            iM6983 = C0630.m2566("ۖܿ") ^ i6;
                            i10 = ((iM6983 ^ i7) * 7557) ^ 1754020452;
                            i11 = -1948557432;
                        } else {
                            iM6983 = C0630.m2566("ۢܽ") ^ i7;
                            i10 = ((iM6983 ^ i6) * (-29073)) ^ (-1155416423);
                            i11 = -1254931660;
                        }
                        break;
                    case -1481798439:
                    case 944478918:
                        C4075.m12263();
                        throw new RuntimeException();
                    case -1199568470:
                    case 2138617466:
                        C1711.m5736();
                        C1005.m3501();
                        iM6983 = C0630.m2566("ۢܽ") ^ i7;
                        i10 = ((iM6983 ^ i6) * (-29073)) ^ (-1155416423);
                        i11 = -1254931660;
                        break;
                    case -1159677241:
                    case -1077728444:
                        C4159.m12565();
                        if (C1916.m6308() < 0) {
                            iM6983 = C2105.m6981("ۘܺ") ^ i6;
                            i10 = ((iM6983 ^ i7) * (-24893)) ^ 1562435853;
                            i11 = -558317605;
                        } else {
                            iM6983 = C2105.m6981("᩸ۤ") ^ i7;
                            i10 = ((iM6983 ^ i6) * 26017) ^ (-1224614499);
                            i11 = 905656239;
                        }
                        break;
                    case -851578139:
                    case 1053810569:
                        iM6982 = C2105.m6981(C11340.m28025(sArr2, i4, 3, i9));
                        if (!C1711.f5919) {
                            iM6983 = C0630.m2566("۠ۢ") ^ i6;
                            i10 = ((iM6983 ^ i7) * (-7395)) ^ 813786912;
                            i11 = -1682325154;
                        } else {
                            iM6983 = C0630.m2566("ۢܽ") ^ i7;
                            i10 = ((iM6983 ^ i6) * (-29073)) ^ (-1155416423);
                            i11 = -1254931660;
                        }
                        break;
                    case -566065432:
                    case -565674580:
                        C4159.m12564(C1005.m3507(view, i3), this);
                        if (!C2520.m8026()) {
                            iM6983 = (C0630.m2566("ۚܺ") ^ i7) * 41;
                            i10 = ((iM6983 ^ i6) * (-20953)) ^ 2126357999;
                            i11 = 601294802;
                        } else {
                            iM6983 = (C0630.m2566("ᩴܳ") ^ i7) * (-75);
                            i10 = ((iM6983 ^ i6) * 1907) ^ (-1733498927);
                            i11 = 858232714;
                        }
                        break;
                    case 128256963:
                    case 783107700:
                        viewM3507 = C1005.m3507(view, 2128037467 ^ iM6982);
                        if (!C2126.f7087) {
                            iM6983 = C0630.m2566("᩷᩺") ^ i7;
                            i10 = ((iM6983 ^ i6) * 12297) ^ (-2123911095);
                            i11 = 204243962;
                        } else {
                            iM6983 = C2105.m6981("᩸ۤ") ^ i7;
                            i10 = ((iM6983 ^ i6) * 26017) ^ (-1224614499);
                            i11 = 905656239;
                        }
                        break;
                    case 130894840:
                    case 590257221:
                        c15651.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ܿۖᩳ
                            @Override // android.widget.AdapterView.OnItemClickListener
                            public final void onItemClick(AdapterView adapterView, View view2, int i13, long j) {
                                ViewOnClickListenerC8597.m22316(this.f52316);
                            }
                        });
                        return;
                    case 782968193:
                    case 1005262691:
                        i3 = R.id.button1;
                        if (!RunnableC1108.f4040) {
                            iM6983 = (C0630.m2566("ᩴܳ") ^ i7) * (-75);
                            i10 = ((iM6983 ^ i6) * 1907) ^ (-1733498927);
                            i11 = 858232714;
                            break;
                        }
                        iM6983 = (C2105.m6981("ۧܽ") ^ i6) * (-21);
                        i10 = ((iM6983 ^ i7) * (-18705)) ^ 632709289;
                        i11 = -82675358;
                        break;
                    case 1196547587:
                    case 1763602689:
                        this.f26256 = c15651;
                        if (C3663.m11168() < 0) {
                            C20592 c20592 = new C20592(this, viewOnClickListenerC12313);
                            this.f26259 = c20592;
                            c15651.setAdapter(c20592);
                            if (!RunnableC1108.f4040) {
                                iM6983 = C2105.m6981("᩸ۤ") ^ i7;
                                i10 = ((iM6983 ^ i6) * 26017) ^ (-1224614499);
                                i11 = 905656239;
                                break;
                            }
                            iM6983 = C2105.m6981("᩵ۧ") ^ i7;
                            i10 = ((iM6983 ^ i6) * (-17203)) ^ (-1895160427);
                            i11 = -1546642438;
                            break;
                        }
                        iM6983 = (C0630.m2566("ᩴܳ") ^ i7) * (-75);
                        i10 = ((iM6983 ^ i6) * 1907) ^ (-1733498927);
                        i11 = 858232714;
                        break;
                    case 1708395467:
                    case 1976262635:
                        this.f26258 = viewOnClickListenerC12313;
                        this.f26257 = c12534;
                        sArr = f26255;
                        if (C3537.f11231 >= 0) {
                            iM6981 = C2105.m6981("ۘܶ") ^ i6;
                            i = ((iM6981 ^ i7) * 2767) ^ 387596840;
                            i2 = -259401963;
                        } else {
                            iM6981 = C2105.m6981("ۤ᩹") ^ i7;
                            i = ((iM6981 ^ i6) * (-8135)) ^ 1433786069;
                            i2 = -1385699254;
                        }
                        sArr2 = sArr;
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    default:
                        C2105.m6982();
                        if (C3663.f11553) {
                            iM6983 = C0630.m2566("ۢܽ") ^ i7;
                            i10 = ((iM6983 ^ i6) * (-29073)) ^ (-1155416423);
                            i11 = -1254931660;
                        }
                        sArr = sArr2;
                        iM6981 = C2105.m6981("ۘܶ") ^ i6;
                        i = ((iM6981 ^ i7) * 2767) ^ 387596840;
                        i2 = -259401963;
                        sArr2 = sArr;
                        i12 = iM6981 ^ i2;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22317(ViewOnClickListenerC8597 viewOnClickListenerC8597, int i) {
        int iM6981;
        int i2;
        int i3;
        int i4 = C3537.f11231;
        int i5 = C0483.f2088;
        int iM6982 = (C2105.m6981("ܿۢ") ^ i5) * (-3);
        int i6 = ((iM6982 ^ i4) * 8365) ^ 1783381351;
        Integer numM4916 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM6982 ^ (-2008347371);
        C15651 c15651 = null;
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
                    if (C11340.m28031()) {
                        iM6981 = C0630.m2566("ۢ֨") ^ i5;
                        i2 = ((iM6981 ^ i4) * 12609) ^ 1353114265;
                        i3 = 205490981;
                    } else {
                        iM6981 = C2105.m6981("᩷ۧ") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-20149)) ^ 440026963;
                        i3 = -1053920454;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case -1837231121:
                case 1913469912:
                    C3663.m11168();
                    break;
                case -1753850053:
                case 373605323:
                    if (C3432.f10845 >= 0) {
                        iM6981 = C2105.m6981("ۘ᩻") ^ i4;
                        i2 = ((iM6981 ^ i5) * 4187) ^ 1010812697;
                        i3 = -1548429007;
                    } else {
                        iM6981 = C0630.m2566("᩺۫") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-18131)) ^ 3800787;
                        i3 = -1739002706;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case -1501214311:
                case -1250792123:
                    c15651 = viewOnClickListenerC8597.f26256;
                    numM4916 = C1420.m4916(i);
                    i16 = 1;
                    if (RunnableC0588.f2309 < 0) {
                        iM6981 = C2105.m6981("۫ۧ") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-12423)) ^ 1689357475;
                        i3 = 1832771738;
                        i7 = iM6981 ^ i3;
                        i6 = i2;
                    } else {
                        int iM2566 = (i5 - C0630.m2566("ۡۢ")) * 95;
                        i6 = ((iM2566 ^ i4) * 19597) ^ 1435352128;
                        i7 = iM2566 ^ 986501233;
                    }
                    break;
                case -1272379135:
                case -776297791:
                    sArr = f26255;
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = C2105.m6981("᩷ۧ") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-20149)) ^ 440026963;
                        i3 = -1053920454;
                    } else {
                        iM6981 = C2105.m6981("ۖۚ") ^ i4;
                        i2 = ((iM6981 ^ i5) * 1557) ^ (-1286629181);
                        i3 = -2090605240;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case -1207457731:
                case -573698375:
                    sArr2 = f26255;
                    i14 = 37;
                    i8 = 5;
                    if (AbstractC2021.m6574()) {
                        iM6981 = C0630.m2566("᩺۫") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-18131)) ^ 3800787;
                        i3 = -1739002706;
                    } else {
                        iM6981 = (C0630.m2566("ۜܺ") + i5) * (-7);
                        i2 = ((iM6981 ^ i4) * (-27857)) ^ (-1705536442);
                        i3 = 69845829;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case -1002434378:
                case -753138144:
                    objArr[0] = numM4916;
                    if (C3911.f12484 >= 0) {
                        iM6981 = C2105.m6981("᩷ۧ") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-20149)) ^ 440026963;
                        i3 = -1053920454;
                    } else {
                        iM6981 = (i4 - C0630.m2566("᩺᩷")) * (-37);
                        i2 = ((iM6981 ^ i5) * (-26131)) ^ (-1504603544);
                        i3 = 1836426150;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case -986006808:
                case 1707468495:
                    i9 = s + s2;
                    if (C3245.f10203 <= 0) {
                        iM6981 = C0630.m2566("ۚᩴ") ^ i4;
                        i2 = ((iM6981 ^ i5) * 7445) ^ 941091839;
                        i3 = 1188019627;
                    } else {
                        iM6981 = (C0630.m2566("᩵ᩳ") ^ i5) * (-37);
                        i2 = ((iM6981 ^ i4) * (-12443)) ^ 1218703866;
                        i3 = -1142037209;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case -500473444:
                case 710705191:
                    C1047.m3601(c15651, String.format(C3663.m11162(sArr2, i14, i8, i13), objArr));
                    break;
                case -318633122:
                case 1281034108:
                    s = sArr[c];
                    s2 = 11905;
                    if (C2167.f7158 >= 0) {
                        iM6981 = C2105.m6981("ۘ᩻") ^ i4;
                        i2 = ((iM6981 ^ i5) * 4187) ^ 1010812697;
                        i3 = -1548429007;
                    } else {
                        iM6981 = (C0630.m2566("᩷ۢ") + i5) * (-87);
                        i2 = ((iM6981 ^ i4) * 11915) ^ 200074779;
                        i3 = 1277262001;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case -150476113:
                case 831629675:
                    C2958.m9034();
                    if (C1420.f5096 > 0) {
                        iM6981 = C2105.m6981("ۘ᩻") ^ i4;
                        i2 = ((iM6981 ^ i5) * 4187) ^ 1010812697;
                        i3 = -1548429007;
                    } else {
                        iM6981 = C2105.m6981("᩷ۧ") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-20149)) ^ 440026963;
                        i3 = -1053920454;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case -78202848:
                case 278152224:
                    C1711.m5736();
                    iM6981 = C2105.m6981("ۘ᩻") ^ i4;
                    i2 = ((iM6981 ^ i5) * 4187) ^ 1010812697;
                    i3 = -1548429007;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case 234675193:
                case 556965676:
                    int i17 = i11 + i12;
                    if (i10 - (i17 + i17) <= 0) {
                        iM6981 = (C2105.m6981("۬ۤ") + i5) * (-67);
                        i2 = ((iM6981 ^ i4) * 22951) ^ 1284583986;
                        i3 = -1097956521;
                    } else {
                        iM6981 = (C0630.m2566("ۘܿ") ^ i4) * 65;
                        i2 = ((iM6981 ^ i5) * 1019) ^ 597366341;
                        i3 = 511055969;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case 294533227:
                case 2075235432:
                    i10 = i9 * i9;
                    i11 = s * s;
                    i12 = 141729025;
                    if (RunnableC1108.f4040) {
                        iM6981 = C0630.m2566("֡᩸") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-15755)) ^ 299190275;
                        i3 = -599449788;
                    } else {
                        iM6981 = C0630.m2566("᩺۫") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-18131)) ^ 3800787;
                        i3 = -1739002706;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case 654837144:
                case 1392684649:
                    i13 = 12511;
                    iM6981 = C0630.m2566("֨ۡ") ^ i4;
                    i2 = ((iM6981 ^ i5) * (-8497)) ^ 673802828;
                    i3 = 2000483306;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case 809136788:
                case 1390031814:
                    c = '$';
                    if (C1773.f6144 <= 0) {
                        iM6981 = C0630.m2566("ۚᩴ") ^ i4;
                        i2 = ((iM6981 ^ i5) * 7445) ^ 941091839;
                        i3 = 1188019627;
                    } else {
                        iM6981 = (C2105.m6981("ۢ۫") ^ i4) * (-31);
                        i2 = ((iM6981 ^ i5) * 18305) ^ 52282754;
                        i3 = 2004731133;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case 1099632471:
                case 1199079708:
                    RunnableC1937.m6387();
                    if (AbstractC2021.f6743 <= 0) {
                        int iM2567 = (i5 - C0630.m2566("ۡۢ")) * 95;
                        i6 = ((iM2567 ^ i4) * 19597) ^ 1435352128;
                        i7 = iM2567 ^ 986501233;
                    } else {
                        iM6981 = C2105.m6981("᩷ۧ") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-20149)) ^ 440026963;
                        i3 = -1053920454;
                        i7 = iM6981 ^ i3;
                        i6 = i2;
                    }
                    break;
                case 1582938636:
                case 1699896723:
                    i13 = 21803;
                    iM6981 = C0630.m2566("֨ۡ") ^ i4;
                    i2 = ((iM6981 ^ i5) * (-8497)) ^ 673802828;
                    i3 = 2000483306;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                default:
                    if (C4263.f13799 <= 0) {
                        iM6981 = C2105.m6981("ۘ᩻") ^ i4;
                        i2 = ((iM6981 ^ i5) * 4187) ^ 1010812697;
                        i3 = -1548429007;
                    } else {
                        iM6981 = (C0630.m2566("ܺ֡") ^ i5) * 115;
                        i2 = ((iM6981 ^ i4) * 17837) ^ (-210283346);
                        i3 = -323809171;
                    }
                    i7 = iM6981 ^ i3;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22318(ViewOnClickListenerC8597 viewOnClickListenerC8597, DialogInterfaceC0206 dialogInterfaceC0206, ArrayList arrayList, int i) {
        int iM6981;
        int i2;
        int i3;
        int i4 = C3537.f11231;
        int i5 = C1047.f3863;
        int iM6982 = (C2105.m6981("֫ۧ") + i4) * (-123);
        int i6 = ((iM6982 ^ i5) * (-20731)) ^ (-565420080);
        String strM12351 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM6982 ^ 1926811003;
        int iM6384 = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -982368052;
        String strMo47886 = null;
        Object obj = null;
        Object objM9263 = null;
        C15651 c15651 = null;
        while (true) {
            i12 = i7 ^ (i6 & (((i12 ^ i5) * 4235) >> 31));
            switch (i12) {
                case -1977361125:
                case -442515605:
                    C1047.m3601(c15651, strM12351);
                    iM6384 = RunnableC1937.m6384(c15651);
                    if (!C0798.f2919) {
                        iM6981 = C2105.m6981("ۤ᩻") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-13427)) ^ (-1281007557);
                        i3 = 2056615732;
                        i7 = iM6981 ^ i3;
                        i6 = i2;
                    } else {
                        int iM6983 = (i4 - C2105.m6981("ᩴ᩵")) * 11;
                        i6 = ((iM6983 ^ i5) * (-17841)) ^ (-1203569320);
                        i7 = iM6983 ^ (-1717381278);
                    }
                    break;
                case -1687293759:
                case 1697615311:
                    C0050.m940();
                    C3683.m11222();
                    break;
                case -1435066411:
                case -135429558:
                    c15651.setSelection(0, iM6384);
                    C1711.m5740(c15651);
                    c15651.performHapticFeedback(0);
                    break;
                case -1398028179:
                case 777285316:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = C2105.m6981("ۚᩳ") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-25795)) ^ (-922220786);
                        i3 = -1015481885;
                    } else {
                        iM6981 = C0630.m2566("᩻᩵") ^ i5;
                        i2 = ((iM6981 ^ i4) * 9187) ^ 1549203389;
                        i3 = 933685643;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case -1293315963:
                case 402378278:
                    strM12351 = C4117.m12351(C3683.m11225(sArr2, i11, 1, i10), strMo47886);
                    if (C1711.f5919) {
                        iM6981 = (i4 - C0630.m2566("ۘۘ")) * 83;
                        i2 = ((iM6981 ^ i5) * 24609) ^ (-1289547742);
                        i3 = 1114102100;
                    } else {
                        iM6981 = C2105.m6981("֡۬") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-30675)) ^ 309344984;
                        i3 = 123432217;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case -1159879752:
                case 694967374:
                    sArr = f26255;
                    if (C22628.f73083 <= 0) {
                        iM6981 = C2105.m6981("֡᩶") ^ i4;
                        i2 = ((iM6981 ^ i5) * 31533) ^ 1672416883;
                        i3 = -1450296497;
                    } else {
                        iM6981 = C0630.m2566("ۜۗ") ^ i5;
                        i2 = ((iM6981 ^ i4) * 323) ^ 59970025;
                        i3 = -1345050426;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case -1127210070:
                case -497311233:
                    C0050.m940();
                    if (C4117.m12364() != 0) {
                        iM6981 = (C2105.m6981("ۙ᩹") ^ i5) * (-7);
                        i2 = ((iM6981 ^ i4) * (-4663)) ^ 1168002915;
                        i3 = 1143518189;
                        i7 = iM6981 ^ i3;
                        i6 = i2;
                    } else {
                        int iM6984 = (i4 - C2105.m6981("ᩴ᩵")) * 11;
                        i6 = ((iM6984 ^ i5) * (-17841)) ^ (-1203569320);
                        i7 = iM6984 ^ (-1717381278);
                    }
                    break;
                case -766812788:
                case 758612899:
                    C3663.m11167(dialogInterfaceC0206);
                    c15651 = viewOnClickListenerC8597.f26256;
                    objM9263 = C3019.m9263(arrayList, i);
                    if (C2105.m6982() == 0) {
                        iM6981 = C0630.m2566("ܳۤ") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-24367)) ^ (-1592270822);
                        i3 = 1637372224;
                        i7 = iM6981 ^ i3;
                        i6 = i2;
                    } else {
                        int iM6985 = (i4 - C2105.m6981("ᩴ᩵")) * 11;
                        i6 = ((iM6985 ^ i5) * (-17841)) ^ (-1203569320);
                        i7 = iM6985 ^ (-1717381278);
                    }
                    break;
                case -414802426:
                case -317115243:
                    strMo47886 = ((InterfaceC21211) obj).mo47886();
                    sArr2 = f26255;
                    i11 = 43;
                    if (C11340.f33930 >= 0) {
                        iM6981 = (i4 - C0630.m2566("ۘۘ")) * 83;
                        i2 = ((iM6981 ^ i5) * 24609) ^ (-1289547742);
                        i3 = 1114102100;
                    } else {
                        iM6981 = C0630.m2566("֨ᩳ") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-15963)) ^ (-1082498261);
                        i3 = -968750169;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case -377501738:
                case 1092329157:
                    i10 = 7542;
                    iM6981 = (C0630.m2566("᩹ۘ") + i5) * (-115);
                    i2 = ((iM6981 ^ i4) * 20525) ^ 395045877;
                    i3 = 1553355883;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case -367568158:
                case 10845659:
                    if (i8 - (i9 + 1) < 0) {
                        iM6981 = C0630.m2566("֨ۜ") ^ i4;
                        i2 = ((iM6981 ^ i5) * 24741) ^ (-1044521623);
                        i3 = 94957441;
                    } else {
                        iM6981 = C2105.m6981("ۤۤ") ^ i5;
                        i2 = ((iM6981 ^ i4) * 31037) ^ 273525700;
                        i3 = 1678188095;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case -365672794:
                case 1231525381:
                    if (C4075.f12947 >= 0) {
                        iM6981 = C2105.m6981("ۚᩳ") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-25795)) ^ (-922220786);
                        i3 = -1015481885;
                    } else {
                        iM6981 = (C2105.m6981("۬ۨ") ^ i4) * 83;
                        i2 = ((iM6981 ^ i5) * 16247) ^ 241946516;
                        i3 = -781534650;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case -320818632:
                case 1297536496:
                    obj = ((C10220) objM9263).f30697;
                    if (C1711.f5919) {
                        iM6981 = C2105.m6981("֡᩶") ^ i4;
                        i2 = ((iM6981 ^ i5) * 31533) ^ 1672416883;
                        i3 = -1450296497;
                    } else {
                        iM6981 = (C0630.m2566("ۡ۠") + i4) * 47;
                        i2 = ((iM6981 ^ i5) * 26563) ^ 2000389529;
                        i3 = 1815650258;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case -184389588:
                case 1704541580:
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C2105.m6981("֡᩶") ^ i4;
                        i2 = ((iM6981 ^ i5) * 31533) ^ 1672416883;
                        i3 = -1450296497;
                        i7 = iM6981 ^ i3;
                        i6 = i2;
                    } else {
                        int iM6986 = (i4 - C2105.m6981("ᩴ᩵")) * 11;
                        i6 = ((iM6986 ^ i5) * (-17841)) ^ (-1203569320);
                        i7 = iM6986 ^ (-1717381278);
                    }
                    break;
                case 514240975:
                case 1308627539:
                    C2126.m7040();
                    C0237.m1481();
                    int iM6987 = (i4 - C2105.m6981("ᩴ᩵")) * 11;
                    i6 = ((iM6987 ^ i5) * (-17841)) ^ (-1203569320);
                    i7 = iM6987 ^ (-1717381278);
                    break;
                case 581760724:
                case 699630133:
                    s = sArr[42];
                    s2 = 1;
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C2105.m6981("ۚᩳ") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-25795)) ^ (-922220786);
                        i3 = -1015481885;
                    } else {
                        iM6981 = (C2105.m6981("᩹ۤ") ^ i4) * 87;
                        i2 = ((iM6981 ^ i5) * (-6401)) ^ 524097404;
                        i3 = 127744634;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case 847242643:
                case 1104529645:
                    int i13 = s + s2;
                    i8 = i13 * i13;
                    i9 = s * 2;
                    if (C3663.m11168() >= 0) {
                        iM6981 = (C2105.m6981("ۙ᩹") ^ i5) * (-7);
                        i2 = ((iM6981 ^ i4) * (-4663)) ^ 1168002915;
                        i3 = 1143518189;
                    } else {
                        iM6981 = C0630.m2566("֫᩻") ^ i4;
                        i2 = ((iM6981 ^ i5) * 11943) ^ (-1178497956);
                        i3 = 1001299096;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    break;
                case 2016935920:
                case 2108167453:
                    ViewOnClickListenerC1958.m6429();
                    if (C22628.f73083 > 0) {
                        iM6981 = C2105.m6981("ۚᩳ") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-25795)) ^ (-922220786);
                        i3 = -1015481885;
                        i7 = iM6981 ^ i3;
                        i6 = i2;
                    } else {
                        int iM6988 = (i4 - C2105.m6981("ᩴ᩵")) * 11;
                        i6 = ((iM6988 ^ i5) * (-17841)) ^ (-1203569320);
                        i7 = iM6988 ^ (-1717381278);
                    }
                    break;
                default:
                    i10 = 57781;
                    iM6981 = (C0630.m2566("᩹ۘ") + i5) * (-115);
                    i2 = ((iM6981 ^ i4) * 20525) ^ 395045877;
                    i3 = 1553355883;
                    i7 = iM6981 ^ i3;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22325() {
        /*
            Method dump skipped, instruction units count: 2188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC8597.m22325():void");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:49:0x0122  */
    /* JADX WARN: Code duplicated, block: B:54:0x0163  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22314(SpannableStringBuilder spannableStringBuilder, String str) {
        int iM2566;
        int i;
        int iM3592 = 0;
        int iM3593 = 0;
        int i2 = 809150045;
        int i3 = C22628.f73083;
        int i4 = ServiceConnectionC3453.f10921;
        int iM2567 = C0630.m2566("֡ۢ") ^ i3;
        int i5 = ((iM2567 ^ i4) * 32607) ^ 781228;
        int i6 = 194482409;
        while (true) {
            int i7 = iM2567 ^ i6;
            StyleSpan styleSpan = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-31559)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1994935138:
                    case 72084479:
                        C2520.m8026();
                        if (C3683.f11629 >= 0) {
                            iM2566 = (i3 - C2105.m6981("ۙᩴ")) * 123;
                            i5 = ((iM2566 ^ i4) * 32069) ^ 2049960134;
                            i = -1509118633;
                        } else {
                            iM2566 = C0630.m2566("ۡ۟") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-28983)) ^ 236319445;
                            i = 2092470274;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1957310278:
                    case -418520320:
                        if (C1504.m5179()) {
                            iM2566 = (C0630.m2566("᩹ܳ") + i4) * 35;
                            i5 = ((iM2566 ^ i3) * 1979) ^ (-1285137940);
                            i = -1668046260;
                        } else {
                            iM2566 = (C0630.m2566("ۘۧ") + i4) * 87;
                            i5 = ((iM2566 ^ i3) * (-9555)) ^ 957266659;
                            i = 26832823;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1803984373:
                    case -1283043964:
                        if (C0714.m2805()) {
                            iM2566 = (i3 - C2105.m6981("ۙᩴ")) * 123;
                            i5 = ((iM2566 ^ i4) * 32069) ^ 2049960134;
                            i = -1509118633;
                        } else {
                            iM2566 = C0630.m2566("۫ۨ") ^ i3;
                            i5 = ((iM2566 ^ i4) * 18313) ^ (-481673415);
                            i = -1556690211;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1764421277:
                    case -1319698332:
                        if (C2167.f7158 >= 0) {
                            iM2566 = (i3 - C2105.m6981("ۙᩴ")) * 123;
                            i5 = ((iM2566 ^ i4) * 32069) ^ 2049960134;
                            i = -1509118633;
                        } else {
                            iM2566 = (C0630.m2566("ۘۧ") + i4) * 87;
                            i5 = ((iM2566 ^ i3) * (-9555)) ^ 957266659;
                            i = 26832823;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1627436492:
                    case 794019204:
                        if (C2126.f7087) {
                            iM2566 = (C0630.m2566("ۘۧ") + i4) * 87;
                            i5 = ((iM2566 ^ i3) * (-9555)) ^ 957266659;
                            i = 26832823;
                        } else {
                            iM2566 = C2105.m6981("ۢۢ") ^ i3;
                            i5 = ((iM2566 ^ i4) * 12155) ^ 1830978779;
                            i = -756139613;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1547196151:
                    case 1047798635:
                        if (C0237.m1481() < 0) {
                            iM2566 = (i3 - C0630.m2566("ۜ᩵")) * (-13);
                            i5 = ((iM2566 ^ i4) * (-4105)) ^ (-1382686881);
                            i = -2009983955;
                            i7 = iM2566 ^ i;
                        }
                        break;
                    case -958996466:
                    case -877207917:
                        if (C22628.f73083 <= 0) {
                            iM2566 = C0630.m2566("ۡ۟") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-28983)) ^ 236319445;
                            i = 2092470274;
                        } else {
                            iM2566 = (C0630.m2566("ۡ۠") ^ i4) * (-51);
                            i5 = ((iM2566 ^ i3) * 30417) ^ (-864539521);
                            i = 245516637;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -595394115:
                    case -27694879:
                        iM3593 = C1047.m3592(spannableStringBuilder);
                        if (C1128.f4106 > 0) {
                            iM2566 = (i4 - C2105.m6981("ۜܰ")) * (-47);
                            i5 = ((iM2566 ^ i3) * (-24515)) ^ 2136489516;
                            i = 1266300912;
                            i7 = iM2566 ^ i;
                        }
                        break;
                    case -87810222:
                    case 1602976369:
                        iM3592 = C1047.m3592(spannableStringBuilder);
                        if (!C0382.f1805) {
                        }
                        iM2566 = C0630.m2566("۬ۤ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 6115) ^ 2103233614;
                        i = -911508989;
                        i7 = iM2566 ^ i;
                        break;
                        break;
                    case 204971850:
                    case 1833322762:
                        if (C0964.f3626 != 0) {
                            iM2566 = (i3 - C2105.m6981("ۙᩴ")) * 123;
                            i5 = ((iM2566 ^ i4) * 32069) ^ 2049960134;
                            i = -1509118633;
                        } else {
                            iM2566 = C2105.m6981("ۡۨ") ^ i4;
                            i5 = ((iM2566 ^ i3) * 13219) ^ (-1929923540);
                            i = 1913152355;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case 354167076:
                    case 626807307:
                        C3911.m11921(spannableStringBuilder, str);
                        if (C7106.f21815 == 0) {
                            styleSpan = new StyleSpan(1);
                            if (C3432.f10845 < 0) {
                                iM2566 = C0630.m2566("ۛۤ") ^ i3;
                                i5 = ((iM2566 ^ i4) * (-20547)) ^ (-1070510130);
                                i = -379528137;
                                i7 = iM2566 ^ i;
                            }
                        }
                        break;
                    case 887239583:
                    case 1230719743:
                        C4263.m12819();
                        iM2566 = (i3 - C2105.m6981("ۙᩴ")) * 123;
                        i5 = ((iM2566 ^ i4) * 32069) ^ 2049960134;
                        i = -1509118633;
                        i7 = iM2566 ^ i;
                        break;
                    case 903379884:
                    case 940009987:
                        C2105.m6985(spannableStringBuilder, styleSpan, iM3592, iM3593, 33);
                        break;
                    case 1168979567:
                    case 1772502977:
                        ServiceConnectionC3453.m10564();
                        RunnableC3474.m10630();
                        break;
                    default:
                        if (AbstractC2021.f6743 <= 0) {
                            iM2566 = C0630.m2566("ۡ۟") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-28983)) ^ 236319445;
                            i = 2092470274;
                        } else {
                            iM2566 = C2105.m6981("᩵ܽ") ^ i3;
                            i5 = ((iM2566 ^ i4) * 32501) ^ 434058359;
                            i = 1487303809;
                        }
                        i7 = iM2566 ^ i;
                        break;
                }
                return;
            }
            iM2567 = (i4 - C0630.m2566("۫۫")) * (-103);
            i5 = ((iM2567 ^ i3) * 12963) ^ 2022771638;
            i6 = 454237204;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22326(String str) {
        C15651 c15651 = null;
        int i = 0;
        boolean z = false;
        int i2 = 1193394028;
        int i3 = C1294.f4556;
        int i4 = RunnableC1937.f6483;
        int iM6981 = (C2105.m6981("ᩴ᩵") + i4) * (-11);
        int i5 = ((iM6981 ^ i3) * 22369) ^ (-667078159);
        int i6 = -413100867;
        while (true) {
            i2 = ((((i2 ^ i3) * (-979)) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -2108830820:
                case -1443613554:
                    if (!C0382.f1805) {
                        iM6981 = C2105.m6981("ۨۛ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 4533) ^ (-866897898);
                        i6 = 1892052371;
                    } else {
                        iM6981 = C0630.m2566("᩸۬") ^ i4;
                        i5 = ((iM6981 ^ i3) * 6253) ^ 506771304;
                        i6 = 1591013772;
                    }
                    break;
                case -2104349153:
                case -990934918:
                    C3746.m11369();
                    C0964.m3413();
                    break;
                case -1957964972:
                case -1819458148:
                    if (C0798.f2919) {
                        iM6981 = C2105.m6981("ۨۛ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 4533) ^ (-866897898);
                        i6 = 1892052371;
                    } else {
                        iM6981 = (C0630.m2566("ۙᩴ") ^ i4) * 115;
                        i5 = ((iM6981 ^ i3) * (-8487)) ^ 146197454;
                        i6 = 1868859179;
                    }
                    break;
                case -1068888050:
                case -429145336:
                    if (C1128.m3851() <= 0) {
                        iM6981 = C0630.m2566("۟۠") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-30083)) ^ 147211568;
                        i6 = 1409447774;
                    } else {
                        iM6981 = (i4 - C0630.m2566("᩺ܿ")) * (-67);
                        i5 = ((iM6981 ^ i3) * (-10425)) ^ 307909776;
                        i6 = -633255233;
                    }
                    break;
                case -818670126:
                case 1101443435:
                    if (!C1005.m3501()) {
                        iM6981 = C0630.m2566("۟۠") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-30083)) ^ 147211568;
                        i6 = 1409447774;
                    } else {
                        iM6981 = (i4 - C2105.m6981("۟ܿ")) * (-83);
                        i5 = ((iM6981 ^ i3) * (-24009)) ^ 843816330;
                        i6 = 838082621;
                    }
                    break;
                case -769031359:
                case 806045657:
                    c15651.setSelection(i, C1047.m3600(c15651));
                    break;
                case -725325912:
                case 141821934:
                    if (C1294.m4372() <= 0) {
                        iM6981 = C0630.m2566("᩸۬") ^ i4;
                        i5 = ((iM6981 ^ i3) * 6253) ^ 506771304;
                        i6 = 1591013772;
                    } else {
                        iM6981 = C2105.m6981("ۚ۬") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-32499)) ^ 618601925;
                        i6 = -398954560;
                    }
                    break;
                case -644447001:
                case 1550949658:
                    if (C1047.f3863 >= 0) {
                        iM6981 = C2105.m6981("ۨۛ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 4533) ^ (-866897898);
                        i6 = 1892052371;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۜ᩶")) * 109;
                        i5 = ((iM6981 ^ i4) * (-8371)) ^ 1142134588;
                        i6 = 1999193711;
                    }
                    break;
                case -609905177:
                case 1166010239:
                    RunnableC1937.m6377(c15651, str);
                    z = true;
                    if (C2272.f7362) {
                        iM6981 = (i4 - C2105.m6981("۟ܿ")) * (-83);
                        i5 = ((iM6981 ^ i3) * (-24009)) ^ 843816330;
                        i6 = 838082621;
                    } else {
                        iM6981 = C2105.m6981("֡ܿ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-7049)) ^ (-103091217);
                        i6 = 1688515946;
                    }
                    break;
                case -540145845:
                case 807829831:
                    C1711.m5736();
                    C22628.m50615();
                    iM6981 = (i4 - C2105.m6981("۟ܿ")) * (-83);
                    i5 = ((iM6981 ^ i3) * (-24009)) ^ 843816330;
                    i6 = 838082621;
                    break;
                case -412137276:
                case -83223916:
                    C2126.m7040();
                    if (!C0964.m3413()) {
                        iM6981 = (i4 - C2105.m6981("۟ܿ")) * (-83);
                        i5 = ((iM6981 ^ i3) * (-24009)) ^ 843816330;
                        i6 = 838082621;
                    } else {
                        iM6981 = C2105.m6981("ۨۛ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 4533) ^ (-866897898);
                        i6 = 1892052371;
                    }
                    break;
                case -244939694:
                case 1517411205:
                    if (C1420.f5096 <= 0) {
                        iM6981 = C0630.m2566("۟۠") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-30083)) ^ 147211568;
                        i6 = 1409447774;
                    } else {
                        iM6981 = (C2105.m6981("᩸۟") ^ i4) * (-61);
                        i5 = ((iM6981 ^ i3) * 26759) ^ (-1719302122);
                        i6 = 782092083;
                    }
                    break;
                case -179838978:
                case 2145621208:
                    c15651.m36850(z);
                    if (C2272.f7362) {
                        iM6981 = C2105.m6981("ۨۛ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 4533) ^ (-866897898);
                        i6 = 1892052371;
                    } else {
                        iM6981 = (C0630.m2566("ܿۤ") + i3) * 109;
                        i5 = ((iM6981 ^ i4) * (-24205)) ^ 847211382;
                        i6 = -1223465943;
                    }
                    break;
                case 334782100:
                case 652289110:
                    if (C0714.m2805()) {
                        iM6981 = C0630.m2566("ܿ۬") ^ i3;
                        i5 = ((iM6981 ^ i4) * 25191) ^ 1704027292;
                        i6 = 1015354426;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ۢܶ")) * 75;
                        i5 = ((iM6981 ^ i3) * 14935) ^ 1516706733;
                        i6 = 1070336622;
                    }
                    break;
                case 661651019:
                case 1194328761:
                    c15651 = this.f26256;
                    if (C0630.f2410 <= 0) {
                        iM6981 = (i4 - C2105.m6981("۟ܿ")) * (-83);
                        i5 = ((iM6981 ^ i3) * (-24009)) ^ 843816330;
                        i6 = 838082621;
                    } else {
                        iM6981 = (i4 - C0630.m2566("᩻ۛ")) * (-85);
                        i5 = ((iM6981 ^ i3) * (-8791)) ^ 1987644652;
                        i6 = 1614796805;
                    }
                    break;
                default:
                    i = 0;
                    c15651.m36850(false);
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (i4 - C0630.m2566("ۢܶ")) * 75;
                        i5 = ((iM6981 ^ i3) * 14935) ^ 1516706733;
                        i6 = 1070336622;
                    } else {
                        iM6981 = C2105.m6981("ܶܿ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 21209) ^ 1465942544;
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
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC8597.onClick(android.view.View):void");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:41:0x0102 A[PHI: r2
      0x0102: PHI (r2v4 int) = (r2v2 int), (r2v3 int), (r2v2 int) binds: [B:40:0x0100, B:21:0x005b, B:13:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x014c A[PHI: r0
      0x014c: PHI (r0v4 int) = (r0v2 int), (r0v3 int), (r0v2 int), (r0v2 int), (r0v2 int), (r0v2 int) binds: [B:48:0x014a, B:32:0x00b8, B:15:0x0040, B:13:0x003c, B:10:0x0033, B:7:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0195  */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m22324(SpannableStringBuilder spannableStringBuilder, String str) {
        int iM2566;
        int i;
        int iM6382 = 0;
        int iM3592 = 0;
        int i2 = -822544764;
        int i3 = C3432.f10845;
        int i4 = RunnableC0588.f2309;
        int iM6981 = C2105.m6981("ܳܰ") ^ i3;
        int i5 = ((iM6981 ^ i4) * 743) ^ 496168876;
        int i6 = 978823719;
        while (true) {
            int i7 = iM6981 ^ i6;
            RelativeSizeSpan relativeSizeSpan = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-17599)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2014396101:
                    case 2128186383:
                        if (C4075.f12947 >= 0) {
                            iM2566 = (C2105.m6981("ܶ۠") + i3) * 93;
                            i5 = ((iM2566 ^ i4) * 24125) ^ (-733207775);
                            i = 1147339126;
                        } else {
                            iM2566 = (i3 - C0630.m2566("᩵ۗ")) * 53;
                            i5 = ((iM2566 ^ i4) * 26023) ^ (-1725164916);
                            i = 1116677318;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1968836396:
                    case 53515212:
                        C0237.m1490(spannableStringBuilder, str);
                        if (!C0382.f1805) {
                        }
                        relativeSizeSpan = new RelativeSizeSpan(0.8f);
                        if (C3245.f10203 > 0) {
                            iM2566 = C2105.m6981("ᩴ᩸") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-5939)) ^ 361811452;
                            i = 143865832;
                            i7 = iM2566 ^ i;
                        }
                        break;
                        break;
                        break;
                    case -1931750532:
                    case 1599309324:
                        C4075.m12263();
                        RunnableC1108.m3790();
                        break;
                    case -1891428526:
                    case -121962936:
                        if (C2105.f7037 != 0) {
                            iM2566 = C0630.m2566("ۤ᩻") ^ i4;
                            i5 = ((iM2566 ^ i3) * 9925) ^ (-2052290095);
                            i = 2030984332;
                        } else {
                            iM2566 = C0630.m2566("ۢ۠") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-15463)) ^ (-1857174026);
                            i = 923122708;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1855224125:
                    case 1195136856:
                        iM3592 = C1047.m3592(spannableStringBuilder);
                        if (C2272.f7362) {
                            iM2566 = (i3 - C0630.m2566("ᩳۘ")) * (-31);
                            i5 = ((iM2566 ^ i4) * (-9569)) ^ 815182686;
                            i = 457223377;
                        } else {
                            iM2566 = (i4 - C0630.m2566("ۤ۬")) * (-21);
                            i5 = ((iM2566 ^ i3) * (-4023)) ^ 915040782;
                            i = -402506930;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1668486603:
                    case 121987443:
                        if (C0798.m2998() != 0) {
                            iM2566 = (i3 - C0630.m2566("ᩳۘ")) * (-31);
                            i5 = ((iM2566 ^ i4) * (-9569)) ^ 815182686;
                            i = 457223377;
                        } else {
                            iM2566 = C2105.m6981("᩻۟") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-23059)) ^ 1474820485;
                            i = 1826053925;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1614448206:
                    case 239434603:
                        iM6382 = RunnableC1937.m6382(spannableStringBuilder);
                        if (C2958.f9394 >= 0) {
                            iM2566 = (C2105.m6981("ܶ۠") + i3) * 93;
                            i5 = ((iM2566 ^ i4) * 24125) ^ (-733207775);
                            i = 1147339126;
                        } else {
                            iM2566 = C0630.m2566("ۤ᩺") ^ i3;
                            i5 = ((iM2566 ^ i4) * 11035) ^ 2045191507;
                            i = -1239140110;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1359044731:
                    case -186102814:
                        if (C1773.m5908() <= 0) {
                            iM2566 = C0630.m2566("ۤ᩻") ^ i4;
                            i5 = ((iM2566 ^ i3) * 9925) ^ (-2052290095);
                            i = 2030984332;
                        } else {
                            iM2566 = C2105.m6981("֡ܽ") ^ i3;
                            i5 = ((iM2566 ^ i4) * 20143) ^ 2006682721;
                            i = 855257007;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1234950525:
                    case 2143923136:
                        C0630.m2576(spannableStringBuilder, relativeSizeSpan, iM6382, iM3592, 33);
                        break;
                    case -981738408:
                    case 162379986:
                        C2958.m9034();
                        C7106.m19120();
                        iM2566 = (C2105.m6981("ܶ۠") + i3) * 93;
                        i5 = ((iM2566 ^ i4) * 24125) ^ (-733207775);
                        i = 1147339126;
                        i7 = iM2566 ^ i;
                        break;
                    case -658849076:
                    case -181429426:
                        if (C1711.f5919) {
                            iM2566 = C0630.m2566("ۧۨ") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-47)) ^ (-1479027083);
                            i = -547542703;
                        } else {
                            iM2566 = C2105.m6981("ۚ۬") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-10671)) ^ 2102297276;
                            i = -1152255215;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -520793292:
                    case 2145429557:
                        RunnableC1108.m3790();
                        if (C7811.f24123 >= 0) {
                            iM2566 = (C2105.m6981("ܶ۠") + i3) * 93;
                            i5 = ((iM2566 ^ i4) * 24125) ^ (-733207775);
                            i = 1147339126;
                        } else {
                            iM2566 = (i3 - C0630.m2566("ᩳۘ")) * (-31);
                            i5 = ((iM2566 ^ i4) * (-9569)) ^ 815182686;
                            i = 457223377;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case 561592620:
                    case 1185286687:
                        C1047.m3599();
                        if (C2167.f7158 < 0) {
                            iM2566 = (C2105.m6981("ܶ۠") + i3) * 93;
                            i5 = ((iM2566 ^ i4) * 24125) ^ (-733207775);
                            i = 1147339126;
                        } else {
                            iM2566 = C0630.m2566("ۤ᩻") ^ i4;
                            i5 = ((iM2566 ^ i3) * 9925) ^ (-2052290095);
                            i = 2030984332;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case 1040483096:
                    case 1476843299:
                        if (C4263.m12819() >= 0) {
                            iM2566 = C0630.m2566("ۤ᩻") ^ i4;
                            i5 = ((iM2566 ^ i3) * 9925) ^ (-2052290095);
                            i = 2030984332;
                        } else {
                            iM2566 = C0630.m2566("᩷᩸") ^ i4;
                            i5 = ((iM2566 ^ i3) * 28363) ^ (-144950876);
                            i = 91511675;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    default:
                        if (C1711.f5919) {
                            iM2566 = (C2105.m6981("ܶ۠") + i3) * 93;
                            i5 = ((iM2566 ^ i4) * 24125) ^ (-733207775);
                            i = 1147339126;
                        } else {
                            iM2566 = C0630.m2566("ۧۨ") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-47)) ^ (-1479027083);
                            i = -547542703;
                        }
                        i7 = iM2566 ^ i;
                        break;
                }
                return;
            }
            iM6981 = C2105.m6981("ۛ۠") ^ i3;
            i5 = ((iM6981 ^ i4) * 15949) ^ (-789242609);
            i6 = 1831888718;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m22323(SpannableStringBuilder spannableStringBuilder, String str) {
        int iM3592 = 0;
        UnderlineSpan underlineSpan = null;
        int iM3593 = 0;
        int i = 0;
        int i2 = 1843894545;
        int i3 = C3911.f12484;
        int i4 = C3432.f10845;
        int iM2566 = (C0630.m2566("ۤ᩺") ^ i3) * (-95);
        int i5 = ((iM2566 ^ i4) * (-11687)) ^ (-2112778838);
        int i6 = 446373954;
        while (true) {
            i2 = ((((i2 ^ i4) * (-19007)) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -1910545644:
                case -1659533898:
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C0630.m2566("֫۟") ^ i4;
                        i5 = ((iM2566 ^ i3) * 8413) ^ 868064150;
                        i6 = 1693018391;
                    } else {
                        iM2566 = (C0630.m2566("᩶ܺ") ^ i4) * 123;
                        i5 = ((iM2566 ^ i3) * (-30141)) ^ (-1808183910);
                        i6 = 1047592133;
                    }
                    break;
                case -1809846312:
                case -771914581:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C2105.m6981("ۨۘ") ^ i4;
                        i5 = ((iM2566 ^ i3) * TwofishEngine.GF256_FDBK) ^ 1642810385;
                        i6 = 1470158907;
                    } else {
                        iM2566 = C2105.m6981("᩶ܽ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 30551) ^ (-947756411);
                        i6 = -1073410339;
                    }
                    break;
                case -1712474026:
                case -1385868112:
                    if (C3683.f11629 >= 0) {
                        iM2566 = C0630.m2566("֫۟") ^ i4;
                        i5 = ((iM2566 ^ i3) * 8413) ^ 868064150;
                        i6 = 1693018391;
                    } else {
                        iM2566 = C2105.m6981("ۢۡ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 17207) ^ 360193340;
                        i6 = 1331088510;
                    }
                    break;
                case -1447741868:
                case 1704605190:
                    C0382.m1848();
                    iM2566 = C2105.m6981("ۨۘ") ^ i4;
                    i5 = ((iM2566 ^ i3) * TwofishEngine.GF256_FDBK) ^ 1642810385;
                    i6 = 1470158907;
                    break;
                case -1127654827:
                case -971183596:
                    underlineSpan = new UnderlineSpan();
                    if (C7106.f21815 != 0) {
                        iM2566 = (i4 - C2105.m6981("ܿܶ")) * 115;
                        i5 = ((iM2566 ^ i3) * (-11543)) ^ 125236864;
                        i6 = -833522379;
                    } else {
                        iM2566 = (C2105.m6981("ܳܺ") + i4) * (-89);
                        i5 = ((iM2566 ^ i3) * 31393) ^ (-528977543);
                        i6 = -965060485;
                    }
                    break;
                case -1044703081:
                case -840536782:
                    iM3593 = C1047.m3592(spannableStringBuilder);
                    if (C1005.f3721) {
                        iM2566 = (C2105.m6981("᩶ᩴ") ^ i3) * 57;
                        i5 = ((iM2566 ^ i4) * 10887) ^ (-1355389428);
                        i6 = 1176565803;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ܿܶ")) * 115;
                        i5 = ((iM2566 ^ i3) * (-11543)) ^ 125236864;
                        i6 = -833522379;
                    }
                    break;
                case -518281686:
                case 1693526607:
                    C3911.m11921(spannableStringBuilder, str);
                    if (C3537.f11231 >= 0) {
                        iM2566 = (i4 - C2105.m6981("ܿܶ")) * 115;
                        i5 = ((iM2566 ^ i3) * (-11543)) ^ 125236864;
                        i6 = -833522379;
                    } else {
                        iM2566 = (C0630.m2566("ܶۢ") + i3) * (-95);
                        i5 = ((iM2566 ^ i4) * (-27829)) ^ (-1792439582);
                        i6 = -308935052;
                    }
                    break;
                case -491495453:
                case -345228825:
                    C0714.m2805();
                    C1005.m3501();
                    break;
                case -175960324:
                case 652546895:
                    ViewOnClickListenerC1958.m6429();
                    if (!C1711.f5919) {
                        iM2566 = C2105.m6981("ۨۘ") ^ i4;
                        i5 = ((iM2566 ^ i3) * TwofishEngine.GF256_FDBK) ^ 1642810385;
                        i6 = 1470158907;
                    } else {
                        iM2566 = C2105.m6981("ۢۡ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 17207) ^ 360193340;
                        i6 = 1331088510;
                    }
                    break;
                case -103141335:
                case 567785016:
                    i = 33;
                    C2105.m6985(spannableStringBuilder, underlineSpan, iM3592, iM3593, 33);
                    if (C1005.m3501()) {
                        iM2566 = C0630.m2566("۫ۖ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 22621) ^ (-61891918);
                        i6 = -223274361;
                    } else {
                        iM2566 = C2105.m6981("ۢۡ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 17207) ^ 360193340;
                        i6 = 1331088510;
                    }
                    break;
                case 68351260:
                case 1585686639:
                    iM3592 = C1047.m3592(spannableStringBuilder);
                    if (C0483.f2088 >= 0) {
                        iM2566 = C2105.m6981("ۨۘ") ^ i4;
                        i5 = ((iM2566 ^ i3) * TwofishEngine.GF256_FDBK) ^ 1642810385;
                        i6 = 1470158907;
                    } else {
                        iM2566 = C0630.m2566("֨ᩴ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 721) ^ (-112322908);
                        i6 = 133712371;
                    }
                    break;
                case 154794648:
                case 1273541793:
                    if (C0964.f3626 != 0) {
                        iM2566 = C2105.m6981("ۢۡ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 17207) ^ 360193340;
                        i6 = 1331088510;
                    } else {
                        iM2566 = C2105.m6981("᩸ᩴ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-20361)) ^ (-1520609259);
                        i6 = 2079714655;
                    }
                    break;
                case 469228680:
                case 1202035940:
                    if (C0237.f1507 == 0 && !C0382.m1848()) {
                        C2105.m6985(spannableStringBuilder, new RelativeSizeSpan(0.8f), iM3592, RunnableC1937.m6382(spannableStringBuilder), i);
                    }
                    iM2566 = (i4 - C2105.m6981("ܿܶ")) * 115;
                    i5 = ((iM2566 ^ i3) * (-11543)) ^ 125236864;
                    i6 = -833522379;
                    break;
                default:
                    if (C1294.f4556 >= 0) {
                        iM2566 = (i4 - C2105.m6981("ܿܶ")) * 115;
                        i5 = ((iM2566 ^ i3) * (-11543)) ^ 125236864;
                        i6 = -833522379;
                    } else {
                        iM2566 = (C0630.m2566("᩵ۜ") ^ i4) * 75;
                        i5 = ((iM2566 ^ i3) * (-10501)) ^ 1097345411;
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m22320(SpannableStringBuilder spannableStringBuilder, String str) {
        int iM2566;
        int i;
        int iM6382 = 0;
        int iM3592 = 0;
        int i2 = 0;
        int i3 = -135809065;
        int i4 = C0483.f2088;
        int i5 = C3537.f11231;
        int iM2567 = (i5 - C0630.m2566("ܿۢ")) * 53;
        int i6 = ((iM2567 ^ i4) * (-16001)) ^ 835317870;
        int i7 = -186620827;
        while (true) {
            int i8 = iM2567 ^ i7;
            StyleSpan styleSpan = null;
            while (true) {
                i3 = ((((i3 ^ i4) * (-7219)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -1927833471:
                    case -1535762579:
                        i2 = 33;
                        C0630.m2576(spannableStringBuilder, styleSpan, iM6382, iM3592, 33);
                        if (ServiceConnectionC3453.f10921 >= 0) {
                            iM2566 = (C0630.m2566("᩵ܽ") ^ i5) * q.h;
                            i6 = ((iM2566 ^ i4) * (-28723)) ^ 605142645;
                            i = -677911026;
                        } else {
                            iM2566 = (C2105.m6981("᩷ۜ") ^ i4) * (-39);
                            i6 = ((iM2566 ^ i5) * 11213) ^ 956915095;
                            i = 1546978632;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -1447376811:
                    case -790720521:
                        iM3592 = C1047.m3592(spannableStringBuilder);
                        if (C0237.f1507 == 0) {
                            iM2566 = (C0630.m2566("۟᩸") ^ i4) * 85;
                            i6 = ((iM2566 ^ i5) * 21157) ^ 652192260;
                            i = -1681191677;
                            i8 = iM2566 ^ i;
                        }
                        break;
                    case -1441060940:
                    case 1062252845:
                        C4117.m12364();
                        if (C3663.f11553) {
                            iM2566 = (i5 - C0630.m2566("ۤܶ")) * (-3);
                            i6 = ((iM2566 ^ i4) * 18637) ^ (-1840253982);
                            i = 2094717216;
                        } else {
                            iM2566 = C0630.m2566("ۢ᩵") ^ i4;
                            i6 = ((iM2566 ^ i5) * 19379) ^ 1477992990;
                            i = -656528429;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -1334112876:
                    case -541001372:
                        RunnableC0588.m2441();
                        C3537.m10746();
                        break;
                    case -1260405827:
                    case -10918111:
                        if (C21923.m49329()) {
                            iM2566 = (C0630.m2566("᩵ܽ") ^ i5) * q.h;
                            i6 = ((iM2566 ^ i4) * (-28723)) ^ 605142645;
                            i = -677911026;
                        } else {
                            iM2566 = C0630.m2566("ۢ᩵") ^ i4;
                            i6 = ((iM2566 ^ i5) * 19379) ^ 1477992990;
                            i = -656528429;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -1098102207:
                    case -323341633:
                        C0237.m1490(spannableStringBuilder, str);
                        if (C4263.f13799 > 0) {
                            styleSpan = new StyleSpan(2);
                            if (C3663.f11553) {
                                iM2566 = C0630.m2566("ۢ᩵") ^ i4;
                                i6 = ((iM2566 ^ i5) * 19379) ^ 1477992990;
                                i = -656528429;
                            } else {
                                iM2566 = (C0630.m2566("᩶֡") ^ i5) * (-111);
                                i6 = ((iM2566 ^ i4) * 29795) ^ (-370961932);
                                i = -1063505722;
                            }
                            i8 = iM2566 ^ i;
                        }
                        break;
                    case -837484333:
                    case 2122469711:
                        if (ServiceConnectionC3453.m10564() <= 0) {
                            iM2566 = (i5 - C0630.m2566("ۤܶ")) * (-3);
                            i6 = ((iM2566 ^ i4) * 18637) ^ (-1840253982);
                            i = 2094717216;
                        } else {
                            iM2566 = (i5 - C0630.m2566("᩺᩸")) * (-39);
                            i6 = ((iM2566 ^ i4) * 19917) ^ 413650871;
                            i = 601951451;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -695932749:
                    case 134058499:
                        C4159.m12565();
                        iM2566 = (C0630.m2566("᩵ܽ") ^ i5) * q.h;
                        i6 = ((iM2566 ^ i4) * (-28723)) ^ 605142645;
                        i = -677911026;
                        i8 = iM2566 ^ i;
                        break;
                    case -166877000:
                    case 467997765:
                        if (C1504.f5354) {
                            iM2566 = C0630.m2566("ۢ᩵") ^ i4;
                            i6 = ((iM2566 ^ i5) * 19379) ^ 1477992990;
                            i = -656528429;
                        } else {
                            iM2566 = (C2105.m6981("ܽۧ") ^ i5) * (-15);
                            i6 = ((iM2566 ^ i4) * 25111) ^ 1179266521;
                            i = 1229085729;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case 230808035:
                    case 783368183:
                        if (C4616.f14690 <= 0) {
                            iM2566 = (C2105.m6981("ܽۧ") ^ i5) * (-15);
                            i6 = ((iM2566 ^ i4) * 25111) ^ 1179266521;
                            i = 1229085729;
                        } else {
                            iM2566 = (C0630.m2566("ܰۚ") ^ i5) * (-59);
                            i6 = ((iM2566 ^ i4) * (-17765)) ^ (-534524787);
                            i = -144922221;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case 381584015:
                    case 1568387315:
                        iM6382 = RunnableC1937.m6382(spannableStringBuilder);
                        if (C3911.m11924() > 0) {
                            iM2566 = (C2105.m6981("ۘܿ") + i4) * (-43);
                            i6 = ((iM2566 ^ i5) * (-19085)) ^ 1143317014;
                            i = 979892595;
                            i8 = iM2566 ^ i;
                        }
                        break;
                    case 1313516261:
                    case 1580883742:
                        if (C3537.f11231 >= 0) {
                            iM2566 = (C2105.m6981("ܽۧ") ^ i5) * (-15);
                            i6 = ((iM2566 ^ i4) * 25111) ^ 1179266521;
                            i = 1229085729;
                        } else {
                            if (!C0798.f2919) {
                                C2105.m6985(spannableStringBuilder, new RelativeSizeSpan(0.8f), iM6382, C1047.m3592(spannableStringBuilder), i2);
                            }
                            iM2566 = (C0630.m2566("᩵ܽ") ^ i5) * q.h;
                            i6 = ((iM2566 ^ i4) * (-28723)) ^ 605142645;
                            i = -677911026;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    default:
                        if (C0714.f2697 < 0) {
                            iM2566 = C0630.m2566("ۢ᩸") ^ i4;
                            i6 = ((iM2566 ^ i5) * (-1135)) ^ (-259811949);
                            i = 288798982;
                            i8 = iM2566 ^ i;
                        }
                        break;
                }
                return;
            }
            iM2567 = (i4 - C2105.m6981("۠ۤ")) * (-63);
            i6 = ((iM2567 ^ i5) * (-8293)) ^ (-1817856690);
            i7 = -1130832501;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:60:0x023b A[PHI: r7
      0x023b: PHI (r7v5 int) = (r7v4 int), (r7v2 int), (r7v2 int) binds: [B:59:0x0239, B:32:0x0114, B:24:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22315(SpannableStringBuilder spannableStringBuilder, ArrayList arrayList, boolean z, char c) {
        int iM2566;
        int i;
        int i2;
        int i3;
        int iM6981;
        int i4;
        int i5;
        int iM2567;
        int i6;
        int i7;
        int iM6982;
        int i8;
        int i9;
        int iM2568;
        int i10;
        int iM6983;
        int i11;
        int i12;
        StringBuilder sb;
        int i13;
        StringBuilder sb2;
        String str;
        int i14;
        int i15;
        int i16;
        int iM6984;
        int i17;
        int i18;
        int iM6985;
        int i19;
        int i20;
        int i21;
        int iM2569;
        int i22;
        int i23;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        short[] sArr = null;
        char c2 = 0;
        int i24 = 1886387801;
        int i25 = C0714.f2697;
        int i26 = C1773.f6144;
        int iM25610 = C0630.m2566("ۧۢ") ^ i26;
        int i27 = ((iM25610 ^ i25) * (-15341)) ^ (-2138022758);
        int i28 = iM25610 ^ (-1149255138);
        InterfaceC21211 interfaceC21211 = null;
        String strM10633 = null;
        StringBuilder sb3 = null;
        Iterator itM6374 = null;
        StringBuilder sb4 = null;
        int i29 = 0;
        int i30 = 0;
        int value = 0;
        int i31 = 0;
        int iM11928 = 0;
        int i32 = 0;
        InterfaceC1454 interfaceC1454 = null;
        String strM1959 = null;
        Iterator itM20833 = null;
        C12534 c12534 = null;
        String strMo18744 = null;
        StringBuilder sb5 = null;
        InterfaceC21211 interfaceC21212 = null;
        while (true) {
            i24 = i28 ^ (i27 & (((i24 ^ i25) * 26215) >> 31));
            switch (i24) {
                case -2103744489:
                case 83545406:
                    sb = sb4;
                    i13 = i29;
                    sb2 = sb3;
                    str = strM10633;
                    i14 = i30;
                    i15 = i32;
                    i16 = value;
                    if (C2126.m7032(arrayList) > i15) {
                        iM6984 = C0630.m2566("ۢܺ") ^ i26;
                        i17 = ((iM6984 ^ i25) * 27369) ^ (-929063409);
                        i18 = -998539153;
                    } else {
                        iM6984 = C2105.m6981("۬᩵") ^ i26;
                        i17 = ((iM6984 ^ i25) * 5007) ^ (-1392213333);
                        i18 = -1339386939;
                    }
                    sb3 = sb2;
                    i29 = i13;
                    int i33 = i14;
                    strM10633 = str;
                    sb4 = sb;
                    i28 = iM6984 ^ i18;
                    i27 = i17;
                    value = i16;
                    i32 = i15;
                    i30 = i33;
                    break;
                case -2072127147:
                case -1383010315:
                    iM11928 = C3911.m11928(sb4) + C1047.m3592(spannableStringBuilder);
                    C3245.m9923(sb4, c12534.m30766(interfaceC1454));
                    if (C0050.f910 >= 0) {
                        iM2569 = (i25 - C2105.m6981("۟ܺ")) * (-111);
                        i22 = ((iM2569 ^ i26) * (-11249)) ^ 61300019;
                        i23 = 1111630627;
                    } else {
                        iM2569 = C0630.m2566("ۖۡ") ^ i25;
                        i22 = ((iM2569 ^ i26) * (-6099)) ^ 1925390953;
                        i23 = -1163991131;
                    }
                    i28 = iM2569 ^ i23;
                    i27 = i22;
                    break;
                case -1981535974:
                case 901438639:
                    sb4 = sb4;
                    i29 = i29;
                    strM10633 = strM10633;
                    i30 = i30;
                    i32 = i32;
                    value = value;
                    m22314(spannableStringBuilder2, C3911.m11919(f26255, 6, 3, i31));
                    if (C1504.f5354) {
                        iM6981 = C2105.m6981("ܽ۬") ^ i25;
                        i4 = ((iM6981 ^ i26) * (-26675)) ^ 2013535423;
                        i5 = -46292298;
                    } else {
                        StringBuilder sb6 = new StringBuilder(strM10633);
                        C0630.m2567(sb6, c);
                        C1420.m4905(sb6, interfaceC21211.mo47886());
                        C3537.m10742(spannableStringBuilder2, C0050.m947(sb6));
                        iM6981 = C2105.m6981("᩻ۡ") ^ i25;
                        i4 = ((iM6981 ^ i26) * 2239) ^ 409070778;
                        i5 = 215435724;
                    }
                    i7 = iM6981 ^ i5;
                    value = value;
                    i32 = i32;
                    i30 = i30;
                    strM10633 = strM10633;
                    sb4 = sb4;
                    i28 = i7;
                    i27 = i4;
                    i29 = i29;
                    break;
                case -1941657608:
                case -127340889:
                    sb4 = sb4;
                    i29 = i29;
                    strM10633 = strM10633;
                    i30 = i30;
                    i32 = i32;
                    value = value;
                    m22314(spannableStringBuilder2, C3537.m10748(f26255, 9, 6, i31));
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (C0630.m2566("ۧۘ") + i26) * (-83);
                        i4 = ((iM6981 ^ i25) * (-31653)) ^ (-796717351);
                        i5 = -426337754;
                    } else {
                        iM6981 = C0630.m2566("ۡܺ") ^ i26;
                        i4 = ((iM6981 ^ i25) * 30095) ^ (-1927019678);
                        i5 = 1615244981;
                    }
                    i7 = iM6981 ^ i5;
                    value = value;
                    i32 = i32;
                    i30 = i30;
                    strM10633 = strM10633;
                    sb4 = sb4;
                    i28 = i7;
                    i27 = i4;
                    i29 = i29;
                    break;
                case -1895613041:
                case -757155089:
                    itM20833 = C7811.m20833(interfaceC21212.values());
                    iM2568 = C2105.m6981("᩵᩻") ^ i25;
                    i27 = ((iM2568 ^ i26) * 14043) ^ 2105202844;
                    i10 = 1196515449;
                    i21 = iM2568 ^ i10;
                    i29 = i29;
                    StringBuilder sb7 = sb4;
                    i28 = i21;
                    sb4 = sb7;
                    break;
                case -1842276740:
                case 107033940:
                    C2126.m7040();
                    iM2569 = (C2105.m6981("᩷ۧ") ^ i25) * 101;
                    i22 = ((iM2569 ^ i26) * (-25217)) ^ (-330781242);
                    i23 = -402524862;
                    i28 = iM2569 ^ i23;
                    i27 = i22;
                    break;
                case -1782415565:
                case 125897529:
                    sb4 = sb4;
                    i29 = i29;
                    strM10633 = strM10633;
                    i30 = i30;
                    i32 = i32;
                    value = value;
                    if (C4616.f14690 <= 0) {
                        i12 = i32;
                        i30 = i30;
                        i29 = i29;
                        int iM25611 = C0630.m2566("᩷֡") ^ i25;
                        int i34 = ((iM25611 ^ i26) * 23405) ^ 91717034;
                        int i35 = iM25611 ^ (-1026955423);
                        i27 = i34;
                        value = value;
                        spannableStringBuilder2 = spannableStringBuilder;
                        i32 = i12;
                        strM10633 = strM10633;
                        sb4 = sb4;
                        i28 = i35;
                    } else {
                        int iM25612 = (i25 - C0630.m2566("ۗܰ")) * 41;
                        i27 = ((iM25612 ^ i26) * 26565) ^ 1797975391;
                        value = value;
                        i29 = i29;
                        i32 = i32;
                        i30 = i30;
                        strM10633 = strM10633;
                        sb4 = sb4;
                        i28 = iM25612 ^ 1744137135;
                        spannableStringBuilder2 = spannableStringBuilder;
                    }
                    break;
                case -1756086959:
                case 1845995644:
                    sb4 = sb4;
                    i29 = i29;
                    interfaceC21212 = (InterfaceC21211) RunnableC1108.m3791(itM6374);
                    strM10633 = strM10633;
                    sb5 = new StringBuilder(strM10633);
                    strMo18744 = interfaceC21212.mo29410().mo18744();
                    if (RunnableC0588.f2309 >= 0) {
                        iM6982 = C0630.m2566("ۜۚ") ^ i25;
                        i8 = ((iM6982 ^ i26) * 2829) ^ (-475321210);
                        i9 = -2055795492;
                    } else {
                        iM6982 = (C2105.m6981("᩶ܳ") ^ i26) * 69;
                        i8 = ((iM6982 ^ i25) * (-31921)) ^ (-1528621760);
                        i9 = -1862714632;
                    }
                    i3 = iM6982 ^ i9;
                    strM10633 = strM10633;
                    i27 = i8;
                    sb4 = sb4;
                    i28 = i3;
                    i29 = i29;
                    break;
                case -1657894237:
                case 151157347:
                    i31 = 46747;
                    iM2566 = C2105.m6981("ۨۚ") ^ i25;
                    i = ((iM2566 ^ i26) * (-30353)) ^ (-1894789990);
                    i2 = 1471344262;
                    i3 = iM2566 ^ i2;
                    i27 = i;
                    value = value;
                    i32 = i32;
                    i30 = i30;
                    strM10633 = strM10633;
                    sb4 = sb4;
                    i28 = i3;
                    i29 = i29;
                    break;
                case -1655627620:
                case 2014783854:
                    C3911.m11924();
                    if (C5695.f17556 >= 0) {
                        sb4 = sb4;
                        i29 = i29;
                        strM10633 = strM10633;
                        i30 = i30;
                        i32 = i32;
                        value = value;
                        iM6981 = C2105.m6981("ܽ۬") ^ i25;
                        i4 = ((iM6981 ^ i26) * (-26675)) ^ 2013535423;
                        i5 = -46292298;
                        i7 = iM6981 ^ i5;
                        value = value;
                        i32 = i32;
                        i30 = i30;
                        strM10633 = strM10633;
                        sb4 = sb4;
                        i28 = i7;
                        i27 = i4;
                        i29 = i29;
                    } else {
                        iM2569 = (i26 - C2105.m6981("᩹֡")) * 57;
                        i22 = ((iM2569 ^ i25) * (-11235)) ^ 1417424099;
                        i23 = -972158601;
                        i28 = iM2569 ^ i23;
                        i27 = i22;
                    }
                    break;
                case -1585652535:
                case 961573213:
                    C0050.m940();
                    if (C0422.f1886 <= 0) {
                        sb4 = sb4;
                        i29 = i29;
                        strM10633 = strM10633;
                        i30 = i30;
                        i32 = i32;
                        value = value;
                        iM6981 = (C0630.m2566("ۧۘ") + i26) * (-83);
                        i4 = ((iM6981 ^ i25) * (-31653)) ^ (-796717351);
                        i5 = -426337754;
                        i7 = iM6981 ^ i5;
                        value = value;
                        i32 = i32;
                        i30 = i30;
                        strM10633 = strM10633;
                        sb4 = sb4;
                        i28 = i7;
                        i27 = i4;
                        i29 = i29;
                    } else {
                        iM2569 = (C2105.m6981("᩷ۧ") ^ i25) * 101;
                        i22 = ((iM2569 ^ i26) * (-25217)) ^ (-330781242);
                        i23 = -402524862;
                        i28 = iM2569 ^ i23;
                        i27 = i22;
                    }
                    break;
                case -1523702644:
                case 683188790:
                    i31 = 19738;
                    iM2566 = C2105.m6981("ۨۚ") ^ i25;
                    i = ((iM2566 ^ i26) * (-30353)) ^ (-1894789990);
                    i2 = 1471344262;
                    i3 = iM2566 ^ i2;
                    i27 = i;
                    value = value;
                    i32 = i32;
                    i30 = i30;
                    strM10633 = strM10633;
                    sb4 = sb4;
                    i28 = i3;
                    i29 = i29;
                    break;
                case -1417990108:
                case -637720471:
                    sb4 = sb4;
                    value = value;
                    strM10633 = strM10633;
                    int i36 = i30;
                    i29 = 0;
                    interfaceC21211 = (InterfaceC21211) C21923.m49339(arrayList, 0);
                    if (C1711.f5919) {
                        i30 = i36;
                        i12 = 1;
                        int iM25613 = C0630.m2566("᩷֡") ^ i25;
                        int i37 = ((iM25613 ^ i26) * 23405) ^ 91717034;
                        int i38 = iM25613 ^ (-1026955423);
                        i27 = i37;
                        value = value;
                        spannableStringBuilder2 = spannableStringBuilder;
                        i32 = i12;
                        strM10633 = strM10633;
                        sb4 = sb4;
                        i28 = i38;
                    } else {
                        int iM25614 = (C0630.m2566("ܳۜ") ^ i26) * 29;
                        i27 = ((iM25614 ^ i25) * (-18463)) ^ 2142482056;
                        value = value;
                        i30 = i36;
                        i29 = 0;
                        i32 = 1;
                        strM10633 = strM10633;
                        sb4 = sb4;
                        i28 = iM25614 ^ 2007186207;
                    }
                    break;
                case -1384285909:
                case -658300722:
                    sb4 = sb4;
                    i29 = i29;
                    strM10633 = strM10633;
                    i30 = i30;
                    i32 = i32;
                    value = value;
                    sArr = f26255;
                    c2 = 4;
                    if (C3911.f12484 < 0) {
                        iM2566 = C0630.m2566("ܰۨ") ^ i26;
                        i = ((iM2566 ^ i25) * 23137) ^ 1143977903;
                        i2 = 1935135240;
                        i3 = iM2566 ^ i2;
                        i27 = i;
                        value = value;
                        i32 = i32;
                        i30 = i30;
                        strM10633 = strM10633;
                        sb4 = sb4;
                        i28 = i3;
                        i29 = i29;
                    } else {
                        i12 = i32;
                        i30 = i30;
                        i29 = i29;
                        int iM25615 = C0630.m2566("᩷֡") ^ i25;
                        int i39 = ((iM25615 ^ i26) * 23405) ^ 91717034;
                        int i310 = iM25615 ^ (-1026955423);
                        i27 = i39;
                        value = value;
                        spannableStringBuilder2 = spannableStringBuilder;
                        i32 = i12;
                        strM10633 = strM10633;
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
                    strM10633 = strM10633;
                    i30 = i30;
                    i32 = i32;
                    value = value;
                    C3245.m9923(sb8, interfaceC21211.mo29406());
                    C3537.m10742(spannableStringBuilder2, C0050.m947(sb8));
                    iM6981 = C2105.m6981("᩻ۡ") ^ i25;
                    i4 = ((iM6981 ^ i26) * 2239) ^ 409070778;
                    i5 = 215435724;
                    i7 = iM6981 ^ i5;
                    value = value;
                    i32 = i32;
                    i30 = i30;
                    strM10633 = strM10633;
                    sb4 = sb4;
                    i28 = i7;
                    i27 = i4;
                    i29 = i29;
                    break;
                case -1302714842:
                case 1082221024:
                    sb4 = sb4;
                    i29 = i29;
                    C3019.m9261(spannableStringBuilder2, C4117.m12351(C1916.m6311(f26255, 26, 8, i31), c12534.m30777(interfaceC21212.getParent())));
                    iM6985 = (C2105.m6981("֫᩹") ^ i25) * (-125);
                    i19 = ((iM6985 ^ i26) * 11355) ^ (-1619059307);
                    i20 = 201616022;
                    i21 = iM6985 ^ i20;
                    i27 = i19;
                    i29 = i29;
                    StringBuilder sb9 = sb4;
                    i28 = i21;
                    sb4 = sb9;
                    break;
                case -1175660532:
                case -871836125:
                    C1711.m5736();
                    break;
                case -1091408845:
                case 1221787510:
                    if (interfaceC1454.mo5004() > 31) {
                        iM2568 = C2105.m6981("᩵᩻") ^ i25;
                        i27 = ((iM2568 ^ i26) * 14043) ^ 2105202844;
                        i10 = 1196515449;
                        i21 = iM2568 ^ i10;
                        i29 = i29;
                        StringBuilder sb10 = sb4;
                        i28 = i21;
                        sb4 = sb10;
                    } else {
                        iM2569 = C2105.m6981("᩷ۛ") ^ i26;
                        i22 = ((iM2569 ^ i25) * (-19137)) ^ 1839214205;
                        i23 = 1453435085;
                        i28 = iM2569 ^ i23;
                        i27 = i22;
                    }
                    break;
                case -1067088374:
                case -825649546:
                    sb4 = sb4;
                    i29 = i29;
                    if (interfaceC21212.getParent() != 0) {
                        iM2568 = (C2105.m6981("۟ܰ") + i26) * (-119);
                        i27 = ((iM2568 ^ i25) * 12407) ^ (-1772325144);
                        i10 = 84965951;
                        i21 = iM2568 ^ i10;
                        i29 = i29;
                        StringBuilder sb11 = sb4;
                        i28 = i21;
                        sb4 = sb11;
                    }
                    iM6985 = (C2105.m6981("֫᩹") ^ i25) * (-125);
                    i19 = ((iM6985 ^ i26) * 11355) ^ (-1619059307);
                    i20 = 201616022;
                    i21 = iM6985 ^ i20;
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
                    strM10633 = RunnableC3474.m10633(f26255, 5, 1, i31);
                    if (z) {
                        iM6981 = C0630.m2566("ۚܽ") ^ i25;
                        i4 = ((iM6981 ^ i26) * 29007) ^ (-1212975257);
                        i5 = 1982279449;
                    } else {
                        iM6981 = C2105.m6981("ܺۙ") ^ i26;
                        i4 = ((iM6981 ^ i25) * 30987) ^ 719626377;
                        i5 = -1487294925;
                    }
                    i7 = iM6981 ^ i5;
                    value = value;
                    i32 = i32;
                    i30 = i30;
                    strM10633 = strM10633;
                    sb4 = sb4;
                    i28 = i7;
                    i27 = i4;
                    i29 = i29;
                    break;
                case -920832830:
                case 1005664897:
                    sb4 = sb4;
                    i29 = i29;
                    if (!C1773.m5910(itM20833)) {
                        iM6982 = (C2105.m6981("ۜ᩺") + i25) * 9;
                        i8 = ((iM6982 ^ i26) * 18283) ^ (-1784805042);
                        i9 = 157991545;
                        i3 = iM6982 ^ i9;
                        strM10633 = strM10633;
                        i27 = i8;
                        sb4 = sb4;
                        i28 = i3;
                        i29 = i29;
                    } else {
                        iM2568 = C0630.m2566("ۗ᩻") ^ i26;
                        i27 = ((iM2568 ^ i25) * 411) ^ 252543372;
                        i10 = 352343356;
                        i21 = iM2568 ^ i10;
                        i29 = i29;
                        StringBuilder sb13 = sb4;
                        i28 = i21;
                        sb4 = sb13;
                    }
                    break;
                case -845588550:
                case 886122355:
                    C3537.m10742(spannableStringBuilder2, C0422.m1959(sb4));
                    if (interfaceC1454.mo5004() < 28) {
                        iM2568 = C2105.m6981("᩵᩻") ^ i25;
                        i27 = ((iM2568 ^ i26) * 14043) ^ 2105202844;
                        i10 = 1196515449;
                        i21 = iM2568 ^ i10;
                        i29 = i29;
                        StringBuilder sb14 = sb4;
                        i28 = i21;
                        sb4 = sb14;
                    } else {
                        iM2569 = C2105.m6981("ᩴܿ") ^ i25;
                        i22 = ((iM2569 ^ i26) * 17853) ^ 782714213;
                        i23 = -962666976;
                        i28 = iM2569 ^ i23;
                        i27 = i22;
                    }
                    break;
                case -765331021:
                case 1328524295:
                    C1420.m4905(sb4, c12534.m30772(interfaceC1454.mo5006()));
                    m22323(spannableStringBuilder2, C0422.m1959(sb4));
                    sb4.setLength(i29);
                    C2105.m6979(sb4, a.h);
                    iM2569 = (C0630.m2566("۠ۗ") ^ i25) * (-45);
                    i22 = ((iM2569 ^ i26) * (-7027)) ^ (-1939035992);
                    i23 = 1449788971;
                    i28 = iM2569 ^ i23;
                    i27 = i22;
                    break;
                case -731273563:
                case -356107007:
                    sb4 = sb4;
                    i29 = i29;
                    strM10633 = strM10633;
                    i30 = i30;
                    i32 = i32;
                    strM1959 = "";
                    value = value;
                    iM6983 = (C0630.m2566("ۡ֨") + i25) * (-27);
                    i4 = ((iM6983 ^ i26) * 6239) ^ 549830263;
                    i11 = 152518383;
                    i7 = iM6983 ^ i11;
                    value = value;
                    i32 = i32;
                    i30 = i30;
                    strM10633 = strM10633;
                    sb4 = sb4;
                    i28 = i7;
                    i27 = i4;
                    i29 = i29;
                    break;
                case -559799970:
                case 240191521:
                    if (C2167.f7158 >= 0) {
                        sb = sb4;
                        i13 = i29;
                        sb2 = sb3;
                        str = strM10633;
                        i14 = i30;
                        i15 = i32;
                        i16 = value;
                        iM6984 = C0630.m2566("᩶ᩴ") ^ i26;
                        i17 = ((iM6984 ^ i25) * 28365) ^ 306321465;
                        i18 = 685709852;
                        sb3 = sb2;
                        i29 = i13;
                        int i311 = i14;
                        strM10633 = str;
                        sb4 = sb;
                        i28 = iM6984 ^ i18;
                        i27 = i17;
                        value = i16;
                        i32 = i15;
                        i30 = i311;
                    } else {
                        iM2569 = (C2105.m6981("᩷ۧ") ^ i25) * 101;
                        i22 = ((iM2569 ^ i26) * (-25217)) ^ (-330781242);
                        i23 = -402524862;
                        i28 = iM2569 ^ i23;
                        i27 = i22;
                    }
                    break;
                case -548435114:
                case 226294599:
                    sb4 = sb4;
                    i29 = i29;
                    itM6374 = RunnableC1937.m6374(arrayList);
                    iM6982 = (C2105.m6981("ۜ᩺") + i25) * 9;
                    i8 = ((iM6982 ^ i26) * 18283) ^ (-1784805042);
                    i9 = 157991545;
                    i3 = iM6982 ^ i9;
                    strM10633 = strM10633;
                    i27 = i8;
                    sb4 = sb4;
                    i28 = i3;
                    i29 = i29;
                    break;
                case -430244958:
                case 1023811405:
                    sb4 = sb4;
                    i29 = i29;
                    strM10633 = strM10633;
                    i30 = i30;
                    if (C1294.m4369(C4117.m12353(interfaceC21211.getType()), RunnableC1108.m3789(f26255, 24, 2, i31))) {
                        i32 = i32;
                        iM2567 = C2105.m6981("ۗۚ") ^ i25;
                        i4 = ((iM2567 ^ i26) * (-31073)) ^ (-1026216948);
                        i6 = 553492832;
                        i7 = iM2567 ^ i6;
                        i32 = i32;
                    } else {
                        int iM25616 = C0630.m2566("᩸۫") ^ i26;
                        i4 = ((iM25616 ^ i25) * (-30621)) ^ (-180892967);
                        i7 = iM25616 ^ 599957954;
                    }
                    i30 = i30;
                    strM10633 = strM10633;
                    sb4 = sb4;
                    i28 = i7;
                    i27 = i4;
                    i29 = i29;
                    break;
                case -242506398:
                case 1427003856:
                    sb4 = sb4;
                    i29 = i29;
                    strM10633 = strM10633;
                    i30 = i30;
                    i32 = i32;
                    value = value;
                    C3245.m9923(sb3, C3683.m11225(f26255, 15, 8, i31));
                    iM6981 = C2105.m6981("᩹᩺") ^ i25;
                    i4 = ((iM6981 ^ i26) * (-16143)) ^ 2044176353;
                    i5 = -580848260;
                    i7 = iM6981 ^ i5;
                    value = value;
                    i32 = i32;
                    i30 = i30;
                    strM10633 = strM10633;
                    sb4 = sb4;
                    i28 = i7;
                    i27 = i4;
                    i29 = i29;
                    break;
                case -227755655:
                case 163011983:
                    sb4 = sb4;
                    i29 = i29;
                    C3245.m9923(sb5, strMo18744);
                    C1420.m4905(sb5, strM1959);
                    m22314(spannableStringBuilder2, C0050.m947(sb5));
                    boolean zMo29412 = interfaceC21212.mo29412();
                    c12534 = this.f26257;
                    if (zMo29412) {
                        iM6985 = C2105.m6981("᩹֫") ^ i26;
                        i19 = ((iM6985 ^ i25) * (-23267)) ^ 1985724041;
                        i20 = -529019438;
                    } else {
                        iM6985 = (C2105.m6981("֫᩹") ^ i25) * (-125);
                        i19 = ((iM6985 ^ i26) * 11355) ^ (-1619059307);
                        i20 = 201616022;
                    }
                    i21 = iM6985 ^ i20;
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
                    strM10633 = strM10633;
                    i30 = i30;
                    i32 = i32;
                    if (interfaceC21211.mo29407().mo12858() != i32) {
                        iM2567 = (C0630.m2566("ۖۗ") + i26) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2567 ^ i25) * (-9311)) ^ 548217489;
                        i6 = 1643618542;
                    } else {
                        iM2567 = C2105.m6981("ۗۚ") ^ i25;
                        i4 = ((iM2567 ^ i26) * (-31073)) ^ (-1026216948);
                        i6 = 553492832;
                    }
                    i7 = iM2567 ^ i6;
                    i32 = i32;
                    i30 = i30;
                    strM10633 = strM10633;
                    sb4 = sb4;
                    i28 = i7;
                    i27 = i4;
                    i29 = i29;
                    break;
                case -120292845:
                case 2015359615:
                    value = interfaceC1454.getValue();
                    C2105.m6985(spannableStringBuilder2, new BackgroundColorSpan(value), iM11928, C1047.m3592(spannableStringBuilder), 33);
                    if (C7811.f24123 >= 0) {
                        sb4 = sb4;
                        i12 = i32;
                        strM10633 = strM10633;
                        i30 = 33;
                        value = value;
                        int iM25617 = C0630.m2566("᩷֡") ^ i25;
                        int i312 = ((iM25617 ^ i26) * 23405) ^ 91717034;
                        int i313 = iM25617 ^ (-1026955423);
                        i27 = i312;
                        value = value;
                        spannableStringBuilder2 = spannableStringBuilder;
                        i32 = i12;
                        strM10633 = strM10633;
                        sb4 = sb4;
                        i28 = i313;
                    } else {
                        int iM6986 = (i25 - C2105.m6981("ᩳۨ")) * 109;
                        i28 = iM6986 ^ (-1586236941);
                        i27 = ((iM6986 ^ i26) * (-6197)) ^ (-991927850);
                        i30 = 33;
                    }
                    break;
                case 14073105:
                case 1283835766:
                    C11340.m28031();
                    if (!RunnableC1108.m3790()) {
                        sb4 = sb4;
                        i29 = i29;
                        strM10633 = strM10633;
                        i30 = i30;
                        i32 = i32;
                        value = value;
                        iM6983 = C2105.m6981("֫ܳ") ^ i26;
                        i4 = ((iM6983 ^ i25) * (-10845)) ^ (-673625246);
                        i11 = 873258406;
                        i7 = iM6983 ^ i11;
                        value = value;
                        i32 = i32;
                        i30 = i30;
                        strM10633 = strM10633;
                        sb4 = sb4;
                        i28 = i7;
                        i27 = i4;
                        i29 = i29;
                    } else {
                        iM2569 = (C2105.m6981("᩷ۧ") ^ i25) * 101;
                        i22 = ((iM2569 ^ i26) * (-25217)) ^ (-330781242);
                        i23 = -402524862;
                        i28 = iM2569 ^ i23;
                        i27 = i22;
                    }
                    break;
                case 163221866:
                case 753225875:
                    sb4 = sb4;
                    i29 = i29;
                    strM10633 = strM10633;
                    if (!C0483.m2123(itM6374)) {
                        i30 = i30;
                        i32 = i32;
                        iM2567 = C2105.m6981("ۗۚ") ^ i25;
                        i4 = ((iM2567 ^ i26) * (-31073)) ^ (-1026216948);
                        i6 = 553492832;
                        i7 = iM2567 ^ i6;
                        i32 = i32;
                        i30 = i30;
                        strM10633 = strM10633;
                        sb4 = sb4;
                        i28 = i7;
                        i27 = i4;
                        i29 = i29;
                    } else {
                        iM6982 = C2105.m6981("᩺ᩳ") ^ i25;
                        i8 = ((iM6982 ^ i26) * (-8963)) ^ (-610255193);
                        i9 = -531890856;
                        i3 = iM6982 ^ i9;
                        strM10633 = strM10633;
                        i27 = i8;
                        sb4 = sb4;
                        i28 = i3;
                        i29 = i29;
                    }
                    break;
                case 188272063:
                case 1907060648:
                    RunnableC3474.m10630();
                    if (C0483.f2088 < 0) {
                        iM2569 = (i26 - C2105.m6981("᩹֡")) * 57;
                        i22 = ((iM2569 ^ i25) * (-11235)) ^ 1417424099;
                        i23 = -972158601;
                    } else {
                        iM2569 = C2105.m6981("ۨ᩻") ^ i26;
                        i22 = ((iM2569 ^ i25) * (-19831)) ^ (-569894198);
                        i23 = 1454028811;
                    }
                    i28 = iM2569 ^ i23;
                    i27 = i22;
                    break;
                case 234767574:
                case 1325077306:
                    sb4 = sb4;
                    i29 = i29;
                    strM10633 = strM10633;
                    i30 = i30;
                    i32 = i32;
                    value = value;
                    StringBuilder sb16 = new StringBuilder(strM10633);
                    C2105.m6979(sb16, c);
                    if (interfaceC21211.mo29407().mo12858() != i32) {
                        sb3 = sb16;
                        iM6981 = C2105.m6981("᩹᩺") ^ i25;
                        i4 = ((iM6981 ^ i26) * (-16143)) ^ 2044176353;
                        i5 = -580848260;
                        i7 = iM6981 ^ i5;
                        value = value;
                        i32 = i32;
                        i30 = i30;
                        strM10633 = strM10633;
                        sb4 = sb4;
                        i28 = i7;
                        i27 = i4;
                        i29 = i29;
                    } else {
                        int iM25618 = (C0630.m2566("֨۟") + i25) * (-27);
                        i = ((iM25618 ^ i26) * 15175) ^ 2070091404;
                        i3 = iM25618 ^ 203334214;
                        sb3 = sb16;
                        i27 = i;
                        value = value;
                        i32 = i32;
                        i30 = i30;
                        strM10633 = strM10633;
                        sb4 = sb4;
                        i28 = i3;
                        i29 = i29;
                    }
                    break;
                case 281898247:
                case 926802011:
                    if (((value >>> 24) & 255) <= 64) {
                        iM2568 = C2105.m6981("᩵᩻") ^ i25;
                        i27 = ((iM2568 ^ i26) * 14043) ^ 2105202844;
                        i10 = 1196515449;
                        i21 = iM2568 ^ i10;
                        i29 = i29;
                        StringBuilder sb17 = sb4;
                        i28 = i21;
                        sb4 = sb17;
                    } else {
                        iM2569 = (C0630.m2566("᩵۫") + i26) * (-113);
                        i22 = ((iM2569 ^ i25) * (-8893)) ^ 378728589;
                        i23 = 1637200480;
                        i28 = iM2569 ^ i23;
                        i27 = i22;
                    }
                    break;
                case 447810232:
                case 2134984243:
                    if (C3019.f9544 >= 0) {
                        sb4 = sb4;
                        i29 = i29;
                        strM10633 = strM10633;
                        iM6982 = C0630.m2566("ۜۚ") ^ i25;
                        i8 = ((iM6982 ^ i26) * 2829) ^ (-475321210);
                        i9 = -2055795492;
                        i3 = iM6982 ^ i9;
                        strM10633 = strM10633;
                        i27 = i8;
                        sb4 = sb4;
                        i28 = i3;
                        i29 = i29;
                    }
                    sb4 = sb4;
                    i29 = i29;
                    strM10633 = strM10633;
                    i30 = i30;
                    i32 = i32;
                    value = value;
                    iM6981 = C2105.m6981("ܽ۬") ^ i25;
                    i4 = ((iM6981 ^ i26) * (-26675)) ^ 2013535423;
                    i5 = -46292298;
                    i7 = iM6981 ^ i5;
                    value = value;
                    i32 = i32;
                    i30 = i30;
                    strM10633 = strM10633;
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
                    str = strM10633;
                    i14 = i30;
                    i15 = i32;
                    i16 = value;
                    C3245.m9923(sb2, C4117.m12353(interfaceC21211.getType()));
                    C0630.m2567(sb2, '/');
                    if (C22628.f73083 <= 0) {
                        iM6984 = C0630.m2566("᩶ᩴ") ^ i26;
                        i17 = ((iM6984 ^ i25) * 28365) ^ 306321465;
                        i18 = 685709852;
                    } else {
                        iM6984 = (C2105.m6981("۫۠") ^ i26) * 19;
                        i17 = ((iM6984 ^ i25) * (-9909)) ^ (-203411282);
                        i18 = 1451822586;
                    }
                    sb3 = sb2;
                    i29 = i13;
                    int i314 = i14;
                    strM10633 = str;
                    sb4 = sb;
                    i28 = iM6984 ^ i18;
                    i27 = i17;
                    value = i16;
                    i32 = i15;
                    i30 = i314;
                    break;
                case 1002297934:
                case 1371910903:
                    interfaceC1454 = (InterfaceC1454) C2272.m7513(itM20833);
                    sb4 = new StringBuilder();
                    C0630.m2567(sb4, '\n');
                    if (interfaceC1454.mo5006() != -1) {
                        iM2569 = C0630.m2566("ۧۚ") ^ i26;
                        i22 = ((iM2569 ^ i25) * 10499) ^ 584169500;
                        i23 = 1636962594;
                    } else {
                        iM2569 = (C0630.m2566("۠ۗ") ^ i25) * (-45);
                        i22 = ((iM2569 ^ i26) * (-7027)) ^ (-1939035992);
                        i23 = 1449788971;
                    }
                    i28 = iM2569 ^ i23;
                    i27 = i22;
                    break;
                case 1030692820:
                case 1720654178:
                    C2105.m6985(spannableStringBuilder2, new ForegroundColorSpan(C7466.m20005(value, C21943.f70284)), iM11928, C1047.m3592(spannableStringBuilder), i30);
                    iM2568 = C2105.m6981("᩵᩻") ^ i25;
                    i27 = ((iM2568 ^ i26) * 14043) ^ 2105202844;
                    i10 = 1196515449;
                    i21 = iM2568 ^ i10;
                    i29 = i29;
                    StringBuilder sb18 = sb4;
                    i28 = i21;
                    sb4 = sb18;
                    break;
                case 1053245277:
                case 1451004102:
                    if (C2126.m7040()) {
                        iM2569 = (C2105.m6981("᩷ۧ") ^ i25) * 101;
                        i22 = ((iM2569 ^ i26) * (-25217)) ^ (-330781242);
                        i23 = -402524862;
                    } else {
                        iM2569 = (i25 - C2105.m6981("۟ܺ")) * (-111);
                        i22 = ((iM2569 ^ i26) * (-11249)) ^ 61300019;
                        i23 = 1111630627;
                    }
                    i28 = iM2569 ^ i23;
                    i27 = i22;
                    break;
                case 1575638598:
                case 1582484122:
                    sb4 = sb4;
                    i29 = i29;
                    strM10633 = strM10633;
                    i30 = i30;
                    i32 = i32;
                    value = value;
                    short s = sArr[c2];
                    if (((s * s) + 188348176) - (s * 27448) >= 0) {
                        iM2566 = C0630.m2566("֫ܶ") ^ i25;
                        i = ((iM2566 ^ i26) * 30983) ^ (-1113297984);
                        i2 = 325133909;
                    } else {
                        iM2566 = (C0630.m2566("᩷᩻") ^ i26) * 17;
                        i = ((iM2566 ^ i25) * 1537) ^ (-1478634859);
                        i2 = 840532484;
                    }
                    i3 = iM2566 ^ i2;
                    i27 = i;
                    value = value;
                    i32 = i32;
                    i30 = i30;
                    strM10633 = strM10633;
                    sb4 = sb4;
                    i28 = i3;
                    i29 = i29;
                    break;
                case 1803446287:
                case 1936875492:
                    AbstractC2021.m6574();
                    if (C4263.f13799 > 0) {
                        iM2569 = (i25 - C2105.m6981("۟ܺ")) * (-111);
                        i22 = ((iM2569 ^ i26) * (-11249)) ^ 61300019;
                        i23 = 1111630627;
                    } else {
                        iM2569 = (i26 - C2105.m6981("᩹֡")) * 57;
                        i22 = ((iM2569 ^ i25) * (-11235)) ^ 1417424099;
                        i23 = -972158601;
                    }
                    i28 = iM2569 ^ i23;
                    i27 = i22;
                    break;
                default:
                    sb4 = sb4;
                    i29 = i29;
                    strM10633 = strM10633;
                    i30 = i30;
                    i32 = i32;
                    value = value;
                    String strM7507 = C2272.m7507(f26255, 23, 1, i31);
                    if (C3245.f10203 <= 0) {
                        iM6983 = C2105.m6981("֫ܳ") ^ i26;
                        i4 = ((iM6983 ^ i25) * (-10845)) ^ (-673625246);
                        i11 = 873258406;
                    } else {
                        StringBuilder sb19 = new StringBuilder(strM7507);
                        C1420.m4905(sb19, interfaceC21211.mo29406());
                        strM1959 = C0422.m1959(sb19);
                        iM6983 = (C0630.m2566("ۡ֨") + i25) * (-27);
                        i4 = ((iM6983 ^ i26) * 6239) ^ 549830263;
                        i11 = 152518383;
                    }
                    i7 = iM6983 ^ i11;
                    value = value;
                    i32 = i32;
                    i30 = i30;
                    strM10633 = strM10633;
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
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m22322(SpannableStringBuilder spannableStringBuilder, String str) {
        int iM2566;
        int i;
        int iM3592 = 0;
        int iM6382 = 0;
        int i2 = 0;
        int i3 = 447926174;
        int i4 = C0050.f910;
        int i5 = C3019.f9544;
        int iM2567 = C0630.m2566("ܿ֡") ^ i4;
        int i6 = ((iM2567 ^ i5) * (-1577)) ^ (-306560813);
        int i7 = 1346199669;
        while (true) {
            int i8 = iM2567 ^ i7;
            StyleSpan styleSpan = null;
            while (true) {
                i3 = ((((i3 ^ i5) * (-15343)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2045029254:
                    case 14058452:
                        if (C4159.f13567) {
                            iM2566 = (C2105.m6981("᩸֫") ^ i5) * 79;
                            i6 = ((iM2566 ^ i4) * (-1243)) ^ (-1758030876);
                            i = 1560738871;
                        } else {
                            iM2566 = C0630.m2566("᩻ۛ") ^ i4;
                            i6 = ((iM2566 ^ i5) * (-5623)) ^ (-1846267525);
                            i = -847431663;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -1741673300:
                    case 1195375763:
                        C2126.m7040();
                        if (!C1005.f3721) {
                            iM2566 = (C0630.m2566("ۚۗ") + i4) * 41;
                            i6 = ((iM2566 ^ i5) * (-17953)) ^ (-340315290);
                            i = 1984056860;
                            i8 = iM2566 ^ i;
                        }
                        break;
                    case -1655074439:
                    case 809003479:
                        if (C4263.m12819() >= 0) {
                            iM2566 = C0630.m2566("᩻ۛ") ^ i4;
                            i6 = ((iM2566 ^ i5) * (-5623)) ^ (-1846267525);
                            i = -847431663;
                        } else {
                            iM2566 = (C0630.m2566("ۘ᩶") ^ i5) * 99;
                            i6 = ((iM2566 ^ i4) * 14605) ^ 1273263160;
                            i = 1115357079;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -1557472952:
                    case 1372180128:
                        if (C3019.f9544 < 0) {
                            if (!C1711.f5919) {
                                C0630.m2576(spannableStringBuilder, new RelativeSizeSpan(1.1f), iM3592, C1047.m3592(spannableStringBuilder), i2);
                            }
                            iM2566 = (C0630.m2566("ۜۢ") ^ i5) * 45;
                            i6 = ((iM2566 ^ i4) * (-7487)) ^ 907900298;
                            i = -2107342291;
                            i8 = iM2566 ^ i;
                            break;
                        }
                        break;
                    case -1512470965:
                    case -131254185:
                        if (C0483.f2088 >= 0) {
                            iM2566 = (C0630.m2566("ۜۢ") ^ i5) * 45;
                            i6 = ((iM2566 ^ i4) * (-7487)) ^ 907900298;
                            i = -2107342291;
                        } else {
                            iM2566 = (C0630.m2566("ܰ᩷") ^ i5) * 59;
                            i6 = ((iM2566 ^ i4) * 2825) ^ (-277644232);
                            i = 1500343124;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -1492123619:
                    case 1979648232:
                        iM3592 = C1047.m3592(spannableStringBuilder);
                        if (C1916.f6442) {
                            iM2566 = (C0630.m2566("᩵ۗ") + i4) * 45;
                            i6 = ((iM2566 ^ i5) * 965) ^ (-1479755140);
                            i = 896682440;
                        } else {
                            iM2566 = (C0630.m2566("ۜۢ") ^ i5) * 45;
                            i6 = ((iM2566 ^ i4) * (-7487)) ^ 907900298;
                            i = -2107342291;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -1399284868:
                    case 1790254000:
                        if (C11340.f33930 >= 0) {
                            iM2566 = C0630.m2566("᩻ۛ") ^ i4;
                            i6 = ((iM2566 ^ i5) * (-5623)) ^ (-1846267525);
                            i = -847431663;
                        } else {
                            iM2566 = C0630.m2566("۬ۢ") ^ i4;
                            i6 = ((iM2566 ^ i5) * 29643) ^ 913908371;
                            i = 1501316726;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -613146092:
                    case -68659461:
                        iM6382 = RunnableC1937.m6382(spannableStringBuilder);
                        if (C7106.m19120() <= 0) {
                            iM2566 = (C0630.m2566("ۜۢ") ^ i5) * 45;
                            i6 = ((iM2566 ^ i4) * (-7487)) ^ 907900298;
                            i = -2107342291;
                        } else {
                            iM2566 = (C2105.m6981("ۘۜ") + i4) * 17;
                            i6 = ((iM2566 ^ i5) * 20839) ^ 1907720669;
                            i = 822581136;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -563833541:
                    case -167581009:
                        i2 = 33;
                        C2105.m6985(spannableStringBuilder, styleSpan, iM3592, iM6382, 33);
                        if (C3663.m11168() >= 0) {
                            iM2566 = (C0630.m2566("ۜۢ") ^ i5) * 45;
                            i6 = ((iM2566 ^ i4) * (-7487)) ^ 907900298;
                            i = -2107342291;
                        } else {
                            iM2566 = (C0630.m2566("ۤ᩺") ^ i5) * (-47);
                            i6 = ((iM2566 ^ i4) * 24951) ^ (-25328541);
                            i = -59750514;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case 137594138:
                    case 820875840:
                        C3019.m9255();
                        break;
                    case 825558790:
                    case 1056297230:
                        C2167.m7155();
                        break;
                    case 836443802:
                    case 1344255666:
                        C0382.m1848();
                        if (C3537.f11231 < 0) {
                        }
                        iM2566 = (C2105.m6981("᩸֫") ^ i5) * 79;
                        i6 = ((iM2566 ^ i4) * (-1243)) ^ (-1758030876);
                        i = 1560738871;
                        i8 = iM2566 ^ i;
                        break;
                    default:
                        C0237.m1490(spannableStringBuilder, str);
                        if (RunnableC1937.f6483 < 0) {
                            styleSpan = new StyleSpan(1);
                            if (C1294.m4372() > 0) {
                                iM2566 = C0630.m2566("֫ۢ") ^ i5;
                                i6 = ((iM2566 ^ i4) * (-15605)) ^ (-1617654005);
                                i = 373909916;
                                i8 = iM2566 ^ i;
                            }
                        }
                        break;
                }
                return;
            }
            iM2567 = (C2105.m6981("᩸֡") ^ i4) * (-97);
            i6 = ((iM2567 ^ i5) * (-15105)) ^ 168566234;
            i7 = 2080293584;
        }
    }
}
