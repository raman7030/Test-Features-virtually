package p067l;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.۟ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9277 implements InterfaceC18267 {

    /* JADX INFO: renamed from: b */
    public static final Set f25229b;

    /* JADX INFO: renamed from: a */
    public final InterfaceC22097 f25230a;

    @Override // p067l.InterfaceC24107
    public final String name() {
        return "basic";
    }

    @Override // p067l.InterfaceC18267
    public final InterfaceC16730 readAttributes() {
        boolean z;
        InterfaceC22097 interfaceC22097 = this.f25230a;
        interfaceC22097.getFileSystem().provider().checkAccess(interfaceC22097, new EnumC13183[0]);
        File file = interfaceC22097.toFile();
        C6673 c6673From = C6673.from(file.lastModified(), TimeUnit.MILLISECONDS);
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        try {
            File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
            z = !file2.getCanonicalFile().equals(file2.getAbsoluteFile());
        } catch (IOException unused) {
            z = false;
        }
        return new C3794(c6673From, c6673From, c6673From, zIsFile, zIsDirectory, z, (zIsFile || zIsDirectory || z) ? false : true, file.length(), Integer.valueOf(file.hashCode()));
    }

    @Override // p067l.InterfaceC18267
    /* JADX INFO: renamed from: a */
    public final void mo21481a(C6673 c6673, C6673 c6674, C6673 c6675) {
        if (c6673 == null && c6674 == null) {
            return;
        }
        InterfaceC22097 interfaceC22097 = this.f25230a;
        interfaceC22097.getFileSystem().provider().checkAccess(interfaceC22097, EnumC13183.WRITE);
        if (interfaceC22097.toFile().setLastModified(c6673.m15191to(TimeUnit.MILLISECONDS))) {
            return;
        }
        throw new IOException("File.setLastModified did not succeed on " + interfaceC22097);
    }

    static {
        String[] strArr = {"size", "creationTime", "lastAccessTime", "lastModifiedTime", "fileKey", "isDirectory", "isRegularFile", "isSymbolicLink", "isOther"};
        Charset charset = AbstractC5806.f14267a;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 9; i++) {
            hashSet.add(strArr[i]);
        }
        f25229b = hashSet;
    }

    public C9277(InterfaceC22097 interfaceC22097) {
        this.f25230a = interfaceC22097;
    }
}
