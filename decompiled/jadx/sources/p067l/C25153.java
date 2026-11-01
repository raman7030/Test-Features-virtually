package p067l;

import java.nio.file.WatchEvent;

/* JADX INFO: renamed from: l.᩻᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C25153 implements InterfaceC20756 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WatchEvent.Modifier f80483a;

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Modifier modifier = this.f80483a;
        if (obj instanceof C25153) {
            obj = ((C25153) obj).f80483a;
        }
        return modifier.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f80483a.hashCode();
    }

    @Override // p067l.InterfaceC20756
    public final /* synthetic */ String name() {
        return this.f80483a.name();
    }
}
