package l;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: l.ܰ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BK7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13490 implements FilenameFilter {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f40279;

    public C13490(String str) {
        this.f40279 = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f40279);
    }
}
