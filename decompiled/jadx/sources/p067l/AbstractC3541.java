package p067l;

import com.umeng.analytics.pro.C0655am;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨ܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B5N */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3541 implements InterfaceC8079 {

    /* JADX INFO: renamed from: ֡ */
    public static final AbstractC7565 f7177;

    /* JADX INFO: renamed from: ۖ */
    public static final AbstractC7565 f7178;

    /* JADX INFO: renamed from: ۘ */
    public static final AbstractC7565 f7179;

    /* JADX INFO: renamed from: ۚ */
    public static final AbstractC7565 f7180 = new C16281("translationX");

    /* JADX INFO: renamed from: ܺ */
    public static final AbstractC7565 f7181;

    /* JADX INFO: renamed from: ᩴ */
    public static final AbstractC7565 f7182;

    /* JADX INFO: renamed from: ᩵ */
    public static final AbstractC7565 f7183;

    /* JADX INFO: renamed from: ۜ */
    public final Object f7185;

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC16951 f7191;

    /* JADX INFO: renamed from: ᩳ */
    public float f7192;

    /* JADX INFO: renamed from: ۡ */
    public float f7186 = 0.0f;

    /* JADX INFO: renamed from: ۢ */
    public float f7187 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f7194 = false;

    /* JADX INFO: renamed from: ܳ */
    public boolean f7189 = false;

    /* JADX INFO: renamed from: ܽ */
    public float f7190 = -3.4028235E38f;

    /* JADX INFO: renamed from: ۧ */
    public long f7188 = 0;

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f7184 = new ArrayList();

    /* JADX INFO: renamed from: ᩷ */
    public final ArrayList f7193 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo6318(long j);

    static {
        new C24999("translationY");
        new C8906("translationZ");
        f7183 = new C22318("scaleX");
        f7177 = new C11589("scaleY");
        f7178 = new C10918("rotation");
        f7179 = new C17622("rotationX");
        f7182 = new C4883("rotationY");
        new C6224("x");
        new C4212("y");
        new C12930(C0655am.f2276aD);
        f7181 = new C18293("alpha");
        new C19635("scrollX");
        new C18964("scrollY");
    }

    public AbstractC3541(Object obj, AbstractC16951 abstractC16951) {
        this.f7185 = obj;
        this.f7191 = abstractC16951;
        if (abstractC16951 == f7178 || abstractC16951 == f7179 || abstractC16951 == f7182) {
            this.f7192 = 0.1f;
            return;
        }
        if (abstractC16951 == f7181) {
            this.f7192 = 0.00390625f;
        } else if (abstractC16951 == f7183 || abstractC16951 == f7177) {
            this.f7192 = 0.00390625f;
        } else {
            this.f7192 = 1.0f;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m6316(float f) {
        this.f7187 = f;
        this.f7194 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6314(InterfaceC20977 interfaceC20977) {
        ArrayList arrayList = this.f7184;
        if (arrayList.contains(interfaceC20977)) {
            return;
        }
        arrayList.add(interfaceC20977);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m6317(InterfaceC20977 interfaceC20977) {
        ArrayList arrayList = this.f7184;
        int iIndexOf = arrayList.indexOf(interfaceC20977);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    @Override // p067l.InterfaceC8079
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6315(long j) {
        ArrayList arrayList;
        long j2 = this.f7188;
        int i = 0;
        if (j2 == 0) {
            this.f7188 = j;
            m6313(this.f7187);
            return false;
        }
        this.f7188 = j;
        boolean zMo6318 = mo6318(j - j2);
        float fMin = Math.min(this.f7187, Float.MAX_VALUE);
        this.f7187 = fMin;
        float fMax = Math.max(fMin, this.f7190);
        this.f7187 = fMax;
        m6313(fMax);
        if (zMo6318) {
            this.f7189 = false;
            ThreadLocal threadLocal = C9420.f25710;
            if (threadLocal.get() == null) {
                threadLocal.set(new C9420());
            }
            ((C9420) threadLocal.get()).m21919(this);
            this.f7188 = 0L;
            this.f7194 = false;
            while (true) {
                arrayList = this.f7184;
                if (i >= arrayList.size()) {
                    break;
                }
                if (arrayList.get(i) != null) {
                    ((InterfaceC20977) arrayList.get(i)).onAnimationEnd();
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
        return zMo6318;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6313(float f) {
        ArrayList arrayList;
        this.f7191.setValue(this.f7185, f);
        int i = 0;
        while (true) {
            arrayList = this.f7193;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((InterfaceC2870) arrayList.get(i)).mo4613(this.f7187);
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

    /* JADX INFO: renamed from: ֫ */
    public final float m6312() {
        return this.f7192 * 0.75f;
    }
}
