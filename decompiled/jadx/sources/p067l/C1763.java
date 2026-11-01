package p067l;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ᩴۛ */
/* JADX INFO: compiled from: I96L */
/* JADX INFO: loaded from: classes4.dex */
public final class C1763 {

    /* JADX INFO: renamed from: ֫ */
    public final Context f60829;

    /* JADX INFO: renamed from: ۜ */
    public VelocityTracker f60830;

    /* JADX INFO: renamed from: ܽ */
    public float f60833;

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC1798 f60836;

    /* JADX INFO: renamed from: ᩳ */
    public int f60835 = -1;

    /* JADX INFO: renamed from: ܳ */
    public int f60832 = -1;

    /* JADX INFO: renamed from: ܿ */
    public int f60834 = -1;

    /* JADX INFO: renamed from: ۧ */
    public final int[] f60831 = {Integer.MAX_VALUE, 0};

    public C1763(Context context, InterfaceC1798 interfaceC1798) {
        this.f60829 = context;
        this.f60836 = interfaceC1798;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9  */
    /* JADX INFO: renamed from: ֫ */
    public final void m45381(MotionEvent motionEvent, int i) {
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i2 = this.f60832;
        int[] iArr = this.f60831;
        if (i2 == source && this.f60834 == deviceId && this.f60835 == i) {
            z = false;
        } else {
            Context context = this.f60829;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            int i3 = C1892.f70931;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 34) {
                scaledMinimumFlingVelocity = C1192.m21002(viewConfiguration, deviceId2, i, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i, source2) == null) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    C12826.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    }
                }
            }
            iArr[0] = scaledMinimumFlingVelocity;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i4 >= 34) {
                scaledMaximumFlingVelocity = C1192.m21001(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 == null || device2.getMotionRange(i, source3) == null) {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    C12826.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            this.f60832 = source;
            this.f60834 = deviceId;
            this.f60835 = i;
            z = true;
        }
        if (iArr[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f60830;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f60830 = null;
                return;
            }
            return;
        }
        if (this.f60830 == null) {
            this.f60830 = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.f60830;
        C1806.m47070(velocityTracker2, motionEvent);
        C1806.m47069(velocityTracker2);
        float fM47068 = C1806.m47068(velocityTracker2, i);
        InterfaceC1798 interfaceC1798 = this.f60836;
        float fMo9468 = interfaceC1798.mo9468() * fM47068;
        float fSignum = Math.signum(fMo9468);
        if (z || (fSignum != Math.signum(this.f60833) && fSignum != 0.0f)) {
            interfaceC1798.mo9470();
        }
        if (Math.abs(fMo9468) < iArr[0]) {
            return;
        }
        int i5 = iArr[1];
        float fMax = Math.max(-i5, Math.min(fMo9468, i5));
        this.f60833 = interfaceC1798.mo9469(fMax) ? fMax : 0.0f;
    }
}
