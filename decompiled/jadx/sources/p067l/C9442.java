package p067l;

import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.ByteArrayInputStream;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: l.۟ۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R905 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9442 extends AbstractC14136 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC13466 f25773;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC15476 f25774;

    /* JADX INFO: renamed from: ۧ */
    public static C9442 m21951() {
        return new C9442(new C24194(), new C8101());
    }

    public C9442(AbstractC15476 abstractC15476, AbstractC13466 abstractC13466) {
        this.f25774 = abstractC15476;
        this.f25773 = abstractC13466;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    @Override // p067l.AbstractC14136
    /* JADX INFO: renamed from: ֫ */
    public final C3407 mo21953(String str) {
        String str2;
        String str3;
        boolean zEquals;
        String strReplaceAll;
        C12125 c12125;
        String[] strArrSplit;
        int length;
        if (!str.startsWith("data:")) {
            throw new IllegalStateException("Invalid data-uri: ".concat(str));
        }
        String strSubstring = str.substring(5);
        ((C24194) this.f25774).getClass();
        int iIndexOf = strSubstring.indexOf(44);
        byte[] bytes = null;
        if (iIndexOf < 0) {
            c12125 = null;
        } else {
            if (iIndexOf <= 0 || (length = (strArrSplit = strSubstring.substring(0, iIndexOf).split(C0249l.f1196b)).length) <= 0) {
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
            c12125 = new C12125(str3, strReplaceAll, zEquals);
        }
        if (c12125 == null) {
            throw new IllegalStateException("Invalid data-uri: ".concat(str));
        }
        try {
            ((C8101) this.f25773).getClass();
            String strM28023 = c12125.m28023();
            if (!TextUtils.isEmpty(strM28023)) {
                if (c12125.m28021()) {
                    bytes = Base64.decode(strM28023.getBytes(C0233a.f1077D), 0);
                } else {
                    bytes = strM28023.getBytes(C0233a.f1077D);
                }
            }
            if (bytes == null) {
                throw new IllegalStateException("Decoding data-uri failed: ".concat(str));
            }
            return AbstractC10113.m23588(new ByteArrayInputStream(bytes), c12125.m28022());
        } catch (Throwable th) {
            throw new IllegalStateException("Cannot decode data-uri: ".concat(str), th);
        }
    }

    @Override // p067l.AbstractC14136
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo21952() {
        return Collections.singleton(AbstractC0213e.f989m);
    }
}
