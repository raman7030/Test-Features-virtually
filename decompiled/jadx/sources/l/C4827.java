package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۙᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08DV */
/* JADX INFO: loaded from: classes3.dex */
public class C4827 extends AbstractC23898 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ArrayList f15259 = new ArrayList();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f15258 = new LinkedHashMap();

    @Override // l.AbstractC23898
    /* JADX INFO: renamed from: ۧ */
    public final void mo6591() {
        Iterator it = this.f15259.iterator();
        while (it.hasNext()) {
            ((AbstractC23898) it.next()).mo6591();
        }
    }

    @Override // l.AbstractC23898
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14058() {
        Iterator it = this.f15259.iterator();
        while (it.hasNext()) {
            ((AbstractC23898) it.next()).mo14058();
        }
    }

    @Override // l.AbstractC23898
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14061(boolean z) {
        super.mo14061(z);
        Iterator it = this.f15259.iterator();
        while (it.hasNext()) {
            ((AbstractC23898) it.next()).mo14061(z);
        }
    }

    @Override // l.AbstractC23898
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14059(C7216 c7216) {
        super.mo14059(c7216);
        Iterator it = this.f15259.iterator();
        while (it.hasNext()) {
            ((AbstractC23898) it.next()).mo14059(c7216);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14060(AbstractC23898 abstractC23898) {
        this.f15259.add(abstractC23898);
        abstractC23898.m52647(this);
        abstractC23898.mo14061(m52654());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14062(C8355 c8355, String str) {
        this.f15258.put(str.toLowerCase(), c8355);
    }

    @Override // l.AbstractC23898
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21761 mo14057(String str) {
        C21761 c21761Mo14057 = super.mo14057(str);
        return c21761Mo14057 == null ? (C21761) this.f15258.get(str.toLowerCase()) : c21761Mo14057;
    }
}
