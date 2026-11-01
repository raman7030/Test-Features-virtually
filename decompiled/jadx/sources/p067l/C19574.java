package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes5.dex */
public final class C19574 extends AbstractC10857 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10857 f59568;

    /* JADX INFO: renamed from: ۧ */
    public final List f59569;

    /* JADX INFO: renamed from: ܽ */
    public final List f59570;

    public C19574(ArrayList arrayList, AbstractC10857 abstractC10857, ArrayList arrayList2) {
        this.f59570 = arrayList;
        this.f59568 = abstractC10857;
        this.f59569 = arrayList2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC10857.m25018(sb, "<", this.f59570, ">");
        AbstractC10857 abstractC10857 = this.f59568;
        if (abstractC10857 != null) {
            sb.append(" extends ");
            sb.append(abstractC10857);
        }
        AbstractC10857.m25018(sb, " implements ", this.f59569, "");
        return sb.toString();
    }
}
