package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8ET */
/* JADX INFO: loaded from: classes.dex */
public final class C23605 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m52085(String str) throws IOException {
        try {
            return Integer.parseInt(str, 10);
        } catch (NumberFormatException unused) {
            throw new IOException(C20094.m46315("Unable to parse int from string value: ", str));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m52086(String str) throws IOException {
        try {
            return Long.parseLong(str, 10);
        } catch (NumberFormatException unused) {
            throw new IOException(C20094.m46315("Unable to parse long from string value: ", str));
        }
    }
}
