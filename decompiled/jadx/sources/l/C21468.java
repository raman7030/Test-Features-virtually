package l;

import java.io.Closeable;

/* JADX INFO: renamed from: l.᩸ۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: V7IW */
/* JADX INFO: loaded from: classes5.dex */
public final class C21468 implements InterfaceC15116, Closeable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC17664 f69093;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC15116 m48616(InterfaceC17664 interfaceC17664) {
        if (interfaceC17664 != null) {
            return new C21468(interfaceC17664);
        }
        return m48616(C16958.empty());
    }

    public C21468(InterfaceC17664 interfaceC17664) {
        this.f69093 = interfaceC17664;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f69093.close();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12393 m48617() {
        return this.f69093;
    }
}
