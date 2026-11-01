package p067l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ۜ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QE */
/* JADX INFO: loaded from: classes2.dex */
public final class C8475 {

    /* JADX INFO: renamed from: ܳ */
    public static final /* synthetic */ int f22740 = 0;

    /* JADX INFO: renamed from: ֫ */
    public List f22741;

    /* JADX INFO: renamed from: ۧ */
    public List f22742;

    /* JADX INFO: renamed from: ܽ */
    public List f22743;

    /* JADX INFO: renamed from: ܿ */
    public List f22744;

    /* JADX INFO: renamed from: ᩳ */
    public List f22745;

    public /* synthetic */ C8475(int i) {
        this();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19714(C8475 c8475, int i, InterfaceC8672 interfaceC8672) {
        c8475.getClass();
        C25120 c25120 = (C25120) interfaceC8672;
        c25120.getClass();
        if (EnumC24765.ASCENDING == EnumC24765.DESCENDING) {
            List list = c8475.f22745;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                c25120.m55164(i, listIterator.previous());
            }
            return;
        }
        Iterator it = c8475.f22745.iterator();
        while (it.hasNext()) {
            c25120.m55164(i, (AbstractC7962) it.next());
        }
    }

    public C8475() {
    }

    static {
        C24568.m54167().m54168();
    }

    /* JADX INFO: renamed from: ܿ */
    public final List m19732() {
        return this.f22744;
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m19725() {
        return this.f22741;
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m19729() {
        return this.f22742;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final List m19733() {
        return this.f22745;
    }

    /* JADX INFO: renamed from: ܽ */
    public final List m19731() {
        return this.f22743;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8475)) {
            return false;
        }
        C8475 c8475 = (C8475) obj;
        return Arrays.equals(new Object[]{this.f22744, this.f22741, this.f22742, this.f22745, this.f22743}, new Object[]{c8475.f22744, c8475.f22741, c8475.f22742, c8475.f22745, c8475.f22743});
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22744, this.f22741, this.f22742, this.f22745, this.f22743});
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m19730(int i, AbstractC16402 abstractC16402) {
        Iterator it = this.f22744.iterator();
        while (it.hasNext()) {
            abstractC16402.mo37249(i, ((Long) it.next()).longValue());
        }
        Iterator it2 = this.f22741.iterator();
        while (it2.hasNext()) {
            abstractC16402.mo37234(i, ((Integer) it2.next()).intValue());
        }
        Iterator it3 = this.f22742.iterator();
        while (it3.hasNext()) {
            abstractC16402.mo37235(i, ((Long) it3.next()).longValue());
        }
        Iterator it4 = this.f22745.iterator();
        while (it4.hasNext()) {
            abstractC16402.mo37237(i, (AbstractC7962) it4.next());
        }
        Iterator it5 = this.f22743.iterator();
        while (it5.hasNext()) {
            abstractC16402.m37238(i, (C11158) it5.next());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m19724(int i) {
        Iterator it = this.f22744.iterator();
        int serializedSize = 0;
        while (it.hasNext()) {
            serializedSize += AbstractC16402.m37228(i, ((Long) it.next()).longValue());
        }
        Iterator it2 = this.f22741.iterator();
        while (it2.hasNext()) {
            ((Integer) it2.next()).getClass();
            serializedSize += AbstractC16402.m37225(i);
        }
        Iterator it3 = this.f22742.iterator();
        while (it3.hasNext()) {
            ((Long) it3.next()).getClass();
            serializedSize += AbstractC16402.m37220(i) + 8;
        }
        Iterator it4 = this.f22745.iterator();
        while (it4.hasNext()) {
            serializedSize += AbstractC16402.m37223(i, (AbstractC7962) it4.next());
        }
        for (C11158 c11158 : this.f22743) {
            serializedSize += c11158.getSerializedSize() + (AbstractC16402.m37220(i) * 2);
        }
        return serializedSize;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19727(int i, AbstractC16402 abstractC16402) {
        Iterator it = this.f22745.iterator();
        while (it.hasNext()) {
            abstractC16402.mo37250(i, (AbstractC7962) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19726(int i, InterfaceC8672 interfaceC8672) {
        C25120 c25120 = (C25120) interfaceC8672;
        c25120.m55149(i, false, this.f22744);
        c25120.m55171(i, false, this.f22741);
        c25120.m55168(i, false, this.f22742);
        c25120.m55142(i, this.f22745);
        EnumC24765 enumC24765 = EnumC24765.ASCENDING;
        for (int i2 = 0; i2 < this.f22743.size(); i2++) {
            c25120.m55152(i);
            ((C11158) this.f22743.get(i2)).m25747(c25120);
            c25120.m55135(i);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m19728(int i) {
        int iM37223 = 0;
        for (AbstractC7962 abstractC7962 : this.f22745) {
            iM37223 += AbstractC16402.m37223(3, abstractC7962) + AbstractC16402.m37231(2, i) + (AbstractC16402.m37220(1) * 2);
        }
        return iM37223;
    }
}
