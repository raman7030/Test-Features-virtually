package l;

import android.os.Build;

/* JADX INFO: renamed from: l.ۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes4.dex */
public class C11110 implements InterfaceC17236 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC23809 f33344;

    public C11110(ActivityC23809 activityC23809) {
        this.f33344 = activityC23809;
    }

    @Override // l.InterfaceC17236
    /* JADX INFO: renamed from: ֫ */
    public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
        if (enumC22901 != EnumC22901.ON_CREATE || Build.VERSION.SDK_INT < 33) {
            return;
        }
        this.f33344.f77059.m28893(C16753.m39424((ActivityC23809) interfaceC23586));
    }
}
