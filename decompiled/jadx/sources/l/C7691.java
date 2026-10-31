package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۟᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8X1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7691 implements InterfaceC14040 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f23759 = new HashMap(3);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m20580(C11925 c11925) {
        Boolean bool = Boolean.FALSE;
        Object obj = this.f23759.get(c11925);
        return obj != null ? obj : bool;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m20578(C11925 c11925) {
        return this.f23759.get(c11925);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20579(C11925 c11925, Object obj) {
        HashMap map = this.f23759;
        if (obj == null) {
            map.remove(c11925);
        } else {
            map.put(c11925, obj);
        }
    }
}
