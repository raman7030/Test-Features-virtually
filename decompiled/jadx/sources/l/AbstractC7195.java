package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95JE */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7195 implements InterfaceC0179, InterfaceC7941 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC13544[] f22036;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC13544[] f22037;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f22038;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C5637 f22040;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f22035 = new ArrayList();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f22039 = true;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo6106(InterfaceC13544 interfaceC13544);

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC13544[] mo6107(int i);

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo6109();

    /* JADX INFO: renamed from: ܿ */
    public abstract InterfaceC13544 mo6110();

    @Override // l.InterfaceC0179
    /* JADX INFO: renamed from: ֫ */
    public final Object mo1320(Object obj, AbstractC1591 abstractC1591) {
        this.f22036 = (InterfaceC13544[]) obj;
        try {
            C14996.m35527(abstractC1591, this, false);
            InterfaceC13544[] interfaceC13544Arr = this.f22036;
            this.f22036 = null;
            return interfaceC13544Arr;
        } catch (Exception e) {
            throw new RuntimeException("fail exe " + abstractC1591, e);
        }
    }

    public AbstractC7195(C5637 c5637) {
        this.f22040 = c5637;
        this.f22038 = c5637.f17415.size();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19277() {
        boolean z = this.f22039;
        C5637 c5637 = this.f22040;
        if (z) {
            Iterator it = c5637.f17415.iterator();
            int i = 0;
            while (it.hasNext()) {
                ((C18274) it.next()).f56817 = i;
                i++;
            }
        }
        C14996.m35528(c5637);
        this.f22037 = mo6107(this.f22038);
        C14996.m35531(c5637.f17411, this);
        this.f22037 = null;
        mo6109();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13544[] m19278() {
        return mo6107(this.f22038);
    }

    @Override // l.InterfaceC0179
    /* JADX INFO: renamed from: ֫ */
    public final Object mo1318() {
        return mo6107(this.f22038);
    }

    @Override // l.InterfaceC5119
    /* JADX INFO: renamed from: ֫ */
    public final C18274 mo11293(C18274 c18274, C21802 c21802) {
        System.arraycopy(this.f22036, 0, this.f22037, 0, this.f22038);
        this.f22036 = this.f22037;
        InterfaceC13544 interfaceC13544Mo6105 = mo6105(c18274, c21802.f42445);
        this.f22035.add(interfaceC13544Mo6105);
        this.f22036[c18274.f56817] = interfaceC13544Mo6105;
        return c18274;
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC13544 mo6105(C18274 c18274, AbstractC8396 abstractC8396) {
        return mo6110();
    }

    @Override // l.InterfaceC0885
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8396 mo3235(C18274 c18274) {
        mo6106(this.f22036[c18274.f56817]);
        return c18274;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (AbstractC1591 first = this.f22040.f17411.getFirst(); first != null; first = first.m5439()) {
            InterfaceC13544[] interfaceC13544Arr = (InterfaceC13544[]) first.f5637;
            if (interfaceC13544Arr != null) {
                for (InterfaceC13544 interfaceC13544 : interfaceC13544Arr) {
                    if (interfaceC13544 == null) {
                        sb.append('.');
                    } else {
                        sb.append(interfaceC13544.mo27353());
                    }
                }
                sb.append(" | ");
            }
            sb.append(first.toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
