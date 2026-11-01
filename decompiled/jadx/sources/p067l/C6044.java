package p067l;

import java.util.EventListener;

/* JADX INFO: renamed from: l.ۘۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: EA25 */
/* JADX INFO: loaded from: classes2.dex */
public class C6044 {

    /* JADX INFO: renamed from: ֫ */
    public final EventListener f15175;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f15176;

    public C6044(InterfaceC7976 interfaceC7976, boolean z) {
        this.f15175 = interfaceC7976;
        this.f15176 = z;
    }

    public final int hashCode() {
        return this.f15175.hashCode();
    }

    /* JADX INFO: renamed from: ֫ */
    public final EventListener m13616() {
        return this.f15175;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m13617() {
        return this.f15176;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6044) {
            return this.f15175.equals(((C6044) obj).f15175);
        }
        return false;
    }
}
