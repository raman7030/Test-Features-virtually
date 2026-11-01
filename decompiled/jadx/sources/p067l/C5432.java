package p067l;

import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V1EH */
/* JADX INFO: loaded from: classes2.dex */
public final class C5432 implements InterfaceC15641 {

    /* JADX INFO: renamed from: ֫ */
    public String f12958;

    /* JADX INFO: renamed from: ۧ */
    public C23948 f12959;

    /* JADX INFO: renamed from: ܽ */
    public C12588 f12960;

    public C5432(String str, C23948 c23948) throws IOException {
        this.f12958 = str;
        C12588 c12588 = new C12588(true);
        this.f12960 = c12588;
        c23948.m53044();
        this.f12959 = c23948;
        c12588.setOutput(c23948);
        c12588.startDocument("utf-8", null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6773 m11939(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044, C11996 c11996) {
        C23948 c23948 = this.f12959;
        int length = c23948.m53043().length();
        String str = this.f12958;
        C12588 c12588 = this.f12960;
        if (length <= 51200) {
            String string = c23948.toString();
            C20635 c20635M28997 = c12588.m28997();
            C6773 c6773 = new C6773();
            c6773.f17542 = str;
            c6773.f17541 = string;
            c6773.f17545 = c20635M28997;
            return c6773;
        }
        BufferedOutputStream bufferedOutputStreamM38683 = abstractC17043.m38683();
        try {
            C7855.m18155(bufferedOutputStreamM38683, c23948.m53043());
            bufferedOutputStreamM38683.close();
            C20635 c20635M28998 = c12588.m28997();
            C12826.requireNonNull(c20635M28998);
            c20635M28998.m46638(c11996);
            abstractC17044.m38654(c11996);
            c11996.m27460();
            if (c11996.m27458().length > 20480) {
                c11996.m27463();
            }
            C6773 c6774 = new C6773();
            c6774.f17542 = str;
            c6774.f17543 = abstractC17043;
            c6774.f17538 = abstractC17044;
            return c6774;
        } catch (Throwable th) {
            try {
                bufferedOutputStreamM38683.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p067l.InterfaceC15641
    /* JADX INFO: renamed from: ۧ */
    public final void mo3702(String str) {
        this.f12960.startTag(null, str);
    }

    @Override // p067l.InterfaceC15641
    /* JADX INFO: renamed from: ֫ */
    public final void mo3698(String str) {
        this.f12960.endTag(null, str);
    }

    @Override // p067l.InterfaceC15641
    /* JADX INFO: renamed from: ֫ */
    public final void mo3699(String str, String str2) {
        this.f12960.attribute(null, str, str2);
    }

    @Override // p067l.InterfaceC15641
    public final void text(String str) {
        this.f12960.text(str);
    }
}
