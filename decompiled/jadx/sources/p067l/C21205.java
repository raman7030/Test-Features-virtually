package p067l;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩶֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21205 extends AbstractC2783 {

    /* JADX INFO: renamed from: ۬ */
    public final byte[] f66688;

    public C21205(String str, C6452 c6452) {
        String strM48631;
        C11996 c11996 = new C11996();
        c11996.writeByte(77);
        c11996.writeByte(84);
        c11996.writeByte(0);
        c11996.writeByte(83);
        c11996.writeByte(80);
        c11996.writeByte(69);
        c11996.writeByte(67);
        c11996.writeByte(73);
        c11996.writeByte(65);
        c11996.writeByte(76);
        c11996.writeByte(1);
        char c = c6452.f16678;
        c11996.writeByte(c);
        c11996.writeByte(2);
        long j = c6452.f16679;
        c11996.m27451(j);
        byte[] bArrM27464 = c11996.m27464();
        long length = bArrM27464.length;
        if (c == 'b' || c == 'c') {
            strM48631 = "special-content:" + c + ":" + j;
        } else {
            strM48631 = C21466.m48631("special-path:", str);
        }
        super(str, length, strM48631);
        this.f66688 = bArrM27464;
    }

    @Override // p067l.AbstractC2783
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo4369() {
        return new ByteArrayInputStream(this.f66688);
    }
}
