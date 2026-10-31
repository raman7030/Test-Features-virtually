package l;

import com.google.android.material.badge.BadgeDrawable;
import com.thegrizzlylabs.sardineandroid.model.Propstat;
import com.thegrizzlylabs.sardineandroid.model.Response;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.۠᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: SA89 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8460 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Logger f25877 = Logger.getLogger(C8460.class.getName());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final URI f25878;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C1404 f25879;

    public C8460(Response response) {
        URI uri;
        String href = response.getHref();
        try {
            uri = new URI(href);
        } catch (URISyntaxException unused) {
            uri = new URI(null, null, C2912.decode(href.replace(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "%2B"), StandardCharsets.UTF_8), null);
        }
        this.f25878 = uri;
        String status = response.getStatus();
        if (status != null && !status.isEmpty()) {
            try {
                C21967.m49454(response.getStatus());
            } catch (IOException unused2) {
                f25877.warning("Failed to parse status line: ".concat(status));
            }
        }
        this.f25879 = new C1404(this, response);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m22141(C8460 c8460, Response response) {
        String getcontentlength;
        List<Propstat> propstat = response.getPropstat();
        long j = -1;
        if (propstat.isEmpty()) {
            return -1L;
        }
        for (Propstat propstat2 : propstat) {
            if (propstat2.getProp() != null && (getcontentlength = propstat2.getProp().getGetcontentlength()) != null) {
                try {
                    j = Long.parseLong(getcontentlength);
                    break;
                } catch (NumberFormatException unused) {
                    f25877.warning("Failed to parse content length ".concat(getcontentlength));
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Date m22143() {
        return this.f25879.f5057;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Long m22142() {
        return this.f25879.f5055;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m22145() {
        return "httpd/unix-directory".equals(this.f25879.f5056);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m22144() {
        String path = this.f25878.getPath();
        try {
            if (path.endsWith("/")) {
                path = path.substring(0, path.length() - 1);
            }
            return path.substring(path.lastIndexOf(47) + 1);
        } catch (StringIndexOutOfBoundsException unused) {
            f25877.warning("Failed to parse name from path " + path);
            return null;
        }
    }

    public final String toString() {
        return this.f25878.getPath();
    }
}
