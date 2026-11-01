package p067l;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩹֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23216 extends AbstractC2783 {

    /* JADX INFO: renamed from: ۬ */
    public final byte[] f72958;

    /* JADX WARN: Illegal instructions before constructor call */
    public C23216(String str, String str2) {
        byte[] bArrM27086 = C11817.m27086(str2);
        super(str, bArrM27086.length, "link:".concat(str2));
        this.f72958 = bArrM27086;
    }

    @Override // p067l.AbstractC2783
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo4369() {
        return new ByteArrayInputStream(this.f72958);
    }
}
