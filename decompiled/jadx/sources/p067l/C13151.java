package p067l;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21WX */
/* JADX INFO: loaded from: classes4.dex */
public class C13151 extends AbstractC24410 {

    /* JADX INFO: renamed from: ֫֫ */
    public long f36949;

    /* JADX INFO: renamed from: ܿ֫ */
    public HashMap f36961;

    /* JADX INFO: renamed from: ᩳ֫ */
    public C22539[] f36962;

    /* JADX INFO: renamed from: ᩶ */
    public long f36963;

    /* JADX INFO: renamed from: ܳ֫ */
    public static ThreadLocal f36945 = new ThreadLocal();

    /* JADX INFO: renamed from: ᩻֫ */
    public static final ThreadLocal f36948 = new C21198();

    /* JADX INFO: renamed from: ܺ֫ */
    public static final ThreadLocal f36946 = new C6445();

    /* JADX INFO: renamed from: ᩷֫ */
    public static final ThreadLocal f36947 = new C5104();

    /* JADX INFO: renamed from: ۢ֫ */
    public static final ThreadLocal f36944 = new C14491();

    /* JADX INFO: renamed from: ۖ֫ */
    public static final ThreadLocal f36941 = new C13821();

    /* JADX INFO: renamed from: ۜ֫ */
    public static final AccelerateDecelerateInterpolator f36942 = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: ۡ֫ */
    public static long f36943 = 10;

    /* JADX INFO: renamed from: ܰ */
    public long f36959 = -1;

    /* JADX INFO: renamed from: ۫ */
    public boolean f36957 = false;

    /* JADX INFO: renamed from: ᩹ */
    public int f36964 = 0;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f36955 = false;

    /* JADX INFO: renamed from: ۤ */
    public int f36954 = 0;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f36965 = false;

    /* JADX INFO: renamed from: ۗ */
    public boolean f36950 = false;

    /* JADX INFO: renamed from: ۙ */
    public long f36951 = 300;

    /* JADX INFO: renamed from: ۟ */
    public long f36953 = 0;

    /* JADX INFO: renamed from: ۛ */
    public int f36952 = 0;

    /* JADX INFO: renamed from: ۨ */
    public int f36956 = 1;

    /* JADX INFO: renamed from: ۬ */
    public Interpolator f36958 = f36942;

    /* JADX INFO: renamed from: ܽ֫ */
    public ArrayList f36960 = null;

