package p067l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩺ᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B7V */
/* JADX INFO: loaded from: classes.dex */
public final class C24381 {

    /* JADX INFO: renamed from: ֫ */
    public final ByteBuffer f77191;

    public C24381(ByteBuffer byteBuffer) {
        this.f77191 = byteBuffer.slice();
    }

    public C24381(byte[] bArr) {
        this.f77191 = ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final ByteBuffer m53736() {
        return this.f77191.slice();
    }
}
