package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩷ۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J1XT */
/* JADX INFO: loaded from: classes5.dex */
public final class C20781 extends AbstractC19902 {

    /* JADX INFO: renamed from: ۢۜ᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f67298 = {980, 16902, 22016, -28422, 22899, -25545, -30962, 9457, -12107, 15757, -12069};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8786 f67299;

    @Override // l.AbstractC19902
    public final int getItemViewType(int i) {
        ActivityC8786 activityC8786 = null;
        String[][] strArr = null;
        int length = 0;
        String[][] strArr2 = null;
        int i2 = -1847310386;
        int i3 = C3245.f10203;
        int i4 = C2520.f8000;
        int iM6981 = C2105.m6981("ۡ᩵") ^ i4;
        int i5 = ((iM6981 ^ i3) * (-3001)) ^ 1708290564;
        int i6 = -1981287952;
        while (true) {
            i2 = ((((i2 ^ i3) * (-1583)) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -2058191679:
                case -824417329:
                    C11340.m28031();
                    if (!C2126.m7040()) {
                        iM6981 = (i4 - C2105.m6981("ۗ֫")) * 93;
                        i5 = ((iM6981 ^ i3) * 23649) ^ (-1861391063);
                        i6 = -730562641;
                    } else {
                        iM6981 = C2105.m6981("ۗۚ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 28705) ^ 1327753381;
                        i6 = 544868222;
                    }
                    break;
                case -1949408585:
                case 2016393526:
                    if (i < strArr2.length + length) {
                        iM6981 = (C0630.m2566("۬۟") ^ i3) * 79;
                        i5 = ((iM6981 ^ i4) * (-27143)) ^ 834876095;
                        i6 = 2126552640;
                    } else {
                        iM6981 = (C0630.m2566("ۡۗ") + i4) * (-41);
                        i5 = ((iM6981 ^ i3) * 25875) ^ 753370415;
                        i6 = 2091676164;
                    }
                    break;
                case -1875563957:
                case -229545560:
                    if (C1916.f6442) {
                        iM6981 = (C0630.m2566("ۧܰ") + i4) * (-65);
                        i5 = ((iM6981 ^ i3) * 22297) ^ 616328954;
                        i6 = -1954230896;
                    } else {
                        iM6981 = C0630.m2566("ۙۗ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 4737) ^ (-235014059);
                        i6 = 621316677;
                    }
                    break;
                case -1865452041:
                case 1776437000:
                    activityC8786 = this.f67299;
                    if (C0630.f2410 <= 0) {
                        iM6981 = C0630.m2566("ۙۗ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 4737) ^ (-235014059);
                        i6 = 621316677;
                    } else {
                        iM6981 = (C2105.m6981("᩹ۨ") + i3) * 93;
                        i5 = ((iM6981 ^ i4) * (-12869)) ^ 460227004;
                        i6 = -1419236418;
                    }
                    break;
                case -1693217815:
                case -1683172855:
                    if (C0483.m2121()) {
                        iM6981 = C2105.m6981("ۗܿ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 6665) ^ (-1956880917);
                        i6 = -498707436;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۗ֫")) * 93;
                        i5 = ((iM6981 ^ i3) * 23649) ^ (-1861391063);
                        i6 = -730562641;
                    }
                    break;
                case -1364420337:
                case 2023367032:
                    C3911.m11924();
                    iM6981 = C0630.m2566("۫᩻") ^ i3;
                    i5 = ((iM6981 ^ i4) * 30635) ^ (-70381495);
                    i6 = 1968141115;
                    break;
                case -1222890745:
                case -556476158:
                    return 1;
                case -806938141:
                case 625860410:
                    if (C0483.m2121()) {
                        iM6981 = (C0630.m2566("ۤܽ") + i3) * 11;
                        i5 = ((iM6981 ^ i4) * 1451) ^ 1028584406;
                        i6 = -1995366301;
                    } else {
                        iM6981 = C0630.m2566("۫᩻") ^ i3;
                        i5 = ((iM6981 ^ i4) * 30635) ^ (-70381495);
                        i6 = 1968141115;
                    }
                    break;
                case -582972139:
                case 1221338963:
                    return 0;
                case -572368212:
                case 38000144:
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = (i4 - C2105.m6981("ۗ֫")) * 93;
                        i5 = ((iM6981 ^ i3) * 23649) ^ (-1861391063);
                        i6 = -730562641;
                    } else {
                        iM6981 = (C2105.m6981("ᩳۤ") + i3) * (-71);
                        i5 = ((iM6981 ^ i4) * (-9571)) ^ 102486161;
                        i6 = -2088981082;
                    }
                    break;
                case -232343634:
                case 1463212963:
                    C3746.m11369();
                    return 0;
                case -77046801:
                case 33785333:
                    if (C2105.m6982() == 0) {
                        iM6981 = (i4 - C2105.m6981("ۗ֫")) * 93;
                        i5 = ((iM6981 ^ i3) * 23649) ^ (-1861391063);
                        i6 = -730562641;
                    } else {
                        iM6981 = C0630.m2566("۫᩻") ^ i3;
                        i5 = ((iM6981 ^ i4) * 30635) ^ (-70381495);
                        i6 = 1968141115;
                    }
                    break;
                case -60870927:
                case 806190965:
                    length = strArr.length;
                    strArr2 = activityC8786.f26759;
                    if (C0714.f2697 >= 0) {
                        iM6981 = C2105.m6981("۫ۛ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-20557)) ^ (-1951143542);
                        i6 = -324671753;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ܺ֡")) * 17;
                        i5 = ((iM6981 ^ i3) * (-32185)) ^ (-1143629486);
                        i6 = 1036891211;
                    }
                    break;
                case -37584084:
                case 740944645:
                    strArr = activityC8786.f26758;
                    if (C2105.f7037 != 0) {
                        iM6981 = C2105.m6981("۫ۛ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-20557)) ^ (-1951143542);
                        i6 = -324671753;
                    } else {
                        iM6981 = C2105.m6981("ۨۧ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-28789)) ^ 1075104613;
                        i6 = 309656546;
                    }
                    break;
                case 24393427:
                case 506254362:
                    if (C1047.f3863 >= 0) {
                        iM6981 = (i4 - C2105.m6981("ۗ֫")) * 93;
                        i5 = ((iM6981 ^ i3) * 23649) ^ (-1861391063);
                        i6 = -730562641;
                    } else {
                        iM6981 = C2105.m6981("ܺۛ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 647) ^ 1659061071;
                        i6 = -1823172588;
                    }
                    break;
                case 129057262:
                case 1861865359:
                    C3245.m9925();
                    if (C2105.f7037 == 0) {
                        iM6981 = C0630.m2566("ۙۗ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 4737) ^ (-235014059);
                        i6 = 621316677;
                    } else {
                        iM6981 = C0630.m2566("۫᩻") ^ i3;
                        i5 = ((iM6981 ^ i4) * 30635) ^ (-70381495);
                        i6 = 1968141115;
                    }
                    break;
                case 418428577:
                case 883203429:
                    if (C5695.f17556 >= 0) {
                        iM6981 = C0630.m2566("۫᩻") ^ i3;
                        i5 = ((iM6981 ^ i4) * 30635) ^ (-70381495);
                        i6 = 1968141115;
                    } else {
                        iM6981 = (i3 - C0630.m2566("֡ۛ")) * (-115);
                        i5 = ((iM6981 ^ i4) * 22719) ^ (-1164637826);
                        i6 = 409080511;
                    }
                    break;
                default:
                    if (C2167.f7158 >= 0) {
                        iM6981 = C2105.m6981("ۗۚ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 28705) ^ 1327753381;
                        i6 = 544868222;
                    } else {
                        iM6981 = (C2105.m6981("ܽ۟") ^ i4) * (-9);
                        i5 = ((iM6981 ^ i3) * (-17839)) ^ 1656122155;
                        i6 = 846694144;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x02de A[PHI: r8 r9 r19 r20 r21
      0x02de: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short) binds: [B:70:0x02dc, B:66:0x02b6, B:41:0x0165] A[DONT_GENERATE, DONT_INLINE]
      0x02de: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:70:0x02dc, B:66:0x02b6, B:41:0x0165] A[DONT_GENERATE, DONT_INLINE]
      0x02de: PHI (r19v12 android.view.LayoutInflater) = (r19v4 android.view.LayoutInflater), (r19v5 android.view.LayoutInflater), (r19v13 android.view.LayoutInflater) binds: [B:70:0x02dc, B:66:0x02b6, B:41:0x0165] A[DONT_GENERATE, DONT_INLINE]
      0x02de: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:70:0x02dc, B:66:0x02b6, B:41:0x0165] A[DONT_GENERATE, DONT_INLINE]
      0x02de: PHI (r21v13 l.ۡۡ᩷) = (r21v3 l.ۡۡ᩷), (r21v4 l.ۡۡ᩷), (r21v15 l.ۡۡ᩷) binds: [B:70:0x02dc, B:66:0x02b6, B:41:0x0165] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0314 A[PHI: r4 r12 r19 r21
      0x0314: PHI (r4v5 int) = (r4v2 int), (r4v2 int), (r4v6 int) binds: [B:74:0x0312, B:58:0x0250, B:18:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0314: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:74:0x0312, B:58:0x0250, B:18:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0314: PHI (r19v16 android.view.LayoutInflater) = (r19v3 android.view.LayoutInflater), (r19v7 android.view.LayoutInflater), (r19v17 android.view.LayoutInflater) binds: [B:74:0x0312, B:58:0x0250, B:18:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0314: PHI (r21v21 l.ۡۡ᩷) = (r21v2 l.ۡۡ᩷), (r21v6 l.ۡۡ᩷), (r2v2 l.ۡۡ᩷) binds: [B:74:0x0312, B:58:0x0250, B:18:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int iM6981;
        LayoutInflater layoutInflater;
        int i2;
        int i3;
        int iM6982;
        int i4;
        int i5;
        int i6 = i;
        int i7 = C3537.f11231;
        int i8 = C2520.f8000;
        int iM6983 = C2105.m6981("֡۠") ^ i7;
        int i9 = ((iM6983 ^ i8) * (-13027)) ^ (-1042476767);
        LayoutInflater layoutInflaterFrom = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM6983 ^ (-1318437962);
        ActivityC8786 activityC8786 = null;
        short s = 0;
        short s2 = 0;
        int i11 = 0;
        short s3 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -1996470030;
        String strM11919 = null;
        View viewInflate = null;
        int iM6984 = 0;
        while (true) {
            i15 = i10 ^ (i9 & (((i15 ^ i8) * (-20455)) >> 31));
            switch (i15) {
                case -1534239947:
                case 252792341:
                    layoutInflaterFrom = LayoutInflater.from(activityC8786);
                    sArr2 = f67298;
                    if (C1711.f5919) {
                        i14 = 8;
                        iM6981 = (C2105.m6981("ۗۖ") ^ i7) * (-73);
                        layoutInflater = layoutInflaterFrom;
                        i2 = ((iM6981 ^ i8) * 18163) ^ 1396430994;
                        i3 = 1903663178;
                        LayoutInflater layoutInflater2 = layoutInflater;
                        i10 = iM6981 ^ i3;
                        i9 = i2;
                        layoutInflaterFrom = layoutInflater2;
                    } else {
                        int iM2566 = C0630.m2566("ۧۘ") ^ i8;
                        i10 = iM2566 ^ (-1265011825);
                        i9 = ((iM2566 ^ i7) * (-28079)) ^ 1001290556;
                        i14 = 8;
                    }
                    break;
                case -1345310956:
                case 1592290064:
                    activityC8786 = activityC8786;
                    layoutInflaterFrom = layoutInflaterFrom;
                    if ((i12 + 1) - i11 <= 0) {
                        iM6982 = (C0630.m2566("ۗۤ") + i7) * 59;
                        i9 = ((iM6982 ^ i8) * 25591) ^ 1647955786;
                        i4 = -2048575041;
                    } else {
                        iM6982 = (C2105.m6981("ᩳۚ") + i8) * (-117);
                        i9 = ((iM6982 ^ i7) * (-31959)) ^ (-453797184);
                        i4 = 1382027485;
                    }
                    i5 = iM6982 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC8786 = activityC8786;
                    i10 = i5;
                    i6 = i;
                    break;
                case -1341763171:
                case 1796347251:
                    return new ViewOnClickListenerC9492(activityC8786, viewInflate, i6);
                case -1320024310:
                case 168151463:
                    ViewOnClickListenerC1958.m6429();
                    return null;
                case -823252805:
                case 1600178326:
                    viewInflate = layoutInflaterFrom.inflate(iM6984, viewGroup, false);
                    layoutInflaterFrom = layoutInflaterFrom;
                    int iM2567 = C0630.m2566("֫۫") ^ i7;
                    layoutInflaterFrom = layoutInflaterFrom;
                    i10 = iM2567 ^ (-1163153511);
                    i9 = ((iM2567 ^ i8) * (-23349)) ^ 990507076;
                    activityC8786 = activityC8786;
                    break;
                case -723845207:
                case 571119606:
                    activityC8786 = activityC8786;
                    layoutInflaterFrom = layoutInflaterFrom;
                    sArr = f67298;
                    if (C0714.m2805()) {
                        iM6982 = C2105.m6981("ۡ۫") ^ i8;
                        i9 = ((iM6982 ^ i7) * 12465) ^ (-597187064);
                        i4 = -160956856;
                    } else {
                        iM6982 = (C2105.m6981("᩵᩹") + i8) * 97;
                        i9 = ((iM6982 ^ i7) * (-24359)) ^ (-1607328033);
                        i4 = -65013257;
                    }
                    i5 = iM6982 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC8786 = activityC8786;
                    i10 = i5;
                    i6 = i;
                    break;
                case -704779982:
                case 380586511:
                    if (C2958.f9394 < 0) {
                        iM6981 = (C2105.m6981("ۗۖ") ^ i7) * (-73);
                        layoutInflater = layoutInflaterFrom;
                        i2 = ((iM6981 ^ i8) * 18163) ^ 1396430994;
                        i3 = 1903663178;
                        LayoutInflater layoutInflater3 = layoutInflater;
                        i10 = iM6981 ^ i3;
                        i9 = i2;
                        layoutInflaterFrom = layoutInflater3;
                    }
                    layoutInflater = layoutInflaterFrom;
                    iM6981 = C0630.m2566("᩷֡") ^ i8;
                    i2 = ((iM6981 ^ i7) * (-17925)) ^ (-361150188);
                    i3 = -1683503952;
                    LayoutInflater layoutInflater4 = layoutInflater;
                    i10 = iM6981 ^ i3;
                    i9 = i2;
                    layoutInflaterFrom = layoutInflater4;
                    break;
                case -699631076:
                case 2080030100:
                    activityC8786 = activityC8786;
                    layoutInflaterFrom = layoutInflaterFrom;
                    int i16 = s + s2;
                    i11 = i16 * i16;
                    s3 = 2;
                    if (C2167.m7155()) {
                        iM6982 = C2105.m6981("᩷ܶ") ^ i7;
                        i9 = ((iM6982 ^ i8) * (-27605)) ^ (-1271025658);
                        i4 = -608174478;
                    } else {
                        iM6982 = C2105.m6981("᩵ۨ") ^ i7;
                        i9 = ((iM6982 ^ i8) * (-857)) ^ 232727620;
                        i4 = -1801809325;
                    }
                    i5 = iM6982 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC8786 = activityC8786;
                    i10 = i5;
                    i6 = i;
                    break;
                case -453133329:
                case 2119599220:
                    i13 = 64152;
                    iM6982 = (i7 - C2105.m6981("ܿۜ")) * (-65);
                    i9 = ((iM6982 ^ i8) * (-32679)) ^ 31939790;
                    i4 = -299475163;
                    i5 = iM6982 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC8786 = activityC8786;
                    i10 = i5;
                    i6 = i;
                    break;
                case -232184394:
                case 1361359994:
                    layoutInflaterFrom = layoutInflaterFrom;
                    View view = new View(activityC8786);
                    if (AbstractC2021.m6574()) {
                        activityC8786 = activityC8786;
                        iM6982 = (C2105.m6981("᩵᩹") + i8) * 97;
                        i9 = ((iM6982 ^ i7) * (-24359)) ^ (-1607328033);
                        i4 = -65013257;
                        i5 = iM6982 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                        activityC8786 = activityC8786;
                        i10 = i5;
                        i6 = i;
                    } else if (!C2126.f7087) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-1, ViewOnClickListenerC1958.m6431(10.0f)));
                        viewInflate = view;
                        int iM2568 = C0630.m2566("֫۫") ^ i7;
                        layoutInflaterFrom = layoutInflaterFrom;
                        i10 = iM2568 ^ (-1163153511);
                        i9 = ((iM2568 ^ i8) * (-23349)) ^ 990507076;
                        activityC8786 = activityC8786;
                    } else {
                        iM6982 = (C0630.m2566("᩸۠") ^ i8) * 97;
                        i9 = ((iM6982 ^ i7) * 23033) ^ (-810940598);
                        i4 = -1521391157;
                        i5 = iM6982 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                        activityC8786 = activityC8786;
                        i10 = i5;
                        i6 = i;
                    }
                    break;
                case -154438945:
                case 1624474275:
                    activityC8786 = activityC8786;
                    layoutInflaterFrom = layoutInflaterFrom;
                    if (RunnableC1108.f4040) {
                        iM6982 = C2105.m6981("ۗ֨") ^ i7;
                        i9 = ((iM6982 ^ i8) * (-15631)) ^ 1055451104;
                        i4 = -206355955;
                    } else {
                        iM6982 = (C0630.m2566("᩸۠") ^ i8) * 97;
                        i9 = ((iM6982 ^ i7) * 23033) ^ (-810940598);
                        i4 = -1521391157;
                    }
                    i5 = iM6982 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC8786 = activityC8786;
                    i10 = i5;
                    i6 = i;
                    break;
                case 102300489:
                case 1060988682:
                    layoutInflater = layoutInflaterFrom;
                    strM11919 = C3911.m11919(sArr2, i14, 3, i13);
                    if (C11340.f33930 >= 0) {
                        iM6981 = C0630.m2566("᩷֡") ^ i8;
                        i2 = ((iM6981 ^ i7) * (-17925)) ^ (-361150188);
                        i3 = -1683503952;
                    } else {
                        iM6981 = (C0630.m2566("۫ܿ") ^ i7) * (-9);
                        i2 = ((iM6981 ^ i8) * 9401) ^ 762412751;
                        i3 = -494277798;
                    }
                    LayoutInflater layoutInflater5 = layoutInflater;
                    i10 = iM6981 ^ i3;
                    i9 = i2;
                    layoutInflaterFrom = layoutInflater5;
                    break;
                case 113486901:
                case 1159767306:
                    activityC8786 = activityC8786;
                    layoutInflaterFrom = layoutInflaterFrom;
                    i12 = s * s3;
                    if (C4075.f12947 >= 0) {
                        iM6982 = (C0630.m2566("᩸۠") ^ i8) * 97;
                        i9 = ((iM6982 ^ i7) * 23033) ^ (-810940598);
                        i4 = -1521391157;
                    } else {
                        iM6982 = (i8 - C2105.m6981("᩻ۡ")) * (-55);
                        i9 = ((iM6982 ^ i7) * (-30977)) ^ 109244104;
                        i4 = -1348803990;
                    }
                    i5 = iM6982 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC8786 = activityC8786;
                    i10 = i5;
                    i6 = i;
                    break;
                case 206846737:
                case 1123972424:
                    iM6984 = 2129519140 ^ C2105.m6981(strM11919);
                    if (C1128.f4106 > 0) {
                        iM6981 = C2105.m6981("ۧۧ") ^ i8;
                        layoutInflater = layoutInflaterFrom;
                        i2 = ((iM6981 ^ i7) * (-11475)) ^ 674651787;
                        i3 = 1162492943;
                        LayoutInflater layoutInflater6 = layoutInflater;
                        i10 = iM6981 ^ i3;
                        i9 = i2;
                        layoutInflaterFrom = layoutInflater6;
                    } else {
                        layoutInflaterFrom = layoutInflaterFrom;
                        iM6982 = (C0630.m2566("᩸۠") ^ i8) * 97;
                        i9 = ((iM6982 ^ i7) * 23033) ^ (-810940598);
                        i4 = -1521391157;
                        i5 = iM6982 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                        activityC8786 = activityC8786;
                        i10 = i5;
                        i6 = i;
                    }
                    break;
                case 268449518:
                case 965930598:
                    if (C2520.f8000 >= 0) {
                        layoutInflaterFrom = layoutInflaterFrom;
                        iM6982 = (C0630.m2566("᩸۠") ^ i8) * 97;
                        i9 = ((iM6982 ^ i7) * 23033) ^ (-810940598);
                        i4 = -1521391157;
                        i5 = iM6982 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                        activityC8786 = activityC8786;
                        i10 = i5;
                        i6 = i;
                    }
                    activityC8786 = activityC8786;
                    layoutInflaterFrom = layoutInflaterFrom;
                    iM6982 = C2105.m6981("᩷ܶ") ^ i7;
                    i9 = ((iM6982 ^ i8) * (-27605)) ^ (-1271025658);
                    i4 = -608174478;
                    i5 = iM6982 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC8786 = activityC8786;
                    i10 = i5;
                    i6 = i;
                    break;
                case 335099259:
                case 1341276279:
                    C11340.m28031();
                    activityC8786 = activityC8786;
                    layoutInflaterFrom = layoutInflaterFrom;
                    iM6982 = C2105.m6981("᩷ܶ") ^ i7;
                    i9 = ((iM6982 ^ i8) * (-27605)) ^ (-1271025658);
                    i4 = -608174478;
                    i5 = iM6982 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC8786 = activityC8786;
                    i10 = i5;
                    i6 = i;
                    break;
                case 773388502:
                case 1059255575:
                    LayoutInflater layoutInflater7 = layoutInflaterFrom;
                    ActivityC8786 activityC8787 = this.f67299;
                    if (i6 != 1) {
                        int iM2569 = C0630.m2566("ܳܿ") ^ i8;
                        activityC8786 = activityC8787;
                        layoutInflaterFrom = layoutInflater7;
                        i10 = iM2569 ^ (-2068488147);
                        i9 = ((iM2569 ^ i7) * 15953) ^ 974362418;
                    } else {
                        int iM6985 = C2105.m6981("ۤ۟") ^ i7;
                        i9 = ((iM6985 ^ i8) * (-15355)) ^ 1406426165;
                        i5 = iM6985 ^ (-2137168821);
                        activityC8786 = activityC8787;
                        layoutInflaterFrom = layoutInflater7;
                        i10 = i5;
                    }
                    i6 = i;
                    break;
                case 1131829193:
                case 1200010318:
                    C1773.m5908();
                    if (RunnableC3474.f10992 > 0) {
                        layoutInflater = layoutInflaterFrom;
                        iM6981 = C0630.m2566("᩷֡") ^ i8;
                        i2 = ((iM6981 ^ i7) * (-17925)) ^ (-361150188);
                        i3 = -1683503952;
                        LayoutInflater layoutInflater8 = layoutInflater;
                        i10 = iM6981 ^ i3;
                        i9 = i2;
                        layoutInflaterFrom = layoutInflater8;
                    } else {
                        activityC8786 = activityC8786;
                        layoutInflaterFrom = layoutInflaterFrom;
                        iM6982 = C2105.m6981("᩷ܶ") ^ i7;
                        i9 = ((iM6982 ^ i8) * (-27605)) ^ (-1271025658);
                        i4 = -608174478;
                        i5 = iM6982 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                        activityC8786 = activityC8786;
                        i10 = i5;
                        i6 = i;
                    }
                    break;
                case 1661155274:
                case 2109991478:
                    activityC8786 = activityC8786;
                    layoutInflaterFrom = layoutInflaterFrom;
                    s = sArr[7];
                    s2 = 1;
                    if (C2167.f7158 >= 0) {
                        iM6982 = (C2105.m6981("᩵᩹") + i8) * 97;
                        i9 = ((iM6982 ^ i7) * (-24359)) ^ (-1607328033);
                        i4 = -65013257;
                    } else {
                        iM6982 = C2105.m6981("ۙۨ") ^ i8;
                        i9 = ((iM6982 ^ i7) * (-29319)) ^ 796294305;
                        i4 = -262230289;
                    }
                    i5 = iM6982 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC8786 = activityC8786;
                    i10 = i5;
                    i6 = i;
                    break;
                default:
                    i13 = 43927;
                    iM6982 = (i7 - C2105.m6981("ܿۜ")) * (-65);
                    i9 = ((iM6982 ^ i8) * (-32679)) ^ 31939790;
                    i4 = -299475163;
                    i5 = iM6982 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC8786 = activityC8786;
                    i10 = i5;
                    i6 = i;
                    break;
            }
        }
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        ActivityC8786 activityC8786 = null;
        String[][] strArr = null;
        int length = 0;
        String[][] strArr2 = null;
        int length2 = 0;
        int i = -101387176;
        int i2 = C1047.f3863;
        int i3 = C3245.f10203;
        int iM2566 = C0630.m2566("ܳ᩸") ^ i2;
        int i4 = ((iM2566 ^ i3) * 6455) ^ 397638378;
        int i5 = -1409462428;
        while (true) {
            i = ((((i ^ i3) * (-16811)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2089207673:
                case 1739932590:
                    length2 = strArr2.length + length;
                    if (C1005.f3721) {
                        iM2566 = (C0630.m2566("᩸᩶") ^ i2) * (-107);
                        i4 = ((iM2566 ^ i3) * (-17717)) ^ 627905537;
                        i5 = 495409471;
                    } else {
                        iM2566 = C2105.m6981("۟᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-1609)) ^ (-49217955);
                        i5 = -954276236;
                    }
                    break;
                case -1791914016:
                case -839385363:
                    if (C2958.f9394 >= 0) {
                        iM2566 = (C2105.m6981("᩸۫") + i3) * (-43);
                        i4 = ((iM2566 ^ i2) * 27809) ^ 1004807404;
                        i5 = 1031729144;
                    } else {
                        iM2566 = C2105.m6981("᩵ۛ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 20099) ^ (-1515120982);
                        i5 = -1738333450;
                    }
                    break;
                case -1511387303:
                case -57913193:
                    C4616.m13552();
                    iM2566 = C2105.m6981("۟᩸") ^ i3;
                    i4 = ((iM2566 ^ i2) * (-1609)) ^ (-49217955);
                    i5 = -954276236;
                    break;
                case -1473228004:
                case -1017862531:
                    if (C4159.m12565() >= 0) {
                        iM2566 = (C0630.m2566("ܶۚ") ^ i2) * 7;
                        i4 = ((iM2566 ^ i3) * 27789) ^ (-974631888);
                        i5 = -1987026652;
                    } else {
                        iM2566 = (i2 - C0630.m2566("᩻᩷")) * (-119);
                        i4 = ((iM2566 ^ i3) * (-3579)) ^ 1252341434;
                        i5 = -1819413177;
                    }
                    break;
                case -1389188430:
                case 1558449177:
                    if (C0382.m1848()) {
                        iM2566 = C2105.m6981("۟᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-1609)) ^ (-49217955);
                        i5 = -954276236;
                    } else {
                        iM2566 = (C2105.m6981("ۘۢ") ^ i3) * (-25);
                        i4 = ((iM2566 ^ i2) * (-4039)) ^ (-1474878485);
                        i5 = -291745866;
                    }
                    break;
                case -1354863700:
                case -381203620:
                    if (C1420.f5096 <= 0) {
                        iM2566 = (C2105.m6981("᩸۫") + i3) * (-43);
                        i4 = ((iM2566 ^ i2) * 27809) ^ 1004807404;
                        i5 = 1031729144;
                    } else {
                        iM2566 = (C0630.m2566("֨ܺ") + i2) * 91;
                        i4 = ((iM2566 ^ i3) * 491) ^ 188495958;
                        i5 = -2078462764;
                    }
                    break;
                case -1220444569:
                case 49738608:
                    C4117.m12364();
                    if (C5695.f17556 >= 0) {
                        iM2566 = (C2105.m6981("᩸۫") + i3) * (-43);
                        i4 = ((iM2566 ^ i2) * 27809) ^ 1004807404;
                        i5 = 1031729144;
                    } else {
                        iM2566 = C2105.m6981("۟᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-1609)) ^ (-49217955);
                        i5 = -954276236;
                    }
                    break;
                case -1172749928:
                case 1459093671:
                    if (C1005.f3721) {
                        iM2566 = (C2105.m6981("ۗ֫") + i2) * (-45);
                        i4 = ((iM2566 ^ i3) * 1571) ^ (-1216684052);
                        i5 = -1980721925;
                    } else {
                        iM2566 = C2105.m6981("۟᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-1609)) ^ (-49217955);
                        i5 = -954276236;
                    }
                    break;
                case -558976680:
                case 1474188415:
                    C3746.m11369();
                    if (C1294.m4372() > 0) {
                        iM2566 = (C2105.m6981("۫ܺ") ^ i2) * 55;
                        i4 = ((iM2566 ^ i3) * (-11535)) ^ (-812696308);
                        i5 = -1736785379;
                    } else {
                        iM2566 = C2105.m6981("۟᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-1609)) ^ (-49217955);
                        i5 = -954276236;
                    }
                    break;
                case -446213787:
                case 371385584:
                    RunnableC0588.m2441();
                    return 0;
                case -343333830:
                case 196745906:
                    strArr = activityC8786.f26758;
                    if (C1128.m3851() <= 0) {
                        iM2566 = C2105.m6981("۟᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-1609)) ^ (-49217955);
                        i5 = -954276236;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ۡ᩵")) * 23;
                        i4 = ((iM2566 ^ i3) * (-28149)) ^ 1081104739;
                        i5 = -1996838885;
                    }
                    break;
                case -212292994:
                case 646296488:
                    activityC8786 = this.f67299;
                    if (C3245.f10203 <= 0) {
                        iM2566 = (C2105.m6981("۫ܺ") ^ i2) * 55;
                        i4 = ((iM2566 ^ i3) * (-11535)) ^ (-812696308);
                        i5 = -1736785379;
                    } else {
                        iM2566 = C0630.m2566("ۧۢ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-13685)) ^ (-233527890);
                        i5 = -1924665569;
                    }
                    break;
                case 15569725:
                case 141411791:
                    if (!C1711.f5919) {
                        iM2566 = (C0630.m2566("ܶۚ") ^ i2) * 7;
                        i4 = ((iM2566 ^ i3) * 27789) ^ (-974631888);
                        i5 = -1987026652;
                    } else {
                        iM2566 = (C2105.m6981("۫ܺ") ^ i2) * 55;
                        i4 = ((iM2566 ^ i3) * (-11535)) ^ (-812696308);
                        i5 = -1736785379;
                    }
                    break;
                case 211454140:
                case 1287546072:
                    if (C0422.f1886 <= 0) {
                        iM2566 = (C2105.m6981("᩸۫") + i3) * (-43);
                        i4 = ((iM2566 ^ i2) * 27809) ^ 1004807404;
                        i5 = 1031729144;
                    } else {
                        iM2566 = C0630.m2566("ᩴۡ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-6797)) ^ (-1121061492);
                        i5 = 700479543;
                    }
                    break;
                case 1028152152:
                case 2131485410:
                    length = strArr.length;
                    strArr2 = activityC8786.f26759;
                    if (C1916.f6442) {
                        iM2566 = (i3 - C2105.m6981("᩸᩵")) * 55;
                        i4 = ((iM2566 ^ i2) * (-13533)) ^ 1778453269;
                        i5 = 15287891;
                    } else {
                        iM2566 = C2105.m6981("ᩴۧ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 25227) ^ 1202624881;
                        i5 = -1791288068;
                    }
                    break;
                default:
                    return length2 + 1;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x019a A[PHI: r9 r10 r11 r12
      0x019a: PHI (r9v4 int) = (r9v3 int), (r9v2 int) binds: [B:40:0x0198, B:32:0x0149] A[DONT_GENERATE, DONT_INLINE]
      0x019a: PHI (r10v4 android.widget.TextView) = (r10v3 android.widget.TextView), (r10v2 android.widget.TextView) binds: [B:40:0x0198, B:32:0x0149] A[DONT_GENERATE, DONT_INLINE]
      0x019a: PHI (r11v4 java.lang.String[][]) = (r11v3 java.lang.String[][]), (r11v2 java.lang.String[][]) binds: [B:40:0x0198, B:32:0x0149] A[DONT_GENERATE, DONT_INLINE]
      0x019a: PHI (r12v3 java.lang.String[][]) = (r12v2 java.lang.String[][]), (r12v4 java.lang.String[][]) binds: [B:40:0x0198, B:32:0x0149] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x0429 A[PHI: r4 r7 r16 r17 r18 r19 r20 r26
      0x0429: PHI (r4v18 android.widget.TextView) = (r4v3 android.widget.TextView), (r4v17 android.widget.TextView), (r4v22 android.widget.TextView) binds: [B:79:0x0427, B:18:0x00a8, B:6:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0429: PHI (r7v13 int) = (r7v4 int), (r7v11 int), (r7v15 int) binds: [B:79:0x0427, B:18:0x00a8, B:6:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0429: PHI (r16v3 short) = (r16v2 short), (r16v2 short), (r16v6 short) binds: [B:79:0x0427, B:18:0x00a8, B:6:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0429: PHI (r17v4 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:79:0x0427, B:18:0x00a8, B:6:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0429: PHI (r18v3 short) = (r18v2 short), (r18v2 short), (r18v6 short) binds: [B:79:0x0427, B:18:0x00a8, B:6:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0429: PHI (r19v14 l.ۢۡ᩷) = (r19v3 l.ۢۡ᩷), (r19v13 l.ۢۡ᩷), (r19v18 l.ۢۡ᩷) binds: [B:79:0x0427, B:18:0x00a8, B:6:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0429: PHI (r20v14 char) = (r20v3 char), (r20v12 char), (r20v18 char) binds: [B:79:0x0427, B:18:0x00a8, B:6:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0429: PHI (r26v13 java.lang.String) = (r26v2 java.lang.String), (r26v11 java.lang.String), (r26v16 java.lang.String) binds: [B:79:0x0427, B:18:0x00a8, B:6:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        int iM2566;
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        int i5;
        TextView textView;
        ViewOnClickListenerC9492 viewOnClickListenerC9492;
        int iM6981;
        int i6;
        int i7;
        int i8;
        char c;
        TextView textView2;
        String str3;
        String str4;
        int iM2567;
        int i9;
        int i10;
        int i11 = i;
        int i12 = C2520.f8000;
        int i13 = C3746.f11829;
        int iM2568 = (C0630.m2566("۬ۙ") ^ i13) * 45;
        int i14 = ((iM2568 ^ i12) * (-13947)) ^ 518278537;
        ActivityC8786 activityC8786 = null;
        TextView textView3 = null;
        ImageView imageView = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i15 = iM2568 ^ 410773318;
        ViewOnClickListenerC9492 viewOnClickListenerC9493 = null;
        char c2 = 0;
        char c3 = 0;
        int i16 = 0;
        short s = 0;
        short s2 = 0;
        int i17 = 0;
        int i18 = 1400943730;
        int i19 = 0;
        String str5 = null;
        short[] sArr3 = null;
        int i20 = 0;
        ImageView imageView2 = null;
        String[][] strArr = null;
        String[][] strArr2 = null;
        TextView textView4 = null;
        int length = 0;
        while (true) {
            i18 = i15 ^ (i14 & (((i18 ^ i12) * 32697) >> 31));
            switch (i18) {
                case -1887645073:
                case 1971259659:
                    imageView2.setImageResource(C2105.m6981(C0630.m2575(sArr2, i20, 3, i16)) ^ 2119769997);
                    str2 = str5;
                    i5 = i19;
                    c2 = c2;
                    textView = textView3;
                    viewOnClickListenerC9492 = viewOnClickListenerC9493;
                    iM6981 = (C0630.m2566("ۛ֫") ^ i13) * 65;
                    i6 = ((iM6981 ^ i12) * (-17347)) ^ (-1881947566);
                    i7 = 797769463;
                    int i21 = iM6981 ^ i7;
                    i19 = i5;
                    str = str2;
                    i15 = i21;
                    i14 = i6;
                    viewOnClickListenerC9493 = viewOnClickListenerC9492;
                    textView3 = textView;
                    c2 = c2;
                    str5 = str;
                    break;
                case -1853775989:
                case 205828014:
                    str5 = str5;
                    i19 = i19;
                    c2 = c2;
                    textView3 = textView3;
                    viewOnClickListenerC9493 = viewOnClickListenerC9493;
                    sArr3 = f67298;
                    if (C7811.f24123 >= 0) {
                        iM2566 = C0630.m2566("᩶ܿ") ^ i13;
                        i2 = ((iM2566 ^ i12) * 14251) ^ 1708110732;
                        i3 = 1065959727;
                    } else {
                        iM2566 = (C0630.m2566("ۧ᩶") + i12) * (-11);
                        i2 = ((iM2566 ^ i13) * (-6185)) ^ 1456512223;
                        i3 = 1953155085;
                    }
                    i4 = iM2566 ^ i3;
                    i14 = i2;
                    i19 = i19;
                    viewOnClickListenerC9493 = viewOnClickListenerC9493;
                    textView3 = textView3;
                    c2 = c2;
                    str5 = str5;
                    i15 = i4;
                    i11 = i;
                    break;
                case -1843611019:
                case 2118700452:
                    RunnableC1937.m6387();
                    str5 = str5;
                    i19 = i19;
                    c2 = c2;
                    textView3 = textView3;
                    viewOnClickListenerC9493 = viewOnClickListenerC9493;
                    iM2566 = C0630.m2566("᩶ܿ") ^ i13;
                    i2 = ((iM2566 ^ i12) * 14251) ^ 1708110732;
                    i3 = 1065959727;
                    i4 = iM2566 ^ i3;
                    i14 = i2;
                    i19 = i19;
                    viewOnClickListenerC9493 = viewOnClickListenerC9493;
                    textView3 = textView3;
                    c2 = c2;
                    str5 = str5;
                    i15 = i4;
                    i11 = i;
                    break;
                case -1735215348:
                case 1475388648:
                    str5 = str5;
                    i19 = i19;
                    c2 = c2;
                    textView3 = textView3;
                    viewOnClickListenerC9493 = viewOnClickListenerC9493;
                    int i22 = s2 + s;
                    if (((s2 * 2) + 1) - (i22 * i22) <= 0) {
                        iM2566 = (C0630.m2566("ۙܿ") ^ i13) * (-17);
                        i2 = ((iM2566 ^ i12) * (-11349)) ^ 547037456;
                        i3 = -1272529709;
                    } else {
                        iM2566 = C0630.m2566("۫᩹") ^ i12;
                        i2 = ((iM2566 ^ i13) * (-27849)) ^ (-1051823153);
                        i3 = -464734294;
                    }
                    i4 = iM2566 ^ i3;
                    i14 = i2;
                    i19 = i19;
                    viewOnClickListenerC9493 = viewOnClickListenerC9493;
                    textView3 = textView3;
                    c2 = c2;
                    str5 = str5;
                    i15 = i4;
                    i11 = i;
                    break;
                case -1631337211:
                case 6858757:
                    viewOnClickListenerC9493.f28828 = strArr[length][2];
                    if (!C2126.f7087) {
                        iM2567 = C0630.m2566("ۚܶ") ^ i12;
                        i9 = ((iM2567 ^ i13) * 139) ^ 584444024;
                        i10 = -492282827;
                        i15 = iM2567 ^ i10;
                        i14 = i9;
                    } else {
                        str4 = str5;
                        int iM6982 = (i13 - C2105.m6981("ܺ᩷")) * (-77);
                        str5 = str4;
                        i14 = ((iM6982 ^ i12) * (-20901)) ^ (-294925438);
                        i15 = iM6982 ^ (-738240698);
                    }
                    break;
                case -1616147778:
                case 627859645:
                    i16 = 3461;
                    iM2566 = (i13 - C2105.m6981("۬۫")) * 93;
                    i2 = ((iM2566 ^ i12) * (-13187)) ^ 1283112267;
                    i3 = -163258727;
                    i4 = iM2566 ^ i3;
                    i14 = i2;
                    i19 = i19;
                    viewOnClickListenerC9493 = viewOnClickListenerC9493;
                    textView3 = textView3;
                    c2 = c2;
                    str5 = str5;
                    i15 = i4;
                    i11 = i;
                    break;
                case -1592728210:
                case -1584763088:
                    str2 = str5;
                    i5 = i19;
                    c2 = c2;
                    textView = textView3;
                    viewOnClickListenerC9492 = viewOnClickListenerC9493;
                    if (i11 - activityC8786.f26758.length < activityC8786.f26759.length) {
                        iM6981 = (i12 - C2105.m6981("ܿ᩶")) * (-39);
                        i6 = ((iM6981 ^ i13) * (-323)) ^ 2402133;
                        i7 = 1829657424;
                    } else {
                        iM6981 = (C0630.m2566("ۛ֫") ^ i13) * 65;
                        i6 = ((iM6981 ^ i12) * (-17347)) ^ (-1881947566);
                        i7 = 797769463;
                    }
                    int i23 = iM6981 ^ i7;
                    i19 = i5;
                    str = str2;
                    i15 = i23;
                    i14 = i6;
                    viewOnClickListenerC9493 = viewOnClickListenerC9492;
                    textView3 = textView;
                    c2 = c2;
                    str5 = str;
                    break;
                case -1428432233:
                case 336664622:
                    TextView textView5 = textView3;
                    String str6 = str5;
                    int i24 = i19;
                    viewOnClickListenerC9493 = (ViewOnClickListenerC9492) abstractC3255;
                    activityC8786 = this.f67299;
                    if (i11 < activityC8786.f26758.length) {
                        int iM2569 = C0630.m2566("᩸ۙ") ^ i12;
                        i14 = ((iM2569 ^ i13) * 2657) ^ 1341110890;
                        textView3 = textView5;
                        i19 = i24;
                        str5 = str6;
                        c2 = 1;
                        i11 = i;
                        i15 = iM2569 ^ 827245244;
                        c3 = 0;
                    } else {
                        int iM25610 = C0630.m2566("۠᩻") ^ i12;
                        int i25 = ((iM25610 ^ i13) * 32065) ^ (-1933954572);
                        i4 = iM25610 ^ 716489377;
                        textView3 = textView5;
                        i14 = i25;
                        i19 = i24;
                        str5 = str6;
                        c2 = 1;
                        c3 = 0;
                        i15 = i4;
                        i11 = i;
                    }
                    break;
                case -1225374304:
                case -687480603:
                    length = i11 - activityC8786.f26758.length;
                    textView4 = viewOnClickListenerC9493.f28830;
                    strArr2 = activityC8786.f26759;
                    if (C4075.f12947 >= 0) {
                        iM2567 = (C0630.m2566("֡᩵") + i12) * (-49);
                        i9 = ((iM2567 ^ i13) * (-19281)) ^ (-1597876254);
                        i10 = 1263371427;
                    } else {
                        iM2567 = C2105.m6981("ۜۧ") ^ i12;
                        i9 = ((iM2567 ^ i13) * 4315) ^ 1175138611;
                        i10 = 884590129;
                    }
                    i15 = iM2567 ^ i10;
                    i14 = i9;
                    break;
                case -1194776854:
                case 1762414589:
                    imageView2 = viewOnClickListenerC9493.f28831;
                    sArr2 = f67298;
                    i20 = 4;
                    if (C1005.f3721) {
                        iM2567 = (i12 - C2105.m6981("᩷ᩴ")) * (-95);
                        i9 = ((iM2567 ^ i13) * 26093) ^ (-1184733394);
                        i10 = -1603322184;
                    } else {
                        iM2567 = C0630.m2566("ۡ᩵") ^ i13;
                        i9 = ((iM2567 ^ i12) * (-11353)) ^ (-1460875397);
                        i10 = 262324541;
                    }
                    i15 = iM2567 ^ i10;
                    i14 = i9;
                    break;
                case -1159122551:
                case 90030643:
                    str5 = str5;
                    i19 = i19;
                    c2 = c2;
                    RunnableC1937.m6377(viewOnClickListenerC9493.f28830, activityC8786.f26758[i11][c3]);
                    textView3 = viewOnClickListenerC9493.f28832;
                    if (C3746.f11829 > 0) {
                        int iM6983 = C2105.m6981("ۢۡ") ^ i13;
                        i19 = i19;
                        str = str5;
                        i15 = iM6983 ^ (-2056724435);
                        i14 = ((iM6983 ^ i12) * (-2901)) ^ 796303440;
                        c2 = c2;
                        str5 = str;
                    } else {
                        textView3 = textView3;
                        viewOnClickListenerC9493 = viewOnClickListenerC9493;
                        iM2566 = C0630.m2566("᩶ܿ") ^ i13;
                        i2 = ((iM2566 ^ i12) * 14251) ^ 1708110732;
                        i3 = 1065959727;
                        i4 = iM2566 ^ i3;
                        i14 = i2;
                        i19 = i19;
                        viewOnClickListenerC9493 = viewOnClickListenerC9493;
                        textView3 = textView3;
                        c2 = c2;
                        str5 = str5;
                        i15 = i4;
                        i11 = i;
                    }
                    break;
                case -1088563730:
                case 115756611:
                    RunnableC1937.m6377(textView4, strArr2[length][c3]);
                    if (C3537.f11231 < 0) {
                        iM2567 = (i13 - C0630.m2566("ۛۚ")) * (-83);
                        i9 = ((iM2567 ^ i12) * (-18629)) ^ (-965397181);
                        i10 = 2066015239;
                        i15 = iM2567 ^ i10;
                        i14 = i9;
                    } else {
                        str4 = str5;
                        int iM6984 = (i13 - C2105.m6981("ܺ᩷")) * (-77);
                        str5 = str4;
                        i14 = ((iM6984 ^ i12) * (-20901)) ^ (-294925438);
                        i15 = iM6984 ^ (-738240698);
                    }
                    break;
                case -1022411266:
                case 931309464:
                    C4117.m12364();
                    if (C0630.f2410 <= 0) {
                        iM2567 = C0630.m2566("ۡ᩵") ^ i13;
                        i9 = ((iM2567 ^ i12) * (-11353)) ^ (-1460875397);
                        i10 = 262324541;
                        i15 = iM2567 ^ i10;
                        i14 = i9;
                    } else {
                        str3 = str5;
                        i8 = i19;
                        c = c2;
                        textView2 = textView3;
                        int iM6985 = (C2105.m6981("ۤ۠") ^ i12) * (-59);
                        String str7 = str3;
                        i14 = ((iM6985 ^ i13) * (-28125)) ^ (-2038345226);
                        int i26 = iM6985 ^ 1127473341;
                        i19 = i8;
                        textView3 = textView2;
                        c2 = c;
                        str5 = str7;
                        i15 = i26;
                    }
                    break;
                case -913794318:
                case 942734422:
                    str4 = str5;
                    viewOnClickListenerC9493.f28828 = str4;
                    imageView = viewOnClickListenerC9493.f28831;
                    sArr = f67298;
                    i17 = 1;
                    i19 = 3;
                    if (C11340.f33930 < 0) {
                        str5 = str4;
                        iM2567 = (i12 - C0630.m2566("۬᩻")) * (-67);
                        i9 = ((iM2567 ^ i13) * (-28673)) ^ 1691025152;
                        i10 = 32256680;
                        i15 = iM2567 ^ i10;
                        i14 = i9;
                    } else {
                        int iM6986 = (i13 - C2105.m6981("ܺ᩷")) * (-77);
                        str5 = str4;
                        i14 = ((iM6986 ^ i12) * (-20901)) ^ (-294925438);
                        i15 = iM6986 ^ (-738240698);
                    }
                    break;
                case -588211831:
                case 10163188:
                    C1047.m3601(viewOnClickListenerC9493.f28832, activityC8786.f26759[length][c2]);
                    strArr = activityC8786.f26759;
                    if (C0798.m2998() != 0) {
                        iM2567 = (C0630.m2566("֡᩵") + i12) * (-49);
                        i9 = ((iM2567 ^ i13) * (-19281)) ^ (-1597876254);
                        i10 = 1263371427;
                    } else {
                        iM2567 = C0630.m2566("֫ۢ") ^ i13;
                        i9 = ((iM2567 ^ i12) * 18529) ^ (-1392027290);
                        i10 = -132498569;
                    }
                    i15 = iM2567 ^ i10;
                    i14 = i9;
                    break;
                case -511928409:
                case 1498624579:
                    RunnableC3474.m10630();
                    C3019.m9255();
                    break;
                case -474909449:
                case 245497469:
                    i8 = i19;
                    String str8 = activityC8786.f26758[i11][c2];
                    c = c2;
                    textView2 = textView3;
                    C1047.m3601(textView2, str8);
                    if (C0382.f1805) {
                        int iM6987 = C2105.m6981("֨ܺ") ^ i13;
                        i14 = ((iM6987 ^ i12) * (-4787)) ^ (-769865437);
                        i19 = i8;
                        i15 = iM6987 ^ (-1353620347);
                        textView3 = textView2;
                        c2 = c;
                        str5 = null;
                    } else {
                        str3 = null;
                        int iM6988 = (C2105.m6981("ۤ۠") ^ i12) * (-59);
                        String str9 = str3;
                        i14 = ((iM6988 ^ i13) * (-28125)) ^ (-2038345226);
                        int i27 = iM6988 ^ 1127473341;
                        i19 = i8;
                        textView3 = textView2;
                        c2 = c;
                        str5 = str9;
                        i15 = i27;
                    }
                    break;
                case 158290026:
                case 235058587:
                    if (C0964.f3626 == 0) {
                        str4 = str5;
                        int iM6989 = (i13 - C2105.m6981("ܺ᩷")) * (-77);
                        str5 = str4;
                        i14 = ((iM6989 ^ i12) * (-20901)) ^ (-294925438);
                        i15 = iM6989 ^ (-738240698);
                    } else {
                        str3 = str5;
                        i8 = i19;
                        c = c2;
                        textView2 = textView3;
                        int iM69810 = (C2105.m6981("ۤ۠") ^ i12) * (-59);
                        String str10 = str3;
                        i14 = ((iM69810 ^ i13) * (-28125)) ^ (-2038345226);
                        int i28 = iM69810 ^ 1127473341;
                        i19 = i8;
                        textView3 = textView2;
                        c2 = c;
                        str5 = str10;
                        i15 = i28;
                    }
                    break;
                case 567812692:
                case 1769694828:
                    if (C0050.f910 < 0) {
                        str3 = str5;
                        i8 = i19;
                        c = c2;
                        textView2 = textView3;
                        int iM69811 = (C2105.m6981("ۤ۠") ^ i12) * (-59);
                        String str11 = str3;
                        i14 = ((iM69811 ^ i13) * (-28125)) ^ (-2038345226);
                        int i29 = iM69811 ^ 1127473341;
                        i19 = i8;
                        textView3 = textView2;
                        c2 = c;
                        str5 = str11;
                        i15 = i29;
                    } else {
                        str5 = str5;
                        i19 = i19;
                        c2 = c2;
                        textView3 = textView3;
                        viewOnClickListenerC9493 = viewOnClickListenerC9493;
                        iM2566 = C0630.m2566("᩶ܿ") ^ i13;
                        i2 = ((iM2566 ^ i12) * 14251) ^ 1708110732;
                        i3 = 1065959727;
                        i4 = iM2566 ^ i3;
                        i14 = i2;
                        i19 = i19;
                        viewOnClickListenerC9493 = viewOnClickListenerC9493;
                        textView3 = textView3;
                        c2 = c2;
                        str5 = str5;
                        i15 = i4;
                        i11 = i;
                    }
                    break;
                case 850573026:
                case 1709064141:
                    break;
                case 867978678:
                case 1877511952:
                    i16 = 37308;
                    iM2566 = (i13 - C2105.m6981("۬۫")) * 93;
                    i2 = ((iM2566 ^ i12) * (-13187)) ^ 1283112267;
                    i3 = -163258727;
                    i4 = iM2566 ^ i3;
                    i14 = i2;
                    i19 = i19;
                    viewOnClickListenerC9493 = viewOnClickListenerC9493;
                    textView3 = textView3;
                    c2 = c2;
                    str5 = str5;
                    i15 = i4;
                    i11 = i;
                    break;
                case 1779907253:
                case 1978833497:
                    imageView.setImageResource(C0630.m2566(C1916.m6311(sArr, i17, i19, i16)) ^ 2118003804);
                    break;
                default:
                    str5 = str5;
                    i19 = i19;
                    c2 = c2;
                    textView3 = textView3;
                    viewOnClickListenerC9493 = viewOnClickListenerC9493;
                    s2 = sArr3[0];
                    s = 1;
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C0630.m2566("᩶ܿ") ^ i13;
                        i2 = ((iM2566 ^ i12) * 14251) ^ 1708110732;
                        i3 = 1065959727;
                    } else {
                        iM2566 = (C0630.m2566("ۛ۠") ^ i13) * (-55);
                        i2 = ((iM2566 ^ i12) * 16559) ^ 499042824;
                        i3 = 2144598156;
                    }
                    i4 = iM2566 ^ i3;
                    i14 = i2;
                    i19 = i19;
                    viewOnClickListenerC9493 = viewOnClickListenerC9493;
                    textView3 = textView3;
                    c2 = c2;
                    str5 = str5;
                    i15 = i4;
                    i11 = i;
                    break;
            }
            return;
        }
    }

    public C20781(ActivityC8786 activityC8786) {
        this.f67299 = activityC8786;
    }
}
