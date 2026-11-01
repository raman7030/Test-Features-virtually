package p067l;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.᩹ۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69OZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23346 {

    /* JADX INFO: renamed from: ֫ */
    public int[] f73453 = null;

    /* JADX INFO: renamed from: ۧ */
    public Object f73454;

    /* JADX INFO: renamed from: ܳ */
    public boolean f73455;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f73456;

    /* JADX INFO: renamed from: ܿ */
    public EnumC7785 f73457;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f73458;

    public C23346(int i) {
        this.f73456 = new ArrayList(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52001(InterfaceC24548 interfaceC24548) {
        this.f73454 = interfaceC24548;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51999(EnumC7785 enumC7785) {
        C15671.m35602(enumC7785, "syntax");
        this.f73457 = enumC7785;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52002(boolean z) {
        this.f73458 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52003(int[] iArr) {
        this.f73453 = iArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52000(C17270 c17270) {
        if (this.f73455) {
            throw new IllegalStateException("Builder can only build once");
        }
        this.f73456.add(c17270);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21335 m51998() {
        if (this.f73455) {
            throw new IllegalStateException("Builder can only build once");
        }
        if (this.f73457 == null) {
            throw new IllegalStateException("Must specify a proto syntax");
        }
        this.f73455 = true;
        ArrayList arrayList = this.f73456;
        Collections.sort(arrayList);
        return new C21335(this.f73457, this.f73458, this.f73453, (C17270[]) arrayList.toArray(new C17270[0]), this.f73454);
    }
}
