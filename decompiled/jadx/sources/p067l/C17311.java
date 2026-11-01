package p067l;

import java.io.ByteArrayInputStream;
import java.io.EOFException;

/* JADX INFO: renamed from: l.ܺۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8A0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17311 {

    /* JADX INFO: renamed from: ֫ */
    public final C17811 f51637;

    /* JADX INFO: renamed from: ۧ */
    public final C11778 f51638;

    public C17311(ByteArrayInputStream byteArrayInputStream) {
        C11778 c11778 = new C11778(byteArrayInputStream);
        this.f51638 = c11778;
        this.f51637 = new C17811(c11778);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39276(EnumC5913 enumC5913) {
        if (enumC5913 == EnumC5913.ONE) {
            return;
        }
        long jM13297 = enumC5913.m13297();
        C11778 c11778 = this.f51638;
        long jM27018 = (((long) (~enumC5913.m13297())) & (c11778.m27018() + jM13297)) - c11778.m27018();
        while (true) {
            long j = jM27018 - 1;
            if (jM27018 <= 0) {
                return;
            }
            m39274();
            jM27018 = j;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39277(InterfaceC19995 interfaceC19995) {
        interfaceC19995.mo7394(this);
        interfaceC19995.mo7393(this);
        interfaceC19995.mo7392(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39278(byte[] bArr) {
        this.f51637.readFully(bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39275(int i) throws EOFException {
        if (i != this.f51637.skipBytes(i)) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte m39274() {
        return (byte) this.f51637.readUnsignedByte();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final short m39282() {
        return (short) this.f51637.readUnsignedShort();
    }

    /* JADX INFO: renamed from: ۧ */
    public final char m39279() {
        return (char) this.f51637.readUnsignedShort();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m39280() {
        return this.f51637.readInt();
    }

    /* JADX INFO: renamed from: ܿ */
    public final long m39281() {
        return ((long) this.f51637.readInt()) & 4294967295L;
    }
}
