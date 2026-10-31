package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6MY */
/* JADX INFO: loaded from: classes5.dex */
public final class C21003 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f67812;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f67813;

    public C21003(ArrayList arrayList, int i) {
        this.f67812 = arrayList;
        this.f67813 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21003)) {
            return false;
        }
        C21003 c21003 = (C21003) obj;
        return this.f67813 == c21003.f67813 && C11003.equals(this.f67812, c21003.f67812);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f67812) + (this.f67813 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f67812, Integer.valueOf(this.f67813)};
        String[] strArrSplit = "parts;rows".length() == 0 ? new String[0] : "parts;rows".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C21003.class, sb, "[");
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m47822() {
        return this.f67812;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47821() {
        return ((C9714) C7166.m19188(1, this.f67812)).f29407;
    }
}
