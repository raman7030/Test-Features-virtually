package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C2427 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f7743;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f7744;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f7745;

    public C2427(C7980 c7980) {
        String type = c7980.getType();
        this.f7744 = type.substring(1, type.length() - 1).replace('/', '.');
        this.f7745 = c7980.m21294();
        Iterator it = c7980.getAnnotations().iterator();
        while (it.hasNext()) {
            if (((C10803) it.next()).getType().equals("Lbin/mt/annotations/MTProtector;")) {
                this.f7743 = true;
                return;
            }
        }
        Iterator it2 = c7980.getMethods().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((C16611) it2.next()).getAnnotations().iterator();
            while (it3.hasNext()) {
                if (((InterfaceC20561) it3.next()).getType().equals("Lbin/mt/annotations/MTProtector;")) {
                    this.f7743 = true;
                    return;
                }
            }
        }
    }
}
