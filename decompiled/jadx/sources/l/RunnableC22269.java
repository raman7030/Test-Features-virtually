package l;

/* JADX INFO: renamed from: l.᩹ۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC22269 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC3219 f72247;

    public RunnableC22269(ServiceC3219 serviceC3219) {
        this.f72247 = serviceC3219;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        ServiceC3219 serviceC3219 = this.f72247;
        serviceC3219.f10125.getLocationOnScreen(iArr);
        if (iArr[0] == 0 && iArr[1] == 0) {
            C4925.m14316(this, 50L);
            return;
        }
        int[] iArr2 = new int[2];
        serviceC3219.f10125.m21471(iArr2);
        serviceC3219.f10131.left = iArr[0] - iArr2[0];
        serviceC3219.f10131.top = iArr[1] - iArr2[1];
        serviceC3219.f10131.right = serviceC3219.f10131.left + serviceC3219.f10136.x;
        serviceC3219.f10131.bottom = serviceC3219.f10131.top + serviceC3219.f10136.y;
        serviceC3219.m9863((serviceC3219.f10125.getWidth() / 2) + iArr[0], (serviceC3219.f10125.getHeight() / 2) + iArr[1]);
        serviceC3219.f10124.m21466();
        serviceC3219.f10125.m21469((C0396) null);
    }
}
