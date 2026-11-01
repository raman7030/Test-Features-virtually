package p067l;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.TwofishEngine;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.۠᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V6YT */
/* JADX INFO: loaded from: classes4.dex */
public class C10403 extends AbstractC7545 implements InterfaceC10052 {

    /* JADX INFO: renamed from: ֫֫ */
    public static final String[] f28766;

    /* JADX INFO: renamed from: ۟ */
    public static final String[] f28767;

    /* JADX INFO: renamed from: ܰ */
    public static final String[] f28768;

    /* JADX INFO: renamed from: ܳ᩹ۡ, reason: not valid java name and contains not printable characters */
    private static final short[] f82087 = {4445, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26641, 26630, 26638, 26636, 26647, 26630, 26701, 26673, 26630, 26638, 26636, 26647, 26630, 26672, 26630, 26641, 26645, 26630, 26641, 26672, 26630, 26641, 26645, 26634, 26624, 26630, 26701, 26658, 26656, 26679, 26666, 26668, 26669, 26684, 26672, 26679, 26658, 26673, 26679, 26662, 26663, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26643, 26639, 26646, 26640, 26701, 26661, 26679, 26675, 26684, 26672, 26662, 26673, 26677, 26662, 26673, 26684, 26672, 26679, 26658, 26673, 26679, 26662, 26663, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26638, 26624, 26643, 26701, 26658, 26656, 26679, 26666, 26668, 26669, 26684, 26672, 26679, 26658, 26673, 26679, 26662, 26663, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26641, 26630, 26638, 26636, 26647, 26630, 26701, 26673, 26630, 26638, 26636, 26647, 26630, 26672, 26630, 26641, 26645, 26630, 26641, 26672, 26630, 26641, 26645, 26634, 26624, 26630, 26701, 26658, 26656, 26679, 26666, 26668, 26669, 26684, 26661, 26658, 26666, 26671, 26662, 26663, 26684, 26679, 26668, 26684, 26672, 26679, 26658, 26673, 26679, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26643, 26639, 26646, 26640, 26701, 26661, 26679, 26675, 26684, 26672, 26662, 26673, 26677, 26662, 26673, 26684, 26661, 26658, 26666, 26671, 26662, 26663, 26684, 26679, 26668, 26684, 26672, 26679, 26658, 26673, 26679, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26638, 26624, 26643, 26701, 26658, 26656, 26679, 26666, 26668, 26669, 26684, 26661, 26658, 26666, 26671, 26662, 26663, 26684, 26679, 26668, 26684, 26672, 26679, 26658, 26673, 26679, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26641, 26630, 26638, 26636, 26647, 26630, 26701, 26673, 26630, 26638, 26636, 26647, 26630, 26672, 26630, 26641, 26645, 26630, 26641, 26672, 26630, 26641, 26645, 26634, 26624, 26630, 26701, 26658, 26656, 26679, 26666, 26668, 26669, 26684, 26672, 26679, 26668, 26675, 26675, 26662, 26663, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26643, 26639, 26646, 26640, 26701, 26661, 26679, 26675, 26684, 26672, 26662, 26673, 26677, 26662, 26673, 26684, 26672, 26679, 26668, 26675, 26675, 26662, 26663, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26638, 26624, 26643, 26701, 26658, 26656, 26679, 26666, 26668, 26669, 26684, 26672, 26679, 26668, 26675, 26675, 26662, 26663, 6503, -27656, -27678, 8854, -4431, 2282, 11069, 8987, -9063, -15257, -15501, -9523, -2668, 11461, -3039, 12678, -3395, 6198, -29889, -10008, -3349, 3531, 1242, -22110, -22110, -22105, -22094, -22140, -22081, -22086, -22081, -22082, -22106, -22081, -22031, -22110, -22107, -22096, -22109, -22107, -22108, -22111, -22031, -22110, -22092, -22109, -22105, -22088, -22094, -22092, -22037, -22031};

    /* JADX INFO: renamed from: ۗ */
    public final ArrayList f28769;

    /* JADX INFO: renamed from: ۙ */
    public boolean f28770;

    /* JADX INFO: renamed from: ۛ */
    public boolean f28771;

    /* JADX INFO: renamed from: ۤ */
    public final BroadcastReceiver f28772;

    /* JADX INFO: renamed from: ۨ */
    public final Runnable[] f28773;

    /* JADX INFO: renamed from: ۫ */
    public int f28774;

