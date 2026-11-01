package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۛۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8MK */
/* JADX INFO: loaded from: classes2.dex */
public final class C7891 {
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX INFO: renamed from: ֫ */
    public static void m18239(InterfaceC15266 interfaceC15266, C22386 c22386, InterfaceC24686 interfaceC24686) {
        int iMo6891;
        boolean z;
        long j = c22386.f70618;
        if (j == -9223372036854775807L) {
            iMo6891 = 0;
        } else {
            iMo6891 = interfaceC15266.mo6891(j);
            if (iMo6891 == -1) {
                iMo6891 = interfaceC15266.mo6890();
            }
            if (iMo6891 > 0 && interfaceC15266.mo6892(iMo6891 - 1) == j) {
                iMo6891--;
            }
        }
        if (j == -9223372036854775807L || iMo6891 >= interfaceC15266.mo6890()) {
            z = false;
        } else {
            List listMo6893 = interfaceC15266.mo6893(j);
            long jMo6892 = interfaceC15266.mo6892(iMo6891);
            if (listMo6893.isEmpty()) {
                z = false;
            } else {
                long j2 = c22386.f70618;
                if (j2 < jMo6892) {
                    interfaceC24686.accept(new C14596(j2, jMo6892 - j2, listMo6893));
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        for (int i = iMo6891; i < interfaceC15266.mo6890(); i++) {
            m18238(interfaceC15266, i, interfaceC24686);
        }
        if (c22386.f70617) {
            if (z) {
                iMo6891--;
            }
            for (int i2 = 0; i2 < iMo6891; i2++) {
                m18238(interfaceC15266, i2, interfaceC24686);
            }
            if (z) {
                interfaceC24686.accept(new C14596(interfaceC15266.mo6892(iMo6891), j - interfaceC15266.mo6892(iMo6891), interfaceC15266.mo6893(j)));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18238(InterfaceC15266 interfaceC15266, int i, InterfaceC24686 interfaceC24686) {
        long jMo6892 = interfaceC15266.mo6892(i);
        List listMo6893 = interfaceC15266.mo6893(jMo6892);
        if (listMo6893.isEmpty()) {
            return;
        }
        if (i == interfaceC15266.mo6890() - 1) {
            throw new IllegalStateException();
        }
        long jMo6893 = interfaceC15266.mo6892(i + 1) - interfaceC15266.mo6892(i);
        if (jMo6893 > 0) {
            interfaceC24686.accept(new C14596(jMo6892, jMo6893, listMo6893));
        }
    }
}
