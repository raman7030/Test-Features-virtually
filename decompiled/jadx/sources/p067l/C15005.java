package p067l;

import java.io.PrintWriter;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Y43E */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC7039(EnumC5698.RELEASE_17)
@InterfaceC23803({"*"})
public final class C15005 extends AbstractC10392 {

    /* JADX INFO: renamed from: ܽ */
    public PrintWriter f42872 = new PrintWriter(System.out);

    @Override // p067l.InterfaceC23133
    /* JADX INFO: renamed from: ֫ */
    public final void mo34368(C10312 c10312) {
        Iterator it = c10312.m23932().iterator();
        while (it.hasNext()) {
            ((C5618) ((InterfaceC13745) it.next()).mo3346(new C5618(this.f42872, ((C3606) this.f28754).m6760()), null)).f13601.flush();
        }
    }
}
