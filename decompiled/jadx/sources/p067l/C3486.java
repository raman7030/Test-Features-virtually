package p067l;

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
public final class C3486 extends LinkedHashSet {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C23603 f6993;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f6994 = false;

    /* JADX INFO: renamed from: ᩸ */
    public final transient HashSet f6995 = new HashSet();

    /* JADX INFO: renamed from: ᩹ */
    public transient InterfaceC22097 f6996 = null;

    public C3486(C23603 c23603) {
        this.f6993 = c23603;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m6227() {
        this.f6994 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6224(InterfaceC22097 interfaceC22097) {
        this.f6996 = interfaceC22097;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6223(String str, boolean z) {
        boolean z2 = this.f6994;
        this.f6994 = true;
        if (str != null) {
            try {
                Iterator it = C23603.m52414(this.f6993, str).iterator();
                while (it.hasNext()) {
                    m6220((InterfaceC22097) it.next(), z);
                }
            } catch (Throwable th) {
                this.f6994 = z2;
                throw th;
            }
        }
        this.f6994 = z2;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m6220(InterfaceC22097 interfaceC22097, final boolean z) {
        boolean zIsDirectory = C18743.isDirectory(interfaceC22097, new EnumC16060[0]);
        final C23603 c23603 = this.f6993;
        if (!zIsDirectory) {
            if (z) {
                C23623 c23623 = c23603.f75137;
                EnumC21706 enumC21706 = EnumC21706.PATH;
                C12895 c12895 = C15675.f45417;
                c23623.m9361(enumC21706, new C12895("compiler", "dir.path.element.not.found", interfaceC22097));
                return;
            }
            return;
        }
        try {
            InterfaceC19157 list = C18743.list(interfaceC22097);
            try {
                list.filter(new Predicate() { // from class: l.֡ܳ۠
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C20697.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo55838negate() {
                        return C20697.$default$negate(this);
                    }

                    /* JADX INFO: renamed from: or */
                    public /* synthetic */ Predicate m4454or(Predicate predicate) {
                        return C20697.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return C23603.m52419(c23603, (InterfaceC22097) obj);
                    }
                }).forEach(new Consumer() { // from class: l.ۚܳ۠
                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return C24719.$default$andThen(this, consumer);
                    }

                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void m45213n(Object obj) {
                        boolean z2 = z;
                        this.f19727.m6225((InterfaceC22097) obj, z2);
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

    /* JADX INFO: renamed from: ۧ */
    public final void m6226(String str, boolean z) {
        if (str != null) {
            m6221(this.f6993.m52413(str, this.f6996), z);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6222(String str) {
        m6226(str, this.f6993.f75136);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6221(Iterable iterable, boolean z) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                m6225((InterfaceC22097) it.next(), z);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6225(InterfaceC22097 interfaceC22097, boolean z) {
        if (contains(interfaceC22097)) {
            return;
        }
        C23603 c23603 = this.f6993;
        if (!c23603.f75135.mo10412(interfaceC22097)) {
            if (z) {
                C23623 c23623 = c23603.f75137;
                EnumC21706 enumC21706 = EnumC21706.PATH;
                C12895 c12895 = C15675.f45417;
                c23623.m9361(enumC21706, new C12895("compiler", "path.element.not.found", interfaceC22097));
            }
            add(interfaceC22097);
            return;
        }
        InterfaceC22097 interfaceC22097Mo10413 = c23603.f75135.mo10413(interfaceC22097);
        HashSet hashSet = this.f6995;
        if (hashSet.contains(interfaceC22097Mo10413)) {
            return;
        }
        if (c23603.f75135.mo10415(interfaceC22097) && !interfaceC22097.getFileName().toString().endsWith(".jmod") && !interfaceC22097.endsWith("modules")) {
            if (!C23603.m52419(c23603, interfaceC22097)) {
                try {
                    C3991.newFileSystem(interfaceC22097, (ClassLoader) null).close();
                    if (z) {
                        C23623 c23624 = c23603.f75137;
                        EnumC21706 enumC21707 = EnumC21706.PATH;
                        C12895 c12896 = C15675.f45417;
                        c23624.m9361(enumC21707, new C12895("compiler", "unexpected.archive.file", interfaceC22097));
                    }
                } catch (IOException | ProviderNotFoundException unused) {
                    if (z) {
                        C23623 c23625 = c23603.f75137;
                        EnumC21706 enumC21708 = EnumC21706.PATH;
                        C12895 c12897 = C15675.f45417;
                        c23625.m9361(enumC21708, new C12895("compiler", "invalid.archive.file", interfaceC22097));
                        return;
                    }
                    return;
                }
            } else if (c23603.f75135.m10411() == null) {
                C23623 c23626 = c23603.f75137;
                C14040 c14040 = C8300.f21997;
                c23626.m9355(new C14040("compiler", "no.zipfs.for.archive", interfaceC22097));
                return;
            }
        }
        add(interfaceC22097);
        hashSet.add(interfaceC22097Mo10413);
        if (this.f6994 && c23603.f75135.mo10415(interfaceC22097) && !interfaceC22097.endsWith("modules")) {
            try {
                Iterator it = c23603.f75135.mo10414(interfaceC22097).iterator();
                while (it.hasNext()) {
                    m6225((InterfaceC22097) it.next(), z);
                }
            } catch (IOException e) {
                C23623 c23627 = c23603.f75137;
                int i = C13625.f38343;
                String localizedMessage = e.getLocalizedMessage();
                if (localizedMessage == null && (localizedMessage = e.getMessage()) == null) {
                    localizedMessage = e.toString();
                }
                C14040 c14041 = C8300.f21997;
                c23627.m9355(new C14040("compiler", "error.reading.file", interfaceC22097, localizedMessage));
            }
        }
    }
}
