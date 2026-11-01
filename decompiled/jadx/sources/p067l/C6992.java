package p067l;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۙ᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 85A3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6992 extends C2535 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C5651 f18211;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6992(C5651 c5651, C5651 c5652, EnumC16617 enumC16617) {
        super(c5652, enumC16617);
        this.f18211 = c5651;
    }

    @Override // p067l.AbstractC11925
    /* JADX INFO: renamed from: ֫ */
    public final int mo16104(int i) {
        this.f18211.f13742.getClass();
        int iM8981 = new C4350(this).m8981(i);
        C21745 c21745 = new C21745();
        ArrayList arrayList = this.f33192;
        Collections.sort(arrayList, c21745);
        this.f33194 = ((C13068) arrayList.get(0)).f18864;
        return iM8981;
    }
}
