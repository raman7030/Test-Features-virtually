package l;

import java.nio.file.WatchEvent;

/* JADX INFO: renamed from: l.ܿ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17623 implements WatchEvent.Kind {
    public final /* synthetic */ InterfaceC18641 a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC18641 interfaceC18641 = this.a;
        if (obj instanceof C17623) {
            obj = ((C17623) obj).a;
        }
        return interfaceC18641.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ Class type() {
        return this.a.type();
    }
}
