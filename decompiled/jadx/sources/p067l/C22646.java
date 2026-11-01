package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩸ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBE1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22646 {

    /* JADX INFO: renamed from: ֫ */
    public final Object f71453;

    /* JADX INFO: renamed from: ۧ */
    public final Object f71454;

    /* JADX INFO: renamed from: ܽ */
    public final Object f71455;

    public C22646(C15426 c15426, C24845 c24845, InterfaceC11336 interfaceC11336) {
        this.f71455 = c15426;
        this.f71453 = c24845;
        this.f71454 = interfaceC11336;
    }

    /* JADX INFO: renamed from: ܽ */
    public C15426 m50706() {
        return (C15426) this.f71455;
    }

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC10665 m50705() {
        return (C24845) this.f71453;
    }

    public C22646(C14735 c14735) {
        this.f71455 = c14735;
        C18759 c18759M33676 = c14735.m33676();
        this.f71453 = c18759M33676;
        this.f71454 = c18759M33676.m42783();
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC11336 m50704() {
        return (InterfaceC11336) this.f71454;
    }

    /* JADX INFO: renamed from: ᩳ */
    public C14735 m50707() {
        C14735 c14735 = (C14735) this.f71455;
        C18759 c18759 = (C18759) this.f71454;
        C18759 c187510 = (C18759) this.f71453;
        int size = c187510.size();
        BitSet bitSet = new BitSet(c187510.m40215());
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i >= size) {
                break;
            }
            C18088 c18088M56522get = c187510.m56522get(i);
            if (!bitSet.get(c18088M56522get.mo4636())) {
                C22388 c22388M33677 = c14735.m33677(c18088M56522get.mo4636());
                int size2 = c22388M33677.size();
                int i3 = 0;
                while (i3 < size2) {
                    int i4 = c22388M33677.get(i3);
                    C18088 c18088M42784 = c187510.m42784(i4);
                    if (!bitSet.get(i4) && c18088M42784.m41137().size() <= i2 && c18088M42784.m41140().m39656().m11605() != 55) {
                        C22388 c22388 = new C22388();
                        int i5 = i3 + 1;
                        while (i5 < size2) {
                            int i6 = c22388M33677.get(i5);
                            C18088 c18088M42785 = c187510.m42784(i6);
                            if (c18088M42785.m41137().size() == i2 && c18088M42784.m41142().m9915(c18088M42785.m41142())) {
                                c22388.add(i6);
                                bitSet.set(i6);
                            }
                            i5++;
                            i2 = 1;
                        }
                        int size3 = c22388.size();
                        int i7 = 0;
                        while (i7 < size3) {
                            int i8 = c22388.get(i7);
                            C22388 c22388M33678 = c14735.m33677(c187510.m42784(i8).mo4636());
                            int size4 = c22388M33678.size();
                            int i9 = size3;
                            int i10 = 0;
                            while (i10 < size4) {
                                C18759 c187511 = c187510;
                                C18088 c18088M42786 = c18759.m42784(c22388M33678.get(i10));
                                C22388 c22389 = c22388M33677;
                                C22388 c22388M50243 = c18088M42786.m41137().m50243();
                                int iM50242 = c22388M50243.m50242(i8);
                                c22388M50243.set(iM50242 >= 0 ? iM50242 : -1, i4);
                                int iM41139 = c18088M42786.m41139();
                                if (iM41139 == i8) {
                                    iM41139 = i4;
                                }
                                c22388M50243.mo22326();
                                c18759.m42780(c18759.m40219(c18088M42786.mo4636()), new C18088(c18088M42786.mo4636(), c18088M42786.m41142(), c22388M50243, iM41139));
                                i10++;
                                c187510 = c187511;
                                i4 = i4;
                                c22388M33677 = c22389;
                                size2 = size2;
                                i8 = i8;
                                c22388 = c22388;
                            }
                            i7++;
                            size3 = i9;
                        }
                    }
                    i3++;
                    i2 = 1;
                    c187510 = c187510;
                    c22388M33677 = c22388M33677;
                    size2 = size2;
                }
            }
            i++;
            c187510 = c187510;
        }
        while (true) {
            size--;
            if (size >= 0) {
                if (bitSet.get(c18759.m56522get(size).mo4636())) {
                    c18759.m42780(size, (C18088) null);
                }
            } else {
                c18759.mo40218();
                c18759.mo22326();
                return new C14735(c18759, c14735.m33678());
            }
        }
    }
}
