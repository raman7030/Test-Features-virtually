package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8ET */
/* JADX INFO: loaded from: classes.dex */
public final class C24802 {
    /* JADX INFO: renamed from: ֫ */
    public static int m54488(String str) throws IOException {
        try {
            return Integer.parseInt(str, 10);
        } catch (NumberFormatException unused) {
            throw new IOException(C21466.m48631("Unable to parse int from string value: ", str));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static long m54489(String str) throws IOException {
        try {
            return Long.parseLong(str, 10);
        } catch (NumberFormatException unused) {
            throw new IOException(C21466.m48631("Unable to parse long from string value: ", str));
        }
    }
}
