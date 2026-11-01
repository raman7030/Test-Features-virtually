package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܶۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16780 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final EnumC22147 f49444;

    /* JADX INFO: renamed from: ۧ */
    public final String f49445;

    /* JADX INFO: renamed from: ܽ */
    public final C13010 f49446;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f49447;

    /* JADX INFO: renamed from: ᩳ */
    public final List f49448;

    public /* synthetic */ C16780(C13010 c13010, List list, boolean z, EnumC22147 enumC22147, String str, int i) {
        this(c13010, list, z, enumC22147, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16780)) {
            return false;
        }
        C16780 c16780 = (C16780) obj;
        return this.f49447 == c16780.f49447 && C12826.equals(this.f49446, c16780.f49446) && C12826.equals(this.f49448, c16780.f49448) && C12826.equals(this.f49444, c16780.f49444) && C12826.equals(this.f49445, c16780.f49445);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f49445) + ((C12826.hashCode(this.f49444) + ((C12826.hashCode(this.f49448) + ((C12826.hashCode(this.f49446) + ((this.f49447 ? 1231 : 1237) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f49446, this.f49448, Boolean.valueOf(this.f49447), this.f49444, this.f49445};
        String[] strArrSplit = "mediaItem;subtitleMatches;subtitleMatchesResolved;externalSubtitleMode;externalSubtitlePath".length() == 0 ? new String[0] : "mediaItem;subtitleMatches;subtitleMatchesResolved;externalSubtitleMode;externalSubtitlePath".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C16780.class, sb, "[");
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
    public final EnumC22147 m38022() {
        return this.f49444;
    }

    /* JADX INFO: renamed from: ܳ */
    public final List m38023() {
        return this.f49448;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m38024() {
        return this.f49445;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C13010 m38025() {
        return this.f49446;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m38026() {
        return this.f49447;
    }

    public C16780(C13010 c13010, List list, boolean z, EnumC22147 enumC22147, String str) {
        List listUnmodifiableList = C21562.unmodifiableList(new ArrayList(list));
        this.f49446 = c13010;
        this.f49448 = listUnmodifiableList;
        this.f49447 = z;
        this.f49444 = enumC22147;
        this.f49445 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16780 m38021(C13010 c13010, List list, boolean z) {
        return new C16780(c13010, list, z, EnumC22147.NONE, null);
    }
}
