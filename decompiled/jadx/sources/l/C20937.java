package l;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩷ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes5.dex */
public final class C20937 implements InterfaceC22347 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final File f67698;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final FileOutputStream f67699;

    public C20937(File file) throws IOException {
        File fileCreateTempFile = File.createTempFile("NanoHTTPD-", "", file);
        this.f67698 = fileCreateTempFile;
        this.f67699 = new FileOutputStream(fileCreateTempFile);
    }

    @Override // l.InterfaceC22347
    public final void delete() throws Exception {
        AbstractC4708.m13790(this.f67699);
        File file = this.f67698;
        if (file.delete()) {
            return;
        }
        throw new Exception("could not delete temporary file: " + file.getAbsolutePath());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m47759() {
        return this.f67698.getAbsolutePath();
    }
}
