package p067l;

import java.nio.file.WatchEvent;

/* JADX INFO: renamed from: l.᩷᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C22472 implements WatchEvent.Modifier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC20756 f70884a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC20756 interfaceC20756 = this.f70884a;
        if (obj instanceof C22472) {
            obj = ((C22472) obj).f70884a;
        }
        return interfaceC20756.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f70884a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Modifier
    public final /* synthetic */ String name() {
        return this.f70884a.name();
    }
}
