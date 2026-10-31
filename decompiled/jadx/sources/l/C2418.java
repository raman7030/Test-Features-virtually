package l;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۖۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O2J5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2418 implements FileFilter, FilenameFilter, InterfaceC9469, Serializable {
    public static final long serialVersionUID = 8782512160909720199L;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final String f7701 = Boolean.TRUE.toString();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C2418 f7700 = new C2418();

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return true;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return true;
    }

    @Override // l.InterfaceC9469
    public final boolean matches(InterfaceC20758 interfaceC20758) {
        EnumC16523 enumC16523 = EnumC16523.CONTINUE;
        EnumC16523 enumC16524 = EnumC16523.CONTINUE;
        EnumC16523 enumC16525 = EnumC16523.TERMINATE;
        return true;
    }

    public final String toString() {
        return f7701;
    }
}
