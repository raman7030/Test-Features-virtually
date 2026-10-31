package l;

import java.util.EventListener;

/* JADX INFO: renamed from: l.ۘۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: EA25 */
/* JADX INFO: loaded from: classes2.dex */
public class C3867 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EventListener f12368;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f12369;

    public C3867(InterfaceC5900 interfaceC5900, boolean z) {
        this.f12368 = interfaceC5900;
        this.f12369 = z;
    }

    public final int hashCode() {
        return this.f12368.hashCode();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EventListener m11680() {
        return this.f12368;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m11681() {
        return this.f12369;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3867) {
            return this.f12368.equals(((C3867) obj).f12368);
        }
        return false;
    }
}
