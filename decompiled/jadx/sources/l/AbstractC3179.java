package l;

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
public abstract class AbstractC3179 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f9993;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Rect f9994;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f9995;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final int[] f9996;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14792 f9997;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C20736 f9998;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C14792 f9999;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f10000;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Rect f10001;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f10002;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f10003;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final RectF f10004;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Runnable f10005;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f10006;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f10007;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public volatile int f10008;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C20113 f10009;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final RectF f10010;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f10011;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC7785 f10012;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final int[] f10013;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f10014;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC7785 f10015;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile boolean f10016;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f10017;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile C18743 f10018;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f10019;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C20736 f10020;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C12392 f10021;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile C7744 f10022;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f10023;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C1869 f10024;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public boolean f10025;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f10026;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f10027;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f10028;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f10029;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f10030;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f10031;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final RectF f10032;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C21625 f10033;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C18803 f10034;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C7744 f10035;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f10036;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public C22686 f10037;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean mo9758() {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo8153(C4590 c4590);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8154(float f);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8155(int i, int i2, int i3);

    /* JADX INFO: renamed from: ֫ */
    public void mo8156(Canvas canvas, int i, float f, int i2, C1539 c1539) {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo8160();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean mo9774() {
        return false;
    }

    /* JADX INFO: renamed from: ۢ */
    public abstract float mo8163();

    /* JADX INFO: renamed from: ۤ */
    public abstract int mo8164();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo8165();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo8166(InterfaceC7785 interfaceC7785);

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo8167(C4590 c4590);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void mo9783(int i) {
    }

    /* JADX INFO: renamed from: ᩶ */
    public abstract Throwable mo8171();

    /* JADX INFO: renamed from: ᩷ */
    public abstract byte mo8172();

    /* JADX INFO: renamed from: ᩸ */
    public abstract void mo8173();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7744 m9797() {
        C7744 c7744Mo26556;
        synchronized (this.f10017) {
            C7744 c7744 = this.f10035;
            c7744Mo26556 = c7744 == null ? this.f10015.mo26556() : c7744.m20762();
        }
        return c7744Mo26556;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m9776() {
        boolean z;
        synchronized (this.f10017) {
            z = this.f10035 != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m9781() {
        return this.f10008;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo8157(RectF rectF, int i) {
        float fM18410;
        float f;
        if (i < 0) {
            i = 0;
        } else {
            int i2 = this.f10030;
            if (i > i2) {
                i = i2;
            }
        }
        int iM9762 = m9762(i, this.f10025);
        C11747 c11747 = this.f9998.get(iM9762);
        int iM9792 = m9792(iM9762);
        int iMin = Math.min(i, c11747.m28750());
        int i3 = c11747.f35062;
        int i4 = c11747.f35063;
        C22686 c22686 = this.f10037;
        if (i3 == i4) {
            fM18410 = c22686.f73281;
            f = 0.0f;
        } else {
            C7744 c7744Mo26556 = this.f10015.mo26556();
            try {
                C6761 c6761M9746 = m9746(c11747.f35062, c11747.m28750(), c7744Mo26556);
                float fM18411 = c6761M9746.m18410(Float.POSITIVE_INFINITY, iMin);
                if (c11747.m28750() <= iMin) {
                    fM18410 = c22686.f73281 + fM18411;
                } else {
                    fM18410 = c6761M9746.m18410(Float.POSITIVE_INFINITY, C22412.m50336(iMin, c11747.m28750(), c7744Mo26556));
                }
                c7744Mo26556.close();
                f = fM18411;
            } catch (Throwable th) {
                try {
                    c7744Mo26556.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        float f2 = iM9792;
        rectF.left = f + f2;
        rectF.right = fM18410 + f2;
        float fM24484 = c22686.m24484();
        float f3 = iM9762 * fM24484;
        rectF.top = f3;
        rectF.bottom = f3 + fM24484;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m9775() {
        return this.f10030 == 0 && !this.f10020.isEmpty();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m9779(RectF rectF, int i) {
        if (i < 0) {
            i = 0;
        } else {
            int i2 = this.f10030;
            if (i > i2) {
                i = i2;
            }
        }
        int iM9762 = m9762(i, this.f10025);
        float fM24484 = this.f10037.m24484();
        float f = iM9762 * fM24484;
        rectF.top = f;
        rectF.bottom = f + fM24484;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m9782() {
        return this.f10030;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean mo9791(int i, int i2) {
        int i3 = this.f10030;
        int iMax = Math.max(0, i);
        int iMin = Math.min(i3, i2);
        if (iMax < iMin && !this.f9998.isEmpty() && !this.f10033.isEmpty()) {
            int iM9762 = m9762(iMax, true);
            int iM9763 = m9762(iMin - 1, false);
            int iM47357 = this.f9998.m47357(iM9762);
            int iM47358 = this.f9998.m47357(iM9763) + 1;
            int iM47366 = this.f9998.m47366(iM9762);
            int iM24485 = this.f10037.m24485();
            C7744 c7744Mo26556 = this.f10015.mo26556();
            for (int i4 = iM47357; i4 < iM47358; i4++) {
                try {
                    iM47366 = this.f9998.m47367(i4, iM47366);
                    if (iM47366 == -1 || i4 >= this.f10033.size()) {
                        break;
                        break;
                    }
                    this.f10033.m48860(i4, this, c7744Mo26556, this.f9998.m47355(iM47366), iM24485);
                } catch (Throwable th) {
                    try {
                        c7744Mo26556.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            c7744Mo26556.close();
            this.f10033.m48866(iM47357, iM47358);
            this.f10034.f59347 = Integer.MIN_VALUE;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m9794(int i, int i2) {
        if (i < 0) {
            i = 0;
        } else {
            int i3 = this.f10030;
            if (i > i3) {
                i = i3;
            }
        }
        if (i2 < 0) {
            i2 = 0;
        } else {
            int i4 = this.f10030;
            if (i2 > i4) {
                i2 = i4;
            }
        }
        return m9762(i, this.f10025) == m9762(i2, this.f10025);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m9757() {
        return this.f10015 != null && this.f10008 == this.f10015.mo26548();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9773() {
        synchronized (this.f10017) {
            C7744 c7744 = this.f10035;
            if (c7744 != null) {
                c7744.close();
                this.f10035 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9768(InterfaceC7785 interfaceC7785, C7744 c7744) {
        synchronized (this.f10017) {
            m9773();
            this.f10015 = interfaceC7785;
            this.f10035 = c7744;
            this.f10008 = c7744.m20767();
            this.f10030 = c7744.length();
        }
        m9785();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9750(AbstractC3179 abstractC3179) {
        abstractC3179.f10031.set(false);
        abstractC3179.m9755();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m9788() {
        int i;
        if (this instanceof C17474) {
            i = ((C17474) this).m40872() ? 1 : 2;
        } else {
            i = 0;
        }
        this.f10018 = this.f10021.m30538(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC3179 m9745(C12392 c12392, InterfaceC7785 interfaceC7785, C22686 c22686, int i) {
        if (i == 0) {
            return new C2575(c12392, interfaceC7785, c22686);
        }
        return new C17474(c12392, interfaceC7785, c22686, i == 1);
    }

    public AbstractC3179(C12392 c12392, C22686 c22686) {
        this.f10011 = C11266.m27878(10.0f);
        this.f10017 = new Object();
        this.f10003 = new AtomicInteger();
        this.f10031 = new AtomicBoolean();
        this.f10005 = new RunnableC6772(1, this);
        this.f10009 = new C20113(this);
        this.f9998 = new C20736();
        this.f10033 = new C21625();
        this.f10020 = new C20736();
        this.f10014 = -1;
        this.f10025 = true;
        this.f10004 = new RectF();
        this.f10032 = new RectF();
        this.f10010 = new RectF();
        this.f9999 = new C14792(-1);
        this.f9997 = new C14792(1);
        this.f10034 = new C18803();
        this.f10024 = new C1869();
        this.f9996 = new int[3];
        this.f10013 = new int[7];
        this.f10001 = new Rect();
        this.f9994 = new Rect();
        this.f9993 = new ArrayList(2);
        this.f10016 = false;
        this.f10019 = false;
        this.f10021 = c12392;
        this.f10037 = c22686;
        this.f10018 = c12392.m30544();
    }

    public AbstractC3179(C12392 c12392, InterfaceC7785 interfaceC7785, C22686 c22686, C12951 c12951) {
        this.f10011 = C11266.m27878(10.0f);
        this.f10017 = new Object();
        this.f10003 = new AtomicInteger();
        this.f10031 = new AtomicBoolean();
        this.f10005 = new RunnableC6772(1, this);
        this.f10009 = new C20113(this);
        this.f9998 = new C20736();
        this.f10033 = new C21625();
        this.f10020 = new C20736();
        this.f10014 = -1;
        this.f10025 = true;
        this.f10004 = new RectF();
        this.f10032 = new RectF();
        this.f10010 = new RectF();
        this.f9999 = new C14792(-1);
        this.f9997 = new C14792(1);
        this.f10034 = new C18803();
        this.f10024 = new C1869();
        this.f9996 = new int[3];
        this.f10013 = new int[7];
        this.f10001 = new Rect();
        this.f9994 = new Rect();
        this.f9993 = new ArrayList(2);
        this.f10016 = false;
        this.f10019 = false;
        this.f10021 = c12392;
        this.f10037 = c22686;
        this.f10018 = c12392.m30544();
        this.f10000 = c12951.readInt();
        int i = c12951.readInt();
        this.f9998.getClass();
        boolean zM31490 = c12951.m31490(-249333469);
        C11747 c11747 = new C11747();
        for (int i2 = 0; i2 < i; i2++) {
            c11747.m28751(c12951.readInt(), c12951.readInt(), c12951.readInt());
            this.f9998.m47353(c11747);
            if (!zM31490) {
                c12951.skipBytes(4);
            }
        }
        if (c12951.m31490(1916422180)) {
            int i3 = c12951.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                this.f10033.add(c12951.m31494() | ((c12951.readByte() & 255) << 16));
            }
            this.f10033.m48865();
            return;
        }
        this.f10033.m48861(this, interfaceC7785, this.f9998, c22686.m24485());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9767(InterfaceC7785 interfaceC7785) {
        synchronized (this.f10017) {
            if (this.f10035 == null || this.f10015 != interfaceC7785) {
                m9768(interfaceC7785, interfaceC7785.mo26556());
            }
        }
        m9785();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m9785() {
        if (this instanceof C2575) {
            ((C2575) this).m8168();
        }
        this.f10003.incrementAndGet();
        if (this.f10022 == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m9755();
        } else if (this.f10031.compareAndSet(false, true)) {
            C4925.m14315(this.f10005);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m9755() {
        if (this.f10007) {
            return;
        }
        if (this.f9995 == this.f10003.get() && this.f10012 == this.f10015) {
            return;
        }
        C7744 c7744 = this.f10022;
        this.f10022 = null;
        this.f10012 = null;
        if (c7744 != null) {
            c7744.close();
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private C7744 m9753() {
        InterfaceC7785 interfaceC7785 = this.f10015;
        int i = this.f10003.get();
        if (this.f10022 == null || this.f10012 != interfaceC7785 || this.f9995 != i || !interfaceC7785.mo26553(this.f10022)) {
            C7744 c7744 = this.f10022;
            this.f10022 = null;
            this.f10012 = null;
            if (c7744 != null) {
                c7744.close();
            }
            this.f10012 = interfaceC7785;
            this.f9995 = i;
            this.f10022 = interfaceC7785.mo26556();
            this.f10022.f23961 = true;
        }
        return this.f10022;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m9793() {
        if (this.f9998.isEmpty() || this.f9998.m47368().f35063 != this.f10030) {
            System.err.println("Lines check fail. Try fix.");
            mo8166(this.f10015);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo8158(String str) {
        this.f10006 = str;
        if (str == null || str.isEmpty()) {
            this.f10020.clear();
            return;
        }
        C20736 c20736 = new C20736();
        C11747 c11747 = new C11747();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (z) {
            int iIndexOf = this.f10021.mo25898() ? -1 : str.indexOf(10, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
                z = false;
            }
            c11747.m28751(i, iIndexOf, i2);
            c20736.m47353(c11747);
            i = iIndexOf + 1;
            i2++;
        }
        this.f10020 = c20736;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final double m9789() {
        boolean zM9775 = m9775();
        C12392 c12392 = this.f10021;
        AbstractC21708 abstractC21708 = c12392.f37236;
        return (((double) this.f10037.m24484()) * ((double) (zM9775 ? this.f10020 : this.f9998).size())) + ((double) Math.max(c12392.m30459(), abstractC21708 != null ? abstractC21708.m49031() : 0));
    }

    /* JADX INFO: renamed from: ܳ */
    public int mo8169() {
        C22686 c22686 = this.f10037;
        boolean z = c22686.f73291;
        int i = c22686.f73238;
        if (z) {
            return c22686.f73263 ? this.f10000 + c22686.f73251 : c22686.f73273;
        }
        if (c22686.f73286) {
            return i + c22686.f73251;
        }
        return Math.max(c22686.f73251, i);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m9792(int i) {
        int iMo8169 = mo8169();
        return (!mo9758() || this.f9998.m47369(i)) ? iMo8169 : this.f10037.m50687() + iMo8169;
    }

    /* JADX INFO: renamed from: ۜ */
    public int mo8162() {
        C22686 c22686 = this.f10037;
        boolean z = c22686.f73291;
        int i = c22686.f73238;
        if (!z) {
            return c22686.f73263 ? this.f10000 + c22686.f73251 : c22686.f73273;
        }
        if (c22686.f73286) {
            return i + c22686.f73251;
        }
        return Math.max(c22686.f73251, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m9761(int i) {
        float length = String.valueOf(((long) this.f9998.m47368().f35064) + 1 + ((long) i)).length() + 1;
        C22686 c22686 = this.f10037;
        return (int) ((length + c22686.f73254) * c22686.f73245);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m9771() {
        this.f10025 = true;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m9796() {
        return this.f10025;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m9760(float f, float f2) {
        this.f10002 = false;
        int iM9759 = m9759(f2);
        if (f <= m9792(iM9759)) {
            return m9763(this.f10015, iM9759, f);
        }
        C7744 c7744Mo26556 = this.f10015.mo26556();
        try {
            int iM9763 = m9763(c7744Mo26556, iM9759, f);
            c7744Mo26556.close();
            return iM9763;
        } catch (Throwable th) {
            try {
                c7744Mo26556.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m9759(double d) {
        int iM24484 = (int) (d / ((double) this.f10037.m24484()));
        if (iM24484 < 0) {
            this.f10002 = true;
            return 0;
        }
        if (iM24484 < this.f9998.size()) {
            return iM24484;
        }
        this.f10002 = true;
        return this.f9998.m47364();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m9744(double d, boolean z) {
        int iM24484 = (int) (d / ((double) this.f10037.m24484()));
        if (iM24484 < 0) {
            return 0;
        }
        if (z) {
            return iM24484 >= this.f10020.size() ? this.f10020.m47364() : iM24484;
        }
        return iM24484 >= this.f9998.size() ? this.f9998.m47364() : iM24484;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m9763(CharSequence charSequence, int i, float f) {
        float fM9792 = f - m9792(i);
        C11747 c11747 = this.f9998.get(i);
        int i2 = c11747.f35062;
        int iM28750 = c11747.m28750();
        boolean z = true;
        if (fM9792 <= 0.0f) {
            this.f10025 = true;
            return i2;
        }
        C6761 c6761M9746 = m9746(i2, iM28750, charSequence);
        int iM18411 = c6761M9746.m18411(fM9792);
        if (iM18411 == iM28750) {
            this.f10002 = fM9792 > c6761M9746.m18409();
        }
        if (iM18411 != i2 && !this.f9998.m47356(i)) {
            z = false;
        }
        this.f10025 = z;
        return iM18411;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C6761 m9746(int i, int i2, CharSequence charSequence) {
        C22686 c22686 = this.f10037;
        if (c22686.f73267) {
            C12392 c12392 = this.f10021;
            if (c12392.f37235.m18575()) {
                return c12392.f37235.m18556(charSequence, i, i2, c22686);
            }
        }
        return this.f10037.m24476(charSequence, i, i2, 0.0f, (C18159) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m9769(RectF rectF) {
        int selectionStart = Selection.getSelectionStart(this.f10015);
        int selectionEnd = Selection.getSelectionEnd(this.f10015);
        if (selectionStart == selectionEnd) {
            return false;
        }
        if (selectionStart > selectionEnd) {
            selectionEnd = selectionStart;
            selectionStart = selectionEnd;
        }
        int iM9762 = m9762(selectionStart, this.f10025);
        C11747 c11747 = this.f9998.get(iM9762);
        if (c11747.f35062 >= selectionEnd || selectionEnd > c11747.f35063) {
            return false;
        }
        int iM9792 = m9792(iM9762);
        C7744 c7744Mo26556 = this.f10015.mo26556();
        try {
            C6761 c6761M9746 = m9746(c11747.f35062, c11747.m28750(), c7744Mo26556);
            float fM18410 = c6761M9746.m18410(Float.POSITIVE_INFINITY, Math.min(selectionStart, c11747.m28750()));
            float fM18411 = c6761M9746.m18410(Float.POSITIVE_INFINITY, Math.min(selectionEnd, c11747.m28750()));
            float f = iM9792;
            rectF.left = fM18410 + f;
            rectF.right = fM18411 + f;
            c7744Mo26556.close();
            float fM24484 = this.f10037.m24484();
            float f2 = iM9762 * fM24484;
            rectF.top = f2;
            rectF.bottom = f2 + fM24484;
            return true;
        } catch (Throwable th) {
            try {
                c7744Mo26556.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m9790(int i) {
        return m9762(i, this.f10025);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m9762(int i, boolean z) {
        int i2;
        C11747 c11747M33216;
        int i3;
        int i4 = 0;
        if (i <= 0) {
            return 0;
        }
        if (i >= this.f9998.m47368().f35063) {
            return this.f9998.m47364();
        }
        C20736 c20736 = this.f9998;
        int size = c20736.size();
        C13862 c13862M47359 = c20736.m47359();
        while (true) {
            i2 = (i4 + size) >>> 1;
            c11747M33216 = c13862M47359.m33216(i2);
            i3 = c11747M33216.f35062;
            if (i >= i3) {
                int i5 = c11747M33216.f35063;
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
        if (i != i3 || c20736.m47369(i2)) {
            return (i == c11747M33216.f35063 && !c20736.m47356(i2) && z) ? i2 + 1 : i2;
        }
        return z ? i2 : i2 - 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23266 m9764(C7744 c7744, int i, int i2) {
        if (this.f10021.mo25898()) {
            i = i2;
        }
        return c7744.m20763(i, i2);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m9795() {
        return this.f10027;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m9772() {
        return this.f10023;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m9777(float f) {
        C12392 c12392 = this.f10021;
        return (f - c12392.getPaddingTop()) + (c12392.m30408() - this.f10036);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float m9786(int i) {
        return (float) ((((double) i) * ((double) this.f10037.m24484())) - ((double) this.f10036));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9765(Canvas canvas, int i, int i2, int i3, int i4) {
        canvas.drawColor(this.f10037.f73275);
        m9747(canvas, i, i2, i3, i4, i3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9766(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6, C22229 c22229, C6870 c6870, C6458 c6458, C23701 c23701) {
        C12392 c12392 = this.f10021;
        C20113 c20113 = this.f10009;
        if (this instanceof C2575) {
            ((C2575) this).m8170(i2, i4);
        }
        this.f10007 = true;
        int iSave = canvas.save();
        this.f10036 = c12392.m30408() - c12392.getScrollY();
        try {
            m9754(canvas, i, i2, i3, i4, i5, i6, c22229, c6870, c6458, c23701);
            canvas.restoreToCount(iSave);
            c20113.f65139 = null;
            c20113.f65137 = null;
            c20113.f65141 = null;
            this.f10007 = false;
            m9755();
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            c20113.f65139 = null;
            c20113.f65137 = null;
            c20113.f65141 = null;
            this.f10007 = false;
            C7744 c7744 = this.f10022;
            this.f10022 = null;
            this.f10012 = null;
            if (c7744 != null) {
                c7744.close();
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m9754(android.graphics.Canvas r103, int r104, int r105, int r106, int r107, int r108, int r109, l.C22229 r110, l.C6870 r111, l.C6458 r112, l.C23701 r113) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 4975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC3179.m9754(android.graphics.Canvas, int, int, int, int, int, int, l.᩹ۤᩳ, l.ۜܺܿ, l.ۜ֫ܿ, l.᩻۫ᩳ):void");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9749(Drawable drawable, Drawable drawable2, Drawable drawable3) {
        if (Build.VERSION.SDK_INT >= 29) {
            C12392 c12392 = this.f10021;
            if (c12392.m30543() == null) {
                ArrayList arrayList = this.f9993;
                arrayList.clear();
                int width = c12392.getWidth();
                Rect rect = this.f10001;
                if (drawable != null) {
                    rect.set(drawable.getDirtyBounds());
                    rect.offset(-c12392.getScrollX(), this.f10036 - c12392.m30408());
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
                        rect.offset(-c12392.getScrollX(), this.f10036 - c12392.m30408());
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
                        Rect rect2 = this.f9994;
                        rect2.set(dirtyBounds);
                        rect2.offset(-c12392.getScrollX(), this.f10036 - c12392.m30408());
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
                c12392.setSystemGestureExclusionRects(arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9752(C22810 c22810, Canvas canvas, boolean z, Drawable drawable, RectF rectF, int i) {
        if (drawable == null) {
            rectF.setEmpty();
            if (c22810 != null) {
                c22810.m50905(i, 0, 0, false);
                return;
            }
            return;
        }
        if (c22810 != null) {
            float f = rectF.left;
            C12392 c12392 = this.f10021;
            int paddingLeft = c12392.getPaddingLeft() + ((int) (f - c12392.getScrollX()));
            int paddingTop = c12392.getPaddingTop() + ((int) (rectF.top + (this.f10036 - c12392.m30408())));
            rectF.setEmpty();
            if (z) {
                c22810.m50905(i, paddingLeft, paddingTop, true);
                return;
            } else {
                c22810.m50905(i, 0, 0, false);
                return;
            }
        }
        drawable.draw(canvas);
    }

    /* JADX INFO: renamed from: ᩻ */
    public C4590 mo8174() {
        int i = this.f10014;
        if (i < 0 || !mo9780(i)) {
            return null;
        }
        C12392 c12392 = this.f10021;
        int iM30394 = c12392.m30394();
        int iM30542 = c12392.m30542();
        if (iM30394 <= 0 || iM30542 <= 0) {
            return null;
        }
        RectF rectF = new RectF();
        mo8157(rectF, this.f10014);
        return new C4590(mo8160() ? Math.max(0, ((int) rectF.right) - (iM30394 / 2)) : 0, Math.min(Math.max(0, ((int) rectF.top) - (iM30542 / 2)), Math.max(0, ((int) m9789()) - iM30542)), iM30394, iM30542);
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo8152(int i, int i2) {
        return Math.max(0, Math.min(i, Math.max(0, (((int) (this.f10037.m24484() * (((long) this.f9998.size()) - 1))) - i2) - 1)));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean mo9780(int i) {
        return !this.f9998.isEmpty() && i >= 0 && i <= this.f9998.m47368().f35063;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long mo9787(int i, int i2) {
        if (this.f9998.isEmpty()) {
            return -1L;
        }
        if (mo9770() && !this.f10021.m30432(this)) {
            return -1L;
        }
        C11747 c11747 = this.f9998.get(m9759(i));
        return (((long) this.f9998.get(m9759(i + i2)).m28750()) & 4294967295L) | (((long) c11747.f35062) << 32);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long mo9778(int i, int i2) {
        if (this.f9998.isEmpty()) {
            return 0L;
        }
        if (!mo9770() || this.f10021.m30432(this)) {
            return m9756(m9759(i), m9759(i + i2));
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private long m9756(int i, int i2) {
        C11747 c11747 = this.f9998.get(i);
        C11747 c11748 = this.f9998.get(i2);
        int iMax = Math.max(0, c11747.f35062 - 10000);
        int iM47355 = this.f9998.m47355(Math.max(0, i - 200));
        int iMin = Math.min(this.f10030, c11748.m28754() ? c11748.m28750() : c11748.f35063 + 10000);
        C20736 c20736 = this.f9998;
        return (((long) Math.max(iMin, c20736.get(Math.min(c20736.m47364(), i2 + 200)).m28750())) & 4294967295L) | (((long) Math.min(iMax, iM47355)) << 32);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9751(C6870 c6870, int i, int i2) {
        c6870.m18598(this.f10015, this.f9998.get(i).f35062, this.f9998.get(i2).m28750());
        if (this.f10030 <= 1000000 || !this.f10021.m30300()) {
            return;
        }
        if (c6870.m18585(this.f9998.get(i).f35062, this.f9998.get(i2).m28750())) {
            long jM9756 = m9756(i, i2);
            c6870.m18590(this.f10015, (int) (jM9756 >>> 32), (int) jM9756);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9747(Canvas canvas, int i, int i2, int i3, int i4, float f) {
        float f2;
        C22686 c22686 = this.f10037;
        if (c22686.f73263) {
            boolean z = c22686.f73291;
            if (c22686.f73264) {
                f2 = z ? i : i3 - this.f10000;
            } else {
                f2 = z ? 0.0f : f - this.f10000;
            }
            float f3 = i3;
            if (f3 >= f2) {
                float f4 = i;
                if (f4 > this.f10000 + f2) {
                    return;
                }
                int iSave = canvas.save();
                try {
                    canvas.translate(f2, 0.0f);
                    float f5 = i2;
                    float f6 = i4;
                    canvas.clipRect(Math.max(0.0f, f4 - f2), f5, Math.min(this.f10000, f3 - f2), f6);
                    C1539 c1539 = c22686.f73269;
                    c1539.setColor(c22686.f73258);
                    canvas.drawRect(0.0f, f5, this.f10000, f6, c1539);
                    c1539.setColor(c22686.f73282);
                    float f7 = c22686.f73291 ? this.f10000 - 1 : 1.0f;
                    canvas.drawLine(f7, f5, f7, f6, c1539);
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9748(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, C22686 c22686, C1539 c1539) {
        int i7;
        int i8 = i3;
        boolean z2 = c22686.f73291;
        int i9 = this.f10000;
        boolean z3 = this.f10021.m30458() < 255;
        if (!z3) {
            c1539.setColor(c22686.f73258);
            canvas.drawRect(0.0f, i, i9, i2, c1539);
        }
        float f2 = c22686.f73245;
        InterfaceC18702 interfaceC18702 = c22686.f73253;
        if (interfaceC18702 != null) {
            interfaceC18702.mo21669(this.f9998, i3, i4, i9, canvas, c1539, c22686);
        }
        if (!z3) {
            C22686 c22687 = this.f10037;
            c1539.setColor(c22687.f73282);
            float f3 = c22687.f73291 ? this.f10000 - 1 : 1.0f;
            canvas.drawLine(f3, i, f3, i2, c1539);
        }
        float f4 = z2 ? i9 - f2 : f2;
        float fM9786 = m9786(i8) + c22686.f73299;
        c1539.setColor(c22686.f73276);
        int iM47357 = i8 > 0 ? this.f9998.m47357(i8 - 1) + 1 : 0;
        C13862 c13862M47359 = this.f9998.m47359();
        float fM9787 = fM9786;
        int i10 = iM47357;
        while (i8 <= i4) {
            int i11 = c13862M47359.m33216(i8).f35064;
            if (i11 > i6 || i5 > i11) {
                i11 = i11;
            } else {
                c1539.setColor(c22686.f73279);
                float f5 = fM9787 - c22686.f73299;
                float f6 = f5 + f;
                if (z2) {
                    canvas.drawRect(i9 - 3, f5, i9, f6, c1539);
                } else {
                    canvas.drawRect(0.0f, f5, 3.0f, f6, c1539);
                }
                c1539.setColor(c22686.f73276);
            }
            int i12 = i11 + 1;
            if (i10 != i12 && (!z || i12 == 1)) {
                String strValueOf = String.valueOf(i12);
                if (z2) {
                    int length = strValueOf.length() - 1;
                    float f7 = f4;
                    while (length >= 0) {
                        canvas.drawText(strValueOf, length, length + 1, f7, fM9787, (Paint) c1539);
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
                        canvas.drawText(strValueOf, i13, i14, f8, fM9787, (Paint) c1539);
                        f8 += f2;
                        i13 = i14;
                    }
                }
                i10 = i7;
            }
            i8++;
            fM9787 = m9786(i8) + c22686.f73299;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo8159(C10130 c10130) {
        C20736 c20736;
        c10130.writeByte(mo8172());
        c10130.writeInt(this.f10000);
        if (this.f10016 && mo8172() == 1) {
            c20736 = new C20736(this.f9998);
        } else {
            c20736 = this.f9998;
        }
        c10130.writeInt(c20736.size());
        c10130.writeInt(-249333469);
        C13862 c13862M47359 = c20736.m47359();
        for (int i = 0; i < c20736.size(); i++) {
            C11747 c11747M33216 = c13862M47359.m33216(i);
            c10130.writeInt(c11747M33216.f35062);
            c10130.writeInt(c11747M33216.f35063);
            c10130.writeInt(c11747M33216.f35064);
        }
        c10130.writeInt(1916422180);
        c10130.writeInt(this.f10033.size());
        C21625 c21625 = this.f10033;
        c21625.getClass();
        C1163 c1163 = new C1163(c21625);
        for (int i2 = 0; i2 < this.f10033.size(); i2++) {
            c1163.m3964(i2);
            c10130.mo13231(c1163.m3963());
            char cM3959 = c1163.m3959();
            if (cM3959 > 255) {
                cM3959 = 255;
            }
            c10130.writeByte(cM3959);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean mo9770() {
        return this.f10016;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void mo9784() {
        if (m9757()) {
            this.f10033.m48861(this, this.f10021.m30436(), this.f9998, this.f10037.m24485());
        }
    }
}
