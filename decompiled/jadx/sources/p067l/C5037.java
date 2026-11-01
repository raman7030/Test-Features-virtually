package p067l;

import java.nio.file.Path;
import java.nio.file.WatchKey;
import java.nio.file.Watchable;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5037 implements InterfaceC2649 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WatchKey f11572a;

    public /* synthetic */ C5037(WatchKey watchKey) {
        this.f11572a = watchKey;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC2649 m10742a(WatchKey watchKey) {
        if (watchKey == null) {
            return null;
        }
        return watchKey instanceof C20460 ? ((C20460) watchKey).f63196a : new C5037(watchKey);
    }

    @Override // p067l.InterfaceC2649
    public final /* synthetic */ void cancel() {
        this.f11572a.cancel();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchKey watchKey = this.f11572a;
        if (obj instanceof C5037) {
            obj = ((C5037) obj).f11572a;
        }
        return watchKey.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f11572a.hashCode();
    }

    @Override // p067l.InterfaceC2649
    public final /* synthetic */ boolean isValid() {
        return this.f11572a.isValid();
    }

    @Override // p067l.InterfaceC2649
    public final /* synthetic */ List pollEvents() {
        return AbstractC24029.m53254w(this.f11572a.pollEvents());
    }

    @Override // p067l.InterfaceC2649
    public final /* synthetic */ boolean reset() {
        return this.f11572a.reset();
    }

    @Override // p067l.InterfaceC2649
    public final /* synthetic */ InterfaceC7048 watchable() {
        Watchable watchable = this.f11572a.watchable();
        if (watchable == null) {
            return null;
        }
        if (watchable instanceof C23812) {
            return ((C23812) watchable).f75686a;
        }
        return watchable instanceof Path ? C15764.m35828l((Path) watchable) : new C17105(watchable);
    }
}
