package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۖۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4ATX */
/* JADX INFO: loaded from: classes2.dex */
public final class C4621 extends AbstractC11581 {

    /* JADX INFO: renamed from: ܽ */
    public List f10357;

    public C4621(AbstractC11581 abstractC11581, C14677 c14677) {
        super(abstractC11581);
        C23395.m52059(c14677, 20227);
        c14677.readInt();
        int iM33581 = c14677.m33581();
        ArrayList arrayList = new ArrayList(iM33581);
        for (int i = 0; i < iM33581; i++) {
            arrayList.add(AbstractC11581.m26651(this, c14677));
        }
        this.f10357 = C21562.unmodifiableList(arrayList);
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3914(C11996 c11996) {
        c11996.mo15113(20227);
        c11996.m27456();
        c11996.mo15113(this.f10357.size());
        Iterator it = this.f10357.iterator();
        while (it.hasNext()) {
            ((AbstractC11581) it.next()).mo3914(c11996);
        }
        c11996.m27438();
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3915(C22310 c22310) {
        Iterator it = this.f10357.iterator();
        while (it.hasNext()) {
            ((AbstractC11581) it.next()).mo3915(c22310);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m9746(ArrayList arrayList) {
        this.f10357 = C21562.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m9745() {
        return this.f10357;
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11581 mo3910(final AbstractC11581 abstractC11581) {
        C4621 c4621 = new C4621(abstractC11581);
        c4621.f32258 = this.f32258;
        c4621.f10357 = (List) C7480.stream(this.f10357).map(new Function() { // from class: l.ܺۜܿ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((AbstractC11581) obj).mo3910(abstractC11581);
            }
        }).collect(C24205.toList());
        return c4621;
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3912(StringBuilder sb, int i) {
        sb.append(C11567.m26622(i, "\t"));
        sb.append("{\n");
        Iterator it = this.f10357.iterator();
        while (it.hasNext()) {
            ((AbstractC11581) it.next()).mo3912(sb, i + 1);
        }
        sb.append(C11567.m26622(i, "\t"));
        sb.append("}\n");
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3913(ArrayList arrayList) {
        Iterator it = this.f10357.iterator();
        while (it.hasNext()) {
            ((AbstractC11581) it.next()).mo3913(arrayList);
        }
    }
}
