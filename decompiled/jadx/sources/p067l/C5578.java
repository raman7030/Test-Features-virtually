package p067l;

import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۗܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes2.dex */
public final class C5578 implements InterfaceC6919 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC22097 f13480;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C13625 f13481;

    @Override // p067l.InterfaceC6919
    public final void close() {
    }

    @Override // p067l.InterfaceC6919
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6362() {
        return false;
    }

    public C5578(C13625 c13625, InterfaceC22097 interfaceC22097) {
        this.f13481 = c13625;
        this.f13480 = interfaceC22097;
    }

    @Override // p067l.InterfaceC6919
    /* JADX INFO: renamed from: ֫ */
    public final void mo6361(InterfaceC22097 interfaceC22097, C12204 c12204, Set set, boolean z, C20271 c20271) throws IOException {
        InterfaceC22097 interfaceC22098 = this.f13480;
        try {
            InterfaceC22097 interfaceC22097M30833 = c12204.m30833(interfaceC22097);
            if (C18743.exists(interfaceC22097M30833, new EnumC16060[0])) {
                C13625 c13625 = this.f13481;
                if (C13625.m30975(c13625, interfaceC22097M30833, c12204)) {
                    InterfaceC19157 list = C18743.list(interfaceC22097M30833);
                    try {
                        EnumC8260 enumC8260 = c13625.f38346;
                        List<InterfaceC22097> list2 = (enumC8260 == null ? list : list.sorted(enumC8260)).toList();
                        if (list != null) {
                            list.close();
                        }
                        for (InterfaceC22097 interfaceC22099 : list2) {
                            String string = interfaceC22099.getFileName().toString();
                            if (string.endsWith("/")) {
                                string = C17073.m38720(1, 0, string);
                            }
                            if (C18743.isDirectory(interfaceC22099, new EnumC16060[0])) {
                                if (z && EnumC5698.m12682(string)) {
                                    mo6361(interfaceC22097, new C12204(C10965.m25286(new StringBuilder(), c12204.f38099, string)), set, z, c20271);
                                }
                            } else if (set.contains(AbstractC22343.m50160(string))) {
                                try {
                                    C8180 c8180 = new C8180(c12204, string);
                                    InterfaceC22097 interfaceC22097M30834 = c8180.m30833(interfaceC22098);
                                    int i = AbstractC14215.f40494;
                                    c20271.m45777(new C6839(c13625, interfaceC22097M30834, interfaceC22097, c8180, 0));
                                } catch (InvalidPathException e) {
                                    throw new IOException("error accessing directory " + interfaceC22098 + e);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        if (list == null) {
                            throw th;
                        }
                        try {
                            list.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
            }
        } catch (IOException | InvalidPathException unused) {
        }
    }

    @Override // p067l.InterfaceC6919
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19740 mo6360(InterfaceC22097 interfaceC22097, C8180 c8180) {
        try {
            InterfaceC22097 interfaceC22097M30833 = c8180.m30833(interfaceC22097);
            if (!C18743.exists(interfaceC22097M30833, new EnumC16060[0])) {
                return null;
            }
            C13625 c13625 = this.f13481;
            InterfaceC22097 interfaceC22097Mo10413 = c13625.f38345.mo10413(interfaceC22097M30833);
            int i = AbstractC14215.f40494;
            return new C14885(c13625, interfaceC22097Mo10413, interfaceC22097M30833, 0);
        } catch (InvalidPathException unused) {
            return null;
        }
    }

    @Override // p067l.InterfaceC6919
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo6359() {
        return C4848.m10283();
    }
}
