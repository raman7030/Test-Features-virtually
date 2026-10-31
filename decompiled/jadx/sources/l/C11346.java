package l;

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
public class C11346 extends AbstractC23192 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public long f33951;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public HashMap f33963;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C21224[] f33964;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f33965;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static ThreadLocal f33947 = new ThreadLocal();

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f33950 = new C19813();

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f33948 = new C4290();

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f33949 = new C2879();

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f33946 = new C12756();

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f33943 = new C12051();

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static final AccelerateDecelerateInterpolator f33944 = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static long f33945 = 10;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f33961 = -1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f33959 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f33966 = 0;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f33957 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f33956 = 0;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f33967 = false;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f33952 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f33953 = 300;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f33955 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f33954 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f33958 = 1;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Interpolator f33960 = f33944;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f33962 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo28073(float... fArr) {
        if (fArr.length == 0) {
            return;
        }
        C21224[] c21224Arr = this.f33964;
        if (c21224Arr == null || c21224Arr.length == 0) {
            int i = C21224.f68404;
            C14872 c14872 = new C14872("");
            c14872.mo35307(fArr);
            m28074(c14872);
        } else {
            c21224Arr[0].mo35307(fArr);
        }
        this.f33952 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28074(C21224... c21224Arr) {
        int length = c21224Arr.length;
        this.f33964 = c21224Arr;
        this.f33963 = new HashMap(length);
        for (C21224 c21224 : c21224Arr) {
            this.f33963.put(c21224.f68410, c21224);
        }
        this.f33952 = false;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo28081() {
        if (this.f33952) {
            return;
        }
        int length = this.f33964.length;
        for (int i = 0; i < length; i++) {
            this.f33964[i].m48183();
        }
        this.f33952 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C11346 mo28076(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(C16014.m37865(j, "Animators cannot have negative duration: "));
        }
        this.f33953 = j;
        return this;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m28079(long j) {
        this.f33955 = j;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object m28078() {
        C21224[] c21224Arr = this.f33964;
        if (c21224Arr == null || c21224Arr.length <= 0) {
            return null;
        }
        return c21224Arr[0].mo35303();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m28080() {
        this.f33954 = -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28071(InterfaceC5701 interfaceC5701) {
        if (this.f33962 == null) {
            this.f33962 = new ArrayList();
        }
        this.f33962.add(interfaceC5701);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28070(Interpolator interpolator) {
        this.f33960 = interpolator;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28072(C23779 c23779) {
        C21224[] c21224Arr = this.f33964;
        if (c21224Arr == null || c21224Arr.length <= 0) {
            return;
        }
        c21224Arr[0].m48181(c23779);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m28077() {
        if (Looper.myLooper() == null) {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        int i = 0;
        this.f33959 = false;
        this.f33966 = 0;
        this.f33956 = 0;
        this.f33957 = false;
        ((ArrayList) f33948.get()).add(this);
        long jCurrentAnimationTimeMillis = 0;
        if (this.f33955 == 0) {
            if (this.f33952 && this.f33956 != 0) {
                jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.f33951;
            }
            mo28081();
            long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
            if (this.f33956 != 1) {
                this.f33961 = jCurrentAnimationTimeMillis;
                this.f33956 = 2;
            }
            this.f33951 = jCurrentAnimationTimeMillis2 - jCurrentAnimationTimeMillis;
            m28075(jCurrentAnimationTimeMillis2);
            this.f33956 = 0;
            this.f33967 = true;
            ArrayList arrayList = this.f74556;
            if (arrayList != null) {
                ArrayList arrayList2 = (ArrayList) arrayList.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC11904) arrayList2.get(i2)).mo29030();
                }
            }
        }
        ThreadLocal threadLocal = f33947;
        HandlerC9935 handlerC9935 = (HandlerC9935) threadLocal.get();
        if (handlerC9935 == null) {
            handlerC9935 = new HandlerC9935(i);
            threadLocal.set(handlerC9935);
        }
        handlerC9935.sendEmptyMessage(0);
    }

    public final void cancel() {
        ArrayList arrayList;
        if (this.f33956 != 0 || ((ArrayList) f33948.get()).contains(this) || ((ArrayList) f33949.get()).contains(this)) {
            if (this.f33967 && (arrayList = this.f74556) != null) {
                Iterator it = ((ArrayList) arrayList.clone()).iterator();
                while (it.hasNext()) {
                    ((InterfaceC11904) it.next()).getClass();
                }
            }
            m28058();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28068() {
        if (!((ArrayList) f33950.get()).contains(this) && !((ArrayList) f33948.get()).contains(this)) {
            this.f33957 = false;
            m28066();
        } else if (!this.f33952) {
            mo28081();
        }
        int i = this.f33954;
        if (i > 0 && (i & 1) == 1) {
            mo28069(0.0f);
        } else {
            mo28069(1.0f);
        }
        m28058();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public void m28058() {
        ArrayList arrayList;
        ((ArrayList) f33950.get()).remove(this);
        ((ArrayList) f33948.get()).remove(this);
        ((ArrayList) f33949.get()).remove(this);
        this.f33956 = 0;
        if (this.f33967 && (arrayList = this.f74556) != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC11904) arrayList2.get(i)).onAnimationEnd();
            }
        }
        this.f33967 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public void m28066() {
        ArrayList arrayList;
        mo28081();
        ((ArrayList) f33950.get()).add(this);
        if (this.f33955 <= 0 || (arrayList = this.f74556) == null) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) arrayList.clone();
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC11904) arrayList2.get(i)).mo29030();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m28056(C11346 c11346, long j) {
        if (!c11346.f33957) {
            c11346.f33957 = true;
            c11346.f33965 = j;
            return false;
        }
        long j2 = j - c11346.f33965;
        long j3 = c11346.f33955;
        if (j2 <= j3) {
            return false;
        }
        c11346.f33951 = j - (j2 - j3);
        c11346.f33956 = 1;
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m28075(long j) {
        boolean z = true;
        if (this.f33956 == 0) {
            this.f33956 = 1;
            long j2 = this.f33961;
            if (j2 < 0) {
                this.f33951 = j;
            } else {
                this.f33951 = j - j2;
                this.f33961 = -1L;
            }
        }
        int i = this.f33956;
        if (i != 1 && i != 2) {
            return false;
        }
        long j3 = this.f33953;
        float fMin = j3 > 0 ? (j - this.f33951) / j3 : 1.0f;
        if (fMin >= 1.0f) {
            int i2 = this.f33966;
            int i3 = this.f33954;
            if (i2 < i3 || i3 == -1) {
                ArrayList arrayList = this.f74556;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((InterfaceC11904) this.f74556.get(i4)).getClass();
                    }
                }
                if (this.f33958 == 2) {
                    this.f33959 = !this.f33959;
                }
                this.f33966 += (int) fMin;
                fMin %= 1.0f;
                this.f33951 += this.f33953;
                z = false;
            } else {
                fMin = Math.min(fMin, 1.0f);
            }
        } else {
            z = false;
        }
        if (this.f33959) {
            fMin = 1.0f - fMin;
        }
        mo28069(fMin);
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo28069(float f) {
        float interpolation = this.f33960.getInterpolation(f);
        int length = this.f33964.length;
        for (int i = 0; i < length; i++) {
            this.f33964[i].mo35304(interpolation);
        }
        ArrayList arrayList = this.f33962;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((InterfaceC5701) this.f33962.get(i2)).mo16110(this);
            }
        }
    }

    @Override // l.AbstractC23192
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C11346 mo28082clone() {
        C11346 c11346 = (C11346) super.mo28082clone();
        ArrayList arrayList = this.f33962;
        if (arrayList != null) {
            c11346.f33962 = new ArrayList();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                c11346.f33962.add((InterfaceC5701) arrayList.get(i));
            }
        }
        c11346.f33961 = -1L;
        c11346.f33959 = false;
        c11346.f33966 = 0;
        c11346.f33952 = false;
        c11346.f33956 = 0;
        c11346.f33957 = false;
        C21224[] c21224Arr = this.f33964;
        if (c21224Arr != null) {
            int length = c21224Arr.length;
            c11346.f33964 = new C21224[length];
            c11346.f33963 = new HashMap(length);
            for (int i2 = 0; i2 < length; i2++) {
                C21224 c21224Mo35308clone = c21224Arr[i2].clone();
                c11346.f33964[i2] = c21224Mo35308clone;
                c11346.f33963.put(c21224Mo35308clone.f68410, c21224Mo35308clone);
            }
        }
        return c11346;
    }

    public String toString() {
        String string = "ValueAnimator@" + Integer.toHexString(hashCode());
        if (this.f33964 != null) {
            for (int i = 0; i < this.f33964.length; i++) {
                StringBuilder sbM19190 = C7166.m19190(string, "\n    ");
                sbM19190.append(this.f33964[i].toString());
                string = sbM19190.toString();
            }
        }
        return string;
    }
}
