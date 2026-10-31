package l;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: renamed from: l.ۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1AZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10014 {
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ColorFilter m25187(EnumC5780 enumC5780) {
        PorterDuff.Mode mode;
        if (Build.VERSION.SDK_INT >= 29) {
            Object objM50741 = C22713.m50741(enumC5780);
            if (objM50741 != null) {
                return C12130.m29551(0, objM50741);
            }
        } else {
            if (enumC5780 != null) {
                switch (C11425.f34171[enumC5780.ordinal()]) {
                    case 1:
                        mode = PorterDuff.Mode.CLEAR;
                        break;
                    case 2:
                        mode = PorterDuff.Mode.SRC;
                        break;
                    case 3:
                        mode = PorterDuff.Mode.DST;
                        break;
                    case 4:
                        mode = PorterDuff.Mode.SRC_OVER;
                        break;
                    case 5:
                        mode = PorterDuff.Mode.DST_OVER;
                        break;
                    case 6:
                        mode = PorterDuff.Mode.SRC_IN;
                        break;
                    case 7:
                        mode = PorterDuff.Mode.DST_IN;
                        break;
                    case 8:
                        mode = PorterDuff.Mode.SRC_OUT;
                        break;
                    case 9:
                        mode = PorterDuff.Mode.DST_OUT;
                        break;
                    case 10:
                        mode = PorterDuff.Mode.SRC_ATOP;
                        break;
                    case 11:
                        mode = PorterDuff.Mode.DST_ATOP;
                        break;
                    case 12:
                        mode = PorterDuff.Mode.XOR;
                        break;
                    case 13:
                        mode = PorterDuff.Mode.ADD;
                        break;
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.OVERLAY;
                        break;
                    case 17:
                        mode = PorterDuff.Mode.DARKEN;
                        break;
                    case 18:
                        mode = PorterDuff.Mode.LIGHTEN;
                        break;
                    default:
                        mode = null;
                        break;
                }
            } else {
                mode = null;
            }
            if (mode != null) {
                return new PorterDuffColorFilter(0, mode);
            }
        }
        return null;
    }
}
