package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18513 implements InterfaceC17101 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14984 f57372;

    public C18513(C14984 c14984) {
        this.f57372 = c14984;
    }

    @Override // l.InterfaceC17101
    /* JADX INFO: renamed from: ֫ */
    public final void mo7531(C12122 c12122) {
        m43024((AbstractC14278) c12122);
    }

    @Override // l.InterfaceC17101
    /* JADX INFO: renamed from: ֫ */
    public final void mo7532(C13532 c13532) {
        m43024((AbstractC14278) c13532);
    }

    @Override // l.InterfaceC17101
    /* JADX INFO: renamed from: ۧ */
    public final void mo7534(C12122 c12122) {
        m43024((AbstractC14278) c12122);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43024(AbstractC14278 abstractC14278) {
        C21480 c21480Mo29540 = abstractC14278.mo29540();
        C14984 c14984 = this.f57372;
        if (c21480Mo29540 != null) {
            C18658 c18658M48653 = c21480Mo29540.m48653();
            ArrayList arrayList = (ArrayList) c14984.f45684.get(c18658M48653);
            if (arrayList == null) {
                arrayList = new ArrayList();
                c14984.f45684.put(c18658M48653, arrayList);
            }
            arrayList.add(c21480Mo29540);
        }
        if (abstractC14278 instanceof C12122) {
            if (abstractC14278.mo29537().m9562() == 56) {
                c14984.f45681.add((C12122) abstractC14278);
                return;
            }
            C23596 c23596M16229 = C5772.m16229();
            C3135 c3135M37484 = abstractC14278.mo29542().m37484();
            C20069 c20069Mo29535 = abstractC14278.mo29535();
            c23596M16229.getClass();
            if (c3135M37484.m9563()) {
                int size = c20069Mo29535.size();
                int iM48645 = 0;
                for (int i = 0; i < size; i++) {
                    iM48645 += c20069Mo29535.m41004get(i).m48645();
                }
                if (iM48645 >= 6) {
                    c14984.f45682.add((C12122) abstractC14278);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC14278 instanceof C13532) {
            c14984.f45678.add((C13532) abstractC14278);
        }
    }
}
