package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1Q7 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3591 implements InterfaceC7305, InterfaceC23425 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11404;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11405;

    public /* synthetic */ C3591(Object obj, Object obj2) {
        this.f11404 = obj;
        this.f11405 = obj2;
    }

    @Override // l.InterfaceC23425
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String mo10986(C3104 c3104) {
        return ((ActivityC10227) this.f11404).f30744.m38731(c3104, (C23713) this.f11405);
    }

    @Override // l.InterfaceC7305
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo10987(final C10211 c10211) {
        final C16560 c16560 = (C16560) this.f11404;
        final C2450 c2450 = (C2450) this.f11405;
        c10211.m25619();
        c16560.m39044().m39738(c16560, c16560.m39025(), new InterfaceC7305() { // from class: l.ᩴ֡ܳ
            @Override // l.InterfaceC7305
            /* JADX INFO: renamed from: ֫ */
            public final void mo10987(C10211 c10212) {
                String name;
                String name2;
                c10212.m25619();
                C10211 c10213 = c10211;
                AbstractC15440 abstractC15440M25622 = c10213.m25622();
                AbstractC15440 abstractC15440M25623 = c10212.m25622();
                C2450 c2451 = c2450;
                boolean zM39064 = c2451.m7921().m39064();
                if (abstractC15440M25622.getName().equals(abstractC15440M25623.getName())) {
                    int i = R.string.MT_Protector;
                    name = C4925.m14306(zM39064 ? R.string.MT_Protector : R.string.MT_Protector, abstractC15440M25622.getName());
                    if (!zM39064) {
                        i = R.string.MT_Protector;
                    }
                    name2 = C4925.m14306(i, abstractC15440M25623.getName());
                } else {
                    name = abstractC15440M25622.getName();
                    name2 = abstractC15440M25623.getName();
                }
                C7309 c7309 = new C7309(c10213.m25622(), c10212.m25622(), name, name2, c2451.m7922(), c16560.m39044());
                if (!zM39064) {
                    c7309.m19594();
                }
                C19738.m45446(c2451.m7921(), c7309);
            }
        });
    }
}
