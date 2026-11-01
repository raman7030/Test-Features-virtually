package p067l;

/* JADX INFO: renamed from: l.᩹ۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC23533 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ServiceC5428 f74970;

    public RunnableC23533(ServiceC5428 serviceC5428) {
        this.f74970 = serviceC5428;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        ServiceC5428 serviceC5428 = this.f74970;
        serviceC5428.f12931.getLocationOnScreen(iArr);
        if (iArr[0] == 0 && iArr[1] == 0) {
            C7050.m16213(this, 50L);
            return;
        }
        int[] iArr2 = new int[2];
        serviceC5428.f12931.m23439(iArr2);
        serviceC5428.f12937.left = iArr[0] - iArr2[0];
        serviceC5428.f12937.top = iArr[1] - iArr2[1];
        serviceC5428.f12937.right = serviceC5428.f12937.left + serviceC5428.f12942.x;
        serviceC5428.f12937.bottom = serviceC5428.f12937.top + serviceC5428.f12942.y;
        serviceC5428.m11910((serviceC5428.f12931.getWidth() / 2) + iArr[0], (serviceC5428.f12931.getHeight() / 2) + iArr[1]);
        serviceC5428.f12930.m23434();
        serviceC5428.f12931.m23437((C2745) null);
    }
}
