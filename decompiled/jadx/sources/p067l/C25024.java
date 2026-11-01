package p067l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩻ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: F43P */
/* JADX INFO: loaded from: classes.dex */
public final class C25024 {

    /* JADX INFO: renamed from: ֫ */
    public ByteBuffer f79885;

    /* JADX INFO: renamed from: ֫ */
    public final ByteBuffer m54944(int i) {
        ByteBuffer byteBufferAllocate;
        if (i < 20480) {
            i = UMModuleRegister.PUSH_EVENT_VALUE_HIGH;
        }
        ByteBuffer byteBuffer = this.f79885;
        if (byteBuffer != null && byteBuffer.capacity() >= i) {
            byteBufferAllocate = (ByteBuffer) this.f79885.clear();
        } else {
            byteBufferAllocate = ByteBuffer.allocate((i + i) >> 1);
        }
        this.f79885 = null;
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54945(ByteBuffer byteBuffer) {
        this.f79885 = byteBuffer;
    }
}
