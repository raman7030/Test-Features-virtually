package p067l;

import android.net.Uri;
import java.io.File;

/* JADX INFO: renamed from: l.ۜܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 116O */
/* JADX INFO: loaded from: classes3.dex */
public final class C8878 extends AbstractC11070 {
    public C8878(File file, Uri uri) {
        super(file, uri);
        if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
            return;
        }
        throw new IllegalArgumentException("Unsupported uri authority: " + uri.getAuthority());
    }

    @Override // p067l.AbstractC11070
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11070 mo20485(File file, Uri uri) {
        return new C8878(file, uri);
    }

    @Override // p067l.AbstractC11070
    /* JADX INFO: renamed from: ۗۧ */
    public final AbstractC11070 mo20487() {
        File parentFile = this.f30649.getParentFile();
        Uri uriM37023 = C16253.m37023(mo33652());
        if (parentFile == null || uriM37023 == null) {
            return null;
        }
        return new C8878(parentFile, uriM37023);
    }

    @Override // p067l.C16433, p067l.AbstractC17043
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo20484() {
        return C23770.m52834().mo4996();
    }

    @Override // p067l.C16433, p067l.AbstractC17043
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo20489() {
        return C23770.m52834().mo4996();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20486(long j) {
        if (j < 0 || !this.f30649.setLastModified(j)) {
            return false;
        }
        C11741 c11741 = this.f30650;
        if (c11741 == null) {
            return true;
        }
        c11741.f32787 = j;
        return true;
    }

    @Override // p067l.AbstractC11070
    /* JADX INFO: renamed from: ۛۧ */
    public final String mo20488() {
        return C16253.m37022(mo33652());
    }
}
