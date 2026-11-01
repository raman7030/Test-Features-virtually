package p067l;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: l.ܰ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BK7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15189 implements FilenameFilter {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ String f43349;

    public C15189(String str) {
        this.f43349 = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f43349);
    }
}
