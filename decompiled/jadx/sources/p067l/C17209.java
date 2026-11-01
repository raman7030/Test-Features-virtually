package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BI */
/* JADX INFO: loaded from: classes5.dex */
public final class C17209 extends C11176 {

    /* JADX INFO: renamed from: ۜۧ */
    public ArrayList f51235;

    public C17209() {
        throw null;
    }

    @Override // p067l.C11176
    /* JADX INFO: renamed from: ᩹ */
    public final String mo5335() {
        return "={" + ((String) C7480.stream(this.f51235).map(new C19073(7)).collect(C24205.joining(","))) + '}';
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    @Override // p067l.C11176, p067l.AbstractC11588, p067l.InterfaceC18983
    /* JADX INFO: renamed from: ۧ */
    public final void mo5334() {
        int i;
        ArrayList<C11176> arrayList = this.f51235;
        int size = arrayList.size();
        if (arrayList.size() > 0) {
            EnumC8234 enumC8234M30951 = m30951();
            int i2 = 0;
            if (enumC8234M30951 == EnumC8234.HAS_DEFAULT_VALUE || enumC8234M30951 == EnumC8234.INLINED_ELEMENT) {
                C11176 c11176 = (C11176) arrayList.get(0);
                int iM26670 = ((c11176 instanceof C10505) || (c11176 instanceof C3128)) ? this.f32298 + 10 + m26670() : 1;
                if (m30951() != EnumC8234.INLINED_ELEMENT) {
                    switch (C21905.f68914[((C11176) arrayList.get(0)).f31025.ordinal()]) {
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            i = 1;
                            break;
                        default:
                            int i3 = size % 2;
                            if (size > 10) {
                                if (i3 == 0) {
                                    i = 4;
                                } else {
                                    i = 6;
                                }
                            } else if (i3 == 0) {
                                i = 2;
                            } else {
                                i = 3;
                            }
                            break;
                    }
                } else {
                    i = 1;
                }
                m26676(m30955() + "{ ");
                InterfaceC3446 interfaceC3446 = this.f32274;
                String str = AbstractC11588.f32270;
                interfaceC3446.mo4344(m26666(4, str));
                for (C11176 c11177 : arrayList) {
                    c11177.mo24245(EnumC8234.INLINED_ELEMENT);
                    c11177.f32298 = iM26670;
                    if (((c11177 instanceof C10505) || (c11177 instanceof C3128) || (c11177 instanceof C4470)) && i2 % i == 0 && i2 != 0) {
                        this.f32274.mo4344(m26666(4, str));
                    }
                    c11177.mo5334();
                    if (i2 < size - 1) {
                        StringBuilder sb = new StringBuilder(",");
                        sb.append(i2 % i == i + (-1) ? System.lineSeparator() : " ");
                        m26668(sb.toString());
                    }
                    i2++;
                }
                this.f32274.mo4349(" }");
                m26668("  }");
                return;
            }
            m26676("{");
            for (C11176 c11178 : arrayList) {
                c11178.m26661(this);
                if ((c11178 instanceof C3128) || (c11178 instanceof C4470)) {
                    m26668(c11178.m26664());
                }
                c11178.mo5334();
                if (i2 < size - 1) {
                    m26676(",");
                }
                i2++;
            }
            m26681();
            return;
        }
        m26668(m30955() + "{ } }");
    }
}
