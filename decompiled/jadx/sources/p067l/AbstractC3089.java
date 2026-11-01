package p067l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.֨֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 98I4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3089 implements InterfaceC2418 {

    /* JADX INFO: renamed from: ۜ */
    public C19854 f5587;

    /* JADX INFO: renamed from: ۧ */
    public ByteBuffer f5588;

    /* JADX INFO: renamed from: ܳ */
    public ByteBuffer f5589;

    /* JADX INFO: renamed from: ܽ */
    public C19854 f5590;

    /* JADX INFO: renamed from: ܿ */
    public C19854 f5591;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f5592;

    /* JADX INFO: renamed from: ᩻ */
    public C19854 f5593;

    /* JADX INFO: renamed from: ۜ */
    public void mo5231() {
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract C19854 mo5232(C19854 c19854);

    /* JADX INFO: renamed from: ܳ */
    public void mo5233() {
    }

    /* JADX INFO: renamed from: ᩻ */
    public void mo5234() {
    }

    public AbstractC3089() {
        ByteBuffer byteBuffer = InterfaceC2418.f3706;
        this.f5588 = byteBuffer;
        this.f5589 = byteBuffer;
        C19854 c19854 = C19854.f60350;
        this.f5593 = c19854;
        this.f5587 = c19854;
        this.f5590 = c19854;
        this.f5591 = c19854;
    }

    @Override // p067l.InterfaceC2418
    /* JADX INFO: renamed from: ֫ */
    public final C19854 mo3356(C19854 c19854) {
        this.f5593 = c19854;
        this.f5587 = mo5232(c19854);
        return mo3359() ? this.f5587 : C19854.f60350;
    }

    @Override // p067l.InterfaceC2418
    /* JADX INFO: renamed from: ܽ */
    public boolean mo3359() {
        return this.f5587 != C19854.f60350;
    }

    @Override // p067l.InterfaceC2418
    /* JADX INFO: renamed from: ܿ */
    public final void mo3360() {
        this.f5592 = true;
        mo5234();
    }

    @Override // p067l.InterfaceC2418
    /* JADX INFO: renamed from: ᩳ */
    public ByteBuffer mo3361() {
        ByteBuffer byteBuffer = this.f5589;
        this.f5589 = InterfaceC2418.f3706;
        return byteBuffer;
    }

    @Override // p067l.InterfaceC2418
    /* JADX INFO: renamed from: ۧ */
    public boolean mo3358() {
        return this.f5592 && this.f5589 == InterfaceC2418.f3706;
    }

    @Override // p067l.InterfaceC2418
    public final void flush() {
        this.f5589 = InterfaceC2418.f3706;
        this.f5592 = false;
        this.f5590 = this.f5593;
        this.f5591 = this.f5587;
        mo5233();
    }

    @Override // p067l.InterfaceC2418
    public final void reset() {
        ByteBuffer byteBuffer = InterfaceC2418.f3706;
        this.f5589 = byteBuffer;
        this.f5592 = false;
        this.f5588 = byteBuffer;
        C19854 c19854 = C19854.f60350;
        this.f5593 = c19854;
        this.f5587 = c19854;
        this.f5590 = c19854;
        this.f5591 = c19854;
        mo5231();
    }

    /* JADX INFO: renamed from: ֫ */
    public final ByteBuffer m5229(int i) {
        if (this.f5588.capacity() < i) {
            this.f5588 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f5588.clear();
        }
        ByteBuffer byteBuffer = this.f5588;
        this.f5589 = byteBuffer;
        return byteBuffer;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m5230() {
        return this.f5589.hasRemaining();
    }
}
