package p067l;

import java.nio.file.WatchEvent;

/* JADX INFO: renamed from: l.ܿ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C19118 implements WatchEvent.Kind {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC20085 f57035a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC20085 interfaceC20085 = this.f57035a;
        if (obj instanceof C19118) {
            obj = ((C19118) obj).f57035a;
        }
        return interfaceC20085.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f57035a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ String name() {
        return this.f57035a.name();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ Class type() {
        return this.f57035a.type();
    }
}
