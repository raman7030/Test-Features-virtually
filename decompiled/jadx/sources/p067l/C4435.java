package p067l;

import java.io.FileNotFoundException;

/* JADX INFO: renamed from: l.ۖ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77UM */
/* JADX INFO: loaded from: classes2.dex */
public final class C4435 extends FileNotFoundException {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m9270(Exception exc) {
        for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
            if (cause instanceof C4435) {
                return true;
            }
        }
        return false;
    }
}
