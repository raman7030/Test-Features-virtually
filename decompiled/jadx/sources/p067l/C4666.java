package p067l;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۖۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O2J5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4666 implements FileFilter, FilenameFilter, InterfaceC11368, Serializable {
    public static final long serialVersionUID = 8782512160909720199L;

    /* JADX INFO: renamed from: ᩹ */
    public static final String f10492 = Boolean.TRUE.toString();

    /* JADX INFO: renamed from: ᩸ */
    public static final C4666 f10491 = new C4666();

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return true;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return true;
    }

    @Override // p067l.InterfaceC11368
    public final boolean matches(InterfaceC22097 interfaceC22097) {
        EnumC18072 enumC18072 = EnumC18072.CONTINUE;
        EnumC18072 enumC18073 = EnumC18072.CONTINUE;
        EnumC18072 enumC18074 = EnumC18072.TERMINATE;
        return true;
    }

    public final String toString() {
        return f10492;
    }
}
