package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T91K */
/* JADX INFO: loaded from: classes3.dex */
public final class C8648 implements InterfaceC4869 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21349 f26397;

    public C8648(C21349 c21349) {
        this.f26397 = c21349;
    }

    @Override // l.InterfaceC4869
    /* JADX INFO: renamed from: ֫ */
    public final void mo1321(InterfaceC3458 interfaceC3458, AbstractC0197 abstractC0197) {
        String strM31335 = ((C12897) abstractC0197).m31335();
        interfaceC3458.builder().m41753(strM31335);
        C21349 c21349 = this.f26397;
        if (c21349.f68787.isEmpty()) {
            return;
        }
        interfaceC3458.length();
        strM31335.length();
        Iterator it = c21349.f68787.iterator();
        while (it.hasNext()) {
            ((InterfaceC14997) it.next()).m35537();
        }
    }
}
