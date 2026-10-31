package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8N8 */
/* JADX INFO: loaded from: classes.dex */
public final class C22409 implements InterfaceC9546, InterfaceC18113 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final boolean f72617;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C8353 f72618;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8134 f72619;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public byte[] f72620;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC0486 f72621;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f72622;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f72623;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C8941 f72624;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC11058 f72625;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6181 f72626;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f72627;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC15097 f72628;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3104 f72629;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ArrayList f72630 = new ArrayList();

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫ */
    public final long mo11115(long j, C9599 c9599) {
        return j;
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫ */
    public final void mo11117(long j, boolean z) {
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ۧ */
    public final void mo2268(long j) {
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ܽ */
    public final long mo11122() {
        return -9223372036854775807L;
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ܿ */
    public final void mo11124() {
    }

    @Override // l.InterfaceC18113
    /* JADX INFO: renamed from: ֫ */
    public final C17407 mo12777(InterfaceC23757 interfaceC23757, long j, long j2, IOException iOException, int i) {
        C17407 c17407M23058;
        C18832 c18832 = ((C21704) interfaceC23757).f69616;
        c18832.getClass();
        C10957 c10957 = new C10957(j2, c18832.m43507());
        C3603.m11037(this.f72627);
        C1885 c1885 = new C1885(iOException, i);
        InterfaceC11058 interfaceC11058 = this.f72625;
        long jMo27441 = interfaceC11058.mo27441(c1885);
        boolean z = jMo27441 == -9223372036854775807L || i >= interfaceC11058.mo27440(1);
        if (this.f72617 && z) {
            C19956.m46036("Loading failed, treating as end-of-stream.", iOException);
            this.f72622 = true;
            c17407M23058 = C8941.f27182;
        } else if (jMo27441 != -9223372036854775807L) {
            c17407M23058 = C8941.m23058(jMo27441, false);
        } else {
            c17407M23058 = C8941.f27181;
        }
        C17407 c17407 = c17407M23058;
        this.f72619.m21593(c10957, 1, -1, this.f72618, 0, null, 0L, this.f72627, iOException, !c17407.m40761());
        return c17407;
    }

    @Override // l.InterfaceC18113
    /* JADX INFO: renamed from: ֫ */
    public final void mo12778(InterfaceC23757 interfaceC23757, long j, long j2) {
        C21704 c21704 = (C21704) interfaceC23757;
        this.f72623 = (int) c21704.f69616.m43508();
        byte[] bArr = c21704.f69618;
        bArr.getClass();
        this.f72620 = bArr;
        this.f72622 = true;
        C18832 c18832 = c21704.f69616;
        c18832.getClass();
        C10957 c10957 = new C10957(j2, c18832.m43507());
        this.f72625.getClass();
        this.f72619.m21596(c10957, 1, -1, this.f72618, 0, null, 0L, this.f72627);
    }

    @Override // l.InterfaceC18113
    /* JADX INFO: renamed from: ֫ */
    public final void mo12779(InterfaceC23757 interfaceC23757, long j, long j2, int i) {
        C10957 c10957;
        C21704 c21704 = (C21704) interfaceC23757;
        C18832 c18832 = c21704.f69616;
        if (i == 0) {
            c10957 = new C10957(c21704.f69617);
        } else {
            c18832.getClass();
            c10957 = new C10957(j2, c18832.m43507());
        }
        this.f72619.m21592(c10957, 1, -1, this.f72618, 0, null, 0L, this.f72627, i);
    }

    @Override // l.InterfaceC18113
    /* JADX INFO: renamed from: ֫ */
    public final void mo12780(InterfaceC23757 interfaceC23757, long j, long j2, boolean z) {
        C18832 c18832 = ((C21704) interfaceC23757).f69616;
        c18832.getClass();
        C10957 c10957 = new C10957(j2, c18832.m43507());
        this.f72625.getClass();
        this.f72619.m21591(c10957, 1, -1, null, 0, null, 0L, this.f72627);
    }

    public C22409(C3104 c3104, InterfaceC15097 interfaceC15097, InterfaceC0486 interfaceC0486, C8353 c8353, long j, InterfaceC11058 interfaceC11058, C8134 c8134, boolean z, InterfaceExecutorC8235 interfaceExecutorC8235) {
        C8941 c8941;
        this.f72629 = c3104;
        this.f72628 = interfaceC15097;
        this.f72621 = interfaceC0486;
        this.f72618 = c8353;
        this.f72627 = j;
        this.f72625 = interfaceC11058;
        this.f72619 = c8134;
        this.f72617 = z;
        this.f72626 = new C6181(new C13312("", c8353));
        if (interfaceExecutorC8235 != null) {
            c8941 = new C8941(interfaceExecutorC8235);
        } else {
            c8941 = new C8941("SingleSampleMediaPeriod");
        }
        this.f72624 = c8941;
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫ */
    public final void mo11121(InterfaceC20835 interfaceC20835, long j) {
        interfaceC20835.mo11120((InterfaceC9546) this);
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ᩻ */
    public final C6181 mo11126() {
        return this.f72626;
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫ */
    public final long mo11116(InterfaceC9731[] interfaceC9731Arr, boolean[] zArr, InterfaceC18882[] interfaceC18882Arr, boolean[] zArr2, long j) {
        for (int i = 0; i < interfaceC9731Arr.length; i++) {
            InterfaceC18882 interfaceC18882 = interfaceC18882Arr[i];
            ArrayList arrayList = this.f72630;
            if (interfaceC18882 != null && (interfaceC9731Arr[i] == null || !zArr[i])) {
                arrayList.remove(interfaceC18882);
                interfaceC18882Arr[i] = null;
            }
            if (interfaceC18882Arr[i] == null && interfaceC9731Arr[i] != null) {
                C15352 c15352 = new C15352(this);
                arrayList.add(c15352);
                interfaceC18882Arr[i] = c15352;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2265(C11469 c11469) {
        if (this.f72622) {
            return false;
        }
        C8941 c8941 = this.f72624;
        if (c8941.m23068() || c8941.m23067()) {
            return false;
        }
        InterfaceC21449 interfaceC21449Mo6247 = this.f72628.mo6247();
        InterfaceC0486 interfaceC0486 = this.f72621;
        if (interfaceC0486 != null) {
            interfaceC21449Mo6247.mo5937(interfaceC0486);
        }
        c8941.m23065(new C21704(interfaceC21449Mo6247, this.f72629), this, this.f72625.mo27440(1));
        return true;
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2264() {
        return this.f72624.m23068();
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ۧ */
    public final long mo2267() {
        return (this.f72622 || this.f72624.m23068()) ? Long.MIN_VALUE : 0L;
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ۜ */
    public final long mo2266() {
        return this.f72622 ? Long.MIN_VALUE : 0L;
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫ */
    public final long mo11114(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f72630;
            if (i >= arrayList.size()) {
                return j;
            }
            ((C15352) arrayList.get(i)).m36388();
            i++;
        }
    }
}
