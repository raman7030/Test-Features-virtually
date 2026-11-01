package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܿܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes5.dex */
public final class C18903 extends AbstractC10857 {

    /* JADX INFO: renamed from: ֫ */
    public final String f56426;

    /* JADX INFO: renamed from: ۧ */
    public final C18903 f56427;

    /* JADX INFO: renamed from: ܽ */
    public final List f56428;

    public C18903(C18903 c18903, String str, ArrayList arrayList) {
        this.f56427 = c18903;
        this.f56426 = str;
        this.f56428 = arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C18903 c18903 = this.f56427;
        if (c18903 != null) {
            sb.append(c18903);
            sb.append(".");
        }
        sb.append(this.f56426);
        AbstractC10857.m25018(sb, "<", this.f56428, ">");
        return sb.toString();
    }

    @Override // p067l.AbstractC10857
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo25019() {
        if (this.f56427 != null || !this.f56426.equals("java/lang/Object")) {
            return false;
        }
        List list = this.f56428;
        return list == null || list.isEmpty();
    }
}
