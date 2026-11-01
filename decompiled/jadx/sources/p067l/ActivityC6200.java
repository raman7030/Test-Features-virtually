package p067l;

import android.graphics.Bitmap;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import org.bouncycastle.math.p080ec.custom.sec.SecP160R2Field;

/* JADX INFO: renamed from: l.ۘܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E9LN */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC6200 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ۬ۢ۟, reason: not valid java name and contains not printable characters */
    private static final short[] f81957 = {9162, -6377, 7389, -6477, -3235, -9988, -9925, -45, -5531, -717, -3201, 2833, -184, -11976, 2012, -10413, 614, -5973, 2558, -32497, -32494, -32497, -32489, -32482, 1790, -27860, -27152, -28161, 30200, -28301, 27050, 4807, 3000, 12747, 9261, 9587, -7916, -7885, -7884, -7873, -7926, -7877, -7890, -7879, -7886, -7926, -7896, -7873, -7892, -7885, -7873, -7891, -7873, -7896};

    /* JADX INFO: renamed from: ܳۧ */
    public static final /* synthetic */ int f15616 = 0;

    /* JADX INFO: renamed from: ܿۧ */
    public C12534 f15617;

    /* JADX INFO: renamed from: ᩳۧ */
    public AbstractC17043 f15618;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ad, code lost:
    
        if (p067l.C0882.m55710() == 0) goto L22;
     */
    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int i4;
        short[] sArr;
        int i5;
        int iM559711;
        int i6;
        int i7;
        int iM55680;
        int i8;
        int i9;
        int i10;
        int i11;
        int iM559712;
        int i12;
        IOException iOException;
        int iM559713;
        int i13;
        int i14;
        final ActivityC6200 activityC6200 = this;
        int i15 = ServiceConnectionC1013.f81940;
        int i16 = C0989.f81920;
        int iM559714 = (i16 - C0946.m55979("ۧܶ")) * 59;
        int i17 = ((iM559714 ^ i15) * (-32375)) ^ (-534838092);
        IOException iOException2 = null;
        String strM55936 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i18 = iM559714 ^ (-662567760);
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        short s = 0;
        short s2 = 0;
        int iM559715 = 0;
        int i25 = 0;
        int i26 = 966163536;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = null;
        CheckBox checkBox = null;
        SeekBar seekBar = null;
        SeekBar seekBar2 = null;
        while (true) {
            i26 = i18 ^ (i17 & (((i26 ^ i15) * 1055) >> 31));
            switch (i26) {
                case -2142885056:
                case 1661132655:
                    C1071.m56343();
                    if (C0917.f81868) {
                        iM55979 = C0946.m55979("ۚܺ") ^ i16;
                        i = ((iM55979 ^ i15) * 29727) ^ 315832701;
                        i2 = -1183482526;
                    } else {
                        iM55979 = C0946.m55979("ܰ᩸") ^ i16;
                        i = ((iM55979 ^ i15) * (-17329)) ^ (-40277881);
                        i2 = -2066916920;
                    }
                    i18 = iM55979 ^ i2;
                    i17 = i;
                    break;
                case -2128932537:
                case 16297551:
                    C1964.m56597();
                    if (C1964.f83032 > 0) {
                        iM55979 = C0946.m55979("ۚܺ") ^ i16;
                        i = ((iM55979 ^ i15) * 29727) ^ 315832701;
                        i2 = -1183482526;
                        i18 = iM55979 ^ i2;
                        i17 = i;
                    } else {
                        checkBox = checkBox;
                        onCheckedChangeListener = onCheckedChangeListener;
                        iOException2 = iOException2;
                        sArr3 = sArr3;
                        iM55680 = (C0873.m55680("᩻֡") ^ i16) * 51;
                        i8 = ((iM55680 ^ i15) * (-10109)) ^ (-341956133);
                        i9 = -624007148;
                        int i27 = iM55680 ^ i9;
                        sArr3 = sArr3;
                        checkBox = checkBox;
                        iOException2 = iOException2;
                        i18 = i27;
                        i17 = i8;
                        onCheckedChangeListener = onCheckedChangeListener;
                    }
                    break;
                case -2087464708:
                case 1096181883:
                    i22 = 17585;
                    iM559711 = (C0946.m55979("ܰۛ") + i15) * 61;
                    i6 = ((iM559711 ^ i16) * 30137) ^ 1196651356;
                    i7 = 612606924;
                    sArr3 = sArr3;
                    sArr2 = sArr2;
                    i25 = i25;
                    checkBox = checkBox;
                    onCheckedChangeListener = onCheckedChangeListener;
                    iOException2 = iOException2;
                    i18 = iM559711 ^ i7;
                    i17 = i6;
                    activityC6200 = this;
                    break;
                case -2037770452:
                case -1742525972:
                    checkBox = checkBox;
                    onCheckedChangeListener = onCheckedChangeListener;
                    iOException2 = iOException2;
                    sArr3 = sArr3;
                    seekBar2 = (SeekBar) C1053.m56321(activityC6200, C0873.m55680(C0947.m55993(sArr3, i24, 3, i22)) ^ 2125940473);
                    sArr4 = f81957;
                    i21 = 13;
                    i19 = 3;
                    if (!C1024.f81946) {
                        iM55680 = C0873.m55680("ᩴۢ") ^ i15;
                        i8 = ((iM55680 ^ i16) * (-5117)) ^ (-1531071726);
                        i9 = 1698737533;
                        int i28 = iM55680 ^ i9;
                        sArr3 = sArr3;
                        checkBox = checkBox;
                        iOException2 = iOException2;
                        i18 = i28;
                        i17 = i8;
                        onCheckedChangeListener = onCheckedChangeListener;
                    } else {
                        sArr2 = sArr2;
                        i25 = i25;
                        iM559711 = C0873.m55680("ۨ᩺") ^ i15;
                        i6 = ((iM559711 ^ i16) * (-22707)) ^ (-1033721867);
                        i7 = 405545161;
                        sArr3 = sArr3;
                        sArr2 = sArr2;
                        i25 = i25;
                        checkBox = checkBox;
                        onCheckedChangeListener = onCheckedChangeListener;
                        iOException2 = iOException2;
                        i18 = iM559711 ^ i7;
                        i17 = i6;
                        activityC6200 = this;
                    }
                    break;
                case -1984666909:
                case -1093379350:
                    checkBox = checkBox;
                    onCheckedChangeListener = onCheckedChangeListener;
                    iOException2 = iOException2;
                    seekBar = (SeekBar) C1053.m56321(activityC6200, C0946.m55979(ViewOnClickListenerC0939.m55947(sArr4, i21, i19, i22)) ^ 2117593873);
                    sArr5 = f81957;
                    i23 = 16;
                    i20 = 3;
                    if (RunnableC1014.f81941 > 0) {
                        iM559712 = (C0873.m55680("֨ܰ") + i16) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i10 = ((iM559712 ^ i15) * (-18255)) ^ (-836150230);
                        i12 = -817616021;
                        i11 = iM559712 ^ i12;
                        onCheckedChangeListener = onCheckedChangeListener;
                        iOException2 = iOException2;
                        CheckBox checkBox2 = checkBox;
                        i18 = i11;
                        i17 = i10;
                        checkBox = checkBox2;
                    } else {
                        sArr2 = sArr2;
                        i25 = i25;
                        sArr3 = sArr3;
                        iM559711 = C0873.m55680("ۨ᩺") ^ i15;
                        i6 = ((iM559711 ^ i16) * (-22707)) ^ (-1033721867);
                        i7 = 405545161;
                        sArr3 = sArr3;
                        sArr2 = sArr2;
                        i25 = i25;
                        checkBox = checkBox;
                        onCheckedChangeListener = onCheckedChangeListener;
                        iOException2 = iOException2;
                        i18 = iM559711 ^ i7;
                        i17 = i6;
                        activityC6200 = this;
                    }
                    break;
                case -1909730974:
                case 1559808568:
                    break;
                case -1677095478:
                case 1717780600:
                    C1024.m56214(checkBox, onCheckedChangeListener);
                    checkBox = checkBox;
                    onCheckedChangeListener = onCheckedChangeListener;
                    iOException2 = iOException2;
                    C1964.m56588(activityC6200.f13392, RunnableC1014.m56175(C1048.m56311(this), C1036.m56252(f81957, 19, 5, i22)));
                    iM559712 = C0946.m55979("۠֨") ^ i15;
                    i10 = ((iM559712 ^ i16) * (-24743)) ^ (-1554389344);
                    i12 = 982858858;
                    i11 = iM559712 ^ i12;
                    onCheckedChangeListener = onCheckedChangeListener;
                    iOException2 = iOException2;
                    CheckBox checkBox3 = checkBox;
                    i18 = i11;
                    i17 = i10;
                    checkBox = checkBox3;
                    break;
                case -1673487579:
                case -698215470:
                    try {
                        AbstractC17043 abstractC17043M42105 = C18524.m42105(C1048.m56311(this));
                        activityC6200.f15618 = abstractC17043M42105;
                        C11193 c11193 = new C11193(ViewOnClickListenerC0939.m55942(abstractC17043M42105));
                        Bitmap bitmapM25834 = c11193.m25834();
                        byte[] ninePatchChunk = bitmapM25834.getNinePatchChunk();
                        C14020 c14020M25836 = c11193.m25836();
                        C1017.m56190(c14020M25836);
                        activityC6200.f15617.m28861(new NinePatchDrawable(getResources(), bitmapM25834, ninePatchChunk, c14020M25836.f39536, null));
                        iM55979 = (i15 - C0946.m55979("ۢۡ")) * 85;
                        i = ((iM55979 ^ i16) * (-15149)) ^ (-1246322356);
                        i2 = -218916995;
                    } catch (IOException e) {
                        iOException2 = e;
                        iM55979 = (C0873.m55680("᩻۟") + i16) * 35;
                        i = ((iM55979 ^ i15) * 3723) ^ 1516605899;
                        i2 = -1719939883;
                    }
                    i18 = iM55979 ^ i2;
                    i17 = i;
                    break;
                case -1513287588:
                case 70338781:
                    CheckBox checkBox4 = checkBox;
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = onCheckedChangeListener;
                    IOException iOException3 = iOException2;
                    short[] sArr6 = sArr2;
                    int i29 = i25;
                    short[] sArr7 = sArr3;
                    short s3 = s;
                    int i30 = s3 + 11366;
                    if ((s * s2) - (i30 * i30) <= 0) {
                        iM559710 = (C0873.m55680("ᩴܰ") + i16) * (-67);
                        i = ((iM559710 ^ i15) * 25889) ^ 1741707524;
                        i3 = -1493728113;
                    } else {
                        iM559710 = C0946.m55979("ܽ᩻") ^ i16;
                        i = ((iM559710 ^ i15) * 5085) ^ (-290851406);
                        i3 = -1267447758;
                    }
                    i4 = iM559710 ^ i3;
                    s = s3;
                    sArr3 = sArr7;
                    sArr2 = sArr6;
                    i25 = i29;
                    checkBox = checkBox4;
                    onCheckedChangeListener = onCheckedChangeListener2;
                    iOException2 = iOException3;
                    activityC6200 = this;
                    i18 = i4;
                    i17 = i;
                    break;
                case -1504222648:
                case 1259871540:
                    checkBox = checkBox;
                    onCheckedChangeListener = onCheckedChangeListener;
                    iOException2 = iOException2;
                    sArr2 = sArr2;
                    i25 = i25;
                    sArr3 = sArr3;
                    s = f81957[0];
                    s2 = 45464;
                    if (C0854.f81826 != 0) {
                        iM559711 = C0946.m55979("᩻ۖ") ^ i15;
                        i6 = ((iM559711 ^ i16) * 8559) ^ (-308609545);
                        i7 = -698476029;
                    } else {
                        iM559711 = (C0946.m55979("ۤۚ") ^ i15) * 37;
                        i6 = ((iM559711 ^ i16) * 19649) ^ 659620488;
                        i7 = 998876419;
                    }
                    sArr3 = sArr3;
                    sArr2 = sArr2;
                    i25 = i25;
                    checkBox = checkBox;
                    onCheckedChangeListener = onCheckedChangeListener;
                    iOException2 = iOException2;
                    i18 = iM559711 ^ i7;
                    i17 = i6;
                    activityC6200 = this;
                    break;
                case -1303925074:
                case -1253782614:
                    checkBox = checkBox;
                    onCheckedChangeListener = onCheckedChangeListener;
                    iOException2 = iOException2;
                    short[] sArr8 = sArr3;
                    sArr = sArr2;
                    i5 = i25;
                    C1326 c1326 = (C1326) C1053.m56321(activityC6200, C0873.m55680(C1229.m56403(sArr, i5, 3, i22)) ^ 2126362117);
                    activityC6200.f13392 = c1326;
                    C0955.m56037(activityC6200, c1326);
                    if (C0967.f81910 < 0) {
                        int iM559716 = C0946.m55979("ۤܿ") ^ i15;
                        i = ((iM559716 ^ i16) * 21791) ^ 380604984;
                        i4 = iM559716 ^ (-510546027);
                        sArr3 = sArr8;
                        sArr2 = sArr;
                        i25 = i5;
                        checkBox = checkBox;
                        onCheckedChangeListener = onCheckedChangeListener;
                        iOException2 = iOException2;
                        i18 = i4;
                        i17 = i;
                    } else {
                        sArr3 = sArr8;
                        int iM559717 = C0946.m55979("֫ܺ") ^ i16;
                        i10 = ((iM559717 ^ i15) * 28687) ^ (-1485780905);
                        i11 = iM559717 ^ (-672271056);
                        sArr2 = sArr;
                        i25 = i5;
                        onCheckedChangeListener = onCheckedChangeListener;
                        iOException2 = iOException2;
                        CheckBox checkBox5 = checkBox;
                        i18 = i11;
                        i17 = i10;
                        checkBox = checkBox5;
                    }
                    break;
                case -1220275493:
                case 1912589640:
                    i22 = 33147;
                    iM559711 = (C0946.m55979("ܰۛ") + i15) * 61;
                    i6 = ((iM559711 ^ i16) * 30137) ^ 1196651356;
                    i7 = 612606924;
                    sArr3 = sArr3;
                    sArr2 = sArr2;
                    i25 = i25;
                    checkBox = checkBox;
                    onCheckedChangeListener = onCheckedChangeListener;
                    iOException2 = iOException2;
                    i18 = iM559711 ^ i7;
                    i17 = i6;
                    activityC6200 = this;
                    break;
                case -972720064:
                case 2085832833:
                    iOException = iOException2;
                    checkBox = (CheckBox) C0890.m55736(activityC6200, C0873.m55680(C0845.m55592(sArr5, i23, i20, i22)) ^ 2129889355);
                    activityC6200.f15617.m28862(seekBar2, seekBar);
                    onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ۖܶ᩷
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                            int i31 = 329422738;
                            int i32 = AbstractC0942.f81890;
                            int i33 = C1044.f81959;
                            int iM55681 = (i32 - C0873.m55680("۟ۛ")) * (-83);
                            int i34 = ((iM55681 ^ i33) * (-10339)) ^ (-185246293);
                            int i35 = -1716937213;
                            while (true) {
                                i31 = ((((i31 ^ i33) * 1949) >> 31) & i34) ^ (iM55681 ^ i35);
                                switch (i31) {
                                    case -2129758238:
                                    case 885561603:
                                        if (C0930.f81879 <= 0) {
                                            iM55681 = (C0946.m55979("ܿۛ") ^ i33) * (-5);
                                            i34 = ((iM55681 ^ i32) * (-28223)) ^ 650288040;
                                            i35 = 1668467108;
                                        } else {
                                            iM55681 = (i32 - C0946.m55979("֨ۖ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i34 = ((iM55681 ^ i33) * 2947) ^ (-1590869563);
                                            i35 = -1443864522;
                                        }
                                        break;
                                    case -2027935800:
                                    case 58234552:
                                        if (C1017.f81942 >= 0) {
                                            iM55681 = (C0873.m55680("᩺ܺ") ^ i33) * 109;
                                            i34 = ((iM55681 ^ i32) * 20683) ^ (-1124958736);
                                            i35 = 1861907828;
                                        } else {
                                            iM55681 = (C0873.m55680("ۨ᩺") + i33) * 45;
                                            i34 = ((iM55681 ^ i32) * (-19835)) ^ 1706154776;
                                            i35 = -1586013300;
                                        }
                                        break;
                                    case -1943790815:
                                    case 1242006476:
                                        C1036.m56257();
                                        if (C0894.m55769() < 0) {
                                            iM55681 = (C0946.m55979("ܿۛ") ^ i33) * (-5);
                                            i34 = ((iM55681 ^ i32) * (-28223)) ^ 650288040;
                                            i35 = 1668467108;
                                        } else {
                                            iM55681 = (C0873.m55680("ۨ֫") ^ i32) * (-59);
                                            i34 = ((iM55681 ^ i33) * (-20653)) ^ 2027245647;
                                            i35 = -1801839967;
                                        }
                                        break;
                                    case -1843097631:
                                    case 1602501350:
                                        C0949.m56012();
                                        RunnableC0871.m55672();
                                        break;
                                    case -1627246917:
                                    case -583188234:
                                        C1012.m56134();
                                        if (!C0927.f81875) {
                                            iM55681 = (C0873.m55680("ۨ֫") ^ i32) * (-59);
                                            i34 = ((iM55681 ^ i33) * (-20653)) ^ 2027245647;
                                            i35 = -1801839967;
                                        } else {
                                            iM55681 = (C0873.m55680("᩺ܺ") ^ i33) * 109;
                                            i34 = ((iM55681 ^ i32) * 20683) ^ (-1124958736);
                                            i35 = 1861907828;
                                        }
                                        break;
                                    case -1485345449:
                                    case -1480591238:
                                        if (C0937.m55918() >= 0) {
                                            iM55681 = (C0946.m55979("ۜۜ") + i32) * 75;
                                            i34 = ((iM55681 ^ i33) * (-7661)) ^ (-1428635530);
                                            i35 = -1190848233;
                                        } else {
                                            iM55681 = (i33 - C0946.m55979("ۨۘ")) * (-73);
                                            i34 = ((iM55681 ^ i32) * (-21531)) ^ (-1934880321);
                                            i35 = 903733259;
                                        }
                                        break;
                                    case -1423297076:
                                    case 54167466:
                                        if (C0906.f81862 >= 0) {
                                            iM55681 = (C0946.m55979("ܿۛ") ^ i33) * (-5);
                                            i34 = ((iM55681 ^ i32) * (-28223)) ^ 650288040;
                                            i35 = 1668467108;
                                        } else {
                                            iM55681 = (C0946.m55979("ᩴۙ") + i32) * 69;
                                            i34 = ((iM55681 ^ i33) * 10581) ^ 411170109;
                                            i35 = -73342113;
                                        }
                                        break;
                                    case -1341004837:
                                    case -75189493:
                                        if (C0937.f81884) {
                                            iM55681 = (C0946.m55979("ۤۤ") ^ i32) * 85;
                                            i34 = ((iM55681 ^ i33) * 19539) ^ (-212978620);
                                            i35 = -230353156;
                                        } else {
                                            iM55681 = (C0946.m55979("ܿۛ") ^ i33) * (-5);
                                            i34 = ((iM55681 ^ i32) * (-28223)) ^ 650288040;
                                            i35 = 1668467108;
                                        }
                                        break;
                                    case -1294335892:
                                    case 349774992:
                                        if (C1964.f83032 <= 0) {
                                            iM55681 = (C0873.m55680("ۨ֫") ^ i32) * (-59);
                                            i34 = ((iM55681 ^ i33) * (-20653)) ^ 2027245647;
                                            i35 = -1801839967;
                                        } else {
                                            iM55681 = (C0946.m55979("᩷۬") + i33) * 93;
                                            i34 = ((iM55681 ^ i32) * (-32051)) ^ 943841346;
                                            i35 = 978578050;
                                        }
                                        break;
                                    case -1138612401:
                                    case 893839208:
                                        C0877.m55696();
                                        iM55681 = (C0873.m55680("ۨ֫") ^ i32) * (-59);
                                        i34 = ((iM55681 ^ i33) * (-20653)) ^ 2027245647;
                                        i35 = -1801839967;
                                        break;
                                    case -1024781258:
                                    case -871543744:
                                        this.f11047.f15617.m28863(z);
                                        break;
                                    case 441204747:
                                    case 731580883:
                                        if (C0906.m55809() <= 0) {
                                            iM55681 = (C0873.m55680("ۨ֫") ^ i32) * (-59);
                                            i34 = ((iM55681 ^ i33) * (-20653)) ^ 2027245647;
                                            i35 = -1801839967;
                                        } else {
                                            iM55681 = C0946.m55979("ܰܽ") ^ i32;
                                            i34 = ((iM55681 ^ i33) * (-23281)) ^ (-1671667722);
                                            i35 = -462394910;
                                        }
                                        break;
                                    case 1031169153:
                                    case 1605884187:
                                        if (C1071.f81975 <= 0) {
                                            iM55681 = (C0946.m55979("ۜۜ") + i32) * 75;
                                            i34 = ((iM55681 ^ i33) * (-7661)) ^ (-1428635530);
                                            i35 = -1190848233;
                                        } else {
                                            iM55681 = C0873.m55680("᩵᩺") ^ i33;
                                            i34 = ((iM55681 ^ i32) * (-12255)) ^ 955975880;
                                            i35 = 1253264203;
                                        }
                                        break;
                                    case 1229522677:
                                    case 1668411788:
                                        C1929.m56553();
                                        if (C1229.f82066 < 0) {
                                            iM55681 = (C0946.m55979("ܿۛ") ^ i33) * (-5);
                                            i34 = ((iM55681 ^ i32) * (-28223)) ^ 650288040;
                                            i35 = 1668467108;
                                        } else {
                                            iM55681 = C0873.m55680("ܺ᩺") ^ i32;
                                            i34 = ((iM55681 ^ i33) * 32727) ^ 1005043712;
                                            i35 = 481162959;
                                        }
                                        break;
                                    case 1701163172:
                                    case 2136170200:
                                        if (C1003.m56123() != 0) {
                                            iM55681 = (C0946.m55979("ۜۜ") + i32) * 75;
                                            i34 = ((iM55681 ^ i33) * (-7661)) ^ (-1428635530);
                                            i35 = -1190848233;
                                        } else {
                                            iM55681 = (C0946.m55979("ܶ֫") + i32) * 109;
                                            i34 = ((iM55681 ^ i33) * 23329) ^ 1773544176;
                                            i35 = 1612748176;
                                        }
                                        break;
                                    default:
                                        if (C0906.f81862 >= 0) {
                                            iM55681 = (C0946.m55979("ۜۜ") + i32) * 75;
                                            i34 = ((iM55681 ^ i33) * (-7661)) ^ (-1428635530);
                                            i35 = -1190848233;
                                        } else {
                                            iM55681 = (C0946.m55979("ۘ۟") + i33) * (-49);
                                            i34 = ((iM55681 ^ i32) * 12687) ^ (-1357491416);
                                            i35 = -446877957;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM559713 = (C0946.m55979("ᩴܽ") ^ i15) * 19;
                        i13 = ((iM559713 ^ i16) * 20867) ^ 1987600838;
                        i14 = 1559836449;
                    } else {
                        iM559713 = (C0946.m55979("ᩴܺ") ^ i16) * (-91);
                        i13 = ((iM559713 ^ i15) * (-18161)) ^ 528008249;
                        i14 = 1090336639;
                    }
                    i18 = iM559713 ^ i14;
                    i17 = i13;
                    iOException2 = iOException;
                    break;
                case -892176102:
                case 156997848:
                    C1012.m56134();
                    if (C1044.f81959 >= 0) {
                        checkBox = checkBox;
                        onCheckedChangeListener = onCheckedChangeListener;
                        iOException2 = iOException2;
                        sArr3 = sArr3;
                        iM55680 = C0946.m55979("ܿ᩹") ^ i16;
                        i8 = ((iM55680 ^ i15) * (-26553)) ^ 393093812;
                        i9 = -1476559712;
                        int i210 = iM55680 ^ i9;
                        sArr3 = sArr3;
                        checkBox = checkBox;
                        iOException2 = iOException2;
                        i18 = i210;
                        i17 = i8;
                        onCheckedChangeListener = onCheckedChangeListener;
                    }
                    checkBox = checkBox;
                    onCheckedChangeListener = onCheckedChangeListener;
                    iOException2 = iOException2;
                    sArr3 = sArr3;
                    iM55680 = (i15 - C0873.m55680("۠ܿ")) * 79;
                    i8 = ((iM55680 ^ i16) * 24637) ^ 1572176423;
                    i9 = -1610180737;
                    int i211 = iM55680 ^ i9;
                    sArr3 = sArr3;
                    checkBox = checkBox;
                    iOException2 = iOException2;
                    i18 = i211;
                    i17 = i8;
                    onCheckedChangeListener = onCheckedChangeListener;
                    break;
                case -860683036:
                case 491700900:
                    activityC6200.m12260((Throwable) iOException2, true);
                    break;
                case -724365334:
                case -451546568:
                    checkBox = checkBox;
                    onCheckedChangeListener = onCheckedChangeListener;
                    iOException2 = iOException2;
                    sArr3 = sArr3;
                    C1053.m56321(activityC6200, iM559715 ^ 2124348021);
                    sArr2 = f81957;
                    i25 = 4;
                    if (C0854.f81826 != 0) {
                        iM55680 = (i15 - C0873.m55680("۠ܿ")) * 79;
                        i8 = ((iM55680 ^ i16) * 24637) ^ 1572176423;
                        i9 = -1610180737;
                    } else {
                        iM55680 = C0873.m55680("ۗۤ") ^ i16;
                        i8 = ((iM55680 ^ i15) * (-2051)) ^ 97957350;
                        i9 = 1080478672;
                    }
                    int i212 = iM55680 ^ i9;
                    sArr3 = sArr3;
                    checkBox = checkBox;
                    iOException2 = iOException2;
                    i18 = i212;
                    i17 = i8;
                    onCheckedChangeListener = onCheckedChangeListener;
                    break;
                case -515168313:
                case 1406113443:
                    checkBox = checkBox;
                    onCheckedChangeListener = onCheckedChangeListener;
                    iOException2 = iOException2;
                    sArr2 = sArr2;
                    i25 = i25;
                    sArr3 = sArr3;
                    super.onCreate(bundle);
                    iM559715 = C0946.m55979(C0845.m55592(f81957, 1, 3, i22));
                    if (C1044.f81959 >= 0) {
                        iM559711 = C0873.m55680("ۨ᩺") ^ i15;
                        i6 = ((iM559711 ^ i16) * (-22707)) ^ (-1033721867);
                        i7 = 405545161;
                    } else {
                        iM559711 = C0873.m55680("ܶ᩵") ^ i15;
                        i6 = ((iM559711 ^ i16) * 24839) ^ (-1959719046);
                        i7 = 941884261;
                    }
                    sArr3 = sArr3;
                    sArr2 = sArr2;
                    i25 = i25;
                    checkBox = checkBox;
                    onCheckedChangeListener = onCheckedChangeListener;
                    iOException2 = iOException2;
                    i18 = iM559711 ^ i7;
                    i17 = i6;
                    activityC6200 = this;
                    break;
                case -427888363:
                case 259115895:
                    C1053.m56327();
                    checkBox = checkBox;
                    onCheckedChangeListener = onCheckedChangeListener;
                    iOException2 = iOException2;
                    sArr2 = sArr2;
                    i25 = i25;
                    sArr3 = sArr3;
                    iM559711 = C0946.m55979("᩻ۖ") ^ i15;
                    i6 = ((iM559711 ^ i16) * 8559) ^ (-308609545);
                    i7 = -698476029;
                    sArr3 = sArr3;
                    sArr2 = sArr2;
                    i25 = i25;
                    checkBox = checkBox;
                    onCheckedChangeListener = onCheckedChangeListener;
                    iOException2 = iOException2;
                    i18 = iM559711 ^ i7;
                    i17 = i6;
                    activityC6200 = this;
                    break;
                case -186964693:
                case 1545407471:
                    C1053.m56327();
                    break;
                case 4335297:
                case 1031111465:
                    checkBox = checkBox;
                    onCheckedChangeListener = onCheckedChangeListener;
                    iOException2 = iOException2;
                    activityC6200.f15617 = (C12534) C0890.m55736(activityC6200, C0873.m55680(strM55936) ^ 2128800374);
                    sArr3 = f81957;
                    i24 = 10;
                    if (C0967.f81910 < 0) {
                        iM559712 = C0946.m55979("֡ۚ") ^ i15;
                        i10 = ((iM559712 ^ i16) * 14493) ^ (-1888466874);
                        i12 = 1960077765;
                        i11 = iM559712 ^ i12;
                        onCheckedChangeListener = onCheckedChangeListener;
                        iOException2 = iOException2;
                        CheckBox checkBox6 = checkBox;
                        i18 = i11;
                        i17 = i10;
                        checkBox = checkBox6;
                    } else {
                        sArr = sArr2;
                        i5 = i25;
                        int iM559718 = C0946.m55979("֫ܺ") ^ i16;
                        i10 = ((iM559718 ^ i15) * 28687) ^ (-1485780905);
                        i11 = iM559718 ^ (-672271056);
                        sArr2 = sArr;
                        i25 = i5;
                        onCheckedChangeListener = onCheckedChangeListener;
                        iOException2 = iOException2;
                        CheckBox checkBox7 = checkBox;
                        i18 = i11;
                        i17 = i10;
                        checkBox = checkBox7;
                    }
                    break;
                case 224822846:
                case 828535874:
                    checkBox = checkBox;
                    onCheckedChangeListener = onCheckedChangeListener;
                    iOException2 = iOException2;
                    sArr3 = sArr3;
                    C0866.m55649(this);
                    RunnableC1014.m56172(activityC6200.f13392, new ViewOnClickListenerC5808(activityC6200, 2));
                    if (C1012.f81938 >= 0) {
                        iM55680 = (C0873.m55680("᩻֡") ^ i16) * 51;
                        i8 = ((iM55680 ^ i15) * (-10109)) ^ (-341956133);
                        i9 = -624007148;
                    } else {
                        iM55680 = C0873.m55680("ܿۚ") ^ i16;
                        i8 = ((iM55680 ^ i15) * 20367) ^ 849428456;
                        i9 = -1310301013;
                    }
                    int i213 = iM55680 ^ i9;
                    sArr3 = sArr3;
                    checkBox = checkBox;
                    iOException2 = iOException2;
                    i18 = i213;
                    i17 = i8;
                    onCheckedChangeListener = onCheckedChangeListener;
                    break;
                case 242628018:
                case 1390370093:
                    if (C1071.f81975 <= 0) {
                        checkBox = checkBox;
                        onCheckedChangeListener = onCheckedChangeListener;
                        iOException2 = iOException2;
                        sArr2 = sArr2;
                        i25 = i25;
                        sArr3 = sArr3;
                        iM559711 = C0873.m55680("ۨ᩺") ^ i15;
                        i6 = ((iM559711 ^ i16) * (-22707)) ^ (-1033721867);
                        i7 = 405545161;
                        sArr3 = sArr3;
                        sArr2 = sArr2;
                        i25 = i25;
                        checkBox = checkBox;
                        onCheckedChangeListener = onCheckedChangeListener;
                        iOException2 = iOException2;
                        i18 = iM559711 ^ i7;
                        i17 = i6;
                        activityC6200 = this;
                    } else {
                        checkBox = checkBox;
                        onCheckedChangeListener = onCheckedChangeListener;
                        iOException2 = iOException2;
                        sArr3 = sArr3;
                        iM55680 = (i15 - C0873.m55680("۠ܿ")) * 79;
                        i8 = ((iM55680 ^ i16) * 24637) ^ 1572176423;
                        i9 = -1610180737;
                        int i214 = iM55680 ^ i9;
                        sArr3 = sArr3;
                        checkBox = checkBox;
                        iOException2 = iOException2;
                        i18 = i214;
                        i17 = i8;
                        onCheckedChangeListener = onCheckedChangeListener;
                    }
                    break;
                case 288773515:
                case 1153718599:
                    checkBox = checkBox;
                    onCheckedChangeListener = onCheckedChangeListener;
                    iOException2 = iOException2;
                    sArr3 = sArr3;
                    strM55936 = RunnableC0938.m55936(f81957, 7, 3, i22);
                    if (C0912.f81867 <= 0) {
                        iM55680 = C0946.m55979("ܿ᩹") ^ i16;
                        i8 = ((iM55680 ^ i15) * (-26553)) ^ 393093812;
                        i9 = -1476559712;
                    } else {
                        iM55680 = C0946.m55979("ܽ᩷") ^ i16;
                        i8 = ((iM55680 ^ i15) * (-24677)) ^ (-1550034169);
                        i9 = -933780636;
                    }
                    int i215 = iM55680 ^ i9;
                    sArr3 = sArr3;
                    checkBox = checkBox;
                    iOException2 = iOException2;
                    i18 = i215;
                    i17 = i8;
                    onCheckedChangeListener = onCheckedChangeListener;
                    break;
                case 457344731:
                case 984274120:
                    C1044.m56286();
                    break;
                case 584030536:
                case 1942496871:
                    if (C1036.f81953 < 0) {
                        iOException = iOException2;
                        iM559713 = (C0946.m55979("ᩴܽ") ^ i15) * 19;
                        i13 = ((iM559713 ^ i16) * 20867) ^ 1987600838;
                        i14 = 1559836449;
                        i18 = iM559713 ^ i14;
                        i17 = i13;
                        iOException2 = iOException;
                    } else {
                        checkBox = checkBox;
                        onCheckedChangeListener = onCheckedChangeListener;
                        iOException2 = iOException2;
                        sArr2 = sArr2;
                        i25 = i25;
                        sArr3 = sArr3;
                        iM559711 = C0873.m55680("ۨ᩺") ^ i15;
                        i6 = ((iM559711 ^ i16) * (-22707)) ^ (-1033721867);
                        i7 = 405545161;
                        sArr3 = sArr3;
                        sArr2 = sArr2;
                        i25 = i25;
                        checkBox = checkBox;
                        onCheckedChangeListener = onCheckedChangeListener;
                        iOException2 = iOException2;
                        i18 = iM559711 ^ i7;
                        i17 = i6;
                        activityC6200 = this;
                    }
                    break;
                case 1280801877:
                case 1293714865:
                    C1229.m56410();
                    if (C1964.f83032 > 0) {
                        checkBox = checkBox;
                        onCheckedChangeListener = onCheckedChangeListener;
                        iOException2 = iOException2;
                        sArr3 = sArr3;
                        iM55680 = (C0873.m55680("᩻֡") ^ i16) * 51;
                        i8 = ((iM55680 ^ i15) * (-10109)) ^ (-341956133);
                        i9 = -624007148;
                        int i216 = iM55680 ^ i9;
                        sArr3 = sArr3;
                        checkBox = checkBox;
                        iOException2 = iOException2;
                        i18 = i216;
                        i17 = i8;
                        onCheckedChangeListener = onCheckedChangeListener;
                    } else {
                        checkBox = checkBox;
                        onCheckedChangeListener = onCheckedChangeListener;
                        iOException2 = iOException2;
                        sArr2 = sArr2;
                        i25 = i25;
                        sArr3 = sArr3;
                        iM559711 = C0946.m55979("᩻ۖ") ^ i15;
                        i6 = ((iM559711 ^ i16) * 8559) ^ (-308609545);
                        i7 = -698476029;
                        sArr3 = sArr3;
                        sArr2 = sArr2;
                        i25 = i25;
                        checkBox = checkBox;
                        onCheckedChangeListener = onCheckedChangeListener;
                        iOException2 = iOException2;
                        i18 = iM559711 ^ i7;
                        i17 = i6;
                        activityC6200 = this;
                    }
                    break;
                default:
                    ViewOnClickListenerC0939.m55941();
                    if (!C0866.m55645()) {
                        checkBox = checkBox;
                        onCheckedChangeListener = onCheckedChangeListener;
                        iOException2 = iOException2;
                        sArr3 = sArr3;
                        iM55680 = (C0873.m55680("᩻֡") ^ i16) * 51;
                        i8 = ((iM55680 ^ i15) * (-10109)) ^ (-341956133);
                        i9 = -624007148;
                        int i217 = iM55680 ^ i9;
                        sArr3 = sArr3;
                        checkBox = checkBox;
                        iOException2 = iOException2;
                        i18 = i217;
                        i17 = i8;
                        onCheckedChangeListener = onCheckedChangeListener;
                    } else {
                        iM55979 = C0946.m55979("ۙۛ") ^ i15;
                        i = ((iM55979 ^ i16) * 7719) ^ (-2086346997);
                        i2 = -334528483;
                        i18 = iM55979 ^ i2;
                        i17 = i;
                    }
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = -502797884;
        int i8 = RunnableC1014.f81941;
        int i9 = C1028.f81950;
        int iM55680 = (C0873.m55680("֡ۖ") + i9) * 47;
        int i10 = ((iM55680 ^ i8) * 10627) ^ (-1268379716);
        int i11 = 1480098486;
        while (true) {
            i7 = ((((i7 ^ i8) * (-1903)) >> 31) & i10) ^ (iM55680 ^ i11);
            switch (i7) {
                case -2141392912:
                case -217638760:
                    i2 = i * i;
                    i3 = s * s;
                    if (C0894.m55769() >= 0) {
                        iM55680 = C0873.m55680("ۢ۫") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-3227)) ^ 1932876443;
                        i11 = -770515590;
                    } else {
                        iM55680 = C0946.m55979("ۨ۟") ^ i8;
                        i10 = ((iM55680 ^ i9) * 24431) ^ (-911299684);
                        i11 = 216915851;
                    }
                    break;
                case -2039784983:
                case 1486300583:
                    if (C0892.f81851) {
                        iM55680 = (C0946.m55979("᩶֨") ^ i9) * 49;
                        i10 = ((iM55680 ^ i8) * 1981) ^ (-1207853123);
                        i11 = -183554099;
                    } else {
                        iM55680 = C0873.m55680("ۢ۫") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-3227)) ^ 1932876443;
                        i11 = -770515590;
                    }
                    break;
                case -1992773732:
                case 1829228241:
                    i4 = 57699216;
                    if (C1044.m56286() <= 0) {
                        iM55680 = C0946.m55979("ۤ᩸") ^ i8;
                        i10 = ((iM55680 ^ i9) * 13309) ^ (-790445639);
                        i11 = 2070849133;
                    } else {
                        iM55680 = (C0946.m55979("ۡܽ") + i9) * 127;
                        i10 = ((iM55680 ^ i8) * (-11501)) ^ 217236341;
                        i11 = -888917609;
                    }
                    break;
                case -1863771486:
                case 1131911958:
                    c = '#';
                    if (C1036.f81953 >= 0) {
                        iM55680 = C0873.m55680("ܶۛ") ^ i8;
                        i10 = ((iM55680 ^ i9) * 1091) ^ (-1915045612);
                        i11 = -572899374;
                    } else {
                        iM55680 = (C0873.m55680("᩸᩸") + i8) * (-83);
                        i10 = ((iM55680 ^ i9) * (-29757)) ^ 2136339736;
                        i11 = 599939370;
                    }
                    break;
                case -1806035583:
                case 444898260:
                    C0912.m55833();
                    C1024.m56209();
                    iM55680 = C0873.m55680("ۢ۫") ^ i8;
                    i10 = ((iM55680 ^ i9) * (-3227)) ^ 1932876443;
                    i11 = -770515590;
                    break;
                case -1666378596:
                case -79935694:
                    sArr2 = f81957;
                    i6 = 36;
                    if (C0992.m56107() <= 0) {
                        iM55680 = C0873.m55680("ۢ۫") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-3227)) ^ 1932876443;
                        i11 = -770515590;
                    } else {
                        iM55680 = (i9 - C0873.m55680("ܿܶ")) * 59;
                        i10 = ((iM55680 ^ i8) * (-23785)) ^ 1042938454;
                        i11 = -1137817816;
                    }
                    break;
                case -1642789431:
                case -1137699814:
                    C0967.m56074();
                    if (C0845.f81821 < 0) {
                        iM55680 = C0946.m55979("᩺ۤ") ^ i9;
                        i10 = ((iM55680 ^ i8) * 27463) ^ 1848980549;
                        i11 = 1078132798;
                    } else {
                        iM55680 = C0873.m55680("ۢ۫") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-3227)) ^ 1932876443;
                        i11 = -770515590;
                    }
                    break;
                case -1285905921:
                case 470739651:
                    s = sArr[c];
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0946.m55979("ۤ᩸") ^ i8;
                        i10 = ((iM55680 ^ i9) * 13309) ^ (-790445639);
                        i11 = 2070849133;
                    } else {
                        iM55680 = (C0946.m55979("ۙ۬") + i9) * 71;
                        i10 = ((iM55680 ^ i8) * (-11389)) ^ 361644796;
                        i11 = 1955723678;
                    }
                    break;
                case -1275540322:
                case -76511648:
                    C1229.m56410();
                    return null;
                case -1170395632:
                case -732804595:
                    sArr = f81957;
                    if (RunnableC0871.m55672() >= 0) {
                        iM55680 = C0946.m55979("᩺ۤ") ^ i9;
                        i10 = ((iM55680 ^ i8) * 27463) ^ 1848980549;
                        i11 = 1078132798;
                    } else {
                        iM55680 = C0946.m55979("ܰۙ") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-11743)) ^ 180755944;
                        i11 = -2123998054;
                    }
                    break;
                case -960728093:
                case -506075134:
                    C1017.m56187();
                    if (C0898.f81858 <= 0) {
                        iM55680 = C0946.m55979("ۤ᩸") ^ i8;
                        i10 = ((iM55680 ^ i9) * 13309) ^ (-790445639);
                        i11 = 2070849133;
                    } else {
                        iM55680 = C0873.m55680("ۢ۫") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-3227)) ^ 1932876443;
                        i11 = -770515590;
                    }
                    break;
                case -851658104:
                case 2145619147:
                    int i12 = i3 + i4;
                    if ((i12 + i12) - i2 >= 0) {
                        iM55680 = (i8 - C0946.m55979("ܽۧ")) * (-95);
                        i10 = ((iM55680 ^ i9) * 3659) ^ (-260921464);
                        i11 = -931846612;
                    } else {
                        iM55680 = (i8 - C0946.m55979("۟ۧ")) * (-119);
                        i10 = ((iM55680 ^ i9) * 23481) ^ 558690808;
                        i11 = 566503543;
                    }
                    break;
                case -709167563:
                case 1522567850:
                    if (C0955.m56025()) {
                        iM55680 = C0946.m55979("᩺ۤ") ^ i9;
                        i10 = ((iM55680 ^ i8) * 27463) ^ 1848980549;
                        i11 = 1078132798;
                    } else {
                        iM55680 = (i8 - C0873.m55680("ۗۧ")) * (-123);
                        i10 = ((iM55680 ^ i9) * (-21369)) ^ 387744120;
                        i11 = -1209023449;
                    }
                    break;
                case -527666018:
                case 1484613239:
                    if (C0946.f81894 != 0) {
                        iM55680 = C0873.m55680("ܶۛ") ^ i8;
                        i10 = ((iM55680 ^ i9) * 1091) ^ (-1915045612);
                        i11 = -572899374;
                    } else {
                        iM55680 = C0873.m55680("ۧ۠") ^ i9;
                        i10 = ((iM55680 ^ i8) * 16887) ^ 582305705;
                        i11 = 1045344667;
                    }
                    break;
                case -233702602:
                case 1121695557:
                    i = s + 7596;
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0873.m55680("ܶۛ") ^ i8;
                        i10 = ((iM55680 ^ i9) * 1091) ^ (-1915045612);
                        i11 = -572899374;
                    } else {
                        iM55680 = C0873.m55680("ۢۜ") ^ i9;
                        i10 = ((iM55680 ^ i8) * (-11103)) ^ (-1062182950);
                        i11 = -427459793;
                    }
                    break;
                case -121469739:
                case 267393298:
                    return C1053.m56325(sArr2, i6, 18, i5);
                case 383852954:
                case 647590769:
                    C1036.m56257();
                    if (C0937.m55918() >= 0) {
                        iM55680 = C0946.m55979("ۤ᩸") ^ i8;
                        i10 = ((iM55680 ^ i9) * 13309) ^ (-790445639);
                        i11 = 2070849133;
                    } else {
                        iM55680 = (C0946.m55979("֫ۙ") + i9) * (-35);
                        i10 = ((iM55680 ^ i8) * 5351) ^ (-1418529081);
                        i11 = 915300516;
                    }
                    break;
                case 1306797893:
                case 1648797551:
                    i5 = 57690;
                    iM55680 = (C0873.m55680("᩶ܰ") ^ i9) * 35;
                    i10 = ((iM55680 ^ i8) * (-18971)) ^ 515989246;
                    i11 = -1821320671;
                    break;
                default:
                    i5 = 40232;
                    iM55680 = (C0873.m55680("᩶ܰ") ^ i9) * 35;
                    i10 = ((iM55680 ^ i8) * (-18971)) ^ 515989246;
                    i11 = -1821320671;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x020a A[PHI: r3 r4 r11 r12 r21
      0x020a: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:55:0x0208, B:35:0x011a, B:14:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r4v6 java.lang.String) = (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v7 java.lang.String) binds: [B:55:0x0208, B:35:0x011a, B:14:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:55:0x0208, B:35:0x011a, B:14:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r12v4 short) = (r12v3 short), (r12v2 short), (r12v2 short) binds: [B:55:0x0208, B:35:0x011a, B:14:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r21v22 int) = (r21v11 int), (r21v18 int), (r21v23 int) binds: [B:55:0x0208, B:35:0x011a, B:14:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x027b A[PHI: r5 r6 r7 r17 r21
      0x027b: PHI (r5v5 int) = (r5v2 int), (r5v2 int), (r5v6 int) binds: [B:63:0x0279, B:39:0x013d, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x027b: PHI (r6v5 int) = (r6v2 int), (r6v2 int), (r6v6 int) binds: [B:63:0x0279, B:39:0x013d, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x027b: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:63:0x0279, B:39:0x013d, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x027b: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:63:0x0279, B:39:0x013d, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x027b: PHI (r21v25 int) = (r21v9 int), (r21v17 int), (r21v26 int) binds: [B:63:0x0279, B:39:0x013d, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
    
        if (p067l.C1194.f82045 == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0081, code lost:
    
        if (p067l.C0927.f81875 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005d, code lost:
    
        if (p067l.C0882.m55710() == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005f, code lost:
    
        r21 = r1;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onCreateOptionsMenu(Menu menu) {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        int i5 = C1017.f81942;
        int i6 = RunnableC0938.f81886;
        int iM55681 = C0873.m55680("᩻᩹") ^ i6;
        int i7 = ((iM55681 ^ i5) * 31941) ^ (-198014223);
        MenuItem menuItemM55687 = null;
        String strM56373 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM55681 ^ 985482260;
        int i9 = 0;
        int iM55682 = 0;
        int iM559710 = 0;
        int i10 = 0;
        short s = 0;
        int i11 = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = -289698108;
        int i15 = 0;
        short[] sArr3 = null;
        int i16 = 0;
        while (true) {
            i14 = i8 ^ (i7 & (((i14 ^ i5) * (-1685)) >> 31));
            switch (i14) {
                case -1855704093:
                case 1025654750:
                    i12 = 35738;
                    iM55680 = C0873.m55680("ܳۜ") ^ i5;
                    i3 = ((iM55680 ^ i6) * 19965) ^ 205565300;
                    i4 = 369848263;
                    int i17 = i9;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    i9 = i17;
                    break;
                case -1492720018:
                case -974706156:
                    i9 = i9;
                    i10 = 3;
                    if (C1404.f82149 >= 0) {
                        iM55680 = (C0946.m55979("۫ܺ") ^ i5) * 13;
                        i3 = ((iM55680 ^ i6) * 21059) ^ 1428264746;
                        i4 = 2105907792;
                    } else {
                        iM55680 = C0873.m55680("᩻᩸") ^ i5;
                        i3 = ((iM55680 ^ i6) * 18489) ^ 1301028862;
                        i4 = -1371882557;
                    }
                    int i18 = i9;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    i9 = i18;
                    break;
                case -1419914144:
                case -1278468825:
                    i9 = i9;
                    sArr3 = f81957;
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0946.m55979("᩵᩹") ^ i6;
                        i3 = ((iM55680 ^ i5) * (-19967)) ^ 940080086;
                        i4 = -1687414387;
                    } else {
                        iM55680 = (i5 - C0873.m55680("۠᩷")) * 123;
                        i3 = ((iM55680 ^ i6) * 783) ^ 1883731622;
                        i4 = 844781451;
                    }
                    int i19 = i9;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    i9 = i19;
                    break;
                case -1243081025:
                case 2139158740:
                    i9 = i9;
                    iM55682 = C0873.m55680(C0906.m55810(sArr, i13, i10, i12));
                    if (C0854.m55595() >= 0) {
                        iM55680 = C0946.m55979("ۚ᩹") ^ i5;
                        i3 = ((iM55680 ^ i6) * (-23897)) ^ 778423376;
                        i4 = 593229472;
                    } else {
                        iM55680 = (i6 - C0946.m55979("᩺᩹")) * (-91);
                        i3 = ((iM55680 ^ i5) * (-31637)) ^ (-1464071501);
                        i4 = 2131954047;
                    }
                    int i110 = i9;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    i9 = i110;
                    break;
                case -1128150717:
                case 1829633795:
                    i9 = i9;
                    i11 = i15 + 81090025;
                    s2 = 18010;
                    if (C0946.f81894 != 0) {
                        iM55680 = C0946.m55979("ۚ᩹") ^ i5;
                        i3 = ((iM55680 ^ i6) * (-23897)) ^ 778423376;
                        i4 = 593229472;
                    } else {
                        iM55680 = (C0946.m55979("ܿ֨") ^ i6) * 41;
                        i3 = ((iM55680 ^ i5) * 26811) ^ (-1232727636);
                        i4 = 695699383;
                    }
                    int i111 = i9;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    i9 = i111;
                    break;
                case -1060956655:
                case 176982019:
                    break;
                case -944601724:
                case 1891988789:
                    sArr = f81957;
                    i13 = 25;
                    if (C1024.f81946) {
                        i9 = 0;
                        iM55680 = C0946.m55979("۟᩸") ^ i6;
                        i9 = i9;
                        i3 = ((iM55680 ^ i5) * (-24013)) ^ 1799856257;
                        i4 = -935403966;
                        int i112 = i9;
                        i8 = iM55680 ^ i4;
                        i7 = i3;
                        i9 = i112;
                    } else {
                        int iM55683 = (C0873.m55680("ܶܶ") ^ i6) * (-127);
                        i8 = iM55683 ^ 1705078526;
                        i7 = ((iM55683 ^ i5) * 7609) ^ 777279450;
                        i9 = 0;
                    }
                    break;
                case -605408527:
                case 113666746:
                    ViewOnClickListenerC0939.m55941();
                    break;
                case -486115475:
                case 744692303:
                    iM559710 = C0946.m55979(strM56373);
                    i16 = 2127376084;
                    if (!C0955.f81898) {
                        iM55979 = (C0946.m55979("֫ۙ") ^ i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM55979 ^ i6) * (-30541)) ^ (-1644453062);
                        i2 = -386746289;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        i9 = i9;
                        iM55680 = (C0946.m55979("۫ܺ") ^ i5) * 13;
                        i3 = ((iM55680 ^ i6) * 21059) ^ 1428264746;
                        i4 = 2105907792;
                        int i113 = i9;
                        i8 = iM55680 ^ i4;
                        i7 = i3;
                        i9 = i113;
                    }
                    break;
                case -450418070:
                case 1407750101:
                    strM56373 = C1124.m56373(sArr2, 28, 3, i12);
                    if (ViewOnClickListenerC0939.m55941() < 0) {
                        iM55979 = C0946.m55979("۫᩸") ^ i6;
                        i = ((iM55979 ^ i5) * 11589) ^ (-1166557);
                        i2 = 1927633066;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        i9 = i9;
                        iM55680 = C0946.m55979("ۚ᩹") ^ i5;
                        i3 = ((iM55680 ^ i6) * (-23897)) ^ 778423376;
                        i4 = 593229472;
                        int i114 = i9;
                        i8 = iM55680 ^ i4;
                        i7 = i3;
                        i9 = i114;
                    }
                    break;
                case -419890285:
                case -110748571:
                    C0877.m55696();
                    iM55680 = C0946.m55979("۟᩸") ^ i6;
                    i9 = i9;
                    i3 = ((iM55680 ^ i5) * (-24013)) ^ 1799856257;
                    i4 = -935403966;
                    int i115 = i9;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    i9 = i115;
                    break;
                case -248537718:
                case 409097641:
                    i9 = i9;
                    c = 24;
                    if (C0892.f81851) {
                        iM55680 = C0873.m55680("ۗܽ") ^ i6;
                        i3 = ((iM55680 ^ i5) * 4543) ^ (-1176390640);
                        i4 = -1989166717;
                    } else {
                        iM55680 = (C0946.m55979("۫ܺ") ^ i5) * 13;
                        i3 = ((iM55680 ^ i6) * 21059) ^ 1428264746;
                        i4 = 2105907792;
                    }
                    int i116 = i9;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    i9 = i116;
                    break;
                case -220064715:
                case 79035900:
                    C0890.m55740();
                    break;
                case 77824811:
                case 1947449196:
                    i9 = i9;
                    if (i11 - (s * s2) >= 0) {
                        iM55680 = (C0946.m55979("ۛᩴ") + i6) * (-67);
                        i3 = ((iM55680 ^ i5) * 25163) ^ 1213759821;
                        i4 = -314307610;
                    } else {
                        iM55680 = (C0873.m55680("᩶ܺ") ^ i5) * (-85);
                        i3 = ((iM55680 ^ i6) * 2225) ^ 2009037965;
                        i4 = 1611220804;
                    }
                    int i117 = i9;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    i9 = i117;
                    break;
                case 238911547:
                case 823190491:
                    C0967.m56067(menuItemM55687, iM559710 ^ i16).setShowAsAction(2);
                    return true;
                case 411876847:
                case 1557894053:
                    i9 = i9;
                    s = sArr3[c];
                    i15 = s * s;
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0873.m55680("᩹᩷") ^ i6;
                        i3 = ((iM55680 ^ i5) * 21647) ^ 1190733204;
                        i4 = 1753648209;
                    } else {
                        iM55680 = (C0873.m55680("ۨ۫") ^ i5) * (-65);
                        i3 = ((iM55680 ^ i6) * 17481) ^ (-1528062011);
                        i4 = -757324940;
                    }
                    int i118 = i9;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    i9 = i118;
                    break;
                case 1012533041:
                case 1798029699:
                    i12 = 1602;
                    iM55680 = C0873.m55680("ܳۜ") ^ i5;
                    i3 = ((iM55680 ^ i6) * 19965) ^ 205565300;
                    i4 = 369848263;
                    int i119 = i9;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    i9 = i119;
                    break;
                case 1458750148:
                case 1514135048:
                    int i20 = 2102487593 ^ iM55682;
                    menuItemM55687 = C0873.m55687(menu, i9, i20, i9, i20);
                    sArr2 = f81957;
                    if (RunnableC0938.f81886 >= 0) {
                        i9 = i9;
                        iM55680 = C0946.m55979("᩵᩹") ^ i6;
                        i3 = ((iM55680 ^ i5) * (-19967)) ^ 940080086;
                        i4 = -1687414387;
                    } else {
                        iM55680 = C0946.m55979("ۧ᩺") ^ i5;
                        i9 = i9;
                        i3 = ((iM55680 ^ i6) * 7171) ^ 707516550;
                        i4 = 882824787;
                    }
                    int i1110 = i9;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    i9 = i1110;
                    break;
                default:
                    C1025.m56230();
                    return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0183 A[PHI: r9
      0x0183: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:48:0x0181, B:15:0x006f, B:12:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01ec A[PHI: r4 r5 r12
      0x01ec: PHI (r4v3 short) = (r4v2 short), (r4v2 short), (r4v2 short), (r4v2 short), (r4v4 short) binds: [B:33:0x00ee, B:17:0x0073, B:15:0x006f, B:9:0x005b, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r5v3 short) = (r5v2 short), (r5v2 short), (r5v2 short), (r5v2 short), (r5v4 short) binds: [B:33:0x00ee, B:17:0x0073, B:15:0x006f, B:9:0x005b, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:33:0x00ee, B:17:0x0073, B:15:0x006f, B:9:0x005b, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x021e A[PHI: r3 r7 r8
      0x021e: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char) binds: [B:62:0x021c, B:52:0x01b5, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:62:0x021c, B:52:0x01b5, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:62:0x021c, B:52:0x01b5, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x024e A[PHI: r1 r6 r11 r13 r18
      0x024e: PHI (r1v4 int) = (r1v2 int), (r1v2 int), (r1v3 int), (r1v2 int) binds: [B:66:0x024c, B:56:0x01d3, B:37:0x010f, B:29:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:66:0x024c, B:56:0x01d3, B:37:0x010f, B:29:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:66:0x024c, B:56:0x01d3, B:37:0x010f, B:29:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:66:0x024c, B:56:0x01d3, B:37:0x010f, B:29:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:66:0x024c, B:56:0x01d3, B:37:0x010f, B:29:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x027a  */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int iM55979;
        int i;
        int i2;
        int i3 = C1124.f82007;
        int i4 = AbstractC0942.f81890;
        int iM55680 = (i4 - C0873.m55680("۬ۖ")) * (-65);
        int i5 = ((iM55680 ^ i3) * 15931) ^ 1388137602;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55680 ^ 668204374;
        int iM55998 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -613455448;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * (-28085)) >> 31));
            switch (i14) {
                case -2002610665:
                case 704359896:
                    i11 = 40097;
                    iM55979 = (i3 - C0946.m55979("᩸᩶")) * 115;
                    i = ((iM55979 ^ i4) * (-3363)) ^ (-929913995);
                    i2 = 1362248733;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1804958334:
                case -347912016:
                    C0863.m55643();
                    if (C0890.m55740()) {
                        iM55979 = (C0946.m55979("۬ۧ") ^ i4) * 69;
                        i = ((iM55979 ^ i3) * 21515) ^ 737727121;
                        i2 = -1416881830;
                    } else {
                        iM55979 = (C0946.m55979("᩻᩷") ^ i3) * (-73);
                        i = ((iM55979 ^ i4) * 26523) ^ (-1660203656);
                        i2 = -1854227850;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1748099326:
                case -1723994385:
                    i7 = s + s2;
                    if (C0906.f81862 >= 0) {
                        iM55979 = C0946.m55979("ۙۤ") ^ i4;
                        i = ((iM55979 ^ i3) * 10403) ^ 1889573743;
                        i2 = -1027550934;
                    } else {
                        iM55979 = C0873.m55680("֡᩷") ^ i4;
                        i = ((iM55979 ^ i3) * (-19775)) ^ 1615831893;
                        i2 = -2116732522;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1372745976:
                case -1031806776:
                    return false;
                case -1362877505:
                case 1575158149:
                    C1025.m56230();
                    C0854.m55595();
                    iM55979 = (C0946.m55979("۬ۧ") ^ i4) * 69;
                    i = ((iM55979 ^ i3) * 21515) ^ 737727121;
                    i2 = -1416881830;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1183842668:
                case -891704073:
                    c = 31;
                    if (C1003.f81929 <= 0) {
                        iM55979 = (C0946.m55979("᩻᩷") ^ i3) * (-73);
                        i = ((iM55979 ^ i4) * 26523) ^ (-1660203656);
                        i2 = -1854227850;
                    } else {
                        iM55979 = C0873.m55680("ۙ᩹") ^ i4;
                        i = ((iM55979 ^ i3) * 31801) ^ 1229143725;
                        i2 = 1553296192;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1087052380:
                case 2066795970:
                    if (iM55998 == (C0946.m55979(C0955.m56029(sArr2, i12, i13, i11)) ^ 2116864516)) {
                        int iM559710 = C0946.m55979("ۛܺ") ^ i3;
                        i5 = ((iM559710 ^ i4) * (-12653)) ^ (-306304498);
                        i6 = iM559710 ^ (-545949730);
                    } else {
                        iM55979 = C0873.m55680("ۢ֨") ^ i4;
                        i = ((iM55979 ^ i3) * (-17945)) ^ (-201571138);
                        i2 = -1797934003;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    }
                    break;
                case -996169159:
                case -847843413:
                    C1929.m56553();
                    if (C0890.m55740()) {
                        iM55979 = C0873.m55680("ۖ᩶") ^ i4;
                        i = ((iM55979 ^ i3) * (-24793)) ^ 204008534;
                        i2 = -126991780;
                    } else {
                        iM55979 = C0873.m55680("۠᩶") ^ i3;
                        i = ((iM55979 ^ i4) * (-30893)) ^ 1414798333;
                        i2 = 1019105355;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -888227564:
                case -679510301:
                    i8 = i7 * i7;
                    i9 = s * s;
                    if (C0882.m55710() != 0) {
                        iM55979 = (C0946.m55979("᩻᩷") ^ i3) * (-73);
                        i = ((iM55979 ^ i4) * 26523) ^ (-1660203656);
                        i2 = -1854227850;
                    } else {
                        iM55979 = (C0873.m55680("ۚ᩶") ^ i3) * (-111);
                        i = ((iM55979 ^ i4) * 16425) ^ 1679609640;
                        i2 = 247120450;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -841205500:
                case -800572450:
                    sArr = f81957;
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0946.m55979("ۙۤ") ^ i4;
                        i = ((iM55979 ^ i3) * 10403) ^ 1889573743;
                        i2 = -1027550934;
                    } else {
                        iM55979 = C0873.m55680("ۚܽ") ^ i4;
                        i = ((iM55979 ^ i3) * (-29217)) ^ (-1050628918);
                        i2 = -272258380;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -779509878:
                case 88155921:
                    C1017.m56187();
                    if (C0989.f81920 >= 0) {
                        iM55979 = (C0946.m55979("۬ۧ") ^ i4) * 69;
                        i = ((iM55979 ^ i3) * 21515) ^ 737727121;
                        i2 = -1416881830;
                    } else {
                        iM55979 = C0873.m55680("ۖ᩶") ^ i4;
                        i = ((iM55979 ^ i3) * (-24793)) ^ 204008534;
                        i2 = -126991780;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -650495247:
                case 453829155:
                    if (C1194.f82045 != 0) {
                        iM55979 = C0873.m55680("۠᩶") ^ i3;
                        i = ((iM55979 ^ i4) * (-30893)) ^ 1414798333;
                        i2 = 1019105355;
                    } else {
                        iM55979 = C0946.m55979("ۢ֡") ^ i3;
                        i = ((iM55979 ^ i4) * 24495) ^ (-1299574849);
                        i2 = 552321964;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -545960218:
                case 1347962123:
                    iM55998 = C0947.m55998(menuItem);
                    sArr2 = f81957;
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0946.m55979("ۙۤ") ^ i4;
                        i = ((iM55979 ^ i3) * 10403) ^ 1889573743;
                        i2 = -1027550934;
                    } else {
                        iM55979 = C0946.m55979("ۨ᩵") ^ i3;
                        i = ((iM55979 ^ i4) * (-28537)) ^ 594000829;
                        i2 = -42669798;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -337260234:
                case -261864062:
                    C0906.m55809();
                    RunnableC1014.m56177();
                    return false;
                case 231374567:
                case 1677067143:
                    i11 = 23278;
                    iM55979 = (i3 - C0946.m55979("᩸᩶")) * 115;
                    i = ((iM55979 ^ i4) * (-3363)) ^ (-929913995);
                    i2 = 1362248733;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 272841152:
                case 627234194:
                    i12 = 32;
                    if (C1025.f81947 >= 0) {
                        iM55979 = (C0946.m55979("۬ۧ") ^ i4) * 69;
                        i = ((iM55979 ^ i3) * 21515) ^ 737727121;
                        i2 = -1416881830;
                    } else {
                        iM55979 = C0873.m55680("֨ۛ") ^ i4;
                        i = ((iM55979 ^ i3) * (-11637)) ^ (-1004172899);
                        i2 = 1950195055;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 400480290:
                case 2015013878:
                    int i15 = i9 + i10;
                    if (i8 - (i15 + i15) <= 0) {
                        iM55979 = C0873.m55680("ۜ֫") ^ i3;
                        i = ((iM55979 ^ i4) * (-26057)) ^ (-3866835);
                        i2 = -520256257;
                    } else {
                        iM55979 = C0946.m55979("᩻ܳ") ^ i4;
                        i = ((iM55979 ^ i3) * 8793) ^ (-392478173);
                        i2 = 2136088131;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 475974185:
                case 712487929:
                    i10 = 395095129;
                    if (C0861.f81831) {
                        iM55979 = C0873.m55680("ܰܿ") ^ i4;
                        i = ((iM55979 ^ i3) * (-30693)) ^ 1631343053;
                        i2 = 783336058;
                    } else {
                        iM55979 = C0873.m55680("ۖ᩶") ^ i4;
                        i = ((iM55979 ^ i3) * (-24793)) ^ 204008534;
                        i2 = -126991780;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 580363487:
                case 1159177007:
                    i13 = 3;
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0946.m55979("ۙۤ") ^ i4;
                        i = ((iM55979 ^ i3) * 10403) ^ 1889573743;
                        i2 = -1027550934;
                    } else {
                        iM55979 = (C0873.m55680("᩺᩹") ^ i3) * (-15);
                        i = ((iM55979 ^ i4) * 14179) ^ (-621247737);
                        i2 = 1658697002;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 626021705:
                case 843222070:
                    this.f15617.m28859();
                    return true;
                default:
                    s = sArr[c];
                    s2 = 19877;
                    if (C1048.f81963) {
                        iM55979 = C0873.m55680("ܰ᩻") ^ i3;
                        i = ((iM55979 ^ i4) * (-4843)) ^ (-1198931994);
                        i2 = 1946826739;
                    } else {
                        iM55979 = (C0946.m55979("۬ۧ") ^ i4) * 69;
                        i = ((iM55979 ^ i3) * 21515) ^ 737727121;
                        i2 = -1416881830;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        AbstractC17043 abstractC17043 = null;
        int i = -1248603976;
        int i2 = C0873.f81841;
        int i3 = C1071.f81975;
        int iM55979 = (C0946.m55979("۠᩷") + i2) * 39;
        int i4 = ((iM55979 ^ i3) * (-24853)) ^ (-1341976810);
        int i5 = -1156929893;
        while (true) {
            i = ((((i ^ i3) * (-26373)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1827887074:
                case -827538287:
                    if (C0955.f81898) {
                        iM55979 = (C0946.m55979("ۧۛ") + i2) * (-29);
                        i4 = ((iM55979 ^ i3) * (-21997)) ^ 1729821647;
                        i5 = -309028345;
                    } else {
                        iM55979 = (C0946.m55979("۫᩺") ^ i2) * (-103);
                        i4 = ((iM55979 ^ i3) * SecP160R2Field.PInv33) ^ 188437299;
                        i5 = 2147056991;
                    }
                    break;
                case -1722527219:
                case -1537979471:
                    if (C1024.m56209() >= 0) {
                        iM55979 = C0873.m55680("֡ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-16417)) ^ 1034299162;
                        i5 = -655392536;
                    } else {
                        iM55979 = (i2 - C0946.m55979("֨ۧ")) * (-93);
                        i4 = ((iM55979 ^ i3) * 19169) ^ (-1871678020);
                        i5 = 43103470;
                    }
                    break;
                case -1678796741:
                case -449486490:
                    abstractC17043 = this.f15618;
                    if (abstractC17043 != null) {
                        iM55979 = (i3 - C0946.m55979("ܶᩳ")) * (-15);
                        i4 = ((iM55979 ^ i2) * 5029) ^ (-501674022);
                        i5 = -481968798;
                    } else {
                        iM55979 = C0946.m55979("᩹۫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 15563) ^ (-1260738220);
                        i5 = 84878023;
                    }
                    break;
                case -1581784261:
                case -972818558:
                    if (C1229.m56410() != 0) {
                        iM55979 = C0873.m55680("֡ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-16417)) ^ 1034299162;
                        i5 = -655392536;
                    } else {
                        iM55979 = (C0946.m55979("ᩴ۠") + i3) * 49;
                        i4 = ((iM55979 ^ i2) * (-9579)) ^ 2036251614;
                        i5 = 151664236;
                    }
                    break;
                case -1517930420:
                case 242747927:
                    if (C1048.f81963) {
                        iM55979 = C0946.m55979("᩶ۡ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 10063) ^ (-574895380);
                        i5 = -401333894;
                    } else {
                        iM55979 = C0873.m55680("ۢۖ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-29989)) ^ (-1757556611);
                        i5 = -1185797341;
                    }
                    break;
                case -1071697547:
                case -976893727:
                    C1124.m56367();
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0946.m55979("ۧۛ") + i2) * (-29);
                        i4 = ((iM55979 ^ i3) * (-21997)) ^ 1729821647;
                        i5 = -309028345;
                    } else {
                        iM55979 = C0873.m55680("֡ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-16417)) ^ 1034299162;
                        i5 = -655392536;
                    }
                    break;
                case -1056038558:
                case 1481188849:
                    abstractC17043.mo29990();
                    iM55979 = C0946.m55979("᩹۫") ^ i2;
                    i4 = ((iM55979 ^ i3) * 15563) ^ (-1260738220);
                    i5 = 84878023;
                    break;
                case -878526292:
                case 1671028608:
                    if (C1024.f81946) {
                        iM55979 = C0873.m55680("ۢۖ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-29989)) ^ (-1757556611);
                        i5 = -1185797341;
                    } else {
                        iM55979 = C0873.m55680("᩹ܳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-19841)) ^ 1779426041;
                        i5 = -1081690630;
                    }
                    break;
                case -510354026:
                case -47740983:
                    if (C0890.f81849 == 0) {
                        iM55979 = C0873.m55680("֡ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-16417)) ^ 1034299162;
                        i5 = -655392536;
                    } else {
                        iM55979 = (C0946.m55979("᩺ۚ") ^ i3) * 59;
                        i4 = ((iM55979 ^ i2) * (-21873)) ^ (-333767826);
                        i5 = 746843221;
                    }
                    break;
                case -494536214:
                case -27989091:
                    C1003.m56123();
                    break;
                case -471721903:
                case -361004182:
                    if (C0906.f81862 >= 0) {
                        iM55979 = C0873.m55680("֡ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-16417)) ^ 1034299162;
                        i5 = -655392536;
                    } else {
                        iM55979 = C0873.m55680("ۖۢ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-22327)) ^ 1355372357;
                        i5 = -1483230653;
                    }
                    break;
                case -52806050:
                case 1205148448:
                    if (C0967.m56074()) {
                        iM55979 = C0873.m55680("ۢۖ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-29989)) ^ (-1757556611);
                        i5 = -1185797341;
                    } else {
                        iM55979 = (C0946.m55979("ܿᩴ") + i3) * (-123);
                        i4 = ((iM55979 ^ i2) * (-1343)) ^ (-1646819434);
                        i5 = -1522491093;
                    }
                    break;
                case 24568095:
                case 1779586352:
                    super.finish();
                    if (C1048.f81963) {
                        iM55979 = C0873.m55680("۟۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * 2277) ^ 55912135;
                        i5 = 301635791;
                    } else {
                        iM55979 = C0873.m55680("֡ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-16417)) ^ 1034299162;
                        i5 = -655392536;
                    }
                    break;
                case 258669723:
                case 810438194:
                    if (C0890.f81849 != 0) {
                        iM55979 = C0873.m55680("ۢۖ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-29989)) ^ (-1757556611);
                        i5 = -1185797341;
                    } else {
                        iM55979 = (C0873.m55680("ᩴᩳ") + i2) * 67;
                        i4 = ((iM55979 ^ i3) * (-30635)) ^ (-988732320);
                        i5 = -1286332264;
                    }
                    break;
                case 927047138:
                case 1642640018:
                    if (C0877.f81843 >= 0) {
                        iM55979 = C0873.m55680("֡ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-16417)) ^ 1034299162;
                        i5 = -655392536;
                    } else {
                        iM55979 = (C0873.m55680("ܺۢ") + i2) * (-31);
                        i4 = ((iM55979 ^ i3) * (-24313)) ^ (-144058825);
                        i5 = 1913942263;
                    }
                    break;
                case 1306527884:
                case 1414494985:
                    RunnableC0871.m55672();
                    C1053.m56327();
                    iM55979 = C0873.m55680("֡ܶ") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-16417)) ^ 1034299162;
                    i5 = -655392536;
                    break;
                case 1944953452:
                case 1986224281:
                    if (C0917.m55854()) {
                        iM55979 = C0946.m55979("ᩳ᩻") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-29557)) ^ 1134921606;
                        i5 = -2098406631;
                    } else {
                        iM55979 = (C0946.m55979("ۧۛ") + i2) * (-29);
                        i4 = ((iM55979 ^ i3) * (-21997)) ^ 1729821647;
                        i5 = -309028345;
                    }
                    break;
            }
            return;
        }
    }
}
