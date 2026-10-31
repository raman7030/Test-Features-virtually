package l;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: V2DV */
/* JADX INFO: loaded from: classes3.dex */
public final class C5801 extends AbstractC11446 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f17840 = new ArrayList();

    public C5801(AbstractC11446... abstractC11446Arr) {
        for (AbstractC11446 abstractC11446 : abstractC11446Arr) {
            if (abstractC11446 != null) {
                this.f17840.add(abstractC11446);
            }
        }
    }

    @Override // l.AbstractC11446
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo16274(CharSequence charSequence, int i, StringWriter stringWriter) {
        Iterator it = this.f17840.iterator();
        while (it.hasNext()) {
            int iMo16274 = ((AbstractC11446) it.next()).mo16274(charSequence, i, stringWriter);
            if (iMo16274 != 0) {
                return iMo16274;
            }
        }
        return 0;
    }
}
