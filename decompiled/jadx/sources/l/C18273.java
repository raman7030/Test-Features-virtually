package l;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳ᩶֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78M9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18273 extends C16134 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C8353 f56810;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15894 f56811;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f56812;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f56813;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f56814;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f56815;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f56816;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18273 m42603(IOException iOException, int i) {
        return new C18273(0, iOException, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18273 m42605(Throwable th, String str, int i, C8353 c8353, int i2, C15894 c15894, boolean z, int i3) {
        return new C18273(1, th, i3, str, i, c8353, c8353 == null ? 4 : i2, c15894, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18273 m42604(RuntimeException runtimeException, int i) {
        return new C18273(2, runtimeException, i);
    }

    public C18273(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18273(String str, Throwable th, int i, int i2, String str2, int i3, C8353 c8353, int i4, C15894 c15894, long j, boolean z) {
        super(str, th, i, j);
        Bundle bundle = Bundle.EMPTY;
        C22632.m50631(!z || i2 == 1);
        C22632.m50631(th != null || i2 == 3);
        this.f56812 = i2;
        this.f56813 = str2;
        this.f56814 = i3;
        this.f56810 = c8353;
        this.f56815 = i4;
        this.f56811 = c15894;
        this.f56816 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18273 m42606(C15894 c15894) {
        String message = getMessage();
        String str = C3603.f11424;
        return new C18273(message, getCause(), this.f49707, this.f56812, this.f56813, this.f56814, this.f56810, this.f56815, c15894, this.f49708, this.f56816);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C18273(int i, Throwable th, int i2, String str, int i3, C8353 c8353, int i4, C15894 c15894, boolean z) {
        String string;
        String str2;
        if (i == 0) {
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" error, index=");
            sb.append(i3);
            sb.append(", format=");
            sb.append(c8353);
            sb.append(", format_supported=");
            String str3 = C3603.f11424;
            if (i4 == 0) {
                str2 = "NO";
            } else if (i4 == 1) {
                str2 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str2 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str2 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                str2 = "YES";
            }
            sb.append(str2);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : C16014.m37867(string, ": null"), th, i2, i, str, i3, c8353, i4, c15894, SystemClock.elapsedRealtime(), z);
    }
}
