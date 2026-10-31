package l;

import android.text.TextUtils;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: renamed from: l.֫ۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: F7U3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1586 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f5613;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f5614;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f5615;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f5616;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f5617;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f5618;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f5619;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f5620;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1586 m5431(int i, AbstractC3577 abstractC3577) {
        if (abstractC3577 instanceof C12834) {
            return new C1586(i, (C12834) abstractC3577);
        }
        throw new RuntimeException();
    }

    public C1586(int i, C12834 c12834) {
        this.f5614 = i;
        this.f5613 = c12834.f38539;
        this.f5620 = c12834.f38541;
        this.f5619 = c12834.f38544;
        this.f5615 = c12834.f38540;
        this.f5617 = c12834.f38542;
        this.f5616 = c12834.f38543;
        this.f5618 = c12834.f38545 == 5;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final URI m5432() {
        String strConcat = this.f5617;
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
        if (obj != null && C1586.class == obj.getClass()) {
            C1586 c1586 = (C1586) obj;
            if (this.f5614 == c1586.f5614 && this.f5613.equals(c1586.f5613) && this.f5620.equals(c1586.f5620) && this.f5619.equals(c1586.f5619) && this.f5615.equals(c1586.f5615) && this.f5617.equals(c1586.f5617) && this.f5616 == c1586.f5616 && this.f5618 == c1586.f5618) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((C11010.m27349(C11010.m27349(C11010.m27349(C11010.m27349(C11010.m27349(this.f5614 * 31, 31, this.f5613), 31, this.f5620), 31, this.f5619), 31, this.f5615), 31, this.f5617) + (this.f5616 ? 1231 : 1237)) * 31) + (this.f5618 ? 1231 : 1237);
    }
}
