package p067l;

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
public final class C24306 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C12237[] f76976 = new C12237[0];

    /* JADX INFO: renamed from: ֫ */
    public LinkedList f76977;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC8213 f76978;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f76979;

    public C24306(InterfaceC8213 interfaceC8213, C5531 c5531) {
        LinkedList linkedList = new LinkedList();
        this.f76977 = linkedList;
        linkedList.listIterator();
        this.f76978 = interfaceC8213;
        this.f76979 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12237[] m53641() {
        return (C12237[]) ((List) C7480.stream(this.f76977).map(new C4483(2, this)).filter(new C15212(1)).collect(C24205.toList())).toArray(f76976);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ C12237 m53639(C24306 c24306, String str) {
        C12237 c12237Mo13110 = c24306.f76978.mo13110(str);
        return (c12237Mo13110 == null && c24306.f76979) ? new C12237(str) : c12237Mo13110;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53640(InputStream inputStream, String str) throws IOException {
        this.f76977 = new LinkedList();
        InterfaceC8213 interfaceC8213 = this.f76978;
        int i = C10721.f29698;
        Charset charsetDefaultCharset = Charset.defaultCharset();
        if (str != null) {
            charsetDefaultCharset = Charset.forName(str);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charsetDefaultCharset));
        try {
            for (String strMo18996 = interfaceC8213.mo18996(bufferedReader); strMo18996 != null; strMo18996 = interfaceC8213.mo18996(bufferedReader)) {
                this.f76977.add(strMo18996);
            }
            bufferedReader.close();
            interfaceC8213.mo13108(this.f76977);
            this.f76977.listIterator();
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
