package l;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ۢ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 54F8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9449 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC2393 f28650;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C11749 f28653;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Map f28654 = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f28652 = "GET";

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C12454 f28651 = new C12454();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24280(C11749 c11749) {
        if (c11749 == null) {
            throw new NullPointerException("url == null");
        }
        this.f28653 = c11749;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24282(String str) {
        StringBuilder sb;
        int i;
        if (str == null) {
            throw new NullPointerException("url == null");
        }
        if (!str.regionMatches(true, 0, "ws:", 0, 3)) {
            if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                sb = new StringBuilder("https:");
                i = 4;
            }
            this.f28653 = C11749.m28763(str);
        }
        sb = new StringBuilder("http:");
        i = 3;
        str = C20087.m46305(i, str, sb);
        this.f28653 = C11749.m28763(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24283(String str, String str2) {
        C12454 c12454 = this.f28651;
        c12454.getClass();
        C10338.m26135(str);
        C10338.m26133(str2, str);
        c12454.m30617(str);
        c12454.m30616(str, str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24276(String str, String str2) {
        this.f28651.m30614(str, str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24275(String str) {
        this.f28651.m30617(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24278(C10338 c10338) {
        this.f28651 = c10338.m26138();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24279(C11044 c11044) {
        String string = c11044.toString();
        if (!string.isEmpty()) {
            C12454 c12454 = this.f28651;
            c12454.getClass();
            C10338.m26135("Cache-Control");
            C10338.m26133(string, "Cache-Control");
            c12454.m30617("Cache-Control");
            c12454.m30616("Cache-Control", string);
            return;
        }
        this.f28651.m30617("Cache-Control");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24281() {
        m24277("GET", (AbstractC2393) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24277(String str, AbstractC2393 abstractC2393) {
        if (str == null) {
            throw new NullPointerException("method == null");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("method.length() == 0");
        }
        if (abstractC2393 != null && !C3395.m10358(str)) {
            throw new IllegalArgumentException(C4860.m14172("method ", str, " must not have a request body."));
        }
        if (abstractC2393 == null && (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT"))) {
            throw new IllegalArgumentException(C4860.m14172("method ", str, " must have a request body."));
        }
        this.f28652 = str;
        this.f28650 = abstractC2393;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8743 m24274() {
        if (this.f28653 == null) {
            throw new IllegalStateException("url == null");
        }
        return new C8743(this);
    }
}
