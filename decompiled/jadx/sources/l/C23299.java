package l;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩺᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes.dex */
public final class C23299 extends AbstractC22967 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f74909;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f74910;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f74911;

    public C23299(AbstractC15440 abstractC15440, String str, String str2) {
        this.f74910 = str;
        this.f74911 = str2;
        this.f74909 = abstractC15440;
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩻ */
    public final String mo6180() {
        return this.f74910;
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩳ */
    public final String mo6177() {
        return this.f74911;
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩴ */
    public final InputStream mo6178() {
        return this.f74909.mo27926();
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩵ */
    public final C11679 mo6179() throws IOException {
        AbstractC15440 abstractC15440 = this.f74909;
        if (!abstractC15440.mo23119()) {
            throw new IOException("Image source is no longer a regular file");
        }
        return new C11679(this.f74910, Math.max(-1L, abstractC15440.mo23127()), abstractC15440.mo23117());
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ܽ */
    public final File mo12024() {
        AbstractC15440 abstractC15440 = this.f74909;
        if (!abstractC15440.mo36530()) {
            return null;
        }
        File file = new File(abstractC15440.mo23554());
        if (file.isFile() && file.canRead()) {
            return file;
        }
        return null;
    }
}
