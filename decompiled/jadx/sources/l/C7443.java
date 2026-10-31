package l;

import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import java.io.ByteArrayInputStream;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: l.۟ۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R905 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7443 extends AbstractC12382 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC11677 f22861;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC13792 f22862;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C7443 m19976() {
        return new C7443(new C22965(), new C6032());
    }

    public C7443(AbstractC13792 abstractC13792, AbstractC11677 abstractC11677) {
        this.f22862 = abstractC13792;
        this.f22861 = abstractC11677;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    @Override // l.AbstractC12382
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1093 mo19978(String str) {
        String str2;
        String str3;
        boolean zEquals;
        String strReplaceAll;
        C10266 c10266;
        String[] strArrSplit;
        int length;
        if (!str.startsWith("data:")) {
            throw new IllegalStateException("Invalid data-uri: ".concat(str));
        }
        String strSubstring = str.substring(5);
        ((C22965) this.f22862).getClass();
        int iIndexOf = strSubstring.indexOf(44);
        byte[] bytes = null;
        if (iIndexOf < 0) {
            c10266 = null;
        } else {
            if (iIndexOf <= 0 || (length = (strArrSplit = strSubstring.substring(0, iIndexOf).split(l.b)).length) <= 0) {
                str2 = null;
                str3 = str2;
                zEquals = false;
            } else if (length == 1) {
                str2 = strArrSplit[0];
                if ("base64".equals(str2)) {
                    zEquals = true;
                    str3 = null;
                } else {
                    if (str2.indexOf(47) <= -1) {
                        str2 = null;
                    }
                    str3 = str2;
                    zEquals = false;
                }
            } else {
                str3 = strArrSplit[0].indexOf(47) > -1 ? strArrSplit[0] : null;
                zEquals = "base64".equals(strArrSplit[length - 1]);
            }
            if (iIndexOf < strSubstring.length()) {
                strReplaceAll = strSubstring.substring(iIndexOf + 1, strSubstring.length()).replaceAll("\n", "");
                if (strReplaceAll.length() == 0) {
                    strReplaceAll = null;
                }
            } else {
                strReplaceAll = null;
            }
            c10266 = new C10266(str3, strReplaceAll, zEquals);
        }
        if (c10266 == null) {
            throw new IllegalStateException("Invalid data-uri: ".concat(str));
        }
        try {
            ((C6032) this.f22861).getClass();
            String strM26001 = c10266.m26001();
            if (!TextUtils.isEmpty(strM26001)) {
                if (c10266.m25999()) {
                    bytes = Base64.decode(strM26001.getBytes(a.D), 0);
                } else {
                    bytes = strM26001.getBytes(a.D);
                }
            }
            if (bytes == null) {
                throw new IllegalStateException("Decoding data-uri failed: ".concat(str));
            }
            return AbstractC8149.m21620(new ByteArrayInputStream(bytes), c10266.m26000());
        } catch (Throwable th) {
            throw new IllegalStateException("Cannot decode data-uri: ".concat(str), th);
        }
    }

    @Override // l.AbstractC12382
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Collection mo19977() {
        return Collections.singleton(e.m);
    }
}
