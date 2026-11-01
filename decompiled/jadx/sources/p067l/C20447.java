package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴ᩸ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H528 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20447 implements InterfaceC20467 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C21118 f63159;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ int f63160;

    public C20447(C21118 c21118, int i) {
        this.f63159 = c21118;
        this.f63160 = i;
    }

    @Override // p067l.InterfaceC20467
    /* JADX INFO: renamed from: ֫ */
    public final C13071 mo10691(String str, EnumC18254 enumC18254) {
        C21118 c21118 = this.f63159;
        List[] listArr = c21118.f66377;
        int i = this.f63160;
        List arrayList = listArr[i];
        if (arrayList == null) {
            arrayList = new ArrayList(5);
            c21118.f66377[i] = arrayList;
        }
        C13071 c13071 = new C13071(str, enumC18254);
        arrayList.add(c13071);
        return c13071;
    }
}
