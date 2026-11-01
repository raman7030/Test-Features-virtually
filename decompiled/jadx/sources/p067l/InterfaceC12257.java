package p067l;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: l.ۤܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K4DD */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC12257 extends InterfaceC7603, WritableByteChannel {
    @Override // p067l.InterfaceC7603, java.io.Flushable
    void flush();

    InterfaceC12257 write(byte[] bArr);

    InterfaceC12257 writeByte(int i);

    InterfaceC12257 writeInt(int i);

    InterfaceC12257 writeShort(int i);

    /* JADX INFO: renamed from: ֫ */
    InterfaceC12257 mo28275(C13598 c13598);

    /* JADX INFO: renamed from: ۡ */
    InterfaceC12257 mo28276(long j);

    /* JADX INFO: renamed from: ۨ */
    InterfaceC12257 mo28277();

    /* JADX INFO: renamed from: ܳ */
    InterfaceC12257 mo28278(long j);

    /* JADX INFO: renamed from: ܳܽ */
    OutputStream mo28279();

    /* JADX INFO: renamed from: ܽ */
    InterfaceC12257 mo28280(String str);

    /* JADX INFO: renamed from: ᩳ */
    InterfaceC12257 mo28281(int i, int i2, byte[] bArr);

    /* JADX INFO: renamed from: ᩷ */
    C14268 mo28282();
}
