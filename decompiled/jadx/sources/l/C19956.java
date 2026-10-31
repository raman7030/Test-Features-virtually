package l;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: renamed from: l.᩶ۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 93Z4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19956 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object f64623 = new Object();

    @Pure
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46031(String str) {
        synchronized (f64623) {
            m46032(str, null);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m46035(String str) {
        synchronized (f64623) {
            m46032(str, null);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m46037(String str) {
        synchronized (f64623) {
            m46032(str, null);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m46036(String str, Throwable th) {
        synchronized (f64623) {
            m46032(str, th);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m46033(String str) {
        synchronized (f64623) {
            m46032(str, null);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m46034(String str, Throwable th) {
        synchronized (f64623) {
            m46032(str, th);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46032(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (f64623) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", ASN1Dump.TAB);
                        break;
                    } else {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return;
        }
        strReplace.replace("\n", "\n  ");
    }
}
