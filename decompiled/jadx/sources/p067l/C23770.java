package p067l;

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
public final class C23770 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f75593 = 0;

    /* JADX INFO: renamed from: ܳ */
    public static Function f75595;

    /* JADX INFO: renamed from: ܿ */
    public static InterfaceC2982 f75597;

    /* JADX INFO: renamed from: ܽ */
    public static Set f75596 = Collections.newSetFromMap(new ConcurrentMapC12768());

    /* JADX INFO: renamed from: ᩳ */
    public static final Charset f75598 = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: ۧ */
    public static final byte[] f75594 = {77, 84, 73, 79};

    /* JADX INFO: renamed from: ֫ */
    public static void m52824(Throwable th) throws IOException {
        Throwable cause;
        if ((th instanceof ExecutionException) && (cause = th.getCause()) != null) {
            th = cause;
        }
        throw new IOException(th.getMessage(), th);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static InterfaceC2982 m52834() {
        f75597.getClass();
        return f75597;
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m52833() {
        return f75597 != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52826(InterfaceC2982 interfaceC2982) {
        f75597 = interfaceC2982;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52825(Function function) {
        f75595 = function;
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m52831(String str) {
        Function function = f75595;
        return function != null ? (String) function.apply(str) : str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m52827(String str) {
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

    /* JADX INFO: renamed from: ۧ */
    public static byte m52829(String str) {
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
