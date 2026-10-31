package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18456 implements InterfaceC8347 {
    public boolean a;
    public Object b;

    @Override // l.InterfaceC0585
    public /* synthetic */ void accept(double d) {
        AbstractC9198.m();
        throw null;
    }

    @Override // l.InterfaceC0585
    public /* synthetic */ void accept(int i) {
        AbstractC9198.t();
        throw null;
    }

    @Override // l.InterfaceC0585
    public /* synthetic */ void accept(long j) {
        AbstractC9198.u();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ void c(long j) {
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ void end() {
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void n(Object obj) {
        if (this.a) {
            return;
        }
        this.a = true;
        this.b = obj;
    }

    @Override // l.InterfaceC0585
    public final boolean f() {
        return this.a;
    }
}
