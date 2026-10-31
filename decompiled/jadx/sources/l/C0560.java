package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9QE */
/* JADX INFO: loaded from: classes3.dex */
public final class C0560 extends AbstractC4110 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f2243;

    public C0560(String str, String str2) {
        super(str, str2);
        this.f2243 = new ArrayList();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2308(int i, C15859 c15859) {
        this.f2243.add(new C5500(i, c15859));
    }

    @Override // l.InterfaceC16270
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int mo2311() {
        return this.f2243.size();
    }

    @Override // l.InterfaceC16270
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2866 mo2310(int i) {
        return (InterfaceC2866) this.f2243.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2309(InterfaceC4485 interfaceC4485) {
        Iterator it = m12338().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += (((C15859) ((C5500) it.next()).mo8775()).size() * 4) + 16;
        }
        interfaceC4485.mo13229((short) 516);
        interfaceC4485.mo13229((short) 1032);
        interfaceC4485.writeInt(size + 1032);
        interfaceC4485.mo13228(256, getName());
        interfaceC4485.mo13228(256, mo12339());
        for (C5500 c5500 : m12338()) {
            InterfaceC1022 interfaceC1022Mo8775 = c5500.mo8775();
            interfaceC4485.mo13229((short) 517);
            interfaceC4485.mo13229((short) 16);
            C15859 c15859 = (C15859) interfaceC1022Mo8775;
            interfaceC4485.writeInt((c15859.size() * 4) + 16);
            interfaceC4485.writeInt(c5500.mo8776());
            interfaceC4485.writeInt(c15859.size());
            for (int i = 0; i < c15859.size(); i++) {
                interfaceC4485.writeInt(c15859.getInt(i));
            }
        }
    }
}
