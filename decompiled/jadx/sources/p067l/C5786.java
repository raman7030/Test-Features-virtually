package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes3.dex */
public final class C5786 extends AbstractC5254 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C19868 f14216;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5786(C19868 c19868) {
        super(c19868.f54863);
        this.f14216 = c19868;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5786(C19868 c19868, int i, int i2) {
        super(i, i2);
        this.f14216 = c19868;
    }

    @Override // p067l.AbstractC5254
    /* JADX INFO: renamed from: ۧ */
    public final int mo11329() {
        return this.f14216.f54862;
    }

    @Override // p067l.AbstractC16652
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7515(int i) {
        return this.f14216.f60379.f63463[i];
    }

    @Override // p067l.AbstractC16652
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9948 mo7516(int i, int i2) {
        return new C5786(this.f14216, i, i2);
    }

    @Override // p067l.AbstractC16652, p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        if (this.f48922 >= mo11328()) {
            return false;
        }
        Object[] objArr = this.f14216.f60379.f63463;
        int i = this.f48922;
        this.f48922 = i + 1;
        consumer.m45213n(objArr[i]);
        return true;
    }

    @Override // p067l.AbstractC16652, p067l.AbstractC25073, p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        Object[] objArr = this.f14216.f60379.f63463;
        int iMo11328 = mo11328();
        while (true) {
            int i = this.f48922;
            if (i >= iMo11328) {
                return;
            }
            this.f48922 = i + 1;
            consumer.m45213n(objArr[i]);
        }
    }
}
