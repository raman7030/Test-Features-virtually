package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܽܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 94EC */
/* JADX INFO: loaded from: classes4.dex */
public final class C16754 implements InterfaceC18166 {
    @Override // l.InterfaceC18166
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1274 mo39430(File file) {
        int i = C23852.f77172;
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return C23852.m52563(new FileInputStream(file));
    }

    @Override // l.InterfaceC18166
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5508 mo39428(File file) {
        try {
            return C23852.m52570(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return C23852.m52570(file);
        }
    }

    @Override // l.InterfaceC18166
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5508 mo39429(File file) {
        try {
            return C23852.m52565(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return C23852.m52565(file);
        }
    }

    @Override // l.InterfaceC18166
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void mo39432(File file) throws IOException {
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + file);
    }

    @Override // l.InterfaceC18166
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo39427(File file) {
        return file.exists();
    }

    @Override // l.InterfaceC18166
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long mo39431(File file) {
        return file.length();
    }

    @Override // l.InterfaceC18166
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo39426(File file, File file2) throws IOException {
        mo39432(file2);
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("failed to rename " + file + " to " + file2);
    }

    @Override // l.InterfaceC18166
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo39425(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                mo39425(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete " + file2);
            }
        }
    }
}
