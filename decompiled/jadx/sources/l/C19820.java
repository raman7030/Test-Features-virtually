package l;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩶֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19820 extends AbstractC0436 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final byte[] f64051;

    public C19820(String str, C4297 c4297) {
        String strM46315;
        C10130 c10130 = new C10130();
        c10130.writeByte(77);
        c10130.writeByte(84);
        c10130.writeByte(0);
        c10130.writeByte(83);
        c10130.writeByte(80);
        c10130.writeByte(69);
        c10130.writeByte(67);
        c10130.writeByte(73);
        c10130.writeByte(65);
        c10130.writeByte(76);
        c10130.writeByte(1);
        char c = c4297.f13863;
        c10130.writeByte(c);
        c10130.writeByte(2);
        long j = c4297.f13864;
        c10130.m25431(j);
        byte[] bArrM25444 = c10130.m25444();
        long length = bArrM25444.length;
        if (c == 'b' || c == 'c') {
            strM46315 = "special-content:" + c + ":" + j;
        } else {
            strM46315 = C20094.m46315("special-path:", str);
        }
        super(str, length, strM46315);
        this.f64051 = bArrM25444;
    }

    @Override // l.AbstractC0436
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo1993() {
        return new ByteArrayInputStream(this.f64051);
    }
}
