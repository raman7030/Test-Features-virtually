package l;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13959 extends AbstractC11055 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f41660;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2050 f41661;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumSet f41662;

    public AbstractC13959(InterfaceC2050 interfaceC2050, EnumC0121... enumC0121Arr) {
        EnumSet enumSetCopyOf;
        this.f41661 = interfaceC2050;
        if (enumC0121Arr.length == 0) {
            enumSetCopyOf = EnumSet.noneOf(EnumC0121.class);
        } else {
            enumSetCopyOf = EnumSet.copyOf((Collection) Arrays.asList(enumC0121Arr));
        }
        this.f41662 = enumSetCopyOf;
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public void mo23049(Iterable iterable, String str) {
        throw new UnsupportedOperationException("not supported for " + this.f41661);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC20758 m33405(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new IllegalArgumentException("empty path for directory");
        }
        InterfaceC20758 interfaceC20758 = (InterfaceC20758) it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("path too long for directory");
        }
        m33406(interfaceC20758);
        return interfaceC20758;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m33406(InterfaceC20758 interfaceC20758) {
        C11003.requireNonNull(interfaceC20758);
        if (!C17229.exists(interfaceC20758, new EnumC14406[0])) {
            throw new FileNotFoundException(interfaceC20758 + ": does not exist");
        }
        if (C17229.isDirectory(interfaceC20758, new EnumC14406[0])) {
            return;
        }
        throw new IOException(interfaceC20758 + ": not a directory");
    }
}
