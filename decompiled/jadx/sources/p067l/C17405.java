package p067l;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܺۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P7IE */
/* JADX INFO: loaded from: classes5.dex */
public final class C17405 extends AbstractC10701 implements Serializable {
    public static final long serialVersionUID = 1;

    public C17405(int i) {
        super(EnumC18072.TERMINATE, EnumC18072.CONTINUE);
    }

    static {
        new C17405(EnumC18072.CONTINUE, EnumC18072.TERMINATE);
    }

    @Override // p067l.AbstractC10701, java.io.FileFilter
    public final boolean accept(File file) {
        return C18743.isSymbolicLink(C9829.toPath(file));
    }

    @Override // p067l.AbstractC10701
    /* JADX INFO: renamed from: ֫ */
    public final EnumC18072 mo24626(InterfaceC22097 interfaceC22097) {
        return m24627(C18743.isSymbolicLink(interfaceC22097));
    }
}
