package l;

import android.net.Uri;
import java.io.File;

/* JADX INFO: renamed from: l.ۜܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 116O */
/* JADX INFO: loaded from: classes3.dex */
public final class C6849 extends AbstractC9155 {
    public C6849(File file, Uri uri) {
        super(file, uri);
        if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
            return;
        }
        throw new IllegalArgumentException("Unsupported uri authority: " + uri.getAuthority());
    }

    @Override // l.AbstractC9155
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC9155 mo18536(File file, Uri uri) {
        return new C6849(file, uri);
    }

    @Override // l.AbstractC9155
    /* JADX INFO: renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC9155 mo18538() {
        File parentFile = this.f27709.getParentFile();
        Uri uriM34872 = C14609.m34872(mo31567());
        if (parentFile == null || uriM34872 == null) {
            return null;
        }
        return new C6849(parentFile, uriM34872);
    }

    @Override // l.C14798, l.AbstractC15440
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean mo18535() {
        return C22518.m50492().mo2656();
    }

    @Override // l.C14798, l.AbstractC15440
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean mo18540() {
        return C22518.m50492().mo2656();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo18537(long j) {
        if (j < 0 || !this.f27709.setLastModified(j)) {
            return false;
        }
        C9861 c9861 = this.f27710;
        if (c9861 == null) {
            return true;
        }
        c9861.f29834 = j;
        return true;
    }

    @Override // l.AbstractC9155
    /* JADX INFO: renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public final String mo18539() {
        return C14609.m34871(mo31567());
    }
}
