package p067l;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15635 extends AbstractC12875 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f44740;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4317 f44741;

    /* JADX INFO: renamed from: ܽ */
    public final EnumSet f44742;

    public AbstractC15635(InterfaceC4317 interfaceC4317, EnumC2483... enumC2483Arr) {
        EnumSet enumSetCopyOf;
        this.f44741 = interfaceC4317;
        if (enumC2483Arr.length == 0) {
            enumSetCopyOf = EnumSet.noneOf(EnumC2483.class);
        } else {
            enumSetCopyOf = EnumSet.copyOf((Collection) Arrays.asList(enumC2483Arr));
        }
        this.f44742 = enumSetCopyOf;
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public void mo25023(Iterable iterable, String str) {
        throw new UnsupportedOperationException("not supported for " + this.f44741);
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC22097 m35524(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new IllegalArgumentException("empty path for directory");
        }
        InterfaceC22097 interfaceC22097 = (InterfaceC22097) it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("path too long for directory");
        }
        m35525(interfaceC22097);
        return interfaceC22097;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m35525(InterfaceC22097 interfaceC22097) {
        C12826.requireNonNull(interfaceC22097);
        if (!C18743.exists(interfaceC22097, new EnumC16060[0])) {
            throw new FileNotFoundException(interfaceC22097 + ": does not exist");
        }
        if (C18743.isDirectory(interfaceC22097, new EnumC16060[0])) {
            return;
        }
        throw new IOException(interfaceC22097 + ": not a directory");
    }
}
