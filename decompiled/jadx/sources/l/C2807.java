package l;

import java.nio.file.Path;
import java.nio.file.WatchKey;
import java.nio.file.Watchable;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2807 implements InterfaceC0295 {
    public final /* synthetic */ WatchKey a;

    public /* synthetic */ C2807(WatchKey watchKey) {
        this.a = watchKey;
    }

    public static /* synthetic */ InterfaceC0295 a(WatchKey watchKey) {
        if (watchKey == null) {
            return null;
        }
        return watchKey instanceof C19035 ? ((C19035) watchKey).a : new C2807(watchKey);
    }

    @Override // l.InterfaceC0295
    public final /* synthetic */ void cancel() {
        this.a.cancel();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchKey watchKey = this.a;
        if (obj instanceof C2807) {
            obj = ((C2807) obj).a;
        }
        return watchKey.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC0295
    public final /* synthetic */ boolean isValid() {
        return this.a.isValid();
    }

    @Override // l.InterfaceC0295
    public final /* synthetic */ List pollEvents() {
        return AbstractC22791.w(this.a.pollEvents());
    }

    @Override // l.InterfaceC0295
    public final /* synthetic */ boolean reset() {
        return this.a.reset();
    }

    @Override // l.InterfaceC0295
    public final /* synthetic */ InterfaceC4923 watchable() {
        Watchable watchable = this.a.watchable();
        if (watchable == null) {
            return null;
        }
        if (watchable instanceof C22562) {
            return ((C22562) watchable).a;
        }
        return watchable instanceof Path ? C14094.l((Path) watchable) : new C15505(watchable);
    }
}
