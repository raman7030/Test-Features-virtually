package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۛᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8290 implements InterfaceC12274 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21946a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IntConsumer f21947b;

    public /* synthetic */ C8290(IntConsumer intConsumer, int i) {
        this.f21946a = i;
        this.f21947b = intConsumer;
    }

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ void m19089a(long j) {
    }

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ void m19090b(long j) {
    }

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ void m19091e() {
    }

    /* JADX INFO: renamed from: g */
    private final /* synthetic */ void m19092g() {
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(double d) {
        switch (this.f21946a) {
            case 0:
                AbstractC11111.m25611m();
                throw null;
            default:
                AbstractC11111.m25611m();
                throw null;
        }
    }

    @Override // p067l.InterfaceC12274, p067l.InterfaceC2925
    public final void accept(int i) {
        switch (this.f21946a) {
            case 0:
                this.f21947b.accept(i);
                break;
            default:
                ((C20932) this.f21947b).accept(i);
                break;
        }
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(long j) {
        switch (this.f21946a) {
            case 0:
                AbstractC11111.m25619u();
                throw null;
            default:
                AbstractC11111.m25619u();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m45213n(Object obj) {
        switch (this.f21946a) {
            case 0:
                mo6025d((Integer) obj);
                break;
            default:
                mo6025d((Integer) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f21946a) {
            case 0:
                break;
        }
        return C24719.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f21946a) {
            case 0:
                break;
        }
        return C11309.$default$andThen(this, intConsumer);
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo4231c(long j) {
    }

    @Override // p067l.InterfaceC12274
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo6025d(Integer num) {
        switch (this.f21946a) {
            case 0:
                AbstractC11111.m25614p(this, num);
                break;
            default:
                AbstractC11111.m25614p(this, num);
                break;
        }
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void end() {
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean mo4233f() {
        switch (this.f21946a) {
        }
        return false;
    }
}
