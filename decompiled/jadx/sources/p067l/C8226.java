package p067l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۛܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZP */
/* JADX INFO: loaded from: classes3.dex */
public final class C8226 extends C12250 {
    /* JADX INFO: renamed from: ֫ */
    public final String m19000(int i) {
        ByteBuffer byteBuffer = this.f34237.f17898;
        int i2 = ((int) this.f34238) + i;
        StringBuilder sb = new StringBuilder();
        while (true) {
            byte b = byteBuffer.get(i2);
            if (b != 0) {
                sb.append((char) b);
                i2++;
            } else {
                return sb.toString();
            }
        }
    }
}
