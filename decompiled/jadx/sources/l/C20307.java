package l;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: O878 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20307 extends AbstractC8333 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC21013 f65571;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC8333 f65572;

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        Collection collection = (Collection) obj;
        if (collection == null) {
            c23525.m51981();
            return;
        }
        c23525.m51972();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f65572.mo2845(c23525, it.next());
        }
        c23525.m51989();
    }

    public C20307(AbstractC8333 abstractC8333, InterfaceC21013 interfaceC21013) {
        this.f65572 = abstractC8333;
        this.f65571 = interfaceC21013;
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) throws IOException {
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        Collection collection = (Collection) this.f65571.mo12796();
        c17175.m40391();
        while (c17175.m40404()) {
            collection.add(this.f65572.mo2844(c17175));
        }
        c17175.m40400();
        return collection;
    }
}
