package p067l;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۬ۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66M9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14808 extends AbstractC24196 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ File f42236;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ String f42237;

    public C14808(File file, String str) {
        this.f42237 = str;
        this.f42236 = file;
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩻ */
    public final String mo8382() {
        return this.f42237;
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩳ */
    public final String mo8379() {
        return this.f42236.getName();
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩴ */
    public final InputStream mo8380() {
        return new FileInputStream(this.f42236);
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ۜ */
    public final File mo19605() {
        return this.f42236;
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩵ */
    public final C13468 mo8381() throws IOException {
        File canonicalFile = this.f42236.getCanonicalFile();
        if (!canonicalFile.isFile()) {
            throw new FileNotFoundException("Image source is not a regular file");
        }
        return new C13468("file:" + canonicalFile.getPath(), canonicalFile.length(), canonicalFile.lastModified());
    }
}
