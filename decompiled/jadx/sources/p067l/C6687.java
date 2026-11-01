package p067l;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۙۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8QS */
/* JADX INFO: loaded from: classes3.dex */
public final class C6687 extends AbstractC16744 {
    @Override // p067l.AbstractC16744
    /* JADX INFO: renamed from: ֫ */
    public final C25079 mo6303(C10040 c10040, ByteBuffer byteBuffer) {
        return new C25079(m15238(new C19203(byteBuffer.array(), byteBuffer.limit())));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21440 m15238(C19203 c19203) {
        String strM43734 = c19203.m43734();
        strM43734.getClass();
        String strM43735 = c19203.m43734();
        strM43735.getClass();
        return new C21440(strM43734, strM43735, c19203.m43733(), c19203.m43733(), Arrays.copyOfRange(c19203.m43728(), c19203.m43731(), c19203.m43729()));
    }
}
