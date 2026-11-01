package p067l;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩺᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes.dex */
public final class C24512 extends AbstractC24196 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractC17043 f77654;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ String f77655;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ String f77656;

    public C24512(AbstractC17043 abstractC17043, String str, String str2) {
        this.f77655 = str;
        this.f77656 = str2;
        this.f77654 = abstractC17043;
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩻ */
    public final String mo8382() {
        return this.f77655;
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩳ */
    public final String mo8379() {
        return this.f77656;
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩴ */
    public final InputStream mo8380() {
        return this.f77654.mo29987();
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩵ */
    public final C13468 mo8381() throws IOException {
        AbstractC17043 abstractC17043 = this.f77654;
        if (!abstractC17043.mo25093()) {
            throw new IOException("Image source is no longer a regular file");
        }
        return new C13468(this.f77655, Math.max(-1L, abstractC17043.mo25101()), abstractC17043.mo25091());
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ܽ */
    public final File mo13948() {
        AbstractC17043 abstractC17043 = this.f77654;
        if (!abstractC17043.mo38688()) {
            return null;
        }
        File file = new File(abstractC17043.mo25505());
        if (file.isFile() && file.canRead()) {
            return file;
        }
        return null;
    }
}
