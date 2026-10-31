package l;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.ۢܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes3.dex */
public final class C9648 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f29231;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final File f29232;

    public C9648() {
        File file = new File(System.getProperty("java.io.tmpdir"));
        this.f29232 = file;
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f29231 = new ArrayList();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24582() {
        ArrayList arrayList = this.f29231;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC22347) it.next()).delete();
            } catch (Exception e) {
                AbstractC4708.f14944.log(Level.WARNING, "could not delete file ", (Throwable) e);
            }
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20937 m24583() {
        C20937 c20937 = new C20937(this.f29232);
        this.f29231.add(c20937);
        return c20937;
    }
}
