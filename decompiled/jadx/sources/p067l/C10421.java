package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.۠᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10421 extends AbstractC11092 implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final C10421 f28820b;
    public static final long serialVersionUID = 6740630888130243051L;

    /* JADX INFO: renamed from: a */
    public final AbstractC7739 f28821a;

    public C10421(AbstractC7739 abstractC7739) {
        this.f28821a = abstractC7739;
    }

    static {
        System.currentTimeMillis();
        f28820b = new C10421(C19550.f59517f);
    }

    @Override // p067l.AbstractC11092
    public final C6398 instant() {
        return C6398.ofEpochMilli(System.currentTimeMillis());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10421) {
            return this.f28821a.equals(((C10421) obj).f28821a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28821a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f28821a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
}
