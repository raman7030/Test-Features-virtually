package p067l;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: renamed from: l.᩶ۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 93Z4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21334 {

    /* JADX INFO: renamed from: ֫ */
    public static final Object f67264 = new Object();

    @Pure
    /* JADX INFO: renamed from: ֫ */
    public static void m48345(String str) {
        synchronized (f67264) {
            m48346(str, null);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ܽ */
    public static void m48349(String str) {
        synchronized (f67264) {
            m48346(str, null);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ᩳ */
    public static void m48351(String str) {
        synchronized (f67264) {
            m48346(str, null);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ܽ */
    public static void m48350(String str, Throwable th) {
        synchronized (f67264) {
            m48346(str, th);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ۧ */
    public static void m48347(String str) {
        synchronized (f67264) {
            m48346(str, null);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ۧ */
    public static void m48348(String str, Throwable th) {
        synchronized (f67264) {
            m48346(str, th);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ֫ */
    public static void m48346(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (f67264) {
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
