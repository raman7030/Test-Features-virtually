package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8JQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C21635 {

    /* JADX INFO: renamed from: ֫ */
    public final List f68190;

    public C21635(ArrayList arrayList) {
        this.f68190 = C21562.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21635 m48851(C19203 c19203) {
        c19203.m43725();
        boolean z = (c19203.m43702() & 128) != 0;
        ArrayList arrayList = new ArrayList();
        if (!z) {
            int iM43702 = c19203.m43702();
            boolean z2 = (iM43702 & 64) != 0;
            boolean z3 = (iM43702 & 32) != 0;
            if (z2) {
                c19203.m43725();
            }
            if (!z2) {
                int iM43703 = c19203.m43702();
                arrayList = new ArrayList(iM43703);
                for (int i = 0; i < iM43703; i++) {
                    c19203.m43702();
                    c19203.m43725();
                    arrayList.add(new C23646());
                }
            }
            if (z3) {
                c19203.m43702();
                c19203.m43725();
            }
            c19203.m43710();
            c19203.m43702();
            c19203.m43702();
        }
        return new C21635(arrayList);
    }
}
