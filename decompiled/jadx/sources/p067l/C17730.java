package p067l;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܺ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9O0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17730 {

    /* JADX INFO: renamed from: ֫ */
    public final long f52957;

    /* JADX INFO: renamed from: ۧ */
    public final long f52958;

    /* JADX INFO: renamed from: ܽ */
    public final int f52959;

    /* JADX INFO: renamed from: ᩳ */
    public final int f52960;

    public C17730(int i, int i2, long j, long j2) {
        this.f52960 = i;
        this.f52959 = i2;
        this.f52958 = j;
        this.f52957 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C17730)) {
            C17730 c17730 = (C17730) obj;
            if (this.f52959 == c17730.f52959 && this.f52958 == c17730.f52958 && this.f52960 == c17730.f52960 && this.f52957 == c17730.f52957) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C12826.hash(Integer.valueOf(this.f52959), Long.valueOf(this.f52958), Integer.valueOf(this.f52960), Long.valueOf(this.f52957));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40290(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f52960);
            dataOutputStream.writeInt(this.f52959);
            dataOutputStream.writeLong(this.f52958);
            dataOutputStream.writeLong(this.f52957);
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

    /* JADX INFO: renamed from: ۧ */
    public static C17730 m40289(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C17730 c17730 = new C17730(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c17730;
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
