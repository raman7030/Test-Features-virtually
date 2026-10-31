package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩸۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 82VA */
/* JADX INFO: loaded from: classes4.dex */
public final class C21578 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final File f69308;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final File f69309;

    public C21578(File file) {
        this.f69308 = file;
        this.f69309 = new File(file.getPath() + ".new");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final File m48742() {
        return this.f69308;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48737() {
        this.f69308.delete();
        this.f69309.delete();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final FileOutputStream m48745() throws IOException {
        File file = this.f69309;
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

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final FileInputStream m48743() {
        File file = this.f69309;
        boolean zExists = file.exists();
        File file2 = this.f69308;
        if (zExists && file2.exists() && !file.delete()) {
            C11003.toString(file);
        }
        return new FileInputStream(file2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m48741() throws IOException {
        FileInputStream fileInputStreamM48743 = m48743();
        try {
            byte[] bArr = new byte[fileInputStreamM48743.available()];
            int i = 0;
            while (true) {
                int i2 = fileInputStreamM48743.read(bArr, i, bArr.length - i);
                if (i2 > 0) {
                    i += i2;
                    int iAvailable = fileInputStreamM48743.available();
                    if (iAvailable > bArr.length - i) {
                        byte[] bArr2 = new byte[iAvailable + i];
                        System.arraycopy(bArr, 0, bArr2, 0, i);
                        bArr = bArr2;
                    }
                } else {
                    fileInputStreamM48743.close();
                    return bArr;
                }
            }
        } catch (Throwable th) {
            fileInputStreamM48743.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m48740() {
        return this.f69308.exists();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m48744() {
        return this.f69308.isFile();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48738(FileOutputStream fileOutputStream) {
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
        File file = this.f69309;
        if (file.delete()) {
            return;
        }
        C11003.toString(file);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48739(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
        }
        try {
            fileOutputStream.close();
        } catch (IOException unused2) {
        }
        File file = this.f69308;
        if (file.isDirectory() && !file.delete()) {
            file.toString();
        }
        File file2 = this.f69309;
        if (file2.renameTo(file)) {
            return;
        }
        file2.toString();
        file.toString();
    }
}
