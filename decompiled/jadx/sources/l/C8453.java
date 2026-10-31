package l;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.TwofishEngine;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.۠᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V6YT */
/* JADX INFO: loaded from: classes4.dex */
public class C8453 extends AbstractC5447 implements InterfaceC8085 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final String[] f25852;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final String[] f25853;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String[] f25854;

    /* JADX INFO: renamed from: ܳ᩹ۡ, reason: not valid java name and contains not printable characters */
    private static final short[] f25855 = {4445, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26641, 26630, 26638, 26636, 26647, 26630, 26701, 26673, 26630, 26638, 26636, 26647, 26630, 26672, 26630, 26641, 26645, 26630, 26641, 26672, 26630, 26641, 26645, 26634, 26624, 26630, 26701, 26658, 26656, 26679, 26666, 26668, 26669, 26684, 26672, 26679, 26658, 26673, 26679, 26662, 26663, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26643, 26639, 26646, 26640, 26701, 26661, 26679, 26675, 26684, 26672, 26662, 26673, 26677, 26662, 26673, 26684, 26672, 26679, 26658, 26673, 26679, 26662, 26663, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26638, 26624, 26643, 26701, 26658, 26656, 26679, 26666, 26668, 26669, 26684, 26672, 26679, 26658, 26673, 26679, 26662, 26663, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26641, 26630, 26638, 26636, 26647, 26630, 26701, 26673, 26630, 26638, 26636, 26647, 26630, 26672, 26630, 26641, 26645, 26630, 26641, 26672, 26630, 26641, 26645, 26634, 26624, 26630, 26701, 26658, 26656, 26679, 26666, 26668, 26669, 26684, 26661, 26658, 26666, 26671, 26662, 26663, 26684, 26679, 26668, 26684, 26672, 26679, 26658, 26673, 26679, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26643, 26639, 26646, 26640, 26701, 26661, 26679, 26675, 26684, 26672, 26662, 26673, 26677, 26662, 26673, 26684, 26661, 26658, 26666, 26671, 26662, 26663, 26684, 26679, 26668, 26684, 26672, 26679, 26658, 26673, 26679, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26638, 26624, 26643, 26701, 26658, 26656, 26679, 26666, 26668, 26669, 26684, 26661, 26658, 26666, 26671, 26662, 26663, 26684, 26679, 26668, 26684, 26672, 26679, 26658, 26673, 26679, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26641, 26630, 26638, 26636, 26647, 26630, 26701, 26673, 26630, 26638, 26636, 26647, 26630, 26672, 26630, 26641, 26645, 26630, 26641, 26672, 26630, 26641, 26645, 26634, 26624, 26630, 26701, 26658, 26656, 26679, 26666, 26668, 26669, 26684, 26672, 26679, 26668, 26675, 26675, 26662, 26663, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26643, 26639, 26646, 26640, 26701, 26661, 26679, 26675, 26684, 26672, 26662, 26673, 26677, 26662, 26673, 26684, 26672, 26679, 26668, 26675, 26675, 26662, 26663, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26638, 26624, 26643, 26701, 26658, 26656, 26679, 26666, 26668, 26669, 26684, 26672, 26679, 26668, 26675, 26675, 26662, 26663, 6503, -27656, -27678, 8854, -4431, 2282, 11069, 8987, -9063, -15257, -15501, -9523, -2668, 11461, -3039, 12678, -3395, 6198, -29889, -10008, -3349, 3531, 1242, -22110, -22110, -22105, -22094, -22140, -22081, -22086, -22081, -22082, -22106, -22081, -22031, -22110, -22107, -22096, -22109, -22107, -22108, -22111, -22031, -22110, -22092, -22109, -22105, -22088, -22094, -22092, -22037, -22031};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f25856;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f25857;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f25858;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver f25859;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Runnable[] f25860;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f25861;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Handler f25862;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f25863;

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo6024(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ void mo6026(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ void mo6028(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ void mo6029(InterfaceC23586 interfaceC23586) {
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
    public C8453() {
        int iM6981;
        int i;
        ArrayList arrayList = null;
        Runnable[] runnableArr = null;
        int i2 = -640309843;
        int i3 = C3245.f10203;
        int i4 = C1294.f4556;
        int iM6982 = C2105.m6981("᩵֡") ^ i4;
        int i5 = ((iM6982 ^ i3) * (-3457)) ^ (-1525600094);
        int i6 = 1531004617;
        while (true) {
            int i7 = iM6982 ^ i6;
            Handler handler = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 19565) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2134438722:
                    case 1515134009:
                        C1128.m3851();
                        iM6982 = (i3 - C2105.m6981("֫۟")) * 45;
                        i5 = ((iM6982 ^ i4) * 3409) ^ 858602646;
                        i6 = -1420562015;
                        break;
                    case -1874450756:
                    case -1401488180:
                        this.f25862 = handler;
                        if (C4075.m12263() <= 0) {
                            iM6981 = (C2105.m6981("ܺܰ") ^ i4) * (-49);
                            i5 = ((iM6981 ^ i3) * 18589) ^ 1046017288;
                            i = -5278259;
                        } else {
                            iM6981 = (C2105.m6981("֨ۧ") + i4) * 59;
                            i5 = ((iM6981 ^ i3) * 15597) ^ (-1933196188);
                            i = 284155374;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1795058386:
                    case -1481150266:
                        if (C3746.f11829 > 0) {
                            iM6982 = C0630.m2566("֨۬") ^ i3;
                            i5 = ((iM6982 ^ i4) * (-131)) ^ (-1664535367);
                            i6 = -1853836596;
                        } else {
                            iM6982 = (i3 - C2105.m6981("֫۟")) * 45;
                            i5 = ((iM6982 ^ i4) * 3409) ^ 858602646;
                            i6 = -1420562015;
                        }
                        break;
                    case -1536719899:
                    case 1585018220:
                        C5695.m16023();
                        C7811.m20844();
                        throw new RuntimeException();
                    case -1311794126:
                    case -1275503392:
                        C1005.m3501();
                        if (C0237.f1507 != 0) {
                            iM6982 = (i3 - C2105.m6981("֫۟")) * 45;
                            i5 = ((iM6982 ^ i4) * 3409) ^ 858602646;
                            i6 = -1420562015;
                        }
                        iM6981 = (C2105.m6981("ܺܰ") ^ i4) * (-49);
                        i5 = ((iM6981 ^ i3) * 18589) ^ 1046017288;
                        i = -5278259;
                        i7 = iM6981 ^ i;
                        break;
                    case -1250630531:
                    case -196425426:
                        Looper looperM6980 = C2105.m6980();
                        if (RunnableC1937.m6387() == 0) {
                            if (C3537.f11231 >= 0) {
                                iM6982 = (i3 - C2105.m6981("֫۟")) * 45;
                                i5 = ((iM6982 ^ i4) * 3409) ^ 858602646;
                                i6 = -1420562015;
                                break;
                            } else if (C2520.f8000 < 0) {
                                if (C3911.f12484 < 0) {
                                    handler = new Handler(looperM6980);
                                    if (RunnableC1937.f6483 < 0) {
                                        iM6981 = (i3 - C2105.m6981("ᩳۚ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                        i5 = ((iM6981 ^ i4) * (-30045)) ^ (-91693260);
                                        i = 1911756555;
                                        i7 = iM6981 ^ i;
                                        break;
                                    }
                                }
                                iM6982 = C0630.m2566("ۜ᩶") ^ i4;
                                i5 = ((iM6982 ^ i3) * 28955) ^ 493944855;
                                i6 = -787152076;
                                break;
                            }
                        }
                        iM6982 = C0630.m2566("֨۬") ^ i3;
                        i5 = ((iM6982 ^ i4) * (-131)) ^ (-1664535367);
                        i6 = -1853836596;
                        break;
                    case -730263999:
                    case 1891961344:
                        this.f25856 = arrayList;
                        if (C11340.f33930 < 0) {
                            iM6981 = (i3 - C0630.m2566("ۙۢ")) * 3;
                            i5 = ((iM6981 ^ i4) * (-6743)) ^ (-1110913712);
                            i = 589913203;
                            i7 = iM6981 ^ i;
                        } else {
                            iM6982 = C0630.m2566("ۜ᩶") ^ i4;
                            i5 = ((iM6982 ^ i3) * 28955) ^ 493944855;
                            i6 = -787152076;
                        }
                        break;
                    case 9772184:
                    case 1145056206:
                        runnableArr = new Runnable[3];
                        if (C3245.f10203 <= 0) {
                            iM6981 = (C2105.m6981("ۙۚ") ^ i4) * (-19);
                            i5 = ((iM6981 ^ i3) * (-4783)) ^ 2140961442;
                            i = -1755415188;
                        } else {
                            iM6981 = C0630.m2566("᩺ܿ") ^ i3;
                            i5 = ((iM6981 ^ i4) * 6497) ^ (-1560258456);
                            i = 1096956303;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 252872460:
                    case 1662541282:
                        this.f25860 = runnableArr;
                        if (C22628.f73083 <= 0) {
                            iM6981 = (C2105.m6981("ܺܰ") ^ i4) * (-49);
                            i5 = ((iM6981 ^ i3) * 18589) ^ 1046017288;
                            i = -5278259;
                        } else {
                            iM6981 = (i4 - C0630.m2566("ۘ᩹")) * 95;
                            i5 = ((iM6981 ^ i3) * 24721) ^ (-483789954);
                            i = -985794535;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 821208170:
                    case 1204035968:
                        arrayList = new ArrayList();
                        if (C0050.f910 < 0) {
                            iM6981 = C2105.m6981("ᩳۤ") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-16991)) ^ 1126792595;
                            i = 2071102139;
                            i7 = iM6981 ^ i;
                        } else {
                            iM6982 = C0630.m2566("֨۬") ^ i3;
                            i5 = ((iM6982 ^ i4) * (-131)) ^ (-1664535367);
                            i6 = -1853836596;
                        }
                        break;
                    case 920581167:
                    case 1308233327:
                        this.f25859 = new C1397(this);
                        return;
                    default:
                        C0964.m3413();
                        if (C3019.f9544 >= 0) {
                            iM6982 = C0630.m2566("֨۬") ^ i3;
                            i5 = ((iM6982 ^ i4) * (-131)) ^ (-1664535367);
                            i6 = -1853836596;
                        }
                        iM6981 = (C2105.m6981("ۙۚ") ^ i4) * (-19);
                        i5 = ((iM6981 ^ i3) * (-4783)) ^ 2140961442;
                        i = -1755415188;
                        i7 = iM6981 ^ i;
                        break;
                }
            }
        }
    }

    static {
        String str;
        int i;
        String[] strArr;
        int i2;
        int i3;
        short[] sArr;
        String strM5917;
        short[] sArr2;
        int iM6981;
        int i4;
        short[] sArr3;
        String str2;
        String str3;
        int i5;
        int iM2566;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iM6982;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iM6983;
        int iM6984;
        int i18;
        String str4 = null;
        String[] strArr2 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i19 = C2520.f8000;
        int i20 = C3683.f11629;
        int iM6985 = C2105.m6981("ۤۢ") ^ i20;
        int i21 = ((iM6985 ^ i19) * (-16235)) ^ (-675606742);
        int i22 = iM6985 ^ 1552986992;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1891017409;
        String strM12252 = null;
        String str5 = null;
        String str6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        String strM3603 = null;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        short s = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        while (true) {
            i26 = i22 ^ ((((i26 ^ i19) * 18793) >> 31) & i21);
            switch (i26) {
                case -2077215967:
                case 862064711:
                    sArr8 = sArr8;
                    i33 = i33;
                    str = strM3603;
                    str4 = str4;
                    strM12252 = strM12252;
                    i = i27;
                    short[] sArr9 = sArr7;
                    strArr = strArr2;
                    i2 = i31;
                    i3 = i32;
                    sArr = sArr9;
                    if (C4616.f14690 <= 0) {
                        iM2566 = C0630.m2566("۬ۡ") ^ i19;
                        i6 = ((iM2566 ^ i20) * 2673) ^ 465013443;
                        i7 = -2097094026;
                        int i34 = iM2566 ^ i7;
                        strM3603 = str;
                        i21 = i6;
                        str4 = str4;
                        sArr8 = sArr8;
                        i22 = i34;
                        i27 = i;
                        strM12252 = strM12252;
                        i33 = i33;
                        int i35 = i3;
                        i31 = i2;
                        strArr2 = strArr;
                        sArr7 = sArr;
                        i32 = i35;
                    } else {
                        sArr2 = sArr8;
                        strM5917 = str6;
                        str6 = strM5917;
                        int iM2567 = (C0630.m2566("۟۠") ^ i19) * (-59);
                        strM3603 = str;
                        i21 = ((iM2567 ^ i20) * (-25811)) ^ 403728060;
                        i22 = iM2567 ^ 1223007817;
                        i27 = i;
                        strM12252 = strM12252;
                        i33 = i33;
                        String str7 = str4;
                        sArr8 = sArr2;
                        str4 = str7;
                        int i36 = i3;
                        i31 = i2;
                        strArr2 = strArr;
                        sArr7 = sArr;
                        i32 = i36;
                    }
                    break;
                case -2046503659:
                case 594295466:
                    sArr8 = sArr8;
                    i33 = i33;
                    String str8 = strM3603;
                    str4 = str4;
                    strM12252 = strM12252;
                    i = i27;
                    short[] sArr10 = sArr7;
                    strArr2 = strArr2;
                    i31 = i31;
                    i11 = i32;
                    sArr7 = sArr10;
                    i25 = i24 + 216796176;
                    if (C0630.m2564()) {
                        strM3603 = str8;
                        i8 = i11;
                        i31 = i31;
                        int iM6986 = C2105.m6981("֨ܽ") ^ i20;
                        i13 = -941267137;
                        i14 = i8;
                        iM6982 = iM6986;
                        i12 = ((iM6986 ^ i19) * (-12915)) ^ 1355326554;
                    } else {
                        iM6982 = (C2105.m6981("ۚ֡") ^ i20) * (-39);
                        i12 = ((iM6982 ^ i19) * 32533) ^ (-394055040);
                        strM3603 = str8;
                        i13 = -839440272;
                        i31 = i31;
                        i14 = i11;
                    }
                    int i37 = iM6982 ^ i13;
                    i21 = i12;
                    i9 = i37;
                    i27 = i;
                    short[] sArr11 = sArr7;
                    i32 = i14;
                    strArr2 = strArr2;
                    sArr7 = sArr11;
                    strM12252 = strM12252;
                    i33 = i33;
                    short[] sArr12 = sArr8;
                    i22 = i9;
                    str4 = str4;
                    sArr8 = sArr12;
                    break;
                case -1989003555:
                case 2129262635:
                    sArr8 = sArr8;
                    i33 = i33;
                    str4 = str4;
                    strM12252 = strM12252;
                    i = i27;
                    short[] sArr13 = sArr7;
                    strArr2 = strArr2;
                    i31 = i31;
                    i11 = i32;
                    sArr7 = sArr13;
                    strM3603 = C1047.m3603(f25855, 1, 48, i29);
                    if (!RunnableC1108.m3790()) {
                        int iM2568 = (C0630.m2566("ᩳܰ") + i20) * 11;
                        i9 = iM2568 ^ 961696396;
                        i15 = ((iM2568 ^ i19) * 23245) ^ (-1716427399);
                        i21 = i15;
                        i27 = i;
                        int i38 = i11;
                        i31 = i31;
                        strArr2 = strArr2;
                        sArr7 = sArr7;
                        i32 = i38;
                        strM12252 = strM12252;
                        i33 = i33;
                        short[] sArr14 = sArr8;
                        i22 = i9;
                        str4 = str4;
                        sArr8 = sArr14;
                    }
                    i8 = i11;
                    i31 = i31;
                    int iM6987 = C2105.m6981("֨ܽ") ^ i20;
                    i13 = -941267137;
                    i14 = i8;
                    iM6982 = iM6987;
                    i12 = ((iM6987 ^ i19) * (-12915)) ^ 1355326554;
                    int i39 = iM6982 ^ i13;
                    i21 = i12;
                    i9 = i39;
                    i27 = i;
                    short[] sArr15 = sArr7;
                    i32 = i14;
                    strArr2 = strArr2;
                    sArr7 = sArr15;
                    strM12252 = strM12252;
                    i33 = i33;
                    short[] sArr16 = sArr8;
                    i22 = i9;
                    str4 = str4;
                    sArr8 = sArr16;
                    break;
                case -1963780631:
                case -1196782110:
                    sArr8 = sArr8;
                    i33 = i33;
                    strM3603 = strM3603;
                    str4 = str4;
                    strM12252 = strM12252;
                    short[] sArr17 = sArr7;
                    strArr2 = strArr2;
                    i31 = i31;
                    i11 = i32;
                    sArr7 = sArr17;
                    sArr4 = f25855;
                    if (RunnableC3474.f10992 > 0) {
                        int iM6988 = C2105.m6981("ۚۡ") ^ i20;
                        i16 = -924093928;
                        i27 = 49;
                        i17 = ((iM6988 ^ i19) * 29617) ^ (-1758517299);
                        iM6983 = iM6988;
                        int i40 = i17;
                        i9 = iM6983 ^ i16;
                        i27 = i27;
                        i10 = i40;
                        strM3603 = strM3603;
                        i21 = i10;
                        int i310 = i11;
                        i31 = i31;
                        strArr2 = strArr2;
                        sArr7 = sArr7;
                        i32 = i310;
                        strM12252 = strM12252;
                        i33 = i33;
                        short[] sArr18 = sArr8;
                        i22 = i9;
                        str4 = str4;
                        sArr8 = sArr18;
                    } else {
                        i27 = 49;
                        int iM6989 = C2105.m6981("᩷֨") ^ i19;
                        i = i27;
                        i15 = ((iM6989 ^ i20) * (-19829)) ^ 6347874;
                        i9 = iM6989 ^ 1974690235;
                        strM3603 = strM3603;
                        i21 = i15;
                        i27 = i;
                        int i311 = i11;
                        i31 = i31;
                        strArr2 = strArr2;
                        sArr7 = sArr7;
                        i32 = i311;
                        strM12252 = strM12252;
                        i33 = i33;
                        short[] sArr19 = sArr8;
                        i22 = i9;
                        str4 = str4;
                        sArr8 = sArr19;
                    }
                    break;
                case -1900445336:
                case -1714754816:
                    ServiceConnectionC3453.m10564();
                    throw new RuntimeException();
                case -1775002728:
                case 145028951:
                    sArr8 = sArr8;
                    i33 = i33;
                    str = strM3603;
                    str4 = str4;
                    strM12252 = strM12252;
                    i = i27;
                    short[] sArr20 = sArr7;
                    strArr = strArr2;
                    i2 = i31;
                    i3 = i32;
                    sArr = sArr20;
                    C1294.m4372();
                    sArr2 = sArr8;
                    strM5917 = str6;
                    str6 = strM5917;
                    int iM2569 = (C0630.m2566("۟۠") ^ i19) * (-59);
                    strM3603 = str;
                    i21 = ((iM2569 ^ i20) * (-25811)) ^ 403728060;
                    i22 = iM2569 ^ 1223007817;
                    i27 = i;
                    strM12252 = strM12252;
                    i33 = i33;
                    String str9 = str4;
                    sArr8 = sArr2;
                    str4 = str9;
                    int i312 = i3;
                    i31 = i2;
                    strArr2 = strArr;
                    sArr7 = sArr;
                    i32 = i312;
                    break;
                case -1727765695:
                case -1617810067:
                    i29 = 26723;
                    iM6983 = (C2105.m6981("ۡᩴ") + i19) * (-105);
                    i11 = i32;
                    i17 = ((iM6983 ^ i20) * (-23573)) ^ 2086323634;
                    i16 = -940671734;
                    int i41 = i17;
                    i9 = iM6983 ^ i16;
                    i27 = i27;
                    i10 = i41;
                    strM3603 = strM3603;
                    i21 = i10;
                    int i313 = i11;
                    i31 = i31;
                    strArr2 = strArr2;
                    sArr7 = sArr7;
                    i32 = i313;
                    strM12252 = strM12252;
                    i33 = i33;
                    short[] sArr110 = sArr8;
                    i22 = i9;
                    str4 = str4;
                    sArr8 = sArr110;
                    break;
                case -1476495726:
                case -382828225:
                    int i42 = i32;
                    short[] sArr21 = sArr8;
                    i33 = i33;
                    str = strM3603;
                    strM12252 = strM12252;
                    i = i27;
                    short[] sArr22 = sArr7;
                    strArr = strArr2;
                    i2 = i31;
                    String strM8030 = C2520.m8030(sArr22, i42, i2, i29);
                    short[] sArr23 = f25855;
                    if (C11340.f33930 >= 0) {
                        int iM69810 = C2105.m6981("ܰۗ") ^ i20;
                        int i43 = ((iM69810 ^ i19) * (-18719)) ^ 394594665;
                        i3 = i42;
                        str4 = strM8030;
                        sArr3 = sArr21;
                        sArr6 = sArr23;
                        iM6981 = iM69810;
                        str2 = str6;
                        i23 = 38;
                        sArr = sArr22;
                        i4 = i43;
                        str3 = str5;
                        i30 = DHParameters.DEFAULT_MINIMUM_LENGTH;
                        i5 = -1644363139;
                    } else {
                        int iM25610 = (C0630.m2566("ۨܰ") ^ i19) * (-17);
                        sArr = sArr22;
                        i4 = ((iM25610 ^ i20) * 293) ^ (-811314515);
                        i3 = i42;
                        str4 = strM8030;
                        sArr3 = sArr21;
                        sArr6 = sArr23;
                        iM6981 = iM25610;
                        str2 = str6;
                        i23 = 38;
                        i30 = DHParameters.DEFAULT_MINIMUM_LENGTH;
                        str3 = str5;
                        i5 = -1311518691;
                    }
                    i22 = iM6981 ^ i5;
                    str5 = str3;
                    str6 = str2;
                    sArr8 = sArr3;
                    strM3603 = str;
                    i21 = i4;
                    i27 = i;
                    strM12252 = strM12252;
                    i33 = i33;
                    int i314 = i3;
                    i31 = i2;
                    strArr2 = strArr;
                    sArr7 = sArr;
                    i32 = i314;
                    break;
                case -1474842909:
                case 1975848218:
                    sArr8 = sArr8;
                    i33 = i33;
                    str = strM3603;
                    strM12252 = strM12252;
                    i = i27;
                    s = f25855[0];
                    i24 = s * s;
                    if (C3432.f10845 >= 0) {
                        short[] sArr24 = sArr7;
                        strArr = strArr2;
                        i2 = i31;
                        i3 = i32;
                        sArr = sArr24;
                        iM2566 = C0630.m2566("۬ۡ") ^ i19;
                        i6 = ((iM2566 ^ i20) * 2673) ^ 465013443;
                        i7 = -2097094026;
                    } else {
                        iM2566 = C0630.m2566("۬ܽ") ^ i19;
                        str4 = str4;
                        i6 = ((iM2566 ^ i20) * (-28463)) ^ (-1170602153);
                        i7 = -1463275729;
                        short[] sArr25 = sArr7;
                        strArr = strArr2;
                        i2 = i31;
                        i3 = i32;
                        sArr = sArr25;
                    }
                    int i315 = iM2566 ^ i7;
                    strM3603 = str;
                    i21 = i6;
                    str4 = str4;
                    sArr8 = sArr8;
                    i22 = i315;
                    i27 = i;
                    strM12252 = strM12252;
                    i33 = i33;
                    int i316 = i3;
                    i31 = i2;
                    strArr2 = strArr;
                    sArr7 = sArr;
                    i32 = i316;
                    break;
                case -926248028:
                case -32205826:
                    sArr8 = sArr8;
                    i33 = i33;
                    str = strM3603;
                    strM12252 = strM12252;
                    i = i27;
                    if (!C1504.m5179()) {
                        short[] sArr26 = sArr7;
                        strArr = strArr2;
                        i2 = i31;
                        i3 = i32;
                        sArr = sArr26;
                        iM2566 = C0630.m2566("۬ۡ") ^ i19;
                        i6 = ((iM2566 ^ i20) * 2673) ^ 465013443;
                        i7 = -2097094026;
                        int i317 = iM2566 ^ i7;
                        strM3603 = str;
                        i21 = i6;
                        str4 = str4;
                        sArr8 = sArr8;
                        i22 = i317;
                        i27 = i;
                        strM12252 = strM12252;
                        i33 = i33;
                        int i318 = i3;
                        i31 = i2;
                        strArr2 = strArr;
                        sArr7 = sArr;
                        i32 = i318;
                    } else {
                        strM3603 = str;
                        i8 = i32;
                        sArr7 = sArr7;
                        strArr2 = strArr2;
                        int iM69811 = C2105.m6981("֨ܽ") ^ i20;
                        i13 = -941267137;
                        i14 = i8;
                        iM6982 = iM69811;
                        i12 = ((iM69811 ^ i19) * (-12915)) ^ 1355326554;
                        int i319 = iM6982 ^ i13;
                        i21 = i12;
                        i9 = i319;
                        i27 = i;
                        short[] sArr111 = sArr7;
                        i32 = i14;
                        strArr2 = strArr2;
                        sArr7 = sArr111;
                        strM12252 = strM12252;
                        i33 = i33;
                        short[] sArr112 = sArr8;
                        i22 = i9;
                        str4 = str4;
                        sArr8 = sArr112;
                    }
                    break;
                case -856354138:
                case 1150179867:
                    i29 = 39578;
                    iM6983 = (C2105.m6981("ۡᩴ") + i19) * (-105);
                    i11 = i32;
                    i17 = ((iM6983 ^ i20) * (-23573)) ^ 2086323634;
                    i16 = -940671734;
                    int i44 = i17;
                    i9 = iM6983 ^ i16;
                    i27 = i27;
                    i10 = i44;
                    strM3603 = strM3603;
                    i21 = i10;
                    int i3110 = i11;
                    i31 = i31;
                    strArr2 = strArr2;
                    sArr7 = sArr7;
                    i32 = i3110;
                    strM12252 = strM12252;
                    i33 = i33;
                    short[] sArr113 = sArr8;
                    i22 = i9;
                    str4 = str4;
                    sArr8 = sArr113;
                    break;
                case -451870869:
                case 870185769:
                    f25852 = new String[]{C4159.m12578(sArr8, 309, 25, i29), str5, str6};
                    return;
                case -364915320:
                case 73465610:
                    i33 = i33;
                    String str10 = strM3603;
                    String str11 = strM12252;
                    i = i27;
                    f25853 = new String[]{C1916.m6311(sArr5, i33, i28, i29), str10, str11};
                    sArr7 = f25855;
                    i31 = 56;
                    if (C0237.m1481() >= 0) {
                        strM12252 = str11;
                        strM3603 = str10;
                        sArr7 = sArr7;
                        sArr8 = sArr8;
                        i8 = IShizukuService.Stub.TRANSACTION_isHidden;
                        strArr2 = strArr2;
                        int iM69812 = C2105.m6981("֨ܽ") ^ i20;
                        i13 = -941267137;
                        i14 = i8;
                        iM6982 = iM69812;
                        i12 = ((iM69812 ^ i19) * (-12915)) ^ 1355326554;
                        int i3111 = iM6982 ^ i13;
                        i21 = i12;
                        i9 = i3111;
                        i27 = i;
                        short[] sArr114 = sArr7;
                        i32 = i14;
                        strArr2 = strArr2;
                        sArr7 = sArr114;
                        strM12252 = strM12252;
                        i33 = i33;
                        short[] sArr115 = sArr8;
                        i22 = i9;
                        str4 = str4;
                        sArr8 = sArr115;
                    } else {
                        int iM69813 = (i20 - C2105.m6981("ܺ᩺")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        int i45 = ((iM69813 ^ i19) * 4969) ^ (-383022210);
                        i22 = iM69813 ^ (-1817498595);
                        i32 = IShizukuService.Stub.TRANSACTION_isHidden;
                        strM3603 = str10;
                        i21 = i45;
                        i27 = i;
                        strM12252 = str11;
                        i33 = i33;
                    }
                    break;
                case 197740857:
                case 1048282521:
                    strArr2 = new String[]{C7106.m19110(f25855, 198, 33, i29), str4, C22628.m50602(sArr6, i30, i23, i29)};
                    if (C21923.f70183 == 0) {
                        int iM25611 = C0630.m2566("ۛܽ") ^ i19;
                        int i46 = ((iM25611 ^ i20) * (-19979)) ^ (-1621315953);
                        strM3603 = strM3603;
                        short[] sArr27 = sArr8;
                        str4 = str4;
                        i9 = iM25611 ^ (-1084750206);
                        i33 = i33;
                        strM12252 = strM12252;
                        i10 = i46;
                        sArr8 = sArr27;
                        short[] sArr28 = sArr7;
                        strArr2 = strArr2;
                        i31 = i31;
                        i11 = i32;
                        sArr7 = sArr28;
                        strM3603 = strM3603;
                        i21 = i10;
                        int i3112 = i11;
                        i31 = i31;
                        strArr2 = strArr2;
                        sArr7 = sArr7;
                        i32 = i3112;
                        strM12252 = strM12252;
                        i33 = i33;
                        short[] sArr116 = sArr8;
                        i22 = i9;
                        str4 = str4;
                        sArr8 = sArr116;
                    } else {
                        sArr8 = sArr8;
                        i33 = i33;
                        str = strM3603;
                        strM12252 = strM12252;
                        i = i27;
                        short[] sArr29 = sArr7;
                        strArr = strArr2;
                        i2 = i31;
                        i3 = i32;
                        sArr = sArr29;
                        iM2566 = C0630.m2566("۬ۡ") ^ i19;
                        i6 = ((iM2566 ^ i20) * 2673) ^ 465013443;
                        i7 = -2097094026;
                        int i3113 = iM2566 ^ i7;
                        strM3603 = str;
                        i21 = i6;
                        str4 = str4;
                        sArr8 = sArr8;
                        i22 = i3113;
                        i27 = i;
                        strM12252 = strM12252;
                        i33 = i33;
                        int i3114 = i3;
                        i31 = i2;
                        strArr2 = strArr;
                        sArr7 = sArr;
                        i32 = i3114;
                    }
                    break;
                case 581891328:
                case 1769612855:
                    C2958.m9034();
                    sArr8 = sArr8;
                    if (C4075.m12263() > 0) {
                        i33 = i33;
                        strM3603 = strM3603;
                        str4 = str4;
                        strM12252 = strM12252;
                        short[] sArr30 = sArr7;
                        strArr2 = strArr2;
                        i31 = i31;
                        i11 = i32;
                        sArr7 = sArr30;
                        int iM69814 = C2105.m6981("᩷֨") ^ i19;
                        i = i27;
                        i15 = ((iM69814 ^ i20) * (-19829)) ^ 6347874;
                        i9 = iM69814 ^ 1974690235;
                        strM3603 = strM3603;
                        i21 = i15;
                        i27 = i;
                        int i3115 = i11;
                        i31 = i31;
                        strArr2 = strArr2;
                        sArr7 = sArr7;
                        i32 = i3115;
                        strM12252 = strM12252;
                        i33 = i33;
                        short[] sArr117 = sArr8;
                        i22 = i9;
                        str4 = str4;
                        sArr8 = sArr117;
                    } else {
                        i33 = i33;
                        str = strM3603;
                        str4 = str4;
                        strM12252 = strM12252;
                        i = i27;
                        short[] sArr31 = sArr7;
                        strArr = strArr2;
                        i2 = i31;
                        i3 = i32;
                        sArr = sArr31;
                        sArr2 = sArr8;
                        strM5917 = str6;
                        str6 = strM5917;
                        int iM25612 = (C0630.m2566("۟۠") ^ i19) * (-59);
                        strM3603 = str;
                        i21 = ((iM25612 ^ i20) * (-25811)) ^ 403728060;
                        i22 = iM25612 ^ 1223007817;
                        i27 = i;
                        strM12252 = strM12252;
                        i33 = i33;
                        String str12 = str4;
                        sArr8 = sArr2;
                        str4 = str12;
                        int i3116 = i3;
                        i31 = i2;
                        strArr2 = strArr;
                        sArr7 = sArr;
                        i32 = i3116;
                    }
                    break;
                case 888455468:
                case 888935700:
                    f25854 = strArr2;
                    String strM2575 = C0630.m2575(f25855, 231, 48, i29);
                    if (C1128.f4106 > 0) {
                        iM6981 = C2105.m6981("ۢۨ") ^ i20;
                        i5 = -1483025406;
                        String str13 = strM12252;
                        i = i27;
                        i4 = ((iM6981 ^ i19) * (-30641)) ^ (-2144888208);
                        str = strM3603;
                        sArr3 = sArr8;
                        str2 = str6;
                        str3 = strM2575;
                        i33 = i33;
                        strM12252 = str13;
                        short[] sArr32 = sArr7;
                        strArr = strArr2;
                        i2 = i31;
                        i3 = i32;
                        sArr = sArr32;
                        i22 = iM6981 ^ i5;
                        str5 = str3;
                        str6 = str2;
                        sArr8 = sArr3;
                        strM3603 = str;
                        i21 = i4;
                        i27 = i;
                        strM12252 = strM12252;
                        i33 = i33;
                        int i3117 = i3;
                        i31 = i2;
                        strArr2 = strArr;
                        sArr7 = sArr;
                        i32 = i3117;
                    } else {
                        str5 = strM2575;
                        sArr8 = sArr8;
                        i33 = i33;
                        str = strM3603;
                        strM12252 = strM12252;
                        i = i27;
                        short[] sArr210 = sArr7;
                        strArr = strArr2;
                        i2 = i31;
                        i3 = i32;
                        sArr = sArr210;
                        iM2566 = C0630.m2566("۬ۡ") ^ i19;
                        i6 = ((iM2566 ^ i20) * 2673) ^ 465013443;
                        i7 = -2097094026;
                        int i3118 = iM2566 ^ i7;
                        strM3603 = str;
                        i21 = i6;
                        str4 = str4;
                        sArr8 = sArr8;
                        i22 = i3118;
                        i27 = i;
                        strM12252 = strM12252;
                        i33 = i33;
                        int i3119 = i3;
                        i31 = i2;
                        strArr2 = strArr;
                        sArr7 = sArr;
                        i32 = i3119;
                    }
                    break;
                case 1013737650:
                case 1422898401:
                    strM12252 = C4075.m12252(sArr4, i27, 30, i29);
                    sArr5 = f25855;
                    i28 = 25;
                    if (RunnableC1108.f4040) {
                        int iM25613 = C0630.m2566("ۗۚ") ^ i19;
                        i21 = (-267487816) ^ ((iM25613 ^ i20) * 31665);
                        i22 = (-1882919491) ^ iM25613;
                        i33 = 79;
                    } else {
                        i33 = 79;
                        strM12252 = strM12252;
                        str = strM3603;
                        i = i27;
                        short[] sArr33 = sArr8;
                        str4 = str4;
                        sArr2 = sArr33;
                        short[] sArr34 = sArr7;
                        strArr = strArr2;
                        i2 = i31;
                        i3 = i32;
                        sArr = sArr34;
                        int iM25614 = (C0630.m2566("۟۠") ^ i19) * (-59);
                        strM3603 = str;
                        i21 = ((iM25614 ^ i20) * (-25811)) ^ 403728060;
                        i22 = iM25614 ^ 1223007817;
                        i27 = i;
                        strM12252 = strM12252;
                        i33 = i33;
                        String str14 = str4;
                        sArr8 = sArr2;
                        str4 = str14;
                        int i31110 = i3;
                        i31 = i2;
                        strArr2 = strArr;
                        sArr7 = sArr;
                        i32 = i31110;
                    }
                    break;
                case 1541477260:
                case 1922930474:
                    int i47 = s + 14724;
                    if ((i25 + i25) - (i47 * i47) < 0) {
                        iM6984 = C2105.m6981("ۡۢ") ^ i19;
                        i18 = ((iM6984 ^ i20) * 13773) ^ (-1299068411);
                        i13 = 1196492499;
                    } else {
                        iM6984 = C2105.m6981("᩵ܳ") ^ i20;
                        i18 = ((iM6984 ^ i19) * 32383) ^ (-326058827);
                        i13 = 1796659166;
                    }
                    String str15 = strM12252;
                    i = i27;
                    iM6982 = iM6984;
                    i33 = i33;
                    strM12252 = str15;
                    short[] sArr35 = sArr8;
                    str4 = str4;
                    i12 = i18;
                    sArr8 = sArr35;
                    short[] sArr36 = sArr7;
                    strArr2 = strArr2;
                    i14 = i32;
                    sArr7 = sArr36;
                    int i31111 = iM6982 ^ i13;
                    i21 = i12;
                    i9 = i31111;
                    i27 = i;
                    short[] sArr118 = sArr7;
                    i32 = i14;
                    strArr2 = strArr2;
                    sArr7 = sArr118;
                    strM12252 = strM12252;
                    i33 = i33;
                    short[] sArr119 = sArr8;
                    i22 = i9;
                    str4 = str4;
                    sArr8 = sArr119;
                    break;
                default:
                    str4 = str4;
                    i33 = i33;
                    str = strM3603;
                    strM12252 = strM12252;
                    i = i27;
                    short[] sArr37 = sArr7;
                    strArr = strArr2;
                    i2 = i31;
                    i3 = i32;
                    sArr = sArr37;
                    strM5917 = C1773.m5917(f25855, 279, 30, i29);
                    sArr2 = f25855;
                    if (!C3683.m11222()) {
                        iM6981 = (C2105.m6981("ۡ֫") ^ i20) * q.h;
                        i4 = ((iM6981 ^ i19) * (-26999)) ^ (-957427211);
                        sArr3 = sArr2;
                        str4 = str4;
                        str2 = strM5917;
                        str3 = str5;
                        i5 = -2132226816;
                        i22 = iM6981 ^ i5;
                        str5 = str3;
                        str6 = str2;
                        sArr8 = sArr3;
                        strM3603 = str;
                        i21 = i4;
                        i27 = i;
                        strM12252 = strM12252;
                        i33 = i33;
                        int i31112 = i3;
                        i31 = i2;
                        strArr2 = strArr;
                        sArr7 = sArr;
                        i32 = i31112;
                    } else {
                        str6 = strM5917;
                        int iM25615 = (C0630.m2566("۟۠") ^ i19) * (-59);
                        strM3603 = str;
                        i21 = ((iM25615 ^ i20) * (-25811)) ^ 403728060;
                        i22 = iM25615 ^ 1223007817;
                        i27 = i;
                        strM12252 = strM12252;
                        i33 = i33;
                        String str16 = str4;
                        sArr8 = sArr2;
                        str4 = str16;
                        int i31113 = i3;
                        i31 = i2;
                        strArr2 = strArr;
                        sArr7 = sArr;
                        i32 = i31113;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x010f A[PHI: r6 r7 r8
      0x010f: PHI (r6v4 int) = (r6v3 int), (r6v2 int) binds: [B:32:0x010d, B:23:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:32:0x010d, B:23:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:32:0x010d, B:23:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0195 A[PHI: r26
      0x0195: PHI (r26v5 java.lang.String) = (r26v4 java.lang.String), (r26v3 java.lang.String), (r26v3 java.lang.String) binds: [B:45:0x0193, B:15:0x0084, B:12:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0265 A[PHI: r2 r4 r12 r13 r14 r18 r19
      0x0265: PHI (r2v9 int) = (r2v2 int), (r2v2 int), (r2v4 int), (r2v2 int), (r2v2 int) binds: [B:61:0x0263, B:9:0x0076, B:85:0x0265, B:86:0x0265, B:84:0x0265] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r4v7 java.lang.String) = 
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v8 java.lang.String)
     binds: [B:61:0x0263, B:9:0x0076, B:85:0x0265, B:86:0x0265, B:84:0x0265] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r12v7 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v8 short[]) binds: [B:61:0x0263, B:9:0x0076, B:85:0x0265, B:86:0x0265, B:84:0x0265] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r13v8 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:61:0x0263, B:9:0x0076, B:85:0x0265, B:86:0x0265, B:84:0x0265] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r14v8 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:61:0x0263, B:9:0x0076, B:85:0x0265, B:86:0x0265, B:84:0x0265] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r18v11 short) = (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:61:0x0263, B:9:0x0076, B:85:0x0265, B:86:0x0265, B:84:0x0265] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r19v7 short) = (r19v3 short), (r19v2 short), (r19v2 short), (r19v2 short), (r19v2 short) binds: [B:61:0x0263, B:9:0x0076, B:85:0x0265, B:86:0x0265, B:84:0x0265] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0299 A[PHI: r3 r9 r10 r11 r16 r17
      0x0299: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v4 java.lang.String) binds: [B:65:0x0297, B:12:0x007e, B:9:0x0076, B:83:0x0299] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r9v3 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v2 short[]), (r9v4 short[]) binds: [B:65:0x0297, B:12:0x007e, B:9:0x0076, B:83:0x0299] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:65:0x0297, B:12:0x007e, B:9:0x0076, B:83:0x0299] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:65:0x0297, B:12:0x007e, B:9:0x0076, B:83:0x0299] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:65:0x0297, B:12:0x007e, B:9:0x0076, B:83:0x0299] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:65:0x0297, B:12:0x007e, B:9:0x0076, B:83:0x0299] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0084, code lost:
    
        if (l.C0798.f2919 != false) goto L16;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] m22131(Context context) {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        short s;
        Context context2 = context;
        int i4 = C4616.f14690;
        int i5 = C3019.f9544;
        int iM2568 = C0630.m2566("ܽܺ") ^ i4;
        int i6 = ((iM2568 ^ i5) * 23441) ^ 7298793;
        String strM3789 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM2568 ^ 1001266459;
        int iM2569 = 0;
        int iM25610 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        short s2 = 0;
        short s3 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1496101987;
        String strM946 = null;
        String strM947 = null;
        int iM25611 = 0;
        while (true) {
            i16 = i7 ^ (i6 & (((i16 ^ i5) * (-2333)) >> 31));
            switch (i16) {
                case -2122140442:
                case 735306967:
                    C3746.m11369();
                    C3019.m9255();
                    return null;
                case -2057040970:
                case 1857045648:
                    i14 = s2 * s3;
                    s = s2;
                    int i17 = s + 18478;
                    if (C2272.f7362) {
                        i15 = i17;
                        int iM6981 = C2105.m6981("᩻ܶ") ^ i4;
                        i7 = iM6981 ^ (-1489349059);
                        s2 = s;
                        i6 = ((iM6981 ^ i5) * (-26415)) ^ (-697936342);
                    } else {
                        int iM6982 = (C2105.m6981("ۛۗ") + i5) * (-21);
                        s2 = s;
                        i7 = iM6982 ^ 1999745854;
                        i15 = i17;
                        i6 = ((iM6982 ^ i4) * 30255) ^ (-2139311593);
                    }
                    context2 = context;
                    break;
                case -2047034852:
                case 471250649:
                    i11 = 348;
                    i12 = 3;
                    if (RunnableC3474.f10992 > 0) {
                        iM2566 = (i5 - C0630.m2566("ۢ۫")) * (-33);
                        i = ((iM2566 ^ i4) * 31037) ^ 1794057929;
                        i2 = -983359942;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        iM2567 = C0630.m2566("ۤ۬") ^ i5;
                        i6 = ((iM2567 ^ i4) * 16749) ^ (-240785456);
                        i3 = 577492135;
                        i7 = iM2567 ^ i3;
                        context2 = context;
                    }
                    break;
                case -1937338523:
                case 118402447:
                    C11340.m28031();
                    C2105.m6982();
                    s = s2;
                    int iM6983 = C2105.m6981("᩻ܶ") ^ i4;
                    i7 = iM6983 ^ (-1489349059);
                    s2 = s;
                    i6 = ((iM6983 ^ i5) * (-26415)) ^ (-697936342);
                    context2 = context;
                    break;
                case -1691712701:
                case -1569115745:
                    iM25610 = C0630.m2566(C3683.m11225(sArr3, i11, i12, i13));
                    i8 = 2120911916;
                    if (C0714.f2697 >= 0) {
                        iM2566 = (i4 - C0630.m2566("ۢ֡")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2566 ^ i5) * (-2839)) ^ 129985650;
                        i2 = -2137606481;
                    } else {
                        iM2566 = C0630.m2566("ܶܿ") ^ i5;
                        i = ((iM2566 ^ i4) * (-3467)) ^ (-844652160);
                        i2 = -1875010191;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1684936110:
                case 487924806:
                    sArr = f25855;
                    c = 341;
                    if (C3663.m11168() >= 0) {
                        iM2567 = (i4 - C2105.m6981("ᩳۖ")) * 45;
                        i6 = ((iM2567 ^ i5) * 12719) ^ (-660049312);
                        i3 = -1453179421;
                    } else {
                        iM2567 = C0630.m2566("۫ܰ") ^ i4;
                        i6 = ((iM2567 ^ i5) * 18777) ^ (-1082705275);
                        i3 = 1319081821;
                    }
                    i7 = iM2567 ^ i3;
                    context2 = context;
                    break;
                case -1667865818:
                case -1376594087:
                    strM3789 = RunnableC1108.m3789(f25855, 342, 3, i13);
                    if (C2272.f7362) {
                        iM2567 = (C0630.m2566("ۖ᩹") + i5) * 115;
                        i6 = ((iM2567 ^ i4) * 19595) ^ 121939337;
                        i3 = 863666732;
                    } else {
                        iM2567 = C0630.m2566("᩶ܺ") ^ i5;
                        i6 = ((iM2567 ^ i4) * 4293) ^ (-229113994);
                        i3 = 544679951;
                    }
                    i7 = iM2567 ^ i3;
                    context2 = context;
                    break;
                case -1380342698:
                case 538762198:
                    iM2569 = C0630.m2566(C5695.m16034(sArr2, i9, i10, i13));
                    if (C3537.f11231 >= 0) {
                        iM2566 = (i4 - C0630.m2566("ۢ֡")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2566 ^ i5) * (-2839)) ^ 129985650;
                        i2 = -2137606481;
                    } else {
                        iM2566 = C0630.m2566("۫᩸") ^ i5;
                        i = ((iM2566 ^ i4) * (-20275)) ^ 1036054991;
                        i2 = 277479311;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1326309991:
                case 1358415401:
                    i13 = 38098;
                    iM2567 = C2105.m6981("۫֨") ^ i5;
                    i6 = ((iM2567 ^ i4) * (-11527)) ^ (-156500806);
                    i3 = 1899443915;
                    i7 = iM2567 ^ i3;
                    context2 = context;
                    break;
                case -1036397850:
                case 552647969:
                    strM947 = C0050.m946(context2, iM25611);
                    sArr2 = f25855;
                    i9 = 345;
                    i10 = 3;
                    if (!C0798.f2919) {
                        iM2566 = (i4 - C0630.m2566("ۜ᩹")) * 11;
                        i = ((iM2566 ^ i5) * 7077) ^ (-1779859243);
                        i2 = -1978361897;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        iM2567 = (i4 - C2105.m6981("ᩳۖ")) * 45;
                        i6 = ((iM2567 ^ i5) * 12719) ^ (-660049312);
                        i3 = -1453179421;
                        i7 = iM2567 ^ i3;
                        context2 = context;
                    }
                    break;
                case -841639301:
                case -556170359:
                    iM25611 = 2128381253 ^ C0630.m2566(strM3789);
                    if (RunnableC3474.f10992 > 0) {
                        iM2566 = C2105.m6981("᩹ۤ") ^ i4;
                        i = ((iM2566 ^ i5) * (-25865)) ^ 922487210;
                        i2 = -461293651;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        iM2567 = C0630.m2566("ۤ۬") ^ i5;
                        i6 = ((iM2567 ^ i4) * 16749) ^ (-240785456);
                        i3 = 577492135;
                        i7 = iM2567 ^ i3;
                        context2 = context;
                    }
                    break;
                case -808812065:
                case 162026327:
                    if (C3746.m11369() < 0) {
                        iM2567 = (C0630.m2566("ۖ᩹") + i5) * 115;
                        i6 = ((iM2567 ^ i4) * 19595) ^ 121939337;
                        i3 = 863666732;
                    } else {
                        iM2567 = (i4 - C2105.m6981("ᩳۖ")) * 45;
                        i6 = ((iM2567 ^ i5) * 12719) ^ (-660049312);
                        i3 = -1453179421;
                    }
                    i7 = iM2567 ^ i3;
                    context2 = context;
                    break;
                case -663813003:
                case 1646410886:
                    if (RunnableC3474.f10992 > 0) {
                        iM2567 = (i4 - C2105.m6981("ᩳۖ")) * 45;
                        i6 = ((iM2567 ^ i5) * 12719) ^ (-660049312);
                        i3 = -1453179421;
                    } else {
                        iM2567 = C0630.m2566("ۤ۬") ^ i5;
                        i6 = ((iM2567 ^ i4) * 16749) ^ (-240785456);
                        i3 = 577492135;
                    }
                    i7 = iM2567 ^ i3;
                    context2 = context;
                    break;
                case -359432099:
                case 1729556122:
                    break;
                case -313726203:
                case 2107437640:
                    return new String[]{strM947, strM946, C0422.m1958(context2, iM25610 ^ i8)};
                case -157547526:
                case 1966390097:
                    if (i14 - (i15 * i15) <= 0) {
                        iM2567 = (C0630.m2566("۟ۨ") + i4) * 127;
                        i6 = ((iM2567 ^ i5) * 5523) ^ 1458504909;
                        i3 = 1360566790;
                    } else {
                        iM2567 = (C0630.m2566("᩸ۡ") + i4) * 123;
                        i6 = ((iM2567 ^ i5) * 14817) ^ 669640275;
                        i3 = -853125222;
                    }
                    i7 = iM2567 ^ i3;
                    context2 = context;
                    break;
                case -85130128:
                case 1747227704:
                    s2 = sArr[c];
                    s3 = 73912;
                    if (C2126.f7087) {
                        iM2567 = C0630.m2566("ۤ۬") ^ i5;
                        i6 = ((iM2567 ^ i4) * 16749) ^ (-240785456);
                        i3 = 577492135;
                    } else {
                        iM2567 = (C2105.m6981("᩻ۜ") ^ i5) * 15;
                        i6 = ((iM2567 ^ i4) * 16129) ^ 1775829049;
                        i3 = -2110245809;
                    }
                    i7 = iM2567 ^ i3;
                    context2 = context;
                    break;
                case 1723335633:
                case 1958248057:
                    i13 = 43801;
                    iM2567 = C2105.m6981("۫֨") ^ i5;
                    i6 = ((iM2567 ^ i4) * (-11527)) ^ (-156500806);
                    i3 = 1899443915;
                    i7 = iM2567 ^ i3;
                    context2 = context;
                    break;
                default:
                    strM946 = C0050.m946(context2, 2124763013 ^ iM2569);
                    sArr3 = f25855;
                    if (C0964.f3626 == 0) {
                        iM2566 = (i4 - C0630.m2566("֡ۘ")) * (-91);
                        i = ((iM2566 ^ i5) * (-22295)) ^ 883349088;
                        i2 = 661582196;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        iM2567 = C0630.m2566("ۤ۬") ^ i5;
                        i6 = ((iM2567 ^ i4) * 16749) ^ (-240785456);
                        i3 = 577492135;
                        i7 = iM2567 ^ i3;
                        context2 = context;
                    }
                    break;
            }
        }
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ܽ */
    public final void mo6027(InterfaceC23586 interfaceC23586) {
        this.f25863 = false;
    }

    @Override // l.AbstractC5447
    /* JADX INFO: renamed from: ܽ */
    public final void mo15547() {
        boolean z = false;
        Runnable[] runnableArr = null;
        int i = 0;
        Runnable runnable = null;
        int i2 = 901864360;
        int i3 = RunnableC1937.f6483;
        int i4 = C3245.f10203;
        int iM2566 = C0630.m2566("ܺۡ") ^ i4;
        int i5 = ((iM2566 ^ i3) * (-25517)) ^ (-1564921127);
        int i6 = -1147724283;
        while (true) {
            i2 = ((((i2 ^ i3) * (-21103)) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2059800185:
                case -1098852652:
                    if (C0630.f2410 > 0) {
                        iM2566 = C2105.m6981("۟ۨ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-21203)) ^ (-1330267621);
                        i6 = -1960934065;
                    } else {
                        iM2566 = C0630.m2566("ܿۚ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 9323) ^ 1722286151;
                        i6 = 2025413160;
                    }
                    break;
                case -1992065478:
                case 71068895:
                    this.f25862.removeCallbacks(runnable);
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM2566 = C2105.m6981("ۚ֡") ^ i3;
                        i5 = ((iM2566 ^ i4) * 29423) ^ (-84178561);
                        i6 = -1611597107;
                    } else {
                        iM2566 = (C0630.m2566("ۨܺ") + i4) * (-83);
                        i5 = ((iM2566 ^ i3) * (-22749)) ^ (-1180461887);
                        i6 = 1131145806;
                    }
                    break;
                case -1973114631:
                case 1423947889:
                    if (C2167.m7155()) {
                        iM2566 = C0630.m2566("᩷ۧ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-3777)) ^ 191438141;
                        i6 = -1661291028;
                    } else {
                        iM2566 = C0630.m2566("֫ۧ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-24447)) ^ (-389087105);
                        i6 = -1942395325;
                    }
                    break;
                case -1861517572:
                case -1123837963:
                    runnableArr[i] = null;
                    iM2566 = (i4 - C2105.m6981("᩹۫")) * 23;
                    i5 = ((iM2566 ^ i3) * (-27791)) ^ (-1977397749);
                    i6 = 2095277668;
                    break;
                case -1859978279:
                case 1690345970:
                    i = 0;
                    iM2566 = C0630.m2566("ۙ֨") ^ i4;
                    i5 = ((iM2566 ^ i3) * 6455) ^ (-1730002903);
                    i6 = 1763798651;
                    break;
                case -1859960763:
                case 1686106462:
                    i++;
                    iM2566 = C0630.m2566("ۙ֨") ^ i4;
                    i5 = ((iM2566 ^ i3) * 6455) ^ (-1730002903);
                    i6 = 1763798651;
                    break;
                case -1712414582:
                case -675371476:
                    z = false;
                    z = false;
                    if (C3019.f9544 >= 0) {
                        iM2566 = C0630.m2566("ܿۚ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 9323) ^ 1722286151;
                        i6 = 2025413160;
                    } else {
                        iM2566 = (i4 - C2105.m6981("۬ۚ")) * 99;
                        i5 = ((iM2566 ^ i3) * 1573) ^ (-144813826);
                        i6 = 175027283;
                    }
                    break;
                case -1639072780:
                case 236191712:
                    C3683.m11222();
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM2566 = C0630.m2566("᩷ۧ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-3777)) ^ 191438141;
                        i6 = -1661291028;
                    } else {
                        iM2566 = C2105.m6981("۟ۨ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-21203)) ^ (-1330267621);
                        i6 = -1960934065;
                    }
                    break;
                case -1614518822:
                case -1452865842:
                    C4616.m13552();
                    if (C3432.f10845 < 0) {
                        iM2566 = (C0630.m2566("ᩳ۫") ^ i3) * (-121);
                        i5 = ((iM2566 ^ i4) * (-31535)) ^ (-262088699);
                        i6 = -1501868961;
                    } else {
                        iM2566 = C0630.m2566("ܿۚ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 9323) ^ 1722286151;
                        i6 = 2025413160;
                    }
                    break;
                case -1429726015:
                case 204663826:
                    C3537.m10746();
                    C4117.m12364();
                    iM2566 = C0630.m2566("ܿۚ") ^ i3;
                    i5 = ((iM2566 ^ i4) * 9323) ^ 1722286151;
                    i6 = 2025413160;
                    break;
                case -1371502409:
                case -344954858:
                    if (C1916.f6442) {
                        iM2566 = (C0630.m2566("ۗܽ") + i3) * (-113);
                        i5 = ((iM2566 ^ i4) * 2351) ^ 552756131;
                        i6 = -20376222;
                    } else {
                        iM2566 = C0630.m2566("᩷ۧ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-3777)) ^ 191438141;
                        i6 = -1661291028;
                    }
                    break;
                case -1015277088:
                case 596116639:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM2566 = C0630.m2566("ܿۚ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 9323) ^ 1722286151;
                        i6 = 2025413160;
                    } else {
                        iM2566 = C2105.m6981("ۖ᩹") ^ i3;
                        i5 = ((iM2566 ^ i4) * 26623) ^ (-886229495);
                        i6 = 49968082;
                    }
                    break;
                case -717404393:
                case 509361078:
                    runnable = runnableArr[i];
                    if (runnable != null) {
                        iM2566 = (C0630.m2566("ᩳۙ") + i3) * 57;
                        i5 = ((iM2566 ^ i4) * 30533) ^ 592959133;
                        i6 = 2018028207;
                    } else {
                        iM2566 = (i4 - C2105.m6981("᩹۫")) * 23;
                        i5 = ((iM2566 ^ i3) * (-27791)) ^ (-1977397749);
                        i6 = 2095277668;
                    }
                    break;
                case -494059147:
                case 1638086830:
                    if (C0798.f2919) {
                        iM2566 = (C0630.m2566("ᩳ۫") ^ i3) * (-121);
                        i5 = ((iM2566 ^ i4) * (-31535)) ^ (-262088699);
                        i6 = -1501868961;
                    } else {
                        iM2566 = C2105.m6981("᩺֫") ^ i4;
                        i5 = ((iM2566 ^ i3) * 29881) ^ (-1024794234);
                        i6 = 1993449950;
                    }
                    break;
                case -443156582:
                case 1420542919:
                    if (C3245.f10203 <= 0) {
                        iM2566 = (C0630.m2566("ᩳ۫") ^ i3) * (-121);
                        i5 = ((iM2566 ^ i4) * (-31535)) ^ (-262088699);
                        i6 = -1501868961;
                    } else {
                        iM2566 = (C0630.m2566("ܺ۬") + i4) * (-103);
                        i5 = ((iM2566 ^ i3) * 31077) ^ (-799607777);
                        i6 = -475227350;
                    }
                    break;
                case -379952519:
                case 1224497645:
                    C3746.m11369();
                    break;
                case -367031785:
                case 1593391869:
                    if (C7811.m20844() != 0) {
                        iM2566 = (C0630.m2566("ᩳ۫") ^ i3) * (-121);
                        i5 = ((iM2566 ^ i4) * (-31535)) ^ (-262088699);
                        i6 = -1501868961;
                    } else {
                        iM2566 = (C2105.m6981("ۙۖ") ^ i3) * (-17);
                        i5 = ((iM2566 ^ i4) * (-11765)) ^ (-664071026);
                        i6 = 1544204410;
                    }
                    break;
                case -293739375:
                case 2078293175:
                    if (this.f25858) {
                        iM2566 = C0630.m2566("ۗ۟") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-28391)) ^ 961237702;
                        i6 = -552379226;
                    } else {
                        iM2566 = (C2105.m6981("ۨ۟") ^ i3) * 75;
                        i5 = ((iM2566 ^ i4) * 30289) ^ (-1724617381);
                        i6 = -41984288;
                    }
                    break;
                case -43327962:
                case 1599595386:
                    C4925.m14310(this.f25859);
                    this.f25858 = z;
                    iM2566 = (C2105.m6981("ۨ۟") ^ i3) * 75;
                    i5 = ((iM2566 ^ i4) * 30289) ^ (-1724617381);
                    i6 = -41984288;
                    break;
                case 212519094:
                case 333842467:
                    if (C3746.f11829 <= 0) {
                        iM2566 = C0630.m2566("᩷ۧ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-3777)) ^ 191438141;
                        i6 = -1661291028;
                    } else {
                        iM2566 = C0630.m2566("ۤۜ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 21421) ^ (-372437527);
                        i6 = -264225796;
                    }
                    break;
                case 1090355039:
                case 1366537475:
                    this.f25861 = z ? 1 : 0;
                    RunnableC1937.m6383(this.f25856);
                    break;
                case 1264119804:
                case 2060686334:
                    runnableArr = this.f25860;
                    if (i < runnableArr.length) {
                        iM2566 = C0630.m2566("ۙۢ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-8619)) ^ (-358939354);
                        i6 = 1009105143;
                    } else {
                        iM2566 = C2105.m6981("ܿܶ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-12783)) ^ 1409193923;
                        i6 = 2141117548;
                    }
                    break;
                default:
                    if (C0483.m2121()) {
                        iM2566 = C0630.m2566("ۡܳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-7117)) ^ 998111768;
                        i6 = 461876129;
                    } else {
                        iM2566 = C0630.m2566("᩷ۧ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-3777)) ^ 191438141;
                        i6 = -1661291028;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ۧ */
    public final void mo6025(InterfaceC23586 interfaceC23586) {
        int iM6981;
        int i;
        int i2;
        int iM6982;
        int i3;
        int i4;
        int iM2566;
        int i5;
        int i6;
        boolean zM44489;
        String strM20847;
        Application applicationM1842;
        Intent intent;
        int iM2567;
        int i7;
        Intent intent2;
        int i8 = C1128.f4106;
        int i9 = C0714.f2697;
        int iM2568 = (C0630.m2566("᩶᩺") + i9) * (-73);
        int i10 = ((iM2568 ^ i8) * (-3719)) ^ (-2092092192);
        String str = null;
        IntentFilter intentFilter = null;
        String strM2436 = null;
        Intent intent3 = null;
        int i11 = iM2568 ^ (-609573279);
        boolean z = false;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 2043437861;
        Application application = null;
        String str2 = null;
        Exception exc = null;
        boolean z2 = false;
        while (true) {
            i18 = i11 ^ (i10 & (((i18 ^ i8) * (-1585)) >> 31));
            switch (i18) {
                case -2124966206:
                case 365970285:
                    StringBuilder sb = new StringBuilder(strM2436);
                    C0050.m945(sb, i15);
                    throw new IllegalArgumentException(C0422.m1959(sb));
                case -2115497480:
                case 230585365:
                    intent3 = intent3;
                    i17 = i17;
                    str = str;
                    z = z ? 1 : 0;
                    if (this.f25857) {
                        iM6981 = (i9 - C0630.m2566("ۘᩴ")) * (-93);
                        i = ((iM6981 ^ i8) * 28851) ^ 1401443314;
                        i2 = -283874332;
                    } else {
                        iM6981 = C2105.m6981("֡ۘ") ^ i9;
                        i = ((iM6981 ^ i8) * (-3115)) ^ 2095242219;
                        i2 = -1208167112;
                    }
                    int i19 = iM6981 ^ i2;
                    str = str;
                    intent2 = intent3;
                    i11 = i19;
                    i10 = i;
                    z = z;
                    i17 = i17;
                    intent3 = intent2;
                    break;
                case -2099614682:
                case 1370419406:
                    intent3 = intent3;
                    m22128(i15, (String) null);
                    iM2566 = C2105.m6981("ۡ֡") ^ i9;
                    i5 = ((iM2566 ^ i8) * (-17011)) ^ (-1939869233);
                    i6 = -1389230419;
                    int i20 = iM2566 ^ i6;
                    intent3 = intent3;
                    i11 = i20;
                    i10 = i5;
                    break;
                case -2064650532:
                case -216556951:
                    i12 = 34055;
                    iM6981 = C2105.m6981("ܿ۟") ^ i8;
                    i = ((iM6981 ^ i9) * 3301) ^ 12844524;
                    i2 = -627112561;
                    int i110 = iM6981 ^ i2;
                    str = str;
                    intent2 = intent3;
                    i11 = i110;
                    i10 = i;
                    z = z;
                    i17 = i17;
                    intent3 = intent2;
                    break;
                case -2051256916:
                case -229980240:
                    m22127(i15);
                    int i21 = ServiceC19288.f60689;
                    applicationM1842 = C0382.m1842();
                    intent = new Intent(applicationM1842, (Class<?>) ServiceC19288.class);
                    application = applicationM1842;
                    intent3 = intent;
                    iM2567 = (i8 - C0630.m2566("ܿ֫")) * 27;
                    i5 = ((iM2567 ^ i9) * 22445) ^ (-335105387);
                    i7 = -1336438858;
                    i11 = iM2567 ^ i7;
                    i10 = i5;
                    break;
                case -1973996226:
                case 2091390522:
                    intent3 = intent3;
                    if (i15 == i16) {
                        iM2566 = C0630.m2566("᩵ۘ") ^ i9;
                        i5 = ((iM2566 ^ i8) * 28171) ^ 338386067;
                        i6 = 1917092638;
                    } else {
                        iM2566 = C0630.m2566("ܳ᩵") ^ i8;
                        i5 = ((iM2566 ^ i9) * 15173) ^ 614385777;
                        i6 = 293332944;
                    }
                    int i22 = iM2566 ^ i6;
                    intent3 = intent3;
                    i11 = i22;
                    i10 = i5;
                    break;
                case -1967834189:
                case 968063602:
                    intent3 = intent3;
                    this.f25857 = z;
                    i17 = i17;
                    str = str;
                    int i23 = ApplicationC20075.f65010.getInt(str, i17) & 7;
                    this.f25861 = i23;
                    if (i23 == 0) {
                        z = z ? 1 : 0;
                        iM6981 = (i9 - C0630.m2566("ۘᩴ")) * (-93);
                        i = ((iM6981 ^ i8) * 28851) ^ 1401443314;
                        i2 = -283874332;
                    } else {
                        iM6981 = C0630.m2566("ۜ᩵") ^ i8;
                        z = z ? 1 : 0;
                        i = ((iM6981 ^ i9) * (-14765)) ^ 943058255;
                        i2 = 1777544947;
                    }
                    int i111 = iM6981 ^ i2;
                    str = str;
                    intent2 = intent3;
                    i11 = i111;
                    i10 = i;
                    z = z;
                    i17 = i17;
                    intent3 = intent2;
                    break;
                case -1615117776:
                case 520463354:
                    intent3 = intent3;
                    C6326.m17602((AbstractActivityC3346) interfaceC23586);
                    iM2566 = C2105.m6981("ܳ᩹") ^ i9;
                    i5 = ((iM2566 ^ i8) * 4907) ^ 1248169404;
                    i6 = -2081318994;
                    int i24 = iM2566 ^ i6;
                    intent3 = intent3;
                    i11 = i24;
                    i10 = i5;
                    break;
                case -1610604800:
                case -1099335054:
                    intent3 = intent3;
                    if (i15 != z) {
                        iM2566 = (C2105.m6981("᩵۬") + i9) * (-81);
                        i5 = ((iM2566 ^ i8) * (-19091)) ^ 305306352;
                        i6 = -1956963146;
                    } else {
                        iM2566 = (C2105.m6981("ۢܳ") + i8) * (-53);
                        i5 = ((iM2566 ^ i9) * 21623) ^ 251014745;
                        i6 = 734961087;
                    }
                    int i25 = iM2566 ^ i6;
                    intent3 = intent3;
                    i11 = i25;
                    i10 = i5;
                    break;
                case -1567729209:
                case 2058389860:
                    m22135();
                    return;
                case -1560874759:
                case 383197451:
                    m22127(i15);
                    ServiceC7926.m21226();
                    intent3 = intent3;
                    iM2566 = C2105.m6981("ۡ֡") ^ i9;
                    i5 = ((iM2566 ^ i8) * (-17011)) ^ (-1939869233);
                    i6 = -1389230419;
                    int i26 = iM2566 ^ i6;
                    intent3 = intent3;
                    i11 = i26;
                    i10 = i5;
                    break;
                case -1527104279:
                case 816905001:
                    C4925.m14311(this.f25859, intentFilter);
                    this.f25858 = z;
                    i15 = i17;
                    iM2566 = C0630.m2566("ܳۛ") ^ i9;
                    i5 = ((iM2566 ^ i8) * (-21453)) ^ (-1438389074);
                    i6 = -864562286;
                    int i27 = iM2566 ^ i6;
                    intent3 = intent3;
                    i11 = i27;
                    i10 = i5;
                    break;
                case -1359040838:
                case -1358427539:
                    try {
                        m22127(i15);
                        int i28 = ServiceC1618.f5686;
                        applicationM1842 = C0382.m1842();
                        intent = new Intent(applicationM1842, (Class<?>) ServiceC1618.class);
                        application = applicationM1842;
                        intent3 = intent;
                        iM2567 = (i8 - C0630.m2566("ܿ֫")) * 27;
                        i5 = ((iM2567 ^ i9) * 22445) ^ (-335105387);
                        i7 = -1336438858;
                        i11 = iM2567 ^ i7;
                    } catch (Exception e) {
                        e = e;
                        intent3 = intent3;
                        exc = e;
                        iM2566 = C0630.m2566("ۨᩴ") ^ i8;
                        i5 = ((iM2566 ^ i9) * 23313) ^ 134936394;
                        i6 = 1456170860;
                        int i29 = iM2566 ^ i6;
                        intent3 = intent3;
                        i11 = i29;
                    }
                    i10 = i5;
                    break;
                case -1322602058:
                case 614353137:
                    intent3 = intent3;
                    i17 = i17;
                    str = str;
                    z = z ? 1 : 0;
                    short s = f25855[356];
                    int i30 = s + 2291;
                    int i31 = (s * s) + 5248681;
                    if ((i30 * i30) - (i31 + i31) > 0) {
                        iM6981 = (C2105.m6981("᩻ܳ") ^ i9) * 73;
                        i = ((iM6981 ^ i8) * (-8739)) ^ 2142239684;
                        i2 = 391723441;
                    } else {
                        iM6981 = C0630.m2566("۫۫") ^ i8;
                        i = ((iM6981 ^ i9) * 1741) ^ 207927444;
                        i2 = 1939400739;
                    }
                    int i112 = iM6981 ^ i2;
                    str = str;
                    intent2 = intent3;
                    i11 = i112;
                    i10 = i;
                    z = z;
                    i17 = i17;
                    intent3 = intent2;
                    break;
                case -1059781394:
                case 2065445515:
                    i12 = 43473;
                    iM6981 = C2105.m6981("ܿ۟") ^ i8;
                    i = ((iM6981 ^ i9) * 3301) ^ 12844524;
                    i2 = -627112561;
                    int i113 = iM6981 ^ i2;
                    str = str;
                    intent2 = intent3;
                    i11 = i113;
                    i10 = i;
                    z = z;
                    i17 = i17;
                    intent3 = intent2;
                    break;
                case -1055247821:
                case -447009145:
                    strM20847 = C0050.m947(exc);
                    str2 = strM20847;
                    iM2566 = C2105.m6981("ۘۚ") ^ i9;
                    i5 = ((iM2566 ^ i8) * (-3525)) ^ (-1748416059);
                    i6 = -1298051938;
                    int i210 = iM2566 ^ i6;
                    intent3 = intent3;
                    i11 = i210;
                    i10 = i5;
                    break;
                case -959886944:
                case 1152421260:
                    if (i15 == i16) {
                        iM2567 = C0630.m2566("ۗ֡") ^ i9;
                        i5 = ((iM2567 ^ i8) * (-31083)) ^ (-321583591);
                        i7 = 750334798;
                    } else {
                        iM2567 = C0630.m2566("ۛܳ") ^ i8;
                        i5 = ((iM2567 ^ i9) * 25637) ^ (-2140040082);
                        i7 = -1982641486;
                    }
                    i11 = iM2567 ^ i7;
                    i10 = i5;
                    break;
                case -954981986:
                case 458587787:
                    intent3 = intent3;
                    i13 = 3;
                    if (i14 < 3) {
                        iM2566 = (C0630.m2566("֨ܳ") + i8) * (-47);
                        i5 = ((iM2566 ^ i9) * 12583) ^ 1887792884;
                        i6 = 714407827;
                    } else {
                        iM2566 = C0630.m2566("ܶۤ") ^ i8;
                        i5 = ((iM2566 ^ i9) * 25837) ^ (-311959585);
                        i6 = -1400971953;
                    }
                    int i211 = iM2566 ^ i6;
                    intent3 = intent3;
                    i11 = i211;
                    i10 = i5;
                    break;
                case -923585418:
                case 1161163088:
                    intentFilter.addAction(f25853[i14]);
                    intentFilter.addAction(f25854[i14]);
                    intentFilter.addAction(f25852[i14]);
                    i14++;
                    iM6982 = (C0630.m2566("֨ܿ") ^ i9) * 109;
                    i3 = ((iM6982 ^ i8) * (-4391)) ^ 466895471;
                    i4 = 1358452572;
                    intent2 = intent3;
                    i11 = iM6982 ^ i4;
                    i10 = i3;
                    intent3 = intent2;
                    break;
                case -769923641:
                case -152374750:
                    intent3 = intent3;
                    this.f25863 = true;
                    boolean z3 = this.f25857;
                    i17 = 0;
                    String strM9250 = C3019.m9250(f25855, 357, 4, i12);
                    if (z3) {
                        str = strM9250;
                        z = true;
                        iM2566 = C2105.m6981("ܳ᩹") ^ i9;
                        i5 = ((iM2566 ^ i8) * 4907) ^ 1248169404;
                        i6 = -2081318994;
                        int i212 = iM2566 ^ i6;
                        intent3 = intent3;
                        i11 = i212;
                        i10 = i5;
                    } else {
                        int iM2569 = C0630.m2566("ۡ۫") ^ i8;
                        str = strM9250;
                        intent3 = intent3;
                        i11 = iM2569 ^ 1168248777;
                        i10 = ((iM2569 ^ i9) * 8585) ^ 421794409;
                        z = true;
                    }
                    break;
                case -748523347:
                case 2014050850:
                    intent3 = intent3;
                    if (i15 != 0) {
                        iM2566 = (C0630.m2566("ۛᩳ") + i8) * (-81);
                        i5 = ((iM2566 ^ i9) * 4745) ^ (-1307146476);
                        i6 = -1805975841;
                    } else {
                        iM2566 = (i8 - C0630.m2566("ܽۢ")) * 31;
                        i5 = ((iM2566 ^ i9) * (-29027)) ^ 1653390556;
                        i6 = -173397907;
                    }
                    int i213 = iM2566 ^ i6;
                    intent3 = intent3;
                    i11 = i213;
                    i10 = i5;
                    break;
                case -642313313:
                case 1278967374:
                    intent3 = intent3;
                    if (i15 != z) {
                        iM2566 = C2105.m6981("᩷ۧ") ^ i8;
                        i5 = ((iM2566 ^ i9) * (-20039)) ^ 548998961;
                        i6 = -833718984;
                    } else {
                        iM2566 = (i9 - C0630.m2566("ۜᩳ")) * 29;
                        i5 = ((iM2566 ^ i8) * (-31871)) ^ (-136865359);
                        i6 = -1339789036;
                    }
                    int i214 = iM2566 ^ i6;
                    intent3 = intent3;
                    i11 = i214;
                    i10 = i5;
                    break;
                case -554723977:
                case 397550636:
                    intent3 = intent3;
                    zM44489 = ServiceC1618.m5485();
                    z2 = zM44489;
                    iM2566 = (C0630.m2566("᩶᩻") ^ i8) * 115;
                    i5 = ((iM2566 ^ i9) * 8371) ^ (-1763863159);
                    i6 = -424199264;
                    int i215 = iM2566 ^ i6;
                    intent3 = intent3;
                    i11 = i215;
                    i10 = i5;
                    break;
                case -87994173:
                case 1506543382:
                    intent3 = intent3;
                    if ((this.f25861 & ((z ? 1 : 0) << i15)) == 0) {
                        iM2566 = C2105.m6981("ۡ֡") ^ i9;
                        i5 = ((iM2566 ^ i8) * (-17011)) ^ (-1939869233);
                        i6 = -1389230419;
                    } else {
                        iM2566 = (C2105.m6981("ܳܺ") ^ i8) * 67;
                        i5 = ((iM2566 ^ i9) * (-13473)) ^ (-987680723);
                        i6 = 897208432;
                    }
                    int i216 = iM2566 ^ i6;
                    intent3 = intent3;
                    i11 = i216;
                    i10 = i5;
                    break;
                case 59075118:
                case 1110978439:
                    intent3 = intent3;
                    if (i15 >= i13) {
                        i17 = i17;
                        str = str;
                        z = z ? 1 : 0;
                        iM6981 = (i9 - C0630.m2566("ۘᩴ")) * (-93);
                        i = ((iM6981 ^ i8) * 28851) ^ 1401443314;
                        i2 = -283874332;
                        int i114 = iM6981 ^ i2;
                        str = str;
                        intent2 = intent3;
                        i11 = i114;
                        i10 = i;
                        z = z;
                        i17 = i17;
                        intent3 = intent2;
                    } else {
                        iM2566 = (C0630.m2566("֨ܺ") ^ i9) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM2566 ^ i8) * 27209) ^ (-348100000);
                        i6 = 578885843;
                        int i217 = iM2566 ^ i6;
                        intent3 = intent3;
                        i11 = i217;
                        i10 = i5;
                    }
                    break;
                case 214595008:
                case 846392183:
                    intent3 = intent3;
                    if (z2) {
                        iM2566 = C0630.m2566("᩹ܿ") ^ i9;
                        i5 = ((iM2566 ^ i8) * (-21287)) ^ 1080768979;
                        i6 = 211176925;
                    } else {
                        iM2566 = C0630.m2566("ۤ֨") ^ i9;
                        i5 = ((iM2566 ^ i8) * 25843) ^ 664245548;
                        i6 = -163300485;
                    }
                    int i218 = iM2566 ^ i6;
                    intent3 = intent3;
                    i11 = i218;
                    i10 = i5;
                    break;
                case 264061117:
                case 513967008:
                    intent3 = intent3;
                    strM2436 = RunnableC0588.m2436(f25855, TwofishEngine.GF256_FDBK, 25, i12);
                    i16 = 2;
                    if (i15 != 0) {
                        iM2566 = (i8 - C2105.m6981("֫᩶")) * (-87);
                        i5 = ((iM2566 ^ i9) * (-15303)) ^ (-1955082102);
                        i6 = -1524664873;
                    } else {
                        iM2566 = C0630.m2566("ۘ۫") ^ i9;
                        i5 = ((iM2566 ^ i8) * 10917) ^ 839661231;
                        i6 = -1808745267;
                    }
                    int i219 = iM2566 ^ i6;
                    intent3 = intent3;
                    i11 = i219;
                    i10 = i5;
                    break;
                case 436148666:
                case 1878905048:
                    intent3 = intent3;
                    StringBuilder sb2 = new StringBuilder(strM2436);
                    C0422.m1944(sb2, i15);
                    throw new IllegalArgumentException(C0050.m947(sb2));
                case 444562883:
                case 1736495858:
                    intent3 = intent3;
                    zM44489 = ServiceC19288.m44489();
                    z2 = zM44489;
                    iM2566 = (C0630.m2566("᩶᩻") ^ i8) * 115;
                    i5 = ((iM2566 ^ i9) * 8371) ^ (-1763863159);
                    i6 = -424199264;
                    int i2110 = iM2566 ^ i6;
                    intent3 = intent3;
                    i11 = i2110;
                    i10 = i5;
                    break;
                case 595445328:
                case 1178332846:
                    i15++;
                    iM2566 = C0630.m2566("ܳۛ") ^ i9;
                    i5 = ((iM2566 ^ i8) * (-21453)) ^ (-1438389074);
                    i6 = -864562286;
                    int i2111 = iM2566 ^ i6;
                    intent3 = intent3;
                    i11 = i2111;
                    i10 = i5;
                    break;
                case 643803977:
                case 1635239458:
                    intentFilter = new IntentFilter();
                    i14 = 0;
                    iM6982 = (C0630.m2566("֨ܿ") ^ i9) * 109;
                    i3 = ((iM6982 ^ i8) * (-4391)) ^ 466895471;
                    i4 = 1358452572;
                    intent2 = intent3;
                    i11 = iM6982 ^ i4;
                    i10 = i3;
                    intent3 = intent2;
                    break;
                case 648807051:
                case 1582272552:
                    intent3 = intent3;
                    if (C0964.m3403(C7811.m20847(exc))) {
                        iM2566 = C2105.m6981("۠ۨ") ^ i9;
                        i5 = ((iM2566 ^ i8) * 25705) ^ (-988951791);
                        i6 = 1796532370;
                    } else {
                        iM2566 = (i8 - C2105.m6981("ۧᩴ")) * (-95);
                        i5 = ((iM2566 ^ i9) * 7349) ^ 1709617469;
                        i6 = -1273294459;
                    }
                    int i2112 = iM2566 ^ i6;
                    intent3 = intent3;
                    i11 = i2112;
                    i10 = i5;
                    break;
                case 793184802:
                case 1434650530:
                    try {
                        C0881.m3232(application, intent3);
                        intent3 = intent3;
                        iM2566 = C2105.m6981("ۡ֡") ^ i9;
                        i5 = ((iM2566 ^ i8) * (-17011)) ^ (-1939869233);
                        i6 = -1389230419;
                    } catch (Exception e2) {
                        exc = e2;
                        intent3 = intent3;
                        iM2566 = C0630.m2566("ۨᩴ") ^ i8;
                        i5 = ((iM2566 ^ i9) * 23313) ^ 134936394;
                        i6 = 1456170860;
                    }
                    int i2113 = iM2566 ^ i6;
                    intent3 = intent3;
                    i11 = i2113;
                    i10 = i5;
                    break;
                case 856585781:
                case 1294390315:
                    intent3 = intent3;
                    i17 = i17;
                    str = str;
                    z = z ? 1 : 0;
                    if ((ApplicationC20075.f65010.getInt(str, i17) & 7) == 0) {
                        str = str;
                        z = z ? 1 : 0;
                        i17 = i17;
                        iM2566 = C2105.m6981("ܳ᩹") ^ i9;
                        i5 = ((iM2566 ^ i8) * 4907) ^ 1248169404;
                        i6 = -2081318994;
                        int i2114 = iM2566 ^ i6;
                        intent3 = intent3;
                        i11 = i2114;
                        i10 = i5;
                    } else {
                        iM6981 = (i9 - C2105.m6981("ۧ᩺")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM6981 ^ i8) * 31785) ^ 1193818057;
                        i2 = 744573518;
                        int i115 = iM6981 ^ i2;
                        str = str;
                        intent2 = intent3;
                        i11 = i115;
                        i10 = i;
                        z = z;
                        i17 = i17;
                        intent3 = intent2;
                    }
                    break;
                case 1022266753:
                case 1194382793:
                    intent3 = intent3;
                    m22128(i15, str2);
                    iM2566 = C2105.m6981("ۡ֡") ^ i9;
                    i5 = ((iM2566 ^ i8) * (-17011)) ^ (-1939869233);
                    i6 = -1389230419;
                    int i2115 = iM2566 ^ i6;
                    intent3 = intent3;
                    i11 = i2115;
                    i10 = i5;
                    break;
                case 1395026751:
                case 1456087104:
                    intent3 = intent3;
                    if (!(interfaceC23586 instanceof AbstractActivityC3346)) {
                        iM2566 = C2105.m6981("ܳ᩹") ^ i9;
                        i5 = ((iM2566 ^ i8) * 4907) ^ 1248169404;
                        i6 = -2081318994;
                        int i2116 = iM2566 ^ i6;
                        intent3 = intent3;
                        i11 = i2116;
                        i10 = i5;
                    } else {
                        iM6982 = C2105.m6981("ܺۙ") ^ i8;
                        i3 = ((iM6982 ^ i9) * 11873) ^ 987433728;
                        i4 = -1757437145;
                        intent2 = intent3;
                        i11 = iM6982 ^ i4;
                        i10 = i3;
                        intent3 = intent2;
                    }
                    break;
                case 1444866141:
                case 1665221822:
                    strM20847 = C7811.m20847(exc);
                    str2 = strM20847;
                    iM2566 = C2105.m6981("ۘۚ") ^ i9;
                    i5 = ((iM2566 ^ i8) * (-3525)) ^ (-1748416059);
                    i6 = -1298051938;
                    int i2117 = iM2566 ^ i6;
                    intent3 = intent3;
                    i11 = i2117;
                    i10 = i5;
                    break;
                default:
                    intent3 = intent3;
                    try {
                        zM44489 = ServiceC7926.m21228();
                        z2 = zM44489;
                        iM2566 = (C0630.m2566("᩶᩻") ^ i8) * 115;
                        i5 = ((iM2566 ^ i9) * 8371) ^ (-1763863159);
                        i6 = -424199264;
                    } catch (Exception e3) {
                        e = e3;
                        exc = e;
                        iM2566 = C0630.m2566("ۨᩴ") ^ i8;
                        i5 = ((iM2566 ^ i9) * 23313) ^ 134936394;
                        i6 = 1456170860;
                    }
                    int i2118 = iM2566 ^ i6;
                    intent3 = intent3;
                    i11 = i2118;
                    i10 = i5;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x010e A[PHI: r1 r8
      0x010e: PHI (r1v3 java.lang.Runnable[]) = (r1v2 java.lang.Runnable[]), (r1v2 java.lang.Runnable[]), (r1v4 java.lang.Runnable[]) binds: [B:45:0x010c, B:33:0x00bd, B:29:0x00a4] A[DONT_GENERATE, DONT_INLINE]
      0x010e: PHI (r8v5 java.lang.Runnable) = (r8v4 java.lang.Runnable), (r8v4 java.lang.Runnable), (r8v6 java.lang.Runnable) binds: [B:45:0x010c, B:33:0x00bd, B:29:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0165  */
    /* JADX WARN: Code duplicated, block: B:58:0x018f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22127(final int i) {
        int iM6981;
        int i2;
        Runnable[] runnableArr = null;
        Handler handler = null;
        int i3 = 1719715062;
        int i4 = C5695.f17556;
        int i5 = C22628.f73083;
        int iM6982 = (i4 - C2105.m6981("ᩴܺ")) * 89;
        int i6 = ((iM6982 ^ i5) * (-17905)) ^ (-206006359);
        int i7 = -525685643;
        while (true) {
            int i8 = iM6982 ^ i7;
            Runnable runnable = null;
            while (true) {
                i3 = ((((i3 ^ i5) * (-8813)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2128264141:
                    case 233189757:
                        C3911.m11924();
                        RunnableC1937.m6387();
                        break;
                    case -1965406684:
                    case -1116140677:
                        handler.postDelayed(runnable, 30000L);
                        break;
                    case -1893994194:
                    case 1384540084:
                        if (C5695.f17556 < 0) {
                            iM6981 = C2105.m6981("᩹᩵") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-13879)) ^ 2044482032;
                            i2 = -1758247471;
                            i8 = iM6981 ^ i2;
                        }
                        break;
                    case -1853302610:
                    case 1908965374:
                        if (C0382.f1805) {
                            iM6981 = (i4 - C2105.m6981("ܶᩴ")) * (-95);
                            i6 = ((iM6981 ^ i5) * (-10273)) ^ 1293424449;
                            i2 = -943509658;
                        } else {
                            iM6981 = C0630.m2566("ۨۧ") ^ i4;
                            i6 = ((iM6981 ^ i5) * 14651) ^ (-478121058);
                            i2 = -30578679;
                        }
                        i8 = iM6981 ^ i2;
                        break;
                    case -1751118180:
                    case 1825405347:
                        if (AbstractC2021.f6743 <= 0) {
                            iM6981 = (i4 - C0630.m2566("᩺ܳ")) * (-13);
                            i6 = ((iM6981 ^ i5) * (-25127)) ^ 1366448553;
                            i2 = 313837939;
                        } else {
                            iM6981 = (C2105.m6981("᩻֫") ^ i5) * (-97);
                            i6 = ((iM6981 ^ i4) * 23249) ^ (-994426182);
                            i2 = 935743124;
                        }
                        i8 = iM6981 ^ i2;
                        break;
                    case -1636332841:
                    case -445387502:
                        C21923.m49329();
                        if (AbstractC2021.m6574()) {
                        }
                        iM6981 = C0630.m2566("ۨۧ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 14651) ^ (-478121058);
                        i2 = -30578679;
                        i8 = iM6981 ^ i2;
                        break;
                    case -1580247303:
                    case 417685273:
                        if (C7811.f24123 >= 0) {
                            iM6981 = C0630.m2566("ۨۧ") ^ i4;
                            i6 = ((iM6981 ^ i5) * 14651) ^ (-478121058);
                            i2 = -30578679;
                        } else {
                            iM6981 = C0630.m2566("ۚܶ") ^ i4;
                            i6 = ((iM6981 ^ i5) * (-28143)) ^ 1019218226;
                            i2 = 1647053541;
                        }
                        i8 = iM6981 ^ i2;
                        break;
                    case -1563227090:
                    case 576815414:
                        if (C4263.f13799 <= 0) {
                            iM6981 = C0630.m2566("᩷᩷") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-19697)) ^ (-1858486487);
                            i2 = -1416117548;
                        } else {
                            iM6981 = C0630.m2566("ۢᩴ") ^ i4;
                            i6 = ((iM6981 ^ i5) * (-5105)) ^ (-184847446);
                            i2 = 2092898091;
                        }
                        i8 = iM6981 ^ i2;
                        break;
                    case -1506666888:
                    case 1059384223:
                        if (C1005.f3721) {
                            iM6981 = C2105.m6981("᩺ܰ") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-25969)) ^ 1542484756;
                            i2 = 1912884418;
                        } else {
                            iM6981 = C0630.m2566("ۨۧ") ^ i4;
                            i6 = ((iM6981 ^ i5) * 14651) ^ (-478121058);
                            i2 = -30578679;
                        }
                        i8 = iM6981 ^ i2;
                        break;
                    case -1044935037:
                    case 1321464085:
                        runnableArr[i] = runnable;
                        handler = this.f25862;
                        if (C2167.f7158 < 0) {
                            iM6981 = (i5 - C2105.m6981("᩷ܰ")) * (-45);
                            i6 = ((iM6981 ^ i4) * (-8647)) ^ (-2086341634);
                            i2 = 225641946;
                            i8 = iM6981 ^ i2;
                        }
                        break;
                    case -420893111:
                    case 756150801:
                        C0798.m2998();
                        break;
                    case 58954253:
                    case 1207009549:
                        ViewOnClickListenerC1958.m6429();
                        if (!C2272.f7362) {
                        }
                        iM6981 = (i4 - C0630.m2566("᩺ܳ")) * (-13);
                        i6 = ((iM6981 ^ i5) * (-25127)) ^ 1366448553;
                        i2 = 313837939;
                        i8 = iM6981 ^ i2;
                        break;
                    case 271932762:
                    case 819442642:
                        if (!C0798.f2919) {
                            runnable = new Runnable(this) { // from class: l.ۚ᩸᩷

                                /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
                                public final /* synthetic */ C8453 f17403;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C8453.m22129(this.f17403, i);
                                }

                                {
                                    int i9 = 1602706090;
                                    int i10 = C1773.f6144;
                                    int i11 = ViewOnClickListenerC1958.f6529;
                                    int iM2566 = C0630.m2566("᩵᩵") ^ i11;
                                    int i12 = ((iM2566 ^ i10) * 99) ^ (-600215976);
                                    int i13 = -258759854;
                                    while (true) {
                                        i9 = ((((i9 ^ i10) * (-17517)) >> 31) & i12) ^ (iM2566 ^ i13);
                                        switch (i9) {
                                            case -1943017940:
                                            case -1626071287:
                                                if (C0382.f1805) {
                                                    iM2566 = (C0630.m2566("ۢܺ") + i11) * (-57);
                                                    i12 = ((iM2566 ^ i10) * 19001) ^ (-1843109139);
                                                    i13 = 693642996;
                                                } else {
                                                    iM2566 = C2105.m6981("۬᩵") ^ i10;
                                                    i12 = ((iM2566 ^ i11) * (-21805)) ^ 56149095;
                                                    i13 = -1037905896;
                                                }
                                                break;
                                            case -1916875737:
                                            case -1862742577:
                                                if (C1420.f5096 <= 0) {
                                                    iM2566 = C2105.m6981("۬᩵") ^ i10;
                                                    i12 = ((iM2566 ^ i11) * (-21805)) ^ 56149095;
                                                    i13 = -1037905896;
                                                } else {
                                                    iM2566 = (i10 - C2105.m6981("۟ۡ")) * (-61);
                                                    i12 = ((iM2566 ^ i11) * (-10805)) ^ 573159646;
                                                    i13 = -1272736346;
                                                }
                                                break;
                                            case -1762043448:
                                            case -845067041:
                                                if (C0630.f2410 <= 0) {
                                                    iM2566 = C2105.m6981("ۙۖ") ^ i10;
                                                    i12 = ((iM2566 ^ i11) * (-26277)) ^ (-894164872);
                                                    i13 = -474140413;
                                                } else {
                                                    iM2566 = (C2105.m6981("ܿܶ") ^ i10) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                    i12 = ((iM2566 ^ i11) * (-5063)) ^ 852747689;
                                                    i13 = -187765079;
                                                }
                                                break;
                                            case -1672823250:
                                            case 1308784636:
                                                C4075.m12263();
                                                if (C1773.f6144 > 0) {
                                                    iM2566 = C2105.m6981("ۤ۬") ^ i11;
                                                    i12 = ((iM2566 ^ i10) * 27201) ^ (-442169887);
                                                    i13 = -1540838490;
                                                } else {
                                                    iM2566 = (C0630.m2566("ۘ᩷") + i11) * (-83);
                                                    i12 = ((iM2566 ^ i10) * (-30673)) ^ 1652417842;
                                                    i13 = 1209553690;
                                                }
                                                break;
                                            case -1531754043:
                                            case 308723998:
                                                this.f17403 = this;
                                                if (C1773.m5908() <= 0) {
                                                    iM2566 = C2105.m6981("۬᩵") ^ i10;
                                                    i12 = ((iM2566 ^ i11) * (-21805)) ^ 56149095;
                                                    i13 = -1037905896;
                                                } else {
                                                    iM2566 = C0630.m2566("ᩳ֨") ^ i11;
                                                    i12 = ((iM2566 ^ i10) * (-8781)) ^ 1738249106;
                                                    i13 = -1186478846;
                                                }
                                                break;
                                            case -1475659378:
                                            case -311994208:
                                                if (C0050.m940() <= 0) {
                                                    iM2566 = (C0630.m2566("ۘ᩷") + i11) * (-83);
                                                    i12 = ((iM2566 ^ i10) * (-30673)) ^ 1652417842;
                                                    i13 = 1209553690;
                                                } else {
                                                    iM2566 = (i10 - C0630.m2566("ۚ֫")) * 7;
                                                    i12 = ((iM2566 ^ i11) * (-23601)) ^ (-1984363896);
                                                    i13 = -17061751;
                                                }
                                                break;
                                            case -1176756278:
                                            case -715158642:
                                                if (C3537.f11231 >= 0) {
                                                    iM2566 = (C0630.m2566("ۘ᩷") + i11) * (-83);
                                                    i12 = ((iM2566 ^ i10) * (-30673)) ^ 1652417842;
                                                    i13 = 1209553690;
                                                } else {
                                                    iM2566 = C0630.m2566("֡۬") ^ i10;
                                                    i12 = ((iM2566 ^ i11) * (-16959)) ^ (-355628273);
                                                    i13 = -1314272364;
                                                }
                                                break;
                                            case -855602200:
                                            case -260120668:
                                                ViewOnClickListenerC1958.m6429();
                                                if (C0798.m2998() == 0) {
                                                    iM2566 = C2105.m6981("۬᩵") ^ i10;
                                                    i12 = ((iM2566 ^ i11) * (-21805)) ^ 56149095;
                                                    i13 = -1037905896;
                                                } else {
                                                    iM2566 = (C0630.m2566("ۘ᩷") + i11) * (-83);
                                                    i12 = ((iM2566 ^ i10) * (-30673)) ^ 1652417842;
                                                    i13 = 1209553690;
                                                }
                                                break;
                                            case -480605392:
                                            case 1765927207:
                                                if (C4263.f13799 <= 0) {
                                                    iM2566 = C2105.m6981("ۤ۬") ^ i11;
                                                    i12 = ((iM2566 ^ i10) * 27201) ^ (-442169887);
                                                    i13 = -1540838490;
                                                } else {
                                                    iM2566 = C2105.m6981("ۗ֡") ^ i11;
                                                    i12 = ((iM2566 ^ i10) * (-29047)) ^ 682856107;
                                                    i13 = -643976774;
                                                }
                                                break;
                                            case -325107481:
                                            case 91083864:
                                                C3245.m9925();
                                                iM2566 = (C0630.m2566("ۘ᩷") + i11) * (-83);
                                                i12 = ((iM2566 ^ i10) * (-30673)) ^ 1652417842;
                                                i13 = 1209553690;
                                                break;
                                            case -264489084:
                                            case 2043604142:
                                                C21923.m49329();
                                                C2520.m8026();
                                                throw new RuntimeException();
                                            case 533704376:
                                            case 1509218111:
                                                return;
                                            case 900084025:
                                            case 2076881698:
                                                if (C2105.f7037 != 0) {
                                                    iM2566 = (i11 - C2105.m6981("ۨܿ")) * 127;
                                                    i12 = ((iM2566 ^ i10) * (-29289)) ^ (-1691247128);
                                                    i13 = 554309390;
                                                } else {
                                                    iM2566 = C2105.m6981("ܰۖ") ^ i11;
                                                    i12 = ((iM2566 ^ i10) * (-2223)) ^ 2061490192;
                                                    i13 = 1273818921;
                                                }
                                                break;
                                            case 1050678013:
                                            case 1765251226:
                                                if (C4159.f13567) {
                                                    iM2566 = C2105.m6981("ܺ᩻") ^ i10;
                                                    i12 = ((iM2566 ^ i11) * (-21963)) ^ 2012158555;
                                                    i13 = 454797902;
                                                } else {
                                                    iM2566 = C2105.m6981("۬᩵") ^ i10;
                                                    i12 = ((iM2566 ^ i11) * (-21805)) ^ 56149095;
                                                    i13 = -1037905896;
                                                }
                                                break;
                                            case 1147582743:
                                            case 1787262749:
                                                if (C1420.m4913()) {
                                                    iM2566 = C2105.m6981("ۤ۬") ^ i11;
                                                    i12 = ((iM2566 ^ i10) * 27201) ^ (-442169887);
                                                    i13 = -1540838490;
                                                } else {
                                                    iM2566 = (i11 - C2105.m6981("ܶۖ")) * (-71);
                                                    i12 = ((iM2566 ^ i10) * 32299) ^ (-153835660);
                                                    i13 = 1017381015;
                                                }
                                                break;
                                            default:
                                                if (C0237.f1507 != 0) {
                                                    iM2566 = C2105.m6981("ۙۖ") ^ i10;
                                                    i12 = ((iM2566 ^ i11) * (-26277)) ^ (-894164872);
                                                    i13 = -474140413;
                                                } else {
                                                    iM2566 = (C0630.m2566("ۘ᩷") + i11) * (-83);
                                                    i12 = ((iM2566 ^ i10) * (-30673)) ^ 1652417842;
                                                    i13 = 1209553690;
                                                }
                                                break;
                                        }
                                    }
                                }
                            };
                            runnableArr = this.f25860;
                            if (C3663.m11168() >= 0) {
                                iM6981 = C0630.m2566("᩷᩷") ^ i5;
                                i6 = ((iM6981 ^ i4) * (-19697)) ^ (-1858486487);
                                i2 = -1416117548;
                            } else {
                                iM6981 = C0630.m2566("ۡ֫") ^ i4;
                                i6 = ((iM6981 ^ i5) * 6589) ^ 1855389936;
                                i2 = -1544287320;
                            }
                            i8 = iM6981 ^ i2;
                        }
                        break;
                    case 1206153687:
                    case 1989478685:
                        if (C1420.f5096 <= 0) {
                            iM6981 = C0630.m2566("᩷᩷") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-19697)) ^ (-1858486487);
                            i2 = -1416117548;
                        } else {
                            iM6981 = C0630.m2566("ۗۛ") ^ i5;
                            i6 = ((iM6981 ^ i4) * 9867) ^ 2046439928;
                            i2 = 87322581;
                        }
                        i8 = iM6981 ^ i2;
                        break;
                    default:
                        C1128.m3851();
                        if (C1128.m3851() <= 0) {
                            iM6981 = (i4 - C0630.m2566("᩺ܳ")) * (-13);
                            i6 = ((iM6981 ^ i5) * (-25127)) ^ 1366448553;
                            i2 = 313837939;
                        } else {
                            iM6981 = (C2105.m6981("᩻ۖ") ^ i5) * 49;
                            i6 = ((iM6981 ^ i4) * (-20081)) ^ (-1594952991);
                            i2 = 1281896405;
                        }
                        i8 = iM6981 ^ i2;
                        break;
                }
                return;
            }
            iM6982 = C0630.m2566("ۙ۫") ^ i4;
            i6 = ((iM6982 ^ i5) * (-733)) ^ (-1427807716);
            i7 = 1813167958;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0189 A[PHI: r6 r11 r17
      0x0189: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:47:0x0187, B:28:0x00c2, B:20:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0189: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:47:0x0187, B:28:0x00c2, B:20:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0189: PHI (r17v14 int) = (r17v8 int), (r17v13 int), (r17v15 int) binds: [B:47:0x0187, B:28:0x00c2, B:20:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x020d A[PHI: r2 r7 r9 r10 r17
      0x020d: PHI (r2v4 char) = (r2v2 char), (r2v1 char), (r2v1 char), (r2v1 char) binds: [B:59:0x020b, B:43:0x0163, B:32:0x00e9, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x020d: PHI (r7v4 short) = (r7v1 short), (r7v2 short), (r7v1 short), (r7v1 short) binds: [B:59:0x020b, B:43:0x0163, B:32:0x00e9, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x020d: PHI (r9v4 short[]) = (r9v1 short[]), (r9v1 short[]), (r9v2 short[]), (r9v1 short[]) binds: [B:59:0x020b, B:43:0x0163, B:32:0x00e9, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x020d: PHI (r10v4 int) = (r10v1 int), (r10v1 int), (r10v2 int), (r10v1 int) binds: [B:59:0x020b, B:43:0x0163, B:32:0x00e9, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x020d: PHI (r17v20 int) = (r17v4 int), (r17v9 int), (r17v12 int), (r17v23 int) binds: [B:59:0x020b, B:43:0x0163, B:32:0x00e9, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0244 A[PHI: r1 r3 r4 r5 r17
      0x0244: PHI (r1v3 short[]) = (r1v2 short[]), (r1v1 short[]), (r1v1 short[]) binds: [B:63:0x0242, B:55:0x01e6, B:51:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r3v3 short) = (r3v1 short), (r3v2 short), (r3v1 short) binds: [B:63:0x0242, B:55:0x01e6, B:51:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r4v3 short) = (r4v1 short), (r4v2 short), (r4v1 short) binds: [B:63:0x0242, B:55:0x01e6, B:51:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r5v2 int) = (r5v1 int), (r5v1 int), (r5v3 int) binds: [B:63:0x0242, B:55:0x01e6, B:51:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r17v6 int) = (r17v3 int), (r17v5 int), (r17v7 int) binds: [B:63:0x0242, B:55:0x01e6, B:51:0x01bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22129(C8453 c8453, int i) {
        int i2;
        int iM6981;
        int i3;
        int i4;
        int i5;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i6 = 0;
        int i7 = 0;
        short s3 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = -215123559;
        int i12 = C4263.f13799;
        int i13 = C3911.f12484;
        int iM6982 = C2105.m6981("ۡۚ") ^ i13;
        int i14 = ((iM6982 ^ i12) * (-7927)) ^ (-593413465);
        int i15 = iM6982 ^ 1786701613;
        int iM2566 = 0;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i12) * 17667) >> 31));
            switch (i11) {
                case -2106939700:
                case 1852863591:
                    i2 = i8;
                    i7 = i6 + 1;
                    if (C1047.f3863 >= 0) {
                        iM6981 = (C0630.m2566("᩶۫") ^ i13) * (-23);
                        i3 = ((iM6981 ^ i12) * 26419) ^ 51388817;
                        i4 = 503726806;
                    } else {
                        iM6981 = C2105.m6981("ۜۙ") ^ i13;
                        i3 = ((iM6981 ^ i12) * 14221) ^ (-626040457);
                        i4 = -2136047224;
                    }
                    i15 = iM6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case -1935860447:
                case 2115057602:
                    i2 = i8;
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C0630.m2566("ۡ֫") ^ i12;
                        i3 = ((iM6981 ^ i13) * 7209) ^ 1602967252;
                        i4 = -2119384520;
                    } else {
                        iM6981 = (C2105.m6981("ۚܶ") + i13) * 55;
                        i3 = ((iM6981 ^ i12) * (-11057)) ^ (-1528168049);
                        i4 = 1589076136;
                    }
                    i15 = iM6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case -1917044406:
                case -1063939670:
                    i2 = i8;
                    i10 = 3;
                    if (C0382.f1805) {
                        iM6981 = (C0630.m2566("۬᩸") + i12) * 109;
                        i3 = ((iM6981 ^ i13) * (-20517)) ^ (-883653775);
                        i4 = -920745293;
                    } else {
                        iM6981 = (C0630.m2566("᩶۫") ^ i13) * (-23);
                        i3 = ((iM6981 ^ i12) * 26419) ^ 51388817;
                        i4 = 503726806;
                    }
                    i15 = iM6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case -1895956600:
                case 1411546783:
                    i5 = 9985;
                    iM6981 = C2105.m6981("ܶ᩹") ^ i12;
                    i2 = i5;
                    i3 = ((iM6981 ^ i13) * (-20267)) ^ (-629198468);
                    i4 = 304143308;
                    i15 = iM6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case -1828512969:
                case 1128918845:
                    i2 = i8;
                    s = sArr[c];
                    s2 = 2;
                    if (C0382.m1848()) {
                        iM6981 = (C2105.m6981("ܿ֨") ^ i13) * (-115);
                        i3 = ((iM6981 ^ i12) * 29729) ^ (-1363388123);
                        i4 = -1973618825;
                    } else {
                        iM6981 = (i12 - C2105.m6981("۫ۨ")) * (-93);
                        i3 = ((iM6981 ^ i13) * 6387) ^ (-686834122);
                        i4 = 1703001890;
                    }
                    i15 = iM6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case -1753979671:
                case -1621833629:
                    i2 = i8;
                    i6 = s * s2;
                    if (C0050.m940() <= 0) {
                        iM6981 = (C2105.m6981("ܿ֨") ^ i13) * (-115);
                        i3 = ((iM6981 ^ i12) * 29729) ^ (-1363388123);
                        i4 = -1973618825;
                    } else {
                        iM6981 = (i12 - C2105.m6981("ܿ᩸")) * (-35);
                        i3 = ((iM6981 ^ i13) * 31505) ^ 355509485;
                        i4 = 1440879935;
                    }
                    i15 = iM6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case -1675151874:
                case -732750698:
                    i2 = i8;
                    c = 337;
                    if (C4159.m12565() >= 0) {
                        iM6981 = (C0630.m2566("ۗۖ") + i12) * (-51);
                        i3 = ((iM6981 ^ i13) * (-25381)) ^ (-1717608148);
                        i4 = 1465652755;
                    } else {
                        iM6981 = (C0630.m2566("ۛ᩷") ^ i13) * 23;
                        i3 = ((iM6981 ^ i12) * 22901) ^ (-175077639);
                        i4 = 762583000;
                    }
                    i15 = iM6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case -1592748787:
                case 645662951:
                    i2 = i8;
                    sArr2 = f25855;
                    i9 = 338;
                    if (C3019.m9255() <= 0) {
                        iM6981 = (C0630.m2566("ۗۖ") + i12) * (-51);
                        i3 = ((iM6981 ^ i13) * (-25381)) ^ (-1717608148);
                        i4 = 1465652755;
                    } else {
                        iM6981 = C0630.m2566("ۢۖ") ^ i13;
                        i3 = ((iM6981 ^ i12) * 9531) ^ 110909683;
                        i4 = 645294987;
                    }
                    i15 = iM6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case -1409121453:
                case 1436761747:
                    i2 = i8;
                    int i16 = s + s3;
                    if (i7 - (i16 * i16) > 0) {
                        iM6981 = C0630.m2566("ۖ᩶") ^ i13;
                        i3 = ((iM6981 ^ i12) * 12587) ^ (-92133752);
                        i4 = 1746810877;
                    } else {
                        iM6981 = C2105.m6981("ۚ᩺") ^ i13;
                        i3 = ((iM6981 ^ i12) * (-24789)) ^ (-1257556562);
                        i4 = -1915780734;
                    }
                    i15 = iM6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case -1242549766:
                case 1449632833:
                    C4263.m12819();
                    break;
                case -1001701969:
                case -10165727:
                    i2 = i8;
                    sArr = f25855;
                    if (C4075.f12947 >= 0) {
                        iM6981 = (C2105.m6981("ܿ֨") ^ i13) * (-115);
                        i3 = ((iM6981 ^ i12) * 29729) ^ (-1363388123);
                        i4 = -1973618825;
                    } else {
                        iM6981 = C2105.m6981("ۚ֨") ^ i12;
                        i3 = ((iM6981 ^ i13) * (-3599)) ^ 1634570603;
                        i4 = -535826512;
                    }
                    i15 = iM6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case -970709880:
                case -501720866:
                    if (C2167.f7158 < 0) {
                        int iM6983 = (C2105.m6981("᩻ۧ") + i12) * (-7);
                        i15 = iM6983 ^ (-559982720);
                        i14 = ((iM6983 ^ i13) * 26729) ^ 2087971690;
                    } else {
                        i2 = i8;
                        iM6981 = C0630.m2566("ۡ֫") ^ i12;
                        i3 = ((iM6981 ^ i13) * 7209) ^ 1602967252;
                        i4 = -2119384520;
                        i15 = iM6981 ^ i4;
                        i14 = i3;
                        i8 = i2;
                    }
                    break;
                case -840146469:
                case 1528609018:
                    C1128.m3851();
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        i2 = i8;
                        iM6981 = (C0630.m2566("ۗۖ") + i12) * (-51);
                        i3 = ((iM6981 ^ i13) * (-25381)) ^ (-1717608148);
                        i4 = 1465652755;
                        i15 = iM6981 ^ i4;
                        i14 = i3;
                        i8 = i2;
                    } else {
                        int iM6984 = (C2105.m6981("᩻ۧ") + i12) * (-7);
                        i15 = iM6984 ^ (-559982720);
                        i14 = ((iM6984 ^ i13) * 26729) ^ 2087971690;
                    }
                    break;
                case -621538281:
                case 1341876948:
                    C7811.m20844();
                    if (C7106.f21815 == 0) {
                        i2 = i8;
                        iM6981 = (C0630.m2566("᩶۫") ^ i13) * (-23);
                        i3 = ((iM6981 ^ i12) * 26419) ^ 51388817;
                        i4 = 503726806;
                        i15 = iM6981 ^ i4;
                        i14 = i3;
                        i8 = i2;
                    }
                    i2 = i8;
                    iM6981 = C0630.m2566("ۡ֫") ^ i12;
                    i3 = ((iM6981 ^ i13) * 7209) ^ 1602967252;
                    i4 = -2119384520;
                    i15 = iM6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case -157041961:
                case 1716354272:
                    i2 = i8;
                    s3 = 1;
                    if (C1005.f3721) {
                        iM6981 = (i12 - C0630.m2566("ۗᩴ")) * (-23);
                        i3 = ((iM6981 ^ i13) * (-12541)) ^ (-500384286);
                        i4 = 510559280;
                    } else {
                        iM6981 = (C0630.m2566("ۗۖ") + i12) * (-51);
                        i3 = ((iM6981 ^ i13) * (-25381)) ^ (-1717608148);
                        i4 = 1465652755;
                    }
                    i15 = iM6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case 4371652:
                case 1593202296:
                    c8453.m22128(i, ServiceConnectionC3453.m10562(iM2566 ^ 2102768133));
                    break;
                case 825830399:
                case 1608196342:
                    C22628.m50615();
                    i2 = i8;
                    iM6981 = C0630.m2566("ۡ֫") ^ i12;
                    i3 = ((iM6981 ^ i13) * 7209) ^ 1602967252;
                    i4 = -2119384520;
                    i15 = iM6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case 1798064503:
                case 1870745542:
                    i5 = 31089;
                    iM6981 = C2105.m6981("ܶ᩹") ^ i12;
                    i2 = i5;
                    i3 = ((iM6981 ^ i13) * (-20267)) ^ (-629198468);
                    i4 = 304143308;
                    i15 = iM6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                default:
                    iM2566 = C0630.m2566(C0964.m3396(sArr2, i9, i10, i8));
                    if (C2105.m6982() != 0) {
                        i2 = i8;
                        iM6981 = C0630.m2566("ۡ֫") ^ i12;
                        i3 = ((iM6981 ^ i13) * 7209) ^ 1602967252;
                        i4 = -2119384520;
                    } else {
                        iM6981 = (i13 - C0630.m2566("֨ۜ")) * (-31);
                        i2 = i8;
                        i3 = ((iM6981 ^ i12) * 20783) ^ (-1254585477);
                        i4 = 181847813;
                    }
                    i15 = iM6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:67:0x0232 A[PHI: r3 r8 r9 r15
      0x0232: PHI (r3v3 int) = (r3v2 int), (r3v4 int) binds: [B:66:0x0230, B:58:0x01e8] A[DONT_GENERATE, DONT_INLINE]
      0x0232: PHI (r8v3 java.lang.StringBuilder) = (r8v2 java.lang.StringBuilder), (r8v1 java.lang.StringBuilder) binds: [B:66:0x0230, B:58:0x01e8] A[DONT_GENERATE, DONT_INLINE]
      0x0232: PHI (r9v3 android.app.Application) = (r9v2 android.app.Application), (r9v1 android.app.Application) binds: [B:66:0x0230, B:58:0x01e8] A[DONT_GENERATE, DONT_INLINE]
      0x0232: PHI (r15v3 short[]) = (r15v2 short[]), (r15v4 short[]) binds: [B:66:0x0230, B:58:0x01e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m22128(int i, String str) {
        int i2;
        int iM6981;
        int i3;
        int iM6982;
        int i4;
        int i5;
        int iM6983;
        int i6;
        int iM2566;
        int i7;
        int i8;
        short s;
        int iM2567;
        int i9;
        C8453 c8453 = this;
        String str2 = str;
        Runnable[] runnableArr = null;
        Runnable runnable = null;
        Handler handler = null;
        StringBuilder sb = null;
        Application applicationM1842 = null;
        String str3 = null;
        boolean z = false;
        int i10 = 0;
        Runnable runnable2 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 2122856791;
        int i14 = RunnableC1937.f6483;
        int i15 = C0483.f2088;
        int iM6984 = (i14 - C2105.m6981("ܺܶ")) * (-29);
        int i16 = ((iM6984 ^ i15) * (-18781)) ^ 1108083635;
        int i17 = iM6984 ^ (-8345375);
        Runnable runnable3 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i18 = 0;
        int i19 = 0;
        short s2 = 0;
        int i20 = 0;
        int i21 = 0;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i15) * (-29193)) >> 31));
            switch (i13) {
                case -2110041342:
                case 530595100:
                    break;
                case -2059464121:
                case -1644310864:
                    if (C4117.m12364() == 0) {
                        s = s2;
                        runnable3 = runnable3;
                        int iM6985 = (C2105.m6981("ۘ۠") + i14) * (-17);
                        i16 = ((iM6985 ^ i15) * (-27865)) ^ (-1025387656);
                        i17 = iM6985 ^ (-20332618);
                        str2 = str;
                        s2 = s;
                        runnable3 = runnable3;
                        c8453 = this;
                    } else {
                        runnable3 = runnable3;
                        iM6983 = C2105.m6981("᩻ܶ") ^ i14;
                        i16 = 764412354 ^ ((iM6983 ^ i15) * (-2629));
                        i6 = -987864087;
                        i17 = iM6983 ^ i6;
                        c8453 = this;
                        str2 = str;
                        runnable3 = runnable3;
                    }
                    break;
                case -2033630485:
                case -547463453:
                    runnable3 = runnable3;
                    if (C3245.f10203 <= 0) {
                        iM6983 = (i15 - C2105.m6981("ۜ֨")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i16 = (-727031424) ^ ((iM6983 ^ i14) * (-31275));
                        i6 = 1316852678;
                    } else {
                        iM6983 = (C2105.m6981("ۗۜ") + i15) * (-89);
                        i16 = 1633928107 ^ ((iM6983 ^ i14) * 8523);
                        i6 = -1329668882;
                    }
                    i17 = iM6983 ^ i6;
                    c8453 = this;
                    str2 = str;
                    runnable3 = runnable3;
                    break;
                case -2025760556:
                case -345246497:
                    C3245.m9923(sb, str3);
                    sArr2 = f25855;
                    i18 = 335;
                    if (C3663.f11553) {
                        iM2566 = (C0630.m2566("᩷ܰ") + i15) * 43;
                        i7 = ((iM2566 ^ i14) * 31933) ^ (-1756874163);
                        i8 = -1095453378;
                    } else {
                        iM2566 = C2105.m6981("ۤ᩻") ^ i15;
                        i7 = ((iM2566 ^ i14) * 20831) ^ (-1052596121);
                        i8 = -1844610010;
                    }
                    i17 = iM2566 ^ i8;
                    i16 = i7;
                    break;
                case -1975651797:
                case 972056651:
                    if (!RunnableC1108.f4040) {
                        runnable3 = runnable3;
                        iM6983 = C0630.m2566("۬᩺") ^ i15;
                        i16 = (-1792793280) ^ ((iM6983 ^ i14) * 23537);
                        i6 = 1121872317;
                        i17 = iM6983 ^ i6;
                        c8453 = this;
                        str2 = str;
                        runnable3 = runnable3;
                    }
                    runnable3 = runnable3;
                    iM6983 = C2105.m6981("᩻ܶ") ^ i14;
                    i16 = 764412354 ^ ((iM6983 ^ i15) * (-2629));
                    i6 = -987864087;
                    i17 = iM6983 ^ i6;
                    c8453 = this;
                    str2 = str;
                    runnable3 = runnable3;
                    break;
                case -1966806396:
                case 543749829:
                    m22135();
                    runnable3 = runnable3;
                    iM6981 = (i15 - C0630.m2566("ۘܿ")) * 29;
                    i16 = ((iM6981 ^ i14) * 857) ^ 1354101384;
                    i3 = 1497882288;
                    i17 = iM6981 ^ i3;
                    str2 = str;
                    runnable3 = runnable3;
                    break;
                case -1876313840:
                case 470267615:
                    C4117.m12364();
                    if (C0798.m2998() == 0) {
                        runnable3 = runnable3;
                        iM6983 = C2105.m6981("᩻ܶ") ^ i14;
                        i16 = 764412354 ^ ((iM6983 ^ i15) * (-2629));
                        i6 = -987864087;
                        i17 = iM6983 ^ i6;
                        c8453 = this;
                        str2 = str;
                        runnable3 = runnable3;
                    } else {
                        i2 = i20;
                        runnable3 = runnable3;
                        iM6982 = C2105.m6981("ۚܰ") ^ i14;
                        i20 = i2;
                        i4 = ((iM6982 ^ i15) * 20971) ^ 1798147638;
                        i5 = -1575430835;
                        i17 = iM6982 ^ i5;
                        i16 = i4;
                        runnable3 = runnable3;
                        str2 = str;
                    }
                    break;
                case -1817842089:
                case 1294916146:
                    C3245.m9923(sb, C0483.m2128(sArr2, i18, 2, i19));
                    C1420.m4905(sb, str2);
                    if (C3432.f10845 < 0) {
                        iM2566 = (i14 - C0630.m2566("ۧ۬")) * (-21);
                        i7 = ((iM2566 ^ i15) * 27447) ^ (-1651487811);
                        i8 = -1497524615;
                        i17 = iM2566 ^ i8;
                        i16 = i7;
                    } else {
                        runnable3 = runnable3;
                        iM6983 = C2105.m6981("᩻ܶ") ^ i14;
                        i16 = 764412354 ^ ((iM6983 ^ i15) * (-2629));
                        i6 = -987864087;
                        i17 = iM6983 ^ i6;
                        c8453 = this;
                        str2 = str;
                        runnable3 = runnable3;
                    }
                    break;
                case -1557461811:
                case -1233602450:
                    if (c8453.f25861 != 0) {
                        runnable3 = runnable3;
                        iM6981 = (i15 - C0630.m2566("ۘܿ")) * 29;
                        i16 = ((iM6981 ^ i14) * 857) ^ 1354101384;
                        i3 = 1497882288;
                        i17 = iM6981 ^ i3;
                        str2 = str;
                        runnable3 = runnable3;
                    } else {
                        iM2566 = (C0630.m2566("ܺ᩷") + i15) * (-97);
                        i7 = ((iM2566 ^ i14) * (-2561)) ^ 242473881;
                        i8 = -1308314494;
                        i17 = iM2566 ^ i8;
                        i16 = i7;
                    }
                    break;
                case -1527692548:
                case -1472328414:
                    if (i10 < runnableArr.length) {
                        iM2566 = C0630.m2566("ۛۘ") ^ i14;
                        i7 = ((iM2566 ^ i15) * (-12385)) ^ 2044059366;
                        i8 = -579615605;
                    } else {
                        iM2566 = (C0630.m2566("ܰ᩹") ^ i14) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i7 = ((iM2566 ^ i15) * 10601) ^ (-214326349);
                        i8 = 1738646478;
                    }
                    i17 = iM2566 ^ i8;
                    i16 = i7;
                    break;
                case -1517245491:
                case -1053177086:
                    z = false;
                    i10 = 0;
                    iM2566 = C0630.m2566("֫ܽ") ^ i15;
                    i7 = ((iM2566 ^ i14) * (-10417)) ^ (-1881739701);
                    i8 = 1998450131;
                    i17 = iM2566 ^ i8;
                    i16 = i7;
                    break;
                case -1361230290:
                case 1273755039:
                    C1916.m6307(c8453.f25856, C0050.m947(sb));
                    runnable3 = runnable3;
                    iM6981 = (C0630.m2566("۫ܳ") + i14) * (-83);
                    i16 = ((iM6981 ^ i15) * (-11093)) ^ 682087936;
                    i3 = 301843239;
                    i17 = iM6981 ^ i3;
                    str2 = str;
                    runnable3 = runnable3;
                    break;
                case -1324999400:
                case 1544311611:
                    C3911.m11924();
                    if (C0630.f2410 > 0) {
                        iM2566 = C0630.m2566("ۙ᩶") ^ i15;
                        i7 = ((iM2566 ^ i14) * (-29705)) ^ (-2140978173);
                        i8 = 1326055854;
                        i17 = iM2566 ^ i8;
                        i16 = i7;
                    } else {
                        runnable3 = runnable3;
                        iM6983 = C2105.m6981("᩻ܶ") ^ i14;
                        i16 = 764412354 ^ ((iM6983 ^ i15) * (-2629));
                        i6 = -987864087;
                        i17 = iM6983 ^ i6;
                        c8453 = this;
                        str2 = str;
                        runnable3 = runnable3;
                    }
                    break;
                case -1120501932:
                case -638470987:
                    sb = new StringBuilder();
                    applicationM1842 = C0382.m1842();
                    if (C3746.m11369() >= 0) {
                        iM2566 = (C0630.m2566("᩷ܰ") + i15) * 43;
                        i7 = ((iM2566 ^ i14) * 31933) ^ (-1756874163);
                        i8 = -1095453378;
                    } else {
                        iM2566 = (C0630.m2566("ܳۘ") + i14) * (-105);
                        i7 = ((iM2566 ^ i15) * (-16011)) ^ 1734465188;
                        i8 = 1319620404;
                    }
                    i17 = iM2566 ^ i8;
                    i16 = i7;
                    break;
                case -996948254:
                case 1745624080:
                    runnable3 = runnableArr[i];
                    runnable = null;
                    handler = c8453.f25862;
                    if (runnable3 != null) {
                        iM2567 = C0630.m2566("ᩳۖ") ^ i14;
                        i16 = ((iM2567 ^ i15) * (-17309)) ^ (-1743990981);
                        i9 = -1111363251;
                    } else {
                        iM2567 = C0630.m2566("᩵ᩴ") ^ i15;
                        i16 = ((iM2567 ^ i14) * (-19447)) ^ 1162674246;
                        i9 = -155695527;
                    }
                    i17 = iM2567 ^ i9;
                    str2 = str;
                    break;
                case -991262258:
                case 1068859625:
                    i19 = 6165;
                    iM6983 = (i14 - C0630.m2566("ۘᩴ")) * 81;
                    i16 = (-1523452247) ^ ((iM6983 ^ i15) * (-569));
                    i6 = -1783959279;
                    i17 = iM6983 ^ i6;
                    c8453 = this;
                    str2 = str;
                    runnable3 = runnable3;
                    break;
                case -976306166:
                case -211821983:
                    if (!C2520.m8026()) {
                        iM2566 = C0630.m2566("ۙ᩶") ^ i15;
                        i7 = ((iM2566 ^ i14) * (-29705)) ^ (-2140978173);
                        i8 = 1326055854;
                        i17 = iM2566 ^ i8;
                        i16 = i7;
                    } else {
                        runnable3 = runnable3;
                        iM6983 = (i15 - C2105.m6981("ۜ֨")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i16 = (-727031424) ^ ((iM6983 ^ i14) * (-31275));
                        i6 = 1316852678;
                        i17 = iM6983 ^ i6;
                        c8453 = this;
                        str2 = str;
                        runnable3 = runnable3;
                    }
                    break;
                case -918379547:
                case 697851589:
                    runnable3 = runnable3;
                    if (str2 == null) {
                        iM6981 = (C0630.m2566("۫ܳ") + i14) * (-83);
                        i16 = ((iM6981 ^ i15) * (-11093)) ^ 682087936;
                        i3 = 301843239;
                        i17 = iM6981 ^ i3;
                        str2 = str;
                        runnable3 = runnable3;
                    } else {
                        iM6982 = (C2105.m6981("ۗ᩹") + i15) * (-37);
                        i4 = ((iM6982 ^ i14) * (-12981)) ^ (-1378447218);
                        i5 = 1714662514;
                        i17 = iM6982 ^ i5;
                        i16 = i4;
                        runnable3 = runnable3;
                        str2 = str;
                    }
                    break;
                case -870109528:
                case 1468222546:
                    runnable3 = runnable3;
                    runnableArr = c8453.f25860;
                    if (RunnableC1937.f6483 < 0) {
                        iM6981 = (C0630.m2566("ۡۘ") ^ i15) * (-127);
                        i16 = ((iM6981 ^ i14) * (-18637)) ^ 1427018152;
                        i3 = 626170884;
                        i17 = iM6981 ^ i3;
                        str2 = str;
                        runnable3 = runnable3;
                    }
                    iM6983 = (i15 - C2105.m6981("ۜ֨")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i16 = (-727031424) ^ ((iM6983 ^ i14) * (-31275));
                    i6 = 1316852678;
                    i17 = iM6983 ^ i6;
                    c8453 = this;
                    str2 = str;
                    runnable3 = runnable3;
                    break;
                case -842419999:
                case 740365476:
                    handler.removeCallbacks(runnable3);
                    runnableArr[i] = runnable;
                    iM2567 = C0630.m2566("᩵ᩴ") ^ i15;
                    i16 = ((iM2567 ^ i14) * (-19447)) ^ 1162674246;
                    i9 = -155695527;
                    i17 = iM2567 ^ i9;
                    str2 = str;
                    break;
                case -713455604:
                case -625927579:
                    handler.removeCallbacks(runnable2);
                    runnableArr[i10] = runnable;
                    iM2566 = (i15 - C2105.m6981("᩶ۜ")) * (-109);
                    i7 = ((iM2566 ^ i14) * (-29393)) ^ (-1523599493);
                    i8 = -1442479175;
                    i17 = iM2566 ^ i8;
                    i16 = i7;
                    break;
                case -623568887:
                case 2128984033:
                    i19 = 37826;
                    iM6983 = (i14 - C0630.m2566("ۘᩴ")) * 81;
                    i16 = (-1523452247) ^ ((iM6983 ^ i15) * (-569));
                    i6 = -1783959279;
                    i17 = iM6983 ^ i6;
                    c8453 = this;
                    str2 = str;
                    runnable3 = runnable3;
                    break;
                case -590077002:
                case 1240257403:
                    runnable3 = runnable3;
                    sArr = f25855;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6983 = C0630.m2566("۬᩺") ^ i15;
                        i16 = (-1792793280) ^ ((iM6983 ^ i14) * 23537);
                        i6 = 1121872317;
                    } else {
                        iM6983 = C0630.m2566("᩺ܽ") ^ i14;
                        i16 = (-939194306) ^ ((iM6983 ^ i15) * (-8481));
                        i6 = -436376695;
                    }
                    i17 = iM6983 ^ i6;
                    c8453 = this;
                    str2 = str;
                    runnable3 = runnable3;
                    break;
                case -281535539:
                case 1438165451:
                    runnable3 = runnable3;
                    s = s2;
                    int i22 = s * 27126;
                    i12 = s * s;
                    if (C4616.f14690 > 0) {
                        int iM2568 = (C0630.m2566("᩺ۗ") + i14) * (-3);
                        s2 = s;
                        i17 = iM2568 ^ 563890674;
                        i16 = ((iM2568 ^ i15) * (-17437)) ^ (-1544733963);
                        i11 = i22;
                        runnable3 = runnable3;
                        c8453 = this;
                        str2 = str;
                    } else {
                        i11 = i22;
                        int iM6986 = (C2105.m6981("ۘ۠") + i14) * (-17);
                        i16 = ((iM6986 ^ i15) * (-27865)) ^ (-1025387656);
                        i17 = iM6986 ^ (-20332618);
                        str2 = str;
                        s2 = s;
                        runnable3 = runnable3;
                        c8453 = this;
                    }
                    break;
                case -223839390:
                case 1140270860:
                    C4925.m14310(c8453.f25859);
                    c8453.f25858 = z;
                    iM2566 = C0630.m2566("᩹۟") ^ i15;
                    i7 = ((iM2566 ^ i14) * 13105) ^ (-1163785154);
                    i8 = 1441040129;
                    i17 = iM2566 ^ i8;
                    i16 = i7;
                    break;
                case 48386685:
                case 497288958:
                    if (c8453.f25858) {
                        iM2566 = (C0630.m2566("ۖۖ") + i14) * q.h;
                        i7 = ((iM2566 ^ i15) * (-28905)) ^ 1170540473;
                        i8 = 2136596558;
                    } else {
                        iM2566 = C0630.m2566("᩹۟") ^ i15;
                        i7 = ((iM2566 ^ i14) * 13105) ^ (-1163785154);
                        i8 = 1441040129;
                    }
                    i17 = iM2566 ^ i8;
                    i16 = i7;
                    break;
                case 145156897:
                case 349972523:
                    i2 = i20;
                    runnable3 = runnable3;
                    c8453.f25861 = i21 & (~i2);
                    if (C3537.m10746() > 0) {
                        i20 = i2;
                        iM6981 = (C2105.m6981("ᩴ᩶") ^ i14) * 21;
                        i16 = ((iM6981 ^ i15) * 15115) ^ (-491143357);
                        i3 = -1595359590;
                        i17 = iM6981 ^ i3;
                        str2 = str;
                        runnable3 = runnable3;
                    } else {
                        iM6982 = C2105.m6981("ۚܰ") ^ i14;
                        i20 = i2;
                        i4 = ((iM6982 ^ i15) * 20971) ^ 1798147638;
                        i5 = -1575430835;
                        i17 = iM6982 ^ i5;
                        i16 = i4;
                        runnable3 = runnable3;
                        str2 = str;
                    }
                    break;
                case 170198406:
                case 1431374942:
                    i10++;
                    iM2566 = C0630.m2566("֫ܽ") ^ i15;
                    i7 = ((iM2566 ^ i14) * (-10417)) ^ (-1881739701);
                    i8 = 1998450131;
                    i17 = iM2566 ^ i8;
                    i16 = i7;
                    break;
                case 578009864:
                case 1948092576:
                    runnable3 = runnable3;
                    s2 = sArr[334];
                    if (C4616.f14690 <= 0) {
                        iM6983 = C2105.m6981("᩻ܶ") ^ i14;
                        i16 = 764412354 ^ ((iM6983 ^ i15) * (-2629));
                        i6 = -987864087;
                    } else {
                        iM6983 = (i15 - C0630.m2566("۬ۨ")) * 19;
                        i16 = (-1450572037) ^ ((iM6983 ^ i14) * (-21101));
                        i6 = -633971762;
                    }
                    i17 = iM6983 ^ i6;
                    c8453 = this;
                    str2 = str;
                    runnable3 = runnable3;
                    break;
                case 613796692:
                case 1809245785:
                    runnable3 = runnable3;
                    if ((i12 + 183954969) - i11 >= 0) {
                        iM6983 = C2105.m6981("֡ۜ") ^ i15;
                        i16 = 1525881866 ^ ((iM6983 ^ i14) * 6521);
                        i6 = -1580837703;
                    } else {
                        iM6983 = (i14 - C0630.m2566("ܰۨ")) * 23;
                        i16 = 1923815502 ^ ((iM6983 ^ i15) * (-611));
                        i6 = -544284432;
                    }
                    i17 = iM6983 ^ i6;
                    c8453 = this;
                    str2 = str;
                    runnable3 = runnable3;
                    break;
                case 753802262:
                case 1284555004:
                    runnable2 = runnableArr[i10];
                    if (runnable2 != null) {
                        iM2566 = (C0630.m2566("ܳܰ") + i15) * 109;
                        i7 = ((iM2566 ^ i14) * (-13407)) ^ 1602775651;
                        i8 = -656626043;
                    } else {
                        iM2566 = (i15 - C2105.m6981("᩶ۜ")) * (-109);
                        i7 = ((iM2566 ^ i14) * (-29393)) ^ (-1523599493);
                        i8 = -1442479175;
                    }
                    i17 = iM2566 ^ i8;
                    i16 = i7;
                    break;
                case 872141297:
                case 2087467922:
                    C22628.m50615();
                    C22628.m50615();
                    break;
                case 959572665:
                case 1721828992:
                    if (C0237.m1481() < 0) {
                        iM2566 = C0630.m2566("ۙ᩶") ^ i15;
                        i7 = ((iM2566 ^ i14) * (-29705)) ^ (-2140978173);
                        i8 = 1326055854;
                    } else {
                        iM2566 = (C0630.m2566("֡۬") ^ i14) * (-11);
                        i7 = ((iM2566 ^ i15) * (-19537)) ^ 1690650506;
                        i8 = 822582558;
                    }
                    i17 = iM2566 ^ i8;
                    i16 = i7;
                    break;
                case 1425965272:
                case 1497543836:
                    C1420.m4913();
                    C1504.m5179();
                    i2 = i20;
                    runnable3 = runnable3;
                    iM6982 = C2105.m6981("ۚܰ") ^ i14;
                    i20 = i2;
                    i4 = ((iM6982 ^ i15) * 20971) ^ 1798147638;
                    i5 = -1575430835;
                    i17 = iM6982 ^ i5;
                    i16 = i4;
                    runnable3 = runnable3;
                    str2 = str;
                    break;
                case 1732897323:
                case 1737281677:
                    str3 = m22131((Context) applicationM1842)[i];
                    if (C21923.f70183 == 0) {
                        iM2566 = (C0630.m2566("ۙܺ") + i14) * 35;
                        i7 = ((iM2566 ^ i15) * 30253) ^ 212400177;
                        i8 = 422474174;
                        i17 = iM2566 ^ i8;
                        i16 = i7;
                    } else {
                        i2 = i20;
                        runnable3 = runnable3;
                        iM6982 = C2105.m6981("ۚܰ") ^ i14;
                        i20 = i2;
                        i4 = ((iM6982 ^ i15) * 20971) ^ 1798147638;
                        i5 = -1575430835;
                        i17 = iM6982 ^ i5;
                        i16 = i4;
                        runnable3 = runnable3;
                        str2 = str;
                    }
                    break;
                default:
                    runnable3 = runnable3;
                    int i23 = c8453.f25861;
                    i20 = 1 << i;
                    if ((i23 & i20) != 0) {
                        int iM6987 = C2105.m6981("᩹֡") ^ i15;
                        i17 = iM6987 ^ (-872659872);
                        i16 = ((iM6987 ^ i14) * (-12035)) ^ 968676823;
                        i21 = i23;
                        runnable3 = runnable3;
                        c8453 = this;
                        str2 = str;
                    } else {
                        i21 = i23;
                        iM6981 = (i15 - C0630.m2566("ۘܿ")) * 29;
                        i16 = ((iM6981 ^ i14) * 857) ^ 1354101384;
                        i3 = 1497882288;
                        i17 = iM6981 ^ i3;
                        str2 = str;
                        runnable3 = runnable3;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0130 A[PHI: r4 r5
      0x0130: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v2 java.lang.String) binds: [B:34:0x012e, B:12:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0130: PHI (r5v4 int) = (r5v3 int), (r5v2 int) binds: [B:34:0x012e, B:12:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x017e A[PHI: r11 r12 r13
      0x017e: PHI (r11v3 short[]) = (r11v2 short[]), (r11v5 short[]) binds: [B:9:0x0071, B:6:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x017e: PHI (r12v3 int) = (r12v2 int), (r12v5 int) binds: [B:9:0x0071, B:6:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x017e: PHI (r13v3 int) = (r13v2 int), (r13v5 int) binds: [B:9:0x0071, B:6:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0203 A[PHI: r2
      0x0203: PHI (r2v4 java.util.ArrayList) = (r2v2 java.util.ArrayList), (r2v2 java.util.ArrayList), (r2v3 java.util.ArrayList), (r2v2 java.util.ArrayList) binds: [B:51:0x01e9, B:47:0x01cc, B:44:0x01b0, B:20:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02b3 A[PHI: r7 r8 r9 r18 r19 r20 r25
      0x02b3: PHI (r7v5 java.lang.String) = 
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v4 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
     binds: [B:70:0x02b1, B:66:0x0295, B:62:0x0278, B:26:0x00ce, B:22:0x00a9, B:17:0x0086, B:15:0x0082, B:12:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:70:0x02b1, B:66:0x0295, B:62:0x0278, B:26:0x00ce, B:22:0x00a9, B:17:0x0086, B:15:0x0082, B:12:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:70:0x02b1, B:66:0x0295, B:62:0x0278, B:26:0x00ce, B:22:0x00a9, B:17:0x0086, B:15:0x0082, B:12:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r18v4 short) = (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short), (r18v2 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:70:0x02b1, B:66:0x0295, B:62:0x0278, B:26:0x00ce, B:22:0x00a9, B:17:0x0086, B:15:0x0082, B:12:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r19v4 int) = (r19v2 int), (r19v3 int), (r19v2 int), (r19v2 int), (r19v2 int), (r19v2 int), (r19v2 int), (r19v2 int) binds: [B:70:0x02b1, B:66:0x0295, B:62:0x0278, B:26:0x00ce, B:22:0x00a9, B:17:0x0086, B:15:0x0082, B:12:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r20v4 int) = (r20v2 int), (r20v2 int), (r20v3 int), (r20v2 int), (r20v2 int), (r20v2 int), (r20v2 int), (r20v2 int) binds: [B:70:0x02b1, B:66:0x0295, B:62:0x0278, B:26:0x00ce, B:22:0x00a9, B:17:0x0086, B:15:0x0082, B:12:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r25v5 int) = (r25v3 int), (r25v3 int), (r25v4 int), (r25v3 int), (r25v3 int), (r25v3 int), (r25v3 int), (r25v3 int) binds: [B:70:0x02b1, B:66:0x0295, B:62:0x0278, B:26:0x00ce, B:22:0x00a9, B:17:0x0086, B:15:0x0082, B:12:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02e9 A[PHI: r3 r16 r17
      0x02e9: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:74:0x02e7, B:38:0x0164, B:15:0x0082, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x02e9: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:74:0x02e7, B:38:0x0164, B:15:0x0082, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x02e9: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:74:0x02e7, B:38:0x0164, B:15:0x0082, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m22135() {
        int iM2566;
        int i;
        int i2;
        int i3 = C3432.f10845;
        int i4 = C4616.f14690;
        int iM6981 = C2105.m6981("ۙܿ") ^ i4;
        int i5 = ((iM6981 ^ i3) * (-3165)) ^ (-1570679540);
        String strJoin = null;
        String strM6435 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6981 ^ (-634870886);
        int iM6982 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        char c = 0;
        short s = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 778381231;
        int i13 = 0;
        String strM5917 = null;
        Object[] objArr = null;
        short[] sArr3 = null;
        ArrayList arrayList = null;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * 20029) >> 31));
            switch (i12) {
                case -2005561146:
                case -300776882:
                    strM5917 = C1773.m5917(sArr, i8, i9, i7);
                    if (C7106.f21815 != 0) {
                        iM2566 = C2105.m6981("ۖ᩻") ^ i4;
                        i = ((iM2566 ^ i3) * 3643) ^ 1785410237;
                        i2 = 1448576962;
                    } else {
                        iM2566 = C0630.m2566("֫۠") ^ i4;
                        i = ((iM2566 ^ i3) * 17497) ^ (-2063639971);
                        i2 = -28053110;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1862211036:
                case -1150594317:
                    s = sArr3[c];
                    if (C0422.f1886 <= 0) {
                        iM2566 = C0630.m2566("ۗܶ") ^ i4;
                        i = ((iM2566 ^ i3) * (-17309)) ^ (-1116847298);
                        i2 = 842366298;
                    } else {
                        iM2566 = (C0630.m2566("᩸ܳ") + i4) * 123;
                        i = ((iM2566 ^ i3) * 30319) ^ (-1945128664);
                        i2 = 1020193211;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1615830732:
                case 1707015745:
                    iM6982 = C2105.m6981(strM6435);
                    i15 = 2119700645;
                    if (C5695.f17556 >= 0) {
                        iM2566 = C0630.m2566("ۗܶ") ^ i4;
                        i = ((iM2566 ^ i3) * (-17309)) ^ (-1116847298);
                        i2 = 842366298;
                    } else {
                        iM2566 = (C0630.m2566("ۨ᩺") + i3) * (-9);
                        i = ((iM2566 ^ i4) * (-10431)) ^ 1698860747;
                        i2 = -111932262;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1591783262:
                case -920696651:
                    i10 = s + 1;
                    if (C5695.f17556 >= 0) {
                        iM2566 = C0630.m2566("ۗܶ") ^ i4;
                        i = ((iM2566 ^ i3) * (-17309)) ^ (-1116847298);
                        i2 = 842366298;
                    } else {
                        iM2566 = C0630.m2566("ۤ᩻") ^ i4;
                        i = ((iM2566 ^ i3) * (-29227)) ^ 55237218;
                        i2 = 2132995710;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1546637410:
                case -1295193593:
                    objArr = new Object[i14];
                    objArr[0] = strJoin;
                    sArr2 = f25855;
                    if (C1916.m6308() >= 0) {
                        iM2566 = (C2105.m6981("ۧܰ") + i4) * 99;
                        i = ((iM2566 ^ i3) * 26073) ^ 396674313;
                        i2 = 691943969;
                    } else {
                        iM2566 = (i3 - C0630.m2566("۟ۨ")) * (-5);
                        i = ((iM2566 ^ i4) * (-20981)) ^ 368734250;
                        i2 = 1845615726;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1489702034:
                case 1730736549:
                    arrayList = this.f25856;
                    if (C3537.m10754(arrayList)) {
                        iM2566 = (C0630.m2566("ܽ᩻") + i3) * (-79);
                        i = ((iM2566 ^ i4) * (-24135)) ^ 681404771;
                        i2 = 1169051857;
                    } else {
                        iM2566 = (C2105.m6981("ۧ۟") ^ i3) * (-61);
                        i = ((iM2566 ^ i4) * (-6287)) ^ (-1985117357);
                        i2 = 1387968431;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1144456539:
                case 1894561639:
                    RunnableC1937.m6387();
                    iM2566 = C0630.m2566("ۗܶ") ^ i4;
                    i = ((iM2566 ^ i3) * (-17309)) ^ (-1116847298);
                    i2 = 842366298;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1118191287:
                case -475581285:
                    if (C11340.f33930 >= 0) {
                        iM2566 = C0630.m2566("ۗܶ") ^ i4;
                        i = ((iM2566 ^ i3) * (-17309)) ^ (-1116847298);
                        i2 = 842366298;
                    } else {
                        iM2566 = C2105.m6981("ۖ᩻") ^ i4;
                        i = ((iM2566 ^ i3) * 3643) ^ 1785410237;
                        i2 = 1448576962;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1115563529:
                case -655844897:
                    strJoin = TextUtils.join(strM5917, arrayList);
                    i14 = 1;
                    if (C7106.f21815 != 0) {
                        iM2566 = (C2105.m6981("۬᩹") + i3) * 23;
                        i = ((iM2566 ^ i4) * 1807) ^ 1577491199;
                        i2 = -105899638;
                    } else {
                        iM2566 = C2105.m6981("۫ܽ") ^ i3;
                        i = ((iM2566 ^ i4) * 30751) ^ 45688703;
                        i2 = 381987076;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1029398083:
                case -461559150:
                    if (this.f25861 == 0) {
                        iM2566 = (C2105.m6981("᩹ۜ") ^ i3) * (-99);
                        i = ((iM2566 ^ i4) * (-1917)) ^ 1760518678;
                        i2 = -1864536966;
                    } else {
                        iM2566 = (C0630.m2566("ܽ᩻") + i3) * (-79);
                        i = ((iM2566 ^ i4) * (-24135)) ^ 681404771;
                        i2 = 1169051857;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -742223558:
                case 1733422600:
                    C3019.m9255();
                    if (C4159.f13567) {
                        iM2566 = C0630.m2566("ܶ᩶") ^ i3;
                        i = ((iM2566 ^ i4) * (-12369)) ^ (-788547033);
                        i2 = 1667754721;
                    } else {
                        iM2566 = C2105.m6981("ۖ᩻") ^ i4;
                        i = ((iM2566 ^ i3) * 3643) ^ 1785410237;
                        i2 = 1448576962;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -697087031:
                case 1542583926:
                    C4616.m13552();
                    if (C22628.m50615() != 0) {
                        iM2566 = C0630.m2566("ۗܶ") ^ i4;
                        i = ((iM2566 ^ i3) * (-17309)) ^ (-1116847298);
                        i2 = 842366298;
                    } else {
                        iM2566 = (C2105.m6981("۬᩹") + i3) * 23;
                        i = ((iM2566 ^ i4) * 1807) ^ 1577491199;
                        i2 = -105899638;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -553168433:
                case 1393071808:
                    i7 = 35637;
                    iM2566 = (C2105.m6981("ܰ۠") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i = ((iM2566 ^ i3) * (-10421)) ^ (-1567950357);
                    i2 = -1924469225;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -183245470:
                case 716208213:
                    if ((i13 + 1) - i11 > 0) {
                        iM2566 = C0630.m2566("ۤ᩶") ^ i4;
                        i = ((iM2566 ^ i3) * (-15577)) ^ (-139728875);
                        i2 = 1689281207;
                    } else {
                        iM2566 = C2105.m6981("ۡ᩹") ^ i3;
                        i = ((iM2566 ^ i4) * (-21709)) ^ (-1582671105);
                        i2 = -434363824;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -57432356:
                case 2117040602:
                    sArr3 = f25855;
                    c = 351;
                    if (C3683.m11222()) {
                        iM2566 = C2105.m6981("ۖ᩻") ^ i4;
                        i = ((iM2566 ^ i3) * 3643) ^ 1785410237;
                        i2 = 1448576962;
                    } else {
                        iM2566 = C0630.m2566("֫ܿ") ^ i3;
                        i = ((iM2566 ^ i4) * 24515) ^ (-1476334973);
                        i2 = 243253039;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 87999334:
                case 1108036709:
                    i7 = 35980;
                    iM2566 = (C2105.m6981("ܰ۠") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i = ((iM2566 ^ i3) * (-10421)) ^ (-1567950357);
                    i2 = -1924469225;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 344881317:
                case 775989950:
                    C4616.m13552();
                    RunnableC1937.m6387();
                    break;
                case 413097899:
                case 1957317302:
                    strM6435 = ViewOnClickListenerC1958.m6435(sArr2, 353, 3, i7);
                    if (C2126.f7087) {
                        iM2566 = C0630.m2566("ۗܶ") ^ i4;
                        i = ((iM2566 ^ i3) * (-17309)) ^ (-1116847298);
                        i2 = 842366298;
                    } else {
                        iM2566 = (i4 - C2105.m6981("᩵۫")) * 85;
                        i = ((iM2566 ^ i3) * (-29647)) ^ (-1414722993);
                        i2 = 1157510726;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 819693380:
                case 1870761703:
                    if (this.f25863) {
                        iM2566 = (C0630.m2566("ۙ۠") ^ i4) * (-69);
                        i = ((iM2566 ^ i3) * 17659) ^ 512666680;
                        i2 = 1810514479;
                    } else {
                        iM2566 = (C0630.m2566("ܽ᩻") + i3) * (-79);
                        i = ((iM2566 ^ i4) * (-24135)) ^ 681404771;
                        i2 = 1169051857;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 843082658:
                case 1539581175:
                    break;
                case 1152271377:
                case 1528060652:
                    C21374.m48464(C3245.m9924(iM6982 ^ i15, objArr));
                    C1047.m3597(arrayList);
                    iM2566 = (C0630.m2566("ܽ᩻") + i3) * (-79);
                    i = ((iM2566 ^ i4) * (-24135)) ^ 681404771;
                    i2 = 1169051857;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 1411955424:
                case 1503248553:
                    i11 = i10 * i10;
                    i13 = s * 2;
                    if (C0237.f1507 != 0) {
                        iM2566 = C0630.m2566("ۗܶ") ^ i4;
                        i = ((iM2566 ^ i3) * (-17309)) ^ (-1116847298);
                        i2 = 842366298;
                    } else {
                        iM2566 = C0630.m2566("֫᩺") ^ i3;
                        i = ((iM2566 ^ i4) * (-28691)) ^ (-2001364724);
                        i2 = 1074230373;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    sArr = f25855;
                    i8 = 352;
                    i9 = 1;
                    if (C2105.f7037 != 0) {
                        iM2566 = C0630.m2566("ܶ᩶") ^ i3;
                        i = ((iM2566 ^ i4) * (-12369)) ^ (-788547033);
                        i2 = 1667754721;
                    } else {
                        iM2566 = C2105.m6981("֫ۘ") ^ i4;
                        i = ((iM2566 ^ i3) * (-3513)) ^ 111192459;
                        i2 = -1362167669;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }
}
