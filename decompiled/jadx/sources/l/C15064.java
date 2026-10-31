package l;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܶۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8NK */
/* JADX INFO: loaded from: classes4.dex */
public final class C15064 implements InterfaceC22618, InterfaceC20711 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public SurfaceTexture f46006;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f46009;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f46010;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f46011 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f46007 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C0954 f46008 = new C0954();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C8716 f46012 = new C8716();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C20537 f46004 = new C20537();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C20537 f46002 = new C20537();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float[] f46005 = new float[16];

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final float[] f46013 = new float[16];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f46003 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SurfaceTexture m35633() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            C3728.m11335();
            this.f46008.m3380();
            C3728.m11335();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            C3728.m11335();
            int i = iArr[0];
            C3728.m11336(36197, i);
            this.f46009 = i;
        } catch (C2317 e) {
            C19956.m46034("Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f46009);
        this.f46006 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: l.۠ۜۧ
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f24737.f46011.set(true);
            }
        });
        return this.f46006;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35634(float[] fArr) {
        GLES20.glClear(16384);
        try {
            C3728.m11335();
        } catch (C2317 e) {
            C19956.m46034("Failed to draw a frame", e);
        }
        boolean zCompareAndSet = this.f46011.compareAndSet(true, false);
        C0954 c0954 = this.f46008;
        if (zCompareAndSet) {
            SurfaceTexture surfaceTexture = this.f46006;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                C3728.m11335();
            } catch (C2317 e2) {
                C19956.m46034("Failed to draw a frame", e2);
            }
            boolean zCompareAndSet2 = this.f46007.compareAndSet(true, false);
            float[] fArr2 = this.f46005;
            if (zCompareAndSet2) {
                Matrix.setIdentityM(fArr2, 0);
            }
            long timestamp = this.f46006.getTimestamp();
            Long l2 = (Long) this.f46004.m47024(timestamp);
            if (l2 != null) {
                this.f46012.m22519(l2.longValue(), fArr2);
            }
            C19300 c19300 = (C19300) this.f46002.m47028(timestamp);
            if (c19300 != null) {
                c0954.m3382(c19300);
            }
        }
        Matrix.multiplyMM(this.f46013, 0, fArr, 0, this.f46005, 0);
        c0954.m3381(this.f46009, this.f46013);
    }

    @Override // l.InterfaceC22618
    /* JADX INFO: renamed from: ֫ */
    public final void mo24148(long j, long j2, C8353 c8353, MediaFormat mediaFormat) {
        float[] fArr;
        C15064 c15064 = this;
        c15064.f46004.m47026(j2, Long.valueOf(j));
        byte[] bArr = c8353.f25618;
        int i = c8353.f25626;
        byte[] bArr2 = c15064.f46010;
        int i2 = c15064.f46003;
        c15064.f46010 = bArr;
        if (i == -1) {
            i = 0;
        }
        c15064.f46003 = i;
        if (i2 == i && Arrays.equals(bArr2, bArr)) {
            return;
        }
        byte[] bArr3 = c15064.f46010;
        C19300 c19300M1506 = bArr3 != null ? C0248.m1506(c15064.f46003, bArr3) : null;
        if (c19300M1506 == null || !C0954.m3379(c19300M1506)) {
            int i3 = c15064.f46003;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            int i4 = 36;
            float f = radians / 36;
            float f2 = radians2 / 72;
            float[] fArr2 = new float[15984];
            float[] fArr3 = new float[10656];
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < i4) {
                float f3 = radians / 2.0f;
                float f4 = (i5 * f) - f3;
                int i8 = i5 + 1;
                float f5 = (i8 * f) - f3;
                int i9 = 0;
                while (i9 < 73) {
                    int i10 = 0;
                    int i11 = i8;
                    while (i10 < 2) {
                        float f6 = i9 * f2;
                        float f7 = f2;
                        int i12 = i3;
                        float f8 = radians;
                        double d = 50.0f;
                        float f9 = f;
                        double d2 = (3.1415927f + f6) - (radians2 / 2.0f);
                        int i13 = i9;
                        double d3 = i10 == 0 ? f4 : f5;
                        float[] fArr4 = fArr3;
                        int i14 = i5;
                        fArr2[i6] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                        fArr2[i6 + 1] = (float) (Math.sin(d3) * d);
                        int i15 = i6 + 3;
                        fArr2[i6 + 2] = (float) (Math.cos(d3) * Math.cos(d2) * d);
                        fArr4[i7] = f6 / radians2;
                        int i16 = i7 + 2;
                        fArr4[i7 + 1] = ((i14 + i10) * f9) / f8;
                        if ((i13 == 0 && i10 == 0) || (i13 == 72 && i10 == 1)) {
                            System.arraycopy(fArr2, i6, fArr2, i15, 3);
                            i6 += 6;
                            fArr = fArr4;
                            System.arraycopy(fArr, i7, fArr, i16, 2);
                            i7 += 4;
                        } else {
                            fArr = fArr4;
                            i6 = i15;
                            i7 = i16;
                        }
                        i10++;
                        f2 = f7;
                        fArr3 = fArr;
                        i9 = i13;
                        i3 = i12;
                        radians = f8;
                        f = f9;
                        i5 = i14;
                    }
                    i9++;
                    i8 = i11;
                }
                i4 = 36;
                i5 = i8;
            }
            C3777 c3777 = new C3777(new C18594(0, 1, fArr2, fArr3));
            c15064 = this;
            c19300M1506 = new C19300(c3777, c3777, i3);
        }
        c15064.f46002.m47026(j2, c19300M1506);
    }

    @Override // l.InterfaceC20711
    /* JADX INFO: renamed from: ֫ */
    public final void mo24149(long j, float[] fArr) {
        this.f46012.m22520(j, fArr);
    }

    @Override // l.InterfaceC20711
    /* JADX INFO: renamed from: ܽ */
    public final void mo24150() {
        this.f46004.m47025();
        this.f46012.m22518();
        this.f46007.set(true);
    }
}
