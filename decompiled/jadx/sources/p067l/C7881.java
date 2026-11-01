package p067l;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: V2DV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7881 extends AbstractC13246 {

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f20693 = new ArrayList();

    public C7881(AbstractC13246... abstractC13246Arr) {
        for (AbstractC13246 abstractC13246 : abstractC13246Arr) {
            if (abstractC13246 != null) {
                this.f20693.add(abstractC13246);
            }
        }
    }

    @Override // p067l.AbstractC13246
    /* JADX INFO: renamed from: ֫ */
    public final int mo18199(CharSequence charSequence, int i, StringWriter stringWriter) {
        Iterator it = this.f20693.iterator();
        while (it.hasNext()) {
            int iMo18199 = ((AbstractC13246) it.next()).mo18199(charSequence, i, stringWriter);
            if (iMo18199 != 0) {
                return iMo18199;
            }
        }
        return 0;
    }
}
