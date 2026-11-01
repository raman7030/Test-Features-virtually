package p067l;

import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.֫ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4167 extends AbstractC11782 implements InterfaceC8169 {
    @Override // p067l.InterfaceC7324
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC11111.m25587B(this, consumer);
    }

    @Override // p067l.AbstractC11782, p067l.InterfaceC7324
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC7324 mo3497j(long j, long j2, IntFunction intFunction) {
        return AbstractC11111.m25590E(this, j, j2);
    }

    @Override // p067l.AbstractC11782, p067l.InterfaceC7324
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC7324 mo3496a(int i) {
        mo3496a(i);
        throw null;
    }

    @Override // p067l.AbstractC11782, p067l.InterfaceC7324
    /* JADX INFO: renamed from: a */
    public final InterfaceC24758 mo3496a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo3498k(Object[] objArr, int i) {
        AbstractC11111.m25623y(this, (Long[]) objArr, i);
    }

    @Override // p067l.InterfaceC24758
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo4230b() {
        return AbstractC11111.f30818f;
    }

    @Override // p067l.InterfaceC7324
    public final /* bridge */ /* synthetic */ InterfaceC3437 spliterator() {
        return C23554.f75022c;
    }

    @Override // p067l.InterfaceC7324
    public final /* bridge */ /* synthetic */ InterfaceC16847 spliterator() {
        return C23554.f75022c;
    }
}
