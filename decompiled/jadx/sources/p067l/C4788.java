package p067l;

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
public final class C4788 extends AbstractC6129 {

    /* JADX INFO: renamed from: ۜ */
    public static final String f10858 = C3991.getDefault().getSeparator();

    /* JADX INFO: renamed from: ܳ */
    public FileOutputStream f10859;

    /* JADX INFO: renamed from: ܽ */
    public EnumC17527 f10860;

    /* JADX INFO: renamed from: ܿ */
    public File f10861;

    /* JADX INFO: renamed from: ᩳ */
    public File f10862;

    /* JADX INFO: renamed from: ᩻ */
    public PrintWriter f10863;

    /* JADX INFO: renamed from: ֫ */
    public final void m10093(File file, String str) {
        if (this.f10862 == null) {
            this.f10862 = file;
        }
        this.f10860 = EnumC17527.FILE;
        this.f15391 = str;
    }

    @Override // p067l.AbstractC6129, p067l.InterfaceC3446
    /* JADX INFO: renamed from: ֫ */
    public final void mo4345(String str, C18189 c18189, AbstractC21279 abstractC21279) {
        String strSubstring;
        String string;
        this.f15392 = str;
        int iLastIndexOf = str.lastIndexOf(f10858);
        if (iLastIndexOf != -1) {
            strSubstring = abstractC21279.m48091() ? "" : str.substring(0, iLastIndexOf);
            str = str.substring(iLastIndexOf + 1);
        } else {
            strSubstring = "";
        }
        String str2 = this.f15391;
        if (str2 != null) {
            StringBuilder sbM17248 = C7470.m17248(str2);
            sbM17248.append((String) c18189.orElse(""));
            string = sbM17248.toString();
        } else {
            StringBuilder sbM17249 = C7470.m17248(str);
            sbM17249.append((String) c18189.orElse(""));
            string = sbM17249.toString();
        }
        File file = this.f10862;
        if (file == null) {
            abstractC21279.m48090(C20865.m47154("writing to ", strSubstring, " ", string), new Object[0]);
            this.f10861 = new File(strSubstring, string);
        } else {
            this.f10861 = C10697.get(file.getPath(), strSubstring, string).toFile();
            abstractC21279.m48074(new Supplier() { // from class: l.ۡ۬ۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return C4788.m10091(this.f29988);
                }
            });
            File file2 = new File(this.f10861.getParent());
            if (!file2.exists() && !file2.mkdirs()) {
                abstractC21279.mo13866("Cannot create {0}", file2.getPath());
                return;
            }
        }
        this.f10859 = new FileOutputStream(this.f10861);
        this.f10863 = new PrintWriter(new OutputStreamWriter(this.f10859));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10092(File file) {
        this.f10862 = file;
        if (this.f10860 == null) {
            this.f10860 = EnumC17527.DIR;
        }
    }

    public final String toString() {
        String string = super.toString();
        File file = this.f10862;
        if (file != null && this.f10861 != null) {
            String strConcat = string.concat(file != null ? file.toString() : "").concat(f10858);
            File file2 = this.f10861;
            strConcat.concat(file2 != null ? file2.toString() : "");
        }
        return string;
    }

    @Override // p067l.InterfaceC3446
    /* JADX INFO: renamed from: ܽ */
    public final void mo4349(String str) {
        this.f10863.println(str);
    }

    @Override // p067l.InterfaceC3446
    /* JADX INFO: renamed from: ֫ */
    public final void mo4344(String str) {
        this.f10863.print(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m10091(C4788 c4788) {
        return C21459.m48622("writing -d ", c4788.f10862.getPath(), " = \"", c4788.f10861.getAbsolutePath(), "\"");
    }

    @Override // p067l.AbstractC6129, p067l.InterfaceC3446
    /* JADX INFO: renamed from: ۧ */
    public final void mo4347(String str) throws IOException {
        super.mo4347(str);
        flush();
        try {
            PrintWriter printWriter = this.f10863;
            if (printWriter != null) {
                printWriter.close();
            }
        } finally {
            FileOutputStream fileOutputStream = this.f10859;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }

    @Override // p067l.InterfaceC3446
    public final void flush() {
        FileOutputStream fileOutputStream = this.f10859;
        if (fileOutputStream != null) {
            try {
                fileOutputStream.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // p067l.InterfaceC3446
    /* JADX INFO: renamed from: ֫ */
    public final DataOutputStream mo4343() {
        return new DataOutputStream(new BufferedOutputStream(this.f10859));
    }

    @Override // p067l.AbstractC6129
    /* JADX INFO: renamed from: ۧ */
    public final String mo4346() {
        File file = this.f10861;
        return file != null ? file.toString() : "file stream";
    }
}
