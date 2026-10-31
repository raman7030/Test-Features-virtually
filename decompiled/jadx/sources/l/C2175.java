package l;

import java.io.FileNotFoundException;

/* JADX INFO: renamed from: l.ۖ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77UM */
/* JADX INFO: loaded from: classes2.dex */
public final class C2175 extends FileNotFoundException {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m7191(Exception exc) {
        for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
            if (cause instanceof C2175) {
                return true;
            }
        }
        return false;
    }
}
