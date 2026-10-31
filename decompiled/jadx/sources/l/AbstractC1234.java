package l;

import com.umeng.analytics.pro.am;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨ܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B5N */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1234 implements InterfaceC6009 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final AbstractC5468 f4408;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final AbstractC5468 f4409;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final AbstractC5468 f4410;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final AbstractC5468 f4411 = new C14639("translationX");

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final AbstractC5468 f4412;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final AbstractC5468 f4413;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final AbstractC5468 f4414;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Object f4416;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC15344 f4422;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f4423;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f4417 = 0.0f;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f4418 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f4425 = false;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f4420 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f4421 = -3.4028235E38f;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f4419 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f4415 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f4424 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo4074(long j);

    static {
        new C23812("translationY");
        new C6879("translationZ");
        f4414 = new C20991("scaleX");
        f4408 = new C9702("scaleY");
        f4409 = new C8996("rotation");
        f4410 = new C16050("rotationX");
        f4413 = new C2646("rotationY");
        new C4057("x");
        new C1940("y");
        new C11113(am.aD);
        f4412 = new C16756("alpha");
        new C18168("scrollX");
        new C17462("scrollY");
    }

    public AbstractC1234(Object obj, AbstractC15344 abstractC15344) {
        this.f4416 = obj;
        this.f4422 = abstractC15344;
        if (abstractC15344 == f4409 || abstractC15344 == f4410 || abstractC15344 == f4413) {
            this.f4423 = 0.1f;
            return;
        }
        if (abstractC15344 == f4412) {
            this.f4423 = 0.00390625f;
        } else if (abstractC15344 == f4414 || abstractC15344 == f4408) {
            this.f4423 = 0.00390625f;
        } else {
            this.f4423 = 1.0f;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m4072(float f) {
        this.f4418 = f;
        this.f4425 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4070(InterfaceC19580 interfaceC19580) {
        ArrayList arrayList = this.f4415;
        if (arrayList.contains(interfaceC19580)) {
            return;
        }
        arrayList.add(interfaceC19580);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m4073(InterfaceC19580 interfaceC19580) {
        ArrayList arrayList = this.f4415;
        int iIndexOf = arrayList.indexOf(interfaceC19580);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    @Override // l.InterfaceC6009
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo4071(long j) {
        ArrayList arrayList;
        long j2 = this.f4419;
        int i = 0;
        if (j2 == 0) {
            this.f4419 = j;
            m4069(this.f4418);
            return false;
        }
        this.f4419 = j;
        boolean zMo4074 = mo4074(j - j2);
        float fMin = Math.min(this.f4418, Float.MAX_VALUE);
        this.f4418 = fMin;
        float fMax = Math.max(fMin, this.f4421);
        this.f4418 = fMax;
        m4069(fMax);
        if (zMo4074) {
            this.f4420 = false;
            ThreadLocal threadLocal = C7420.f22797;
            if (threadLocal.get() == null) {
                threadLocal.set(new C7420());
            }
            ((C7420) threadLocal.get()).m19945(this);
            this.f4419 = 0L;
            this.f4425 = false;
            while (true) {
                arrayList = this.f4415;
                if (i >= arrayList.size()) {
                    break;
                }
                if (arrayList.get(i) != null) {
                    ((InterfaceC19580) arrayList.get(i)).onAnimationEnd();
                }
                i++;
            }
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            }
        }
        return zMo4074;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4069(float f) {
        ArrayList arrayList;
        this.f4422.setValue(this.f4416, f);
        int i = 0;
        while (true) {
            arrayList = this.f4424;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((InterfaceC0528) arrayList.get(i)).mo2246(this.f4418);
            }
            i++;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m4068() {
        return this.f4423 * 0.75f;
    }
}
