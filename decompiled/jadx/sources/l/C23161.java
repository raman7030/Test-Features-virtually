package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩺ᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B7V */
/* JADX INFO: loaded from: classes.dex */
public final class C23161 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f74445;

    public C23161(ByteBuffer byteBuffer) {
        this.f74445 = byteBuffer.slice();
    }

    public C23161(byte[] bArr) {
        this.f74445 = ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m51340() {
        return this.f74445.slice();
    }
}
