package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C21476 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final List f67740;

    /* JADX INFO: renamed from: ۧ */
    public final int f67741;

    /* JADX INFO: renamed from: ܽ */
    public final String f67742;

    /* JADX INFO: renamed from: ᩳ */
    public final String f67743;

    public /* synthetic */ C21476(int i, String str, String str2, ArrayList arrayList) {
        this(i, str, str2, (List) arrayList);
    }

    public C21476(int i, String str, String str2, List list) {
        this.f67742 = str;
        this.f67743 = str2;
        this.f67740 = list;
        this.f67741 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21476)) {
            return false;
        }
        C21476 c21476 = (C21476) obj;
        return this.f67741 == c21476.f67741 && C12826.equals(this.f67742, c21476.f67742) && C12826.equals(this.f67743, c21476.f67743) && C12826.equals(this.f67740, c21476.f67740);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f67740) + C21720.m49003(C21720.m49003(this.f67741 * 31, 31, this.f67742), 31, this.f67743);
    }

    public final String toString() {
        Object[] objArr = {this.f67742, this.f67743, this.f67740, Integer.valueOf(this.f67741)};
        String[] strArrSplit = "mediaIdentity;playbackPositionKey;actions;checkedIndex".length() == 0 ? new String[0] : "mediaIdentity;playbackPositionKey;actions;checkedIndex".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C21476.class, sb, "[");
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

    /* JADX INFO: renamed from: ֫ */
    public final List m48674() {
        return this.f67740;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m48675() {
        return this.f67743;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m48676() {
        return this.f67741;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m48677() {
        return this.f67742;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21476 m48673(String str, String str2) {
        return new C21476(-1, str, str2, Collections.EMPTY_LIST);
    }
}
