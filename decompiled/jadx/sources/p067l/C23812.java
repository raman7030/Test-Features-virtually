package p067l;

import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.Watchable;

/* JADX INFO: renamed from: l.᩹᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23812 implements Watchable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7048 f75686a;

    public /* synthetic */ C23812(InterfaceC7048 interfaceC7048) {
        this.f75686a = interfaceC7048;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC7048 interfaceC7048 = this.f75686a;
        if (obj instanceof C23812) {
            obj = ((C23812) obj).f75686a;
        }
        return interfaceC7048.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f75686a.hashCode();
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        return C20460.m46155a(this.f75686a.register(C3024.m5116b(watchService), AbstractC24029.m53217G(kindArr)));
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        return C20460.m46155a(this.f75686a.register(C3024.m5116b(watchService), AbstractC24029.m53217G(kindArr), AbstractC24029.m53218H(modifierArr)));
    }
}
