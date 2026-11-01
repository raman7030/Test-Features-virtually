package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C4675 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f10534;

    /* JADX INFO: renamed from: ۧ */
    public String f10535;

    /* JADX INFO: renamed from: ܽ */
    public int f10536;

    public C4675(C9952 c9952) {
        String type = c9952.getType();
        this.f10535 = type.substring(1, type.length() - 1).replace('/', '.');
        this.f10536 = c9952.m23260();
        Iterator it = c9952.getAnnotations().iterator();
        while (it.hasNext()) {
            if (((C12635) it.next()).getType().equals("Lbin/mt/annotations/MTProtector;")) {
                this.f10534 = true;
                return;
            }
        }
        Iterator it2 = c9952.getMethods().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((C18155) it2.next()).getAnnotations().iterator();
            while (it3.hasNext()) {
                if (((InterfaceC21909) it3.next()).getType().equals("Lbin/mt/annotations/MTProtector;")) {
                    this.f10534 = true;
                    return;
                }
            }
        }
    }
}
