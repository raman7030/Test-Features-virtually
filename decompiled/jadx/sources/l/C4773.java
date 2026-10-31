package l;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;

/* JADX INFO: renamed from: l.ۙܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45G7 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4773 implements InterfaceC15564, InterfaceC5198 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15145;

    public /* synthetic */ C4773(Object obj) {
        this.f15145 = obj;
    }

    @Override // l.InterfaceC5198
    public boolean perform(View view, AbstractC9432 abstractC9432) {
        return ((BottomSheetDragHandleView) this.f15145).lambda$onBottomSheetStateChanged$0(view, abstractC9432);
    }

    @Override // l.InterfaceC15564
    /* JADX INFO: renamed from: ֫ */
    public boolean mo10274(String str) {
        return ((String) this.f15145).equals(str);
    }
}
