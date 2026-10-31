package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G7D4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6193 extends C7419 {

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public String f18995;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public int f18996;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f18997;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public String f18998;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public String f18999;

    public C6193(EnumC4662 enumC4662, C2481 c2481, int i) {
        super(c2481, C13248.class, i);
        this.f18998 = ": number_of_entries = %d";
        this.f18999 = "n/a";
        this.f18995 = "n/a";
        this.f18997 = new ArrayList(i);
        int i2 = C10427.f31328[enumC4662.ordinal()];
        if (i2 == 1) {
            this.f18996 = c2481.m28907(EnumC15204.f46595.m35967());
            this.f18998 = C21639.m48906(EnumC15204.f46534, new StringBuilder(), ": number_of_entries = %d");
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("Unexpected value: " + enumC4662);
            }
            this.f18996 = c2481.m28907(EnumC15204.f46581.m35967());
            this.f18998 = C21639.m48906(EnumC15204.f46452, new StringBuilder(), ": number_of_entries = %d");
        }
        this.f18999 = C3200.m9831(this.f18996, "s = %-3d", new StringBuilder("%"));
        this.f18995 = C3200.m9831(this.f18996, "s = %s", new StringBuilder("%"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17113(C13248 c13248, boolean z) {
        c13248.m32154(this.f18996, this.f18999, this.f18995);
        m19942((AbstractC9701) c13248);
        this.f18997.add(Boolean.valueOf(z));
    }

    @Override // l.C7419, l.AbstractC9701, l.InterfaceC17482
    /* JADX INFO: renamed from: ۧ */
    public final void mo3021() {
        ArrayList arrayList = this.f22796;
        int size = arrayList.size();
        if (size > 0) {
            ((C13248) arrayList.get(0)).m32156(String.format(this.f18998, Integer.valueOf(arrayList.size() - ((int) C5378.stream(this.f18997).filter(new C12543(0)).count()))));
            mo10249(mo10250());
            for (int i = 0; i < size; i++) {
                C13248 c13248 = (C13248) arrayList.get(i);
                c13248.f29349 = this.f29349;
                c13248.mo4064(i, size);
            }
        }
    }
}
