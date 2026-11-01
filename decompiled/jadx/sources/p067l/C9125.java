package p067l;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۟֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 82VA */
/* JADX INFO: loaded from: classes2.dex */
public final class C9125 {

    /* JADX INFO: renamed from: ֫ */
    public final File f24698;

    /* JADX INFO: renamed from: ۧ */
    public final File f24699;

    public C9125(File file) {
        this.f24699 = file;
        this.f24698 = new File(file.getPath() + ".bak");
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m21069() {
        return this.f24699.exists() || this.f24698.exists();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21067() {
        this.f24699.delete();
        this.f24698.delete();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final OutputStream m21071() throws IOException {
        File file = this.f24699;
        if (file.exists()) {
            File file2 = this.f24698;
            if (!file2.exists()) {
                if (!file.renameTo(file2)) {
                    C21334.m48351("Couldn't rename file " + file + " to backup file " + file2);
                }
            } else {
                file.delete();
            }
        }
        try {
            return new C15159(file);
        } catch (FileNotFoundException e) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file, e);
            }
            try {
                return new C15159(file);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + file, e2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21068(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.close();
        this.f24698.delete();
    }

    /* JADX INFO: renamed from: ܽ */
    public final FileInputStream m21070() {
        File file = this.f24698;
        boolean zExists = file.exists();
        File file2 = this.f24699;
        if (zExists) {
            file2.delete();
            file.renameTo(file2);
        }
        return new FileInputStream(file2);
    }
}
