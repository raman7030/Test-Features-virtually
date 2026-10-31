package l;

import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: R537 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17891 extends AbstractC8343 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f54626;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArrayList f54627;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public List f54628;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public List f54629;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C9425 f54630;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f54631;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ArrayList f54632;

    public C17891(C23326 c23326, C5896 c5896) throws IOException {
        ArrayList arrayList;
        super(c23326);
        this.f54626 = new ArrayList();
        this.f54631 = new ArrayList();
        this.f54627 = new ArrayList();
        this.f54632 = new ArrayList();
        int iM16529 = c5896.m16529();
        C1993 c1993M6523 = C1993.m6523(c5896);
        c1993M6523.m6526(512);
        this.f25566 = c5896.m16535();
        this.f25565 = c5896.m16530(128);
        int iM16535 = c5896.m16535();
        c5896.m16528();
        int iM16536 = c5896.m16535();
        c5896.m16528();
        int iM16537 = c1993M6523.f6674 >= 288 ? c5896.m16535() : 0;
        c5896.m16533(iM16535 + iM16529);
        C9425 c9425 = new C9425(c5896);
        c5896.m16533(iM16536 + iM16529);
        C9425 c9426 = new C9425(c5896);
        this.f54630 = c9426;
        this.f54629 = new C10836(c9425);
        this.f54628 = new C16479(c9426);
        C1993 c1993M6524 = C1993.m6523(c5896);
        int i = iM16529 + c1993M6523.f6673;
        SparseArray sparseArray = new SparseArray();
        while (true) {
            short s = c1993M6524.f6676;
            if (s == 515) {
                int iM16538 = c5896.m16535();
                ArrayList arrayList2 = this.f54626;
                arrayList2.ensureCapacity(iM16538);
                for (int i2 = 0; i2 < iM16538; i2++) {
                    arrayList2.add(new C14153(c5896));
                }
            } else if (s == 516) {
                C7804 c7804 = new C7804(c5896);
                this.f54631.add(c7804);
                int iM165210 = c5896.m16529();
                C1993 c1993M6525 = C1993.m6523(c5896);
                while (true) {
                    short s2 = c1993M6525.f6676;
                    arrayList = c7804.f24112;
                    if (s2 != 517) {
                        break;
                    }
                    int iM16539 = c5896.m16535();
                    int iM165310 = c5896.m16535();
                    C15859 c15859 = new C15859(iM165310);
                    for (int i3 = 0; i3 < iM165310; i3++) {
                        c15859.add(c5896.m16535());
                    }
                    arrayList.add(new C1663(iM16539, c15859));
                    iM165210 = c5896.m16529();
                    c1993M6525 = C1993.m6523(c5896);
                }
                arrayList.trimToSize();
                c5896.m16533(iM165210);
            } else if (s == 518) {
                this.f54627.add(new C17185(c5896));
            } else if (s == 514) {
                C23535 c23535 = new C23535(this, c5896, c1993M6524);
                this.f54632.add(c23535);
                sparseArray.put(c23535.mo2870(), c23535);
            } else {
                if (s != 513) {
                    if (s != -1 && s != 512) {
                        System.err.printf("Skip arsc chunk: %04x\n", Short.valueOf(s));
                    }
                    c5896.m16533(i);
                    return;
                }
                int iM16531 = c5896.m16531() - iM16537;
                C23535 c23536 = (C23535) sparseArray.get(iM16531);
                if (c23536 == null) {
                    throw new IOException(C19370.m44628(iM16531, "Can not find ArscType with id of "));
                }
                c23536.m51996(new C6393(c23536, c5896, c1993M6524));
            }
            int i4 = c1993M6524.f6675 + c1993M6524.f6673;
            if (i4 >= i) {
                c5896.m16533(i);
                return;
            } else {
                c5896.m16533(i4);
                c1993M6524 = C1993.m6523(c5896);
            }
        }
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ۗ */
    public final int mo12851() {
        return this.f54632.size();
    }

    @Override // l.InterfaceC4277
    public final InterfaceC0748 getType(int i) {
        return (C23535) this.f54632.get(i);
    }

    @Override // l.AbstractC8343, l.InterfaceC4277
    public final InterfaceC0748 getType(String str) {
        return (C23535) super.getType(str);
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ۠֫ */
    public final int mo12854() {
        return this.f54626.size();
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC9216 mo12849(int i) {
        return (C14153) this.f54626.get(i);
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ֡ */
    public final int mo12844() {
        return this.f54631.size();
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC16270 mo12856(int i) {
        return (C7804) this.f54631.get(i);
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ֨֫ */
    public final int mo12846() {
        return this.f54627.size();
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC19094 mo12852(int i) {
        return (C17185) this.f54627.get(i);
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ۜۧ */
    public final List mo12853() {
        return this.f54629;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List m41858() {
        return this.f54628;
    }

    @Override // l.AbstractC8343, l.InterfaceC4277
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9922 mo12847() {
        return (C23326) super.mo12847();
    }

    @Override // l.AbstractC8343, l.InterfaceC4277
    /* JADX INFO: renamed from: ֫ */
    public final C23326 mo12847() {
        return (C23326) super.mo12847();
    }
}
