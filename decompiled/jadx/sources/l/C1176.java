package l;

import java.io.IOException;
import java.nio.file.ProviderNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֨ܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes2.dex */
public final class C1176 extends LinkedHashSet {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22343 f4224;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f4225 = false;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final transient HashSet f4226 = new HashSet();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient InterfaceC20758 f4227 = null;

    public C1176(C22343 c22343) {
        this.f4224 = c22343;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m3985() {
        this.f4225 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3982(InterfaceC20758 interfaceC20758) {
        this.f4227 = interfaceC20758;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3981(String str, boolean z) {
        boolean z2 = this.f4225;
        this.f4225 = true;
        if (str != null) {
            try {
                Iterator it = C22343.m50075(this.f4224, str).iterator();
                while (it.hasNext()) {
                    m3978((InterfaceC20758) it.next(), z);
                }
            } catch (Throwable th) {
                this.f4225 = z2;
                throw th;
            }
        }
        this.f4225 = z2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m3978(InterfaceC20758 interfaceC20758, final boolean z) {
        boolean zIsDirectory = C17229.isDirectory(interfaceC20758, new EnumC14406[0]);
        final C22343 c22343 = this.f4224;
        if (!zIsDirectory) {
            if (z) {
                C22364 c22364 = c22343.f72411;
                EnumC20347 enumC20347 = EnumC20347.PATH;
                C11076 c11076 = C14001.f42334;
                c22364.m7282(enumC20347, new C11076("compiler", "dir.path.element.not.found", interfaceC20758));
                return;
            }
            return;
        }
        try {
            InterfaceC17664 list = C17229.list(interfaceC20758);
            try {
                list.filter(new Predicate() { // from class: l.֡ܳ۠
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C19285.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo4928negate() {
                        return C19285.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C19285.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return C22343.m50080(c22343, (InterfaceC20758) obj);
                    }
                }).forEach(new Consumer() { // from class: l.ۚܳ۠
                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return C23517.$default$andThen(this, consumer);
                    }

                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void n(Object obj) {
                        boolean z2 = z;
                        this.f16889.m3983((InterfaceC20758) obj, z2);
                    }
                });
                list.close();
            } catch (Throwable th) {
                if (list != null) {
                    try {
                        list.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3984(String str, boolean z) {
        if (str != null) {
            m3979(this.f4224.m50074(str, this.f4227), z);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3980(String str) {
        m3984(str, this.f4224.f72410);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3979(Iterable iterable, boolean z) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                m3983((InterfaceC20758) it.next(), z);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3983(InterfaceC20758 interfaceC20758, boolean z) {
        if (contains(interfaceC20758)) {
            return;
        }
        C22343 c22343 = this.f4224;
        if (!c22343.f72409.mo8366(interfaceC20758)) {
            if (z) {
                C22364 c22364 = c22343.f72411;
                EnumC20347 enumC20347 = EnumC20347.PATH;
                C11076 c11076 = C14001.f42334;
                c22364.m7282(enumC20347, new C11076("compiler", "path.element.not.found", interfaceC20758));
            }
            add(interfaceC20758);
            return;
        }
        InterfaceC20758 interfaceC20758Mo8367 = c22343.f72409.mo8367(interfaceC20758);
        HashSet hashSet = this.f4226;
        if (hashSet.contains(interfaceC20758Mo8367)) {
            return;
        }
        if (c22343.f72409.mo8369(interfaceC20758) && !interfaceC20758.getFileName().toString().endsWith(".jmod") && !interfaceC20758.endsWith("modules")) {
            if (!C22343.m50080(c22343, interfaceC20758)) {
                try {
                    C1707.newFileSystem(interfaceC20758, (ClassLoader) null).close();
                    if (z) {
                        C22364 c22365 = c22343.f72411;
                        EnumC20347 enumC20348 = EnumC20347.PATH;
                        C11076 c11077 = C14001.f42334;
                        c22365.m7282(enumC20348, new C11076("compiler", "unexpected.archive.file", interfaceC20758));
                    }
                } catch (IOException | ProviderNotFoundException unused) {
                    if (z) {
                        C22364 c22366 = c22343.f72411;
                        EnumC20347 enumC20349 = EnumC20347.PATH;
                        C11076 c11078 = C14001.f42334;
                        c22366.m7282(enumC20349, new C11076("compiler", "invalid.archive.file", interfaceC20758));
                        return;
                    }
                    return;
                }
            } else if (c22343.f72409.m8365() == null) {
                C22364 c22367 = c22343.f72411;
                C12281 c12281 = C6241.f19132;
                c22367.m7276(new C12281("compiler", "no.zipfs.for.archive", interfaceC20758));
                return;
            }
        }
        add(interfaceC20758);
        hashSet.add(interfaceC20758Mo8367);
        if (this.f4225 && c22343.f72409.mo8369(interfaceC20758) && !interfaceC20758.endsWith("modules")) {
            try {
                Iterator it = c22343.f72409.mo8368(interfaceC20758).iterator();
                while (it.hasNext()) {
                    m3983((InterfaceC20758) it.next(), z);
                }
            } catch (IOException e) {
                C22364 c22368 = c22343.f72411;
                int i = C11844.f35338;
                String localizedMessage = e.getLocalizedMessage();
                if (localizedMessage == null && (localizedMessage = e.getMessage()) == null) {
                    localizedMessage = e.toString();
                }
                C12281 c12282 = C6241.f19132;
                c22368.m7276(new C12281("compiler", "error.reading.file", interfaceC20758, localizedMessage));
            }
        }
    }
}
