package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۟᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8X1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9678 implements InterfaceC15712 {

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f26672 = new HashMap(3);

    /* JADX INFO: renamed from: ۧ */
    public final Object m22560(C13702 c13702) {
        Boolean bool = Boolean.FALSE;
        Object obj = this.f26672.get(c13702);
        return obj != null ? obj : bool;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m22558(C13702 c13702) {
        return this.f26672.get(c13702);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22559(C13702 c13702, Object obj) {
        HashMap map = this.f26672;
        if (obj == null) {
            map.remove(c13702);
        } else {
            map.put(c13702, obj);
        }
    }
}
