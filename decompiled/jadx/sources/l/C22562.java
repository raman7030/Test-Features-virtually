package l;

import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.Watchable;

/* JADX INFO: renamed from: l.᩹᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22562 implements Watchable {
    public final /* synthetic */ InterfaceC4923 a;

    public /* synthetic */ C22562(InterfaceC4923 interfaceC4923) {
        this.a = interfaceC4923;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC4923 interfaceC4923 = this.a;
        if (obj instanceof C22562) {
            obj = ((C22562) obj).a;
        }
        return interfaceC4923.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        return C19035.a(this.a.register(C0689.b(watchService), AbstractC22791.G(kindArr)));
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        return C19035.a(this.a.register(C0689.b(watchService), AbstractC22791.G(kindArr), AbstractC22791.H(modifierArr)));
    }
}