    /* JADX INFO: renamed from: ֫ */
    public void mo30118(float... fArr) {
        if (fArr.length == 0) {
            return;
        }
        C22539[] c22539Arr = this.f36962;
        if (c22539Arr == null || c22539Arr.length == 0) {
            int i = C22539.f71087;
            C16502 c16502 = new C16502("");
            c16502.mo37460(fArr);
            m30119(c16502);
        } else {
            c22539Arr[0].mo37460(fArr);
        }
        this.f36950 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30119(C22539... c22539Arr) {
        int length = c22539Arr.length;
        this.f36962 = c22539Arr;
        this.f36961 = new HashMap(length);
        for (C22539 c22539 : c22539Arr) {
            this.f36961.put(c22539.f71093, c22539);
        }
        this.f36950 = false;
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo30126() {
        if (this.f36950) {
            return;
        }
        int length = this.f36962.length;
        for (int i = 0; i < length; i++) {
            this.f36962[i].m50514();
        }
        this.f36950 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public C13151 mo30121(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(C17588.m40051(j, "Animators cannot have negative duration: "));
        }
        this.f36951 = j;
        return this;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m30124(long j) {
        this.f36953 = j;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Object m30123() {
        C22539[] c22539Arr = this.f36962;
        if (c22539Arr == null || c22539Arr.length <= 0) {
            return null;
        }
        return c22539Arr[0].mo37456();
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m30125() {
        this.f36952 = -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30116(InterfaceC7786 interfaceC7786) {
        if (this.f36960 == null) {
            this.f36960 = new ArrayList();
        }
        this.f36960.add(interfaceC7786);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30115(Interpolator interpolator) {
        this.f36958 = interpolator;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30117(C24968 c24968) {
        C22539[] c22539Arr = this.f36962;
        if (c22539Arr == null || c22539Arr.length <= 0) {
            return;
        }
        c22539Arr[0].m50512(c24968);
    }

    /* JADX INFO: renamed from: ܳ */
    public void m30122() {
        if (Looper.myLooper() == null) {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        int i = 0;
        this.f36957 = false;
        this.f36964 = 0;
        this.f36954 = 0;
        this.f36955 = false;
        ((ArrayList) f36946.get()).add(this);
        long jCurrentAnimationTimeMillis = 0;
        if (this.f36953 == 0) {
            if (this.f36950 && this.f36954 != 0) {
                jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.f36949;
            }
            mo30126();
            long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
            if (this.f36954 != 1) {
                this.f36959 = jCurrentAnimationTimeMillis;
                this.f36954 = 2;
            }
            this.f36949 = jCurrentAnimationTimeMillis2 - jCurrentAnimationTimeMillis;
            m30120(jCurrentAnimationTimeMillis2);
            this.f36954 = 0;
            this.f36965 = true;
            ArrayList arrayList = this.f77299;
            if (arrayList != null) {
                ArrayList arrayList2 = (ArrayList) arrayList.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC13682) arrayList2.get(i2)).mo31082();
                }
            }
        }
        ThreadLocal threadLocal = f36945;
        HandlerC11810 handlerC11810 = (HandlerC11810) threadLocal.get();
        if (handlerC11810 == null) {
            handlerC11810 = new HandlerC11810(i);
            threadLocal.set(handlerC11810);
        }
        handlerC11810.sendEmptyMessage(0);
    }

    public final void cancel() {
        ArrayList arrayList;
        if (this.f36954 != 0 || ((ArrayList) f36946.get()).contains(this) || ((ArrayList) f36947.get()).contains(this)) {
            if (this.f36965 && (arrayList = this.f77299) != null) {
                Iterator it = ((ArrayList) arrayList.clone()).iterator();
                while (it.hasNext()) {
                    ((InterfaceC13682) it.next()).getClass();
                }
            }
            m30103();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30113() {
        if (!((ArrayList) f36948.get()).contains(this) && !((ArrayList) f36946.get()).contains(this)) {
            this.f36955 = false;
            m30111();
        } else if (!this.f36950) {
            mo30126();
        }
        int i = this.f36952;
        if (i > 0 && (i & 1) == 1) {
            mo30114(0.0f);
        } else {
            mo30114(1.0f);
        }
        m30103();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ */
    public void m30103() {
        ArrayList arrayList;
        ((ArrayList) f36948.get()).remove(this);
        ((ArrayList) f36946.get()).remove(this);
        ((ArrayList) f36947.get()).remove(this);
        this.f36954 = 0;
        if (this.f36965 && (arrayList = this.f77299) != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC13682) arrayList2.get(i)).onAnimationEnd();
            }
        }
        this.f36965 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩵ */
    public void m30111() {
        ArrayList arrayList;
        mo30126();
        ((ArrayList) f36948.get()).add(this);
        if (this.f36953 <= 0 || (arrayList = this.f77299) == null) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) arrayList.clone();
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC13682) arrayList2.get(i)).mo31082();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m30101(C13151 c13151, long j) {
        if (!c13151.f36955) {
            c13151.f36955 = true;
            c13151.f36963 = j;
            return false;
        }
        long j2 = j - c13151.f36963;
        long j3 = c13151.f36953;
        if (j2 <= j3) {
            return false;
        }
        c13151.f36949 = j - (j2 - j3);
        c13151.f36954 = 1;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m30120(long j) {
        boolean z = true;
        if (this.f36954 == 0) {
            this.f36954 = 1;
            long j2 = this.f36959;
            if (j2 < 0) {
                this.f36949 = j;
            } else {
                this.f36949 = j - j2;
                this.f36959 = -1L;
            }
        }
        int i = this.f36954;
        if (i != 1 && i != 2) {
            return false;
        }
        long j3 = this.f36951;
        float fMin = j3 > 0 ? (j - this.f36949) / j3 : 1.0f;
        if (fMin >= 1.0f) {
            int i2 = this.f36964;
            int i3 = this.f36952;
            if (i2 < i3 || i3 == -1) {
                ArrayList arrayList = this.f77299;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((InterfaceC13682) this.f77299.get(i4)).getClass();
                    }
                }
                if (this.f36956 == 2) {
                    this.f36957 = !this.f36957;
                }
                this.f36964 += (int) fMin;
                fMin %= 1.0f;
                this.f36949 += this.f36951;
                z = false;
            } else {
                fMin = Math.min(fMin, 1.0f);
            }
        } else {
            z = false;
        }
        if (this.f36957) {
            fMin = 1.0f - fMin;
        }
        mo30114(fMin);
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo30114(float f) {
        float interpolation = this.f36958.getInterpolation(f);
        int length = this.f36962.length;
        for (int i = 0; i < length; i++) {
            this.f36962[i].mo37457(interpolation);
        }
        ArrayList arrayList = this.f36960;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((InterfaceC7786) this.f36960.get(i2)).mo18029(this);
            }
        }
    }

    @Override // p067l.AbstractC24410
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C13151 mo56469clone() {
        C13151 c13151 = (C13151) super.mo56469clone();
        ArrayList arrayList = this.f36960;
        if (arrayList != null) {
            c13151.f36960 = new ArrayList();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                c13151.f36960.add((InterfaceC7786) arrayList.get(i));
            }
        }
        c13151.f36959 = -1L;
        c13151.f36957 = false;
        c13151.f36964 = 0;
        c13151.f36950 = false;
        c13151.f36954 = 0;
        c13151.f36955 = false;
        C22539[] c22539Arr = this.f36962;
        if (c22539Arr != null) {
            int length = c22539Arr.length;
            c13151.f36962 = new C22539[length];
            c13151.f36961 = new HashMap(length);
            for (int i2 = 0; i2 < length; i2++) {
                C22539 c22539Mo56499clone = c22539Arr[i2].clone();
                c13151.f36962[i2] = c22539Mo56499clone;
                c13151.f36961.put(c22539Mo56499clone.f71093, c22539Mo56499clone);
            }
        }
        return c13151;
    }

    public String toString() {
        String string = "ValueAnimator@" + Integer.toHexString(hashCode());
        if (this.f36962 != null) {
            for (int i = 0; i < this.f36962.length; i++) {
                StringBuilder sbM21133 = C9179.m21133(string, "\n    ");
                sbM21133.append(this.f36962[i].toString());
                string = sbM21133.toString();
            }
        }
        return string;
    }
}
