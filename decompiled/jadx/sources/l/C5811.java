package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۛۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8MK */
/* JADX INFO: loaded from: classes2.dex */
public final class C5811 {
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16314(InterfaceC13571 interfaceC13571, C21062 c21062, InterfaceC23483 interfaceC23483) {
        int iMo4659;
        boolean z;
        long j = c21062.f67934;
        if (j == -9223372036854775807L) {
            iMo4659 = 0;
        } else {
            iMo4659 = interfaceC13571.mo4659(j);
            if (iMo4659 == -1) {
                iMo4659 = interfaceC13571.mo4658();
            }
            if (iMo4659 > 0 && interfaceC13571.mo4660(iMo4659 - 1) == j) {
                iMo4659--;
            }
        }
        if (j == -9223372036854775807L || iMo4659 >= interfaceC13571.mo4658()) {
            z = false;
        } else {
            List listMo4661 = interfaceC13571.mo4661(j);
            long jMo4660 = interfaceC13571.mo4660(iMo4659);
            if (listMo4661.isEmpty()) {
                z = false;
            } else {
                long j2 = c21062.f67934;
                if (j2 < jMo4660) {
                    interfaceC23483.accept(new C12866(j2, jMo4660 - j2, listMo4661));
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        for (int i = iMo4659; i < interfaceC13571.mo4658(); i++) {
            m16313(interfaceC13571, i, interfaceC23483);
        }
        if (c21062.f67933) {
            if (z) {
                iMo4659--;
            }
            for (int i2 = 0; i2 < iMo4659; i2++) {
                m16313(interfaceC13571, i2, interfaceC23483);
            }
            if (z) {
                interfaceC23483.accept(new C12866(interfaceC13571.mo4660(iMo4659), j - interfaceC13571.mo4660(iMo4659), interfaceC13571.mo4661(j)));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16313(InterfaceC13571 interfaceC13571, int i, InterfaceC23483 interfaceC23483) {
        long jMo4660 = interfaceC13571.mo4660(i);
        List listMo4661 = interfaceC13571.mo4661(jMo4660);
        if (listMo4661.isEmpty()) {
            return;
        }
        if (i == interfaceC13571.mo4658() - 1) {
            throw new IllegalStateException();
        }
        long jMo4661 = interfaceC13571.mo4660(i + 1) - interfaceC13571.mo4660(i);
        if (jMo4661 > 0) {
            interfaceC23483.accept(new C12866(jMo4660, jMo4661, listMo4661));
        }
    }
}
