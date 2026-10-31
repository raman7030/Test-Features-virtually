package l;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes3.dex */
public final class C6053 implements InterfaceC0408 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f18553 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public DataOutputStream f18552 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private synchronized void m16880(String str) {
        if (this.f18553 && this.f18552.size() >= 0) {
            throw new IOException(str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16885(DataOutputStream dataOutputStream) {
        this.f18552 = dataOutputStream;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m16881() {
        this.f18552.write(0);
        m16880("Writing byte: 0");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m16883(int i, byte[] bArr) {
        this.f18552.write(bArr, 0, i);
        m16880("Writing byte-array: " + bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16882(int i) throws IOException {
        this.f18552.writeByte(i);
        m16880("Writing writeByte: " + i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m16889(int i) throws IOException {
        this.f18552.writeShort(i);
        m16880("Writing writeShort: " + i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m16887(int i) throws IOException {
        this.f18552.writeInt(i);
        m16880("Writing writeInt: " + i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16884(long j) throws IOException {
        this.f18552.writeLong(j);
        m16880("Writing writeLong: " + j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16886(String str) throws IOException {
        this.f18552.writeBytes(str);
        m16880("Writing writeBytes: " + str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m16888(String str) throws IOException {
        this.f18552.writeUTF(str);
        m16880("Writing writeUTF: " + str);
    }
}
