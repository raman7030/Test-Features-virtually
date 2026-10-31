package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M7E7 */
/* JADX INFO: loaded from: classes4.dex */
public class C7419 extends AbstractC9701 implements Iterable, InterfaceC3350, InterfaceC4323 {

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public AbstractC11817 f22795;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f22796;

    @Override // java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C7419(AbstractC11817 abstractC11817, Class cls, int i) {
        this.f22795 = abstractC11817;
        this.f22796 = new ArrayList(i);
        this.f29348 = EnumC0970.m3422(cls);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m19941() {
        ArrayList arrayList = this.f22796;
        return !arrayList.isEmpty() && (arrayList.get(0) instanceof InterfaceC3350);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19942(AbstractC9701 abstractC9701) {
        if (abstractC9701 instanceof AbstractC11817) {
            ((AbstractC11817) abstractC9701).f35258 = this.f22795;
        }
        this.f22796.add(abstractC9701);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC9701, l.InterfaceC17482
    /* JADX INFO: renamed from: ۧ */
    public void mo3021() {
        ArrayList arrayList = this.f22796;
        int size = arrayList.size();
        if (size > 0) {
            boolean zM3426 = this.f29348.m3426();
            mo10249(mo10250());
            for (int i = 0; i < size; i++) {
                AbstractC9701 abstractC9701 = (AbstractC9701) arrayList.get(i);
                if (abstractC9701 instanceof InterfaceC3350) {
                    ((InterfaceC3350) abstractC9701).mo10249(mo10250());
                }
                abstractC9701.f29349 = this.f29349;
                if (zM3426 && mo24649()) {
                    abstractC9701.mo4067(i, size);
                } else {
                    abstractC9701.mo4064(i, size);
                }
            }
        }
    }

    @Override // l.AbstractC9701, l.InterfaceC17482
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo4066() {
        ArrayList arrayList = this.f22796;
        return !arrayList.isEmpty() && C5378.stream(arrayList).anyMatch(new C13768(0));
    }

    @Override // l.InterfaceC3350
    /* JADX INFO: renamed from: ᩳ */
    public final int mo10250() {
        if (!this.f29341 && m19941()) {
            this.f29353 = m19941() ? C5378.stream(this.f22796).map(new C23147(9)).mapToInt(new C6008()).max().orElse(0) : 0;
            this.f29341 = true;
        }
        return this.f29353;
    }

    @Override // l.InterfaceC3350
    /* JADX INFO: renamed from: ֫ */
    public final void mo10249(final int i) {
        if (i <= 0 || !m19941()) {
            return;
        }
        C5378.stream(this.f22796).map(new C11653(0)).peek(new Consumer() { // from class: l.᩺ۧ֨
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                ((InterfaceC3350) obj).mo10249(i);
            }
        });
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f22796.iterator();
    }

    @Override // java.lang.Iterable, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        C19846.forEach(this.f22796, consumer);
    }

    @Override // java.lang.Iterable, l.InterfaceC4323, l.InterfaceC1144, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return C6083.spliterator(this.f22796);
    }
}
