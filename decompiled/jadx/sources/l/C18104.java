package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes5.dex */
public final class C18104 extends AbstractC8932 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC8932 f56355;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f56356;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f56357;

    public C18104(ArrayList arrayList, AbstractC8932 abstractC8932, ArrayList arrayList2) {
        this.f56357 = arrayList;
        this.f56355 = abstractC8932;
        this.f56356 = arrayList2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC8932.m23044(sb, "<", this.f56357, ">");
        AbstractC8932 abstractC8932 = this.f56355;
        if (abstractC8932 != null) {
            sb.append(" extends ");
            sb.append(abstractC8932);
        }
        AbstractC8932.m23044(sb, " implements ", this.f56356, "");
        return sb.toString();
    }
}
