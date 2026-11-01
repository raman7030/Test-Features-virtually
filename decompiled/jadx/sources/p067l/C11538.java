package p067l;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.ۢܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes3.dex */
public final class C11538 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f32180;

    /* JADX INFO: renamed from: ۧ */
    public final File f32181;

    public C11538() {
        File file = new File(System.getProperty("java.io.tmpdir"));
        this.f32181 = file;
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f32180 = new ArrayList();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26596() {
        ArrayList arrayList = this.f32180;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC23607) it.next()).delete();
            } catch (Exception e) {
                AbstractC6843.f17774.log(Level.WARNING, "could not delete file ", (Throwable) e);
            }
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C22267 m26597() {
        C22267 c22267 = new C22267(this.f32181);
        this.f32180.add(c22267);
        return c22267;
    }
}
