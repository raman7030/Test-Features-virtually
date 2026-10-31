package l;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۡۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 92JU */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8768 implements FileFilter, FilenameFilter, InterfaceC9469, InterfaceC17935 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC16523 f26717;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC16523 f26718;

    @Override // java.io.FileFilter
    public abstract boolean accept(File file);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract EnumC16523 mo22656(InterfaceC20758 interfaceC20758);

    @Override // l.InterfaceC17935
    public final EnumC16523 postVisitDirectory(Object obj, IOException iOException) {
        return EnumC16523.CONTINUE;
    }

    @Override // l.InterfaceC17935
    public final EnumC16523 preVisitDirectory(Object obj, InterfaceC15111 interfaceC15111) {
        return mo22656((InterfaceC20758) obj);
    }

    @Override // l.InterfaceC17935
    public final EnumC16523 visitFile(Object obj, InterfaceC15111 interfaceC15111) {
        return mo22656((InterfaceC20758) obj);
    }

    @Override // l.InterfaceC17935
    public final EnumC16523 visitFileFailed(Object obj, IOException iOException) {
        return EnumC16523.CONTINUE;
    }

    public AbstractC8768(EnumC16523 enumC16523, EnumC16523 enumC16524) {
        this.f26717 = enumC16523;
        this.f26718 = enumC16524;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        C11003.requireNonNull(str, "name");
        return accept(new File(file, str));
    }

    @Override // l.InterfaceC9469
    public final boolean matches(InterfaceC20758 interfaceC20758) {
        return ((C15822) this).mo22656(interfaceC20758) != EnumC16523.TERMINATE;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC16523 m22657(boolean z) {
        return z ? this.f26717 : this.f26718;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
