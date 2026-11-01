package p067l;

import android.content.ContextWrapper;
import android.os.Build;

/* JADX INFO: renamed from: l.۫ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 08PI */
/* JADX INFO: loaded from: classes4.dex */
public final class C14191 implements InterfaceC15531 {

    /* JADX INFO: renamed from: ֫ */
    public final ContextWrapper f40452;

    public C14191(ContextWrapper contextWrapper) {
        this.f40452 = contextWrapper;
    }

    @Override // p067l.InterfaceC15531
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC12676 mo15126(C24249 c24249) {
        ContextWrapper contextWrapper;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && (i >= 31 || ((contextWrapper = this.f40452) != null && i >= 28 && contextWrapper.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int iM26822 = C11669.m26822(c24249.f76843.f28528);
            C21334.m48349("Creating an asynchronous MediaCodec adapter for track type " + C5792.m13021(iM26822));
            return new C10168(new C7486(iM26822), new C3462(iM26822)).mo15126(c24249);
        }
        return new C6640().mo15126(c24249);
    }
}
