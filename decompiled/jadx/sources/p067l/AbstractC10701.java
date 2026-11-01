package p067l;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۡۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 92JU */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10701 implements FileFilter, FilenameFilter, InterfaceC11368, InterfaceC19414 {

    /* JADX INFO: renamed from: ᩸ */
    public final EnumC18072 f29643;

    /* JADX INFO: renamed from: ᩹ */
    public final EnumC18072 f29644;

    @Override // java.io.FileFilter
    public abstract boolean accept(File file);

    /* JADX INFO: renamed from: ֫ */
    public abstract EnumC18072 mo24626(InterfaceC22097 interfaceC22097);

    @Override // p067l.InterfaceC19414
    public final EnumC18072 postVisitDirectory(Object obj, IOException iOException) {
        return EnumC18072.CONTINUE;
    }

    @Override // p067l.InterfaceC19414
    public final EnumC18072 preVisitDirectory(Object obj, InterfaceC16730 interfaceC16730) {
        return mo24626((InterfaceC22097) obj);
    }

    @Override // p067l.InterfaceC19414
    public final EnumC18072 visitFile(Object obj, InterfaceC16730 interfaceC16730) {
        return mo24626((InterfaceC22097) obj);
    }

    @Override // p067l.InterfaceC19414
    public final EnumC18072 visitFileFailed(Object obj, IOException iOException) {
        return EnumC18072.CONTINUE;
    }

    public AbstractC10701(EnumC18072 enumC18072, EnumC18072 enumC18073) {
        this.f29643 = enumC18072;
        this.f29644 = enumC18073;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        C12826.requireNonNull(str, "name");
        return accept(new File(file, str));
    }

    @Override // p067l.InterfaceC11368
    public final boolean matches(InterfaceC22097 interfaceC22097) {
        return ((C17405) this).mo24626(interfaceC22097) != EnumC18072.TERMINATE;
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC18072 m24627(boolean z) {
        return z ? this.f29643 : this.f29644;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
