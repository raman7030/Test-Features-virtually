package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۖۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8AG */
/* JADX INFO: loaded from: classes2.dex */
public final class C4572 {

    /* JADX INFO: renamed from: ֫ */
    public final C5072 f10242;

    /* JADX INFO: renamed from: ۧ */
    public final C11107 f10243;

    /* JADX INFO: renamed from: ܽ */
    public int f10244;

    public C4572(OutputStream outputStream) {
        C11107 c11107 = new C11107(outputStream);
        this.f10243 = c11107;
        this.f10242 = new C5072(new DataOutputStream(c11107));
        this.f10244 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9649(EnumC5913 enumC5913) throws IOException {
        if (enumC5913 == EnumC5913.ONE) {
            return;
        }
        long jM13297 = enumC5913.m13297();
        C11107 c11107 = this.f10243;
        long jM25580 = (((long) (~enumC5913.m13297())) & (c11107.m25580() + jM13297)) - c11107.m25580();
        while (true) {
            long j = jM25580 - 1;
            if (jM25580 <= 0) {
                return;
            }
            m9647(0);
            jM25580 = j;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9646() throws IOException {
        int i = this.f10244;
        this.f10244 = i + 4;
        m9651(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9650(byte[] bArr) throws IOException {
        this.f10242.write(bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9647(int i) throws IOException {
        this.f10242.writeByte(i);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m9652(int i) throws IOException {
        this.f10242.writeShort(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m9651(int i) throws IOException {
        this.f10242.writeInt(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9648(String str) throws IOException {
        this.f10242.writeChars(str);
    }
}
