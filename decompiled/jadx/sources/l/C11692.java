package l;

import android.util.Base64;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: V543 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11692 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f34858;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f34859;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f34860;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f34861;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f34862;

    public C11692(String str, String str2, String str3, List list) {
        str.getClass();
        this.f34860 = str;
        str2.getClass();
        this.f34862 = str2;
        this.f34861 = str3;
        list.getClass();
        this.f34858 = list;
        this.f34859 = str + "-" + str2 + "-" + str3;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m28585() {
        return this.f34860;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m28587() {
        return this.f34862;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m28586() {
        return this.f34861;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m28583() {
        return this.f34858;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m28584() {
        return this.f34859;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f34860 + ", mProviderPackage: " + this.f34862 + ", mQuery: " + this.f34861 + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f34858;
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
