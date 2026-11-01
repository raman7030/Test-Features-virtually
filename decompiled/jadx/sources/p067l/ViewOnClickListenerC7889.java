package p067l;

import android.R;
import android.content.Intent;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.function.Consumer;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۛۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FO */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC7889 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֫ܰ᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f82012 = {7558, -18069, -18071, -18050, -18077, -18052, -18077, -18050, -18061, -18052, 10648, 12502, -8493, -18068, -18077, -18076, -18066, -18084, -18077, -18065, -18051, -18104, -18061, -18109, -18066, -18142, -18140, -18140, -18140, -18141, -15210, -7581, -13533, 13714, 13892, 14971, 12107, 15008, -13634, -8319, 15822, -10064, -9447, -14217, -14181, -11416, -9556, 15502, 12967, -9391, -14741, -4353, -4912, 9510, -11039, -14194, -12938, 8732, -31347, 25494, -30360, 32054, 32148, 26598, 6253, 31063, 2155, 11955, 915, 14008, 160, 1992, 3671, -170, 7793, 7697, 6932, 3386, 31058, 31049, 31054, 31062, 31072, 31042, 31061, 31048, 31063, 31044, 31076, 31052, 31040, 31048, 31053};

    /* JADX INFO: renamed from: ۗ */
    public final TextView f20702;

    /* JADX INFO: renamed from: ۙ */
    public final TextView f20703;

    /* JADX INFO: renamed from: ۬ */
    public final TextView f20704;

    /* JADX INFO: renamed from: ᩶ */
    public final TextView f20705;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractActivityC5549 f20706;

    /* JADX INFO: renamed from: ᩹ */
    public final TextView f20707;

    /* JADX WARN: Code duplicated, block: B:34:0x018a  */
    public ViewOnClickListenerC7889(AbstractActivityC5549 abstractActivityC5549, DialogInterfaceC2564 dialogInterfaceC2564, View view, final Consumer consumer) {
        int iM55680;
        int i;
        int i2;
        int i3;
        TextView textView;
        int i4;
        TextView textView2;
        short[] sArr;
        int i5;
        short[] sArr2;
        int iM55681;
        int i6;
        TextView textView3;
        short[] sArr3;
        int i7;
        int i8;
        short[] sArr4;
        int iM55682;
        int i9;
        int i10;
        final ViewOnClickListenerC7889 viewOnClickListenerC7889 = this;
        dialogInterfaceC2564 = dialogInterfaceC2564;
        int i11 = C0906.f81862;
        int i12 = C1012.f81938;
        short s = f82012[0];
        int i13 = (s * s) + 242456041;
        int i14 = s + 15571;
        int i15 = (i13 + i13) - (i14 * i14) >= 0 ? 47370 : 52808;
        RunnableC0871.m55661(abstractActivityC5549, C0845.m55592(f82012, 1, 8, i15));
        C1025.m56218(view, C1929.m56558(f82012, 9, 1, i15));
        int iM55683 = (i11 - C0873.m55680("ܰ᩸")) * (-119);
        View viewM55755 = null;
        String strM55893 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i16 = 0;
        String strM55618 = null;
        int i17 = 0;
        int iM55979 = 0;
        int i18 = 0;
        int iM559710 = 0;
        int i19 = 0;
        int iM55684 = 0;
        int iM55685 = 0;
        View viewM55756 = null;
        int i20 = 0;
        int i21 = 1310837435;
        TextView textView4 = null;
        View view2 = null;
        C7350 c7350 = null;
        View.OnClickListener onClickListener = null;
        int i22 = ((iM55683 ^ i12) * 4307) ^ 1211334863;
        InterfaceC17797 interfaceC17797 = null;
        int i23 = iM55683 ^ 699690262;
        short[] sArr7 = null;
        int iM55686 = 0;
        while (true) {
            i21 = i23 ^ (i22 & (((i21 ^ i12) * (-10085)) >> 31));
            switch (i21) {
                case -2060271339:
                case -772432492:
                    C1003.m56123();
                    C0912.m55833();
                    textView = textView4;
                    iM55681 = (i12 - C0873.m55680("ܺ۠")) * 37;
                    i2 = ((iM55681 ^ i11) * (-23667)) ^ (-4272755);
                    i6 = 2073844481;
                    i3 = iM55681 ^ i6;
                    textView4 = textView;
                    i23 = i3;
                    i22 = i2;
                    break;
                case -2056474600:
                case -1366498522:
                    i5 = i16;
                    sArr = sArr7;
                    textView2 = textView4;
                    viewM55756 = C0892.m55755(view, iM55686 ^ 2099629055);
                    sArr2 = f82012;
                    i4 = 13;
                    if (RunnableC0938.f81886 >= 0) {
                        int iM55687 = C0873.m55680("᩵ۤ") ^ i12;
                        i22 = ((iM55687 ^ i11) * (-16685)) ^ 130617189;
                        textView4 = textView2;
                        i23 = iM55687 ^ 1692597683;
                        sArr7 = sArr;
                        i20 = i4;
                    } else {
                        int iM559711 = C0946.m55979("ܿۜ") ^ i11;
                        i22 = ((iM559711 ^ i12) * (-21773)) ^ 1743494148;
                        textView4 = textView2;
                        i23 = iM559711 ^ 871780491;
                        sArr7 = sArr;
                        i20 = 13;
                    }
                    int i24 = i5;
                    sArr5 = sArr2;
                    i16 = i24;
                    break;
                case -1965858963:
                case 1968447691:
                    short[] sArr8 = sArr5;
                    i5 = i16;
                    sArr2 = sArr8;
                    viewOnClickListenerC7889.f20706 = abstractActivityC5549;
                    iM55686 = C0873.m55680(AbstractC0942.m55970(f82012, 10, 3, i15));
                    int iM55688 = C0873.m55680("۟ᩴ") ^ i12;
                    i22 = 217367368 ^ ((iM55688 ^ i11) * 25857);
                    textView4 = textView4;
                    sArr7 = sArr7;
                    i23 = iM55688 ^ 462968699;
                    i20 = i20;
                    viewOnClickListenerC7889 = this;
                    int i25 = i5;
                    sArr5 = sArr2;
                    i16 = i25;
                    break;
                case -1908522385:
                case 686710220:
                    C0898.m55800();
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0873.m55680("ۧܶ") ^ i12;
                        i22 = ((iM55680 ^ i11) * 4107) ^ (-261576936);
                        i = -1617604559;
                        i23 = iM55680 ^ i;
                    } else {
                        textView = textView4;
                        iM55681 = (i12 - C0873.m55680("ܺ۠")) * 37;
                        i2 = ((iM55681 ^ i11) * (-23667)) ^ (-4272755);
                        i6 = 2073844481;
                        i3 = iM55681 ^ i6;
                        textView4 = textView;
                        i23 = i3;
                        i22 = i2;
                    }
                    break;
                case -1801294208:
                case 1792222760:
                    View viewM56465 = C1404.m56465(view, iM55684 ^ 2098379126);
                    C1048.m56304(viewM56465, viewOnClickListenerC7889);
                    C21272.m48052(viewM56465);
                    iM55685 = C0873.m55680(C0992.m56102(f82012, 51, 3, i15));
                    iM55680 = C0873.m55680("ۢۧ") ^ i12;
                    i22 = ((iM55680 ^ i11) * 2449) ^ (-1809480880);
                    i = -572049682;
                    i23 = iM55680 ^ i;
                    break;
                case -1661074979:
                case -1509802941:
                    textView3 = textView4;
                    sArr3 = sArr5;
                    i7 = i20;
                    strM55618 = C0861.m55618(sArr3, i7, 17, i15);
                    i8 = i16;
                    View view3 = viewM55756;
                    C1048.m56315(view3, strM55618);
                    viewOnClickListenerC7889.f20702 = (TextView) view3;
                    sArr4 = sArr7;
                    strM55893 = C0930.m55893(f82012, 30, 3, i15);
                    if (C0906.f81862 >= 0) {
                        iM55682 = (i11 - C0873.m55680("ۧܽ")) * (-127);
                        i9 = ((iM55682 ^ i12) * (-22261)) ^ 151158876;
                        i10 = 66388921;
                    } else {
                        iM55682 = C0873.m55680("ۘ᩻") ^ i11;
                        i9 = ((iM55682 ^ i12) * (-27537)) ^ (-418076560);
                        i10 = 121042821;
                    }
                    int i26 = iM55682 ^ i10;
                    textView4 = textView3;
                    sArr7 = sArr4;
                    i23 = i26;
                    i20 = i7;
                    i16 = i8;
                    sArr5 = sArr3;
                    i22 = i9;
                    dialogInterfaceC2564 = dialogInterfaceC2564;
                    break;
                case -1624968149:
                case -695085427:
                    C1048.m56304(viewM55755, onClickListener);
                    C0947.m55996(C0892.m55755(view, R.id.button3), new View.OnClickListener() { // from class: l.᩸ۘۡ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            ViewOnClickListenerC7889.m18236(this.f71444);
                        }
                    });
                    final Button button = (Button) C0892.m55755(view, R.id.button2);
                    C0947.m55996(button, new View.OnClickListener() { // from class: l.᩹ۘۡ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            ViewOnClickListenerC7889.m18233(this.f73359);
                        }
                    });
                    C0955.m56030(C9269.f25170, dialogInterfaceC2564, new C13254(new InterfaceC17797() { // from class: l.᩶ۘۡ

                        /* JADX INFO: renamed from: ᩹ۤ᩺, reason: not valid java name and contains not printable characters */
                        private static final short[] f82964 = {3980, -1597, -1595, -1581, -1596, -1563, -1598, -1577, -1598, -1581, -28097, -28716, -18709, -28164, -29045, -24278};

                        /* JADX WARN: Code duplicated, block: B:42:0x013b A[PHI: r6 r7 r8
                          0x013b: PHI (r6v5 short[]) = (r6v3 short[]), (r6v2 short[]), (r6v2 short[]), (r6v2 short[]) binds: [B:41:0x0139, B:19:0x0090, B:17:0x008c, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]
                          0x013b: PHI (r7v5 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:41:0x0139, B:19:0x0090, B:17:0x008c, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]
                          0x013b: PHI (r8v5 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:41:0x0139, B:19:0x0090, B:17:0x008c, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:74:0x02d8 A[PHI: r13 r14 r20 r21 r26
                          0x02d8: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:73:0x02d6, B:60:0x024d, B:17:0x008c, B:13:0x0082] A[DONT_GENERATE, DONT_INLINE]
                          0x02d8: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:73:0x02d6, B:60:0x024d, B:17:0x008c, B:13:0x0082] A[DONT_GENERATE, DONT_INLINE]
                          0x02d8: PHI (r20v4 int) = (r20v3 int), (r20v2 int), (r20v2 int), (r20v2 int) binds: [B:73:0x02d6, B:60:0x024d, B:17:0x008c, B:13:0x0082] A[DONT_GENERATE, DONT_INLINE]
                          0x02d8: PHI (r21v4 int) = (r21v3 int), (r21v2 int), (r21v2 int), (r21v2 int) binds: [B:73:0x02d6, B:60:0x024d, B:17:0x008c, B:13:0x0082] A[DONT_GENERATE, DONT_INLINE]
                          0x02d8: PHI (r26v26 l.ܰۚۡ) = (r26v10 l.ܰۚۡ), (r26v18 l.ܰۚۡ), (r26v3 l.ܰۚۡ), (r26v3 l.ܰۚۡ) binds: [B:73:0x02d6, B:60:0x024d, B:17:0x008c, B:13:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:84:0x035c A[PHI: r4 r16 r17 r25
                          0x035c: PHI (r4v6 java.lang.String) = (r4v2 java.lang.String), (r4v4 java.lang.String), (r4v2 java.lang.String) binds: [B:81:0x0342, B:15:0x0086, B:6:0x006c] A[DONT_GENERATE, DONT_INLINE]
                          0x035c: PHI (r16v3 short[]) = (r16v2 short[]), (r16v2 short[]), (r16v7 short[]) binds: [B:81:0x0342, B:15:0x0086, B:6:0x006c] A[DONT_GENERATE, DONT_INLINE]
                          0x035c: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:81:0x0342, B:15:0x0086, B:6:0x006c] A[DONT_GENERATE, DONT_INLINE]
                          0x035c: PHI (r25v40 l.ܰۚۡ) = (r25v2 l.ܰۚۡ), (r25v33 l.ܰۚۡ), (r25v45 l.ܰۚۡ) binds: [B:81:0x0342, B:15:0x0086, B:6:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code restructure failed: missing block: B:13:0x0082, code lost:
                        
                            if (p067l.C1071.f81975 > 0) goto L74;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:9:0x0075, code lost:
                        
                            if (p067l.C0898.f81858 > 0) goto L42;
                         */
                        @Override // p067l.InterfaceC17797
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj) {
                            int iM559712;
                            int i27;
                            int i28;
                            int iM559713;
                            int i29;
                            int iM55689;
                            int i30;
                            int i31;
                            int iM556810;
                            int i32;
                            int i33 = C0845.f81821;
                            int i34 = C0863.f81833;
                            int iM556811 = (C0873.m55680("ۘ۠") + i33) * 51;
                            int i35 = ((iM556811 ^ i34) * (-5765)) ^ (-765296017);
                            Button button2 = null;
                            short[] sArr9 = null;
                            short[] sArr10 = null;
                            short[] sArr11 = null;
                            short[] sArr12 = null;
                            int i36 = iM556811 ^ 1207542030;
                            int i37 = 0;
                            int i38 = 0;
                            int i39 = 0;
                            int i40 = 0;
                            int i41 = 0;
                            int i42 = 0;
                            int i43 = 0;
                            char c = 0;
                            short s2 = 0;
                            int i44 = 0;
                            int i45 = 0;
                            int i46 = 0;
                            int i47 = -1447937894;
                            EnumC15303 enumC15303 = null;
                            String strM56403 = null;
                            String strM55689 = null;
                            int i48 = 0;
                            while (true) {
                                i47 = i36 ^ (i35 & (((i47 ^ i34) * (-11415)) >> 31));
                                switch (i47) {
                                    case -2146644155:
                                    case 1634113693:
                                        EnumC15303 enumC15304 = enumC15303;
                                        RunnableC0871.m55661(enumC15304, C1017.m56189(sArr10, i42, i43, i41));
                                        boolean zM34839 = enumC15304.m34839();
                                        enumC15303 = enumC15304;
                                        Button button3 = button;
                                        if (zM34839) {
                                            iM55689 = C0873.m55680("᩺ۚ") ^ i34;
                                            i27 = ((iM55689 ^ i33) * (-20923)) ^ 236371665;
                                            i30 = -268846731;
                                        } else {
                                            iM55689 = C0873.m55680("֡᩸") ^ i33;
                                            i27 = ((iM55689 ^ i34) * (-13255)) ^ (-1992742546);
                                            i30 = 779495034;
                                        }
                                        i31 = iM55689 ^ i30;
                                        button2 = button3;
                                        enumC15303 = enumC15303;
                                        i36 = i31;
                                        i35 = i27;
                                        break;
                                    case -2101812873:
                                    case 1340456943:
                                        if (C0955.f81898) {
                                            iM559713 = (C0873.m55680("ۡ֡") + i33) * 59;
                                            i27 = ((iM559713 ^ i34) * 30159) ^ (-1270829327);
                                            i29 = -374890264;
                                        } else {
                                            iM559713 = (C0946.m55979("᩷ۢ") + i33) * (-31);
                                            i27 = ((iM559713 ^ i34) * (-8565)) ^ 1218547069;
                                            i29 = -1276670695;
                                        }
                                        i36 = iM559713 ^ i29;
                                        i35 = i27;
                                        break;
                                    case -2062813507:
                                    case -757861434:
                                        C0898.m55802(button2, 0);
                                        int i49 = C12996.f36563;
                                        if (C0927.m55866()) {
                                            iM559713 = C0946.m55979("۠᩸") ^ i33;
                                            i27 = ((iM559713 ^ i34) * (-15243)) ^ (-1156803622);
                                            i29 = -268164169;
                                        } else {
                                            iM559713 = (C0946.m55979("ۤۧ") + i33) * (-73);
                                            i27 = ((iM559713 ^ i34) * 21119) ^ (-2088628480);
                                            i29 = 842391418;
                                        }
                                        i36 = iM559713 ^ i29;
                                        i35 = i27;
                                        break;
                                    case -2010305494:
                                    case -380238411:
                                        iM556810 = C0873.m55680(strM56403);
                                        i32 = 2122599911;
                                        i48 = iM556810 ^ i32;
                                        iM559713 = C0873.m55680("ᩳ᩹") ^ i34;
                                        i27 = ((iM559713 ^ i33) * (-18353)) ^ 816426468;
                                        i29 = 1454765617;
                                        i36 = iM559713 ^ i29;
                                        i35 = i27;
                                        break;
                                    case -1801923790:
                                    case -514608678:
                                        enumC15303 = enumC15303;
                                        i45 = i44 * i44;
                                        i46 = s2 * 2;
                                        if (C1194.m56396() > 0) {
                                            iM559712 = (C0946.m55979("ۗܳ") ^ i34) * 49;
                                            i27 = ((iM559712 ^ i33) * (-27919)) ^ 1673267908;
                                            i28 = -1568511386;
                                            i31 = iM559712 ^ i28;
                                            enumC15303 = enumC15303;
                                            i36 = i31;
                                            i35 = i27;
                                        } else {
                                            enumC15303 = enumC15303;
                                            iM559713 = (C0946.m55979("᩷ۢ") + i33) * (-31);
                                            i27 = ((iM559713 ^ i34) * (-8565)) ^ 1218547069;
                                            i29 = -1276670695;
                                            i36 = iM559713 ^ i29;
                                            i35 = i27;
                                        }
                                        break;
                                    case -1706392571:
                                    case -962716872:
                                        sArr11 = f82964;
                                        i37 = 10;
                                        i38 = 3;
                                        if (C0930.f81879 <= 0) {
                                            iM559713 = (C0873.m55680("ۡ֡") + i33) * 59;
                                            i27 = ((iM559713 ^ i34) * 30159) ^ (-1270829327);
                                            i29 = -374890264;
                                        } else {
                                            iM559713 = (C0946.m55979("ܰۖ") ^ i33) * 55;
                                            i27 = ((iM559713 ^ i34) * (-23719)) ^ 2065466202;
                                            i29 = 1077229737;
                                        }
                                        i36 = iM559713 ^ i29;
                                        i35 = i27;
                                        break;
                                    case -1485057939:
                                    case 1771447180:
                                        strM56403 = C1229.m56403(sArr12, i39, i40, i41);
                                        if (!C0866.m55645()) {
                                            enumC15303 = enumC15303;
                                            iM559712 = C0873.m55680("ۨ֨") ^ i34;
                                            i27 = ((iM559712 ^ i33) * 32739) ^ (-1649179144);
                                            i28 = 104121536;
                                            i31 = iM559712 ^ i28;
                                            enumC15303 = enumC15303;
                                            i36 = i31;
                                            i35 = i27;
                                        } else {
                                            iM559713 = C0946.m55979("ۛۧ") ^ i33;
                                            i27 = ((iM559713 ^ i34) * (-14683)) ^ 1024072929;
                                            i29 = 368296850;
                                            i36 = iM559713 ^ i29;
                                            i35 = i27;
                                        }
                                        break;
                                    case -1177564378:
                                    case 1314782038:
                                        C0946.m55976(button2, i48);
                                        iM559713 = (C0946.m55979("֫ۧ") ^ i34) * (-35);
                                        i27 = ((iM559713 ^ i33) * 14137) ^ 2129887265;
                                        i29 = -2047454392;
                                        i36 = iM559713 ^ i29;
                                        i35 = i27;
                                        break;
                                    case -1174635803:
                                    case 1564693352:
                                        enumC15303 = (EnumC15303) obj;
                                        sArr10 = f82964;
                                        i42 = 1;
                                        if (C0882.m55710() != 0) {
                                            iM559713 = (C0946.m55979("᩷ۢ") + i33) * (-31);
                                            i27 = ((iM559713 ^ i34) * (-8565)) ^ 1218547069;
                                            i29 = -1276670695;
                                        } else {
                                            iM559713 = (i33 - C0946.m55979("ܶۡ")) * (-25);
                                            i27 = ((iM559713 ^ i34) * (-12089)) ^ 1874211338;
                                            i29 = 507045925;
                                        }
                                        i36 = iM559713 ^ i29;
                                        i35 = i27;
                                        break;
                                    case -1140241522:
                                    case 1202264024:
                                        enumC15303 = enumC15303;
                                        s2 = sArr9[c];
                                        i44 = s2 + 1;
                                        if (C1194.f82045 != 0) {
                                            iM559712 = C0873.m55680("ۨ֨") ^ i34;
                                            i27 = ((iM559712 ^ i33) * 32739) ^ (-1649179144);
                                            i28 = 104121536;
                                        } else {
                                            iM559712 = C0873.m55680("ܺۖ") ^ i33;
                                            i27 = ((iM559712 ^ i34) * 11329) ^ 176014590;
                                            i28 = 1748838565;
                                        }
                                        i31 = iM559712 ^ i28;
                                        enumC15303 = enumC15303;
                                        i36 = i31;
                                        i35 = i27;
                                        break;
                                    case -990765203:
                                    case 707063047:
                                        i41 = 62614;
                                        iM559712 = C0946.m55979("ۗۢ") ^ i34;
                                        i27 = ((iM559712 ^ i33) * 10433) ^ (-2024534804);
                                        i28 = -1592270065;
                                        i31 = iM559712 ^ i28;
                                        enumC15303 = enumC15303;
                                        i36 = i31;
                                        i35 = i27;
                                        break;
                                    case -824909502:
                                    case 127746626:
                                        strM55689 = C0873.m55689(sArr11, i37, i38, i41);
                                        if (RunnableC1014.f81941 > 0) {
                                            iM559713 = (C0946.m55979("֡۬") ^ i34) * 77;
                                            i27 = ((iM559713 ^ i33) * (-11383)) ^ 902948343;
                                            i29 = -2107512567;
                                            i36 = iM559713 ^ i29;
                                            i35 = i27;
                                        }
                                        enumC15303 = enumC15303;
                                        iM559712 = (C0946.m55979("ۢ᩹") ^ i34) * (-27);
                                        i27 = ((iM559712 ^ i33) * (-213)) ^ 967473071;
                                        i28 = 281115265;
                                        i31 = iM559712 ^ i28;
                                        enumC15303 = enumC15303;
                                        i36 = i31;
                                        i35 = i27;
                                        break;
                                    case -739798783:
                                    case 58904168:
                                        C0882.m55710();
                                        C1071.m56343();
                                        return null;
                                    case -730150705:
                                    case 351694095:
                                        C1046.m56302();
                                        iM559713 = (C0873.m55680("ۡ֡") + i33) * 59;
                                        i27 = ((iM559713 ^ i34) * 30159) ^ (-1270829327);
                                        i29 = -374890264;
                                        i36 = iM559713 ^ i29;
                                        i35 = i27;
                                        break;
                                    case -424474969:
                                    case 517954561:
                                        C1036.m56257();
                                        break;
                                    case -359660376:
                                    case 1305365509:
                                        enumC15303 = enumC15303;
                                        i43 = 9;
                                        if (C0989.m56095() <= 0) {
                                            iM559712 = C0873.m55680("۟ۧ") ^ i33;
                                            i27 = ((iM559712 ^ i34) * 25411) ^ 626462515;
                                            i28 = -1436328855;
                                        } else {
                                            iM559712 = (C0946.m55979("᩶ܳ") + i34) * (-9);
                                            i27 = ((iM559712 ^ i33) * 26349) ^ 75422013;
                                            i28 = 2130384143;
                                        }
                                        i31 = iM559712 ^ i28;
                                        enumC15303 = enumC15303;
                                        i36 = i31;
                                        i35 = i27;
                                        break;
                                    case -238071500:
                                    case 1455756087:
                                        i41 = 63926;
                                        iM559712 = C0946.m55979("ۗۢ") ^ i34;
                                        i27 = ((iM559712 ^ i33) * 10433) ^ (-2024534804);
                                        i28 = -1592270065;
                                        i31 = iM559712 ^ i28;
                                        enumC15303 = enumC15303;
                                        i36 = i31;
                                        i35 = i27;
                                        break;
                                    case -149831212:
                                    case 1194392343:
                                        C0898.m55802(button2, 8);
                                        iM559713 = (C0946.m55979("֫ۧ") ^ i34) * (-35);
                                        i27 = ((iM559713 ^ i33) * 14137) ^ 2129887265;
                                        i29 = -2047454392;
                                        i36 = iM559713 ^ i29;
                                        i35 = i27;
                                        break;
                                    case -57084693:
                                    case 1582806125:
                                        iM556810 = C0873.m55680(strM55689);
                                        i32 = 2125486493;
                                        i48 = iM556810 ^ i32;
                                        iM559713 = C0873.m55680("ᩳ᩹") ^ i34;
                                        i27 = ((iM559713 ^ i33) * (-18353)) ^ 816426468;
                                        i29 = 1454765617;
                                        i36 = iM559713 ^ i29;
                                        i35 = i27;
                                        break;
                                    case 102206285:
                                    case 766503723:
                                        enumC15303 = enumC15303;
                                        c = 0;
                                        if (C0861.f81831) {
                                            iM559712 = (C0946.m55979("᩻֫") ^ i33) * 3;
                                            i27 = ((iM559712 ^ i34) * (-29897)) ^ (-1866193242);
                                            i28 = -1302634423;
                                        } else {
                                            iM559712 = (C0946.m55979("ۢ᩹") ^ i34) * (-27);
                                            i27 = ((iM559712 ^ i33) * (-213)) ^ 967473071;
                                            i28 = 281115265;
                                        }
                                        i31 = iM559712 ^ i28;
                                        enumC15303 = enumC15303;
                                        i36 = i31;
                                        i35 = i27;
                                        break;
                                    case 211931492:
                                    case 1374113348:
                                        sArr12 = f82964;
                                        i39 = 13;
                                        i40 = 3;
                                        if (RunnableC0871.f81839 < 0) {
                                            iM559713 = C0873.m55680("ۚۙ") ^ i34;
                                            i27 = ((iM559713 ^ i33) * (-28779)) ^ (-165217288);
                                            i29 = -1081063341;
                                            i36 = iM559713 ^ i29;
                                            i35 = i27;
                                        }
                                        enumC15303 = enumC15303;
                                        iM559712 = C0873.m55680("۟ۧ") ^ i33;
                                        i27 = ((iM559712 ^ i34) * 25411) ^ 626462515;
                                        i28 = -1436328855;
                                        i31 = iM559712 ^ i28;
                                        enumC15303 = enumC15303;
                                        i36 = i31;
                                        i35 = i27;
                                        break;
                                    case 235348361:
                                    case 1738164683:
                                        enumC15303 = enumC15303;
                                        if ((i46 + 1) - i45 <= 0) {
                                            iM559712 = (C0946.m55979("ۡۨ") + i34) * (-67);
                                            i27 = ((iM559712 ^ i33) * (-12617)) ^ 1680673382;
                                            i28 = -1946383940;
                                        } else {
                                            iM559712 = (C0873.m55680("۟ۢ") ^ i33) * 73;
                                            i27 = ((iM559712 ^ i34) * 10135) ^ (-1350483963);
                                            i28 = -810042747;
                                        }
                                        i31 = iM559712 ^ i28;
                                        enumC15303 = enumC15303;
                                        i36 = i31;
                                        i35 = i27;
                                        break;
                                    case 306919617:
                                    case 1968089042:
                                        return C10027.f27775;
                                    case 1455856330:
                                    case 1839925919:
                                        C0955.m56025();
                                        break;
                                    default:
                                        enumC15303 = enumC15303;
                                        sArr9 = f82964;
                                        if (C1124.f82007 >= 0) {
                                            iM559712 = (C0946.m55979("ۢ᩹") ^ i34) * (-27);
                                            i27 = ((iM559712 ^ i33) * (-213)) ^ 967473071;
                                            i28 = 281115265;
                                        } else {
                                            iM559712 = (C0946.m55979("ۜ᩵") ^ i34) * 53;
                                            i27 = ((iM559712 ^ i33) * (-23303)) ^ 1396395901;
                                            i28 = 786246581;
                                        }
                                        i31 = iM559712 ^ i28;
                                        enumC15303 = enumC15303;
                                        i36 = i31;
                                        i35 = i27;
                                        break;
                                }
                            }
                        }
                    }));
                    if (C0927.m55866()) {
                        iM55680 = (i12 - C0873.m55680("᩸ᩴ")) * 65;
                        i22 = ((iM55680 ^ i11) * (-32671)) ^ (-1557509815);
                        i = 603323796;
                    } else {
                        iM55680 = C0873.m55680("ۧܿ") ^ i11;
                        i22 = ((iM55680 ^ i12) * (-17893)) ^ 452233356;
                        i = -1375941703;
                    }
                    i23 = iM55680 ^ i;
                    break;
                case -1615887380:
                case -1602722279:
                    View viewM56466 = C1404.m56465(view, C0946.m55979(C0937.m55921(sArr7, i16, i17, i15)) ^ 2100012534);
                    C0947.m55988(viewM56466, strM55618);
                    viewOnClickListenerC7889.f20707 = (TextView) viewM56466;
                    sArr6 = f82012;
                    if (C0863.f81833 > 0) {
                        iM55680 = (C0946.m55979("ۚۗ") ^ i12) * (-13);
                        i22 = ((iM55680 ^ i11) * (-8187)) ^ 639986198;
                        i = 508467541;
                        i23 = iM55680 ^ i;
                    } else {
                        sArr3 = sArr5;
                        i7 = i20;
                        textView3 = textView4;
                        i8 = i16;
                        sArr4 = sArr7;
                        iM55682 = (i11 - C0873.m55680("ۧܽ")) * (-127);
                        i9 = ((iM55682 ^ i12) * (-22261)) ^ 151158876;
                        i10 = 66388921;
                        int i27 = iM55682 ^ i10;
                        textView4 = textView3;
                        sArr7 = sArr4;
                        i23 = i27;
                        i20 = i7;
                        i16 = i8;
                        sArr5 = sArr3;
                        i22 = i9;
                        dialogInterfaceC2564 = dialogInterfaceC2564;
                    }
                    break;
                case -1472286963:
                case -810281699:
                    View viewM56467 = C1404.m56465(view, C0873.m55680(strM55893) ^ 2129201566);
                    C0947.m55988(viewM56467, strM55618);
                    textView4 = (TextView) viewM56467;
                    iM55680 = C0873.m55680("۟᩵") ^ i12;
                    i22 = ((iM55680 ^ i11) * (-28181)) ^ (-1203284905);
                    i = -1523738525;
                    i23 = iM55680 ^ i;
                    break;
                case -1201547237:
                case -252992929:
                    C0882.m55716(C0946.m55979(C1194.m56386(f82012, 54, 3, i15)) ^ 2126041162);
                    iM55680 = C0873.m55680("ۧܿ") ^ i11;
                    i22 = ((iM55680 ^ i12) * (-17893)) ^ 452233356;
                    i = -1375941703;
                    i23 = iM55680 ^ i;
                    break;
                case -1069357448:
                case -742660166:
                    View viewM55757 = C0892.m55755(view, C0873.m55680(C0894.m55773(sArr6, 36, 3, i15)) ^ 2102290886);
                    C1048.m56315(viewM55757, strM55618);
                    viewOnClickListenerC7889.f20704 = (TextView) viewM55757;
                    iM55680 = (i12 - C0873.m55680("֡ܽ")) * 93;
                    i22 = ((iM55680 ^ i11) * (-2651)) ^ (-1156131233);
                    i = -725765465;
                    i23 = iM55680 ^ i;
                    break;
                case -626922824:
                case 287187030:
                    if (C24414.m53861()) {
                        iM55680 = C0873.m55680("ۧܿ") ^ i11;
                        i22 = ((iM55680 ^ i12) * (-17893)) ^ 452233356;
                        i = -1375941703;
                    } else {
                        iM55680 = C0946.m55979("֡ۛ") ^ i11;
                        i22 = ((iM55680 ^ i12) * (-1451)) ^ 1239238089;
                        i = 1608753454;
                    }
                    i23 = iM55680 ^ i;
                    break;
                case -421098787:
                case 680400060:
                    viewOnClickListenerC7889.f20703 = (TextView) view2;
                    C0955.m56030(C9269.f25169, dialogInterfaceC2564, new C13254(new InterfaceC17797() { // from class: l.ۙۘۡ
                        @Override // p067l.InterfaceC17797
                        public final Object invoke(Object obj) {
                            ViewOnClickListenerC7889 viewOnClickListenerC78810 = null;
                            int i28 = -878076599;
                            int i29 = C1017.f81942;
                            int i30 = C1012.f81938;
                            int iM55689 = (i29 - C0873.m55680("۫ۛ")) * 11;
                            int i31 = ((iM55689 ^ i30) * (-25369)) ^ 1955113862;
                            int i32 = -1007666944;
                            while (true) {
                                i28 = ((((i28 ^ i30) * 28107) >> 31) & i31) ^ (iM55689 ^ i32);
                                switch (i28) {
                                    case -2040606315:
                                    case -1294575568:
                                        if (C1024.f81946) {
                                            iM55689 = (C0946.m55979("ܿܿ") + i29) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i31 = ((iM55689 ^ i30) * 20477) ^ (-999308326);
                                            i32 = 1321641536;
                                        } else {
                                            iM55689 = C0873.m55680("ۖ᩶") ^ i29;
                                            i31 = ((iM55689 ^ i30) * 24009) ^ (-793251944);
                                            i32 = -71486277;
                                        }
                                        break;
                                    case -1984045819:
                                    case 1857140481:
                                        viewOnClickListenerC78810 = this.f16901;
                                        if (C0890.m55740()) {
                                            iM55689 = (C0873.m55680("᩺۫") + i30) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i31 = ((iM55689 ^ i29) * (-8005)) ^ 540936370;
                                            i32 = -1390802395;
                                        } else {
                                            iM55689 = (C0946.m55979("ۢᩴ") ^ i29) * (-107);
                                            i31 = ((iM55689 ^ i30) * 15717) ^ (-31089639);
                                            i32 = 1018944250;
                                        }
                                        break;
                                    case -1913558609:
                                    case 1484275083:
                                        if (C0917.f81868) {
                                            iM55689 = (C0946.m55979("ܿܿ") + i29) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i31 = ((iM55689 ^ i30) * 20477) ^ (-999308326);
                                            i32 = 1321641536;
                                        } else {
                                            iM55689 = C0873.m55680("ۢ֫") ^ i30;
                                            i31 = ((iM55689 ^ i29) * (-7903)) ^ (-1026118290);
                                            i32 = 130209809;
                                        }
                                        break;
                                    case -1900365738:
                                    case 1065153550:
                                        if (C0866.f81837 >= 0) {
                                            iM55689 = (C0873.m55680("᩺ᩴ") ^ i30) * (-97);
                                            i31 = ((iM55689 ^ i29) * 19601) ^ (-1437569265);
                                            i32 = -1265678400;
                                        } else {
                                            iM55689 = (C0873.m55680("᩷ۡ") ^ i30) * 49;
                                            i31 = ((iM55689 ^ i29) * (-5555)) ^ (-1802927870);
                                            i32 = 663986926;
                                        }
                                        break;
                                    case -1897213908:
                                    case -580579386:
                                        if (C0892.f81851) {
                                            iM55689 = (C0873.m55680("֨᩹") + i29) * 47;
                                            i31 = ((iM55689 ^ i30) * 19975) ^ 1836206529;
                                            i32 = 1193758156;
                                        } else {
                                            iM55689 = (C0946.m55979("ܿܿ") + i29) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i31 = ((iM55689 ^ i30) * 20477) ^ (-999308326);
                                            i32 = 1321641536;
                                        }
                                        break;
                                    case -1520063356:
                                    case 837778156:
                                        C1964.m56597();
                                        iM55689 = C0873.m55680("ۖ۟") ^ i29;
                                        i31 = ((iM55689 ^ i30) * 21895) ^ 1451433320;
                                        i32 = 1858074277;
                                        break;
                                    case -1386064401:
                                    case 1114873836:
                                        return ViewOnClickListenerC7889.m18230(viewOnClickListenerC78810, (C24021) obj);
                                    case -1090117594:
                                    case 1577730403:
                                        C1024.m56209();
                                        C0947.m55997();
                                        return null;
                                    case -1055244866:
                                    case 480460386:
                                        if (C0930.f81879 <= 0) {
                                            iM55689 = (C0873.m55680("᩺ᩴ") ^ i30) * (-97);
                                            i31 = ((iM55689 ^ i29) * 19601) ^ (-1437569265);
                                            i32 = -1265678400;
                                        } else {
                                            iM55689 = (i29 - C0873.m55680("ۜ۟")) * (-115);
                                            i31 = ((iM55689 ^ i30) * (-21513)) ^ (-504243055);
                                            i32 = 1202945844;
                                        }
                                        break;
                                    case -969342151:
                                    case -710629901:
                                        if (C0930.f81879 <= 0) {
                                            iM55689 = C0873.m55680("ۖ۟") ^ i29;
                                            i31 = ((iM55689 ^ i30) * 21895) ^ 1451433320;
                                            i32 = 1858074277;
                                        } else {
                                            iM55689 = C0873.m55680("ۡۡ") ^ i29;
                                            i31 = ((iM55689 ^ i30) * 29157) ^ 1320803854;
                                            i32 = -1089968277;
                                        }
                                        break;
                                    case -765252539:
                                    case -691133714:
                                        if (!C0937.f81884) {
                                            iM55689 = C0873.m55680("ۖ۟") ^ i29;
                                            i31 = ((iM55689 ^ i30) * 21895) ^ 1451433320;
                                            i32 = 1858074277;
                                        } else {
                                            iM55689 = (C0946.m55979("ܿܿ") + i29) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i31 = ((iM55689 ^ i30) * 20477) ^ (-999308326);
                                            i32 = 1321641536;
                                        }
                                        break;
                                    case -503894135:
                                    case 1181225006:
                                        if (C0992.f81922 >= 0) {
                                            iM55689 = (C0946.m55979("ۢᩴ") ^ i29) * (-107);
                                            i31 = ((iM55689 ^ i30) * 15717) ^ (-31089639);
                                            i32 = 1018944250;
                                        } else {
                                            iM55689 = (C0946.m55979("ۤܽ") + i29) * 67;
                                            i31 = ((iM55689 ^ i30) * (-25929)) ^ 1124847599;
                                            i32 = -590024665;
                                        }
                                        break;
                                    case -499009802:
                                    case 1118468263:
                                        if (C0955.f81898) {
                                            iM55689 = C0873.m55680("ۖ۟") ^ i29;
                                            i31 = ((iM55689 ^ i30) * 21895) ^ 1451433320;
                                            i32 = 1858074277;
                                        } else {
                                            iM55689 = (C0873.m55680("۫ۢ") ^ i30) * (-111);
                                            i31 = ((iM55689 ^ i29) * (-17633)) ^ 486672220;
                                            i32 = -1645313690;
                                        }
                                        break;
                                    case -76027030:
                                    case 1847771546:
                                        if (C1929.f83011 == 0) {
                                            iM55689 = C0873.m55680("ܽ᩶") ^ i30;
                                            i31 = ((iM55689 ^ i29) * 9049) ^ 732635499;
                                            i32 = -2063869155;
                                        } else {
                                            iM55689 = C0873.m55680("ۖ۟") ^ i29;
                                            i31 = ((iM55689 ^ i30) * 21895) ^ 1451433320;
                                            i32 = 1858074277;
                                        }
                                        break;
                                    case 873191947:
                                    case 1811285378:
                                        C1025.m56230();
                                        if (!C0892.f81851) {
                                            iM55689 = C0873.m55680("ܽ᩶") ^ i30;
                                            i31 = ((iM55689 ^ i29) * 9049) ^ 732635499;
                                            i32 = -2063869155;
                                        } else {
                                            iM55689 = (C0873.m55680("᩺ᩴ") ^ i30) * (-97);
                                            i31 = ((iM55689 ^ i29) * 19601) ^ (-1437569265);
                                            i32 = -1265678400;
                                        }
                                        break;
                                    default:
                                        if (C1028.f81950 <= 0) {
                                            iM55689 = (C0946.m55979("ܿܿ") + i29) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i31 = ((iM55689 ^ i30) * 20477) ^ (-999308326);
                                            i32 = 1321641536;
                                        } else {
                                            iM55689 = (C0946.m55979("֡᩷") + i30) * 11;
                                            i31 = ((iM55689 ^ i29) * 3775) ^ (-1154027183);
                                            i32 = -2059209235;
                                        }
                                        break;
                                }
                            }
                        }
                    }));
                    C0955.m56030(C9269.f25166, dialogInterfaceC2564, new C13254(new InterfaceC17797() { // from class: l.ۗۘۡ
                        @Override // p067l.InterfaceC17797
                        public final Object invoke(Object obj) {
                            ViewOnClickListenerC7889 viewOnClickListenerC78810 = null;
                            int i28 = -100451201;
                            int i29 = C0930.f81879;
                            int i30 = C1053.f81965;
                            int iM559712 = (i30 - C0946.m55979("᩷᩹")) * (-125);
                            int i31 = ((iM559712 ^ i29) * (-11827)) ^ 778912395;
                            int i32 = -1451839973;
                            while (true) {
                                i28 = ((((i28 ^ i29) * 29815) >> 31) & i31) ^ (iM559712 ^ i32);
                                switch (i28) {
                                    case -2140473320:
                                    case -243895674:
                                        if (C0877.f81843 >= 0) {
                                            iM559712 = (i29 - C0946.m55979("֫ۢ")) * (-109);
                                            i31 = ((iM559712 ^ i30) * 23255) ^ 931950654;
                                            i32 = -1813456519;
                                        } else {
                                            iM559712 = C0873.m55680("ܽۚ") ^ i29;
                                            i31 = ((iM559712 ^ i30) * (-28119)) ^ 1237259471;
                                            i32 = 694982405;
                                        }
                                        break;
                                    case -1975266828:
                                    case -1045503399:
                                        C0890.m55740();
                                        return null;
                                    case -1974663786:
                                    case -638859831:
                                        if (C1929.f83011 != 0) {
                                            iM559712 = (C0873.m55680("ۚۧ") ^ i30) * (-99);
                                            i31 = ((iM559712 ^ i29) * (-20239)) ^ (-999450638);
                                            i32 = -799290924;
                                        } else {
                                            iM559712 = C0946.m55979("ܿ᩹") ^ i29;
                                            i31 = ((iM559712 ^ i30) * (-3619)) ^ 162951490;
                                            i32 = -478934221;
                                        }
                                        break;
                                    case -1807792214:
                                    case 1370392741:
                                        RunnableC0871.m55672();
                                        if (C1046.f81962 <= 0) {
                                            iM559712 = (C0946.m55979("᩸ۜ") + i30) * (-125);
                                            i31 = ((iM559712 ^ i29) * 31105) ^ (-186491309);
                                            i32 = -926185116;
                                        } else {
                                            iM559712 = (i29 - C0946.m55979("֫ۢ")) * (-109);
                                            i31 = ((iM559712 ^ i30) * 23255) ^ 931950654;
                                            i32 = -1813456519;
                                        }
                                        break;
                                    case -1516212544:
                                    case -975945279:
                                        RunnableC0897.m55784();
                                        iM559712 = (i29 - C0946.m55979("֫ۢ")) * (-109);
                                        i31 = ((iM559712 ^ i30) * 23255) ^ 931950654;
                                        i32 = -1813456519;
                                        break;
                                    case -1512291811:
                                    case -561472215:
                                        if (C1929.f83011 != 0) {
                                            iM559712 = (i29 - C0946.m55979("֫ۢ")) * (-109);
                                            i31 = ((iM559712 ^ i30) * 23255) ^ 931950654;
                                            i32 = -1813456519;
                                        } else {
                                            iM559712 = (C0873.m55680("۟ۢ") ^ i30) * (-47);
                                            i31 = ((iM559712 ^ i29) * (-16121)) ^ 854841343;
                                            i32 = 1324599681;
                                        }
                                        break;
                                    case -1221843839:
                                    case 1953301986:
                                        return ViewOnClickListenerC7889.m18235(viewOnClickListenerC78810, (C24021) obj);
                                    case -1212578009:
                                    case 1516155025:
                                        viewOnClickListenerC78810 = this.f12231;
                                        if (RunnableC0871.f81839 >= 0) {
                                            iM559712 = C0873.m55680("֫֡") ^ i29;
                                            i31 = ((iM559712 ^ i30) * (-19077)) ^ (-1898352280);
                                            i32 = -453502393;
                                        } else {
                                            iM559712 = (i30 - C0946.m55979("ܶۢ")) * (-57);
                                            i31 = ((iM559712 ^ i29) * (-28865)) ^ (-1968349747);
                                            i32 = -528351067;
                                        }
                                        break;
                                    case -1034446942:
                                    case 2056130458:
                                        if (RunnableC0897.m55784()) {
                                            iM559712 = (C0873.m55680("ۚۧ") ^ i30) * (-99);
                                            i31 = ((iM559712 ^ i29) * (-20239)) ^ (-999450638);
                                            i32 = -799290924;
                                        } else {
                                            iM559712 = (C0946.m55979("ۢܶ") + i29) * 123;
                                            i31 = ((iM559712 ^ i30) * (-22201)) ^ (-1453456302);
                                            i32 = 1767199625;
                                        }
                                        break;
                                    case -901394713:
                                    case -237942825:
                                        C0955.m56025();
                                        if (C1194.f82045 != 0) {
                                            iM559712 = (C0873.m55680("ۚۧ") ^ i30) * (-99);
                                            i31 = ((iM559712 ^ i29) * (-20239)) ^ (-999450638);
                                            i32 = -799290924;
                                        } else {
                                            iM559712 = (i29 - C0946.m55979("֫ۢ")) * (-109);
                                            i31 = ((iM559712 ^ i30) * 23255) ^ 931950654;
                                            i32 = -1813456519;
                                        }
                                        break;
                                    case -375132449:
                                    case 473784263:
                                        if (C1929.f83011 != 0) {
                                            iM559712 = (i29 - C0873.m55680("ܿ᩻")) * (-121);
                                            i31 = ((iM559712 ^ i30) * (-2233)) ^ (-815598691);
                                            i32 = 2093753692;
                                        } else {
                                            iM559712 = C0873.m55680("ۗۤ") ^ i30;
                                            i31 = ((iM559712 ^ i29) * (-3147)) ^ (-65843823);
                                            i32 = -1271526435;
                                        }
                                        break;
                                    case -99149602:
                                    case 740074810:
                                        if (C0927.f81875) {
                                            iM559712 = (i29 - C0873.m55680("ܿ᩻")) * (-121);
                                            i31 = ((iM559712 ^ i30) * (-2233)) ^ (-815598691);
                                            i32 = 2093753692;
                                        } else {
                                            iM559712 = (C0873.m55680("۟ܿ") + i29) * (-105);
                                            i31 = ((iM559712 ^ i30) * 19705) ^ 195141677;
                                            i32 = -27978389;
                                        }
                                        break;
                                    case 131142094:
                                    case 452961370:
                                        if (C0866.f81837 >= 0) {
                                            iM559712 = (i29 - C0946.m55979("֫ۢ")) * (-109);
                                            i31 = ((iM559712 ^ i30) * 23255) ^ 931950654;
                                            i32 = -1813456519;
                                        } else {
                                            iM559712 = C0946.m55979("ܰۢ") ^ i29;
                                            i31 = ((iM559712 ^ i30) * 8847) ^ 285147362;
                                            i32 = -1727790237;
                                        }
                                        break;
                                    case 274041637:
                                    case 1871304000:
                                        if (C1404.f82149 < 0) {
                                            iM559712 = (i29 - C0873.m55680("ܿ᩻")) * (-121);
                                            i31 = ((iM559712 ^ i30) * (-2233)) ^ (-815598691);
                                            i32 = 2093753692;
                                        } else {
                                            iM559712 = (i29 - C0946.m55979("֫ۢ")) * (-109);
                                            i31 = ((iM559712 ^ i30) * 23255) ^ 931950654;
                                            i32 = -1813456519;
                                        }
                                        break;
                                    case 766340785:
                                    case 829967358:
                                        if (C0898.f81858 <= 0) {
                                            iM559712 = (C0946.m55979("᩸ۜ") + i30) * (-125);
                                            i31 = ((iM559712 ^ i29) * 31105) ^ (-186491309);
                                            i32 = -926185116;
                                        } else {
                                            iM559712 = (C0946.m55979("᩺ۨ") + i30) * 21;
                                            i31 = ((iM559712 ^ i29) * 17731) ^ (-2088862896);
                                            i32 = -1987784148;
                                        }
                                        break;
                                    default:
                                        if (C1229.m56410() != 0) {
                                            iM559712 = (i29 - C0873.m55680("ܿ᩻")) * (-121);
                                            i31 = ((iM559712 ^ i30) * (-2233)) ^ (-815598691);
                                            i32 = 2093753692;
                                        } else {
                                            iM559712 = (C0873.m55680("᩶۠") ^ i30) * (-69);
                                            i31 = ((iM559712 ^ i29) * (-9317)) ^ 1950688948;
                                            i32 = 1203529579;
                                        }
                                        break;
                                }
                            }
                        }
                    }));
                    C7350 c7351 = C9269.f25165;
                    InterfaceC17797 interfaceC17798 = new InterfaceC17797() { // from class: l.۬ۘۡ
                        @Override // p067l.InterfaceC17797
                        public final Object invoke(Object obj) {
                            ViewOnClickListenerC7889 viewOnClickListenerC78810 = null;
                            int i28 = 976288224;
                            int i29 = RunnableC0871.f81839;
                            int i30 = C0906.f81862;
                            int iM55689 = C0873.m55680("᩵֫") ^ i30;
                            int i31 = ((iM55689 ^ i29) * (-25175)) ^ (-1021855692);
                            int i32 = 36400691;
                            while (true) {
                                i28 = ((((i28 ^ i29) * (-27721)) >> 31) & i31) ^ (iM55689 ^ i32);
                                switch (i28) {
                                    case -1948420635:
                                    case -113784431:
                                        if (C1048.f81963) {
                                            iM55689 = C0873.m55680("ܶ۟") ^ i30;
                                            i31 = ((iM55689 ^ i29) * (-20059)) ^ 1556722758;
                                            i32 = -1130089788;
                                        } else {
                                            iM55689 = C0946.m55979("ۘᩳ") ^ i30;
                                            i31 = ((iM55689 ^ i29) * 1807) ^ 942108226;
                                            i32 = -1107414935;
                                        }
                                        break;
                                    case -1638949506:
                                    case -519229810:
                                        if (C0898.f81858 <= 0) {
                                            iM55689 = C0946.m55979("ۘᩳ") ^ i30;
                                            i31 = ((iM55689 ^ i29) * 1807) ^ 942108226;
                                            i32 = -1107414935;
                                        } else {
                                            iM55689 = (C0946.m55979("ܽۢ") + i29) * (-73);
                                            i31 = ((iM55689 ^ i30) * (-2713)) ^ (-72693922);
                                            i32 = 516705042;
                                        }
                                        break;
                                    case -1446287780:
                                    case 1380874628:
                                        viewOnClickListenerC78810 = this.f41677;
                                        if (C1964.f83032 <= 0) {
                                            iM55689 = C0946.m55979("ۘᩳ") ^ i30;
                                            i31 = ((iM55689 ^ i29) * 1807) ^ 942108226;
                                            i32 = -1107414935;
                                        } else {
                                            iM55689 = C0946.m55979("۟ۧ") ^ i30;
                                            i31 = ((iM55689 ^ i29) * (-21957)) ^ 1182325633;
                                            i32 = 1457400518;
                                        }
                                        break;
                                    case -1390353970:
                                    case 662514136:
                                        if (C0947.m55997()) {
                                            iM55689 = C0946.m55979("ۘᩳ") ^ i30;
                                            i31 = ((iM55689 ^ i29) * 1807) ^ 942108226;
                                            i32 = -1107414935;
                                        } else {
                                            iM55689 = C0873.m55680("ᩳܽ") ^ i29;
                                            i31 = ((iM55689 ^ i30) * 17191) ^ 1045413622;
                                            i32 = 304460128;
                                        }
                                        break;
                                    case -1218014422:
                                    case -298711365:
                                        RunnableC1014.m56177();
                                        C0866.m55645();
                                        iM55689 = (C0873.m55680("ۡۙ") + i30) * 13;
                                        i31 = ((iM55689 ^ i29) * (-2031)) ^ (-115303854);
                                        i32 = -1861631677;
                                        break;
                                    case -1107310576:
                                    case -1016606131:
                                        if (C1124.f82007 >= 0) {
                                            iM55689 = C0946.m55979("ۘᩳ") ^ i30;
                                            i31 = ((iM55689 ^ i29) * 1807) ^ 942108226;
                                            i32 = -1107414935;
                                        } else {
                                            iM55689 = C0873.m55680("᩶ᩴ") ^ i30;
                                            i31 = ((iM55689 ^ i29) * 27139) ^ 2022484574;
                                            i32 = 1309070875;
                                        }
                                        break;
                                    case -1032954868:
                                    case -146606291:
                                        if (C1028.f81950 <= 0) {
                                            iM55689 = C0946.m55979("ۢۜ") ^ i29;
                                            i31 = ((iM55689 ^ i30) * (-17821)) ^ (-1859856845);
                                            i32 = -1290528378;
                                        } else {
                                            iM55689 = (i29 - C0873.m55680("ۢ֡")) * (-31);
                                            i31 = ((iM55689 ^ i30) * 9933) ^ (-677426745);
                                            i32 = -211949332;
                                        }
                                        break;
                                    case -996049024:
                                    case 1601227829:
                                        if (C1044.f81959 >= 0) {
                                            iM55689 = (C0873.m55680("ۡۙ") + i30) * 13;
                                            i31 = ((iM55689 ^ i29) * (-2031)) ^ (-115303854);
                                            i32 = -1861631677;
                                        } else {
                                            iM55689 = (C0946.m55979("᩷ᩳ") ^ i29) * (-23);
                                            i31 = ((iM55689 ^ i30) * (-13753)) ^ 1445999069;
                                            i32 = -1755855173;
                                        }
                                        break;
                                    case -811773817:
                                    case 1582931228:
                                        if (C1404.f82149 >= 0) {
                                            iM55689 = C0946.m55979("ۢۜ") ^ i29;
                                            i31 = ((iM55689 ^ i30) * (-17821)) ^ (-1859856845);
                                            i32 = -1290528378;
                                        } else {
                                            iM55689 = (i30 - C0873.m55680("۟᩷")) * (-123);
                                            i31 = ((iM55689 ^ i29) * (-18635)) ^ 976464677;
                                            i32 = 602077311;
                                        }
                                        break;
                                    case -103397627:
                                    case 1767696992:
                                        return ViewOnClickListenerC7889.m18232(viewOnClickListenerC78810, (C24021) obj);
                                    case -38912417:
                                    case 1676252400:
                                        if (RunnableC1014.f81941 > 0) {
                                            iM55689 = (C0946.m55979("ܶ۬") ^ i29) * (-81);
                                            i31 = ((iM55689 ^ i30) * (-29847)) ^ (-2060181683);
                                            i32 = -253083267;
                                        } else {
                                            iM55689 = (C0873.m55680("ۡۙ") + i30) * 13;
                                            i31 = ((iM55689 ^ i29) * (-2031)) ^ (-115303854);
                                            i32 = -1861631677;
                                        }
                                        break;
                                    case 137260926:
                                    case 1251173809:
                                        if (RunnableC1014.f81941 <= 0) {
                                            iM55689 = C0873.m55680("ᩴܺ") ^ i30;
                                            i31 = ((iM55689 ^ i29) * (-6529)) ^ 1273401489;
                                            i32 = 1386591026;
                                        } else {
                                            iM55689 = C0873.m55680("۫᩻") ^ i30;
                                            i31 = ((iM55689 ^ i29) * 12011) ^ 136494685;
                                            i32 = 1481290230;
                                        }
                                        break;
                                    case 330064518:
                                    case 2023986689:
                                        if (C0937.f81884) {
                                            iM55689 = C0873.m55680("ۚۚ") ^ i29;
                                            i31 = ((iM55689 ^ i30) * 16507) ^ (-629388873);
                                            i32 = -945636877;
                                        } else {
                                            iM55689 = C0946.m55979("ۘᩳ") ^ i30;
                                            i31 = ((iM55689 ^ i29) * 1807) ^ 942108226;
                                            i32 = -1107414935;
                                        }
                                        break;
                                    case 512432218:
                                    case 720321043:
                                        C0892.m55749();
                                        if (!C0927.f81875) {
                                            iM55689 = C0873.m55680("ᩴܺ") ^ i30;
                                            i31 = ((iM55689 ^ i29) * (-6529)) ^ 1273401489;
                                            i32 = 1386591026;
                                        } else {
                                            iM55689 = (C0873.m55680("ۡۙ") + i30) * 13;
                                            i31 = ((iM55689 ^ i29) * (-2031)) ^ (-115303854);
                                            i32 = -1861631677;
                                        }
                                        break;
                                    case 1832864062:
                                    case 1920314404:
                                        C1053.m56327();
                                        return null;
                                    default:
                                        if (!RunnableC0897.m55784()) {
                                            iM55689 = (C0946.m55979("ܶ۬") ^ i29) * (-81);
                                            i31 = ((iM55689 ^ i30) * (-29847)) ^ (-2060181683);
                                            i32 = -253083267;
                                        } else {
                                            iM55689 = C0946.m55979("ۢۜ") ^ i29;
                                            i31 = ((iM55689 ^ i30) * (-17821)) ^ (-1859856845);
                                            i32 = -1290528378;
                                        }
                                        break;
                                }
                            }
                        }
                    };
                    if (C1404.f82149 < 0) {
                        C0955.m56030(c7351, dialogInterfaceC2564, new C13254(interfaceC17798));
                        RunnableC0897.m55782(C9269.f25167, dialogInterfaceC2564, new C13254(new InterfaceC17797() { // from class: l.۫ۘۡ
                            @Override // p067l.InterfaceC17797
                            public final Object invoke(Object obj) {
                                int i28 = 647626006;
                                int i29 = C1124.f82007;
                                int i30 = AbstractC0942.f81890;
                                int iM55689 = (C0873.m55680("ۤ֡") + i30) * (-55);
                                int i31 = ((iM55689 ^ i29) * 31227) ^ 2116427427;
                                int i32 = 944259080;
                                while (true) {
                                    i28 = ((((i28 ^ i29) * 32361) >> 31) & i31) ^ (iM55689 ^ i32);
                                    switch (i28) {
                                        case -2142989418:
                                        case -659029531:
                                            if (C1048.m56305() >= 0) {
                                                iM55689 = (C0873.m55680("ܳ᩸") ^ i30) * (-47);
                                                i31 = ((iM55689 ^ i29) * 29183) ^ 159275358;
                                                i32 = -2041976585;
                                            } else {
                                                iM55689 = (C0873.m55680("ܰܰ") + i29) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                                i31 = ((iM55689 ^ i30) * 16471) ^ (-604738810);
                                                i32 = -512488319;
                                            }
                                            break;
                                        case -1967622436:
                                        case -1433496274:
                                            if (C0949.m56012()) {
                                                iM55689 = (C0873.m55680("ܳ᩸") ^ i30) * (-47);
                                                i31 = ((iM55689 ^ i29) * 29183) ^ 159275358;
                                                i32 = -2041976585;
                                            } else {
                                                iM55689 = C0946.m55979("ۨ֡") ^ i29;
                                                i31 = ((iM55689 ^ i30) * 23963) ^ 1202790842;
                                                i32 = -684664183;
                                            }
                                            break;
                                        case -1862424591:
                                        case 361585664:
                                            if (C0863.f81833 <= 0) {
                                                iM55689 = (C0946.m55979("᩵۟") ^ i30) * (-59);
                                                i31 = ((iM55689 ^ i29) * (-17221)) ^ 315552284;
                                                i32 = -704931664;
                                            } else {
                                                iM55689 = (C0946.m55979("ۚᩴ") + i29) * (-55);
                                                i31 = ((iM55689 ^ i30) * (-24661)) ^ (-1837874603);
                                                i32 = 1732430564;
                                            }
                                            break;
                                        case -1623791976:
                                        case -324386738:
                                            return ViewOnClickListenerC7889.m18229(this.f39284);
                                        case -1622908279:
                                        case -654511298:
                                            if (C0863.f81833 <= 0) {
                                                iM55689 = (C0873.m55680("ܳ᩸") ^ i30) * (-47);
                                                i31 = ((iM55689 ^ i29) * 29183) ^ 159275358;
                                                i32 = -2041976585;
                                            } else {
                                                iM55689 = C0946.m55979("ܰۙ") ^ i29;
                                                i31 = ((iM55689 ^ i30) * (-15587)) ^ (-1249050113);
                                                i32 = 27100592;
                                            }
                                            break;
                                        case -1426536138:
                                        case 1874228893:
                                            C0845.m55584();
                                            iM55689 = (i30 - C0946.m55979("ۢۤ")) * (-73);
                                            i31 = ((iM55689 ^ i29) * (-22023)) ^ (-1976236893);
                                            i32 = -109624122;
                                            break;
                                        case -1326668111:
                                        case 1289114418:
                                            ServiceConnectionC1013.m56157();
                                            C0947.m55997();
                                            return null;
                                        case -1240000990:
                                        case 973545831:
                                            if (C0930.f81879 <= 0) {
                                                iM55689 = (i30 - C0946.m55979("ۢۤ")) * (-73);
                                                i31 = ((iM55689 ^ i29) * (-22023)) ^ (-1976236893);
                                                i32 = -109624122;
                                            } else {
                                                iM55689 = (C0873.m55680("᩺᩶") + i30) * 83;
                                                i31 = ((iM55689 ^ i29) * 9487) ^ (-288215075);
                                                i32 = 1285656037;
                                            }
                                            break;
                                        case -1103175549:
                                        case -498925271:
                                            if (C0898.f81858 <= 0) {
                                                iM55689 = (i29 - C0873.m55680("ۜܽ")) * 19;
                                                i31 = ((iM55689 ^ i30) * (-6289)) ^ 1022209393;
                                                i32 = 1488421812;
                                            } else {
                                                iM55689 = (C0946.m55979("֫֨") + i30) * 39;
                                                i31 = ((iM55689 ^ i29) * (-17629)) ^ (-1763546660);
                                                i32 = 1150457271;
                                            }
                                            break;
                                        case -1011837066:
                                        case -985546200:
                                            if (C0992.f81922 < 0) {
                                                iM55689 = (C0946.m55979("ۚᩴ") + i29) * (-55);
                                                i31 = ((iM55689 ^ i30) * (-24661)) ^ (-1837874603);
                                                i32 = 1732430564;
                                            } else {
                                                iM55689 = (i30 - C0946.m55979("ۢۤ")) * (-73);
                                                i31 = ((iM55689 ^ i29) * (-22023)) ^ (-1976236893);
                                                i32 = -109624122;
                                            }
                                            break;
                                        case -977155976:
                                        case -297026957:
                                            if (C0898.f81858 <= 0) {
                                                iM55689 = (C0946.m55979("᩵۟") ^ i30) * (-59);
                                                i31 = ((iM55689 ^ i29) * (-17221)) ^ 315552284;
                                                i32 = -704931664;
                                            } else {
                                                iM55689 = (C0946.m55979("᩸᩻") ^ i30) * 63;
                                                i31 = ((iM55689 ^ i29) * (-26769)) ^ (-440685238);
                                                i32 = -746402794;
                                            }
                                            break;
                                        case -753337123:
                                        case 540565663:
                                            if (C1044.f81959 < 0) {
                                                iM55689 = (i29 - C0873.m55680("ۜܽ")) * 19;
                                                i31 = ((iM55689 ^ i30) * (-6289)) ^ 1022209393;
                                                i32 = 1488421812;
                                            } else {
                                                iM55689 = (C0946.m55979("ۚᩴ") + i29) * (-55);
                                                i31 = ((iM55689 ^ i30) * (-24661)) ^ (-1837874603);
                                                i32 = 1732430564;
                                            }
                                            break;
                                        case -269111838:
                                        case 1807895126:
                                            if (C0967.f81910 >= 0) {
                                                iM55689 = (i29 - C0873.m55680("ۜܽ")) * 19;
                                                i31 = ((iM55689 ^ i30) * (-6289)) ^ 1022209393;
                                                i32 = 1488421812;
                                            } else {
                                                iM55689 = (i29 - C0873.m55680("ܶۜ")) * (-71);
                                                i31 = ((iM55689 ^ i30) * 31929) ^ 1598425712;
                                                i32 = -1949626710;
                                            }
                                            break;
                                        case 534924646:
                                        case 1499746504:
                                            if (RunnableC1014.f81941 <= 0) {
                                                iM55689 = (i29 - C0873.m55680("ۜܽ")) * 19;
                                                i31 = ((iM55689 ^ i30) * (-6289)) ^ 1022209393;
                                                i32 = 1488421812;
                                            } else {
                                                iM55689 = C0873.m55680("ܿ۫") ^ i30;
                                                i31 = ((iM55689 ^ i29) * (-25703)) ^ (-1757256916);
                                                i32 = 1030234713;
                                            }
                                            break;
                                        case 850120755:
                                        case 1459534344:
                                            if (C1028.f81950 <= 0) {
                                                iM55689 = (i30 - C0946.m55979("ۢۤ")) * (-73);
                                                i31 = ((iM55689 ^ i29) * (-22023)) ^ (-1976236893);
                                                i32 = -109624122;
                                            } else {
                                                iM55689 = C0873.m55680("ۛۤ") ^ i30;
                                                i31 = ((iM55689 ^ i29) * (-19207)) ^ (-87622046);
                                                i32 = -1906923564;
                                            }
                                            break;
                                        default:
                                            if (C0890.f81849 != 0) {
                                                iM55689 = (C0946.m55979("᩵۟") ^ i30) * (-59);
                                                i31 = ((iM55689 ^ i29) * (-17221)) ^ 315552284;
                                                i32 = -704931664;
                                            } else {
                                                iM55689 = C0946.m55979("ܶۢ") ^ i29;
                                                i31 = ((iM55689 ^ i30) * (-13311)) ^ (-483812429);
                                                i32 = 58489928;
                                            }
                                            break;
                                    }
                                }
                            }
                        }));
                        c7350 = C9269.f25168;
                        interfaceC17797 = new InterfaceC17797() { // from class: l.ۤۘۡ
                            @Override // p067l.InterfaceC17797
                            public final Object invoke(Object obj) {
                                int i28 = -97314601;
                                int i29 = C1964.f83032;
                                int i30 = C1044.f81959;
                                int iM55689 = C0873.m55680("ۚ۬") ^ i30;
                                int i31 = ((iM55689 ^ i29) * (-24655)) ^ 1826867053;
                                int i32 = -695149559;
                                while (true) {
                                    i28 = ((((i28 ^ i29) * 18211) >> 31) & i31) ^ (iM55689 ^ i32);
                                    switch (i28) {
                                        case -1907276267:
                                        case -522716161:
                                            C0947.m55997();
                                            if (C1044.m56286() <= 0) {
                                                iM55689 = C0873.m55680("᩸ۢ") ^ i29;
                                                i31 = ((iM55689 ^ i30) * 1557) ^ 1318027386;
                                                i32 = -1961345274;
                                            } else {
                                                iM55689 = (C0873.m55680("ۙ᩵") ^ i30) * 91;
                                                i31 = ((iM55689 ^ i29) * 29661) ^ 1783895689;
                                                i32 = 1786689789;
                                            }
                                            break;
                                        case -1893856627:
                                        case -585953941:
                                            if (C0861.f81831) {
                                                iM55689 = C0946.m55979("ۤ᩵") ^ i30;
                                                i31 = ((iM55689 ^ i29) * 32719) ^ (-115989523);
                                                i32 = -444198703;
                                            } else {
                                                iM55689 = (C0946.m55979("ܶ᩹") + i29) * 37;
                                                i31 = ((iM55689 ^ i30) * 4081) ^ 1257013703;
                                                i32 = -716804863;
                                            }
                                            break;
                                        case -1715325055:
                                        case 1930128204:
                                            if (C1003.m56123() != 0) {
                                                iM55689 = C0873.m55680("᩸ۢ") ^ i29;
                                                i31 = ((iM55689 ^ i30) * 1557) ^ 1318027386;
                                                i32 = -1961345274;
                                            } else {
                                                iM55689 = (C0873.m55680("᩵ۢ") ^ i29) * (-89);
                                                i31 = ((iM55689 ^ i30) * 24465) ^ (-1293038242);
                                                i32 = 1576735490;
                                            }
                                            break;
                                        case -1554262642:
                                        case 2127971914:
                                            if (C1124.f82007 >= 0) {
                                                iM55689 = (C0946.m55979("ܶ᩹") + i29) * 37;
                                                i31 = ((iM55689 ^ i30) * 4081) ^ 1257013703;
                                                i32 = -716804863;
                                            } else {
                                                iM55689 = (i29 - C0873.m55680("ᩳܺ")) * (-73);
                                                i31 = ((iM55689 ^ i30) * (-30423)) ^ 990005634;
                                                i32 = -1062439051;
                                            }
                                            break;
                                        case -1208282621:
                                        case 1843261720:
                                            if (C1964.f83032 <= 0) {
                                                iM55689 = C0946.m55979("ܽۨ") ^ i30;
                                                i31 = ((iM55689 ^ i29) * (-29169)) ^ (-1404925062);
                                                i32 = 101363846;
                                            } else {
                                                iM55689 = (C0946.m55979("ۗ᩷") ^ i29) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                                i31 = ((iM55689 ^ i30) * (-28149)) ^ 1029958927;
                                                i32 = 2067716716;
                                            }
                                            break;
                                        case -1091042673:
                                        case 51579472:
                                            if (C0894.f81854 >= 0) {
                                                iM55689 = (C0873.m55680("ۙ᩵") ^ i30) * 91;
                                                i31 = ((iM55689 ^ i29) * 29661) ^ 1783895689;
                                                i32 = 1786689789;
                                            } else {
                                                iM55689 = (C0946.m55979("ܶ᩹") + i29) * 37;
                                                i31 = ((iM55689 ^ i30) * 4081) ^ 1257013703;
                                                i32 = -716804863;
                                            }
                                            break;
                                        case -540571027:
                                        case -82849647:
                                            if (C1024.f81946) {
                                                iM55689 = (C0946.m55979("ܶ᩹") + i29) * 37;
                                                i31 = ((iM55689 ^ i30) * 4081) ^ 1257013703;
                                                i32 = -716804863;
                                            } else {
                                                iM55689 = (i30 - C0873.m55680("ۚۢ")) * (-33);
                                                i31 = ((iM55689 ^ i29) * (-23469)) ^ (-2016839345);
                                                i32 = -482279939;
                                            }
                                            break;
                                        case -200592726:
                                        case 758602613:
                                            C0892.m55749();
                                            C0912.m55833();
                                            return null;
                                        case 315453553:
                                        case 1944548395:
                                            C1012.m56134();
                                            if (ServiceConnectionC1013.f81940 < 0) {
                                                iM55689 = (C0946.m55979("ܶ᩹") + i29) * 37;
                                                i31 = ((iM55689 ^ i30) * 4081) ^ 1257013703;
                                                i32 = -716804863;
                                            } else {
                                                iM55689 = (C0946.m55979("ܶۜ") ^ i30) * 65;
                                                i31 = ((iM55689 ^ i29) * 29065) ^ 42534298;
                                                i32 = 1800590740;
                                            }
                                            break;
                                        case 360274551:
                                        case 1590367875:
                                            if (AbstractC0942.f81890 <= 0) {
                                                iM55689 = (C0946.m55979("ܶۜ") ^ i30) * 65;
                                                i31 = ((iM55689 ^ i29) * 29065) ^ 42534298;
                                                i32 = 1800590740;
                                            } else {
                                                iM55689 = C0946.m55979("ۙܳ") ^ i30;
                                                i31 = ((iM55689 ^ i29) * 5029) ^ 583658273;
                                                i32 = 721428268;
                                            }
                                            break;
                                        case 418474816:
                                        case 726683684:
                                            if (C0854.f81826 != 0) {
                                                iM55689 = (C0946.m55979("ܶۜ") ^ i30) * 65;
                                                i31 = ((iM55689 ^ i29) * 29065) ^ 42534298;
                                                i32 = 1800590740;
                                            } else {
                                                iM55689 = (i29 - C0873.m55680("ܺۧ")) * (-11);
                                                i31 = ((iM55689 ^ i30) * 9371) ^ 1400660492;
                                                i32 = -290158525;
                                            }
                                            break;
                                        case 436740095:
                                        case 693889362:
                                            if (RunnableC0897.f81856) {
                                                iM55689 = C0946.m55979("֫ܺ") ^ i29;
                                                i31 = ((iM55689 ^ i30) * 32455) ^ 2128902448;
                                                i32 = -366724511;
                                            } else {
                                                iM55689 = C0873.m55680("᩸ۢ") ^ i29;
                                                i31 = ((iM55689 ^ i30) * 1557) ^ 1318027386;
                                                i32 = -1961345274;
                                            }
                                            break;
                                        case 481446975:
                                        case 1335119742:
                                            ViewOnClickListenerC0939.m55941();
                                            C1012.m56134();
                                            iM55689 = (C0946.m55979("ܶۜ") ^ i30) * 65;
                                            i31 = ((iM55689 ^ i29) * 29065) ^ 42534298;
                                            i32 = 1800590740;
                                            break;
                                        case 1107044397:
                                        case 2137684755:
                                            if (C1046.f81962 <= 0) {
                                                iM55689 = (C0946.m55979("ܶ᩹") + i29) * 37;
                                                i31 = ((iM55689 ^ i30) * 4081) ^ 1257013703;
                                                i32 = -716804863;
                                            } else {
                                                iM55689 = C0946.m55979("۬᩸") ^ i30;
                                                i31 = ((iM55689 ^ i29) * (-16339)) ^ 748765446;
                                                i32 = -1839988949;
                                            }
                                            break;
                                        case 1669500945:
                                        case 2025060751:
                                            if (C1036.f81953 >= 0) {
                                                iM55689 = (C0946.m55979("ܶۜ") ^ i30) * 65;
                                                i31 = ((iM55689 ^ i29) * 29065) ^ 42534298;
                                                i32 = 1800590740;
                                            } else {
                                                iM55689 = C0946.m55979("ۧܿ") ^ i30;
                                                i31 = ((iM55689 ^ i29) * (-23105)) ^ 935787504;
                                                i32 = 295304033;
                                            }
                                            break;
                                        default:
                                            return ViewOnClickListenerC7889.m18234(this.f33155);
                                    }
                                }
                            }
                        };
                        if (!C1929.m56553()) {
                            iM55680 = C0873.m55680("ۧ᩵") ^ i12;
                            i22 = ((iM55680 ^ i11) * 6673) ^ (-365922351);
                            i = -821810576;
                            i23 = iM55680 ^ i;
                        } else {
                            textView = textView4;
                            iM55681 = (i12 - C0873.m55680("ܺ۠")) * 37;
                            i2 = ((iM55681 ^ i11) * (-23667)) ^ (-4272755);
                            i6 = 2073844481;
                            i3 = iM55681 ^ i6;
                            textView4 = textView;
                            i23 = i3;
                            i22 = i2;
                        }
                    } else {
                        sArr3 = sArr5;
                        i7 = i20;
                        textView3 = textView4;
                        i8 = i16;
                        sArr4 = sArr7;
                        iM55682 = (i11 - C0873.m55680("ۧܽ")) * (-127);
                        i9 = ((iM55682 ^ i12) * (-22261)) ^ 151158876;
                        i10 = 66388921;
                        int i28 = iM55682 ^ i10;
                        textView4 = textView3;
                        sArr7 = sArr4;
                        i23 = i28;
                        i20 = i7;
                        i16 = i8;
                        sArr5 = sArr3;
                        i22 = i9;
                        dialogInterfaceC2564 = dialogInterfaceC2564;
                    }
                    break;
                case -350756344:
                case 349978939:
                    View viewM56468 = C1404.m56465(view, iM55979 ^ i18);
                    C0947.m55996(viewM56468, viewOnClickListenerC7889);
                    C21272.m48052(viewM56468);
                    iM559710 = C0946.m55979(C1048.m56318(f82012, 45, 3, i15));
                    i19 = 2123494692;
                    iM55680 = (i11 - C0946.m55979("֡ۜ")) * 45;
                    i22 = ((iM55680 ^ i12) * 19095) ^ (-615850546);
                    i = -1299837413;
                    i23 = iM55680 ^ i;
                    break;
                case 49586346:
                case 331930655:
                    return;
                case 102285739:
                case 1347655307:
                    C1024.m56209();
                    throw new RuntimeException();
                case 117174490:
                case 2047902006:
                    C0955.m56030(c7350, dialogInterfaceC2564, new C13254(interfaceC17797));
                    iM55979 = C0946.m55979(C0877.m55707(f82012, 42, 3, i15));
                    i18 = 2121555108;
                    if (C1071.f81975 > 0) {
                        iM55680 = C0946.m55979("۬ܰ") ^ i11;
                        i22 = ((iM55680 ^ i12) * 26843) ^ 908407054;
                        i = -1143723308;
                        i23 = iM55680 ^ i;
                    } else {
                        sArr3 = sArr5;
                        i7 = i20;
                        textView3 = textView4;
                        i8 = i16;
                        sArr4 = sArr7;
                        iM55682 = (i11 - C0873.m55680("ۧܽ")) * (-127);
                        i9 = ((iM55682 ^ i12) * (-22261)) ^ 151158876;
                        i10 = 66388921;
                        int i29 = iM55682 ^ i10;
                        textView4 = textView3;
                        sArr7 = sArr4;
                        i23 = i29;
                        i20 = i7;
                        i16 = i8;
                        sArr5 = sArr3;
                        i22 = i9;
                        dialogInterfaceC2564 = dialogInterfaceC2564;
                    }
                    break;
                case 480160411:
                case 958679831:
                    View viewM55758 = C0892.m55755(view, C0873.m55680(C0845.m55592(f82012, 39, 3, i15)) ^ 2124112355);
                    C1048.m56315(viewM55758, strM55618);
                    if (ServiceConnectionC1013.m56157() > 0) {
                        int iM559712 = (i11 - C0946.m55979("᩵ᩴ")) * 59;
                        i2 = ((iM559712 ^ i12) * (-19197)) ^ (-92966619);
                        i3 = iM559712 ^ 2125515256;
                        view2 = viewM55758;
                        i23 = i3;
                        i22 = i2;
                    } else {
                        view2 = viewM55758;
                        iM55680 = C0946.m55979("۬ۙ") ^ i11;
                        i22 = ((iM55680 ^ i12) * (-18303)) ^ 1668671756;
                        i = -744838108;
                        i23 = iM55680 ^ i;
                    }
                    break;
                case 628250880:
                case 2089994082:
                    C1124.m56367();
                    if (C1025.f81947 < 0) {
                        i4 = i20;
                        textView2 = textView4;
                        sArr = sArr7;
                        short[] sArr9 = sArr5;
                        i5 = i16;
                        sArr2 = sArr9;
                        int iM55689 = C0873.m55680("᩵ۤ") ^ i12;
                        i22 = ((iM55689 ^ i11) * (-16685)) ^ 130617189;
                        textView4 = textView2;
                        i23 = iM55689 ^ 1692597683;
                        sArr7 = sArr;
                        i20 = i4;
                        int i210 = i5;
                        sArr5 = sArr2;
                        i16 = i210;
                    } else {
                        textView = textView4;
                        iM55681 = (i12 - C0873.m55680("ܺ۠")) * 37;
                        i2 = ((iM55681 ^ i11) * (-23667)) ^ (-4272755);
                        i6 = 2073844481;
                        i3 = iM55681 ^ i6;
                        textView4 = textView;
                        i23 = i3;
                        i22 = i2;
                    }
                    break;
                case 713152054:
                case 953262282:
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0946.m55979("۬ۙ") ^ i11;
                        i22 = ((iM55680 ^ i12) * (-18303)) ^ 1668671756;
                        i = -744838108;
                        i23 = iM55680 ^ i;
                    } else {
                        textView = textView4;
                        iM55681 = (i12 - C0873.m55680("ܺ۠")) * 37;
                        i2 = ((iM55681 ^ i11) * (-23667)) ^ (-4272755);
                        i6 = 2073844481;
                        i3 = iM55681 ^ i6;
                        textView4 = textView;
                        i23 = i3;
                        i22 = i2;
                    }
                    break;
                case 996502645:
                case 1760801155:
                    View viewM55759 = C0892.m55755(view, iM55685 ^ 2120168929);
                    C1048.m56304(viewM55759, viewOnClickListenerC7889);
                    C21272.m48052(viewM55759);
                    viewM55755 = C0892.m55755(view, R.id.button1);
                    onClickListener = new View.OnClickListener() { // from class: l.ܶۘۡ
                        {
                            int i30 = -319404003;
                            int i31 = C0898.f81858;
                            int i32 = C1124.f82007;
                            int iM559713 = (i31 - C0946.m55979("ۘ۫")) * 75;
                            int i33 = ((iM559713 ^ i32) * (-13875)) ^ 2083785355;
                            int i34 = 228989084;
                            while (true) {
                                i30 = ((((i30 ^ i32) * (-271)) >> 31) & i33) ^ (iM559713 ^ i34);
                                switch (i30) {
                                    case -2144014967:
                                    case 1332492852:
                                        if (C1036.m56257() <= 0) {
                                            iM559713 = C0946.m55979("᩹ۖ") ^ i31;
                                            i33 = ((iM559713 ^ i32) * (-15991)) ^ (-745731068);
                                            i34 = 830976702;
                                        } else {
                                            iM559713 = C0946.m55979("ܺۛ") ^ i32;
                                            i33 = ((iM559713 ^ i31) * (-28985)) ^ 350444095;
                                            i34 = 1082811806;
                                        }
                                        break;
                                    case -1973488964:
                                    case 1778104931:
                                        if (C1003.f81929 <= 0) {
                                            iM559713 = C0946.m55979("᩹ۛ") ^ i31;
                                            i33 = ((iM559713 ^ i32) * 31981) ^ 1140161812;
                                            i34 = -1347406519;
                                        } else {
                                            iM559713 = (C0946.m55979("᩻ܿ") + i31) * 101;
                                            i33 = ((iM559713 ^ i32) * 11217) ^ (-1575809666);
                                            i34 = 103690635;
                                        }
                                        break;
                                    case -1934347320:
                                    case 1086292697:
                                        if (C1071.m56343() != 0) {
                                            iM559713 = C0946.m55979("᩹ۛ") ^ i31;
                                            i33 = ((iM559713 ^ i32) * 31981) ^ 1140161812;
                                            i34 = -1347406519;
                                        } else {
                                            iM559713 = (C0873.m55680("ܺ۠") ^ i31) * 89;
                                            i33 = ((iM559713 ^ i32) * (-4283)) ^ 1945506697;
                                            i34 = -1280248049;
                                        }
                                        break;
                                    case -1794191239:
                                    case 1080903658:
                                        if (C0992.f81922 >= 0) {
                                            iM559713 = C0946.m55979("᩵ܿ") ^ i32;
                                            i33 = ((iM559713 ^ i31) * (-28407)) ^ (-1306154841);
                                            i34 = -2053828650;
                                        } else {
                                            iM559713 = C0946.m55979("ܿ۬") ^ i32;
                                            i33 = ((iM559713 ^ i31) * (-13243)) ^ (-1436242485);
                                            i34 = -1383578365;
                                        }
                                        break;
                                    case -1506135339:
                                    case -1006966525:
                                        if (C1194.m56396() <= 0) {
                                            iM559713 = C0873.m55680("ܽۡ") ^ i31;
                                            i33 = ((iM559713 ^ i32) * 3993) ^ 91945154;
                                            i34 = 352248501;
                                        } else {
                                            iM559713 = (i31 - C0873.m55680("۠ܶ")) * (-39);
                                            i33 = ((iM559713 ^ i32) * 10343) ^ (-1025039333);
                                            i34 = -2114377037;
                                        }
                                        break;
                                    case -1489565437:
                                    case 359294670:
                                        if (C1028.m56247() >= 0) {
                                            iM559713 = (i32 - C0873.m55680("᩺ۜ")) * 49;
                                            i33 = ((iM559713 ^ i31) * (-19885)) ^ 384685212;
                                            i34 = 484828254;
                                        } else {
                                            iM559713 = C0946.m55979("᩵ܿ") ^ i32;
                                            i33 = ((iM559713 ^ i31) * (-28407)) ^ (-1306154841);
                                            i34 = -2053828650;
                                        }
                                        break;
                                    case -910430952:
                                    case 477758009:
                                        C1044.m56286();
                                        iM559713 = C0946.m55979("᩵ܿ") ^ i32;
                                        i33 = ((iM559713 ^ i31) * (-28407)) ^ (-1306154841);
                                        i34 = -2053828650;
                                        break;
                                    case -621457163:
                                    case 1166196721:
                                        if (C1404.f82149 >= 0) {
                                            iM559713 = C0946.m55979("᩹ۛ") ^ i31;
                                            i33 = ((iM559713 ^ i32) * 31981) ^ 1140161812;
                                            i34 = -1347406519;
                                        } else {
                                            iM559713 = (C0946.m55979("ۢۚ") ^ i32) * (-55);
                                            i33 = ((iM559713 ^ i31) * 24117) ^ 174267044;
                                            i34 = -2103036261;
                                        }
                                        break;
                                    case -589382144:
                                    case 1942487451:
                                        if (C0845.f81821 >= 0) {
                                            iM559713 = C0946.m55979("᩵ܿ") ^ i32;
                                            i33 = ((iM559713 ^ i31) * (-28407)) ^ (-1306154841);
                                            i34 = -2053828650;
                                        } else {
                                            iM559713 = C0873.m55680("۬ۨ") ^ i32;
                                            i33 = ((iM559713 ^ i31) * (-4779)) ^ (-24950321);
                                            i34 = -447424720;
                                        }
                                        break;
                                    case 94073554:
                                    case 1534328215:
                                        return;
                                    case 140716571:
                                    case 532879243:
                                        if (C1071.f81975 <= 0) {
                                            iM559713 = (i32 - C0873.m55680("᩺ۜ")) * 49;
                                            i33 = ((iM559713 ^ i31) * (-19885)) ^ 384685212;
                                            i34 = 484828254;
                                        } else {
                                            iM559713 = (C0946.m55979("ۢܽ") ^ i31) * (-59);
                                            i33 = ((iM559713 ^ i32) * (-24339)) ^ 1633193790;
                                            i34 = -1352974070;
                                        }
                                        break;
                                    case 318226073:
                                    case 905792273:
                                        if (C0898.f81858 <= 0) {
                                            iM559713 = C0946.m55979("᩵ܿ") ^ i32;
                                            i33 = ((iM559713 ^ i31) * (-28407)) ^ (-1306154841);
                                            i34 = -2053828650;
                                        } else {
                                            iM559713 = (C0873.m55680("ܰ᩹") + i32) * 35;
                                            i33 = ((iM559713 ^ i31) * 13981) ^ 2129691701;
                                            i34 = -291541655;
                                        }
                                        break;
                                    case 692811312:
                                    case 2047550203:
                                        C0892.m55749();
                                        if (ViewOnClickListenerC0939.f81888 <= 0) {
                                            iM559713 = C0946.m55979("᩹ۖ") ^ i31;
                                            i33 = ((iM559713 ^ i32) * (-15991)) ^ (-745731068);
                                            i34 = 830976702;
                                        } else {
                                            iM559713 = C0946.m55979("᩵ܿ") ^ i32;
                                            i33 = ((iM559713 ^ i31) * (-28407)) ^ (-1306154841);
                                            i34 = -2053828650;
                                        }
                                        break;
                                    case 956337675:
                                    case 2125354237:
                                        if (RunnableC1014.f81941 > 0) {
                                            iM559713 = C0873.m55680("ܽۡ") ^ i31;
                                            i33 = ((iM559713 ^ i32) * 3993) ^ 91945154;
                                            i34 = 352248501;
                                        } else {
                                            iM559713 = C0946.m55979("᩵ܿ") ^ i32;
                                            i33 = ((iM559713 ^ i31) * (-28407)) ^ (-1306154841);
                                            i34 = -2053828650;
                                        }
                                        break;
                                    case 1755387115:
                                    case 1814459857:
                                        C1003.m56123();
                                        throw new RuntimeException();
                                    default:
                                        if (C1036.f81953 >= 0) {
                                            iM559713 = C0946.m55979("᩵ܿ") ^ i32;
                                            i33 = ((iM559713 ^ i31) * (-28407)) ^ (-1306154841);
                                            i34 = -2053828650;
                                        } else {
                                            iM559713 = C0873.m55680("ۗ۫") ^ i31;
                                            i33 = ((iM559713 ^ i32) * (-15201)) ^ (-1375287578);
                                            i34 = 1223269078;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            Consumer consumer2 = null;
                            int i30 = -1513362215;
                            int i31 = C1404.f82149;
                            int i32 = C0906.f81862;
                            int iM559713 = (C0946.m55979("᩵ۛ") ^ i32) * (-45);
                            int i33 = ((iM559713 ^ i31) * 11639) ^ (-882479245);
                            int i34 = -92784687;
                            while (true) {
                                i30 = ((((i30 ^ i31) * 2375) >> 31) & i33) ^ (iM559713 ^ i34);
                                switch (i30) {
                                    case -1977195393:
                                    case 301873962:
                                        C0992.m56107();
                                        break;
                                    case -1945801487:
                                    case 1285315868:
                                        if (!C0892.f81851) {
                                            iM559713 = (i31 - C0873.m55680("ۘۗ")) * 101;
                                            i33 = ((iM559713 ^ i32) * 20717) ^ 1143529833;
                                            i34 = 141326759;
                                        } else {
                                            iM559713 = (C0873.m55680("ۢ۫") ^ i32) * 81;
                                            i33 = ((iM559713 ^ i31) * 27945) ^ (-81455242);
                                            i34 = 662963859;
                                        }
                                        break;
                                    case -1901930018:
                                    case -818376457:
                                        ViewOnClickListenerC7889.m18231(consumer2, viewOnClickListenerC7889);
                                        break;
                                    case -1740586131:
                                    case -1138266698:
                                        if (C1003.f81929 > 0) {
                                            iM559713 = (C0873.m55680("ۢ۫") ^ i32) * 81;
                                            i33 = ((iM559713 ^ i31) * 27945) ^ (-81455242);
                                            i34 = 662963859;
                                        } else {
                                            iM559713 = C0873.m55680("۫ۡ") ^ i31;
                                            i33 = ((iM559713 ^ i32) * (-14529)) ^ 833492394;
                                            i34 = 1577885205;
                                        }
                                        break;
                                    case -1464541791:
                                    case -385598586:
                                        consumer2 = consumer;
                                        if (C0873.m55678()) {
                                            iM559713 = (i32 - C0873.m55680("ۧ֡")) * (-45);
                                            i33 = ((iM559713 ^ i31) * 18767) ^ 536105372;
                                            i34 = 1256440060;
                                        } else {
                                            iM559713 = C0946.m55979("ۜ᩶") ^ i31;
                                            i33 = ((iM559713 ^ i32) * 29215) ^ 81085626;
                                            i34 = 454187217;
                                        }
                                        break;
                                    case -1065346874:
                                    case -453563064:
                                        if (RunnableC0897.f81856) {
                                            iM559713 = C0946.m55979("ۗۗ") ^ i32;
                                            i33 = ((iM559713 ^ i31) * (-2521)) ^ (-1294683137);
                                            i34 = 1104488014;
                                        } else {
                                            iM559713 = C0946.m55979("ۜ᩻") ^ i32;
                                            i33 = ((iM559713 ^ i31) * (-16463)) ^ (-1606407579);
                                            i34 = 588068293;
                                        }
                                        break;
                                    case -968166778:
                                    case -291288580:
                                        if (C1929.f83011 != 0) {
                                            iM559713 = (i31 - C0873.m55680("ۘۗ")) * 101;
                                            i33 = ((iM559713 ^ i32) * 20717) ^ 1143529833;
                                            i34 = 141326759;
                                        } else {
                                            iM559713 = C0873.m55680("ۖܽ") ^ i31;
                                            i33 = ((iM559713 ^ i32) * 13037) ^ 518198379;
                                            i34 = 139523521;
                                        }
                                        break;
                                    case -729805513:
                                    case 587946002:
                                        if (C0863.f81833 <= 0) {
                                            iM559713 = (C0873.m55680("ۢ۫") ^ i32) * 81;
                                            i33 = ((iM559713 ^ i31) * 27945) ^ (-81455242);
                                            i34 = 662963859;
                                        } else {
                                            iM559713 = C0873.m55680("᩺ܺ") ^ i32;
                                            i33 = ((iM559713 ^ i31) * 7237) ^ (-1107453354);
                                            i34 = -133372725;
                                        }
                                        break;
                                    case -595981862:
                                    case 1940198337:
                                        if (C0894.f81854 >= 0) {
                                            iM559713 = C0873.m55680("۫ۡ") ^ i31;
                                            i33 = ((iM559713 ^ i32) * (-14529)) ^ 833492394;
                                            i34 = 1577885205;
                                        } else {
                                            iM559713 = (C0873.m55680("ܶۙ") + i32) * (-29);
                                            i33 = ((iM559713 ^ i31) * 29695) ^ 117607922;
                                            i34 = -820267537;
                                        }
                                        break;
                                    case -453839355:
                                    case 1780345053:
                                        if (C0949.m56012()) {
                                            iM559713 = (i32 - C0873.m55680("ۧ֡")) * (-45);
                                            i33 = ((iM559713 ^ i31) * 18767) ^ 536105372;
                                            i34 = 1256440060;
                                        } else {
                                            iM559713 = (C0946.m55979("᩺ۨ") + i31) * (-117);
                                            i33 = ((iM559713 ^ i32) * 26637) ^ (-1084879636);
                                            i34 = 625991985;
                                        }
                                        break;
                                    case -292689134:
                                    case 1904039039:
                                        if (C0906.f81862 >= 0) {
                                            iM559713 = C0946.m55979("ۜ᩻") ^ i32;
                                            i33 = ((iM559713 ^ i31) * (-16463)) ^ (-1606407579);
                                            i34 = 588068293;
                                        } else {
                                            iM559713 = (C0873.m55680("ۢ۫") ^ i32) * 81;
                                            i33 = ((iM559713 ^ i31) * 27945) ^ (-81455242);
                                            i34 = 662963859;
                                        }
                                        break;
                                    case -287487355:
                                    case 927471067:
                                        if (RunnableC1014.m56177()) {
                                            iM559713 = (C0946.m55979("ۖ֫") + i31) * 75;
                                            i33 = ((iM559713 ^ i32) * (-28967)) ^ (-302344779);
                                            i34 = -65458164;
                                        } else {
                                            iM559713 = (C0873.m55680("ۢ۫") ^ i32) * 81;
                                            i33 = ((iM559713 ^ i31) * 27945) ^ (-81455242);
                                            i34 = 662963859;
                                        }
                                        break;
                                    case -70630350:
                                    case 571353663:
                                        if (C0946.f81894 != 0) {
                                            iM559713 = (C0873.m55680("ۢ۫") ^ i32) * 81;
                                            i33 = ((iM559713 ^ i31) * 27945) ^ (-81455242);
                                            i34 = 662963859;
                                        } else {
                                            iM559713 = C0873.m55680("֫ᩴ") ^ i32;
                                            i33 = ((iM559713 ^ i31) * (-30803)) ^ (-504998330);
                                            i34 = -1302908926;
                                        }
                                        break;
                                    case 95305888:
                                    case 492784640:
                                        if (C0894.f81854 >= 0) {
                                            iM559713 = C0946.m55979("ۜ᩻") ^ i32;
                                            i33 = ((iM559713 ^ i31) * (-16463)) ^ (-1606407579);
                                            i34 = 588068293;
                                        } else {
                                            iM559713 = (C0946.m55979("ۧܳ") ^ i32) * 41;
                                            i33 = ((iM559713 ^ i31) * (-5475)) ^ 301141072;
                                            i34 = -513990759;
                                        }
                                        break;
                                    case 905502597:
                                    case 1460104928:
                                        if (C0894.m55769() >= 0) {
                                            iM559713 = (i31 - C0873.m55680("ۘۗ")) * 101;
                                            i33 = ((iM559713 ^ i32) * 20717) ^ 1143529833;
                                            i34 = 141326759;
                                        } else {
                                            iM559713 = (C0946.m55979("ۛ۠") + i31) * (-97);
                                            i33 = ((iM559713 ^ i32) * (-3179)) ^ 878976542;
                                            i34 = 1576989305;
                                        }
                                        break;
                                    default:
                                        C0877.m55696();
                                        iM559713 = C0873.m55680("۫ۡ") ^ i31;
                                        i33 = ((iM559713 ^ i32) * (-14529)) ^ 833492394;
                                        i34 = 1577885205;
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    if (C1044.f81959 < 0) {
                        int iM556810 = C0873.m55680("ۘ᩵") ^ i11;
                        i2 = ((iM556810 ^ i12) * 31671) ^ 1450597716;
                        i3 = iM556810 ^ 2040106555;
                        i23 = i3;
                        i22 = i2;
                    } else {
                        iM55680 = C0946.m55979("۬ۙ") ^ i11;
                        i22 = ((iM55680 ^ i12) * (-18303)) ^ 1668671756;
                        i = -744838108;
                        i23 = iM55680 ^ i;
                    }
                    break;
                case 1090417357:
                case 1995319947:
                    C0947.m55996(C0892.m55755(view, iM559710 ^ i19), viewOnClickListenerC7889);
                    iM55684 = C0873.m55680(ServiceConnectionC1013.m56161(f82012, 48, 3, i15));
                    if (!C1025.m56230()) {
                        iM55680 = C0873.m55680("ۢۗ") ^ i12;
                        i22 = ((iM55680 ^ i11) * (-22601)) ^ 595210034;
                        i = 565635485;
                        i23 = iM55680 ^ i;
                    } else {
                        sArr3 = sArr5;
                        i7 = i20;
                        textView3 = textView4;
                        i8 = i16;
                        sArr4 = sArr7;
                        iM55682 = (i11 - C0873.m55680("ۧܽ")) * (-127);
                        i9 = ((iM55682 ^ i12) * (-22261)) ^ 151158876;
                        i10 = 66388921;
                        int i211 = iM55682 ^ i10;
                        textView4 = textView3;
                        sArr7 = sArr4;
                        i23 = i211;
                        i20 = i7;
                        i16 = i8;
                        sArr5 = sArr3;
                        i22 = i9;
                        dialogInterfaceC2564 = dialogInterfaceC2564;
                    }
                    break;
                default:
                    textView = textView4;
                    viewOnClickListenerC7889.f20705 = textView;
                    sArr7 = f82012;
                    i16 = 33;
                    i17 = 3;
                    if (C1404.f82149 >= 0) {
                        iM55681 = (i12 - C0873.m55680("ܺ۠")) * 37;
                        i2 = ((iM55681 ^ i11) * (-23667)) ^ (-4272755);
                        i6 = 2073844481;
                    } else {
                        iM55681 = C0873.m55680("֫ۗ") ^ i11;
                        i2 = ((iM55681 ^ i12) * 9557) ^ (-76417906);
                        i6 = 816284491;
                    }
                    i3 = iM55681 ^ i6;
                    textView4 = textView;
                    i23 = i3;
                    i22 = i2;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10027 m18230(ViewOnClickListenerC7889 viewOnClickListenerC7889, C24021 c24021) {
        TextView textView = null;
        String strM53207 = null;
        int i = 573087486;
        int i2 = C0992.f81922;
        int i3 = C1071.f81975;
        int iM55979 = (C0946.m55979("ܽᩴ") ^ i2) * (-31);
        int i4 = ((iM55979 ^ i3) * (-18797)) ^ 56769761;
        int i5 = -185852485;
        while (true) {
            i = ((((i ^ i3) * (-24439)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2062349646:
                case 1225378285:
                    C0873.m55678();
                    C1017.m56187();
                    iM55979 = C0873.m55680("۬ۚ") ^ i3;
                    i4 = ((iM55979 ^ i2) * 2839) ^ (-1006809058);
                    i5 = 851309454;
                    break;
                case -1838688266:
                case -1573696116:
                    RunnableC0897.m55784();
                    if (RunnableC0871.m55672() >= 0) {
                        iM55979 = (C0946.m55979("᩷۫") + i3) * (-5);
                        i4 = ((iM55979 ^ i2) * (-27281)) ^ (-1371543085);
                        i5 = 1743877397;
                    } else {
                        iM55979 = C0873.m55680("۬ۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 2839) ^ (-1006809058);
                        i5 = 851309454;
                    }
                    break;
                case -1799521926:
                case 1613933568:
                    strM53207 = null;
                    iM55979 = (C0946.m55979("᩸ᩴ") + i2) * 87;
                    i4 = ((iM55979 ^ i3) * (-17707)) ^ 743119215;
                    i5 = 322694660;
                    break;
                case -1705035668:
                case 710338411:
                    C1003.m56123();
                    if (C1028.f81950 > 0) {
                        iM55979 = (C0946.m55979("᩸ܽ") ^ i3) * (-45);
                        i4 = ((iM55979 ^ i2) * (-9353)) ^ (-1117589661);
                        i5 = -1823673453;
                    } else {
                        iM55979 = C0873.m55680("۬ۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 2839) ^ (-1006809058);
                        i5 = 851309454;
                    }
                    break;
                case -1406437640:
                case 2023504902:
                    if (C0947.m55997()) {
                        iM55979 = (C0873.m55680("ۨܶ") ^ i2) * (-5);
                        i4 = ((iM55979 ^ i3) * 32299) ^ 1105086065;
                        i5 = -557165832;
                    } else {
                        iM55979 = (C0873.m55680("ۜۘ") ^ i2) * 17;
                        i4 = ((iM55979 ^ i3) * 23135) ^ (-342200876);
                        i5 = 908845978;
                    }
                    break;
                case -1404753430:
                case -47285254:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = (C0946.m55979("᩸ܽ") ^ i3) * (-45);
                        i4 = ((iM55979 ^ i2) * (-9353)) ^ (-1117589661);
                        i5 = -1823673453;
                    } else {
                        iM55979 = (C0873.m55680("ۧᩴ") ^ i2) * 23;
                        i4 = ((iM55979 ^ i3) * 26473) ^ (-1775349867);
                        i5 = 1365740946;
                    }
                    break;
                case -1384228617:
                case -1234803936:
                    textView = viewOnClickListenerC7889.f20702;
                    if (c24021 != null) {
                        iM55979 = C0946.m55979("᩹ۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 3039) ^ (-1053203427);
                        i5 = 607754033;
                    } else {
                        iM55979 = C0946.m55979("ᩴܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-4381)) ^ (-1184567188);
                        i5 = 2032126920;
                    }
                    break;
                case -1377300816:
                case 487997317:
                    if (C0912.f81867 <= 0) {
                        iM55979 = (C0873.m55680("ۨܶ") ^ i2) * (-5);
                        i4 = ((iM55979 ^ i3) * 32299) ^ 1105086065;
                        i5 = -557165832;
                    } else {
                        iM55979 = C0873.m55680("ۘ᩹") ^ i2;
                        i4 = ((iM55979 ^ i3) * 2541) ^ 754233027;
                        i5 = -1791141033;
                    }
                    break;
                case -1263544244:
                case 335999008:
                    C1044.m56286();
                    return null;
                case -1050072260:
                case 42037873:
                    strM53207 = c24021.m53207();
                    iM55979 = (C0946.m55979("᩸ᩴ") + i2) * 87;
                    i4 = ((iM55979 ^ i3) * (-17707)) ^ 743119215;
                    i5 = 322694660;
                    break;
                case -845212676:
                case -84567912:
                    if (C1071.f81975 <= 0) {
                        iM55979 = (C0946.m55979("᩸ܽ") ^ i3) * (-45);
                        i4 = ((iM55979 ^ i2) * (-9353)) ^ (-1117589661);
                        i5 = -1823673453;
                    } else {
                        iM55979 = (C0873.m55680("֫ۜ") ^ i3) * (-91);
                        i4 = ((iM55979 ^ i2) * 14955) ^ 161658951;
                        i5 = -1759198497;
                    }
                    break;
                case -801221072:
                case -349061541:
                    RunnableC0938.m55928(textView, strM53207);
                    return C10027.f27775;
                case -241329962:
                case 1245991926:
                    if (C1929.f83011 != 0) {
                        iM55979 = (C0873.m55680("۟۟") + i2) * 69;
                        i4 = ((iM55979 ^ i3) * 18695) ^ (-107953737);
                        i5 = -1768273540;
                    } else {
                        iM55979 = (C0946.m55979("֫۠") + i3) * 69;
                        i4 = ((iM55979 ^ i2) * 23297) ^ 1848156878;
                        i5 = -576035042;
                    }
                    break;
                case 28598231:
                case 278295476:
                    if (C0947.m55997()) {
                        iM55979 = (C0946.m55979("᩷۫") + i3) * (-5);
                        i4 = ((iM55979 ^ i2) * (-27281)) ^ (-1371543085);
                        i5 = 1743877397;
                    } else {
                        iM55979 = (C0946.m55979("ܽۤ") ^ i3) * (-61);
                        i4 = ((iM55979 ^ i2) * (-25781)) ^ (-1427135518);
                        i5 = 1753957477;
                    }
                    break;
                case 125062863:
                case 149315721:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0873.m55680("۬ۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 2839) ^ (-1006809058);
                        i5 = 851309454;
                    } else {
                        iM55979 = C0873.m55680("ۘ۟") ^ i3;
                        i4 = ((iM55979 ^ i2) * 19175) ^ (-23618433);
                        i5 = 2100398974;
                    }
                    break;
                case 739324299:
                case 1832761795:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = C0873.m55680("۬ۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 2839) ^ (-1006809058);
                        i5 = 851309454;
                    } else {
                        iM55979 = C0873.m55680("᩺᩺") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-23085)) ^ 1222566017;
                        i5 = -1893525283;
                    }
                    break;
                case 872494990:
                case 1505036425:
                    C0890.m55740();
                    if (!C0861.m55626()) {
                        iM55979 = (C0873.m55680("ۨܶ") ^ i2) * (-5);
                        i4 = ((iM55979 ^ i3) * 32299) ^ 1105086065;
                        i5 = -557165832;
                    } else {
                        iM55979 = C0873.m55680("۬ۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 2839) ^ (-1006809058);
                        i5 = 851309454;
                    }
                    break;
                case 1415674215:
                case 1535807161:
                    if (C1025.f81947 >= 0) {
                        iM55979 = C0873.m55680("۬ۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 2839) ^ (-1006809058);
                        i5 = 851309454;
                    } else {
                        iM55979 = C0873.m55680("ܿܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-18289)) ^ (-1291103935);
                        i5 = -1045405780;
                    }
                    break;
                default:
                    if (C0882.f81846) {
                        iM55979 = (C0873.m55680("۟۟") + i2) * 69;
                        i4 = ((iM55979 ^ i3) * 18695) ^ (-107953737);
                        i5 = -1768273540;
                    } else {
                        iM55979 = (C0873.m55680("ۙۧ") + i3) * (-69);
                        i4 = ((iM55979 ^ i2) * 19991) ^ (-351125339);
                        i5 = -1902789363;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static C10027 m18234(ViewOnClickListenerC7889 viewOnClickListenerC7889) {
        TextView textView = null;
        long jM53858 = 0;
        int i = 2081739054;
        int i2 = C0930.f81879;
        int i3 = C0992.f81922;
        int iM55979 = C0946.m55979("֡ܰ") ^ i3;
        int i4 = ((iM55979 ^ i2) * (-22465)) ^ (-2024732878);
        int i5 = -2101191344;
        while (true) {
            i = ((((i ^ i2) * (-15481)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2114491061:
                case 1941868903:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = (C0946.m55979("ᩴ۠") ^ i3) * (-31);
                        i4 = ((iM55979 ^ i2) * (-32327)) ^ 301428186;
                        i5 = 1889268994;
                    } else {
                        iM55979 = (C0873.m55680("ᩳ֫") + i3) * 43;
                        i4 = ((iM55979 ^ i2) * (-23099)) ^ (-1143649796);
                        i5 = -795258124;
                    }
                    break;
                case -1872949325:
                case -1772029781:
                    if (C1028.f81950 <= 0) {
                        iM55979 = (C0946.m55979("ᩴ۠") ^ i3) * (-31);
                        i4 = ((iM55979 ^ i2) * (-32327)) ^ 301428186;
                        i5 = 1889268994;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ᩳۢ")) * 73;
                        i4 = ((iM55979 ^ i2) * 22773) ^ (-723735646);
                        i5 = 19705914;
                    }
                    break;
                case -1787419918:
                case -1363329171:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = (C0946.m55979("ᩴ۠") ^ i3) * (-31);
                        i4 = ((iM55979 ^ i2) * (-32327)) ^ 301428186;
                        i5 = 1889268994;
                    } else {
                        iM55979 = C0946.m55979("ᩳ᩺") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-23651)) ^ 751450981;
                        i5 = -1193355462;
                    }
                    break;
                case -1559624360:
                case -1218286120:
                    if (C1124.f82007 >= 0) {
                        iM55979 = (C0946.m55979("ᩴ۠") ^ i3) * (-31);
                        i4 = ((iM55979 ^ i2) * (-32327)) ^ 301428186;
                        i5 = 1889268994;
                    } else {
                        iM55979 = (C0946.m55979("۟ܽ") ^ i2) * (-95);
                        i4 = ((iM55979 ^ i3) * 2175) ^ 52291641;
                        i5 = -1774674700;
                    }
                    break;
                case -1409641814:
                case 1868783887:
                    textView = viewOnClickListenerC7889.f20703;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (i3 - C0873.m55680("۟ۗ")) * 123;
                        i4 = ((iM55979 ^ i2) * (-27121)) ^ (-1149639384);
                        i5 = 704147908;
                    } else {
                        iM55979 = (C0873.m55680("᩹۟") ^ i2) * 37;
                        i4 = ((iM55979 ^ i3) * (-11609)) ^ 1625220716;
                        i5 = -1304591529;
                    }
                    break;
                case -1212979706:
                case 97244236:
                    if (C0898.f81858 > 0) {
                        iM55979 = (C0946.m55979("۫᩶") + i2) * (-125);
                        i4 = ((iM55979 ^ i3) * (-9639)) ^ (-1598717152);
                        i5 = 247091057;
                    } else {
                        iM55979 = (i2 - C0946.m55979("᩷ۡ")) * (-107);
                        i4 = ((iM55979 ^ i3) * (-3331)) ^ 997696117;
                        i5 = 1229054417;
                    }
                    break;
                case -1199331635:
                case 833490492:
                    if (C0949.m56012()) {
                        iM55979 = (C0946.m55979("۫᩶") + i2) * (-125);
                        i4 = ((iM55979 ^ i3) * (-9639)) ^ (-1598717152);
                        i5 = 247091057;
                    } else {
                        iM55979 = (C0946.m55979("ۛۢ") ^ i3) * 13;
                        i4 = ((iM55979 ^ i2) * 8263) ^ 306115668;
                        i5 = -1081340218;
                    }
                    break;
                case -1136985405:
                case -835198408:
                    C0947.m55997();
                    iM55979 = (i2 - C0946.m55979("᩷ۡ")) * (-107);
                    i4 = ((iM55979 ^ i3) * (-3331)) ^ 997696117;
                    i5 = 1229054417;
                    break;
                case -1022877613:
                case 1303801562:
                    jM53858 = C24414.m53858();
                    if (C1964.m56597() != 0) {
                        iM55979 = (C0946.m55979("ᩴ۠") ^ i3) * (-31);
                        i4 = ((iM55979 ^ i2) * (-32327)) ^ 301428186;
                        i5 = 1889268994;
                    } else {
                        iM55979 = C0873.m55680("᩹᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * 21919) ^ (-1667257484);
                        i5 = -945318115;
                    }
                    break;
                case -962430555:
                case -384189961:
                    RunnableC0938.m55928(textView, C18794.m42823(jM53858));
                    return C10027.f27775;
                case -677889515:
                case -7169975:
                    if (C0894.m55769() >= 0) {
                        iM55979 = (i3 - C0873.m55680("۟ۗ")) * 123;
                        i4 = ((iM55979 ^ i2) * (-27121)) ^ (-1149639384);
                        i5 = 704147908;
                    } else {
                        iM55979 = (C0946.m55979("ۜ᩹") + i3) * 109;
                        i4 = ((iM55979 ^ i2) * (-4823)) ^ 1104356055;
                        i5 = -1722816687;
                    }
                    break;
                case -530026108:
                case 829437901:
                    C0898.m55800();
                    return null;
                case -10279970:
                case 1238874782:
                    C0894.m55769();
                    if (!C0882.f81846) {
                        iM55979 = (i2 - C0946.m55979("᩷ۡ")) * (-107);
                        i4 = ((iM55979 ^ i3) * (-3331)) ^ 997696117;
                        i5 = 1229054417;
                    } else {
                        iM55979 = (i3 - C0873.m55680("۟ۗ")) * 123;
                        i4 = ((iM55979 ^ i2) * (-27121)) ^ (-1149639384);
                        i5 = 704147908;
                    }
                    break;
                case 339614646:
                case 976586028:
                    if (C1404.f82149 >= 0) {
                        iM55979 = (i3 - C0873.m55680("۟ۗ")) * 123;
                        i4 = ((iM55979 ^ i2) * (-27121)) ^ (-1149639384);
                        i5 = 704147908;
                    } else {
                        iM55979 = (C0873.m55680("ۤۗ") + i3) * (-79);
                        i4 = ((iM55979 ^ i2) * 3577) ^ (-826573198);
                        i5 = -506377025;
                    }
                    break;
                case 373968355:
                case 1261644748:
                    if (RunnableC0938.m55938() != 0) {
                        iM55979 = (i2 - C0946.m55979("᩷ۡ")) * (-107);
                        i4 = ((iM55979 ^ i3) * (-3331)) ^ 997696117;
                        i5 = 1229054417;
                    } else {
                        iM55979 = C0873.m55680("ᩴ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-9135)) ^ 1805642055;
                        i5 = -114924978;
                    }
                    break;
                default:
                    if (C0947.f81895) {
                        iM55979 = (i2 - C0946.m55979("᩷ۡ")) * (-107);
                        i4 = ((iM55979 ^ i3) * (-3331)) ^ 997696117;
                        i5 = 1229054417;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۡܰ")) * 25;
                        i4 = ((iM55979 ^ i2) * 22909) ^ 500893128;
                        i5 = -2004219046;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0341 A[PHI: r1 r8 r9 r10 r20 r21 r22
      0x0341: PHI (r1v12 android.text.SpannableString) = (r1v3 android.text.SpannableString), (r1v11 android.text.SpannableString), (r1v13 android.text.SpannableString) binds: [B:9:0x005b, B:79:0x033f, B:75:0x0319] A[DONT_GENERATE, DONT_INLINE]
      0x0341: PHI (r8v4 char) = (r8v2 char), (r8v3 char), (r8v2 char) binds: [B:9:0x005b, B:79:0x033f, B:75:0x0319] A[DONT_GENERATE, DONT_INLINE]
      0x0341: PHI (r9v3 short) = (r9v2 short), (r9v2 short), (r9v4 short) binds: [B:9:0x005b, B:79:0x033f, B:75:0x0319] A[DONT_GENERATE, DONT_INLINE]
      0x0341: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:9:0x005b, B:79:0x033f, B:75:0x0319] A[DONT_GENERATE, DONT_INLINE]
      0x0341: PHI (r20v25 int) = (r20v3 int), (r20v24 int), (r20v26 int) binds: [B:9:0x005b, B:79:0x033f, B:75:0x0319] A[DONT_GENERATE, DONT_INLINE]
      0x0341: PHI (r21v11 android.text.style.UnderlineSpan) = 
      (r21v5 android.text.style.UnderlineSpan)
      (r21v10 android.text.style.UnderlineSpan)
      (r21v12 android.text.style.UnderlineSpan)
     binds: [B:9:0x005b, B:79:0x033f, B:75:0x0319] A[DONT_GENERATE, DONT_INLINE]
      0x0341: PHI (r22v3 short[]) = (r22v1 short[]), (r22v2 short[]), (r22v1 short[]) binds: [B:9:0x005b, B:79:0x033f, B:75:0x0319] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static C10027 m18229(ViewOnClickListenerC7889 viewOnClickListenerC7889) {
        SpannableString spannableString;
        int iM55680;
        int i;
        int i2;
        String strM42823;
        int i3;
        int iM55979;
        int i4;
        int i5;
        int i6;
        int i7 = C0898.f81858;
        int i8 = C1964.f83032;
        int iM559710 = C0946.m55979("ܽ᩻") ^ i8;
        int i9 = ((iM559710 ^ i7) * (-21353)) ^ (-480889605);
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM559710 ^ (-987770330);
        int i11 = 0;
        UnderlineSpan underlineSpan = null;
        char c = 0;
        short s = 0;
        int i12 = 0;
        int i13 = 0;
        short s2 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = -2110638295;
        SpannableString spannableString2 = null;
        String strM55993 = null;
        String str = null;
        Object obj = null;
        TextView textView = null;
        while (true) {
            i16 = i10 ^ (i9 & (((i16 ^ i7) * 16251) >> 31));
            switch (i16) {
                case -2125134868:
                case 520010884:
                    spannableString = spannableString2;
                    spannableString.setSpan(underlineSpan, 0, spannableString2.length(), 33);
                    obj = spannableString;
                    int iM559711 = (i8 - C0946.m55979("ۤ᩺")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i = ((iM559711 ^ i7) * (-9763)) ^ 1076276448;
                    spannableString2 = spannableString;
                    i11 = i11;
                    i10 = iM559711 ^ 1925510123;
                    i9 = i;
                    break;
                case -2106484577:
                case -111060920:
                    strM42823 = ServiceConnectionC1013.m56156(C0873.m55680(strM55993) ^ 2124995588);
                    str = strM42823;
                    iM55680 = C0946.m55979("ۛܺ") ^ i8;
                    i = ((iM55680 ^ i7) * 17047) ^ 1413427613;
                    i2 = 412941787;
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    break;
                case -2015624106:
                case 763306119:
                    C0949.m56008(str);
                    obj = str;
                    spannableString = spannableString2;
                    int iM559712 = (i8 - C0946.m55979("ۤ᩺")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i = ((iM559712 ^ i7) * (-9763)) ^ 1076276448;
                    spannableString2 = spannableString;
                    i11 = i11;
                    i10 = iM559712 ^ 1925510123;
                    i9 = i;
                    break;
                case -2009431740:
                case -86143592:
                    sArr2 = f82012;
                    i15 = 61;
                    i11 = 3;
                    if (C1012.f81938 < 0) {
                        iM55680 = C0873.m55680("ܺܶ") ^ i7;
                        i = ((iM55680 ^ i8) * (-5571)) ^ 1151271782;
                        i2 = -985162704;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                    } else {
                        int iM55681 = (C0873.m55680("᩶᩻") + i7) * (-59);
                        i10 = iM55681 ^ (-1484139687);
                        i9 = ((iM55681 ^ i8) * (-2913)) ^ 844592044;
                        underlineSpan = null;
                    }
                    break;
                case -1939158420:
                case -754882023:
                    C0946.m55980();
                    if (!C0947.m55997()) {
                        i11 = i11;
                        spannableString2 = spannableString2;
                        underlineSpan = underlineSpan;
                        iM55979 = (i8 - C0873.m55680("ۧ᩸")) * (-35);
                        i4 = ((iM55979 ^ i7) * (-9393)) ^ (-505878193);
                        i5 = 10892764;
                        i9 = i4;
                        UnderlineSpan underlineSpan2 = underlineSpan;
                        spannableString2 = spannableString2;
                        i11 = i11;
                        i10 = iM55979 ^ i5;
                        underlineSpan = underlineSpan2;
                    } else {
                        iM55680 = (i7 - C0946.m55979("᩸ۢ")) * 45;
                        i = ((iM55680 ^ i8) * (-17475)) ^ (-968520510);
                        i2 = -441079636;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                    }
                    break;
                case -1905082999:
                case 300809309:
                    i3 = i11;
                    short[] sArr3 = f82012;
                    if (C0949.f81897 < 0) {
                        UnderlineSpan underlineSpan3 = underlineSpan;
                        String strM56373 = C1124.m56373(sArr3, 58, 3, i14);
                        if (C0937.f81884) {
                            int iM559713 = C0946.m55979(strM56373) ^ 2097667689;
                            if (C0906.f81862 < 0) {
                                SpannableString spannableString3 = new SpannableString(C1044.m56275(iM559713));
                                if (C1025.f81947 >= 0) {
                                    spannableString2 = spannableString3;
                                    i11 = i3;
                                    int iM55682 = (C0873.m55680("᩶᩻") + i7) * (-59);
                                    i10 = iM55682 ^ (-1484139687);
                                    i9 = ((iM55682 ^ i8) * (-2913)) ^ 844592044;
                                    underlineSpan = null;
                                    break;
                                } else {
                                    underlineSpan = new UnderlineSpan();
                                    if (!C0873.m55678()) {
                                        int iM55683 = (C0873.m55680("᩻۠") ^ i7) * 95;
                                        spannableString2 = spannableString3;
                                        i9 = ((iM55683 ^ i8) * (-25423)) ^ (-1306726312);
                                        i6 = i3;
                                        i10 = iM55683 ^ (-1418048705);
                                    }
                                }
                            }
                            i11 = i6;
                            break;
                        }
                        underlineSpan = underlineSpan3;
                    }
                    int iM559714 = (C0946.m55979("ܽ֨") + i7) * 91;
                    spannableString2 = null;
                    i6 = i3;
                    i10 = iM559714 ^ (-733880296);
                    i9 = ((iM559714 ^ i8) * (-11315)) ^ (-1839221105);
                    i11 = i6;
                    break;
                case -1795425366:
                case 126081056:
                    i11 = i11;
                    spannableString2 = spannableString2;
                    underlineSpan = underlineSpan;
                    textView = viewOnClickListenerC7889.f20704;
                    int i17 = C12996.f36563;
                    if (C0882.m55713()) {
                        iM55979 = C0873.m55680("᩹ܽ") ^ i7;
                        i4 = ((iM55979 ^ i8) * (-10185)) ^ 1317835204;
                        i5 = -807323420;
                    } else {
                        iM55979 = C0873.m55680("ܽ᩵") ^ i8;
                        i4 = ((iM55979 ^ i7) * 19999) ^ (-2117808711);
                        i5 = -1148108366;
                    }
                    i9 = i4;
                    UnderlineSpan underlineSpan4 = underlineSpan;
                    spannableString2 = spannableString2;
                    i11 = i11;
                    i10 = iM55979 ^ i5;
                    underlineSpan = underlineSpan4;
                    break;
                case -1693039574:
                case 1391205241:
                    C0890.m55740();
                    return null;
                case -1589166277:
                case -512610025:
                    C0866.m55645();
                    if (C0863.f81833 > 0) {
                        int iM55684 = (C0873.m55680("᩶᩻") + i7) * (-59);
                        i10 = iM55684 ^ (-1484139687);
                        i9 = ((iM55684 ^ i8) * (-2913)) ^ 844592044;
                        underlineSpan = null;
                    } else {
                        iM55680 = (i7 - C0946.m55979("᩸ۢ")) * 45;
                        i = ((iM55680 ^ i8) * (-17475)) ^ (-968520510);
                        i2 = -441079636;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                    }
                    break;
                case -1565467722:
                case 620338183:
                    C0906.m55809();
                    if (C1025.f81947 < 0) {
                        i11 = i11;
                        spannableString2 = spannableString2;
                        underlineSpan = underlineSpan;
                        iM55979 = (C0873.m55680("ۨۧ") ^ i8) * (-3);
                        i4 = ((iM55979 ^ i7) * (-8385)) ^ 1044328624;
                        i5 = -1088012101;
                        i9 = i4;
                        UnderlineSpan underlineSpan5 = underlineSpan;
                        spannableString2 = spannableString2;
                        i11 = i11;
                        i10 = iM55979 ^ i5;
                        underlineSpan = underlineSpan5;
                    } else {
                        iM55680 = (i7 - C0946.m55979("᩸ۢ")) * 45;
                        i = ((iM55680 ^ i8) * (-17475)) ^ (-968520510);
                        i2 = -441079636;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                    }
                    break;
                case -949615416:
                case 246603637:
                    if (C24414.m53852()) {
                        iM55680 = (i7 - C0946.m55979("᩷᩹")) * (-33);
                        i = ((iM55680 ^ i8) * (-22295)) ^ (-1146416963);
                        i2 = 1867688734;
                    } else {
                        iM55680 = C0873.m55680("ۙܽ") ^ i8;
                        i = ((iM55680 ^ i7) * 21177) ^ (-1422033400);
                        i2 = -674871933;
                    }
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    break;
                case -842826556:
                case 984065753:
                    strM55993 = C0947.m55993(sArr2, i15, i11, i14);
                    if (!C0917.f81868) {
                        iM55680 = C0946.m55979("᩺ۡ") ^ i8;
                        i = ((iM55680 ^ i7) * (-6411)) ^ (-370602197);
                        i2 = -1215191589;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                    } else {
                        i3 = i11;
                        int iM559715 = (C0946.m55979("ܽ֨") + i7) * 91;
                        spannableString2 = null;
                        i6 = i3;
                        i10 = iM559715 ^ (-733880296);
                        i9 = ((iM559715 ^ i8) * (-11315)) ^ (-1839221105);
                        i11 = i6;
                    }
                    break;
                case -693345109:
                case 1229023843:
                    i14 = 3868;
                    iM55979 = (C0946.m55979("᩹᩵") ^ i7) * 41;
                    i4 = ((iM55979 ^ i8) * (-5337)) ^ 1151658507;
                    i5 = -917417378;
                    i9 = i4;
                    UnderlineSpan underlineSpan6 = underlineSpan;
                    spannableString2 = spannableString2;
                    i11 = i11;
                    i10 = iM55979 ^ i5;
                    underlineSpan = underlineSpan6;
                    break;
                case -660170544:
                case 139306209:
                    i11 = i11;
                    spannableString2 = spannableString2;
                    underlineSpan = underlineSpan;
                    i13 = i12 + 153388225;
                    s2 = 24770;
                    if (C1003.f81929 <= 0) {
                        iM55979 = (C0873.m55680("ۨۧ") ^ i8) * (-3);
                        i4 = ((iM55979 ^ i7) * (-8385)) ^ 1044328624;
                        i5 = -1088012101;
                    } else {
                        iM55979 = (C0873.m55680("ᩴ۠") ^ i8) * (-75);
                        i4 = ((iM55979 ^ i7) * (-32337)) ^ (-1319967306);
                        i5 = -827518515;
                    }
                    i9 = i4;
                    UnderlineSpan underlineSpan7 = underlineSpan;
                    spannableString2 = spannableString2;
                    i11 = i11;
                    i10 = iM55979 ^ i5;
                    underlineSpan = underlineSpan7;
                    break;
                case -500852508:
                case -318639973:
                    strM42823 = C18794.m42823(C24414.m53862());
                    str = strM42823;
                    iM55680 = C0946.m55979("ۛܺ") ^ i8;
                    i = ((iM55680 ^ i7) * 17047) ^ 1413427613;
                    i2 = 412941787;
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    break;
                case -385815801:
                case 1557559622:
                    i11 = i11;
                    spannableString2 = spannableString2;
                    underlineSpan = underlineSpan;
                    s = sArr[c];
                    i12 = s * s;
                    if (C0882.f81846) {
                        iM55979 = (i8 - C0873.m55680("ۧ᩸")) * (-35);
                        i4 = ((iM55979 ^ i7) * (-9393)) ^ (-505878193);
                        i5 = 10892764;
                    } else {
                        iM55979 = C0873.m55680("᩵ۜ") ^ i8;
                        i4 = ((iM55979 ^ i7) * (-1531)) ^ 158541549;
                        i5 = -314137292;
                    }
                    i9 = i4;
                    UnderlineSpan underlineSpan8 = underlineSpan;
                    spannableString2 = spannableString2;
                    i11 = i11;
                    i10 = iM55979 ^ i5;
                    underlineSpan = underlineSpan8;
                    break;
                case -251908581:
                case 167977827:
                    i11 = i11;
                    spannableString2 = spannableString2;
                    underlineSpan = underlineSpan;
                    sArr = f82012;
                    c = '9';
                    if (C1229.f82066 >= 0) {
                        iM55979 = (i8 - C0873.m55680("ۧ᩸")) * (-35);
                        i4 = ((iM55979 ^ i7) * (-9393)) ^ (-505878193);
                        i5 = 10892764;
                    } else {
                        iM55979 = C0946.m55979("ܰܶ") ^ i7;
                        i4 = ((iM55979 ^ i8) * (-2871)) ^ (-496438252);
                        i5 = 1414699144;
                    }
                    i9 = i4;
                    UnderlineSpan underlineSpan9 = underlineSpan;
                    spannableString2 = spannableString2;
                    i11 = i11;
                    i10 = iM55979 ^ i5;
                    underlineSpan = underlineSpan9;
                    break;
                case -102533546:
                case 2101295197:
                    i11 = i11;
                    spannableString2 = spannableString2;
                    underlineSpan = underlineSpan;
                    if (i13 - (s * s2) < 0) {
                        iM55979 = (C0946.m55979("ۛܳ") ^ i8) * (-79);
                        i4 = ((iM55979 ^ i7) * (-5771)) ^ (-604859900);
                        i5 = 1486537297;
                    } else {
                        iM55979 = (C0946.m55979("ܶ᩵") + i7) * C0254q.f1218h;
                        i4 = ((iM55979 ^ i8) * (-8655)) ^ (-1874993024);
                        i5 = -27411840;
                    }
                    i9 = i4;
                    UnderlineSpan underlineSpan10 = underlineSpan;
                    spannableString2 = spannableString2;
                    i11 = i11;
                    i10 = iM55979 ^ i5;
                    underlineSpan = underlineSpan10;
                    break;
                case 85472526:
                case 789475639:
                    RunnableC0938.m55928(textView, obj);
                    return C10027.f27775;
                case 104100538:
                case 1456958785:
                    i14 = 62370;
                    iM55979 = (C0946.m55979("᩹᩵") ^ i7) * 41;
                    i4 = ((iM55979 ^ i8) * (-5337)) ^ 1151658507;
                    i5 = -917417378;
                    i9 = i4;
                    UnderlineSpan underlineSpan11 = underlineSpan;
                    spannableString2 = spannableString2;
                    i11 = i11;
                    i10 = iM55979 ^ i5;
                    underlineSpan = underlineSpan11;
                    break;
                default:
                    C0947.m55997();
                    iM55680 = (i7 - C0946.m55979("᩸ۢ")) * 45;
                    i = ((iM55680 ^ i8) * (-17475)) ^ (-968520510);
                    i2 = -441079636;
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static C10027 m18235(ViewOnClickListenerC7889 viewOnClickListenerC7889, C24021 c24021) {
        TextView textView = null;
        String strM53207 = null;
        int i = -1219094065;
        int i2 = C1053.f81965;
        int i3 = C1028.f81950;
        int iM55979 = (C0946.m55979("ܰ֫") ^ i2) * 89;
        int i4 = ((iM55979 ^ i3) * 16347) ^ (-1731519433);
        int i5 = 1980784487;
        while (true) {
            i = ((((i ^ i3) * (-9671)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2144694529:
                case 512944482:
                    ServiceConnectionC1013.m56157();
                    if (C0949.f81897 >= 0) {
                        iM55979 = (C0873.m55680("ۛ۟") ^ i2) * (-123);
                        i4 = ((iM55979 ^ i3) * 14699) ^ 900803477;
                        i5 = 1143017649;
                    } else {
                        iM55979 = C0873.m55680("ۡ۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * 2869) ^ 478878729;
                        i5 = -1187299149;
                    }
                    break;
                case -2060652651:
                case -1806674407:
                    C1048.m56305();
                    if (C0989.f81920 < 0) {
                        iM55979 = (C0873.m55680("ۨ᩺") ^ i3) * (-27);
                        i4 = ((iM55979 ^ i2) * (-18635)) ^ 198626890;
                        i5 = 966484497;
                    } else {
                        iM55979 = (C0873.m55680("ۛ۟") ^ i2) * (-123);
                        i4 = ((iM55979 ^ i3) * 14699) ^ 900803477;
                        i5 = 1143017649;
                    }
                    break;
                case -2058882369:
                case 196296948:
                    if (C0912.f81867 <= 0) {
                        iM55979 = (C0873.m55680("᩸ۡ") + i2) * 37;
                        i4 = ((iM55979 ^ i3) * 32529) ^ 1655833170;
                        i5 = 113141637;
                    } else {
                        iM55979 = C0946.m55979("᩹᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 20585) ^ (-1543268692);
                        i5 = 1145253445;
                    }
                    break;
                case -1922583164:
                case 1161100279:
                    C0873.m55678();
                    return null;
                case -1893334082:
                case 995061125:
                    if (C0937.f81884) {
                        iM55979 = (i2 - C0946.m55979("ۖۙ")) * 77;
                        i4 = ((iM55979 ^ i3) * 14879) ^ (-1162532425);
                        i5 = -1262103403;
                    } else {
                        iM55979 = (C0873.m55680("ۨ᩺") ^ i3) * (-27);
                        i4 = ((iM55979 ^ i2) * (-18635)) ^ 198626890;
                        i5 = 966484497;
                    }
                    break;
                case -1820949043:
                case -1597374037:
                    C0992.m56107();
                    C0866.m55645();
                    iM55979 = C0873.m55680("ۡ۠") ^ i2;
                    i4 = ((iM55979 ^ i3) * 2869) ^ 478878729;
                    i5 = -1187299149;
                    break;
                case -1782581664:
                case 1290577427:
                    if (C0930.f81879 <= 0) {
                        iM55979 = (C0873.m55680("ۛ۟") ^ i2) * (-123);
                        i4 = ((iM55979 ^ i3) * 14699) ^ 900803477;
                        i5 = 1143017649;
                    } else {
                        iM55979 = C0873.m55680("ۗۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 32545) ^ 961688910;
                        i5 = 44907790;
                    }
                    break;
                case -1779982785:
                case 467476376:
                    if (RunnableC0897.f81856) {
                        iM55979 = (C0873.m55680("ۗܰ") ^ i3) * (-61);
                        i4 = ((iM55979 ^ i2) * 15165) ^ 510704794;
                        i5 = 456194239;
                    } else {
                        iM55979 = C0873.m55680("ۡ۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * 2869) ^ 478878729;
                        i5 = -1187299149;
                    }
                    break;
                case -1753747600:
                case 1117871154:
                    C0861.m55626();
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM55979 = C0873.m55680("ۧܿ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25987)) ^ 327097389;
                        i5 = -470451640;
                    } else {
                        iM55979 = (C0873.m55680("ۨ᩺") ^ i3) * (-27);
                        i4 = ((iM55979 ^ i2) * (-18635)) ^ 198626890;
                        i5 = 966484497;
                    }
                    break;
                case -1588291174:
                case 1517133587:
                    textView = viewOnClickListenerC7889.f20705;
                    if (c24021 != null) {
                        iM55979 = C0946.m55979("֨᩻") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-6741)) ^ 1564239915;
                        i5 = 1927930917;
                    } else {
                        iM55979 = C0873.m55680("ۜۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-31789)) ^ (-2009190523);
                        i5 = 1418696932;
                    }
                    break;
                case -1331892372:
                case 310839992:
                    if (C0861.f81831) {
                        iM55979 = (C0873.m55680("ۙ֡") + i2) * (-71);
                        i4 = ((iM55979 ^ i3) * (-22837)) ^ (-1941409202);
                        i5 = 542751107;
                    } else {
                        iM55979 = (C0873.m55680("᩸ۡ") + i2) * 37;
                        i4 = ((iM55979 ^ i3) * 32529) ^ 1655833170;
                        i5 = 113141637;
                    }
                    break;
                case -69486659:
                case 2031664304:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = C0873.m55680("ۡ۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * 2869) ^ 478878729;
                        i5 = -1187299149;
                    } else {
                        iM55979 = (i2 - C0873.m55680("᩷ܽ")) * 97;
                        i4 = ((iM55979 ^ i3) * 2839) ^ 707328058;
                        i5 = -285305913;
                    }
                    break;
                case 40328819:
                case 844499839:
                    strM53207 = null;
                    iM55979 = (C0946.m55979("ܽۛ") ^ i3) * (-55);
                    i4 = ((iM55979 ^ i2) * 9349) ^ 444820440;
                    i5 = -77324959;
                    break;
                case 475998866:
                case 1379242637:
                    RunnableC0938.m55928(textView, strM53207);
                    return C10027.f27775;
                case 486887167:
                case 1186268382:
                    strM53207 = c24021.m53207();
                    iM55979 = (C0946.m55979("ܽۛ") ^ i3) * (-55);
                    i4 = ((iM55979 ^ i2) * 9349) ^ 444820440;
                    i5 = -77324959;
                    break;
                case 580462977:
                case 1093157345:
                    if (C0992.f81922 >= 0) {
                        iM55979 = (C0873.m55680("ۨ᩺") ^ i3) * (-27);
                        i4 = ((iM55979 ^ i2) * (-18635)) ^ 198626890;
                        i5 = 966484497;
                    } else {
                        iM55979 = (i3 - C0946.m55979("۬᩷")) * 47;
                        i4 = ((iM55979 ^ i2) * (-12911)) ^ 446471642;
                        i5 = -213963842;
                    }
                    break;
                case 875985277:
                case 1696021547:
                    if (C0930.f81879 <= 0) {
                        iM55979 = (C0873.m55680("ۛ۟") ^ i2) * (-123);
                        i4 = ((iM55979 ^ i3) * 14699) ^ 900803477;
                        i5 = 1143017649;
                    } else {
                        iM55979 = C0873.m55680("᩸ۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-17357)) ^ 436023351;
                        i5 = -211450396;
                    }
                    break;
                case 1084205185:
                case 1112751804:
                    if (C1036.f81953 >= 0) {
                        iM55979 = C0873.m55680("ۧܿ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25987)) ^ 327097389;
                        i5 = -470451640;
                    } else {
                        iM55979 = C0873.m55680("᩻ᩴ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-19881)) ^ (-1487782421);
                        i5 = -1581713330;
                    }
                    break;
                default:
                    if (C0955.f81898) {
                        iM55979 = C0873.m55680("ۡ۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * 2869) ^ 478878729;
                        i5 = -1187299149;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ܽܽ")) * (-13);
                        i4 = ((iM55979 ^ i2) * (-31435)) ^ 696526862;
                        i5 = -1105480753;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x017b A[PHI: r3
      0x017b: PHI (r3v3 int) = (r3v2 int), (r3v4 int) binds: [B:53:0x0179, B:28:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x020c A[PHI: r1 r12
      0x020c: PHI (r1v5 android.text.SpannableString) = 
      (r1v2 android.text.SpannableString)
      (r1v2 android.text.SpannableString)
      (r1v3 android.text.SpannableString)
      (r1v2 android.text.SpannableString)
     binds: [B:69:0x020a, B:65:0x01f0, B:45:0x0128, B:8:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r12v8 android.text.style.UnderlineSpan) = 
      (r12v4 android.text.style.UnderlineSpan)
      (r12v4 android.text.style.UnderlineSpan)
      (r12v5 android.text.style.UnderlineSpan)
      (r12v4 android.text.style.UnderlineSpan)
     binds: [B:69:0x020a, B:65:0x01f0, B:45:0x0128, B:8:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x023b  */
    /* JADX INFO: renamed from: ۧ */
    public static C10027 m18232(ViewOnClickListenerC7889 viewOnClickListenerC7889, C24021 c24021) {
        int iM55680;
        int i;
        TextView textView = null;
        SpannableString spannableString = null;
        int length = 0;
        int i2 = 0;
        int i3 = 0;
        String strM53207 = null;
        int i4 = 1750248468;
        int i5 = RunnableC0871.f81839;
        int i6 = RunnableC0938.f81886;
        int iM55979 = (i5 - C0946.m55979("ۜۚ")) * (-15);
        int i7 = ((iM55979 ^ i6) * 16943) ^ (-630239352);
        int i8 = 1348560145;
        while (true) {
            int i9 = iM55979 ^ i8;
            UnderlineSpan underlineSpan = null;
            while (true) {
                i4 = ((((i4 ^ i6) * 21297) >> 31) & i7) ^ i9;
                switch (i4) {
                    case -2073223384:
                    case -227286166:
                        spannableString = new SpannableString(c24021 != null ? c24021.m53207() : "");
                        if (C0946.m55980() == 0) {
                            underlineSpan = new UnderlineSpan();
                            if (C0937.f81884) {
                                iM55680 = (C0946.m55979("ۘۘ") ^ i5) * (-27);
                                i7 = ((iM55680 ^ i6) * (-26381)) ^ 1140016259;
                                i = 742428308;
                            } else {
                                iM55680 = (C0873.m55680("֡֨") ^ i6) * 77;
                                i7 = ((iM55680 ^ i5) * 10575) ^ 2100843703;
                                i = 716854424;
                            }
                            i9 = iM55680 ^ i;
                        }
                        break;
                    case -2025873258:
                    case -834745851:
                        if (C1044.m56286() <= 0) {
                            iM55680 = (C0873.m55680("ۘۢ") + i5) * (-65);
                            i7 = ((iM55680 ^ i6) * (-3449)) ^ 919434935;
                            i = -87106210;
                        } else {
                            iM55680 = C0946.m55979("ۙ֨") ^ i6;
                            i7 = ((iM55680 ^ i5) * (-32057)) ^ (-530033611);
                            i = 1408755109;
                        }
                        i9 = iM55680 ^ i;
                        break;
                    case -1975525864:
                    case 470753921:
                        if (C0989.f81920 >= 0) {
                            iM55680 = C0873.m55680("ᩳۨ") ^ i5;
                            i7 = ((iM55680 ^ i6) * (-12381)) ^ (-2110627390);
                            i = -1797702990;
                        } else {
                            iM55680 = C0946.m55979("᩶ۤ") ^ i6;
                            i7 = ((iM55680 ^ i5) * 989) ^ (-716914378);
                            i = 1556956986;
                        }
                        i9 = iM55680 ^ i;
                        break;
                    case -1772257426:
                    case 837804997:
                        if (C0882.m55710() != 0) {
                            iM55680 = (C0873.m55680("֡֨") ^ i6) * 77;
                            i7 = ((iM55680 ^ i5) * 10575) ^ 2100843703;
                            i = 716854424;
                        } else {
                            iM55680 = (i5 - C0873.m55680("ܺ᩷")) * 13;
                            i7 = ((iM55680 ^ i6) * 30001) ^ 266729195;
                            i = 1864832891;
                        }
                        i9 = iM55680 ^ i;
                        break;
                    case -1708527171:
                    case -1440119760:
                        if (C1003.f81929 <= 0) {
                            iM55680 = C0946.m55979("۫֨") ^ i5;
                            i7 = ((iM55680 ^ i6) * (-18067)) ^ (-2015637126);
                            i = -115552403;
                        } else {
                            iM55680 = C0873.m55680("᩶᩶") ^ i6;
                            i7 = ((iM55680 ^ i5) * (-14463)) ^ 1576513390;
                            i = 129887876;
                        }
                        i9 = iM55680 ^ i;
                        break;
                    case -1604449491:
                    case 1111813450:
                        strM53207 = c24021.m53207();
                        iM55680 = (i5 - C0873.m55680("ܶ֫")) * (-15);
                        i7 = ((iM55680 ^ i6) * (-16581)) ^ 140029136;
                        i = -1413990381;
                        i9 = iM55680 ^ i;
                        break;
                    case -1267508331:
                    case 703116662:
                        C1964.m56597();
                        RunnableC0938.m55938();
                        iM55680 = (C0873.m55680("ۘۢ") + i5) * (-65);
                        i7 = ((iM55680 ^ i6) * (-3449)) ^ 919434935;
                        i = -87106210;
                        i9 = iM55680 ^ i;
                        break;
                    case -1176087832:
                    case 2139470076:
                        strM53207 = null;
                        iM55680 = (i5 - C0873.m55680("ܶ֫")) * (-15);
                        i7 = ((iM55680 ^ i6) * (-16581)) ^ 140029136;
                        i = -1413990381;
                        i9 = iM55680 ^ i;
                        break;
                    case -1097313039:
                    case 338868410:
                        if (C1124.f82007 >= 0) {
                            iM55680 = (C0873.m55680("֡֨") ^ i6) * 77;
                            i7 = ((iM55680 ^ i5) * 10575) ^ 2100843703;
                            i = 716854424;
                        } else {
                            iM55680 = C0873.m55680("֨ۧ") ^ i5;
                            i7 = ((iM55680 ^ i6) * 12261) ^ (-2002022159);
                            i = 1472562069;
                        }
                        i9 = iM55680 ^ i;
                        break;
                    case -1038818464:
                    case 584778291:
                        if (C1124.m56367() >= 0) {
                            iM55680 = (C0873.m55680("ۘۢ") + i5) * (-65);
                            i7 = ((iM55680 ^ i6) * (-3449)) ^ 919434935;
                            i = -87106210;
                        } else {
                            iM55680 = C0873.m55680("֨ܿ") ^ i5;
                            i7 = ((iM55680 ^ i6) * (-7651)) ^ (-1627252589);
                            i = -2047579207;
                        }
                        i9 = iM55680 ^ i;
                        break;
                    case -941456164:
                    case 1345444837:
                        i2 = 33;
                        i3 = 0;
                        if (!RunnableC0897.f81856) {
                        }
                        iM55680 = C0946.m55979("۟ܳ") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-24675)) ^ (-1461528300);
                        i = -1431577474;
                        i9 = iM55680 ^ i;
                        break;
                        break;
                    case -874682767:
                    case -475612068:
                        C0912.m55833();
                        if (C0854.f81826 == 0) {
                            iM55680 = (C0873.m55680("ۘۢ") + i5) * (-65);
                            i7 = ((iM55680 ^ i6) * (-3449)) ^ 919434935;
                            i = -87106210;
                        } else {
                            iM55680 = C0946.m55979("۫֨") ^ i5;
                            i7 = ((iM55680 ^ i6) * (-18067)) ^ (-2015637126);
                            i = -115552403;
                        }
                        i9 = iM55680 ^ i;
                        break;
                    case -852647106:
                    case 1221624215:
                        textView = viewOnClickListenerC7889.f20707;
                        if (C24414.m53861()) {
                            iM55680 = (i6 - C0946.m55979("ۙܰ")) * 119;
                            i7 = ((iM55680 ^ i5) * (-18605)) ^ (-1825145031);
                            i = -1223125164;
                        } else {
                            iM55680 = (C0946.m55979("ۗۚ") + i5) * 101;
                            i7 = ((iM55680 ^ i6) * (-899)) ^ 1676088754;
                            i = 850516208;
                        }
                        i9 = iM55680 ^ i;
                        break;
                    case -836150635:
                    case 1284291851:
                        return C10027.f27775;
                    case -291824458:
                    case 1738420065:
                        if (c24021 != null) {
                            iM55680 = C0873.m55680("ۡܶ") ^ i6;
                            i7 = ((iM55680 ^ i5) * 6639) ^ (-501386633);
                            i = -743969259;
                        } else {
                            iM55680 = C0946.m55979("ۙ۬") ^ i5;
                            i7 = ((iM55680 ^ i6) * (-11535)) ^ (-467031998);
                            i = -427910048;
                        }
                        i9 = iM55680 ^ i;
                        break;
                    case -289165537:
                    case 277913935:
                        length = spannableString.length();
                        if (C0882.f81846) {
                            iM55680 = C0873.m55680("ᩳۨ") ^ i5;
                            i7 = ((iM55680 ^ i6) * (-12381)) ^ (-2110627390);
                            i = -1797702990;
                        } else {
                            iM55680 = (C0946.m55979("ۤۘ") + i6) * 61;
                            i7 = ((iM55680 ^ i5) * (-27045)) ^ (-1961710326);
                            i = -1817088189;
                        }
                        i9 = iM55680 ^ i;
                        break;
                    case 220331976:
                    case 1982590714:
                        if (C0917.f81868) {
                            iM55680 = (C0873.m55680("ۘۢ") + i5) * (-65);
                            i7 = ((iM55680 ^ i6) * (-3449)) ^ 919434935;
                            i = -87106210;
                        } else {
                            iM55680 = (C0873.m55680("֡֨") ^ i6) * 77;
                            i7 = ((iM55680 ^ i5) * 10575) ^ 2100843703;
                            i = 716854424;
                        }
                        i9 = iM55680 ^ i;
                        break;
                    case 337700181:
                    case 469936729:
                        C1046.m56302();
                        return null;
                    case 595968073:
                    case 1374767817:
                        C0894.m55771(textView, strM53207);
                        iM55680 = C0946.m55979("ۗۢ") ^ i6;
                        i7 = ((iM55680 ^ i5) * 15653) ^ (-1645379464);
                        i = -579880758;
                        i9 = iM55680 ^ i;
                        break;
                    case 1625812191:
                    case 1672042781:
                        C1017.m56187();
                        if (C1964.f83032 > 0) {
                        }
                        iM55680 = (C0873.m55680("ۘۢ") + i5) * (-65);
                        i7 = ((iM55680 ^ i6) * (-3449)) ^ 919434935;
                        i = -87106210;
                        i9 = iM55680 ^ i;
                        break;
                    default:
                        spannableString.setSpan(underlineSpan, i3, length, i2);
                        C0894.m55771(textView, spannableString);
                        iM55680 = C0946.m55979("ۗۢ") ^ i6;
                        i7 = ((iM55680 ^ i5) * 15653) ^ (-1645379464);
                        i = -579880758;
                        i9 = iM55680 ^ i;
                        break;
                }
            }
            iM55979 = C0946.m55979("ܺ᩻") ^ i6;
            i7 = ((iM55979 ^ i5) * (-26519)) ^ (-1543232185);
            i8 = 630226494;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0152 A[PHI: r9
      0x0152: PHI (r9v5 java.lang.String) = (r9v4 java.lang.String), (r9v2 java.lang.String) binds: [B:36:0x0150, B:9:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x023f A[PHI: r7
      0x023f: PHI (r7v5 java.lang.String) = (r7v2 java.lang.String), (r7v4 java.lang.String), (r7v2 java.lang.String) binds: [B:132:0x023f, B:56:0x023d, B:9:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0094, code lost:
    
        if (p067l.C0992.f81922 < 0) goto L13;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int iM559711;
        int i4;
        this = this;
        int i5 = RunnableC0871.f81839;
        int i6 = C1017.f81942;
        int iM55680 = C0873.m55680("ۛܰ") ^ i5;
        int i7 = ((iM55680 ^ i6) * 21525) ^ (-433605473);
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM55680 ^ 2000568334;
        String strM55792 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        short s = 0;
        int i13 = 0;
        int i14 = -1927017190;
        int i15 = 0;
        short[] sArr3 = null;
        String strM55893 = null;
        String strM55894 = null;
        String strM56029 = null;
        String strM55993 = null;
        Intent intent = null;
        AbstractActivityC5549 abstractActivityC5549 = null;
        int iM55718 = 0;
        while (true) {
            i14 = i8 ^ (i7 & (((i14 ^ i6) * 10593) >> 31));
            switch (i14) {
                case -2021085238:
                case -1944386649:
                    strM55893 = C0930.m55893(f82012, 75, 3, i9);
                    if (C1044.f81959 >= 0) {
                        iM559710 = (i5 - C0873.m55680("ܶ᩵")) * 3;
                        i = ((iM559710 ^ i6) * (-8937)) ^ (-2053387530);
                        i3 = 160697947;
                    } else {
                        iM559710 = (i5 - C0946.m55979("᩷ܳ")) * 13;
                        i = ((iM559710 ^ i6) * (-12103)) ^ 396795550;
                        i3 = -1548042199;
                    }
                    i8 = iM559710 ^ i3;
                    i7 = i;
                    break;
                case -2009778777:
                case 2055852979:
                    i15 = i13 * i13;
                    i11 = s * s;
                    i12 = 12475024;
                    if (C1929.f83011 == 0) {
                        iM55979 = (C0946.m55979("ۨܺ") + i5) * 69;
                        i = ((iM55979 ^ i6) * 26317) ^ (-650735615);
                        i2 = 912770903;
                        i8 = iM55979 ^ i2;
                        this = this;
                        i7 = i;
                    } else {
                        iM559711 = (i6 - C0946.m55979("ۡۖ")) * (-77);
                        i7 = ((iM559711 ^ i5) * (-15359)) ^ 2079929525;
                        i4 = -2076134450;
                        i8 = iM559711 ^ i4;
                        this = this;
                    }
                    break;
                case -1889713221:
                case -1270570011:
                    break;
                case -1821734804:
                case 1466449671:
                    C7050.m16211((CharSequence) C0863.m55639(C1025.m56220(this.f20702)));
                    break;
                case -1783395653:
                case 963157130:
                    short s2 = sArr3[c];
                    int i16 = s2 + 3532;
                    if (C1404.f82149 >= 0) {
                        int iM55681 = (i6 - C0873.m55680("᩺ܽ")) * 83;
                        i8 = iM55681 ^ 370248314;
                        i7 = ((iM55681 ^ i5) * (-16669)) ^ (-1996536179);
                        s = s2;
                    } else {
                        int iM559712 = (C0946.m55979("᩹ܶ") + i6) * 65;
                        i7 = ((iM559712 ^ i5) * 31399) ^ (-1246763284);
                        i8 = iM559712 ^ (-923048896);
                        s = s2;
                    }
                    i13 = i16;
                    break;
                case -1666944311:
                case 933341605:
                    i9 = 14718;
                    iM55979 = (C0873.m55680("᩷ۧ") + i6) * (-87);
                    i = ((iM55979 ^ i5) * (-6767)) ^ 1641199945;
                    i2 = 1904565521;
                    i8 = iM55979 ^ i2;
                    this = this;
                    i7 = i;
                    break;
                case -1661367966:
                case 1026844360:
                    strM56029 = C0955.m56029(f82012, 69, 3, i9);
                    if (C0898.m55800() <= 0) {
                        iM559710 = (C0873.m55680("ۨۨ") ^ i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM559710 ^ i6) * (-28763)) ^ 1891832175;
                        i3 = 902003546;
                    } else {
                        iM559710 = C0873.m55680("ۛ᩺") ^ i6;
                        i = ((iM559710 ^ i5) * 18777) ^ (-485256616);
                        i3 = -1682845065;
                    }
                    i8 = iM559710 ^ i3;
                    i7 = i;
                    break;
                case -1644157167:
                case 1630690295:
                    ViewOnClickListenerC9062.m20968(abstractActivityC5549, false);
                    break;
                case -1438294501:
                case -289053676:
                    sArr3 = f82012;
                    c = '@';
                    if (C1025.f81947 >= 0) {
                        iM559711 = (i6 - C0946.m55979("ۡۖ")) * (-77);
                        i7 = ((iM559711 ^ i5) * (-15359)) ^ 2079929525;
                        i4 = -2076134450;
                    } else {
                        iM559711 = C0946.m55979("֫ۙ") ^ i5;
                        i7 = ((iM559711 ^ i6) * (-19955)) ^ (-689046946);
                        i4 = 206095258;
                    }
                    i8 = iM559711 ^ i4;
                    this = this;
                    break;
                case -1344177904:
                case -1220520430:
                    int i17 = i11 + i12;
                    if ((i17 + i17) - i15 < 0) {
                        iM55979 = C0873.m55680("֨۠") ^ i5;
                        i = ((iM55979 ^ i6) * (-5745)) ^ (-1011093473);
                        i2 = 90127198;
                    } else {
                        iM55979 = C0873.m55680("ۤᩳ") ^ i6;
                        i = ((iM55979 ^ i5) * 30313) ^ (-445995595);
                        i2 = 241747110;
                    }
                    i8 = iM55979 ^ i2;
                    this = this;
                    i7 = i;
                    break;
                case -1296628300:
                case -554149415:
                    strM55894 = C0930.m55893(f82012, 72, 3, i9);
                    if (!C0863.m55643()) {
                        int iM559713 = (C0946.m55979("ۚۘ") ^ i5) * 31;
                        i8 = iM559713 ^ (-1778905176);
                        i7 = ((iM559713 ^ i6) * (-7547)) ^ 1341334230;
                        this = this;
                    } else {
                        iM559710 = (C0873.m55680("۟֨") + i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM559710 ^ i5) * (-8287)) ^ (-1965577833);
                        i3 = -652378855;
                        i8 = iM559710 ^ i3;
                        i7 = i;
                    }
                    break;
                case -1038535579:
                case 1609166947:
                    break;
                case -1000005813:
                case -276201301:
                    C0854.m55595();
                    if (AbstractC0942.f81890 <= 0) {
                        iM559710 = (C0873.m55680("ۨۨ") ^ i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM559710 ^ i6) * (-28763)) ^ 1891832175;
                        i3 = 902003546;
                        i8 = iM559710 ^ i3;
                        i7 = i;
                    } else {
                        int iM559714 = (C0946.m55979("ۚۘ") ^ i5) * 31;
                        i8 = iM559714 ^ (-1778905176);
                        i7 = ((iM559714 ^ i6) * (-7547)) ^ 1341334230;
                        this = this;
                    }
                    break;
                case -968672963:
                case 2070757253:
                    C7050.m16211((CharSequence) C0845.m55591(C1025.m56220(this.f20707)));
                    break;
                case -930678853:
                case -756748761:
                    strM55792 = C0898.m55792(f82012, 65, 1, i9);
                    if (C0992.f81922 < 0) {
                        iM55979 = C0946.m55979("᩺۬") ^ i5;
                        i = ((iM55979 ^ i6) * (-29613)) ^ (-2021396249);
                        i2 = -568615418;
                        i8 = iM55979 ^ i2;
                        this = this;
                        i7 = i;
                    } else {
                        iM559711 = (i6 - C0946.m55979("ۡۖ")) * (-77);
                        i7 = ((iM559711 ^ i5) * (-15359)) ^ 2079929525;
                        i4 = -2076134450;
                        i8 = iM559711 ^ i4;
                        this = this;
                    }
                    break;
                case -889422554:
                case -530791373:
                    intent.putExtra(C0989.m56092(sArr2, i10, 15, i9), true);
                    C1044.m56284(abstractActivityC5549, intent);
                    iM559710 = C0873.m55680("ܽܳ") ^ i6;
                    i = ((iM559710 ^ i5) * (-23719)) ^ 647148709;
                    i3 = 1592043623;
                    i8 = iM559710 ^ i3;
                    i7 = i;
                    break;
                case -693926398:
                case 808967871:
                    C7050.m16211((CharSequence) C0863.m55639(C1025.m56220(this.f20705)));
                    break;
                case -539936541:
                case 710601644:
                    i9 = 31009;
                    iM55979 = (C0873.m55680("᩷ۧ") + i6) * (-87);
                    i = ((iM55979 ^ i5) * (-6767)) ^ 1641199945;
                    i2 = 1904565521;
                    i8 = iM55979 ^ i2;
                    this = this;
                    i7 = i;
                    break;
                case -442168425:
                case 410234019:
                    intent = new Intent(abstractActivityC5549, (Class<?>) ViewOnClickListenerC7928.class);
                    sArr2 = f82012;
                    i10 = 78;
                    if (C0930.m55885() > 0) {
                        iM559710 = (C0873.m55680("֫᩺") + i6) * (-113);
                        i = ((iM559710 ^ i5) * 1405) ^ (-1618867379);
                        i3 = -1935372124;
                        i8 = iM559710 ^ i3;
                        i7 = i;
                    } else {
                        iM559711 = (i6 - C0946.m55979("ۡۖ")) * (-77);
                        i7 = ((iM559711 ^ i5) * (-15359)) ^ 2079929525;
                        i4 = -2076134450;
                        i8 = iM559711 ^ i4;
                        this = this;
                    }
                    break;
                case -393507986:
                case -172159315:
                    if (C24414.m53861()) {
                        iM559710 = (C0946.m55979("۠۬") ^ i6) * 79;
                        i = ((iM559710 ^ i5) * (-2335)) ^ 1688703021;
                        i3 = 2115271847;
                    } else {
                        iM559710 = C0873.m55680("ᩳۙ") ^ i5;
                        i = ((iM559710 ^ i6) * 5227) ^ (-1427936619);
                        i3 = -2121569846;
                    }
                    i8 = iM559710 ^ i3;
                    i7 = i;
                    break;
                case -337441409:
                case 542531916:
                    if (C0866.f81837 < 0) {
                        iM559710 = (C0873.m55680("ۨۨ") ^ i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM559710 ^ i6) * (-28763)) ^ 1891832175;
                        i3 = 902003546;
                    } else {
                        iM559710 = (i5 - C0873.m55680("ܶ᩵")) * 3;
                        i = ((iM559710 ^ i6) * (-8937)) ^ (-2053387530);
                        i3 = 160697947;
                    }
                    i8 = iM559710 ^ i3;
                    i7 = i;
                    break;
                case 480104736:
                case 550529793:
                    if (iM55718 == (C0946.m55979(strM55993) ^ 2126403977)) {
                        iM559710 = (C0873.m55680("ܽܶ") + i5) * 69;
                        i = ((iM559710 ^ i6) * 4645) ^ (-415878569);
                        i3 = 1468649578;
                    } else {
                        iM559710 = C0946.m55979("ᩴ᩹") ^ i6;
                        i = ((iM559710 ^ i5) * 3811) ^ 191611786;
                        i3 = 1296288685;
                    }
                    i8 = iM559710 ^ i3;
                    i7 = i;
                    break;
                case 814834215:
                case 1001387432:
                    C0906.m55809();
                    C1025.m56230();
                    break;
                case 1206082075:
                case 1592533705:
                    C1025.m56218(view, strM55792);
                    iM55718 = C0882.m55718(view);
                    sArr = f82012;
                    if (C0890.f81849 == 0) {
                        iM55979 = C0946.m55979("ۘۜ") ^ i6;
                        i = ((iM55979 ^ i5) * (-2847)) ^ 1801638582;
                        i2 = -2052764964;
                        i8 = iM55979 ^ i2;
                        this = this;
                        i7 = i;
                    } else {
                        int iM559715 = (C0946.m55979("ۚۘ") ^ i5) * 31;
                        i8 = iM559715 ^ (-1778905176);
                        i7 = ((iM559715 ^ i6) * (-7547)) ^ 1341334230;
                        this = this;
                    }
                    break;
                case 1213790420:
                case 1876505537:
                    C0917.m55854();
                    C1044.m56286();
                    int iM559716 = (C0946.m55979("ۚۘ") ^ i5) * 31;
                    i8 = iM559716 ^ (-1778905176);
                    i7 = ((iM559716 ^ i6) * (-7547)) ^ 1341334230;
                    this = this;
                    break;
                case 1242050754:
                case 1347627664:
                    int iM559717 = C0946.m55979(strM56029) ^ 2117076805;
                    abstractActivityC5549 = this.f20706;
                    if (iM55718 == iM559717) {
                        iM559710 = C0873.m55680("᩸᩶") ^ i6;
                        i = ((iM559710 ^ i5) * (-15795)) ^ 818621433;
                        i3 = -1333257917;
                    } else {
                        iM559710 = (C0873.m55680("ۜۖ") + i5) * 85;
                        i = ((iM559710 ^ i6) * 18065) ^ (-1648961622);
                        i3 = -32727740;
                    }
                    i8 = iM559710 ^ i3;
                    i7 = i;
                    break;
                case 1411161490:
                case 1464151781:
                    strM55993 = C0947.m55993(sArr, 66, 3, i9);
                    if (!C0917.f81868) {
                        iM559710 = C0946.m55979("ۖᩳ") ^ i5;
                        i = ((iM559710 ^ i6) * 30145) ^ (-1927232103);
                        i3 = -2056863534;
                        i8 = iM559710 ^ i3;
                        i7 = i;
                    } else {
                        int iM559718 = (C0946.m55979("ۚۘ") ^ i5) * 31;
                        i8 = iM559718 ^ (-1778905176);
                        i7 = ((iM559718 ^ i6) * (-7547)) ^ 1341334230;
                        this = this;
                    }
                    break;
                case 1550513121:
                case 1907292808:
                    if (iM55718 == (C0946.m55979(strM55894) ^ 2128290826)) {
                        iM559710 = C0873.m55680("۬ۢ") ^ i6;
                        i = ((iM559710 ^ i5) * (-9271)) ^ (-281418496);
                        i3 = 1121147216;
                    } else {
                        iM559710 = (C0946.m55979("ۨۙ") ^ i5) * (-29);
                        i = ((iM559710 ^ i6) * 29391) ^ 167409309;
                        i3 = 43515389;
                    }
                    i8 = iM559710 ^ i3;
                    i7 = i;
                    break;
                default:
                    if (iM55718 == (C0873.m55680(strM55893) ^ 2122692112)) {
                        iM559710 = C0873.m55680("᩹ۧ") ^ i5;
                        i = ((iM559710 ^ i6) * (-24149)) ^ (-945311814);
                        i3 = 1903382351;
                    } else {
                        iM559710 = C0873.m55680("ܽܳ") ^ i6;
                        i = ((iM559710 ^ i5) * (-23719)) ^ 647148709;
                        i3 = 1592043623;
                    }
                    i8 = iM559710 ^ i3;
                    i7 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18231(Consumer consumer, ViewOnClickListenerC7889 viewOnClickListenerC7889) {
        consumer.m45213n(viewOnClickListenerC7889.f20706);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m18236(ViewOnClickListenerC7889 viewOnClickListenerC7889) {
        int i = -936923111;
        int i2 = C1053.f81965;
        int i3 = C1124.f82007;
        int iM55680 = (i3 - C0873.m55680("ܺܺ")) * 99;
        int i4 = ((iM55680 ^ i2) * (-31265)) ^ 767438585;
        int i5 = -1013101999;
        while (true) {
            i = ((((i ^ i2) * (-16633)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1911219215:
                case 2109737579:
                    if (C0992.m56107() <= 0) {
                        iM55680 = (i3 - C0946.m55979("ۛ᩹")) * 77;
                        i4 = ((iM55680 ^ i2) * 10959) ^ 825412185;
                        i5 = 1795803736;
                    } else {
                        iM55680 = (C0946.m55979("᩷ۙ") + i2) * 95;
                        i4 = ((iM55680 ^ i3) * 26229) ^ (-761587746);
                        i5 = 122577794;
                    }
                    break;
                case -1070361326:
                case -948552150:
                    if (C0946.f81894 == 0) {
                        iM55680 = (C0946.m55979("᩷ۙ") + i2) * 95;
                        i4 = ((iM55680 ^ i3) * 26229) ^ (-761587746);
                        i5 = 122577794;
                    } else {
                        iM55680 = C0873.m55680("ܽ᩺") ^ i2;
                        i4 = ((iM55680 ^ i3) * 24195) ^ (-1386702558);
                        i5 = 1833035768;
                    }
                    break;
                case -102312857:
                case 843390365:
                    RunnableC1014.m56177();
                    iM55680 = (C0946.m55979("᩷ۙ") + i2) * 95;
                    i4 = ((iM55680 ^ i3) * 26229) ^ (-761587746);
                    i5 = 122577794;
                    break;
                case 301370057:
                case 1495086093:
                    C0892.m55749();
                    if (C1929.f83011 != 0) {
                        iM55680 = (C0873.m55680("᩵᩷") ^ i3) * 59;
                        i4 = ((iM55680 ^ i2) * (-9347)) ^ (-314649607);
                        i5 = 620792198;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۛ᩹")) * 77;
                        i4 = ((iM55680 ^ i2) * 10959) ^ 825412185;
                        i5 = 1795803736;
                    }
                    break;
                case 1175949951:
                case 1747460308:
                    C0877.m55696();
                    C1194.m56396();
                    break;
                default:
                    if (C1124.f82007 < 0) {
                        if (!C0955.f81898) {
                            if (ViewOnClickListenerC0939.m55941() < 0 && C0863.f81833 > 0) {
                                if (RunnableC1014.m56177()) {
                                    if (C1404.f82149 < 0) {
                                        if (C0845.f81821 < 0) {
                                            if (C0937.f81884) {
                                                if (C0890.m55740()) {
                                                    AbstractActivityC5549 abstractActivityC5549 = viewOnClickListenerC7889.f20706;
                                                    if (C0937.f81884) {
                                                        C1044.m56284(abstractActivityC5549, new Intent(abstractActivityC5549, (Class<?>) ViewOnClickListenerC7928.class));
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            iM55680 = (C0946.m55979("᩷ۙ") + i2) * 95;
                            i4 = ((iM55680 ^ i3) * 26229) ^ (-761587746);
                            i5 = 122577794;
                            break;
                        }
                        iM55680 = (C0873.m55680("᩵᩷") ^ i3) * 59;
                        i4 = ((iM55680 ^ i2) * (-9347)) ^ (-314649607);
                        i5 = 620792198;
                        break;
                    }
                    iM55680 = C0873.m55680("᩶ܿ") ^ i3;
                    i4 = ((iM55680 ^ i2) * 10349) ^ (-569276026);
                    i5 = 708978164;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m18233(ViewOnClickListenerC7889 viewOnClickListenerC7889) {
        ViewOnClickListenerC9062.m20968(viewOnClickListenerC7889.f20706, false);
    }
}
