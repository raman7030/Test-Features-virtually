package p067l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ᩴ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 7A22 */
/* JADX INFO: loaded from: classes5.dex */
public class C20441 extends AbstractC15351 {

    /* JADX INFO: renamed from: ۜ */
    public static InterfaceC4410 f63142 = C13128.m30023(C20441.class.getName());

    @Override // p067l.AbstractC15351
    /* JADX INFO: renamed from: ֫ */
    public final void mo5055(StringBuilder sb) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo10677(C10738 c10738, HashSet hashSet) {
    }

    @Override // p067l.AbstractC15351
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo34939(long j) {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo10678(C10738 c10738) {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20441 m46125(String str, EnumC13420 enumC13420, EnumC8055 enumC8055, boolean z) {
        switch (C25134.f80421[enumC13420.ordinal()]) {
            case 1:
                return new C22453(str, enumC13420, enumC8055, z);
            case 2:
                return new C11724(str, enumC13420, enumC8055, z);
            case 3:
                return new C11724(str, enumC13420, enumC8055, z);
            case 4:
                return new C9041(str, enumC13420, enumC8055, z);
            case 5:
                return new C11053(str, enumC13420, enumC8055, z);
            case 6:
                return new C17757(str, enumC13420, enumC8055, z);
            case 7:
                return new C5018(str, enumC13420, enumC8055, z);
            case 8:
                return new C6359(str, enumC13420, enumC8055, z);
            default:
                return new C20441(str, enumC13420, enumC8055, z);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46126(C10738 c10738, HashSet hashSet, C21467 c21467) {
        if (c21467 == null || !c21467.m48648()) {
            return;
        }
        if (m34943().equalsIgnoreCase(c21467.mo27470()) || m34943().equalsIgnoreCase(c21467.mo27466()) || m34943().equalsIgnoreCase(c21467.m48650())) {
            C9711 c9711M24709 = c10738.m24709();
            EnumC8055 enumC8055M34945 = m34945();
            int i = C14760.f42088;
            hashSet.addAll(c9711M24709.m22662(enumC8055M34945, true, i));
            hashSet.addAll(c21467.m48638(m34945(), i, c10738.m24709()));
        }
        f63142.mo9187("{} DNSQuestion({}).addAnswersForServiceInfo(): info: {}\n{}", c10738.getName(), m34943(), c21467, hashSet);
    }
}
