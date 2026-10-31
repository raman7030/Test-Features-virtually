package l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩻ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: F43P */
/* JADX INFO: loaded from: classes.dex */
public final class C23838 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ByteBuffer f77134;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m52535(int i) {
        ByteBuffer byteBufferAllocate;
        if (i < 20480) {
            i = UMModuleRegister.PUSH_EVENT_VALUE_HIGH;
        }
        ByteBuffer byteBuffer = this.f77134;
        if (byteBuffer != null && byteBuffer.capacity() >= i) {
            byteBufferAllocate = (ByteBuffer) this.f77134.clear();
        } else {
            byteBufferAllocate = ByteBuffer.allocate((i + i) >> 1);
        }
        this.f77134 = null;
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52536(ByteBuffer byteBuffer) {
        this.f77134 = byteBuffer;
    }
}
