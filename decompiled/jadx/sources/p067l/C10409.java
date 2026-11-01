package p067l;

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
public final class C10409 {

    /* JADX INFO: renamed from: ܽ */
    public static final Logger f28790 = Logger.getLogger(C10409.class.getName());

    /* JADX INFO: renamed from: ֫ */
    public final URI f28791;

    /* JADX INFO: renamed from: ۧ */
    public final C3703 f28792;

    public C10409(Response response) {
        URI uri;
        String href = response.getHref();
        try {
            uri = new URI(href);
        } catch (URISyntaxException unused) {
            uri = new URI(null, null, C5136.decode(href.replace(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "%2B"), StandardCharsets.UTF_8), null);
        }
        this.f28791 = uri;
        String status = response.getStatus();
        if (status != null && !status.isEmpty()) {
            try {
                C23245.m51791(response.getStatus());
            } catch (IOException unused2) {
                f28790.warning("Failed to parse status line: ".concat(status));
            }
        }
        this.f28792 = new C3703(this, response);
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m24110(C10409 c10409, Response response) {
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
                    f28790.warning("Failed to parse content length ".concat(getcontentlength));
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ۧ */
    public final Date m24112() {
        return this.f28792.f7828;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Long m24111() {
        return this.f28792.f7826;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m24114() {
        return "httpd/unix-directory".equals(this.f28792.f7827);
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m24113() {
        String path = this.f28791.getPath();
        try {
            if (path.endsWith("/")) {
                path = path.substring(0, path.length() - 1);
            }
            return path.substring(path.lastIndexOf(47) + 1);
        } catch (StringIndexOutOfBoundsException unused) {
            f28790.warning("Failed to parse name from path " + path);
            return null;
        }
    }

    public final String toString() {
        return this.f28791.getPath();
    }
}
