package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U1KY */
/* JADX INFO: loaded from: classes3.dex */
public final class C5407 implements InterfaceC0467 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f16875;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f16876;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f16877;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f16878;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f16879;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f16880;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f16881;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f16882;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f16883;

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo15478(boolean z) {
        return z ? mo15487() : mo15485();
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo15483(boolean z) {
        return z ? mo15477() : mo15489();
    }

    public C5407(InterfaceC0467 interfaceC0467, List list) {
        this(interfaceC0467.mo2065(), interfaceC0467.mo2063(), interfaceC0467.mo2068(), interfaceC0467.mo2072(), interfaceC0467.mo15487(), interfaceC0467.mo15477(), interfaceC0467.mo15485(), interfaceC0467.mo15489(), list);
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo15481(int i, boolean z) {
        if (z) {
            mo15486(i);
        } else {
            mo15482(i);
        }
    }

    @Override // l.InterfaceC0467
    /* JADX INFO: renamed from: ۧ */
    public final int mo2066(boolean z) {
        return z ? mo2065() : mo2068();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    public C5407(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List list) {
        this.f16878 = i;
        this.f16875 = i2;
        this.f16883 = i3;
        this.f16877 = i4;
        this.f16876 = i5;
        this.f16879 = i6;
        this.f16882 = i7;
        this.f16881 = i8;
        int i9 = i6 - i5;
        int i10 = i8 - i7;
        if (list != null) {
            int size = list.size();
            if (size == 0) {
                list = null;
            } else if (size == 1) {
                InterfaceC18813 interfaceC18813 = (InterfaceC18813) list.get(0);
                if (interfaceC18813.mo15487() == 0 && interfaceC18813.mo15485() == 0 && interfaceC18813.mo15477() == i9 && interfaceC18813.mo15489() == i10) {
                    list = null;
                }
            }
        }
        this.f16880 = list;
        if (this.f16878 == this.f16875 && this.f16883 == this.f16877) {
            System.err.println("LineFragmentImpl should not be empty: " + toString());
        }
        if (this.f16878 > this.f16875 || this.f16883 > this.f16877 || this.f16876 > this.f16879 || this.f16882 > this.f16881) {
            System.err.println("LineFragmentImpl is invalid: " + toString());
        }
    }

    @Override // l.InterfaceC0467
    /* JADX INFO: renamed from: ᩳ */
    public final int mo2070(boolean z) {
        return z ? mo2063() : mo2072();
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo15488(int i, boolean z) {
        if (z) {
            mo15484(i);
        } else {
            mo15480(i);
        }
    }

    @Override // l.InterfaceC0467
    /* JADX INFO: renamed from: ֫ */
    public final void mo2061(int i, boolean z) {
        if (z) {
            mo2064(i);
        } else {
            mo2073(i);
        }
    }

    public C5407(C12951 c12951) {
        this.f16878 = c12951.readInt();
        this.f16875 = c12951.readInt();
        this.f16883 = c12951.readInt();
        this.f16877 = c12951.readInt();
        this.f16876 = c12951.readInt();
        this.f16879 = c12951.readInt();
        this.f16882 = c12951.readInt();
        this.f16881 = c12951.readInt();
        if (c12951.m31498()) {
            int i = c12951.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C19519(c12951));
            }
            this.f16880 = arrayList;
        }
    }

    @Override // l.InterfaceC0467
    /* JADX INFO: renamed from: ۧ */
    public final int mo2065() {
        return this.f16878;
    }

    @Override // l.InterfaceC0467
    /* JADX INFO: renamed from: ۜ */
    public final int mo2063() {
        return this.f16875;
    }

    @Override // l.InterfaceC0467
    /* JADX INFO: renamed from: ܽ */
    public final int mo2068() {
        return this.f16883;
    }

    @Override // l.InterfaceC0467
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2072() {
        return this.f16877;
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo15487() {
        return this.f16876;
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo15477() {
        return this.f16879;
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int mo15485() {
        return this.f16882;
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int mo15489() {
        return this.f16881;
    }

    @Override // l.InterfaceC0467
    /* JADX INFO: renamed from: ܽ */
    public final void mo2069(int i, boolean z) {
        if (z) {
            this.f16878 = i;
        } else {
            this.f16883 = i;
        }
    }

    @Override // l.InterfaceC0467
    /* JADX INFO: renamed from: ᩳ */
    public final void mo2071(int i) {
        this.f16878 = i;
    }

    @Override // l.InterfaceC0467
    /* JADX INFO: renamed from: ۜ */
    public final void mo2064(int i) {
        this.f16875 = i;
    }

    @Override // l.InterfaceC0467
    /* JADX INFO: renamed from: ֫ */
    public final void mo2060(int i) {
        this.f16883 = i;
    }

    @Override // l.InterfaceC0467
    /* JADX INFO: renamed from: ᩻ */
    public final void mo2073(int i) {
        this.f16877 = i;
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo15486(int i) {
        this.f16876 = i;
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo15484(int i) {
        this.f16879 = i;
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo15482(int i) {
        this.f16882 = i;
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo15480(int i) {
        this.f16881 = i;
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15479(C10130 c10130) {
        c10130.writeInt(this.f16878);
        c10130.writeInt(this.f16875);
        c10130.writeInt(this.f16883);
        c10130.writeInt(this.f16877);
        c10130.writeInt(this.f16876);
        c10130.writeInt(this.f16879);
        c10130.writeInt(this.f16882);
        c10130.writeInt(this.f16881);
        if (this.f16880 == null) {
            c10130.writeByte(0);
            return;
        }
        c10130.m25425(true);
        c10130.writeInt(this.f16880.size());
        Iterator it = this.f16880.iterator();
        while (it.hasNext()) {
            ((InterfaceC18813) it.next()).mo15479(c10130);
        }
    }

    @Override // l.InterfaceC0467
    /* JADX INFO: renamed from: ܳ */
    public final List mo2067() {
        return this.f16880;
    }

    @Override // l.InterfaceC0467
    /* JADX INFO: renamed from: ֫ */
    public final void mo2062(List list) {
        this.f16880 = list;
    }

    public final String toString() {
        return "LineFragmentImpl: Lines [" + this.f16878 + ", " + this.f16875 + ") - [" + this.f16883 + ", " + this.f16877 + "); Offsets [" + this.f16876 + ", " + this.f16879 + ") - [" + this.f16882 + ", " + this.f16881 + "); Inner " + this.f16880;
    }
}
