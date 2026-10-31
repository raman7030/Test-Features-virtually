package l;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܳ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QE */
/* JADX INFO: loaded from: classes4.dex */
public final class C14186 implements InterfaceC9228 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public TreeMap f42823 = new TreeMap();

    @Override // l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        return true;
    }

    @Override // l.InterfaceC9228
    public final InterfaceC9228 mergeFrom(byte[] bArr) throws C2025 {
        try {
            AbstractC7297 abstractC7297M19548 = AbstractC7297.m19548(false, 0, bArr.length, bArr);
            m33841(abstractC7297M19548);
            abstractC7297M19548.mo19554(0);
            return this;
        } catch (C2025 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14186 m33836() {
        return new C14186();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C23359 m33837(int i) {
        if (i == 0) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(i);
        TreeMap treeMap = this.f42823;
        C23359 c23359 = (C23359) treeMap.get(numValueOf);
        if (c23359 != null) {
            return c23359;
        }
        int i2 = C6426.f19868;
        C23359 c23359M51769 = C23359.m51769();
        treeMap.put(Integer.valueOf(i), c23359M51769);
        return c23359M51769;
    }

    @Override // l.InterfaceC9228, l.InterfaceC14165
    public final C9249 build() {
        TreeMap treeMap = this.f42823;
        if (treeMap.isEmpty()) {
            return C9249.m23740();
        }
        TreeMap treeMap2 = new TreeMap();
        for (Map.Entry entry : treeMap.entrySet()) {
            treeMap2.put((Integer) entry.getKey(), ((C23359) entry.getValue()).m51770());
        }
        return new C9249(treeMap2, 0);
    }

    @Override // l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 buildPartial() {
        return build();
    }

    public final Object clone() {
        int i = C9249.f28024;
        C14186 c14186M33836 = m33836();
        for (Map.Entry entry : this.f42823.entrySet()) {
            c14186M33836.f42823.put((Integer) entry.getKey(), ((C23359) entry.getValue()).clone());
        }
        return c14186M33836;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33842(C9249 c9249) {
        if (c9249 != C9249.m23740()) {
            for (Map.Entry entry : c9249.f28025.entrySet()) {
                m33840(((Integer) entry.getKey()).intValue(), (C6426) entry.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33838(int i, int i2) {
        if (i <= 0) {
            throw new IllegalArgumentException(i + " is not a valid field number.");
        }
        m33837(i).m51776(i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33839(int i, AbstractC5886 abstractC5886) {
        if (i <= 0) {
            throw new IllegalArgumentException(i + " is not a valid field number.");
        }
        m33837(i).m51773(abstractC5886);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33840(int i, C6426 c6426) {
        if (i <= 0) {
            throw new IllegalArgumentException(i + " is not a valid field number.");
        }
        Integer numValueOf = Integer.valueOf(i);
        TreeMap treeMap = this.f42823;
        if (treeMap.containsKey(numValueOf)) {
            m33837(i).m51774(c6426);
            return;
        }
        if (i <= 0) {
            throw new IllegalArgumentException(i + " is not a valid field number.");
        }
        Integer numValueOf2 = Integer.valueOf(i);
        int i2 = C6426.f19868;
        C23359 c23359M51769 = C23359.m51769();
        c23359M51769.m51774(c6426);
        treeMap.put(numValueOf2, c23359M51769);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33841(AbstractC7297 abstractC7297) {
        int iMo19567;
        do {
            iMo19567 = abstractC7297.mo19567();
            if (iMo19567 == 0) {
                return;
            }
        } while (m33843(iMo19567, abstractC7297));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33843(int i, AbstractC7297 abstractC7297) throws C7648 {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            m33837(i2).m51776(abstractC7297.mo19557());
            return true;
        }
        if (i3 == 1) {
            m33837(i2).m51772(abstractC7297.mo19563());
            return true;
        }
        if (i3 == 2) {
            m33837(i2).m51773(abstractC7297.mo19566());
            return true;
        }
        if (i3 == 3) {
            int i4 = C9249.f28024;
            C14186 c14186 = new C14186();
            abstractC7297.mo19555(i2, c14186, C1570.f5566);
            m33837(i2).m51775(c14186.build());
            return true;
        }
        if (i3 == 4) {
            return false;
        }
        if (i3 == 5) {
            m33837(i2).m51771(abstractC7297.mo19576());
            return true;
        }
        throw C2025.m6582();
    }

    @Override // l.InterfaceC9228
    public final InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m33841(abstractC7297);
        return this;
    }

    @Override // l.InterfaceC9228
    public final InterfaceC9228 mergeFrom(InterfaceC8522 interfaceC8522) {
        if (interfaceC8522 instanceof C9249) {
            m33842((C9249) interfaceC8522);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
