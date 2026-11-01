package p067l;

import java.nio.file.WatchKey;
import java.nio.file.Watchable;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C20460 implements WatchKey {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2649 f63196a;

    public /* synthetic */ C20460(InterfaceC2649 interfaceC2649) {
        this.f63196a = interfaceC2649;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ WatchKey m46155a(InterfaceC2649 interfaceC2649) {
        if (interfaceC2649 == null) {
            return null;
        }
        return interfaceC2649 instanceof C5037 ? ((C5037) interfaceC2649).f11572a : new C20460(interfaceC2649);
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ void cancel() {
        this.f63196a.cancel();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC2649 interfaceC2649 = this.f63196a;
        if (obj instanceof C20460) {
            obj = ((C20460) obj).f63196a;
        }
        return interfaceC2649.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f63196a.hashCode();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ boolean isValid() {
        return this.f63196a.isValid();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ List pollEvents() {
        return AbstractC24029.m53254w(this.f63196a.pollEvents());
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ boolean reset() {
        return this.f63196a.reset();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ Watchable watchable() {
        InterfaceC7048 interfaceC7048Watchable = this.f63196a.watchable();
        if (interfaceC7048Watchable == null) {
            return null;
        }
        if (interfaceC7048Watchable instanceof C17105) {
            return ((C17105) interfaceC7048Watchable).f50530a;
        }
        return interfaceC7048Watchable instanceof InterfaceC22097 ? C9730.m22751l((InterfaceC22097) interfaceC7048Watchable) : new C23812(interfaceC7048Watchable);
    }
}
