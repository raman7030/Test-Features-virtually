package p067l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: l.ܿܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W8NJ */
/* JADX INFO: loaded from: classes5.dex */
public class C18924 extends C23423 {

    /* JADX INFO: renamed from: ᩶ */
    public final int f56468;

    /* JADX INFO: renamed from: ֫ */
    public static C18924 m43022(IOException iOException, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !C16726.m37957(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        if (i2 != 2007) {
            return new C18924(iOException, i2, i);
        }
        return new C19595(2007, iOException, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted");
    }

    public C18924() {
        super(2008);
        this.f56468 = 1;
    }

    public C18924(String str, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.f56468 = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C18924(IOException iOException, int i, int i2) {
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        super(i, iOException);
        this.f56468 = i2;
    }

    public C18924(int i, IOException iOException, String str) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.f56468 = 1;
    }
}
