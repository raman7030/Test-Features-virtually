package l;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܺ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9O0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16163 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f49791;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f49792;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f49793;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f49794;

    public C16163(int i, int i2, long j, long j2) {
        this.f49794 = i;
        this.f49793 = i2;
        this.f49792 = j;
        this.f49791 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C16163)) {
            C16163 c16163 = (C16163) obj;
            if (this.f49793 == c16163.f49793 && this.f49792 == c16163.f49792 && this.f49794 == c16163.f49794 && this.f49791 == c16163.f49791) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C11003.hash(Integer.valueOf(this.f49793), Long.valueOf(this.f49792), Integer.valueOf(this.f49794), Long.valueOf(this.f49791));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38098(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f49794);
            dataOutputStream.writeInt(this.f49793);
            dataOutputStream.writeLong(this.f49792);
            dataOutputStream.writeLong(this.f49791);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C16163 m38097(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C16163 c16163 = new C16163(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c16163;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
