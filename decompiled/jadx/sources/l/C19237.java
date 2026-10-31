package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.᩵ۙۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6OE */
/* JADX INFO: loaded from: classes4.dex */
public final class C19237 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C19237 f60547 = new C19237("", "");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f60548;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f60549;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f60550;

    public C19237(String str, String str2) {
        if (!str2.isEmpty() && !str2.equals("\n") && !str2.equals("\r\n") && !str2.equals("\r")) {
            throw new IllegalArgumentException("Unsupported line ending");
        }
        this.f60549 = str2;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != '\t') {
                throw new IllegalArgumentException("Base indent must contain only spaces or tabs");
            }
        }
        this.f60550 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
        this.f60548 = str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m44371() {
        return this.f60549;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m44372() {
        return this.f60550;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m44370() {
        return this.f60548;
    }
}
