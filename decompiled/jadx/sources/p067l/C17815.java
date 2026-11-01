package p067l;

/* JADX INFO: renamed from: l.ܺ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17815 extends AbstractC23851 {
    @Override // p067l.AbstractC20341, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f75779b);
    }

    @Override // p067l.InterfaceC19670
    /* JADX INFO: renamed from: i */
    public final void mo5379i(InterfaceC19670 interfaceC19670) {
        this.f75779b += ((AbstractC23851) interfaceC19670).f75779b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f75779b++;
    }
}
