package p067l;

import android.os.Build;

/* JADX INFO: renamed from: l.ۧܽ */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes4.dex */
public class C1393 implements InterfaceC18749 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ActivityC2023 f36344;

    public C1393(ActivityC2023 activityC2023) {
        this.f36344 = activityC2023;
    }

    @Override // p067l.InterfaceC18749
    /* JADX INFO: renamed from: ֫ */
    public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
        if (enumC24133 != EnumC24133.ON_CREATE || Build.VERSION.SDK_INT < 33) {
            return;
        }
        this.f36344.f79810.m30942(C1673.m41660((ActivityC2023) interfaceC24784));
    }
}
