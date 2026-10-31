package l;

import android.graphics.Matrix;
import android.graphics.Paint;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBKO */
/* JADX INFO: loaded from: classes5.dex */
public final class C19754 extends AbstractC0702 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f63800;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f63801;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f63802;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f63803;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f63804;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f63805;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Matrix f63806;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f63807;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f63808;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Matrix f63809;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f63810;

    public C19754(C19754 c19754, C2727 c2727) {
        AbstractC5642 c4231;
        this.f63809 = new Matrix();
        this.f63800 = new ArrayList();
        this.f63805 = 0.0f;
        this.f63808 = 0.0f;
        this.f63807 = 0.0f;
        this.f63810 = 1.0f;
        this.f63801 = 1.0f;
        this.f63803 = 0.0f;
        this.f63802 = 0.0f;
        Matrix matrix = new Matrix();
        this.f63806 = matrix;
        this.f63804 = null;
        this.f63805 = c19754.f63805;
        this.f63808 = c19754.f63808;
        this.f63807 = c19754.f63807;
        this.f63810 = c19754.f63810;
        this.f63801 = c19754.f63801;
        this.f63803 = c19754.f63803;
        this.f63802 = c19754.f63802;
        String str = c19754.f63804;
        this.f63804 = str;
        if (str != null) {
            c2727.put(str, this);
        }
        matrix.set(c19754.f63806);
        ArrayList arrayList = c19754.f63800;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C19754) {
                this.f63800.add(new C19754((C19754) obj, c2727));
            } else {
                if (!(obj instanceof C19048)) {
                    if (!(obj instanceof C4231)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    c4231 = new C4231((C4231) obj);
                } else {
                    C19048 c19048 = (C19048) obj;
                    C19048 c19049 = new C19048(c19048);
                    c19049.f59989 = 0.0f;
                    c19049.f59993 = 1.0f;
                    c19049.f59990 = 1.0f;
                    c19049.f59991 = 0.0f;
                    c19049.f59983 = 1.0f;
                    c19049.f59984 = 0.0f;
                    c19049.f59992 = Paint.Cap.BUTT;
                    c19049.f59987 = Paint.Join.MITER;
                    c19049.f59986 = 4.0f;
                    c19049.f59985 = c19048.f59985;
                    c19049.f59989 = c19048.f59989;
                    c19049.f59993 = c19048.f59993;
                    c19049.f59988 = c19048.f59988;
                    c19049.f17420 = c19048.f17420;
                    c19049.f59990 = c19048.f59990;
                    c19049.f59991 = c19048.f59991;
                    c19049.f59983 = c19048.f59983;
                    c19049.f59984 = c19048.f59984;
                    c19049.f59992 = c19048.f59992;
                    c19049.f59987 = c19048.f59987;
                    c19049.f59986 = c19048.f59986;
                    c4231 = c19049;
                }
                this.f63800.add(c4231);
                Object obj2 = c4231.f17423;
                if (obj2 != null) {
                    c2727.put(obj2, c4231);
                }
            }
        }
    }

    public C19754() {
        this.f63809 = new Matrix();
        this.f63800 = new ArrayList();
        this.f63805 = 0.0f;
        this.f63808 = 0.0f;
        this.f63807 = 0.0f;
        this.f63810 = 1.0f;
        this.f63801 = 1.0f;
        this.f63803 = 0.0f;
        this.f63802 = 0.0f;
        this.f63806 = new Matrix();
        this.f63804 = null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m45456() {
        return this.f63804;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45455(XmlResourceParserC10269 xmlResourceParserC10269, C12534 c12534) {
        C15246 c15246M48775 = C21598.m48775(xmlResourceParserC10269, C2842.f9076, c12534);
        float fM36212 = this.f63805;
        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "rotation") != null) {
            fM36212 = c15246M48775.m36212(fM36212, 5);
        }
        this.f63805 = fM36212;
        this.f63808 = c15246M48775.m36212(this.f63808, 1);
        this.f63807 = c15246M48775.m36212(this.f63807, 2);
        float fM36213 = this.f63810;
        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "scaleX") != null) {
            fM36213 = c15246M48775.m36212(fM36213, 3);
        }
        this.f63810 = fM36213;
        float fM36214 = this.f63801;
        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "scaleY") != null) {
            fM36214 = c15246M48775.m36212(fM36214, 4);
        }
        this.f63801 = fM36214;
        float fM36215 = this.f63803;
        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "translateX") != null) {
            fM36215 = c15246M48775.m36212(fM36215, 6);
        }
        this.f63803 = fM36215;
        float fM36216 = this.f63802;
        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "translateY") != null) {
            fM36216 = c15246M48775.m36212(fM36216, 7);
        }
        this.f63802 = fM36216;
        String strM36209 = c15246M48775.m36209(0);
        if (strM36209 != null) {
            this.f63804 = strM36209;
        }
        Matrix matrix = this.f63806;
        matrix.reset();
        matrix.postTranslate(-this.f63808, -this.f63807);
        matrix.postScale(this.f63810, this.f63801);
        matrix.postRotate(this.f63805, 0.0f, 0.0f);
        matrix.postTranslate(this.f63803 + this.f63808, this.f63802 + this.f63807);
    }

    @Override // l.AbstractC0702
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2788() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f63800;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC0702) arrayList.get(i)).mo2788()) {
                return true;
            }
            i++;
        }
    }

    @Override // l.AbstractC0702
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2789(int[] iArr) {
        int i = 0;
        boolean zMo2789 = false;
        while (true) {
            ArrayList arrayList = this.f63800;
            if (i >= arrayList.size()) {
                return zMo2789;
            }
            zMo2789 |= ((AbstractC0702) arrayList.get(i)).mo2789(iArr);
            i++;
        }
    }
}
