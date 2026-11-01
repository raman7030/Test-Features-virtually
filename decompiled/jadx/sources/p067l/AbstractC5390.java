package p067l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.text.Selection;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۗۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAZD */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5390 {

    /* JADX INFO: renamed from: ֡ */
    public final ArrayList f12793;

    /* JADX INFO: renamed from: ֨ */
    public final Rect f12794;

    /* JADX INFO: renamed from: ֫ */
    public int f12795;

    /* JADX INFO: renamed from: ֫֫ */
    public final int[] f12796;

    /* JADX INFO: renamed from: ۖ */
    public final C16427 f12797;

    /* JADX INFO: renamed from: ۗ */
    public C22076 f12798;

    /* JADX INFO: renamed from: ۘ */
    public final C16427 f12799;

    /* JADX INFO: renamed from: ۙ */
    public int f12800;

    /* JADX INFO: renamed from: ۚ */
    public final Rect f12801;

    /* JADX INFO: renamed from: ۛ */
    public boolean f12802;

    /* JADX INFO: renamed from: ۜ */
    public final AtomicInteger f12803;

    /* JADX INFO: renamed from: ۜ֫ */
    public final RectF f12804;

    /* JADX INFO: renamed from: ۟ */
    public final Runnable f12805;

    /* JADX INFO: renamed from: ۠ */
    public String f12806;

    /* JADX INFO: renamed from: ۡ */
    public boolean f12807;

    /* JADX INFO: renamed from: ۡ֫ */
    public volatile int f12808;

    /* JADX INFO: renamed from: ۢ */
    public final C21484 f12809;

    /* JADX INFO: renamed from: ۢ֫ */
    public final RectF f12810;

    /* JADX INFO: renamed from: ۤ */
    public final int f12811;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC9768 f12812;

    /* JADX INFO: renamed from: ۧ֫ */
    public final int[] f12813;

    /* JADX INFO: renamed from: ۨ */
    public int f12814;

    /* JADX INFO: renamed from: ۫ */
    public InterfaceC9768 f12815;

    /* JADX INFO: renamed from: ۬ */
    public volatile boolean f12816;

    /* JADX INFO: renamed from: ܰ */
    public final Object f12817;

    /* JADX INFO: renamed from: ܳ */
    public volatile C20182 f12818;

    /* JADX INFO: renamed from: ܳ֫ */
    public volatile boolean f12819;

    /* JADX INFO: renamed from: ܶ */
    public C22076 f12820;

    /* JADX INFO: renamed from: ܺ */
    public C14146 f12821;

    /* JADX INFO: renamed from: ܽ */
    public volatile C9729 f12822;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f12823;

    /* JADX INFO: renamed from: ܿ */
    public final C4145 f12824;

    /* JADX INFO: renamed from: ܿ֫ */
    public boolean f12825;

    /* JADX INFO: renamed from: ᩳ */
    public volatile boolean f12826;

    /* JADX INFO: renamed from: ᩳ֫ */
    public boolean f12827;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f12828;

    /* JADX INFO: renamed from: ᩵ */
    public boolean f12829;

    /* JADX INFO: renamed from: ᩶ */
    public int f12830;

    /* JADX INFO: renamed from: ᩷ */
    public final AtomicBoolean f12831;

    /* JADX INFO: renamed from: ᩷֫ */
    public final RectF f12832;

    /* JADX INFO: renamed from: ᩸ */
    public C22921 f12833;

    /* JADX INFO: renamed from: ᩹ */
    public C20239 f12834;

    /* JADX INFO: renamed from: ᩺ */
    public C9729 f12835;

    /* JADX INFO: renamed from: ᩻ */
    public int f12836;

    /* JADX INFO: renamed from: ᩻֫ */
    public C23929 f12837;

    /* JADX INFO: renamed from: ֨ */
    public boolean mo11802() {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo10186(C6731 c6731);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo10187(float f);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo10188(int i, int i2, int i3);

    /* JADX INFO: renamed from: ֫ */
    public void mo10189(Canvas canvas, int i, float f, int i2, C3831 c3831) {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo10193();

    /* JADX INFO: renamed from: ۚ */
    public boolean mo11818() {
        return false;
    }

    /* JADX INFO: renamed from: ۢ */
    public abstract float mo10196();

    /* JADX INFO: renamed from: ۤ */
    public abstract int mo10197();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo10198();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo10199(InterfaceC9768 interfaceC9768);

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo10200(C6731 c6731);

    /* JADX INFO: renamed from: ܳ */
    public void mo11827(int i) {
    }

    /* JADX INFO: renamed from: ᩶ */
    public abstract Throwable mo10204();

    /* JADX INFO: renamed from: ᩷ */
    public abstract byte mo10205();

    /* JADX INFO: renamed from: ᩸ */
    public abstract void mo10206();

    /* JADX INFO: renamed from: ᩹ */
    public final C9729 m11841() {
        C9729 c9729Mo28589;
        synchronized (this.f12817) {
            C9729 c9729 = this.f12835;
            c9729Mo28589 = c9729 == null ? this.f12815.mo28589() : c9729.m22742();
        }
        return c9729Mo28589;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m11820() {
        boolean z;
        synchronized (this.f12817) {
            z = this.f12835 != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۫ */
    public final int m11825() {
        return this.f12808;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo10190(RectF rectF, int i) {
        float fM20358;
        float f;
        if (i < 0) {
            i = 0;
        } else {
            int i2 = this.f12830;
            if (i > i2) {
                i = i2;
            }
        }
        int iM11806 = m11806(i, this.f12825);
        C13533 c13533 = this.f12798.get(iM11806);
        int iM11836 = m11836(iM11806);
        int iMin = Math.min(i, c13533.m30798());
        int i3 = c13533.f38061;
        int i4 = c13533.f38062;
        C23929 c23929 = this.f12837;
        if (i3 == i4) {
            fM20358 = c23929.f76006;
            f = 0.0f;
        } else {
            C9729 c9729Mo28589 = this.f12815.mo28589();
            try {
                C8794 c8794M11790 = m11790(c13533.f38061, c13533.m30798(), c9729Mo28589);
                float fM20359 = c8794M11790.m20358(Float.POSITIVE_INFINITY, iMin);
                if (c13533.m30798() <= iMin) {
                    fM20358 = c23929.f76006 + fM20359;
                } else {
                    fM20358 = c8794M11790.m20358(Float.POSITIVE_INFINITY, C23669.m52676(iMin, c13533.m30798(), c9729Mo28589));
                }
                c9729Mo28589.close();
                f = fM20359;
            } catch (Throwable th) {
                try {
                    c9729Mo28589.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        float f2 = iM11836;
        rectF.left = f + f2;
        rectF.right = fM20358 + f2;
        float fM26496 = c23929.m26496();
        float f3 = iM11806 * fM26496;
        rectF.top = f3;
        rectF.bottom = f3 + fM26496;
    }

    /* JADX INFO: renamed from: ۠ */
    public final boolean m11819() {
        return this.f12830 == 0 && !this.f12820.isEmpty();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m11823(RectF rectF, int i) {
        if (i < 0) {
            i = 0;
        } else {
            int i2 = this.f12830;
            if (i > i2) {
                i = i2;
            }
        }
        int iM11806 = m11806(i, this.f12825);
        float fM26496 = this.f12837.m26496();
        float f = iM11806 * fM26496;
        rectF.top = f;
        rectF.bottom = f + fM26496;
    }

    /* JADX INFO: renamed from: ۬ */
    public final int m11826() {
        return this.f12830;
    }

    /* JADX INFO: renamed from: ܿ */
    public boolean mo11835(int i, int i2) {
        int i3 = this.f12830;
        int iMax = Math.max(0, i);
        int iMin = Math.min(i3, i2);
        if (iMax < iMin && !this.f12798.isEmpty() && !this.f12833.isEmpty()) {
            int iM11806 = m11806(iMax, true);
            int iM11807 = m11806(iMin - 1, false);
            int iM49684 = this.f12798.m49684(iM11806);
            int iM49685 = this.f12798.m49684(iM11807) + 1;
            int iM49693 = this.f12798.m49693(iM11806);
            int iM26497 = this.f12837.m26497();
            C9729 c9729Mo28589 = this.f12815.mo28589();
            for (int i4 = iM49684; i4 < iM49685; i4++) {
                try {
                    iM49693 = this.f12798.m49694(i4, iM49693);
                    if (iM49693 == -1 || i4 >= this.f12833.size()) {
                        break;
                        break;
                    }
                    this.f12833.m51208(i4, this, c9729Mo28589, this.f12798.m49682(iM49693), iM26497);
                } catch (Throwable th) {
                    try {
                        c9729Mo28589.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            c9729Mo28589.close();
            this.f12833.m51214(iM49684, iM49685);
            this.f12834.f62570 = Integer.MIN_VALUE;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m11838(int i, int i2) {
        if (i < 0) {
            i = 0;
        } else {
            int i3 = this.f12830;
            if (i > i3) {
                i = i3;
            }
        }
        if (i2 < 0) {
            i2 = 0;
        } else {
            int i4 = this.f12830;
            if (i2 > i4) {
                i2 = i4;
            }
        }
        return m11806(i, this.f12825) == m11806(i2, this.f12825);
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m11801() {
        return this.f12815 != null && this.f12808 == this.f12815.mo28581();
    }

    /* JADX INFO: renamed from: ۙ */
    public final void m11817() {
        synchronized (this.f12817) {
            C9729 c9729 = this.f12835;
            if (c9729 != null) {
                c9729.close();
                this.f12835 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11812(InterfaceC9768 interfaceC9768, C9729 c9729) {
        synchronized (this.f12817) {
            m11817();
            this.f12815 = interfaceC9768;
            this.f12835 = c9729;
            this.f12808 = c9729.m22747();
            this.f12830 = c9729.length();
        }
        m11829();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m11794(AbstractC5390 abstractC5390) {
        abstractC5390.f12831.set(false);
        abstractC5390.m11799();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m11832() {
        int i;
        if (this instanceof C18976) {
            i = ((C18976) this).m43130() ? 1 : 2;
        } else {
            i = 0;
        }
        this.f12818 = this.f12821.m32602(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC5390 m11789(C14146 c14146, InterfaceC9768 interfaceC9768, C23929 c23929, int i) {
        if (i == 0) {
            return new C4816(c14146, interfaceC9768, c23929);
        }
        return new C18976(c14146, interfaceC9768, c23929, i == 1);
    }

    public AbstractC5390(C14146 c14146, C23929 c23929) {
        this.f12811 = C13076.m29939(10.0f);
        this.f12817 = new Object();
        this.f12803 = new AtomicInteger();
        this.f12831 = new AtomicBoolean();
        this.f12805 = new RunnableC8805(1, this);
        this.f12809 = new C21484(this);
        this.f12798 = new C22076();
        this.f12833 = new C22921();
        this.f12820 = new C22076();
        this.f12814 = -1;
        this.f12825 = true;
        this.f12804 = new RectF();
        this.f12832 = new RectF();
        this.f12810 = new RectF();
        this.f12799 = new C16427(-1);
        this.f12797 = new C16427(1);
        this.f12834 = new C20239();
        this.f12824 = new C4145();
        this.f12796 = new int[3];
        this.f12813 = new int[7];
        this.f12801 = new Rect();
        this.f12794 = new Rect();
        this.f12793 = new ArrayList(2);
        this.f12816 = false;
        this.f12819 = false;
        this.f12821 = c14146;
        this.f12837 = c23929;
        this.f12818 = c14146.m32608();
    }

    public AbstractC5390(C14146 c14146, InterfaceC9768 interfaceC9768, C23929 c23929, C14677 c14677) {
        this.f12811 = C13076.m29939(10.0f);
        this.f12817 = new Object();
        this.f12803 = new AtomicInteger();
        this.f12831 = new AtomicBoolean();
        this.f12805 = new RunnableC8805(1, this);
        this.f12809 = new C21484(this);
        this.f12798 = new C22076();
        this.f12833 = new C22921();
        this.f12820 = new C22076();
        this.f12814 = -1;
        this.f12825 = true;
        this.f12804 = new RectF();
        this.f12832 = new RectF();
        this.f12810 = new RectF();
        this.f12799 = new C16427(-1);
        this.f12797 = new C16427(1);
        this.f12834 = new C20239();
        this.f12824 = new C4145();
        this.f12796 = new int[3];
        this.f12813 = new int[7];
        this.f12801 = new Rect();
        this.f12794 = new Rect();
        this.f12793 = new ArrayList(2);
        this.f12816 = false;
        this.f12819 = false;
        this.f12821 = c14146;
        this.f12837 = c23929;
        this.f12818 = c14146.m32608();
        this.f12800 = c14677.readInt();
        int i = c14677.readInt();
        this.f12798.getClass();
        boolean zM33577 = c14677.m33577(-249333469);
        C13533 c13533 = new C13533();
        for (int i2 = 0; i2 < i; i2++) {
            c13533.m30799(c14677.readInt(), c14677.readInt(), c14677.readInt());
            this.f12798.m49680(c13533);
            if (!zM33577) {
                c14677.skipBytes(4);
            }
        }
        if (c14677.m33577(1916422180)) {
            int i3 = c14677.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                this.f12833.add(c14677.m33581() | ((c14677.readByte() & 255) << 16));
            }
            this.f12833.m51213();
            return;
        }
        this.f12833.m51209(this, interfaceC9768, this.f12798, c23929.m26497());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11811(InterfaceC9768 interfaceC9768) {
        synchronized (this.f12817) {
            if (this.f12835 == null || this.f12815 != interfaceC9768) {
                m11812(interfaceC9768, interfaceC9768.mo28589());
            }
        }
        m11829();
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m11829() {
        if (this instanceof C4816) {
            ((C4816) this).m10201();
        }
        this.f12803.incrementAndGet();
        if (this.f12822 == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m11799();
        } else if (this.f12831.compareAndSet(false, true)) {
            C7050.m16212(this.f12805);
        }
    }

    /* JADX INFO: renamed from: ۨ */
    private void m11799() {
        if (this.f12807) {
            return;
        }
        if (this.f12795 == this.f12803.get() && this.f12812 == this.f12815) {
            return;
        }
        C9729 c9729 = this.f12822;
        this.f12822 = null;
        this.f12812 = null;
        if (c9729 != null) {
            c9729.close();
        }
    }

    /* JADX INFO: renamed from: ۛ */
    private C9729 m11797() {
        InterfaceC9768 interfaceC9768 = this.f12815;
        int i = this.f12803.get();
        if (this.f12822 == null || this.f12812 != interfaceC9768 || this.f12795 != i || !interfaceC9768.mo28586(this.f12822)) {
            C9729 c9729 = this.f12822;
            this.f12822 = null;
            this.f12812 = null;
            if (c9729 != null) {
                c9729.close();
            }
            this.f12812 = interfaceC9768;
            this.f12795 = i;
            this.f12822 = interfaceC9768.mo28589();
            this.f12822.f26874 = true;
        }
        return this.f12822;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m11837() {
        if (this.f12798.isEmpty() || this.f12798.m49695().f38062 != this.f12830) {
            System.err.println("Lines check fail. Try fix.");
            mo10199(this.f12815);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo10191(String str) {
        this.f12806 = str;
        if (str == null || str.isEmpty()) {
            this.f12820.clear();
            return;
        }
        C22076 c22076 = new C22076();
        C13533 c13533 = new C13533();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (z) {
            int iIndexOf = this.f12821.mo27920() ? -1 : str.indexOf(10, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
                z = false;
            }
            c13533.m30799(i, iIndexOf, i2);
            c22076.m49680(c13533);
            i = iIndexOf + 1;
            i2++;
        }
        this.f12820 = c22076;
    }

    /* JADX INFO: renamed from: ܿ */
    public final double m11833() {
        boolean zM11819 = m11819();
        C14146 c14146 = this.f12821;
        AbstractC23000 abstractC23000 = c14146.f40253;
        return (((double) this.f12837.m26496()) * ((double) (zM11819 ? this.f12820 : this.f12798).size())) + ((double) Math.max(c14146.m32523(), abstractC23000 != null ? abstractC23000.m51380() : 0));
    }

    /* JADX INFO: renamed from: ܳ */
    public int mo10202() {
        C23929 c23929 = this.f12837;
        boolean z = c23929.f76016;
        int i = c23929.f75963;
        if (z) {
            return c23929.f75988 ? this.f12800 + c23929.f75976 : c23929.f75998;
        }
        if (c23929.f76011) {
            return i + c23929.f75976;
        }
        return Math.max(c23929.f75976, i);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m11836(int i) {
        int iMo10202 = mo10202();
        return (!mo11802() || this.f12798.m49696(i)) ? iMo10202 : this.f12837.m53013() + iMo10202;
    }

    /* JADX INFO: renamed from: ۜ */
    public int mo10195() {
        C23929 c23929 = this.f12837;
        boolean z = c23929.f76016;
        int i = c23929.f75963;
        if (!z) {
            return c23929.f75988 ? this.f12800 + c23929.f75976 : c23929.f75998;
        }
        if (c23929.f76011) {
            return i + c23929.f75976;
        }
        return Math.max(c23929.f75976, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m11805(int i) {
        float length = String.valueOf(((long) this.f12798.m49695().f38063) + 1 + ((long) i)).length() + 1;
        C23929 c23929 = this.f12837;
        return (int) ((length + c23929.f75979) * c23929.f75970);
    }

    /* JADX INFO: renamed from: ۗ */
    public final void m11815() {
        this.f12825 = true;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m11840() {
        return this.f12825;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m11804(float f, float f2) {
        this.f12802 = false;
        int iM11803 = m11803(f2);
        if (f <= m11836(iM11803)) {
            return m11807(this.f12815, iM11803, f);
        }
        C9729 c9729Mo28589 = this.f12815.mo28589();
        try {
            int iM11807 = m11807(c9729Mo28589, iM11803, f);
            c9729Mo28589.close();
            return iM11807;
        } catch (Throwable th) {
            try {
                c9729Mo28589.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m11803(double d) {
        int iM26496 = (int) (d / ((double) this.f12837.m26496()));
        if (iM26496 < 0) {
            this.f12802 = true;
            return 0;
        }
        if (iM26496 < this.f12798.size()) {
            return iM26496;
        }
        this.f12802 = true;
        return this.f12798.m49691();
    }

    /* JADX INFO: renamed from: ֫ */
    private int m11788(double d, boolean z) {
        int iM26496 = (int) (d / ((double) this.f12837.m26496()));
        if (iM26496 < 0) {
            return 0;
        }
        if (z) {
            return iM26496 >= this.f12820.size() ? this.f12820.m49691() : iM26496;
        }
        return iM26496 >= this.f12798.size() ? this.f12798.m49691() : iM26496;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m11807(CharSequence charSequence, int i, float f) {
        float fM11836 = f - m11836(i);
        C13533 c13533 = this.f12798.get(i);
        int i2 = c13533.f38061;
        int iM30798 = c13533.m30798();
        boolean z = true;
        if (fM11836 <= 0.0f) {
            this.f12825 = true;
            return i2;
        }
        C8794 c8794M11790 = m11790(i2, iM30798, charSequence);
        int iM20359 = c8794M11790.m20359(fM11836);
        if (iM20359 == iM30798) {
            this.f12802 = fM11836 > c8794M11790.m20357();
        }
        if (iM20359 != i2 && !this.f12798.m49683(i)) {
            z = false;
        }
        this.f12825 = z;
        return iM20359;
    }

    /* JADX INFO: renamed from: ֫ */
    private C8794 m11790(int i, int i2, CharSequence charSequence) {
        C23929 c23929 = this.f12837;
        if (c23929.f75992) {
            C14146 c14146 = this.f12821;
            if (c14146.f40252.m20524()) {
                return c14146.f40252.m20505(charSequence, i, i2, c23929);
            }
        }
        return this.f12837.m26488(charSequence, i, i2, 0.0f, (C19627) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m11813(RectF rectF) {
        int selectionStart = Selection.getSelectionStart(this.f12815);
        int selectionEnd = Selection.getSelectionEnd(this.f12815);
        if (selectionStart == selectionEnd) {
            return false;
        }
        if (selectionStart > selectionEnd) {
            selectionEnd = selectionStart;
            selectionStart = selectionEnd;
        }
        int iM11806 = m11806(selectionStart, this.f12825);
        C13533 c13533 = this.f12798.get(iM11806);
        if (c13533.f38061 >= selectionEnd || selectionEnd > c13533.f38062) {
            return false;
        }
        int iM11836 = m11836(iM11806);
        C9729 c9729Mo28589 = this.f12815.mo28589();
        try {
            C8794 c8794M11790 = m11790(c13533.f38061, c13533.m30798(), c9729Mo28589);
            float fM20358 = c8794M11790.m20358(Float.POSITIVE_INFINITY, Math.min(selectionStart, c13533.m30798()));
            float fM20359 = c8794M11790.m20358(Float.POSITIVE_INFINITY, Math.min(selectionEnd, c13533.m30798()));
            float f = iM11836;
            rectF.left = fM20358 + f;
            rectF.right = fM20359 + f;
            c9729Mo28589.close();
            float fM26496 = this.f12837.m26496();
            float f2 = iM11806 * fM26496;
            rectF.top = f2;
            rectF.bottom = f2 + fM26496;
            return true;
        } catch (Throwable th) {
            try {
                c9729Mo28589.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m11834(int i) {
        return m11806(i, this.f12825);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m11806(int i, boolean z) {
        int i2;
        C13533 c13533M35335;
        int i3;
        int i4 = 0;
        if (i <= 0) {
            return 0;
        }
        if (i >= this.f12798.m49695().f38062) {
            return this.f12798.m49691();
        }
        C22076 c22076 = this.f12798;
        int size = c22076.size();
        C15543 c15543M49686 = c22076.m49686();
        while (true) {
            i2 = (i4 + size) >>> 1;
            c13533M35335 = c15543M49686.m35335(i2);
            i3 = c13533M35335.f38061;
            if (i >= i3) {
                int i5 = c13533M35335.f38062;
                if (i >= i5) {
                    if (i4 == i2) {
                        if (i == i5) {
                            break;
                        }
                        throw new RuntimeException();
                    }
                    i4 = i2;
                } else {
                    break;
                }
            } else {
                size = i2;
            }
        }
        if (i != i3 || c22076.m49696(i2)) {
            return (i == c13533M35335.f38062 && !c22076.m49683(i2) && z) ? i2 + 1 : i2;
        }
        return z ? i2 : i2 - 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24481 m11808(C9729 c9729, int i, int i2) {
        if (this.f12821.mo27920()) {
            i = i2;
        }
        return c9729.m22743(i, i2);
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m11839() {
        return this.f12827;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m11816() {
        return this.f12823;
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m11821(float f) {
        C14146 c14146 = this.f12821;
        return (f - c14146.getPaddingTop()) + (c14146.m32472() - this.f12836);
    }

    /* JADX INFO: renamed from: ܽ */
    public final float m11830(int i) {
        return (float) ((((double) i) * ((double) this.f12837.m26496())) - ((double) this.f12836));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11809(Canvas canvas, int i, int i2, int i3, int i4) {
        canvas.drawColor(this.f12837.f76000);
        m11791(canvas, i, i2, i3, i4, i3);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11810(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6, C23495 c23495, C8898 c8898, C8506 c8506, C24894 c24894) {
        C14146 c14146 = this.f12821;
        C21484 c21484 = this.f12809;
        if (this instanceof C4816) {
            ((C4816) this).m10203(i2, i4);
        }
        this.f12807 = true;
        int iSave = canvas.save();
        this.f12836 = c14146.m32472() - c14146.getScrollY();
        try {
            m11798(canvas, i, i2, i3, i4, i5, i6, c23495, c8898, c8506, c24894);
            canvas.restoreToCount(iSave);
            c21484.f67778 = null;
            c21484.f67776 = null;
            c21484.f67780 = null;
            this.f12807 = false;
            m11799();
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            c21484.f67778 = null;
            c21484.f67776 = null;
            c21484.f67780 = null;
            this.f12807 = false;
            C9729 c9729 = this.f12822;
            this.f12822 = null;
            this.f12812 = null;
            if (c9729 != null) {
                c9729.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x032d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0348  */
    /* JADX WARN: Code duplicated, block: B:121:0x035e  */
    /* JADX WARN: Code duplicated, block: B:124:0x036a  */
    /* JADX WARN: Code duplicated, block: B:126:0x036f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0375  */
    /* JADX WARN: Code duplicated, block: B:129:0x03da  */
    /* JADX WARN: Code duplicated, block: B:131:0x0410 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x0412  */
    /* JADX WARN: Code duplicated, block: B:134:0x0441  */
    /* JADX WARN: Code duplicated, block: B:135:0x0446  */
    /* JADX WARN: Code duplicated, block: B:137:0x0452  */
    /* JADX WARN: Code duplicated, block: B:139:0x0487  */
    /* JADX WARN: Code duplicated, block: B:140:0x048b  */
    /* JADX WARN: Code duplicated, block: B:143:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:145:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:147:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:148:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:149:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:151:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:153:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:155:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:159:0x050e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0513  */
    /* JADX WARN: Code duplicated, block: B:162:0x0519  */
    /* JADX WARN: Code duplicated, block: B:163:0x052e  */
    /* JADX WARN: Code duplicated, block: B:166:0x054d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0558  */
    /* JADX WARN: Code duplicated, block: B:170:0x055b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0571  */
    /* JADX WARN: Code duplicated, block: B:175:0x0576 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x0595  */
    /* JADX WARN: Code duplicated, block: B:184:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:185:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:188:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:189:0x0612  */
    /* JADX WARN: Code duplicated, block: B:193:0x0639  */
    /* JADX WARN: Code duplicated, block: B:195:0x0643  */
    /* JADX WARN: Code duplicated, block: B:197:0x0649  */
    /* JADX WARN: Code duplicated, block: B:198:0x064b  */
    /* JADX WARN: Code duplicated, block: B:200:0x0654  */
    /* JADX WARN: Code duplicated, block: B:203:0x0688  */
    /* JADX WARN: Code duplicated, block: B:204:0x068f  */
    /* JADX WARN: Code duplicated, block: B:207:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:209:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:210:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:213:0x06cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:221:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:223:0x0701  */
    /* JADX WARN: Code duplicated, block: B:230:0x0756 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:235:0x0766  */
    /* JADX WARN: Code duplicated, block: B:237:0x0770  */
    /* JADX WARN: Code duplicated, block: B:239:0x0788 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:255:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:260:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:262:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:264:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:265:0x07e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:267:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:270:0x082e A[EDGE_INSN: B:270:0x082e->B:271:0x0830 BREAK  A[LOOP:1: B:261:0x07d5->B:268:0x0821], PHI: r85 r86
      0x082e: PHI (r85v11 l.ܺۢᩴ) = (r85v10 l.ܺۢᩴ), (r85v15 l.ܺۢᩴ) binds: [B:259:0x07cf, B:269:0x082c] A[DONT_GENERATE, DONT_INLINE]
      0x082e: PHI (r86v11 int) = (r86v10 int), (r86v13 int) binds: [B:259:0x07cf, B:269:0x082c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:272:0x0832  */
    /* JADX WARN: Code duplicated, block: B:273:0x084b  */
    /* JADX WARN: Code duplicated, block: B:276:0x0858  */
    /* JADX WARN: Code duplicated, block: B:278:0x086c  */
    /* JADX WARN: Code duplicated, block: B:280:0x0872 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:283:0x0878  */
    /* JADX WARN: Code duplicated, block: B:285:0x087c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:286:0x087e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:310:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:316:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:318:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:320:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:322:0x0945  */
    /* JADX WARN: Code duplicated, block: B:352:0x09f0  */
    /* JADX WARN: Code duplicated, block: B:355:0x0a0b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:371:0x0a4e  */
    /* JADX WARN: Code duplicated, block: B:373:0x0a5c  */
    /* JADX WARN: Code duplicated, block: B:375:0x0a66  */
    /* JADX WARN: Code duplicated, block: B:378:0x0a6e  */
    /* JADX WARN: Code duplicated, block: B:381:0x0a78  */
    /* JADX WARN: Code duplicated, block: B:383:0x0a80  */
    /* JADX WARN: Code duplicated, block: B:385:0x0a86  */
    /* JADX WARN: Code duplicated, block: B:386:0x0a89  */
    /* JADX WARN: Code duplicated, block: B:389:0x0abb  */
    /* JADX WARN: Code duplicated, block: B:390:0x0abe  */
    /* JADX WARN: Code duplicated, block: B:393:0x0aea  */
    /* JADX WARN: Code duplicated, block: B:395:0x0af6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:398:0x0b24  */
    /* JADX WARN: Code duplicated, block: B:402:0x0b95  */
    /* JADX WARN: Code duplicated, block: B:405:0x0b9c  */
    /* JADX WARN: Code duplicated, block: B:407:0x0ba0  */
    /* JADX WARN: Code duplicated, block: B:408:0x0ba9  */
    /* JADX WARN: Code duplicated, block: B:410:0x0bbd  */
    /* JADX WARN: Code duplicated, block: B:413:0x0bcb  */
    /* JADX WARN: Code duplicated, block: B:414:0x0be4  */
    /* JADX WARN: Code duplicated, block: B:418:0x0c03  */
    /* JADX WARN: Code duplicated, block: B:420:0x0c15  */
    /* JADX WARN: Code duplicated, block: B:422:0x0c21  */
    /* JADX WARN: Code duplicated, block: B:423:0x0c25  */
    /* JADX WARN: Code duplicated, block: B:427:0x0c2e  */
    /* JADX WARN: Code duplicated, block: B:429:0x0c34  */
    /* JADX WARN: Code duplicated, block: B:430:0x0c36  */
    /* JADX WARN: Code duplicated, block: B:432:0x0c42  */
    /* JADX WARN: Code duplicated, block: B:435:0x0c6d  */
    /* JADX WARN: Code duplicated, block: B:436:0x0c70  */
    /* JADX WARN: Code duplicated, block: B:439:0x0c8a  */
    /* JADX WARN: Code duplicated, block: B:442:0x0c93  */
    /* JADX WARN: Code duplicated, block: B:444:0x0c98  */
    /* JADX WARN: Code duplicated, block: B:445:0x0c9a  */
    /* JADX WARN: Code duplicated, block: B:457:0x0cb3  */
    /* JADX WARN: Code duplicated, block: B:460:0x0cba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:462:0x0cec  */
    /* JADX WARN: Code duplicated, block: B:465:0x0d00  */
    /* JADX WARN: Code duplicated, block: B:466:0x0d48  */
    /* JADX WARN: Code duplicated, block: B:468:0x0d58  */
    /* JADX WARN: Code duplicated, block: B:469:0x0d86  */
    /* JADX WARN: Code duplicated, block: B:471:0x0dc4  */
    /* JADX WARN: Code duplicated, block: B:473:0x0dd3  */
    /* JADX WARN: Code duplicated, block: B:477:0x0e07  */
    /* JADX WARN: Code duplicated, block: B:479:0x0e10  */
    /* JADX WARN: Code duplicated, block: B:482:0x0e5d  */
    /* JADX WARN: Code duplicated, block: B:492:0x0e71  */
    /* JADX WARN: Code duplicated, block: B:509:0x0ea8  */
    /* JADX WARN: Code duplicated, block: B:512:0x0eb8  */
    /* JADX WARN: Code duplicated, block: B:515:0x0ec0  */
    /* JADX WARN: Code duplicated, block: B:517:0x0ec4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:520:0x0ecb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:521:0x0ecd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:522:0x0ecf  */
    /* JADX WARN: Code duplicated, block: B:523:0x0edc  */
    /* JADX WARN: Code duplicated, block: B:526:0x0efe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:527:0x0f00  */
    /* JADX WARN: Code duplicated, block: B:528:0x0f06  */
    /* JADX WARN: Code duplicated, block: B:530:0x0f21  */
    /* JADX WARN: Code duplicated, block: B:532:0x0f28  */
    /* JADX WARN: Code duplicated, block: B:535:0x0f4b  */
    /* JADX WARN: Code duplicated, block: B:536:0x0f51  */
    /* JADX WARN: Code duplicated, block: B:538:0x0f64  */
    /* JADX WARN: Code duplicated, block: B:541:0x0f6c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:546:0x0faf  */
    /* JADX WARN: Code duplicated, block: B:548:0x0fbd  */
    /* JADX WARN: Code duplicated, block: B:554:0x1042  */
    /* JADX WARN: Code duplicated, block: B:556:0x104e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:565:0x107e  */
    /* JADX WARN: Code duplicated, block: B:569:0x10b5  */
    /* JADX WARN: Code duplicated, block: B:571:0x10c2  */
    /* JADX WARN: Code duplicated, block: B:574:0x10cb  */
    /* JADX WARN: Code duplicated, block: B:577:0x10d3  */
    /* JADX WARN: Code duplicated, block: B:594:0x11b1  */
    /* JADX WARN: Code duplicated, block: B:596:0x11c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:597:0x11c8  */
    /* JADX WARN: Code duplicated, block: B:598:0x11e3  */
    /* JADX WARN: Code duplicated, block: B:601:0x1206  */
    /* JADX WARN: Code duplicated, block: B:604:0x1212  */
    /* JADX WARN: Code duplicated, block: B:605:0x1224  */
    /* JADX WARN: Code duplicated, block: B:608:0x1239  */
    /* JADX WARN: Code duplicated, block: B:609:0x123e  */
    /* JADX WARN: Code duplicated, block: B:612:0x1251 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:614:0x1266  */
    /* JADX WARN: Code duplicated, block: B:617:0x127c  */
    /* JADX WARN: Code duplicated, block: B:619:0x1285  */
    /* JADX WARN: Code duplicated, block: B:621:0x1289  */
    /* JADX WARN: Code duplicated, block: B:627:0x1299  */
    /* JADX WARN: Code duplicated, block: B:632:0x12a6  */
    /* JADX WARN: Code duplicated, block: B:635:0x12ac  */
    /* JADX WARN: Code duplicated, block: B:642:0x1314  */
    /* JADX WARN: Code duplicated, block: B:644:0x1318  */
    /* JADX WARN: Code duplicated, block: B:646:0x1334  */
    /* JADX WARN: Code duplicated, block: B:649:0x1353  */
    /* JADX WARN: Code duplicated, block: B:652:0x135a  */
    /* JADX WARN: Code duplicated, block: B:669:0x0b72 A[EDGE_INSN: B:669:0x0b72->B:400:0x0b72 BREAK  A[LOOP:0: B:191:0x062a->B:399:0x0b32], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:0x082c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:0x07ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:0x1006 A[EDGE_INSN: B:679:0x1006->B:552:0x1006 BREAK  A[LOOP:3: B:416:0x0bf6->B:551:0x0fcb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0979, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:571:0x10c2, please report this as an issue */
    /*  JADX ERROR: JadxRuntimeException in pass: PrepareForCodeGen
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v1 int
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.instructions.args.RegisterArg.sameCodeVar(RegisterArg.java:193)
        	at jadx.core.dex.visitors.PrepareForCodeGen.modifyArith(PrepareForCodeGen.java:242)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:88)
        */
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m11798(android.graphics.Canvas r103, int r104, int r105, int r106, int r107, int r108, int r109, p067l.C23495 r110, p067l.C8898 r111, p067l.C8506 r112, p067l.C24894 r113) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 4975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.AbstractC5390.m11798(android.graphics.Canvas, int, int, int, int, int, int, l.᩹ۤᩳ, l.ۜܺܿ, l.ۜ֫ܿ, l.᩻۫ᩳ):void");
    }

    /* JADX INFO: renamed from: ֫ */
    private void m11793(Drawable drawable, Drawable drawable2, Drawable drawable3) {
        if (Build.VERSION.SDK_INT >= 29) {
            C14146 c14146 = this.f12821;
            if (c14146.m32607() == null) {
                ArrayList arrayList = this.f12793;
                arrayList.clear();
                int width = c14146.getWidth();
                Rect rect = this.f12801;
                if (drawable != null) {
                    rect.set(drawable.getDirtyBounds());
                    rect.offset(-c14146.getScrollX(), this.f12836 - c14146.m32472());
                    if (rect.right < 200) {
                        rect.left = 0;
                        rect.right = 200;
                        arrayList.add(rect);
                    } else {
                        int i = width - 200;
                        if (rect.left > i) {
                            rect.left = i;
                            rect.right = width;
                            arrayList.add(rect);
                        }
                    }
                } else {
                    if (drawable2 != null) {
                        rect.set(drawable2.getDirtyBounds());
                        rect.offset(-c14146.getScrollX(), this.f12836 - c14146.m32472());
                        if (rect.right < 200) {
                            rect.left = 0;
                            rect.right = 200;
                            arrayList.add(rect);
                        } else {
                            int i2 = width - 200;
                            if (rect.left > i2) {
                                rect.left = i2;
                                rect.right = width;
                                arrayList.add(rect);
                            }
                        }
                    }
                    if (drawable3 != null) {
                        Rect dirtyBounds = drawable3.getDirtyBounds();
                        Rect rect2 = this.f12794;
                        rect2.set(dirtyBounds);
                        rect2.offset(-c14146.getScrollX(), this.f12836 - c14146.m32472());
                        if (rect2.right < 200) {
                            rect2.left = 0;
                            rect2.right = 200;
                            arrayList.add(rect2);
                        } else {
                            int i3 = width - 200;
                            if (rect2.left > i3) {
                                rect2.left = i3;
                                rect2.right = width;
                                arrayList.add(rect2);
                            }
                        }
                    }
                }
                c14146.setSystemGestureExclusionRects(arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m11796(C24047 c24047, Canvas canvas, boolean z, Drawable drawable, RectF rectF, int i) {
        if (drawable == null) {
            rectF.setEmpty();
            if (c24047 != null) {
                c24047.m53295(i, 0, 0, false);
                return;
            }
            return;
        }
        if (c24047 != null) {
            float f = rectF.left;
            C14146 c14146 = this.f12821;
            int paddingLeft = c14146.getPaddingLeft() + ((int) (f - c14146.getScrollX()));
            int paddingTop = c14146.getPaddingTop() + ((int) (rectF.top + (this.f12836 - c14146.m32472())));
            rectF.setEmpty();
            if (z) {
                c24047.m53295(i, paddingLeft, paddingTop, true);
                return;
            } else {
                c24047.m53295(i, 0, 0, false);
                return;
            }
        }
        drawable.draw(canvas);
    }

    /* JADX INFO: renamed from: ᩻ */
    public C6731 mo10207() {
        int i = this.f12814;
        if (i < 0 || !mo11824(i)) {
            return null;
        }
        C14146 c14146 = this.f12821;
        int iM32458 = c14146.m32458();
        int iM32606 = c14146.m32606();
        if (iM32458 <= 0 || iM32606 <= 0) {
            return null;
        }
        RectF rectF = new RectF();
        mo10190(rectF, this.f12814);
        return new C6731(mo10193() ? Math.max(0, ((int) rectF.right) - (iM32458 / 2)) : 0, Math.min(Math.max(0, ((int) rectF.top) - (iM32606 / 2)), Math.max(0, ((int) m11833()) - iM32606)), iM32458, iM32606);
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo10185(int i, int i2) {
        return Math.max(0, Math.min(i, Math.max(0, (((int) (this.f12837.m26496() * (((long) this.f12798.size()) - 1))) - i2) - 1)));
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo11824(int i) {
        return !this.f12798.isEmpty() && i >= 0 && i <= this.f12798.m49695().f38062;
    }

    /* JADX INFO: renamed from: ܽ */
    public long mo11831(int i, int i2) {
        if (this.f12798.isEmpty()) {
            return -1L;
        }
        if (mo11814() && !this.f12821.m32496(this)) {
            return -1L;
        }
        C13533 c13533 = this.f12798.get(m11803(i));
        return (((long) this.f12798.get(m11803(i + i2)).m30798()) & 4294967295L) | (((long) c13533.f38061) << 32);
    }

    /* JADX INFO: renamed from: ۧ */
    public long mo11822(int i, int i2) {
        if (this.f12798.isEmpty()) {
            return 0L;
        }
        if (!mo11814() || this.f12821.m32496(this)) {
            return m11800(m11803(i), m11803(i + i2));
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ܳ */
    private long m11800(int i, int i2) {
        C13533 c13533 = this.f12798.get(i);
        C13533 c13534 = this.f12798.get(i2);
        int iMax = Math.max(0, c13533.f38061 - 10000);
        int iM49682 = this.f12798.m49682(Math.max(0, i - 200));
        int iMin = Math.min(this.f12830, c13534.m30802() ? c13534.m30798() : c13534.f38062 + 10000);
        C22076 c22076 = this.f12798;
        return (((long) Math.max(iMin, c22076.get(Math.min(c22076.m49691(), i2 + 200)).m30798())) & 4294967295L) | (((long) Math.min(iMax, iM49682)) << 32);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m11795(C8898 c8898, int i, int i2) {
        c8898.m20547(this.f12815, this.f12798.get(i).f38061, this.f12798.get(i2).m30798());
        if (this.f12830 <= 1000000 || !this.f12821.m32364()) {
            return;
        }
        if (c8898.m20534(this.f12798.get(i).f38061, this.f12798.get(i2).m30798())) {
            long jM11800 = m11800(i, i2);
            c8898.m20539(this.f12815, (int) (jM11800 >>> 32), (int) jM11800);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m11791(Canvas canvas, int i, int i2, int i3, int i4, float f) {
        float f2;
        C23929 c23929 = this.f12837;
        if (c23929.f75988) {
            boolean z = c23929.f76016;
            if (c23929.f75989) {
                f2 = z ? i : i3 - this.f12800;
            } else {
                f2 = z ? 0.0f : f - this.f12800;
            }
            float f3 = i3;
            if (f3 >= f2) {
                float f4 = i;
                if (f4 > this.f12800 + f2) {
                    return;
                }
                int iSave = canvas.save();
                try {
                    canvas.translate(f2, 0.0f);
                    float f5 = i2;
                    float f6 = i4;
                    canvas.clipRect(Math.max(0.0f, f4 - f2), f5, Math.min(this.f12800, f3 - f2), f6);
                    C3831 c3831 = c23929.f75994;
                    c3831.setColor(c23929.f75983);
                    canvas.drawRect(0.0f, f5, this.f12800, f6, c3831);
                    c3831.setColor(c23929.f76007);
                    float f7 = c23929.f76016 ? this.f12800 - 1 : 1.0f;
                    canvas.drawLine(f7, f5, f7, f6, c3831);
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m11792(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, C23929 c23929, C3831 c3831) {
        int i7;
        int i8 = i3;
        boolean z2 = c23929.f76016;
        int i9 = this.f12800;
        boolean z3 = this.f12821.m32522() < 255;
        if (!z3) {
            c3831.setColor(c23929.f75983);
            canvas.drawRect(0.0f, i, i9, i2, c3831);
        }
        float f2 = c23929.f75970;
        InterfaceC20143 interfaceC20143 = c23929.f75978;
        if (interfaceC20143 != null) {
            interfaceC20143.mo23638(this.f12798, i3, i4, i9, canvas, c3831, c23929);
        }
        if (!z3) {
            C23929 c239210 = this.f12837;
            c3831.setColor(c239210.f76007);
            float f3 = c239210.f76016 ? this.f12800 - 1 : 1.0f;
            canvas.drawLine(f3, i, f3, i2, c3831);
        }
        float f4 = z2 ? i9 - f2 : f2;
        float fM11830 = m11830(i8) + c23929.f76024;
        c3831.setColor(c23929.f76001);
        int iM49684 = i8 > 0 ? this.f12798.m49684(i8 - 1) + 1 : 0;
        C15543 c15543M49686 = this.f12798.m49686();
        float fM11831 = fM11830;
        int i10 = iM49684;
        while (i8 <= i4) {
            int i11 = c15543M49686.m35335(i8).f38063;
            if (i11 > i6 || i5 > i11) {
                i11 = i11;
            } else {
                c3831.setColor(c23929.f76004);
                float f5 = fM11831 - c23929.f76024;
                float f6 = f5 + f;
                if (z2) {
                    canvas.drawRect(i9 - 3, f5, i9, f6, c3831);
                } else {
                    canvas.drawRect(0.0f, f5, 3.0f, f6, c3831);
                }
                c3831.setColor(c23929.f76001);
            }
            int i12 = i11 + 1;
            if (i10 != i12 && (!z || i12 == 1)) {
                String strValueOf = String.valueOf(i12);
                if (z2) {
                    int length = strValueOf.length() - 1;
                    float f7 = f4;
                    while (length >= 0) {
                        canvas.drawText(strValueOf, length, length + 1, f7, fM11831, (Paint) c3831);
                        f7 -= f2;
                        length--;
                        i12 = i12;
                    }
                    i7 = i12;
                } else {
                    i7 = i12;
                    float f8 = f4;
                    int i13 = 0;
                    for (int length2 = strValueOf.length(); i13 < length2; length2 = length2) {
                        int i14 = i13 + 1;
                        canvas.drawText(strValueOf, i13, i14, f8, fM11831, (Paint) c3831);
                        f8 += f2;
                        i13 = i14;
                    }
                }
                i10 = i7;
            }
            i8++;
            fM11831 = m11830(i8) + c23929.f76024;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo10192(C11996 c11996) {
        C22076 c22076;
        c11996.writeByte(mo10205());
        c11996.writeInt(this.f12800);
        if (this.f12816 && mo10205() == 1) {
            c22076 = new C22076(this.f12798);
        } else {
            c22076 = this.f12798;
        }
        c11996.writeInt(c22076.size());
        c11996.writeInt(-249333469);
        C15543 c15543M49686 = c22076.m49686();
        for (int i = 0; i < c22076.size(); i++) {
            C13533 c13533M35335 = c15543M49686.m35335(i);
            c11996.writeInt(c13533M35335.f38061);
            c11996.writeInt(c13533M35335.f38062);
            c11996.writeInt(c13533M35335.f38063);
        }
        c11996.writeInt(1916422180);
        c11996.writeInt(this.f12833.size());
        C22921 c22921 = this.f12833;
        c22921.getClass();
        C3474 c3474 = new C3474(c22921);
        for (int i2 = 0; i2 < this.f12833.size(); i2++) {
            c3474.m6205(i2);
            c11996.mo15113(c3474.m6204());
            char cM6200 = c3474.m6200();
            if (cM6200 > 255) {
                cM6200 = 255;
            }
            c11996.writeByte(cM6200);
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public boolean mo11814() {
        return this.f12816;
    }

    /* JADX INFO: renamed from: ܶ */
    public void mo11828() {
        if (m11801()) {
            this.f12833.m51209(this, this.f12821.m32500(), this.f12798, this.f12837.m26497());
        }
    }
}
