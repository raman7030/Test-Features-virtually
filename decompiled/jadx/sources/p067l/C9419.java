package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M7E7 */
/* JADX INFO: loaded from: classes4.dex */
public class C9419 extends AbstractC11588 implements Iterable, InterfaceC5552, InterfaceC6477 {

    /* JADX INFO: renamed from: ۗ֫ */
    public AbstractC13599 f25708;

    /* JADX INFO: renamed from: ۙ֫ */
    public final ArrayList f25709;

    @Override // java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C9419(AbstractC13599 abstractC13599, Class cls, int i) {
        this.f25708 = abstractC13599;
        this.f25709 = new ArrayList(i);
        this.f32297 = EnumC3290.m5725(cls);
    }

    /* JADX INFO: renamed from: ֨ */
    public final boolean m21915() {
        ArrayList arrayList = this.f25709;
        return !arrayList.isEmpty() && (arrayList.get(0) instanceof InterfaceC5552);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21916(AbstractC11588 abstractC11588) {
        if (abstractC11588 instanceof AbstractC13599) {
            ((AbstractC13599) abstractC11588).f38260 = this.f25708;
        }
        this.f25709.add(abstractC11588);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC11588, p067l.InterfaceC18983
    /* JADX INFO: renamed from: ۧ */
    public void mo5334() {
        ArrayList arrayList = this.f25709;
        int size = arrayList.size();
        if (size > 0) {
            boolean zM5729 = this.f32297.m5729();
            mo12285(mo12286());
            for (int i = 0; i < size; i++) {
                AbstractC11588 abstractC11588 = (AbstractC11588) arrayList.get(i);
                if (abstractC11588 instanceof InterfaceC5552) {
                    ((InterfaceC5552) abstractC11588).mo12285(mo12286());
                }
                abstractC11588.f32298 = this.f32298;
                if (zM5729 && mo26663()) {
                    abstractC11588.mo6311(i, size);
                } else {
                    abstractC11588.mo6308(i, size);
                }
            }
        }
    }

    @Override // p067l.AbstractC11588, p067l.InterfaceC18983
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo6310() {
        ArrayList arrayList = this.f25709;
        return !arrayList.isEmpty() && C7480.stream(arrayList).anyMatch(new C15453(0));
    }

    @Override // p067l.InterfaceC5552
    /* JADX INFO: renamed from: ᩳ */
    public final int mo12286() {
        if (!this.f32290 && m21915()) {
            this.f32302 = m21915() ? C7480.stream(this.f25709).map(new C24367(9)).mapToInt(new C8078()).max().orElse(0) : 0;
            this.f32290 = true;
        }
        return this.f32302;
    }

    @Override // p067l.InterfaceC5552
    /* JADX INFO: renamed from: ֫ */
    public final void mo12285(final int i) {
        if (i <= 0 || !m21915()) {
            return;
        }
        C7480.stream(this.f25709).map(new C13443(0)).peek(new Consumer() { // from class: l.᩺ۧ֨
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void m45213n(Object obj) {
                ((InterfaceC5552) obj).mo12285(i);
            }
        });
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f25709.iterator();
    }

    @Override // java.lang.Iterable, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        C21230.forEach(this.f25709, consumer);
    }

    @Override // java.lang.Iterable, p067l.InterfaceC6477, p067l.InterfaceC3456, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return C8150.spliterator(this.f25709);
    }
}
