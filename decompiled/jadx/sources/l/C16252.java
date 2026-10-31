package l;

/* JADX INFO: renamed from: l.ܺ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16252 extends AbstractC22603 {
    @Override // l.AbstractC18910, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // l.InterfaceC18204
    public final void i(InterfaceC18204 interfaceC18204) {
        this.b += ((AbstractC22603) interfaceC18204).b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b++;
    }
}
