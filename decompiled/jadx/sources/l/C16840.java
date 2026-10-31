package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ܽ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R8MQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16840 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashSet f51694 = new HashSet();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String f51695 = "media3.common";

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized String m39614() {
        return f51695;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m39615(String str) {
        if (f51694.add(str)) {
            f51695 += ", " + str;
        }
    }
}
