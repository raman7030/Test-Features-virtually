package p067l;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܽܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 94EC */
/* JADX INFO: loaded from: classes4.dex */
public final class C18291 implements InterfaceC19633 {
    @Override // p067l.InterfaceC19633
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC3579 mo41666(File file) {
        int i = C25037.f79922;
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return C25037.m54972(new FileInputStream(file));
    }

    @Override // p067l.InterfaceC19633
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC7603 mo41664(File file) {
        try {
            return C25037.m54979(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return C25037.m54979(file);
        }
    }

    @Override // p067l.InterfaceC19633
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC7603 mo41665(File file) {
        try {
            return C25037.m54974(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return C25037.m54974(file);
        }
    }

    @Override // p067l.InterfaceC19633
    /* JADX INFO: renamed from: ᩻ */
    public final void mo41668(File file) throws IOException {
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + file);
    }

    @Override // p067l.InterfaceC19633
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo41663(File file) {
        return file.exists();
    }

    @Override // p067l.InterfaceC19633
    /* JADX INFO: renamed from: ᩳ */
    public final long mo41667(File file) {
        return file.length();
    }

    @Override // p067l.InterfaceC19633
    /* JADX INFO: renamed from: ֫ */
    public final void mo41662(File file, File file2) throws IOException {
        mo41668(file2);
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("failed to rename " + file + " to " + file2);
    }

    @Override // p067l.InterfaceC19633
    /* JADX INFO: renamed from: ֫ */
    public final void mo41661(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                mo41661(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete " + file2);
            }
        }
    }
}
