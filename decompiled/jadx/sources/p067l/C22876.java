package p067l;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩸۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 82VA */
/* JADX INFO: loaded from: classes4.dex */
public final class C22876 {

    /* JADX INFO: renamed from: ֫ */
    public final File f72010;

    /* JADX INFO: renamed from: ۧ */
    public final File f72011;

    public C22876(File file) {
        this.f72010 = file;
        this.f72011 = new File(file.getPath() + ".new");
    }

    /* JADX INFO: renamed from: ܽ */
    public final File m51088() {
        return this.f72010;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51083() {
        this.f72010.delete();
        this.f72011.delete();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final FileOutputStream m51091() throws IOException {
        File file = this.f72011;
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + file);
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                throw new IOException("Failed to create new file " + file, e);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final FileInputStream m51089() {
        File file = this.f72011;
        boolean zExists = file.exists();
        File file2 = this.f72010;
        if (zExists && file2.exists() && !file.delete()) {
            C12826.toString(file);
        }
        return new FileInputStream(file2);
    }

    /* JADX INFO: renamed from: ܳ */
    public final byte[] m51087() throws IOException {
        FileInputStream fileInputStreamM51089 = m51089();
        try {
            byte[] bArr = new byte[fileInputStreamM51089.available()];
            int i = 0;
            while (true) {
                int i2 = fileInputStreamM51089.read(bArr, i, bArr.length - i);
                if (i2 > 0) {
                    i += i2;
                    int iAvailable = fileInputStreamM51089.available();
                    if (iAvailable > bArr.length - i) {
                        byte[] bArr2 = new byte[iAvailable + i];
                        System.arraycopy(bArr, 0, bArr2, 0, i);
                        bArr = bArr2;
                    }
                } else {
                    fileInputStreamM51089.close();
                    return bArr;
                }
            }
        } catch (Throwable th) {
            fileInputStreamM51089.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m51086() {
        return this.f72010.exists();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m51090() {
        return this.f72010.isFile();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51084(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
        }
        try {
            fileOutputStream.close();
        } catch (IOException unused2) {
        }
        File file = this.f72011;
        if (file.delete()) {
            return;
        }
        C12826.toString(file);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51085(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
        }
        try {
            fileOutputStream.close();
        } catch (IOException unused2) {
        }
        File file = this.f72010;
        if (file.isDirectory() && !file.delete()) {
            file.toString();
        }
        File file2 = this.f72011;
        if (file2.renameTo(file)) {
            return;
        }
        file2.toString();
        file.toString();
    }
}
