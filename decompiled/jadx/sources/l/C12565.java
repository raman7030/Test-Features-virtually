package l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.۫ᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: JB0Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C12565 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f37875;

    public C12565(ByteBuffer byteBuffer) {
        this.f37875 = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m30802() {
        return this.f37875.getShort() & HPKE.aead_EXPORT_ONLY;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m30801() {
        return ((long) this.f37875.getInt()) & 4294967295L;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m30800() {
        return this.f37875.getInt();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30799(int i) {
        ByteBuffer byteBuffer = this.f37875;
        byteBuffer.position(byteBuffer.position() + i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m30798() {
        return this.f37875.position();
    }
}
