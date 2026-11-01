package p067l;

import java.io.Closeable;

/* JADX INFO: renamed from: l.᩸ۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: V7IW */
/* JADX INFO: loaded from: classes5.dex */
public final class C22771 implements InterfaceC16734, Closeable {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC19157 f71791;

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC16734 m50953(InterfaceC19157 interfaceC19157) {
        if (interfaceC19157 != null) {
            return new C22771(interfaceC19157);
        }
        return m50953(C18486.empty());
    }

    public C22771(InterfaceC19157 interfaceC19157) {
        this.f71791 = interfaceC19157;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f71791.close();
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC14147 m50954() {
        return this.f71791;
    }
}
