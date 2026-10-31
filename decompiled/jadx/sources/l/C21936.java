package l;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩹֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes.dex */
public final class C21936 extends AbstractC0436 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final byte[] f70246;

    /* JADX WARN: Illegal instructions before constructor call */
    public C21936(String str, String str2) {
        byte[] bArrM25069 = C9942.m25069(str2);
        super(str, bArrM25069.length, "link:".concat(str2));
        this.f70246 = bArrM25069;
    }

    @Override // l.AbstractC0436
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo1993() {
        return new ByteArrayInputStream(this.f70246);
    }
}
