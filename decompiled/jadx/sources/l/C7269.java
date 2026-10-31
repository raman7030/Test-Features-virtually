package l;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.۟ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7269 implements InterfaceC16728 {
    public static final Set b;
    public final InterfaceC20758 a;

    @Override // l.InterfaceC22873
    public final String name() {
        return "basic";
    }

    @Override // l.InterfaceC16728
    public final InterfaceC15111 readAttributes() {
        boolean z;
        InterfaceC20758 interfaceC20758 = this.a;
        interfaceC20758.getFileSystem().provider().checkAccess(interfaceC20758, new EnumC11379[0]);
        File file = interfaceC20758.toFile();
        C4529 c4529From = C4529.from(file.lastModified(), TimeUnit.MILLISECONDS);
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        try {
            File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
            z = !file2.getCanonicalFile().equals(file2.getAbsoluteFile());
        } catch (IOException unused) {
            z = false;
        }
        return new C1500(c4529From, c4529From, c4529From, zIsFile, zIsDirectory, z, (zIsFile || zIsDirectory || z) ? false : true, file.length(), Integer.valueOf(file.hashCode()));
    }

    @Override // l.InterfaceC16728
    public final void a(C4529 c4529, C4529 c45210, C4529 c45211) {
        if (c4529 == null && c45210 == null) {
            return;
        }
        InterfaceC20758 interfaceC20758 = this.a;
        interfaceC20758.getFileSystem().provider().checkAccess(interfaceC20758, EnumC11379.WRITE);
        if (interfaceC20758.toFile().setLastModified(c4529.to(TimeUnit.MILLISECONDS))) {
            return;
        }
        throw new IOException("File.setLastModified did not succeed on " + interfaceC20758);
    }

    static {
        String[] strArr = {"size", "creationTime", "lastAccessTime", "lastModifiedTime", "fileKey", "isDirectory", "isRegularFile", "isSymbolicLink", "isOther"};
        Charset charset = AbstractC3617.a;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 9; i++) {
            hashSet.add(strArr[i]);
        }
        b = hashSet;
    }

    public C7269(InterfaceC20758 interfaceC20758) {
        this.a = interfaceC20758;
    }
}
