package p067l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩷ۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J1XT */
/* JADX INFO: loaded from: classes5.dex */
public final class C22119 extends AbstractC21283 {

    /* JADX INFO: renamed from: ۢۜ᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f82985 = {980, 16902, 22016, -28422, 22899, -25545, -30962, 9457, -12107, 15757, -12069};

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC10719 f69982;

    @Override // p067l.AbstractC21283
    public final int getItemViewType(int i) {
        ActivityC10719 activityC10719 = null;
        String[][] strArr = null;
        int length = 0;
        String[][] strArr2 = null;
        int i2 = -1847310386;
        int i3 = C1003.f81929;
        int i4 = C0967.f81910;
        int iM55979 = C0946.m55979("ۡ᩵") ^ i4;
        int i5 = ((iM55979 ^ i3) * (-3001)) ^ 1708290564;
        int i6 = -1981287952;
        while (true) {
            i2 = ((((i2 ^ i3) * (-1583)) >> 31) & i5) ^ (iM55979 ^ i6);
            switch (i2) {
                case -2058191679:
                case -824417329:
                    C1404.m56468();
                    if (!C0947.m55997()) {
                        iM55979 = (i4 - C0946.m55979("ۗ֫")) * 93;
                        i5 = ((iM55979 ^ i3) * 23649) ^ (-1861391063);
                        i6 = -730562641;
                    } else {
                        iM55979 = C0946.m55979("ۗۚ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 28705) ^ 1327753381;
                        i6 = 544868222;
                    }
                    break;
                case -1949408585:
                case 2016393526:
                    if (i < strArr2.length + length) {
                        iM55979 = (C0873.m55680("۬۟") ^ i3) * 79;
                        i5 = ((iM55979 ^ i4) * (-27143)) ^ 834876095;
                        i6 = 2126552640;
                    } else {
                        iM55979 = (C0873.m55680("ۡۗ") + i4) * (-41);
                        i5 = ((iM55979 ^ i3) * 25875) ^ 753370415;
                        i6 = 2091676164;
                    }
                    break;
                case -1875563957:
                case -229545560:
                    if (C0937.f81884) {
                        iM55979 = (C0873.m55680("ۧܰ") + i4) * (-65);
                        i5 = ((iM55979 ^ i3) * 22297) ^ 616328954;
                        i6 = -1954230896;
                    } else {
                        iM55979 = C0873.m55680("ۙۗ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 4737) ^ (-235014059);
                        i6 = 621316677;
                    }
                    break;
                case -1865452041:
                case 1776437000:
                    activityC10719 = this.f69982;
                    if (C0873.f81841 <= 0) {
                        iM55979 = C0873.m55680("ۙۗ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 4737) ^ (-235014059);
                        i6 = 621316677;
                    } else {
                        iM55979 = (C0946.m55979("᩹ۨ") + i3) * 93;
                        i5 = ((iM55979 ^ i4) * (-12869)) ^ 460227004;
                        i6 = -1419236418;
                    }
                    break;
                case -1693217815:
                case -1683172855:
                    if (C0866.m55645()) {
                        iM55979 = C0946.m55979("ۗܿ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 6665) ^ (-1956880917);
                        i6 = -498707436;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۗ֫")) * 93;
                        i5 = ((iM55979 ^ i3) * 23649) ^ (-1861391063);
                        i6 = -730562641;
                    }
                    break;
                case -1364420337:
                case 2023367032:
                    C1036.m56257();
                    iM55979 = C0873.m55680("۫᩻") ^ i3;
                    i5 = ((iM55979 ^ i4) * 30635) ^ (-70381495);
                    i6 = 1968141115;
                    break;
                case -1222890745:
                case -556476158:
                    return 1;
                case -806938141:
                case 625860410:
                    if (C0866.m55645()) {
                        iM55979 = (C0873.m55680("ۤܽ") + i3) * 11;
                        i5 = ((iM55979 ^ i4) * 1451) ^ 1028584406;
                        i6 = -1995366301;
                    } else {
                        iM55979 = C0873.m55680("۫᩻") ^ i3;
                        i5 = ((iM55979 ^ i4) * 30635) ^ (-70381495);
                        i6 = 1968141115;
                    }
                    break;
                case -582972139:
                case 1221338963:
                    return 0;
                case -572368212:
                case 38000144:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (i4 - C0946.m55979("ۗ֫")) * 93;
                        i5 = ((iM55979 ^ i3) * 23649) ^ (-1861391063);
                        i6 = -730562641;
                    } else {
                        iM55979 = (C0946.m55979("ᩳۤ") + i3) * (-71);
                        i5 = ((iM55979 ^ i4) * (-9571)) ^ 102486161;
                        i6 = -2088981082;
                    }
                    break;
                case -232343634:
                case 1463212963:
                    C1028.m56247();
                    return 0;
                case -77046801:
                case 33785333:
                    if (C0946.m55980() == 0) {
                        iM55979 = (i4 - C0946.m55979("ۗ֫")) * 93;
                        i5 = ((iM55979 ^ i3) * 23649) ^ (-1861391063);
                        i6 = -730562641;
                    } else {
                        iM55979 = C0873.m55680("۫᩻") ^ i3;
                        i5 = ((iM55979 ^ i4) * 30635) ^ (-70381495);
                        i6 = 1968141115;
                    }
                    break;
                case -60870927:
                case 806190965:
                    length = strArr.length;
                    strArr2 = activityC10719.f29684;
                    if (C0877.f81843 >= 0) {
                        iM55979 = C0946.m55979("۫ۛ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-20557)) ^ (-1951143542);
                        i6 = -324671753;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ܺ֡")) * 17;
                        i5 = ((iM55979 ^ i3) * (-32185)) ^ (-1143629486);
                        i6 = 1036891211;
                    }
                    break;
                case -37584084:
                case 740944645:
                    strArr = activityC10719.f29683;
                    if (C0946.f81894 != 0) {
                        iM55979 = C0946.m55979("۫ۛ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-20557)) ^ (-1951143542);
                        i6 = -324671753;
                    } else {
                        iM55979 = C0946.m55979("ۨۧ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-28789)) ^ 1075104613;
                        i6 = 309656546;
                    }
                    break;
                case 24393427:
                case 506254362:
                    if (C0894.f81854 >= 0) {
                        iM55979 = (i4 - C0946.m55979("ۗ֫")) * 93;
                        i5 = ((iM55979 ^ i3) * 23649) ^ (-1861391063);
                        i6 = -730562641;
                    } else {
                        iM55979 = C0946.m55979("ܺۛ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 647) ^ 1659061071;
                        i6 = -1823172588;
                    }
                    break;
                case 129057262:
                case 1861865359:
                    C1003.m56123();
                    if (C0946.f81894 == 0) {
                        iM55979 = C0873.m55680("ۙۗ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 4737) ^ (-235014059);
                        i6 = 621316677;
                    } else {
                        iM55979 = C0873.m55680("۫᩻") ^ i3;
                        i5 = ((iM55979 ^ i4) * 30635) ^ (-70381495);
                        i6 = 1968141115;
                    }
                    break;
                case 418428577:
                case 883203429:
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0873.m55680("۫᩻") ^ i3;
                        i5 = ((iM55979 ^ i4) * 30635) ^ (-70381495);
                        i6 = 1968141115;
                    } else {
                        iM55979 = (i3 - C0873.m55680("֡ۛ")) * (-115);
                        i5 = ((iM55979 ^ i4) * 22719) ^ (-1164637826);
                        i6 = 409080511;
                    }
                    break;
                default:
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0946.m55979("ۗۚ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 28705) ^ 1327753381;
                        i6 = 544868222;
                    } else {
                        iM55979 = (C0946.m55979("ܽ۟") ^ i4) * (-9);
                        i5 = ((iM55979 ^ i3) * (-17839)) ^ 1656122155;
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
    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int iM55979;
        LayoutInflater layoutInflater;
        int i2;
        int i3;
        int iM559710;
        int i4;
        int i5;
        int i6 = i;
        int i7 = C1017.f81942;
        int i8 = C0967.f81910;
        int iM559711 = C0946.m55979("֡۠") ^ i7;
        int i9 = ((iM559711 ^ i8) * (-13027)) ^ (-1042476767);
        LayoutInflater layoutInflaterFrom = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM559711 ^ (-1318437962);
        ActivityC10719 activityC10719 = null;
        short s = 0;
        short s2 = 0;
        int i11 = 0;
        short s3 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -1996470030;
        String strM56252 = null;
        View viewInflate = null;
        int iM559712 = 0;
        while (true) {
            i15 = i10 ^ (i9 & (((i15 ^ i8) * (-20455)) >> 31));
            switch (i15) {
                case -1534239947:
                case 252792341:
                    layoutInflaterFrom = LayoutInflater.from(activityC10719);
                    sArr2 = f82985;
                    if (C0927.f81875) {
                        i14 = 8;
                        iM55979 = (C0946.m55979("ۗۖ") ^ i7) * (-73);
                        layoutInflater = layoutInflaterFrom;
                        i2 = ((iM55979 ^ i8) * 18163) ^ 1396430994;
                        i3 = 1903663178;
                        LayoutInflater layoutInflater2 = layoutInflater;
                        i10 = iM55979 ^ i3;
                        i9 = i2;
                        layoutInflaterFrom = layoutInflater2;
                    } else {
                        int iM55680 = C0873.m55680("ۧۘ") ^ i8;
                        i10 = iM55680 ^ (-1265011825);
                        i9 = ((iM55680 ^ i7) * (-28079)) ^ 1001290556;
                        i14 = 8;
                    }
                    break;
                case -1345310956:
                case 1592290064:
                    activityC10719 = activityC10719;
                    layoutInflaterFrom = layoutInflaterFrom;
                    if ((i12 + 1) - i11 <= 0) {
                        iM559710 = (C0873.m55680("ۗۤ") + i7) * 59;
                        i9 = ((iM559710 ^ i8) * 25591) ^ 1647955786;
                        i4 = -2048575041;
                    } else {
                        iM559710 = (C0946.m55979("ᩳۚ") + i8) * (-117);
                        i9 = ((iM559710 ^ i7) * (-31959)) ^ (-453797184);
                        i4 = 1382027485;
                    }
                    i5 = iM559710 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC10719 = activityC10719;
                    i10 = i5;
                    i6 = i;
                    break;
                case -1341763171:
                case 1796347251:
                    return new ViewOnClickListenerC11390(activityC10719, viewInflate, i6);
                case -1320024310:
                case 168151463:
                    ViewOnClickListenerC0939.m55941();
                    return null;
                case -823252805:
                case 1600178326:
                    viewInflate = layoutInflaterFrom.inflate(iM559712, viewGroup, false);
                    layoutInflaterFrom = layoutInflaterFrom;
                    int iM55681 = C0873.m55680("֫۫") ^ i7;
                    layoutInflaterFrom = layoutInflaterFrom;
                    i10 = iM55681 ^ (-1163153511);
                    i9 = ((iM55681 ^ i8) * (-23349)) ^ 990507076;
                    activityC10719 = activityC10719;
                    break;
                case -723845207:
                case 571119606:
                    activityC10719 = activityC10719;
                    layoutInflaterFrom = layoutInflaterFrom;
                    sArr = f82985;
                    if (C0877.m55696()) {
                        iM559710 = C0946.m55979("ۡ۫") ^ i8;
                        i9 = ((iM559710 ^ i7) * 12465) ^ (-597187064);
                        i4 = -160956856;
                    } else {
                        iM559710 = (C0946.m55979("᩵᩹") + i8) * 97;
                        i9 = ((iM559710 ^ i7) * (-24359)) ^ (-1607328033);
                        i4 = -65013257;
                    }
                    i5 = iM559710 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC10719 = activityC10719;
                    i10 = i5;
                    i6 = i;
                    break;
                case -704779982:
                case 380586511:
                    if (C0989.f81920 < 0) {
                        iM55979 = (C0946.m55979("ۗۖ") ^ i7) * (-73);
                        layoutInflater = layoutInflaterFrom;
                        i2 = ((iM55979 ^ i8) * 18163) ^ 1396430994;
                        i3 = 1903663178;
                        LayoutInflater layoutInflater3 = layoutInflater;
                        i10 = iM55979 ^ i3;
                        i9 = i2;
                        layoutInflaterFrom = layoutInflater3;
                    }
                    layoutInflater = layoutInflaterFrom;
                    iM55979 = C0873.m55680("᩷֡") ^ i8;
                    i2 = ((iM55979 ^ i7) * (-17925)) ^ (-361150188);
                    i3 = -1683503952;
                    LayoutInflater layoutInflater4 = layoutInflater;
                    i10 = iM55979 ^ i3;
                    i9 = i2;
                    layoutInflaterFrom = layoutInflater4;
                    break;
                case -699631076:
                case 2080030100:
                    activityC10719 = activityC10719;
                    layoutInflaterFrom = layoutInflaterFrom;
                    int i16 = s + s2;
                    i11 = i16 * i16;
                    s3 = 2;
                    if (C0949.m56012()) {
                        iM559710 = C0946.m55979("᩷ܶ") ^ i7;
                        i9 = ((iM559710 ^ i8) * (-27605)) ^ (-1271025658);
                        i4 = -608174478;
                    } else {
                        iM559710 = C0946.m55979("᩵ۨ") ^ i7;
                        i9 = ((iM559710 ^ i8) * (-857)) ^ 232727620;
                        i4 = -1801809325;
                    }
                    i5 = iM559710 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC10719 = activityC10719;
                    i10 = i5;
                    i6 = i;
                    break;
                case -453133329:
                case 2119599220:
                    i13 = 64152;
                    iM559710 = (i7 - C0946.m55979("ܿۜ")) * (-65);
                    i9 = ((iM559710 ^ i8) * (-32679)) ^ 31939790;
                    i4 = -299475163;
                    i5 = iM559710 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC10719 = activityC10719;
                    i10 = i5;
                    i6 = i;
                    break;
                case -232184394:
                case 1361359994:
                    layoutInflaterFrom = layoutInflaterFrom;
                    View view = new View(activityC10719);
                    if (AbstractC0942.m55971()) {
                        activityC10719 = activityC10719;
                        iM559710 = (C0946.m55979("᩵᩹") + i8) * 97;
                        i9 = ((iM559710 ^ i7) * (-24359)) ^ (-1607328033);
                        i4 = -65013257;
                        i5 = iM559710 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                        activityC10719 = activityC10719;
                        i10 = i5;
                        i6 = i;
                    } else if (!C0947.f81895) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-1, ViewOnClickListenerC0939.m55943(10.0f)));
                        viewInflate = view;
                        int iM55682 = C0873.m55680("֫۫") ^ i7;
                        layoutInflaterFrom = layoutInflaterFrom;
                        i10 = iM55682 ^ (-1163153511);
                        i9 = ((iM55682 ^ i8) * (-23349)) ^ 990507076;
                        activityC10719 = activityC10719;
                    } else {
                        iM559710 = (C0873.m55680("᩸۠") ^ i8) * 97;
                        i9 = ((iM559710 ^ i7) * 23033) ^ (-810940598);
                        i4 = -1521391157;
                        i5 = iM559710 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                        activityC10719 = activityC10719;
                        i10 = i5;
                        i6 = i;
                    }
                    break;
                case -154438945:
                case 1624474275:
                    activityC10719 = activityC10719;
                    layoutInflaterFrom = layoutInflaterFrom;
                    if (RunnableC0897.f81856) {
                        iM559710 = C0946.m55979("ۗ֨") ^ i7;
                        i9 = ((iM559710 ^ i8) * (-15631)) ^ 1055451104;
                        i4 = -206355955;
                    } else {
                        iM559710 = (C0873.m55680("᩸۠") ^ i8) * 97;
                        i9 = ((iM559710 ^ i7) * 23033) ^ (-810940598);
                        i4 = -1521391157;
                    }
                    i5 = iM559710 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC10719 = activityC10719;
                    i10 = i5;
                    i6 = i;
                    break;
                case 102300489:
                case 1060988682:
                    layoutInflater = layoutInflaterFrom;
                    strM56252 = C1036.m56252(sArr2, i14, 3, i13);
                    if (C1404.f82149 >= 0) {
                        iM55979 = C0873.m55680("᩷֡") ^ i8;
                        i2 = ((iM55979 ^ i7) * (-17925)) ^ (-361150188);
                        i3 = -1683503952;
                    } else {
                        iM55979 = (C0873.m55680("۫ܿ") ^ i7) * (-9);
                        i2 = ((iM55979 ^ i8) * 9401) ^ 762412751;
                        i3 = -494277798;
                    }
                    LayoutInflater layoutInflater5 = layoutInflater;
                    i10 = iM55979 ^ i3;
                    i9 = i2;
                    layoutInflaterFrom = layoutInflater5;
                    break;
                case 113486901:
                case 1159767306:
                    activityC10719 = activityC10719;
                    layoutInflaterFrom = layoutInflaterFrom;
                    i12 = s * s3;
                    if (C1044.f81959 >= 0) {
                        iM559710 = (C0873.m55680("᩸۠") ^ i8) * 97;
                        i9 = ((iM559710 ^ i7) * 23033) ^ (-810940598);
                        i4 = -1521391157;
                    } else {
                        iM559710 = (i8 - C0946.m55979("᩻ۡ")) * (-55);
                        i9 = ((iM559710 ^ i7) * (-30977)) ^ 109244104;
                        i4 = -1348803990;
                    }
                    i5 = iM559710 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC10719 = activityC10719;
                    i10 = i5;
                    i6 = i;
                    break;
                case 206846737:
                case 1123972424:
                    iM559712 = 2129519140 ^ C0946.m55979(strM56252);
                    if (C0898.f81858 > 0) {
                        iM55979 = C0946.m55979("ۧۧ") ^ i8;
                        layoutInflater = layoutInflaterFrom;
                        i2 = ((iM55979 ^ i7) * (-11475)) ^ 674651787;
                        i3 = 1162492943;
                        LayoutInflater layoutInflater6 = layoutInflater;
                        i10 = iM55979 ^ i3;
                        i9 = i2;
                        layoutInflaterFrom = layoutInflater6;
                    } else {
                        layoutInflaterFrom = layoutInflaterFrom;
                        iM559710 = (C0873.m55680("᩸۠") ^ i8) * 97;
                        i9 = ((iM559710 ^ i7) * 23033) ^ (-810940598);
                        i4 = -1521391157;
                        i5 = iM559710 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                        activityC10719 = activityC10719;
                        i10 = i5;
                        i6 = i;
                    }
                    break;
                case 268449518:
                case 965930598:
                    if (C0967.f81910 >= 0) {
                        layoutInflaterFrom = layoutInflaterFrom;
                        iM559710 = (C0873.m55680("᩸۠") ^ i8) * 97;
                        i9 = ((iM559710 ^ i7) * 23033) ^ (-810940598);
                        i4 = -1521391157;
                        i5 = iM559710 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                        activityC10719 = activityC10719;
                        i10 = i5;
                        i6 = i;
                    }
                    activityC10719 = activityC10719;
                    layoutInflaterFrom = layoutInflaterFrom;
                    iM559710 = C0946.m55979("᩷ܶ") ^ i7;
                    i9 = ((iM559710 ^ i8) * (-27605)) ^ (-1271025658);
                    i4 = -608174478;
                    i5 = iM559710 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC10719 = activityC10719;
                    i10 = i5;
                    i6 = i;
                    break;
                case 335099259:
                case 1341276279:
                    C1404.m56468();
                    activityC10719 = activityC10719;
                    layoutInflaterFrom = layoutInflaterFrom;
                    iM559710 = C0946.m55979("᩷ܶ") ^ i7;
                    i9 = ((iM559710 ^ i8) * (-27605)) ^ (-1271025658);
                    i4 = -608174478;
                    i5 = iM559710 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC10719 = activityC10719;
                    i10 = i5;
                    i6 = i;
                    break;
                case 773388502:
                case 1059255575:
                    LayoutInflater layoutInflater7 = layoutInflaterFrom;
                    ActivityC10719 activityC107110 = this.f69982;
                    if (i6 != 1) {
                        int iM55683 = C0873.m55680("ܳܿ") ^ i8;
                        activityC10719 = activityC107110;
                        layoutInflaterFrom = layoutInflater7;
                        i10 = iM55683 ^ (-2068488147);
                        i9 = ((iM55683 ^ i7) * 15953) ^ 974362418;
                    } else {
                        int iM559713 = C0946.m55979("ۤ۟") ^ i7;
                        i9 = ((iM559713 ^ i8) * (-15355)) ^ 1406426165;
                        i5 = iM559713 ^ (-2137168821);
                        activityC10719 = activityC107110;
                        layoutInflaterFrom = layoutInflater7;
                        i10 = i5;
                    }
                    i6 = i;
                    break;
                case 1131829193:
                case 1200010318:
                    C0930.m55885();
                    if (RunnableC1014.f81941 > 0) {
                        layoutInflater = layoutInflaterFrom;
                        iM55979 = C0873.m55680("᩷֡") ^ i8;
                        i2 = ((iM55979 ^ i7) * (-17925)) ^ (-361150188);
                        i3 = -1683503952;
                        LayoutInflater layoutInflater8 = layoutInflater;
                        i10 = iM55979 ^ i3;
                        i9 = i2;
                        layoutInflaterFrom = layoutInflater8;
                    } else {
                        activityC10719 = activityC10719;
                        layoutInflaterFrom = layoutInflaterFrom;
                        iM559710 = C0946.m55979("᩷ܶ") ^ i7;
                        i9 = ((iM559710 ^ i8) * (-27605)) ^ (-1271025658);
                        i4 = -608174478;
                        i5 = iM559710 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                        activityC10719 = activityC10719;
                        i10 = i5;
                        i6 = i;
                    }
                    break;
                case 1661155274:
                case 2109991478:
                    activityC10719 = activityC10719;
                    layoutInflaterFrom = layoutInflaterFrom;
                    s = sArr[7];
                    s2 = 1;
                    if (C0949.f81897 >= 0) {
                        iM559710 = (C0946.m55979("᩵᩹") + i8) * 97;
                        i9 = ((iM559710 ^ i7) * (-24359)) ^ (-1607328033);
                        i4 = -65013257;
                    } else {
                        iM559710 = C0946.m55979("ۙۨ") ^ i8;
                        i9 = ((iM559710 ^ i7) * (-29319)) ^ 796294305;
                        i4 = -262230289;
                    }
                    i5 = iM559710 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC10719 = activityC10719;
                    i10 = i5;
                    i6 = i;
                    break;
                default:
                    i13 = 43927;
                    iM559710 = (i7 - C0946.m55979("ܿۜ")) * (-65);
                    i9 = ((iM559710 ^ i8) * (-32679)) ^ 31939790;
                    i4 = -299475163;
                    i5 = iM559710 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC10719 = activityC10719;
                    i10 = i5;
                    i6 = i;
                    break;
            }
        }
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        ActivityC10719 activityC10719 = null;
        String[][] strArr = null;
        int length = 0;
        String[][] strArr2 = null;
        int length2 = 0;
        int i = -101387176;
        int i2 = C0894.f81854;
        int i3 = C1003.f81929;
        int iM55680 = C0873.m55680("ܳ᩸") ^ i2;
        int i4 = ((iM55680 ^ i3) * 6455) ^ 397638378;
        int i5 = -1409462428;
        while (true) {
            i = ((((i ^ i3) * (-16811)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2089207673:
                case 1739932590:
                    length2 = strArr2.length + length;
                    if (C0892.f81851) {
                        iM55680 = (C0873.m55680("᩸᩶") ^ i2) * (-107);
                        i4 = ((iM55680 ^ i3) * (-17717)) ^ 627905537;
                        i5 = 495409471;
                    } else {
                        iM55680 = C0946.m55979("۟᩸") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-1609)) ^ (-49217955);
                        i5 = -954276236;
                    }
                    break;
                case -1791914016:
                case -839385363:
                    if (C0989.f81920 >= 0) {
                        iM55680 = (C0946.m55979("᩸۫") + i3) * (-43);
                        i4 = ((iM55680 ^ i2) * 27809) ^ 1004807404;
                        i5 = 1031729144;
                    } else {
                        iM55680 = C0946.m55979("᩵ۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 20099) ^ (-1515120982);
                        i5 = -1738333450;
                    }
                    break;
                case -1511387303:
                case -57913193:
                    C1071.m56343();
                    iM55680 = C0946.m55979("۟᩸") ^ i3;
                    i4 = ((iM55680 ^ i2) * (-1609)) ^ (-49217955);
                    i5 = -954276236;
                    break;
                case -1473228004:
                case -1017862531:
                    if (C1048.m56305() >= 0) {
                        iM55680 = (C0873.m55680("ܶۚ") ^ i2) * 7;
                        i4 = ((iM55680 ^ i3) * 27789) ^ (-974631888);
                        i5 = -1987026652;
                    } else {
                        iM55680 = (i2 - C0873.m55680("᩻᩷")) * (-119);
                        i4 = ((iM55680 ^ i3) * (-3579)) ^ 1252341434;
                        i5 = -1819413177;
                    }
                    break;
                case -1389188430:
                case 1558449177:
                    if (C0861.m55626()) {
                        iM55680 = C0946.m55979("۟᩸") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-1609)) ^ (-49217955);
                        i5 = -954276236;
                    } else {
                        iM55680 = (C0946.m55979("ۘۢ") ^ i3) * (-25);
                        i4 = ((iM55680 ^ i2) * (-4039)) ^ (-1474878485);
                        i5 = -291745866;
                    }
                    break;
                case -1354863700:
                case -381203620:
                    if (C0912.f81867 <= 0) {
                        iM55680 = (C0946.m55979("᩸۫") + i3) * (-43);
                        i4 = ((iM55680 ^ i2) * 27809) ^ 1004807404;
                        i5 = 1031729144;
                    } else {
                        iM55680 = (C0873.m55680("֨ܺ") + i2) * 91;
                        i4 = ((iM55680 ^ i3) * 491) ^ 188495958;
                        i5 = -2078462764;
                    }
                    break;
                case -1220444569:
                case 49738608:
                    C1046.m56302();
                    if (C1124.f82007 >= 0) {
                        iM55680 = (C0946.m55979("᩸۫") + i3) * (-43);
                        i4 = ((iM55680 ^ i2) * 27809) ^ 1004807404;
                        i5 = 1031729144;
                    } else {
                        iM55680 = C0946.m55979("۟᩸") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-1609)) ^ (-49217955);
                        i5 = -954276236;
                    }
                    break;
                case -1172749928:
                case 1459093671:
                    if (C0892.f81851) {
                        iM55680 = (C0946.m55979("ۗ֫") + i2) * (-45);
                        i4 = ((iM55680 ^ i3) * 1571) ^ (-1216684052);
                        i5 = -1980721925;
                    } else {
                        iM55680 = C0946.m55979("۟᩸") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-1609)) ^ (-49217955);
                        i5 = -954276236;
                    }
                    break;
                case -558976680:
                case 1474188415:
                    C1028.m56247();
                    if (C0906.m55809() > 0) {
                        iM55680 = (C0946.m55979("۫ܺ") ^ i2) * 55;
                        i4 = ((iM55680 ^ i3) * (-11535)) ^ (-812696308);
                        i5 = -1736785379;
                    } else {
                        iM55680 = C0946.m55979("۟᩸") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-1609)) ^ (-49217955);
                        i5 = -954276236;
                    }
                    break;
                case -446213787:
                case 371385584:
                    RunnableC0871.m55672();
                    return 0;
                case -343333830:
                case 196745906:
                    strArr = activityC10719.f29683;
                    if (C0898.m55800() <= 0) {
                        iM55680 = C0946.m55979("۟᩸") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-1609)) ^ (-49217955);
                        i5 = -954276236;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ۡ᩵")) * 23;
                        i4 = ((iM55680 ^ i3) * (-28149)) ^ 1081104739;
                        i5 = -1996838885;
                    }
                    break;
                case -212292994:
                case 646296488:
                    activityC10719 = this.f69982;
                    if (C1003.f81929 <= 0) {
                        iM55680 = (C0946.m55979("۫ܺ") ^ i2) * 55;
                        i4 = ((iM55680 ^ i3) * (-11535)) ^ (-812696308);
                        i5 = -1736785379;
                    } else {
                        iM55680 = C0873.m55680("ۧۢ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-13685)) ^ (-233527890);
                        i5 = -1924665569;
                    }
                    break;
                case 15569725:
                case 141411791:
                    if (!C0927.f81875) {
                        iM55680 = (C0873.m55680("ܶۚ") ^ i2) * 7;
                        i4 = ((iM55680 ^ i3) * 27789) ^ (-974631888);
                        i5 = -1987026652;
                    } else {
                        iM55680 = (C0946.m55979("۫ܺ") ^ i2) * 55;
                        i4 = ((iM55680 ^ i3) * (-11535)) ^ (-812696308);
                        i5 = -1736785379;
                    }
                    break;
                case 211454140:
                case 1287546072:
                    if (C0863.f81833 <= 0) {
                        iM55680 = (C0946.m55979("᩸۫") + i3) * (-43);
                        i4 = ((iM55680 ^ i2) * 27809) ^ 1004807404;
                        i5 = 1031729144;
                    } else {
                        iM55680 = C0873.m55680("ᩴۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-6797)) ^ (-1121061492);
                        i5 = 700479543;
                    }
                    break;
                case 1028152152:
                case 2131485410:
                    length = strArr.length;
                    strArr2 = activityC10719.f29684;
                    if (C0937.f81884) {
                        iM55680 = (i3 - C0946.m55979("᩸᩵")) * 55;
                        i4 = ((iM55680 ^ i2) * (-13533)) ^ 1778453269;
                        i5 = 15287891;
                    } else {
                        iM55680 = C0946.m55979("ᩴۧ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 25227) ^ 1202624881;
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
    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        int iM55680;
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        int i5;
        TextView textView;
        ViewOnClickListenerC11390 viewOnClickListenerC11390;
        int iM55979;
        int i6;
        int i7;
        int i8;
        char c;
        TextView textView2;
        String str3;
        String str4;
        int iM55681;
        int i9;
        int i10;
        int i11 = i;
        int i12 = C0967.f81910;
        int i13 = C1028.f81950;
        int iM55682 = (C0873.m55680("۬ۙ") ^ i13) * 45;
        int i14 = ((iM55682 ^ i12) * (-13947)) ^ 518278537;
        ActivityC10719 activityC10719 = null;
        TextView textView3 = null;
        ImageView imageView = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i15 = iM55682 ^ 410773318;
        ViewOnClickListenerC11390 viewOnClickListenerC11391 = null;
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
                    imageView2.setImageResource(C0946.m55979(C0873.m55689(sArr2, i20, 3, i16)) ^ 2119769997);
                    str2 = str5;
                    i5 = i19;
                    c2 = c2;
                    textView = textView3;
                    viewOnClickListenerC11390 = viewOnClickListenerC11391;
                    iM55979 = (C0873.m55680("ۛ֫") ^ i13) * 65;
                    i6 = ((iM55979 ^ i12) * (-17347)) ^ (-1881947566);
                    i7 = 797769463;
                    int i21 = iM55979 ^ i7;
                    i19 = i5;
                    str = str2;
                    i15 = i21;
                    i14 = i6;
                    viewOnClickListenerC11391 = viewOnClickListenerC11390;
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
                    viewOnClickListenerC11391 = viewOnClickListenerC11391;
                    sArr3 = f82985;
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0873.m55680("᩶ܿ") ^ i13;
                        i2 = ((iM55680 ^ i12) * 14251) ^ 1708110732;
                        i3 = 1065959727;
                    } else {
                        iM55680 = (C0873.m55680("ۧ᩶") + i12) * (-11);
                        i2 = ((iM55680 ^ i13) * (-6185)) ^ 1456512223;
                        i3 = 1953155085;
                    }
                    i4 = iM55680 ^ i3;
                    i14 = i2;
                    i19 = i19;
                    viewOnClickListenerC11391 = viewOnClickListenerC11391;
                    textView3 = textView3;
                    c2 = c2;
                    str5 = str5;
                    i15 = i4;
                    i11 = i;
                    break;
                case -1843611019:
                case 2118700452:
                    RunnableC0938.m55938();
                    str5 = str5;
                    i19 = i19;
                    c2 = c2;
                    textView3 = textView3;
                    viewOnClickListenerC11391 = viewOnClickListenerC11391;
                    iM55680 = C0873.m55680("᩶ܿ") ^ i13;
                    i2 = ((iM55680 ^ i12) * 14251) ^ 1708110732;
                    i3 = 1065959727;
                    i4 = iM55680 ^ i3;
                    i14 = i2;
                    i19 = i19;
                    viewOnClickListenerC11391 = viewOnClickListenerC11391;
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
                    viewOnClickListenerC11391 = viewOnClickListenerC11391;
                    int i22 = s2 + s;
                    if (((s2 * 2) + 1) - (i22 * i22) <= 0) {
                        iM55680 = (C0873.m55680("ۙܿ") ^ i13) * (-17);
                        i2 = ((iM55680 ^ i12) * (-11349)) ^ 547037456;
                        i3 = -1272529709;
                    } else {
                        iM55680 = C0873.m55680("۫᩹") ^ i12;
                        i2 = ((iM55680 ^ i13) * (-27849)) ^ (-1051823153);
                        i3 = -464734294;
                    }
                    i4 = iM55680 ^ i3;
                    i14 = i2;
                    i19 = i19;
                    viewOnClickListenerC11391 = viewOnClickListenerC11391;
                    textView3 = textView3;
                    c2 = c2;
                    str5 = str5;
                    i15 = i4;
                    i11 = i;
                    break;
                case -1631337211:
                case 6858757:
                    viewOnClickListenerC11391.f31776 = strArr[length][2];
                    if (!C0947.f81895) {
                        iM55681 = C0873.m55680("ۚܶ") ^ i12;
                        i9 = ((iM55681 ^ i13) * 139) ^ 584444024;
                        i10 = -492282827;
                        i15 = iM55681 ^ i10;
                        i14 = i9;
                    } else {
                        str4 = str5;
                        int iM559710 = (i13 - C0946.m55979("ܺ᩷")) * (-77);
                        str5 = str4;
                        i14 = ((iM559710 ^ i12) * (-20901)) ^ (-294925438);
                        i15 = iM559710 ^ (-738240698);
                    }
                    break;
                case -1616147778:
                case 627859645:
                    i16 = 3461;
                    iM55680 = (i13 - C0946.m55979("۬۫")) * 93;
                    i2 = ((iM55680 ^ i12) * (-13187)) ^ 1283112267;
                    i3 = -163258727;
                    i4 = iM55680 ^ i3;
                    i14 = i2;
                    i19 = i19;
                    viewOnClickListenerC11391 = viewOnClickListenerC11391;
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
                    viewOnClickListenerC11390 = viewOnClickListenerC11391;
                    if (i11 - activityC10719.f29683.length < activityC10719.f29684.length) {
                        iM55979 = (i12 - C0946.m55979("ܿ᩶")) * (-39);
                        i6 = ((iM55979 ^ i13) * (-323)) ^ 2402133;
                        i7 = 1829657424;
                    } else {
                        iM55979 = (C0873.m55680("ۛ֫") ^ i13) * 65;
                        i6 = ((iM55979 ^ i12) * (-17347)) ^ (-1881947566);
                        i7 = 797769463;
                    }
                    int i23 = iM55979 ^ i7;
                    i19 = i5;
                    str = str2;
                    i15 = i23;
                    i14 = i6;
                    viewOnClickListenerC11391 = viewOnClickListenerC11390;
                    textView3 = textView;
                    c2 = c2;
                    str5 = str;
                    break;
                case -1428432233:
                case 336664622:
                    TextView textView5 = textView3;
                    String str6 = str5;
                    int i24 = i19;
                    viewOnClickListenerC11391 = (ViewOnClickListenerC11390) abstractC5462;
                    activityC10719 = this.f69982;
                    if (i11 < activityC10719.f29683.length) {
                        int iM55683 = C0873.m55680("᩸ۙ") ^ i12;
                        i14 = ((iM55683 ^ i13) * 2657) ^ 1341110890;
                        textView3 = textView5;
                        i19 = i24;
                        str5 = str6;
                        c2 = 1;
                        i11 = i;
                        i15 = iM55683 ^ 827245244;
                        c3 = 0;
                    } else {
                        int iM55684 = C0873.m55680("۠᩻") ^ i12;
                        int i25 = ((iM55684 ^ i13) * 32065) ^ (-1933954572);
                        i4 = iM55684 ^ 716489377;
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
                    length = i11 - activityC10719.f29683.length;
                    textView4 = viewOnClickListenerC11391.f31778;
                    strArr2 = activityC10719.f29684;
                    if (C1044.f81959 >= 0) {
                        iM55681 = (C0873.m55680("֡᩵") + i12) * (-49);
                        i9 = ((iM55681 ^ i13) * (-19281)) ^ (-1597876254);
                        i10 = 1263371427;
                    } else {
                        iM55681 = C0946.m55979("ۜۧ") ^ i12;
                        i9 = ((iM55681 ^ i13) * 4315) ^ 1175138611;
                        i10 = 884590129;
                    }
                    i15 = iM55681 ^ i10;
                    i14 = i9;
                    break;
                case -1194776854:
                case 1762414589:
                    imageView2 = viewOnClickListenerC11391.f31779;
                    sArr2 = f82985;
                    i20 = 4;
                    if (C0892.f81851) {
                        iM55681 = (i12 - C0946.m55979("᩷ᩴ")) * (-95);
                        i9 = ((iM55681 ^ i13) * 26093) ^ (-1184733394);
                        i10 = -1603322184;
                    } else {
                        iM55681 = C0873.m55680("ۡ᩵") ^ i13;
                        i9 = ((iM55681 ^ i12) * (-11353)) ^ (-1460875397);
                        i10 = 262324541;
                    }
                    i15 = iM55681 ^ i10;
                    i14 = i9;
                    break;
                case -1159122551:
                case 90030643:
                    str5 = str5;
                    i19 = i19;
                    c2 = c2;
                    RunnableC0938.m55928(viewOnClickListenerC11391.f31778, activityC10719.f29683[i11][c3]);
                    textView3 = viewOnClickListenerC11391.f31780;
                    if (C1028.f81950 > 0) {
                        int iM559711 = C0946.m55979("ۢۡ") ^ i13;
                        i19 = i19;
                        str = str5;
                        i15 = iM559711 ^ (-2056724435);
                        i14 = ((iM559711 ^ i12) * (-2901)) ^ 796303440;
                        c2 = c2;
                        str5 = str;
                    } else {
                        textView3 = textView3;
                        viewOnClickListenerC11391 = viewOnClickListenerC11391;
                        iM55680 = C0873.m55680("᩶ܿ") ^ i13;
                        i2 = ((iM55680 ^ i12) * 14251) ^ 1708110732;
                        i3 = 1065959727;
                        i4 = iM55680 ^ i3;
                        i14 = i2;
                        i19 = i19;
                        viewOnClickListenerC11391 = viewOnClickListenerC11391;
                        textView3 = textView3;
                        c2 = c2;
                        str5 = str5;
                        i15 = i4;
                        i11 = i;
                    }
                    break;
                case -1088563730:
                case 115756611:
                    RunnableC0938.m55928(textView4, strArr2[length][c3]);
                    if (C1017.f81942 < 0) {
                        iM55681 = (i13 - C0873.m55680("ۛۚ")) * (-83);
                        i9 = ((iM55681 ^ i12) * (-18629)) ^ (-965397181);
                        i10 = 2066015239;
                        i15 = iM55681 ^ i10;
                        i14 = i9;
                    } else {
                        str4 = str5;
                        int iM559712 = (i13 - C0946.m55979("ܺ᩷")) * (-77);
                        str5 = str4;
                        i14 = ((iM559712 ^ i12) * (-20901)) ^ (-294925438);
                        i15 = iM559712 ^ (-738240698);
                    }
                    break;
                case -1022411266:
                case 931309464:
                    C1046.m56302();
                    if (C0873.f81841 <= 0) {
                        iM55681 = C0873.m55680("ۡ᩵") ^ i13;
                        i9 = ((iM55681 ^ i12) * (-11353)) ^ (-1460875397);
                        i10 = 262324541;
                        i15 = iM55681 ^ i10;
                        i14 = i9;
                    } else {
                        str3 = str5;
                        i8 = i19;
                        c = c2;
                        textView2 = textView3;
                        int iM559713 = (C0946.m55979("ۤ۠") ^ i12) * (-59);
                        String str7 = str3;
                        i14 = ((iM559713 ^ i13) * (-28125)) ^ (-2038345226);
                        int i26 = iM559713 ^ 1127473341;
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
                    viewOnClickListenerC11391.f31776 = str4;
                    imageView = viewOnClickListenerC11391.f31779;
                    sArr = f82985;
                    i17 = 1;
                    i19 = 3;
                    if (C1404.f82149 < 0) {
                        str5 = str4;
                        iM55681 = (i12 - C0873.m55680("۬᩻")) * (-67);
                        i9 = ((iM55681 ^ i13) * (-28673)) ^ 1691025152;
                        i10 = 32256680;
                        i15 = iM55681 ^ i10;
                        i14 = i9;
                    } else {
                        int iM559714 = (i13 - C0946.m55979("ܺ᩷")) * (-77);
                        str5 = str4;
                        i14 = ((iM559714 ^ i12) * (-20901)) ^ (-294925438);
                        i15 = iM559714 ^ (-738240698);
                    }
                    break;
                case -588211831:
                case 10163188:
                    C0894.m55771(viewOnClickListenerC11391.f31780, activityC10719.f29684[length][c2]);
                    strArr = activityC10719.f29684;
                    if (C0882.m55710() != 0) {
                        iM55681 = (C0873.m55680("֡᩵") + i12) * (-49);
                        i9 = ((iM55681 ^ i13) * (-19281)) ^ (-1597876254);
                        i10 = 1263371427;
                    } else {
                        iM55681 = C0873.m55680("֫ۢ") ^ i13;
                        i9 = ((iM55681 ^ i12) * 18529) ^ (-1392027290);
                        i10 = -132498569;
                    }
                    i15 = iM55681 ^ i10;
                    i14 = i9;
                    break;
                case -511928409:
                case 1498624579:
                    RunnableC1014.m56177();
                    C0992.m56107();
                    break;
                case -474909449:
                case 245497469:
                    i8 = i19;
                    String str8 = activityC10719.f29683[i11][c2];
                    c = c2;
                    textView2 = textView3;
                    C0894.m55771(textView2, str8);
                    if (C0861.f81831) {
                        int iM559715 = C0946.m55979("֨ܺ") ^ i13;
                        i14 = ((iM559715 ^ i12) * (-4787)) ^ (-769865437);
                        i19 = i8;
                        i15 = iM559715 ^ (-1353620347);
                        textView3 = textView2;
                        c2 = c;
                        str5 = null;
                    } else {
                        str3 = null;
                        int iM559716 = (C0946.m55979("ۤ۠") ^ i12) * (-59);
                        String str9 = str3;
                        i14 = ((iM559716 ^ i13) * (-28125)) ^ (-2038345226);
                        int i27 = iM559716 ^ 1127473341;
                        i19 = i8;
                        textView3 = textView2;
                        c2 = c;
                        str5 = str9;
                        i15 = i27;
                    }
                    break;
                case 158290026:
                case 235058587:
                    if (C0890.f81849 == 0) {
                        str4 = str5;
                        int iM559717 = (i13 - C0946.m55979("ܺ᩷")) * (-77);
                        str5 = str4;
                        i14 = ((iM559717 ^ i12) * (-20901)) ^ (-294925438);
                        i15 = iM559717 ^ (-738240698);
                    } else {
                        str3 = str5;
                        i8 = i19;
                        c = c2;
                        textView2 = textView3;
                        int iM559718 = (C0946.m55979("ۤ۠") ^ i12) * (-59);
                        String str10 = str3;
                        i14 = ((iM559718 ^ i13) * (-28125)) ^ (-2038345226);
                        int i28 = iM559718 ^ 1127473341;
                        i19 = i8;
                        textView3 = textView2;
                        c2 = c;
                        str5 = str10;
                        i15 = i28;
                    }
                    break;
                case 567812692:
                case 1769694828:
                    if (C0845.f81821 < 0) {
                        str3 = str5;
                        i8 = i19;
                        c = c2;
                        textView2 = textView3;
                        int iM559719 = (C0946.m55979("ۤ۠") ^ i12) * (-59);
                        String str11 = str3;
                        i14 = ((iM559719 ^ i13) * (-28125)) ^ (-2038345226);
                        int i29 = iM559719 ^ 1127473341;
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
                        viewOnClickListenerC11391 = viewOnClickListenerC11391;
                        iM55680 = C0873.m55680("᩶ܿ") ^ i13;
                        i2 = ((iM55680 ^ i12) * 14251) ^ 1708110732;
                        i3 = 1065959727;
                        i4 = iM55680 ^ i3;
                        i14 = i2;
                        i19 = i19;
                        viewOnClickListenerC11391 = viewOnClickListenerC11391;
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
                    iM55680 = (i13 - C0946.m55979("۬۫")) * 93;
                    i2 = ((iM55680 ^ i12) * (-13187)) ^ 1283112267;
                    i3 = -163258727;
                    i4 = iM55680 ^ i3;
                    i14 = i2;
                    i19 = i19;
                    viewOnClickListenerC11391 = viewOnClickListenerC11391;
                    textView3 = textView3;
                    c2 = c2;
                    str5 = str5;
                    i15 = i4;
                    i11 = i;
                    break;
                case 1779907253:
                case 1978833497:
                    imageView.setImageResource(C0873.m55680(C0937.m55921(sArr, i17, i19, i16)) ^ 2118003804);
                    break;
                default:
                    str5 = str5;
                    i19 = i19;
                    c2 = c2;
                    textView3 = textView3;
                    viewOnClickListenerC11391 = viewOnClickListenerC11391;
                    s2 = sArr3[0];
                    s = 1;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0873.m55680("᩶ܿ") ^ i13;
                        i2 = ((iM55680 ^ i12) * 14251) ^ 1708110732;
                        i3 = 1065959727;
                    } else {
                        iM55680 = (C0873.m55680("ۛ۠") ^ i13) * (-55);
                        i2 = ((iM55680 ^ i12) * 16559) ^ 499042824;
                        i3 = 2144598156;
                    }
                    i4 = iM55680 ^ i3;
                    i14 = i2;
                    i19 = i19;
                    viewOnClickListenerC11391 = viewOnClickListenerC11391;
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

    public C22119(ActivityC10719 activityC10719) {
        this.f69982 = activityC10719;
    }
}
