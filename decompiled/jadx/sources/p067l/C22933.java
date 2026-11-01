package p067l;

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
public final class C22933 extends AbstractC15635 {

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC22097 f72167;

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC22097 f72168;

    /* JADX INFO: renamed from: ᩳ */
    public C6169 f72169;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C23603 f72170;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22933(C23603 c23603) {
        super(EnumC22423.SYSTEM_MODULES, EnumC2483.f3979);
        this.f72170 = c23603;
        this.f72167 = C23603.f75128;
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22380(EnumC2483 enumC2483, String str) {
        if (!this.f44742.contains(enumC2483)) {
            return false;
        }
        this.f44740 = true;
        if (str == null) {
            this.f72167 = C23603.f75128;
        } else if (str.equals("none")) {
            this.f72167 = null;
        } else {
            m51250(this.f72170.m52425(str, new String[0]));
        }
        this.f72168 = null;
        return true;
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ܽ */
    public final Collection mo8427() {
        InterfaceC22097 interfaceC22097 = this.f72167;
        if (interfaceC22097 == null) {
            return null;
        }
        return Collections.singleton(interfaceC22097);
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final void mo22379(Iterable iterable) {
        if (iterable == null) {
            this.f72167 = null;
        } else {
            this.f44740 = true;
            m51250(AbstractC15635.m35524(iterable));
        }
    }

    @Override // p067l.AbstractC15635, p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final void mo25023(Iterable iterable, String str) throws IOException {
        C12826.requireNonNull(iterable);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC22097 interfaceC22097 = (InterfaceC22097) it.next();
            AbstractC15635.m35525(interfaceC22097);
            arrayList.add(interfaceC22097);
        }
        m51251();
        C18238 c18238M13966 = this.f72169.m13966(str);
        if (c18238M13966 == null) {
            this.f72169.m13968(new C18238(this.f72170, this, this.f44741.getName() + "[" + str + "]", str, arrayList, true));
        } else {
            c18238M13966.f54448 = arrayList;
            this.f72169.m13972(c18238M13966);
        }
        this.f44740 = true;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m51250(InterfaceC22097 interfaceC22097) {
        try {
            if (!C18743.isSameFile(interfaceC22097, C23603.f75128) && !C18743.exists(interfaceC22097.resolve("lib").resolve("jrt-fs.jar"), new EnumC16060[0]) && !C18743.exists(this.f72167.resolve("modules"), new EnumC16060[0])) {
                throw new IllegalArgumentException(interfaceC22097.toString());
            }
            this.f72167 = interfaceC22097;
            this.f72168 = null;
        } catch (IOException e) {
            throw new IllegalArgumentException(interfaceC22097.toString(), e);
        }
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4317 mo25022(String str) throws IOException {
        m51251();
        return this.f72169.m13966(str);
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4317 mo25025(InterfaceC22097 interfaceC22097) throws IOException {
        m51251();
        return this.f72169.m13971(interfaceC22097);
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ܳ */
    public final Iterable mo25026() throws IOException {
        m51251();
        return Collections.singleton(this.f72169.m13974());
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22381(InterfaceC22097 interfaceC22097) throws IOException {
        m51251();
        return this.f72169.m13969(interfaceC22097);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX INFO: renamed from: ᩻ */
    private void m51251() throws IOException {
        InterfaceC22097 interfaceC22097Resolve;
        AbstractC9159 abstractC9159NewFileSystem;
        AbstractC9159 fileSystem;
        C23603 c23603 = this.f72170;
        ArrayList arrayList = c23603.f75129;
        if (this.f72169 != null) {
            return;
        }
        if (this.f72167 == null) {
            this.f72169 = new C6169(c23603);
            return;
        }
        if (this.f72168 == null) {
            try {
                try {
                    URI uriCreate = URI.create("jrt:/");
                    InterfaceC22097 interfaceC22097 = this.f72167;
                    try {
                        if (C18743.isSameFile(interfaceC22097, C23603.f75128)) {
                            fileSystem = C3991.getFileSystem(uriCreate);
                        } else {
                            try {
                                abstractC9159NewFileSystem = C3991.newFileSystem(uriCreate, Collections.singletonMap("java.home", this.f72167.toString()));
                            } catch (ProviderNotFoundException unused) {
                                URLClassLoader uRLClassLoader = new URLClassLoader(new URL[]{this.f72167.resolve("jrt-fs.jar").toUri().toURL()}, C23603.class.getClassLoader());
                                abstractC9159NewFileSystem = C3991.newFileSystem(uriCreate, Collections.EMPTY_MAP, uRLClassLoader);
                                arrayList.add(uRLClassLoader);
                            }
                            arrayList.add(abstractC9159NewFileSystem);
                            fileSystem = abstractC9159NewFileSystem;
                        }
                        this.f72168 = fileSystem.getPath("/modules", new String[0]);
                    } catch (IOException e) {
                        throw new IllegalArgumentException(interfaceC22097.toString(), e);
                    }
                } catch (ProviderNotFoundException e2) {
                    e = e2;
                    interfaceC22097Resolve = this.f72167.resolve("modules");
                    this.f72168 = interfaceC22097Resolve;
                    if (!C18743.exists(interfaceC22097Resolve, new EnumC16060[0])) {
                        throw new IOException("can't find system classes", e);
                    }
                }
            } catch (FileSystemNotFoundException e3) {
                e = e3;
                interfaceC22097Resolve = this.f72167.resolve("modules");
                this.f72168 = interfaceC22097Resolve;
                if (!C18743.exists(interfaceC22097Resolve, new EnumC16060[0])) {
                    throw new IOException("can't find system classes", e);
                }
            }
        }
        this.f72169 = new C6169(c23603);
        DirectoryStream<InterfaceC22097> directoryStreamNewDirectoryStream = C18743.newDirectoryStream(this.f72168, new C16896());
        try {
            for (InterfaceC22097 interfaceC22098 : directoryStreamNewDirectoryStream) {
                String string = interfaceC22098.getFileName().toString();
                this.f72169.m13968(new C18238(c23603, this, this.f44741.getName() + "[" + string + "]", string, Collections.singletonList(interfaceC22098), false));
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
