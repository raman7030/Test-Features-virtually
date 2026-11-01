package p067l;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩹᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: S403 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7039(EnumC5698.RELEASE_6)
public class C23823 extends AbstractC10412 {
    /* JADX INFO: renamed from: ֫ */
    public final Object m52900(List list, Object obj) {
        Iterator it = list.iterator();
        Set setM26788 = null;
        while (it.hasNext()) {
            setM26788 = ((C11654) this).m26788((InterfaceC13745) it.next(), (Set) obj);
        }
        return setM26788;
    }

    @Override // p067l.AbstractC10412
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12427(C6442 c6442, Object obj) {
        return m52900(c6442.mo3353(), obj);
    }
}
