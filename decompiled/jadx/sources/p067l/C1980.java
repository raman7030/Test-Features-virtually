package p067l;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: l.᩺ۧ */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes.dex */
public class C1980 implements InterfaceC18749 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ActivityC2023 f76649;

    public C1980(ActivityC2023 activityC2023) {
        this.f76649 = activityC2023;
    }

    @Override // p067l.InterfaceC18749
    /* JADX INFO: renamed from: ֫ */
    public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
        if (enumC24133 == EnumC24133.ON_STOP) {
            Window window = this.f76649.getWindow();
            View viewPeekDecorView = window != null ? window.peekDecorView() : null;
            if (viewPeekDecorView != null) {
                viewPeekDecorView.cancelPendingInputEvents();
            }
        }
    }
}
