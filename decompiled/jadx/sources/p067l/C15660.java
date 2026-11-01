package p067l;

/* JADX INFO: renamed from: l.ܰᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBHG */
/* JADX INFO: loaded from: classes4.dex */
public final class C15660 extends C19034 {
    /* JADX INFO: renamed from: ֨ */
    public final int m35583() {
        int size = size();
        int iMo11873 = 2;
        for (int i = 0; i < size; i++) {
            iMo11873 += ((InterfaceC14320) m43238(i)).mo11873();
        }
        return iMo11873;
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC14320 m35585(String str) {
        int size = size();
        for (int i = 0; i < size; i++) {
            InterfaceC14320 interfaceC14320 = (InterfaceC14320) m43238(i);
            if (interfaceC14320.getName().equals(str)) {
                return interfaceC14320;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC14320 m35584(AbstractC25009 abstractC25009) {
        InterfaceC14320 interfaceC14320;
        int size = size();
        int i = 0;
        while (i < size) {
            if (((InterfaceC14320) m43238(i)) == abstractC25009) {
                String name = abstractC25009.getName();
                do {
                    i++;
                    if (i >= size) {
                        return null;
                    }
                    interfaceC14320 = (InterfaceC14320) m43238(i);
                } while (!interfaceC14320.getName().equals(name));
                return interfaceC14320;
            }
            i++;
        }
        return null;
    }
}
