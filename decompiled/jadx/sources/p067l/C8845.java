package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۜܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public final class C8845 extends AbstractC10857 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10857 f24015;

    /* JADX INFO: renamed from: ۧ */
    public final List f24016;

    /* JADX INFO: renamed from: ܽ */
    public final String f24017;

    public C8845(String str, AbstractC10857 abstractC10857, ArrayList arrayList) {
        this.f24017 = str;
        this.f24015 = abstractC10857;
        this.f24016 = arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24017);
        String str = " extends ";
        AbstractC10857 abstractC10857 = this.f24015;
        if (abstractC10857 != null) {
            sb.append(" extends ");
            sb.append(abstractC10857);
            str = " & ";
        }
        List<AbstractC10857> list = this.f24016;
        if (list != null) {
            for (AbstractC10857 abstractC10858 : list) {
                sb.append(str);
                sb.append(abstractC10858);
                str = " & ";
            }
        }
        return sb.toString();
    }
}
