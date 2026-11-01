package p067l;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes3.dex */
public final class C8121 implements InterfaceC2756 {

    /* JADX INFO: renamed from: ۧ */
    public boolean f21409 = false;

    /* JADX INFO: renamed from: ֫ */
    public DataOutputStream f21408 = null;

    /* JADX INFO: renamed from: ܽ */
    private synchronized void m18809(String str) {
        if (this.f21409 && this.f21408.size() >= 0) {
            throw new IOException(str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18814(DataOutputStream dataOutputStream) {
        this.f21408 = dataOutputStream;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m18810() {
        this.f21408.write(0);
        m18809("Writing byte: 0");
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m18812(int i, byte[] bArr) {
        this.f21408.write(bArr, 0, i);
        m18809("Writing byte-array: " + bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18811(int i) throws IOException {
        this.f21408.writeByte(i);
        m18809("Writing writeByte: " + i);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m18818(int i) throws IOException {
        this.f21408.writeShort(i);
        m18809("Writing writeShort: " + i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m18816(int i) throws IOException {
        this.f21408.writeInt(i);
        m18809("Writing writeInt: " + i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18813(long j) throws IOException {
        this.f21408.writeLong(j);
        m18809("Writing writeLong: " + j);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18815(String str) throws IOException {
        this.f21408.writeBytes(str);
        m18809("Writing writeBytes: " + str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m18817(String str) throws IOException {
        this.f21408.writeUTF(str);
        m18809("Writing writeUTF: " + str);
    }
}
