package p067l;

import android.text.TextUtils;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: renamed from: l.֫ۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: F7U3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3876 {

    /* JADX INFO: renamed from: ֫ */
    public final String f8392;

    /* JADX INFO: renamed from: ۜ */
    public final int f8393;

    /* JADX INFO: renamed from: ۧ */
    public final String f8394;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f8395;

    /* JADX INFO: renamed from: ܽ */
    public final String f8396;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f8397;

    /* JADX INFO: renamed from: ᩳ */
    public final String f8398;

    /* JADX INFO: renamed from: ᩻ */
    public final String f8399;

    /* JADX INFO: renamed from: ֫ */
    public static C3876 m7660(int i, AbstractC5769 abstractC5769) {
        if (abstractC5769 instanceof C14566) {
            return new C3876(i, (C14566) abstractC5769);
        }
        throw new RuntimeException();
    }

    public C3876(int i, C14566 c14566) {
        this.f8393 = i;
        this.f8392 = c14566.f41581;
        this.f8399 = c14566.f41583;
        this.f8398 = c14566.f41586;
        this.f8394 = c14566.f41582;
        this.f8396 = c14566.f41584;
        this.f8395 = c14566.f41585;
        this.f8397 = c14566.f41587 == 5;
    }

    /* JADX INFO: renamed from: ֫ */
    public final URI m7661() {
        String strConcat = this.f8396;
        if (TextUtils.isEmpty(strConcat)) {
            return null;
        }
        String lowerCase = strConcat.toLowerCase();
        if (!lowerCase.startsWith("http://") && !lowerCase.startsWith("https://")) {
            strConcat = "https://".concat(strConcat);
        }
        try {
            return new URI(strConcat);
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3876.class == obj.getClass()) {
            C3876 c3876 = (C3876) obj;
            if (this.f8393 == c3876.f8393 && this.f8392.equals(c3876.f8392) && this.f8399.equals(c3876.f8399) && this.f8398.equals(c3876.f8398) && this.f8394.equals(c3876.f8394) && this.f8396.equals(c3876.f8396) && this.f8395 == c3876.f8395 && this.f8397 == c3876.f8397) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((C12832.m29411(C12832.m29411(C12832.m29411(C12832.m29411(C12832.m29411(this.f8393 * 31, 31, this.f8392), 31, this.f8399), 31, this.f8398), 31, this.f8394), 31, this.f8396) + (this.f8395 ? 1231 : 1237)) * 31) + (this.f8397 ? 1231 : 1237);
    }
}
