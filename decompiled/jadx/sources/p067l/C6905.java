package p067l;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;

/* JADX INFO: renamed from: l.ۙܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45G7 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6905 implements InterfaceC17161, InterfaceC1100 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f17975;

    public /* synthetic */ C6905(Object obj) {
        this.f17975 = obj;
    }

    @Override // p067l.InterfaceC1100
    public boolean perform(View view, AbstractC1310 abstractC1310) {
        return ((BottomSheetDragHandleView) this.f17975).lambda$onBottomSheetStateChanged$0(view, abstractC1310);
    }

    @Override // p067l.InterfaceC17161
    /* JADX INFO: renamed from: ֫ */
    public boolean mo12311(String str) {
        return ((String) this.f17975).equals(str);
    }
}
