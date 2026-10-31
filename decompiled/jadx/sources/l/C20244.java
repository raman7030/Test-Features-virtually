package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S50A */
/* JADX INFO: loaded from: classes5.dex */
public final class C20244 extends C19749 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f65451;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19277 f65452;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC16009 f65453;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4205 f65454;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10366 f65455;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20244(C4205 c4205, C4205 c4206, C10366 c10366, InterfaceC16009 interfaceC16009, C19277 c19277) {
        super(c4205);
        this.f65454 = c4206;
        this.f65455 = c10366;
        this.f65453 = interfaceC16009;
        this.f65452 = c19277;
    }

    @Override // l.C19749
    /* JADX INFO: renamed from: ֫ */
    public final C16904 mo12698(String str, String str2, String[] strArr, int i) {
        C4205 c4205 = this.f65454;
        ArrayList arrayList = c4205.f13672;
        if (arrayList.size() >= 1000) {
            String str3 = this.f65451;
            int iLastIndexOf = str.lastIndexOf(47);
            if (iLastIndexOf != str.lastIndexOf(47)) {
                this.f65455.m4034(c4205, this.f65453, this.f65452);
                arrayList.clear();
                break;
            }
            for (int i2 = 0; i2 < iLastIndexOf; i2++) {
                if (str.charAt(i2) != str3.charAt(i2)) {
                    this.f65455.m4034(c4205, this.f65453, this.f65452);
                    arrayList.clear();
                    break;
                }
            }
        }
        this.f65451 = str;
        return super.mo12698(str, str2, strArr, i);
    }

    @Override // l.C19749
    /* JADX INFO: renamed from: ֫ */
    public final void mo45453() {
        C4205 c4205 = this.f65454;
        ArrayList arrayList = c4205.f13672;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f65455.m4034(c4205, this.f65453, this.f65452);
        arrayList.clear();
    }
}
