package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ۖ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5QL */
/* JADX INFO: loaded from: classes2.dex */
public final class C4773 {

    /* JADX INFO: renamed from: ֫ */
    public C10808 f10823;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC17512 f10824;

    public C4773(InterfaceC17512 interfaceC17512) {
        this.f10824 = interfaceC17512;
        C10808 c10808 = new C10808();
        c10808.f29955 = 0;
        this.f10823 = c10808;
    }

    /* JADX INFO: renamed from: ֫ */
    public final View m10074(int i, int i2, int i3, int i4) {
        InterfaceC17512 interfaceC17512 = this.f10824;
        int iMo8324 = interfaceC17512.mo8324();
        int iMo8326 = interfaceC17512.mo8326();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View childAt = interfaceC17512.getChildAt(i);
            int iMo8325 = interfaceC17512.mo8325(childAt);
            int iMo8327 = interfaceC17512.mo8327(childAt);
            C10808 c10808 = this.f10823;
            c10808.f29958 = iMo8324;
            c10808.f29959 = iMo8326;
            c10808.f29957 = iMo8325;
            c10808.f29956 = iMo8327;
            if (i3 != 0) {
                c10808.f29955 = i3;
                if (c10808.m24917()) {
                    return childAt;
                }
            }
            if (i4 != 0) {
                c10808.f29955 = i4;
                if (c10808.m24917()) {
                    view = childAt;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m10075(View view) {
        InterfaceC17512 interfaceC17512 = this.f10824;
        int iMo8324 = interfaceC17512.mo8324();
        int iMo8326 = interfaceC17512.mo8326();
        int iMo8325 = interfaceC17512.mo8325(view);
        int iMo8327 = interfaceC17512.mo8327(view);
        C10808 c10808 = this.f10823;
        c10808.f29958 = iMo8324;
        c10808.f29959 = iMo8326;
        c10808.f29957 = iMo8325;
        c10808.f29956 = iMo8327;
        c10808.f29955 = 24579;
        return c10808.m24917();
    }
}
