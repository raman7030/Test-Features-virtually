package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95JE */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9206 implements InterfaceC2538, InterfaceC9915 {

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC15240[] f24914;

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC15240[] f24915;

    /* JADX INFO: renamed from: ܽ */
    public int f24916;

    /* JADX INFO: renamed from: ᩳ */
    public C7726 f24918;

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f24913 = new ArrayList();

    /* JADX INFO: renamed from: ܿ */
    public boolean f24917 = true;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8304(InterfaceC15240 interfaceC15240);

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC15240[] mo8305(int i);

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo8307();

    /* JADX INFO: renamed from: ܿ */
    public abstract InterfaceC15240 mo8308();

    @Override // p067l.InterfaceC2538
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3728(Object obj, AbstractC3880 abstractC3880) {
        this.f24914 = (InterfaceC15240[]) obj;
        try {
            C16620.m37683(abstractC3880, this, false);
            InterfaceC15240[] interfaceC15240Arr = this.f24914;
            this.f24914 = null;
            return interfaceC15240Arr;
        } catch (Exception e) {
            throw new RuntimeException("fail exe " + abstractC3880, e);
        }
    }

    public AbstractC9206(C7726 c7726) {
        this.f24918 = c7726;
        this.f24916 = c7726.f20261.size();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m21224() {
        boolean z = this.f24917;
        C7726 c7726 = this.f24918;
        if (z) {
            Iterator it = c7726.f20261.iterator();
            int i = 0;
            while (it.hasNext()) {
                ((C19736) it.next()).f60034 = i;
                i++;
            }
        }
        C16620.m37684(c7726);
        this.f24915 = mo8305(this.f24916);
        C16620.m37687(c7726.f20257, this);
        this.f24915 = null;
        mo8307();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC15240[] m21225() {
        return mo8305(this.f24916);
    }

    @Override // p067l.InterfaceC2538
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3726() {
        return mo8305(this.f24916);
    }

    @Override // p067l.InterfaceC7233
    /* JADX INFO: renamed from: ֫ */
    public final C19736 mo13240(C19736 c19736, C23089 c23089) {
        System.arraycopy(this.f24914, 0, this.f24915, 0, this.f24916);
        this.f24914 = this.f24915;
        InterfaceC15240 interfaceC15240Mo8303 = mo8303(c19736, c23089.f45528);
        this.f24913.add(interfaceC15240Mo8303);
        this.f24914[c19736.f60034] = interfaceC15240Mo8303;
        return c19736;
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC15240 mo8303(C19736 c19736, AbstractC10348 abstractC10348) {
        return mo8308();
    }

    @Override // p067l.InterfaceC3209
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo5549(C19736 c19736) {
        mo8304(this.f24914[c19736.f60034]);
        return c19736;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (AbstractC3880 first = this.f24918.f20257.getFirst(); first != null; first = first.m7669()) {
            InterfaceC15240[] interfaceC15240Arr = (InterfaceC15240[]) first.f8416;
            if (interfaceC15240Arr != null) {
                for (InterfaceC15240 interfaceC15240 : interfaceC15240Arr) {
                    if (interfaceC15240 == null) {
                        sb.append('.');
                    } else {
                        sb.append(interfaceC15240.mo29415());
                    }
                }
                sb.append(" | ");
            }
            sb.append(first.toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
