package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۙᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08DV */
/* JADX INFO: loaded from: classes3.dex */
public class C6956 extends AbstractC25081 {

    /* JADX INFO: renamed from: ᩻ */
    public ArrayList f18092 = new ArrayList();

    /* JADX INFO: renamed from: ܳ */
    public final LinkedHashMap f18091 = new LinkedHashMap();

    @Override // p067l.AbstractC25081
    /* JADX INFO: renamed from: ۧ */
    public final void mo8717() {
        Iterator it = this.f18092.iterator();
        while (it.hasNext()) {
            ((AbstractC25081) it.next()).mo8717();
        }
    }

    @Override // p067l.AbstractC25081
    /* JADX INFO: renamed from: ֫ */
    public final void mo15938() {
        Iterator it = this.f18092.iterator();
        while (it.hasNext()) {
            ((AbstractC25081) it.next()).mo15938();
        }
    }

    @Override // p067l.AbstractC25081
    /* JADX INFO: renamed from: ֫ */
    public final void mo15941(boolean z) {
        super.mo15941(z);
        Iterator it = this.f18092.iterator();
        while (it.hasNext()) {
            ((AbstractC25081) it.next()).mo15941(z);
        }
    }

    @Override // p067l.AbstractC25081
    /* JADX INFO: renamed from: ֫ */
    public final void mo15939(C9226 c9226) {
        super.mo15939(c9226);
        Iterator it = this.f18092.iterator();
        while (it.hasNext()) {
            ((AbstractC25081) it.next()).mo15939(c9226);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15940(AbstractC25081 abstractC25081) {
        this.f18092.add(abstractC25081);
        abstractC25081.m55056(this);
        abstractC25081.mo15941(m55063());
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m15942(C10309 c10309, String str) {
        this.f18091.put(str.toLowerCase(), c10309);
    }

    @Override // p067l.AbstractC25081
    /* JADX INFO: renamed from: ֫ */
    public final C23050 mo15937(String str) {
        C23050 c23050Mo15937 = super.mo15937(str);
        return c23050Mo15937 == null ? (C23050) this.f18091.get(str.toLowerCase()) : c23050Mo15937;
    }
}
