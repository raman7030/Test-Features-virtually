package p067l;

import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5C6 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3156 extends AbstractRunnableC22643 {
    /* JADX INFO: renamed from: ۧ */
    public abstract String mo5410(AbstractC17043 abstractC17043);

    public AbstractC3156(C21302 c21302, String str) {
        super(c21302);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m5409(AbstractC17043 abstractC17043, StringBuilder sb) {
        if (!abstractC17043.mo25087()) {
            return "500 Internal error, listDirectory on non-directory\r\n";
        }
        List listMo25500 = abstractC17043.mo25500(true);
        Collections.sort(listMo25500, new C12290(1));
        Iterator it = listMo25500.iterator();
        while (it.hasNext()) {
            String strMo5410 = mo5410((AbstractC17043) it.next());
            if (strMo5410 != null) {
                sb.append(strMo5410);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m5411(String str) {
        C21302 c21302 = this.f71446;
        if (!c21302.m48176()) {
            c21302.m48154();
            return "425 Error opening data socket\r\n";
        }
        c21302.m48173("150 Opening " + (c21302.m48171() ? "BINARY" : "ASCII") + " mode data connection for file list\r\n");
        boolean zM48160 = false;
        try {
            byte[] bytes = str.getBytes(c21302.f67131);
            zM48160 = c21302.m48160(0, bytes.length, bytes);
        } catch (UnsupportedEncodingException unused) {
        }
        if (!zM48160) {
            c21302.m48154();
            return "426 Data socket or network error\r\n";
        }
        c21302.m48154();
        c21302.m48173("226 Data transmission OK\r\n");
        return null;
    }
}
