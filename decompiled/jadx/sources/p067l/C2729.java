package p067l;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.֡ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2729 extends C7087 implements InterfaceC8169, InterfaceC9611 {
    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(double d) {
        AbstractC11111.m25611m();
        throw null;
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(int i) {
        AbstractC11111.m25618t();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m45213n(Object obj) {
        mo4235l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    @Override // p067l.InterfaceC10873
    public final InterfaceC7324 build() {
        return this;
    }

    @Override // p067l.InterfaceC9611, p067l.InterfaceC10873
    public final InterfaceC8169 build() {
        return this;
    }

    @Override // p067l.InterfaceC2925
    public final void end() {
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean mo4233f() {
        return false;
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC7324 mo3497j(long j, long j2, IntFunction intFunction) {
        return AbstractC11111.m25590E(this, j, j2);
    }

    @Override // p067l.InterfaceC16336
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void mo4235l(Long l2) {
        AbstractC11111.m25616r(this, l2);
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object[] mo3499m(IntFunction intFunction) {
        return AbstractC11111.m25620v(this, intFunction);
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int mo3500o() {
        return 0;
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC7324 mo3496a(int i) {
        mo3496a(i);
        throw null;
    }

    @Override // p067l.InterfaceC24758, p067l.InterfaceC7324
    /* JADX INFO: renamed from: a */
    public final InterfaceC24758 mo3496a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo3498k(Object[] objArr, int i) {
        AbstractC11111.m25623y(this, (Long[]) objArr, i);
    }

    @Override // p067l.AbstractC4817, p067l.InterfaceC24758
    /* JADX INFO: renamed from: e */
    public final void mo4232e(int i, Object obj) {
        super.mo4232e(i, (long[]) obj);
    }

    @Override // p067l.AbstractC4817, p067l.InterfaceC24758
    /* JADX INFO: renamed from: g */
    public final void mo4234g(Object obj) {
        super.mo4234g((LongConsumer) obj);
    }

    @Override // p067l.C7087, p067l.AbstractC4817, java.lang.Iterable, p067l.InterfaceC6477, p067l.InterfaceC3456, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC3437 spliterator() {
        return super.spliterator();
    }

    @Override // p067l.C7087, p067l.AbstractC4817, java.lang.Iterable, p067l.InterfaceC6477, p067l.InterfaceC3456, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return super.spliterator();
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        clear();
        m10212s(j);
    }

    @Override // p067l.AbstractC4817, p067l.InterfaceC24758
    /* JADX INFO: renamed from: b */
    public final Object mo4230b() {
        return (long[]) super.mo4230b();
    }
}
