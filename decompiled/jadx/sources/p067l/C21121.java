package p067l;

import android.graphics.Bitmap;
import com.google.android.material.navigation.DrawerLayoutUtils;
import java.util.Random;

/* JADX INFO: renamed from: l.᩵᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7NG */
/* JADX INFO: loaded from: classes4.dex */
public final class C21121 {

    /* JADX INFO: renamed from: ֫ */
    public final Bitmap f66384;

    /* JADX INFO: renamed from: ۧ */
    public final Bitmap f66385;

    public C21121(Random random) {
        float fNextInt;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f66385 = Bitmap.createBitmap(2, 2, config);
        this.f66384 = Bitmap.createBitmap(2, 2, config);
        if (random.nextBoolean()) {
            float fNextInt2 = random.nextInt(360);
            float[] fArr = {fNextInt2, 0.8f, 0.82f};
            m47744(0, 0, fArr);
            fArr[0] = ((95.0f + fNextInt2) + random.nextInt(20)) % 360.0f;
            fArr[1] = 0.98f;
            fArr[2] = 0.78f;
            m47744(1, 0, fArr);
            fArr[0] = ((325.0f + fNextInt2) + random.nextInt(20)) % 360.0f;
            fArr[1] = 1.0f;
            fArr[2] = 0.8f;
            m47744(0, 1, fArr);
            fArr[0] = ((fNextInt2 + 255.0f) + random.nextInt(20)) % 360.0f;
            fArr[1] = 1.0f;
            fArr[2] = 0.82f;
            m47744(1, 1, fArr);
            return;
        }
        do {
            fNextInt = random.nextInt(360);
            if (fNextInt < 290.0f) {
                break;
            }
        } while (fNextInt <= 330.0f);
        float[] fArr2 = {fNextInt, 0.86f, 0.74f};
        m47744(0, 0, fArr2);
        fArr2[0] = ((fNextInt + 1.0f) + random.nextInt(10)) % 360.0f;
        fArr2[1] = 0.72f;
        fArr2[2] = 0.8f;
        m47744(1, 0, fArr2);
        fArr2[0] = ((80.0f + fNextInt) + random.nextInt(20)) % 360.0f;
        fArr2[1] = 1.0f;
        fArr2[2] = 0.87f;
        m47744(0, 1, fArr2);
        fArr2[0] = ((fNextInt + 140.0f) + random.nextInt(20)) % 360.0f;
        fArr2[1] = 0.76f;
        fArr2[2] = 0.79f;
        m47744(1, 1, fArr2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final Bitmap m47746() {
        return this.f66385;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Bitmap m47745() {
        return this.f66384;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m47744(int i, int i2, float[] fArr) {
        int iM21216 = C1199.m21216(fArr);
        this.f66385.setPixel(i, i2, iM21216);
        this.f66384.setPixel(i, i2, C1199.m21221((iM21216 & 16777215) | DrawerLayoutUtils.DEFAULT_SCRIM_COLOR, -12434878));
    }
}
