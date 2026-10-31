package l;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7JO */
/* JADX INFO: loaded from: classes5.dex */
public final class C17234 extends C16528 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String[] f52851;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f52852;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final EnumC14406[] f52853;

    @Override // l.C15817, l.InterfaceC17935
    public final /* bridge */ /* synthetic */ EnumC16523 postVisitDirectory(Object obj, IOException iOException) throws IOException {
        mo38907((InterfaceC20758) obj, iOException);
        return EnumC16523.CONTINUE;
    }

    @Override // l.C15817, l.InterfaceC17935
    public final EnumC16523 visitFile(Object obj, InterfaceC15111 interfaceC15111) throws IOException {
        InterfaceC20758 interfaceC20758 = (InterfaceC20758) obj;
        InterfaceC17940[] interfaceC17940Arr = C14411.f44172;
        InterfaceC20758 fileName = interfaceC20758 != null ? interfaceC20758.getFileName() : null;
        if (Arrays.binarySearch(this.f52851, fileName != null ? fileName.toString() : null) < 0) {
            EnumC14406[] enumC14406Arr = this.f52853;
            if (C17229.exists(interfaceC20758, enumC14406Arr)) {
                if (this.f52852) {
                    C14411.m34438(interfaceC20758, enumC14406Arr);
                }
                C17229.deleteIfExists(interfaceC20758);
            }
            if (C17229.isSymbolicLink(interfaceC20758)) {
                try {
                    C17229.delete(interfaceC20758);
                } catch (NoSuchFileException unused) {
                }
            }
        }
        m38906(interfaceC15111);
        EnumC16523 enumC16523 = EnumC16523.CONTINUE;
        return EnumC16523.CONTINUE;
    }

    @Override // l.C16528
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || C17234.class != obj.getClass()) {
            return false;
        }
        C17234 c17234 = (C17234) obj;
        return this.f52852 == c17234.f52852 && Arrays.equals(this.f52851, c17234.f52851);
    }

    @Override // l.C16528
    public final int hashCode() {
        return C11003.hash(Boolean.valueOf(this.f52852)) + (((super.hashCode() * 31) + Arrays.hashCode(this.f52851)) * 31);
    }

    @Override // l.C16528
    /* JADX INFO: renamed from: ֫ */
    public final void mo38907(InterfaceC20758 interfaceC20758, IOException iOException) throws IOException {
        InterfaceC17940[] interfaceC17940Arr = C14411.f44172;
        DirectoryStream directoryStreamNewDirectoryStream = C17229.newDirectoryStream(interfaceC20758);
        try {
            boolean zHasNext = directoryStreamNewDirectoryStream.iterator().hasNext();
            directoryStreamNewDirectoryStream.close();
            if (!zHasNext) {
                C17229.deleteIfExists(interfaceC20758);
            }
            super.mo38907(interfaceC20758, iOException);
            EnumC16523 enumC16523 = EnumC16523.CONTINUE;
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

    @Override // l.C15817, l.InterfaceC17935
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final EnumC16523 preVisitDirectory(InterfaceC20758 interfaceC20758, InterfaceC15111 interfaceC15111) {
        super.preVisitDirectory(interfaceC20758, interfaceC15111);
        InterfaceC17940[] interfaceC17940Arr = C14411.f44172;
        InterfaceC20758 fileName = interfaceC20758 != null ? interfaceC20758.getFileName() : null;
        return Arrays.binarySearch(this.f52851, fileName != null ? fileName.toString() : null) < 0 ? EnumC16523.CONTINUE : EnumC16523.SKIP_SUBTREE;
    }

    public C17234(InterfaceC13726 interfaceC13726, EnumC14406[] enumC14406Arr, InterfaceC17940[] interfaceC17940Arr, String... strArr) {
        EnumC14406[] enumC14406Arr2;
        C10885 c10885 = new C10885();
        c10885.m5743(interfaceC13726);
        super(c10885);
        String[] strArr2 = (String[]) strArr.clone();
        Arrays.sort(strArr2);
        this.f52851 = strArr2;
        this.f52852 = EnumC9474.m24315(interfaceC17940Arr);
        if (enumC14406Arr != null) {
            enumC14406Arr2 = (EnumC14406[]) enumC14406Arr.clone();
        } else {
            enumC14406Arr2 = (EnumC14406[]) C14411.f44176.clone();
        }
        this.f52853 = enumC14406Arr2;
    }
}
