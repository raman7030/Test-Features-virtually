package l;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.ProviderNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes5.dex */
public final class C21638 extends AbstractC13959 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC20758 f69464;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC20758 f69465;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C3999 f69466;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22343 f69467;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21638(C22343 c22343) {
        super(EnumC21101.SYSTEM_MODULES, EnumC0121.f1203);
        this.f69467 = c22343;
        this.f69464 = C22343.f72402;
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20401(EnumC0121 enumC0121, String str) {
        if (!this.f41662.contains(enumC0121)) {
            return false;
        }
        this.f41660 = true;
        if (str == null) {
            this.f69464 = C22343.f72402;
        } else if (str.equals("none")) {
            this.f69464 = null;
        } else {
            m48902(this.f69467.m50086(str, new String[0]));
        }
        this.f69465 = null;
        return true;
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ܽ */
    public final Collection mo6225() {
        InterfaceC20758 interfaceC20758 = this.f69464;
        if (interfaceC20758 == null) {
            return null;
        }
        return Collections.singleton(interfaceC20758);
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public final void mo20400(Iterable iterable) {
        if (iterable == null) {
            this.f69464 = null;
        } else {
            this.f41660 = true;
            m48902(AbstractC13959.m33405(iterable));
        }
    }

    @Override // l.AbstractC13959, l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public final void mo23049(Iterable iterable, String str) throws IOException {
        C11003.requireNonNull(iterable);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC20758 interfaceC20758 = (InterfaceC20758) it.next();
            AbstractC13959.m33406(interfaceC20758);
            arrayList.add(interfaceC20758);
        }
        m48903();
        C16698 c16698M12046 = this.f69466.m12046(str);
        if (c16698M12046 == null) {
            this.f69466.m12048(new C16698(this.f69467, this, this.f41661.getName() + "[" + str + "]", str, arrayList, true));
        } else {
            c16698M12046.f51263 = arrayList;
            this.f69466.m12052(c16698M12046);
        }
        this.f41660 = true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m48902(InterfaceC20758 interfaceC20758) {
        try {
            if (!C17229.isSameFile(interfaceC20758, C22343.f72402) && !C17229.exists(interfaceC20758.resolve("lib").resolve("jrt-fs.jar"), new EnumC14406[0]) && !C17229.exists(this.f69464.resolve("modules"), new EnumC14406[0])) {
                throw new IllegalArgumentException(interfaceC20758.toString());
            }
            this.f69464 = interfaceC20758;
            this.f69465 = null;
        } catch (IOException e) {
            throw new IllegalArgumentException(interfaceC20758.toString(), e);
        }
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC2050 mo23048(String str) throws IOException {
        m48903();
        return this.f69466.m12046(str);
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC2050 mo23051(InterfaceC20758 interfaceC20758) throws IOException {
        m48903();
        return this.f69466.m12051(interfaceC20758);
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ܳ */
    public final Iterable mo23052() throws IOException {
        m48903();
        return Collections.singleton(this.f69466.m12054());
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20402(InterfaceC20758 interfaceC20758) throws IOException {
        m48903();
        return this.f69466.m12049(interfaceC20758);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m48903() throws IOException {
        InterfaceC20758 interfaceC20758Resolve;
        AbstractC7145 abstractC7145NewFileSystem;
        AbstractC7145 fileSystem;
        C22343 c22343 = this.f69467;
        ArrayList arrayList = c22343.f72403;
        if (this.f69466 != null) {
            return;
        }
        if (this.f69464 == null) {
            this.f69466 = new C3999(c22343);
            return;
        }
        if (this.f69465 == null) {
            try {
                try {
                    URI uriCreate = URI.create("jrt:/");
                    InterfaceC20758 interfaceC20758 = this.f69464;
                    try {
                        if (C17229.isSameFile(interfaceC20758, C22343.f72402)) {
                            fileSystem = C1707.getFileSystem(uriCreate);
                        } else {
                            try {
                                abstractC7145NewFileSystem = C1707.newFileSystem(uriCreate, Collections.singletonMap("java.home", this.f69464.toString()));
                            } catch (ProviderNotFoundException unused) {
                                URLClassLoader uRLClassLoader = new URLClassLoader(new URL[]{this.f69464.resolve("jrt-fs.jar").toUri().toURL()}, C22343.class.getClassLoader());
                                abstractC7145NewFileSystem = C1707.newFileSystem(uriCreate, Collections.EMPTY_MAP, uRLClassLoader);
                                arrayList.add(uRLClassLoader);
                            }
                            arrayList.add(abstractC7145NewFileSystem);
                            fileSystem = abstractC7145NewFileSystem;
                        }
                        this.f69465 = fileSystem.getPath("/modules", new String[0]);
                    } catch (IOException e) {
                        throw new IllegalArgumentException(interfaceC20758.toString(), e);
                    }
                } catch (ProviderNotFoundException e2) {
                    e = e2;
                    interfaceC20758Resolve = this.f69464.resolve("modules");
                    this.f69465 = interfaceC20758Resolve;
                    if (!C17229.exists(interfaceC20758Resolve, new EnumC14406[0])) {
                        throw new IOException("can't find system classes", e);
                    }
                }
            } catch (FileSystemNotFoundException e3) {
                e = e3;
                interfaceC20758Resolve = this.f69464.resolve("modules");
                this.f69465 = interfaceC20758Resolve;
                if (!C17229.exists(interfaceC20758Resolve, new EnumC14406[0])) {
                    throw new IOException("can't find system classes", e);
                }
            }
        }
        this.f69466 = new C3999(c22343);
        DirectoryStream<InterfaceC20758> directoryStreamNewDirectoryStream = C17229.newDirectoryStream(this.f69465, new C15286());
        try {
            for (InterfaceC20758 interfaceC20759 : directoryStreamNewDirectoryStream) {
                String string = interfaceC20759.getFileName().toString();
                this.f69466.m12048(new C16698(c22343, this, this.f41661.getName() + "[" + string + "]", string, Collections.singletonList(interfaceC20759), false));
            }
            directoryStreamNewDirectoryStream.close();
        } catch (Throwable th) {
            if (directoryStreamNewDirectoryStream != null) {
                try {
                    directoryStreamNewDirectoryStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
