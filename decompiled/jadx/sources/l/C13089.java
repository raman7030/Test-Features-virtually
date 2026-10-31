package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۬ۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66M9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13089 extends AbstractC22967 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ File f39188;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f39189;

    public C13089(File file, String str) {
        this.f39189 = str;
        this.f39188 = file;
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩻ */
    public final String mo6180() {
        return this.f39189;
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩳ */
    public final String mo6177() {
        return this.f39188.getName();
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩴ */
    public final InputStream mo6178() {
        return new FileInputStream(this.f39188);
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ۜ */
    public final File mo17660() {
        return this.f39188;
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩵ */
    public final C11679 mo6179() throws IOException {
        File canonicalFile = this.f39188.getCanonicalFile();
        if (!canonicalFile.isFile()) {
            throw new FileNotFoundException("Image source is not a regular file");
        }
        return new C11679("file:" + canonicalFile.getPath(), canonicalFile.length(), canonicalFile.lastModified());
    }
}