    /* JADX INFO: renamed from: ۬ */
    public final Handler f28775;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f28776;

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo8221(InterfaceC24784 interfaceC24784) {
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ void mo8223(InterfaceC24784 interfaceC24784) {
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ void mo8225(InterfaceC24784 interfaceC24784) {
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ void mo8226(InterfaceC24784 interfaceC24784) {
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
    public C10403() {
        int iM55979;
        int i;
        ArrayList arrayList = null;
        Runnable[] runnableArr = null;
        int i2 = -640309843;
        int i3 = C1003.f81929;
        int i4 = C0906.f81862;
        int iM559710 = C0946.m55979("᩵֡") ^ i4;
        int i5 = ((iM559710 ^ i3) * (-3457)) ^ (-1525600094);
        int i6 = 1531004617;
        while (true) {
            int i7 = iM559710 ^ i6;
            Handler handler = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 19565) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2134438722:
                    case 1515134009:
                        C0898.m55800();
                        iM559710 = (i3 - C0946.m55979("֫۟")) * 45;
                        i5 = ((iM559710 ^ i4) * 3409) ^ 858602646;
                        i6 = -1420562015;
                        break;
                    case -1874450756:
                    case -1401488180:
                        this.f28775 = handler;
                        if (C1044.m56286() <= 0) {
                            iM55979 = (C0946.m55979("ܺܰ") ^ i4) * (-49);
                            i5 = ((iM55979 ^ i3) * 18589) ^ 1046017288;
                            i = -5278259;
                        } else {
                            iM55979 = (C0946.m55979("֨ۧ") + i4) * 59;
                            i5 = ((iM55979 ^ i3) * 15597) ^ (-1933196188);
                            i = 284155374;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -1795058386:
                    case -1481150266:
                        if (C1028.f81950 > 0) {
                            iM559710 = C0873.m55680("֨۬") ^ i3;
                            i5 = ((iM559710 ^ i4) * (-131)) ^ (-1664535367);
                            i6 = -1853836596;
                        } else {
                            iM559710 = (i3 - C0946.m55979("֫۟")) * 45;
                            i5 = ((iM559710 ^ i4) * 3409) ^ 858602646;
                            i6 = -1420562015;
                        }
                        break;
                    case -1536719899:
                    case 1585018220:
                        C1124.m56367();
                        C1229.m56410();
                        throw new RuntimeException();
                    case -1311794126:
                    case -1275503392:
                        C0892.m55749();
                        if (C0854.f81826 != 0) {
                            iM559710 = (i3 - C0946.m55979("֫۟")) * 45;
                            i5 = ((iM559710 ^ i4) * 3409) ^ 858602646;
                            i6 = -1420562015;
                        }
                        iM55979 = (C0946.m55979("ܺܰ") ^ i4) * (-49);
                        i5 = ((iM55979 ^ i3) * 18589) ^ 1046017288;
                        i = -5278259;
                        i7 = iM55979 ^ i;
                        break;
                    case -1250630531:
                    case -196425426:
                        Looper looperM55978 = C0946.m55978();
                        if (RunnableC0938.m55938() == 0) {
                            if (C1017.f81942 >= 0) {
                                iM559710 = (i3 - C0946.m55979("֫۟")) * 45;
                                i5 = ((iM559710 ^ i4) * 3409) ^ 858602646;
                                i6 = -1420562015;
                                break;
                            } else if (C0967.f81910 < 0) {
                                if (C1036.f81953 < 0) {
                                    handler = new Handler(looperM55978);
                                    if (RunnableC0938.f81886 < 0) {
                                        iM55979 = (i3 - C0946.m55979("ᩳۚ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                        i5 = ((iM55979 ^ i4) * (-30045)) ^ (-91693260);
                                        i = 1911756555;
                                        i7 = iM55979 ^ i;
                                        break;
                                    }
                                }
                                iM559710 = C0873.m55680("ۜ᩶") ^ i4;
                                i5 = ((iM559710 ^ i3) * 28955) ^ 493944855;
                                i6 = -787152076;
                                break;
                            }
                        }
                        iM559710 = C0873.m55680("֨۬") ^ i3;
                        i5 = ((iM559710 ^ i4) * (-131)) ^ (-1664535367);
                        i6 = -1853836596;
                        break;
                    case -730263999:
                    case 1891961344:
                        this.f28769 = arrayList;
                        if (C1404.f82149 < 0) {
                            iM55979 = (i3 - C0873.m55680("ۙۢ")) * 3;
                            i5 = ((iM55979 ^ i4) * (-6743)) ^ (-1110913712);
                            i = 589913203;
                            i7 = iM55979 ^ i;
                        } else {
                            iM559710 = C0873.m55680("ۜ᩶") ^ i4;
                            i5 = ((iM559710 ^ i3) * 28955) ^ 493944855;
                            i6 = -787152076;
                        }
                        break;
                    case 9772184:
                    case 1145056206:
                        runnableArr = new Runnable[3];
                        if (C1003.f81929 <= 0) {
                            iM55979 = (C0946.m55979("ۙۚ") ^ i4) * (-19);
                            i5 = ((iM55979 ^ i3) * (-4783)) ^ 2140961442;
                            i = -1755415188;
                        } else {
                            iM55979 = C0873.m55680("᩺ܿ") ^ i3;
                            i5 = ((iM55979 ^ i4) * 6497) ^ (-1560258456);
                            i = 1096956303;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case 252872460:
                    case 1662541282:
                        this.f28773 = runnableArr;
                        if (C1964.f83032 <= 0) {
                            iM55979 = (C0946.m55979("ܺܰ") ^ i4) * (-49);
                            i5 = ((iM55979 ^ i3) * 18589) ^ 1046017288;
                            i = -5278259;
                        } else {
                            iM55979 = (i4 - C0873.m55680("ۘ᩹")) * 95;
                            i5 = ((iM55979 ^ i3) * 24721) ^ (-483789954);
                            i = -985794535;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case 821208170:
                    case 1204035968:
                        arrayList = new ArrayList();
                        if (C0845.f81821 < 0) {
                            iM55979 = C0946.m55979("ᩳۤ") ^ i4;
                            i5 = ((iM55979 ^ i3) * (-16991)) ^ 1126792595;
                            i = 2071102139;
                            i7 = iM55979 ^ i;
                        } else {
                            iM559710 = C0873.m55680("֨۬") ^ i3;
                            i5 = ((iM559710 ^ i4) * (-131)) ^ (-1664535367);
                            i6 = -1853836596;
                        }
                        break;
                    case 920581167:
                    case 1308233327:
                        this.f28772 = new C3697(this);
                        return;
                    default:
                        C0890.m55740();
                        if (C0992.f81922 >= 0) {
                            iM559710 = C0873.m55680("֨۬") ^ i3;
                            i5 = ((iM559710 ^ i4) * (-131)) ^ (-1664535367);
                            i6 = -1853836596;
                        }
                        iM55979 = (C0946.m55979("ۙۚ") ^ i4) * (-19);
                        i5 = ((iM55979 ^ i3) * (-4783)) ^ 2140961442;
                        i = -1755415188;
                        i7 = iM55979 ^ i;
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
        String strM55893;
        short[] sArr2;
        int iM55979;
        int i4;
        short[] sArr3;
        String str2;
        String str3;
        int i5;
        int iM55680;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iM559710;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iM559711;
        int iM559712;
        int i18;
        String str4 = null;
        String[] strArr2 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i19 = C0967.f81910;
        int i20 = C1025.f81947;
        int iM559713 = C0946.m55979("ۤۢ") ^ i20;
        int i21 = ((iM559713 ^ i19) * (-16235)) ^ (-675606742);
        int i22 = iM559713 ^ 1552986992;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1891017409;
        String strM56276 = null;
        String str5 = null;
        String str6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        String strM55773 = null;
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
                    str = strM55773;
                    str4 = str4;
                    strM56276 = strM56276;
                    i = i27;
                    short[] sArr9 = sArr7;
                    strArr = strArr2;
                    i2 = i31;
                    i3 = i32;
                    sArr = sArr9;
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0873.m55680("۬ۡ") ^ i19;
                        i6 = ((iM55680 ^ i20) * 2673) ^ 465013443;
                        i7 = -2097094026;
                        int i34 = iM55680 ^ i7;
                        strM55773 = str;
                        i21 = i6;
                        str4 = str4;
                        sArr8 = sArr8;
                        i22 = i34;
                        i27 = i;
                        strM56276 = strM56276;
                        i33 = i33;
                        int i35 = i3;
                        i31 = i2;
                        strArr2 = strArr;
                        sArr7 = sArr;
                        i32 = i35;
                    } else {
                        sArr2 = sArr8;
                        strM55893 = str6;
                        str6 = strM55893;
                        int iM55681 = (C0873.m55680("۟۠") ^ i19) * (-59);
                        strM55773 = str;
                        i21 = ((iM55681 ^ i20) * (-25811)) ^ 403728060;
                        i22 = iM55681 ^ 1223007817;
                        i27 = i;
                        strM56276 = strM56276;
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
                    String str8 = strM55773;
                    str4 = str4;
                    strM56276 = strM56276;
                    i = i27;
                    short[] sArr10 = sArr7;
                    strArr2 = strArr2;
                    i31 = i31;
                    i11 = i32;
                    sArr7 = sArr10;
                    i25 = i24 + 216796176;
                    if (C0873.m55678()) {
                        strM55773 = str8;
                        i8 = i11;
                        i31 = i31;
                        int iM559714 = C0946.m55979("֨ܽ") ^ i20;
                        i13 = -941267137;
                        i14 = i8;
                        iM559710 = iM559714;
                        i12 = ((iM559714 ^ i19) * (-12915)) ^ 1355326554;
                    } else {
                        iM559710 = (C0946.m55979("ۚ֡") ^ i20) * (-39);
                        i12 = ((iM559710 ^ i19) * 32533) ^ (-394055040);
                        strM55773 = str8;
                        i13 = -839440272;
                        i31 = i31;
                        i14 = i11;
                    }
                    int i37 = iM559710 ^ i13;
                    i21 = i12;
                    i9 = i37;
                    i27 = i;
                    short[] sArr11 = sArr7;
                    i32 = i14;
                    strArr2 = strArr2;
                    sArr7 = sArr11;
                    strM56276 = strM56276;
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
                    strM56276 = strM56276;
                    i = i27;
                    short[] sArr13 = sArr7;
                    strArr2 = strArr2;
                    i31 = i31;
                    i11 = i32;
                    sArr7 = sArr13;
                    strM55773 = C0894.m55773(f82087, 1, 48, i29);
                    if (!RunnableC0897.m55784()) {
                        int iM55682 = (C0873.m55680("ᩳܰ") + i20) * 11;
                        i9 = iM55682 ^ 961696396;
                        i15 = ((iM55682 ^ i19) * 23245) ^ (-1716427399);
                        i21 = i15;
                        i27 = i;
                        int i38 = i11;
                        i31 = i31;
                        strArr2 = strArr2;
                        sArr7 = sArr7;
                        i32 = i38;
                        strM56276 = strM56276;
                        i33 = i33;
                        short[] sArr14 = sArr8;
                        i22 = i9;
                        str4 = str4;
                        sArr8 = sArr14;
                    }
                    i8 = i11;
                    i31 = i31;
                    int iM559715 = C0946.m55979("֨ܽ") ^ i20;
                    i13 = -941267137;
                    i14 = i8;
                    iM559710 = iM559715;
                    i12 = ((iM559715 ^ i19) * (-12915)) ^ 1355326554;
                    int i39 = iM559710 ^ i13;
                    i21 = i12;
                    i9 = i39;
                    i27 = i;
                    short[] sArr15 = sArr7;
                    i32 = i14;
                    strArr2 = strArr2;
                    sArr7 = sArr15;
                    strM56276 = strM56276;
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
                    strM55773 = strM55773;
                    str4 = str4;
                    strM56276 = strM56276;
                    short[] sArr17 = sArr7;
                    strArr2 = strArr2;
                    i31 = i31;
                    i11 = i32;
                    sArr7 = sArr17;
                    sArr4 = f82087;
                    if (RunnableC1014.f81941 > 0) {
                        int iM559716 = C0946.m55979("ۚۡ") ^ i20;
                        i16 = -924093928;
                        i27 = 49;
                        i17 = ((iM559716 ^ i19) * 29617) ^ (-1758517299);
                        iM559711 = iM559716;
                        int i40 = i17;
                        i9 = iM559711 ^ i16;
                        i27 = i27;
                        i10 = i40;
                        strM55773 = strM55773;
                        i21 = i10;
                        int i310 = i11;
                        i31 = i31;
                        strArr2 = strArr2;
                        sArr7 = sArr7;
                        i32 = i310;
                        strM56276 = strM56276;
                        i33 = i33;
                        short[] sArr18 = sArr8;
                        i22 = i9;
                        str4 = str4;
                        sArr8 = sArr18;
                    } else {
                        i27 = 49;
                        int iM559717 = C0946.m55979("᩷֨") ^ i19;
                        i = i27;
                        i15 = ((iM559717 ^ i20) * (-19829)) ^ 6347874;
                        i9 = iM559717 ^ 1974690235;
                        strM55773 = strM55773;
                        i21 = i15;
                        i27 = i;
                        int i311 = i11;
                        i31 = i31;
                        strArr2 = strArr2;
                        sArr7 = sArr7;
                        i32 = i311;
                        strM56276 = strM56276;
                        i33 = i33;
                        short[] sArr19 = sArr8;
                        i22 = i9;
                        str4 = str4;
                        sArr8 = sArr19;
                    }
                    break;
                case -1900445336:
                case -1714754816:
                    ServiceConnectionC1013.m56157();
                    throw new RuntimeException();
                case -1775002728:
                case 145028951:
                    sArr8 = sArr8;
                    i33 = i33;
                    str = strM55773;
                    str4 = str4;
                    strM56276 = strM56276;
                    i = i27;
                    short[] sArr20 = sArr7;
                    strArr = strArr2;
                    i2 = i31;
                    i3 = i32;
                    sArr = sArr20;
                    C0906.m55809();
                    sArr2 = sArr8;
                    strM55893 = str6;
                    str6 = strM55893;
                    int iM55683 = (C0873.m55680("۟۠") ^ i19) * (-59);
                    strM55773 = str;
                    i21 = ((iM55683 ^ i20) * (-25811)) ^ 403728060;
                    i22 = iM55683 ^ 1223007817;
                    i27 = i;
                    strM56276 = strM56276;
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
                    iM559711 = (C0946.m55979("ۡᩴ") + i19) * (-105);
                    i11 = i32;
                    i17 = ((iM559711 ^ i20) * (-23573)) ^ 2086323634;
                    i16 = -940671734;
                    int i41 = i17;
                    i9 = iM559711 ^ i16;
                    i27 = i27;
                    i10 = i41;
                    strM55773 = strM55773;
                    i21 = i10;
                    int i313 = i11;
                    i31 = i31;
                    strArr2 = strArr2;
                    sArr7 = sArr7;
                    i32 = i313;
                    strM56276 = strM56276;
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
                    str = strM55773;
                    strM56276 = strM56276;
                    i = i27;
                    short[] sArr22 = sArr7;
                    strArr = strArr2;
                    i2 = i31;
                    String strM56077 = C0967.m56077(sArr22, i42, i2, i29);
                    short[] sArr23 = f82087;
                    if (C1404.f82149 >= 0) {
                        int iM559718 = C0946.m55979("ܰۗ") ^ i20;
                        int i43 = ((iM559718 ^ i19) * (-18719)) ^ 394594665;
                        i3 = i42;
                        str4 = strM56077;
                        sArr3 = sArr21;
                        sArr6 = sArr23;
                        iM55979 = iM559718;
                        str2 = str6;
                        i23 = 38;
                        sArr = sArr22;
                        i4 = i43;
                        str3 = str5;
                        i30 = DHParameters.DEFAULT_MINIMUM_LENGTH;
                        i5 = -1644363139;
                    } else {
                        int iM55684 = (C0873.m55680("ۨܰ") ^ i19) * (-17);
                        sArr = sArr22;
                        i4 = ((iM55684 ^ i20) * 293) ^ (-811314515);
                        i3 = i42;
                        str4 = strM56077;
                        sArr3 = sArr21;
                        sArr6 = sArr23;
                        iM55979 = iM55684;
                        str2 = str6;
                        i23 = 38;
                        i30 = DHParameters.DEFAULT_MINIMUM_LENGTH;
                        str3 = str5;
                        i5 = -1311518691;
                    }
                    i22 = iM55979 ^ i5;
                    str5 = str3;
                    str6 = str2;
                    sArr8 = sArr3;
                    strM55773 = str;
                    i21 = i4;
                    i27 = i;
                    strM56276 = strM56276;
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
                    str = strM55773;
                    strM56276 = strM56276;
                    i = i27;
                    s = f82087[0];
                    i24 = s * s;
                    if (C1012.f81938 >= 0) {
                        short[] sArr24 = sArr7;
                        strArr = strArr2;
                        i2 = i31;
                        i3 = i32;
                        sArr = sArr24;
                        iM55680 = C0873.m55680("۬ۡ") ^ i19;
                        i6 = ((iM55680 ^ i20) * 2673) ^ 465013443;
                        i7 = -2097094026;
                    } else {
                        iM55680 = C0873.m55680("۬ܽ") ^ i19;
                        str4 = str4;
                        i6 = ((iM55680 ^ i20) * (-28463)) ^ (-1170602153);
                        i7 = -1463275729;
                        short[] sArr25 = sArr7;
                        strArr = strArr2;
                        i2 = i31;
                        i3 = i32;
                        sArr = sArr25;
                    }
                    int i315 = iM55680 ^ i7;
                    strM55773 = str;
                    i21 = i6;
                    str4 = str4;
                    sArr8 = sArr8;
                    i22 = i315;
                    i27 = i;
                    strM56276 = strM56276;
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
                    str = strM55773;
                    strM56276 = strM56276;
                    i = i27;
                    if (!C0917.m55854()) {
                        short[] sArr26 = sArr7;
                        strArr = strArr2;
                        i2 = i31;
                        i3 = i32;
                        sArr = sArr26;
                        iM55680 = C0873.m55680("۬ۡ") ^ i19;
                        i6 = ((iM55680 ^ i20) * 2673) ^ 465013443;
                        i7 = -2097094026;
                        int i317 = iM55680 ^ i7;
                        strM55773 = str;
                        i21 = i6;
                        str4 = str4;
                        sArr8 = sArr8;
                        i22 = i317;
                        i27 = i;
                        strM56276 = strM56276;
                        i33 = i33;
                        int i318 = i3;
                        i31 = i2;
                        strArr2 = strArr;
                        sArr7 = sArr;
                        i32 = i318;
                    } else {
                        strM55773 = str;
                        i8 = i32;
                        sArr7 = sArr7;
                        strArr2 = strArr2;
                        int iM559719 = C0946.m55979("֨ܽ") ^ i20;
                        i13 = -941267137;
                        i14 = i8;
                        iM559710 = iM559719;
                        i12 = ((iM559719 ^ i19) * (-12915)) ^ 1355326554;
                        int i319 = iM559710 ^ i13;
                        i21 = i12;
                        i9 = i319;
                        i27 = i;
                        short[] sArr111 = sArr7;
                        i32 = i14;
                        strArr2 = strArr2;
                        sArr7 = sArr111;
                        strM56276 = strM56276;
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
                    iM559711 = (C0946.m55979("ۡᩴ") + i19) * (-105);
                    i11 = i32;
                    i17 = ((iM559711 ^ i20) * (-23573)) ^ 2086323634;
                    i16 = -940671734;
                    int i44 = i17;
                    i9 = iM559711 ^ i16;
                    i27 = i27;
                    i10 = i44;
                    strM55773 = strM55773;
                    i21 = i10;
                    int i3110 = i11;
                    i31 = i31;
                    strArr2 = strArr2;
                    sArr7 = sArr7;
                    i32 = i3110;
                    strM56276 = strM56276;
                    i33 = i33;
                    short[] sArr113 = sArr8;
                    i22 = i9;
                    str4 = str4;
                    sArr8 = sArr113;
                    break;
                case -451870869:
                case 870185769:
                    f28766 = new String[]{C1048.m56318(sArr8, 309, 25, i29), str5, str6};
                    return;
                case -364915320:
                case 73465610:
                    i33 = i33;
                    String str10 = strM55773;
                    String str11 = strM56276;
                    i = i27;
                    f28767 = new String[]{C0937.m55921(sArr5, i33, i28, i29), str10, str11};
                    sArr7 = f82087;
                    i31 = 56;
                    if (C0854.m55595() >= 0) {
                        strM56276 = str11;
                        strM55773 = str10;
                        sArr7 = sArr7;
                        sArr8 = sArr8;
                        i8 = IShizukuService.Stub.TRANSACTION_isHidden;
                        strArr2 = strArr2;
                        int iM5597110 = C0946.m55979("֨ܽ") ^ i20;
                        i13 = -941267137;
                        i14 = i8;
                        iM559710 = iM5597110;
                        i12 = ((iM5597110 ^ i19) * (-12915)) ^ 1355326554;
                        int i3111 = iM559710 ^ i13;
                        i21 = i12;
                        i9 = i3111;
                        i27 = i;
                        short[] sArr114 = sArr7;
                        i32 = i14;
                        strArr2 = strArr2;
                        sArr7 = sArr114;
                        strM56276 = strM56276;
                        i33 = i33;
                        short[] sArr115 = sArr8;
                        i22 = i9;
                        str4 = str4;
                        sArr8 = sArr115;
                    } else {
                        int iM559720 = (i20 - C0946.m55979("ܺ᩺")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        int i45 = ((iM559720 ^ i19) * 4969) ^ (-383022210);
                        i22 = iM559720 ^ (-1817498595);
                        i32 = IShizukuService.Stub.TRANSACTION_isHidden;
                        strM55773 = str10;
                        i21 = i45;
                        i27 = i;
                        strM56276 = str11;
                        i33 = i33;
                    }
                    break;
                case 197740857:
                case 1048282521:
                    strArr2 = new String[]{C1194.m56386(f82087, 198, 33, i29), str4, C1964.m56584(sArr6, i30, i23, i29)};
                    if (C1929.f83011 == 0) {
                        int iM55685 = C0873.m55680("ۛܽ") ^ i19;
                        int i46 = ((iM55685 ^ i20) * (-19979)) ^ (-1621315953);
                        strM55773 = strM55773;
                        short[] sArr27 = sArr8;
                        str4 = str4;
                        i9 = iM55685 ^ (-1084750206);
                        i33 = i33;
                        strM56276 = strM56276;
                        i10 = i46;
                        sArr8 = sArr27;
                        short[] sArr28 = sArr7;
                        strArr2 = strArr2;
                        i31 = i31;
                        i11 = i32;
                        sArr7 = sArr28;
                        strM55773 = strM55773;
                        i21 = i10;
                        int i3112 = i11;
                        i31 = i31;
                        strArr2 = strArr2;
                        sArr7 = sArr7;
                        i32 = i3112;
                        strM56276 = strM56276;
                        i33 = i33;
                        short[] sArr116 = sArr8;
                        i22 = i9;
                        str4 = str4;
                        sArr8 = sArr116;
                    } else {
                        sArr8 = sArr8;
                        i33 = i33;
                        str = strM55773;
                        strM56276 = strM56276;
                        i = i27;
                        short[] sArr29 = sArr7;
                        strArr = strArr2;
                        i2 = i31;
                        i3 = i32;
                        sArr = sArr29;
                        iM55680 = C0873.m55680("۬ۡ") ^ i19;
                        i6 = ((iM55680 ^ i20) * 2673) ^ 465013443;
                        i7 = -2097094026;
                        int i3113 = iM55680 ^ i7;
                        strM55773 = str;
                        i21 = i6;
                        str4 = str4;
                        sArr8 = sArr8;
                        i22 = i3113;
                        i27 = i;
                        strM56276 = strM56276;
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
                    C0989.m56095();
                    sArr8 = sArr8;
                    if (C1044.m56286() > 0) {
                        i33 = i33;
                        strM55773 = strM55773;
                        str4 = str4;
                        strM56276 = strM56276;
                        short[] sArr30 = sArr7;
                        strArr2 = strArr2;
                        i31 = i31;
                        i11 = i32;
                        sArr7 = sArr30;
                        int iM5597111 = C0946.m55979("᩷֨") ^ i19;
                        i = i27;
                        i15 = ((iM5597111 ^ i20) * (-19829)) ^ 6347874;
                        i9 = iM5597111 ^ 1974690235;
                        strM55773 = strM55773;
                        i21 = i15;
                        i27 = i;
                        int i3115 = i11;
                        i31 = i31;
                        strArr2 = strArr2;
                        sArr7 = sArr7;
                        i32 = i3115;
                        strM56276 = strM56276;
                        i33 = i33;
                        short[] sArr117 = sArr8;
                        i22 = i9;
                        str4 = str4;
                        sArr8 = sArr117;
                    } else {
                        i33 = i33;
                        str = strM55773;
                        str4 = str4;
                        strM56276 = strM56276;
                        i = i27;
                        short[] sArr31 = sArr7;
                        strArr = strArr2;
                        i2 = i31;
                        i3 = i32;
                        sArr = sArr31;
                        sArr2 = sArr8;
                        strM55893 = str6;
                        str6 = strM55893;
                        int iM55686 = (C0873.m55680("۟۠") ^ i19) * (-59);
                        strM55773 = str;
                        i21 = ((iM55686 ^ i20) * (-25811)) ^ 403728060;
                        i22 = iM55686 ^ 1223007817;
                        i27 = i;
                        strM56276 = strM56276;
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
                    f28768 = strArr2;
                    String strM55689 = C0873.m55689(f82087, 231, 48, i29);
                    if (C0898.f81858 > 0) {
                        iM55979 = C0946.m55979("ۢۨ") ^ i20;
                        i5 = -1483025406;
                        String str13 = strM56276;
                        i = i27;
                        i4 = ((iM55979 ^ i19) * (-30641)) ^ (-2144888208);
                        str = strM55773;
                        sArr3 = sArr8;
                        str2 = str6;
                        str3 = strM55689;
                        i33 = i33;
                        strM56276 = str13;
                        short[] sArr32 = sArr7;
                        strArr = strArr2;
                        i2 = i31;
                        i3 = i32;
                        sArr = sArr32;
                        i22 = iM55979 ^ i5;
                        str5 = str3;
                        str6 = str2;
                        sArr8 = sArr3;
                        strM55773 = str;
                        i21 = i4;
                        i27 = i;
                        strM56276 = strM56276;
                        i33 = i33;
                        int i3117 = i3;
                        i31 = i2;
                        strArr2 = strArr;
                        sArr7 = sArr;
                        i32 = i3117;
                    } else {
                        str5 = strM55689;
                        sArr8 = sArr8;
                        i33 = i33;
                        str = strM55773;
                        strM56276 = strM56276;
                        i = i27;
                        short[] sArr210 = sArr7;
                        strArr = strArr2;
                        i2 = i31;
                        i3 = i32;
                        sArr = sArr210;
                        iM55680 = C0873.m55680("۬ۡ") ^ i19;
                        i6 = ((iM55680 ^ i20) * 2673) ^ 465013443;
                        i7 = -2097094026;
                        int i3118 = iM55680 ^ i7;
                        strM55773 = str;
                        i21 = i6;
                        str4 = str4;
                        sArr8 = sArr8;
                        i22 = i3118;
                        i27 = i;
                        strM56276 = strM56276;
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
                    strM56276 = C1044.m56276(sArr4, i27, 30, i29);
                    sArr5 = f82087;
                    i28 = 25;
                    if (RunnableC0897.f81856) {
                        int iM55687 = C0873.m55680("ۗۚ") ^ i19;
                        i21 = (-267487816) ^ ((iM55687 ^ i20) * 31665);
                        i22 = (-1882919491) ^ iM55687;
                        i33 = 79;
                    } else {
                        i33 = 79;
                        strM56276 = strM56276;
                        str = strM55773;
                        i = i27;
                        short[] sArr33 = sArr8;
                        str4 = str4;
                        sArr2 = sArr33;
                        short[] sArr34 = sArr7;
                        strArr = strArr2;
                        i2 = i31;
                        i3 = i32;
                        sArr = sArr34;
                        int iM55688 = (C0873.m55680("۟۠") ^ i19) * (-59);
                        strM55773 = str;
                        i21 = ((iM55688 ^ i20) * (-25811)) ^ 403728060;
                        i22 = iM55688 ^ 1223007817;
                        i27 = i;
                        strM56276 = strM56276;
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
                        iM559712 = C0946.m55979("ۡۢ") ^ i19;
                        i18 = ((iM559712 ^ i20) * 13773) ^ (-1299068411);
                        i13 = 1196492499;
                    } else {
                        iM559712 = C0946.m55979("᩵ܳ") ^ i20;
                        i18 = ((iM559712 ^ i19) * 32383) ^ (-326058827);
                        i13 = 1796659166;
                    }
                    String str15 = strM56276;
                    i = i27;
                    iM559710 = iM559712;
                    i33 = i33;
                    strM56276 = str15;
                    short[] sArr35 = sArr8;
                    str4 = str4;
                    i12 = i18;
                    sArr8 = sArr35;
                    short[] sArr36 = sArr7;
                    strArr2 = strArr2;
                    i14 = i32;
                    sArr7 = sArr36;
                    int i31111 = iM559710 ^ i13;
                    i21 = i12;
                    i9 = i31111;
                    i27 = i;
                    short[] sArr118 = sArr7;
                    i32 = i14;
                    strArr2 = strArr2;
                    sArr7 = sArr118;
                    strM56276 = strM56276;
                    i33 = i33;
                    short[] sArr119 = sArr8;
                    i22 = i9;
                    str4 = str4;
                    sArr8 = sArr119;
                    break;
                default:
                    str4 = str4;
                    i33 = i33;
                    str = strM55773;
                    strM56276 = strM56276;
                    i = i27;
                    short[] sArr37 = sArr7;
                    strArr = strArr2;
                    i2 = i31;
                    i3 = i32;
                    sArr = sArr37;
                    strM55893 = C0930.m55893(f82087, 279, 30, i29);
                    sArr2 = f82087;
                    if (!C1025.m56230()) {
                        iM55979 = (C0946.m55979("ۡ֫") ^ i20) * C0254q.f1218h;
                        i4 = ((iM55979 ^ i19) * (-26999)) ^ (-957427211);
                        sArr3 = sArr2;
                        str4 = str4;
                        str2 = strM55893;
                        str3 = str5;
                        i5 = -2132226816;
                        i22 = iM55979 ^ i5;
                        str5 = str3;
                        str6 = str2;
                        sArr8 = sArr3;
                        strM55773 = str;
                        i21 = i4;
                        i27 = i;
                        strM56276 = strM56276;
                        i33 = i33;
                        int i31112 = i3;
                        i31 = i2;
                        strArr2 = strArr;
                        sArr7 = sArr;
                        i32 = i31112;
                    } else {
                        str6 = strM55893;
                        int iM55689 = (C0873.m55680("۟۠") ^ i19) * (-59);
                        strM55773 = str;
                        i21 = ((iM55689 ^ i20) * (-25811)) ^ 403728060;
                        i22 = iM55689 ^ 1223007817;
                        i27 = i;
                        strM56276 = strM56276;
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
    
        if (p067l.C0882.f81846 != false) goto L16;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] m24100(Context context) {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        short s;
        Context context2 = context;
        int i4 = C1071.f81975;
        int i5 = C0992.f81922;
        int iM55682 = C0873.m55680("ܽܺ") ^ i4;
        int i6 = ((iM55682 ^ i5) * 23441) ^ 7298793;
        String strM55783 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM55682 ^ 1001266459;
        int iM55683 = 0;
        int iM55684 = 0;
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
        String strM55590 = null;
        String strM55591 = null;
        int iM55685 = 0;
        while (true) {
            i16 = i7 ^ (i6 & (((i16 ^ i5) * (-2333)) >> 31));
            switch (i16) {
                case -2122140442:
                case 735306967:
                    C1028.m56247();
                    C0992.m56107();
                    return null;
                case -2057040970:
                case 1857045648:
                    i14 = s2 * s3;
                    s = s2;
                    int i17 = s + 18478;
                    if (C0955.f81898) {
                        i15 = i17;
                        int iM55979 = C0946.m55979("᩻ܶ") ^ i4;
                        i7 = iM55979 ^ (-1489349059);
                        s2 = s;
                        i6 = ((iM55979 ^ i5) * (-26415)) ^ (-697936342);
                    } else {
                        int iM559710 = (C0946.m55979("ۛۗ") + i5) * (-21);
                        s2 = s;
                        i7 = iM559710 ^ 1999745854;
                        i15 = i17;
                        i6 = ((iM559710 ^ i4) * 30255) ^ (-2139311593);
                    }
                    context2 = context;
                    break;
                case -2047034852:
                case 471250649:
                    i11 = 348;
                    i12 = 3;
                    if (RunnableC1014.f81941 > 0) {
                        iM55680 = (i5 - C0873.m55680("ۢ۫")) * (-33);
                        i = ((iM55680 ^ i4) * 31037) ^ 1794057929;
                        i2 = -983359942;
                        i7 = iM55680 ^ i2;
                        i6 = i;
                    } else {
                        iM55681 = C0873.m55680("ۤ۬") ^ i5;
                        i6 = ((iM55681 ^ i4) * 16749) ^ (-240785456);
                        i3 = 577492135;
                        i7 = iM55681 ^ i3;
                        context2 = context;
                    }
                    break;
                case -1937338523:
                case 118402447:
                    C1404.m56468();
                    C0946.m55980();
                    s = s2;
                    int iM559711 = C0946.m55979("᩻ܶ") ^ i4;
                    i7 = iM559711 ^ (-1489349059);
                    s2 = s;
                    i6 = ((iM559711 ^ i5) * (-26415)) ^ (-697936342);
                    context2 = context;
                    break;
                case -1691712701:
                case -1569115745:
                    iM55684 = C0873.m55680(C1025.m56233(sArr3, i11, i12, i13));
                    i8 = 2120911916;
                    if (C0877.f81843 >= 0) {
                        iM55680 = (i4 - C0873.m55680("ۢ֡")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM55680 ^ i5) * (-2839)) ^ 129985650;
                        i2 = -2137606481;
                    } else {
                        iM55680 = C0873.m55680("ܶܿ") ^ i5;
                        i = ((iM55680 ^ i4) * (-3467)) ^ (-844652160);
                        i2 = -1875010191;
                    }
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case -1684936110:
                case 487924806:
                    sArr = f82087;
                    c = 341;
                    if (C1024.m56209() >= 0) {
                        iM55681 = (i4 - C0946.m55979("ᩳۖ")) * 45;
                        i6 = ((iM55681 ^ i5) * 12719) ^ (-660049312);
                        i3 = -1453179421;
                    } else {
                        iM55681 = C0873.m55680("۫ܰ") ^ i4;
                        i6 = ((iM55681 ^ i5) * 18777) ^ (-1082705275);
                        i3 = 1319081821;
                    }
                    i7 = iM55681 ^ i3;
                    context2 = context;
                    break;
                case -1667865818:
                case -1376594087:
                    strM55783 = RunnableC0897.m55783(f82087, 342, 3, i13);
                    if (C0955.f81898) {
                        iM55681 = (C0873.m55680("ۖ᩹") + i5) * 115;
                        i6 = ((iM55681 ^ i4) * 19595) ^ 121939337;
                        i3 = 863666732;
                    } else {
                        iM55681 = C0873.m55680("᩶ܺ") ^ i5;
                        i6 = ((iM55681 ^ i4) * 4293) ^ (-229113994);
                        i3 = 544679951;
                    }
                    i7 = iM55681 ^ i3;
                    context2 = context;
                    break;
                case -1380342698:
                case 538762198:
                    iM55683 = C0873.m55680(C1124.m56373(sArr2, i9, i10, i13));
                    if (C1017.f81942 >= 0) {
                        iM55680 = (i4 - C0873.m55680("ۢ֡")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM55680 ^ i5) * (-2839)) ^ 129985650;
                        i2 = -2137606481;
                    } else {
                        iM55680 = C0873.m55680("۫᩸") ^ i5;
                        i = ((iM55680 ^ i4) * (-20275)) ^ 1036054991;
                        i2 = 277479311;
                    }
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case -1326309991:
                case 1358415401:
                    i13 = 38098;
                    iM55681 = C0946.m55979("۫֨") ^ i5;
                    i6 = ((iM55681 ^ i4) * (-11527)) ^ (-156500806);
                    i3 = 1899443915;
                    i7 = iM55681 ^ i3;
                    context2 = context;
                    break;
                case -1036397850:
                case 552647969:
                    strM55591 = C0845.m55590(context2, iM55685);
                    sArr2 = f82087;
                    i9 = 345;
                    i10 = 3;
                    if (!C0882.f81846) {
                        iM55680 = (i4 - C0873.m55680("ۜ᩹")) * 11;
                        i = ((iM55680 ^ i5) * 7077) ^ (-1779859243);
                        i2 = -1978361897;
                        i7 = iM55680 ^ i2;
                        i6 = i;
                    } else {
                        iM55681 = (i4 - C0946.m55979("ᩳۖ")) * 45;
                        i6 = ((iM55681 ^ i5) * 12719) ^ (-660049312);
                        i3 = -1453179421;
                        i7 = iM55681 ^ i3;
                        context2 = context;
                    }
                    break;
                case -841639301:
                case -556170359:
                    iM55685 = 2128381253 ^ C0873.m55680(strM55783);
                    if (RunnableC1014.f81941 > 0) {
                        iM55680 = C0946.m55979("᩹ۤ") ^ i4;
                        i = ((iM55680 ^ i5) * (-25865)) ^ 922487210;
                        i2 = -461293651;
                        i7 = iM55680 ^ i2;
                        i6 = i;
                    } else {
                        iM55681 = C0873.m55680("ۤ۬") ^ i5;
                        i6 = ((iM55681 ^ i4) * 16749) ^ (-240785456);
                        i3 = 577492135;
                        i7 = iM55681 ^ i3;
                        context2 = context;
                    }
                    break;
                case -808812065:
                case 162026327:
                    if (C1028.m56247() < 0) {
                        iM55681 = (C0873.m55680("ۖ᩹") + i5) * 115;
                        i6 = ((iM55681 ^ i4) * 19595) ^ 121939337;
                        i3 = 863666732;
                    } else {
                        iM55681 = (i4 - C0946.m55979("ᩳۖ")) * 45;
                        i6 = ((iM55681 ^ i5) * 12719) ^ (-660049312);
                        i3 = -1453179421;
                    }
                    i7 = iM55681 ^ i3;
                    context2 = context;
                    break;
                case -663813003:
                case 1646410886:
                    if (RunnableC1014.f81941 > 0) {
                        iM55681 = (i4 - C0946.m55979("ᩳۖ")) * 45;
                        i6 = ((iM55681 ^ i5) * 12719) ^ (-660049312);
                        i3 = -1453179421;
                    } else {
                        iM55681 = C0873.m55680("ۤ۬") ^ i5;
                        i6 = ((iM55681 ^ i4) * 16749) ^ (-240785456);
                        i3 = 577492135;
                    }
                    i7 = iM55681 ^ i3;
                    context2 = context;
                    break;
                case -359432099:
                case 1729556122:
                    break;
                case -313726203:
                case 2107437640:
                    return new String[]{strM55591, strM55590, C0863.m55638(context2, iM55684 ^ i8)};
                case -157547526:
                case 1966390097:
                    if (i14 - (i15 * i15) <= 0) {
                        iM55681 = (C0873.m55680("۟ۨ") + i4) * 127;
                        i6 = ((iM55681 ^ i5) * 5523) ^ 1458504909;
                        i3 = 1360566790;
                    } else {
                        iM55681 = (C0873.m55680("᩸ۡ") + i4) * 123;
                        i6 = ((iM55681 ^ i5) * 14817) ^ 669640275;
                        i3 = -853125222;
                    }
                    i7 = iM55681 ^ i3;
                    context2 = context;
                    break;
                case -85130128:
                case 1747227704:
                    s2 = sArr[c];
                    s3 = 73912;
                    if (C0947.f81895) {
                        iM55681 = C0873.m55680("ۤ۬") ^ i5;
                        i6 = ((iM55681 ^ i4) * 16749) ^ (-240785456);
                        i3 = 577492135;
                    } else {
                        iM55681 = (C0946.m55979("᩻ۜ") ^ i5) * 15;
                        i6 = ((iM55681 ^ i4) * 16129) ^ 1775829049;
                        i3 = -2110245809;
                    }
                    i7 = iM55681 ^ i3;
                    context2 = context;
                    break;
                case 1723335633:
                case 1958248057:
                    i13 = 43801;
                    iM55681 = C0946.m55979("۫֨") ^ i5;
                    i6 = ((iM55681 ^ i4) * (-11527)) ^ (-156500806);
                    i3 = 1899443915;
                    i7 = iM55681 ^ i3;
                    context2 = context;
                    break;
                default:
                    strM55590 = C0845.m55590(context2, 2124763013 ^ iM55683);
                    sArr3 = f82087;
                    if (C0890.f81849 == 0) {
                        iM55680 = (i4 - C0873.m55680("֡ۘ")) * (-91);
                        i = ((iM55680 ^ i5) * (-22295)) ^ 883349088;
                        i2 = 661582196;
                        i7 = iM55680 ^ i2;
                        i6 = i;
                    } else {
                        iM55681 = C0873.m55680("ۤ۬") ^ i5;
                        i6 = ((iM55681 ^ i4) * 16749) ^ (-240785456);
                        i3 = 577492135;
                        i7 = iM55681 ^ i3;
                        context2 = context;
                    }
                    break;
            }
        }
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ܽ */
    public final void mo8224(InterfaceC24784 interfaceC24784) {
        this.f28776 = false;
    }

    @Override // p067l.AbstractC7545
    /* JADX INFO: renamed from: ܽ */
    public final void mo17458() {
        boolean z = false;
        Runnable[] runnableArr = null;
        int i = 0;
        Runnable runnable = null;
        int i2 = 901864360;
        int i3 = RunnableC0938.f81886;
        int i4 = C1003.f81929;
        int iM55680 = C0873.m55680("ܺۡ") ^ i4;
        int i5 = ((iM55680 ^ i3) * (-25517)) ^ (-1564921127);
        int i6 = -1147724283;
        while (true) {
            i2 = ((((i2 ^ i3) * (-21103)) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -2059800185:
                case -1098852652:
                    if (C0873.f81841 > 0) {
                        iM55680 = C0946.m55979("۟ۨ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-21203)) ^ (-1330267621);
                        i6 = -1960934065;
                    } else {
                        iM55680 = C0873.m55680("ܿۚ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 9323) ^ 1722286151;
                        i6 = 2025413160;
                    }
                    break;
                case -1992065478:
                case 71068895:
                    this.f28775.removeCallbacks(runnable);
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55680 = C0946.m55979("ۚ֡") ^ i3;
                        i5 = ((iM55680 ^ i4) * 29423) ^ (-84178561);
                        i6 = -1611597107;
                    } else {
                        iM55680 = (C0873.m55680("ۨܺ") + i4) * (-83);
                        i5 = ((iM55680 ^ i3) * (-22749)) ^ (-1180461887);
                        i6 = 1131145806;
                    }
                    break;
                case -1973114631:
                case 1423947889:
                    if (C0949.m56012()) {
                        iM55680 = C0873.m55680("᩷ۧ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-3777)) ^ 191438141;
                        i6 = -1661291028;
                    } else {
                        iM55680 = C0873.m55680("֫ۧ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-24447)) ^ (-389087105);
                        i6 = -1942395325;
                    }
                    break;
                case -1861517572:
                case -1123837963:
                    runnableArr[i] = null;
                    iM55680 = (i4 - C0946.m55979("᩹۫")) * 23;
                    i5 = ((iM55680 ^ i3) * (-27791)) ^ (-1977397749);
                    i6 = 2095277668;
                    break;
                case -1859978279:
                case 1690345970:
                    i = 0;
                    iM55680 = C0873.m55680("ۙ֨") ^ i4;
                    i5 = ((iM55680 ^ i3) * 6455) ^ (-1730002903);
                    i6 = 1763798651;
                    break;
                case -1859960763:
                case 1686106462:
                    i++;
                    iM55680 = C0873.m55680("ۙ֨") ^ i4;
                    i5 = ((iM55680 ^ i3) * 6455) ^ (-1730002903);
                    i6 = 1763798651;
                    break;
                case -1712414582:
                case -675371476:
                    z = false;
                    z = false;
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0873.m55680("ܿۚ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 9323) ^ 1722286151;
                        i6 = 2025413160;
                    } else {
                        iM55680 = (i4 - C0946.m55979("۬ۚ")) * 99;
                        i5 = ((iM55680 ^ i3) * 1573) ^ (-144813826);
                        i6 = 175027283;
                    }
                    break;
                case -1639072780:
                case 236191712:
                    C1025.m56230();
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55680 = C0873.m55680("᩷ۧ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-3777)) ^ 191438141;
                        i6 = -1661291028;
                    } else {
                        iM55680 = C0946.m55979("۟ۨ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-21203)) ^ (-1330267621);
                        i6 = -1960934065;
                    }
                    break;
                case -1614518822:
                case -1452865842:
                    C1071.m56343();
                    if (C1012.f81938 < 0) {
                        iM55680 = (C0873.m55680("ᩳ۫") ^ i3) * (-121);
                        i5 = ((iM55680 ^ i4) * (-31535)) ^ (-262088699);
                        i6 = -1501868961;
                    } else {
                        iM55680 = C0873.m55680("ܿۚ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 9323) ^ 1722286151;
                        i6 = 2025413160;
                    }
                    break;
                case -1429726015:
                case 204663826:
                    C1017.m56187();
                    C1046.m56302();
                    iM55680 = C0873.m55680("ܿۚ") ^ i3;
                    i5 = ((iM55680 ^ i4) * 9323) ^ 1722286151;
                    i6 = 2025413160;
                    break;
                case -1371502409:
                case -344954858:
                    if (C0937.f81884) {
                        iM55680 = (C0873.m55680("ۗܽ") + i3) * (-113);
                        i5 = ((iM55680 ^ i4) * 2351) ^ 552756131;
                        i6 = -20376222;
                    } else {
                        iM55680 = C0873.m55680("᩷ۧ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-3777)) ^ 191438141;
                        i6 = -1661291028;
                    }
                    break;
                case -1015277088:
                case 596116639:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55680 = C0873.m55680("ܿۚ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 9323) ^ 1722286151;
                        i6 = 2025413160;
                    } else {
                        iM55680 = C0946.m55979("ۖ᩹") ^ i3;
                        i5 = ((iM55680 ^ i4) * 26623) ^ (-886229495);
                        i6 = 49968082;
                    }
                    break;
                case -717404393:
                case 509361078:
                    runnable = runnableArr[i];
                    if (runnable != null) {
                        iM55680 = (C0873.m55680("ᩳۙ") + i3) * 57;
                        i5 = ((iM55680 ^ i4) * 30533) ^ 592959133;
                        i6 = 2018028207;
                    } else {
                        iM55680 = (i4 - C0946.m55979("᩹۫")) * 23;
                        i5 = ((iM55680 ^ i3) * (-27791)) ^ (-1977397749);
                        i6 = 2095277668;
                    }
                    break;
                case -494059147:
                case 1638086830:
                    if (C0882.f81846) {
                        iM55680 = (C0873.m55680("ᩳ۫") ^ i3) * (-121);
                        i5 = ((iM55680 ^ i4) * (-31535)) ^ (-262088699);
                        i6 = -1501868961;
                    } else {
                        iM55680 = C0946.m55979("᩺֫") ^ i4;
                        i5 = ((iM55680 ^ i3) * 29881) ^ (-1024794234);
                        i6 = 1993449950;
                    }
                    break;
                case -443156582:
                case 1420542919:
                    if (C1003.f81929 <= 0) {
                        iM55680 = (C0873.m55680("ᩳ۫") ^ i3) * (-121);
                        i5 = ((iM55680 ^ i4) * (-31535)) ^ (-262088699);
                        i6 = -1501868961;
                    } else {
                        iM55680 = (C0873.m55680("ܺ۬") + i4) * (-103);
                        i5 = ((iM55680 ^ i3) * 31077) ^ (-799607777);
                        i6 = -475227350;
                    }
                    break;
                case -379952519:
                case 1224497645:
                    C1028.m56247();
                    break;
                case -367031785:
                case 1593391869:
                    if (C1229.m56410() != 0) {
                        iM55680 = (C0873.m55680("ᩳ۫") ^ i3) * (-121);
                        i5 = ((iM55680 ^ i4) * (-31535)) ^ (-262088699);
                        i6 = -1501868961;
                    } else {
                        iM55680 = (C0946.m55979("ۙۖ") ^ i3) * (-17);
                        i5 = ((iM55680 ^ i4) * (-11765)) ^ (-664071026);
                        i6 = 1544204410;
                    }
                    break;
                case -293739375:
                case 2078293175:
                    if (this.f28771) {
                        iM55680 = C0873.m55680("ۗ۟") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-28391)) ^ 961237702;
                        i6 = -552379226;
                    } else {
                        iM55680 = (C0946.m55979("ۨ۟") ^ i3) * 75;
                        i5 = ((iM55680 ^ i4) * 30289) ^ (-1724617381);
                        i6 = -41984288;
                    }
                    break;
                case -43327962:
                case 1599595386:
                    C7050.m16207(this.f28772);
                    this.f28771 = z;
                    iM55680 = (C0946.m55979("ۨ۟") ^ i3) * 75;
                    i5 = ((iM55680 ^ i4) * 30289) ^ (-1724617381);
                    i6 = -41984288;
                    break;
                case 212519094:
                case 333842467:
                    if (C1028.f81950 <= 0) {
                        iM55680 = C0873.m55680("᩷ۧ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-3777)) ^ 191438141;
                        i6 = -1661291028;
                    } else {
                        iM55680 = C0873.m55680("ۤۜ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 21421) ^ (-372437527);
                        i6 = -264225796;
                    }
                    break;
                case 1090355039:
                case 1366537475:
                    this.f28774 = z ? 1 : 0;
                    RunnableC0938.m55934(this.f28769);
                    break;
                case 1264119804:
                case 2060686334:
                    runnableArr = this.f28773;
                    if (i < runnableArr.length) {
                        iM55680 = C0873.m55680("ۙۢ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-8619)) ^ (-358939354);
                        i6 = 1009105143;
                    } else {
                        iM55680 = C0946.m55979("ܿܶ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-12783)) ^ 1409193923;
                        i6 = 2141117548;
                    }
                    break;
                default:
                    if (C0866.m55645()) {
                        iM55680 = C0873.m55680("ۡܳ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-7117)) ^ 998111768;
                        i6 = 461876129;
                    } else {
                        iM55680 = C0873.m55680("᩷ۧ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-3777)) ^ 191438141;
                        i6 = -1661291028;
                    }
                    break;
            }
            return;
        }
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ۧ */
    public final void mo8222(InterfaceC24784 interfaceC24784) {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int i4;
        int iM55680;
        int i5;
        int i6;
        boolean zM46783;
        String strM56413;
        Application applicationM55620;
        Intent intent;
        int iM55681;
        int i7;
        Intent intent2;
        int i8 = C0898.f81858;
        int i9 = C0877.f81843;
        int iM55682 = (C0873.m55680("᩶᩺") + i9) * (-73);
        int i10 = ((iM55682 ^ i8) * (-3719)) ^ (-2092092192);
        String str = null;
        IntentFilter intentFilter = null;
        String strM55667 = null;
        Intent intent3 = null;
        int i11 = iM55682 ^ (-609573279);
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
                    StringBuilder sb = new StringBuilder(strM55667);
                    C0845.m55589(sb, i15);
                    throw new IllegalArgumentException(C0863.m55639(sb));
                case -2115497480:
                case 230585365:
                    intent3 = intent3;
                    i17 = i17;
                    str = str;
                    z = z ? 1 : 0;
                    if (this.f28770) {
                        iM55979 = (i9 - C0873.m55680("ۘᩴ")) * (-93);
                        i = ((iM55979 ^ i8) * 28851) ^ 1401443314;
                        i2 = -283874332;
                    } else {
                        iM55979 = C0946.m55979("֡ۘ") ^ i9;
                        i = ((iM55979 ^ i8) * (-3115)) ^ 2095242219;
                        i2 = -1208167112;
                    }
                    int i19 = iM55979 ^ i2;
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
                    m24097(i15, (String) null);
                    iM55680 = C0946.m55979("ۡ֡") ^ i9;
                    i5 = ((iM55680 ^ i8) * (-17011)) ^ (-1939869233);
                    i6 = -1389230419;
                    int i20 = iM55680 ^ i6;
                    intent3 = intent3;
                    i11 = i20;
                    i10 = i5;
                    break;
                case -2064650532:
                case -216556951:
                    i12 = 34055;
                    iM55979 = C0946.m55979("ܿ۟") ^ i8;
                    i = ((iM55979 ^ i9) * 3301) ^ 12844524;
                    i2 = -627112561;
                    int i110 = iM55979 ^ i2;
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
                    m24096(i15);
                    int i21 = ServiceC20700.f63919;
                    applicationM55620 = C0861.m55620();
                    intent = new Intent(applicationM55620, (Class<?>) ServiceC20700.class);
                    application = applicationM55620;
                    intent3 = intent;
                    iM55681 = (i8 - C0873.m55680("ܿ֫")) * 27;
                    i5 = ((iM55681 ^ i9) * 22445) ^ (-335105387);
                    i7 = -1336438858;
                    i11 = iM55681 ^ i7;
                    i10 = i5;
                    break;
                case -1973996226:
                case 2091390522:
                    intent3 = intent3;
                    if (i15 == i16) {
                        iM55680 = C0873.m55680("᩵ۘ") ^ i9;
                        i5 = ((iM55680 ^ i8) * 28171) ^ 338386067;
                        i6 = 1917092638;
                    } else {
                        iM55680 = C0873.m55680("ܳ᩵") ^ i8;
                        i5 = ((iM55680 ^ i9) * 15173) ^ 614385777;
                        i6 = 293332944;
                    }
                    int i22 = iM55680 ^ i6;
                    intent3 = intent3;
                    i11 = i22;
                    i10 = i5;
                    break;
                case -1967834189:
                case 968063602:
                    intent3 = intent3;
                    this.f28770 = z;
                    i17 = i17;
                    str = str;
                    int i23 = ApplicationC21448.f67650.getInt(str, i17) & 7;
                    this.f28774 = i23;
                    if (i23 == 0) {
                        z = z ? 1 : 0;
                        iM55979 = (i9 - C0873.m55680("ۘᩴ")) * (-93);
                        i = ((iM55979 ^ i8) * 28851) ^ 1401443314;
                        i2 = -283874332;
                    } else {
                        iM55979 = C0873.m55680("ۜ᩵") ^ i8;
                        z = z ? 1 : 0;
                        i = ((iM55979 ^ i9) * (-14765)) ^ 943058255;
                        i2 = 1777544947;
                    }
                    int i111 = iM55979 ^ i2;
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
                    C8381.m19542((AbstractActivityC5549) interfaceC24784);
                    iM55680 = C0946.m55979("ܳ᩹") ^ i9;
                    i5 = ((iM55680 ^ i8) * 4907) ^ 1248169404;
                    i6 = -2081318994;
                    int i24 = iM55680 ^ i6;
                    intent3 = intent3;
                    i11 = i24;
                    i10 = i5;
                    break;
                case -1610604800:
                case -1099335054:
                    intent3 = intent3;
                    if (i15 != z) {
                        iM55680 = (C0946.m55979("᩵۬") + i9) * (-81);
                        i5 = ((iM55680 ^ i8) * (-19091)) ^ 305306352;
                        i6 = -1956963146;
                    } else {
                        iM55680 = (C0946.m55979("ۢܳ") + i8) * (-53);
                        i5 = ((iM55680 ^ i9) * 21623) ^ 251014745;
                        i6 = 734961087;
                    }
                    int i25 = iM55680 ^ i6;
                    intent3 = intent3;
                    i11 = i25;
                    i10 = i5;
                    break;
                case -1567729209:
                case 2058389860:
                    m24104();
                    return;
                case -1560874759:
                case 383197451:
                    m24096(i15);
                    ServiceC9901.m23192();
                    intent3 = intent3;
                    iM55680 = C0946.m55979("ۡ֡") ^ i9;
                    i5 = ((iM55680 ^ i8) * (-17011)) ^ (-1939869233);
                    i6 = -1389230419;
                    int i26 = iM55680 ^ i6;
                    intent3 = intent3;
                    i11 = i26;
                    i10 = i5;
                    break;
                case -1527104279:
                case 816905001:
                    C7050.m16208(this.f28772, intentFilter);
                    this.f28771 = z;
                    i15 = i17;
                    iM55680 = C0873.m55680("ܳۛ") ^ i9;
                    i5 = ((iM55680 ^ i8) * (-21453)) ^ (-1438389074);
                    i6 = -864562286;
                    int i27 = iM55680 ^ i6;
                    intent3 = intent3;
                    i11 = i27;
                    i10 = i5;
                    break;
                case -1359040838:
                case -1358427539:
                    try {
                        m24096(i15);
                        int i28 = ServiceC3906.f8466;
                        applicationM55620 = C0861.m55620();
                        intent = new Intent(applicationM55620, (Class<?>) ServiceC3906.class);
                        application = applicationM55620;
                        intent3 = intent;
                        iM55681 = (i8 - C0873.m55680("ܿ֫")) * 27;
                        i5 = ((iM55681 ^ i9) * 22445) ^ (-335105387);
                        i7 = -1336438858;
                        i11 = iM55681 ^ i7;
                    } catch (Exception e) {
                        e = e;
                        intent3 = intent3;
                        exc = e;
                        iM55680 = C0873.m55680("ۨᩴ") ^ i8;
                        i5 = ((iM55680 ^ i9) * 23313) ^ 134936394;
                        i6 = 1456170860;
                        int i29 = iM55680 ^ i6;
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
                    short s = f82087[356];
                    int i30 = s + 2291;
                    int i31 = (s * s) + 5248681;
                    if ((i30 * i30) - (i31 + i31) > 0) {
                        iM55979 = (C0946.m55979("᩻ܳ") ^ i9) * 73;
                        i = ((iM55979 ^ i8) * (-8739)) ^ 2142239684;
                        i2 = 391723441;
                    } else {
                        iM55979 = C0873.m55680("۫۫") ^ i8;
                        i = ((iM55979 ^ i9) * 1741) ^ 207927444;
                        i2 = 1939400739;
                    }
                    int i112 = iM55979 ^ i2;
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
                    iM55979 = C0946.m55979("ܿ۟") ^ i8;
                    i = ((iM55979 ^ i9) * 3301) ^ 12844524;
                    i2 = -627112561;
                    int i113 = iM55979 ^ i2;
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
                    strM56413 = C0845.m55591(exc);
                    str2 = strM56413;
                    iM55680 = C0946.m55979("ۘۚ") ^ i9;
                    i5 = ((iM55680 ^ i8) * (-3525)) ^ (-1748416059);
                    i6 = -1298051938;
                    int i210 = iM55680 ^ i6;
                    intent3 = intent3;
                    i11 = i210;
                    i10 = i5;
                    break;
                case -959886944:
                case 1152421260:
                    if (i15 == i16) {
                        iM55681 = C0873.m55680("ۗ֡") ^ i9;
                        i5 = ((iM55681 ^ i8) * (-31083)) ^ (-321583591);
                        i7 = 750334798;
                    } else {
                        iM55681 = C0873.m55680("ۛܳ") ^ i8;
                        i5 = ((iM55681 ^ i9) * 25637) ^ (-2140040082);
                        i7 = -1982641486;
                    }
                    i11 = iM55681 ^ i7;
                    i10 = i5;
                    break;
                case -954981986:
                case 458587787:
                    intent3 = intent3;
                    i13 = 3;
                    if (i14 < 3) {
                        iM55680 = (C0873.m55680("֨ܳ") + i8) * (-47);
                        i5 = ((iM55680 ^ i9) * 12583) ^ 1887792884;
                        i6 = 714407827;
                    } else {
                        iM55680 = C0873.m55680("ܶۤ") ^ i8;
                        i5 = ((iM55680 ^ i9) * 25837) ^ (-311959585);
                        i6 = -1400971953;
                    }
                    int i211 = iM55680 ^ i6;
                    intent3 = intent3;
                    i11 = i211;
                    i10 = i5;
                    break;
                case -923585418:
                case 1161163088:
                    intentFilter.addAction(f28767[i14]);
                    intentFilter.addAction(f28768[i14]);
                    intentFilter.addAction(f28766[i14]);
                    i14++;
                    iM559710 = (C0873.m55680("֨ܿ") ^ i9) * 109;
                    i3 = ((iM559710 ^ i8) * (-4391)) ^ 466895471;
                    i4 = 1358452572;
                    intent2 = intent3;
                    i11 = iM559710 ^ i4;
                    i10 = i3;
                    intent3 = intent2;
                    break;
                case -769923641:
                case -152374750:
                    intent3 = intent3;
                    this.f28776 = true;
                    boolean z3 = this.f28770;
                    i17 = 0;
                    String strM56102 = C0992.m56102(f82087, 357, 4, i12);
                    if (z3) {
                        str = strM56102;
                        z = true;
                        iM55680 = C0946.m55979("ܳ᩹") ^ i9;
                        i5 = ((iM55680 ^ i8) * 4907) ^ 1248169404;
                        i6 = -2081318994;
                        int i212 = iM55680 ^ i6;
                        intent3 = intent3;
                        i11 = i212;
                        i10 = i5;
                    } else {
                        int iM55683 = C0873.m55680("ۡ۫") ^ i8;
                        str = strM56102;
                        intent3 = intent3;
                        i11 = iM55683 ^ 1168248777;
                        i10 = ((iM55683 ^ i9) * 8585) ^ 421794409;
                        z = true;
                    }
                    break;
                case -748523347:
                case 2014050850:
                    intent3 = intent3;
                    if (i15 != 0) {
                        iM55680 = (C0873.m55680("ۛᩳ") + i8) * (-81);
                        i5 = ((iM55680 ^ i9) * 4745) ^ (-1307146476);
                        i6 = -1805975841;
                    } else {
                        iM55680 = (i8 - C0873.m55680("ܽۢ")) * 31;
                        i5 = ((iM55680 ^ i9) * (-29027)) ^ 1653390556;
                        i6 = -173397907;
                    }
                    int i213 = iM55680 ^ i6;
                    intent3 = intent3;
                    i11 = i213;
                    i10 = i5;
                    break;
                case -642313313:
                case 1278967374:
                    intent3 = intent3;
                    if (i15 != z) {
                        iM55680 = C0946.m55979("᩷ۧ") ^ i8;
                        i5 = ((iM55680 ^ i9) * (-20039)) ^ 548998961;
                        i6 = -833718984;
                    } else {
                        iM55680 = (i9 - C0873.m55680("ۜᩳ")) * 29;
                        i5 = ((iM55680 ^ i8) * (-31871)) ^ (-136865359);
                        i6 = -1339789036;
                    }
                    int i214 = iM55680 ^ i6;
                    intent3 = intent3;
                    i11 = i214;
                    i10 = i5;
                    break;
                case -554723977:
                case 397550636:
                    intent3 = intent3;
                    zM46783 = ServiceC3906.m7715();
                    z2 = zM46783;
                    iM55680 = (C0873.m55680("᩶᩻") ^ i8) * 115;
                    i5 = ((iM55680 ^ i9) * 8371) ^ (-1763863159);
                    i6 = -424199264;
                    int i215 = iM55680 ^ i6;
                    intent3 = intent3;
                    i11 = i215;
                    i10 = i5;
                    break;
                case -87994173:
                case 1506543382:
                    intent3 = intent3;
                    if ((this.f28774 & ((z ? 1 : 0) << i15)) == 0) {
                        iM55680 = C0946.m55979("ۡ֡") ^ i9;
                        i5 = ((iM55680 ^ i8) * (-17011)) ^ (-1939869233);
                        i6 = -1389230419;
                    } else {
                        iM55680 = (C0946.m55979("ܳܺ") ^ i8) * 67;
                        i5 = ((iM55680 ^ i9) * (-13473)) ^ (-987680723);
                        i6 = 897208432;
                    }
                    int i216 = iM55680 ^ i6;
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
                        iM55979 = (i9 - C0873.m55680("ۘᩴ")) * (-93);
                        i = ((iM55979 ^ i8) * 28851) ^ 1401443314;
                        i2 = -283874332;
                        int i114 = iM55979 ^ i2;
                        str = str;
                        intent2 = intent3;
                        i11 = i114;
                        i10 = i;
                        z = z;
                        i17 = i17;
                        intent3 = intent2;
                    } else {
                        iM55680 = (C0873.m55680("֨ܺ") ^ i9) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM55680 ^ i8) * 27209) ^ (-348100000);
                        i6 = 578885843;
                        int i217 = iM55680 ^ i6;
                        intent3 = intent3;
                        i11 = i217;
                        i10 = i5;
                    }
                    break;
                case 214595008:
                case 846392183:
                    intent3 = intent3;
                    if (z2) {
                        iM55680 = C0873.m55680("᩹ܿ") ^ i9;
                        i5 = ((iM55680 ^ i8) * (-21287)) ^ 1080768979;
                        i6 = 211176925;
                    } else {
                        iM55680 = C0873.m55680("ۤ֨") ^ i9;
                        i5 = ((iM55680 ^ i8) * 25843) ^ 664245548;
                        i6 = -163300485;
                    }
                    int i218 = iM55680 ^ i6;
                    intent3 = intent3;
                    i11 = i218;
                    i10 = i5;
                    break;
                case 264061117:
                case 513967008:
                    intent3 = intent3;
                    strM55667 = RunnableC0871.m55667(f82087, TwofishEngine.GF256_FDBK, 25, i12);
                    i16 = 2;
                    if (i15 != 0) {
                        iM55680 = (i8 - C0946.m55979("֫᩶")) * (-87);
                        i5 = ((iM55680 ^ i9) * (-15303)) ^ (-1955082102);
                        i6 = -1524664873;
                    } else {
                        iM55680 = C0873.m55680("ۘ۫") ^ i9;
                        i5 = ((iM55680 ^ i8) * 10917) ^ 839661231;
                        i6 = -1808745267;
                    }
                    int i219 = iM55680 ^ i6;
                    intent3 = intent3;
                    i11 = i219;
                    i10 = i5;
                    break;
                case 436148666:
                case 1878905048:
                    intent3 = intent3;
                    StringBuilder sb2 = new StringBuilder(strM55667);
                    C0863.m55629(sb2, i15);
                    throw new IllegalArgumentException(C0845.m55591(sb2));
                case 444562883:
                case 1736495858:
                    intent3 = intent3;
                    zM46783 = ServiceC20700.m46783();
                    z2 = zM46783;
                    iM55680 = (C0873.m55680("᩶᩻") ^ i8) * 115;
                    i5 = ((iM55680 ^ i9) * 8371) ^ (-1763863159);
                    i6 = -424199264;
                    int i2110 = iM55680 ^ i6;
                    intent3 = intent3;
                    i11 = i2110;
                    i10 = i5;
                    break;
                case 595445328:
                case 1178332846:
                    i15++;
                    iM55680 = C0873.m55680("ܳۛ") ^ i9;
                    i5 = ((iM55680 ^ i8) * (-21453)) ^ (-1438389074);
                    i6 = -864562286;
                    int i2111 = iM55680 ^ i6;
                    intent3 = intent3;
                    i11 = i2111;
                    i10 = i5;
                    break;
                case 643803977:
                case 1635239458:
                    intentFilter = new IntentFilter();
                    i14 = 0;
                    iM559710 = (C0873.m55680("֨ܿ") ^ i9) * 109;
                    i3 = ((iM559710 ^ i8) * (-4391)) ^ 466895471;
                    i4 = 1358452572;
                    intent2 = intent3;
                    i11 = iM559710 ^ i4;
                    i10 = i3;
                    intent3 = intent2;
                    break;
                case 648807051:
                case 1582272552:
                    intent3 = intent3;
                    if (C0890.m55730(C1229.m56413(exc))) {
                        iM55680 = C0946.m55979("۠ۨ") ^ i9;
                        i5 = ((iM55680 ^ i8) * 25705) ^ (-988951791);
                        i6 = 1796532370;
                    } else {
                        iM55680 = (i8 - C0946.m55979("ۧᩴ")) * (-95);
                        i5 = ((iM55680 ^ i9) * 7349) ^ 1709617469;
                        i6 = -1273294459;
                    }
                    int i2112 = iM55680 ^ i6;
                    intent3 = intent3;
                    i11 = i2112;
                    i10 = i5;
                    break;
                case 793184802:
                case 1434650530:
                    try {
                        C0886.m5546(application, intent3);
                        intent3 = intent3;
                        iM55680 = C0946.m55979("ۡ֡") ^ i9;
                        i5 = ((iM55680 ^ i8) * (-17011)) ^ (-1939869233);
                        i6 = -1389230419;
                    } catch (Exception e2) {
                        exc = e2;
                        intent3 = intent3;
                        iM55680 = C0873.m55680("ۨᩴ") ^ i8;
                        i5 = ((iM55680 ^ i9) * 23313) ^ 134936394;
                        i6 = 1456170860;
                    }
                    int i2113 = iM55680 ^ i6;
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
                    if ((ApplicationC21448.f67650.getInt(str, i17) & 7) == 0) {
                        str = str;
                        z = z ? 1 : 0;
                        i17 = i17;
                        iM55680 = C0946.m55979("ܳ᩹") ^ i9;
                        i5 = ((iM55680 ^ i8) * 4907) ^ 1248169404;
                        i6 = -2081318994;
                        int i2114 = iM55680 ^ i6;
                        intent3 = intent3;
                        i11 = i2114;
                        i10 = i5;
                    } else {
                        iM55979 = (i9 - C0946.m55979("ۧ᩺")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM55979 ^ i8) * 31785) ^ 1193818057;
                        i2 = 744573518;
                        int i115 = iM55979 ^ i2;
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
                    m24097(i15, str2);
                    iM55680 = C0946.m55979("ۡ֡") ^ i9;
                    i5 = ((iM55680 ^ i8) * (-17011)) ^ (-1939869233);
                    i6 = -1389230419;
                    int i2115 = iM55680 ^ i6;
                    intent3 = intent3;
                    i11 = i2115;
                    i10 = i5;
                    break;
                case 1395026751:
                case 1456087104:
                    intent3 = intent3;
                    if (!(interfaceC24784 instanceof AbstractActivityC5549)) {
                        iM55680 = C0946.m55979("ܳ᩹") ^ i9;
                        i5 = ((iM55680 ^ i8) * 4907) ^ 1248169404;
                        i6 = -2081318994;
                        int i2116 = iM55680 ^ i6;
                        intent3 = intent3;
                        i11 = i2116;
                        i10 = i5;
                    } else {
                        iM559710 = C0946.m55979("ܺۙ") ^ i8;
                        i3 = ((iM559710 ^ i9) * 11873) ^ 987433728;
                        i4 = -1757437145;
                        intent2 = intent3;
                        i11 = iM559710 ^ i4;
                        i10 = i3;
                        intent3 = intent2;
                    }
                    break;
                case 1444866141:
                case 1665221822:
                    strM56413 = C1229.m56413(exc);
                    str2 = strM56413;
                    iM55680 = C0946.m55979("ۘۚ") ^ i9;
                    i5 = ((iM55680 ^ i8) * (-3525)) ^ (-1748416059);
                    i6 = -1298051938;
                    int i2117 = iM55680 ^ i6;
                    intent3 = intent3;
                    i11 = i2117;
                    i10 = i5;
                    break;
                default:
                    intent3 = intent3;
                    try {
                        zM46783 = ServiceC9901.m23194();
                        z2 = zM46783;
                        iM55680 = (C0873.m55680("᩶᩻") ^ i8) * 115;
                        i5 = ((iM55680 ^ i9) * 8371) ^ (-1763863159);
                        i6 = -424199264;
                    } catch (Exception e3) {
                        e = e3;
                        exc = e;
                        iM55680 = C0873.m55680("ۨᩴ") ^ i8;
                        i5 = ((iM55680 ^ i9) * 23313) ^ 134936394;
                        i6 = 1456170860;
                    }
                    int i2118 = iM55680 ^ i6;
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
    /* JADX INFO: renamed from: ֫ */
    private void m24096(final int i) {
        int iM55979;
        int i2;
        Runnable[] runnableArr = null;
        Handler handler = null;
        int i3 = 1719715062;
        int i4 = C1124.f82007;
        int i5 = C1964.f83032;
        int iM559710 = (i4 - C0946.m55979("ᩴܺ")) * 89;
        int i6 = ((iM559710 ^ i5) * (-17905)) ^ (-206006359);
        int i7 = -525685643;
        while (true) {
            int i8 = iM559710 ^ i7;
            Runnable runnable = null;
            while (true) {
                i3 = ((((i3 ^ i5) * (-8813)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2128264141:
                    case 233189757:
                        C1036.m56257();
                        RunnableC0938.m55938();
                        break;
                    case -1965406684:
                    case -1116140677:
                        handler.postDelayed(runnable, 30000L);
                        break;
                    case -1893994194:
                    case 1384540084:
                        if (C1124.f82007 < 0) {
                            iM55979 = C0946.m55979("᩹᩵") ^ i5;
                            i6 = ((iM55979 ^ i4) * (-13879)) ^ 2044482032;
                            i2 = -1758247471;
                            i8 = iM55979 ^ i2;
                        }
                        break;
                    case -1853302610:
                    case 1908965374:
                        if (C0861.f81831) {
                            iM55979 = (i4 - C0946.m55979("ܶᩴ")) * (-95);
                            i6 = ((iM55979 ^ i5) * (-10273)) ^ 1293424449;
                            i2 = -943509658;
                        } else {
                            iM55979 = C0873.m55680("ۨۧ") ^ i4;
                            i6 = ((iM55979 ^ i5) * 14651) ^ (-478121058);
                            i2 = -30578679;
                        }
                        i8 = iM55979 ^ i2;
                        break;
                    case -1751118180:
                    case 1825405347:
                        if (AbstractC0942.f81890 <= 0) {
                            iM55979 = (i4 - C0873.m55680("᩺ܳ")) * (-13);
                            i6 = ((iM55979 ^ i5) * (-25127)) ^ 1366448553;
                            i2 = 313837939;
                        } else {
                            iM55979 = (C0946.m55979("᩻֫") ^ i5) * (-97);
                            i6 = ((iM55979 ^ i4) * 23249) ^ (-994426182);
                            i2 = 935743124;
                        }
                        i8 = iM55979 ^ i2;
                        break;
                    case -1636332841:
                    case -445387502:
                        C1929.m56553();
                        if (AbstractC0942.m55971()) {
                        }
                        iM55979 = C0873.m55680("ۨۧ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 14651) ^ (-478121058);
                        i2 = -30578679;
                        i8 = iM55979 ^ i2;
                        break;
                    case -1580247303:
                    case 417685273:
                        if (C1229.f82066 >= 0) {
                            iM55979 = C0873.m55680("ۨۧ") ^ i4;
                            i6 = ((iM55979 ^ i5) * 14651) ^ (-478121058);
                            i2 = -30578679;
                        } else {
                            iM55979 = C0873.m55680("ۚܶ") ^ i4;
                            i6 = ((iM55979 ^ i5) * (-28143)) ^ 1019218226;
                            i2 = 1647053541;
                        }
                        i8 = iM55979 ^ i2;
                        break;
                    case -1563227090:
                    case 576815414:
                        if (C1053.f81965 <= 0) {
                            iM55979 = C0873.m55680("᩷᩷") ^ i5;
                            i6 = ((iM55979 ^ i4) * (-19697)) ^ (-1858486487);
                            i2 = -1416117548;
                        } else {
                            iM55979 = C0873.m55680("ۢᩴ") ^ i4;
                            i6 = ((iM55979 ^ i5) * (-5105)) ^ (-184847446);
                            i2 = 2092898091;
                        }
                        i8 = iM55979 ^ i2;
                        break;
                    case -1506666888:
                    case 1059384223:
                        if (C0892.f81851) {
                            iM55979 = C0946.m55979("᩺ܰ") ^ i5;
                            i6 = ((iM55979 ^ i4) * (-25969)) ^ 1542484756;
                            i2 = 1912884418;
                        } else {
                            iM55979 = C0873.m55680("ۨۧ") ^ i4;
                            i6 = ((iM55979 ^ i5) * 14651) ^ (-478121058);
                            i2 = -30578679;
                        }
                        i8 = iM55979 ^ i2;
                        break;
                    case -1044935037:
                    case 1321464085:
                        runnableArr[i] = runnable;
                        handler = this.f28775;
                        if (C0949.f81897 < 0) {
                            iM55979 = (i5 - C0946.m55979("᩷ܰ")) * (-45);
                            i6 = ((iM55979 ^ i4) * (-8647)) ^ (-2086341634);
                            i2 = 225641946;
                            i8 = iM55979 ^ i2;
                        }
                        break;
                    case -420893111:
                    case 756150801:
                        C0882.m55710();
                        break;
                    case 58954253:
                    case 1207009549:
                        ViewOnClickListenerC0939.m55941();
                        if (!C0955.f81898) {
                        }
                        iM55979 = (i4 - C0873.m55680("᩺ܳ")) * (-13);
                        i6 = ((iM55979 ^ i5) * (-25127)) ^ 1366448553;
                        i2 = 313837939;
                        i8 = iM55979 ^ i2;
                        break;
                    case 271932762:
                    case 819442642:
                        if (!C0882.f81846) {
                            runnable = new Runnable(this) { // from class: l.ۚ᩸᩷

                                /* JADX INFO: renamed from: ᩸ */
                                public final /* synthetic */ C10403 f20249;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C10403.m24098(this.f20249, i);
                                }

                                {
                                    int i9 = 1602706090;
                                    int i10 = C0930.f81879;
                                    int i11 = ViewOnClickListenerC0939.f81888;
                                    int iM55680 = C0873.m55680("᩵᩵") ^ i11;
                                    int i12 = ((iM55680 ^ i10) * 99) ^ (-600215976);
                                    int i13 = -258759854;
                                    while (true) {
                                        i9 = ((((i9 ^ i10) * (-17517)) >> 31) & i12) ^ (iM55680 ^ i13);
                                        switch (i9) {
                                            case -1943017940:
                                            case -1626071287:
                                                if (C0861.f81831) {
                                                    iM55680 = (C0873.m55680("ۢܺ") + i11) * (-57);
                                                    i12 = ((iM55680 ^ i10) * 19001) ^ (-1843109139);
                                                    i13 = 693642996;
                                                } else {
                                                    iM55680 = C0946.m55979("۬᩵") ^ i10;
                                                    i12 = ((iM55680 ^ i11) * (-21805)) ^ 56149095;
                                                    i13 = -1037905896;
                                                }
                                                break;
                                            case -1916875737:
                                            case -1862742577:
                                                if (C0912.f81867 <= 0) {
                                                    iM55680 = C0946.m55979("۬᩵") ^ i10;
                                                    i12 = ((iM55680 ^ i11) * (-21805)) ^ 56149095;
                                                    i13 = -1037905896;
                                                } else {
                                                    iM55680 = (i10 - C0946.m55979("۟ۡ")) * (-61);
                                                    i12 = ((iM55680 ^ i11) * (-10805)) ^ 573159646;
                                                    i13 = -1272736346;
                                                }
                                                break;
                                            case -1762043448:
                                            case -845067041:
                                                if (C0873.f81841 <= 0) {
                                                    iM55680 = C0946.m55979("ۙۖ") ^ i10;
                                                    i12 = ((iM55680 ^ i11) * (-26277)) ^ (-894164872);
                                                    i13 = -474140413;
                                                } else {
                                                    iM55680 = (C0946.m55979("ܿܶ") ^ i10) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                    i12 = ((iM55680 ^ i11) * (-5063)) ^ 852747689;
                                                    i13 = -187765079;
                                                }
                                                break;
                                            case -1672823250:
                                            case 1308784636:
                                                C1044.m56286();
                                                if (C0930.f81879 > 0) {
                                                    iM55680 = C0946.m55979("ۤ۬") ^ i11;
                                                    i12 = ((iM55680 ^ i10) * 27201) ^ (-442169887);
                                                    i13 = -1540838490;
                                                } else {
                                                    iM55680 = (C0873.m55680("ۘ᩷") + i11) * (-83);
                                                    i12 = ((iM55680 ^ i10) * (-30673)) ^ 1652417842;
                                                    i13 = 1209553690;
                                                }
                                                break;
                                            case -1531754043:
                                            case 308723998:
                                                this.f20249 = this;
                                                if (C0930.m55885() <= 0) {
                                                    iM55680 = C0946.m55979("۬᩵") ^ i10;
                                                    i12 = ((iM55680 ^ i11) * (-21805)) ^ 56149095;
                                                    i13 = -1037905896;
                                                } else {
                                                    iM55680 = C0873.m55680("ᩳ֨") ^ i11;
                                                    i12 = ((iM55680 ^ i10) * (-8781)) ^ 1738249106;
                                                    i13 = -1186478846;
                                                }
                                                break;
                                            case -1475659378:
                                            case -311994208:
                                                if (C0845.m55584() <= 0) {
                                                    iM55680 = (C0873.m55680("ۘ᩷") + i11) * (-83);
                                                    i12 = ((iM55680 ^ i10) * (-30673)) ^ 1652417842;
                                                    i13 = 1209553690;
                                                } else {
                                                    iM55680 = (i10 - C0873.m55680("ۚ֫")) * 7;
                                                    i12 = ((iM55680 ^ i11) * (-23601)) ^ (-1984363896);
                                                    i13 = -17061751;
                                                }
                                                break;
                                            case -1176756278:
                                            case -715158642:
                                                if (C1017.f81942 >= 0) {
                                                    iM55680 = (C0873.m55680("ۘ᩷") + i11) * (-83);
                                                    i12 = ((iM55680 ^ i10) * (-30673)) ^ 1652417842;
                                                    i13 = 1209553690;
                                                } else {
                                                    iM55680 = C0873.m55680("֡۬") ^ i10;
                                                    i12 = ((iM55680 ^ i11) * (-16959)) ^ (-355628273);
                                                    i13 = -1314272364;
                                                }
                                                break;
                                            case -855602200:
                                            case -260120668:
                                                ViewOnClickListenerC0939.m55941();
                                                if (C0882.m55710() == 0) {
                                                    iM55680 = C0946.m55979("۬᩵") ^ i10;
                                                    i12 = ((iM55680 ^ i11) * (-21805)) ^ 56149095;
                                                    i13 = -1037905896;
                                                } else {
                                                    iM55680 = (C0873.m55680("ۘ᩷") + i11) * (-83);
                                                    i12 = ((iM55680 ^ i10) * (-30673)) ^ 1652417842;
                                                    i13 = 1209553690;
                                                }
                                                break;
                                            case -480605392:
                                            case 1765927207:
                                                if (C1053.f81965 <= 0) {
                                                    iM55680 = C0946.m55979("ۤ۬") ^ i11;
                                                    i12 = ((iM55680 ^ i10) * 27201) ^ (-442169887);
                                                    i13 = -1540838490;
                                                } else {
                                                    iM55680 = C0946.m55979("ۗ֡") ^ i11;
                                                    i12 = ((iM55680 ^ i10) * (-29047)) ^ 682856107;
                                                    i13 = -643976774;
                                                }
                                                break;
                                            case -325107481:
                                            case 91083864:
                                                C1003.m56123();
                                                iM55680 = (C0873.m55680("ۘ᩷") + i11) * (-83);
                                                i12 = ((iM55680 ^ i10) * (-30673)) ^ 1652417842;
                                                i13 = 1209553690;
                                                break;
                                            case -264489084:
                                            case 2043604142:
                                                C1929.m56553();
                                                C0967.m56074();
                                                throw new RuntimeException();
                                            case 533704376:
                                            case 1509218111:
                                                return;
                                            case 900084025:
                                            case 2076881698:
                                                if (C0946.f81894 != 0) {
                                                    iM55680 = (i11 - C0946.m55979("ۨܿ")) * 127;
                                                    i12 = ((iM55680 ^ i10) * (-29289)) ^ (-1691247128);
                                                    i13 = 554309390;
                                                } else {
                                                    iM55680 = C0946.m55979("ܰۖ") ^ i11;
                                                    i12 = ((iM55680 ^ i10) * (-2223)) ^ 2061490192;
                                                    i13 = 1273818921;
                                                }
                                                break;
                                            case 1050678013:
                                            case 1765251226:
                                                if (C1048.f81963) {
                                                    iM55680 = C0946.m55979("ܺ᩻") ^ i10;
                                                    i12 = ((iM55680 ^ i11) * (-21963)) ^ 2012158555;
                                                    i13 = 454797902;
                                                } else {
                                                    iM55680 = C0946.m55979("۬᩵") ^ i10;
                                                    i12 = ((iM55680 ^ i11) * (-21805)) ^ 56149095;
                                                    i13 = -1037905896;
                                                }
                                                break;
                                            case 1147582743:
                                            case 1787262749:
                                                if (C0912.m55833()) {
                                                    iM55680 = C0946.m55979("ۤ۬") ^ i11;
                                                    i12 = ((iM55680 ^ i10) * 27201) ^ (-442169887);
                                                    i13 = -1540838490;
                                                } else {
                                                    iM55680 = (i11 - C0946.m55979("ܶۖ")) * (-71);
                                                    i12 = ((iM55680 ^ i10) * 32299) ^ (-153835660);
                                                    i13 = 1017381015;
                                                }
                                                break;
                                            default:
                                                if (C0854.f81826 != 0) {
                                                    iM55680 = C0946.m55979("ۙۖ") ^ i10;
                                                    i12 = ((iM55680 ^ i11) * (-26277)) ^ (-894164872);
                                                    i13 = -474140413;
                                                } else {
                                                    iM55680 = (C0873.m55680("ۘ᩷") + i11) * (-83);
                                                    i12 = ((iM55680 ^ i10) * (-30673)) ^ 1652417842;
                                                    i13 = 1209553690;
                                                }
                                                break;
                                        }
                                    }
                                }
                            };
                            runnableArr = this.f28773;
                            if (C1024.m56209() >= 0) {
                                iM55979 = C0873.m55680("᩷᩷") ^ i5;
                                i6 = ((iM55979 ^ i4) * (-19697)) ^ (-1858486487);
                                i2 = -1416117548;
                            } else {
                                iM55979 = C0873.m55680("ۡ֫") ^ i4;
                                i6 = ((iM55979 ^ i5) * 6589) ^ 1855389936;
                                i2 = -1544287320;
                            }
                            i8 = iM55979 ^ i2;
                        }
                        break;
                    case 1206153687:
                    case 1989478685:
                        if (C0912.f81867 <= 0) {
                            iM55979 = C0873.m55680("᩷᩷") ^ i5;
                            i6 = ((iM55979 ^ i4) * (-19697)) ^ (-1858486487);
                            i2 = -1416117548;
                        } else {
                            iM55979 = C0873.m55680("ۗۛ") ^ i5;
                            i6 = ((iM55979 ^ i4) * 9867) ^ 2046439928;
                            i2 = 87322581;
                        }
                        i8 = iM55979 ^ i2;
                        break;
                    default:
                        C0898.m55800();
                        if (C0898.m55800() <= 0) {
                            iM55979 = (i4 - C0873.m55680("᩺ܳ")) * (-13);
                            i6 = ((iM55979 ^ i5) * (-25127)) ^ 1366448553;
                            i2 = 313837939;
                        } else {
                            iM55979 = (C0946.m55979("᩻ۖ") ^ i5) * 49;
                            i6 = ((iM55979 ^ i4) * (-20081)) ^ (-1594952991);
                            i2 = 1281896405;
                        }
                        i8 = iM55979 ^ i2;
                        break;
                }
                return;
            }
            iM559710 = C0873.m55680("ۙ۫") ^ i4;
            i6 = ((iM559710 ^ i5) * (-733)) ^ (-1427807716);
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
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m24098(C10403 c10403, int i) {
        int i2;
        int iM55979;
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
        int i12 = C1053.f81965;
        int i13 = C1036.f81953;
        int iM559710 = C0946.m55979("ۡۚ") ^ i13;
        int i14 = ((iM559710 ^ i12) * (-7927)) ^ (-593413465);
        int i15 = iM559710 ^ 1786701613;
        int iM55680 = 0;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i12) * 17667) >> 31));
            switch (i11) {
                case -2106939700:
                case 1852863591:
                    i2 = i8;
                    i7 = i6 + 1;
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0873.m55680("᩶۫") ^ i13) * (-23);
                        i3 = ((iM55979 ^ i12) * 26419) ^ 51388817;
                        i4 = 503726806;
                    } else {
                        iM55979 = C0946.m55979("ۜۙ") ^ i13;
                        i3 = ((iM55979 ^ i12) * 14221) ^ (-626040457);
                        i4 = -2136047224;
                    }
                    i15 = iM55979 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case -1935860447:
                case 2115057602:
                    i2 = i8;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0873.m55680("ۡ֫") ^ i12;
                        i3 = ((iM55979 ^ i13) * 7209) ^ 1602967252;
                        i4 = -2119384520;
                    } else {
                        iM55979 = (C0946.m55979("ۚܶ") + i13) * 55;
                        i3 = ((iM55979 ^ i12) * (-11057)) ^ (-1528168049);
                        i4 = 1589076136;
                    }
                    i15 = iM55979 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case -1917044406:
                case -1063939670:
                    i2 = i8;
                    i10 = 3;
                    if (C0861.f81831) {
                        iM55979 = (C0873.m55680("۬᩸") + i12) * 109;
                        i3 = ((iM55979 ^ i13) * (-20517)) ^ (-883653775);
                        i4 = -920745293;
                    } else {
                        iM55979 = (C0873.m55680("᩶۫") ^ i13) * (-23);
                        i3 = ((iM55979 ^ i12) * 26419) ^ 51388817;
                        i4 = 503726806;
                    }
                    i15 = iM55979 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case -1895956600:
                case 1411546783:
                    i5 = 9985;
                    iM55979 = C0946.m55979("ܶ᩹") ^ i12;
                    i2 = i5;
                    i3 = ((iM55979 ^ i13) * (-20267)) ^ (-629198468);
                    i4 = 304143308;
                    i15 = iM55979 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case -1828512969:
                case 1128918845:
                    i2 = i8;
                    s = sArr[c];
                    s2 = 2;
                    if (C0861.m55626()) {
                        iM55979 = (C0946.m55979("ܿ֨") ^ i13) * (-115);
                        i3 = ((iM55979 ^ i12) * 29729) ^ (-1363388123);
                        i4 = -1973618825;
                    } else {
                        iM55979 = (i12 - C0946.m55979("۫ۨ")) * (-93);
                        i3 = ((iM55979 ^ i13) * 6387) ^ (-686834122);
                        i4 = 1703001890;
                    }
                    i15 = iM55979 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case -1753979671:
                case -1621833629:
                    i2 = i8;
                    i6 = s * s2;
                    if (C0845.m55584() <= 0) {
                        iM55979 = (C0946.m55979("ܿ֨") ^ i13) * (-115);
                        i3 = ((iM55979 ^ i12) * 29729) ^ (-1363388123);
                        i4 = -1973618825;
                    } else {
                        iM55979 = (i12 - C0946.m55979("ܿ᩸")) * (-35);
                        i3 = ((iM55979 ^ i13) * 31505) ^ 355509485;
                        i4 = 1440879935;
                    }
                    i15 = iM55979 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case -1675151874:
                case -732750698:
                    i2 = i8;
                    c = 337;
                    if (C1048.m56305() >= 0) {
                        iM55979 = (C0873.m55680("ۗۖ") + i12) * (-51);
                        i3 = ((iM55979 ^ i13) * (-25381)) ^ (-1717608148);
                        i4 = 1465652755;
                    } else {
                        iM55979 = (C0873.m55680("ۛ᩷") ^ i13) * 23;
                        i3 = ((iM55979 ^ i12) * 22901) ^ (-175077639);
                        i4 = 762583000;
                    }
                    i15 = iM55979 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case -1592748787:
                case 645662951:
                    i2 = i8;
                    sArr2 = f82087;
                    i9 = 338;
                    if (C0992.m56107() <= 0) {
                        iM55979 = (C0873.m55680("ۗۖ") + i12) * (-51);
                        i3 = ((iM55979 ^ i13) * (-25381)) ^ (-1717608148);
                        i4 = 1465652755;
                    } else {
                        iM55979 = C0873.m55680("ۢۖ") ^ i13;
                        i3 = ((iM55979 ^ i12) * 9531) ^ 110909683;
                        i4 = 645294987;
                    }
                    i15 = iM55979 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case -1409121453:
                case 1436761747:
                    i2 = i8;
                    int i16 = s + s3;
                    if (i7 - (i16 * i16) > 0) {
                        iM55979 = C0873.m55680("ۖ᩶") ^ i13;
                        i3 = ((iM55979 ^ i12) * 12587) ^ (-92133752);
                        i4 = 1746810877;
                    } else {
                        iM55979 = C0946.m55979("ۚ᩺") ^ i13;
                        i3 = ((iM55979 ^ i12) * (-24789)) ^ (-1257556562);
                        i4 = -1915780734;
                    }
                    i15 = iM55979 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case -1242549766:
                case 1449632833:
                    C1053.m56327();
                    break;
                case -1001701969:
                case -10165727:
                    i2 = i8;
                    sArr = f82087;
                    if (C1044.f81959 >= 0) {
                        iM55979 = (C0946.m55979("ܿ֨") ^ i13) * (-115);
                        i3 = ((iM55979 ^ i12) * 29729) ^ (-1363388123);
                        i4 = -1973618825;
                    } else {
                        iM55979 = C0946.m55979("ۚ֨") ^ i12;
                        i3 = ((iM55979 ^ i13) * (-3599)) ^ 1634570603;
                        i4 = -535826512;
                    }
                    i15 = iM55979 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case -970709880:
                case -501720866:
                    if (C0949.f81897 < 0) {
                        int iM559711 = (C0946.m55979("᩻ۧ") + i12) * (-7);
                        i15 = iM559711 ^ (-559982720);
                        i14 = ((iM559711 ^ i13) * 26729) ^ 2087971690;
                    } else {
                        i2 = i8;
                        iM55979 = C0873.m55680("ۡ֫") ^ i12;
                        i3 = ((iM55979 ^ i13) * 7209) ^ 1602967252;
                        i4 = -2119384520;
                        i15 = iM55979 ^ i4;
                        i14 = i3;
                        i8 = i2;
                    }
                    break;
                case -840146469:
                case 1528609018:
                    C0898.m55800();
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        i2 = i8;
                        iM55979 = (C0873.m55680("ۗۖ") + i12) * (-51);
                        i3 = ((iM55979 ^ i13) * (-25381)) ^ (-1717608148);
                        i4 = 1465652755;
                        i15 = iM55979 ^ i4;
                        i14 = i3;
                        i8 = i2;
                    } else {
                        int iM559712 = (C0946.m55979("᩻ۧ") + i12) * (-7);
                        i15 = iM559712 ^ (-559982720);
                        i14 = ((iM559712 ^ i13) * 26729) ^ 2087971690;
                    }
                    break;
                case -621538281:
                case 1341876948:
                    C1229.m56410();
                    if (C1194.f82045 == 0) {
                        i2 = i8;
                        iM55979 = (C0873.m55680("᩶۫") ^ i13) * (-23);
                        i3 = ((iM55979 ^ i12) * 26419) ^ 51388817;
                        i4 = 503726806;
                        i15 = iM55979 ^ i4;
                        i14 = i3;
                        i8 = i2;
                    }
                    i2 = i8;
                    iM55979 = C0873.m55680("ۡ֫") ^ i12;
                    i3 = ((iM55979 ^ i13) * 7209) ^ 1602967252;
                    i4 = -2119384520;
                    i15 = iM55979 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case -157041961:
                case 1716354272:
                    i2 = i8;
                    s3 = 1;
                    if (C0892.f81851) {
                        iM55979 = (i12 - C0873.m55680("ۗᩴ")) * (-23);
                        i3 = ((iM55979 ^ i13) * (-12541)) ^ (-500384286);
                        i4 = 510559280;
                    } else {
                        iM55979 = (C0873.m55680("ۗۖ") + i12) * (-51);
                        i3 = ((iM55979 ^ i13) * (-25381)) ^ (-1717608148);
                        i4 = 1465652755;
                    }
                    i15 = iM55979 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case 4371652:
                case 1593202296:
                    c10403.m24097(i, ServiceConnectionC1013.m56156(iM55680 ^ 2102768133));
                    break;
                case 825830399:
                case 1608196342:
                    C1964.m56597();
                    i2 = i8;
                    iM55979 = C0873.m55680("ۡ֫") ^ i12;
                    i3 = ((iM55979 ^ i13) * 7209) ^ 1602967252;
                    i4 = -2119384520;
                    i15 = iM55979 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                case 1798064503:
                case 1870745542:
                    i5 = 31089;
                    iM55979 = C0946.m55979("ܶ᩹") ^ i12;
                    i2 = i5;
                    i3 = ((iM55979 ^ i13) * (-20267)) ^ (-629198468);
                    i4 = 304143308;
                    i15 = iM55979 ^ i4;
                    i14 = i3;
                    i8 = i2;
                    break;
                default:
                    iM55680 = C0873.m55680(C0890.m55726(sArr2, i9, i10, i8));
                    if (C0946.m55980() != 0) {
                        i2 = i8;
                        iM55979 = C0873.m55680("ۡ֫") ^ i12;
                        i3 = ((iM55979 ^ i13) * 7209) ^ 1602967252;
                        i4 = -2119384520;
                    } else {
                        iM55979 = (i13 - C0873.m55680("֨ۜ")) * (-31);
                        i2 = i8;
                        i3 = ((iM55979 ^ i12) * 20783) ^ (-1254585477);
                        i4 = 181847813;
                    }
                    i15 = iM55979 ^ i4;
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
    /* JADX INFO: renamed from: ֫ */
    public void m24097(int i, String str) {
        int i2;
        int iM55979;
        int i3;
        int iM559710;
        int i4;
        int i5;
        int iM559711;
        int i6;
        int iM55680;
        int i7;
        int i8;
        short s;
        int iM55681;
        int i9;
        C10403 c10403 = this;
        String str2 = str;
        Runnable[] runnableArr = null;
        Runnable runnable = null;
        Handler handler = null;
        StringBuilder sb = null;
        Application applicationM55620 = null;
        String str3 = null;
        boolean z = false;
        int i10 = 0;
        Runnable runnable2 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 2122856791;
        int i14 = RunnableC0938.f81886;
        int i15 = C0866.f81837;
        int iM559712 = (i14 - C0946.m55979("ܺܶ")) * (-29);
        int i16 = ((iM559712 ^ i15) * (-18781)) ^ 1108083635;
        int i17 = iM559712 ^ (-8345375);
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
                    if (C1046.m56302() == 0) {
                        s = s2;
                        runnable3 = runnable3;
                        int iM559713 = (C0946.m55979("ۘ۠") + i14) * (-17);
                        i16 = ((iM559713 ^ i15) * (-27865)) ^ (-1025387656);
                        i17 = iM559713 ^ (-20332618);
                        str2 = str;
                        s2 = s;
                        runnable3 = runnable3;
                        c10403 = this;
                    } else {
                        runnable3 = runnable3;
                        iM559711 = C0946.m55979("᩻ܶ") ^ i14;
                        i16 = 764412354 ^ ((iM559711 ^ i15) * (-2629));
                        i6 = -987864087;
                        i17 = iM559711 ^ i6;
                        c10403 = this;
                        str2 = str;
                        runnable3 = runnable3;
                    }
                    break;
                case -2033630485:
                case -547463453:
                    runnable3 = runnable3;
                    if (C1003.f81929 <= 0) {
                        iM559711 = (i15 - C0946.m55979("ۜ֨")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i16 = (-727031424) ^ ((iM559711 ^ i14) * (-31275));
                        i6 = 1316852678;
                    } else {
                        iM559711 = (C0946.m55979("ۗۜ") + i15) * (-89);
                        i16 = 1633928107 ^ ((iM559711 ^ i14) * 8523);
                        i6 = -1329668882;
                    }
                    i17 = iM559711 ^ i6;
                    c10403 = this;
                    str2 = str;
                    runnable3 = runnable3;
                    break;
                case -2025760556:
                case -345246497:
                    C1003.m56121(sb, str3);
                    sArr2 = f82087;
                    i18 = 335;
                    if (C1024.f81946) {
                        iM55680 = (C0873.m55680("᩷ܰ") + i15) * 43;
                        i7 = ((iM55680 ^ i14) * 31933) ^ (-1756874163);
                        i8 = -1095453378;
                    } else {
                        iM55680 = C0946.m55979("ۤ᩻") ^ i15;
                        i7 = ((iM55680 ^ i14) * 20831) ^ (-1052596121);
                        i8 = -1844610010;
                    }
                    i17 = iM55680 ^ i8;
                    i16 = i7;
                    break;
                case -1975651797:
                case 972056651:
                    if (!RunnableC0897.f81856) {
                        runnable3 = runnable3;
                        iM559711 = C0873.m55680("۬᩺") ^ i15;
                        i16 = (-1792793280) ^ ((iM559711 ^ i14) * 23537);
                        i6 = 1121872317;
                        i17 = iM559711 ^ i6;
                        c10403 = this;
                        str2 = str;
                        runnable3 = runnable3;
                    }
                    runnable3 = runnable3;
                    iM559711 = C0946.m55979("᩻ܶ") ^ i14;
                    i16 = 764412354 ^ ((iM559711 ^ i15) * (-2629));
                    i6 = -987864087;
                    i17 = iM559711 ^ i6;
                    c10403 = this;
                    str2 = str;
                    runnable3 = runnable3;
                    break;
                case -1966806396:
                case 543749829:
                    m24104();
                    runnable3 = runnable3;
                    iM55979 = (i15 - C0873.m55680("ۘܿ")) * 29;
                    i16 = ((iM55979 ^ i14) * 857) ^ 1354101384;
                    i3 = 1497882288;
                    i17 = iM55979 ^ i3;
                    str2 = str;
                    runnable3 = runnable3;
                    break;
                case -1876313840:
                case 470267615:
                    C1046.m56302();
                    if (C0882.m55710() == 0) {
                        runnable3 = runnable3;
                        iM559711 = C0946.m55979("᩻ܶ") ^ i14;
                        i16 = 764412354 ^ ((iM559711 ^ i15) * (-2629));
                        i6 = -987864087;
                        i17 = iM559711 ^ i6;
                        c10403 = this;
                        str2 = str;
                        runnable3 = runnable3;
                    } else {
                        i2 = i20;
                        runnable3 = runnable3;
                        iM559710 = C0946.m55979("ۚܰ") ^ i14;
                        i20 = i2;
                        i4 = ((iM559710 ^ i15) * 20971) ^ 1798147638;
                        i5 = -1575430835;
                        i17 = iM559710 ^ i5;
                        i16 = i4;
                        runnable3 = runnable3;
                        str2 = str;
                    }
                    break;
                case -1817842089:
                case 1294916146:
                    C1003.m56121(sb, C0866.m55652(sArr2, i18, 2, i19));
                    C0912.m55825(sb, str2);
                    if (C1012.f81938 < 0) {
                        iM55680 = (i14 - C0873.m55680("ۧ۬")) * (-21);
                        i7 = ((iM55680 ^ i15) * 27447) ^ (-1651487811);
                        i8 = -1497524615;
                        i17 = iM55680 ^ i8;
                        i16 = i7;
                    } else {
                        runnable3 = runnable3;
                        iM559711 = C0946.m55979("᩻ܶ") ^ i14;
                        i16 = 764412354 ^ ((iM559711 ^ i15) * (-2629));
                        i6 = -987864087;
                        i17 = iM559711 ^ i6;
                        c10403 = this;
                        str2 = str;
                        runnable3 = runnable3;
                    }
                    break;
                case -1557461811:
                case -1233602450:
                    if (c10403.f28774 != 0) {
                        runnable3 = runnable3;
                        iM55979 = (i15 - C0873.m55680("ۘܿ")) * 29;
                        i16 = ((iM55979 ^ i14) * 857) ^ 1354101384;
                        i3 = 1497882288;
                        i17 = iM55979 ^ i3;
                        str2 = str;
                        runnable3 = runnable3;
                    } else {
                        iM55680 = (C0873.m55680("ܺ᩷") + i15) * (-97);
                        i7 = ((iM55680 ^ i14) * (-2561)) ^ 242473881;
                        i8 = -1308314494;
                        i17 = iM55680 ^ i8;
                        i16 = i7;
                    }
                    break;
                case -1527692548:
                case -1472328414:
                    if (i10 < runnableArr.length) {
                        iM55680 = C0873.m55680("ۛۘ") ^ i14;
                        i7 = ((iM55680 ^ i15) * (-12385)) ^ 2044059366;
                        i8 = -579615605;
                    } else {
                        iM55680 = (C0873.m55680("ܰ᩹") ^ i14) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i7 = ((iM55680 ^ i15) * 10601) ^ (-214326349);
                        i8 = 1738646478;
                    }
                    i17 = iM55680 ^ i8;
                    i16 = i7;
                    break;
                case -1517245491:
                case -1053177086:
                    z = false;
                    i10 = 0;
                    iM55680 = C0873.m55680("֫ܽ") ^ i15;
                    i7 = ((iM55680 ^ i14) * (-10417)) ^ (-1881739701);
                    i8 = 1998450131;
                    i17 = iM55680 ^ i8;
                    i16 = i7;
                    break;
                case -1361230290:
                case 1273755039:
                    C0937.m55917(c10403.f28769, C0845.m55591(sb));
                    runnable3 = runnable3;
                    iM55979 = (C0873.m55680("۫ܳ") + i14) * (-83);
                    i16 = ((iM55979 ^ i15) * (-11093)) ^ 682087936;
                    i3 = 301843239;
                    i17 = iM55979 ^ i3;
                    str2 = str;
                    runnable3 = runnable3;
                    break;
                case -1324999400:
                case 1544311611:
                    C1036.m56257();
                    if (C0873.f81841 > 0) {
                        iM55680 = C0873.m55680("ۙ᩶") ^ i15;
                        i7 = ((iM55680 ^ i14) * (-29705)) ^ (-2140978173);
                        i8 = 1326055854;
                        i17 = iM55680 ^ i8;
                        i16 = i7;
                    } else {
                        runnable3 = runnable3;
                        iM559711 = C0946.m55979("᩻ܶ") ^ i14;
                        i16 = 764412354 ^ ((iM559711 ^ i15) * (-2629));
                        i6 = -987864087;
                        i17 = iM559711 ^ i6;
                        c10403 = this;
                        str2 = str;
                        runnable3 = runnable3;
                    }
                    break;
                case -1120501932:
                case -638470987:
                    sb = new StringBuilder();
                    applicationM55620 = C0861.m55620();
                    if (C1028.m56247() >= 0) {
                        iM55680 = (C0873.m55680("᩷ܰ") + i15) * 43;
                        i7 = ((iM55680 ^ i14) * 31933) ^ (-1756874163);
                        i8 = -1095453378;
                    } else {
                        iM55680 = (C0873.m55680("ܳۘ") + i14) * (-105);
                        i7 = ((iM55680 ^ i15) * (-16011)) ^ 1734465188;
                        i8 = 1319620404;
                    }
                    i17 = iM55680 ^ i8;
                    i16 = i7;
                    break;
                case -996948254:
                case 1745624080:
                    runnable3 = runnableArr[i];
                    runnable = null;
                    handler = c10403.f28775;
                    if (runnable3 != null) {
                        iM55681 = C0873.m55680("ᩳۖ") ^ i14;
                        i16 = ((iM55681 ^ i15) * (-17309)) ^ (-1743990981);
                        i9 = -1111363251;
                    } else {
                        iM55681 = C0873.m55680("᩵ᩴ") ^ i15;
                        i16 = ((iM55681 ^ i14) * (-19447)) ^ 1162674246;
                        i9 = -155695527;
                    }
                    i17 = iM55681 ^ i9;
                    str2 = str;
                    break;
                case -991262258:
                case 1068859625:
                    i19 = 6165;
                    iM559711 = (i14 - C0873.m55680("ۘᩴ")) * 81;
                    i16 = (-1523452247) ^ ((iM559711 ^ i15) * (-569));
                    i6 = -1783959279;
                    i17 = iM559711 ^ i6;
                    c10403 = this;
                    str2 = str;
                    runnable3 = runnable3;
                    break;
                case -976306166:
                case -211821983:
                    if (!C0967.m56074()) {
                        iM55680 = C0873.m55680("ۙ᩶") ^ i15;
                        i7 = ((iM55680 ^ i14) * (-29705)) ^ (-2140978173);
                        i8 = 1326055854;
                        i17 = iM55680 ^ i8;
                        i16 = i7;
                    } else {
                        runnable3 = runnable3;
                        iM559711 = (i15 - C0946.m55979("ۜ֨")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i16 = (-727031424) ^ ((iM559711 ^ i14) * (-31275));
                        i6 = 1316852678;
                        i17 = iM559711 ^ i6;
                        c10403 = this;
                        str2 = str;
                        runnable3 = runnable3;
                    }
                    break;
                case -918379547:
                case 697851589:
                    runnable3 = runnable3;
                    if (str2 == null) {
                        iM55979 = (C0873.m55680("۫ܳ") + i14) * (-83);
                        i16 = ((iM55979 ^ i15) * (-11093)) ^ 682087936;
                        i3 = 301843239;
                        i17 = iM55979 ^ i3;
                        str2 = str;
                        runnable3 = runnable3;
                    } else {
                        iM559710 = (C0946.m55979("ۗ᩹") + i15) * (-37);
                        i4 = ((iM559710 ^ i14) * (-12981)) ^ (-1378447218);
                        i5 = 1714662514;
                        i17 = iM559710 ^ i5;
                        i16 = i4;
                        runnable3 = runnable3;
                        str2 = str;
                    }
                    break;
                case -870109528:
                case 1468222546:
                    runnable3 = runnable3;
                    runnableArr = c10403.f28773;
                    if (RunnableC0938.f81886 < 0) {
                        iM55979 = (C0873.m55680("ۡۘ") ^ i15) * (-127);
                        i16 = ((iM55979 ^ i14) * (-18637)) ^ 1427018152;
                        i3 = 626170884;
                        i17 = iM55979 ^ i3;
                        str2 = str;
                        runnable3 = runnable3;
                    }
                    iM559711 = (i15 - C0946.m55979("ۜ֨")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i16 = (-727031424) ^ ((iM559711 ^ i14) * (-31275));
                    i6 = 1316852678;
                    i17 = iM559711 ^ i6;
                    c10403 = this;
                    str2 = str;
                    runnable3 = runnable3;
                    break;
                case -842419999:
                case 740365476:
                    handler.removeCallbacks(runnable3);
                    runnableArr[i] = runnable;
                    iM55681 = C0873.m55680("᩵ᩴ") ^ i15;
                    i16 = ((iM55681 ^ i14) * (-19447)) ^ 1162674246;
                    i9 = -155695527;
                    i17 = iM55681 ^ i9;
                    str2 = str;
                    break;
                case -713455604:
                case -625927579:
                    handler.removeCallbacks(runnable2);
                    runnableArr[i10] = runnable;
                    iM55680 = (i15 - C0946.m55979("᩶ۜ")) * (-109);
                    i7 = ((iM55680 ^ i14) * (-29393)) ^ (-1523599493);
                    i8 = -1442479175;
                    i17 = iM55680 ^ i8;
                    i16 = i7;
                    break;
                case -623568887:
                case 2128984033:
                    i19 = 37826;
                    iM559711 = (i14 - C0873.m55680("ۘᩴ")) * 81;
                    i16 = (-1523452247) ^ ((iM559711 ^ i15) * (-569));
                    i6 = -1783959279;
                    i17 = iM559711 ^ i6;
                    c10403 = this;
                    str2 = str;
                    runnable3 = runnable3;
                    break;
                case -590077002:
                case 1240257403:
                    runnable3 = runnable3;
                    sArr = f82087;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM559711 = C0873.m55680("۬᩺") ^ i15;
                        i16 = (-1792793280) ^ ((iM559711 ^ i14) * 23537);
                        i6 = 1121872317;
                    } else {
                        iM559711 = C0873.m55680("᩺ܽ") ^ i14;
                        i16 = (-939194306) ^ ((iM559711 ^ i15) * (-8481));
                        i6 = -436376695;
                    }
                    i17 = iM559711 ^ i6;
                    c10403 = this;
                    str2 = str;
                    runnable3 = runnable3;
                    break;
                case -281535539:
                case 1438165451:
                    runnable3 = runnable3;
                    s = s2;
                    int i22 = s * 27126;
                    i12 = s * s;
                    if (C1071.f81975 > 0) {
                        int iM55682 = (C0873.m55680("᩺ۗ") + i14) * (-3);
                        s2 = s;
                        i17 = iM55682 ^ 563890674;
                        i16 = ((iM55682 ^ i15) * (-17437)) ^ (-1544733963);
                        i11 = i22;
                        runnable3 = runnable3;
                        c10403 = this;
                        str2 = str;
                    } else {
                        i11 = i22;
                        int iM559714 = (C0946.m55979("ۘ۠") + i14) * (-17);
                        i16 = ((iM559714 ^ i15) * (-27865)) ^ (-1025387656);
                        i17 = iM559714 ^ (-20332618);
                        str2 = str;
                        s2 = s;
                        runnable3 = runnable3;
                        c10403 = this;
                    }
                    break;
                case -223839390:
                case 1140270860:
                    C7050.m16207(c10403.f28772);
                    c10403.f28771 = z;
                    iM55680 = C0873.m55680("᩹۟") ^ i15;
                    i7 = ((iM55680 ^ i14) * 13105) ^ (-1163785154);
                    i8 = 1441040129;
                    i17 = iM55680 ^ i8;
                    i16 = i7;
                    break;
                case 48386685:
                case 497288958:
                    if (c10403.f28771) {
                        iM55680 = (C0873.m55680("ۖۖ") + i14) * C0254q.f1218h;
                        i7 = ((iM55680 ^ i15) * (-28905)) ^ 1170540473;
                        i8 = 2136596558;
                    } else {
                        iM55680 = C0873.m55680("᩹۟") ^ i15;
                        i7 = ((iM55680 ^ i14) * 13105) ^ (-1163785154);
                        i8 = 1441040129;
                    }
                    i17 = iM55680 ^ i8;
                    i16 = i7;
                    break;
                case 145156897:
                case 349972523:
                    i2 = i20;
                    runnable3 = runnable3;
                    c10403.f28774 = i21 & (~i2);
                    if (C1017.m56187() > 0) {
                        i20 = i2;
                        iM55979 = (C0946.m55979("ᩴ᩶") ^ i14) * 21;
                        i16 = ((iM55979 ^ i15) * 15115) ^ (-491143357);
                        i3 = -1595359590;
                        i17 = iM55979 ^ i3;
                        str2 = str;
                        runnable3 = runnable3;
                    } else {
                        iM559710 = C0946.m55979("ۚܰ") ^ i14;
                        i20 = i2;
                        i4 = ((iM559710 ^ i15) * 20971) ^ 1798147638;
                        i5 = -1575430835;
                        i17 = iM559710 ^ i5;
                        i16 = i4;
                        runnable3 = runnable3;
                        str2 = str;
                    }
                    break;
                case 170198406:
                case 1431374942:
                    i10++;
                    iM55680 = C0873.m55680("֫ܽ") ^ i15;
                    i7 = ((iM55680 ^ i14) * (-10417)) ^ (-1881739701);
                    i8 = 1998450131;
                    i17 = iM55680 ^ i8;
                    i16 = i7;
                    break;
                case 578009864:
                case 1948092576:
                    runnable3 = runnable3;
                    s2 = sArr[334];
                    if (C1071.f81975 <= 0) {
                        iM559711 = C0946.m55979("᩻ܶ") ^ i14;
                        i16 = 764412354 ^ ((iM559711 ^ i15) * (-2629));
                        i6 = -987864087;
                    } else {
                        iM559711 = (i15 - C0873.m55680("۬ۨ")) * 19;
                        i16 = (-1450572037) ^ ((iM559711 ^ i14) * (-21101));
                        i6 = -633971762;
                    }
                    i17 = iM559711 ^ i6;
                    c10403 = this;
                    str2 = str;
                    runnable3 = runnable3;
                    break;
                case 613796692:
                case 1809245785:
                    runnable3 = runnable3;
                    if ((i12 + 183954969) - i11 >= 0) {
                        iM559711 = C0946.m55979("֡ۜ") ^ i15;
                        i16 = 1525881866 ^ ((iM559711 ^ i14) * 6521);
                        i6 = -1580837703;
                    } else {
                        iM559711 = (i14 - C0873.m55680("ܰۨ")) * 23;
                        i16 = 1923815502 ^ ((iM559711 ^ i15) * (-611));
                        i6 = -544284432;
                    }
                    i17 = iM559711 ^ i6;
                    c10403 = this;
                    str2 = str;
                    runnable3 = runnable3;
                    break;
                case 753802262:
                case 1284555004:
                    runnable2 = runnableArr[i10];
                    if (runnable2 != null) {
                        iM55680 = (C0873.m55680("ܳܰ") + i15) * 109;
                        i7 = ((iM55680 ^ i14) * (-13407)) ^ 1602775651;
                        i8 = -656626043;
                    } else {
                        iM55680 = (i15 - C0946.m55979("᩶ۜ")) * (-109);
                        i7 = ((iM55680 ^ i14) * (-29393)) ^ (-1523599493);
                        i8 = -1442479175;
                    }
                    i17 = iM55680 ^ i8;
                    i16 = i7;
                    break;
                case 872141297:
                case 2087467922:
                    C1964.m56597();
                    C1964.m56597();
                    break;
                case 959572665:
                case 1721828992:
                    if (C0854.m55595() < 0) {
                        iM55680 = C0873.m55680("ۙ᩶") ^ i15;
                        i7 = ((iM55680 ^ i14) * (-29705)) ^ (-2140978173);
                        i8 = 1326055854;
                    } else {
                        iM55680 = (C0873.m55680("֡۬") ^ i14) * (-11);
                        i7 = ((iM55680 ^ i15) * (-19537)) ^ 1690650506;
                        i8 = 822582558;
                    }
                    i17 = iM55680 ^ i8;
                    i16 = i7;
                    break;
                case 1425965272:
                case 1497543836:
                    C0912.m55833();
                    C0917.m55854();
                    i2 = i20;
                    runnable3 = runnable3;
                    iM559710 = C0946.m55979("ۚܰ") ^ i14;
                    i20 = i2;
                    i4 = ((iM559710 ^ i15) * 20971) ^ 1798147638;
                    i5 = -1575430835;
                    i17 = iM559710 ^ i5;
                    i16 = i4;
                    runnable3 = runnable3;
                    str2 = str;
                    break;
                case 1732897323:
                case 1737281677:
                    str3 = m24100((Context) applicationM55620)[i];
                    if (C1929.f83011 == 0) {
                        iM55680 = (C0873.m55680("ۙܺ") + i14) * 35;
                        i7 = ((iM55680 ^ i15) * 30253) ^ 212400177;
                        i8 = 422474174;
                        i17 = iM55680 ^ i8;
                        i16 = i7;
                    } else {
                        i2 = i20;
                        runnable3 = runnable3;
                        iM559710 = C0946.m55979("ۚܰ") ^ i14;
                        i20 = i2;
                        i4 = ((iM559710 ^ i15) * 20971) ^ 1798147638;
                        i5 = -1575430835;
                        i17 = iM559710 ^ i5;
                        i16 = i4;
                        runnable3 = runnable3;
                        str2 = str;
                    }
                    break;
                default:
                    runnable3 = runnable3;
                    int i23 = c10403.f28774;
                    i20 = 1 << i;
                    if ((i23 & i20) != 0) {
                        int iM559715 = C0946.m55979("᩹֡") ^ i15;
                        i17 = iM559715 ^ (-872659872);
                        i16 = ((iM559715 ^ i14) * (-12035)) ^ 968676823;
                        i21 = i23;
                        runnable3 = runnable3;
                        c10403 = this;
                        str2 = str;
                    } else {
                        i21 = i23;
                        iM55979 = (i15 - C0873.m55680("ۘܿ")) * 29;
                        i16 = ((iM55979 ^ i14) * 857) ^ 1354101384;
                        i3 = 1497882288;
                        i17 = iM55979 ^ i3;
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
    /* JADX INFO: renamed from: ᩻ */
    private void m24104() {
        int iM55680;
        int i;
        int i2;
        int i3 = C1012.f81938;
        int i4 = C1071.f81975;
        int iM55979 = C0946.m55979("ۙܿ") ^ i4;
        int i5 = ((iM55979 ^ i3) * (-3165)) ^ (-1570679540);
        String strJoin = null;
        String strM55947 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55979 ^ (-634870886);
        int iM559710 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        char c = 0;
        short s = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 778381231;
        int i13 = 0;
        String strM55893 = null;
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
                    strM55893 = C0930.m55893(sArr, i8, i9, i7);
                    if (C1194.f82045 != 0) {
                        iM55680 = C0946.m55979("ۖ᩻") ^ i4;
                        i = ((iM55680 ^ i3) * 3643) ^ 1785410237;
                        i2 = 1448576962;
                    } else {
                        iM55680 = C0873.m55680("֫۠") ^ i4;
                        i = ((iM55680 ^ i3) * 17497) ^ (-2063639971);
                        i2 = -28053110;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1862211036:
                case -1150594317:
                    s = sArr3[c];
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0873.m55680("ۗܶ") ^ i4;
                        i = ((iM55680 ^ i3) * (-17309)) ^ (-1116847298);
                        i2 = 842366298;
                    } else {
                        iM55680 = (C0873.m55680("᩸ܳ") + i4) * 123;
                        i = ((iM55680 ^ i3) * 30319) ^ (-1945128664);
                        i2 = 1020193211;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1615830732:
                case 1707015745:
                    iM559710 = C0946.m55979(strM55947);
                    i15 = 2119700645;
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0873.m55680("ۗܶ") ^ i4;
                        i = ((iM55680 ^ i3) * (-17309)) ^ (-1116847298);
                        i2 = 842366298;
                    } else {
                        iM55680 = (C0873.m55680("ۨ᩺") + i3) * (-9);
                        i = ((iM55680 ^ i4) * (-10431)) ^ 1698860747;
                        i2 = -111932262;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1591783262:
                case -920696651:
                    i10 = s + 1;
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0873.m55680("ۗܶ") ^ i4;
                        i = ((iM55680 ^ i3) * (-17309)) ^ (-1116847298);
                        i2 = 842366298;
                    } else {
                        iM55680 = C0873.m55680("ۤ᩻") ^ i4;
                        i = ((iM55680 ^ i3) * (-29227)) ^ 55237218;
                        i2 = 2132995710;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1546637410:
                case -1295193593:
                    objArr = new Object[i14];
                    objArr[0] = strJoin;
                    sArr2 = f82087;
                    if (C0937.m55918() >= 0) {
                        iM55680 = (C0946.m55979("ۧܰ") + i4) * 99;
                        i = ((iM55680 ^ i3) * 26073) ^ 396674313;
                        i2 = 691943969;
                    } else {
                        iM55680 = (i3 - C0873.m55680("۟ۨ")) * (-5);
                        i = ((iM55680 ^ i4) * (-20981)) ^ 368734250;
                        i2 = 1845615726;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1489702034:
                case 1730736549:
                    arrayList = this.f28769;
                    if (C1017.m56195(arrayList)) {
                        iM55680 = (C0873.m55680("ܽ᩻") + i3) * (-79);
                        i = ((iM55680 ^ i4) * (-24135)) ^ 681404771;
                        i2 = 1169051857;
                    } else {
                        iM55680 = (C0946.m55979("ۧ۟") ^ i3) * (-61);
                        i = ((iM55680 ^ i4) * (-6287)) ^ (-1985117357);
                        i2 = 1387968431;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1144456539:
                case 1894561639:
                    RunnableC0938.m55938();
                    iM55680 = C0873.m55680("ۗܶ") ^ i4;
                    i = ((iM55680 ^ i3) * (-17309)) ^ (-1116847298);
                    i2 = 842366298;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1118191287:
                case -475581285:
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0873.m55680("ۗܶ") ^ i4;
                        i = ((iM55680 ^ i3) * (-17309)) ^ (-1116847298);
                        i2 = 842366298;
                    } else {
                        iM55680 = C0946.m55979("ۖ᩻") ^ i4;
                        i = ((iM55680 ^ i3) * 3643) ^ 1785410237;
                        i2 = 1448576962;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1115563529:
                case -655844897:
                    strJoin = TextUtils.join(strM55893, arrayList);
                    i14 = 1;
                    if (C1194.f82045 != 0) {
                        iM55680 = (C0946.m55979("۬᩹") + i3) * 23;
                        i = ((iM55680 ^ i4) * 1807) ^ 1577491199;
                        i2 = -105899638;
                    } else {
                        iM55680 = C0946.m55979("۫ܽ") ^ i3;
                        i = ((iM55680 ^ i4) * 30751) ^ 45688703;
                        i2 = 381987076;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1029398083:
                case -461559150:
                    if (this.f28774 == 0) {
                        iM55680 = (C0946.m55979("᩹ۜ") ^ i3) * (-99);
                        i = ((iM55680 ^ i4) * (-1917)) ^ 1760518678;
                        i2 = -1864536966;
                    } else {
                        iM55680 = (C0873.m55680("ܽ᩻") + i3) * (-79);
                        i = ((iM55680 ^ i4) * (-24135)) ^ 681404771;
                        i2 = 1169051857;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -742223558:
                case 1733422600:
                    C0992.m56107();
                    if (C1048.f81963) {
                        iM55680 = C0873.m55680("ܶ᩶") ^ i3;
                        i = ((iM55680 ^ i4) * (-12369)) ^ (-788547033);
                        i2 = 1667754721;
                    } else {
                        iM55680 = C0946.m55979("ۖ᩻") ^ i4;
                        i = ((iM55680 ^ i3) * 3643) ^ 1785410237;
                        i2 = 1448576962;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -697087031:
                case 1542583926:
                    C1071.m56343();
                    if (C1964.m56597() != 0) {
                        iM55680 = C0873.m55680("ۗܶ") ^ i4;
                        i = ((iM55680 ^ i3) * (-17309)) ^ (-1116847298);
                        i2 = 842366298;
                    } else {
                        iM55680 = (C0946.m55979("۬᩹") + i3) * 23;
                        i = ((iM55680 ^ i4) * 1807) ^ 1577491199;
                        i2 = -105899638;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -553168433:
                case 1393071808:
                    i7 = 35637;
                    iM55680 = (C0946.m55979("ܰ۠") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i = ((iM55680 ^ i3) * (-10421)) ^ (-1567950357);
                    i2 = -1924469225;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -183245470:
                case 716208213:
                    if ((i13 + 1) - i11 > 0) {
                        iM55680 = C0873.m55680("ۤ᩶") ^ i4;
                        i = ((iM55680 ^ i3) * (-15577)) ^ (-139728875);
                        i2 = 1689281207;
                    } else {
                        iM55680 = C0946.m55979("ۡ᩹") ^ i3;
                        i = ((iM55680 ^ i4) * (-21709)) ^ (-1582671105);
                        i2 = -434363824;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -57432356:
                case 2117040602:
                    sArr3 = f82087;
                    c = 351;
                    if (C1025.m56230()) {
                        iM55680 = C0946.m55979("ۖ᩻") ^ i4;
                        i = ((iM55680 ^ i3) * 3643) ^ 1785410237;
                        i2 = 1448576962;
                    } else {
                        iM55680 = C0873.m55680("֫ܿ") ^ i3;
                        i = ((iM55680 ^ i4) * 24515) ^ (-1476334973);
                        i2 = 243253039;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 87999334:
                case 1108036709:
                    i7 = 35980;
                    iM55680 = (C0946.m55979("ܰ۠") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i = ((iM55680 ^ i3) * (-10421)) ^ (-1567950357);
                    i2 = -1924469225;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 344881317:
                case 775989950:
                    C1071.m56343();
                    RunnableC0938.m55938();
                    break;
                case 413097899:
                case 1957317302:
                    strM55947 = ViewOnClickListenerC0939.m55947(sArr2, 353, 3, i7);
                    if (C0947.f81895) {
                        iM55680 = C0873.m55680("ۗܶ") ^ i4;
                        i = ((iM55680 ^ i3) * (-17309)) ^ (-1116847298);
                        i2 = 842366298;
                    } else {
                        iM55680 = (i4 - C0946.m55979("᩵۫")) * 85;
                        i = ((iM55680 ^ i3) * (-29647)) ^ (-1414722993);
                        i2 = 1157510726;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 819693380:
                case 1870761703:
                    if (this.f28776) {
                        iM55680 = (C0873.m55680("ۙ۠") ^ i4) * (-69);
                        i = ((iM55680 ^ i3) * 17659) ^ 512666680;
                        i2 = 1810514479;
                    } else {
                        iM55680 = (C0873.m55680("ܽ᩻") + i3) * (-79);
                        i = ((iM55680 ^ i4) * (-24135)) ^ 681404771;
                        i2 = 1169051857;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 843082658:
                case 1539581175:
                    break;
                case 1152271377:
                case 1528060652:
                    C22682.m50800(C1003.m56122(iM559710 ^ i15, objArr));
                    C0894.m55767(arrayList);
                    iM55680 = (C0873.m55680("ܽ᩻") + i3) * (-79);
                    i = ((iM55680 ^ i4) * (-24135)) ^ 681404771;
                    i2 = 1169051857;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 1411955424:
                case 1503248553:
                    i11 = i10 * i10;
                    i13 = s * 2;
                    if (C0854.f81826 != 0) {
                        iM55680 = C0873.m55680("ۗܶ") ^ i4;
                        i = ((iM55680 ^ i3) * (-17309)) ^ (-1116847298);
                        i2 = 842366298;
                    } else {
                        iM55680 = C0873.m55680("֫᩺") ^ i3;
                        i = ((iM55680 ^ i4) * (-28691)) ^ (-2001364724);
                        i2 = 1074230373;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    sArr = f82087;
                    i8 = 352;
                    i9 = 1;
                    if (C0946.f81894 != 0) {
                        iM55680 = C0873.m55680("ܶ᩶") ^ i3;
                        i = ((iM55680 ^ i4) * (-12369)) ^ (-788547033);
                        i2 = 1667754721;
                    } else {
                        iM55680 = C0946.m55979("֫ۘ") ^ i4;
                        i = ((iM55680 ^ i3) * (-3513)) ^ 111192459;
                        i2 = -1362167669;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }
}
