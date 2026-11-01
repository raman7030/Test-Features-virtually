package p067l;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ۢ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 54F8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11349 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC4643 f31599;

    /* JADX INFO: renamed from: ܿ */
    public C13535 f31602;

    /* JADX INFO: renamed from: ᩳ */
    public Map f31603 = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: ܽ */
    public String f31601 = "GET";

    /* JADX INFO: renamed from: ۧ */
    public C14205 f31600 = new C14205();

    /* JADX INFO: renamed from: ֫ */
    public final void m26290(C13535 c13535) {
        if (c13535 == null) {
            throw new NullPointerException("url == null");
        }
        this.f31602 = c13535;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26292(String str) {
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
            this.f31602 = C13535.m30810(str);
        }
        sb = new StringBuilder("http:");
        i = 3;
        str = C21459.m48621(i, str, sb);
        this.f31602 = C13535.m30810(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26293(String str, String str2) {
        C14205 c14205 = this.f31600;
        c14205.getClass();
        C12194.m28160(str);
        C12194.m28158(str2, str);
        c14205.m32682(str);
        c14205.m32681(str, str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26286(String str, String str2) {
        this.f31600.m32679(str, str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26285(String str) {
        this.f31600.m32682(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26288(C12194 c12194) {
        this.f31600 = c12194.m28163();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26289(C12865 c12865) {
        String string = c12865.toString();
        if (!string.isEmpty()) {
            C14205 c14205 = this.f31600;
            c14205.getClass();
            C12194.m28160("Cache-Control");
            C12194.m28158(string, "Cache-Control");
            c14205.m32682("Cache-Control");
            c14205.m32681("Cache-Control", string);
            return;
        }
        this.f31600.m32682("Cache-Control");
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26291() {
        m26287("GET", (AbstractC4643) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26287(String str, AbstractC4643 abstractC4643) {
        if (str == null) {
            throw new NullPointerException("method == null");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("method.length() == 0");
        }
        if (abstractC4643 != null && !C5595.m12397(str)) {
            throw new IllegalArgumentException(C6988.m16053("method ", str, " must not have a request body."));
        }
        if (abstractC4643 == null && (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT"))) {
            throw new IllegalArgumentException(C6988.m16053("method ", str, " must have a request body."));
        }
        this.f31601 = str;
        this.f31599 = abstractC4643;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10678 m26284() {
        if (this.f31602 == null) {
            throw new IllegalStateException("url == null");
        }
        return new C10678(this);
    }
}
