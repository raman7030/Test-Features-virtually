package p067l;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܶۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8NK */
/* JADX INFO: loaded from: classes4.dex */
public final class C16685 implements InterfaceC23865, InterfaceC22052 {

    /* JADX INFO: renamed from: ۨ */
    public SurfaceTexture f49124;

    /* JADX INFO: renamed from: ܰ */
    public int f49127;

    /* JADX INFO: renamed from: ᩶ */
    public byte[] f49128;

    /* JADX INFO: renamed from: ᩸ */
    public final AtomicBoolean f49129 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۫ */
    public final AtomicBoolean f49125 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: ۬ */
    public final C3275 f49126 = new C3275();

    /* JADX INFO: renamed from: ᩹ */
    public final C10652 f49130 = new C10652();

    /* JADX INFO: renamed from: ۛ */
    public final C21886 f49122 = new C21886();

    /* JADX INFO: renamed from: ۗ */
    public final C21886 f49120 = new C21886();

    /* JADX INFO: renamed from: ۤ */
    public final float[] f49123 = new float[16];

    /* JADX INFO: renamed from: ᩺ */
    public final float[] f49131 = new float[16];

    /* JADX INFO: renamed from: ۙ */
    public int f49121 = -1;

    /* JADX INFO: renamed from: ֫ */
    public final SurfaceTexture m37791() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            C5911.m13287();
            this.f49126.m5699();
            C5911.m13287();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            C5911.m13287();
            int i = iArr[0];
            C5911.m13288(36197, i);
            this.f49127 = i;
        } catch (C4570 e) {
            C21334.m48348("Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f49127);
        this.f49124 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: l.۠ۜۧ
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f27651.f49129.set(true);
            }
        });
        return this.f49124;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37792(float[] fArr) {
        GLES20.glClear(16384);
        try {
            C5911.m13287();
        } catch (C4570 e) {
            C21334.m48348("Failed to draw a frame", e);
        }
        boolean zCompareAndSet = this.f49129.compareAndSet(true, false);
        C3275 c3275 = this.f49126;
        if (zCompareAndSet) {
            SurfaceTexture surfaceTexture = this.f49124;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                C5911.m13287();
            } catch (C4570 e2) {
                C21334.m48348("Failed to draw a frame", e2);
            }
            boolean zCompareAndSet2 = this.f49125.compareAndSet(true, false);
            float[] fArr2 = this.f49123;
            if (zCompareAndSet2) {
                Matrix.setIdentityM(fArr2, 0);
            }
            long timestamp = this.f49124.getTimestamp();
            Long l2 = (Long) this.f49122.m49347(timestamp);
            if (l2 != null) {
                this.f49130.m24488(l2.longValue(), fArr2);
            }
            C20711 c20711 = (C20711) this.f49120.m49351(timestamp);
            if (c20711 != null) {
                c3275.m5701(c20711);
            }
        }
        Matrix.multiplyMM(this.f49131, 0, fArr, 0, this.f49123, 0);
        c3275.m5700(this.f49127, this.f49131);
    }

    @Override // p067l.InterfaceC23865
    /* JADX INFO: renamed from: ֫ */
    public final void mo26158(long j, long j2, C10307 c10307, MediaFormat mediaFormat) {
        float[] fArr;
        C16685 c16685 = this;
        c16685.f49122.m49349(j2, Long.valueOf(j));
        byte[] bArr = c10307.f28532;
        int i = c10307.f28540;
        byte[] bArr2 = c16685.f49128;
        int i2 = c16685.f49121;
        c16685.f49128 = bArr;
        if (i == -1) {
            i = 0;
        }
        c16685.f49121 = i;
        if (i2 == i && Arrays.equals(bArr2, bArr)) {
            return;
        }
        byte[] bArr3 = c16685.f49128;
        C20711 c20711M3904 = bArr3 != null ? C2604.m3904(c16685.f49121, bArr3) : null;
        if (c20711M3904 == null || !C3275.m5698(c20711M3904)) {
            int i3 = c16685.f49121;
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
            C5958 c5958 = new C5958(new C20040(0, 1, fArr2, fArr3));
            c16685 = this;
            c20711M3904 = new C20711(c5958, c5958, i3);
        }
        c16685.f49120.m49349(j2, c20711M3904);
    }

    @Override // p067l.InterfaceC22052
    /* JADX INFO: renamed from: ֫ */
    public final void mo26159(long j, float[] fArr) {
        this.f49130.m24489(j, fArr);
    }

    @Override // p067l.InterfaceC22052
    /* JADX INFO: renamed from: ܽ */
    public final void mo26160() {
        this.f49122.m49348();
        this.f49130.m24487();
        this.f49125.set(true);
    }
}
