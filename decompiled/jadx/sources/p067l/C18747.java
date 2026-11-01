package p067l;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7JO */
/* JADX INFO: loaded from: classes5.dex */
public final class C18747 extends C18076 {

    /* JADX INFO: renamed from: ۤ */
    public final String[] f56034;

    /* JADX INFO: renamed from: ۫ */
    public final boolean f56035;

    /* JADX INFO: renamed from: ۬ */
    public final EnumC16060[] f56036;

    @Override // p067l.C17401, p067l.InterfaceC19414
    public final /* bridge */ /* synthetic */ EnumC18072 postVisitDirectory(Object obj, IOException iOException) throws IOException {
        mo41133((InterfaceC22097) obj, iOException);
        return EnumC18072.CONTINUE;
    }

    @Override // p067l.C17401, p067l.InterfaceC19414
    public final EnumC18072 visitFile(Object obj, InterfaceC16730 interfaceC16730) throws IOException {
        InterfaceC22097 interfaceC22097 = (InterfaceC22097) obj;
        InterfaceC19418[] interfaceC19418Arr = C16064.f47266;
        InterfaceC22097 fileName = interfaceC22097 != null ? interfaceC22097.getFileName() : null;
        if (Arrays.binarySearch(this.f56034, fileName != null ? fileName.toString() : null) < 0) {
            EnumC16060[] enumC16060Arr = this.f56036;
            if (C18743.exists(interfaceC22097, enumC16060Arr)) {
                if (this.f56035) {
                    C16064.m36571(interfaceC22097, enumC16060Arr);
                }
                C18743.deleteIfExists(interfaceC22097);
            }
            if (C18743.isSymbolicLink(interfaceC22097)) {
                try {
                    C18743.delete(interfaceC22097);
                } catch (NoSuchFileException unused) {
                }
            }
        }
        m41132(interfaceC16730);
        EnumC18072 enumC18072 = EnumC18072.CONTINUE;
        return EnumC18072.CONTINUE;
    }

    @Override // p067l.C18076
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || C18747.class != obj.getClass()) {
            return false;
        }
        C18747 c18747 = (C18747) obj;
        return this.f56035 == c18747.f56035 && Arrays.equals(this.f56034, c18747.f56034);
    }

    @Override // p067l.C18076
    public final int hashCode() {
        return C12826.hash(Boolean.valueOf(this.f56035)) + (((super.hashCode() * 31) + Arrays.hashCode(this.f56034)) * 31);
    }

    @Override // p067l.C18076
    /* JADX INFO: renamed from: ֫ */
    public final void mo41133(InterfaceC22097 interfaceC22097, IOException iOException) throws IOException {
        InterfaceC19418[] interfaceC19418Arr = C16064.f47266;
        DirectoryStream directoryStreamNewDirectoryStream = C18743.newDirectoryStream(interfaceC22097);
        try {
            boolean zHasNext = directoryStreamNewDirectoryStream.iterator().hasNext();
            directoryStreamNewDirectoryStream.close();
            if (!zHasNext) {
                C18743.deleteIfExists(interfaceC22097);
            }
            super.mo41133(interfaceC22097, iOException);
            EnumC18072 enumC18072 = EnumC18072.CONTINUE;
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

    @Override // p067l.C17401, p067l.InterfaceC19414
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final EnumC18072 preVisitDirectory(InterfaceC22097 interfaceC22097, InterfaceC16730 interfaceC16730) {
        super.preVisitDirectory(interfaceC22097, interfaceC16730);
        InterfaceC19418[] interfaceC19418Arr = C16064.f47266;
        InterfaceC22097 fileName = interfaceC22097 != null ? interfaceC22097.getFileName() : null;
        return Arrays.binarySearch(this.f56034, fileName != null ? fileName.toString() : null) < 0 ? EnumC18072.CONTINUE : EnumC18072.SKIP_SUBTREE;
    }

    public C18747(InterfaceC15413 interfaceC15413, EnumC16060[] enumC16060Arr, InterfaceC19418[] interfaceC19418Arr, String... strArr) {
        EnumC16060[] enumC16060Arr2;
        C12713 c12713 = new C12713();
        c12713.m7953(interfaceC15413);
        super(c12713);
        String[] strArr2 = (String[]) strArr.clone();
        Arrays.sort(strArr2);
        this.f56034 = strArr2;
        this.f56035 = EnumC11372.m26325(interfaceC19418Arr);
        if (enumC16060Arr != null) {
            enumC16060Arr2 = (EnumC16060[]) enumC16060Arr.clone();
        } else {
            enumC16060Arr2 = (EnumC16060[]) C16064.f47270.clone();
        }
        this.f56036 = enumC16060Arr2;
    }
}
