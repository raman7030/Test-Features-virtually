package l;

import java.io.ByteArrayInputStream;
import java.io.EOFException;

/* JADX INFO: renamed from: l.ܺۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8A0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15723 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16248 f48497;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9900 f48498;

    public C15723(ByteArrayInputStream byteArrayInputStream) {
        C9900 c9900 = new C9900(byteArrayInputStream);
        this.f48498 = c9900;
        this.f48497 = new C16248(c9900);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37107(EnumC3730 enumC3730) {
        if (enumC3730 == EnumC3730.ONE) {
            return;
        }
        long jM11345 = enumC3730.m11345();
        C9900 c9900 = this.f48498;
        long jM25003 = (((long) (~enumC3730.m11345())) & (c9900.m25003() + jM11345)) - c9900.m25003();
        while (true) {
            long j = jM25003 - 1;
            if (jM25003 <= 0) {
                return;
            }
            m37105();
            jM25003 = j;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37108(InterfaceC18547 interfaceC18547) {
        interfaceC18547.mo5152(this);
        interfaceC18547.mo5151(this);
        interfaceC18547.mo5150(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37109(byte[] bArr) {
        this.f48497.readFully(bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37106(int i) throws EOFException {
        if (i != this.f48497.skipBytes(i)) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte m37105() {
        return (byte) this.f48497.readUnsignedByte();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final short m37113() {
        return (short) this.f48497.readUnsignedShort();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char m37110() {
        return (char) this.f48497.readUnsignedShort();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m37111() {
        return this.f48497.readInt();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long m37112() {
        return ((long) this.f48497.readInt()) & 4294967295L;
    }
}
