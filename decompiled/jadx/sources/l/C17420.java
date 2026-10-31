package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: l.ܿܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W8NJ */
/* JADX INFO: loaded from: classes5.dex */
public class C17420 extends C22154 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f53280;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17420 m40765(IOException iOException, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !C15107.m35799(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        if (i2 != 2007) {
            return new C17420(iOException, i2, i);
        }
        return new C18126(2007, iOException, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted");
    }

    public C17420() {
        super(2008);
        this.f53280 = 1;
    }

    public C17420(String str, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.f53280 = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C17420(IOException iOException, int i, int i2) {
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        super(i, iOException);
        this.f53280 = i2;
    }

    public C17420(int i, IOException iOException, String str) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.f53280 = 1;
    }
}
