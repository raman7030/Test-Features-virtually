package l;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P4VD */
/* JADX INFO: loaded from: classes.dex */
public final class C23083 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C10384[] f74230 = new C10384[0];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public LinkedList f74231;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6150 f74232;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f74233;

    public C23083(InterfaceC6150 interfaceC6150, C3328 c3328) {
        LinkedList linkedList = new LinkedList();
        this.f74231 = linkedList;
        linkedList.listIterator();
        this.f74232 = interfaceC6150;
        this.f74233 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10384[] m51247() {
        return (C10384[]) ((List) C5378.stream(this.f74231).map(new C2225(2, this)).filter(new C13514(1)).collect(C22976.toList())).toArray(f74230);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C10384 m51245(C23083 c23083, String str) {
        C10384 c10384Mo11134 = c23083.f74232.mo11134(str);
        return (c10384Mo11134 == null && c23083.f74233) ? new C10384(str) : c10384Mo11134;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51246(InputStream inputStream, String str) throws IOException {
        this.f74231 = new LinkedList();
        InterfaceC6150 interfaceC6150 = this.f74232;
        int i = C8789.f26773;
        Charset charsetDefaultCharset = Charset.defaultCharset();
        if (str != null) {
            charsetDefaultCharset = Charset.forName(str);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charsetDefaultCharset));
        try {
            for (String strMo17064 = interfaceC6150.mo17064(bufferedReader); strMo17064 != null; strMo17064 = interfaceC6150.mo17064(bufferedReader)) {
                this.f74231.add(strMo17064);
            }
            bufferedReader.close();
            interfaceC6150.mo11132(this.f74231);
            this.f74231.listIterator();
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
