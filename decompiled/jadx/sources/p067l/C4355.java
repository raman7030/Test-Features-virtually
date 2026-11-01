package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H403 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4355 extends ArrayList {
    @Override // java.util.ArrayList
    public final Object clone() {
        C4355 c4355 = new C4355(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            c4355.add(((C21199) it.next()).mo55709clone());
        }
        return c4355;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbM49323 = C21869.m49323();
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            C21199 c21199 = (C21199) it.next();
            if (sbM49323.length() != 0) {
                sbM49323.append("\n");
            }
            sbM49323.append(c21199.mo5239());
        }
        return C21869.m49321(sbM49323);
    }
}
