package p067l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.editor.TextEditorFloatingMenu;
import bin.p000mt.plugin.api.editor.TextEditorFunction;
import bin.p000mt.plugin.api.editor.TextEditorToolMenu;
import bin.p000mt.plugin.api.preference.PluginPreference;
import bin.p000mt.plugin.api.translation.TranslationEngine;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.commonsdk.statistics.UMErrorCode;
import com.umeng.commonsdk.utils.C0831c;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܽܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J2SS */
/* JADX INFO: loaded from: classes.dex */
public final class C18249 {

    /* JADX INFO: renamed from: ۙ */
    public static final C13259 f54479;

    /* JADX INFO: renamed from: ۡ᩹ۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f82265;

    /* JADX INFO: renamed from: ֡ */
    public String f54480;

    /* JADX INFO: renamed from: ֨ */
    public String f54481;

    /* JADX INFO: renamed from: ֫ */
    public Object f54482;

    /* JADX INFO: renamed from: ۖ */
    public String f54483;

    /* JADX INFO: renamed from: ۘ */
    public String f54484;

    /* JADX INFO: renamed from: ۚ */
    public C19561 f54485;

    /* JADX INFO: renamed from: ۜ */
    public Drawable f54486;

    /* JADX INFO: renamed from: ۠ */
    public Object f54487;

    /* JADX INFO: renamed from: ۡ */
    public ArrayList f54488;

    /* JADX INFO: renamed from: ۢ */
    public boolean f54489;

    /* JADX INFO: renamed from: ۧ */
    public final Object f54490;

    /* JADX INFO: renamed from: ܳ */
    public boolean f54491;

    /* JADX INFO: renamed from: ܶ */
    public int f54492;

    /* JADX INFO: renamed from: ܺ */
    public boolean f54493;

    /* JADX INFO: renamed from: ܽ */
    public C12474 f54494;

    /* JADX INFO: renamed from: ܿ */
    public String f54495;

    /* JADX INFO: renamed from: ᩳ */
    public String f54496;

    /* JADX INFO: renamed from: ᩴ */
    public int f54497;

    /* JADX INFO: renamed from: ᩵ */
    public int f54498;

    /* JADX INFO: renamed from: ᩶ */
    public String f54499;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f54500;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f54501;

    /* JADX INFO: renamed from: ᩹ */
    public int f54502;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f54503;

    /* JADX INFO: renamed from: ֫ */
    public native synchronized boolean m41530(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044);

    /* JADX INFO: renamed from: ۗ */
    public final synchronized void m41532() {
        this.f54493 = false;
        this.f54482 = null;
        m41525();
    }

    /* JADX INFO: renamed from: ܳ */
    public final synchronized Drawable m41544() {
        short s = f82265[812];
        int i = s * 22560;
        int i2 = s + 5640;
        int i3 = i - (i2 * i2) <= 0 ? 56144 : 23863;
        synchronized (this) {
            if (this.f54500) {
                return this.f54486;
            }
            this.f54500 = true;
            Bitmap bitmapM41519 = m41519(m41521());
            if (bitmapM41519 != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapM41519);
                this.f54486 = bitmapDrawable;
                return bitmapDrawable;
            }
            Drawable drawableM16202 = C7050.m16202(C0873.m55680(C0955.m56029(f82265, 813, 3, i3)) ^ 2124609787);
            this.f54486 = drawableM16202;
            return drawableM16202;
        }
    }

    /* JADX INFO: renamed from: ᩶ */
    public native synchronized boolean m41557();

    /* JADX WARN: Code duplicated, block: B:41:0x019c  */
    /* JADX WARN: Code duplicated, block: B:49:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:56:0x0232 A[PHI: r10
      0x0232: PHI (r10v3 int) = (r10v2 int), (r10v1 int) binds: [B:54:0x0218, B:47:0x01dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02c5 A[PHI: r2 r4 r5 r13
      0x02c5: PHI (r2v83 android.graphics.BitmapFactory$Options) = 
      (r2v68 android.graphics.BitmapFactory$Options)
      (r2v2 android.graphics.BitmapFactory$Options)
      (r2v2 android.graphics.BitmapFactory$Options)
      (r2v2 android.graphics.BitmapFactory$Options)
     binds: [B:70:0x02c4, B:62:0x027a, B:59:0x0260, B:154:0x02c5] A[DONT_GENERATE, DONT_INLINE]
      0x02c5: PHI (r4v93 boolean) = (r4v81 boolean), (r4v1 boolean), (r4v1 boolean), (r4v1 boolean) binds: [B:70:0x02c4, B:62:0x027a, B:59:0x0260, B:154:0x02c5] A[DONT_GENERATE, DONT_INLINE]
      0x02c5: PHI (r5v63 byte[]) = (r5v51 byte[]), (r5v1 byte[]), (r5v1 byte[]), (r5v1 byte[]) binds: [B:70:0x02c4, B:62:0x027a, B:59:0x0260, B:154:0x02c5] A[DONT_GENERATE, DONT_INLINE]
      0x02c5: PHI (r13v2 int) = (r13v1 int), (r13v1 int), (r13v1 int), (r13v5 int) binds: [B:70:0x02c4, B:62:0x027a, B:59:0x0260, B:154:0x02c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ */
    public static Bitmap m41519(C19561 c19561) {
        int i;
        int i2;
        short[] sArr;
        int i3;
        BitmapFactory.Options options;
        byte[] bArr;
        short[] sArr2;
        int i4;
        short[] sArr3;
        int i5;
        C5738 c5738;
        boolean z;
        int i6;
        BitmapFactory.Options options2;
        int i7;
        short[] sArr4;
        int i8;
        boolean z2;
        int i9;
        short[] sArr5;
        int i10;
        C5738 c5739;
        int i11;
        int i12;
        byte[] bArr2;
        int iM55979;
        int i13;
        int i14;
        int i15;
        int i16;
        short[] sArr6;
        int i17;
        BitmapFactory.Options options3;
        byte[] bArr3;
        short[] sArr7;
        int i18;
        short[] sArr8;
        int i19;
        C5738 c57310;
        boolean z3;
        int i20;
        int iM55680;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        short[] sArr9;
        int i26;
        BitmapFactory.Options options4;
        byte[] bArr4;
        short[] sArr10;
        int i27;
        short[] sArr11;
        int i28;
        C5738 c57311;
        boolean z4;
        int iM559710;
        int i29;
        int i30;
        short[] sArr12;
        C5738 c5738M56013;
        int iM55681;
        int i31;
        int i32;
        int i33;
        int i34;
        int iM55682;
        int i35;
        int i36;
        int i37;
        C19561 c19562 = c19561;
        C5738 c57312 = null;
        boolean z5 = false;
        byte[] bArrM4194 = null;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        Bitmap bitmapDecodeByteArray = null;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        short[] sArr13 = null;
        char c = 0;
        short s = 0;
        int i46 = 0;
        int i47 = 0;
        short s2 = 0;
        int i48 = -2119426277;
        int i49 = C0866.f81837;
        int i50 = C0877.f81843;
        int iM55683 = C0873.m55680("᩷ۧ") ^ i49;
        int i51 = ((iM55683 ^ i50) * (-30983)) ^ 874066215;
        int i52 = iM55683 ^ (-1479538678);
        short[] sArr14 = null;
        short[] sArr15 = null;
        short[] sArr16 = null;
        int i53 = 0;
        int i54 = 0;
        int i55 = 0;
        int i56 = 0;
        int i57 = 0;
        Bitmap bitmap = null;
        int i58 = 0;
        int i59 = 0;
        C5738 c5738M55694 = null;
        BitmapFactory.Options options5 = null;
        while (true) {
            i48 = i52 ^ (i51 & (((i48 ^ i50) * 31247) >> 31));
            switch (i48) {
                case -2007650038:
                case -545653114:
                    if (C0930.f81879 > 0) {
                        iM55682 = C0946.m55979("ۧ᩺") ^ i49;
                        i35 = ((iM55682 ^ i50) * (-20075)) ^ 830952983;
                        i36 = 1732003426;
                    } else {
                        iM55682 = (i49 - C0873.m55680("ܳۗ")) * (-47);
                        i35 = ((iM55682 ^ i50) * 24153) ^ 1669747490;
                        i36 = 1499111538;
                    }
                    i52 = iM55682 ^ i36;
                    i51 = i35;
                    break;
                case -1946953174:
                case -1284986722:
                    options2 = options5;
                    boolean z6 = z5 ? 1 : 0;
                    i7 = i57;
                    sArr4 = f82265;
                    i56 = 8;
                    if (C1044.f81959 >= 0) {
                        i8 = 192;
                        z2 = z6;
                        int iM55684 = (C0873.m55680("᩻ۧ") ^ i50) * 13;
                        short[] sArr17 = sArr4;
                        i52 = iM55684 ^ (-1316485481);
                        i57 = i7;
                        i51 = ((iM55684 ^ i49) * (-10165)) ^ (-1907939642);
                        options5 = options2;
                        sArr16 = sArr17;
                        boolean z7 = z2;
                        i55 = i8;
                        z5 = z7 ? 1 : 0;
                    } else {
                        int iM55685 = C0873.m55680("۬ۧ") ^ i49;
                        i52 = iM55685 ^ (-227847261);
                        i57 = i7;
                        i51 = ((iM55685 ^ i50) * 23089) ^ 1991798603;
                        z5 = z6 ? 1 : 0;
                        i55 = 192;
                        sArr16 = sArr4;
                        options5 = options2;
                    }
                    break;
                case -1941603808:
                case 1749648854:
                    sArr = sArr16;
                    int i60 = i57;
                    options = options5;
                    short[] sArr18 = sArr15;
                    i4 = i55;
                    c5738 = c57312;
                    z = z5 ? 1 : 0;
                    int i61 = i53;
                    bArr = bArrM4194;
                    i54 = 8;
                    if (!C1048.f81963) {
                        i3 = i60;
                        sArr2 = sArr18;
                        i = i61;
                        i6 = i59;
                        i2 = 8;
                        int iM559711 = C0946.m55979("֫᩸") ^ i50;
                        i51 = ((iM559711 ^ i49) * 8371) ^ 1830955411;
                        i37 = iM559711 ^ (-403322353);
                        i59 = i6;
                        c57312 = c5738;
                        bArrM4194 = bArr;
                        sArr15 = sArr2;
                        options5 = options;
                        z5 = z;
                        i55 = i4;
                        i54 = i2;
                        i53 = i;
                        i57 = i3;
                        i52 = i37;
                        sArr16 = sArr;
                        c19562 = c19561;
                    } else {
                        int iM559712 = C0946.m55979("۬۬") ^ i49;
                        int i62 = ((iM559712 ^ i50) * 3729) ^ (-1851712268);
                        i52 = iM559712 ^ (-543574769);
                        c57312 = c5738;
                        sArr15 = sArr18;
                        options5 = options;
                        sArr16 = sArr;
                        i34 = i4;
                        i57 = i60;
                        i51 = i62;
                        bArrM4194 = bArr;
                        i53 = i61;
                        z5 = z;
                        i55 = i34;
                    }
                    break;
                case -1889108360:
                case -722845949:
                    i = i53;
                    i2 = i54;
                    sArr = sArr16;
                    i3 = i57;
                    options = options5;
                    bArr = bArrM4194;
                    sArr2 = sArr15;
                    i4 = i55;
                    c5738 = c57312;
                    z = z5 ? 1 : 0;
                    i6 = i59;
                    sArr14 = f82265;
                    i58 = HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS;
                    if (C0949.f81897 < 0) {
                        int iM559713 = C0946.m55979("ܽܳ") ^ i50;
                        i23 = ((iM559713 ^ i49) * 9125) ^ (-168810418);
                        i59 = i6;
                        c57312 = c5738;
                        bArrM4194 = bArr;
                        sArr15 = sArr2;
                        z5 = z ? 1 : 0;
                        i55 = i4;
                        i54 = i2;
                        i53 = i;
                        i57 = i3;
                        i52 = iM559713 ^ 1988505441;
                        i51 = i23;
                        options5 = options;
                        sArr16 = sArr;
                    } else {
                        int iM559714 = C0946.m55979("֫᩸") ^ i50;
                        i51 = ((iM559714 ^ i49) * 8371) ^ 1830955411;
                        i37 = iM559714 ^ (-403322353);
                        i59 = i6;
                        c57312 = c5738;
                        bArrM4194 = bArr;
                        sArr15 = sArr2;
                        options5 = options;
                        z5 = z;
                        i55 = i4;
                        i54 = i2;
                        i53 = i;
                        i57 = i3;
                        i52 = i37;
                        sArr16 = sArr;
                        c19562 = c19561;
                    }
                    break;
                case -1840575799:
                case 1314506562:
                    if (C0898.f81858 > 0) {
                        i = i53;
                        i2 = i54;
                        sArr = sArr16;
                        i3 = i57;
                        options = options5;
                        bArr = bArrM4194;
                        sArr2 = sArr15;
                        i4 = i55;
                        sArr3 = sArr14;
                        i5 = i58;
                        c5738 = c57312;
                        z = z5 ? 1 : 0;
                        i6 = i59;
                        iM55979 = C0873.m55680("ۗܳ") ^ i50;
                        i51 = ((iM55979 ^ i49) * (-19919)) ^ (-1674126235);
                        i13 = -940859973;
                        i37 = iM55979 ^ i13;
                        sArr14 = sArr3;
                        i59 = i6;
                        i58 = i5;
                        c57312 = c5738;
                        bArrM4194 = bArr;
                        sArr15 = sArr2;
                        options5 = options;
                        z5 = z;
                        i55 = i4;
                        i54 = i2;
                        i53 = i;
                        i57 = i3;
                        i52 = i37;
                        sArr16 = sArr;
                        c19562 = c19561;
                    } else {
                        iM55682 = C0946.m55979("ۧ᩺") ^ i49;
                        i35 = ((iM55682 ^ i50) * (-20075)) ^ 830952983;
                        i36 = 1732003426;
                        i52 = iM55682 ^ i36;
                        i51 = i35;
                    }
                    break;
                case -1768517307:
                case 1286680130:
                    if (C1071.m56343() != 0) {
                        i = i53;
                        i2 = i54;
                        sArr = sArr16;
                        i3 = i57;
                        options = options5;
                        bArr = bArrM4194;
                        sArr2 = sArr15;
                        i4 = i55;
                        c5738 = c57312;
                        z = z5 ? 1 : 0;
                        i6 = i59;
                        int iM559715 = C0946.m55979("֫᩸") ^ i50;
                        i51 = ((iM559715 ^ i49) * 8371) ^ 1830955411;
                        i37 = iM559715 ^ (-403322353);
                        i59 = i6;
                        c57312 = c5738;
                        bArrM4194 = bArr;
                        sArr15 = sArr2;
                        options5 = options;
                        z5 = z;
                        i55 = i4;
                        i54 = i2;
                        i53 = i;
                        i57 = i3;
                        i52 = i37;
                        sArr16 = sArr;
                        c19562 = c19561;
                    }
                    i = i53;
                    i2 = i54;
                    sArr = sArr16;
                    i3 = i57;
                    options = options5;
                    bArr = bArrM4194;
                    sArr2 = sArr15;
                    i4 = i55;
                    sArr3 = sArr14;
                    i5 = i58;
                    c5738 = c57312;
                    z = z5 ? 1 : 0;
                    i6 = i59;
                    iM55979 = C0873.m55680("۬ۙ") ^ i50;
                    i51 = ((iM55979 ^ i49) * (-8773)) ^ 2121878410;
                    i13 = -1072299982;
                    i37 = iM55979 ^ i13;
                    sArr14 = sArr3;
                    i59 = i6;
                    i58 = i5;
                    c57312 = c5738;
                    bArrM4194 = bArr;
                    sArr15 = sArr2;
                    options5 = options;
                    z5 = z;
                    i55 = i4;
                    i54 = i2;
                    i53 = i;
                    i57 = i3;
                    i52 = i37;
                    sArr16 = sArr;
                    c19562 = c19561;
                    break;
                case -1693064763:
                case 759748827:
                    sArr = sArr16;
                    int i63 = i55;
                    i9 = i57;
                    options = options5;
                    z = z5 ? 1 : 0;
                    i10 = i63;
                    c5738M56013 = C0949.m56013(c19562, C1024.m56203(sArr, i63, i56, i9));
                    i11 = i53;
                    i12 = i54;
                    bArr2 = bArrM4194;
                    sArr12 = sArr15;
                    iM55681 = (C0946.m55979("۬ۤ") ^ i49) * (-121);
                    c5739 = c5738M56013;
                    i31 = ((iM55681 ^ i50) * 24735) ^ (-1656209195);
                    i32 = 1771817284;
                    i52 = iM55681 ^ i32;
                    bArrM4194 = bArr2;
                    i53 = i11;
                    z5 = z;
                    i55 = i10;
                    i57 = i9;
                    i51 = i31;
                    options5 = options;
                    sArr16 = sArr;
                    short[] sArr19 = sArr12;
                    i54 = i12;
                    c57312 = c5739;
                    sArr15 = sArr19;
                    break;
                case -1620606239:
                case 628940887:
                    try {
                        options5.inSampleSize *= 2;
                        i43 = i42 / 2;
                        i45 = i44 / 2;
                        iM55682 = C0946.m55979("ܰ֫") ^ i50;
                        i35 = ((iM55682 ^ i49) * 32723) ^ 2071555889;
                        i36 = -1791732600;
                    } catch (IOException unused) {
                        iM55682 = (i49 - C0873.m55680("᩻ܰ")) * 115;
                        i35 = ((iM55682 ^ i50) * (-10301)) ^ (-431439131);
                        i36 = -212047629;
                    }
                    i52 = iM55682 ^ i36;
                    i51 = i35;
                    break;
                case -1620165626:
                case 12205708:
                    sArr6 = sArr16;
                    int i64 = i57;
                    options3 = options5;
                    short[] sArr20 = sArr15;
                    i18 = i55;
                    c57310 = c57312;
                    z3 = z5 ? 1 : 0;
                    int i65 = i53;
                    int i66 = i54;
                    bArr3 = bArrM4194;
                    i17 = i64;
                    sArr7 = sArr20;
                    i16 = i66;
                    i15 = i65;
                    c5738M55694 = C0877.m55694(c19562, C0898.m55792(sArr20, i65, i66, i64));
                    sArr8 = sArr14;
                    i19 = i58;
                    i20 = i59;
                    iM55680 = (C0946.m55979("ۛ᩺") + i49) * (-109);
                    i21 = ((iM55680 ^ i50) * (-6523)) ^ 1190261932;
                    i22 = 458055357;
                    int i67 = iM55680 ^ i22;
                    sArr14 = sArr8;
                    i59 = i20;
                    i58 = i19;
                    c57312 = c57310;
                    bArrM4194 = bArr3;
                    sArr15 = sArr7;
                    options5 = options3;
                    i54 = i16;
                    i53 = i15;
                    i52 = i67;
                    i51 = i21;
                    sArr16 = sArr6;
                    z5 = z3;
                    i55 = i18;
                    i57 = i17;
                    break;
                case -1590886362:
                case -935867111:
                case 910206425:
                case 1471291839:
                    return bitmap;
                case -1584929014:
                case -358535486:
                    i15 = i53;
                    i16 = i54;
                    sArr6 = sArr16;
                    i17 = i57;
                    options3 = options5;
                    bArr3 = bArrM4194;
                    sArr7 = sArr15;
                    i18 = i55;
                    sArr8 = sArr14;
                    i19 = i58;
                    c57310 = c57312;
                    z3 = z5 ? 1 : 0;
                    i20 = i59;
                    bitmap = null;
                    if (c19562 == null) {
                        iM55680 = (i49 - C0946.m55979("ܶ᩻")) * (-111);
                        i21 = ((iM55680 ^ i50) * 25589) ^ (-979809065);
                        i22 = -317697731;
                    } else {
                        iM55680 = (C0873.m55680("֨ۘ") ^ i49) * (-103);
                        i21 = ((iM55680 ^ i50) * (-7541)) ^ 1265696537;
                        i22 = -1208568573;
                    }
                    int i68 = iM55680 ^ i22;
                    sArr14 = sArr8;
                    i59 = i20;
                    i58 = i19;
                    c57312 = c57310;
                    bArrM4194 = bArr3;
                    sArr15 = sArr7;
                    options5 = options3;
                    i54 = i16;
                    i53 = i15;
                    i52 = i68;
                    i51 = i21;
                    sArr16 = sArr6;
                    z5 = z3;
                    i55 = i18;
                    i57 = i17;
                    break;
                case -1584204842:
                case -176079696:
                    c5739 = c57312;
                    bArr2 = bArrM4194;
                    i12 = i54;
                    sArr = sArr16;
                    i9 = i57;
                    options = options5;
                    i10 = i55;
                    z = z5 ? 1 : 0;
                    sArr5 = f82265;
                    if (!C0955.m56025()) {
                        int iM559716 = C0946.m55979("᩷ܰ") ^ i50;
                        i33 = ((iM559716 ^ i49) * (-26531)) ^ (-1461490691);
                        i52 = iM559716 ^ (-435837870);
                        i54 = i12;
                        c57312 = c5739;
                        bArrM4194 = bArr2;
                        i53 = 184;
                        sArr15 = sArr5;
                        options5 = options;
                        sArr16 = sArr;
                        i34 = i10;
                        i57 = i9;
                        i51 = i33;
                        z5 = z;
                        i55 = i34;
                    } else {
                        i11 = 184;
                        iM55681 = C0946.m55979("ۢۨ") ^ i49;
                        sArr12 = sArr5;
                        i31 = ((iM55681 ^ i50) * (-12113)) ^ (-2069112811);
                        i32 = -971509137;
                        i52 = iM55681 ^ i32;
                        bArrM4194 = bArr2;
                        i53 = i11;
                        z5 = z;
                        i55 = i10;
                        i57 = i9;
                        i51 = i31;
                        options5 = options;
                        sArr16 = sArr;
                        short[] sArr110 = sArr12;
                        i54 = i12;
                        c57312 = c5739;
                        sArr15 = sArr110;
                    }
                    break;
                case -1495898053:
                case 988425155:
                    i = i53;
                    i2 = i54;
                    sArr = sArr16;
                    i3 = i57;
                    options = options5;
                    bArr = bArrM4194;
                    sArr2 = sArr15;
                    i4 = i55;
                    sArr3 = sArr14;
                    i5 = i58;
                    c5738 = c57312;
                    z = z5 ? 1 : 0;
                    i6 = i59;
                    c = 174;
                    if (C0906.m55809() <= 0) {
                        iM55979 = C0873.m55680("ۗܳ") ^ i50;
                        i51 = ((iM55979 ^ i49) * (-19919)) ^ (-1674126235);
                        i13 = -940859973;
                    } else {
                        iM55979 = (C0873.m55680("ۧ֫") + i50) * (-105);
                        i51 = ((iM55979 ^ i49) * 405) ^ (-751569581);
                        i13 = -1116509138;
                    }
                    i37 = iM55979 ^ i13;
                    sArr14 = sArr3;
                    i59 = i6;
                    i58 = i5;
                    c57312 = c5738;
                    bArrM4194 = bArr;
                    sArr15 = sArr2;
                    options5 = options;
                    z5 = z;
                    i55 = i4;
                    i54 = i2;
                    i53 = i;
                    i57 = i3;
                    i52 = i37;
                    sArr16 = sArr;
                    c19562 = c19561;
                    break;
                case -1455827117:
                case 655644746:
                    bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM4194, z5 ? 1 : 0, bArrM4194.length, options5);
                    iM55682 = (C0873.m55680("ۨܶ") + i49) * 39;
                    i35 = ((iM55682 ^ i50) * (-5159)) ^ 426836570;
                    i36 = -880028856;
                    i52 = iM55682 ^ i36;
                    i51 = i35;
                    break;
                case -1439821443:
                case 1235508378:
                    C1024.m56209();
                    if (C1003.f81929 <= 0) {
                        iM55682 = C0946.m55979("ۧ᩺") ^ i49;
                        i35 = ((iM55682 ^ i50) * (-20075)) ^ 830952983;
                        i36 = 1732003426;
                        i52 = iM55682 ^ i36;
                        i51 = i35;
                    } else {
                        i24 = i53;
                        i25 = i54;
                        sArr9 = sArr16;
                        i26 = i57;
                        options4 = options5;
                        bArr4 = bArrM4194;
                        sArr10 = sArr15;
                        i27 = i55;
                        sArr11 = sArr14;
                        i28 = i58;
                        c57311 = c57312;
                        z4 = z5 ? 1 : 0;
                        iM559710 = (C0946.m55979("ܽܰ") + i49) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i29 = ((iM559710 ^ i50) * (-24083)) ^ 662704394;
                        i30 = 1538763079;
                        int i69 = iM559710 ^ i30;
                        sArr14 = sArr11;
                        i58 = i28;
                        bArrM4194 = bArr4;
                        options5 = options4;
                        z5 = z4;
                        i55 = i27;
                        i53 = i24;
                        i57 = i26;
                        i52 = i69;
                        i51 = i29;
                        sArr16 = sArr9;
                        c57312 = c57311;
                        sArr15 = sArr10;
                        i54 = i25;
                    }
                    break;
                case -1391833629:
                case 812638379:
                    return bitmap;
                case -1267682610:
                case 474439673:
                    i = i53;
                    i2 = i54;
                    sArr = sArr16;
                    i3 = i57;
                    options = options5;
                    bArr = bArrM4194;
                    sArr2 = sArr15;
                    i4 = i55;
                    sArr3 = sArr14;
                    i5 = i58;
                    c5738 = c57312;
                    z = z5 ? 1 : 0;
                    i6 = i59;
                    s = sArr13[c];
                    i46 = s * s;
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0946.m55979("᩹ۙ") ^ i49;
                        i51 = ((iM55979 ^ i50) * 14929) ^ (-545711111);
                        i13 = 1236729030;
                    } else {
                        iM55979 = (i50 - C0873.m55680("۬᩹")) * (-85);
                        i51 = ((iM55979 ^ i49) * 32591) ^ (-739819678);
                        i13 = 357337508;
                    }
                    i37 = iM55979 ^ i13;
                    sArr14 = sArr3;
                    i59 = i6;
                    i58 = i5;
                    c57312 = c5738;
                    bArrM4194 = bArr;
                    sArr15 = sArr2;
                    options5 = options;
                    z5 = z;
                    i55 = i4;
                    i54 = i2;
                    i53 = i;
                    i57 = i3;
                    i52 = i37;
                    sArr16 = sArr;
                    c19562 = c19561;
                    break;
                case -1205870574:
                case 1606205044:
                    C0930.m55885();
                    i24 = i53;
                    i25 = i54;
                    sArr9 = sArr16;
                    i26 = i57;
                    options4 = options5;
                    bArr4 = bArrM4194;
                    sArr10 = sArr15;
                    i27 = i55;
                    sArr11 = sArr14;
                    i28 = i58;
                    c57311 = c57312;
                    z4 = z5 ? 1 : 0;
                    iM559710 = (C0946.m55979("ܽܰ") + i49) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i29 = ((iM559710 ^ i50) * (-24083)) ^ 662704394;
                    i30 = 1538763079;
                    int i610 = iM559710 ^ i30;
                    sArr14 = sArr11;
                    i58 = i28;
                    bArrM4194 = bArr4;
                    options5 = options4;
                    z5 = z4;
                    i55 = i27;
                    i53 = i24;
                    i57 = i26;
                    i52 = i610;
                    i51 = i29;
                    sArr16 = sArr9;
                    c57312 = c57311;
                    sArr15 = sArr10;
                    i54 = i25;
                    break;
                case -1182053262:
                case 555871914:
                    i = i53;
                    i2 = i54;
                    sArr = sArr16;
                    i3 = i57;
                    options = options5;
                    bArr = bArrM4194;
                    sArr2 = sArr15;
                    i4 = i55;
                    sArr3 = sArr14;
                    i5 = i58;
                    c5738 = c57312;
                    z = z5 ? 1 : 0;
                    i6 = i59;
                    s2 = 458;
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0873.m55680("۬ۙ") ^ i50;
                        i51 = ((iM55979 ^ i49) * (-8773)) ^ 2121878410;
                        i13 = -1072299982;
                    } else {
                        iM55979 = C0946.m55979("ۙۧ") ^ i50;
                        i51 = ((iM55979 ^ i49) * (-30877)) ^ (-1787530097);
                        i13 = -578587422;
                    }
                    i37 = iM55979 ^ i13;
                    sArr14 = sArr3;
                    i59 = i6;
                    i58 = i5;
                    c57312 = c5738;
                    bArrM4194 = bArr;
                    sArr15 = sArr2;
                    options5 = options;
                    z5 = z;
                    i55 = i4;
                    i54 = i2;
                    i53 = i;
                    i57 = i3;
                    i52 = i37;
                    sArr16 = sArr;
                    c19562 = c19561;
                    break;
                case -1164505887:
                case -228473741:
                    z5 = false;
                    z5 = false;
                    bArrM4194 = C2700.m4194(C1024.m56204(c19562, c57312), 0);
                    try {
                        options5 = new BitmapFactory.Options();
                        i38 = 1;
                        options5.inJustDecodeBounds = true;
                        BitmapFactory.decodeByteArray(bArrM4194, 0, bArrM4194.length, options5);
                        i39 = options5.outWidth;
                        i40 = options5.outHeight;
                        iM55682 = (C0873.m55680("ۖܽ") ^ i49) * 9;
                        i35 = ((iM55682 ^ i50) * 53) ^ 1244654881;
                        i36 = 633154386;
                    } catch (IOException unused2) {
                        options5 = null;
                        iM55682 = (i49 - C0873.m55680("᩻ܰ")) * 115;
                        i35 = ((iM55682 ^ i50) * (-10301)) ^ (-431439131);
                        i36 = -212047629;
                    }
                    i52 = iM55682 ^ i36;
                    i51 = i35;
                    break;
                case -918747659:
                case 653544167:
                    options5.inSampleSize = i38;
                    options5.inPreferredConfig = Bitmap.Config.RGB_565;
                    i42 = i39;
                    i44 = i40;
                    iM55682 = (C0946.m55979("۠᩹") + i49) * (-41);
                    i35 = ((iM55682 ^ i50) * 15689) ^ (-1339498857);
                    i36 = 1716271699;
                    i52 = iM55682 ^ i36;
                    i51 = i35;
                    break;
                case -841479998:
                case -549765532:
                    if (i45 <= i41) {
                        iM55682 = C0946.m55979("ᩳܿ") ^ i50;
                        i35 = ((iM55682 ^ i49) * 7181) ^ (-576779629);
                        i36 = -1453819525;
                    } else {
                        i42 = i43;
                        i44 = i45;
                        iM55682 = (C0946.m55979("۠᩹") + i49) * (-41);
                        i35 = ((iM55682 ^ i50) * 15689) ^ (-1339498857);
                        i36 = 1716271699;
                    }
                    i52 = iM55682 ^ i36;
                    i51 = i35;
                    break;
                case -742814697:
                case 422869034:
                    if (C1044.m56286() > 0) {
                        i7 = i57;
                        short[] sArr21 = sArr16;
                        options2 = options5;
                        sArr4 = sArr21;
                        int i70 = i55;
                        z2 = z5 ? 1 : 0;
                        i8 = i70;
                        int iM55686 = (C0873.m55680("᩻ۧ") ^ i50) * 13;
                        short[] sArr111 = sArr4;
                        i52 = iM55686 ^ (-1316485481);
                        i57 = i7;
                        i51 = ((iM55686 ^ i49) * (-10165)) ^ (-1907939642);
                        options5 = options2;
                        sArr16 = sArr111;
                        boolean z8 = z2;
                        i55 = i8;
                        z5 = z8 ? 1 : 0;
                    } else {
                        i = i53;
                        i2 = i54;
                        sArr = sArr16;
                        i3 = i57;
                        options = options5;
                        bArr = bArrM4194;
                        sArr2 = sArr15;
                        i4 = i55;
                        sArr3 = sArr14;
                        i5 = i58;
                        c5738 = c57312;
                        z = z5 ? 1 : 0;
                        i6 = i59;
                        iM55979 = C0873.m55680("ۗܳ") ^ i50;
                        i51 = ((iM55979 ^ i49) * (-19919)) ^ (-1674126235);
                        i13 = -940859973;
                        i37 = iM55979 ^ i13;
                        sArr14 = sArr3;
                        i59 = i6;
                        i58 = i5;
                        c57312 = c5738;
                        bArrM4194 = bArr;
                        sArr15 = sArr2;
                        options5 = options;
                        z5 = z;
                        i55 = i4;
                        i54 = i2;
                        i53 = i;
                        i57 = i3;
                        i52 = i37;
                        sArr16 = sArr;
                        c19562 = c19561;
                    }
                    break;
                case -717171692:
                case -252345781:
                    i = i53;
                    i2 = i54;
                    sArr = sArr16;
                    i3 = i57;
                    options = options5;
                    bArr = bArrM4194;
                    sArr2 = sArr15;
                    i4 = i55;
                    sArr3 = sArr14;
                    i5 = i58;
                    c5738 = c57312;
                    z = z5 ? 1 : 0;
                    i6 = i59;
                    i47 = i46 + 52441;
                    if (!C0912.m55833()) {
                        iM55979 = (C0873.m55680("۫ۡ") ^ i49) * 123;
                        i51 = ((iM55979 ^ i50) * 21965) ^ (-468172774);
                        i13 = 389160829;
                        i37 = iM55979 ^ i13;
                        sArr14 = sArr3;
                        i59 = i6;
                        i58 = i5;
                        c57312 = c5738;
                        bArrM4194 = bArr;
                        sArr15 = sArr2;
                        options5 = options;
                        z5 = z;
                        i55 = i4;
                        i54 = i2;
                        i53 = i;
                        i57 = i3;
                        i52 = i37;
                        sArr16 = sArr;
                        c19562 = c19561;
                    } else {
                        sArr14 = sArr3;
                        i58 = i5;
                        int iM559717 = C0946.m55979("֫᩸") ^ i50;
                        i51 = ((iM559717 ^ i49) * 8371) ^ 1830955411;
                        i37 = iM559717 ^ (-403322353);
                        i59 = i6;
                        c57312 = c5738;
                        bArrM4194 = bArr;
                        sArr15 = sArr2;
                        options5 = options;
                        z5 = z;
                        i55 = i4;
                        i54 = i2;
                        i53 = i;
                        i57 = i3;
                        i52 = i37;
                        sArr16 = sArr;
                        c19562 = c19561;
                    }
                    break;
                case -697885976:
                case 992007445:
                    if (C0930.f81879 > 0) {
                        sArr = sArr16;
                        i9 = i57;
                        options = options5;
                        sArr5 = sArr15;
                        i10 = i55;
                        c5739 = c57312;
                        z = z5 ? 1 : 0;
                        i11 = i53;
                        i12 = i54;
                        bArr2 = bArrM4194;
                        iM55681 = C0946.m55979("ۢۨ") ^ i49;
                        sArr12 = sArr5;
                        i31 = ((iM55681 ^ i50) * (-12113)) ^ (-2069112811);
                        i32 = -971509137;
                        i52 = iM55681 ^ i32;
                        bArrM4194 = bArr2;
                        i53 = i11;
                        z5 = z;
                        i55 = i10;
                        i57 = i9;
                        i51 = i31;
                        options5 = options;
                        sArr16 = sArr;
                        short[] sArr112 = sArr12;
                        i54 = i12;
                        c57312 = c5739;
                        sArr15 = sArr112;
                    } else {
                        i7 = i57;
                        short[] sArr22 = sArr16;
                        options2 = options5;
                        sArr4 = sArr22;
                        int i71 = i55;
                        z2 = z5 ? 1 : 0;
                        i8 = i71;
                        int iM55687 = (C0873.m55680("᩻ۧ") ^ i50) * 13;
                        short[] sArr113 = sArr4;
                        i52 = iM55687 ^ (-1316485481);
                        i57 = i7;
                        i51 = ((iM55687 ^ i49) * (-10165)) ^ (-1907939642);
                        options5 = options2;
                        sArr16 = sArr113;
                        boolean z9 = z2;
                        i55 = i8;
                        z5 = z9 ? 1 : 0;
                    }
                    break;
                case -632530712:
                case -155129966:
                    i14 = 48991;
                    int iM559718 = C0946.m55979("ᩳ֨") ^ i49;
                    int i72 = ((iM559718 ^ i50) * (-6565)) ^ (-343383135);
                    sArr14 = sArr14;
                    i59 = i59;
                    i58 = i58;
                    c57312 = c57312;
                    bArrM4194 = bArrM4194;
                    sArr15 = sArr15;
                    options5 = options5;
                    i54 = i54;
                    i53 = i53;
                    i52 = iM559718 ^ 897663316;
                    sArr16 = sArr16;
                    z5 = z5 ? 1 : 0;
                    i55 = i55;
                    i57 = i14;
                    i51 = i72;
                    c19562 = c19561;
                    break;
                case -616646466:
                case 1404547987:
                    if (i40 <= 0) {
                        iM55682 = (i49 - C0873.m55680("᩻ܰ")) * 115;
                        i35 = ((iM55682 ^ i50) * (-10301)) ^ (-431439131);
                        i36 = -212047629;
                    } else {
                        iM55682 = (i50 - C0873.m55680("۬ۡ")) * (-77);
                        i35 = ((iM55682 ^ i49) * (-26993)) ^ (-1910334655);
                        i36 = 975979910;
                    }
                    i52 = iM55682 ^ i36;
                    i51 = i35;
                    break;
                case -601259888:
                case -423378789:
                    sArr = sArr16;
                    i9 = i57;
                    options = options5;
                    short[] sArr23 = sArr15;
                    i10 = i55;
                    c5739 = c57312;
                    z = z5 ? 1 : 0;
                    i11 = i53;
                    i12 = i54;
                    bArr2 = bArrM4194;
                    if (c5738M55694 == null) {
                        iM55681 = (C0873.m55680("۟ܺ") ^ i50) * (-93);
                        sArr12 = sArr23;
                        i31 = ((iM55681 ^ i49) * (-9175)) ^ 1007630189;
                        i32 = -956899816;
                    } else {
                        sArr12 = sArr23;
                        c5738M56013 = c5738M55694;
                        iM55681 = (C0946.m55979("۬ۤ") ^ i49) * (-121);
                        c5739 = c5738M56013;
                        i31 = ((iM55681 ^ i50) * 24735) ^ (-1656209195);
                        i32 = 1771817284;
                    }
                    i52 = iM55681 ^ i32;
                    bArrM4194 = bArr2;
                    i53 = i11;
                    z5 = z;
                    i55 = i10;
                    i57 = i9;
                    i51 = i31;
                    options5 = options;
                    sArr16 = sArr;
                    short[] sArr114 = sArr12;
                    i54 = i12;
                    c57312 = c5739;
                    sArr15 = sArr114;
                    break;
                case -509027431:
                case -156109812:
                    sArr = sArr16;
                    i9 = i57;
                    options = options5;
                    i10 = i55;
                    int i73 = i56;
                    z = z5 ? 1 : 0;
                    if (c57312 != null) {
                        i56 = i73;
                        int iM55688 = C0873.m55680("ܺ᩸") ^ i50;
                        i33 = ((iM55688 ^ i49) * 4871) ^ 57988146;
                        i52 = iM55688 ^ 2083398672;
                        options5 = options;
                        sArr16 = sArr;
                        i34 = i10;
                        i57 = i9;
                        i51 = i33;
                        z5 = z;
                        i55 = i34;
                    } else {
                        int iM559719 = (i50 - C0946.m55979("֨᩶")) * 77;
                        i56 = i73;
                        i23 = ((iM559719 ^ i49) * (-10335)) ^ 21227609;
                        i52 = iM559719 ^ 1822631909;
                        z5 = z ? 1 : 0;
                        i55 = i10;
                        i57 = i9;
                        i51 = i23;
                        options5 = options;
                        sArr16 = sArr;
                    }
                    break;
                case -282065202:
                case 1405924817:
                    i = i53;
                    i2 = i54;
                    sArr = sArr16;
                    i3 = i57;
                    options = options5;
                    bArr = bArrM4194;
                    sArr2 = sArr15;
                    i4 = i55;
                    sArr3 = sArr14;
                    i5 = i58;
                    c5738 = c57312;
                    z = z5 ? 1 : 0;
                    i6 = i59;
                    if ((s * s2) - i47 > 0) {
                        iM55979 = (C0873.m55680("ܽܺ") ^ i50) * (-101);
                        i51 = ((iM55979 ^ i49) * (-4561)) ^ (-1225327872);
                        i13 = -2014820507;
                    } else {
                        iM55979 = C0946.m55979("ۖۨ") ^ i49;
                        i51 = ((iM55979 ^ i50) * 13341) ^ 1801599590;
                        i13 = 702769987;
                    }
                    i37 = iM55979 ^ i13;
                    sArr14 = sArr3;
                    i59 = i6;
                    i58 = i5;
                    c57312 = c5738;
                    bArrM4194 = bArr;
                    sArr15 = sArr2;
                    options5 = options;
                    z5 = z;
                    i55 = i4;
                    i54 = i2;
                    i53 = i;
                    i57 = i3;
                    i52 = i37;
                    sArr16 = sArr;
                    c19562 = c19561;
                    break;
                case -214869784:
                case 1570290661:
                    i14 = 43730;
                    int iM5597110 = C0946.m55979("ᩳ֨") ^ i49;
                    int i74 = ((iM5597110 ^ i50) * (-6565)) ^ (-343383135);
                    sArr14 = sArr14;
                    i59 = i59;
                    i58 = i58;
                    c57312 = c57312;
                    bArrM4194 = bArrM4194;
                    sArr15 = sArr15;
                    options5 = options5;
                    i54 = i54;
                    i53 = i53;
                    i52 = iM5597110 ^ 897663316;
                    sArr16 = sArr16;
                    z5 = z5 ? 1 : 0;
                    i55 = i55;
                    i57 = i14;
                    i51 = i74;
                    c19562 = c19561;
                    break;
                case -120990998:
                case 1531436044:
                    i24 = i53;
                    i25 = i54;
                    sArr9 = sArr16;
                    i26 = i57;
                    options4 = options5;
                    bArr4 = bArrM4194;
                    sArr10 = sArr15;
                    i27 = i55;
                    sArr11 = sArr14;
                    i28 = i58;
                    c57311 = c57312;
                    z4 = z5 ? 1 : 0;
                    i59 = 9;
                    if (C1017.m56187() <= 0) {
                        iM559710 = (C0946.m55979("ܽܰ") + i49) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i29 = ((iM559710 ^ i50) * (-24083)) ^ 662704394;
                        i30 = 1538763079;
                    } else {
                        iM559710 = C0946.m55979("ۛ۫") ^ i50;
                        i29 = ((iM559710 ^ i49) * (-24271)) ^ 1883173702;
                        i30 = -1637084656;
                    }
                    int i611 = iM559710 ^ i30;
                    sArr14 = sArr11;
                    i58 = i28;
                    bArrM4194 = bArr4;
                    options5 = options4;
                    z5 = z4;
                    i55 = i27;
                    i53 = i24;
                    i57 = i26;
                    i52 = i611;
                    i51 = i29;
                    sArr16 = sArr9;
                    c57312 = c57311;
                    sArr15 = sArr10;
                    i54 = i25;
                    break;
                case -57524225:
                case 889717279:
                    return bitmapDecodeByteArray;
                case -41755370:
                case 1389223514:
                    if (i39 > 0) {
                        iM55682 = (C0946.m55979("֡ܽ") + i50) * 57;
                        i35 = ((iM55682 ^ i49) * 12933) ^ 509610167;
                        i36 = -59575102;
                    } else {
                        iM55682 = (i49 - C0873.m55680("᩻ܰ")) * 115;
                        i35 = ((iM55682 ^ i50) * (-10301)) ^ (-431439131);
                        i36 = -212047629;
                    }
                    i52 = iM55682 ^ i36;
                    i51 = i35;
                    break;
                case -27469793:
                case 1483828734:
                    i41 = 600;
                    if (i39 <= 600) {
                        iM55682 = (C0946.m55979("ᩳۙ") + i50) * (-71);
                        i35 = ((iM55682 ^ i49) * (-28139)) ^ 1124841022;
                        i36 = -1575491765;
                    } else {
                        iM55682 = C0946.m55979("᩶᩷") ^ i49;
                        i35 = ((iM55682 ^ i50) * (-177)) ^ 1576422595;
                        i36 = -103525851;
                    }
                    i52 = iM55682 ^ i36;
                    i51 = i35;
                    break;
                case 140215550:
                case 234795018:
                    options5.inJustDecodeBounds = z5;
                    iM55682 = C0873.m55680("᩵ۜ") ^ i49;
                    i35 = ((iM55682 ^ i50) * 30635) ^ (-1812162222);
                    i36 = -2024734470;
                    i52 = iM55682 ^ i36;
                    i51 = i35;
                    break;
                case 270783357:
                case 696912437:
                    i15 = i53;
                    i16 = i54;
                    sArr6 = sArr16;
                    int i75 = i57;
                    options3 = options5;
                    bArr3 = bArrM4194;
                    sArr7 = sArr15;
                    i18 = i55;
                    sArr8 = sArr14;
                    i19 = i58;
                    c57310 = c57312;
                    z3 = z5 ? 1 : 0;
                    i20 = i59;
                    C5738 c5738M55695 = C0877.m55694(c19562, C0927.m55863(sArr8, i19, i20, i75));
                    if (c5738M55695 == null) {
                        int iM559720 = C0946.m55979("ܿ᩵") ^ i50;
                        i17 = i75;
                        i51 = ((iM559720 ^ i49) * (-26773)) ^ 625866558;
                        sArr14 = sArr8;
                        i59 = i20;
                        i58 = i19;
                        c57312 = c57310;
                        bArrM4194 = bArr3;
                        sArr15 = sArr7;
                        options5 = options3;
                        i54 = i16;
                        i53 = i15;
                        i52 = iM559720 ^ 2077154747;
                    } else {
                        i17 = i75;
                        c5738M55694 = c5738M55695;
                        iM55680 = (C0946.m55979("ۛ᩺") + i49) * (-109);
                        i21 = ((iM55680 ^ i50) * (-6523)) ^ 1190261932;
                        i22 = 458055357;
                        int i612 = iM55680 ^ i22;
                        sArr14 = sArr8;
                        i59 = i20;
                        i58 = i19;
                        c57312 = c57310;
                        bArrM4194 = bArr3;
                        sArr15 = sArr7;
                        options5 = options3;
                        i54 = i16;
                        i53 = i15;
                        i52 = i612;
                        i51 = i21;
                    }
                    sArr16 = sArr6;
                    z5 = z3;
                    i55 = i18;
                    i57 = i17;
                    break;
                case 461089518:
                case 1679434720:
                    if (i43 <= i41) {
                        iM55682 = (C0946.m55979("᩺ܺ") + i50) * (-47);
                        i35 = ((iM55682 ^ i49) * 22649) ^ 1565945496;
                        i36 = 322582639;
                    } else {
                        i42 = i43;
                        i44 = i45;
                        iM55682 = (C0946.m55979("۠᩹") + i49) * (-41);
                        i35 = ((iM55682 ^ i50) * 15689) ^ (-1339498857);
                        i36 = 1716271699;
                    }
                    i52 = iM55682 ^ i36;
                    i51 = i35;
                    break;
                case 597078689:
                case 1426920436:
                    C0894.m55769();
                    return null;
                case 624792128:
                case 763644886:
                    if (i40 > i41) {
                        iM55682 = C0946.m55979("᩶᩷") ^ i49;
                        i35 = ((iM55682 ^ i50) * (-177)) ^ 1576422595;
                        i36 = -103525851;
                    } else {
                        iM55682 = C0946.m55979("ᩳܿ") ^ i50;
                        i35 = ((iM55682 ^ i49) * 7181) ^ (-576779629);
                        i36 = -1453819525;
                    }
                    i52 = iM55682 ^ i36;
                    i51 = i35;
                    break;
                case 902087709:
                case 1375195229:
                    if (C0873.f81841 <= 0) {
                        i = i53;
                        i2 = i54;
                        sArr = sArr16;
                        i3 = i57;
                        options = options5;
                        bArr = bArrM4194;
                        sArr2 = sArr15;
                        i4 = i55;
                        sArr3 = sArr14;
                        i5 = i58;
                        c5738 = c57312;
                        z = z5 ? 1 : 0;
                        i6 = i59;
                        iM55979 = C0873.m55680("۬ۙ") ^ i50;
                        i51 = ((iM55979 ^ i49) * (-8773)) ^ 2121878410;
                        i13 = -1072299982;
                        i37 = iM55979 ^ i13;
                        sArr14 = sArr3;
                        i59 = i6;
                        i58 = i5;
                        c57312 = c5738;
                        bArrM4194 = bArr;
                        sArr15 = sArr2;
                        options5 = options;
                        z5 = z;
                        i55 = i4;
                        i54 = i2;
                        i53 = i;
                        i57 = i3;
                        i52 = i37;
                        sArr16 = sArr;
                        c19562 = c19561;
                    } else {
                        i24 = i53;
                        i25 = i54;
                        sArr9 = sArr16;
                        i26 = i57;
                        options4 = options5;
                        bArr4 = bArrM4194;
                        sArr10 = sArr15;
                        i27 = i55;
                        sArr11 = sArr14;
                        i28 = i58;
                        c57311 = c57312;
                        z4 = z5 ? 1 : 0;
                        iM559710 = (C0946.m55979("ܽܰ") + i49) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i29 = ((iM559710 ^ i50) * (-24083)) ^ 662704394;
                        i30 = 1538763079;
                        int i613 = iM559710 ^ i30;
                        sArr14 = sArr11;
                        i58 = i28;
                        bArrM4194 = bArr4;
                        options5 = options4;
                        z5 = z4;
                        i55 = i27;
                        i53 = i24;
                        i57 = i26;
                        i52 = i613;
                        i51 = i29;
                        sArr16 = sArr9;
                        c57312 = c57311;
                        sArr15 = sArr10;
                        i54 = i25;
                    }
                    break;
                case 1516669600:
                case 2029020505:
                    i = i53;
                    i2 = i54;
                    sArr = sArr16;
                    i3 = i57;
                    options = options5;
                    bArr = bArrM4194;
                    sArr2 = sArr15;
                    i4 = i55;
                    sArr3 = sArr14;
                    i5 = i58;
                    c5738 = c57312;
                    z = z5 ? 1 : 0;
                    i6 = i59;
                    sArr13 = f82265;
                    if (C0861.f81831) {
                        iM55979 = C0873.m55680("᩷᩹") ^ i49;
                        i51 = ((iM55979 ^ i50) * 6225) ^ (-1336159676);
                        i13 = 2046193882;
                    } else {
                        iM55979 = (C0946.m55979("ۚۤ") ^ i49) * 127;
                        i51 = ((iM55979 ^ i50) * (-24037)) ^ 759707795;
                        i13 = 1690570207;
                    }
                    i37 = iM55979 ^ i13;
                    sArr14 = sArr3;
                    i59 = i6;
                    i58 = i5;
                    c57312 = c5738;
                    bArrM4194 = bArr;
                    sArr15 = sArr2;
                    options5 = options;
                    z5 = z;
                    i55 = i4;
                    i54 = i2;
                    i53 = i;
                    i57 = i3;
                    i52 = i37;
                    sArr16 = sArr;
                    c19562 = c19561;
                    break;
                default:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        i = i53;
                        i2 = i54;
                        sArr = sArr16;
                        i3 = i57;
                        options = options5;
                        bArr = bArrM4194;
                        sArr2 = sArr15;
                        i4 = i55;
                        sArr3 = sArr14;
                        i5 = i58;
                        c5738 = c57312;
                        z = z5 ? 1 : 0;
                        i6 = i59;
                        iM55979 = (C0946.m55979("ۚۤ") ^ i49) * 127;
                        i51 = ((iM55979 ^ i50) * (-24037)) ^ 759707795;
                        i13 = 1690570207;
                        i37 = iM55979 ^ i13;
                        sArr14 = sArr3;
                        i59 = i6;
                        i58 = i5;
                        c57312 = c5738;
                        bArrM4194 = bArr;
                        sArr15 = sArr2;
                        options5 = options;
                        z5 = z;
                        i55 = i4;
                        i54 = i2;
                        i53 = i;
                        i57 = i3;
                        i52 = i37;
                        sArr16 = sArr;
                        c19562 = c19561;
                    } else {
                        i7 = i57;
                        short[] sArr24 = sArr16;
                        options2 = options5;
                        sArr4 = sArr24;
                        int i76 = i55;
                        z2 = z5 ? 1 : 0;
                        i8 = i76;
                        int iM55689 = (C0873.m55680("᩻ۧ") ^ i50) * 13;
                        short[] sArr115 = sArr4;
                        i52 = iM55689 ^ (-1316485481);
                        i57 = i7;
                        i51 = ((iM55689 ^ i49) * (-10165)) ^ (-1907939642);
                        options5 = options2;
                        sArr16 = sArr115;
                        boolean z10 = z2;
                        i55 = i8;
                        z5 = z10 ? 1 : 0;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ۤ᩻᩷, l.ᩳܰۡ] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX INFO: renamed from: ֫ */
    public final void m41525() {
        Object obj = null;
        ?? r1 = 0;
        int i = 1808574260;
        int i2 = AbstractC0942.f81890;
        int i3 = ServiceConnectionC1013.f81940;
        int iM55680 = C0873.m55680("ܽ᩶") ^ i2;
        int i4 = ((iM55680 ^ i3) * (-26501)) ^ 633986601;
        int i5 = -223631184;
        while (true) {
            i = ((((i ^ i3) * 21693) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1829541025:
                case 1580104513:
                    if (obj instanceof C19561) {
                        iM55680 = C0946.m55979("ܶ۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-6995)) ^ 35883253;
                        i5 = 2104268596;
                    } else {
                        iM55680 = (C0946.m55979("ᩳ᩺") ^ i2) * 31;
                        i4 = ((iM55680 ^ i3) * 25397) ^ (-311231934);
                        i5 = -386506730;
                    }
                    break;
                case -1806842991:
                case -113478420:
                    RunnableC0871.m55672();
                    if (!C0949.m56012()) {
                        iM55680 = C0873.m55680("֡ۙ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 19977) ^ (-9017223);
                        i5 = -1816639704;
                    } else {
                        iM55680 = C0946.m55979("᩺᩺") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-31783)) ^ (-288004850);
                        i5 = -342878279;
                    }
                    break;
                case -1770513782:
                case 786034452:
                    C1028.m56249(this.f54485);
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0946.m55979("᩺᩺") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-31783)) ^ (-288004850);
                        i5 = -342878279;
                    } else {
                        iM55680 = (C0873.m55680("۠֡") + i2) * (-25);
                        i4 = ((iM55680 ^ i3) * 2801) ^ (-1748915921);
                        i5 = -792464595;
                    }
                    break;
                case -1762137502:
                case 1787567588:
                    if (C0866.f81837 >= 0) {
                        iM55680 = C0873.m55680("֡ۙ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 19977) ^ (-9017223);
                        i5 = -1816639704;
                    } else {
                        iM55680 = C0873.m55680("᩵ۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27615)) ^ (-958140665);
                        i5 = 244324191;
                    }
                    break;
                case -1648269127:
                case 734461634:
                    C1028.m56249((Closeable) obj);
                    if (C1017.f81942 >= 0) {
                        iM55680 = (C0873.m55680("ۘۖ") ^ i3) * 47;
                        i4 = ((iM55680 ^ i2) * (-22927)) ^ (-1600039080);
                        i5 = -1065697230;
                    } else {
                        iM55680 = (C0946.m55979("᩻۠") ^ i3) * (-47);
                        i4 = ((iM55680 ^ i2) * (-7229)) ^ 830355504;
                        i5 = 1360008171;
                    }
                    break;
                case -1543381526:
                case 252938221:
                    obj = this.f54487;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = (i3 - C0946.m55979("ۢܳ")) * 39;
                        i4 = ((iM55680 ^ i2) * 8387) ^ 1062798448;
                        i5 = 565196567;
                    } else {
                        iM55680 = (C0946.m55979("ۢ᩸") + i2) * (-107);
                        i4 = ((iM55680 ^ i3) * (-23943)) ^ (-1608034420);
                        i5 = 1063150294;
                    }
                    break;
                case -1437618225:
                case -1120282758:
                    C1071.m56343();
                    if (C1053.f81965 > 0) {
                        iM55680 = (i3 - C0946.m55979("ۢܳ")) * 39;
                        i4 = ((iM55680 ^ i2) * 8387) ^ 1062798448;
                        i5 = 565196567;
                    } else {
                        iM55680 = (C0873.m55680("ۘۖ") ^ i3) * 47;
                        i4 = ((iM55680 ^ i2) * (-22927)) ^ (-1600039080);
                        i5 = -1065697230;
                    }
                    break;
                case -1016619559:
                case 1839800018:
                    if (C1028.f81950 <= 0) {
                        iM55680 = C0946.m55979("᩺᩺") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-31783)) ^ (-288004850);
                        i5 = -342878279;
                    } else {
                        iM55680 = (i3 - C0946.m55979("᩹ۘ")) * (-71);
                        i4 = ((iM55680 ^ i2) * 4361) ^ (-2029836060);
                        i5 = 370021736;
                    }
                    break;
                case -988643853:
                case 418804361:
                    C1025.m56230();
                    iM55680 = (C0873.m55680("ۘۖ") ^ i3) * 47;
                    i4 = ((iM55680 ^ i2) * (-22927)) ^ (-1600039080);
                    i5 = -1065697230;
                    break;
                case -595468600:
                case 1480172494:
                    if (C1053.f81965 <= 0) {
                        iM55680 = (C0873.m55680("ۘۖ") ^ i3) * 47;
                        i4 = ((iM55680 ^ i2) * (-22927)) ^ (-1600039080);
                        i5 = -1065697230;
                    } else {
                        iM55680 = (C0946.m55979("۫᩷") ^ i3) * 19;
                        i4 = ((iM55680 ^ i2) * (-16673)) ^ (-1961483774);
                        i5 = 1429403469;
                    }
                    break;
                case -315793392:
                case 470864837:
                    this.f54485 = r1;
                    this.f54494 = r1;
                    break;
                case -116414693:
                case 2072990658:
                    if (C1053.f81965 <= 0) {
                        iM55680 = (C0873.m55680("ۘۖ") ^ i3) * 47;
                        i4 = ((iM55680 ^ i2) * (-22927)) ^ (-1600039080);
                        i5 = -1065697230;
                    } else {
                        iM55680 = C0946.m55979("᩻᩵") ^ i3;
                        i4 = ((iM55680 ^ i2) * 32145) ^ (-1839470916);
                        i5 = -1876313306;
                    }
                    break;
                case 84909995:
                case 617051110:
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0946.m55979("᩺᩺") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-31783)) ^ (-288004850);
                        i5 = -342878279;
                    } else {
                        iM55680 = C0946.m55979("۫᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * 21837) ^ (-527993154);
                        i5 = 2046881785;
                    }
                    break;
                case 132322416:
                case 940900078:
                    if (C0845.f81821 < 0) {
                        iM55680 = C0873.m55680("֡ۙ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 19977) ^ (-9017223);
                        i5 = -1816639704;
                    } else {
                        iM55680 = (C0873.m55680("ۘۖ") ^ i3) * 47;
                        i4 = ((iM55680 ^ i2) * (-22927)) ^ (-1600039080);
                        i5 = -1065697230;
                    }
                    break;
                case 168900428:
                case 773725998:
                    this.f54487 = this.f54490;
                    iM55680 = (C0946.m55979("ᩳ᩺") ^ i2) * 31;
                    i4 = ((iM55680 ^ i3) * 25397) ^ (-311231934);
                    i5 = -386506730;
                    break;
                case 464416306:
                case 1501654129:
                    r1 = 0;
                    r1 = 0;
                    if (C0866.m55645()) {
                        iM55680 = C0946.m55979("᩹᩺") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-6575)) ^ (-1754660697);
                        i5 = -253466220;
                    } else {
                        iM55680 = (C0873.m55680("ܺ᩵") + i2) * 13;
                        i4 = ((iM55680 ^ i3) * (-16273)) ^ 402799223;
                        i5 = -218381705;
                    }
                    break;
                case 831329913:
                case 1092320032:
                    C1028.m56247();
                    C0863.m55643();
                    break;
                default:
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0946.m55979("᩺᩺") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-31783)) ^ (-288004850);
                        i5 = -342878279;
                    } else {
                        iM55680 = C0873.m55680("ܰۘ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-26851)) ^ (-1745463806);
                        i5 = 1919752653;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public final String m41533() {
        int i = 0;
        int i2 = 0;
        int i3 = -1822741520;
        int i4 = C0894.f81854;
        int i5 = C1028.f81950;
        int iM55680 = (i5 - C0873.m55680("ܺۗ")) * (-41);
        int i6 = ((iM55680 ^ i4) * (-7569)) ^ 1186567475;
        int i7 = -1277251858;
        while (true) {
            i3 = ((((i3 ^ i4) * (-19945)) >> 31) & i6) ^ (iM55680 ^ i7);
            switch (i3) {
                case -2058083211:
                case -1364119363:
                    if (C1024.f81946) {
                        iM55680 = (i5 - C0946.m55979("۬ᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM55680 ^ i4) * 7829) ^ 1313258839;
                        i7 = 995505191;
                    } else {
                        iM55680 = C0946.m55979("᩷ۙ") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-31459)) ^ (-1062967875);
                        i7 = 1538216633;
                    }
                    break;
                case -2042842547:
                case 1101751547:
                    AbstractC0942.m55971();
                    C0877.m55696();
                    iM55680 = (C0946.m55979("᩹۠") ^ i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i6 = ((iM55680 ^ i4) * 13273) ^ (-1941939559);
                    i7 = 22790491;
                    break;
                case -1715167316:
                case 367403409:
                    if (C0967.f81910 >= 0) {
                        iM55680 = (C0873.m55680("ۙᩳ") + i4) * 17;
                        i6 = ((iM55680 ^ i5) * 30161) ^ 459699744;
                        i7 = -483097570;
                    } else {
                        iM55680 = (C0946.m55979("ۘۘ") + i4) * (-43);
                        i6 = ((iM55680 ^ i5) * (-25955)) ^ (-1159734764);
                        i7 = 113279068;
                    }
                    break;
                case -1663618781:
                case 9271953:
                    C0845.m55584();
                    C1012.m56134();
                    return null;
                case -1658219885:
                case 2016644639:
                    if (C0955.m56025()) {
                        iM55680 = C0873.m55680("᩸֡") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-21211)) ^ 2006962037;
                        i7 = 2007028532;
                    } else {
                        iM55680 = (C0946.m55979("۫ۗ") ^ i4) * 25;
                        i6 = ((iM55680 ^ i5) * 22675) ^ 109024213;
                        i7 = 1225360433;
                    }
                    break;
                case -1383061554:
                case 1848444724:
                    C1404.m56468();
                    if (C1017.m56187() > 0) {
                        iM55680 = C0873.m55680("᩸֡") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-21211)) ^ 2006962037;
                        i7 = 2007028532;
                    } else {
                        iM55680 = (C0946.m55979("᩹۠") ^ i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM55680 ^ i4) * 13273) ^ (-1941939559);
                        i7 = 22790491;
                    }
                    break;
                case -1186932247:
                case -196700972:
                    if (C0947.f81895) {
                        iM55680 = C0873.m55680("᩸֡") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-21211)) ^ 2006962037;
                        i7 = 2007028532;
                    } else {
                        iM55680 = (i4 - C0873.m55680("᩸᩺")) * (-7);
                        i6 = ((iM55680 ^ i5) * (-14801)) ^ (-1123178958);
                        i7 = 553333699;
                    }
                    break;
                case -902035864:
                case 1214951955:
                    if (C0930.f81879 <= 0) {
                        iM55680 = (C0873.m55680("ۙᩳ") + i4) * 17;
                        i6 = ((iM55680 ^ i5) * 30161) ^ 459699744;
                        i7 = -483097570;
                    } else {
                        iM55680 = (C0946.m55979("ܺ᩶") ^ i5) * 57;
                        i6 = ((iM55680 ^ i4) * (-6579)) ^ (-24240748);
                        i7 = 2068928130;
                    }
                    break;
                case -379128582:
                case 881254998:
                    i = this.f54492;
                    if (RunnableC0938.m55938() != 0) {
                        iM55680 = (i4 - C0873.m55680("ۙۧ")) * 47;
                        i6 = ((iM55680 ^ i5) * (-28715)) ^ (-2089009398);
                        i7 = -1764898847;
                    } else {
                        iM55680 = (C0873.m55680("᩶۠") + i4) * (-69);
                        i6 = ((iM55680 ^ i5) * (-7367)) ^ 131624364;
                        i7 = 1937156316;
                    }
                    break;
                case 123053396:
                case 293249528:
                    C1012.m56134();
                    if (!C0892.m55749()) {
                        iM55680 = (C0946.m55979("᩹۠") ^ i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM55680 ^ i4) * 13273) ^ (-1941939559);
                        i7 = 22790491;
                    } else {
                        iM55680 = (C0873.m55680("ۙᩳ") + i4) * 17;
                        i6 = ((iM55680 ^ i5) * 30161) ^ 459699744;
                        i7 = -483097570;
                    }
                    break;
                case 195935869:
                case 445027664:
                    if (C0906.f81862 >= 0) {
                        iM55680 = (i5 - C0946.m55979("۬ᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM55680 ^ i4) * 7829) ^ 1313258839;
                        i7 = 995505191;
                    } else {
                        iM55680 = (C0873.m55680("۬᩵") + i4) * (-101);
                        i6 = ((iM55680 ^ i5) * 13149) ^ 174878732;
                        i7 = -444939410;
                    }
                    break;
                case 288873065:
                case 367672706:
                    if (C1003.m56123() != 0) {
                        iM55680 = (i4 - C0873.m55680("ۙۧ")) * 47;
                        i6 = ((iM55680 ^ i5) * (-28715)) ^ (-2089009398);
                        i7 = -1764898847;
                    } else {
                        iM55680 = (C0946.m55979("᩹۠") ^ i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM55680 ^ i4) * 13273) ^ (-1941939559);
                        i7 = 22790491;
                    }
                    break;
                case 980602369:
                case 1314446029:
                    i2 = this.f54498;
                    if (C1017.m56187() <= 0) {
                        iM55680 = (i5 - C0946.m55979("۬ᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM55680 ^ i4) * 7829) ^ 1313258839;
                        i7 = 995505191;
                    } else {
                        iM55680 = (C0873.m55680("۬ۚ") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM55680 ^ i4) * 5701) ^ (-44948215);
                        i7 = 1314590784;
                    }
                    break;
                case 1031086366:
                case 1602437109:
                    if (C0863.f81833 <= 0) {
                        iM55680 = (i5 - C0946.m55979("۬ᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM55680 ^ i4) * 7829) ^ 1313258839;
                        i7 = 995505191;
                    } else {
                        iM55680 = C0946.m55979("۟ۢ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 9617) ^ (-1673366814);
                        i7 = -543601937;
                    }
                    break;
                case 1411970264:
                case 1634027075:
                    return m41513(i, i2, this.f54497);
                default:
                    if (C0863.f81833 <= 0) {
                        iM55680 = (i4 - C0873.m55680("ۙۧ")) * 47;
                        i6 = ((iM55680 ^ i5) * (-28715)) ^ (-2089009398);
                        i7 = -1764898847;
                    } else {
                        iM55680 = C0873.m55680("᩸᩶") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-27189)) ^ 857947723;
                        i7 = 1836562534;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03fa A[PHI: r2 r11 r12 r13 r16 r17 r21 r22 r27
      0x03fa: PHI (r2v56 int) = (r2v7 int), (r2v10 int), (r2v57 int) binds: [B:100:0x03f8, B:88:0x0361, B:15:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x03fa: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v5 short[]) binds: [B:100:0x03f8, B:88:0x0361, B:15:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x03fa: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v5 int) binds: [B:100:0x03f8, B:88:0x0361, B:15:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x03fa: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v5 int) binds: [B:100:0x03f8, B:88:0x0361, B:15:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x03fa: PHI (r16v4 int) = (r16v2 int), (r16v3 int), (r16v2 int) binds: [B:100:0x03f8, B:88:0x0361, B:15:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x03fa: PHI (r17v4 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:100:0x03f8, B:88:0x0361, B:15:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x03fa: PHI (r21v4 int) = (r21v2 int), (r21v3 int), (r21v2 int) binds: [B:100:0x03f8, B:88:0x0361, B:15:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x03fa: PHI (r22v4 int) = (r22v2 int), (r22v3 int), (r22v2 int) binds: [B:100:0x03f8, B:88:0x0361, B:15:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x03fa: PHI (r27v39 int) = (r27v10 int), (r27v13 int), (r27v40 int) binds: [B:100:0x03f8, B:88:0x0361, B:15:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static String m41512(int i) {
        int iM55680;
        int i2;
        int i3;
        int i4;
        C13929 c13929;
        int iM55681;
        int i5;
        int i6;
        int i7;
        int iM55682;
        int i8;
        int i9;
        int i10;
        int iM55979;
        int i11;
        int i12 = -774747917;
        int i13 = RunnableC0871.f81839;
        int i14 = C1044.f81959;
        int iM559710 = C0946.m55979("ۖ۫") ^ i13;
        int i15 = ((iM559710 ^ i14) * 25213) ^ (-1270382550);
        int i16 = iM559710 ^ 1900677006;
        String strGroup = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        C13929 c13929Matcher = null;
        short[] sArr4 = null;
        String strM56135 = null;
        String strM55863 = null;
        String strGroup2 = null;
        int i27 = 0;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i14) * 6851) >> 31));
            switch (i12) {
                case -2061822441:
                case 211132895:
                    i17 = i17;
                    c13929 = c13929Matcher;
                    i27 = 2;
                    if (C0894.f81854 < 0) {
                        iM55681 = (C0873.m55680("᩻ܶ") + i13) * (-31);
                        i5 = ((iM55681 ^ i14) * 10795) ^ (-631653372);
                        i6 = -1967836865;
                        i7 = iM55681 ^ i6;
                        c13929Matcher = c13929;
                        i15 = i5;
                        int i28 = i17;
                        i16 = i7;
                        i17 = i28;
                    } else {
                        i17 = i17;
                        iM55682 = C0873.m55680("ܿۡ") ^ i13;
                        i8 = i17;
                        i9 = ((iM55682 ^ i14) * (-19287)) ^ (-249316435);
                        i10 = -83259603;
                        i3 = iM55682 ^ i10;
                        c13929Matcher = c13929;
                        i15 = i9;
                        i17 = i8;
                        i16 = i3;
                    }
                    break;
                case -1971892261:
                case 33971603:
                    return C20865.m47154(strM55863, strGroup, C0890.m55726(sArr3, 89, 1, i19), strM56135);
                case -1939801584:
                case 1660065536:
                    AbstractC0942.m55971();
                    if (C1036.f81953 < 0) {
                        i17 = i17;
                        i26 = i26;
                        iM55680 = C0873.m55680("ܿۗ") ^ i14;
                        i15 = ((iM55680 ^ i13) * 7531) ^ (-148482814);
                        i2 = -655717144;
                        i7 = iM55680 ^ i2;
                        i26 = i26;
                        int i29 = i17;
                        i16 = i7;
                        i17 = i29;
                    } else {
                        iM55979 = (C0873.m55680("֡ܽ") ^ i13) * 67;
                        i4 = ((iM55979 ^ i14) * (-18051)) ^ (-2100183152);
                        i11 = 2003938024;
                        i16 = iM55979 ^ i11;
                        i15 = i4;
                    }
                    break;
                case -1890602081:
                case 1028182931:
                    if (C1071.m56345(strGroup2, C0955.m56029(sArr, i20, i21, i19))) {
                        iM55979 = C0873.m55680("᩶᩹") ^ i14;
                        i4 = ((iM55979 ^ i13) * (-27717)) ^ 323411321;
                        i11 = 1388314252;
                    } else {
                        strM56135 = strGroup2;
                        iM55979 = (C0873.m55680("֫ۙ") ^ i14) * 3;
                        i4 = ((iM55979 ^ i13) * (-24845)) ^ (-1489955423);
                        i11 = -481520627;
                    }
                    i16 = iM55979 ^ i11;
                    i15 = i4;
                    break;
                case -1694561032:
                case -281762037:
                    i17 = i17;
                    i26 = i26;
                    s = sArr4[c];
                    s2 = 14428;
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0873.m55680("ۖ֫") ^ i13;
                        i15 = ((iM55680 ^ i14) * 28795) ^ (-685407079);
                        i2 = 1027170003;
                    } else {
                        iM55680 = (C0873.m55680("᩵᩻") ^ i14) * (-113);
                        i15 = ((iM55680 ^ i13) * (-17369)) ^ (-2143826405);
                        i2 = 470811271;
                    }
                    i7 = iM55680 ^ i2;
                    i26 = i26;
                    int i210 = i17;
                    i16 = i7;
                    i17 = i210;
                    break;
                case -1689107181:
                case -1676585480:
                    i17 = i17;
                    i26 = i26;
                    if (i != 0) {
                        iM55680 = C0873.m55680("᩹ۧ") ^ i13;
                        i15 = ((iM55680 ^ i14) * (-21955)) ^ 1003239518;
                        i2 = -705133055;
                        i7 = iM55680 ^ i2;
                        i26 = i26;
                        int i211 = i17;
                        i16 = i7;
                        i17 = i211;
                    } else {
                        int iM55683 = C0873.m55680("᩷ۡ") ^ i13;
                        int i30 = ((iM55683 ^ i14) * 1591) ^ 1513988276;
                        int i31 = iM55683 ^ (-1247570969);
                        i26 = i26;
                        i15 = i30;
                        i17 = i17;
                        i16 = i31;
                    }
                    break;
                case -1530758935:
                case -477477402:
                    RunnableC0871.m55672();
                    return null;
                case -1472716338:
                case -89630446:
                    sArr = f82265;
                    i20 = 86;
                    i21 = 1;
                    if (C0866.f81837 < 0) {
                        iM55979 = (C0946.m55979("۫᩶") ^ i13) * 45;
                        i4 = ((iM55979 ^ i14) * 1871) ^ 169628312;
                        i11 = 745110887;
                        i16 = iM55979 ^ i11;
                        i15 = i4;
                    } else {
                        i17 = i17;
                        i26 = i26;
                        iM55680 = C0873.m55680("ܿۗ") ^ i14;
                        i15 = ((iM55680 ^ i13) * 7531) ^ (-148482814);
                        i2 = -655717144;
                        i7 = iM55680 ^ i2;
                        i26 = i26;
                        int i212 = i17;
                        i16 = i7;
                        i17 = i212;
                    }
                    break;
                case -1418024558:
                case -561478625:
                    return C0845.m55579(i);
                case -1345958070:
                case 862280792:
                    strM55863 = C0927.m55863(sArr2, i22, i17, i19);
                    sArr3 = f82265;
                    if (C1053.f81965 > 0) {
                        iM55979 = C0946.m55979("ܺۗ") ^ i14;
                        i4 = ((iM55979 ^ i13) * 3315) ^ (-1289673962);
                        i11 = 36485342;
                        i16 = iM55979 ^ i11;
                        i15 = i4;
                    } else {
                        c13929 = c13929Matcher;
                        iM55682 = C0873.m55680("ܿۡ") ^ i13;
                        i8 = i17;
                        i9 = ((iM55682 ^ i14) * (-19287)) ^ (-249316435);
                        i10 = -83259603;
                        i3 = iM55682 ^ i10;
                        c13929Matcher = c13929;
                        i15 = i9;
                        i17 = i8;
                        i16 = i3;
                    }
                    break;
                case -1344928430:
                case 234738706:
                    i17 = i17;
                    c13929 = c13929Matcher;
                    if (!c13929.matches()) {
                        c13929Matcher = c13929;
                        int iM55684 = (C0873.m55680("۠ۡ") + i14) * 57;
                        i4 = ((iM55684 ^ i13) * (-17895)) ^ 618007428;
                        i17 = i17;
                        i16 = iM55684 ^ 1048723293;
                        i15 = i4;
                    } else {
                        iM55681 = C0873.m55680("ۤۡ") ^ i14;
                        i5 = ((iM55681 ^ i13) * (-16497)) ^ (-1618015138);
                        i6 = 1630890434;
                        i7 = iM55681 ^ i6;
                        c13929Matcher = c13929;
                        i15 = i5;
                        int i213 = i17;
                        i16 = i7;
                        i17 = i213;
                    }
                    break;
                case -1280764476:
                case -391044364:
                    i17 = i17;
                    i26 = i26;
                    sArr4 = f82265;
                    if (C0877.m55696()) {
                        iM55680 = C0873.m55680("ۗܶ") ^ i13;
                        i15 = ((iM55680 ^ i14) * 22031) ^ 153702933;
                        i2 = -1238273493;
                    } else {
                        iM55680 = C0873.m55680("ܿۗ") ^ i14;
                        i15 = ((iM55680 ^ i13) * 7531) ^ (-148482814);
                        i2 = -655717144;
                    }
                    i7 = iM55680 ^ i2;
                    i26 = i26;
                    int i214 = i17;
                    i16 = i7;
                    i17 = i214;
                    break;
                case -856826907:
                case 830169285:
                    i17 = i17;
                    i26 = i26;
                    i24 = s * s2;
                    i25 = s * s;
                    i23 = 52041796;
                    if (C0947.f81895) {
                        iM55680 = C0873.m55680("ܿۗ") ^ i14;
                        i15 = ((iM55680 ^ i13) * 7531) ^ (-148482814);
                        i2 = -655717144;
                    } else {
                        iM55680 = (C0873.m55680("ۖۧ") + i13) * 53;
                        i15 = ((iM55680 ^ i14) * 3145) ^ (-2099571450);
                        i2 = 1043284419;
                    }
                    i7 = iM55680 ^ i2;
                    i26 = i26;
                    int i215 = i17;
                    i16 = i7;
                    i17 = i215;
                    break;
                case -794627147:
                case -412500617:
                    c13929 = c13929Matcher;
                    strGroup2 = c13929.group(i27);
                    C1017.m56190(strGroup2);
                    if (C1044.f81959 < 0) {
                        iM55682 = (C0873.m55680("ۧۙ") ^ i14) * (-29);
                        i8 = i17;
                        i9 = ((iM55682 ^ i13) * 24839) ^ (-1807478069);
                        i10 = 1999740108;
                        i3 = iM55682 ^ i10;
                        c13929Matcher = c13929;
                        i15 = i9;
                        i17 = i8;
                        i16 = i3;
                    } else {
                        i17 = i17;
                        c13929Matcher = c13929;
                        i26 = i26;
                        iM55680 = (C0873.m55680("᩶ۨ") + i14) * (-117);
                        i15 = ((iM55680 ^ i13) * 3863) ^ 1339290568;
                        i2 = -245746140;
                        i7 = iM55680 ^ i2;
                        i26 = i26;
                        int i216 = i17;
                        i16 = i7;
                        i17 = i216;
                    }
                    break;
                case -682309203:
                case 744183554:
                    return C1025.m56233(f82265, 80, 6, i19);
                case -646098161:
                case 1353808456:
                    if (!C1024.f81946) {
                        i17 = i17;
                        i26 = i26;
                        iM55680 = C0873.m55680("ۖ֫") ^ i13;
                        i15 = ((iM55680 ^ i14) * 28795) ^ (-685407079);
                        i2 = 1027170003;
                        i7 = iM55680 ^ i2;
                        i26 = i26;
                        int i217 = i17;
                        i16 = i7;
                        i17 = i217;
                    } else {
                        iM55979 = (C0873.m55680("֡ܽ") ^ i13) * 67;
                        i4 = ((iM55979 ^ i14) * (-18051)) ^ (-2100183152);
                        i11 = 2003938024;
                        i16 = iM55979 ^ i11;
                        i15 = i4;
                    }
                    break;
                case -622354025:
                case -21445742:
                    strM56135 = C1012.m56135(strGroup2, i18);
                    iM55979 = (C0873.m55680("֫ۙ") ^ i14) * 3;
                    i4 = ((iM55979 ^ i13) * (-24845)) ^ (-1489955423);
                    i11 = -481520627;
                    i16 = iM55979 ^ i11;
                    i15 = i4;
                    break;
                case -545882813:
                case 1444046429:
                    i17 = i17;
                    i26 = i26;
                    if ((i25 + i23) - i24 >= 0) {
                        iM55680 = (i13 - C0873.m55680("۠᩵")) * (-89);
                        i15 = ((iM55680 ^ i14) * (-11129)) ^ 183735566;
                        i2 = 564421146;
                    } else {
                        iM55680 = C0873.m55680("֡۬") ^ i14;
                        i15 = ((iM55680 ^ i13) * 16209) ^ 267539165;
                        i2 = -1217447903;
                    }
                    i7 = iM55680 ^ i2;
                    i26 = i26;
                    int i218 = i17;
                    i16 = i7;
                    i17 = i218;
                    break;
                case -378624921:
                case 1562821039:
                    i17 = i17;
                    c13929 = c13929Matcher;
                    i18 = 1;
                    strGroup = c13929.group(1);
                    C0992.m56109(strGroup);
                    if (!C0917.f81868) {
                        iM55681 = (i13 - C0873.m55680("᩷ܿ")) * (-51);
                        i5 = ((iM55681 ^ i14) * 29049) ^ 2122336867;
                        i6 = 1608864580;
                        i7 = iM55681 ^ i6;
                        c13929Matcher = c13929;
                        i15 = i5;
                        int i219 = i17;
                        i16 = i7;
                        i17 = i219;
                    }
                    c13929Matcher = c13929;
                    i26 = i26;
                    iM55680 = (C0873.m55680("᩶ۨ") + i14) * (-117);
                    i15 = ((iM55680 ^ i13) * 3863) ^ 1339290568;
                    i2 = -245746140;
                    i7 = iM55680 ^ i2;
                    i26 = i26;
                    int i2110 = i17;
                    i16 = i7;
                    i17 = i2110;
                    break;
                case -55948394:
                case 801789627:
                    i17 = i17;
                    i26 = i26;
                    c = 'O';
                    if (C0854.m55595() >= 0) {
                        iM55680 = (C0873.m55680("᩶ۨ") + i14) * (-117);
                        i15 = ((iM55680 ^ i13) * 3863) ^ 1339290568;
                        i2 = -245746140;
                    } else {
                        iM55680 = C0946.m55979("ۚ֫") ^ i14;
                        i15 = ((iM55680 ^ i13) * (-10889)) ^ 1029739161;
                        i2 = 1735355586;
                    }
                    i7 = iM55680 ^ i2;
                    i26 = i26;
                    int i2111 = i17;
                    i16 = i7;
                    i17 = i2111;
                    break;
                case 232153248:
                case 1444087020:
                    i19 = 22621;
                    iM55680 = (C0946.m55979("ۘᩳ") ^ i14) * 29;
                    i15 = ((iM55680 ^ i13) * (-22813)) ^ 1041117251;
                    i2 = -293945489;
                    i7 = iM55680 ^ i2;
                    i26 = i26;
                    int i2112 = i17;
                    i16 = i7;
                    i17 = i2112;
                    break;
                case 988707219:
                case 1060412562:
                    i19 = 24266;
                    iM55680 = (C0946.m55979("ۘᩳ") ^ i14) * 29;
                    i15 = ((iM55680 ^ i13) * (-22813)) ^ 1041117251;
                    i2 = -293945489;
                    i7 = iM55680 ^ i2;
                    i26 = i26;
                    int i2113 = i17;
                    i16 = i7;
                    i17 = i2113;
                    break;
                case 1001768977:
                case 1904830364:
                    C0898.m55800();
                    i17 = i17;
                    i26 = i26;
                    iM55680 = C0873.m55680("ۖ֫") ^ i13;
                    i15 = ((iM55680 ^ i14) * 28795) ^ (-685407079);
                    i2 = 1027170003;
                    i7 = iM55680 ^ i2;
                    i26 = i26;
                    int i2114 = i17;
                    i16 = i7;
                    i17 = i2114;
                    break;
                case 1275085344:
                case 1575234603:
                    i17 = i17;
                    c13929Matcher = f54479.matcher((CharSequence) C0845.m55579(i));
                    if (i < 26040000) {
                        i26 = 26040000;
                        int iM55685 = (C0873.m55680("۠ۡ") + i14) * 57;
                        i4 = ((iM55685 ^ i13) * (-17895)) ^ 618007428;
                        i17 = i17;
                        i16 = iM55685 ^ 1048723293;
                        i15 = i4;
                    } else {
                        int iM55686 = C0873.m55680("ۚۗ") ^ i13;
                        i15 = ((iM55686 ^ i14) * 28273) ^ 1018593514;
                        i3 = iM55686 ^ (-1811484544);
                        i17 = i17;
                        i26 = 26040000;
                        i16 = i3;
                    }
                    break;
                case 1572666442:
                case 1772694741:
                    if (!C1929.m56553()) {
                        i17 = i17;
                        i26 = i26;
                        iM55680 = C0873.m55680("ۖ֫") ^ i13;
                        i15 = ((iM55680 ^ i14) * 28795) ^ (-685407079);
                        i2 = 1027170003;
                        i7 = iM55680 ^ i2;
                        i26 = i26;
                        int i2115 = i17;
                        i16 = i7;
                        i17 = i2115;
                    } else {
                        c13929 = c13929Matcher;
                        iM55682 = C0873.m55680("ܿۡ") ^ i13;
                        i8 = i17;
                        i9 = ((iM55682 ^ i14) * (-19287)) ^ (-249316435);
                        i10 = -83259603;
                        i3 = iM55682 ^ i10;
                        c13929Matcher = c13929;
                        i15 = i9;
                        i17 = i8;
                        i16 = i3;
                    }
                    break;
                case 2047902361:
                case 2053005839:
                    sArr2 = f82265;
                    i22 = 87;
                    i17 = 2;
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55979 = (i13 - C0946.m55979("۠᩹")) * (-93);
                        i4 = ((iM55979 ^ i14) * (-25167)) ^ 1761321640;
                        i11 = 1018066010;
                        i16 = iM55979 ^ i11;
                        i15 = i4;
                    } else {
                        c13929 = c13929Matcher;
                        iM55682 = C0873.m55680("ܿۡ") ^ i13;
                        i8 = i17;
                        i9 = ((iM55682 ^ i14) * (-19287)) ^ (-249316435);
                        i10 = -83259603;
                        i3 = iM55682 ^ i10;
                        c13929Matcher = c13929;
                        i15 = i9;
                        i17 = i8;
                        i16 = i3;
                    }
                    break;
                default:
                    i17 = i17;
                    i26 = i26;
                    C13929 c139210 = c13929Matcher;
                    if (i < i26) {
                        c13929Matcher = c139210;
                        int iM55687 = C0873.m55680("᩷ۡ") ^ i13;
                        int i32 = ((iM55687 ^ i14) * 1591) ^ 1513988276;
                        int i33 = iM55687 ^ (-1247570969);
                        i26 = i26;
                        i15 = i32;
                        i17 = i17;
                        i16 = i33;
                    } else {
                        int iM55688 = (C0873.m55680("ۢۤ") + i14) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        c13929Matcher = c139210;
                        i15 = ((iM55688 ^ i13) * 25935) ^ 1365225850;
                        i17 = i17;
                        i16 = iM55688 ^ 2005296612;
                        i26 = i26;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m41553() {
        PluginContext pluginContextM41540 = null;
        String str = null;
        String strM55876 = null;
        int i = -415260335;
        int i2 = C1046.f81962;
        int i3 = C0930.f81879;
        int iM55979 = (C0946.m55979("᩺ۚ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
        int i4 = ((iM55979 ^ i2) * (-28839)) ^ (-1126738264);
        int i5 = -1076660728;
        while (true) {
            i = ((((i ^ i2) * 27919) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2114102400:
                case -1876373691:
                    C0861.m55626();
                    if (C0967.f81910 < 0) {
                        iM55979 = C0946.m55979("ܿ᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-21439)) ^ 699788963;
                        i5 = -1149103967;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۛ᩺")) * (-117);
                        i4 = ((iM55979 ^ i2) * 3173) ^ 615474004;
                        i5 = -1341508823;
                    }
                    break;
                case -2014235711:
                case -882160281:
                    if (C0882.m55719(str) >= 3) {
                        iM55979 = C0873.m55680("֨᩹") ^ i2;
                        i4 = ((iM55979 ^ i3) * 753) ^ (-702614900);
                        i5 = -1723457456;
                    } else {
                        iM55979 = C0946.m55979("᩵᩻") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25573)) ^ 1467785753;
                        i5 = 2056366535;
                    }
                    break;
                case -1869351144:
                case 1753051826:
                    strM55876 = C0927.m55876((C12474) pluginContextM41540, str);
                    if (strM55876 != null) {
                        iM55979 = (C0946.m55979("ܳᩳ") + i3) * (-81);
                        i4 = ((iM55979 ^ i2) * 10547) ^ 1638568247;
                        i5 = -1796276253;
                    } else {
                        iM55979 = C0946.m55979("᩵᩻") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25573)) ^ 1467785753;
                        i5 = 2056366535;
                    }
                    break;
                case -1658952893:
                case 1600828434:
                    if (RunnableC1014.m56177()) {
                        iM55979 = (i3 - C0946.m55979("ܺ᩶")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55979 ^ i2) * 10851) ^ (-1820321035);
                        i5 = 2070642298;
                    } else {
                        iM55979 = C0873.m55680("۬ܽ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 28139) ^ 1491022042;
                        i5 = 796998402;
                    }
                    break;
                case -1590953367:
                case 25199017:
                    return strM55876;
                case -1511634306:
                case 1680806915:
                    if (C0892.m55748(1, str) == '}') {
                        iM55979 = (C0873.m55680("ᩴ֡") ^ i2) * 47;
                        i4 = ((iM55979 ^ i3) * 14027) ^ 1993522122;
                        i5 = 2141198798;
                    } else {
                        iM55979 = C0946.m55979("᩵᩻") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25573)) ^ 1467785753;
                        i5 = 2056366535;
                    }
                    break;
                case -856185337:
                case 2063333069:
                    if (C0882.f81846) {
                        iM55979 = (C0873.m55680("۬ۤ") + i2) * 35;
                        i4 = ((iM55979 ^ i3) * 4909) ^ 1677477687;
                        i5 = -905816199;
                    } else {
                        iM55979 = C0873.m55680("᩶ۛ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 4057) ^ 1184601968;
                        i5 = 9306388;
                    }
                    break;
                case -812682458:
                case 1415121706:
                    if (C0882.m55712(str, 0) == '{') {
                        iM55979 = C0946.m55979("֨֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11693)) ^ (-429132053);
                        i5 = -1956929909;
                    } else {
                        iM55979 = C0946.m55979("᩵᩻") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25573)) ^ 1467785753;
                        i5 = 2056366535;
                    }
                    break;
                case -712433004:
                case -589354844:
                    if (C1194.f82045 != 0) {
                        iM55979 = C0946.m55979("᩵ۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 21767) ^ 535869262;
                        i5 = -958238994;
                    } else {
                        iM55979 = (C0873.m55680("֡۬") + i3) * 37;
                        i4 = ((iM55979 ^ i2) * 17497) ^ (-362361940);
                        i5 = -815989874;
                    }
                    break;
                case -468536022:
                case -432868901:
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0946.m55979("᩵ۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 21767) ^ 535869262;
                        i5 = -958238994;
                    } else {
                        iM55979 = C0946.m55979("۫۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-4159)) ^ 273780736;
                        i5 = -1978241182;
                    }
                    break;
                case -397894948:
                case 780444700:
                    if (C0989.f81920 >= 0) {
                        iM55979 = (i3 - C0946.m55979("ۛ᩺")) * (-117);
                        i4 = ((iM55979 ^ i2) * 3173) ^ 615474004;
                        i5 = -1341508823;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۨ۟")) * (-15);
                        i4 = ((iM55979 ^ i2) * 3547) ^ (-994272142);
                        i5 = 940557250;
                    }
                    break;
                case -313822960:
                case 1101158836:
                    C1003.m56123();
                    if (C1028.f81950 <= 0) {
                        iM55979 = (i3 - C0946.m55979("ۛ᩺")) * (-117);
                        i4 = ((iM55979 ^ i2) * 3173) ^ 615474004;
                        i5 = -1341508823;
                    } else {
                        iM55979 = (C0873.m55680("۬ۤ") + i2) * 35;
                        i4 = ((iM55979 ^ i3) * 4909) ^ 1677477687;
                        i5 = -905816199;
                    }
                    break;
                case -231511806:
                case 332744244:
                    C1036.m56257();
                    iM55979 = (C0873.m55680("۬ۤ") + i2) * 35;
                    i4 = ((iM55979 ^ i3) * 4909) ^ 1677477687;
                    i5 = -905816199;
                    break;
                case -220687997:
                case 1412400791:
                    return str;
                case 20743973:
                case 1591763071:
                    if (C1036.m56257() > 0) {
                        iM55979 = C0946.m55979("᩵ۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 21767) ^ 535869262;
                        i5 = -958238994;
                    } else {
                        iM55979 = C0946.m55979("ܿ᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-21439)) ^ 699788963;
                        i5 = -1149103967;
                    }
                    break;
                case 237345419:
                case 1528681077:
                    str = this.f54495;
                    if (C0861.m55626()) {
                        iM55979 = C0873.m55680("۬ܽ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 28139) ^ 1491022042;
                        i5 = 796998402;
                    } else {
                        iM55979 = (C0946.m55979("ܿۖ") ^ i2) * (-113);
                        i4 = ((iM55979 ^ i3) * (-29009)) ^ (-1878844420);
                        i5 = 2053388887;
                    }
                    break;
                case 397163332:
                case 1343160796:
                    C0898.m55800();
                    return null;
                case 737587490:
                case 1818728144:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0873.m55680("۬ܽ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 28139) ^ 1491022042;
                        i5 = 796998402;
                    } else {
                        iM55979 = (C0946.m55979("᩹ۖ") + i3) * 127;
                        i4 = ((iM55979 ^ i2) * (-24633)) ^ 749928663;
                        i5 = -675484202;
                    }
                    break;
                case 774921159:
                case 1231233763:
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0946.m55979("ܿ᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-21439)) ^ 699788963;
                        i5 = -1149103967;
                    } else {
                        iM55979 = C0873.m55680("ۡ۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-15599)) ^ 2035524514;
                        i5 = -575505281;
                    }
                    break;
                case 1727715343:
                case 1890324818:
                    pluginContextM41540 = m41540();
                    if (C0898.f81858 <= 0) {
                        iM55979 = (i3 - C0946.m55979("ۛ᩺")) * (-117);
                        i4 = ((iM55979 ^ i2) * 3173) ^ 615474004;
                        i5 = -1341508823;
                    } else {
                        iM55979 = C0873.m55680("᩷۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-18723)) ^ (-1491740040);
                        i5 = -1098761422;
                    }
                    break;
                default:
                    if (C0955.f81898) {
                        iM55979 = C0946.m55979("᩵ۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 21767) ^ 535869262;
                        i5 = -958238994;
                    } else {
                        iM55979 = (C0873.m55680("ܽۢ") + i2) * 63;
                        i4 = ((iM55979 ^ i3) * 15011) ^ (-1236771657);
                        i5 = -959735209;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01af A[PHI: r4 r5 r6 r12 r27
      0x01af: PHI (r4v4 short[]) = (r4v2 short[]), (r4v3 short[]), (r4v2 short[]), (r4v2 short[]) binds: [B:47:0x01ad, B:30:0x0111, B:18:0x00ab, B:15:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x01af: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:47:0x01ad, B:30:0x0111, B:18:0x00ab, B:15:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x01af: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:47:0x01ad, B:30:0x0111, B:18:0x00ab, B:15:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x01af: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:47:0x01ad, B:30:0x0111, B:18:0x00ab, B:15:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x01af: PHI (r27v33 short[]) = (r27v26 short[]), (r27v3 short[]), (r27v3 short[]), (r27v3 short[]) binds: [B:47:0x01ad, B:30:0x0111, B:18:0x00ab, B:15:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02d1 A[PHI: r13 r20 r21 r22 r26
      0x02d1: PHI (r13v8 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:44:0x0182, B:73:0x02cf, B:69:0x02ae, B:13:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x02d1: PHI (r20v4 int) = (r20v2 int), (r20v3 int), (r20v2 int), (r20v2 int) binds: [B:44:0x0182, B:73:0x02cf, B:69:0x02ae, B:13:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x02d1: PHI (r21v4 int) = (r21v2 int), (r21v3 int), (r21v2 int), (r21v2 int) binds: [B:44:0x0182, B:73:0x02cf, B:69:0x02ae, B:13:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x02d1: PHI (r22v4 int) = (r22v2 int), (r22v2 int), (r22v3 int), (r22v2 int) binds: [B:44:0x0182, B:73:0x02cf, B:69:0x02ae, B:13:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x02d1: PHI (r26v36 short[]) = (r26v2 short[]), (r26v7 short[]), (r26v8 short[]), (r26v37 short[]) binds: [B:44:0x0182, B:73:0x02cf, B:69:0x02ae, B:13:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x035d A[PHI: r7 r8 r9 r16 r18 r19 r26
      0x035d: PHI (r7v3 short[]) = (r7v2 short[]), (r7v2 short[]), (r7v4 short[]) binds: [B:85:0x035b, B:77:0x0309, B:24:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x035d: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:85:0x035b, B:77:0x0309, B:24:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x035d: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v4 int) binds: [B:85:0x035b, B:77:0x0309, B:24:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x035d: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:85:0x035b, B:77:0x0309, B:24:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x035d: PHI (r18v4 short) = (r18v2 short), (r18v3 short), (r18v2 short) binds: [B:85:0x035b, B:77:0x0309, B:24:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x035d: PHI (r19v4 short) = (r19v2 short), (r19v3 short), (r19v2 short) binds: [B:85:0x035b, B:77:0x0309, B:24:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x035d: PHI (r26v28 short[]) = (r26v4 short[]), (r26v6 short[]), (r26v31 short[]) binds: [B:85:0x035b, B:77:0x0309, B:24:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x007a, code lost:
    
        if (p067l.C0854.m55595() < 0) goto L17;
     */
    /* JADX INFO: renamed from: ܽ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m41548() {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        int i4 = RunnableC1014.f81941;
        int i5 = C1044.f81959;
        int iM55682 = C0873.m55680("ۖ۬") ^ i4;
        int i6 = ((iM55682 ^ i5) * (-19845)) ^ 82048871;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i7 = iM55682 ^ 2079524708;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 1309013366;
        short[] sArr5 = null;
        C19561 c19561M41521 = null;
        while (true) {
            i20 = i7 ^ (i6 & (((i20 ^ i5) * 3661) >> 31));
            switch (i20) {
                case -1887637843:
                case -1411138895:
                    sArr4 = f82265;
                    i11 = 870;
                    i12 = 6;
                    if (!C0892.f81851) {
                        sArr = sArr;
                        iM55680 = (i4 - C0873.m55680("ۢ᩺")) * 67;
                        i = ((iM55680 ^ i5) * 1713) ^ 2110622647;
                        i2 = 1389132876;
                        int i21 = iM55680 ^ i2;
                        sArr = sArr;
                        i7 = i21;
                        i6 = i;
                    } else {
                        iM55681 = (i4 - C0873.m55680("᩵᩵")) * 127;
                        i = ((iM55681 ^ i5) * (-20287)) ^ (-704613752);
                        i3 = -1736517879;
                        i7 = iM55681 ^ i3;
                        i6 = i;
                    }
                    break;
                case -1827110489:
                case 1175886745:
                    C0898.m55800();
                    iM55681 = (C0946.m55979("֡ۧ") + i5) * 21;
                    i = ((iM55681 ^ i4) * (-17927)) ^ (-81480470);
                    i3 = 1717578484;
                    i7 = iM55681 ^ i3;
                    i6 = i;
                    break;
                case -1765480271:
                case 718384543:
                    if (C1024.m56209() < 0) {
                        iM55681 = (C0946.m55979("֡ۧ") + i5) * 21;
                        i = ((iM55681 ^ i4) * (-17927)) ^ (-81480470);
                        i3 = 1717578484;
                    } else {
                        iM55681 = C0873.m55680("ۡᩳ") ^ i4;
                        i = ((iM55681 ^ i5) * 30483) ^ 1647723259;
                        i3 = -218979400;
                    }
                    i7 = iM55681 ^ i3;
                    i6 = i;
                    break;
                case -1692924903:
                case 161927290:
                    this.f54496 = C1046.m56293(sArr4, i11, i12, i13);
                    sArr = sArr;
                    iM55680 = C0946.m55979("ܿۘ") ^ i4;
                    i = ((iM55680 ^ i5) * 29599) ^ 1898702621;
                    i2 = 81769916;
                    int i22 = iM55680 ^ i2;
                    sArr = sArr;
                    i7 = i22;
                    i6 = i;
                    break;
                case -1681820198:
                case 1749870076:
                    i13 = 41735;
                    iM55680 = C0873.m55680("ۜۜ") ^ i4;
                    i = ((iM55680 ^ i5) * 28751) ^ (-1000020799);
                    i2 = 167035610;
                    int i23 = iM55680 ^ i2;
                    sArr = sArr;
                    i7 = i23;
                    i6 = i;
                    break;
                case -1502634576:
                case 2032301040:
                    sArr = sArr;
                    i19 = 74132100;
                    if (RunnableC0897.f81856) {
                        iM55680 = C0873.m55680("ᩴۡ") ^ i4;
                        i = ((iM55680 ^ i5) * (-26655)) ^ 717123880;
                        i2 = 2046157776;
                    } else {
                        iM55680 = (C0873.m55680("᩹ۘ") + i5) * 77;
                        i = ((iM55680 ^ i4) * 5923) ^ (-638336132);
                        i2 = -1835422822;
                    }
                    int i24 = iM55680 ^ i2;
                    sArr = sArr;
                    i7 = i24;
                    i6 = i;
                    break;
                case -1478341274:
                case -288786842:
                    if (C0877.m55694(c19561M41521, C1929.m56558(sArr2, i16, i8, i13)) == null) {
                        iM55681 = C0873.m55680("۟ۤ") ^ i4;
                        i = ((iM55681 ^ i5) * 7781) ^ (-1921607496);
                        i3 = 2017449084;
                        i7 = iM55681 ^ i3;
                        i6 = i;
                    }
                    sArr = sArr;
                    iM55680 = (i4 - C0946.m55979("᩹ۚ")) * 25;
                    i = ((iM55680 ^ i5) * 18443) ^ 529918965;
                    i2 = -17705118;
                    int i25 = iM55680 ^ i2;
                    sArr = sArr;
                    i7 = i25;
                    i6 = i;
                    break;
                case -1333314156:
                case -1209525134:
                    if (C0877.m55694(c19561M41521, C0894.m55773(sArr3, i9, i10, i13)) != null) {
                        iM55681 = (C0946.m55979("᩹۠") + i4) * (-99);
                        i = ((iM55681 ^ i5) * (-32683)) ^ 1795169520;
                        i3 = -1961768363;
                        i7 = iM55681 ^ i3;
                        i6 = i;
                    }
                    sArr = sArr;
                    iM55680 = (i4 - C0946.m55979("᩹ۚ")) * 25;
                    i = ((iM55680 ^ i5) * 18443) ^ 529918965;
                    i2 = -17705118;
                    int i26 = iM55680 ^ i2;
                    sArr = sArr;
                    i7 = i26;
                    i6 = i;
                    break;
                case -1285100545:
                case 356112035:
                    C0906.m55809();
                    if (C0882.f81846) {
                        sArr = sArr;
                        iM55680 = (C0873.m55680("᩹ۘ") + i5) * 77;
                        i = ((iM55680 ^ i4) * 5923) ^ (-638336132);
                        i2 = -1835422822;
                        int i27 = iM55680 ^ i2;
                        sArr = sArr;
                        i7 = i27;
                        i6 = i;
                    }
                    iM55681 = C0873.m55680("ۡᩳ") ^ i4;
                    i = ((iM55681 ^ i5) * 30483) ^ 1647723259;
                    i3 = -218979400;
                    i7 = iM55681 ^ i3;
                    i6 = i;
                    break;
                case -1279170906:
                case -338642187:
                    short[] sArr6 = sArr;
                    if (C0892.f81851) {
                        int iM55683 = (i5 - C0873.m55680("۬ᩳ")) * (-15);
                        sArr = sArr6;
                        i7 = iM55683 ^ (-496686853);
                        i6 = ((iM55683 ^ i4) * 7387) ^ (-1803898963);
                        i15 = 7;
                    } else {
                        sArr = sArr6;
                        i15 = 7;
                        iM55680 = (C0873.m55680("᩹ۘ") + i5) * 77;
                        i = ((iM55680 ^ i4) * 5923) ^ (-638336132);
                        i2 = -1835422822;
                        int i28 = iM55680 ^ i2;
                        sArr = sArr;
                        i7 = i28;
                        i6 = i;
                    }
                    break;
                case -1245120125:
                case -877426864:
                    sArr2 = f82265;
                    i16 = 835;
                    i8 = 18;
                    if (!C0955.f81898) {
                        iM55681 = C0946.m55979("֫ܶ") ^ i5;
                        i = ((iM55681 ^ i4) * 4827) ^ 762210858;
                        i3 = 800713301;
                        i7 = iM55681 ^ i3;
                        i6 = i;
                    }
                    sArr = sArr;
                    iM55680 = C0946.m55979("ۜᩳ") ^ i5;
                    i = ((iM55680 ^ i4) * 24363) ^ (-1534344662);
                    i2 = 993858864;
                    int i29 = iM55680 ^ i2;
                    sArr = sArr;
                    i7 = i29;
                    i6 = i;
                    break;
                case -1233775481:
                case -169055082:
                    sArr = sArr;
                    s = sArr5[c];
                    s2 = 17220;
                    if (C1053.f81965 <= 0) {
                        iM55680 = (i4 - C0873.m55680("ۢ᩺")) * 67;
                        i = ((iM55680 ^ i5) * 1713) ^ 2110622647;
                        i2 = 1389132876;
                    } else {
                        iM55680 = C0946.m55979("ۨۨ") ^ i4;
                        i = ((iM55680 ^ i5) * 25497) ^ 837958943;
                        i2 = 362492176;
                    }
                    int i210 = iM55680 ^ i2;
                    sArr = sArr;
                    i7 = i210;
                    i6 = i;
                    break;
                case -695965695:
                case 1698013032:
                    return this.f54496;
                case -522372294:
                case 2090828531:
                    short[] sArr7 = sArr;
                    this.f54496 = C1028.m56235(sArr7, i14, i15, i13);
                    sArr = sArr7;
                    iM55680 = C0946.m55979("ܿۘ") ^ i4;
                    i = ((iM55680 ^ i5) * 29599) ^ 1898702621;
                    i2 = 81769916;
                    int i211 = iM55680 ^ i2;
                    sArr = sArr;
                    i7 = i211;
                    i6 = i;
                    break;
                case -243137398:
                case -216804644:
                    sArr = sArr;
                    c = 827;
                    if (C1046.m56302() != 0) {
                        iM55680 = C0946.m55979("ۜᩳ") ^ i5;
                        i = ((iM55680 ^ i4) * 24363) ^ (-1534344662);
                        i2 = 993858864;
                    } else {
                        iM55680 = C0946.m55979("۠ۨ") ^ i5;
                        i = ((iM55680 ^ i4) * 12559) ^ (-773026750);
                        i2 = 2109186374;
                    }
                    int i212 = iM55680 ^ i2;
                    sArr = sArr;
                    i7 = i212;
                    i6 = i;
                    break;
                case -218533133:
                case 131389811:
                    C1024.m56209();
                    break;
                case -134012111:
                case 695548411:
                    short[] sArr8 = sArr;
                    c19561M41521 = m41521();
                    if (c19561M41521 != null) {
                        int iM55979 = C0946.m55979("ܺ۟") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-6281)) ^ 751916579;
                        sArr = sArr8;
                        i7 = iM55979 ^ (-735915317);
                    } else {
                        sArr = sArr8;
                        iM55680 = (i4 - C0946.m55979("᩹ۚ")) * 25;
                        i = ((iM55680 ^ i5) * 18443) ^ 529918965;
                        i2 = -17705118;
                        int i213 = iM55680 ^ i2;
                        sArr = sArr;
                        i7 = i213;
                        i6 = i;
                    }
                    break;
                case 404493456:
                case 923416096:
                    sArr = sArr;
                    if ((i18 + i19) - i17 >= 0) {
                        iM55680 = C0946.m55979("ܽܿ") ^ i5;
                        i = ((iM55680 ^ i4) * (-28943)) ^ (-2081224223);
                        i2 = -574885737;
                    } else {
                        iM55680 = C0946.m55979("ܳ۠") ^ i5;
                        i = ((iM55680 ^ i4) * 27305) ^ 1538840862;
                        i2 = -535358935;
                    }
                    int i214 = iM55680 ^ i2;
                    sArr = sArr;
                    i7 = i214;
                    i6 = i;
                    break;
                case 433439284:
                case 1696170332:
                    sArr3 = f82265;
                    i9 = 853;
                    i10 = 17;
                    if (C1024.f81946) {
                        iM55681 = (C0946.m55979("֡ۧ") + i5) * 21;
                        i = ((iM55681 ^ i4) * (-17927)) ^ (-81480470);
                        i3 = 1717578484;
                    } else {
                        iM55681 = C0946.m55979("ۡۖ") ^ i5;
                        i = ((iM55681 ^ i4) * 29759) ^ (-1311394234);
                        i3 = 954003545;
                    }
                    i7 = iM55681 ^ i3;
                    i6 = i;
                    break;
                case 437850143:
                case 1190289705:
                    sArr = sArr;
                    sArr5 = f82265;
                    if (C0866.f81837 >= 0) {
                        iM55680 = (i4 - C0873.m55680("ۢ᩺")) * 67;
                        i = ((iM55680 ^ i5) * 1713) ^ 2110622647;
                        i2 = 1389132876;
                    } else {
                        iM55680 = C0873.m55680("۬ۘ") ^ i4;
                        i = ((iM55680 ^ i5) * 13647) ^ (-1069001247);
                        i2 = -1829125603;
                    }
                    int i215 = iM55680 ^ i2;
                    sArr = sArr;
                    i7 = i215;
                    i6 = i;
                    break;
                case 1030132909:
                case 1746851063:
                    sArr = sArr;
                    if (this.f54496 == null) {
                        iM55680 = (i5 - C0873.m55680("᩹ܶ")) * (-59);
                        i = ((iM55680 ^ i4) * 23081) ^ (-656320816);
                        i2 = 1807911958;
                    } else {
                        iM55680 = C0946.m55979("ܿۘ") ^ i4;
                        i = ((iM55680 ^ i5) * 29599) ^ 1898702621;
                        i2 = 81769916;
                    }
                    int i216 = iM55680 ^ i2;
                    sArr = sArr;
                    i7 = i216;
                    i6 = i;
                    break;
                case 1239904994:
                case 1456210923:
                    RunnableC0897.m55784();
                    C1229.m56410();
                    return null;
                case 1540948303:
                case 1953571261:
                    sArr = sArr;
                    i17 = s * s2;
                    i18 = s * s;
                    if (C0946.f81894 != 0) {
                        iM55680 = (C0873.m55680("᩹ۘ") + i5) * 77;
                        i = ((iM55680 ^ i4) * 5923) ^ (-638336132);
                        i2 = -1835422822;
                    } else {
                        iM55680 = (i5 - C0873.m55680("ۗܿ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM55680 ^ i4) * (-21535)) ^ 833290077;
                        i2 = 1265630368;
                    }
                    int i217 = iM55680 ^ i2;
                    sArr = sArr;
                    i7 = i217;
                    i6 = i;
                    break;
                case 1893603719:
                case 1902940462:
                    sArr = f82265;
                    i14 = 828;
                    if (C0866.f81837 >= 0) {
                        iM55681 = (C0946.m55979("֡ۧ") + i5) * 21;
                        i = ((iM55681 ^ i4) * (-17927)) ^ (-81480470);
                        i3 = 1717578484;
                    } else {
                        iM55681 = C0873.m55680("ۢۨ") ^ i5;
                        i = ((iM55681 ^ i4) * 6305) ^ (-935054272);
                        i3 = 999992120;
                    }
                    i7 = iM55681 ^ i3;
                    i6 = i;
                    break;
                default:
                    i13 = 47064;
                    iM55680 = C0873.m55680("ۜۜ") ^ i4;
                    i = ((iM55680 ^ i5) * 28751) ^ (-1000020799);
                    i2 = 167035610;
                    int i218 = iM55680 ^ i2;
                    sArr = sArr;
                    i7 = i218;
                    i6 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41526(Throwable th) {
        PluginContext pluginContextM41540 = null;
        int i = -894980230;
        int i2 = C0992.f81922;
        int i3 = C1003.f81929;
        int iM55680 = (i2 - C0873.m55680("ۤᩴ")) * 9;
        int i4 = ((iM55680 ^ i3) * 30709) ^ 1212056279;
        int i5 = -1820380319;
        while (true) {
            i = ((((i ^ i3) * (-18795)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2069007490:
                case -908436607:
                    if (C0992.f81922 >= 0) {
                        iM55680 = (i3 - C0946.m55979("ᩳۘ")) * 93;
                        i4 = ((iM55680 ^ i2) * (-31987)) ^ (-2082662789);
                        i5 = -1943017356;
                    } else {
                        iM55680 = (C0873.m55680("ܺۘ") ^ i2) * 83;
                        i4 = ((iM55680 ^ i3) * 29043) ^ (-1845218981);
                        i5 = 1419426994;
                    }
                    break;
                case -1929895434:
                case -243119161:
                    if (C1044.f81959 >= 0) {
                        iM55680 = (i3 - C0873.m55680("᩶ۚ")) * (-85);
                        i4 = ((iM55680 ^ i2) * 18747) ^ 1340324612;
                        i5 = -948059490;
                    } else {
                        iM55680 = C0946.m55979("ܶ֨") ^ i3;
                        i4 = ((iM55680 ^ i2) * 19545) ^ 345820473;
                        i5 = 1871163627;
                    }
                    break;
                case -1694287520:
                case -813755510:
                    if (C1017.f81942 < 0) {
                        iM55680 = (C0946.m55979("ۧᩴ") ^ i2) * 109;
                        i4 = ((iM55680 ^ i3) * 1771) ^ 556333208;
                        i5 = 361827775;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ᩳۘ")) * 93;
                        i4 = ((iM55680 ^ i2) * (-31987)) ^ (-2082662789);
                        i5 = -1943017356;
                    }
                    break;
                case -1528016856:
                case 1106044557:
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0946.m55979("ۧᩴ") ^ i2) * 109;
                        i4 = ((iM55680 ^ i3) * 1771) ^ 556333208;
                        i5 = 361827775;
                    } else {
                        iM55680 = C0873.m55680("ᩳۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 8309) ^ 1928041332;
                        i5 = -477794674;
                    }
                    break;
                case -1305663171:
                case 358683328:
                    C1036.m56257();
                    if (C1017.m56187() > 0) {
                        iM55680 = (i3 - C0873.m55680("᩶ۚ")) * (-85);
                        i4 = ((iM55680 ^ i2) * 18747) ^ 1340324612;
                        i5 = -948059490;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ᩳۘ")) * 93;
                        i4 = ((iM55680 ^ i2) * (-31987)) ^ (-2082662789);
                        i5 = -1943017356;
                    }
                    break;
                case -799371387:
                case 944884326:
                    C0967.m56074();
                    ViewOnClickListenerC0939.m55941();
                    iM55680 = (i3 - C0946.m55979("ᩳۘ")) * 93;
                    i4 = ((iM55680 ^ i2) * (-31987)) ^ (-2082662789);
                    i5 = -1943017356;
                    break;
                case -773128309:
                case 685251920:
                    ((C12474) pluginContextM41540).log(th);
                    break;
                case -188069264:
                case 2034018081:
                    if (C0892.m55749()) {
                        iM55680 = C0873.m55680("ۛ۬") ^ i2;
                        i4 = ((iM55680 ^ i3) * 24119) ^ (-2045670338);
                        i5 = 472062278;
                    } else {
                        iM55680 = (C0946.m55979("ۧᩴ") ^ i2) * 109;
                        i4 = ((iM55680 ^ i3) * 1771) ^ 556333208;
                        i5 = 361827775;
                    }
                    break;
                case 111473187:
                case 147270723:
                    C0877.m55696();
                    break;
                case 398666498:
                case 1236634354:
                    if (RunnableC0897.f81856) {
                        iM55680 = (C0946.m55979("۟ۚ") ^ i2) * (-107);
                        i4 = ((iM55680 ^ i3) * 21003) ^ (-1772435409);
                        i5 = 1659747213;
                    } else {
                        iM55680 = (C0946.m55979("ۧᩴ") ^ i2) * 109;
                        i4 = ((iM55680 ^ i3) * 1771) ^ 556333208;
                        i5 = 361827775;
                    }
                    break;
                case 682493842:
                case 1308495281:
                    if (RunnableC0897.f81856) {
                        iM55680 = C0946.m55979("᩶᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-1603)) ^ 2028026109;
                        i5 = -1122711328;
                    } else {
                        iM55680 = (C0946.m55979("ۧ֫") + i3) * 123;
                        i4 = ((iM55680 ^ i2) * 22709) ^ (-2004084935);
                        i5 = -2049567996;
                    }
                    break;
                case 923506289:
                case 991535532:
                    if (C1053.m56327() >= 0) {
                        iM55680 = (i3 - C0946.m55979("ᩳۘ")) * 93;
                        i4 = ((iM55680 ^ i2) * (-31987)) ^ (-2082662789);
                        i5 = -1943017356;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ۨ۫")) * 31;
                        i4 = ((iM55680 ^ i3) * (-28931)) ^ (-1454445366);
                        i5 = -2020075970;
                    }
                    break;
                case 1063412581:
                case 1607317336:
                    if (C0877.f81843 >= 0) {
                        iM55680 = (C0946.m55979("ۧᩴ") ^ i2) * 109;
                        i4 = ((iM55680 ^ i3) * 1771) ^ 556333208;
                        i5 = 361827775;
                    } else {
                        iM55680 = (C0946.m55979("ۚ֨") + i3) * (-67);
                        i4 = ((iM55680 ^ i2) * (-21639)) ^ 1598668999;
                        i5 = -1321971270;
                    }
                    break;
                case 1261476516:
                case 1503315485:
                    if (C1124.f82007 >= 0) {
                        iM55680 = (i3 - C0946.m55979("ᩳۘ")) * 93;
                        i4 = ((iM55680 ^ i2) * (-31987)) ^ (-2082662789);
                        i5 = -1943017356;
                    } else {
                        iM55680 = (C0946.m55979("᩸ۧ") ^ i3) * 37;
                        i4 = ((iM55680 ^ i2) * 27713) ^ 778628462;
                        i5 = -1062604369;
                    }
                    break;
                case 1354108881:
                case 1537082009:
                    pluginContextM41540 = m41540();
                    if (C1028.f81950 <= 0) {
                        iM55680 = (C0946.m55979("ۧ֫") + i3) * 123;
                        i4 = ((iM55680 ^ i2) * 22709) ^ (-2004084935);
                        i5 = -2049567996;
                    } else {
                        iM55680 = C0946.m55979("֡ۨ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-1275)) ^ 745676576;
                        i5 = -208465276;
                    }
                    break;
                default:
                    if (C1044.f81959 >= 0) {
                        iM55680 = (C0946.m55979("ۧ֫") + i3) * 123;
                        i4 = ((iM55680 ^ i2) * 22709) ^ (-2004084935);
                        i5 = -2049567996;
                    } else {
                        iM55680 = (C0873.m55680("᩶ܰ") + i3) * (-11);
                        i4 = ((iM55680 ^ i2) * (-24151)) ^ 1256091035;
                        i5 = -40304021;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x011e A[PHI: r8
      0x011e: PHI (r8v6 java.lang.Object) = (r8v4 java.lang.Object), (r8v4 java.lang.Object), (r8v5 java.lang.Object), (r8v4 java.lang.Object) binds: [B:46:0x011c, B:34:0x00cd, B:28:0x0089, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x014c  */
    /* JADX WARN: Code duplicated, block: B:59:0x019b A[PHI: r0
      0x019b: PHI (r0v5 boolean) = (r0v2 boolean), (r0v2 boolean), (r0v4 boolean), (r0v2 boolean), (r0v2 boolean), (r0v2 boolean) binds: [B:58:0x0199, B:54:0x017a, B:38:0x00e7, B:16:0x004c, B:13:0x0043, B:10:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    public C18249() {
        int iM55680;
        int i;
        boolean z = false;
        ArrayList arrayList = null;
        int i2 = -1035433389;
        int i3 = RunnableC1014.f81941;
        int i4 = C1404.f82149;
        int iM55979 = (i4 - C0946.m55979("ۗܺ")) * (-37);
        int i5 = ((iM55979 ^ i3) * 29735) ^ 217117802;
        int i6 = -1680923032;
        while (true) {
            int i7 = iM55979 ^ i6;
            Object obj = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-11279)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2025013885:
                    case -842587285:
                        this.f54497 = 21;
                        if (C1046.f81962 <= 0) {
                            iM55680 = C0873.m55680("ۗ᩻") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-23083)) ^ 240191470;
                            i = 1257004018;
                        } else {
                            iM55680 = C0873.m55680("᩻ۙ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-18361)) ^ 986367683;
                            i = -2079050973;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1833707534:
                    case 86748894:
                        z = false;
                        z = false;
                        if (C1071.f81975 <= 0) {
                            iM55680 = C0873.m55680("ۗ᩻") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-23083)) ^ 240191470;
                            i = 1257004018;
                        } else {
                            iM55680 = (C0946.m55979("᩵ܽ") ^ i3) * 101;
                            i5 = ((iM55680 ^ i4) * 14701) ^ (-1773503567);
                            i = -1923832873;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1631153590:
                    case 1742240733:
                        C0930.m55885();
                        C0927.m55873();
                        iM55680 = (C0873.m55680("ۡ֡") ^ i4) * 43;
                        i5 = ((iM55680 ^ i3) * (-14729)) ^ 1539093570;
                        i = -468307102;
                        i7 = iM55680 ^ i;
                        break;
                    case -1608965599:
                    case 1621636618:
                        C0946.m55980();
                        if (C0917.f81868) {
                            iM55680 = (C0873.m55680("᩹ۧ") ^ i3) * (-77);
                            i5 = ((iM55680 ^ i4) * (-32515)) ^ (-291584628);
                            i = -905038363;
                        } else {
                            iM55680 = C0873.m55680("ۗ᩻") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-23083)) ^ 240191470;
                            i = 1257004018;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1515357130:
                    case 508506484:
                        if (RunnableC0938.f81886 >= 0) {
                            iM55680 = (C0946.m55979("ۘ֨") ^ i4) * (-97);
                            i5 = ((iM55680 ^ i3) * (-18919)) ^ 220576954;
                            i = -81961314;
                        } else {
                            iM55680 = (C0873.m55680("֫ۜ") + i4) * 67;
                            i5 = ((iM55680 ^ i3) * 22073) ^ 1269335864;
                            i = -1134104438;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1488367259:
                    case -1127233115:
                        if (RunnableC0871.f81839 >= 0) {
                            iM55680 = (C0946.m55979("ۘ֨") ^ i4) * (-97);
                            i5 = ((iM55680 ^ i3) * (-18919)) ^ 220576954;
                            i = -81961314;
                        } else {
                            iM55680 = C0946.m55979("ۨᩴ") ^ i4;
                            i5 = ((iM55680 ^ i3) * 13217) ^ 77351441;
                            i = 1184432194;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1321381087:
                    case 1185858204:
                        C1036.m56257();
                        if (RunnableC1014.f81941 <= 0) {
                            iM55680 = (C0873.m55680("ۡ֡") ^ i4) * 43;
                            i5 = ((iM55680 ^ i3) * (-14729)) ^ 1539093570;
                            i = -468307102;
                        } else {
                            iM55680 = C0873.m55680("ۗ᩻") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-23083)) ^ 240191470;
                            i = 1257004018;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -668562120:
                    case 1472373446:
                        if (RunnableC0897.f81856) {
                            iM55680 = (C0946.m55979("ۘ֨") ^ i4) * (-97);
                            i5 = ((iM55680 ^ i3) * (-18919)) ^ 220576954;
                            i = -81961314;
                        } else {
                            iM55680 = C0873.m55680("ۗ᩻") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-23083)) ^ 240191470;
                            i = 1257004018;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -552019558:
                    case -368910379:
                        this.f54488 = arrayList;
                        if (C0873.f81841 > 0) {
                            obj = new Object();
                            if (C1044.m56286() <= 0) {
                                iM55680 = (C0873.m55680("᩹ۧ") ^ i3) * (-77);
                                i5 = ((iM55680 ^ i4) * (-32515)) ^ (-291584628);
                                i = -905038363;
                            } else {
                                iM55680 = C0873.m55680("᩸ܽ") ^ i3;
                                i5 = ((iM55680 ^ i4) * (-32175)) ^ (-549656008);
                                i = -1944186033;
                            }
                            i7 = iM55680 ^ i;
                        }
                        break;
                    case -506322306:
                    case 739965038:
                        this.f54498 = z ? 1 : 0;
                        if (C0989.f81920 >= 0) {
                            iM55680 = (C0873.m55680("᩹ۧ") ^ i3) * (-77);
                            i5 = ((iM55680 ^ i4) * (-32515)) ^ (-291584628);
                            i = -905038363;
                        } else {
                            iM55680 = C0873.m55680("۠ۗ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-21427)) ^ (-1473308320);
                            i = -602066733;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -302521049:
                    case 321318027:
                        this.f54490 = obj;
                        this.f54500 = z;
                        return;
                    case -29162101:
                    case 1194234006:
                        RunnableC1014.m56177();
                        throw new RuntimeException();
                    case 996080685:
                    case 1093676079:
                        if (C1028.f81950 <= 0) {
                            iM55680 = (C0873.m55680("᩹ۧ") ^ i3) * (-77);
                            i5 = ((iM55680 ^ i4) * (-32515)) ^ (-291584628);
                            i = -905038363;
                        } else {
                            iM55680 = C0946.m55979("᩶᩸") ^ i3;
                            i5 = ((iM55680 ^ i4) * 28383) ^ 2105628301;
                            i = -584693046;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case 1015948651:
                    case 1346187169:
                        if (RunnableC1014.m56177()) {
                            iM55680 = (i3 - C0946.m55979("֨ᩴ")) * 33;
                            i5 = ((iM55680 ^ i4) * 3779) ^ (-1857620939);
                            i = 981990455;
                        } else {
                            iM55680 = C0873.m55680("ۗ᩻") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-23083)) ^ 240191470;
                            i = 1257004018;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    default:
                        arrayList = new ArrayList();
                        if (RunnableC0871.f81839 < 0) {
                            iM55680 = C0873.m55680("᩺ᩳ") ^ i3;
                            i5 = ((iM55680 ^ i4) * 13331) ^ 238120247;
                            i = -1091478770;
                            i7 = iM55680 ^ i;
                        }
                        break;
                }
            }
            iM55979 = C0873.m55680("ᩳܰ") ^ i3;
            i5 = ((iM55979 ^ i4) * (-15167)) ^ (-1402993294);
            i6 = 908809334;
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public final void m41534() {
        m41525();
        this.f54487 = null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final PluginContext m41540() {
        int i = 1934591637;
        int i2 = C1964.f83032;
        int i3 = C0992.f81922;
        int iM55979 = C0946.m55979("۟۠") ^ i2;
        int i4 = ((iM55979 ^ i3) * 1547) ^ (-95086371);
        int i5 = 82392901;
        while (true) {
            i = ((((i ^ i3) * (-655)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1977453168:
                case -1564717366:
                    if (C1028.m56247() >= 0) {
                        iM55979 = C0873.m55680("᩻ۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-26339)) ^ (-1800740181);
                        i5 = -1417609805;
                    } else {
                        iM55979 = (C0946.m55979("᩷ۗ") + i2) * (-77);
                        i4 = ((iM55979 ^ i3) * 1535) ^ (-903299890);
                        i5 = 1015749321;
                    }
                    break;
                case -1704976817:
                case 1179756654:
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0873.m55680("᩻ۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-26339)) ^ (-1800740181);
                        i5 = -1417609805;
                    } else {
                        iM55979 = (C0946.m55979("֨۫") ^ i3) * (-123);
                        i4 = ((iM55979 ^ i2) * 3485) ^ 769255082;
                        i5 = 727204459;
                    }
                    break;
                case -1619875815:
                case 371268922:
                    return this.f54494;
                case -1504567799:
                case -181075536:
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0873.m55680("᩻ۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-26339)) ^ (-1800740181);
                        i5 = -1417609805;
                    } else {
                        iM55979 = (C0946.m55979("ۘ᩷") + i3) * 47;
                        i4 = ((iM55979 ^ i2) * 24875) ^ 1009791671;
                        i5 = -835682658;
                    }
                    break;
                case -1485178416:
                case 1419236569:
                    if (C0912.f81867 <= 0) {
                        iM55979 = (C0873.m55680("ᩳ᩹") + i2) * 47;
                        i4 = ((iM55979 ^ i3) * 23875) ^ 2040625883;
                        i5 = -667278683;
                    } else {
                        iM55979 = (C0946.m55979("᩶۬") ^ i3) * (-107);
                        i4 = ((iM55979 ^ i2) * (-22927)) ^ (-1317325381);
                        i5 = -2136646429;
                    }
                    break;
                case -1477384354:
                case 1860459743:
                    if (C1012.f81938 >= 0) {
                        iM55979 = C0873.m55680("ܺ᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25811)) ^ (-1155661671);
                        i5 = 1135152782;
                    } else {
                        iM55979 = (C0946.m55979("᩹ܺ") ^ i2) * 3;
                        i4 = ((iM55979 ^ i3) * 26577) ^ 2125942239;
                        i5 = -180919329;
                    }
                    break;
                case -1375175424:
                case -565387600:
                    C0930.m55885();
                    return null;
                case -742797377:
                case 230745430:
                    if (C0927.f81875) {
                        iM55979 = C0946.m55979("֡ܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14435) ^ (-1836629356);
                        i5 = 1327588575;
                    } else {
                        iM55979 = C0946.m55979("ᩳۤ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-26759)) ^ 1010278068;
                        i5 = -417628803;
                    }
                    break;
                case -583511837:
                case 1176653698:
                    if (C1048.m56305() >= 0) {
                        iM55979 = (C0873.m55680("֡ۤ") ^ i2) * (-119);
                        i4 = ((iM55979 ^ i3) * 24305) ^ (-732512628);
                        i5 = -1220606732;
                    } else {
                        iM55979 = C0873.m55680("ܺ᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25811)) ^ (-1155661671);
                        i5 = 1135152782;
                    }
                    break;
                case -333032036:
                case 1030982338:
                    if (!C0955.f81898) {
                        iM55979 = C0873.m55680("᩻ۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-26339)) ^ (-1800740181);
                        i5 = -1417609805;
                    } else {
                        iM55979 = C0946.m55979("֡ܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14435) ^ (-1836629356);
                        i5 = 1327588575;
                    }
                    break;
                case -277587687:
                case 998367056:
                    if (C1025.m56230()) {
                        iM55979 = (C0873.m55680("ᩳ᩹") + i2) * 47;
                        i4 = ((iM55979 ^ i3) * 23875) ^ 2040625883;
                        i5 = -667278683;
                    } else {
                        iM55979 = C0873.m55680("۠ᩳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-1241)) ^ 2017663337;
                        i5 = -430299441;
                    }
                    break;
                case -164609101:
                case 2059589523:
                    C1012.m56134();
                    if (C1194.f82045 != 0) {
                        iM55979 = C0873.m55680("᩻ۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-26339)) ^ (-1800740181);
                        i5 = -1417609805;
                    } else {
                        iM55979 = C0873.m55680("ܺ᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25811)) ^ (-1155661671);
                        i5 = 1135152782;
                    }
                    break;
                case 179949148:
                case 1963722330:
                    if (C0989.m56095() <= 0) {
                        iM55979 = (C0873.m55680("ᩳ᩹") + i2) * 47;
                        i4 = ((iM55979 ^ i3) * 23875) ^ 2040625883;
                        i5 = -667278683;
                    } else {
                        iM55979 = C0946.m55979("۟᩻") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-21121)) ^ (-348659381);
                        i5 = -1755338923;
                    }
                    break;
                case 327721212:
                case 822798919:
                    if (C0892.f81851) {
                        iM55979 = (i2 - C0873.m55680("֫᩵")) * 97;
                        i4 = ((iM55979 ^ i3) * (-32453)) ^ 688787858;
                        i5 = -254206890;
                    } else {
                        iM55979 = C0873.m55680("ܺ᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25811)) ^ (-1155661671);
                        i5 = 1135152782;
                    }
                    break;
                case 744102877:
                case 997215979:
                    if (this.f54494 == null) {
                        iM55979 = (i2 - C0946.m55979("ۢۚ")) * (-93);
                        i4 = ((iM55979 ^ i3) * (-3219)) ^ 1676135496;
                        i5 = 937047264;
                    } else {
                        iM55979 = C0873.m55680("ۨۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-29597)) ^ 452446496;
                        i5 = 1926495515;
                    }
                    break;
                case 813657972:
                case 1527532289:
                    m41518((C19561) null);
                    iM55979 = C0873.m55680("ۨۚ") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-29597)) ^ 452446496;
                    i5 = 1926495515;
                    break;
                case 1142459252:
                case 1657215624:
                    C0947.m55997();
                    iM55979 = C0873.m55680("ܺ᩸") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-25811)) ^ (-1155661671);
                    i5 = 1135152782;
                    break;
                default:
                    if (C1024.f81946) {
                        iM55979 = (C0873.m55680("֡ۤ") ^ i2) * (-119);
                        i4 = ((iM55979 ^ i3) * 24305) ^ (-732512628);
                        i5 = -1220606732;
                    } else {
                        iM55979 = (C0946.m55979("᩺᩵") ^ i3) * 87;
                        i4 = ((iM55979 ^ i2) * (-27443)) ^ (-595599793);
                        i5 = -103788115;
                    }
                    break;
            }
        }
    }

    static {
        ApplicationC14266.m56479(127);
        f82265 = new short[]{5876, 23874, 23896, 23857, 23900, 23879, 23891, 23863, 23830, 23857, 23897, 23902, 23863, 23857, 23898, 23879, 23891, 23863, 23875, 23874, 23898, 23857, 23899, 23879, 23891, 23863, 23830, 23899, 23857, 23898, 23879, 23896, 23863, 23875, 23874, 23898, 23857, 23899, 23879, 23891, 23863, 23830, 23857, 23899, 23896, 23863, 23857, 23898, 23879, 23891, 23863, 23830, 23897, 23857, 23898, 23879, 23899, 23863, 23875, 23874, 23857, 23898, 23879, 23891, 23863, 23857, 23898, 23879, 23891, 23863, 23875, 1399, -115, -97, -97, -119, -104, -97, -61, 7766, 22639, 22643, 22639, 22635, 22643, 22638, 22637, 22639, 22643, 22643, 7651, -25244, -25335, -25328, -25116, -25233, -25321, -25344, -25329, -25244, -25226, -25233, -25339, -25302, -25312, -25290, -25301, -25299, -25312, -25244, -25339, -25302, -25312, -25290, -25301, -25299, -25312, -25116, -25244, -25244, 698, 31309, 31306, 31312, 31297, 31318, 31298, 31301, 31303, 31297, 31319, 31297, 31306, 31301, 31302, 31304, 31297, 31305, 31296, 31249, 31309, 31306, 31319, 31312, 31301, 31304, 31304, 31330, 31318, 31307, 31305, 31335, 31297, 31306, 31312, 31297, 31318, 2345, -8235, -8238, -8248, -8231, -8242, -8230, -8227, -8225, -8231, -8241, 3144, 8981, 8986, 8991, 8982, 8960, 6763, -16586, -16580, -16592, -16591, -16527, -16600, -16582, -16579, -16593, -16586, -16580, -16592, -16591, -16527, -16593, -16591, -16584, -16586, -16580, -16592, -16591, -16527, -16587, -16593, -16584, 2323, 21897, 21909, 21900, 21918, 21904, 21911, 21930, 21917, 21906, 21935, 21916, 21899, 21898, 21904, 21910, 21911, 21897, 21909, 21900, 21918, 21904, 21911, 21930, 21917, 21906, 21935, 21916, 21899, 21898, 21904, 21910, 21911, 21977, 21957, 21956, 21977, 21961, 21897, 21909, 21900, 21918, 21904, 21911, 21936, 21949, 21903, 21916, 21899, 21898, 21904, 21910, 21911, 21946, 21910, 21917, 21916, 21903, 21916, 21899, 21898, 21904, 21910, 21911, 21946, 21910, 21917, 21916, 21977, 21957, 21956, 21977, 21961, 21903, 21916, 21899, 21898, 21904, 21910, 21911, 21943, 21912, 21908, 21916, 21911, 21912, 21908, 21916, 21917, 21916, 21898, 21914, 21899, 21904, 21897, 21901, 21904, 21910, 21911, 21908, 21912, 21904, 21911, 21929, 21899, 21916, 21919, 21916, 21899, 21916, 21911, 21914, 21916, 21908, 21904, 21911, 21937, 21910, 21898, 21901, 21935, 21916, 21899, 21898, 21904, 21910, 21911, 21908, 21904, 21911, 21944, 21911, 21917, 21899, 21910, 21904, 21917, 21935, 21916, 21899, 21898, 21904, 21910, 21911, 21917, 21916, 21889, 21940, 21910, 21917, 21916, 21908, 21904, 21911, 21937, 21910, 21898, 21901, 21935, 21916, 21899, 21898, 21904, 21910, 21911, 21977, 21957, 21977, 21961, 21901, 21916, 21898, 21901, 21942, 21911, 21909, 21888, 21908, 21904, 21911, 21944, 21911, 21917, 21899, 21910, 21904, 21917, 21935, 21916, 21899, 21898, 21904, 21910, 21911, 21977, 21957, 21977, 21961, 2288, 15564, 15568, 15561, 15579, 15573, 15570, 15506, 15569, 15560, 15564, 2643, 24034, 24038, 24033, 24014, 24033, 24043, 24061, 24032, 24038, 24043, 24025, 24042, 24061, 24060, 24038, 24032, 24033, 24034, 24038, 24033, 24007, 24032, 24060, 24059, 24025, 24042, 24061, 24060, 24038, 24032, 24033, 24063, 24035, 24058, 24040, 24038, 24033, 24028, 24043, 24036, 24025, 24042, 24061, 24060, 24038, 24032, 24033, 24063, 24035, 24058, 24040, 24038, 24033, 24006, 24011, 24057, 24042, 24061, 24060, 24038, 24032, 24033, 24012, 24032, 24043, 24042, 24057, 24042, 24061, 24060, 24038, 24032, 24033, 24001, 24046, 24034, 24042, 24033, 24046, 24034, 24042, 24043, 24042, 24060, 24044, 24061, 24038, 24063, 24059, 24038, 24032, 24033, 24038, 24033, 24059, 24042, 24061, 24041, 24046, 24044, 24042, 24060, 24034, 24046, 24038, 24033, 24031, 24061, 24042, 24041, 24042, 24061, 24042, 24033, 24044, 24042, 24042, 24033, 24046, 24045, 24035, 24042, 24034, 24043, 23994, 24043, 24042, 24055, 24002, 24032, 24043, 24042, 24059, 24042, 24060, 24059, 24000, 24033, 24035, 24054, 24038, 24033, 24060, 24059, 24046, 24035, 24035, 24009, 24061, 24032, 24034, 24012, 24042, 24033, 24059, 24042, 24061, 9786, -15789, -15836, -15839, -15839, -15809, -15780, -15753, -15750, -15748, -15756, -15780, -15757, -15746, -15764, -15764, -15783, -15746, -15754, -15757, -15835, -15809, 21792, 19395, -17288, 23945, -26174, -27179, -15839, -15839, -15809, -15797, -15763, -15746, -15759, -15764, -15757, -15746, -15765, -15754, -15760, -15759, -15782, -15759, -15752, -15754, -15759, -15750, -15835, -15809, -15839, -15839, -15809, -15796, -15753, -15760, -15766, -15757, -15749, -15779, -15750, -15793, -15757, -15766, -15752, -15754, -15759, -15793, -15763, -15750, -15751, -15750, -15763, -15750, -15759, -15748, -15750, -15835, -15809, -18540, 18744, -28206, -15839, -15839, -15809, -15797, -15750, -15769, -15765, -15782, -15749, -15754, -15765, -15760, -15763, -15783, -15766, -15759, -15748, -15765, -15754, -15760, -15759, -15835, -15809, -15839, -15839, -15809, -15797, -15750, -15769, -15765, -15782, -15749, -15754, -15765, -15760, -15763, -15783, -15757, -15760, -15746, -15765, -15754, -15759, -15752, -15790, -15750, -15759, -15766, -15835, -15809, -15839, -15839, -15809, -15798, -15759, -15756, -15759, -15760, -15768, -15759, -15786, -15759, -15765, -15750, -15763, -15751, -15746, -15748, -15750, -15835, -15809, -29403, -19713, -17244, -15839, -15839, -15809, -15797, -15750, -15769, -15765, -15782, -15749, -15754, -15765, -15760, -15763, -15797, -15760, -15760, -15757, -15790, -15750, -15759, -15766, -15835, -15809, 8343, -21756, -21752, -21757, -21758, -2979, 12609, -11844, -21756, -21752, -21757, -21758, -21704, -21737, -21754, -21741, -21756, -21745, -21756, -21752, -21757, -21758, -21756, -21752, -21757, -21758, -21704, -21737, -21754, -21741, -21756, -21745, -21756, -21752, -21757, -21758, -21737, -21749, -21742, -21760, -21746, -21751, -21687, -21750, -21741, -21737, -21756, -21752, -21757, -21758, -21704, -21737, -21754, -21741, -21756, -21745, -21737, -21749, -21742, -21760, -21746, -21751, -21687, -21750, -21741, -21737, 9037, -18774, -19304, 17150, 2977, -2990, -2994, -2985, -3003, -2997, -2996, -3060, -2993, -2986, -2990, 1892, -18517, -18516, -18518, -18511, -18506, -18497, -18517, -18503, -18517, -18517, -18499, -18516, -18517, -18441, -18517, -18516, -18518, -18511, -18506, -18497, -18517, -18442, -18507, -18516, -18508, -18503, -18517, -18517, -18499, -18516, -18517, -18441, -18549, -18516, -18518, -18511, -18506, -18497, -18442, -18507, -18516, -18508, -18549, -18516, -18518, -18511, -18506, -18497, 3746, -3185, -3171, -3171, -3189, -3174, -3171, -3135, -3130, -3133, -3147, -3185, -3133, -3180, -3149, -3179, -3108, -3134, -3107, -3181, -3130, -3133, -3147, -3153, -3133, -3148, -3149, -3179, -3108, -3134, -3107, -3181, -3129, -3119, -3129, -3119, -3150, -3136, -3197, -3174, -3198, 9686, 27075, 27103, 27078, 27092, 27098, 27101, 27037, 27102, 27079, 27075, 27088, 27090, 27088, 27099, 27094, 27088, 27103, 27090, 27072, 27072, 27094, 27072, 27037, 27095, 27094, 27083, 27100, 27075, 27079, 27010, 27100, 27075, 27079, 27009, 27100, 27075, 27079, 27009, 27135, 27100, 27090, 27095, 27027, 27093, 27090, 27098, 27103, 27094, 27095};
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1697052165;
        int i7 = C1028.f81950;
        int i8 = C0930.f81879;
        int iM55979 = C0946.m55979("ۨۜ") ^ i8;
        int i9 = ((iM55979 ^ i7) * 11593) ^ (-688170600);
        int i10 = -1127230125;
        while (true) {
            i6 = ((((i6 ^ i7) * 2465) >> 31) & i9) ^ (iM55979 ^ i10);
            switch (i6) {
                case -1942330810:
                case -522081133:
                    f54479 = C13259.m30304(C1028.m56235(sArr2, i4, i5, i3));
                    return;
                case -1859306588:
                case 689598701:
                    if (!C1048.f81963) {
                        iM55979 = (C0946.m55979("ۖ۬") ^ i7) * 19;
                        i9 = ((iM55979 ^ i8) * (-22965)) ^ 596074455;
                        i10 = -1482480767;
                    } else {
                        iM55979 = C0946.m55979("᩻ۙ") ^ i8;
                        i9 = ((iM55979 ^ i7) * (-5219)) ^ 1532624634;
                        i10 = 1985493389;
                    }
                    break;
                case -1837995951:
                case 545949718:
                    sArr = f82265;
                    c = 0;
                    if (C0890.f81849 != 0) {
                        iM55979 = (i8 - C0946.m55979("ܰ᩺")) * 79;
                        i9 = ((iM55979 ^ i7) * 12505) ^ (-971458731);
                        i10 = -242031287;
                    } else {
                        iM55979 = C0946.m55979("ܳۢ") ^ i8;
                        i9 = ((iM55979 ^ i7) * (-3969)) ^ 1120904298;
                        i10 = -376663756;
                    }
                    break;
                case -1707530687:
                case -1648973731:
                    C1404.m56468();
                    throw new RuntimeException();
                case -1620772297:
                case -1180081396:
                    i3 = 23914;
                    iM55979 = (i7 - C0946.m55979("᩸ۖ")) * 77;
                    i9 = ((iM55979 ^ i8) * (-6571)) ^ 826645197;
                    i10 = 1420269714;
                    break;
                case -1161459447:
                case -750431755:
                    sArr2 = f82265;
                    i4 = 1;
                    if (C1024.m56209() >= 0) {
                        iM55979 = C0873.m55680("ۨܳ") ^ i7;
                        i9 = ((iM55979 ^ i8) * 10553) ^ (-240438063);
                        i10 = 1338238275;
                    } else {
                        iM55979 = C0873.m55680("ܳ֫") ^ i8;
                        i9 = ((iM55979 ^ i7) * 26653) ^ 202089932;
                        i10 = 2138120013;
                    }
                    break;
                case -953084211:
                case 418270275:
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0873.m55680("ۗᩳ") ^ i8;
                        i9 = ((iM55979 ^ i7) * 22531) ^ 694787258;
                        i10 = 2136687336;
                    } else {
                        iM55979 = C0873.m55680("ۨ᩹") ^ i7;
                        i9 = ((iM55979 ^ i8) * (-29383)) ^ (-1815073201);
                        i10 = 16459477;
                    }
                    break;
                case -751462712:
                case 1899447089:
                    if (C0917.m55854()) {
                        iM55979 = (C0873.m55680("֫۬") + i7) * (-113);
                        i9 = ((iM55979 ^ i8) * (-11727)) ^ (-899351515);
                        i10 = 1080396230;
                    } else {
                        iM55979 = (i8 - C0946.m55979("ܰ᩺")) * 79;
                        i9 = ((iM55979 ^ i7) * 12505) ^ (-971458731);
                        i10 = -242031287;
                    }
                    break;
                case -643580900:
                case -423857067:
                    s = sArr[c];
                    if (C0947.m55997()) {
                        iM55979 = C0946.m55979("᩻ۙ") ^ i8;
                        i9 = ((iM55979 ^ i7) * (-5219)) ^ 1532624634;
                        i10 = 1985493389;
                    } else {
                        iM55979 = C0873.m55680("ۤۖ") ^ i8;
                        i9 = ((iM55979 ^ i7) * (-13447)) ^ 1979689802;
                        i10 = 951938781;
                    }
                    break;
                case -475767107:
                case 629346632:
                    i3 = 29904;
                    iM55979 = (i7 - C0946.m55979("᩸ۖ")) * 77;
                    i9 = ((iM55979 ^ i8) * (-6571)) ^ 826645197;
                    i10 = 1420269714;
                    break;
                case -442232724:
                case 624470620:
                    if (i2 - (s * s2) >= 0) {
                        iM55979 = (C0946.m55979("ۧܿ") ^ i7) * 79;
                        i9 = ((iM55979 ^ i8) * 32557) ^ (-1375602022);
                        i10 = 76307519;
                    } else {
                        iM55979 = (i8 - C0946.m55979("۬᩺")) * (-93);
                        i9 = ((iM55979 ^ i7) * 18461) ^ 214578812;
                        i10 = -433150715;
                    }
                    break;
                case -369700143:
                case 318481551:
                    i2 = i * i;
                    s2 = 8196;
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0873.m55680("ۨܳ") ^ i7;
                        i9 = ((iM55979 ^ i8) * 10553) ^ (-240438063);
                        i10 = 1338238275;
                    } else {
                        iM55979 = C0873.m55680("ۙ᩵") ^ i7;
                        i9 = ((iM55979 ^ i8) * 2227) ^ 69840237;
                        i10 = 1138822149;
                    }
                    break;
                case -250487258:
                case 1491493829:
                    C0917.m55854();
                    if (C1404.f82149 >= 0) {
                        iM55979 = (C0946.m55979("ۖ۬") ^ i7) * 19;
                        i9 = ((iM55979 ^ i8) * (-22965)) ^ 596074455;
                        i10 = -1482480767;
                    } else {
                        iM55979 = C0873.m55680("ۗᩳ") ^ i8;
                        i9 = ((iM55979 ^ i7) * 22531) ^ 694787258;
                        i10 = 2136687336;
                    }
                    break;
                case 87240597:
                case 1374080354:
                    C1024.m56209();
                    C1229.m56410();
                    iM55979 = (i8 - C0946.m55979("ܰ᩺")) * 79;
                    i9 = ((iM55979 ^ i7) * 12505) ^ (-971458731);
                    i10 = -242031287;
                    break;
                case 92731976:
                case 1509323242:
                    C0863.m55643();
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55979 = C0873.m55680("ۗᩳ") ^ i8;
                        i9 = ((iM55979 ^ i7) * 22531) ^ 694787258;
                        i10 = 2136687336;
                    } else {
                        iM55979 = (i8 - C0946.m55979("ܰ᩺")) * 79;
                        i9 = ((iM55979 ^ i7) * 12505) ^ (-971458731);
                        i10 = -242031287;
                    }
                    break;
                case 369152857:
                case 857054666:
                    i = s + 2049;
                    if (C0863.f81833 <= 0) {
                        iM55979 = C0873.m55680("ۨܳ") ^ i7;
                        i9 = ((iM55979 ^ i8) * 10553) ^ (-240438063);
                        i10 = 1338238275;
                    } else {
                        iM55979 = C0873.m55680("ۜܶ") ^ i8;
                        i9 = ((iM55979 ^ i7) * (-6449)) ^ (-1275424551);
                        i10 = 1011228323;
                    }
                    break;
                case 1164448991:
                case 1367755369:
                    if (C0890.f81849 != 0) {
                        iM55979 = C0946.m55979("᩻ۙ") ^ i8;
                        i9 = ((iM55979 ^ i7) * (-5219)) ^ 1532624634;
                        i10 = 1985493389;
                    } else {
                        iM55979 = C0946.m55979("᩻ۡ") ^ i8;
                        i9 = ((iM55979 ^ i7) * 5663) ^ 35340338;
                        i10 = 1602820353;
                    }
                    break;
                case 1372363363:
                case 2059597904:
                    i5 = 70;
                    if (C0992.f81922 >= 0) {
                        iM55979 = (i8 - C0946.m55979("ܰ᩺")) * 79;
                        i9 = ((iM55979 ^ i7) * 12505) ^ (-971458731);
                        i10 = -242031287;
                    } else {
                        iM55979 = C0946.m55979("ۙܶ") ^ i7;
                        i9 = ((iM55979 ^ i8) * 1693) ^ (-1353936989);
                        i10 = -354160162;
                    }
                    break;
                default:
                    if (C1012.f81938 >= 0) {
                        iM55979 = (i8 - C0946.m55979("ܰ᩺")) * 79;
                        i9 = ((iM55979 ^ i7) * 12505) ^ (-971458731);
                        i10 = -242031287;
                    } else {
                        iM55979 = C0873.m55680("۠ۡ") ^ i7;
                        i9 = ((iM55979 ^ i8) * 20097) ^ 694461604;
                        i10 = 598835259;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
    
        if (p067l.AbstractC0942.f81890 <= 0) goto L17;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m41518(C19561 c19561) {
        int i;
        short[] sArr;
        int i2;
        int i3;
        int i4;
        int i5;
        short s;
        int i6;
        int iM55979;
        int i7;
        int i8;
        int i9;
        short s2;
        int i10;
        short[] sArr2;
        int i11;
        int iM55680;
        int i12;
        AbstractC17043 abstractC17043M34322 = null;
        int i13 = C0898.f81858;
        int i14 = C1124.f82007;
        int iM559710 = C0946.m55979("֨᩺") ^ i13;
        int i15 = ((iM559710 ^ i14) * 29329) ^ 117323644;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i16 = iM559710 ^ (-700068028);
        String str = null;
        char c = 0;
        short s3 = 0;
        int i17 = 0;
        int i18 = 0;
        short s4 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 633997563;
        while (true) {
            i22 = i16 ^ (i15 & (((i22 ^ i14) * (-19793)) >> 31));
            switch (i22) {
                case -2136719469:
                case -530931302:
                    C1028.m56247();
                    break;
                case -2099350559:
                case 315076154:
                    i19 = 9075;
                    int iM559711 = (C0946.m55979("ܶۜ") + i13) * (-69);
                    i16 = iM559711 ^ (-754662222);
                    i15 = ((iM559711 ^ i14) * (-27113)) ^ (-84560083);
                    sArr4 = sArr4;
                    i20 = i20;
                    i21 = i21;
                    s4 = s4;
                    i14 = i14;
                    break;
                case -1736093511:
                case -968296801:
                    C0906.m55809();
                    s2 = s4;
                    i10 = i19;
                    sArr2 = sArr4;
                    i11 = i14;
                    iM55680 = C0873.m55680("ܺ᩻") ^ i13;
                    i2 = ((iM55680 ^ i11) * 22687) ^ 507919275;
                    i12 = -388080429;
                    i3 = iM55680 ^ i12;
                    i19 = i10;
                    sArr4 = sArr2;
                    s4 = s2;
                    i14 = i11;
                    i16 = i3;
                    i15 = i2;
                    break;
                case -1716825373:
                case -1348911295:
                    AbstractC17043 abstractC17043M56217 = C1024.m56217(abstractC17043M34322, C1229.m56403(sArr4, i20, i21, i19));
                    if (C0937.m55918() < 0) {
                        i = i19;
                        String str2 = this.f54480;
                        sArr = sArr4;
                        int i23 = this.f54492;
                        if (RunnableC0897.f81856) {
                            i4 = i20;
                            int i24 = this.f54502;
                            i5 = i21;
                            String str3 = this.f54499;
                            s = s4;
                            if (C1025.f81947 < 0) {
                                C15646 c15646 = new C15646(str);
                                i6 = i14;
                                if (C0898.f81858 > 0) {
                                    this.f54494 = new C12474(str, str2, i23, i24, str3, abstractC17043M56217, c15646, new C13303(this), new C13303(this));
                                } else {
                                    iM55979 = (C0946.m55979("ۨ۫") + i6) * (-99);
                                    i7 = ((iM55979 ^ i13) * 10685) ^ (-1095914754);
                                    i8 = 1756148462;
                                    i9 = iM55979 ^ i8;
                                    i15 = i7;
                                    i19 = i;
                                    sArr4 = sArr;
                                    i20 = i4;
                                    i21 = i5;
                                    s4 = s;
                                    i14 = i6;
                                    i16 = i9;
                                }
                            } else {
                                int iM559712 = (C0946.m55979("۠ۛ") ^ i13) * (-49);
                                i2 = ((iM559712 ^ i14) * (-13455)) ^ (-468635412);
                                i3 = iM559712 ^ (-1730597726);
                                i19 = i;
                                sArr4 = sArr;
                                i20 = i4;
                                i21 = i5;
                                s4 = s;
                            }
                        } else {
                            int iM559713 = C0946.m55979("ۗ֡") ^ i13;
                            i2 = ((iM559713 ^ i14) * (-14369)) ^ (-1052807544);
                            i3 = iM559713 ^ 1695639132;
                            i19 = i;
                            sArr4 = sArr;
                        }
                        i16 = i3;
                        i15 = i2;
                    } else {
                        i = i19;
                        i4 = i20;
                        i5 = i21;
                        i6 = i14;
                        int iM55681 = (i6 - C0873.m55680("ۙۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        int i25 = 882236839 ^ iM55681;
                        i15 = ((iM55681 ^ i13) * 4859) ^ 726888513;
                        i20 = i4;
                        i21 = i5;
                        i14 = i6;
                        int i26 = i;
                        i16 = i25;
                        i19 = i26;
                    }
                    break;
                case -1466272355:
                case 1838528574:
                    C1404.m56468();
                    if (!C0877.m55696()) {
                        s = s4;
                        i = i19;
                        sArr = sArr4;
                        i4 = i20;
                        i5 = i21;
                        i6 = i14;
                        iM55979 = (C0946.m55979("ۨ۫") + i6) * (-99);
                        i7 = ((iM55979 ^ i13) * 10685) ^ (-1095914754);
                        i8 = 1756148462;
                        i9 = iM55979 ^ i8;
                        i15 = i7;
                        i19 = i;
                        sArr4 = sArr;
                        i20 = i4;
                        i21 = i5;
                        s4 = s;
                        i14 = i6;
                        i16 = i9;
                    } else {
                        i = i19;
                        i4 = i20;
                        i5 = i21;
                        i6 = i14;
                        int iM55682 = (i6 - C0873.m55680("ۙۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        int i27 = 882236839 ^ iM55682;
                        i15 = ((iM55682 ^ i13) * 4859) ^ 726888513;
                        i20 = i4;
                        i21 = i5;
                        i14 = i6;
                        int i28 = i;
                        i16 = i27;
                        i19 = i28;
                    }
                    break;
                case -1421844353:
                case 520466069:
                    s = s4;
                    i = i19;
                    sArr = sArr4;
                    i4 = i20;
                    i5 = i21;
                    i6 = i14;
                    c = 168;
                    if (C0967.f81910 < 0) {
                        iM55979 = C0946.m55979("ܰ᩸") ^ i13;
                        i7 = ((iM55979 ^ i6) * (-19945)) ^ 1401367933;
                        i8 = -684758659;
                        i9 = iM55979 ^ i8;
                        i15 = i7;
                        i19 = i;
                        sArr4 = sArr;
                        i20 = i4;
                        i21 = i5;
                        s4 = s;
                        i14 = i6;
                        i16 = i9;
                    } else {
                        sArr4 = sArr;
                        s4 = s;
                        int iM55683 = (i6 - C0873.m55680("ۙۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        int i29 = 882236839 ^ iM55683;
                        i15 = ((iM55683 ^ i13) * 4859) ^ 726888513;
                        i20 = i4;
                        i21 = i5;
                        i14 = i6;
                        int i210 = i;
                        i16 = i29;
                        i19 = i210;
                    }
                    break;
                case -557776546:
                case -482904641:
                    s = s4;
                    i = i19;
                    sArr = sArr4;
                    i4 = i20;
                    i5 = i21;
                    i6 = i14;
                    sArr3 = f82265;
                    if (C0989.f81920 >= 0) {
                        iM55979 = (C0946.m55979("ۨ۫") + i6) * (-99);
                        i7 = ((iM55979 ^ i13) * 10685) ^ (-1095914754);
                        i8 = 1756148462;
                    } else {
                        iM55979 = (C0946.m55979("ۚܽ") ^ i6) * 83;
                        i7 = ((iM55979 ^ i13) * 22079) ^ (-2071348282);
                        i8 = 1114034275;
                    }
                    i9 = iM55979 ^ i8;
                    i15 = i7;
                    i19 = i;
                    sArr4 = sArr;
                    i20 = i4;
                    i21 = i5;
                    s4 = s;
                    i14 = i6;
                    i16 = i9;
                    break;
                case -542402563:
                case 1500461521:
                    s = s4;
                    i = i19;
                    sArr = sArr4;
                    i4 = i20;
                    i5 = i21;
                    i6 = i14;
                    s3 = sArr3[c];
                    i17 = s3 * 2;
                    if (!C0882.f81846) {
                        iM55979 = (i13 - C0873.m55680("ۚ᩻")) * (-35);
                        i7 = ((iM55979 ^ i6) * (-8653)) ^ (-1074451807);
                        i8 = -2117944928;
                        i9 = iM55979 ^ i8;
                        i15 = i7;
                        i19 = i;
                        sArr4 = sArr;
                        i20 = i4;
                        i21 = i5;
                        s4 = s;
                        i14 = i6;
                        i16 = i9;
                    } else {
                        sArr4 = sArr;
                        s4 = s;
                        int iM55684 = (i6 - C0873.m55680("ۙۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        int i211 = 882236839 ^ iM55684;
                        i15 = ((iM55684 ^ i13) * 4859) ^ 726888513;
                        i20 = i4;
                        i21 = i5;
                        i14 = i6;
                        int i212 = i;
                        i16 = i211;
                        i19 = i212;
                    }
                    break;
                case -232562256:
                case 737522908:
                    break;
                case -130907403:
                case 1157474209:
                    s2 = s4;
                    i10 = i19;
                    sArr2 = sArr4;
                    i11 = i14;
                    i20 = 169;
                    i21 = 5;
                    if (C1194.f82045 != 0) {
                        iM55680 = C0873.m55680("ܺ᩻") ^ i13;
                        i2 = ((iM55680 ^ i11) * 22687) ^ 507919275;
                        i12 = -388080429;
                    } else {
                        iM55680 = C0873.m55680("᩷᩹") ^ i11;
                        i2 = ((iM55680 ^ i13) * (-18591)) ^ (-1880015105);
                        i12 = 1118654964;
                    }
                    i3 = iM55680 ^ i12;
                    i19 = i10;
                    sArr4 = sArr2;
                    s4 = s2;
                    i14 = i11;
                    i16 = i3;
                    i15 = i2;
                    break;
                case 268218526:
                case 1473323467:
                    i = i19;
                    short[] sArr5 = sArr4;
                    i4 = i20;
                    i5 = i21;
                    i6 = i14;
                    i18 = i17 + 1;
                    s4 = 1;
                    if (C0845.f81821 < 0) {
                        int iM55685 = (C0873.m55680("ᩴ᩹") ^ i6) * (-39);
                        int i30 = ((iM55685 ^ i13) * 7753) ^ (-2125808289);
                        i9 = iM55685 ^ (-847710748);
                        i15 = i30;
                        i19 = i;
                        sArr4 = sArr5;
                        i20 = i4;
                        i21 = i5;
                        i14 = i6;
                        i16 = i9;
                    } else {
                        sArr4 = sArr5;
                        int iM55686 = (i6 - C0873.m55680("ۙۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        int i213 = 882236839 ^ iM55686;
                        i15 = ((iM55686 ^ i13) * 4859) ^ 726888513;
                        i20 = i4;
                        i21 = i5;
                        i14 = i6;
                        int i214 = i;
                        i16 = i213;
                        i19 = i214;
                    }
                    break;
                case 276556774:
                case 700272675:
                    s = s4;
                    i = i19;
                    sArr = sArr4;
                    i4 = i20;
                    i5 = i21;
                    i6 = i14;
                    int i31 = s3 + s;
                    if ((i31 * i31) - i18 < 0) {
                        iM55979 = C0946.m55979("ۢۗ") ^ i6;
                        i7 = ((iM55979 ^ i13) * 14407) ^ 271265817;
                        i8 = -662883330;
                    } else {
                        iM55979 = C0946.m55979("ܳ۫") ^ i13;
                        i7 = ((iM55979 ^ i6) * (-4197)) ^ (-1276778394);
                        i8 = -1973775823;
                    }
                    i9 = iM55979 ^ i8;
                    i15 = i7;
                    i19 = i;
                    sArr4 = sArr;
                    i20 = i4;
                    i21 = i5;
                    s4 = s;
                    i14 = i6;
                    i16 = i9;
                    break;
                case 841186540:
                case 2144845594:
                    if (C1044.f81959 < 0) {
                        s = s4;
                        i = i19;
                        sArr = sArr4;
                        i4 = i20;
                        i5 = i21;
                        i6 = i14;
                        iM55979 = (C0946.m55979("ۨ۫") + i6) * (-99);
                        i7 = ((iM55979 ^ i13) * 10685) ^ (-1095914754);
                        i8 = 1756148462;
                        i9 = iM55979 ^ i8;
                        i15 = i7;
                        i19 = i;
                        sArr4 = sArr;
                        i20 = i4;
                        i21 = i5;
                        s4 = s;
                        i14 = i6;
                        i16 = i9;
                    } else {
                        s = s4;
                        i = i19;
                        sArr = sArr4;
                        i4 = i20;
                        i5 = i21;
                        int iM559714 = (C0946.m55979("۠ۛ") ^ i13) * (-49);
                        i2 = ((iM559714 ^ i14) * (-13455)) ^ (-468635412);
                        i3 = iM559714 ^ (-1730597726);
                        i19 = i;
                        sArr4 = sArr;
                        i20 = i4;
                        i21 = i5;
                        s4 = s;
                        i16 = i3;
                        i15 = i2;
                    }
                    break;
                case 894095260:
                case 915800995:
                    i19 = 63316;
                    int iM559715 = (C0946.m55979("ܶۜ") + i13) * (-69);
                    i16 = iM559715 ^ (-754662222);
                    i15 = ((iM559715 ^ i14) * (-27113)) ^ (-84560083);
                    sArr4 = sArr4;
                    i20 = i20;
                    i21 = i21;
                    s4 = s4;
                    i14 = i14;
                    break;
                default:
                    s = s4;
                    i = i19;
                    i4 = i20;
                    i5 = i21;
                    i6 = i14;
                    this.f54487 = c19561;
                    str = this.f54481;
                    abstractC17043M34322 = C14976.m34322(str);
                    sArr4 = f82265;
                    if (C1194.f82045 == 0) {
                        int iM559716 = C0946.m55979("۫ܿ") ^ i6;
                        int i32 = ((iM559716 ^ i13) * 691) ^ (-1207736507);
                        i9 = iM559716 ^ (-1446356414);
                        i15 = i32;
                        i19 = i;
                        i20 = i4;
                        i21 = i5;
                        s4 = s;
                        i14 = i6;
                        i16 = i9;
                    } else {
                        s4 = s;
                        int iM55687 = (i6 - C0873.m55680("ۙۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        int i215 = 882236839 ^ iM55687;
                        i15 = ((iM55687 ^ i13) * 4859) ^ 726888513;
                        i20 = i4;
                        i21 = i5;
                        i14 = i6;
                        int i216 = i;
                        i16 = i215;
                        i19 = i216;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0296 A[PHI: r6 r12 r17 r19
      0x0296: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char), (r6v2 char) binds: [B:69:0x0294, B:53:0x01dd, B:9:0x005a, B:31:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:69:0x0294, B:53:0x01dd, B:9:0x005a, B:31:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r17v30 java.io.InputStream) = (r17v6 java.io.InputStream), (r17v10 java.io.InputStream), (r17v21 java.io.InputStream), (r17v42 java.io.InputStream) binds: [B:69:0x0294, B:53:0x01dd, B:9:0x005a, B:31:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r19v17 l.ۗ᩺ۡ) = (r19v2 l.ۗ᩺ۡ), (r19v6 l.ۗ᩺ۡ), (r19v14 l.ۗ᩺ۡ), (r19v26 l.ۗ᩺ۡ) binds: [B:69:0x0294, B:53:0x01dd, B:9:0x005a, B:31:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02ea A[PHI: r10 r11 r17 r18 r19
      0x02ea: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:77:0x02e8, B:73:0x02c8, B:57:0x0201, B:8:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x02ea: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:77:0x02e8, B:73:0x02c8, B:57:0x0201, B:8:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x02ea: PHI (r17v19 java.io.InputStream) = (r17v4 java.io.InputStream), (r17v5 java.io.InputStream), (r17v9 java.io.InputStream), (r17v20 java.io.InputStream) binds: [B:77:0x02e8, B:73:0x02c8, B:57:0x0201, B:8:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x02ea: PHI (r18v5 short[]) = (r18v3 short[]), (r18v4 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:77:0x02e8, B:73:0x02c8, B:57:0x0201, B:8:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x02ea: PHI (r19v12 l.ۗ᩺ۡ) = (r19v0 l.ۗ᩺ۡ), (r19v1 l.ۗ᩺ۡ), (r19v5 l.ۗ᩺ۡ), (r19v13 l.ۗ᩺ۡ) binds: [B:77:0x02e8, B:73:0x02c8, B:57:0x0201, B:8:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ InputStream m41510(C18249 c18249, String str) {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        int i5 = C1404.f82149;
        int i6 = C0912.f81867;
        int iM55681 = (C0873.m55680("ۜۙ") ^ i5) * 67;
        int i7 = ((iM55681 ^ i6) * 203) ^ (-524806451);
        short[] sArr = null;
        int i8 = iM55681 ^ (-524479043);
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -775608400;
        InputStream inputStreamM56204 = null;
        C5738 c5738M56013 = null;
        InputStream inputStream = null;
        C19561 c19561 = null;
        while (true) {
            i14 = i8 ^ (i7 & (((i14 ^ i6) * 17299) >> 31));
            switch (i14) {
                case -2144878920:
                case -453742899:
                    if (C0917.f81868) {
                        inputStream = inputStream;
                        c5738M56013 = c5738M56013;
                        iM55680 = C0873.m55680("᩺ۧ") ^ i6;
                        i3 = ((iM55680 ^ i5) * (-7511)) ^ (-907868919);
                        i4 = -800115398;
                        inputStream = inputStream;
                        i8 = iM55680 ^ i4;
                        i7 = i3;
                        c5738M56013 = c5738M56013;
                    }
                    inputStream = inputStream;
                    c5738M56013 = c5738M56013;
                    iM55680 = C0946.m55979("ܰ᩷") ^ i6;
                    i3 = ((iM55680 ^ i5) * 1999) ^ 380063960;
                    i4 = -1935300924;
                    inputStream = inputStream;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    c5738M56013 = c5738M56013;
                    break;
                case -2000529223:
                case 1165980343:
                    inputStream = inputStream;
                    c5738M56013 = c5738M56013;
                    c = 'G';
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = C0873.m55680("᩺ۧ") ^ i6;
                        i3 = ((iM55680 ^ i5) * (-7511)) ^ (-907868919);
                        i4 = -800115398;
                    } else {
                        iM55680 = (C0946.m55979("᩷ۙ") ^ i5) * (-47);
                        i3 = ((iM55680 ^ i6) * (-25105)) ^ (-1556762868);
                        i4 = 731532167;
                    }
                    inputStream = inputStream;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    c5738M56013 = c5738M56013;
                    break;
                case -1858400872:
                case -213847679:
                    return inputStream;
                case -1819880189:
                case -831644601:
                    if (C0882.m55710() == 0) {
                        inputStream = inputStream;
                        c5738M56013 = c5738M56013;
                        iM55680 = C0946.m55979("ܰ᩷") ^ i6;
                        i3 = ((iM55680 ^ i5) * 1999) ^ 380063960;
                        i4 = -1935300924;
                        inputStream = inputStream;
                        i8 = iM55680 ^ i4;
                        i7 = i3;
                        c5738M56013 = c5738M56013;
                    } else {
                        iM55979 = (i5 - C0946.m55979("᩷ܺ")) * 53;
                        i = ((iM55979 ^ i6) * (-26059)) ^ 10899605;
                        i2 = -1219462110;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    }
                    break;
                case -1163591500:
                case 501232683:
                    inputStream = inputStream;
                    c5738M56013 = c5738M56013;
                    i9 = s + s2;
                    if (C1964.m56597() != 0) {
                        iM55680 = C0873.m55680("᩹ۜ") ^ i5;
                        i3 = ((iM55680 ^ i6) * 17657) ^ 1504179366;
                        i4 = 1410245127;
                    } else {
                        iM55680 = C0946.m55979("᩹ۗ") ^ i6;
                        i3 = ((iM55680 ^ i5) * (-31367)) ^ 597690619;
                        i4 = 483556155;
                    }
                    inputStream = inputStream;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    c5738M56013 = c5738M56013;
                    break;
                case -1134301968:
                case -233707737:
                    short[] sArr2 = f82265;
                    if (C1229.f82066 < 0) {
                        inputStream = inputStream;
                        if (AbstractC0942.f81890 <= 0) {
                            c5738M56013 = c5738M56013;
                            iM55680 = C0873.m55680("᩺ۧ") ^ i6;
                            i3 = ((iM55680 ^ i5) * (-7511)) ^ (-907868919);
                            i4 = -800115398;
                            inputStream = inputStream;
                            i8 = iM55680 ^ i4;
                            i7 = i3;
                            c5738M56013 = c5738M56013;
                            break;
                        } else {
                            String strM55667 = RunnableC0871.m55667(sArr2, 72, 7, i13);
                            if (C1017.f81942 < 0) {
                                StringBuilder sb = new StringBuilder(strM55667);
                                C0912.m55825(sb, str);
                                c5738M56013 = C0949.m56013(c19561, C0863.m55639(sb));
                                if (c5738M56013 != null) {
                                    int iM559710 = (C0946.m55979("ۡ۫") + i6) * (-17);
                                    i = ((iM559710 ^ i5) * (-22217)) ^ (-1826950083);
                                    inputStream = inputStream;
                                    i8 = iM559710 ^ 683353158;
                                    i7 = i;
                                } else {
                                    int iM559711 = (i6 - C0946.m55979("ۡۧ")) * (-75);
                                    i7 = ((iM559711 ^ i5) * (-13661)) ^ (-489020768);
                                    inputStream = inputStream;
                                    i8 = iM559711 ^ 1395511395;
                                }
                                break;
                            }
                        }
                    } else {
                        inputStream = inputStream;
                    }
                    iM55680 = C0873.m55680("᩹ۜ") ^ i5;
                    i3 = ((iM55680 ^ i6) * 17657) ^ 1504179366;
                    i4 = 1410245127;
                    inputStream = inputStream;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    c5738M56013 = c5738M56013;
                    break;
                case -814775273:
                case 931561870:
                    C1404.m56468();
                    if (C1012.f81938 >= 0) {
                        iM55979 = (i5 - C0946.m55979("᩷ܺ")) * 53;
                        i = ((iM55979 ^ i6) * (-26059)) ^ 10899605;
                        i2 = -1219462110;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        inputStream = inputStream;
                        c5738M56013 = c5738M56013;
                        iM55680 = (i5 - C0946.m55979("ۜ᩹")) * 67;
                        i3 = ((iM55680 ^ i6) * (-12167)) ^ 2060249305;
                        i4 = -1559397927;
                        inputStream = inputStream;
                        i8 = iM55680 ^ i4;
                        i7 = i3;
                        c5738M56013 = c5738M56013;
                    }
                    break;
                case -798031314:
                case 1318445843:
                    i13 = 65516;
                    iM55680 = C0873.m55680("ᩴܽ") ^ i6;
                    i3 = ((iM55680 ^ i5) * 29367) ^ (-1037935050);
                    i4 = 1843258362;
                    inputStream = inputStream;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    c5738M56013 = c5738M56013;
                    break;
                case -560593656:
                case -542900804:
                    inputStream = inputStream;
                    c5738M56013 = c5738M56013;
                    int i15 = i11 + i12;
                    if ((i15 + i15) - i10 >= 0) {
                        iM55680 = C0946.m55979("ܽܺ") ^ i6;
                        i3 = ((iM55680 ^ i5) * (-4153)) ^ (-1281605618);
                        i4 = 224386842;
                    } else {
                        iM55680 = (i5 - C0946.m55979("ۗ᩵")) * (-31);
                        i3 = ((iM55680 ^ i6) * (-27329)) ^ 1580198859;
                        i4 = 823183604;
                    }
                    inputStream = inputStream;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    c5738M56013 = c5738M56013;
                    break;
                case -483998168:
                case 716258166:
                    inputStream = inputStream;
                    c5738M56013 = c5738M56013;
                    i12 = 266113969;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0873.m55680("᩺ۧ") ^ i6;
                        i3 = ((iM55680 ^ i5) * (-7511)) ^ (-907868919);
                        i4 = -800115398;
                    } else {
                        iM55680 = C0873.m55680("ۚܿ") ^ i5;
                        i3 = ((iM55680 ^ i6) * 15163) ^ (-1466104245);
                        i4 = 180156817;
                    }
                    inputStream = inputStream;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    c5738M56013 = c5738M56013;
                    break;
                case -287289658:
                case 773063463:
                    c5738M56013 = c5738M56013;
                    c19561 = c18249.f54485;
                    if (c19561 != null) {
                        int iM559712 = C0946.m55979("ۢ۠") ^ i5;
                        i8 = iM559712 ^ 641408037;
                        inputStream = null;
                        i7 = ((iM559712 ^ i6) * (-16979)) ^ (-1214461815);
                        c5738M56013 = c5738M56013;
                    } else {
                        inputStream = null;
                        c5738M56013 = c5738M56013;
                        int iM559713 = (i6 - C0946.m55979("ۡۧ")) * (-75);
                        i7 = ((iM559713 ^ i5) * (-13661)) ^ (-489020768);
                        inputStream = inputStream;
                        i8 = iM559713 ^ 1395511395;
                    }
                    break;
                case 73241303:
                case 2115168266:
                    i13 = 42057;
                    iM55680 = C0873.m55680("ᩴܽ") ^ i6;
                    i3 = ((iM55680 ^ i5) * 29367) ^ (-1037935050);
                    i4 = 1843258362;
                    inputStream = inputStream;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    c5738M56013 = c5738M56013;
                    break;
                case 500953643:
                case 1895824037:
                    return inputStream;
                case 622735628:
                case 1595644881:
                    inputStream = inputStream;
                    c5738M56013 = c5738M56013;
                    i10 = i9 * i9;
                    i11 = s * s;
                    if (C1036.f81953 >= 0) {
                        iM55680 = C0946.m55979("ܰ᩷") ^ i6;
                        i3 = ((iM55680 ^ i5) * 1999) ^ 380063960;
                        i4 = -1935300924;
                    } else {
                        iM55680 = (C0946.m55979("᩻᩺") ^ i5) * 87;
                        i3 = ((iM55680 ^ i6) * 7881) ^ 663677735;
                        i4 = -113983603;
                    }
                    inputStream = inputStream;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    c5738M56013 = c5738M56013;
                    break;
                case 628884188:
                case 633653700:
                    C1025.m56230();
                    return null;
                case 669618009:
                case 1382463555:
                    inputStream = inputStream;
                    c5738M56013 = c5738M56013;
                    s = sArr[c];
                    s2 = 16313;
                    if (C1028.f81950 <= 0) {
                        iM55680 = (i5 - C0946.m55979("ۜ᩹")) * 67;
                        i3 = ((iM55680 ^ i6) * (-12167)) ^ 2060249305;
                        i4 = -1559397927;
                    } else {
                        iM55680 = C0873.m55680("ۛ֡") ^ i6;
                        i3 = ((iM55680 ^ i5) * 1875) ^ (-100706667);
                        i4 = 1579824537;
                    }
                    inputStream = inputStream;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    c5738M56013 = c5738M56013;
                    break;
                case 849222662:
                case 1962346621:
                    return inputStreamM56204;
                case 1122408363:
                case 1595175133:
                    inputStream = inputStream;
                    c5738M56013 = c5738M56013;
                    sArr = f82265;
                    if (RunnableC0897.f81856) {
                        iM55680 = C0946.m55979("۟ۛ") ^ i5;
                        i3 = ((iM55680 ^ i6) * (-31737)) ^ 1505349154;
                        i4 = -1856663977;
                    } else {
                        iM55680 = C0946.m55979("ܰ᩷") ^ i6;
                        i3 = ((iM55680 ^ i5) * 1999) ^ 380063960;
                        i4 = -1935300924;
                    }
                    inputStream = inputStream;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    c5738M56013 = c5738M56013;
                    break;
                case 1472456740:
                case 1678410539:
                    try {
                        inputStreamM56204 = C1024.m56204(c19561, c5738M56013);
                        iM55979 = (i5 - C0873.m55680("ۨᩳ")) * (-67);
                        i = ((iM55979 ^ i6) * 23625) ^ (-844581830);
                        i2 = 1269347243;
                    } catch (IOException unused) {
                        iM55979 = (C0873.m55680("۟۫") + i6) * 51;
                        i = ((iM55979 ^ i5) * (-22807)) ^ (-876701691);
                        i2 = 279872280;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case 1566279630:
                case 1744638142:
                    inputStream = inputStream;
                    c5738M56013 = c5738M56013;
                    if (C0898.m55800() <= 0) {
                        iM55680 = C0946.m55979("ܰ᩷") ^ i6;
                        i3 = ((iM55680 ^ i5) * 1999) ^ 380063960;
                        i4 = -1935300924;
                    } else {
                        iM55680 = C0873.m55680("ۘۤ") ^ i6;
                        i3 = ((iM55680 ^ i5) * (-31053)) ^ 1126525146;
                        i4 = 19699507;
                    }
                    inputStream = inputStream;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    c5738M56013 = c5738M56013;
                    break;
                default:
                    C0937.m55918();
                    inputStream = inputStream;
                    c5738M56013 = c5738M56013;
                    iM55680 = (i5 - C0946.m55979("ۜ᩹")) * 67;
                    i3 = ((iM55680 ^ i6) * (-12167)) ^ 2060249305;
                    i4 = -1559397927;
                    inputStream = inputStream;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    c5738M56013 = c5738M56013;
                    break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.۟ܿ᩷] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ C9612 m41514(final C18249 c18249) {
        c18249.m41521();
        return new InterfaceC14485() { // from class: l.۟ܿ᩷
            @Override // p067l.InterfaceC14485
            public final InputStream getAssetsAsStream(String str) {
                return C18249.m41510(this.f26477, str);
            }
        };
    }

    /* JADX INFO: renamed from: ۡ */
    public final String m41538() {
        PluginContext pluginContextM41540 = null;
        String str = null;
        String strM55876 = null;
        int i = -358359574;
        int i2 = C1071.f81975;
        int i3 = RunnableC0938.f81886;
        int iM55680 = (C0873.m55680("ᩴᩳ") + i3) * 119;
        int i4 = ((iM55680 ^ i2) * (-8679)) ^ 1438627711;
        int i5 = 1381762769;
        while (true) {
            i = ((((i ^ i2) * 31285) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2144714914:
                case 1526108310:
                    pluginContextM41540 = m41540();
                    if (C1028.m56247() >= 0) {
                        iM55680 = C0873.m55680("۠ۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-29725)) ^ 1855311378;
                        i5 = -159511341;
                    } else {
                        iM55680 = C0873.m55680("ۤܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 20315) ^ 1984379550;
                        i5 = 150080321;
                    }
                    break;
                case -2121354617:
                case -1620430640:
                    if (C1404.m56458(1, str) == '}') {
                        iM55680 = (C0946.m55979("ܶۡ") ^ i3) * (-125);
                        i4 = ((iM55680 ^ i2) * (-29817)) ^ (-1386379369);
                        i5 = -1589446884;
                    } else {
                        iM55680 = C0873.m55680("ۨܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 26545) ^ (-1680284582);
                        i5 = -148336627;
                    }
                    break;
                case -1985820827:
                case 1634071449:
                    if (C0927.f81875) {
                        iM55680 = (C0873.m55680("ۘ֡") ^ i2) * (-79);
                        i4 = ((iM55680 ^ i3) * 20287) ^ 1842189572;
                        i5 = 1846721699;
                    } else {
                        iM55680 = C0873.m55680("ۛ۠") ^ i2;
                        i4 = ((iM55680 ^ i3) * 26713) ^ 99595542;
                        i5 = -848544640;
                    }
                    break;
                case -1796374779:
                case -232722745:
                    if (C0854.f81826 != 0) {
                        iM55680 = C0946.m55979("᩺۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * 29851) ^ 975775111;
                        i5 = -1121169363;
                    } else {
                        iM55680 = C0946.m55979("۠ۖ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 4363) ^ (-54053607);
                        i5 = -554945785;
                    }
                    break;
                case -1709872333:
                case 1650092186:
                    C0989.m56095();
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0873.m55680("۠ۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-29725)) ^ 1855311378;
                        i5 = -159511341;
                    } else {
                        iM55680 = C0873.m55680("۫ܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-32427)) ^ 1982667500;
                        i5 = 1221830048;
                    }
                    break;
                case -1676937710:
                case 1518926482:
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0946.m55979("᩺۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * 29851) ^ 975775111;
                        i5 = -1121169363;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۖܳ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55680 ^ i2) * (-1027)) ^ (-1640410037);
                        i5 = -237390152;
                    }
                    break;
                case -1483926959:
                case -712932862:
                    if (C0927.m55878(str) >= 3) {
                        iM55680 = C0873.m55680("ۧ֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * 2295) ^ (-983734194);
                        i5 = -1457238623;
                    } else {
                        iM55680 = C0873.m55680("ۨܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 26545) ^ (-1680284582);
                        i5 = -148336627;
                    }
                    break;
                case -1168637710:
                case -933715160:
                    if (C0917.f81868) {
                        iM55680 = C0873.m55680("۠ۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-29725)) ^ 1855311378;
                        i5 = -159511341;
                    } else {
                        iM55680 = C0946.m55979("᩸֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-32667)) ^ 2141069167;
                        i5 = 2083528315;
                    }
                    break;
                case -1059972195:
                case 776538455:
                    if (C1012.m56134() <= 0) {
                        iM55680 = (C0873.m55680("ۘ֡") ^ i2) * (-79);
                        i4 = ((iM55680 ^ i3) * 20287) ^ 1842189572;
                        i5 = 1846721699;
                    } else {
                        iM55680 = (C0946.m55979("ۧܺ") ^ i3) * (-71);
                        i4 = ((iM55680 ^ i2) * 27061) ^ (-1892096481);
                        i5 = 810707939;
                    }
                    break;
                case -1008912356:
                case -128502223:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0873.m55680("۫ܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-32427)) ^ 1982667500;
                        i5 = 1221830048;
                    } else {
                        iM55680 = C0946.m55979("۬ۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 13661) ^ (-399367105);
                        i5 = 406963514;
                    }
                    break;
                case -946102367:
                case 265269116:
                    return strM55876;
                case -747948786:
                case 1852352212:
                    C0882.m55710();
                    return null;
                case -650046025:
                case 1531852707:
                    if (C0877.f81843 < 0) {
                        iM55680 = C0946.m55979("᩺۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * 29851) ^ 975775111;
                        i5 = -1121169363;
                    } else {
                        iM55680 = C0873.m55680("۠ۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-29725)) ^ 1855311378;
                        i5 = -159511341;
                    }
                    break;
                case -631501559:
                case 392968303:
                    str = this.f54480;
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0946.m55979("ۨ֡") + i2) * (-29);
                        i4 = ((iM55680 ^ i3) * (-24167)) ^ 391824365;
                        i5 = -942614552;
                    } else {
                        iM55680 = C0873.m55680("۟ۘ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-14141)) ^ 1258265738;
                        i5 = 913184418;
                    }
                    break;
                case -338216667:
                case 949395332:
                    if (C0947.f81895) {
                        iM55680 = C0873.m55680("۠ۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-29725)) ^ 1855311378;
                        i5 = -159511341;
                    } else {
                        iM55680 = C0873.m55680("ۙۨ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 8377) ^ (-1110027724);
                        i5 = -537638257;
                    }
                    break;
                case -250189365:
                case 1738344448:
                    C0912.m55833();
                    iM55680 = C0873.m55680("۫ܿ") ^ i2;
                    i4 = ((iM55680 ^ i3) * (-32427)) ^ 1982667500;
                    i5 = 1221830048;
                    break;
                case 751613090:
                case 1280149744:
                    if (!C0866.m55645()) {
                        iM55680 = C0873.m55680("۠ۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-29725)) ^ 1855311378;
                        i5 = -159511341;
                    } else {
                        iM55680 = (C0873.m55680("ۘ֡") ^ i2) * (-79);
                        i4 = ((iM55680 ^ i3) * 20287) ^ 1842189572;
                        i5 = 1846721699;
                    }
                    break;
                case 919061213:
                case 1699740767:
                    strM55876 = C0927.m55876((C12474) pluginContextM41540, str);
                    if (strM55876 != null) {
                        iM55680 = (i3 - C0873.m55680("ᩴ᩶")) * (-71);
                        i4 = ((iM55680 ^ i2) * (-27965)) ^ 28212261;
                        i5 = -2055713260;
                    } else {
                        iM55680 = C0873.m55680("ۨܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 26545) ^ (-1680284582);
                        i5 = -148336627;
                    }
                    break;
                case 1310150282:
                case 1766827235:
                    if (C1025.f81947 >= 0) {
                        iM55680 = (C0946.m55979("ۨ֡") + i2) * (-29);
                        i4 = ((iM55680 ^ i3) * (-24167)) ^ 391824365;
                        i5 = -942614552;
                    } else {
                        iM55680 = (C0873.m55680("۠۫") ^ i2) * 53;
                        i4 = ((iM55680 ^ i3) * 7907) ^ (-2017600639);
                        i5 = -554985202;
                    }
                    break;
                case 1724617328:
                case 2018762631:
                    return str;
                default:
                    if (C0927.m55870(str, 0) == '{') {
                        iM55680 = (C0873.m55680("ܿۖ") + i2) * (-19);
                        i4 = ((iM55680 ^ i3) * (-1371)) ^ (-53860814);
                        i5 = -1636566164;
                    } else {
                        iM55680 = C0873.m55680("ۨܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 26545) ^ (-1680284582);
                        i5 = -148336627;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41517(ArrayList arrayList, int i) {
        Iterator itM56090 = null;
        C12886 c12886 = null;
        Exception e = null;
        int i2 = 1066564604;
        int i3 = C0930.f81879;
        int i4 = RunnableC0938.f81886;
        int iM55680 = (i4 - C0873.m55680("᩷ۚ")) * 23;
        int i5 = ((iM55680 ^ i3) * (-2679)) ^ 1755810871;
        int i6 = 1225551430;
        while (true) {
            i2 = ((((i2 ^ i3) * (-2159)) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -2069673676:
                case 1435035116:
                    if (m41557()) {
                        iM55680 = (i4 - C0946.m55979("ۚ᩷")) * (-49);
                        i5 = ((iM55680 ^ i3) * 20201) ^ 1055694653;
                        i6 = -970855158;
                    } else {
                        iM55680 = (C0946.m55979("ۗ۫") ^ i3) * 15;
                        i5 = ((iM55680 ^ i4) * 18573) ^ (-509901540);
                        i6 = 1201588635;
                    }
                    break;
                case -1928133143:
                case -1673899178:
                    if (C0947.f81895) {
                        iM55680 = (C0873.m55680("ۖ֨") ^ i4) * 55;
                        i5 = ((iM55680 ^ i3) * 10949) ^ 151241456;
                        i6 = -1646641489;
                    } else {
                        iM55680 = (C0946.m55979("ۗ֡") ^ i3) * 101;
                        i5 = ((iM55680 ^ i4) * (-8181)) ^ 1820118749;
                        i6 = 1333586740;
                    }
                    break;
                case -1836003277:
                case 667553336:
                    C0873.m55678();
                    if (!C0892.f81851) {
                        iM55680 = (C0873.m55680("ۖ֨") ^ i4) * 55;
                        i5 = ((iM55680 ^ i3) * 10949) ^ 151241456;
                        i6 = -1646641489;
                    } else {
                        iM55680 = C0873.m55680("ۡۡ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 7681) ^ (-1431219026);
                        i6 = 1972386695;
                    }
                    break;
                case -1656068481:
                case -332864282:
                    if (RunnableC0897.m55784()) {
                        iM55680 = (i4 - C0946.m55979("ܰ᩶")) * (-7);
                        i5 = ((iM55680 ^ i3) * 16721) ^ 14691843;
                        i6 = 1919941326;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ܽ᩶")) * (-83);
                        i5 = ((iM55680 ^ i3) * (-12717)) ^ 429086822;
                        i6 = 1244146429;
                    }
                    break;
                case -1360711963:
                case 1915525029:
                    if (RunnableC1014.m56177()) {
                        iM55680 = (C0946.m55979("ܰۖ") + i4) * (-15);
                        i5 = ((iM55680 ^ i3) * 14689) ^ (-1647145767);
                        i6 = -274586490;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ܶۚ")) * 79;
                        i5 = ((iM55680 ^ i4) * (-23071)) ^ (-187601233);
                        i6 = -21302723;
                    }
                    break;
                case -917930820:
                case -778703591:
                    if (C0949.f81897 >= 0) {
                        iM55680 = C0873.m55680("ۢ᩺") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-30141)) ^ 1227382902;
                        i6 = 1295474251;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ܿܽ")) * (-63);
                        i5 = ((iM55680 ^ i4) * (-1637)) ^ (-2108208161);
                        i6 = -489188761;
                    }
                    break;
                case -904114393:
                case 1870123297:
                    C0861.m55626();
                    iM55680 = C0873.m55680("ۡۡ") ^ i3;
                    i5 = ((iM55680 ^ i4) * 7681) ^ (-1431219026);
                    i6 = 1972386695;
                    break;
                case -709759927:
                case 1788434889:
                    try {
                        C1194.m56393(arrayList, C8056.m18729(this.f54482, c12886.f36241));
                        iM55680 = (C0946.m55979("ۗ۫") ^ i3) * 15;
                        i5 = ((iM55680 ^ i4) * 18573) ^ (-509901540);
                        i6 = 1201588635;
                    } catch (Exception e2) {
                        e = e2;
                        iM55680 = (C0873.m55680("۫ᩳ") ^ i3) * (-9);
                        i5 = ((iM55680 ^ i4) * (-26197)) ^ 1841621370;
                        i6 = 891864181;
                    }
                    break;
                case -645339632:
                case 553215232:
                    if (C1404.m56468()) {
                        iM55680 = (i3 - C0946.m55979("᩹᩻")) * 89;
                        i5 = ((iM55680 ^ i4) * 5927) ^ 1050543980;
                        i6 = -1133894686;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ܶۚ")) * 79;
                        i5 = ((iM55680 ^ i4) * (-23071)) ^ (-187601233);
                        i6 = -21302723;
                    }
                    break;
                case -590057799:
                case 162222787:
                    C0866.m55645();
                    if (C1024.m56209() < 0) {
                        iM55680 = (i3 - C0873.m55680("ܶۚ")) * 79;
                        i5 = ((iM55680 ^ i4) * (-23071)) ^ (-187601233);
                        i6 = -21302723;
                    } else {
                        iM55680 = C0873.m55680("ۡۡ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 7681) ^ (-1431219026);
                        i6 = 1972386695;
                    }
                    break;
                case -379833993:
                case -112733376:
                    itM56090 = C0989.m56090(this.f54488);
                    iM55680 = (C0946.m55979("ۗ۫") ^ i3) * 15;
                    i5 = ((iM55680 ^ i4) * 18573) ^ (-509901540);
                    i6 = 1201588635;
                    break;
                case -160894139:
                case 2112083697:
                    c12886 = (C12886) RunnableC0897.m55785(itM56090);
                    if (c12886.f36242 == i) {
                        iM55680 = C0946.m55979("۫۫") ^ i4;
                        i5 = ((iM55680 ^ i3) * 28285) ^ 786093588;
                        i6 = -999561306;
                    } else {
                        iM55680 = (C0946.m55979("ۗ۫") ^ i3) * 15;
                        i5 = ((iM55680 ^ i4) * 18573) ^ (-509901540);
                        i6 = 1201588635;
                    }
                    break;
                case -92062587:
                case 1489200957:
                    if (C0930.m55886(itM56090)) {
                        iM55680 = (C0946.m55979("᩹ܺ") ^ i3) * 45;
                        i5 = ((iM55680 ^ i4) * (-23173)) ^ 1063027311;
                        i6 = 1251344634;
                    } else {
                        iM55680 = C0873.m55680("ۘ᩺") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-9117)) ^ (-434009308);
                        i6 = -615139058;
                    }
                    break;
                case 313551640:
                case 1253476486:
                    break;
                case 364228277:
                case 1853694343:
                    m41526(e);
                    iM55680 = (C0946.m55979("ۗ۫") ^ i3) * 15;
                    i5 = ((iM55680 ^ i4) * 18573) ^ (-509901540);
                    i6 = 1201588635;
                    break;
                case 748495466:
                case 1489076368:
                    if (C0882.f81846) {
                        iM55680 = C0873.m55680("ۢ᩺") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-30141)) ^ 1227382902;
                        i6 = 1295474251;
                    } else {
                        iM55680 = (C0946.m55979("᩷᩷") + i4) * (-119);
                        i5 = ((iM55680 ^ i3) * 29483) ^ (-1991069276);
                        i6 = -2090027073;
                    }
                    break;
                case 839619407:
                case 1493888339:
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0873.m55680("ۢ᩺") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-30141)) ^ 1227382902;
                        i6 = 1295474251;
                    } else {
                        iM55680 = C0873.m55680("ۤܳ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 30251) ^ 1602140193;
                        i6 = -147498199;
                    }
                    break;
                case 852237511:
                case 1067800440:
                    if (C0917.m55854()) {
                        iM55680 = C0873.m55680("ۜ֡") ^ i4;
                        i5 = ((iM55680 ^ i3) * 26731) ^ 1045646831;
                        i6 = -924194756;
                    } else {
                        iM55680 = C0873.m55680("ۢ᩺") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-30141)) ^ 1227382902;
                        i6 = 1295474251;
                    }
                    break;
                case 1063991299:
                case 1529710161:
                    C0890.m55740();
                    C1124.m56367();
                    break;
                case 1316596443:
                case 1889815562:
                    if (!RunnableC0897.f81856) {
                        iM55680 = (C0873.m55680("ۖ֨") ^ i4) * 55;
                        i5 = ((iM55680 ^ i3) * 10949) ^ 151241456;
                        i6 = -1646641489;
                    } else {
                        iM55680 = C0873.m55680("ۢ᩺") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-30141)) ^ 1227382902;
                        i6 = 1295474251;
                    }
                    break;
                case 1378015111:
                case 1800471519:
                    if (C1036.f81953 >= 0) {
                        iM55680 = (i4 - C0946.m55979("ܰ᩶")) * (-7);
                        i5 = ((iM55680 ^ i3) * 16721) ^ 14691843;
                        i6 = 1919941326;
                    } else {
                        iM55680 = (C0946.m55979("ᩳۘ") ^ i3) * 97;
                        i5 = ((iM55680 ^ i4) * (-17701)) ^ (-275562887);
                        i6 = -287240509;
                    }
                    break;
                default:
                    if (C1194.f82045 != 0) {
                        iM55680 = C0873.m55680("ۢ᩺") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-30141)) ^ 1227382902;
                        i6 = 1295474251;
                    } else {
                        iM55680 = C0946.m55979("֫ۨ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 16669) ^ (-1788616200);
                        i6 = 1081509038;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x036c A[PHI: r11 r19 r22
      0x036c: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:102:0x036a, B:82:0x02a2] A[DONT_GENERATE, DONT_INLINE]
      0x036c: PHI (r19v19 ??) = (r19v83 ??), (r19v84 ??) binds: [B:102:0x036a, B:82:0x02a2] A[DONT_GENERATE, DONT_INLINE]
      0x036c: PHI (r22v10 java.lang.String) = (r22v4 java.lang.String), (r22v11 java.lang.String) binds: [B:102:0x036a, B:82:0x02a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x039f A[PHI: r9 r19 r22
      0x039f: PHI (r9v3 char) = (r9v1 char), (r9v1 char), (r9v2 char), (r9v1 char) binds: [B:106:0x039d, B:98:0x034c, B:90:0x02f9, B:14:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x039f: PHI (r19v32 ??) = (r19v77 ??), (r19v78 ??), (r19v79 ??), (r19v33 ??) binds: [B:106:0x039d, B:98:0x034c, B:90:0x02f9, B:14:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x039f: PHI (r22v21 java.lang.String) = (r22v3 java.lang.String), (r22v5 java.lang.String), (r22v7 java.lang.String), (r22v22 java.lang.String) binds: [B:106:0x039d, B:98:0x034c, B:90:0x02f9, B:14:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x031a A[PHI: r12 r13 r14 r19 r22
      0x031a: PHI (r12v3 int) = (r12v1 int), (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:26:0x009e, B:94:0x0318, B:78:0x0281, B:74:0x025c] A[DONT_GENERATE, DONT_INLINE]
      0x031a: PHI (r13v3 int) = (r13v1 int), (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:26:0x009e, B:94:0x0318, B:78:0x0281, B:74:0x025c] A[DONT_GENERATE, DONT_INLINE]
      0x031a: PHI (r14v2 int) = (r14v1 int), (r14v1 int), (r14v1 int), (r14v3 int) binds: [B:26:0x009e, B:94:0x0318, B:78:0x0281, B:74:0x025c] A[DONT_GENERATE, DONT_INLINE]
      0x031a: PHI (r19v22 ??) = (r19v5 ??), (r19v80 ??), (r19v81 ??), (r19v82 ??) binds: [B:26:0x009e, B:94:0x0318, B:78:0x0281, B:74:0x025c] A[DONT_GENERATE, DONT_INLINE]
      0x031a: PHI (r22v13 java.lang.String) = (r22v0 java.lang.String), (r22v6 java.lang.String), (r22v12 java.lang.String), (r22v14 java.lang.String) binds: [B:26:0x009e, B:94:0x0318, B:78:0x0281, B:74:0x025c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        if (p067l.C1028.f81950 > 0) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v23 */
    /* JADX WARN: Type inference failed for: r19v24 */
    /* JADX WARN: Type inference failed for: r19v28 */
    /* JADX WARN: Type inference failed for: r19v30 */
    /* JADX WARN: Type inference failed for: r19v31 */
    /* JADX WARN: Type inference failed for: r19v32 */
    /* JADX WARN: Type inference failed for: r19v33 */
    /* JADX WARN: Type inference failed for: r19v34 */
    /* JADX WARN: Type inference failed for: r19v35 */
    /* JADX WARN: Type inference failed for: r19v41 */
    /* JADX WARN: Type inference failed for: r19v44 */
    /* JADX WARN: Type inference failed for: r19v46 */
    /* JADX WARN: Type inference failed for: r19v47 */
    /* JADX WARN: Type inference failed for: r19v48 */
    /* JADX WARN: Type inference failed for: r19v49 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v50 */
    /* JADX WARN: Type inference failed for: r19v51 */
    /* JADX WARN: Type inference failed for: r19v52 */
    /* JADX WARN: Type inference failed for: r19v53 */
    /* JADX WARN: Type inference failed for: r19v54 */
    /* JADX WARN: Type inference failed for: r19v55 */
    /* JADX WARN: Type inference failed for: r19v56 */
    /* JADX WARN: Type inference failed for: r19v57 */
    /* JADX WARN: Type inference failed for: r19v58 */
    /* JADX WARN: Type inference failed for: r19v59 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v60 */
    /* JADX WARN: Type inference failed for: r19v61 */
    /* JADX WARN: Type inference failed for: r19v62 */
    /* JADX WARN: Type inference failed for: r19v63 */
    /* JADX WARN: Type inference failed for: r19v64 */
    /* JADX WARN: Type inference failed for: r19v65 */
    /* JADX WARN: Type inference failed for: r19v66 */
    /* JADX WARN: Type inference failed for: r19v67 */
    /* JADX WARN: Type inference failed for: r19v68 */
    /* JADX WARN: Type inference failed for: r19v69 */
    /* JADX WARN: Type inference failed for: r19v70 */
    /* JADX WARN: Type inference failed for: r19v71 */
    /* JADX WARN: Type inference failed for: r19v72 */
    /* JADX WARN: Type inference failed for: r19v73 */
    /* JADX WARN: Type inference failed for: r19v74 */
    /* JADX WARN: Type inference failed for: r19v75 */
    /* JADX WARN: Type inference failed for: r19v76 */
    /* JADX WARN: Type inference failed for: r19v77 */
    /* JADX WARN: Type inference failed for: r19v78 */
    /* JADX WARN: Type inference failed for: r19v79 */
    /* JADX WARN: Type inference failed for: r19v80 */
    /* JADX WARN: Type inference failed for: r19v81 */
    /* JADX WARN: Type inference failed for: r19v82 */
    /* JADX WARN: Type inference failed for: r19v83 */
    /* JADX WARN: Type inference failed for: r19v84 */
    /* JADX WARN: Type inference failed for: r19v85 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String, l.ᩳܰۡ] */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v77 */
    /* JADX WARN: Type inference failed for: r3v78 */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX INFO: renamed from: ۬ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C19561 m41521() {
        ?? r19;
        ?? r110;
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int i4;
        ?? r111;
        int iM559711;
        int i5;
        int i6;
        ?? r23;
        ?? r112;
        int i7;
        ?? r113;
        ?? r114;
        int iM55680;
        int i8;
        int i9;
        ?? r115;
        ?? r116;
        ?? r117;
        ?? r118;
        Object obj = null;
        ?? r3 = 0;
        String str = null;
        AbstractC17043 abstractC17043M34322 = null;
        IOException iOException = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -1499021593;
        int i16 = AbstractC0942.f81890;
        int i17 = C0989.f81920;
        int iM559712 = C0946.m55979("ۜ᩹") ^ i16;
        int i18 = ((iM559712 ^ i17) * (-28555)) ^ (-596691268);
        int i19 = iM559712 ^ 378662959;
        C19561 c19561 = null;
        C19561 c19562 = null;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i17) * (-26529)) >> 31));
            switch (i15) {
                case -2126655391:
                case 460510676:
                    ?? r119 = r3;
                    str = str;
                    r19 = r119;
                    if (C0967.f81910 >= 0) {
                        iM559710 = (i16 - C0873.m55680("۫ۧ")) * 13;
                        i3 = ((iM559710 ^ i17) * 27457) ^ 39192323;
                        i4 = 553223243;
                        r115 = r19;
                    } else {
                        iM559710 = C0873.m55680("ۨ۬") ^ i17;
                        i3 = ((iM559710 ^ i16) * (-14965)) ^ (-1322493104);
                        i4 = -484482964;
                        r115 = r119;
                    }
                    i7 = iM559710 ^ i4;
                    r116 = r115;
                    str = str;
                    r112 = r116;
                    r23 = r112;
                    i19 = i7;
                    i18 = i3;
                    r3 = r23;
                    break;
                case -2046585975:
                case 200242283:
                    ?? r120 = r3;
                    String str2 = str;
                    C19561 c19563 = this.f54485;
                    if (c19563 != null) {
                        iM559711 = (C0873.m55680("ۜۙ") ^ i16) * 35;
                        i5 = ((iM559711 ^ i17) * 17985) ^ 499082697;
                        i6 = 50078010;
                    } else {
                        iM559711 = (C0946.m55979("۫ܺ") ^ i16) * (-93);
                        i5 = ((iM559711 ^ i17) * 7865) ^ 160685402;
                        i6 = 474865386;
                    }
                    c19561 = c19563;
                    i18 = i5;
                    str = str2;
                    r23 = r120;
                    i19 = iM559711 ^ i6;
                    r3 = r23;
                    break;
                case -1892035507:
                case -1218168430:
                    if (C1044.f81959 >= 0) {
                        r110 = r3;
                        str = str;
                        iM559710 = (C0873.m55680("᩸ܽ") + i16) * 123;
                        i3 = ((iM559710 ^ i17) * 28453) ^ (-1742907294);
                        i4 = 982313354;
                        r115 = r110;
                        i7 = iM559710 ^ i4;
                        r116 = r115;
                        str = str;
                        r112 = r116;
                        r23 = r112;
                        i19 = i7;
                        i18 = i3;
                        r3 = r23;
                    } else {
                        iM55979 = C0946.m55979("ۗܶ") ^ i17;
                        i = ((iM55979 ^ i16) * (-387)) ^ 1366119089;
                        i2 = -1775078748;
                        i19 = iM55979 ^ i2;
                        i18 = i;
                    }
                    break;
                case -1790974577:
                case -1737623314:
                    String str3 = str;
                    obj = this.f54487;
                    r3 = 0;
                    if (obj != null) {
                        iM55680 = C0873.m55680("ܰۘ") ^ i16;
                        i8 = ((iM55680 ^ i17) * 14003) ^ 457538569;
                        i9 = -1849558536;
                    } else {
                        iM55680 = C0873.m55680("ۧۖ") ^ i17;
                        i8 = ((iM55680 ^ i16) * (-26617)) ^ 1050983543;
                        i9 = -1431887302;
                    }
                    i19 = iM55680 ^ i9;
                    i18 = i8;
                    str = str3;
                    break;
                case -1739209522:
                case -588079755:
                    ?? r121 = r3;
                    str = str;
                    i10 = s + 13053;
                    r111 = r121;
                    if (C0873.f81841 <= 0) {
                        iM559710 = (i16 - C0946.m55979("۟ۨ")) * (-57);
                        i3 = ((iM559710 ^ i17) * 15955) ^ 1720778851;
                        i4 = -688581396;
                        r115 = r111;
                    } else {
                        iM559710 = C0873.m55680("֡ۡ") ^ i16;
                        i3 = ((iM559710 ^ i17) * 29645) ^ 297473940;
                        i4 = -1823763676;
                        r115 = r121;
                    }
                    i7 = iM559710 ^ i4;
                    r116 = r115;
                    str = str;
                    r112 = r116;
                    r23 = r112;
                    i19 = i7;
                    i18 = i3;
                    r3 = r23;
                    break;
                case -1626586606:
                case 292471387:
                    if (C1017.f81942 >= 0) {
                        r113 = r3;
                        str = str;
                        iM559710 = (i17 - C0873.m55680("᩻۬")) * 15;
                        i3 = ((iM559710 ^ i16) * 18579) ^ (-1903757494);
                        i4 = 1997264116;
                        r115 = r113;
                        i7 = iM559710 ^ i4;
                        r116 = r115;
                        str = str;
                        r112 = r116;
                        r23 = r112;
                        i19 = i7;
                        i18 = i3;
                        r3 = r23;
                    } else {
                        iM55979 = C0946.m55979("ۗܶ") ^ i17;
                        i = ((iM55979 ^ i16) * (-387)) ^ 1366119089;
                        i2 = -1775078748;
                        i19 = iM55979 ^ i2;
                        i18 = i;
                    }
                    break;
                case -1523226953:
                case -975066681:
                    ?? r122 = r3;
                    str = str;
                    i11 = i10 * i10;
                    i12 = s * s;
                    r19 = r122;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM559710 = (i16 - C0873.m55680("۫ۧ")) * 13;
                        i3 = ((iM559710 ^ i17) * 27457) ^ 39192323;
                        i4 = 553223243;
                        r115 = r19;
                    } else {
                        iM559710 = C0873.m55680("᩶ۛ") ^ i16;
                        i3 = ((iM559710 ^ i17) * (-30923)) ^ 707173978;
                        i4 = -1666058786;
                        r115 = r122;
                    }
                    i7 = iM559710 ^ i4;
                    r116 = r115;
                    str = str;
                    r112 = r116;
                    r23 = r112;
                    i19 = i7;
                    i18 = i3;
                    r3 = r23;
                    break;
                case -1474521069:
                case 151285984:
                    i14 = 34630;
                    iM559710 = (i17 - C0873.m55680("ܳᩳ")) * (-13);
                    i3 = ((iM559710 ^ i16) * (-30811)) ^ 550470508;
                    i4 = -2035751138;
                    r115 = r3;
                    i7 = iM559710 ^ i4;
                    r116 = r115;
                    str = str;
                    r112 = r116;
                    r23 = r112;
                    i19 = i7;
                    i18 = i3;
                    r3 = r23;
                    break;
                case -1317981088:
                case -388223402:
                    C19561 c19564 = (C19561) obj;
                    this.f54485 = c19564;
                    return c19564;
                case -1259181836:
                case -542162632:
                    ?? r123 = r3;
                    str = str;
                    int i20 = i12 + i13;
                    if (i11 - (i20 + i20) > 0) {
                        iM559710 = C0873.m55680("ۧܳ") ^ i16;
                        i3 = ((iM559710 ^ i17) * 25037) ^ 250258475;
                        i4 = 1605247567;
                        r115 = r123;
                    } else {
                        iM559710 = (C0946.m55979("᩷ۗ") ^ i17) * (-91);
                        i3 = ((iM559710 ^ i16) * 7627) ^ (-1397316247);
                        i4 = 650871733;
                        r115 = r123;
                    }
                    i7 = iM559710 ^ i4;
                    r116 = r115;
                    str = str;
                    r112 = r116;
                    r23 = r112;
                    i19 = i7;
                    i18 = i3;
                    r3 = r23;
                    break;
                case -1201070165:
                case -863548412:
                    return c19562;
                case -988674470:
                case 546659543:
                    return r3;
                case -949251117:
                case -235547474:
                    ?? r124 = r3;
                    str = str;
                    if (obj == this.f54490) {
                        iM559710 = (C0873.m55680("ۧۜ") + i16) * 89;
                        i3 = ((iM559710 ^ i17) * 20287) ^ 133262908;
                        i4 = 17692239;
                        r115 = r124;
                    } else {
                        iM559710 = C0873.m55680("᩻ܳ") ^ i17;
                        i3 = ((iM559710 ^ i16) * 17209) ^ (-1088053862);
                        i4 = 503171289;
                        r115 = r124;
                    }
                    i7 = iM559710 ^ i4;
                    r116 = r115;
                    str = str;
                    r112 = r116;
                    r23 = r112;
                    i19 = i7;
                    i18 = i3;
                    r3 = r23;
                    break;
                case -904380040:
                case 351696903:
                    ?? r125 = r3;
                    str = str;
                    i13 = 170380809;
                    r19 = r125;
                    if (C1017.f81942 >= 0) {
                        iM559710 = (i16 - C0873.m55680("۫ۧ")) * 13;
                        i3 = ((iM559710 ^ i17) * 27457) ^ 39192323;
                        i4 = 553223243;
                        r115 = r19;
                    } else {
                        iM559710 = (C0946.m55979("ۨ᩹") + i17) * 109;
                        i3 = ((iM559710 ^ i16) * (-26193)) ^ (-513828151);
                        i4 = -1080901328;
                        r115 = r125;
                    }
                    i7 = iM559710 ^ i4;
                    r116 = r115;
                    str = str;
                    r112 = r116;
                    r23 = r112;
                    i19 = i7;
                    i18 = i3;
                    r3 = r23;
                    break;
                case -608845952:
                case 1575634724:
                    return c19561;
                case -187233249:
                case 373123071:
                    ?? r126 = r3;
                    str = str;
                    c = 398;
                    r113 = r126;
                    if (C0937.f81884) {
                        iM559710 = C0946.m55979("ۚ᩶") ^ i16;
                        i3 = ((iM559710 ^ i17) * (-5407)) ^ (-1140253399);
                        i4 = 1734323177;
                        r115 = r126;
                    } else {
                        iM559710 = (i17 - C0873.m55680("᩻۬")) * 15;
                        i3 = ((iM559710 ^ i16) * 18579) ^ (-1903757494);
                        i4 = 1997264116;
                        r115 = r113;
                    }
                    i7 = iM559710 ^ i4;
                    r116 = r115;
                    str = str;
                    r112 = r116;
                    r23 = r112;
                    i19 = i7;
                    i18 = i3;
                    r3 = r23;
                    break;
                case -96519386:
                case 846981119:
                    i14 = 15548;
                    iM559710 = (i17 - C0873.m55680("ܳᩳ")) * (-13);
                    i3 = ((iM559710 ^ i16) * (-30811)) ^ 550470508;
                    i4 = -2035751138;
                    r115 = r3;
                    i7 = iM559710 ^ i4;
                    r116 = r115;
                    str = str;
                    r112 = r116;
                    r23 = r112;
                    i19 = i7;
                    i18 = i3;
                    r3 = r23;
                    break;
                case -85183166:
                case 1662022412:
                    RunnableC1014.m56177();
                    C0882.m55710();
                    return null;
                case -71484479:
                case 1820462212:
                    try {
                        r117 = r3;
                        str = str;
                        try {
                            C19561 c19565 = new C19561(C0917.m55846(abstractC17043M34322, C0912.m55822(f82265, 399, 10, i14)));
                            try {
                                this.f54485 = c19565;
                                int iM559713 = C0946.m55979("ۚۢ") ^ i17;
                                i3 = ((iM559713 ^ i16) * (-20153)) ^ 1109345323;
                                i7 = iM559713 ^ 967134683;
                                c19562 = c19565;
                                r116 = r117;
                            } catch (IOException e) {
                                iOException = e;
                                c19562 = c19565;
                                r118 = r117;
                                iM559710 = (C0873.m55680("ۢۗ") + i16) * (-29);
                                i3 = ((iM559710 ^ i17) * (-16093)) ^ 798422960;
                                i4 = 1758615702;
                                r115 = r118;
                                i7 = iM559710 ^ i4;
                                r116 = r115;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            iOException = e;
                            c19562 = null;
                            r118 = r117;
                            iM559710 = (C0873.m55680("ۢۗ") + i16) * (-29);
                            i3 = ((iM559710 ^ i17) * (-16093)) ^ 798422960;
                            i4 = 1758615702;
                            r115 = r118;
                            i7 = iM559710 ^ i4;
                            r116 = r115;
                            str = str;
                            r112 = r116;
                            r23 = r112;
                            i19 = i7;
                            i18 = i3;
                            r3 = r23;
                            break;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        r117 = r3;
                        str = str;
                    }
                    str = str;
                    r112 = r116;
                    r23 = r112;
                    i19 = i7;
                    i18 = i3;
                    r3 = r23;
                    break;
                case 268505727:
                case 735156590:
                    if (AbstractC0942.f81890 <= 0) {
                        r19 = r3;
                        str = str;
                        iM559710 = (i16 - C0873.m55680("۫ۧ")) * 13;
                        i3 = ((iM559710 ^ i17) * 27457) ^ 39192323;
                        i4 = 553223243;
                        r115 = r19;
                        i7 = iM559710 ^ i4;
                        r116 = r115;
                        str = str;
                        r112 = r116;
                        r23 = r112;
                        i19 = i7;
                        i18 = i3;
                        r3 = r23;
                    } else {
                        iM55979 = C0946.m55979("ۗܶ") ^ i17;
                        i = ((iM55979 ^ i16) * (-387)) ^ 1366119089;
                        i2 = -1775078748;
                        i19 = iM55979 ^ i2;
                        i18 = i;
                    }
                    break;
                case 709417183:
                case 1181192112:
                    C1003.m56123();
                    iM55979 = C0946.m55979("ۗܶ") ^ i17;
                    i = ((iM55979 ^ i16) * (-387)) ^ 1366119089;
                    i2 = -1775078748;
                    i19 = iM55979 ^ i2;
                    i18 = i;
                    break;
                case 732754056:
                case 1401673159:
                    C0890.m55740();
                    if (C1036.m56257() > 0) {
                        iM55979 = C0946.m55979("᩺ۚ") ^ i17;
                        i = ((iM55979 ^ i16) * 11279) ^ 822416228;
                        i2 = 1826600064;
                        i19 = iM55979 ^ i2;
                        i18 = i;
                    } else {
                        r113 = r3;
                        str = str;
                        iM559710 = (i17 - C0873.m55680("᩻۬")) * 15;
                        i3 = ((iM559710 ^ i16) * 18579) ^ (-1903757494);
                        i4 = 1997264116;
                        r115 = r113;
                        i7 = iM559710 ^ i4;
                        r116 = r115;
                        str = str;
                        r112 = r116;
                        r23 = r112;
                        i19 = i7;
                        i18 = i3;
                        r3 = r23;
                    }
                    break;
                case 838191798:
                case 1995771223:
                    ?? r127 = r3;
                    str = str;
                    s = sArr[c];
                    r110 = r127;
                    if (C1025.f81947 >= 0) {
                        iM559710 = (C0873.m55680("᩸ܽ") + i16) * 123;
                        i3 = ((iM559710 ^ i17) * 28453) ^ (-1742907294);
                        i4 = 982313354;
                        r115 = r110;
                    } else {
                        iM559710 = C0946.m55979("ۗۘ") ^ i17;
                        i3 = ((iM559710 ^ i16) * 28135) ^ (-249401688);
                        i4 = 1836565688;
                        r115 = r127;
                    }
                    i7 = iM559710 ^ i4;
                    r116 = r115;
                    str = str;
                    r112 = r116;
                    r23 = r112;
                    i19 = i7;
                    i18 = i3;
                    r3 = r23;
                    break;
                case 921851710:
                case 1556119756:
                    ?? r128 = r3;
                    str = str;
                    r113 = r128;
                    if (C1028.f81950 <= 0) {
                        iM559710 = (i17 - C0873.m55680("᩻۬")) * 15;
                        i3 = ((iM559710 ^ i16) * 18579) ^ (-1903757494);
                        i4 = 1997264116;
                        r115 = r113;
                    } else {
                        iM559710 = C0946.m55979("ۧۙ") ^ i16;
                        i3 = ((iM559710 ^ i17) * 17451) ^ (-1972922346);
                        i4 = 633131044;
                        r115 = r128;
                    }
                    i7 = iM559710 ^ i4;
                    r116 = r115;
                    str = str;
                    r112 = r116;
                    r23 = r112;
                    i19 = i7;
                    i18 = i3;
                    r3 = r23;
                    break;
                case 1077645489:
                case 1884139536:
                    ?? r129 = r3;
                    str = str;
                    sArr = f82265;
                    r114 = r129;
                    if (C0955.f81898) {
                        iM559710 = (C0946.m55979("֫ۚ") + i16) * 47;
                        i3 = ((iM559710 ^ i17) * (-11461)) ^ (-694401060);
                        i4 = 1715996931;
                        r115 = r114;
                    } else {
                        iM559710 = (C0946.m55979("ܶۨ") + i17) * 75;
                        i3 = ((iM559710 ^ i16) * 30679) ^ 1107394322;
                        i4 = -1917252241;
                        r115 = r129;
                    }
                    i7 = iM559710 ^ i4;
                    r116 = r115;
                    str = str;
                    r112 = r116;
                    r23 = r112;
                    i19 = i7;
                    i18 = i3;
                    r3 = r23;
                    break;
                case 1173792545:
                case 1930855285:
                    ?? r130 = r3;
                    str = str;
                    r111 = r130;
                    if (C0937.f81884) {
                        iM559710 = C0946.m55979("ܺ᩸") ^ i16;
                        i3 = ((iM559710 ^ i17) * (-29337)) ^ 1205981092;
                        i4 = 580814791;
                        r115 = r130;
                    } else {
                        iM559710 = (i16 - C0946.m55979("۟ۨ")) * (-57);
                        i3 = ((iM559710 ^ i17) * 15955) ^ 1720778851;
                        i4 = -688581396;
                        r115 = r111;
                    }
                    i7 = iM559710 ^ i4;
                    r116 = r115;
                    str = str;
                    r112 = r116;
                    r23 = r112;
                    i19 = i7;
                    i18 = i3;
                    r3 = r23;
                    break;
                case 1179030718:
                case 1402763283:
                    C16907.m38472(str, r3, iOException);
                    this.f54485 = r3;
                    return r3;
                case 1457834040:
                case 1949626938:
                    ?? r131 = r3;
                    str = str;
                    r113 = r131;
                    if (C1012.f81938 >= 0) {
                        iM559710 = (i17 - C0873.m55680("᩻۬")) * 15;
                        i3 = ((iM559710 ^ i16) * 18579) ^ (-1903757494);
                        i4 = 1997264116;
                        r115 = r113;
                    } else {
                        iM559710 = C0946.m55979("ܽܺ") ^ i17;
                        i3 = ((iM559710 ^ i16) * (-6881)) ^ (-118084062);
                        i4 = 1948249451;
                        r115 = r131;
                    }
                    i7 = iM559710 ^ i4;
                    r116 = r115;
                    str = str;
                    r112 = r116;
                    r23 = r112;
                    i19 = i7;
                    i18 = i3;
                    r3 = r23;
                    break;
                case 1602561122:
                case 1637569768:
                    r112 = r3;
                    str = this.f54481;
                    abstractC17043M34322 = C14976.m34322(str);
                    int iM559714 = C0946.m55979("ܿܶ") ^ i17;
                    i3 = ((iM559714 ^ i16) * (-6491)) ^ 332160746;
                    i7 = iM559714 ^ (-1717554748);
                    r23 = r112;
                    i19 = i7;
                    i18 = i3;
                    r3 = r23;
                    break;
                case 1614677642:
                case 1656886874:
                    C1017.m56187();
                    if (!C0917.m55854()) {
                        r114 = r3;
                        str = str;
                        iM559710 = (C0946.m55979("֫ۚ") + i16) * 47;
                        i3 = ((iM559710 ^ i17) * (-11461)) ^ (-694401060);
                        i4 = 1715996931;
                        r115 = r114;
                        i7 = iM559710 ^ i4;
                        r116 = r115;
                        str = str;
                        r112 = r116;
                        r23 = r112;
                        i19 = i7;
                        i18 = i3;
                        r3 = r23;
                    } else {
                        iM55979 = C0946.m55979("ܿᩴ") ^ i17;
                        i = ((iM55979 ^ i16) * (-19141)) ^ (-576525708);
                        i2 = -561065718;
                        i19 = iM55979 ^ i2;
                        i18 = i;
                    }
                    break;
                default:
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x008a, code lost:
    
        if (p067l.C0866.f81837 >= 0) goto L8;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m41513(int i, int i2, int i3) {
        int i4;
        int i5;
        String str;
        String strM56584;
        short[] sArr;
        int i6;
        int iM55979;
        int i7;
        int i8;
        int iM55680;
        int i9;
        int i10;
        short s;
        int i11;
        int i12;
        String str2;
        short[] sArr2;
        int iM559710;
        int i13;
        int i14;
        int i15;
        String str3 = null;
        String strM17223 = null;
        String strM55717 = null;
        String strM56227 = null;
        int i16 = 0;
        short[] sArr3 = null;
        int i17 = 1124311774;
        int i18 = C1003.f81929;
        int i19 = C0877.f81843;
        int iM55681 = C0873.m55680("᩸᩺") ^ i19;
        int i20 = ((iM55681 ^ i18) * 6945) ^ (-1306572320);
        int i21 = iM55681 ^ (-1516209186);
        String str4 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        StringBuilder sb = null;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        short s2 = 0;
        short s3 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        short[] sArr6 = null;
        short[] sArr7 = null;
        while (true) {
            i17 = i21 ^ (i20 & (((i17 ^ i18) * 4697) >> 31));
            switch (i17) {
                case -2092292496:
                case -1161588514:
                    ViewOnClickListenerC0939.m55941();
                    return null;
                case -1925936580:
                case 91763251:
                    C0854.m55595();
                    if (!RunnableC0897.m55784()) {
                        iM559710 = (i19 - C0946.m55979("֫᩵")) * (-97);
                        i13 = ((iM559710 ^ i18) * (-26119)) ^ 1394556147;
                        i14 = -1759931747;
                        i21 = iM559710 ^ i14;
                        i20 = i13;
                    } else {
                        sArr2 = sArr6;
                        i12 = i22;
                        str2 = str4;
                        int iM559711 = C0946.m55979("ᩳᩴ") ^ i18;
                        StringBuilder sb2 = sb;
                        int i31 = ((iM559711 ^ i19) * (-14653)) ^ (-2144519759);
                        i21 = iM559711 ^ (-1047958486);
                        str4 = str2;
                        i22 = i12;
                        sArr6 = sArr2;
                        i20 = i31;
                        sb = sb2;
                    }
                    break;
                case -1885270754:
                case 2025473386:
                    strM56227 = C1025.m56227(strM17223, strM55717, RunnableC0897.m55783(sArr5, i24, i22, i16));
                    sArr7 = f82265;
                    i25 = 118;
                    i26 = 2;
                    if (C1003.f81929 <= 0) {
                        iM559710 = (i19 - C0946.m55979("֫᩵")) * (-97);
                        i13 = ((iM559710 ^ i18) * (-26119)) ^ 1394556147;
                        i14 = -1759931747;
                    } else {
                        iM559710 = (i19 - C0946.m55979("۬ܰ")) * (-113);
                        i13 = ((iM559710 ^ i18) * 7957) ^ (-135900363);
                        i14 = -1320297480;
                    }
                    i21 = iM559710 ^ i14;
                    i20 = i13;
                    break;
                case -1801745181:
                case 1218299724:
                    C1044.m56286();
                    break;
                case -1667858433:
                case 2106564760:
                    StringBuilder sb3 = sb;
                    str4 = str4;
                    i28 = i28;
                    i29 = i29;
                    strM17223 = strM17223;
                    sArr6 = sArr6;
                    i22 = i22;
                    s = s2;
                    int i32 = s * ColorResourcesTableCreator.HEADER_TYPE_PACKAGE;
                    s3 = 128;
                    if (C1025.f81947 < 0) {
                        int iM55682 = (i18 - C0873.m55680("᩶ܳ")) * 57;
                        s2 = s;
                        i20 = ((iM55682 ^ i19) * 31575) ^ (-16268503);
                        i27 = i32;
                        i22 = i22;
                        sArr6 = sArr6;
                        i29 = i29;
                        sb = sb3;
                        i21 = iM55682 ^ (-1998590259);
                        strM17223 = strM17223;
                        i28 = i28;
                        str4 = str4;
                    } else {
                        i27 = i32;
                        int iM55683 = (i18 - C0873.m55680("֫ۧ")) * 39;
                        int i33 = ((iM55683 ^ i19) * 8587) ^ (-1822098964);
                        i15 = iM55683 ^ (-850121688);
                        s2 = s;
                        i20 = i33;
                        strM17223 = strM17223;
                        sb = null;
                        i28 = i28;
                        str4 = str4;
                        int i34 = i29;
                        i21 = i15;
                        i22 = i22;
                        sArr6 = sArr6;
                        i29 = i34;
                    }
                    break;
                case -1457595181:
                case -308523897:
                    i30 = IShizukuService.Stub.TRANSACTION_attachUserService;
                    i23 = 8;
                    if (C0890.f81849 == 0) {
                        iM559710 = C0946.m55979("ۧۛ") ^ i19;
                        i13 = ((iM559710 ^ i18) * (-19159)) ^ (-1296713134);
                        i14 = 1515406025;
                        i21 = iM559710 ^ i14;
                        i20 = i13;
                    } else {
                        str4 = str4;
                        i28 = i28;
                        i29 = i29;
                        strM17223 = strM17223;
                        sArr6 = sArr6;
                        i22 = i22;
                        int iM559712 = (i19 - C0946.m55979("᩸ۚ")) * (-91);
                        int i35 = ((iM559712 ^ i18) * 3671) ^ (-224632605);
                        i15 = iM559712 ^ (-1831168801);
                        i20 = i35;
                        strM17223 = strM17223;
                        i28 = i28;
                        str4 = str4;
                        int i36 = i29;
                        i21 = i15;
                        i22 = i22;
                        sArr6 = sArr6;
                        i29 = i36;
                    }
                    break;
                case -914743334:
                case 107899331:
                    i16 = 29176;
                    iM55680 = (C0946.m55979("ۙ᩷") + i18) * (-11);
                    i9 = ((iM55680 ^ i19) * 27463) ^ 1726810009;
                    i10 = -1862817779;
                    i11 = iM55680 ^ i10;
                    i20 = i9;
                    i22 = i22;
                    strM17223 = strM17223;
                    sArr6 = sArr6;
                    i29 = i29;
                    i21 = i11;
                    i28 = i28;
                    sb = sb;
                    str4 = str4;
                    break;
                case -904603968:
                case 79681368:
                    int i37 = i30;
                    strM17223 = C7453.m17223(i3, false);
                    sArr3 = f82265;
                    if (C1053.m56327() >= 0) {
                        i30 = i37;
                        sArr2 = sArr6;
                        i12 = i22;
                        str2 = str4;
                        int iM559713 = C0946.m55979("ᩳᩴ") ^ i18;
                        StringBuilder sb4 = sb;
                        int i38 = ((iM559713 ^ i19) * (-14653)) ^ (-2144519759);
                        i21 = iM559713 ^ (-1047958486);
                        str4 = str2;
                        i22 = i12;
                        sArr6 = sArr2;
                        i20 = i38;
                        sb = sb4;
                    } else {
                        int iM559714 = (C0946.m55979("᩵۠") ^ i18) * 7;
                        i30 = i37;
                        i20 = ((iM559714 ^ i19) * (-24509)) ^ 647094956;
                        i21 = iM559714 ^ 1481010022;
                    }
                    break;
                case -813911390:
                case 313469121:
                    return C0863.m55639(sb);
                case -745804957:
                case 492041857:
                    short[] sArr8 = sArr6;
                    i4 = i28;
                    i5 = i22;
                    str = strM17223;
                    int i39 = i29;
                    strM56584 = C1964.m56584(sArr8, i4, i39, i16);
                    C1003.m56121(sb, strM56584);
                    sArr = sArr8;
                    if (i3 > 21) {
                        iM55979 = C0946.m55979("۫ܺ") ^ i18;
                        i6 = i39;
                        i7 = ((iM55979 ^ i19) * 12177) ^ 1558352354;
                        i8 = -395488505;
                    } else {
                        i6 = i39;
                        iM55979 = (C0946.m55979("۫ܰ") ^ i19) * 97;
                        i7 = ((iM55979 ^ i18) * (-12307)) ^ 786321139;
                        i8 = 591797786;
                    }
                    int i40 = i6;
                    i21 = iM55979 ^ i8;
                    i20 = i7;
                    i22 = i5;
                    sArr6 = sArr;
                    i29 = i40;
                    String str5 = str;
                    i28 = i4;
                    str3 = strM56584;
                    strM17223 = str5;
                    break;
                case -736328704:
                case -219217253:
                    int i41 = i30;
                    strM55717 = C0882.m55717(sArr3, i41, i23, i16);
                    sArr5 = f82265;
                    i24 = UMErrorCode.E_UM_BE_JSON_FAILED;
                    i22 = 8;
                    if (C0967.f81910 >= 0) {
                        sb = sb;
                        i30 = i41;
                        str4 = str4;
                        i28 = i28;
                        i29 = i29;
                        strM17223 = strM17223;
                        sArr6 = sArr6;
                        int iM559715 = C0946.m55979("۬᩻") ^ i19;
                        int i42 = ((iM559715 ^ i18) * (-5929)) ^ 1562050777;
                        i11 = iM559715 ^ 450127857;
                        i20 = i42;
                        strM17223 = strM17223;
                        sArr6 = sArr6;
                        i29 = i29;
                        i21 = i11;
                        i28 = i28;
                        sb = sb;
                        str4 = str4;
                    } else {
                        int iM559716 = C0946.m55979("᩹ܺ") ^ i18;
                        i30 = i41;
                        i20 = ((iM559716 ^ i19) * 17) ^ (-1734976864);
                        i21 = iM559716 ^ 1522542307;
                    }
                    break;
                case -470582749:
                case 1148577966:
                    C0863.m55643();
                    iM559710 = (i19 - C0946.m55979("֫᩵")) * (-97);
                    i13 = ((iM559710 ^ i18) * (-26119)) ^ 1394556147;
                    i14 = -1759931747;
                    i21 = iM559710 ^ i14;
                    i20 = i13;
                    break;
                case -391592139:
                case 613654174:
                    sb = sb;
                    str4 = str4;
                    i28 = i28;
                    i29 = i29;
                    strM17223 = strM17223;
                    sArr6 = sArr6;
                    i22 = i22;
                    int i43 = s2 + s3;
                    if (i27 - (i43 * i43) <= 0) {
                        iM55680 = C0946.m55979("֡۠") ^ i19;
                        i9 = ((iM55680 ^ i18) * (-25033)) ^ (-826997317);
                        i10 = -138915887;
                    } else {
                        iM55680 = C0873.m55680("ܺܰ") ^ i19;
                        i9 = ((iM55680 ^ i18) * 30081) ^ 235181018;
                        i10 = 1194713841;
                    }
                    i11 = iM55680 ^ i10;
                    i20 = i9;
                    i22 = i22;
                    strM17223 = strM17223;
                    sArr6 = sArr6;
                    i29 = i29;
                    i21 = i11;
                    i28 = i28;
                    sb = sb;
                    str4 = str4;
                    break;
                case -286685310:
                case -102938792:
                    C0894.m55769();
                    if (C0894.f81854 >= 0) {
                        s = s2;
                        str4 = str4;
                        i28 = i28;
                        i29 = i29;
                        strM17223 = strM17223;
                        sArr6 = sArr6;
                        i22 = i22;
                        int iM55684 = (i18 - C0873.m55680("֫ۧ")) * 39;
                        int i310 = ((iM55684 ^ i19) * 8587) ^ (-1822098964);
                        i15 = iM55684 ^ (-850121688);
                        s2 = s;
                        i20 = i310;
                        strM17223 = strM17223;
                        sb = null;
                        i28 = i28;
                        str4 = str4;
                        int i311 = i29;
                        i21 = i15;
                        i22 = i22;
                        sArr6 = sArr6;
                        i29 = i311;
                    } else {
                        sArr2 = sArr6;
                        i12 = i22;
                        str2 = str4;
                        int iM559717 = C0946.m55979("ᩳᩴ") ^ i18;
                        StringBuilder sb5 = sb;
                        int i312 = ((iM559717 ^ i19) * (-14653)) ^ (-2144519759);
                        i21 = iM559717 ^ (-1047958486);
                        str4 = str2;
                        i22 = i12;
                        sArr6 = sArr2;
                        i20 = i312;
                        sb = sb5;
                    }
                    break;
                case 190566990:
                case 296730751:
                    return RunnableC0897.m55783(f82265, 96, 6, i16);
                case 340351315:
                case 1422466655:
                    sb = sb;
                    str4 = str4;
                    i28 = i28;
                    i29 = i29;
                    strM17223 = strM17223;
                    sArr6 = sArr6;
                    i22 = i22;
                    if (i == 2) {
                        iM55680 = C0873.m55680("ۛܽ") ^ i18;
                        i9 = ((iM55680 ^ i19) * (-12601)) ^ 782216560;
                        i10 = 690115044;
                    } else {
                        iM55680 = C0946.m55979("ۘ᩸") ^ i18;
                        i9 = ((iM55680 ^ i19) * (-26049)) ^ (-1727081522);
                        i10 = 1944508994;
                    }
                    i11 = iM55680 ^ i10;
                    i20 = i9;
                    i22 = i22;
                    strM17223 = strM17223;
                    sArr6 = sArr6;
                    i29 = i29;
                    i21 = i11;
                    i28 = i28;
                    sb = sb;
                    str4 = str4;
                    break;
                case 727078515:
                case 1071706245:
                    i12 = i22;
                    String str6 = strM17223;
                    str2 = str4;
                    C0912.m55825(sb, str2);
                    sArr2 = f82265;
                    i29 = 1;
                    if (C0930.f81879 <= 0) {
                        strM17223 = str6;
                        i28 = 95;
                        int iM559718 = C0946.m55979("ᩳᩴ") ^ i18;
                        StringBuilder sb6 = sb;
                        int i313 = ((iM559718 ^ i19) * (-14653)) ^ (-2144519759);
                        i21 = iM559718 ^ (-1047958486);
                        str4 = str2;
                        i22 = i12;
                        sArr6 = sArr2;
                        i20 = i313;
                        sb = sb6;
                    } else {
                        StringBuilder sb7 = sb;
                        int iM559719 = (C0946.m55979("ۘܽ") ^ i19) * (-53);
                        int i44 = ((iM559719 ^ i18) * (-14427)) ^ 963012258;
                        i21 = iM559719 ^ 1526143307;
                        str4 = str2;
                        i22 = i12;
                        sb = sb7;
                        sArr6 = sArr2;
                        i20 = i44;
                        strM17223 = str6;
                        i28 = 95;
                    }
                    break;
                case 736898753:
                case 1387343478:
                    sb = sb;
                    str4 = str4;
                    i28 = i28;
                    i29 = i29;
                    strM17223 = strM17223;
                    sArr6 = sArr6;
                    i22 = i22;
                    sArr4 = f82265;
                    if (C1003.f81929 > 0) {
                        iM55680 = (C0873.m55680("ۖ֡") ^ i18) * (-7);
                        i9 = ((iM55680 ^ i19) * 26893) ^ 2077363457;
                        i10 = 1757532140;
                        i11 = iM55680 ^ i10;
                        i20 = i9;
                        i22 = i22;
                        strM17223 = strM17223;
                        sArr6 = sArr6;
                        i29 = i29;
                        i21 = i11;
                        i28 = i28;
                        sb = sb;
                        str4 = str4;
                    } else {
                        i22 = i22;
                        int iM5597110 = C0946.m55979("۬᩻") ^ i19;
                        int i45 = ((iM5597110 ^ i18) * (-5929)) ^ 1562050777;
                        i11 = iM5597110 ^ 450127857;
                        i20 = i45;
                        strM17223 = strM17223;
                        sArr6 = sArr6;
                        i29 = i29;
                        i21 = i11;
                        i28 = i28;
                        sb = sb;
                        str4 = str4;
                    }
                    break;
                case 1114891054:
                case 2046288019:
                    i16 = 40260;
                    iM55680 = (C0946.m55979("ۙ᩷") + i18) * (-11);
                    i9 = ((iM55680 ^ i19) * 27463) ^ 1726810009;
                    i10 = -1862817779;
                    i11 = iM55680 ^ i10;
                    i20 = i9;
                    i22 = i22;
                    strM17223 = strM17223;
                    sArr6 = sArr6;
                    i29 = i29;
                    i21 = i11;
                    i28 = i28;
                    sb = sb;
                    str4 = str4;
                    break;
                case 1342575919:
                case 1369402506:
                    i29 = i29;
                    sArr6 = sArr6;
                    i22 = i22;
                    String str7 = str4;
                    i28 = i28;
                    strM17223 = strM17223;
                    short[] sArr9 = f82265;
                    if (C0989.f81920 >= 0) {
                        str4 = str7;
                        s = s2;
                        int iM55685 = (i18 - C0873.m55680("֫ۧ")) * 39;
                        int i314 = ((iM55685 ^ i19) * 8587) ^ (-1822098964);
                        i15 = iM55685 ^ (-850121688);
                        s2 = s;
                        i20 = i314;
                        strM17223 = strM17223;
                        sb = null;
                        i28 = i28;
                        str4 = str4;
                        int i315 = i29;
                        i21 = i15;
                        i22 = i22;
                        sArr6 = sArr6;
                        i29 = i315;
                    } else {
                        sb = new StringBuilder(C1012.m56144(sArr9, 91, 4, i16));
                        String strM41512 = m41512(i2);
                        if (C1124.m56367() >= 0) {
                            str4 = strM41512;
                            int iM5597111 = (i19 - C0946.m55979("᩸ۚ")) * (-91);
                            int i316 = ((iM5597111 ^ i18) * 3671) ^ (-224632605);
                            i15 = iM5597111 ^ (-1831168801);
                            i20 = i316;
                            strM17223 = strM17223;
                            i28 = i28;
                            str4 = str4;
                            int i317 = i29;
                            i21 = i15;
                            i22 = i22;
                            sArr6 = sArr6;
                            i29 = i317;
                        } else {
                            int iM55686 = C0873.m55680("ۤܿ") ^ i19;
                            str4 = strM41512;
                            i20 = ((iM55686 ^ i18) * 6855) ^ 2116395956;
                            strM17223 = strM17223;
                            i28 = i28;
                            i21 = iM55686 ^ (-1525051211);
                            i22 = i22;
                            sArr6 = sArr6;
                            i29 = i29;
                        }
                    }
                    break;
                case 1718402343:
                case 1975625976:
                    sb = sb;
                    str4 = str4;
                    i28 = i28;
                    i29 = i29;
                    strM17223 = strM17223;
                    sArr6 = sArr6;
                    i22 = i22;
                    s2 = sArr4[90];
                    if (C0992.f81922 < 0) {
                        iM55680 = C0873.m55680("ۚܰ") ^ i19;
                        i9 = ((iM55680 ^ i18) * (-8953)) ^ (-546442414);
                        i10 = 316259956;
                        i11 = iM55680 ^ i10;
                        i20 = i9;
                        i22 = i22;
                        strM17223 = strM17223;
                        sArr6 = sArr6;
                        i29 = i29;
                        i21 = i11;
                        i28 = i28;
                        sb = sb;
                        str4 = str4;
                    } else {
                        sb = sb;
                        int iM5597112 = (i19 - C0946.m55979("᩸ۚ")) * (-91);
                        int i318 = ((iM5597112 ^ i18) * 3671) ^ (-224632605);
                        i15 = iM5597112 ^ (-1831168801);
                        i20 = i318;
                        strM17223 = strM17223;
                        i28 = i28;
                        str4 = str4;
                        int i319 = i29;
                        i21 = i15;
                        i22 = i22;
                        sArr6 = sArr6;
                        i29 = i319;
                    }
                    break;
                default:
                    C1003.m56121(sb, C1024.m56203(sArr7, i25, i26, i16));
                    C1003.m56121(sb, strM56227);
                    C0912.m55825(sb, str3);
                    i6 = i29;
                    sArr = sArr6;
                    i5 = i22;
                    String str8 = strM17223;
                    strM56584 = str3;
                    i4 = i28;
                    str = str8;
                    iM55979 = (C0946.m55979("۫ܰ") ^ i19) * 97;
                    i7 = ((iM55979 ^ i18) * (-12307)) ^ 786321139;
                    i8 = 591797786;
                    int i46 = i6;
                    i21 = iM55979 ^ i8;
                    i20 = i7;
                    i22 = i5;
                    sArr6 = sArr;
                    i29 = i46;
                    String str9 = str;
                    i28 = i4;
                    str3 = strM56584;
                    strM17223 = str9;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:42:0x0165 A[PHI: r3
      0x0165: PHI (r3v4 org.json.JSONArray) = (r3v2 org.json.JSONArray), (r3v2 org.json.JSONArray), (r3v8 org.json.JSONArray) binds: [B:33:0x00ff, B:18:0x007c, B:108:0x0165] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0222 A[PHI: r13 r14 r15
      0x0222: PHI (r13v4 int) = (r13v3 int), (r13v2 int) binds: [B:59:0x0220, B:7:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r14v4 int) = (r14v3 int), (r14v2 int) binds: [B:59:0x0220, B:7:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r15v4 int) = (r15v3 int), (r15v2 int) binds: [B:59:0x0220, B:7:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0256 A[PHI: r6 r7 r12
      0x0256: PHI (r6v4 l.ۧܳ᩷) = (r6v2 l.ۧܳ᩷), (r6v3 l.ۧܳ᩷), (r6v2 l.ۧܳ᩷) binds: [B:63:0x0254, B:26:0x00b3, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r7v4 java.lang.String) = (r7v2 java.lang.String), (r7v3 java.lang.String), (r7v2 java.lang.String) binds: [B:63:0x0254, B:26:0x00b3, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:63:0x0254, B:26:0x00b3, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02ab A[PHI: r2 r10 r17 r22
      0x02ab: PHI (r2v4 l.ܽܳ᩷) = (r2v2 l.ܽܳ᩷), (r2v2 l.ܽܳ᩷), (r2v3 l.ܽܳ᩷), (r2v2 l.ܽܳ᩷), (r2v2 l.ܽܳ᩷) binds: [B:71:0x02a9, B:67:0x028a, B:48:0x01a7, B:13:0x006c, B:5:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r10v4 short) = (r10v2 short), (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:71:0x02a9, B:67:0x028a, B:48:0x01a7, B:13:0x006c, B:5:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:71:0x02a9, B:67:0x028a, B:48:0x01a7, B:13:0x006c, B:5:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r22v5 short) = (r22v3 short), (r22v4 short), (r22v3 short), (r22v3 short), (r22v3 short) binds: [B:71:0x02a9, B:67:0x028a, B:48:0x01a7, B:13:0x006c, B:5:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02de A[PHI: r16
      0x02de: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:75:0x02dc, B:13:0x006c, B:10:0x0066, B:7:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x0310 A[PHI: r9
      0x0310: PHI (r9v4 short[]) = (r9v2 short[]), (r9v3 short[]), (r9v2 short[]) binds: [B:79:0x030e, B:44:0x0181, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static C18249 m41516(JSONObject jSONObject, C19561 c19561) throws JSONException {
        int iM55979;
        int i;
        int i2;
        int i3 = RunnableC1014.f81941;
        int i4 = C1404.f82149;
        int iM559710 = C0946.m55979("᩸ۘ") ^ i4;
        int i5 = ((iM559710 ^ i3) * (-3507)) ^ 909303521;
        JSONArray jSONArrayOptJSONArray = null;
        short[] sArr = null;
        int i6 = iM559710 ^ 1235823032;
        C18249 c18249 = null;
        int length = 0;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        int i12 = -1260383501;
        short s2 = 0;
        short[] sArr2 = null;
        String string = null;
        C12886 c12886 = null;
        int i13 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * (-27297)) >> 31));
            switch (i12) {
                case -2127823571:
                case -1857516301:
                    c18249 = new C18249();
                    c18249.m41520(jSONObject);
                    if (C0967.f81910 >= 0) {
                        iM55979 = C0873.m55680("֡ܿ") ^ i3;
                        i = ((iM55979 ^ i4) * (-15209)) ^ (-1759766288);
                        i2 = 683352803;
                    } else {
                        iM55979 = (C0946.m55979("᩻۠") + i4) * 45;
                        i = ((iM55979 ^ i3) * (-30835)) ^ 610043730;
                        i2 = 2090458024;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1944838882:
                case 1736181393:
                    if (C1929.f83011 == 0) {
                        iM55979 = C0873.m55680("֡ܿ") ^ i3;
                        i = ((iM55979 ^ i4) * (-15209)) ^ (-1759766288);
                        i2 = 683352803;
                    } else {
                        iM55979 = C0946.m55979("ܺ᩻") ^ i3;
                        i = ((iM55979 ^ i4) * 9967) ^ 2103861727;
                        i2 = -1701342242;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1929610177:
                case 1372906398:
                    int i14 = i10 + i11;
                    if (i9 - (i14 + i14) <= 0) {
                        iM55979 = C0946.m55979("֡ۘ") ^ i4;
                        i = ((iM55979 ^ i3) * 15347) ^ (-913738998);
                        i2 = 180525528;
                    } else {
                        iM55979 = C0946.m55979("ᩴۙ") ^ i3;
                        i = ((iM55979 ^ i4) * (-4915)) ^ 1540563095;
                        i2 = 1552763242;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1859760977:
                case 378962048:
                    if (i13 < length) {
                        iM55979 = C0873.m55680("ܶۙ") ^ i4;
                        i = ((iM55979 ^ i3) * 16901) ^ 329256013;
                        i2 = 852996111;
                    } else {
                        iM55979 = (i3 - C0946.m55979("۠ᩴ")) * 127;
                        i = ((iM55979 ^ i4) * (-14715)) ^ (-248389429);
                        i2 = -425175543;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1652541980:
                case 1574444152:
                    if (RunnableC0897.m55784()) {
                        iM55979 = C0946.m55979("᩷ۨ") ^ i4;
                        i = ((iM55979 ^ i3) * (-6631)) ^ 934928463;
                        i2 = 1480393075;
                    } else {
                        iM55979 = (C0946.m55979("᩻᩻") + i4) * (-59);
                        i = ((iM55979 ^ i3) * 15881) ^ 806637699;
                        i2 = 784167426;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1636396728:
                case -284327380:
                    s = sArr2[c];
                    s2 = 12128;
                    if (C0947.f81895) {
                        iM55979 = C0873.m55680("֡ܿ") ^ i3;
                        i = ((iM55979 ^ i4) * (-15209)) ^ (-1759766288);
                        i2 = 683352803;
                    } else {
                        iM55979 = (C0946.m55979("᩷ܳ") + i3) * 23;
                        i = ((iM55979 ^ i4) * 14919) ^ 207934114;
                        i2 = -708296542;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1620564555:
                case -1322774125:
                    i9 = i8 * i8;
                    i10 = s * s;
                    i11 = 147088384;
                    if (C1929.f83011 != 0) {
                        iM55979 = C0873.m55680("۫ܶ") ^ i4;
                        i = ((iM55979 ^ i3) * 11177) ^ (-1795313312);
                        i2 = -1708476618;
                    } else {
                        iM55979 = C0946.m55979("ۗۜ") ^ i4;
                        i = ((iM55979 ^ i3) * 21881) ^ 1791358325;
                        i2 = 1490452966;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1613312117:
                case 1308642721:
                    if (C0894.f81854 < 0) {
                        iM55979 = C0946.m55979("ܺ᩻") ^ i3;
                        i = ((iM55979 ^ i4) * 9967) ^ 2103861727;
                        i2 = -1701342242;
                    } else {
                        iM55979 = C0946.m55979("᩷ۨ") ^ i4;
                        i = ((iM55979 ^ i3) * (-6631)) ^ 934928463;
                        i2 = 1480393075;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1566288671:
                case -72208267:
                    C0917.m55854();
                    if (C0866.m55645()) {
                        iM55979 = C0946.m55979("ܺ᩻") ^ i3;
                        i = ((iM55979 ^ i4) * 9967) ^ 2103861727;
                        i2 = -1701342242;
                    } else {
                        iM55979 = C0873.m55680("۫ܶ") ^ i4;
                        i = ((iM55979 ^ i3) * 11177) ^ (-1795313312);
                        i2 = -1708476618;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1429907640:
                case -731719815:
                    c12886 = new C12886();
                    string = jSONArrayOptJSONArray.getString(i13);
                    if (C0967.f81910 >= 0) {
                        iM55979 = C0946.m55979("ۜ᩸") ^ i3;
                        i = ((iM55979 ^ i4) * 14007) ^ 880398687;
                        i2 = -1018268080;
                    } else {
                        iM55979 = C0873.m55680("ۜ֨") ^ i3;
                        i = ((iM55979 ^ i4) * 29635) ^ 1535102731;
                        i2 = 35350850;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1067162951:
                case 1230068464:
                    ServiceConnectionC1013.m56157();
                    C1964.m56597();
                    return null;
                case -858983861:
                case -555217997:
                    i7 = 57276;
                    iM55979 = C0946.m55979("ۡۧ") ^ i3;
                    i = ((iM55979 ^ i4) * (-7423)) ^ (-1176983);
                    i2 = -524161882;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -674388254:
                case 1974302830:
                    c18249.f54503 = true;
                    c18249.m41518(c19561);
                    return c18249;
                case -572971635:
                case 1325042336:
                    if (jSONArrayOptJSONArray.isNull(i13)) {
                        iM55979 = (i3 - C0946.m55979("۠ᩴ")) * 127;
                        i = ((iM55979 ^ i4) * (-14715)) ^ (-248389429);
                        i2 = -425175543;
                    } else {
                        iM55979 = C0873.m55680("۫ۚ") ^ i3;
                        i = ((iM55979 ^ i4) * 11469) ^ (-366910217);
                        i2 = -886093910;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -448013913:
                case -419598000:
                    if (i13 == length - 1) {
                        iM55979 = (C0946.m55979("᩺ۢ") ^ i4) * 61;
                        i = ((iM55979 ^ i3) * (-883)) ^ 419518840;
                        i2 = 1343417033;
                    } else {
                        iM55979 = C0873.m55680("۫ۚ") ^ i3;
                        i = ((iM55979 ^ i4) * 11469) ^ (-366910217);
                        i2 = -886093910;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -262763416:
                case -201159805:
                    jSONArrayOptJSONArray = jSONObject.optJSONArray(C0845.m55592(sArr, 158, 10, i7));
                    if (jSONArrayOptJSONArray != null) {
                        int iM55680 = C0873.m55680("᩶ۘ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 12663) ^ 2061704187;
                        i6 = iM55680 ^ 660234329;
                    } else {
                        iM55979 = (i3 - C0946.m55979("۠ᩴ")) * 127;
                        i = ((iM55979 ^ i4) * (-14715)) ^ (-248389429);
                        i2 = -425175543;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    }
                    break;
                case -210535353:
                case 1891228297:
                    length = jSONArrayOptJSONArray.length();
                    i13 = 0;
                    iM55979 = C0946.m55979("᩸֫") ^ i3;
                    i = ((iM55979 ^ i4) * (-32203)) ^ (-949306971);
                    i2 = -254821583;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -2699521:
                case 1676770979:
                    c12886.m29515(string);
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0946.m55979("ۜ᩸") ^ i3;
                        i = ((iM55979 ^ i4) * 14007) ^ 880398687;
                        i2 = -1018268080;
                    } else {
                        iM55979 = C0873.m55680("ۛᩳ") ^ i4;
                        i = ((iM55979 ^ i3) * (-2201)) ^ 1041697585;
                        i2 = -369497943;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 99278823:
                case 658428088:
                    c = 157;
                    if (C0955.f81898) {
                        iM55979 = C0873.m55680("֡ܿ") ^ i3;
                        i = ((iM55979 ^ i4) * (-15209)) ^ (-1759766288);
                        i2 = 683352803;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ܰۛ")) * (-5);
                        i = ((iM55979 ^ i3) * (-19247)) ^ 389822722;
                        i2 = 1162291555;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 430609709:
                case 1459198506:
                    i8 = s + s2;
                    if (C1036.m56257() <= 0) {
                        iM55979 = C0946.m55979("ۜ᩸") ^ i3;
                        i = ((iM55979 ^ i4) * 14007) ^ 880398687;
                        i2 = -1018268080;
                    } else {
                        iM55979 = (i3 - C0873.m55680("֨۠")) * 49;
                        i = ((iM55979 ^ i4) * (-5231)) ^ 279833423;
                        i2 = 581327056;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 657670737:
                case 1030012450:
                    i7 = 20958;
                    iM55979 = C0946.m55979("ۡۧ") ^ i3;
                    i = ((iM55979 ^ i4) * (-7423)) ^ (-1176983);
                    i2 = -524161882;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 808397348:
                case 926472206:
                    sArr2 = f82265;
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0946.m55979("ܺ᩻") ^ i3;
                        i = ((iM55979 ^ i4) * 9967) ^ 2103861727;
                        i2 = -1701342242;
                    } else {
                        iM55979 = (i3 - C0873.m55680("۬ܺ")) * 13;
                        i = ((iM55979 ^ i4) * (-18729)) ^ (-820061850);
                        i2 = -538968341;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 929283205:
                case 1504203607:
                    sArr = f82265;
                    if (C0863.f81833 <= 0) {
                        iM55979 = C0946.m55979("᩷ۨ") ^ i4;
                        i = ((iM55979 ^ i3) * (-6631)) ^ 934928463;
                        i2 = 1480393075;
                    } else {
                        iM55979 = (C0873.m55680("ۧܽ") + i4) * (-103);
                        i = ((iM55979 ^ i3) * 32303) ^ 669488810;
                        i2 = 1390918218;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1037246829:
                case 1675509603:
                    C0937.m55917(c18249.f54488, c12886);
                    i13++;
                    iM55979 = C0946.m55979("᩸֫") ^ i3;
                    i = ((iM55979 ^ i4) * (-32203)) ^ (-949306971);
                    i2 = -254821583;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    C1194.m56396();
                    iM55979 = C0873.m55680("֡ܿ") ^ i3;
                    i = ((iM55979 ^ i4) * (-15209)) ^ (-1759766288);
                    i2 = 683352803;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final PluginPreference m41552(String str) {
        String str2 = null;
        Class clsM18729 = null;
        int i = -2874343;
        int i2 = RunnableC1014.f81941;
        int i3 = RunnableC0938.f81886;
        int iM55979 = (i3 - C0946.m55979("ܶ᩸")) * 49;
        int i4 = ((iM55979 ^ i2) * (-32593)) ^ 1180027598;
        int i5 = -600571710;
        while (true) {
            i = ((((i ^ i2) * (-2905)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2114455454:
                case -173849033:
                    if (C1012.f81938 >= 0) {
                        iM55979 = C0946.m55979("ܰۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 30439) ^ 881433029;
                        i5 = -1434008103;
                    } else {
                        iM55979 = (C0873.m55680("᩻ۛ") + i3) * (-113);
                        i4 = ((iM55979 ^ i2) * 30377) ^ (-42451978);
                        i5 = 2100446516;
                    }
                    break;
                case -2092644182:
                case 675063599:
                    if (C1028.m56247() >= 0) {
                        iM55979 = C0946.m55979("᩺᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * 17011) ^ 43971460;
                        i5 = 1910789990;
                    } else {
                        iM55979 = (C0946.m55979("ۡۨ") ^ i3) * (-99);
                        i4 = ((iM55979 ^ i2) * 5609) ^ (-250840575);
                        i5 = -899201219;
                    }
                    break;
                case -2084035486:
                case -1493509925:
                    clsM18729 = C8056.m18729(this.f54482, str2);
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0946.m55979("ܳ᩹") + i2) * 99;
                        i4 = ((iM55979 ^ i3) * 5397) ^ 373404407;
                        i5 = 1759740332;
                    } else {
                        iM55979 = (i2 - C0873.m55680("۫᩸")) * (-113);
                        i4 = ((iM55979 ^ i3) * 5309) ^ (-646953812);
                        i5 = -1910736626;
                    }
                    break;
                case -1949527194:
                case -1521703512:
                    if (m41557()) {
                        iM55979 = (C0946.m55979("ۘۜ") ^ i3) * (-75);
                        i4 = ((iM55979 ^ i2) * 32479) ^ 2099452108;
                        i5 = -1045044508;
                    } else {
                        iM55979 = (i2 - C0946.m55979("᩵ۧ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55979 ^ i3) * (-5103)) ^ (-511161075);
                        i5 = -1717154274;
                    }
                    break;
                case -1841203342:
                case 269342199:
                    RunnableC0938.m55938();
                    return null;
                case -1466735398:
                case 97879807:
                    if (str2 != null) {
                        iM55979 = C0946.m55979("᩹ۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27761) ^ 323739191;
                        i5 = 439121858;
                    } else {
                        iM55979 = (i2 - C0946.m55979("᩵ۧ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55979 ^ i3) * (-5103)) ^ (-511161075);
                        i5 = -1717154274;
                    }
                    break;
                case -1228041035:
                case -839130259:
                    C1404.m56468();
                    if (RunnableC0871.f81839 < 0) {
                        iM55979 = (C0873.m55680("ܰۛ") + i2) * 49;
                        i4 = ((iM55979 ^ i3) * (-32655)) ^ 1059977358;
                        i5 = -1804720599;
                    } else {
                        iM55979 = C0873.m55680("ۤ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 24725) ^ (-1106581941);
                        i5 = 772795574;
                    }
                    break;
                case -1075002486:
                case 1800477604:
                    if (ViewOnClickListenerC0939.m55941() < 0) {
                        iM55979 = (C0873.m55680("ܰۛ") + i2) * 49;
                        i4 = ((iM55979 ^ i3) * (-32655)) ^ 1059977358;
                        i5 = -1804720599;
                    } else {
                        iM55979 = C0946.m55979("᩺᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * 17011) ^ 43971460;
                        i5 = 1910789990;
                    }
                    break;
                case -808989178:
                case 847055611:
                    if (C0937.f81884) {
                        iM55979 = (C0873.m55680("ۧᩴ") ^ i2) * 85;
                        i4 = ((iM55979 ^ i3) * 7261) ^ (-1603723385);
                        i5 = 25315434;
                    } else {
                        iM55979 = (C0873.m55680("ܰۛ") + i2) * 49;
                        i4 = ((iM55979 ^ i3) * (-32655)) ^ 1059977358;
                        i5 = -1804720599;
                    }
                    break;
                case -788035899:
                case 171269103:
                    str2 = this.f54483;
                    iM55979 = (i3 - C0873.m55680("ᩳ᩻")) * (-101);
                    i4 = ((iM55979 ^ i2) * 16647) ^ (-1912864552);
                    i5 = -621443156;
                    break;
                case -762757340:
                case 479500963:
                    if (C1229.m56410() != 0) {
                        iM55979 = C0946.m55979("᩺᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * 17011) ^ 43971460;
                        i5 = 1910789990;
                    } else {
                        iM55979 = (C0873.m55680("ۨ֡") + i2) * 89;
                        i4 = ((iM55979 ^ i3) * 7643) ^ (-1134758071);
                        i5 = -987092368;
                    }
                    break;
                case -539884195:
                case 1193471657:
                    return null;
                case -440375201:
                case 1593054682:
                    if (C1964.m56597() != 0) {
                        iM55979 = C0946.m55979("᩺᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * 17011) ^ 43971460;
                        i5 = 1910789990;
                    } else {
                        iM55979 = (C0873.m55680("᩷ۛ") ^ i3) * (-109);
                        i4 = ((iM55979 ^ i2) * 29835) ^ 939719448;
                        i5 = 1657357640;
                    }
                    break;
                case -439395454:
                case 1958719143:
                    return (PluginPreference) clsM18729.newInstance();
                case -179039654:
                case -43895621:
                    if (C0890.f81849 != 0) {
                        iM55979 = C0946.m55979("᩺᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * 17011) ^ 43971460;
                        i5 = 1910789990;
                    } else {
                        iM55979 = C0946.m55979("֨֨") ^ i3;
                        i4 = ((iM55979 ^ i2) * 13469) ^ (-437351348);
                        i5 = 1131042062;
                    }
                    break;
                case -138378928:
                case 647864675:
                    if (C0946.f81894 != 0) {
                        iM55979 = C0946.m55979("ܰۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 30439) ^ 881433029;
                        i5 = -1434008103;
                    } else {
                        iM55979 = (C0946.m55979("᩸ܺ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM55979 ^ i2) * (-17991)) ^ (-1170020980);
                        i5 = 94214211;
                    }
                    break;
                case -37897299:
                case 712209905:
                    C1071.m56343();
                    C0906.m55809();
                    iM55979 = C0946.m55979("᩺᩶") ^ i2;
                    i4 = ((iM55979 ^ i3) * 17011) ^ 43971460;
                    i5 = 1910789990;
                    break;
                case 137893024:
                case 1239021134:
                    if (AbstractC0942.m55971()) {
                        iM55979 = (C0873.m55680("ܰۛ") + i2) * 49;
                        i4 = ((iM55979 ^ i3) * (-32655)) ^ 1059977358;
                        i5 = -1804720599;
                    } else {
                        iM55979 = C0873.m55680("᩹ᩳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-27027)) ^ 956037610;
                        i5 = 1198793684;
                    }
                    break;
                case 811195498:
                case 1088304335:
                    if (str == null) {
                        iM55979 = (i2 - C0873.m55680("֫ۛ")) * 53;
                        i4 = ((iM55979 ^ i3) * (-951)) ^ (-1860666519);
                        i5 = 1329828590;
                    } else {
                        str2 = str;
                        iM55979 = (i3 - C0873.m55680("ᩳ᩻")) * (-101);
                        i4 = ((iM55979 ^ i2) * 16647) ^ (-1912864552);
                        i5 = -621443156;
                    }
                    break;
                case 996540255:
                case 1057472343:
                    C0845.m55584();
                    if (!C0882.f81846) {
                        iM55979 = (C0946.m55979("ܳ᩹") + i2) * 99;
                        i4 = ((iM55979 ^ i3) * 5397) ^ 373404407;
                        i5 = 1759740332;
                    } else {
                        iM55979 = (C0873.m55680("ܰۛ") + i2) * 49;
                        i4 = ((iM55979 ^ i3) * (-32655)) ^ 1059977358;
                        i5 = -1804720599;
                    }
                    break;
                default:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (C0873.m55680("ܰۛ") + i2) * 49;
                        i4 = ((iM55979 ^ i3) * (-32655)) ^ 1059977358;
                        i5 = -1804720599;
                    } else {
                        iM55979 = C0873.m55680("ᩳܽ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 19329) ^ 1415631528;
                        i5 = 1058923357;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m41558() {
        return C0854.m55598(21, this.f54497);
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m41539() {
        return this.f54498;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final int m41555() {
        return this.f54492;
    }

    /* JADX INFO: renamed from: ۖ */
    public final String m41531() {
        return this.f54481;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final int m41556() {
        return this.f54502;
    }

    /* JADX INFO: renamed from: ֡ */
    public final String m41522() {
        return this.f54499;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x02a1  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x016a, code lost:
    
        if (p067l.C0946.f81894 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0172, code lost:
    
        if (p067l.C0955.f81898 == false) goto L14;
     */
    /* JADX INFO: renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m41550() {
        int iM55979;
        int i;
        int i2;
        String str;
        String str2;
        int i3;
        int i4;
        String str3;
        String str4;
        String str5;
        StringBuilder sb;
        String str6;
        int iM55680;
        int i5;
        int i6;
        int i7;
        StringBuilder sb2;
        int iM55681;
        int i8;
        int i9;
        int i10;
        int i11;
        String str7;
        String strM55717;
        short[] sArr;
        StringBuilder sb3;
        int i12;
        int i13;
        int i14;
        String str8;
        int i15;
        int i16;
        String str9;
        String str10;
        int i17;
        int i18;
        StringBuilder sb4;
        String str11;
        String str12;
        String str13;
        String str14;
        int iM559710;
        String str15;
        int i19;
        int iM559711;
        int i20;
        int i21;
        int i22;
        int iM559712;
        int i23;
        int i24;
        String str16;
        int i25;
        int i26;
        int i27;
        String str17;
        int iM55682;
        int i28;
        StringBuilder sb5;
        int i29 = C0894.f81854;
        int i30 = C1028.f81950;
        int iM55683 = C0873.m55680("ܿ֡") ^ i30;
        int i31 = ((iM55683 ^ i29) * (-32403)) ^ 1022741260;
        C19561 c19561M41521 = null;
        C21862 c21862M28714 = null;
        String strGroup = null;
        String strM49307 = null;
        String strM55622 = null;
        String strM56135 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i32 = iM55683 ^ (-2131461135);
        int i33 = 0;
        String str18 = null;
        int i34 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = -719128237;
        int i41 = 0;
        StringBuilder sb6 = null;
        String str19 = null;
        String str20 = null;
        Matcher matcher = null;
        Iterator itM56090 = null;
        String str21 = null;
        Iterator itM56561 = null;
        Pattern pattern = null;
        String str22 = null;
        String strM41548 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (true) {
            i40 = i32 ^ (i31 & (((i40 ^ i29) * 4873) >> 31));
            switch (i40) {
                case -2126158643:
                case -952564490:
                    str9 = str21;
                    str13 = str18;
                    str14 = str19;
                    str10 = str20;
                    i17 = i38;
                    i18 = i39;
                    sb4 = sb6;
                    str11 = strM49307;
                    str12 = strM55622;
                    if (C0927.m55870(str13, 0) != '{') {
                        i34 = 0;
                        iM559710 = (i30 - C0946.m55979("ۗ֡")) * 65;
                        str15 = str13;
                        i31 = ((iM559710 ^ i29) * (-4291)) ^ (-211188474);
                        i19 = 2112214833;
                        strM49307 = str11;
                        i39 = i18;
                        int i42 = i17;
                        str19 = str14;
                        str21 = str9;
                        i32 = iM559710 ^ i19;
                        strM55622 = str12;
                        sb6 = sb4;
                        str20 = str10;
                        str18 = str15;
                        i38 = i42;
                    } else {
                        int iM559713 = (i29 - C0946.m55979("᩵ۚ")) * 91;
                        i20 = ((iM559713 ^ i30) * 25653) ^ (-1663798744);
                        i22 = iM559713 ^ 1813385390;
                        i38 = i17;
                        i34 = 0;
                        str19 = str14;
                        str21 = str9;
                        i32 = i22;
                        strM49307 = str11;
                        i39 = i18;
                        String str23 = str10;
                        str18 = str13;
                        i31 = i20;
                        strM55622 = str12;
                        sb6 = sb4;
                        str20 = str23;
                    }
                    break;
                case -2097683609:
                case 2089481919:
                    c21862M28714 = ((C12474) m41540()).m28714(strM41548);
                    itM56090 = C0989.m56090(arrayList);
                    iM55979 = (C0873.m55680("᩻ܽ") ^ i29) * 65;
                    i = ((iM55979 ^ i30) * (-20139)) ^ 81278250;
                    i2 = 361908849;
                    i32 = iM55979 ^ i2;
                    i31 = i;
                    break;
                case -2081942113:
                case 418979361:
                    str9 = str21;
                    str10 = str20;
                    i17 = i38;
                    i18 = i39;
                    sb4 = sb6;
                    str11 = strM49307;
                    str12 = strM55622;
                    str13 = this.f54495;
                    str14 = "";
                    if (str13 != null) {
                        iM559710 = (i29 - C0946.m55979("ۨ֫")) * (-107);
                        str15 = str13;
                        i31 = ((iM559710 ^ i30) * (-9089)) ^ (-1343535288);
                        i19 = 2086561840;
                    } else {
                        iM559710 = (i30 - C0946.m55979("ۗ֡")) * 65;
                        str15 = str13;
                        i31 = ((iM559710 ^ i29) * (-4291)) ^ (-211188474);
                        i19 = 2112214833;
                    }
                    strM49307 = str11;
                    i39 = i18;
                    int i43 = i17;
                    str19 = str14;
                    str21 = str9;
                    i32 = iM559710 ^ i19;
                    strM55622 = str12;
                    sb6 = sb4;
                    str20 = str10;
                    str18 = str15;
                    i38 = i43;
                    break;
                case -2069926501:
                case 1998320916:
                    str = str21;
                    i4 = i39;
                    sb2 = sb6;
                    str3 = strM49307;
                    C0912.m55825(sb2, strM41548);
                    sArr3 = f82265;
                    i41 = 884;
                    if (C1003.f81929 > 0) {
                        int iM559714 = (C0946.m55979("᩸ۚ") ^ i29) * (-127);
                        i8 = ((iM559714 ^ i30) * (-18221)) ^ (-1804335485);
                        i10 = iM559714 ^ (-1151187121);
                        sb6 = sb2;
                        i31 = i8;
                        strM49307 = str3;
                        i39 = i4;
                        str8 = str;
                        i32 = i10;
                        str21 = str8;
                    } else {
                        str6 = strM55622;
                        str2 = str19;
                        i3 = i38;
                        str4 = str18;
                        str5 = str20;
                        sb = sb2;
                        iM55680 = C0946.m55979("ۨᩴ") ^ i29;
                        i5 = ((iM55680 ^ i30) * 11771) ^ (-716945805);
                        i6 = -1266543817;
                        i11 = iM55680 ^ i6;
                        strM49307 = str3;
                        i39 = i4;
                        str8 = str;
                        i32 = i11;
                        i31 = i5;
                        strM55622 = str6;
                        sb6 = sb;
                        str20 = str5;
                        str18 = str4;
                        i38 = i3;
                        str19 = str2;
                        str21 = str8;
                    }
                    break;
                case -1999369601:
                case 1704660713:
                    C1053.m56327();
                    if (C0894.m55769() < 0) {
                        str = str21;
                        i4 = i39;
                        str3 = strM49307;
                        i7 = i41;
                        int iM55684 = C0873.m55680("۬ۨ") ^ i30;
                        i13 = ((iM55684 ^ i29) * 8743) ^ 2024234463;
                        i14 = iM55684 ^ (-1807551442);
                        i41 = i7;
                        strM49307 = str3;
                        sb6 = null;
                        i39 = i4;
                        str8 = str;
                        i32 = i14;
                        i31 = i13;
                        str21 = str8;
                    }
                    str = str21;
                    str6 = strM55622;
                    i4 = i39;
                    str3 = strM49307;
                    int iM55685 = (C0873.m55680("ܶ۟") ^ i30) * (-23);
                    i13 = ((iM55685 ^ i29) * 12401) ^ 430042919;
                    i14 = iM55685 ^ 1591452921;
                    strM49307 = str3;
                    strM55622 = str6;
                    sb6 = null;
                    i39 = i4;
                    str8 = str;
                    i32 = i14;
                    i31 = i13;
                    str21 = str8;
                    break;
                case -1892124273:
                case -432837142:
                    RunnableC1014.m56177();
                    if (C0937.f81884) {
                        str = str21;
                        str2 = str19;
                        i3 = i38;
                        i4 = i39;
                        str3 = strM49307;
                        str4 = str18;
                        str5 = str20;
                        sb = sb6;
                        str6 = strM55622;
                        iM55680 = (C0946.m55979("᩹ۤ") ^ i29) * (-83);
                        i5 = ((iM55680 ^ i30) * (-11153)) ^ (-23048261);
                        i6 = -1141531801;
                        i11 = iM55680 ^ i6;
                        strM49307 = str3;
                        i39 = i4;
                        str8 = str;
                        i32 = i11;
                        i31 = i5;
                        strM55622 = str6;
                        sb6 = sb;
                        str20 = str5;
                        str18 = str4;
                        i38 = i3;
                        str19 = str2;
                        str21 = str8;
                    }
                    str = str21;
                    str6 = strM55622;
                    i4 = i39;
                    str3 = strM49307;
                    int iM55686 = (C0873.m55680("ܶ۟") ^ i30) * (-23);
                    i13 = ((iM55686 ^ i29) * 12401) ^ 430042919;
                    i14 = iM55686 ^ 1591452921;
                    strM49307 = str3;
                    strM55622 = str6;
                    sb6 = null;
                    i39 = i4;
                    str8 = str;
                    i32 = i14;
                    i31 = i13;
                    str21 = str8;
                    break;
                case -1796604630:
                case 1199319053:
                    str16 = str20;
                    i25 = i34;
                    i26 = i38;
                    strM41548 = m41548();
                    strM56135 = str16;
                    int iM55687 = C0873.m55680("۬ۧ") ^ i29;
                    i31 = ((iM55687 ^ i30) * (-11945)) ^ (-481237597);
                    i38 = i26;
                    strM55622 = strM55622;
                    sb6 = sb6;
                    str20 = str16;
                    str21 = str21;
                    i32 = iM55687 ^ 633303065;
                    i34 = i25;
                    strM49307 = strM49307;
                    i39 = i39;
                    break;
                case -1720455263:
                case 972744402:
                    RunnableC1014.m56177();
                    if (C1071.f81975 > 0) {
                        str = str21;
                        str6 = strM55622;
                        i4 = i39;
                        str3 = strM49307;
                        int iM55688 = (C0873.m55680("ܶ۟") ^ i30) * (-23);
                        i13 = ((iM55688 ^ i29) * 12401) ^ 430042919;
                        i14 = iM55688 ^ 1591452921;
                        strM49307 = str3;
                        strM55622 = str6;
                        sb6 = null;
                        i39 = i4;
                        str8 = str;
                        i32 = i14;
                        i31 = i13;
                        str21 = str8;
                    } else {
                        iM55979 = C0873.m55680("ܺ֡") ^ i29;
                        i = ((iM55979 ^ i30) * (-31131)) ^ (-2075385732);
                        i2 = -1962721501;
                        i32 = iM55979 ^ i2;
                        i31 = i;
                    }
                    break;
                case -1694562339:
                case -670594729:
                    break;
                case -1666517611:
                case 668212359:
                    C0861.m55626();
                    iM55979 = C0873.m55680("ܺ֡") ^ i29;
                    i = ((iM55979 ^ i30) * (-31131)) ^ (-2075385732);
                    i2 = -1962721501;
                    i32 = iM55979 ^ i2;
                    i31 = i;
                    break;
                case -1655625871:
                case -586447369:
                    str21 = (String) RunnableC0897.m55785(itM56090);
                    strM49307 = c21862M28714.m49307(strM56135, str21);
                    if (strM49307 != null) {
                        iM55979 = C0946.m55979("ܽۖ") ^ i30;
                        i = ((iM55979 ^ i29) * (-15445)) ^ (-833458309);
                        i2 = 1443498610;
                    } else {
                        iM55979 = (C0873.m55680("᩻ܽ") ^ i29) * 65;
                        i = ((iM55979 ^ i30) * (-20139)) ^ 81278250;
                        i2 = 361908849;
                    }
                    i32 = iM55979 ^ i2;
                    i31 = i;
                    break;
                case -1552941138:
                case 2006788835:
                    str9 = str21;
                    str13 = str18;
                    str14 = str19;
                    str10 = str20;
                    i17 = i38;
                    i18 = i39;
                    sb4 = sb6;
                    str11 = strM49307;
                    str12 = strM55622;
                    if (C0882.m55719(str13) < 3) {
                        iM559710 = (i30 - C0946.m55979("ۗ֡")) * 65;
                        str15 = str13;
                        i31 = ((iM559710 ^ i29) * (-4291)) ^ (-211188474);
                        i19 = 2112214833;
                        strM49307 = str11;
                        i39 = i18;
                        int i44 = i17;
                        str19 = str14;
                        str21 = str9;
                        i32 = iM559710 ^ i19;
                        strM55622 = str12;
                        sb6 = sb4;
                        str20 = str10;
                        str18 = str15;
                        i38 = i44;
                    } else {
                        iM559711 = (C0946.m55979("ۢ᩻") ^ i30) * (-61);
                        i20 = ((iM559711 ^ i29) * 15249) ^ (-1851826410);
                        i21 = -10075527;
                        i22 = iM559711 ^ i21;
                        i38 = i17;
                        str19 = str14;
                        str21 = str9;
                        i32 = i22;
                        strM49307 = str11;
                        i39 = i18;
                        String str24 = str10;
                        str18 = str13;
                        i31 = i20;
                        strM55622 = str12;
                        sb6 = sb4;
                        str20 = str24;
                    }
                    break;
                case -1537739613:
                case -177064994:
                    strM55622 = C0861.m55622(strGroup, i33);
                    iM55979 = (C0946.m55979("᩷᩷") + i29) * (-27);
                    i = ((iM55979 ^ i30) * (-3149)) ^ 1699128995;
                    i2 = 2096793481;
                    i32 = iM55979 ^ i2;
                    i31 = i;
                    break;
                case -1488781516:
                case -113084063:
                    if (C0992.m56108(arrayList)) {
                        iM55979 = (C0873.m55680("۫ۖ") + i29) * (-111);
                        i = ((iM55979 ^ i30) * (-26773)) ^ (-523999502);
                        i2 = -560859357;
                    } else {
                        iM55979 = (C0946.m55979("֡ۘ") ^ i30) * (-23);
                        i = ((iM55979 ^ i29) * 9763) ^ 2094110073;
                        i2 = -1092566083;
                    }
                    i32 = iM55979 ^ i2;
                    i31 = i;
                    break;
                case -1471675818:
                case -103037318:
                    if (C0866.m55647(itM56090)) {
                        iM55979 = (C0873.m55680("᩶ۖ") ^ i30) * 15;
                        i = ((iM55979 ^ i29) * 16175) ^ 1686554872;
                        i2 = -1684148230;
                    } else {
                        iM55979 = (C0873.m55680("۫ۖ") + i29) * (-111);
                        i = ((iM55979 ^ i30) * (-26773)) ^ (-523999502);
                        i2 = -560859357;
                    }
                    i32 = iM55979 ^ i2;
                    i31 = i;
                    break;
                case -1446217853:
                case -1076835717:
                    i15 = 62446;
                    int iM559715 = (i29 - C0946.m55979("ۖܺ")) * 29;
                    i31 = ((iM559715 ^ i30) * (-18203)) ^ 999028794;
                    i16 = iM559715 ^ 512153584;
                    strM49307 = strM49307;
                    i39 = i15;
                    strM55622 = strM55622;
                    sb6 = sb6;
                    str20 = str20;
                    str18 = str18;
                    i38 = i38;
                    str19 = str19;
                    str21 = str21;
                    i32 = i16;
                    break;
                case -1393233425:
                case -718953307:
                    str = str21;
                    i4 = i39;
                    str3 = strM49307;
                    i7 = i41;
                    short[] sArr4 = f82265;
                    if (C0989.m56095() <= 0) {
                        int iM55689 = C0873.m55680("۬ۨ") ^ i30;
                        i13 = ((iM55689 ^ i29) * 8743) ^ 2024234463;
                        i14 = iM55689 ^ (-1807551442);
                        i41 = i7;
                        strM49307 = str3;
                    } else {
                        i41 = i7;
                        str6 = strM55622;
                        String strM55707 = C0877.m55707(sArr4, 877, 7, i4);
                        if (C0892.f81851) {
                            sb2 = new StringBuilder(strM55707);
                            if (AbstractC0942.f81890 <= 0) {
                                iM55681 = (C0873.m55680("᩶ۤ") + i29) * (-117);
                                i8 = ((iM55681 ^ i30) * 30301) ^ 2113723359;
                                i9 = 294462495;
                            } else {
                                iM55681 = C0873.m55680("᩷ܶ") ^ i29;
                                i8 = ((iM55681 ^ i30) * 27173) ^ (-1596295632);
                                i9 = -94319646;
                            }
                            i10 = iM55681 ^ i9;
                            strM55622 = str6;
                            sb6 = sb2;
                            i31 = i8;
                            strM49307 = str3;
                            i39 = i4;
                            str8 = str;
                            i32 = i10;
                            str21 = str8;
                        }
                        int iM556810 = (C0873.m55680("ܶ۟") ^ i30) * (-23);
                        i13 = ((iM556810 ^ i29) * 12401) ^ 430042919;
                        i14 = iM556810 ^ 1591452921;
                        strM49307 = str3;
                        strM55622 = str6;
                    }
                    sb6 = null;
                    i39 = i4;
                    str8 = str;
                    i32 = i14;
                    i31 = i13;
                    str21 = str8;
                    break;
                case -1341628555:
                case 488877567:
                    return Collections.singletonList(new C4168(str19, str18));
                case -1317734985:
                case 613802274:
                    str9 = str21;
                    str13 = str18;
                    str14 = str19;
                    str10 = str20;
                    i17 = i38;
                    i18 = i39;
                    sb4 = sb6;
                    str11 = strM49307;
                    str12 = strM55622;
                    i33 = 1;
                    if (C0892.m55748(1, str13) == '}') {
                        iM559711 = C0946.m55979("ۢܳ") ^ i30;
                        i20 = ((iM559711 ^ i29) * 5287) ^ 268673963;
                        i21 = -1831330773;
                        i22 = iM559711 ^ i21;
                        i38 = i17;
                        str19 = str14;
                        str21 = str9;
                        i32 = i22;
                        strM49307 = str11;
                        i39 = i18;
                        String str25 = str10;
                        str18 = str13;
                        i31 = i20;
                        strM55622 = str12;
                        sb6 = sb4;
                        str20 = str25;
                    } else {
                        iM559710 = (i30 - C0946.m55979("ۗ֡")) * 65;
                        str15 = str13;
                        i31 = ((iM559710 ^ i29) * (-4291)) ^ (-211188474);
                        i19 = 2112214833;
                        strM49307 = str11;
                        i39 = i18;
                        int i45 = i17;
                        str19 = str14;
                        str21 = str9;
                        i32 = iM559710 ^ i19;
                        strM55622 = str12;
                        sb6 = sb4;
                        str20 = str10;
                        str18 = str15;
                        i38 = i45;
                    }
                    break;
                case -1313225185:
                case -201226145:
                    str9 = str21;
                    str13 = str18;
                    str14 = str19;
                    str10 = str20;
                    i18 = i39;
                    sb4 = sb6;
                    str11 = strM49307;
                    str12 = strM55622;
                    int i46 = i34;
                    int i47 = i38;
                    c19561M41521 = m41521();
                    if (c19561M41521 == null) {
                        int iM559716 = C0946.m55979("ۛ᩵") ^ i30;
                        i34 = i46;
                        int i48 = ((iM559716 ^ i29) * (-4847)) ^ 196209244;
                        int i49 = iM559716 ^ (-690882198);
                        i38 = i47;
                        strM55622 = str12;
                        sb6 = sb4;
                        str20 = str10;
                        str18 = str13;
                        i31 = i48;
                        strM49307 = str11;
                        i39 = i18;
                        str19 = str14;
                        str21 = str9;
                        i32 = i49;
                    } else {
                        i34 = i46;
                        iM559711 = C0873.m55680("ᩳᩳ") ^ i29;
                        i17 = i47;
                        i20 = ((iM559711 ^ i30) * (-15507)) ^ (-1807992433);
                        i21 = -551475084;
                        i22 = iM559711 ^ i21;
                        i38 = i17;
                        str19 = str14;
                        str21 = str9;
                        i32 = i22;
                        strM49307 = str11;
                        i39 = i18;
                        String str26 = str10;
                        str18 = str13;
                        i31 = i20;
                        strM55622 = str12;
                        sb6 = sb4;
                        str20 = str26;
                    }
                    break;
                case -1283724909:
                case 16872379:
                    str16 = str20;
                    i25 = i34;
                    i26 = i38;
                    strM41548 = C1404.m56454(str16, i25, i26);
                    strM56135 = C1012.m56135(str16, i26 + i33);
                    int iM556811 = C0873.m55680("۬ۧ") ^ i29;
                    i31 = ((iM556811 ^ i30) * (-11945)) ^ (-481237597);
                    i38 = i26;
                    strM55622 = strM55622;
                    sb6 = sb6;
                    str20 = str16;
                    str21 = str21;
                    i32 = iM556811 ^ 633303065;
                    i34 = i25;
                    strM49307 = strM49307;
                    i39 = i39;
                    break;
                case -1194202986:
                case -974275414:
                    C1124.m56367();
                    break;
                case -985470228:
                case -433203882:
                    str = str21;
                    str2 = str19;
                    i3 = i38;
                    i4 = i39;
                    str3 = strM49307;
                    str4 = str18;
                    str5 = str20;
                    sb = sb6;
                    str6 = strM55622;
                    sArr2 = f82265;
                    c = 876;
                    if (C0917.f81868) {
                        iM55680 = C0946.m55979("ۨᩴ") ^ i29;
                        i5 = ((iM55680 ^ i30) * 11771) ^ (-716945805);
                        i6 = -1266543817;
                    } else {
                        iM55680 = (i30 - C0873.m55680("᩸۫")) * (-61);
                        i5 = ((iM55680 ^ i29) * 19133) ^ (-102558068);
                        i6 = -1512859914;
                    }
                    i11 = iM55680 ^ i6;
                    strM49307 = str3;
                    i39 = i4;
                    str8 = str;
                    i32 = i11;
                    i31 = i5;
                    strM55622 = str6;
                    sb6 = sb;
                    str20 = str5;
                    str18 = str4;
                    i38 = i3;
                    str19 = str2;
                    str21 = str8;
                    break;
                case -970214281:
                case -884090566:
                    if (C0866.m55647(itM56561)) {
                        iM55979 = (C0873.m55680("ۗۤ") + i30) * 97;
                        i = ((iM55979 ^ i29) * (-12569)) ^ 2012722727;
                        i2 = 756637508;
                    } else {
                        iM55979 = (C0873.m55680("ۖܿ") ^ i29) * (-5);
                        i = ((iM55979 ^ i30) * (-5131)) ^ (-583664580);
                        i2 = -975056479;
                    }
                    i32 = iM55979 ^ i2;
                    i31 = i;
                    break;
                case -857757946:
                case 1628564170:
                    return Collections.singletonList(new C4168(str19, str18));
                case -790574856:
                case -224697929:
                    ServiceConnectionC1013.m56157();
                    if (C1028.m56247() < 0) {
                        str7 = str21;
                        strM55717 = str22;
                        i39 = i39;
                        sArr = sArr3;
                        sb3 = sb6;
                        strM49307 = strM49307;
                        i12 = i41;
                        iM55682 = (C0873.m55680("ۘۢ") + i30) * 77;
                        str17 = strM55717;
                        i28 = ((iM55682 ^ i29) * (-22621)) ^ 1616523373;
                        i27 = -2130025590;
                        int i50 = iM55682 ^ i27;
                        sb6 = sb3;
                        i31 = i28;
                        str21 = str7;
                        i32 = i50;
                        sArr3 = sArr;
                        str22 = str17;
                        i41 = i12;
                        strM49307 = strM49307;
                        i39 = i39;
                    } else {
                        str = str21;
                        str2 = str19;
                        i3 = i38;
                        i4 = i39;
                        str3 = strM49307;
                        str4 = str18;
                        str5 = str20;
                        sb = sb6;
                        str6 = strM55622;
                        iM55680 = C0946.m55979("ۨᩴ") ^ i29;
                        i5 = ((iM55680 ^ i30) * 11771) ^ (-716945805);
                        i6 = -1266543817;
                        i11 = iM55680 ^ i6;
                        strM49307 = str3;
                        i39 = i4;
                        str8 = str;
                        i32 = i11;
                        i31 = i5;
                        strM55622 = str6;
                        sb6 = sb;
                        str20 = str5;
                        str18 = str4;
                        i38 = i3;
                        str19 = str2;
                        str21 = str8;
                    }
                    break;
                case -708915754:
                case 324691596:
                    matcher = pattern.matcher(C1028.m56241((C5738) RunnableC0897.m55785(itM56561)));
                    if (!matcher.matches()) {
                        sb5 = sb6;
                        int iM556812 = C0873.m55680("ۙ۠") ^ i30;
                        str21 = str21;
                        int i51 = ((iM556812 ^ i29) * 4035) ^ (-24140788);
                        i16 = iM556812 ^ (-1594742859);
                        sb6 = sb5;
                        i31 = i51;
                        str21 = str21;
                        i32 = i16;
                    } else {
                        iM55979 = C0946.m55979("۠᩷") ^ i29;
                        i = ((iM55979 ^ i30) * 9599) ^ (-775308886);
                        i2 = -160185492;
                        i32 = iM55979 ^ i2;
                        i31 = i;
                    }
                    break;
                case -617784032:
                case -527986001:
                    str = str21;
                    str2 = str19;
                    i3 = i38;
                    i4 = i39;
                    str3 = strM49307;
                    str4 = str18;
                    str5 = str20;
                    sb = sb6;
                    str6 = strM55622;
                    s = sArr2[c];
                    s2 = 28880;
                    if (C1964.f83032 <= 0) {
                        int iM559717 = C0946.m55979("ܿ۟") ^ i30;
                        i5 = ((iM559717 ^ i29) * 1387) ^ (-640148680);
                        i11 = iM559717 ^ (-1556868145);
                        strM49307 = str3;
                        arrayList2 = null;
                    } else {
                        iM55680 = C0946.m55979("ۤᩴ") ^ i29;
                        i5 = ((iM55680 ^ i30) * (-28549)) ^ 1905521836;
                        i6 = 1978027353;
                        i11 = iM55680 ^ i6;
                        strM49307 = str3;
                    }
                    i39 = i4;
                    str8 = str;
                    i32 = i11;
                    i31 = i5;
                    strM55622 = str6;
                    sb6 = sb;
                    str20 = str5;
                    str18 = str4;
                    i38 = i3;
                    str19 = str2;
                    str21 = str8;
                    break;
                case -512650209:
                case 1862572996:
                    C1194.m56393(arrayList, strM55622);
                    sb5 = sb6;
                    int iM556813 = C0873.m55680("ۙ۠") ^ i30;
                    str21 = str21;
                    int i52 = ((iM556813 ^ i29) * 4035) ^ (-24140788);
                    i16 = iM556813 ^ (-1594742859);
                    sb6 = sb5;
                    i31 = i52;
                    str21 = str21;
                    i32 = i16;
                    break;
                case -346045859:
                case 2064329106:
                    strGroup = matcher.group(i33);
                    if (strGroup == null) {
                        strM55622 = str19;
                        iM55979 = (C0946.m55979("᩷᩷") + i29) * (-27);
                        i = ((iM55979 ^ i30) * (-3149)) ^ 1699128995;
                        i2 = 2096793481;
                    } else {
                        iM55979 = C0946.m55979("ᩴܶ") ^ i30;
                        i = ((iM55979 ^ i29) * 19773) ^ 1381466731;
                        i2 = -1030912252;
                    }
                    i32 = iM55979 ^ i2;
                    i31 = i;
                    break;
                case -123815904:
                case -87255688:
                    str = str21;
                    str2 = str19;
                    i3 = i38;
                    i4 = i39;
                    str3 = strM49307;
                    str4 = str18;
                    str5 = str20;
                    sb = sb6;
                    str6 = strM55622;
                    i35 = s * s2;
                    i36 = s * s;
                    i37 = 208513600;
                    if (C0946.f81894 != 0) {
                        iM55680 = (C0946.m55979("᩹ۤ") ^ i29) * (-83);
                        i5 = ((iM55680 ^ i30) * (-11153)) ^ (-23048261);
                        i6 = -1141531801;
                    } else {
                        iM55680 = (C0873.m55680("᩷۠") ^ i30) * (-29);
                        i5 = ((iM55680 ^ i29) * 727) ^ (-933589938);
                        i6 = 753639147;
                    }
                    i11 = iM55680 ^ i6;
                    strM49307 = str3;
                    i39 = i4;
                    str8 = str;
                    i32 = i11;
                    i31 = i5;
                    strM55622 = str6;
                    sb6 = sb;
                    str20 = str5;
                    str18 = str4;
                    i38 = i3;
                    str19 = str2;
                    str21 = str8;
                    break;
                case 105498501:
                case 1193696994:
                    C1036.m56257();
                    if (!C0877.m55696()) {
                        iM55979 = C0946.m55979("ۢܿ") ^ i29;
                        i = ((iM55979 ^ i30) * 20271) ^ (-215816823);
                        i2 = 95212427;
                        i32 = iM55979 ^ i2;
                        i31 = i;
                    } else {
                        str = str21;
                        str2 = str19;
                        i3 = i38;
                        i4 = i39;
                        str3 = strM49307;
                        str4 = str18;
                        str5 = str20;
                        sb = sb6;
                        str6 = strM55622;
                        int iM559718 = C0946.m55979("ܿ۟") ^ i30;
                        i5 = ((iM559718 ^ i29) * 1387) ^ (-640148680);
                        i11 = iM559718 ^ (-1556868145);
                        strM49307 = str3;
                        arrayList2 = null;
                        i39 = i4;
                        str8 = str;
                        i32 = i11;
                        i31 = i5;
                        strM55622 = str6;
                        sb6 = sb;
                        str20 = str5;
                        str18 = str4;
                        i38 = i3;
                        str19 = str2;
                        str21 = str8;
                    }
                    break;
                case 108781549:
                case 1855268198:
                    C1124.m56367();
                    C0894.m55769();
                    return null;
                case 276248106:
                case 1974172527:
                    str = str21;
                    str2 = str19;
                    i3 = i38;
                    i4 = i39;
                    str3 = strM49307;
                    str4 = str18;
                    str5 = str20;
                    sb = sb6;
                    str6 = strM55622;
                    if ((i36 + i37) - i35 < 0) {
                        iM55680 = (C0946.m55979("᩸᩻") ^ i30) * (-39);
                        i5 = ((iM55680 ^ i29) * 28249) ^ (-1383103556);
                        i6 = 170130332;
                    } else {
                        iM55680 = (C0946.m55979("ܶۙ") ^ i29) * 123;
                        i5 = ((iM55680 ^ i30) * (-25579)) ^ 1363305855;
                        i6 = 1187372981;
                    }
                    i11 = iM55680 ^ i6;
                    strM49307 = str3;
                    i39 = i4;
                    str8 = str;
                    i32 = i11;
                    i31 = i5;
                    strM55622 = str6;
                    sb6 = sb;
                    str20 = str5;
                    str18 = str4;
                    i38 = i3;
                    str19 = str2;
                    str21 = str8;
                    break;
                case 567160626:
                case 819176878:
                    C1194.m56393(arrayList2, new C4168(str21, strM49307));
                    iM55979 = (C0873.m55680("᩻ܽ") ^ i29) * 65;
                    i = ((iM55979 ^ i30) * (-20139)) ^ 81278250;
                    i2 = 361908849;
                    i32 = iM55979 ^ i2;
                    i31 = i;
                    break;
                case 655803373:
                case 1958641604:
                    str7 = str21;
                    sb3 = sb6;
                    i39 = i39;
                    sArr = sArr3;
                    strM49307 = strM49307;
                    i12 = i41;
                    strM55717 = C0882.m55717(sArr, i12, 33, i39);
                    if (C1048.m56305() >= 0) {
                        iM55682 = (C0873.m55680("ۘۢ") + i30) * 77;
                        str17 = strM55717;
                        i28 = ((iM55682 ^ i29) * (-22621)) ^ 1616523373;
                        i27 = -2130025590;
                    } else {
                        iM55682 = C0873.m55680("۠֡") ^ i30;
                        str17 = strM55717;
                        i28 = ((iM55682 ^ i29) * 9341) ^ (-391282798);
                        i27 = 154553641;
                    }
                    int i53 = iM55682 ^ i27;
                    sb6 = sb3;
                    i31 = i28;
                    str21 = str7;
                    i32 = i53;
                    sArr3 = sArr;
                    str22 = str17;
                    i41 = i12;
                    strM49307 = strM49307;
                    i39 = i39;
                    break;
                case 837997886:
                case 1979991255:
                    Collections.sort(arrayList2);
                    return arrayList2;
                case 1081021446:
                case 1877991181:
                    sb5 = sb6;
                    C0912.m55825(sb5, str22);
                    Pattern patternCompile = Pattern.compile(C0845.m55591(sb5));
                    itM56561 = C1929.m56561(C1229.m56411(c19561M41521));
                    pattern = patternCompile;
                    int iM556814 = C0873.m55680("ۙ۠") ^ i30;
                    str21 = str21;
                    int i54 = ((iM556814 ^ i29) * 4035) ^ (-24140788);
                    i16 = iM556814 ^ (-1594742859);
                    sb6 = sb5;
                    i31 = i54;
                    str21 = str21;
                    i32 = i16;
                    break;
                case 1381655421:
                case 2137666958:
                    String str27 = str21;
                    int i55 = i39;
                    StringBuilder sb7 = sb6;
                    String str28 = strM49307;
                    String str29 = strM55622;
                    String str30 = str19;
                    int i56 = i34;
                    String strM38720 = C17073.m38720(i33, i33, str18);
                    int iM56097 = C0989.m56097(strM38720, 58);
                    if (iM56097 != -1) {
                        iM559712 = (C0873.m55680("ܶ۬") + i30) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i23 = ((iM559712 ^ i29) * 9145) ^ 2021152532;
                        i24 = -1717830706;
                    } else {
                        iM559712 = C0946.m55979("ۙۙ") ^ i29;
                        i23 = ((iM559712 ^ i30) * 20967) ^ 1827582995;
                        i24 = -905644476;
                    }
                    int i57 = iM559712 ^ i24;
                    i38 = iM56097;
                    i34 = i56;
                    strM49307 = str28;
                    i39 = i55;
                    i32 = i57;
                    i31 = i23;
                    str21 = str27;
                    str19 = str30;
                    strM55622 = str29;
                    sb6 = sb7;
                    str20 = strM38720;
                    break;
                case 1411683473:
                case 1592471658:
                    i15 = 52541;
                    int iM559719 = (i29 - C0946.m55979("ۖܺ")) * 29;
                    i31 = ((iM559719 ^ i30) * (-18203)) ^ 999028794;
                    i16 = iM559719 ^ 512153584;
                    strM49307 = strM49307;
                    i39 = i15;
                    strM55622 = strM55622;
                    sb6 = sb6;
                    str20 = str20;
                    str18 = str18;
                    i38 = i38;
                    str19 = str19;
                    str21 = str21;
                    i32 = i16;
                    break;
                case 1646658522:
                case 1855368553:
                    if (C1024.m56209() < 0) {
                        str = str21;
                        i4 = i39;
                        sb2 = sb6;
                        str3 = strM49307;
                        str6 = strM55622;
                        iM55681 = C0873.m55680("᩻ۚ") ^ i29;
                        i8 = ((iM55681 ^ i30) * 1315) ^ 177091484;
                        i9 = 37963609;
                        i10 = iM55681 ^ i9;
                        strM55622 = str6;
                        sb6 = sb2;
                        i31 = i8;
                        strM49307 = str3;
                        i39 = i4;
                        str8 = str;
                        i32 = i10;
                        str21 = str8;
                    }
                    str = str21;
                    str2 = str19;
                    i3 = i38;
                    i4 = i39;
                    str3 = strM49307;
                    str4 = str18;
                    str5 = str20;
                    sb = sb6;
                    str6 = strM55622;
                    iM55680 = C0946.m55979("ۨᩴ") ^ i29;
                    i5 = ((iM55680 ^ i30) * 11771) ^ (-716945805);
                    i6 = -1266543817;
                    i11 = iM55680 ^ i6;
                    strM49307 = str3;
                    i39 = i4;
                    str8 = str;
                    i32 = i11;
                    i31 = i5;
                    strM55622 = str6;
                    sb6 = sb;
                    str20 = str5;
                    str18 = str4;
                    i38 = i3;
                    str19 = str2;
                    str21 = str8;
                    break;
                default:
                    str = str21;
                    i4 = i39;
                    sb2 = sb6;
                    str3 = strM49307;
                    str6 = strM55622;
                    arrayList = new ArrayList();
                    if (C1046.m56302() == 0) {
                        arrayList2 = new ArrayList();
                        if (RunnableC0938.m55938() != 0) {
                            iM55681 = C0873.m55680("᩻ۚ") ^ i29;
                            i8 = ((iM55681 ^ i30) * 1315) ^ 177091484;
                            i9 = 37963609;
                        } else {
                            iM55681 = C0946.m55979("ᩴ۟") ^ i30;
                            i8 = ((iM55681 ^ i29) * 27059) ^ 474212687;
                            i9 = -1275078997;
                        }
                        i10 = iM55681 ^ i9;
                        strM55622 = str6;
                        sb6 = sb2;
                        i31 = i8;
                        strM49307 = str3;
                        i39 = i4;
                        str8 = str;
                        i32 = i10;
                        str21 = str8;
                    } else {
                        str2 = str19;
                        i3 = i38;
                        str4 = str18;
                        str5 = str20;
                        sb = sb2;
                        int iM5597110 = C0946.m55979("ܿ۟") ^ i30;
                        i5 = ((iM5597110 ^ i29) * 1387) ^ (-640148680);
                        i11 = iM5597110 ^ (-1556868145);
                        strM49307 = str3;
                        arrayList2 = null;
                        i39 = i4;
                        str8 = str;
                        i32 = i11;
                        i31 = i5;
                        strM55622 = str6;
                        sb6 = sb;
                        str20 = str5;
                        str18 = str4;
                        i38 = i3;
                        str19 = str2;
                        str21 = str8;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m41535() {
        ArrayList arrayList = null;
        Iterator itM56292 = null;
        C12886 c12886 = null;
        boolean z = false;
        int i = -729573779;
        int i2 = C1229.f82066;
        int i3 = RunnableC0871.f81839;
        int iM55680 = (C0873.m55680("ܽۙ") + i2) * C0254q.f1218h;
        int i4 = ((iM55680 ^ i3) * 14573) ^ (-789631203);
        int i5 = 1035169755;
        while (true) {
            int i6 = iM55680 ^ i5;
            while (true) {
                i = ((((i ^ i3) * 4457) >> 31) & i4) ^ i6;
                switch (i) {
                    case -2053382081:
                    case -648817649:
                        itM56292 = C1046.m56292(arrayList);
                        iM55680 = (C0873.m55680("ۖۜ") ^ i2) * 47;
                        i4 = ((iM55680 ^ i3) * 5501) ^ (-619954196);
                        i5 = -641678836;
                        break;
                    case -1896076194:
                    case 1512576262:
                        if (C1071.f81975 > 0) {
                            iM55680 = C0873.m55680("۠᩺") ^ i3;
                            i4 = ((iM55680 ^ i2) * (-8145)) ^ 1942059052;
                            i5 = 760105247;
                            break;
                        }
                        iM55680 = (i3 - C0873.m55680("ۨ᩵")) * (-91);
                        i4 = ((iM55680 ^ i2) * (-17267)) ^ (-853035004);
                        i5 = -1233852014;
                        break;
                    case -1846367960:
                    case 604972264:
                        if (C1003.f81929 > 0) {
                            iM55680 = C0873.m55680("۫ۢ") ^ i3;
                            i4 = ((iM55680 ^ i2) * 15619) ^ 311692813;
                            i5 = 1084815095;
                            break;
                        }
                        iM55680 = (C0873.m55680("ܳ᩶") ^ i2) * (-75);
                        i4 = ((iM55680 ^ i3) * (-30253)) ^ 454895170;
                        i5 = 670646527;
                        break;
                    case -1803584246:
                    case 151866396:
                        C1017.m56187();
                        C0989.m56095();
                        iM55680 = (i3 - C0873.m55680("ۨ᩵")) * (-91);
                        i4 = ((iM55680 ^ i2) * (-17267)) ^ (-853035004);
                        i5 = -1233852014;
                        break;
                        break;
                    case -1511412664:
                    case 591999913:
                        return false;
                    case -1263183574:
                    case 403295976:
                        if (C0946.f81894 == 0) {
                            iM55680 = (C0946.m55979("ۜ۠") ^ i2) * 15;
                            i4 = ((iM55680 ^ i3) * (-18155)) ^ (-1763715542);
                            i5 = -52206523;
                            break;
                        }
                        iM55680 = C0873.m55680("᩻᩶") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-20085)) ^ (-1120429529);
                        i5 = -1191262720;
                        break;
                    case -1153008055:
                    case -558738388:
                        arrayList = this.f54488;
                        if (RunnableC1014.f81941 > 0) {
                            iM55680 = (i3 - C0946.m55979("᩶ܽ")) * (-81);
                            i4 = ((iM55680 ^ i2) * 15675) ^ 1923010688;
                            i5 = -1455854161;
                            break;
                        }
                        iM55680 = C0873.m55680("۠ܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 20431) ^ 751122986;
                        i5 = -350494756;
                        break;
                    case -1071083822:
                    case 337000579:
                        if (c12886.m29516() != 1) {
                            z = true;
                            iM55680 = (C0873.m55680("ۖۜ") ^ i2) * 47;
                            i4 = ((iM55680 ^ i3) * 5501) ^ (-619954196);
                            i5 = -641678836;
                            break;
                        }
                        int iM55979 = (i3 - C0946.m55979("ܳۜ")) * (-71);
                        i4 = ((iM55979 ^ i2) * (-18573)) ^ 2106410182;
                        i6 = iM55979 ^ 417873681;
                        z = true;
                        break;
                        break;
                    case -512720137:
                    case 1062750802:
                        if (C0845.f81821 < 0) {
                            iM55680 = (i2 - C0946.m55979("ۡۨ")) * 119;
                            i4 = ((iM55680 ^ i3) * 3859) ^ (-1328710038);
                            i5 = -2070472094;
                            break;
                        }
                        iM55680 = C0946.m55979("ܽ۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * 12651) ^ 1885270519;
                        i5 = -987923497;
                        break;
                    case -491797854:
                    case 1404296679:
                        return z;
                    case -292464241:
                    case 269473194:
                        if (!C0861.f81831) {
                            iM55680 = (C0873.m55680("ܳ᩶") ^ i2) * (-75);
                            i4 = ((iM55680 ^ i3) * (-30253)) ^ 454895170;
                            i5 = 670646527;
                            break;
                            break;
                        }
                        iM55680 = C0946.m55979("ۛ۠") ^ i2;
                        i4 = ((iM55680 ^ i3) * 9459) ^ 2049627535;
                        i5 = -338162908;
                        break;
                    case -256268072:
                    case 1587218584:
                        c12886 = (C12886) RunnableC0897.m55785(itM56292);
                        if (C0877.f81843 < 0) {
                            iM55680 = C0873.m55680("۫᩶") ^ i2;
                            i4 = ((iM55680 ^ i3) * (-19073)) ^ (-1114316756);
                            i5 = 1910029182;
                            break;
                        }
                        iM55680 = C0873.m55680("۠ܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 20431) ^ 751122986;
                        i5 = -350494756;
                        break;
                        break;
                    case -172656776:
                    case 1883718965:
                        C0927.m55873();
                        return false;
                    case -110663221:
                    case 1616354120:
                        C0989.m56095();
                        if (C1229.f82066 < 0) {
                            iM55680 = C0873.m55680("᩻᩶") ^ i2;
                            i4 = ((iM55680 ^ i3) * (-20085)) ^ (-1120429529);
                            i5 = -1191262720;
                            break;
                            break;
                        }
                        iM55680 = (i3 - C0873.m55680("ۨ᩵")) * (-91);
                        i4 = ((iM55680 ^ i2) * (-17267)) ^ (-853035004);
                        i5 = -1233852014;
                        break;
                        break;
                    case 657619317:
                    case 1226619602:
                        if (ServiceConnectionC1013.f81940 < 0) {
                            iM55680 = C0946.m55979("᩺۬") ^ i2;
                            i4 = ((iM55680 ^ i3) * (-345)) ^ 153130491;
                            i5 = -980660352;
                            break;
                        }
                        iM55680 = C0873.m55680("᩻᩶") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-20085)) ^ (-1120429529);
                        i5 = -1191262720;
                        break;
                        break;
                    case 786166709:
                    case 1558602555:
                        if (C0967.f81910 >= 0) {
                            iM55680 = (C0873.m55680("ܳ᩶") ^ i2) * (-75);
                            i4 = ((iM55680 ^ i3) * (-30253)) ^ 454895170;
                            i5 = 670646527;
                            break;
                            break;
                        }
                        iM55680 = C0873.m55680("᩻᩶") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-20085)) ^ (-1120429529);
                        i5 = -1191262720;
                        break;
                        break;
                    case 840058754:
                    case 1933022517:
                        if (!C0892.f81851) {
                            iM55680 = C0946.m55979("ܽ۠") ^ i3;
                            i4 = ((iM55680 ^ i2) * 12651) ^ 1885270519;
                            i5 = -987923497;
                            break;
                            break;
                        }
                        iM55680 = C0873.m55680("ۡ᩻") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-3971)) ^ (-1101215059);
                        i5 = -1094096544;
                        break;
                    case 1525401286:
                    case 2080349111:
                        if (RunnableC1014.f81941 <= 0) {
                            iM55680 = C0946.m55979("ܽ۠") ^ i3;
                            i4 = ((iM55680 ^ i2) * 12651) ^ 1885270519;
                            i5 = -987923497;
                            break;
                            break;
                        }
                        iM55680 = (i3 - C0873.m55680("ۨ᩵")) * (-91);
                        i4 = ((iM55680 ^ i2) * (-17267)) ^ (-853035004);
                        i5 = -1233852014;
                        break;
                        break;
                    case 1885931832:
                    case 1954525557:
                        if (RunnableC0938.m55938() == 0) {
                            iM55680 = (i3 - C0873.m55680("ܿۗ")) * 85;
                            i4 = ((iM55680 ^ i2) * (-10681)) ^ 1901415993;
                            i5 = 810606569;
                            break;
                        }
                        iM55680 = (i3 - C0873.m55680("ۨ᩵")) * (-91);
                        i4 = ((iM55680 ^ i2) * (-17267)) ^ (-853035004);
                        i5 = -1233852014;
                        break;
                        break;
                    default:
                        if (!C0866.m55647(itM56292)) {
                            iM55680 = (C0946.m55979("᩸ۧ") + i3) * 81;
                            i4 = ((iM55680 ^ i2) * 16597) ^ (-1412306036);
                            i5 = 472389686;
                            break;
                        }
                        iM55680 = (C0946.m55979("ܺᩴ") + i2) * 73;
                        i4 = ((iM55680 ^ i3) * (-27267)) ^ (-1310073778);
                        i5 = -478894447;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m41561() {
        return this.f54483;
    }

    /* JADX INFO: renamed from: ֨ */
    public final boolean m41523() {
        return this.f54491;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final boolean m41560() {
        return this.f54501;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final boolean m41559() {
        int i = 599934842;
        int i2 = C0898.f81858;
        int i3 = C0873.f81841;
        int iM55979 = (C0946.m55979("ۨ۬") ^ i3) * (-113);
        int i4 = ((iM55979 ^ i2) * 31735) ^ (-1132261254);
        int i5 = -1698178233;
        while (true) {
            i = ((((i ^ i2) * (-101)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1939024219:
                case 1377910084:
                    ServiceConnectionC1013.m56157();
                    iM55979 = C0946.m55979("۟۫") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-29451)) ^ (-957997755);
                    i5 = -961833576;
                    break;
                case -1740717757:
                case 1011938347:
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0946.m55979("᩸ۘ") ^ i3) * (-41);
                        i4 = ((iM55979 ^ i2) * (-23127)) ^ (-947846761);
                        i5 = 636101245;
                    } else {
                        iM55979 = C0946.m55979("᩸᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-27959)) ^ 2113823135;
                        i5 = -689998109;
                    }
                    break;
                case -1709172247:
                case 1144537834:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0946.m55979("᩸᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-27959)) ^ 2113823135;
                        i5 = -689998109;
                    } else {
                        iM55979 = C0946.m55979("۟۫") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-29451)) ^ (-957997755);
                        i5 = -961833576;
                    }
                    break;
                case -1675910862:
                case 1582397629:
                    C0992.m56107();
                    return false;
                case -1621724046:
                case 1557735319:
                    if (C1046.f81962 <= 0) {
                        iM55979 = (C0873.m55680("᩶᩸") ^ i2) * 21;
                        i4 = ((iM55979 ^ i3) * (-22261)) ^ 904977247;
                        i5 = -148848840;
                    } else {
                        iM55979 = C0946.m55979("᩸᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-27959)) ^ 2113823135;
                        i5 = -689998109;
                    }
                    break;
                case -1545195114:
                case -770817865:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0946.m55979("۟۫") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-29451)) ^ (-957997755);
                        i5 = -961833576;
                    } else {
                        iM55979 = C0946.m55979("ۡۡ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-17673)) ^ (-44254742);
                        i5 = 2129343061;
                    }
                    break;
                case -1545107858:
                case -105948223:
                    if (C0906.f81862 >= 0) {
                        iM55979 = (C0946.m55979("᩸ۘ") ^ i3) * (-41);
                        i4 = ((iM55979 ^ i2) * (-23127)) ^ (-947846761);
                        i5 = 636101245;
                    } else {
                        iM55979 = (C0873.m55680("ܰ֨") ^ i3) * 17;
                        i4 = ((iM55979 ^ i2) * (-10075)) ^ (-1558117912);
                        i5 = -648617510;
                    }
                    break;
                case -1543568423:
                case 1660816281:
                    if (C1028.f81950 <= 0) {
                        iM55979 = C0946.m55979("᩸᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-27959)) ^ 2113823135;
                        i5 = -689998109;
                    } else {
                        iM55979 = C0873.m55680("ܿۗ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-13835)) ^ 640528833;
                        i5 = -1419548962;
                    }
                    break;
                case -1417744257:
                case 1091714106:
                    if (C0866.m55645()) {
                        iM55979 = (C0946.m55979("᩵᩵") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55979 ^ i2) * (-13139)) ^ (-378765077);
                        i5 = -1360434742;
                    } else {
                        iM55979 = (C0873.m55680("ۖ۬") + i2) * 39;
                        i4 = ((iM55979 ^ i3) * 25535) ^ 1116873924;
                        i5 = 1886286393;
                    }
                    break;
                case -1415386306:
                case -1302120989:
                    if (this.f54482 != null) {
                        iM55979 = C0873.m55680("۟ܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-29179)) ^ (-1498118688);
                        i5 = 297602789;
                    } else {
                        iM55979 = C0873.m55680("ᩳۗ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-17573)) ^ 2044869503;
                        i5 = -886413392;
                    }
                    break;
                case -1384937292:
                case 552655765:
                    if (C0912.m55833()) {
                        iM55979 = (C0873.m55680("᩶᩸") ^ i2) * 21;
                        i4 = ((iM55979 ^ i3) * (-22261)) ^ 904977247;
                        i5 = -148848840;
                    } else {
                        iM55979 = C0873.m55680("ۛۗ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14983) ^ (-953668613);
                        i5 = -1543885589;
                    }
                    break;
                case -871378465:
                case 1745624912:
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0946.m55979("۟۫") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-29451)) ^ (-957997755);
                        i5 = -961833576;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ۛۤ")) * (-53);
                        i4 = ((iM55979 ^ i3) * 23661) ^ (-985080266);
                        i5 = -287731486;
                    }
                    break;
                case -789543109:
                case 609943859:
                    if (C0845.m55584() <= 0) {
                        iM55979 = (C0873.m55680("ۖ۬") + i2) * 39;
                        i4 = ((iM55979 ^ i3) * 25535) ^ 1116873924;
                        i5 = 1886286393;
                    } else {
                        iM55979 = (C0946.m55979("ۙۜ") + i2) * 45;
                        i4 = ((iM55979 ^ i3) * (-9003)) ^ 359873486;
                        i5 = 14541515;
                    }
                    break;
                case -588882236:
                case 970911426:
                    if (C1025.f81947 >= 0) {
                        iM55979 = (C0946.m55979("᩸ۘ") ^ i3) * (-41);
                        i4 = ((iM55979 ^ i2) * (-23127)) ^ (-947846761);
                        i5 = 636101245;
                    } else {
                        iM55979 = (C0873.m55680("ۢۡ") ^ i3) * 89;
                        i4 = ((iM55979 ^ i2) * 473) ^ 10742910;
                        i5 = 1263416526;
                    }
                    break;
                case -469240473:
                case 423220506:
                    return true;
                case -258100735:
                case 245071572:
                    if (RunnableC0897.m55784()) {
                        iM55979 = (C0873.m55680("ۖ۬") + i2) * 39;
                        i4 = ((iM55979 ^ i3) * 25535) ^ 1116873924;
                        i5 = 1886286393;
                    } else {
                        iM55979 = C0873.m55680("᩹۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * 24469) ^ 475460032;
                        i5 = 2051215168;
                    }
                    break;
                case 338330935:
                case 2139488644:
                    if (C0912.f81867 <= 0) {
                        iM55979 = (C0873.m55680("᩶᩸") ^ i2) * 21;
                        i4 = ((iM55979 ^ i3) * (-22261)) ^ 904977247;
                        i5 = -148848840;
                    } else {
                        iM55979 = (C0946.m55979("ܿۙ") ^ i2) * (-101);
                        i4 = ((iM55979 ^ i3) * (-29949)) ^ 1728343893;
                        i5 = 1393486791;
                    }
                    break;
                case 870316977:
                case 1880026236:
                    if (this.f54493) {
                        iM55979 = (C0946.m55979("ܰ᩹") ^ i3) * (-3);
                        i4 = ((iM55979 ^ i2) * 21665) ^ (-99534810);
                        i5 = 1145919213;
                    } else {
                        iM55979 = C0873.m55680("ᩳۗ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-17573)) ^ 2044869503;
                        i5 = -886413392;
                    }
                    break;
                default:
                    return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b9, code lost:
    
        if (p067l.C1046.f81962 <= 0) goto L17;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m41528(C22809 c22809) throws C3924 {
        String str;
        StringBuilder sb;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        String str7;
        int iM55680;
        int i2;
        int i3;
        char c;
        char c2;
        String str8;
        String str9;
        StringBuilder sb2;
        String str10;
        String str11;
        String str12;
        String str13;
        int iM55979;
        int i4;
        int i5;
        int i6;
        String str14;
        String str15;
        char c3;
        int i7;
        String str16;
        String str17;
        String str18;
        String str19;
        short[] sArr;
        String strM55635;
        String strM56318;
        char c4;
        int i8;
        StringBuilder sb3;
        String str20;
        char c5;
        String str21;
        String str22;
        String strM55591;
        int iM559710;
        int i9;
        int i10;
        int iM55681;
        int i11;
        int iM559711;
        int i12;
        int i13;
        this = this;
        c22809 = c22809;
        int i14 = -418767577;
        int i15 = ViewOnClickListenerC0939.f81888;
        int i16 = C0992.f81922;
        int iM55682 = C0873.m55680("ۜ᩺") ^ i16;
        int i17 = ((iM55682 ^ i15) * 11671) ^ (-343170572);
        int i18 = iM55682 ^ 787471530;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        StringBuilder sb4 = null;
        short[] sArr2 = null;
        char c6 = 0;
        int i19 = 0;
        String str26 = null;
        String str27 = null;
        Iterator itM56090 = null;
        String str28 = null;
        String strM55592 = null;
        String str29 = null;
        StringBuilder sb5 = null;
        char c7 = 0;
        String name = null;
        StringBuilder sb6 = null;
        String strM55639 = null;
        int i20 = 0;
        String strM556310 = null;
        String str30 = null;
        String strM56409 = null;
        C12886 c12886 = null;
        StringBuilder sb7 = null;
        String strM556311 = null;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i15) * 2001) >> 31));
            switch (i14) {
                case -2134157569:
                case 1458477141:
                    C1404.m56468();
                    if (C1071.f81975 > 0) {
                        str = str24;
                        sb = sb4;
                        str6 = str30;
                        str2 = strM56409;
                        str3 = str26;
                        str4 = str28;
                        str5 = str29;
                        int iM55683 = C0873.m55680("ᩳ۫") ^ i15;
                        i = ((iM55683 ^ i16) * (-27349)) ^ (-513781597);
                        i18 = iM55683 ^ (-1877515664);
                        sb5 = sb5;
                        name = name;
                        strM56409 = str2;
                        str24 = str;
                        str29 = str5;
                        c7 = c7;
                        str28 = str4;
                        str26 = str3;
                        sb4 = sb;
                        c6 = c6;
                        i17 = i;
                        str30 = str6;
                        str23 = str23;
                        str25 = str25;
                    } else {
                        iM559711 = (i16 - C0873.m55680("۫ۧ")) * 35;
                        i12 = ((iM559711 ^ i15) * 23849) ^ 1844334858;
                        i13 = 1218317570;
                        i18 = iM559711 ^ i13;
                        i17 = i12;
                    }
                    break;
                case -2043756910:
                case -1639121697:
                    StringBuilder sb8 = new StringBuilder(str25);
                    C0912.m55825(sb8, c12886.f36241);
                    C16907.m38470(C0863.m55639(sb8));
                    String str31 = c12886.f36241;
                    Object[] objArr = new Object[1];
                    if (!C0882.f81846) {
                        objArr[0] = str31;
                        throw new C3924(C0912.m55826(C0946.m55979(C0863.m55635(f82265, 589, 3, i20)) ^ 2103112708, objArr));
                    }
                    int iM55684 = C0873.m55680("ۢۙ") ^ i16;
                    i2 = ((iM55684 ^ i15) * (-20513)) ^ (-56222022);
                    i18 = iM55684 ^ 1835664184;
                    i17 = i2;
                    str25 = str25;
                    break;
                case -1742317448:
                case 790609653:
                    str25 = str25;
                    str7 = strM556310;
                    if (c22809.m51013(strM55592, strM556311)) {
                        iM55680 = C0873.m55680("ۨ᩶") ^ i15;
                        i2 = ((iM55680 ^ i16) * (-26315)) ^ 753430057;
                        i3 = -335883801;
                    } else {
                        iM55680 = C0873.m55680("᩹۟") ^ i16;
                        i2 = ((iM55680 ^ i15) * (-9331)) ^ 1593009721;
                        i3 = 1116470998;
                    }
                    strM556310 = str7;
                    i18 = iM55680 ^ i3;
                    i17 = i2;
                    str25 = str25;
                    break;
                case -1719440274:
                case -1551262432:
                    String str32 = str25;
                    String str33 = str23;
                    StringBuilder sb9 = new StringBuilder(str33);
                    c = c7;
                    char c8 = c6;
                    str9 = str24;
                    StringBuilder sb10 = sb4;
                    String str34 = str28;
                    C1003.m56121(sb9, C1229.m56409(str34, c, c8));
                    String str35 = str26;
                    C1003.m56121(sb9, str35);
                    String strM556312 = C0863.m55639(sb9);
                    if (c22809.m51012(strM556312)) {
                        int iM55685 = C0873.m55680("ۘܺ") ^ i15;
                        i17 = ((iM55685 ^ i16) * 26159) ^ (-1710801998);
                        i18 = iM55685 ^ 553270075;
                        str23 = str33;
                        str26 = str35;
                        sb4 = sb10;
                        str25 = str32;
                        c6 = c8;
                        str30 = strM556312;
                        str28 = str34;
                        str24 = str9;
                        c7 = c;
                    } else {
                        int iM55686 = (C0873.m55680("ۜۤ") ^ i16) * 57;
                        i18 = iM55686 ^ 762992067;
                        str23 = str33;
                        i17 = ((iM55686 ^ i15) * (-32169)) ^ (-1416142213);
                        str24 = str9;
                        str25 = str32;
                        c7 = c;
                        str26 = str35;
                        sb4 = sb10;
                        c6 = c8;
                        str30 = strM556312;
                        str28 = str34;
                    }
                    break;
                case -1658616062:
                case 1071009612:
                    str25 = str25;
                    str7 = strM556310;
                    if (c22809.m51013(strM55592, str27)) {
                        iM55680 = (C0873.m55680("۫۬") + i16) * (-5);
                        i2 = ((iM55680 ^ i15) * (-16771)) ^ (-548938947);
                        i3 = -1159565683;
                    } else {
                        iM55680 = C0873.m55680("ܰܶ") ^ i16;
                        i2 = ((iM55680 ^ i15) * 1379) ^ (-1499262351);
                        i3 = -834910197;
                    }
                    strM556310 = str7;
                    i18 = iM55680 ^ i3;
                    i17 = i2;
                    str25 = str25;
                    break;
                case -1625412788:
                case 1815800144:
                    str25 = str25;
                    str7 = strM556310;
                    sb4 = new StringBuilder(C0882.m55717(f82265, 617, 29, i20));
                    str29 = this.f54483;
                    if (C0937.f81884) {
                        iM55680 = (i15 - C0873.m55680("ۖܶ")) * (-19);
                        i2 = ((iM55680 ^ i16) * (-21035)) ^ 446208442;
                        i3 = 425132703;
                    } else {
                        iM55680 = (i15 - C0946.m55979("᩸ܽ")) * 5;
                        i2 = ((iM55680 ^ i16) * (-10723)) ^ (-1565211886);
                        i3 = -1679498709;
                    }
                    strM556310 = str7;
                    i18 = iM55680 ^ i3;
                    i17 = i2;
                    str25 = str25;
                    break;
                case -1603695857:
                case -618401494:
                    if (C1229.m56410() == 0) {
                        int iM55687 = C0873.m55680("ۢۙ") ^ i16;
                        i2 = ((iM55687 ^ i15) * (-20513)) ^ (-56222022);
                        i18 = iM55687 ^ 1835664184;
                        i17 = i2;
                        str25 = str25;
                    }
                    str = str24;
                    sb = sb4;
                    str6 = str30;
                    str2 = strM56409;
                    str3 = str26;
                    str4 = str28;
                    str5 = str29;
                    int iM55688 = C0873.m55680("ᩳ۫") ^ i15;
                    i = ((iM55688 ^ i16) * (-27349)) ^ (-513781597);
                    i18 = iM55688 ^ (-1877515664);
                    sb5 = sb5;
                    name = name;
                    strM56409 = str2;
                    str24 = str;
                    str29 = str5;
                    c7 = c7;
                    str28 = str4;
                    str26 = str3;
                    sb4 = sb;
                    c6 = c6;
                    i17 = i;
                    str30 = str6;
                    str23 = str23;
                    str25 = str25;
                    break;
                case -1356247904:
                case 1916532308:
                    str25 = str25;
                    str7 = strM556310;
                    if (c22809.m51013(strM55592, strM55639)) {
                        iM55680 = (C0946.m55979("᩹ۙ") ^ i15) * 67;
                        i2 = ((iM55680 ^ i16) * 21177) ^ (-1625951848);
                        i3 = 277840579;
                    } else {
                        iM55680 = (C0873.m55680("۫ۛ") + i16) * (-87);
                        i2 = ((iM55680 ^ i15) * (-10067)) ^ 599197989;
                        i3 = 35169804;
                    }
                    strM556310 = str7;
                    i18 = iM55680 ^ i3;
                    i17 = i2;
                    str25 = str25;
                    break;
                case -1271392883:
                case -959997947:
                    return;
                case -1191663038:
                case 1802607423:
                    str25 = str25;
                    sb3 = sb6;
                    str20 = strM56409;
                    c5 = c7;
                    c4 = c6;
                    str21 = str23;
                    str22 = str26;
                    C0912.m55825(sb3, str20);
                    C0912.m55825(sb3, str22);
                    String strM55593 = C0845.m55591(sb3);
                    StringBuilder sb11 = new StringBuilder(str21);
                    C1003.m56121(sb11, C1071.m56342(PluginPreference.class.getName(), c5, c4));
                    C1003.m56121(sb11, str22);
                    strM55591 = C0845.m55591(sb11);
                    itM56090 = C0989.m56090(this.f54488);
                    str27 = strM55593;
                    int iM559712 = (C0946.m55979("ۙ֡") ^ i15) * 127;
                    i6 = ((iM559712 ^ i16) * (-14381)) ^ 1258160108;
                    i18 = iM559712 ^ (-387605618);
                    sb6 = sb3;
                    c7 = c5;
                    strM56409 = str20;
                    str24 = strM55591;
                    str29 = str29;
                    str30 = str30;
                    str23 = str21;
                    str28 = str28;
                    str25 = str25;
                    str26 = str22;
                    sb4 = sb4;
                    c6 = c4;
                    i17 = i6;
                    this = this;
                    break;
                case -1149444497:
                case -600756264:
                    str25 = str25;
                    c = c7;
                    c2 = c6;
                    str8 = str23;
                    str9 = str24;
                    sb2 = sb4;
                    str10 = str26;
                    String str36 = this.f54483;
                    if (str36 == null) {
                        str28 = str36;
                        int iM55689 = (C0873.m55680("ۗ᩸") + i15) * 79;
                        i8 = ((iM55689 ^ i16) * 20095) ^ 979259712;
                        i18 = iM55689 ^ 831446733;
                        c22809 = c22809;
                        str23 = str8;
                        str26 = str10;
                        sb4 = sb2;
                        str25 = str25;
                        c6 = c2;
                        i17 = i8;
                        str24 = str9;
                        c7 = c;
                    } else {
                        iM55681 = C0873.m55680("ۡۙ") ^ i16;
                        str12 = str36;
                        i4 = ((iM55681 ^ i15) * (-30203)) ^ 2115706389;
                        i11 = 1311295688;
                        i18 = iM55681 ^ i11;
                        str23 = str8;
                        str28 = str12;
                        str24 = str9;
                        str25 = str25;
                        c7 = c;
                        str26 = str10;
                        sb4 = sb2;
                        c6 = c2;
                        i17 = i4;
                        c22809 = c22809;
                    }
                    break;
                case -1076263586:
                case 1379834474:
                    c12886.m29514(2);
                    StringBuilder sb12 = new StringBuilder(C0863.m55635(f82265, 649, 23, i20));
                    C0912.m55825(sb12, c12886.f36241);
                    C16907.m38470(C0845.m55591(sb12));
                    sb3 = sb6;
                    c5 = c7;
                    c4 = c6;
                    str21 = str23;
                    strM556310 = strM556310;
                    str22 = str26;
                    strM55591 = str24;
                    str20 = strM56409;
                    int iM559713 = (C0946.m55979("ۙ֡") ^ i15) * 127;
                    i6 = ((iM559713 ^ i16) * (-14381)) ^ 1258160108;
                    i18 = iM559713 ^ (-387605618);
                    sb6 = sb3;
                    c7 = c5;
                    strM56409 = str20;
                    str24 = strM55591;
                    str29 = str29;
                    str30 = str30;
                    str23 = str21;
                    str28 = str28;
                    str25 = str25;
                    str26 = str22;
                    sb4 = sb4;
                    c6 = c4;
                    i17 = i6;
                    this = this;
                    break;
                case -1023974329:
                case 1262549139:
                    str25 = str25;
                    StringBuilder sb13 = sb6;
                    char c9 = c7;
                    c6 = c6;
                    str23 = str23;
                    str = str24;
                    sb = sb4;
                    str6 = str30;
                    str2 = strM56409;
                    str3 = str26;
                    str4 = str28;
                    str5 = str29;
                    StringBuilder sb14 = new StringBuilder(str23);
                    C1003.m56121(sb14, C1229.m56409(TextEditorFloatingMenu.class.getName(), c9, c6));
                    C0912.m55825(sb14, str3);
                    if (C0894.f81854 >= 0) {
                        sb7 = sb14;
                        sb6 = sb13;
                        c7 = c9;
                        name = name;
                        sb5 = sb5;
                        int iM556810 = C0873.m55680("ᩳ۫") ^ i15;
                        i = ((iM556810 ^ i16) * (-27349)) ^ (-513781597);
                        i18 = iM556810 ^ (-1877515664);
                        sb5 = sb5;
                        name = name;
                        strM56409 = str2;
                        str24 = str;
                        str29 = str5;
                        c7 = c7;
                        str28 = str4;
                    } else {
                        int iM559714 = C0946.m55979("ܿ֡") ^ i15;
                        i = ((iM559714 ^ i16) * (-20773)) ^ (-1622164780);
                        i18 = iM559714 ^ 1616528900;
                        sb7 = sb14;
                        sb6 = sb13;
                        strM56409 = str2;
                        str24 = str;
                        str29 = str5;
                        c7 = c9;
                        str28 = str4;
                    }
                    str26 = str3;
                    sb4 = sb;
                    c6 = c6;
                    i17 = i;
                    str30 = str6;
                    str23 = str23;
                    str25 = str25;
                    break;
                case -1018250684:
                case 1084492111:
                    String str37 = str25;
                    String str38 = name;
                    char c10 = c7;
                    char c11 = c6;
                    String str39 = str23;
                    String str40 = str24;
                    StringBuilder sb15 = sb4;
                    String str41 = str30;
                    String str42 = strM56409;
                    String str43 = str26;
                    String str44 = str28;
                    int i21 = i19;
                    String str45 = str29;
                    short[] sArr3 = sArr2;
                    short s = f82265[567];
                    int i22 = s + 1;
                    if (((s * 2) + 1) - (i22 * i22) > 0) {
                        iM55979 = (C0873.m55680("᩺ۛ") ^ i15) * 65;
                        i4 = ((iM55979 ^ i16) * 6013) ^ (-761148939);
                        i5 = 1611356665;
                    } else {
                        iM55979 = (C0946.m55979("ܶۗ") ^ i16) * (-53);
                        i4 = ((iM55979 ^ i15) * (-29583)) ^ (-1282995349);
                        i5 = -2095074246;
                    }
                    i18 = iM55979 ^ i5;
                    this = this;
                    strM56409 = str42;
                    sArr2 = sArr3;
                    i19 = i21;
                    str24 = str40;
                    str29 = str45;
                    str30 = str41;
                    str23 = str39;
                    c7 = c10;
                    str28 = str44;
                    str25 = str37;
                    str26 = str43;
                    sb4 = sb15;
                    c6 = c11;
                    name = str38;
                    i17 = i4;
                    c22809 = c22809;
                    break;
                case -1002963809:
                case 290668809:
                    C0955.m56025();
                    break;
                case -980350597:
                case 1408269721:
                    StringBuilder sb16 = new StringBuilder(str25);
                    C1003.m56121(sb16, this.f54483);
                    C16907.m38470(C0845.m55591(sb16));
                    String str46 = this.f54483;
                    Object[] objArr2 = new Object[1];
                    if (C0927.m55873() > 0) {
                        objArr2[0] = str46;
                        throw new C3924(C0912.m55826(C0946.m55979(C1964.m56584(f82265, 592, 3, i20)) ^ 2104528429, objArr2));
                    }
                    int iM559715 = (C0946.m55979("ܳۧ") + i16) * (-115);
                    i12 = ((iM559715 ^ i15) * (-30263)) ^ (-655782764);
                    strM556310 = strM556310;
                    i18 = iM559715 ^ 1540554816;
                    i17 = i12;
                    break;
                case -952993129:
                case 1490205109:
                    c12886.m29514(1);
                    StringBuilder sb17 = new StringBuilder(C0854.m55597(f82265, 595, 22, i20));
                    C0912.m55825(sb17, c12886.f36241);
                    C16907.m38470(C0863.m55639(sb17));
                    sb3 = sb6;
                    c5 = c7;
                    c4 = c6;
                    str21 = str23;
                    strM556310 = strM556310;
                    str22 = str26;
                    strM55591 = str24;
                    str20 = strM56409;
                    int iM559716 = (C0946.m55979("ۙ֡") ^ i15) * 127;
                    i6 = ((iM559716 ^ i16) * (-14381)) ^ 1258160108;
                    i18 = iM559716 ^ (-387605618);
                    sb6 = sb3;
                    c7 = c5;
                    strM56409 = str20;
                    str24 = strM55591;
                    str29 = str29;
                    str30 = str30;
                    str23 = str21;
                    str28 = str28;
                    str25 = str25;
                    str26 = str22;
                    sb4 = sb4;
                    c6 = c4;
                    i17 = i6;
                    this = this;
                    break;
                case -862366277:
                case 466923124:
                    C0947.m55997();
                    str25 = str25;
                    str7 = strM556310;
                    iM55680 = (i15 - C0946.m55979("᩸ܽ")) * 5;
                    i2 = ((iM55680 ^ i16) * (-10723)) ^ (-1565211886);
                    i3 = -1679498709;
                    strM556310 = str7;
                    i18 = iM55680 ^ i3;
                    i17 = i2;
                    str25 = str25;
                    break;
                case -854567121:
                case 2051423136:
                    str14 = str25;
                    str15 = str30;
                    c3 = c7;
                    char c12 = c6;
                    i7 = i19;
                    str16 = str24;
                    sb4 = sb4;
                    str17 = strM56409;
                    str26 = str26;
                    str18 = str28;
                    str19 = str29;
                    sArr = sArr2;
                    c6 = c12;
                    strM55635 = C0863.m55635(f82265, 568, 1, i20);
                    StringBuilder sb18 = new StringBuilder(strM55635);
                    name = TranslationEngine.class.getName();
                    if (C1229.m56410() == 0) {
                        int iM559717 = C0946.m55979("᩸ۖ") ^ i15;
                        sb5 = sb18;
                        i6 = ((iM559717 ^ i16) * (-25043)) ^ (-2146974459);
                        i18 = iM559717 ^ 423975575;
                        strM56409 = str17;
                        sArr2 = sArr;
                        i19 = i7;
                        str24 = str16;
                        str29 = str19;
                        str30 = str15;
                        str25 = str14;
                        str23 = strM55635;
                        c7 = c3;
                        str28 = str18;
                        str26 = str26;
                        sb4 = sb4;
                        c6 = c6;
                        name = name;
                        i17 = i6;
                        this = this;
                    } else {
                        sb5 = sb18;
                        strM56318 = str26;
                        int iM556811 = C0873.m55680("ᩳۘ") ^ i16;
                        int i23 = ((iM556811 ^ i15) * 16369) ^ 477781191;
                        i18 = iM556811 ^ 1305163834;
                        strM56409 = str17;
                        sArr2 = sArr;
                        i19 = i7;
                        str24 = str16;
                        str29 = str19;
                        str30 = str15;
                        str25 = str14;
                        str23 = strM55635;
                        c7 = c3;
                        str28 = str18;
                        c22809 = c22809;
                        str26 = strM56318;
                        this = this;
                        char c13 = c6;
                        name = name;
                        i17 = i23;
                        sb4 = sb4;
                        c6 = c13;
                    }
                    break;
                case -827218641:
                case 597501949:
                    str14 = str25;
                    String str47 = strM556310;
                    StringBuilder sb19 = new StringBuilder(C1003.m56132(f82265, 699, 21, i20));
                    C0912.m55825(sb19, c12886.f36241);
                    C16907.m38470(C0845.m55591(sb19));
                    String str48 = c12886.f36241;
                    if (C0937.f81884) {
                        throw new C3924(C0912.m55826(C0946.m55979(C0845.m55592(f82265, C0831c.f3580e, 3, i20)) ^ 2116392219, new Object[]{str48}));
                    }
                    name = name;
                    strM56318 = str26;
                    c3 = c7;
                    c6 = c6;
                    str18 = str28;
                    strM55635 = str23;
                    strM556310 = str47;
                    str16 = str24;
                    sb4 = sb4;
                    str19 = str29;
                    str15 = str30;
                    str17 = strM56409;
                    sArr = sArr2;
                    i7 = i19;
                    int iM556812 = C0873.m55680("ᩳۘ") ^ i16;
                    int i24 = ((iM556812 ^ i15) * 16369) ^ 477781191;
                    i18 = iM556812 ^ 1305163834;
                    strM56409 = str17;
                    sArr2 = sArr;
                    i19 = i7;
                    str24 = str16;
                    str29 = str19;
                    str30 = str15;
                    str25 = str14;
                    str23 = strM55635;
                    c7 = c3;
                    str28 = str18;
                    c22809 = c22809;
                    str26 = strM56318;
                    this = this;
                    char c14 = c6;
                    name = name;
                    i17 = i24;
                    sb4 = sb4;
                    c6 = c14;
                    break;
                case -763266435:
                case -593657808:
                    if (c22809.m51013(strM55592, strM556310)) {
                        iM559711 = C0946.m55979("ۗᩳ") ^ i15;
                        i12 = ((iM559711 ^ i16) * (-27213)) ^ (-1853918749);
                        i13 = -1827589924;
                    } else {
                        iM559711 = (i16 - C0946.m55979("᩷۬")) * (-79);
                        i12 = ((iM559711 ^ i15) * 13557) ^ 740117057;
                        i13 = -2093350690;
                    }
                    i18 = iM559711 ^ i13;
                    i17 = i12;
                    break;
                case -745571945:
                case 1960395886:
                    str25 = str25;
                    str7 = strM556310;
                    if (!c22809.m51013(str30, str24)) {
                        iM55680 = C0873.m55680("۟ۚ") ^ i16;
                        i2 = ((iM55680 ^ i15) * 4231) ^ (-262845736);
                        i3 = 1925151079;
                        strM556310 = str7;
                        i18 = iM55680 ^ i3;
                        i17 = i2;
                        str25 = str25;
                    } else {
                        c = c7;
                        c2 = c6;
                        str8 = str23;
                        strM556310 = str7;
                        str9 = str24;
                        sb2 = sb4;
                        str10 = str26;
                        int iM556813 = (C0873.m55680("ۗ᩸") + i15) * 79;
                        i8 = ((iM556813 ^ i16) * 20095) ^ 979259712;
                        i18 = iM556813 ^ 831446733;
                        c22809 = c22809;
                        str23 = str8;
                        str26 = str10;
                        sb4 = sb2;
                        str25 = str25;
                        c6 = c2;
                        i17 = i8;
                        str24 = str9;
                        c7 = c;
                    }
                    break;
                case -729233239:
                case 1626656114:
                    if (C0863.f81833 <= 0) {
                        str25 = str25;
                        c = c7;
                        c2 = c6;
                        str8 = str23;
                        str9 = str24;
                        sb2 = sb4;
                        str11 = str30;
                        str10 = str26;
                        str12 = str28;
                        str13 = str29;
                        int iM559718 = C0946.m55979("ۗ᩺") ^ i15;
                        i4 = ((iM559718 ^ i16) * (-12177)) ^ (-1862299950);
                        i18 = iM559718 ^ 541549328;
                        this = this;
                        str24 = str9;
                        str29 = str13;
                        str30 = str11;
                        str23 = str8;
                        c7 = c;
                        str28 = str12;
                        str25 = str25;
                        str26 = str10;
                        sb4 = sb2;
                        c6 = c2;
                        i17 = i4;
                        c22809 = c22809;
                    } else {
                        str25 = str25;
                        str7 = strM556310;
                        iM55680 = (i15 - C0946.m55979("᩸ܽ")) * 5;
                        i2 = ((iM55680 ^ i16) * (-10723)) ^ (-1565211886);
                        i3 = -1679498709;
                        strM556310 = str7;
                        i18 = iM55680 ^ i3;
                        i17 = i2;
                        str25 = str25;
                    }
                    break;
                case -667151916:
                case 1456248057:
                    String str49 = strM556310;
                    C0912.m55825(sb4, str29);
                    C16907.m38470(C0845.m55591(sb4));
                    String str50 = this.f54483;
                    if (C0854.f81826 == 0) {
                        throw new C3924(C0912.m55826(C0873.m55680(C0877.m55707(f82265, 646, 3, i20)) ^ 2128112607, new Object[]{str50}));
                    }
                    strM556310 = str49;
                    str = str24;
                    sb = sb4;
                    str6 = str30;
                    str2 = strM56409;
                    str3 = str26;
                    str4 = str28;
                    str5 = str29;
                    int iM556814 = C0873.m55680("ᩳ۫") ^ i15;
                    i = ((iM556814 ^ i16) * (-27349)) ^ (-513781597);
                    i18 = iM556814 ^ (-1877515664);
                    sb5 = sb5;
                    name = name;
                    strM56409 = str2;
                    str24 = str;
                    str29 = str5;
                    c7 = c7;
                    str28 = str4;
                    str26 = str3;
                    sb4 = sb;
                    c6 = c6;
                    i17 = i;
                    str30 = str6;
                    str23 = str23;
                    str25 = str25;
                    break;
                    break;
                case -542070683:
                case -2221199:
                    str25 = str25;
                    c = c7;
                    c2 = c6;
                    str8 = str23;
                    str9 = str24;
                    sb2 = sb4;
                    str10 = str26;
                    str12 = str28;
                    c12886 = (C12886) RunnableC0897.m55785(itM56090);
                    String str51 = c12886.f36241;
                    StringBuilder sb20 = new StringBuilder(str8);
                    C1003.m56121(sb20, C1229.m56409(str51, c, c2));
                    C0912.m55825(sb20, str10);
                    strM55592 = C0845.m55591(sb20);
                    if (!c22809.m51012(strM55592)) {
                        int iM559719 = C0946.m55979("ۛ᩹") ^ i15;
                        i8 = ((iM559719 ^ i16) * (-19787)) ^ 1234889472;
                        i18 = iM559719 ^ (-898648554);
                        str23 = str8;
                        str28 = str12;
                        str25 = str25;
                        str26 = str10;
                        sb4 = sb2;
                        c6 = c2;
                        i17 = i8;
                        str24 = str9;
                        c7 = c;
                    } else {
                        iM55681 = (C0873.m55680("ܳۘ") + i15) * 115;
                        i4 = ((iM55681 ^ i16) * (-31399)) ^ (-16481239);
                        i11 = 284661956;
                        i18 = iM55681 ^ i11;
                        str23 = str8;
                        str28 = str12;
                        str24 = str9;
                        str25 = str25;
                        c7 = c;
                        str26 = str10;
                        sb4 = sb2;
                        c6 = c2;
                        i17 = i4;
                        c22809 = c22809;
                    }
                    break;
                case -522996736:
                case 1434380847:
                    char c15 = c7;
                    char c16 = c6;
                    String str52 = str23;
                    String str53 = str24;
                    StringBuilder sb21 = sb4;
                    String str54 = str26;
                    String str55 = str28;
                    boolean zM55886 = C0930.m55886(itM56090);
                    String str56 = str29;
                    String str57 = str30;
                    String strM55993 = C0947.m55993(f82265, 570, 19, i20);
                    if (zM55886) {
                        iM559710 = C0873.m55680("ۘ᩵") ^ i16;
                        i9 = ((iM559710 ^ i15) * 11317) ^ (-1043637578);
                        i10 = 840027912;
                    } else {
                        iM559710 = (C0946.m55979("ۜ᩵") ^ i16) * 15;
                        i9 = ((iM559710 ^ i15) * (-27543)) ^ 1774561191;
                        i10 = 809773183;
                    }
                    i18 = iM559710 ^ i10;
                    c22809 = c22809;
                    str30 = str57;
                    str23 = str52;
                    str25 = strM55993;
                    str24 = str53;
                    c7 = c15;
                    c6 = c16;
                    i17 = i9;
                    str29 = str56;
                    str28 = str55;
                    str26 = str54;
                    sb4 = sb21;
                    break;
                case -516844058:
                case -239167177:
                    c12886.m29514(4);
                    StringBuilder sb22 = new StringBuilder(C1048.m56318(f82265, 723, 23, i20));
                    C1003.m56121(sb22, c12886.f36241);
                    C16907.m38470(C0845.m55591(sb22));
                    sb3 = sb6;
                    c5 = c7;
                    c4 = c6;
                    str21 = str23;
                    strM556310 = strM556310;
                    str22 = str26;
                    strM55591 = str24;
                    str20 = strM56409;
                    int iM5597110 = (C0946.m55979("ۙ֡") ^ i15) * 127;
                    i6 = ((iM5597110 ^ i16) * (-14381)) ^ 1258160108;
                    i18 = iM5597110 ^ (-387605618);
                    sb6 = sb3;
                    c7 = c5;
                    strM56409 = str20;
                    str24 = strM55591;
                    str29 = str29;
                    str30 = str30;
                    str23 = str21;
                    str28 = str28;
                    str25 = str25;
                    str26 = str22;
                    sb4 = sb4;
                    c6 = c4;
                    i17 = i6;
                    this = this;
                    break;
                case -282519149:
                case 335957542:
                    c12886.m29514(3);
                    StringBuilder sb23 = new StringBuilder(C1028.m56235(f82265, 672, 27, i20));
                    C0912.m55825(sb23, c12886.f36241);
                    C16907.m38470(C0863.m55639(sb23));
                    sb3 = sb6;
                    c5 = c7;
                    c4 = c6;
                    str21 = str23;
                    strM556310 = strM556310;
                    str22 = str26;
                    strM55591 = str24;
                    str20 = strM56409;
                    int iM5597111 = (C0946.m55979("ۙ֡") ^ i15) * 127;
                    i6 = ((iM5597111 ^ i16) * (-14381)) ^ 1258160108;
                    i18 = iM5597111 ^ (-387605618);
                    sb6 = sb3;
                    c7 = c5;
                    strM56409 = str20;
                    str24 = strM55591;
                    str29 = str29;
                    str30 = str30;
                    str23 = str21;
                    str28 = str28;
                    str25 = str25;
                    str26 = str22;
                    sb4 = sb4;
                    c6 = c4;
                    i17 = i6;
                    this = this;
                    break;
                case -95790857:
                case 879334718:
                    C0882.m55710();
                    if (RunnableC0938.f81886 >= 0) {
                        iM559711 = (C0946.m55979("۫ۙ") + i15) * (-41);
                        i12 = ((iM559711 ^ i16) * (-8719)) ^ 2029870024;
                        i13 = 1387235610;
                        i18 = iM559711 ^ i13;
                        i17 = i12;
                    }
                    int iM5597112 = (C0946.m55979("ܳۧ") + i16) * (-115);
                    i12 = ((iM5597112 ^ i15) * (-30263)) ^ (-655782764);
                    strM556310 = strM556310;
                    i18 = iM5597112 ^ 1540554816;
                    i17 = i12;
                    break;
                case -60266978:
                case 1298515454:
                    str25 = str25;
                    str = str24;
                    sb = sb4;
                    sb5 = sb5;
                    str2 = strM56409;
                    str3 = str26;
                    str4 = str28;
                    str23 = str23;
                    str5 = str29;
                    str6 = str30;
                    c7 = '.';
                    c6 = '/';
                    name = name;
                    C1003.m56121(sb5, C1229.m56409(name, '.', '/'));
                    sArr2 = f82265;
                    i19 = 569;
                    if (C0845.m55584() <= 0) {
                        int iM556815 = C0873.m55680("ᩳ۫") ^ i15;
                        i = ((iM556815 ^ i16) * (-27349)) ^ (-513781597);
                        i18 = iM556815 ^ (-1877515664);
                        sb5 = sb5;
                        name = name;
                        strM56409 = str2;
                        str24 = str;
                        str29 = str5;
                        c7 = c7;
                        str28 = str4;
                        str26 = str3;
                        sb4 = sb;
                        c6 = c6;
                        i17 = i;
                        str30 = str6;
                        str23 = str23;
                        str25 = str25;
                    } else {
                        int iM559720 = (C0946.m55979("ۙ᩸") ^ i16) * 37;
                        i18 = iM559720 ^ 1469228608;
                        c22809 = c22809;
                        sb5 = sb5;
                        name = name;
                        strM56409 = str2;
                        i17 = ((iM559720 ^ i15) * 18687) ^ (-289888840);
                        str24 = str;
                        str29 = str5;
                        str30 = str6;
                        c7 = '.';
                        this = this;
                        str23 = str23;
                        str28 = str4;
                        str25 = str25;
                        str26 = str3;
                        sb4 = sb;
                        c6 = '/';
                    }
                    break;
                case 92427686:
                case 1317819073:
                    i20 = 49695;
                    int iM559721 = C0946.m55979("᩺ܽ") ^ i16;
                    sb5 = sb5;
                    i6 = ((iM559721 ^ i15) * 27855) ^ (-980786701);
                    i18 = iM559721 ^ 548594396;
                    strM56409 = strM56409;
                    sArr2 = sArr2;
                    i19 = i19;
                    str24 = str24;
                    str29 = str29;
                    str30 = str30;
                    str23 = str23;
                    c7 = c7;
                    str28 = str28;
                    str25 = str25;
                    str26 = str26;
                    sb4 = sb4;
                    c6 = c6;
                    name = name;
                    i17 = i6;
                    this = this;
                    break;
                case 260984074:
                case 1952721316:
                    C0892.m55749();
                    if (C0854.f81826 != 0) {
                        int iM5597113 = (C0946.m55979("ܳۧ") + i16) * (-115);
                        i12 = ((iM5597113 ^ i15) * (-30263)) ^ (-655782764);
                        strM556310 = strM556310;
                        i18 = iM5597113 ^ 1540554816;
                        i17 = i12;
                    } else {
                        str25 = str25;
                        str7 = strM556310;
                        iM55680 = (i15 - C0946.m55979("᩸ܽ")) * 5;
                        i2 = ((iM55680 ^ i16) * (-10723)) ^ (-1565211886);
                        i3 = -1679498709;
                        strM556310 = str7;
                        i18 = iM55680 ^ i3;
                        i17 = i2;
                        str25 = str25;
                    }
                    break;
                case 264325163:
                case 431627319:
                    str14 = str25;
                    c3 = c7;
                    c4 = c6;
                    str18 = str28;
                    String str58 = str23;
                    str16 = str24;
                    sb4 = sb4;
                    str19 = str29;
                    str15 = str30;
                    str17 = strM56409;
                    sArr = sArr2;
                    i7 = i19;
                    strM56318 = C1048.m56318(sArr, i7, 1, i20);
                    StringBuilder sb24 = sb5;
                    C1003.m56121(sb24, strM56318);
                    strM556310 = C0863.m55639(sb24);
                    StringBuilder sb25 = new StringBuilder(str58);
                    C0912.m55825(sb25, C1071.m56342(TextEditorFunction.class.getName(), c3, c4));
                    C1003.m56121(sb25, strM56318);
                    strM556311 = C0863.m55639(sb25);
                    if (!AbstractC0942.m55971()) {
                        int iM556816 = C0873.m55680("ۤܶ") ^ i15;
                        i6 = ((iM556816 ^ i16) * (-12507)) ^ 913330141;
                        i18 = iM556816 ^ (-1764483934);
                        strM56409 = str17;
                        sArr2 = sArr;
                        i19 = i7;
                        str24 = str16;
                        str29 = str19;
                        str30 = str15;
                        str23 = str58;
                        c7 = c3;
                        str28 = str18;
                        str25 = str14;
                        str26 = strM56318;
                        sb5 = sb24;
                        sb4 = sb4;
                        c6 = c4;
                        i17 = i6;
                        this = this;
                    } else {
                        strM55635 = str58;
                        sb5 = sb24;
                        String str59 = name;
                        c6 = c4;
                        name = str59;
                        int iM556817 = C0873.m55680("ᩳۘ") ^ i16;
                        int i25 = ((iM556817 ^ i15) * 16369) ^ 477781191;
                        i18 = iM556817 ^ 1305163834;
                        strM56409 = str17;
                        sArr2 = sArr;
                        i19 = i7;
                        str24 = str16;
                        str29 = str19;
                        str30 = str15;
                        str25 = str14;
                        str23 = strM55635;
                        c7 = c3;
                        str28 = str18;
                        c22809 = c22809;
                        str26 = strM56318;
                        this = this;
                        char c17 = c6;
                        name = name;
                        i17 = i25;
                        sb4 = sb4;
                        c6 = c17;
                    }
                    break;
                case 538043220:
                case 1011080431:
                    i20 = 39463;
                    int iM559722 = C0946.m55979("᩺ܽ") ^ i16;
                    sb5 = sb5;
                    i6 = ((iM559722 ^ i15) * 27855) ^ (-980786701);
                    i18 = iM559722 ^ 548594396;
                    strM56409 = strM56409;
                    sArr2 = sArr2;
                    i19 = i19;
                    str24 = str24;
                    str29 = str29;
                    str30 = str30;
                    str23 = str23;
                    c7 = c7;
                    str28 = str28;
                    str25 = str25;
                    str26 = str26;
                    sb4 = sb4;
                    c6 = c6;
                    name = name;
                    i17 = i6;
                    this = this;
                    break;
                case 880346225:
                case 1720008290:
                    str25 = str25;
                    c = c7;
                    c2 = c6;
                    str8 = str23;
                    str9 = str24;
                    sb2 = sb4;
                    str11 = str30;
                    str10 = str26;
                    str12 = str28;
                    str13 = str29;
                    strM55639 = C0863.m55639(sb7);
                    StringBuilder sb26 = new StringBuilder(str8);
                    strM56409 = C1229.m56409(TextEditorToolMenu.class.getName(), c, c2);
                    if (C0989.f81920 < 0) {
                        int iM559723 = C0946.m55979("ۘ᩺") ^ i16;
                        i8 = ((iM559723 ^ i15) * (-32327)) ^ (-484890240);
                        i18 = iM559723 ^ 1431948560;
                        sb6 = sb26;
                        str29 = str13;
                        str30 = str11;
                        this = this;
                        str23 = str8;
                        str28 = str12;
                        str25 = str25;
                        str26 = str10;
                        sb4 = sb2;
                        c6 = c2;
                        i17 = i8;
                        str24 = str9;
                        c7 = c;
                    } else {
                        sb6 = sb26;
                        int iM5597114 = C0946.m55979("ۗ᩺") ^ i15;
                        i4 = ((iM5597114 ^ i16) * (-12177)) ^ (-1862299950);
                        i18 = iM5597114 ^ 541549328;
                        this = this;
                        str24 = str9;
                        str29 = str13;
                        str30 = str11;
                        str23 = str8;
                        c7 = c;
                        str28 = str12;
                        str25 = str25;
                        str26 = str10;
                        sb4 = sb2;
                        c6 = c2;
                        i17 = i4;
                        c22809 = c22809;
                    }
                    break;
                default:
                    C1028.m56247();
                    C0894.m55769();
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: ۠ */
    public final boolean m41537() {
        return this.f54503;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41529(boolean z) {
        int i = 1790935196;
        int i2 = ServiceConnectionC1013.f81940;
        int i3 = C0989.f81920;
        int iM55680 = (i3 - C0873.m55680("ۘۧ")) * (-107);
        int i4 = ((iM55680 ^ i2) * (-16877)) ^ 1672524988;
        int i5 = 582827056;
        while (true) {
            i = ((((i ^ i2) * 10203) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2087765745:
                case -1770971477:
                    if (C0898.f81858 <= 0) {
                        iM55680 = (C0873.m55680("᩹ۜ") + i3) * (-49);
                        i4 = ((iM55680 ^ i2) * 25789) ^ (-1610802928);
                        i5 = 1740119393;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ۚ֨")) * 53;
                        i4 = ((iM55680 ^ i3) * 10267) ^ 1208410108;
                        i5 = -610162649;
                    }
                    break;
                case -2011784947:
                case -294352099:
                    if (C0894.f81854 >= 0) {
                        iM55680 = (C0946.m55979("ۖ᩶") ^ i3) * 11;
                        i4 = ((iM55680 ^ i2) * 3767) ^ 1293995526;
                        i5 = 1547244409;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۛ۫")) * (-79);
                        i4 = ((iM55680 ^ i2) * 3557) ^ (-1125704702);
                        i5 = 910210699;
                    }
                    break;
                case -1670687010:
                case -729218195:
                    if (C1024.f81946) {
                        iM55680 = C0873.m55680("ۘ֡") ^ i3;
                        i4 = ((iM55680 ^ i2) * 9469) ^ (-1447276232);
                        i5 = -901102271;
                    } else {
                        iM55680 = C0946.m55979("ۡ۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * 8981) ^ 1961084733;
                        i5 = -1589166609;
                    }
                    break;
                case -1522852247:
                case 1947064423:
                    C0992.m56107();
                    C1017.m56187();
                    break;
                case -1468592616:
                case 1660330284:
                    if (C1017.m56187() <= 0) {
                        iM55680 = C0946.m55979("ܿۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-10225)) ^ (-175350557);
                        i5 = 329109280;
                    } else {
                        iM55680 = (C0946.m55979("֡ᩴ") + i2) * 17;
                        i4 = ((iM55680 ^ i3) * 21849) ^ (-766884693);
                        i5 = -1902619145;
                    }
                    break;
                case -770644303:
                case 1600577784:
                    if (C1012.f81938 >= 0) {
                        iM55680 = (C0946.m55979("ۖ᩶") ^ i3) * 11;
                        i4 = ((iM55680 ^ i2) * 3767) ^ 1293995526;
                        i5 = 1547244409;
                    } else {
                        iM55680 = (C0873.m55680("ۢ᩸") + i2) * 61;
                        i4 = ((iM55680 ^ i3) * 21501) ^ 2001424453;
                        i5 = -1724241229;
                    }
                    break;
                case -733915676:
                case 670109577:
                    C0906.m55809();
                    if (C1929.m56553()) {
                        iM55680 = (C0873.m55680("᩹ۜ") + i3) * (-49);
                        i4 = ((iM55680 ^ i2) * 25789) ^ (-1610802928);
                        i5 = 1740119393;
                    } else {
                        iM55680 = C0873.m55680("ܽۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 7523) ^ 937767058;
                        i5 = -641181595;
                    }
                    break;
                case -640250182:
                case 2056165619:
                    if (C1025.m56230()) {
                        iM55680 = C0946.m55979("ܿۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-10225)) ^ (-175350557);
                        i5 = 329109280;
                    } else {
                        iM55680 = (C0946.m55979("᩻ۧ") + i2) * (-69);
                        i4 = ((iM55680 ^ i3) * (-31523)) ^ 834613069;
                        i5 = 1666771787;
                    }
                    break;
                case -507842883:
                case 1824715900:
                    this.f54503 = z;
                    if (z) {
                        iM55680 = (C0946.m55979("ۙܿ") ^ i3) * (-123);
                        i4 = ((iM55680 ^ i2) * (-12269)) ^ 2104457150;
                        i5 = 1797340102;
                    } else {
                        iM55680 = (C0873.m55680("ᩴۘ") ^ i2) * (-21);
                        i4 = ((iM55680 ^ i3) * 22341) ^ 1205183545;
                        i5 = 1213512525;
                    }
                    break;
                case -9773614:
                case 382760154:
                    C0946.m55980();
                    iM55680 = (C0873.m55680("᩹ۜ") + i3) * (-49);
                    i4 = ((iM55680 ^ i2) * 25789) ^ (-1610802928);
                    i5 = 1740119393;
                    break;
                case 49256107:
                case 840757604:
                    if (C1012.f81938 >= 0) {
                        iM55680 = (C0873.m55680("᩹ۜ") + i3) * (-49);
                        i4 = ((iM55680 ^ i2) * 25789) ^ (-1610802928);
                        i5 = 1740119393;
                    } else {
                        iM55680 = C0946.m55979("ܶܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 1765) ^ (-1112713096);
                        i5 = 754234007;
                    }
                    break;
                case 164025425:
                case 1063798303:
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0946.m55979("ܿۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-10225)) ^ (-175350557);
                        i5 = 329109280;
                    } else {
                        iM55680 = (C0873.m55680("᩹ۜ") + i3) * (-49);
                        i4 = ((iM55680 ^ i2) * 25789) ^ (-1610802928);
                        i5 = 1740119393;
                    }
                    break;
                case 668104594:
                case 1401440019:
                    break;
                case 893340255:
                case 934431018:
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0873.m55680("ۘ֡") ^ i3;
                        i4 = ((iM55680 ^ i2) * 9469) ^ (-1447276232);
                        i5 = -901102271;
                    } else {
                        iM55680 = C0946.m55979("ܿۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-10225)) ^ (-175350557);
                        i5 = 329109280;
                    }
                    break;
                case 1069109369:
                case 1483578644:
                    if (C0946.f81894 != 0) {
                        iM55680 = (C0946.m55979("ۖ᩶") ^ i3) * 11;
                        i4 = ((iM55680 ^ i2) * 3767) ^ 1293995526;
                        i5 = 1547244409;
                    } else {
                        iM55680 = (C0873.m55680("ۤ۬") + i3) * 55;
                        i4 = ((iM55680 ^ i2) * 16787) ^ 662805970;
                        i5 = -171264175;
                    }
                    break;
                case 1125339551:
                case 1140579077:
                    if (C1194.f82045 != 0) {
                        iM55680 = (C0873.m55680("᩹ۜ") + i3) * (-49);
                        i4 = ((iM55680 ^ i2) * 25789) ^ (-1610802928);
                        i5 = 1740119393;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۤۤ")) * (-83);
                        i4 = ((iM55680 ^ i2) * 30235) ^ 1372467933;
                        i5 = 108373892;
                    }
                    break;
                case 1415920486:
                case 2121200182:
                    if (C1028.f81950 <= 0) {
                        iM55680 = (C0946.m55979("ۖ᩶") ^ i3) * 11;
                        i4 = ((iM55680 ^ i2) * 3767) ^ 1293995526;
                        i5 = 1547244409;
                    } else {
                        iM55680 = C0946.m55979("ۙ֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27359)) ^ (-2123547432);
                        i5 = -749830917;
                    }
                    break;
                default:
                    m41525();
                    iM55680 = (C0946.m55979("ۙܿ") ^ i3) * (-123);
                    i4 = ((iM55680 ^ i2) * (-12269)) ^ 2104457150;
                    i5 = 1797340102;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m41536() {
        return this.f54484;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m41551(String str) {
        this.f54484 = str;
    }

    /* JADX INFO: renamed from: ܶ */
    public final boolean m41545() {
        return this.f54489;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m41543(boolean z) {
        this.f54489 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    private Class m41511(int i, String str) {
        Iterator itM56090 = null;
        Class cls = null;
        C12886 c12886 = null;
        Exception e = null;
        Class clsM18729 = null;
        int i2 = 207874534;
        int i3 = C0873.f81841;
        int i4 = C1012.f81938;
        int iM55680 = (i3 - C0873.m55680("ۢܶ")) * 47;
        int i5 = ((iM55680 ^ i4) * 13225) ^ (-1736783942);
        int i6 = -1457651729;
        while (true) {
            int i7 = iM55680 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * (-13677)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1967062675:
                    case 1011380125:
                        return clsM18729;
                    case -1932799701:
                    case 1513615846:
                        if (C1036.f81953 < 0) {
                            iM55680 = C0946.m55979("ۗۢ") ^ i4;
                            i5 = ((iM55680 ^ i3) * 5765) ^ (-1170689317);
                            i6 = -1137435382;
                            break;
                        }
                        iM55680 = (C0873.m55680("ۧۡ") + i3) * (-5);
                        i5 = ((iM55680 ^ i4) * 17699) ^ (-795333305);
                        i6 = -738950826;
                        break;
                    case -1787566431:
                    case -1666202124:
                        m41526(e);
                        iM55680 = C0946.m55979("ᩴܳ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 20207) ^ (-1836437902);
                        i6 = -1552333978;
                        break;
                    case -1741760835:
                    case -1469793340:
                        if (!ViewOnClickListenerC0939.m55949(c12886.f36241, str)) {
                            iM55680 = (i3 - C0873.m55680("ܶᩳ")) * (-13);
                            i5 = ((iM55680 ^ i4) * (-21157)) ^ 1045811579;
                            i6 = -68384600;
                            break;
                        }
                        iM55680 = (C0946.m55979("᩶ۜ") + i3) * 13;
                        i5 = ((iM55680 ^ i4) * 25299) ^ 1813065840;
                        i6 = 1039237270;
                        break;
                    case -1627651101:
                    case -1031001943:
                        if (!C0866.m55647(itM56090)) {
                            cls = null;
                            iM55680 = C0946.m55979("ᩴܳ") ^ i4;
                            i5 = ((iM55680 ^ i3) * 20207) ^ (-1836437902);
                            i6 = -1552333978;
                            break;
                        }
                        int iM55979 = (i4 - C0946.m55979("۠ۖ")) * (-123);
                        i5 = ((iM55979 ^ i3) * (-32493)) ^ 590615893;
                        i7 = iM55979 ^ (-485749323);
                        cls = null;
                        break;
                        break;
                    case -1613345063:
                    case -145430465:
                        if (!C0917.f81868) {
                            iM55680 = (i3 - C0946.m55979("ۗܳ")) * (-117);
                            i5 = ((iM55680 ^ i4) * (-31191)) ^ 776394871;
                            i6 = -1917561730;
                            break;
                        }
                        iM55680 = C0946.m55979("۬֨") ^ i3;
                        i5 = ((iM55680 ^ i4) * 16467) ^ 1652733700;
                        i6 = 1549171788;
                        break;
                    case -1589849633:
                    case 1307567237:
                        itM56090 = C0989.m56090(this.f54488);
                        iM55680 = (i3 - C0873.m55680("ܶᩳ")) * (-13);
                        i5 = ((iM55680 ^ i4) * (-21157)) ^ 1045811579;
                        i6 = -68384600;
                        break;
                        break;
                    case -1495816214:
                    case -1376635226:
                        if (!m41557()) {
                            iM55680 = C0946.m55979("ᩴܳ") ^ i4;
                            i5 = ((iM55680 ^ i3) * 20207) ^ (-1836437902);
                            i6 = -1552333978;
                            break;
                            break;
                        }
                        iM55680 = (C0946.m55979("֨֫") + i4) * (-109);
                        i5 = ((iM55680 ^ i3) * (-25857)) ^ (-112461427);
                        i6 = 826607390;
                        break;
                    case -1475958108:
                    case 115756854:
                        C1024.m56209();
                        return null;
                    case -1465856705:
                    case -412976068:
                        if (C0949.f81897 < 0) {
                            iM55680 = C0946.m55979("᩻᩻") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-14765)) ^ (-1732779439);
                            i6 = 1554114260;
                            break;
                        }
                        iM55680 = C0946.m55979("۬֨") ^ i3;
                        i5 = ((iM55680 ^ i4) * 16467) ^ 1652733700;
                        i6 = 1549171788;
                        break;
                        break;
                    case -1267053554:
                    case 963927071:
                        if (C1071.f81975 > 0) {
                            iM55680 = (C0946.m55979("᩷ܶ") ^ i4) * (-23);
                            i5 = ((iM55680 ^ i3) * (-8305)) ^ (-914697699);
                            i6 = -150361334;
                            break;
                        }
                        iM55680 = (C0873.m55680("ۧۡ") + i3) * (-5);
                        i5 = ((iM55680 ^ i4) * 17699) ^ (-795333305);
                        i6 = -738950826;
                        break;
                        break;
                    case -711710393:
                    case -373886308:
                        if (C0845.f81821 < 0) {
                            iM55680 = C0873.m55680("ܽۧ") ^ i3;
                            i5 = ((iM55680 ^ i4) * 23019) ^ (-1850620387);
                            i6 = -288734206;
                            break;
                        }
                        iM55680 = C0873.m55680("۠ۡ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-8699)) ^ 587923140;
                        i6 = -2121824981;
                        break;
                    case -682812753:
                    case 1701673259:
                        try {
                            clsM18729 = C8056.m18729(this.f54482, c12886.f36241);
                            iM55680 = C0873.m55680("ۧۚ") ^ i3;
                            i5 = ((iM55680 ^ i4) * 11697) ^ 563924317;
                            i6 = -797887752;
                        } catch (Exception e2) {
                            e = e2;
                            iM55680 = C0946.m55979("ܿ۬") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-923)) ^ (-212226086);
                            i6 = 543644164;
                        }
                        break;
                    case -617105812:
                    case 543818883:
                        C0927.m55873();
                        if (C0906.m55809() <= 0) {
                            iM55680 = (C0873.m55680("ܰۗ") ^ i4) * 99;
                            i5 = ((iM55680 ^ i3) * (-4501)) ^ 1180047874;
                            i6 = 1245328406;
                            break;
                        }
                        iM55680 = C0946.m55979("۬֨") ^ i3;
                        i5 = ((iM55680 ^ i4) * 16467) ^ 1652733700;
                        i6 = 1549171788;
                        break;
                        break;
                    case -456012119:
                    case 817775656:
                        C1929.m56553();
                        if (C0894.f81854 >= 0) {
                            iM55680 = (C0946.m55979("᩶᩻") ^ i4) * (-17);
                            i5 = ((iM55680 ^ i3) * 30055) ^ (-921655928);
                            i6 = 1028369535;
                            break;
                        }
                        iM55680 = C0873.m55680("۠ۡ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-8699)) ^ 587923140;
                        i6 = -2121824981;
                        break;
                        break;
                    case -378305994:
                    case 1847318185:
                        C0845.m55584();
                        if (C0866.f81837 < 0) {
                            iM55680 = C0873.m55680("ۧ۠") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-13477)) ^ (-240329588);
                            i6 = 1371883864;
                            break;
                        }
                        iM55680 = (C0946.m55979("᩶᩻") ^ i4) * (-17);
                        i5 = ((iM55680 ^ i3) * 30055) ^ (-921655928);
                        i6 = 1028369535;
                        break;
                        break;
                    case -169198866:
                    case 481161039:
                        c12886 = (C12886) C0955.m56035(itM56090);
                        if (c12886.f36242 != i) {
                            iM55680 = (i3 - C0873.m55680("ܶᩳ")) * (-13);
                            i5 = ((iM55680 ^ i4) * (-21157)) ^ 1045811579;
                            i6 = -68384600;
                            break;
                            break;
                        }
                        iM55680 = (C0873.m55680("ۙᩳ") ^ i3) * 49;
                        i5 = ((iM55680 ^ i4) * (-19003)) ^ (-1223247843);
                        i6 = -204154120;
                        break;
                    case -109150047:
                    case 1291152342:
                        if (C1046.f81962 > 0) {
                            iM55680 = C0873.m55680("᩻۬") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-10381)) ^ (-1644344626);
                            i6 = -233629272;
                            break;
                        }
                        iM55680 = (C0946.m55979("᩶᩻") ^ i4) * (-17);
                        i5 = ((iM55680 ^ i3) * 30055) ^ (-921655928);
                        i6 = 1028369535;
                        break;
                        break;
                    case 3310352:
                    case 384516177:
                        if (ViewOnClickListenerC0939.f81888 > 0) {
                            iM55680 = C0873.m55680("ۗ᩵") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-27063)) ^ (-48699929);
                            i6 = -102637952;
                            break;
                        }
                        iM55680 = (C0946.m55979("᩶᩻") ^ i4) * (-17);
                        i5 = ((iM55680 ^ i3) * 30055) ^ (-921655928);
                        i6 = 1028369535;
                        break;
                        break;
                    case 153132233:
                    case 318043915:
                        if (C1012.f81938 < 0) {
                            iM55680 = C0946.m55979("۬ۚ") ^ i3;
                            i5 = ((iM55680 ^ i4) * 19153) ^ 1125195750;
                            i6 = -983139087;
                            break;
                        }
                        iM55680 = (C0873.m55680("ܰۗ") ^ i4) * 99;
                        i5 = ((iM55680 ^ i3) * (-4501)) ^ 1180047874;
                        i6 = 1245328406;
                        break;
                        break;
                    case 256807233:
                    case 2123911565:
                        if (C1012.f81938 < 0) {
                            iM55680 = C0873.m55680("۬֫") ^ i4;
                            i5 = ((iM55680 ^ i3) * 31205) ^ 1466074632;
                            i6 = -1451297273;
                            break;
                        }
                        iM55680 = C0873.m55680("ۧ۠") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-13477)) ^ (-240329588);
                        i6 = 1371883864;
                        break;
                        break;
                    case 376316785:
                    case 1342011292:
                        return cls;
                    case 476737808:
                    case 1482124909:
                        if (!C0927.f81875) {
                            iM55680 = C0873.m55680("ᩳۘ") ^ i3;
                            i5 = ((iM55680 ^ i4) * 13839) ^ (-1273671992);
                            i6 = -696777560;
                            break;
                        }
                        iM55680 = (C0873.m55680("ۧۡ") + i3) * (-5);
                        i5 = ((iM55680 ^ i4) * 17699) ^ (-795333305);
                        i6 = -738950826;
                        break;
                        break;
                    case 1296008539:
                    case 1633163200:
                        C0854.m55595();
                        AbstractC0942.m55971();
                        iM55680 = C0946.m55979("۬֨") ^ i3;
                        i5 = ((iM55680 ^ i4) * 16467) ^ 1652733700;
                        i6 = 1549171788;
                        break;
                        break;
                    default:
                        if (C0912.f81867 > 0) {
                            iM55680 = C0873.m55680("۠ۡ") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-8699)) ^ 587923140;
                            i6 = -2121824981;
                            break;
                            break;
                        }
                        iM55680 = (C0873.m55680("ܰۗ") ^ i4) * 99;
                        i5 = ((iM55680 ^ i3) * (-4501)) ^ 1180047874;
                        i6 = 1245328406;
                        break;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x019f A[PHI: r2 r6 r8 r9
      0x019f: PHI (r2v4 char) = (r2v3 char), (r2v2 char), (r2v2 char) binds: [B:54:0x019d, B:42:0x013a, B:15:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:54:0x019d, B:42:0x013a, B:15:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r8v5 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v6 short[]) binds: [B:54:0x019d, B:42:0x013a, B:15:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r9v5 int) = (r9v2 int), (r9v2 int), (r9v6 int) binds: [B:54:0x019d, B:42:0x013a, B:15:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01d5 A[PHI: r3 r4
      0x01d5: PHI (r3v3 short) = (r3v2 short), (r3v4 short) binds: [B:58:0x01d3, B:50:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r4v3 short) = (r4v2 short), (r4v4 short) binds: [B:58:0x01d3, B:50:0x017f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0224 A[PHI: r1 r5
      0x0224: PHI (r1v7 short[]) = (r1v5 short[]), (r1v2 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:66:0x0222, B:62:0x0203, B:46:0x015c, B:16:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r5v6 int) = (r5v2 int), (r5v2 int), (r5v4 int), (r5v2 int) binds: [B:66:0x0222, B:62:0x0203, B:46:0x015c, B:16:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (p067l.C1048.f81963 != false) goto L15;
     */
    /* JADX INFO: renamed from: ܺ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC17043 m41546() {
        int iM55680;
        int i;
        int i2;
        AbstractC17043 abstractC17043M34322 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        short s3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = -1387426882;
        int i7 = C1124.f82007;
        int i8 = C1003.f81929;
        int iM55979 = C0946.m55979("ܳ۟") ^ i7;
        int i9 = ((iM55979 ^ i8) * 18567) ^ 716287545;
        int i10 = 351128904;
        while (true) {
            int i11 = iM55979 ^ i10;
            while (true) {
                i6 = ((((i6 ^ i8) * 16807) >> 31) & i9) ^ i11;
                switch (i6) {
                    case -2083939290:
                    case 826434685:
                        i4 = 41176;
                        iM55680 = C0946.m55979("ܶ᩻") ^ i8;
                        i = ((iM55680 ^ i7) * (-31071)) ^ (-1511334634);
                        i2 = -140473245;
                        i11 = iM55680 ^ i2;
                        i9 = i;
                        break;
                    case -2040286878:
                    case -707187186:
                        abstractC17043M34322 = C14976.m34322(this.f54481);
                        if (C0861.f81831) {
                            iM55680 = (i8 - C0873.m55680("᩸ۛ")) * 27;
                            i = ((iM55680 ^ i7) * 23599) ^ (-814163393);
                            i2 = -1346903297;
                        } else {
                            iM55680 = C0946.m55979("۠᩹") ^ i7;
                            i = ((iM55680 ^ i8) * 11017) ^ 601880006;
                            i2 = -1483516583;
                        }
                        i11 = iM55680 ^ i2;
                        i9 = i;
                        break;
                    case -1976687303:
                    case 1554041964:
                        C1046.m56302();
                        break;
                    case -1929649438:
                    case 288534278:
                        return C0917.m55846(abstractC17043M34322, C1194.m56386(sArr2, i5, 10, i4));
                    case -1796231049:
                    case 230878584:
                        sArr2 = f82265;
                        if (C0949.f81897 < 0) {
                            iM55979 = C0946.m55979("ܶۙ") ^ i7;
                            i9 = ((iM55979 ^ i8) * 1671) ^ 1727011865;
                            i10 = -1496311779;
                        }
                        iM55680 = (i7 - C0873.m55680("ܿᩳ")) * (-111);
                        i = ((iM55680 ^ i8) * (-32705)) ^ (-526609220);
                        i2 = -721652515;
                        i11 = iM55680 ^ i2;
                        i9 = i;
                        break;
                    case -1438960864:
                    case -194311970:
                        c = 816;
                        if (C0989.f81920 >= 0) {
                            iM55680 = (i7 - C0873.m55680("ܿᩳ")) * (-111);
                            i = ((iM55680 ^ i8) * (-32705)) ^ (-526609220);
                            i2 = -721652515;
                        } else {
                            iM55680 = (i7 - C0873.m55680("ᩳۢ")) * (-121);
                            i = ((iM55680 ^ i8) * 1727) ^ (-1752895417);
                            i2 = -755982332;
                        }
                        i11 = iM55680 ^ i2;
                        i9 = i;
                        break;
                    case -1185977871:
                    case -1135768848:
                        int i12 = s + s2;
                        i3 = i12 * i12;
                        if (C0947.m55997()) {
                            iM55680 = (C0873.m55680("ܺᩳ") ^ i8) * (-43);
                            i = ((iM55680 ^ i7) * 1405) ^ 405586026;
                            i2 = 810480061;
                        } else {
                            iM55680 = (C0946.m55979("ۤ֨") ^ i8) * (-79);
                            i = ((iM55680 ^ i7) * 9977) ^ 952094142;
                            i2 = 512611308;
                        }
                        i11 = iM55680 ^ i2;
                        i9 = i;
                        break;
                    case -1114086961:
                    case -103150829:
                        sArr = f82265;
                        if (C0892.m55749()) {
                            iM55680 = (C0873.m55680("ۤۖ") + i8) * (-7);
                            i = ((iM55680 ^ i7) * (-1859)) ^ (-1381538501);
                            i2 = 1926503243;
                        } else {
                            iM55680 = (C0873.m55680("ܺᩳ") ^ i8) * (-43);
                            i = ((iM55680 ^ i7) * 1405) ^ 405586026;
                            i2 = 810480061;
                        }
                        i11 = iM55680 ^ i2;
                        i9 = i;
                        break;
                    case -1094917961:
                    case -243686610:
                        C0894.m55769();
                        return null;
                    case -942812773:
                    case 1546086976:
                        if (C0873.f81841 <= 0) {
                            iM55680 = (C0946.m55979("᩹ۚ") + i7) * 37;
                            i = ((iM55680 ^ i8) * 23105) ^ (-1100362701);
                            i2 = 1916012764;
                        } else {
                            iM55680 = C0946.m55979("֫᩺") ^ i8;
                            i = ((iM55680 ^ i7) * (-31921)) ^ (-771286770);
                            i2 = -703423847;
                        }
                        i11 = iM55680 ^ i2;
                        i9 = i;
                        break;
                    case -559209773:
                    case 2088539457:
                        if (AbstractC0942.f81890 <= 0) {
                            iM55680 = (C0873.m55680("ܺᩳ") ^ i8) * (-43);
                            i = ((iM55680 ^ i7) * 1405) ^ 405586026;
                            i2 = 810480061;
                        } else {
                            iM55680 = C0873.m55680("᩹֡") ^ i7;
                            i = ((iM55680 ^ i8) * (-28503)) ^ (-1761186988);
                            i2 = 721013636;
                        }
                        i11 = iM55680 ^ i2;
                        i9 = i;
                        break;
                    case -342887477:
                    case 814228156:
                        s = sArr[c];
                        s2 = 5954;
                        if (C1028.f81950 <= 0) {
                            iM55680 = (C0946.m55979("᩹ۚ") + i7) * 37;
                            i = ((iM55680 ^ i8) * 23105) ^ (-1100362701);
                            i2 = 1916012764;
                        } else {
                            iM55680 = C0873.m55680("֨᩸") ^ i7;
                            i = ((iM55680 ^ i8) * (-16203)) ^ (-483725574);
                            i2 = 1417183350;
                        }
                        i11 = iM55680 ^ i2;
                        i9 = i;
                        break;
                    case 98514584:
                    case 301451864:
                        C1929.m56553();
                        iM55680 = (i7 - C0873.m55680("ܿᩳ")) * (-111);
                        i = ((iM55680 ^ i8) * (-32705)) ^ (-526609220);
                        i2 = -721652515;
                        i11 = iM55680 ^ i2;
                        i9 = i;
                        break;
                    case 121399476:
                    case 1273486889:
                        i5 = 817;
                        if (RunnableC1014.f81941 > 0) {
                            iM55979 = C0873.m55680("ۗۧ") ^ i8;
                            i9 = ((iM55979 ^ i7) * (-30479)) ^ (-780177093);
                            i10 = -1367187334;
                        }
                        iM55680 = (i7 - C0873.m55680("ܿᩳ")) * (-111);
                        i = ((iM55680 ^ i8) * (-32705)) ^ (-526609220);
                        i2 = -721652515;
                        i11 = iM55680 ^ i2;
                        i9 = i;
                        break;
                    case 568020053:
                    case 1527675425:
                        i4 = 62498;
                        iM55680 = C0946.m55979("ܶ᩻") ^ i8;
                        i = ((iM55680 ^ i7) * (-31071)) ^ (-1511334634);
                        i2 = -140473245;
                        i11 = iM55680 ^ i2;
                        i9 = i;
                        break;
                    case 836199827:
                    case 1348009457:
                        if ((s * s3) - i3 > 0) {
                            iM55680 = C0873.m55680("᩺᩶") ^ i7;
                            i = ((iM55680 ^ i8) * 30469) ^ 1134526548;
                            i2 = 1862136653;
                        } else {
                            iM55680 = (C0946.m55979("۟ᩴ") ^ i7) * (-27);
                            i = ((iM55680 ^ i8) * (-21729)) ^ (-1909817014);
                            i2 = -624530625;
                        }
                        i11 = iM55680 ^ i2;
                        i9 = i;
                        break;
                    case 995839716:
                    case 1920422023:
                        if (RunnableC0871.f81839 >= 0) {
                            iM55979 = C0946.m55979("۠ۢ") ^ i8;
                            i9 = ((iM55979 ^ i7) * (-22873)) ^ 1073830046;
                            i10 = 2128168966;
                        }
                        iM55680 = C0946.m55979("۠᩹") ^ i7;
                        i = ((iM55680 ^ i8) * 11017) ^ 601880006;
                        i2 = -1483516583;
                        i11 = iM55680 ^ i2;
                        i9 = i;
                        break;
                    case 1108170368:
                    case 1687479133:
                        s3 = 23816;
                        if (C0863.f81833 <= 0) {
                            iM55680 = (i7 - C0873.m55680("ܿᩳ")) * (-111);
                            i = ((iM55680 ^ i8) * (-32705)) ^ (-526609220);
                            i2 = -721652515;
                        } else {
                            iM55680 = C0946.m55979("ۗۖ") ^ i8;
                            i = ((iM55680 ^ i7) * 12171) ^ (-1642719294);
                            i2 = 330229540;
                        }
                        i11 = iM55680 ^ i2;
                        i9 = i;
                        break;
                    default:
                        if (C0894.m55769() >= 0) {
                            iM55680 = (C0873.m55680("ܺᩳ") ^ i8) * (-43);
                            i = ((iM55680 ^ i7) * 1405) ^ 405586026;
                            i2 = 810480061;
                            i11 = iM55680 ^ i2;
                            i9 = i;
                        }
                        iM55680 = (i7 - C0873.m55680("ܿᩳ")) * (-111);
                        i = ((iM55680 ^ i8) * (-32705)) ^ (-526609220);
                        i2 = -721652515;
                        i11 = iM55680 ^ i2;
                        i9 = i;
                        break;
                }
            }
        }
    }

    public final void finalize() {
        m41525();
    }

    /* JADX INFO: renamed from: ۧ */
    public final Class m41541(String str) {
        return m41511(2, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Class m41524(String str) {
        return m41511(3, str);
    }

    /* JADX INFO: renamed from: ܽ */
    public final Class m41547(String str) {
        return m41511(4, str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m41554(ArrayList arrayList) {
        m41517(arrayList, 1);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m41542(ArrayList arrayList) {
        m41517(arrayList, 2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41527(ArrayList arrayList) {
        m41517(arrayList, 3);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m41549(ArrayList arrayList) {
        m41517(arrayList, 4);
    }

    public final String toString() {
        int iM55979;
        int i;
        JSONException e = null;
        Iterator itM56090 = null;
        boolean zM55886 = false;
        String str = null;
        String strM55639 = null;
        int i2 = 0;
        int i3 = -714340915;
        int i4 = ServiceConnectionC1013.f81940;
        int i5 = C1229.f82066;
        int iM55680 = C0873.m55680("ۢۘ") ^ i4;
        int i6 = ((iM55680 ^ i5) * (-8769)) ^ 618507457;
        int i7 = iM55680 ^ (-471310795);
        JSONArray jSONArray = null;
        JSONObject jSONObject = null;
        while (true) {
            i3 = ((((i3 ^ i5) * (-13379)) >> 31) & i6) ^ i7;
            switch (i3) {
                case -2039453096:
                case -1008831681:
                    jSONObject.put(RunnableC0897.m55783(f82265, 502, 10, i2), jSONArray);
                    jSONObject.put(C1025.m56233(f82265, 526, 6, i2), this.f54503);
                    jSONObject.put(RunnableC1014.m56180(f82265, 532, 3, i2), this.f54484);
                    jSONObject.put(C1048.m56318(f82265, 535, 7, i2), this.f54491);
                    jSONObject.put(C0845.m55592(f82265, 542, 8, i2), this.f54501);
                    jSONObject.put(C1404.m56462(f82265, 550, 17, i2), this.f54489);
                    strM55639 = C0863.m55639(jSONObject);
                    iM55979 = (C0873.m55680("֫ۗ") + i5) * 5;
                    i6 = 1000694633 ^ ((iM55979 ^ i4) * (-15899));
                    i = -589391506;
                    i7 = i ^ iM55979;
                    break;
                case -1543260207:
                case -1448840368:
                    str = this.f54483;
                    iM55979 = C0873.m55680("ܽܰ") ^ i5;
                    i6 = 1901095032 ^ ((iM55979 ^ i4) * (-11575));
                    i = -1283094935;
                    i7 = i ^ iM55979;
                    break;
                case -1543256992:
                case -823407922:
                    return C0845.m55591(e);
                case -1519783311:
                case 85784915:
                    return strM55639;
                case -1420542388:
                case 1256792560:
                    zM55886 = C0930.m55886(itM56090);
                    iM55979 = (i5 - C0946.m55979("ۚۖ")) * 57;
                    i6 = (-181690658) ^ ((iM55979 ^ i4) * 27085);
                    i = 585852146;
                    i7 = i ^ iM55979;
                    break;
                case -1132431231:
                case 1788032056:
                    if (zM55886) {
                        iM55979 = C0946.m55979("᩶ۜ") ^ i4;
                        i6 = (-1002112185) ^ ((iM55979 ^ i5) * 4171);
                        i = -717401682;
                    } else {
                        iM55979 = (C0873.m55680("ۤᩳ") ^ i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = (-504780903) ^ ((iM55979 ^ i4) * 32053);
                        i = 581171096;
                    }
                    i7 = i ^ iM55979;
                    break;
                case -783475967:
                case 41264317:
                    if (str != null) {
                        iM55979 = C0873.m55680("᩷᩷") ^ i4;
                        i6 = (-1086853260) ^ ((iM55979 ^ i5) * (-21075));
                        i = -332922015;
                    } else {
                        iM55979 = (C0946.m55979("ۘۚ") ^ i4) * (-19);
                        i6 = (-2134982318) ^ ((iM55979 ^ i5) * 27913);
                        i = -1434845515;
                    }
                    i7 = i ^ iM55979;
                    break;
                case -654223922:
                case 14465265:
                    try {
                        jSONObject.put(C0949.m56016(f82265, 512, 14, i2), str);
                        iM55979 = (C0946.m55979("ۘۚ") ^ i4) * (-19);
                        i6 = (-2134982318) ^ ((iM55979 ^ i5) * 27913);
                        i = -1434845515;
                    } catch (JSONException e2) {
                        e = e2;
                        iM55979 = C0946.m55979("۟ᩴ") ^ i4;
                        i6 = 785957904 ^ ((iM55979 ^ i5) * 13567);
                        i = 572313803;
                    }
                    i7 = i ^ iM55979;
                    break;
                case -413156110:
                case 1434881312:
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put(C0930.m55893(f82265, 410, 17, i2), this.f54497);
                        jSONObject.put(C0873.m55689(f82265, 427, 14, i2), this.f54498);
                        jSONObject.put(C1071.m56336(f82265, 441, 16, i2), this.f54492);
                        jSONObject.put(C0882.m55717(f82265, 457, 8, i2), this.f54481);
                        jSONObject.put(C0845.m55592(f82265, 465, 11, i2), this.f54502);
                        jSONObject.put(C1017.m56189(f82265, 476, 11, i2), this.f54499);
                        jSONObject.put(C1929.m56558(f82265, 487, 4, i2), this.f54480);
                        jSONObject.put(C1025.m56233(f82265, 491, 11, i2), this.f54495);
                        try {
                            jSONArray = new JSONArray();
                            itM56090 = C0989.m56090(this.f54488);
                            iM55979 = (i4 - C0946.m55979("֡ܺ")) * (-41);
                            i6 = (-854601506) ^ ((iM55979 ^ i5) * (-28733));
                            i = -1489832451;
                        } catch (JSONException e3) {
                            e = e3;
                            jSONArray = null;
                            iM55979 = C0946.m55979("۟ᩴ") ^ i4;
                            i6 = 785957904 ^ ((iM55979 ^ i5) * 13567);
                            i = 572313803;
                        }
                    } catch (JSONException e4) {
                        e = e4;
                        jSONObject = null;
                    }
                    i7 = i ^ iM55979;
                    break;
                case 253720435:
                case 2019961357:
                    short s = f82265[409];
                    if (((s * s) + 162307600) - (s * 25480) >= 0) {
                        iM55979 = (i4 - C0873.m55680("ܽ᩸")) * 53;
                        i6 = 605665951 ^ ((iM55979 ^ i5) * (-9827));
                        i = -967012671;
                    } else {
                        iM55979 = C0946.m55979("֫᩵") ^ i5;
                        i6 = 599296424 ^ ((iM55979 ^ i4) * 9835);
                        i = -1453961464;
                    }
                    i7 = i ^ iM55979;
                    break;
                case 413548645:
                case 711659986:
                    i2 = 65061;
                    iM55979 = C0873.m55680("ۚ᩺") ^ i5;
                    i6 = (-1260906397) ^ ((iM55979 ^ i4) * 21175);
                    i = -461986169;
                    i7 = i ^ iM55979;
                    break;
                case 969515000:
                case 2104305988:
                    C12886 c12886 = (C12886) C0955.m56035(itM56090);
                    jSONArray.put(c12886.m29513());
                    jSONArray.put(c12886.m29516());
                    iM55979 = (i4 - C0946.m55979("֡ܺ")) * (-41);
                    i6 = (-854601506) ^ ((iM55979 ^ i5) * (-28733));
                    i = -1489832451;
                    i7 = i ^ iM55979;
                    break;
                default:
                    i2 = 23951;
                    iM55979 = C0873.m55680("ۚ᩺") ^ i5;
                    i6 = (-1260906397) ^ ((iM55979 ^ i4) * 21175);
                    i = -461986169;
                    i7 = i ^ iM55979;
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ca, code lost:
    
        if (p067l.C0992.f81922 >= 0) goto L20;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C18249 m41515(JSONObject jSONObject) throws JSONException {
        short[] sArr;
        int i;
        C18249 c18249;
        JSONArray jSONArray;
        short[] sArr2;
        int iM55979;
        int i2;
        int i3;
        short[] sArr3;
        short s;
        int iM55680;
        int i4;
        int iM55681;
        int i5;
        int i6;
        int i7;
        C18249 c182410;
        short[] sArr4;
        int iM559710;
        int i8;
        short[] sArr5;
        int i9;
        int i10;
        C18249 c182411;
        boolean z;
        JSONObject jSONObject2 = jSONObject;
        int i11 = C0863.f81833;
        int i12 = C0894.f81854;
        int iM55682 = C0873.m55680("ۨۢ") ^ i11;
        int i13 = ((iM55682 ^ i12) * (-14487)) ^ 1533945538;
        JSONArray jSONArray2 = null;
        String strM55993 = null;
        C12886 c12886 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        int i14 = iM55682 ^ (-1016862234);
        C18249 c182412 = null;
        boolean z2 = false;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        char c = 0;
        short s2 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = -2048534535;
        int i24 = 0;
        short[] sArr10 = null;
        int i25 = 0;
        while (true) {
            i23 = i14 ^ (i13 & (((i23 ^ i12) * 12119) >> 31));
            switch (i23) {
                case -2142941477:
                case 2089693630:
                    c182412.f54484 = C1929.m56556(jSONObject2, C1404.m56462(sArr8, i17, i19, i20));
                    sArr9 = f82265;
                    if (C0898.f81858 > 0) {
                        iM55979 = (i12 - C0873.m55680("ۙ᩹")) * 23;
                        i2 = ((iM55979 ^ i11) * (-9023)) ^ (-1763430693);
                        i3 = 553909217;
                        i14 = iM55979 ^ i3;
                        i13 = i2;
                    } else {
                        sArr10 = sArr10;
                        i22 = i22;
                        c182412 = c182412;
                        iM55680 = (i12 - C0946.m55979("ܿᩴ")) * (-121);
                        i13 = ((iM55680 ^ i11) * 4369) ^ 1996413897;
                        i4 = -1474702845;
                        i7 = iM55680 ^ i4;
                        i22 = i22;
                        c182412 = c182412;
                        sArr10 = sArr10;
                        i14 = i7;
                        jSONObject2 = jSONObject;
                    }
                    break;
                case -2121893181:
                case -1377283518:
                    sArr10 = sArr10;
                    i22 = i22;
                    c182412 = new C18249();
                    c182412.m41520(jSONObject2);
                    sArr7 = f82265;
                    if (C0861.f81831) {
                        int iM55683 = C0873.m55680("ᩳᩳ") ^ i11;
                        i22 = i22;
                        sArr10 = sArr10;
                        i14 = iM55683 ^ 266352282;
                        i13 = ((iM55683 ^ i12) * (-21223)) ^ 342612076;
                    } else {
                        s = s2;
                        int iM559711 = C0946.m55979("ۢ᩹") ^ i11;
                        s2 = s;
                        i13 = ((iM559711 ^ i12) * (-16155)) ^ (-43135577);
                        i7 = iM559711 ^ 455134929;
                        i22 = i22;
                        sArr10 = sArr10;
                        i14 = i7;
                    }
                    jSONObject2 = jSONObject;
                    break;
                case -2009557944:
                case 932904231:
                    c12886 = new C12886();
                    i16 = i15 + 1;
                    if (C0937.m55918() < 0) {
                        iM55979 = (C0873.m55680("ۢ᩸") + i12) * (-47);
                        i2 = ((iM55979 ^ i11) * 23287) ^ (-2015437480);
                        i3 = -488622267;
                        i14 = iM55979 ^ i3;
                        i13 = i2;
                    } else {
                        sArr5 = sArr10;
                        i9 = i22;
                        c182411 = c182412;
                        z = z2;
                        i10 = i24;
                        int iM55684 = C0873.m55680("ۙۖ") ^ i11;
                        short[] sArr11 = sArr5;
                        i13 = ((iM55684 ^ i12) * 17569) ^ 769343690;
                        i24 = i10;
                        z2 = z;
                        c182412 = c182411;
                        sArr10 = sArr11;
                        i14 = iM55684 ^ 1176277202;
                        i22 = i9;
                    }
                    break;
                case -1968845745:
                case 1352947867:
                    C0917.m55854();
                    if (C0912.f81867 <= 0) {
                        sArr5 = sArr10;
                        i9 = i22;
                        c182411 = c182412;
                        z = z2;
                        i10 = i24;
                        int iM55685 = C0873.m55680("ۙۖ") ^ i11;
                        short[] sArr12 = sArr5;
                        i13 = ((iM55685 ^ i12) * 17569) ^ 769343690;
                        i24 = i10;
                        z2 = z;
                        c182412 = c182411;
                        sArr10 = sArr12;
                        i14 = iM55685 ^ 1176277202;
                        i22 = i9;
                    } else {
                        sArr4 = sArr10;
                        c182410 = c182412;
                        iM559710 = (i12 - C0873.m55680("ۚۖ")) * (-69);
                        i2 = ((iM559710 ^ i11) * (-25025)) ^ 1256845679;
                        i8 = 1211313364;
                        i14 = iM559710 ^ i8;
                        c182412 = c182410;
                        sArr10 = sArr4;
                        i13 = i2;
                    }
                    break;
                case -1914593456:
                case -466956758:
                    c12886.m29515(jSONArray2.getString(i15));
                    if (C1017.f81942 < 0) {
                        iM55979 = C0873.m55680("ܰ᩶") ^ i11;
                        i2 = ((iM55979 ^ i12) * (-27163)) ^ (-254950751);
                        i3 = 1059887882;
                        i14 = iM55979 ^ i3;
                        i13 = i2;
                    }
                    sArr4 = sArr10;
                    c182410 = c182412;
                    iM559710 = (i12 - C0873.m55680("ۚۖ")) * (-69);
                    i2 = ((iM559710 ^ i11) * (-25025)) ^ 1256845679;
                    i8 = 1211313364;
                    i14 = iM559710 ^ i8;
                    c182412 = c182410;
                    sArr10 = sArr4;
                    i13 = i2;
                    break;
                case -1800342834:
                case 1198893243:
                    strM55993 = C0947.m55993(sArr9, 140, 17, i20);
                    if (jSONObject2.has(strM55993)) {
                        iM55979 = (C0873.m55680("᩹֨") ^ i12) * (-107);
                        i2 = ((iM55979 ^ i11) * (-29777)) ^ (-2131314742);
                        i3 = 1866997343;
                    } else {
                        iM55979 = (C0946.m55979("ۨۤ") + i11) * 27;
                        i2 = ((iM55979 ^ i12) * 10407) ^ 143624790;
                        i3 = 379199546;
                    }
                    i14 = iM55979 ^ i3;
                    i13 = i2;
                    break;
                case -1780733949:
                case -481382113:
                    i20 = 31268;
                    iM55680 = (C0946.m55979("᩸ܽ") + i12) * (-59);
                    i13 = ((iM55680 ^ i11) * 16853) ^ 313999666;
                    i4 = -451837787;
                    i7 = iM55680 ^ i4;
                    i22 = i22;
                    c182412 = c182412;
                    sArr10 = sArr10;
                    i14 = i7;
                    jSONObject2 = jSONObject;
                    break;
                case -1764586229:
                case 1307550918:
                    C1124.m56367();
                    ViewOnClickListenerC0939.m55941();
                    iM55979 = (C0873.m55680("ۙ᩺") + i12) * (-3);
                    i2 = ((iM55979 ^ i11) * (-27583)) ^ 1033958822;
                    i3 = -207907795;
                    i14 = iM55979 ^ i3;
                    i13 = i2;
                    break;
                case -1614503750:
                case -1305180863:
                    c182412.f54489 = jSONObject2.getBoolean(strM55993);
                    iM55979 = (C0946.m55979("ۨۤ") + i11) * 27;
                    i2 = ((iM55979 ^ i12) * 10407) ^ 143624790;
                    i3 = 379199546;
                    i14 = iM55979 ^ i3;
                    i13 = i2;
                    break;
                case -1542539345:
                case 1207009098:
                    C1012.m56134();
                    C1053.m56327();
                    return null;
                case -1339558060:
                case -986092022:
                    sArr10 = sArr10;
                    i22 = i22;
                    c182412 = c182412;
                    short s3 = s2;
                    if ((s3 * 28556) - (i21 + 203861284) > 0) {
                        iM55681 = (i12 - C0873.m55680("֡ۡ")) * 67;
                        i5 = ((iM55681 ^ i11) * (-9257)) ^ 1609967132;
                        i6 = 201286590;
                    } else {
                        iM55681 = C0873.m55680("ܿۜ") ^ i11;
                        i5 = ((iM55681 ^ i12) * (-14235)) ^ (-829199275);
                        i6 = -1925739393;
                    }
                    i7 = iM55681 ^ i6;
                    s2 = s3;
                    i13 = i5;
                    i22 = i22;
                    c182412 = c182412;
                    sArr10 = sArr10;
                    i14 = i7;
                    jSONObject2 = jSONObject;
                    break;
                case -1245277947:
                case -430657691:
                    if (i15 >= jSONArray2.length()) {
                        sArr = sArr10;
                        i = i22;
                        c18249 = c182412;
                        short[] sArr13 = sArr7;
                        jSONArray = jSONArray2;
                        sArr2 = sArr13;
                        int iM55686 = (C0873.m55680("ܿۡ") + i11) * 41;
                        i22 = i;
                        sArr3 = sArr;
                        i14 = iM55686 ^ (-1215015385);
                        i13 = ((iM55686 ^ i12) * (-1351)) ^ 662615507;
                        c182412 = c18249;
                        sArr10 = sArr3;
                        JSONArray jSONArray3 = jSONArray;
                        sArr7 = sArr2;
                        jSONArray2 = jSONArray3;
                    } else {
                        iM55979 = C0946.m55979("ۗۧ") ^ i11;
                        i2 = ((iM55979 ^ i12) * (-6389)) ^ (-1129411609);
                        i3 = -1865216583;
                        i14 = iM55979 ^ i3;
                        i13 = i2;
                    }
                    break;
                case -1233289323:
                case 399626985:
                    c182412.m41518((C19561) null);
                    return c182412;
                case -1212946753:
                case -236831642:
                    sArr10 = sArr10;
                    i22 = i22;
                    c182412 = c182412;
                    s2 = sArr6[c];
                    i21 = s2 * s2;
                    if (C0927.f81875) {
                        iM55680 = (i12 - C0946.m55979("ܿᩴ")) * (-121);
                        i13 = ((iM55680 ^ i11) * 4369) ^ 1996413897;
                        i4 = -1474702845;
                    } else {
                        iM55680 = (i12 - C0946.m55979("᩶ۢ")) * (-101);
                        i13 = ((iM55680 ^ i11) * 9257) ^ 16063808;
                        i4 = -170566683;
                    }
                    i7 = iM55680 ^ i4;
                    i22 = i22;
                    c182412 = c182412;
                    sArr10 = sArr10;
                    i14 = i7;
                    jSONObject2 = jSONObject;
                    break;
                case -1080115799:
                case 1686525142:
                    sArr5 = sArr10;
                    i9 = i22;
                    i10 = i24;
                    c182411 = c182412;
                    z = jSONObject2.getBoolean(C1012.m56144(sArr5, i9, i10, i20));
                    if (C0892.f81851) {
                        int iM55687 = C0873.m55680("ۡܰ") ^ i12;
                        i24 = i10;
                        z2 = z;
                        i22 = i9;
                        i14 = iM55687 ^ (-1313474126);
                        i13 = ((iM55687 ^ i11) * 14267) ^ (-685522173);
                        c182412 = c182411;
                        sArr10 = sArr5;
                    } else {
                        int iM55688 = C0873.m55680("ۙۖ") ^ i11;
                        short[] sArr14 = sArr5;
                        i13 = ((iM55688 ^ i12) * 17569) ^ 769343690;
                        i24 = i10;
                        z2 = z;
                        c182412 = c182411;
                        sArr10 = sArr14;
                        i14 = iM55688 ^ 1176277202;
                        i22 = i9;
                    }
                    break;
                case -615831094:
                case 667361613:
                    i25 = i15 + 2;
                    i18 = jSONArray2.getInt(i16);
                    if (!C0955.f81898) {
                        iM55979 = (C0873.m55680("ܶ۬") + i11) * (-41);
                        i2 = ((iM55979 ^ i12) * (-3411)) ^ (-1290262558);
                        i3 = -57379421;
                        i14 = iM55979 ^ i3;
                        i13 = i2;
                    } else {
                        sArr10 = sArr10;
                        i22 = i22;
                        c182412 = c182412;
                        iM55680 = (i12 - C0946.m55979("ܿᩴ")) * (-121);
                        i13 = ((iM55680 ^ i11) * 4369) ^ 1996413897;
                        i4 = -1474702845;
                        i7 = iM55680 ^ i4;
                        i22 = i22;
                        c182412 = c182412;
                        sArr10 = sArr10;
                        i14 = i7;
                        jSONObject2 = jSONObject;
                    }
                    break;
                case -611813859:
                case -50744515:
                    s = s2;
                    sArr10 = sArr10;
                    i22 = i22;
                    c182412 = c182412;
                    sArr6 = f82265;
                    c = 'x';
                    if (C1036.f81953 < 0) {
                        s2 = s;
                        iM55680 = C0873.m55680("᩻ܳ") ^ i11;
                        i13 = ((iM55680 ^ i12) * 2501) ^ 1781396201;
                        i4 = -385203329;
                        i7 = iM55680 ^ i4;
                        i22 = i22;
                        c182412 = c182412;
                        sArr10 = sArr10;
                        i14 = i7;
                        jSONObject2 = jSONObject;
                    } else {
                        c182412 = c182412;
                        int iM559712 = C0946.m55979("ۢ᩹") ^ i11;
                        s2 = s;
                        i13 = ((iM559712 ^ i12) * (-16155)) ^ (-43135577);
                        i7 = iM559712 ^ 455134929;
                        i22 = i22;
                        sArr10 = sArr10;
                        i14 = i7;
                        jSONObject2 = jSONObject;
                    }
                    break;
                case -21418414:
                case 2082837768:
                    c12886.m29514(i18);
                    C1194.m56393(c182412.f54488, c12886);
                    i15 = i25;
                    iM55979 = C0873.m55680("ۤ᩺") ^ i12;
                    i2 = ((iM55979 ^ i11) * 11385) ^ 1170003950;
                    i3 = 952001658;
                    i14 = iM55979 ^ i3;
                    i13 = i2;
                    break;
                case 63660551:
                case 469874811:
                    break;
                case 127901069:
                case 1246140636:
                    c182410 = c182412;
                    sArr4 = f82265;
                    i22 = 131;
                    i24 = 6;
                    if (RunnableC0871.f81839 >= 0) {
                        iM559710 = (i12 - C0873.m55680("ۚۖ")) * (-69);
                        i2 = ((iM559710 ^ i11) * (-25025)) ^ 1256845679;
                        i8 = 1211313364;
                    } else {
                        iM559710 = (i12 - C0946.m55979("ۡۖ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i2 = ((iM559710 ^ i11) * 3595) ^ 75765424;
                        i8 = -1904741350;
                    }
                    i14 = iM559710 ^ i8;
                    c182412 = c182410;
                    sArr10 = sArr4;
                    i13 = i2;
                    break;
                case 231117285:
                case 1029719919:
                    i20 = 61202;
                    iM55680 = (C0946.m55979("᩸ܽ") + i12) * (-59);
                    i13 = ((iM55680 ^ i11) * 16853) ^ 313999666;
                    i4 = -451837787;
                    i7 = iM55680 ^ i4;
                    i22 = i22;
                    c182412 = c182412;
                    sArr10 = sArr10;
                    i14 = i7;
                    jSONObject2 = jSONObject;
                    break;
                case 319285162:
                case 1020076212:
                    c182412.f54503 = z2;
                    sArr8 = f82265;
                    i17 = 137;
                    i19 = 3;
                    if (!C0927.f81875) {
                        iM55979 = (C0946.m55979("۬ᩴ") + i11) * (-85);
                        i2 = ((iM55979 ^ i12) * 10157) ^ 2040399559;
                        i3 = -987985731;
                        i14 = iM55979 ^ i3;
                        i13 = i2;
                    } else {
                        sArr10 = sArr10;
                        i22 = i22;
                        c182412 = c182412;
                        iM55680 = (i12 - C0946.m55979("ܿᩴ")) * (-121);
                        i13 = ((iM55680 ^ i11) * 4369) ^ 1996413897;
                        i4 = -1474702845;
                        i7 = iM55680 ^ i4;
                        i22 = i22;
                        c182412 = c182412;
                        sArr10 = sArr10;
                        i14 = i7;
                        jSONObject2 = jSONObject;
                    }
                    break;
                case 793558275:
                case 1206380927:
                    i15 = 0;
                    iM55979 = C0873.m55680("ۤ᩺") ^ i12;
                    i2 = ((iM55979 ^ i11) * 11385) ^ 1170003950;
                    i3 = 952001658;
                    i14 = iM55979 ^ i3;
                    i13 = i2;
                    break;
                case 881152657:
                case 1593247950:
                    if (C1025.f81947 < 0) {
                        s = s2;
                        sArr10 = sArr10;
                        i22 = i22;
                        int iM559713 = C0946.m55979("ۢ᩹") ^ i11;
                        s2 = s;
                        i13 = ((iM559713 ^ i12) * (-16155)) ^ (-43135577);
                        i7 = iM559713 ^ 455134929;
                        i22 = i22;
                        sArr10 = sArr10;
                        i14 = i7;
                        jSONObject2 = jSONObject;
                    } else {
                        sArr4 = sArr10;
                        c182410 = c182412;
                        iM559710 = (i12 - C0873.m55680("ۚۖ")) * (-69);
                        i2 = ((iM559710 ^ i11) * (-25025)) ^ 1256845679;
                        i8 = 1211313364;
                        i14 = iM559710 ^ i8;
                        c182412 = c182410;
                        sArr10 = sArr4;
                        i13 = i2;
                    }
                    break;
                default:
                    sArr = sArr10;
                    i = i22;
                    c18249 = c182412;
                    sArr2 = sArr7;
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(C1025.m56233(sArr2, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 10, i20));
                    if (jSONArrayOptJSONArray != null) {
                        int iM55689 = C0873.m55680("ᩳ֡") ^ i11;
                        jSONArray = jSONArrayOptJSONArray;
                        i13 = ((iM55689 ^ i12) * 16259) ^ 1891653838;
                        i22 = i;
                        sArr3 = sArr;
                        i14 = iM55689 ^ 1594856432;
                    } else {
                        jSONArray = jSONArrayOptJSONArray;
                        int iM556810 = (C0873.m55680("ܿۡ") + i11) * 41;
                        i22 = i;
                        sArr3 = sArr;
                        i14 = iM556810 ^ (-1215015385);
                        i13 = ((iM556810 ^ i12) * (-1351)) ^ 662615507;
                    }
                    c182412 = c18249;
                    sArr10 = sArr3;
                    JSONArray jSONArray4 = jSONArray;
                    sArr7 = sArr2;
                    jSONArray2 = jSONArray4;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01e3 A[PHI: r8
      0x01e3: PHI (r8v5 java.lang.String) = (r8v4 java.lang.String), (r8v2 java.lang.String) binds: [B:57:0x01c9, B:44:0x013b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0243 A[PHI: r7
      0x0243: PHI (r7v5 java.lang.String) = (r7v4 java.lang.String), (r7v2 java.lang.String) binds: [B:64:0x0229, B:53:0x019f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0283 A[PHI: r6
      0x0283: PHI (r6v5 java.lang.String) = (r6v4 java.lang.String), (r6v2 java.lang.String), (r6v2 java.lang.String) binds: [B:68:0x0269, B:61:0x0203, B:51:0x0194] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:77:0x02df A[PHI: r5
      0x02df: PHI (r5v5 java.lang.String) = (r5v4 java.lang.String), (r5v2 java.lang.String) binds: [B:76:0x02dd, B:22:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0344 A[PHI: r14
      0x0344: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]) binds: [B:84:0x0342, B:80:0x031e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a8, code lost:
    
        if (p067l.C0927.f81875 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
    
        if (p067l.C1071.f81975 <= 0) goto L8;
     */
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m41520(JSONObject jSONObject) throws JSONException {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int i4;
        int iM559711;
        int i5;
        int i6;
        String str;
        int i7 = C0845.f81821;
        int i8 = C1012.f81938;
        int iM55680 = (i8 - C0873.m55680("ܺۡ")) * (-123);
        int i9 = ((iM55680 ^ i7) * (-397)) ^ (-254722243);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i10 = iM55680 ^ 361385811;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i14 = -207519526;
        String strM55863 = null;
        String strM56584 = null;
        String strM55810 = null;
        String strM56161 = null;
        String strM56077 = null;
        String strM56144 = null;
        String strM55993 = null;
        String strM55792 = null;
        while (true) {
            i14 = i10 ^ (i9 & (((i14 ^ i7) * 20401) >> 31));
            switch (i14) {
                case -2133542790:
                case 1040201573:
                    strM55863 = C0927.m55863(f82265, 369, 8, i13);
                    if (jSONObject.has(strM55863)) {
                        iM55979 = C0873.m55680("۫ۨ") ^ i7;
                        i = ((iM55979 ^ i8) * 8415) ^ (-1678609695);
                        i2 = -238179887;
                    } else {
                        iM55979 = (C0873.m55680("ۗ۠") ^ i8) * (-47);
                        i = ((iM55979 ^ i7) * 3239) ^ 1401388868;
                        i2 = -1467039729;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -2050349096:
                case -726079724:
                    i13 = 1316;
                    iM559710 = (i7 - C0946.m55979("ۜ֡")) * 9;
                    i3 = ((iM559710 ^ i8) * (-30057)) ^ (-1740847770);
                    i4 = 1359582632;
                    int i15 = iM559710 ^ i4;
                    sArr2 = sArr2;
                    i9 = i3;
                    str = strM55993;
                    i10 = i15;
                    strM55993 = str;
                    break;
                case -1833407747:
                case 1141767876:
                    strM55993 = C0947.m55993(f82265, 273, 11, i13);
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0873.m55680("ۜ֫") ^ i8;
                        i = ((iM55979 ^ i7) * 27115) ^ 1396055736;
                        i2 = -888615791;
                    } else {
                        iM55979 = C0946.m55979("᩷ۛ") ^ i8;
                        i = ((iM55979 ^ i7) * (-14263)) ^ 1590938579;
                        i2 = -1424081;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -1784464164:
                case 555939811:
                    strM55993 = strM55993;
                    sArr2 = sArr2;
                    if (((s * s) + 264680361) - (s * s2) < 0) {
                        iM559710 = C0873.m55680("ܿᩴ") ^ i7;
                        i3 = ((iM559710 ^ i8) * 30653) ^ 1446542034;
                        i4 = 2037367174;
                    } else {
                        iM559710 = (C0873.m55680("ۛܰ") + i8) * (-81);
                        i3 = ((iM559710 ^ i7) * (-20609)) ^ 2087604171;
                        i4 = 1441153138;
                    }
                    int i16 = iM559710 ^ i4;
                    sArr2 = sArr2;
                    i9 = i3;
                    str = strM55993;
                    i10 = i16;
                    strM55993 = str;
                    break;
                case -1776213415:
                case 1882723391:
                    strM56161 = ServiceConnectionC1013.m56161(f82265, 313, 14, i13);
                    if (jSONObject.has(strM56161)) {
                        iM55979 = (C0873.m55680("֨ۨ") + i7) * (-89);
                        i = ((iM55979 ^ i8) * (-27223)) ^ 1497200460;
                        i2 = -1048143646;
                    } else {
                        iM55979 = (C0946.m55979("ۙ֡") ^ i7) * 11;
                        i = ((iM55979 ^ i8) * (-9981)) ^ (-443385123);
                        i2 = -1391254079;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -1725950307:
                case 1192833151:
                    throw new JSONException(C1229.m56403(f82265, 257, 16, i13));
                case -1607048040:
                case -294907760:
                    throw new JSONException(C1071.m56336(f82265, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, 21, i13));
                case -1602145318:
                case 501424523:
                    C0877.m55696();
                    break;
                case -1576778137:
                case 1209765032:
                    strM55993 = strM55993;
                    sArr2 = sArr2;
                    int iM56279 = C1044.m56279(jSONObject, C0873.m55689(sArr2, i11, i12, i13));
                    this.f54492 = iM56279;
                    if (iM56279 > 0) {
                        iM559710 = (i7 - C0946.m55979("᩷ۢ")) * (-63);
                        i3 = ((iM559710 ^ i8) * (-17493)) ^ (-242472562);
                        i4 = 2046549240;
                    } else {
                        iM559710 = (i8 - C0873.m55680("ۧ֨")) * (-83);
                        i3 = ((iM559710 ^ i7) * 3225) ^ 2108610808;
                        i4 = -1530808405;
                    }
                    int i17 = iM559710 ^ i4;
                    sArr2 = sArr2;
                    i9 = i3;
                    str = strM55993;
                    i10 = i17;
                    strM55993 = str;
                    break;
                case -1550832020:
                case 1488922027:
                    C0947.m55997();
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0873.m55680("᩻ᩴ") ^ i8;
                        i = ((iM55979 ^ i7) * (-2875)) ^ (-521112589);
                        i2 = -1460390406;
                    } else {
                        iM55979 = (C0873.m55680("ܰ᩺") ^ i7) * (-67);
                        i = ((iM55979 ^ i8) * 14861) ^ (-1376783140);
                        i2 = 208141580;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -1484316490:
                case -336629219:
                    strM56144 = C1012.m56144(f82265, 288, 11, i13);
                    if (C0892.f81851) {
                        iM55979 = (C0873.m55680("ۗۚ") + i7) * (-99);
                        i = ((iM55979 ^ i8) * (-6015)) ^ (-1082073402);
                        i2 = -1564810185;
                    } else {
                        iM55979 = (C0873.m55680("ܰ᩺") ^ i7) * (-67);
                        i = ((iM55979 ^ i8) * 14861) ^ (-1376783140);
                        i2 = 208141580;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -1378697480:
                case 790885070:
                    strM55993 = strM55993;
                    strM55792 = C0898.m55792(f82265, 238, 8, i13);
                    if (RunnableC0871.m55672() < 0) {
                        iM559711 = (C0873.m55680("ۙ۬") ^ i7) * (-17);
                        i5 = ((iM559711 ^ i8) * 22819) ^ (-316042045);
                        i6 = 1586477656;
                        str = strM55993;
                        i10 = iM559711 ^ i6;
                        i9 = i5;
                        strM55993 = str;
                    }
                    sArr2 = sArr2;
                    iM559710 = C0946.m55979("᩵۠") ^ i8;
                    i3 = ((iM559710 ^ i7) * (-219)) ^ 104615253;
                    i4 = 1213577728;
                    int i18 = iM559710 ^ i4;
                    sArr2 = sArr2;
                    i9 = i3;
                    str = strM55993;
                    i10 = i18;
                    strM55993 = str;
                    break;
                case -1328558434:
                case 321074762:
                    strM55993 = strM55993;
                    sArr2 = f82265;
                    i11 = 201;
                    i12 = 16;
                    if (C1024.f81946) {
                        iM559711 = (i7 - C0946.m55979("ۨ᩷")) * 3;
                        i5 = ((iM559711 ^ i8) * (-31931)) ^ (-500380511);
                        i6 = -1139289994;
                    } else {
                        iM559711 = (C0946.m55979("ۨܿ") ^ i8) * 47;
                        i5 = ((iM559711 ^ i7) * (-27927)) ^ 418233701;
                        i6 = -1665075402;
                    }
                    str = strM55993;
                    i10 = iM559711 ^ i6;
                    i9 = i5;
                    strM55993 = str;
                    break;
                case -1327628316:
                case -808905076:
                    strM56584 = C1964.m56584(f82265, HRSS1373Polynomial.f81794M, 7, i13);
                    if (jSONObject.has(strM56584)) {
                        iM55979 = (C0946.m55979("۠ۙ") ^ i7) * (-105);
                        i = ((iM55979 ^ i8) * (-32423)) ^ 899400584;
                        i2 = -1897498222;
                    } else {
                        iM55979 = C0946.m55979("ۙ᩺") ^ i7;
                        i = ((iM55979 ^ i8) * 15255) ^ (-680312175);
                        i2 = -1029323537;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -1236131623:
                case -378805759:
                    this.f54495 = C1964.m56596(jSONObject, strM56144);
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0873.m55680("᩻ᩴ") ^ i8;
                        i = ((iM55979 ^ i7) * (-2875)) ^ (-521112589);
                        i2 = -1460390406;
                    } else {
                        iM55979 = (i8 - C0873.m55680("ᩳᩳ")) * 61;
                        i = ((iM55979 ^ i7) * (-9763)) ^ (-1451404417);
                        i2 = -546292629;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -1022503536:
                case -376197376:
                    String strM56556 = C1929.m56556(jSONObject, strM56077);
                    this.f54483 = strM56556;
                    if (C0937.m55923(strM56556)) {
                        iM55979 = C0873.m55680("ܶ᩻") ^ i8;
                        i = ((iM55979 ^ i7) * 6985) ^ 1119483856;
                        i2 = -13863330;
                    } else {
                        iM55979 = C0946.m55979("ۡ۫") ^ i7;
                        i = ((iM55979 ^ i8) * (-4407)) ^ (-1182779593);
                        i2 = 1787093816;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -905159755:
                case 1245239155:
                    this.f54483 = null;
                    iM55979 = C0946.m55979("ۡ۫") ^ i7;
                    i = ((iM55979 ^ i8) * (-4407)) ^ (-1182779593);
                    i2 = 1787093816;
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -765301764:
                case -319639887:
                    C1025.m56230();
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0873.m55680("᩻ᩴ") ^ i8;
                        i = ((iM55979 ^ i7) * (-2875)) ^ (-521112589);
                        i2 = -1460390406;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    } else {
                        strM55993 = strM55993;
                        iM559711 = (i7 - C0946.m55979("ۨ᩷")) * 3;
                        i5 = ((iM559711 ^ i8) * (-31931)) ^ (-500380511);
                        i6 = -1139289994;
                        str = strM55993;
                        i10 = iM559711 ^ i6;
                        i9 = i5;
                        strM55993 = str;
                    }
                    break;
                case -620056318:
                case -508566431:
                    i13 = 22009;
                    iM559710 = (i7 - C0946.m55979("ۜ֡")) * 9;
                    i3 = ((iM559710 ^ i8) * (-30057)) ^ (-1740847770);
                    i4 = 1359582632;
                    int i19 = iM559710 ^ i4;
                    sArr2 = sArr2;
                    i9 = i3;
                    str = strM55993;
                    i10 = i19;
                    strM55993 = str;
                    break;
                case -550844420:
                case -356916453:
                    C0967.m56074();
                    if (C1124.f82007 >= 0) {
                        iM55979 = (i8 - C0946.m55979("ۘ֫")) * (-9);
                        i = ((iM55979 ^ i7) * (-17701)) ^ (-1546505084);
                        i2 = 1555752463;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    } else {
                        strM55993 = strM55993;
                        sArr2 = sArr2;
                        iM559710 = C0946.m55979("᩵۠") ^ i8;
                        i3 = ((iM559710 ^ i7) * (-219)) ^ 104615253;
                        i4 = 1213577728;
                        int i110 = iM559710 ^ i4;
                        sArr2 = sArr2;
                        i9 = i3;
                        str = strM55993;
                        i10 = i110;
                        strM55993 = str;
                    }
                    break;
                case -467279323:
                case 177441254:
                    strM55993 = strM55993;
                    sArr2 = sArr2;
                    s = sArr[c];
                    s2 = 32538;
                    if (C1012.m56134() <= 0) {
                        iM559710 = (C0946.m55979("֨᩺") ^ i7) * (-47);
                        i3 = ((iM559710 ^ i8) * 22785) ^ (-2000262132);
                        i4 = -389035182;
                    } else {
                        iM559710 = (C0946.m55979("۠ۢ") + i7) * (-71);
                        i3 = ((iM559710 ^ i8) * 1343) ^ (-436295540);
                        i4 = -858444730;
                    }
                    int i111 = iM559710 ^ i4;
                    sArr2 = sArr2;
                    i9 = i3;
                    str = strM55993;
                    i10 = i111;
                    strM55993 = str;
                    break;
                case -366122090:
                case 1332800097:
                    strM55993 = strM55993;
                    sArr2 = sArr2;
                    sArr = f82265;
                    c = 200;
                    if (C0877.m55696()) {
                        iM559710 = C0946.m55979("ܰۖ") ^ i8;
                        i3 = ((iM559710 ^ i7) * (-9767)) ^ (-1995004610);
                        i4 = -1081657496;
                    } else {
                        iM559710 = C0946.m55979("᩵۠") ^ i8;
                        i3 = ((iM559710 ^ i7) * (-219)) ^ 104615253;
                        i4 = 1213577728;
                    }
                    int i112 = iM559710 ^ i4;
                    sArr2 = sArr2;
                    i9 = i3;
                    str = strM55993;
                    i10 = i112;
                    strM55993 = str;
                    break;
                case -337646513:
                case 1442143438:
                    int iM562710 = C1044.m56279(jSONObject, strM56161);
                    this.f54498 = iM562710;
                    if (iM562710 >= 0) {
                        iM55979 = (C0946.m55979("ۙ֡") ^ i7) * 11;
                        i = ((iM55979 ^ i8) * (-9981)) ^ (-443385123);
                        i2 = -1391254079;
                    } else {
                        iM55979 = (C0873.m55680("ۛ᩸") + i8) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM55979 ^ i7) * (-19465)) ^ (-554443133);
                        i2 = -273204998;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -324286833:
                case 1258104131:
                    this.f54499 = C1964.m56596(jSONObject, strM55993);
                    sArr3 = f82265;
                    if (C1071.f81975 <= 0) {
                        iM55979 = (C0873.m55680("ۜۗ") ^ i8) * 101;
                        i = ((iM55979 ^ i7) * 8317) ^ (-1659804477);
                        i2 = -1371773117;
                    } else {
                        iM55979 = C0946.m55979("ۖܿ") ^ i7;
                        i = ((iM55979 ^ i8) * (-23197)) ^ 2052984584;
                        i2 = -1632268666;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -209199068:
                case 224946631:
                    this.f54501 = jSONObject.getBoolean(strM55863);
                    iM55979 = (C0873.m55680("ۗ۠") ^ i8) * (-47);
                    i = ((iM55979 ^ i7) * 3239) ^ 1401388868;
                    i2 = -1467039729;
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -94357565:
                case 163924043:
                    strM56077 = C0967.m56077(f82265, 299, 14, i13);
                    if (jSONObject.has(strM56077)) {
                        iM55979 = (i8 - C0946.m55979("ۚܳ")) * (-75);
                        i = ((iM55979 ^ i7) * (-29389)) ^ (-116397728);
                        i2 = 809792651;
                    } else {
                        iM55979 = C0946.m55979("ۡ۫") ^ i7;
                        i = ((iM55979 ^ i8) * (-4407)) ^ (-1182779593);
                        i2 = 1787093816;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -45950429:
                case 254816126:
                    C0949.m56012();
                    C0873.m55678();
                    return;
                case -18181620:
                case 2082457104:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        strM55993 = strM55993;
                        sArr2 = sArr2;
                        iM559710 = (C0946.m55979("֨᩺") ^ i7) * (-47);
                        i3 = ((iM559710 ^ i8) * 22785) ^ (-2000262132);
                        i4 = -389035182;
                        int i113 = iM559710 ^ i4;
                        sArr2 = sArr2;
                        i9 = i3;
                        str = strM55993;
                        i10 = i113;
                        strM55993 = str;
                    }
                    strM55993 = strM55993;
                    iM559711 = (i7 - C0946.m55979("ۨ᩷")) * 3;
                    i5 = ((iM559711 ^ i8) * (-31931)) ^ (-500380511);
                    i6 = -1139289994;
                    str = strM55993;
                    i10 = iM559711 ^ i6;
                    i9 = i5;
                    strM55993 = str;
                    break;
                case 77403494:
                case 1980520128:
                    strM55810 = C0906.m55810(f82265, 327, 17, i13);
                    if (jSONObject.has(strM55810)) {
                        iM55979 = (C0873.m55680("֡۠") + i8) * 13;
                        i = ((iM55979 ^ i7) * 13155) ^ (-1595632849);
                        i2 = 942328330;
                    } else {
                        iM55979 = C0946.m55979("᩷ܳ") ^ i7;
                        i = ((iM55979 ^ i8) * 25237) ^ 1175067139;
                        i2 = 1283184947;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case 126422556:
                case 1140475063:
                    strM55993 = strM55993;
                    int iM562711 = C1044.m56279(jSONObject, C0877.m55707(f82265, 246, 11, i13));
                    this.f54502 = iM562711;
                    if (iM562711 > 0) {
                        iM559711 = (C0873.m55680("ۜܽ") ^ i7) * (-117);
                        i5 = ((iM559711 ^ i8) * 28049) ^ 232788735;
                        i6 = -869152118;
                    } else {
                        iM559711 = (i8 - C0873.m55680("֨ۖ")) * 87;
                        i5 = ((iM559711 ^ i7) * (-23869)) ^ (-298961387);
                        i6 = 277677675;
                    }
                    str = strM55993;
                    i10 = iM559711 ^ i6;
                    i9 = i5;
                    strM55993 = str;
                    break;
                case 171646161:
                case 1588062030:
                    int iM562712 = C1044.m56279(jSONObject, strM55810);
                    this.f54497 = iM562712;
                    if (iM562712 >= 0) {
                        iM55979 = C0946.m55979("᩷ܳ") ^ i7;
                        i = ((iM55979 ^ i8) * 25237) ^ 1175067139;
                        i2 = 1283184947;
                    } else {
                        iM55979 = (C0873.m55680("ۧ᩸") ^ i8) * (-27);
                        i = ((iM55979 ^ i7) * (-3747)) ^ (-1881441891);
                        i2 = -947108664;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case 482485235:
                case 1718773840:
                    strM55993 = strM55993;
                    this.f54481 = C1964.m56596(jSONObject, strM55792);
                    if (C1048.f81963) {
                        iM559711 = (C0873.m55680("ᩴۙ") ^ i8) * 67;
                        i5 = ((iM559711 ^ i7) * (-5063)) ^ (-801559769);
                        i6 = 652532752;
                    } else {
                        iM559711 = C0946.m55979("ᩴܳ") ^ i7;
                        i5 = ((iM559711 ^ i8) * 14825) ^ 712155003;
                        i6 = -1541864481;
                    }
                    str = strM55993;
                    i10 = iM559711 ^ i6;
                    i9 = i5;
                    strM55993 = str;
                    break;
                case 559786325:
                case 1826104182:
                    throw new JSONException(C0917.m55852(f82265, 377, 21, i13));
                case 1079166349:
                case 1317492458:
                    throw new JSONException(C1046.m56293(f82265, 351, 18, i13));
                case 1149813362:
                case 1645234404:
                    this.f54480 = C1929.m56556(jSONObject, C1012.m56144(sArr3, 284, 4, i13));
                    if (C1071.f81975 <= 0) {
                        iM55979 = (C0873.m55680("ۜۗ") ^ i8) * 101;
                        i = ((iM55979 ^ i7) * 8317) ^ (-1659804477);
                        i2 = -1371773117;
                    } else {
                        iM55979 = (C0873.m55680("ᩳ֫") + i8) * 9;
                        i = ((iM55979 ^ i7) * 13867) ^ (-1338989326);
                        i2 = -95217034;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case 1241208386:
                case 1422620271:
                    C0845.m55584();
                    strM55993 = strM55993;
                    sArr2 = sArr2;
                    iM559710 = C0946.m55979("᩵۠") ^ i8;
                    i3 = ((iM559710 ^ i7) * (-219)) ^ 104615253;
                    i4 = 1213577728;
                    int i114 = iM559710 ^ i4;
                    sArr2 = sArr2;
                    i9 = i3;
                    str = strM55993;
                    i10 = i114;
                    strM55993 = str;
                    break;
                case 1379023658:
                case 2115784182:
                    C0890.m55740();
                    break;
                case 1728873708:
                case 1773333918:
                    return;
                case 1747752310:
                case 1967275195:
                    if (!C0937.f81884) {
                        iM55979 = C0873.m55680("ۜ֫") ^ i8;
                        i = ((iM55979 ^ i7) * 27115) ^ 1396055736;
                        i2 = -888615791;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    } else {
                        strM55993 = strM55993;
                        iM559711 = C0946.m55979("ᩴܳ") ^ i7;
                        i5 = ((iM559711 ^ i8) * 14825) ^ 712155003;
                        i6 = -1541864481;
                        str = strM55993;
                        i10 = iM559711 ^ i6;
                        i9 = i5;
                        strM55993 = str;
                    }
                    break;
                default:
                    this.f54491 = jSONObject.getBoolean(strM56584);
                    iM55979 = C0946.m55979("ۙ᩺") ^ i7;
                    i = ((iM55979 ^ i8) * 15255) ^ (-680312175);
                    i2 = -1029323537;
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
            }
        }
    }
}
