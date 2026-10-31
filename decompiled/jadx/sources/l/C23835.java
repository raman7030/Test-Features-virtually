package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes.dex */
public final class C23835 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f77126 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1879 f77127;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence f77128;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CharSequence f77129;

    public C23835(InterfaceC1879 interfaceC1879, CharSequence charSequence, CharSequence charSequence2) {
        this.f77127 = interfaceC1879;
        this.f77128 = charSequence;
        this.f77129 = charSequence2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1879 m52531() {
        Iterator itMo6220 = this.f77127.mo6218().f41655.mo6220();
        while (true) {
            boolean zHasNext = itMo6220.hasNext();
            ArrayList arrayList = this.f77126;
            CharSequence charSequence = this.f77129;
            CharSequence charSequence2 = this.f77128;
            if (zHasNext) {
                C22340 c22340 = (C22340) itMo6220.next();
                int iM10309 = c22340.f72397;
                int iM103010 = c22340.f72398;
                int iM10305 = c22340.f72395;
                int iM10306 = c22340.f72396;
                if (C21014.m47827(iM10309, charSequence2)) {
                    iM10309 = C3374.m10309(iM10309, iM10305, charSequence2);
                }
                if (C21014.m47827(iM10305 - 1, charSequence2)) {
                    iM10305 = C3374.m10305(iM10309, iM10305, charSequence2);
                }
                if (C21014.m47827(iM103010, charSequence)) {
                    iM103010 = C3374.m10309(iM103010, iM10306, charSequence);
                }
                if (C21014.m47827(iM10306 - 1, charSequence)) {
                    iM10306 = C3374.m10305(iM103010, iM10306, charSequence);
                }
                C22340 c22341 = new C22340(iM10309, iM10305, iM103010, iM10306);
                if (!c22341.m50072() && !C8313.m21915(charSequence2.subSequence(iM10309, iM10305), charSequence.subSequence(iM103010, iM10306), EnumC5491.DEFAULT)) {
                    arrayList.add(c22341);
                }
            } else {
                return C23751.m52400(arrayList, charSequence2.length(), charSequence.length());
            }
        }
    }
}
