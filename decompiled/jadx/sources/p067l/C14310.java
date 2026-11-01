package p067l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.۫ᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: JB0Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C14310 {

    /* JADX INFO: renamed from: ֫ */
    public final ByteBuffer f40901;

    public C14310(ByteBuffer byteBuffer) {
        this.f40901 = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m32877() {
        return this.f40901.getShort() & HPKE.aead_EXPORT_ONLY;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m32876() {
        return ((long) this.f40901.getInt()) & 4294967295L;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m32875() {
        return this.f40901.getInt();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32874(int i) {
        ByteBuffer byteBuffer = this.f40901;
        byteBuffer.position(byteBuffer.position() + i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m32873() {
        return this.f40901.position();
    }
}
