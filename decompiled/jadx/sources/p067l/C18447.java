package p067l;

import java.nio.file.WatchEvent;

/* JADX INFO: renamed from: l.ܽ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18447 implements InterfaceC20085 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WatchEvent.Kind f55159a;

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Kind kind = this.f55159a;
        if (obj instanceof C18447) {
            obj = ((C18447) obj).f55159a;
        }
        return kind.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f55159a.hashCode();
    }

    @Override // p067l.InterfaceC20085
    public final /* synthetic */ String name() {
        return this.f55159a.name();
    }

    @Override // p067l.InterfaceC20085
    public final /* synthetic */ Class type() {
        return this.f55159a.type();
    }
}
