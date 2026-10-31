package l;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.analytics.pro.am;
import com.umeng.commonsdk.statistics.UMErrorCode;
import com.umeng.commonsdk.statistics.idtracking.g;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.math.Primes;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.ۘ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes2.dex */
public final class C3603 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f11415;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Pattern f11416;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final String[] f11417;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final String[] f11418;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f11419;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final long[] f11420;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static HashMap f11421;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int[] f11422;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final byte[] f11423;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String f11424;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f11425;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f11426;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m10998(int i) {
        if (i == 30) {
            return 34;
        }
        switch (i) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        switch (i) {
                            case 20:
                                return 30;
                            case 21:
                            case 22:
                                return 31;
                            default:
                                return Integer.MAX_VALUE;
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m11014(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m11034(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m11045(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return TextBundle.TEXT_ENTRY;
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i >= 10000 ? C18307.m42645(i, "custom (", MotionUtils.EASING_TYPE_FORMAT_END) : "?";
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m11053(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m11055(int i) {
        return i == 10 || i == 13;
    }

    static {
        int i = Build.VERSION.SDK_INT;
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        f11424 = str + ", " + Build.MODEL + ", " + str2 + ", " + i;
        f11423 = new byte[0];
        f11420 = new long[0];
        f11425 = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f11426 = Pattern.compile("%([A-Fa-f0-9]{2})");
        f11416 = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f11418 = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", am.ae, g.a, "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f11417 = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f11419 = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f11415 = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f11422 = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 119, 126, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 108, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, BERTags.FLAGS, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, PicnicEngine.MAX_AUX_BYTES, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, EnumC17734.f54268, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, UMErrorCode.E_UM_BE_CREATE_FAILED, IShizukuService.Stub.TRANSACTION_isHidden, 97, IShizukuService.Stub.TRANSACTION_attachUserService, 115, 116, q.h, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, Scalar25519.TARGET_LENGTH, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, Primes.SMALL_FACTOR_LIMIT, 212, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, UMErrorCode.E_UM_BE_JSON_FAILED, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 96, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, UMErrorCode.E_UM_BE_RAW_OVERSIZE, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 127, IShizukuService.Stub.TRANSACTION_getFlagsForUid, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, DHParameters.DEFAULT_MINIMUM_LENGTH, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, 208, 215, 194, 197, 204, 203, 230, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, 232, 239, 250, 253, 244, 243};
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11025(JobServiceC23387 jobServiceC23387, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            jobServiceC23387.startForegroundService(intent);
        } else {
            jobServiceC23387.startService(intent);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m11028(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!C11003.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m11007(SparseArray sparseArray) {
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int iHashCode = 17;
        for (int i = 0; i < sparseArray.size(); i++) {
            iHashCode = C11003.hashCode(sparseArray.valueAt(i)) + ((sparseArray.keyAt(i) + (iHashCode * 31)) * 31);
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m11029(Object obj, Object[] objArr) {
        for (Object obj2 : objArr) {
            if (C11003.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m11027(SparseArray sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object[] m11033(int i, Object[] objArr) {
        C22632.m50631(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Handler m11019(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        C22632.m50632(looperMyLooper);
        return new Handler(looperMyLooper, callback);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11023(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11024(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m11048(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strM35799 = C15107.m35799(str);
        int i = 0;
        String str2 = strM35799.split("-", 2)[0];
        if (f11421 == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f11418;
            HashMap map = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                map.put(strArr[i2], strArr[i2 + 1]);
            }
            f11421 = map;
        }
        String str4 = (String) f11421.get(str2);
        if (str4 != null) {
            StringBuilder sbM15339 = C5368.m15339(str4);
            sbM15339.append(strM35799.substring(str2.length()));
            strM35799 = sbM15339.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !am.aC.equals(str2) && !"zh".equals(str2)) {
            return strM35799;
        }
        while (true) {
            String[] strArr2 = f11417;
            if (i >= strArr2.length) {
                return strM35799;
            }
            if (strM35799.startsWith(strArr2[i])) {
                return strArr2[i + 1] + strM35799.substring(strArr2[i].length());
            }
            i += 2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m11021(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m11008(String str) {
        String[] strArrSplit;
        int length;
        int i = 0;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            str2.getClass();
            i = Integer.parseInt(str2);
            if (z) {
                return -i;
            }
        } catch (NumberFormatException unused) {
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m10999(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m11000(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m11016(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m10997(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m11011(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            i3 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i2 = iBinarySearch - 1;
                if (i2 < 0 || iArr[i2] != i) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m11036(long[] jArr, long j, boolean z) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i2 = iBinarySearch - 1;
                if (i2 < 0 || jArr[i2] != j) {
                    break;
                }
                iBinarySearch = i2;
            }
            i = iBinarySearch;
        }
        return z ? Math.max(0, i) : i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m11009(List list, Long l2, boolean z) {
        int i;
        int iBinarySearch = Collections.binarySearch(list, l2);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i2 = iBinarySearch - 1;
                if (i2 < 0 || ((Comparable) list.get(i2)).compareTo(l2) != 0) {
                    break;
                }
                iBinarySearch = i2;
            }
            i = iBinarySearch;
        }
        return z ? Math.max(0, i) : i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m11010(C4433 c4433, long j) {
        int iM13154 = c4433.m13154() - 1;
        int i = 0;
        while (i <= iM13154) {
            int i2 = (i + iM13154) >>> 1;
            if (c4433.m13155(i2) < j) {
                i = i2 + 1;
            } else {
                iM13154 = i2 - 1;
            }
        }
        int i3 = iM13154 + 1;
        if (i3 < c4433.m13154() && c4433.m13155(i3) == j) {
            return i3;
        }
        if (iM13154 == -1) {
            return 0;
        }
        return iM13154;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m11012(long[] jArr, long j, boolean z) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i = iBinarySearch + 1;
            if (i >= jArr.length || jArr[i] != j) {
                break;
            }
            iBinarySearch = i;
        }
        return z ? iBinarySearch : i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m11037(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m11013(int i, long j) {
        return m11017(j, 1000000L, i, RoundingMode.DOWN);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static long m11054(String str) throws C9080 {
        Matcher matcher = f11425.matcher(str);
        if (!matcher.matches()) {
            throw C9080.m23440("Invalid date/time format: " + str, (Throwable) null);
        }
        int i = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(C3261.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i != 0 ? timeInMillis - (((long) i) * 60000) : timeInMillis;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m11017(long j, long j2, long j3, RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        if (j3 >= j2 && j3 % j2 == 0) {
            return C8488.m22164(j, C8488.m22164(j3, j2, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return C8488.m22166(j, C8488.m22164(j2, j3, RoundingMode.UNNECESSARY));
        }
        if (j3 >= j && j3 % j == 0) {
            return C8488.m22164(j2, C8488.m22164(j3, j, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j3 < j && j % j3 == 0) {
            return C8488.m22166(j2, C8488.m22164(j, j3, RoundingMode.UNNECESSARY));
        }
        return m11039(j, j2, j3, roundingMode);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m11039(long j, long j2, long j3, RoundingMode roundingMode) {
        long jM22166 = C8488.m22166(j, j2);
        if (jM22166 != C13132.FOREVER_NS && jM22166 != Long.MIN_VALUE) {
            return C8488.m22164(jM22166, j3, roundingMode);
        }
        long jM22165 = C8488.m22165(Math.abs(j2), Math.abs(j3));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jM22164 = C8488.m22164(j2, jM22165, roundingMode2);
        long jM22167 = C8488.m22164(j3, jM22165, roundingMode2);
        long jM22168 = C8488.m22165(Math.abs(j), Math.abs(jM22167));
        long jM22169 = C8488.m22164(j, jM22168, roundingMode2);
        long jM221610 = C8488.m22164(jM22167, jM22168, roundingMode2);
        long jM221611 = C8488.m22166(jM22169, jM22164);
        if (jM221611 != C13132.FOREVER_NS && jM221611 != Long.MIN_VALUE) {
            return C8488.m22164(jM221611, jM221610, roundingMode);
        }
        double d = jM22169 * (jM22164 / jM221610);
        if (d > 9.223372036854776E18d) {
            return C13132.FOREVER_NS;
        }
        if (d < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return C19072.m43934(d, roundingMode);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11026(long[] jArr, long j) {
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i = 0;
        if (j >= 1000000 && j % 1000000 == 0) {
            long jM22164 = C8488.m22164(j, 1000000L, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = C8488.m22164(jArr[i], jM22164, roundingMode);
                i++;
            }
            return;
        }
        if (j < 1000000 && 1000000 % j == 0) {
            long jM22165 = C8488.m22164(1000000L, j, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = C8488.m22166(jArr[i], jM22165);
                i++;
            }
            return;
        }
        for (int i2 = 0; i2 < jArr.length; i2++) {
            long j2 = jArr[i2];
            if (j2 != 0) {
                if (j >= j2 && j % j2 == 0) {
                    jArr[i2] = C8488.m22164(1000000L, C8488.m22164(j, j2, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j < j2 && j2 % j == 0) {
                    jArr[i2] = C8488.m22166(1000000L, C8488.m22164(j2, j, RoundingMode.UNNECESSARY));
                } else {
                    jArr[i2] = m11039(j2, 1000000L, j, roundingMode);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m11015(long j, float f) {
        return f == 1.0f ? j : Math.round(j * ((double) f));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m11038(long j, float f) {
        return f == 1.0f ? j : Math.round(j / ((double) f));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m11002(int i, String str) {
        int i2 = 0;
        for (String str2 : m11052(str)) {
            if (i == C9786.m24807(C9786.m24802(str2))) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m11041(int i, String str) {
        String[] strArrM11052 = m11052(str);
        if (strArrM11052.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrM11052) {
            if (i == C9786.m24807(C9786.m24802(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String[] m11052(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C8353 m11049(int i, int i2, int i3) {
        C1297 c1297 = new C1297();
        c1297.m4465("audio/raw");
        c1297.m4472(i2);
        c1297.m4456(i3);
        c1297.m4475(i);
        return c1297.m4440();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m11003(int i, ByteOrder byteOrder) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m11035(int i) {
        if (i == 10) {
            return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i == 12) {
            return 743676;
        }
        if (i == 24) {
            return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
        }
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AudioFormat m11040(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m11047(int i) {
        if (i != 2) {
            if (i == 3) {
                return 1;
            }
            if (i != 4) {
                if (i != 21) {
                    if (i != 22) {
                        if (i != 268435456) {
                            if (i != 1342177280) {
                                if (i != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00e1 A[RETURN] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m11006(Uri uri, String str) {
        int i;
        if (str != null) {
            switch (str) {
                case "application/x-mpegURL":
                    return 2;
                case "application/vnd.ms-sstr+xml":
                    return 1;
                case "application/dash+xml":
                    return 0;
                case "application/x-rtsp":
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme == null || (!C15107.m35801("rtsp", scheme) && !C15107.m35801("rtspt", scheme))) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                if (iLastIndexOf >= 0) {
                    String strM35799 = C15107.m35799(lastPathSegment.substring(iLastIndexOf + 1));
                    strM35799.getClass();
                    switch (strM35799.hashCode()) {
                        case 104579:
                            if (strM35799.equals("ism")) {
                            }
                            break;
                        case 108321:
                            if (strM35799.equals("mpd")) {
                            }
                            break;
                        case 3242057:
                            if (strM35799.equals("isml")) {
                            }
                            break;
                        case 3299913:
                            if (strM35799.equals("m3u8")) {
                            }
                            break;
                    }
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Switch insn not found in header
                        	at java.base/java.util.Objects.requireNonNull(Objects.java:235)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        */
                    /*
                        Method dump skipped, instruction units count: 288
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: l.C3603.m11006(android.net.Uri, java.lang.String):int");
                }

                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                public static String m11020(StringBuilder sb, Formatter formatter, long j) {
                    if (j == -9223372036854775807L) {
                        j = 0;
                    }
                    String str = j < 0 ? "-" : "";
                    long jAbs = (Math.abs(j) + 500) / 1000;
                    long j2 = jAbs % 60;
                    long j3 = (jAbs / 60) % 60;
                    long j4 = jAbs / 3600;
                    sb.setLength(0);
                    return j4 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j3), Long.valueOf(j2)).toString();
                }

                /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
                public static String m11046(String str) {
                    int length = str.length();
                    int iEnd = 0;
                    int i = 0;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (str.charAt(i2) == '%') {
                            i++;
                        }
                    }
                    if (i == 0) {
                        return str;
                    }
                    int i3 = length - (i * 2);
                    StringBuilder sb = new StringBuilder(i3);
                    Matcher matcher = f11426.matcher(str);
                    while (i > 0 && matcher.find()) {
                        String strGroup = matcher.group(1);
                        strGroup.getClass();
                        char c = (char) Integer.parseInt(strGroup, 16);
                        sb.append((CharSequence) str, iEnd, matcher.start());
                        sb.append(c);
                        iEnd = matcher.end();
                        i--;
                    }
                    if (iEnd < length) {
                        sb.append((CharSequence) str, iEnd, length);
                    }
                    if (sb.length() != i3) {
                        return null;
                    }
                    return sb.toString();
                }

                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                public static int m11005(int i, byte[] bArr, int i2, int i3) {
                    while (i < i2) {
                        i3 = f11419[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
                        i++;
                    }
                    return i3;
                }

                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                public static int m11004(int i, byte[] bArr) {
                    int i2 = 65535;
                    for (int i3 = 0; i3 < i; i3++) {
                        byte b = bArr[i3];
                        int[] iArr = f11415;
                        int i4 = (((i2 << 4) & 65535) ^ iArr[(((b & 255) >> 4) ^ ((i2 >> 12) & 255)) & 255]) & 65535;
                        i2 = (((i4 << 4) & 65535) ^ iArr[((b & 15) ^ ((i4 >> 12) & 255)) & 255]) & 65535;
                    }
                    return i2;
                }

                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                public static int m11001(int i, int i2, byte[] bArr) {
                    int i3 = 0;
                    while (i < i2) {
                        i3 = f11422[i3 ^ (bArr[i] & 255)];
                        i++;
                    }
                    return i3;
                }

                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                public static Locale m11022() {
                    if (Build.VERSION.SDK_INT >= 24) {
                        return Locale.getDefault(Locale.Category.DISPLAY);
                    }
                    return Locale.getDefault();
                }

                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                public static boolean m11032(C17714 c17714, C17714 c17715, Inflater inflater) {
                    if (c17714.m41457() == 0) {
                        return false;
                    }
                    if (c17715.m41472() < c17714.m41457()) {
                        c17715.m41460(c17714.m41457() * 2);
                    }
                    if (inflater == null) {
                        inflater = new Inflater();
                    }
                    inflater.setInput(c17714.m41482(), c17714.m41485(), c17714.m41457());
                    int iInflate = 0;
                    while (true) {
                        try {
                            iInflate += inflater.inflate(c17715.m41482(), iInflate, c17715.m41472() - iInflate);
                            if (inflater.finished()) {
                                c17715.m41486(iInflate);
                                inflater.reset();
                                return true;
                            }
                            if (!inflater.needsDictionary() && !inflater.needsInput()) {
                                if (iInflate == c17715.m41472()) {
                                    c17715.m41460(c17715.m41472() * 2);
                                }
                            }
                            inflater.reset();
                            return false;
                        } catch (DataFormatException unused) {
                            inflater.reset();
                            return false;
                        } catch (Throwable th) {
                            inflater.reset();
                            throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
                public static boolean m11050(Context context) {
                    UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
                    return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
                }

                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                public static Point m11018(Context context) {
                    String strM11042;
                    DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                    Display display = displayManager != null ? displayManager.getDisplay(0) : null;
                    if (display == null) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.getClass();
                        display = windowManager.getDefaultDisplay();
                    }
                    if (display.getDisplayId() == 0 && m11050(context)) {
                        if (Build.VERSION.SDK_INT < 28) {
                            strM11042 = m11042("sys.display-size");
                        } else {
                            strM11042 = m11042("vendor.display-size");
                        }
                        if (!TextUtils.isEmpty(strM11042)) {
                            try {
                                String[] strArrSplit = strM11042.trim().split("x", -1);
                                if (strArrSplit.length == 2) {
                                    int i = Integer.parseInt(strArrSplit[0]);
                                    int i2 = Integer.parseInt(strArrSplit[1]);
                                    if (i > 0 && i2 > 0) {
                                        return new Point(i, i2);
                                    }
                                }
                            } catch (NumberFormatException unused) {
                            }
                            C19956.m46033("Invalid display size: " + strM11042);
                        }
                        if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                            return new Point(3840, 2160);
                        }
                    }
                    Point point = new Point();
                    if (Build.VERSION.SDK_INT < 23) {
                        display.getRealSize(point);
                        return point;
                    }
                    Display.Mode mode = display.getMode();
                    point.x = mode.getPhysicalWidth();
                    point.y = mode.getPhysicalHeight();
                    return point;
                }

                /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
                public static ArrayList m11051(int i) {
                    ArrayList arrayList = new ArrayList();
                    if ((i & 1) != 0) {
                        arrayList.add("main");
                    }
                    if ((i & 2) != 0) {
                        arrayList.add("alt");
                    }
                    if ((i & 4) != 0) {
                        arrayList.add("supplementary");
                    }
                    if ((i & 8) != 0) {
                        arrayList.add("commentary");
                    }
                    if ((i & 16) != 0) {
                        arrayList.add("dub");
                    }
                    if ((i & 32) != 0) {
                        arrayList.add("emergency");
                    }
                    if ((i & 64) != 0) {
                        arrayList.add("caption");
                    }
                    if ((i & 128) != 0) {
                        arrayList.add("subtitle");
                    }
                    if ((i & 256) != 0) {
                        arrayList.add("sign");
                    }
                    if ((i & 512) != 0) {
                        arrayList.add("describes-video");
                    }
                    if ((i & 1024) != 0) {
                        arrayList.add("describes-music");
                    }
                    if ((i & 2048) != 0) {
                        arrayList.add("enhanced-intelligibility");
                    }
                    if ((i & 4096) != 0) {
                        arrayList.add("transcribes-dialog");
                    }
                    if ((i & 8192) != 0) {
                        arrayList.add("easy-read");
                    }
                    if ((i & 16384) != 0) {
                        arrayList.add("trick-play");
                    }
                    if ((i & 32768) != 0) {
                        arrayList.add("auxiliary");
                    }
                    return arrayList;
                }

                /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
                public static boolean m11043(Context context) {
                    int i = Build.VERSION.SDK_INT;
                    if (i < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
                        return true;
                    }
                    if (i == 30) {
                        String str = Build.MODEL;
                        if (C15107.m35801(str, "moto g(20)") || C15107.m35801(str, "rmx3231")) {
                            return true;
                        }
                    }
                    return i == 34 && C15107.m35801(Build.MODEL, "sm-x200");
                }

                /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
                public static void m11056(int i) {
                    Integer.toString(i, 36);
                }

                @EnsuresNonNullIf(expression = {"#1"}, result = false)
                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                public static boolean m11031(InterfaceC1318 interfaceC1318, boolean z) {
                    return interfaceC1318 == null || !interfaceC1318.mo4607() || interfaceC1318.mo4603() == 1 || interfaceC1318.mo4603() == 4 || !(!z || interfaceC1318.mo4560() == 0 || interfaceC1318.mo4560() == 4);
                }

                /* JADX WARN: Code duplicated, block: B:18:0x0029  */
                /* JADX WARN: Code duplicated, block: B:20:0x002d A[RETURN] */
                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                public static boolean m11030(InterfaceC1318 interfaceC1318) {
                    boolean z = false;
                    if (interfaceC1318 == null) {
                        return false;
                    }
                    int iMo4603 = interfaceC1318.mo4603();
                    if (iMo4603 == 1 && interfaceC1318.mo4589(2)) {
                        interfaceC1318.mo4584();
                    } else {
                        if (iMo4603 == 4 && interfaceC1318.mo4589(4)) {
                            interfaceC1318.mo4581();
                        }
                        if (interfaceC1318.mo4589(1)) {
                            return z;
                        }
                        interfaceC1318.mo4601();
                        return true;
                    }
                    z = true;
                    if (interfaceC1318.mo4589(1)) {
                        return z;
                    }
                    interfaceC1318.mo4601();
                    return true;
                }

                /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
                public static String m11042(String str) {
                    try {
                        Class<?> cls = Class.forName("android.os.SystemProperties");
                        return (String) cls.getMethod("get", String.class).invoke(cls, str);
                    } catch (Exception e) {
                        C19956.m46034("Failed to read system property ".concat(str), e);
                        return null;
                    }
                }

                /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
                public static String[] m11044() {
                    Configuration configuration = Resources.getSystem().getConfiguration();
                    String[] strArrSplit = Build.VERSION.SDK_INT >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
                    for (int i = 0; i < strArrSplit.length; i++) {
                        strArrSplit[i] = m11048(strArrSplit[i]);
                    }
                    return strArrSplit;
                }
            }
