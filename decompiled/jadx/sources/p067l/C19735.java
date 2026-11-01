package p067l;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳ᩶֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78M9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19735 extends C17702 {

    /* JADX INFO: renamed from: ۗ */
    public final C10307 f60027;

    /* JADX INFO: renamed from: ۙ */
    public final C17474 f60028;

    /* JADX INFO: renamed from: ۛ */
    public final int f60029;

    /* JADX INFO: renamed from: ۤ */
    public final String f60030;

    /* JADX INFO: renamed from: ۫ */
    public final int f60031;

    /* JADX INFO: renamed from: ۬ */
    public final int f60032;

    /* JADX INFO: renamed from: ᩶ */
    public final boolean f60033;

    /* JADX INFO: renamed from: ֫ */
    public static C19735 m44862(IOException iOException, int i) {
        return new C19735(0, iOException, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19735 m44864(Throwable th, String str, int i, C10307 c10307, int i2, C17474 c17474, boolean z, int i3) {
        return new C19735(1, th, i3, str, i, c10307, c10307 == null ? 4 : i2, c17474, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19735 m44863(RuntimeException runtimeException, int i) {
        return new C19735(2, runtimeException, i);
    }

    public C19735(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19735(String str, Throwable th, int i, int i2, String str2, int i3, C10307 c10307, int i4, C17474 c17474, long j, boolean z) {
        super(str, th, i, j);
        Bundle bundle = Bundle.EMPTY;
        C23877.m52957(!z || i2 == 1);
        C23877.m52957(th != null || i2 == 3);
        this.f60029 = i2;
        this.f60030 = str2;
        this.f60031 = i3;
        this.f60027 = c10307;
        this.f60032 = i4;
        this.f60028 = c17474;
        this.f60033 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19735 m44865(C17474 c17474) {
        String message = getMessage();
        String str = C5792.f14228;
        return new C19735(message, getCause(), this.f52873, this.f60029, this.f60030, this.f60031, this.f60027, this.f60032, c17474, this.f52874, this.f60033);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19735(int i, Throwable th, int i2, String str, int i3, C10307 c10307, int i4, C17474 c17474, boolean z) {
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
            sb.append(c10307);
            sb.append(", format_supported=");
            String str3 = C5792.f14228;
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
        this(TextUtils.isEmpty(null) ? string : C17588.m40053(string, ": null"), th, i2, i, str, i3, c10307, i4, c17474, SystemClock.elapsedRealtime(), z);
    }
}
