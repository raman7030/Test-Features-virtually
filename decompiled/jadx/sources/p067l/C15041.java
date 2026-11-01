package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J58K */
/* JADX INFO: loaded from: classes4.dex */
public final class C15041 extends AbstractC13701 {

    /* JADX INFO: renamed from: ۖ */
    public C3644 f42961;

    /* JADX INFO: renamed from: ۡ */
    public int f42962;

    /* JADX INFO: renamed from: ܺ */
    public ArrayList f42963;

    public C15041() {
        super(EnumC9677.LABEL);
        this.f42962 = -1;
    }

    @Override // p067l.AbstractC3880
    /* JADX INFO: renamed from: ֫ */
    public final C15041 mo7667(C3702 c3702) {
        C15041 c15041Mo7135 = c3702.mo7135(this);
        if (this.f42963 != null && c15041Mo7135.f42963 == null) {
            c15041Mo7135.f42963 = new ArrayList(this.f42963.size());
            Iterator it = this.f42963.iterator();
            while (it.hasNext()) {
                c15041Mo7135.f42963.add((C23089) ((C23089) it.next()).mo7667(c3702));
            }
        }
        return c15041Mo7135;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m34416() {
        return String.format("L%08x", Integer.valueOf(hashCode()));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m34416());
        sb.append(":");
        ArrayList arrayList = this.f42963;
        if (arrayList != null && arrayList.size() > 0) {
            sb.append(" // ");
            sb.append(this.f42963);
        }
        if (this.f42962 >= 0) {
            sb.append(" // line ");
            sb.append(this.f42962);
        }
        return sb.toString();
    }
}
