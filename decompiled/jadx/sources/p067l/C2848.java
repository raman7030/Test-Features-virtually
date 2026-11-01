package p067l;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.֡ܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J540 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2848 implements Serializable {
    public static final long serialVersionUID = -8017692739988399978L;

    /* JADX INFO: renamed from: ᩸ */
    public final C22595 f4904 = new C22595();

    /* JADX INFO: renamed from: ᩹ */
    public final C16929 f4905;

    public C2848(C16929 c16929) {
        this.f4905 = c16929;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4560() {
        C22595 c22595 = this.f4904;
        if (c22595.isEmpty()) {
            return;
        }
        C21230.forEach(c22595, new C20955(0, new C6202(this.f4905)));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m4561() {
        C22595 c22595 = this.f4904;
        if (c22595.isEmpty()) {
            return;
        }
        C21230.forEach(c22595, new C14478(1, new C6202(this.f4905)));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }
}
