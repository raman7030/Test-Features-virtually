package l;

import java.nio.file.WatchEvent;

/* JADX INFO: renamed from: l.ۡ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9157 {
    public final /* synthetic */ WatchEvent a;

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent watchEvent = this.a;
        if (obj instanceof C9157) {
            obj = ((C9157) obj).a;
        }
        return watchEvent.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
