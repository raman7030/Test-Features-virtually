package l;

import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5C6 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0829 extends AbstractRunnableC21333 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract String mo3096(AbstractC15440 abstractC15440);

    public AbstractC0829(C19922 c19922, String str) {
        super(c19922);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m3095(AbstractC15440 abstractC15440, StringBuilder sb) {
        if (!abstractC15440.mo23113()) {
            return "500 Internal error, listDirectory on non-directory\r\n";
        }
        List listMo23549 = abstractC15440.mo23549(true);
        Collections.sort(listMo23549, new C10439(1));
        Iterator it = listMo23549.iterator();
        while (it.hasNext()) {
            String strMo3096 = mo3096((AbstractC15440) it.next());
            if (strMo3096 != null) {
                sb.append(strMo3096);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m3097(String str) {
        C19922 c19922 = this.f68752;
        if (!c19922.m45863()) {
            c19922.m45841();
            return "425 Error opening data socket\r\n";
        }
        c19922.m45860("150 Opening " + (c19922.m45858() ? "BINARY" : "ASCII") + " mode data connection for file list\r\n");
        boolean zM45847 = false;
        try {
            byte[] bytes = str.getBytes(c19922.f64494);
            zM45847 = c19922.m45847(0, bytes.length, bytes);
        } catch (UnsupportedEncodingException unused) {
        }
        if (!zM45847) {
            c19922.m45841();
            return "426 Data socket or network error\r\n";
        }
        c19922.m45841();
        c19922.m45860("226 Data transmission OK\r\n");
        return null;
    }
}
