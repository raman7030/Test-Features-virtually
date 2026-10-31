package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BI */
/* JADX INFO: loaded from: classes5.dex */
public final class C15616 extends C9268 {

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f48096;

    public C15616() {
        throw null;
    }

    @Override // l.C9268
    /* JADX INFO: renamed from: ᩹ */
    public final String mo3022() {
        return "={" + ((String) C5378.stream(this.f48096).map(new C17576(7)).collect(C22976.joining(","))) + '}';
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    @Override // l.C9268, l.AbstractC9701, l.InterfaceC17482
    /* JADX INFO: renamed from: ۧ */
    public final void mo3021() {
        int i;
        ArrayList<C9268> arrayList = this.f48096;
        int size = arrayList.size();
        if (arrayList.size() > 0) {
            EnumC6172 enumC6172M28902 = m28902();
            int i2 = 0;
            if (enumC6172M28902 == EnumC6172.HAS_DEFAULT_VALUE || enumC6172M28902 == EnumC6172.INLINED_ELEMENT) {
                C9268 c9268 = (C9268) arrayList.get(0);
                int iM24656 = ((c9268 instanceof C8562) || (c9268 instanceof C0800)) ? this.f29349 + 10 + m24656() : 1;
                if (m28902() != EnumC6172.INLINED_ELEMENT) {
                    switch (C20557.f66233[((C9268) arrayList.get(0)).f28077.ordinal()]) {
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
                m24662(m28906() + "{ ");
                InterfaceC1134 interfaceC1134 = this.f29325;
                String str = AbstractC9701.f29321;
                interfaceC1134.mo1968(m24652(4, str));
                for (C9268 c9269 : arrayList) {
                    c9269.mo22276(EnumC6172.INLINED_ELEMENT);
                    c9269.f29349 = iM24656;
                    if (((c9269 instanceof C8562) || (c9269 instanceof C0800) || (c9269 instanceof C2212)) && i2 % i == 0 && i2 != 0) {
                        this.f29325.mo1968(m24652(4, str));
                    }
                    c9269.mo3021();
                    if (i2 < size - 1) {
                        StringBuilder sb = new StringBuilder(",");
                        sb.append(i2 % i == i + (-1) ? System.lineSeparator() : " ");
                        m24654(sb.toString());
                    }
                    i2++;
                }
                this.f29325.mo1973(" }");
                m24654("  }");
                return;
            }
            m24662("{");
            for (C9268 c92610 : arrayList) {
                c92610.m24647(this);
                if ((c92610 instanceof C0800) || (c92610 instanceof C2212)) {
                    m24654(c92610.m24650());
                }
                c92610.mo3021();
                if (i2 < size - 1) {
                    m24662(",");
                }
                i2++;
            }
            m24667();
            return;
        }
        m24654(m28906() + "{ } }");
    }
}
