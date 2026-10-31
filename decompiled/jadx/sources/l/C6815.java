package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۜܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public final class C6815 extends AbstractC8932 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC8932 f21138;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f21139;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f21140;

    public C6815(String str, AbstractC8932 abstractC8932, ArrayList arrayList) {
        this.f21140 = str;
        this.f21138 = abstractC8932;
        this.f21139 = arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21140);
        String str = " extends ";
        AbstractC8932 abstractC8932 = this.f21138;
        if (abstractC8932 != null) {
            sb.append(" extends ");
            sb.append(abstractC8932);
            str = " & ";
        }
        List<AbstractC8932> list = this.f21139;
        if (list != null) {
            for (AbstractC8932 abstractC8933 : list) {
                sb.append(str);
                sb.append(abstractC8933);
                str = " & ";
            }
        }
        return sb.toString();
    }
}
