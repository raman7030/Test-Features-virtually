package p067l;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩷ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes5.dex */
public final class C22267 implements InterfaceC23607 {

    /* JADX INFO: renamed from: ֫ */
    public final File f70383;

    /* JADX INFO: renamed from: ۧ */
    public final FileOutputStream f70384;

    public C22267(File file) throws IOException {
        File fileCreateTempFile = File.createTempFile("NanoHTTPD-", "", file);
        this.f70383 = fileCreateTempFile;
        this.f70384 = new FileOutputStream(fileCreateTempFile);
    }

    @Override // p067l.InterfaceC23607
    public final void delete() throws Exception {
        AbstractC6843.m15666(this.f70384);
        File file = this.f70383;
        if (file.delete()) {
            return;
        }
        throw new Exception("could not delete temporary file: " + file.getAbsolutePath());
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m50089() {
        return this.f70383.getAbsolutePath();
    }
}
