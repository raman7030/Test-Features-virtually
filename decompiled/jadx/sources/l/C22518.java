package l;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩹᩶ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes.dex */
public final class C22518 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f72867 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static Function f72869;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0645 f72871;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Set f72870 = Collections.newSetFromMap(new ConcurrentMapC10942());

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Charset f72872 = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final byte[] f72868 = {77, 84, 73, 79};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50482(Throwable th) throws IOException {
        Throwable cause;
        if ((th instanceof ExecutionException) && (cause = th.getCause()) != null) {
            th = cause;
        }
        throw new IOException(th.getMessage(), th);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0645 m50492() {
        f72871.getClass();
        return f72871;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m50491() {
        return f72871 != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50484(InterfaceC0645 interfaceC0645) {
        f72871 = interfaceC0645;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50483(Function function) {
        f72869 = function;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m50489(String str) {
        Function function = f72869;
        return function != null ? (String) function.apply(str) : str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m50485(String str) {
        str.getClass();
        switch (str) {
            case "a":
            case "w":
            case "rw":
            case "wa":
            case "wt":
            case "rwt":
                return true;
            case "r":
                return false;
            default:
                throw new IllegalArgumentException("Mode: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte m50487(String str) {
        str.getClass();
        switch (str) {
            case "a":
            case "wa":
                return (byte) 2;
            case "r":
                return (byte) 0;
            case "w":
            case "wt":
                return (byte) 1;
            case "rw":
                return (byte) 3;
            case "rwt":
                return (byte) 4;
            default:
                throw new IllegalArgumentException("Mode: ".concat(str));
        }
    }
}
