package l;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܺۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P7IE */
/* JADX INFO: loaded from: classes5.dex */
public final class C15822 extends AbstractC8768 implements Serializable {
    public static final long serialVersionUID = 1;

    public C15822(int i) {
        super(EnumC16523.TERMINATE, EnumC16523.CONTINUE);
    }

    static {
        new C15822(EnumC16523.CONTINUE, EnumC16523.TERMINATE);
    }

    @Override // l.AbstractC8768, java.io.FileFilter
    public final boolean accept(File file) {
        return C17229.isSymbolicLink(C7850.toPath(file));
    }

    @Override // l.AbstractC8768
    /* JADX INFO: renamed from: ֫ */
    public final EnumC16523 mo22656(InterfaceC20758 interfaceC20758) {
        return m22657(C17229.isSymbolicLink(interfaceC20758));
    }
}
