package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۖۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8AG */
/* JADX INFO: loaded from: classes2.dex */
public final class C2319 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2844 f7450;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9194 f7451;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f7452;

    public C2319(OutputStream outputStream) {
        C9194 c9194 = new C9194(outputStream);
        this.f7451 = c9194;
        this.f7450 = new C2844(new DataOutputStream(c9194));
        this.f7452 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7579(EnumC3730 enumC3730) throws IOException {
        if (enumC3730 == EnumC3730.ONE) {
            return;
        }
        long jM11345 = enumC3730.m11345();
        C9194 c9194 = this.f7451;
        long jM23627 = (((long) (~enumC3730.m11345())) & (c9194.m23627() + jM11345)) - c9194.m23627();
        while (true) {
            long j = jM23627 - 1;
            if (jM23627 <= 0) {
                return;
            }
            m7577(0);
            jM23627 = j;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7576() throws IOException {
        int i = this.f7452;
        this.f7452 = i + 4;
        m7581(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7580(byte[] bArr) throws IOException {
        this.f7450.write(bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7577(int i) throws IOException {
        this.f7450.writeByte(i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m7582(int i) throws IOException {
        this.f7450.writeShort(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7581(int i) throws IOException {
        this.f7450.writeInt(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7578(String str) throws IOException {
        this.f7450.writeChars(str);
    }
}
