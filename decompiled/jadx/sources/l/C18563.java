package l;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ᩴۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: I96L */
/* JADX INFO: loaded from: classes4.dex */
public final class C18563 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context f57606;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public VelocityTracker f57607;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f57610;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC19269 f57613;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f57612 = -1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f57609 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f57611 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f57608 = {Integer.MAX_VALUE, 0};

    public C18563(Context context, InterfaceC19269 interfaceC19269) {
        this.f57606 = context;
        this.f57613 = interfaceC19269;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43103(MotionEvent motionEvent, int i) {
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i2 = this.f57609;
        int[] iArr = this.f57608;
        if (i2 == source && this.f57611 == deviceId && this.f57612 == i) {
            z = false;
        } else {
            Context context = this.f57606;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            int i3 = C21177.f68249;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 34) {
                scaledMinimumFlingVelocity = C7065.m19044(viewConfiguration, deviceId2, i, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i, source2) == null) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    C11003.requireNonNull(viewConfiguration);
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
                scaledMaximumFlingVelocity = C7065.m19043(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 == null || device2.getMotionRange(i, source3) == null) {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    C11003.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            this.f57609 = source;
            this.f57611 = deviceId;
            this.f57612 = i;
            z = true;
        }
        if (iArr[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f57607;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f57607 = null;
                return;
            }
            return;
        }
        if (this.f57607 == null) {
            this.f57607 = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.f57607;
        C19434.m44775(velocityTracker2, motionEvent);
        C19434.m44774(velocityTracker2);
        float fM44773 = C19434.m44773(velocityTracker2, i);
        InterfaceC19269 interfaceC19269 = this.f57613;
        float fMo7385 = interfaceC19269.mo7385() * fM44773;
        float fSignum = Math.signum(fMo7385);
        if (z || (fSignum != Math.signum(this.f57610) && fSignum != 0.0f)) {
            interfaceC19269.mo7387();
        }
        if (Math.abs(fMo7385) < iArr[0]) {
            return;
        }
        int i5 = iArr[1];
        float fMax = Math.max(-i5, Math.min(fMo7385, i5));
        this.f57610 = interfaceC19269.mo7386(fMax) ? fMax : 0.0f;
    }
}
