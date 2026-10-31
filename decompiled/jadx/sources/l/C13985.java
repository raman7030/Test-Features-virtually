package l;

/* JADX INFO: renamed from: l.ܰᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBHG */
/* JADX INFO: loaded from: classes4.dex */
public final class C13985 extends C17535 {
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m33463() {
        int size = size();
        int iMo9828 = 2;
        for (int i = 0; i < size; i++) {
            iMo9828 += ((InterfaceC12575) m40978(i)).mo9828();
        }
        return iMo9828;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12575 m33465(String str) {
        int size = size();
        for (int i = 0; i < size; i++) {
            InterfaceC12575 interfaceC12575 = (InterfaceC12575) m40978(i);
            if (interfaceC12575.getName().equals(str)) {
                return interfaceC12575;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC12575 m33464(AbstractC23822 abstractC23822) {
        InterfaceC12575 interfaceC12575;
        int size = size();
        int i = 0;
        while (i < size) {
            if (((InterfaceC12575) m40978(i)) == abstractC23822) {
                String name = abstractC23822.getName();
                do {
                    i++;
                    if (i >= size) {
                        return null;
                    }
                    interfaceC12575 = (InterfaceC12575) m40978(i);
                } while (!interfaceC12575.getName().equals(name));
                return interfaceC12575;
            }
            i++;
        }
        return null;
    }
}
