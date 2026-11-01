package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9BM */
/* JADX INFO: loaded from: classes2.dex */
public final class C2608 extends AbstractC11581 {

    /* JADX INFO: renamed from: ܽ */
    public String f4313;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC11581 f4314;

    public C2608(AbstractC11581 abstractC11581, C14677 c14677) {
        super(abstractC11581);
        C23395.m52059(c14677, 20230);
        c14677.readInt();
        this.f4313 = c14677.m33593();
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3914(C11996 c11996) {
        c11996.mo15113(20230);
        c11996.m27456();
        c11996.m27459(this.f4313);
        c11996.m27438();
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3915(C22310 c22310) {
        if (c22310.f70454.add(this.f4313)) {
            try {
                AbstractC11581 abstractC11581Mo3910 = this.f32257.mo26652().m37816(this.f4313).mo3910(this);
                this.f4314 = abstractC11581Mo3910;
                abstractC11581Mo3910.mo3915(c22310);
            } catch (RuntimeException e) {
                throw new C5962(this.f32258, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m3916() {
        return this.f4313;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3911(String str) {
        this.f4313 = str;
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11581 mo3910(AbstractC11581 abstractC11581) {
        C2608 c2608 = new C2608(abstractC11581);
        c2608.f32258 = this.f32258;
        c2608.f4313 = this.f4313;
        return c2608;
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3912(StringBuilder sb, int i) {
        sb.append(C11567.m26622(i, "\t"));
        sb.append("{\n");
        sb.append(C11567.m26622(i + 1, "\t"));
        sb.append("include: \"");
        sb.append(this.f4313);
        sb.append("\"\n");
        sb.append(C11567.m26622(i, "\t"));
        sb.append("}\n");
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3913(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C2608) it.next()).f4313.equals(this.f4313)) {
                ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add("include \"" + ((C2608) it2.next()).f4313 + "\"");
                }
                arrayList2.add("include \"" + this.f4313 + "\"");
                throw new C12668("There is a circular hard dependency: " + C11567.m26623(arrayList2, " > "));
            }
        }
        ArrayList arrayList3 = (ArrayList) arrayList.clone();
        arrayList3.add(this);
        if (this.f4314 == null) {
            this.f4314 = this.f32257.mo26652().m37816(this.f4313).mo3910(this);
        }
        this.f4314.mo3913(arrayList3);
    }
}
