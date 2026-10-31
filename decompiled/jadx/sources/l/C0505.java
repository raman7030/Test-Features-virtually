package l;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.֡ܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J540 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0505 implements Serializable {
    public static final long serialVersionUID = -8017692739988399978L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21283 f2131 = new C21283();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15321 f2132;

    public C0505(C15321 c15321) {
        this.f2132 = c15321;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2193() {
        C21283 c21283 = this.f2131;
        if (c21283.isEmpty()) {
            return;
        }
        C19846.forEach(c21283, new C19557(0, new C4034(this.f2132)));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2194() {
        C21283 c21283 = this.f2131;
        if (c21283.isEmpty()) {
            return;
        }
        C19846.forEach(c21283, new C12741(1, new C4034(this.f2132)));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }
}
