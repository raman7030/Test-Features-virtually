package l;

import java.nio.file.WatchEvent;

/* JADX INFO: renamed from: l.᩷᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C21152 implements WatchEvent.Modifier {
    public final /* synthetic */ InterfaceC19347 a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC19347 interfaceC19347 = this.a;
        if (obj instanceof C21152) {
            obj = ((C21152) obj).a;
        }
        return interfaceC19347.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Modifier
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
