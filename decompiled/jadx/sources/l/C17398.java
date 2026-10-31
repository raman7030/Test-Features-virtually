package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܿܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes5.dex */
public final class C17398 extends AbstractC8932 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f53239;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17398 f53240;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f53241;

    public C17398(C17398 c17398, String str, ArrayList arrayList) {
        this.f53240 = c17398;
        this.f53239 = str;
        this.f53241 = arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C17398 c17398 = this.f53240;
        if (c17398 != null) {
            sb.append(c17398);
            sb.append(".");
        }
        sb.append(this.f53239);
        AbstractC8932.m23044(sb, "<", this.f53241, ">");
        return sb.toString();
    }

    @Override // l.AbstractC8932
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo23045() {
        if (this.f53240 != null || !this.f53239.equals("java/lang/Object")) {
            return false;
        }
        List list = this.f53241;
        return list == null || list.isEmpty();
    }
}
