package p067l;

import android.net.Uri;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;
import com.alipay.sdk.p010m.p058y.C0249l;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۤۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 775Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C11931 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C15952 f33200;

    /* JADX INFO: renamed from: ۧ */
    public final String f33201;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11931)) {
            return false;
        }
        C11931 c11931 = (C11931) obj;
        return C12826.equals(this.f33201, c11931.f33201) && C12826.equals(this.f33200, c11931.f33200);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f33200) + (C12826.hashCode(this.f33201) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f33201, this.f33200};
        String[] strArrSplit = "url;requestConfig".length() == 0 ? new String[0] : "url;requestConfig".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder("UrlMediaArguments[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m27271() {
        return this.f33201;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C15952 m27273() {
        return this.f33200;
    }

    public C11931(String str, C15952 c15952) {
        String strTrim = str.trim();
        C12826.requireNonNull(c15952);
        if (m27267(strTrim) == EnumC13942.VALID) {
            this.f33201 = strTrim;
            this.f33200 = c15952;
            return;
        }
        throw new IllegalArgumentException("Invalid media URL");
    }

    /* JADX INFO: renamed from: ܿ */
    public static EnumC13942 m27267(String str) {
        if (str == null) {
            return EnumC13942.INVALID;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return EnumC13942.INVALID;
        }
        try {
            URI uri = new URI(strTrim);
            String scheme = uri.getScheme();
            if (scheme != null && ((scheme.equalsIgnoreCase(C0170a.f680s) || scheme.equalsIgnoreCase(C0171b.f688a)) && uri.getHost() != null && !uri.getHost().isEmpty() && uri.getRawUserInfo() == null)) {
                String path = uri.getPath();
                return path != null && path.toLowerCase(Locale.ROOT).endsWith(".mpd") ? EnumC13942.MPD_UNSUPPORTED : EnumC13942.VALID;
            }
            return EnumC13942.INVALID;
        } catch (URISyntaxException unused) {
            return EnumC13942.INVALID;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m27272() {
        MessageDigest messageDigestM36668 = C16111.m36668();
        C16111.m36662(messageDigestM36668, this.f33201);
        return "url:".concat(C16111.m36665(messageDigestM36668.digest()));
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m27269(String str) {
        Uri uri = Uri.parse(this.f33201);
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null && !lastPathSegment.isEmpty()) {
            return lastPathSegment;
        }
        String host = uri.getHost();
        return (host == null || host.isEmpty()) ? str : host;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m27270() {
        String path;
        Uri uri = Uri.parse(this.f33201);
        return (uri == null || (path = uri.getPath()) == null || !path.toLowerCase(Locale.ROOT).endsWith(".m3u8")) ? false : true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m27268(String str) {
        if (str != null) {
            C5178.m11084("VideoPlayerUrlArguments:".concat(str));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m27266(String str) {
        return str != null && str.toLowerCase(Locale.ROOT).endsWith(".m3u8");
    }
}
