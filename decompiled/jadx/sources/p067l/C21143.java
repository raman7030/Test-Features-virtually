package p067l;

import android.graphics.Matrix;
import android.graphics.Paint;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBKO */
/* JADX INFO: loaded from: classes5.dex */
public final class C21143 extends AbstractC3036 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f66435;

    /* JADX INFO: renamed from: ۜ */
    public float f66436;

    /* JADX INFO: renamed from: ۡ */
    public float f66437;

    /* JADX INFO: renamed from: ۢ */
    public float f66438;

    /* JADX INFO: renamed from: ۧ */
    public String f66439;

    /* JADX INFO: renamed from: ܳ */
    public float f66440;

    /* JADX INFO: renamed from: ܽ */
    public final Matrix f66441;

    /* JADX INFO: renamed from: ܿ */
    public float f66442;

    /* JADX INFO: renamed from: ᩳ */
    public float f66443;

    /* JADX INFO: renamed from: ᩷ */
    public final Matrix f66444;

    /* JADX INFO: renamed from: ᩻ */
    public float f66445;

    public C21143(C21143 c21143, C0977 c0977) {
        AbstractC7731 c6390;
        this.f66444 = new Matrix();
        this.f66435 = new ArrayList();
        this.f66440 = 0.0f;
        this.f66443 = 0.0f;
        this.f66442 = 0.0f;
        this.f66445 = 1.0f;
        this.f66436 = 1.0f;
        this.f66438 = 0.0f;
        this.f66437 = 0.0f;
        Matrix matrix = new Matrix();
        this.f66441 = matrix;
        this.f66439 = null;
        this.f66440 = c21143.f66440;
        this.f66443 = c21143.f66443;
        this.f66442 = c21143.f66442;
        this.f66445 = c21143.f66445;
        this.f66436 = c21143.f66436;
        this.f66438 = c21143.f66438;
        this.f66437 = c21143.f66437;
        String str = c21143.f66439;
        this.f66439 = str;
        if (str != null) {
            c0977.put(str, this);
        }
        matrix.set(c21143.f66441);
        ArrayList arrayList = c21143.f66435;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C21143) {
                this.f66435.add(new C21143((C21143) obj, c0977));
            } else {
                if (!(obj instanceof C20472)) {
                    if (!(obj instanceof C6390)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    c6390 = new C6390((C6390) obj);
                } else {
                    C20472 c20472 = (C20472) obj;
                    C20472 c20473 = new C20472(c20472);
                    c20473.f63218 = 0.0f;
                    c20473.f63222 = 1.0f;
                    c20473.f63219 = 1.0f;
                    c20473.f63220 = 0.0f;
                    c20473.f63212 = 1.0f;
                    c20473.f63213 = 0.0f;
                    c20473.f63221 = Paint.Cap.BUTT;
                    c20473.f63216 = Paint.Join.MITER;
                    c20473.f63215 = 4.0f;
                    c20473.f63214 = c20472.f63214;
                    c20473.f63218 = c20472.f63218;
                    c20473.f63222 = c20472.f63222;
                    c20473.f63217 = c20472.f63217;
                    c20473.f20266 = c20472.f20266;
                    c20473.f63219 = c20472.f63219;
                    c20473.f63220 = c20472.f63220;
                    c20473.f63212 = c20472.f63212;
                    c20473.f63213 = c20472.f63213;
                    c20473.f63221 = c20472.f63221;
                    c20473.f63216 = c20472.f63216;
                    c20473.f63215 = c20472.f63215;
                    c6390 = c20473;
                }
                this.f66435.add(c6390);
                Object obj2 = c6390.f20269;
                if (obj2 != null) {
                    c0977.put(obj2, c6390);
                }
            }
        }
    }

    public C21143() {
        this.f66444 = new Matrix();
        this.f66435 = new ArrayList();
        this.f66440 = 0.0f;
        this.f66443 = 0.0f;
        this.f66442 = 0.0f;
        this.f66445 = 1.0f;
        this.f66436 = 1.0f;
        this.f66438 = 0.0f;
        this.f66437 = 0.0f;
        this.f66441 = new Matrix();
        this.f66439 = null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m47763() {
        return this.f66439;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47762(XmlResourceParserC12128 xmlResourceParserC12128, C14281 c14281) {
        C16858 c16858M51122 = C22895.m51122(xmlResourceParserC12128, C5070.f11873, c14281);
        float fM38373 = this.f66440;
        if (xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "rotation") != null) {
            fM38373 = c16858M51122.m38373(fM38373, 5);
        }
        this.f66440 = fM38373;
        this.f66443 = c16858M51122.m38373(this.f66443, 1);
        this.f66442 = c16858M51122.m38373(this.f66442, 2);
        float fM38374 = this.f66445;
        if (xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "scaleX") != null) {
            fM38374 = c16858M51122.m38373(fM38374, 3);
        }
        this.f66445 = fM38374;
        float fM38375 = this.f66436;
        if (xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "scaleY") != null) {
            fM38375 = c16858M51122.m38373(fM38375, 4);
        }
        this.f66436 = fM38375;
        float fM38376 = this.f66438;
        if (xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "translateX") != null) {
            fM38376 = c16858M51122.m38373(fM38376, 6);
        }
        this.f66438 = fM38376;
        float fM38377 = this.f66437;
        if (xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "translateY") != null) {
            fM38377 = c16858M51122.m38373(fM38377, 7);
        }
        this.f66437 = fM38377;
        String strM38370 = c16858M51122.m38370(0);
        if (strM38370 != null) {
            this.f66439 = strM38370;
        }
        Matrix matrix = this.f66441;
        matrix.reset();
        matrix.postTranslate(-this.f66443, -this.f66442);
        matrix.postScale(this.f66445, this.f66436);
        matrix.postRotate(this.f66440, 0.0f, 0.0f);
        matrix.postTranslate(this.f66438 + this.f66443, this.f66437 + this.f66442);
    }

    @Override // p067l.AbstractC3036
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5133() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f66435;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC3036) arrayList.get(i)).mo5133()) {
                return true;
            }
            i++;
        }
    }

    @Override // p067l.AbstractC3036
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5134(int[] iArr) {
        int i = 0;
        boolean zMo5134 = false;
        while (true) {
            ArrayList arrayList = this.f66435;
            if (i >= arrayList.size()) {
                return zMo5134;
            }
            zMo5134 |= ((AbstractC3036) arrayList.get(i)).mo5134(iArr);
            i++;
        }
    }
}
