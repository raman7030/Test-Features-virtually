package l;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۖ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7CW */
/* JADX INFO: loaded from: classes3.dex */
public final class C2546 extends AbstractC3957 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final String f8068 = C1707.getDefault().getSeparator();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public FileOutputStream f8069;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC15950 f8070;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public File f8071;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public File f8072;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public PrintWriter f8073;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8062(File file, String str) {
        if (this.f8072 == null) {
            this.f8072 = file;
        }
        this.f8070 = EnumC15950.FILE;
        this.f12583 = str;
    }

    @Override // l.AbstractC3957, l.InterfaceC1134
    /* JADX INFO: renamed from: ֫ */
    public final void mo1969(String str, C16646 c16646, AbstractC19898 abstractC19898) {
        String strSubstring;
        String string;
        this.f12584 = str;
        int iLastIndexOf = str.lastIndexOf(f8068);
        if (iLastIndexOf != -1) {
            strSubstring = abstractC19898.m45779() ? "" : str.substring(0, iLastIndexOf);
            str = str.substring(iLastIndexOf + 1);
        } else {
            strSubstring = "";
        }
        String str2 = this.f12583;
        if (str2 != null) {
            StringBuilder sbM15339 = C5368.m15339(str2);
            sbM15339.append((String) c16646.orElse(""));
            string = sbM15339.toString();
        } else {
            StringBuilder sbM153310 = C5368.m15339(str);
            sbM153310.append((String) c16646.orElse(""));
            string = sbM153310.toString();
        }
        File file = this.f8072;
        if (file == null) {
            abstractC19898.m45778(C19462.m44858("writing to ", strSubstring, " ", string), new Object[0]);
            this.f8071 = new File(strSubstring, string);
        } else {
            this.f8071 = C8763.get(file.getPath(), strSubstring, string).toFile();
            abstractC19898.m45762(new Supplier() { // from class: l.ۡ۬ۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return C2546.m8060(this.f27064);
                }
            });
            File file2 = new File(this.f8071.getParent());
            if (!file2.exists() && !file2.mkdirs()) {
                abstractC19898.mo11946("Cannot create {0}", file2.getPath());
                return;
            }
        }
        this.f8069 = new FileOutputStream(this.f8071);
        this.f8073 = new PrintWriter(new OutputStreamWriter(this.f8069));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8061(File file) {
        this.f8072 = file;
        if (this.f8070 == null) {
            this.f8070 = EnumC15950.DIR;
        }
    }

    public final String toString() {
        String string = super.toString();
        File file = this.f8072;
        if (file != null && this.f8071 != null) {
            String strConcat = string.concat(file != null ? file.toString() : "").concat(f8068);
            File file2 = this.f8071;
            strConcat.concat(file2 != null ? file2.toString() : "");
        }
        return string;
    }

    @Override // l.InterfaceC1134
    /* JADX INFO: renamed from: ܽ */
    public final void mo1973(String str) {
        this.f8073.println(str);
    }

    @Override // l.InterfaceC1134
    /* JADX INFO: renamed from: ֫ */
    public final void mo1968(String str) {
        this.f8073.print(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m8060(C2546 c2546) {
        return C20087.m46306("writing -d ", c2546.f8072.getPath(), " = \"", c2546.f8071.getAbsolutePath(), "\"");
    }

    @Override // l.AbstractC3957, l.InterfaceC1134
    /* JADX INFO: renamed from: ۧ */
    public final void mo1971(String str) throws IOException {
        super.mo1971(str);
        flush();
        try {
            PrintWriter printWriter = this.f8073;
            if (printWriter != null) {
                printWriter.close();
            }
        } finally {
            FileOutputStream fileOutputStream = this.f8069;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }

    @Override // l.InterfaceC1134
    public final void flush() {
        FileOutputStream fileOutputStream = this.f8069;
        if (fileOutputStream != null) {
            try {
                fileOutputStream.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // l.InterfaceC1134
    /* JADX INFO: renamed from: ֫ */
    public final DataOutputStream mo1967() {
        return new DataOutputStream(new BufferedOutputStream(this.f8069));
    }

    @Override // l.AbstractC3957
    /* JADX INFO: renamed from: ۧ */
    public final String mo1970() {
        File file = this.f8071;
        return file != null ? file.toString() : "file stream";
    }
}
