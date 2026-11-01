package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: SARS */
/* JADX INFO: loaded from: classes2.dex */
public final class C3673 extends AbstractC11581 {

    /* JADX INFO: renamed from: ۜ */
    public List f7776;

    /* JADX INFO: renamed from: ܳ */
    public boolean f7777;

    /* JADX INFO: renamed from: ܽ */
    public List f7778;

    /* JADX INFO: renamed from: ܿ */
    public String f7779;

    /* JADX INFO: renamed from: ᩳ */
    public C7697 f7780;

    /* JADX INFO: renamed from: ᩻ */
    public List f7781;

    public C3673(AbstractC11581 abstractC11581) {
        super(abstractC11581);
        List list = Collections.EMPTY_LIST;
        this.f7778 = list;
        this.f7781 = list;
        this.f7776 = list;
    }

    public C3673(AbstractC11581 abstractC11581, C14677 c14677) {
        super(abstractC11581);
        List list = Collections.EMPTY_LIST;
        this.f7778 = list;
        this.f7781 = list;
        this.f7776 = list;
        C23395.m52059(c14677, 20225);
        c14677.readInt();
        this.f7779 = c14677.m33590();
        int iM33581 = c14677.m33581();
        int iM33582 = c14677.m33581();
        ArrayList arrayList = new ArrayList(iM33582 + 1);
        ArrayList arrayList2 = new ArrayList(iM33582);
        arrayList.add(c14677.m33591());
        for (int i = 0; i < iM33582; i++) {
            arrayList2.add(c14677.m33591());
            arrayList.add(c14677.m33591());
        }
        this.f7780 = C7697.m17822(arrayList, arrayList2, iM33581);
        this.f7777 = c14677.m33585();
        int iM33583 = c14677.m33581();
        ArrayList arrayList3 = new ArrayList(iM33583);
        for (int i2 = 0; i2 < iM33583; i2++) {
            arrayList3.add(new C24539(c14677.m33581(), c14677.m33591()));
        }
        this.f7778 = C21562.unmodifiableList(arrayList3);
        int iM33584 = c14677.m33581();
        ArrayList arrayList4 = new ArrayList(iM33584);
        for (int i3 = 0; i3 < iM33584; i3++) {
            arrayList4.add(C5685.m12667(c14677.m33581(), c14677.m33593()));
        }
        this.f7781 = C21562.unmodifiableList(arrayList4);
        int iM33585 = c14677.m33581();
        ArrayList arrayList5 = new ArrayList(iM33585);
        for (int i4 = 0; i4 < iM33585; i4++) {
            arrayList5.add(new C10910(c14677.m33581(), AbstractC11581.m26651(this, c14677)));
        }
        this.f7776 = C21562.unmodifiableList(arrayList5);
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3914(C11996 c11996) {
        c11996.mo15113(20225);
        c11996.m27456();
        c11996.m27444(this.f7779);
        this.f7780.m17829(c11996);
        c11996.m27445(this.f7777);
        c11996.mo15113(this.f7778.size());
        for (C24539 c24539 : this.f7778) {
            c11996.mo15113(c24539.m54130());
            c11996.m27443((CharSequence) c24539.m54131());
        }
        List list = this.f7781;
        int size = list.size();
        c11996.mo15113(size);
        for (int i = 0; i < size; i++) {
            C5685 c5685 = (C5685) list.get(i);
            c11996.m27459(c5685.f13859);
            c11996.mo15113(c5685.f13862);
        }
        c11996.mo15113(this.f7776.size());
        for (C10910 c10910 : this.f7776) {
            c11996.mo15113(c10910.m25166());
            c10910.m25168().mo3914(c11996);
        }
        c11996.m27438();
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3915(C22310 c22310) {
        this.f7780.getClass();
        boolean zIsEmpty = this.f7778.isEmpty();
        AbstractC11581 abstractC11581 = this.f32257;
        if (!zIsEmpty && (!(abstractC11581 instanceof C10379) || ((C10379) abstractC11581).m24056() != this)) {
            throw new C5962(this.f32258, "export is only allowed on a direct start match");
        }
        if (this.f7780.m17833() && (!(abstractC11581 instanceof C10379) || ((C10379) abstractC11581).m24064() != this)) {
            throw new C5962(this.f32258, "var() is only allowed on a direct end match");
        }
        Iterator it = this.f7776.iterator();
        while (it.hasNext()) {
            ((C10910) it.next()).m25168().mo3915(c22310);
        }
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11581 mo3910(AbstractC11581 abstractC11581) {
        C3673 c3673 = new C3673(abstractC11581);
        c3673.f32258 = this.f32258;
        c3673.f7779 = this.f7779;
        c3673.f7780 = this.f7780;
        c3673.f7778 = this.f7778;
        c3673.f7781 = this.f7781;
        if (!this.f7776.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f7776.size());
            Iterator it = this.f7776.iterator();
            while (it.hasNext()) {
                arrayList.add(((C10910) it.next()).m25167(c3673));
            }
            c3673.f7776 = arrayList;
        }
        c3673.f7777 = this.f7777;
        return c3673;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m7093() {
        return this.f7779;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7082(String str) {
        this.f7779 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7085(C13259 c13259) {
        this.f7780 = C7697.m17823(c13259);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C7697 m7090() {
        return this.f7780;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7084(C7697 c7697) {
        this.f7780 = c7697;
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m7087() {
        return this.f7778;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m7088(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (Object obj : arrayList) {
            C12826.requireNonNull(obj);
            arrayList2.add(obj);
        }
        this.f7778 = C21562.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: ܿ */
    public final List m7092() {
        return this.f7781;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m7091(ArrayList arrayList) {
        this.f7781 = C21562.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7083(C5685 c5685) {
        this.f7781 = Collections.singletonList(c5685);
    }

    /* JADX INFO: renamed from: ܳ */
    public final List m7089() {
        return this.f7776;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m7094(ArrayList arrayList) {
        if (arrayList.isEmpty() && this.f7776.isEmpty()) {
            return;
        }
        this.f7776 = arrayList;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m7095() {
        return this.f7777;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7086(boolean z) {
        this.f7777 = z;
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3912(StringBuilder sb, int i) {
        sb.append(C11567.m26622(i, "\t"));
        sb.append("{\n");
        int i2 = i + 1;
        String strM26622 = C11567.m26622(i2, "\t");
        sb.append(strM26622);
        sb.append("match: ");
        this.f7780.m17828(sb);
        sb.append('\n');
        sb.append(strM26622);
        sb.append("recordAllGroups: ");
        sb.append(this.f7777);
        sb.append('\n');
        for (C24539 c24539 : this.f7778) {
            sb.append(strM26622);
            sb.append("export: ");
            sb.append(c24539.m54130());
            sb.append(" => \"");
            sb.append(C15693.m35742(c24539.m54131()));
            sb.append("\"\n");
        }
        for (C5685 c5685 : this.f7781) {
            sb.append(strM26622);
            sb.append(c5685.f13862);
            sb.append(": \"");
            sb.append(c5685.f13859);
            sb.append("\"\n");
        }
        for (C10910 c10910 : this.f7776) {
            sb.append(strM26622);
            sb.append("subMatcher: ");
            sb.append(c10910.m25166());
            sb.append('\n');
            c10910.m25168().mo3912(sb, i2);
        }
        sb.append(C11567.m26622(i, "\t"));
        sb.append("}\n");
    }
}
