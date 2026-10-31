package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.۠᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8472 extends AbstractC9178 implements Serializable {
    public static final C8472 b;
    public static final long serialVersionUID = 6740630888130243051L;
    public final AbstractC5650 a;

    public C8472(AbstractC5650 abstractC5650) {
        this.a = abstractC5650;
    }

    static {
        System.currentTimeMillis();
        b = new C8472(C18078.f);
    }

    @Override // l.AbstractC9178
    public final C4239 instant() {
        return C4239.ofEpochMilli(System.currentTimeMillis());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8472) {
            return this.a.equals(((C8472) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
}
