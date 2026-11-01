package p067l;

import android.util.Base64;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ۫ */
/* JADX INFO: compiled from: V543 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1422 {

    /* JADX INFO: renamed from: ֫ */
    public final List f37857;

    /* JADX INFO: renamed from: ۧ */
    public final String f37858;

    /* JADX INFO: renamed from: ܽ */
    public final String f37859;

    /* JADX INFO: renamed from: ܿ */
    public final String f37860;

    /* JADX INFO: renamed from: ᩳ */
    public final String f37861;

    public C1422(String str, String str2, String str3, List list) {
        str.getClass();
        this.f37859 = str;
        str2.getClass();
        this.f37861 = str2;
        this.f37860 = str3;
        list.getClass();
        this.f37857 = list;
        this.f37858 = str + "-" + str2 + "-" + str3;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m30633() {
        return this.f37859;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m30635() {
        return this.f37861;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m30634() {
        return this.f37860;
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m30631() {
        return this.f37857;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m30632() {
        return this.f37858;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f37859 + ", mProviderPackage: " + this.f37861 + ", mQuery: " + this.f37860 + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f37857;
            if (i < list.size()) {
                sb.append(" [");
                List list2 = (List) list.get(i);
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    sb.append(" \"");
                    sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                    sb.append("\"");
                }
                sb.append(" ]");
                i++;
            } else {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
        }
    }
}
