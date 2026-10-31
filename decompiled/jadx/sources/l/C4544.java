package l;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۙۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8QS */
/* JADX INFO: loaded from: classes3.dex */
public final class C4544 extends AbstractC15126 {
    @Override // l.AbstractC15126
    /* JADX INFO: renamed from: ֫ */
    public final C23896 mo4059(C8072 c8072, ByteBuffer byteBuffer) {
        return new C23896(m13350(new C17714(byteBuffer.array(), byteBuffer.limit())));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20067 m13350(C17714 c17714) {
        String strM41488 = c17714.m41488();
        strM41488.getClass();
        String strM41489 = c17714.m41488();
        strM41489.getClass();
        return new C20067(strM41488, strM41489, c17714.m41487(), c17714.m41487(), Arrays.copyOfRange(c17714.m41482(), c17714.m41485(), c17714.m41483()));
    }
}
