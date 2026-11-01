package p067l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۚ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: WBSX */
/* JADX INFO: loaded from: classes2.dex */
public final class C7453 {
    /* JADX INFO: renamed from: ֫ */
    public static Activity m17221(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m17221(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m17223(int i, boolean z) {
        String string;
        switch (i) {
            case 1:
                string = "Android 1.0";
                break;
            case 2:
                string = "Android 1.1";
                break;
            case 3:
                string = "Android 1.5";
                break;
            case 4:
                string = "Android 1.6";
                break;
            case 5:
                string = "Android 2.0";
                break;
            case 6:
                string = "Android 2.0.1";
                break;
            case 7:
                string = "Android 2.1";
                break;
            case 8:
                string = "Android 2.2";
                break;
            case 9:
                string = "Android 2.3";
                break;
            case 10:
                string = "Android 2.3.3";
                break;
            case 11:
                string = "Android 3.0";
                break;
            case 12:
                string = "Android 3.1";
                break;
            case 13:
                string = "Android 3.2";
                break;
            case 14:
                string = "Android 4.0";
                break;
            case 15:
                string = "Android 4.0.3";
                break;
            case 16:
                string = "Android 4.1";
                break;
            case 17:
                string = "Android 4.2";
                break;
            case 18:
                string = "Android 4.3";
                break;
            case 19:
                string = "Android 4.4";
                break;
            case 20:
                string = "Android 4.4W";
                break;
            case 21:
                string = "Android 5.0";
                break;
            case 22:
                string = "Android 5.1";
                break;
            case 23:
                string = "Android 6.0";
                break;
            case 24:
                string = "Android 7.0";
                break;
            case 25:
                string = "Android 7.1";
                break;
            case 26:
                string = "Android 8.0";
                break;
            case 27:
                string = "Android 8.1";
                break;
            case 28:
                string = "Android 9";
                break;
            case 29:
                string = "Android 10";
                break;
            case 30:
                string = "Android 11";
                break;
            case 31:
                string = "Android 12";
                break;
            case 32:
                string = "Android 12L";
                break;
            case 33:
                string = "Android 13";
                break;
            case 34:
                string = "Android 14";
                break;
            case 35:
                string = "Android 15";
                break;
            default:
                if (i <= 35) {
                    string = "Unknown";
                } else {
                    StringBuilder sb = new StringBuilder("Android ");
                    sb.append(i - 20);
                    string = sb.toString();
                }
                break;
        }
        return (z && string.endsWith(".0")) ? C17073.m38720(2, 0, string) : string;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m17222(int i) {
        return m17223(i, true) + " (API " + i + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
