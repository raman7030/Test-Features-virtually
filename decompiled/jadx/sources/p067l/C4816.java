package p067l;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۖܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5YY */
/* JADX INFO: loaded from: classes2.dex */
public final class C4816 extends AbstractC5390 {

    /* JADX INFO: renamed from: ֡֫ */
    public volatile Throwable f10924;

    /* JADX INFO: renamed from: ֨֫ */
    public volatile C16039 f10925;

    /* JADX INFO: renamed from: ۖ֫ */
    public float f10926;

    /* JADX INFO: renamed from: ۗ֫ */
    public int f10927;

    /* JADX INFO: renamed from: ۘ֫ */
    public C24757 f10928;

    /* JADX INFO: renamed from: ۙ֫ */
    public int f10929;

    /* JADX INFO: renamed from: ۚ֫ */
    public final AtomicInteger f10930;

    /* JADX INFO: renamed from: ۠֫ */
    public boolean f10931;

    /* JADX INFO: renamed from: ۤ֫ */
    public C12273 f10932;

    /* JADX INFO: renamed from: ۫֫ */
    public C18051 f10933;

    /* JADX INFO: renamed from: ۬֫ */
    public volatile RunnableC17555 f10934;

    /* JADX INFO: renamed from: ܶ֫ */
    public float f10935;

    /* JADX INFO: renamed from: ܺ֫ */
    public float f10936;

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f10937;

    /* JADX INFO: renamed from: ᩵֫ */
    public volatile C6731 f10938;

    /* JADX INFO: renamed from: ᩶֫ */
    public String f10939;

    /* JADX INFO: renamed from: ᩸֫ */
    public float f10940;

    /* JADX INFO: renamed from: ᩹֫ */
    public int f10941;

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10193() {
        return true;
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ᩷ */
    public final byte mo10205() {
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۛ */
    public final boolean m10194() {
        return this.f10935 == 0.0f && this.f10932.size() == this.f12798.size();
    }

    public C4816(C14146 c14146, InterfaceC9768 interfaceC9768, C23929 c23929, int i, C5311 c5311, C11465 c11465, C9729 c9729) {
        float f;
        super(c14146, c23929);
        this.f10932 = new C12273();
        this.f10930 = new AtomicInteger();
        this.f12814 = i;
        if (c9729 != null) {
            m11812(interfaceC9768, c9729.m22742());
        }
        m11811(interfaceC9768);
        try {
            C12273 c12273 = ((C4816) c5311.f12482).f10932;
            C6652 c6652M11489 = c5311.m11489(this, c11465);
            this.f10932.m28295(this.f12798.size());
            int i2 = 0;
            while (i2 < this.f12798.size()) {
                if (i2 < c6652M11489.m15137()) {
                    f = c12273.getFloat(i2);
                } else {
                    f = i2 >= c6652M11489.m15136() ? c12273.getFloat(((c5311.f12493 + 1) + i2) - c6652M11489.m15136()) : -1.0f;
                }
                this.f10932.add(f);
                if (f > this.f10932.getFloat(this.f10937)) {
                    this.f10937 = i2;
                }
                i2++;
            }
            this.f12800 = m11805(0);
            this.f10931 = true;
            m10176();
        } finally {
            if (!this.f12816) {
                m11817();
            }
        }
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ۤ */
    public final int mo10197() {
        return this.f10930.get();
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ᩶ */
    public final Throwable mo10204() {
        return this.f10924;
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo10200(C6731 c6731) {
        return c6731.m15388() > 0 && mo10186(c6731) == c6731.m15388();
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ֫ */
    public final int mo10186(C6731 c6731) {
        if (this.f12819 || this.f10924 != null || this.f10938 == null || c6731.m15388() <= 0) {
            return 0;
        }
        if (this.f12814 < 0) {
            if (c6731.equals(this.f10938)) {
                return c6731.m15388();
            }
            return 0;
        }
        C16039 c16039 = this.f10925;
        if (c16039 == null || c6731.m15389() != this.f10938.m15389() || c6731.m15390() < 0) {
            return 0;
        }
        if (c6731.m15391() < this.f12837.m26496() * c16039.m36490()) {
            return 0;
        }
        return (int) Math.max(0.0d, Math.min(c6731.m15388(), (Math.ceil(this.f12837.m26496() * c16039.m36488()) - 1.0d) - ((double) c6731.m15391())));
    }

    public C4816(C14146 c14146, InterfaceC9768 interfaceC9768, C23929 c23929) {
        this(c14146, interfaceC9768, c23929, -1, null);
    }

    public C4816(C14146 c14146, InterfaceC9768 interfaceC9768, C23929 c23929, int i, C9729 c9729) {
        super(c14146, c23929);
        this.f10932 = new C12273();
        this.f10930 = new AtomicInteger();
        this.f12814 = i;
        if (c9729 != null) {
            m11812(interfaceC9768, c9729.m22742());
        }
        mo10199(interfaceC9768);
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ֫ */
    public final int mo10185(int i, int i2) {
        C16039 c16039 = this.f10925;
        if (c16039 == null) {
            return super.mo10185(i, i2);
        }
        int iCeil = (int) Math.ceil(this.f12837.m26496() * c16039.m36490());
        return Math.max(iCeil, Math.min(i, Math.max(iCeil, (((int) (this.f12837.m26496() * c16039.m36488())) - i2) - 1)));
    }

    public C4816(C14146 c14146, InterfaceC9768 interfaceC9768, C23929 c23929, C14677 c14677) throws Throwable {
        super(c14146, interfaceC9768, c23929, c14677);
        this.f10932 = new C12273();
        this.f10930 = new AtomicInteger();
        this.f10937 = c14677.readInt();
        int size = this.f12798.size();
        this.f10932.m28295(size);
        for (int i = 0; i < size; i++) {
            this.f10932.add(-1.0f);
        }
        m11811(interfaceC9768);
        try {
            C9729 c9729M11841 = m11841();
            try {
                C15543 c15543M49686 = this.f12798.m49686();
                for (int i2 = 0; i2 < this.f12798.size(); i2++) {
                    C13533 c13533M35335 = c15543M49686.m35335(i2);
                    c13533M35335.m30800(c9729M11841);
                    this.f12798.m49689(i2, c13533M35335);
                }
                c9729M11841.close();
                m11817();
                m10176();
            } catch (Throwable th) {
                try {
                    c9729M11841.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            m11817();
            throw th3;
        }
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ֫ */
    public final void mo10191(String str) {
        super.mo10191(str);
        m10178();
    }

    /* JADX INFO: renamed from: ܰ */
    private void m10178() {
        int size = this.f12820.size();
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            float fM30797 = this.f12820.get(i).m30797(this.f12806, this.f12837);
            if (fM30797 > f) {
                f = fM30797;
            }
        }
        this.f10936 = f;
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ۧ */
    public final void mo10199(InterfaceC9768 interfaceC9768) {
        try {
            m10181(interfaceC9768);
        } finally {
            if (!this.f12816) {
                m11817();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m10181(InterfaceC9768 interfaceC9768) throws Throwable {
        m11832();
        this.f10931 = false;
        this.f10935 = 0.0f;
        mo10198();
        this.f12826 = false;
        m11811(interfaceC9768);
        C22076 c22076 = this.f12798.isEmpty() ? this.f12798 : new C22076();
        C22921 c22921 = this.f12833.isEmpty() ? this.f12833 : new C22921();
        this.f10932 = new C12273();
        this.f10933 = null;
        this.f10926 = 0.0f;
        c22921.clear();
        C9729 c9729M11841 = m11841();
        try {
            int iM26497 = this.f12837.m26497();
            C24481 c24481M11808 = m11808(c9729M11841, 0, c9729M11841.length());
            try {
                C13533 c13533 = new C13533();
                boolean z = true;
                int i = 0;
                int i2 = 0;
                while (z) {
                    if (this.f12826) {
                        c22076.clear();
                        this.f10932.clear();
                        c22921.clear();
                        c24481M11808.close();
                        c9729M11841.close();
                        return;
                    }
                    c22921.add(C20910.m47222(this, c9729M11841, i, iM26497));
                    int iM53980 = c24481M11808.m53980();
                    if (iM53980 == -1) {
                        iM53980 = c9729M11841.length();
                        z = false;
                    }
                    c13533.m30799(i, iM53980, i2);
                    c22076.m49680(c13533);
                    this.f10932.add(-1.0f);
                    i = iM53980 + 1;
                    i2++;
                    try {
                        c9729M11841.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
                c24481M11808.close();
                c22921.m51213();
                C15543 c15543M49686 = c22076.m49686();
                for (int i3 = 0; i3 < c22076.size(); i3++) {
                    C13533 c13533M35335 = c15543M49686.m35335(i3);
                    c13533M35335.m30800(c9729M11841);
                    c22076.m49689(i3, c13533M35335);
                }
                c9729M11841.close();
                this.f12798 = c22076;
                this.f12833 = c22921;
                this.f12800 = m11805(0);
                m10176();
            } catch (Throwable th2) {
                try {
                    c24481M11808.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            c9729M11841.close();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: ۟ */
    private void m10176() throws Throwable {
        C11477 c11477M26500;
        RunnableC3931 runnableC3931;
        float fM30797;
        int iIncrementAndGet = this.f10930.incrementAndGet();
        mo10198();
        this.f10938 = null;
        this.f10933 = null;
        this.f10925 = null;
        this.f10924 = null;
        if (!this.f10931) {
            m11832();
        }
        InterfaceC9768 interfaceC9768 = this.f12815;
        m11811(interfaceC9768);
        boolean z = true;
        interfaceC9768.setReadOnly(true);
        this.f12816 = true;
        this.f12819 = false;
        this.f10941 = 10000;
        try {
            if (this.f10937 >= this.f12798.size()) {
                this.f10937 = 0;
            }
            C9729 c9729M11841 = m11841();
            try {
                if (this.f12798.m49685(this.f10937) - this.f12798.m49682(this.f10937) < 10000 && (!this.f10931 || this.f10932.getFloat(this.f10937) < 0.0f)) {
                    int i = this.f10937;
                    try {
                        this.f10932.mo6343(this.f12798.get(i).m30797(c9729M11841, this.f12837), i);
                        C18051 c18051 = this.f10933;
                        if (c18051 != null) {
                            c18051.m41096(i);
                        }
                    } catch (Exception unused) {
                    }
                    this.f10941 -= this.f12798.m49685(this.f10937) - this.f12798.m49682(this.f10937);
                }
                if (this.f12798.size() < 50 && m11826() < 10000) {
                    float f = this.f10932.getFloat(this.f10937);
                    for (int i2 = 0; i2 < this.f12798.size(); i2++) {
                        if (this.f10931 && this.f10932.getFloat(i2) >= 0.0f) {
                            fM30797 = this.f10932.getFloat(i2);
                        } else {
                            try {
                                fM30797 = this.f12798.get(i2).m30797(c9729M11841, this.f12837);
                                this.f10932.mo6343(fM30797, i2);
                                C18051 c18052 = this.f10933;
                                if (c18052 != null) {
                                    c18052.m41096(i2);
                                }
                            } catch (Exception unused2) {
                                fM30797 = 0.0f;
                            }
                        }
                        if (fM30797 > f) {
                            this.f10937 = i2;
                            f = fM30797;
                        }
                    }
                    this.f10933 = C18051.m41091(this.f10932);
                    this.f10926 = Math.max(this.f10926, Math.max(0.0f, this.f10932.getFloat(this.f10937)));
                    c9729M11841.close();
                    try {
                        m11817();
                        interfaceC9768.setReadOnly(false);
                        return;
                    } finally {
                        this.f12816 = false;
                    }
                }
                c9729M11841.close();
                C22076 c22076 = this.f12798;
                C12273 c12273 = this.f10932;
                int iM11825 = m11825();
                synchronized (this.f12837) {
                    c11477M26500 = this.f12837.m26500();
                }
                C16039 c16039M10166 = m10166(interfaceC9768, c11477M26500);
                if (c22076.size() > 100000) {
                    C14146 c14146 = this.f12821;
                    c14146.getClass();
                    C7050.m16212(new RunnableC9413(0, c14146));
                    runnableC3931 = new RunnableC3931(0, c14146);
                } else {
                    runnableC3931 = null;
                }
                C24757 c24757 = new C24757(new C19568(0, this), c22076, c12273, c11477M26500, this.f10937, c16039M10166, this.f10931, new C18897(this, iIncrementAndGet, interfaceC9768, c22076, c12273, iM11825), new RunnableC16214(this, iIncrementAndGet, interfaceC9768, c22076, c12273, iM11825, runnableC3931));
                c24757.m54420(m10175(c16039M10166));
                this.f10928 = c24757;
                try {
                    c24757.m54419(interfaceC9768.mo4003() ? new ExecutorC24496() : C4081.f8986, Math.min(2, C19110.f57020));
                    return;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                try {
                    c9729M11841.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            z = false;
        }
        th = th4;
        z = false;
        if (!z) {
            try {
                m11817();
                interfaceC9768.setReadOnly(false);
            } finally {
                this.f12816 = false;
            }
        }
        throw th;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m10174(C4816 c4816, int i, InterfaceC9768 interfaceC9768, C22076 c22076, C12273 c12273, int i2) {
        return (!c4816.f12819 && i == c4816.f10930.get() && c4816.f12815 == interfaceC9768 && c4816.f12798 == c22076 && c4816.f10932 == c12273 && c4816.m11825() == i2) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    private C16039 m10166(InterfaceC9768 interfaceC9768, C11477 c11477) {
        C6731 c6731Mo10207 = this.f12814 >= 0 ? mo10207() : this.f12821.m32486(interfaceC9768);
        boolean z = c6731Mo10207 != null;
        if (c6731Mo10207 == null) {
            c6731Mo10207 = new C6731(Math.max(0, this.f12821.getScrollX()), Math.max(0, this.f12821.m32472()), this.f12821.m32458(), this.f12821.m32606());
        }
        if (c6731Mo10207.m15389() <= 0 || c6731Mo10207.m15388() <= 0 || c6731Mo10207.m15391() > Math.max(0, ((int) m11833()) - c6731Mo10207.m15388())) {
            return null;
        }
        int iMax = Math.max(0, m11803(c6731Mo10207.m15391()) - 1);
        int iMin = Math.min(this.f12798.size(), m11803((int) Math.min(2147483647L, ((long) c6731Mo10207.m15391()) + ((long) c6731Mo10207.m15388()))) + 2);
        if (this.f12814 >= 0) {
            iMax = Math.max(0, iMax - 16);
            iMin = Math.min(this.f12798.size(), iMin + 16);
        }
        int iM11834 = m11834(this.f12821.m32508());
        int iM11835 = m11834(this.f12821.m32512());
        C16039 c16039 = new C16039(iMax, iMin, iM11834, iM11835);
        C9729 c9729M11841 = m11841();
        try {
            C22206 c22206 = new C22206(c9729M11841);
            m10173(c22206, c11477, this.f10937);
            for (int i = iMax; i < iMin; i++) {
                if (!this.f12826 && !this.f12819) {
                    m10173(c22206, c11477, i);
                }
                c9729M11841.close();
                return null;
            }
            if (iM11834 < iMax || iM11834 >= iMin) {
                m10173(c22206, c11477, iM11834);
            }
            if (iM11835 != iM11834 && (iM11835 < iMax || iM11835 >= iMin)) {
                m10173(c22206, c11477, iM11835);
            }
            c9729M11841.close();
            if (z) {
                m10208(c6731Mo10207.m15390(), c6731Mo10207.m15389());
            }
            if (this.f12814 >= 0) {
                c6731Mo10207 = new C6731(Math.min(c6731Mo10207.m15390(), Math.max(0, ((int) mo10196()) - c6731Mo10207.m15389())), c6731Mo10207.m15391(), c6731Mo10207.m15389(), c6731Mo10207.m15388());
            }
            boolean z2 = this.f10932.getFloat(iM11834) >= 0.0f && this.f10932.getFloat(iM11835) >= 0.0f;
            while (iMax < iMin && z2) {
                z2 = this.f10932.getFloat(iMax) >= 0.0f;
                iMax++;
            }
            if (z2 && !this.f12826 && !this.f12819 && c6731Mo10207.m15390() <= Math.max(0, ((int) mo10196()) - c6731Mo10207.m15389())) {
                this.f10925 = c16039;
                this.f10938 = c6731Mo10207;
            }
            return c16039;
        } catch (Throwable th) {
            try {
                c9729M11841.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ᩻ */
    public final C6731 mo10207() {
        return this.f10938 != null ? this.f10938 : super.mo10207();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m10173(C22206 c22206, C11477 c11477, int i) {
        if (!this.f10931 || this.f10932.getFloat(i) < 0.0f) {
            C13533 c13533 = this.f12798.get(i);
            int i2 = c13533.f38062 - c13533.f38061;
            int i3 = this.f10941;
            if (i2 >= i3) {
                return;
            }
            this.f10941 = i3 - i2;
            float fM30797 = c13533.m30797(c22206, c11477);
            this.f10932.mo6343(fM30797, i);
            if (fM30797 > this.f10932.getFloat(this.f10937)) {
                this.f10937 = i;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10171(C4816 c4816, int i, InterfaceC9768 interfaceC9768, C22076 c22076, C12273 c12273, int i2, Runnable runnable) {
        try {
            if (i == c4816.f10930.get() && !c4816.f12819 && c4816.f12815 == interfaceC9768 && c4816.f12798 == c22076 && c4816.f10932 == c12273 && c4816.m11825() == i2) {
                c4816.f10937 = c4816.f10928.m54421();
                Throwable thM54418 = c4816.f10928.m54418();
                c4816.f10924 = thM54418;
                if (thM54418 == null) {
                    c4816.f10933 = C18051.m41091(c12273);
                }
                c4816.f10926 = Math.max(c4816.f10926, Math.max(0.0f, c12273.getFloat(c4816.f10937)));
            }
            try {
                c4816.m11817();
                interfaceC9768.setReadOnly(false);
                if (runnable != null) {
                    try {
                        runnable.run();
                    } finally {
                        c4816.f10928 = null;
                        c4816.f12816 = false;
                        c4816.f12821.m32564(c4816);
                    }
                }
                c4816.f12821.postInvalidate();
            } catch (Throwable th) {
                if (runnable != null) {
                    try {
                        runnable.run();
                    } finally {
                        c4816.f10928 = null;
                        c4816.f12816 = false;
                        c4816.f12821.m32564(c4816);
                    }
                }
                c4816.f12821.postInvalidate();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c4816.m11817();
                interfaceC9768.setReadOnly(false);
                if (runnable != null) {
                    try {
                        runnable.run();
                    } finally {
                        c4816.f10928 = null;
                        c4816.f12816 = false;
                        c4816.f12821.m32564(c4816);
                    }
                }
                c4816.f12821.postInvalidate();
                throw th2;
            } catch (Throwable th3) {
                if (runnable != null) {
                    try {
                        runnable.run();
                    } finally {
                        c4816.f10928 = null;
                        c4816.f12816 = false;
                        c4816.f12821.m32564(c4816);
                    }
                }
                c4816.f12821.postInvalidate();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int[] m10175(C16039 c16039) {
        PriorityQueue priorityQueue = new PriorityQueue(32, C10162.comparingInt(new C24932()));
        C15543 c15543M49686 = this.f12798.m49686();
        for (int i = 0; i < this.f12798.size(); i++) {
            C13533 c13533M35335 = c15543M49686.m35335(i);
            int iM30798 = c13533M35335.m30798() - c13533M35335.f38061;
            if (priorityQueue.size() < 32) {
                priorityQueue.add(new C8839(i, iM30798));
            } else if (iM30798 > ((C8839) priorityQueue.peek()).length()) {
                priorityQueue.remove();
                priorityQueue.add(new C8839(i, iM30798));
            }
        }
        C16100 c16100 = new C16100();
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            c16100.add(((C8839) it.next()).m20447());
        }
        c16100.add(this.f10937);
        if (c16039 != null) {
            for (int iM36490 = c16039.m36490(); iM36490 < c16039.m36488(); iM36490++) {
                c16100.add(iM36490);
            }
            c16100.add(c16039.m36492());
            c16100.add(c16039.m36491());
        }
        return c16100.mo5873();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m10208(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.f10926 = Math.max(this.f10926, ((i + i2) - mo10202()) - mo10195());
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ֫ */
    public final void mo10190(RectF rectF, int i) {
        super.mo10190(rectF, i);
        int iM11834 = m11834(Math.max(0, Math.min(i, m11826())));
        if (this.f10935 != 0.0f || this.f10932.getFloat(iM11834) >= 0.0f) {
            return;
        }
        this.f10926 = Math.max(this.f10926, rectF.right - mo10202());
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m10203(int i, int i2) {
        if (this.f12816 || this.f12819 || this.f10935 > 0.0f || i2 <= 0 || this.f12798.isEmpty() || this.f12821.f40275 != this || !m11801() || this.f10934 != null) {
            return;
        }
        int iM11803 = m11803(Math.max(0, i));
        int iM11804 = m11803(((double) Math.max(0, i)) + ((double) i2));
        int i3 = iM11804 + 1;
        C17441 c17441 = new C17441();
        ArrayList arrayList = new ArrayList();
        m10168(iM11803, i3, c17441, arrayList);
        m10168(i3, Math.min(this.f12798.size(), iM11804 + 17), c17441, arrayList);
        m10168(Math.max(0, iM11803 - 16), iM11803, c17441, arrayList);
        if (c17441.isEmpty()) {
            return;
        }
        RunnableC17555 runnableC17555 = new RunnableC17555(this, c17441.mo5873(), (C13533[]) arrayList.toArray(new C13533[0]));
        this.f10934 = runnableC17555;
        try {
            C4081.f8986.execute(runnableC17555);
        } catch (RuntimeException unused) {
            this.f10934 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m10168(int i, int i2, C17441 c17441, ArrayList arrayList) {
        C15543 c15543M49686 = this.f12798.m49686();
        while (i < i2 && c17441.size() < 32) {
            if (this.f10932.getFloat(i) < 0.0f) {
                c17441.add(i);
                arrayList.add(c15543M49686.m35335(i).clone());
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۨ */
    public final void m10201() {
        RunnableC17555 runnableC17555 = this.f10934;
        if (runnableC17555 != null) {
            runnableC17555.f52477 = true;
        }
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ۧ */
    public final void mo10198() {
        m10201();
        if (this.f12816) {
            this.f12819 = true;
            while (this.f12816) {
                SystemClock.sleep(100L);
            }
        }
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ܳ */
    public final int mo10202() {
        C23929 c23929 = this.f12837;
        if (c23929.f76016) {
            return super.mo10202();
        }
        return Math.max(super.mo10202(), c23929.f76002);
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ۜ */
    public final int mo10195() {
        C23929 c23929 = this.f12837;
        if (c23929.f76016) {
            return Math.max(super.mo10195(), c23929.f76002);
        }
        return super.mo10195();
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ۢ */
    public final float mo10196() {
        float fMo10195;
        int i;
        if (m11819()) {
            C23929 c23929 = this.f12837;
            if (c23929.f76016) {
                fMo10195 = mo10202() + this.f10936;
                i = c23929.f75976;
            } else {
                fMo10195 = mo10195() + this.f10936;
                i = c23929.f75976;
            }
            return fMo10195 + i;
        }
        return mo10202() + m10184() + mo10195();
    }

    /* JADX INFO: renamed from: ᩺ */
    private float m10184() {
        if (this.f10935 > 0.0f) {
            return (this.f12837.f32005.getTextSize() / this.f10935) * this.f10940;
        }
        return Math.max(this.f10926, this.f10937 < this.f10932.size() ? Math.max(0.0f, this.f10932.getFloat(this.f10937)) : 0.0f);
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ֫ */
    public final void mo10189(Canvas canvas, int i, float f, int i2, C3831 c3831) {
        float textSize;
        if (this.f10939 == null) {
            this.f10939 = C7050.m16224(R.string.MT_Protector);
        }
        C23929 c23929 = this.f12837;
        if (i < 0 || i >= this.f10932.size()) {
            textSize = -1.0f;
        } else {
            textSize = this.f10932.getFloat(i);
            if (textSize >= 0.0f && this.f10935 > 0.0f) {
                textSize *= c23929.f32005.getTextSize() / this.f10935;
            }
        }
        if (textSize < 0.0f) {
            return;
        }
        float f2 = i2;
        float fMeasureText = 0.0f + (textSize - c3831.measureText(this.f10939));
        if (f2 > fMeasureText) {
            float fM26513 = f - c23929.m26513();
            float fCeil = (float) Math.ceil(c23929.m26496() + fM26513);
            c3831.setColor(-65536);
            canvas.drawRect(fMeasureText, fM26513, f2, fCeil, c3831);
            c3831.setColor(-1);
            canvas.drawText(this.f10939, c23929.m26498() + fMeasureText, f, c3831);
        }
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ֫ */
    public final void mo10188(int i, int i2, int i3) throws Throwable {
        m11829();
        m10201();
        boolean z = this.f10935 > 0.0f;
        this.f10935 = 0.0f;
        if (this.f12816) {
            throw new IllegalStateException("Layout is still preparing");
        }
        m11811(this.f12815);
        if (z) {
            this.f10933 = null;
            Arrays.fill(this.f10932.m28296(), -1.0f);
        }
        try {
            C9729 c9729M11841 = m11841();
            try {
                m10167(i, i2, i3, c9729M11841);
                c9729M11841.close();
                m11817();
                if (!z || this.f12821.f40228) {
                    return;
                }
                mo10206();
            } catch (Throwable th) {
                try {
                    c9729M11841.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            m11817();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m10167(int i, int i2, int i3, C9729 c9729) {
        int i4;
        boolean z;
        C9729 c97210 = c9729;
        int iM11834 = m11834(i);
        int iM11835 = i2 > 0 ? m11834(i + i2) - iM11834 : 0;
        C14146 c14146 = this.f12821;
        int iM22745 = ((i3 <= 0 || c14146.mo27920()) ? 0 : c97210.m22745(i + i3) - c97210.m22745(i)) - iM11835;
        C18051 c18051 = this.f10933;
        int i5 = this.f12798.get(iM11834).f38061;
        int iM49685 = (this.f12798.m49685(iM11835 + iM11834) + i3) - i2;
        if (iM22745 != 0) {
            this.f10933 = null;
            if (iM22745 < 0) {
                int i6 = iM11834 - iM22745;
                this.f12798.m49676(iM11834, i6);
                this.f12833.m51207(iM11834, i6);
                this.f10932.mo6344(iM11834, i6);
            } else {
                C22076 c22076 = new C22076();
                C13533 c13533 = new C13533();
                for (int i7 = 0; i7 < iM22745; i7++) {
                    c22076.m49680(c13533);
                }
                float[] fArr = new float[iM22745];
                Arrays.fill(fArr, -1.0f);
                this.f12798.addAll(iM11834, c22076);
                this.f12833.m51212(iM11834, iM22745);
                this.f10932.m28294(iM11834, (InterfaceC6948) C12273.m28291(fArr));
            }
        }
        C23929 c23929 = this.f12837;
        int iM26497 = c23929.m26497();
        C15543 c15543M49686 = this.f12798.m49686();
        C24481 c24481M11808 = m11808(c97210, i5, iM49685);
        boolean z2 = true;
        int i8 = i5;
        int i9 = iM11834;
        while (z2) {
            try {
                int iM53980 = c24481M11808.m53980();
                if (iM53980 == -1 || iM53980 >= iM49685) {
                    i4 = iM49685;
                    z = false;
                } else {
                    z = z2;
                    i4 = iM53980;
                }
                C13533 c13533M35335 = c15543M49686.m35335(i9);
                c13533M35335.m30799(i8, i4, i9);
                this.f12798.m49689(i9, c13533M35335);
                if (!c14146.f40228) {
                    if (c13533M35335.f38062 - c13533M35335.f38061 < 10000) {
                        try {
                            this.f10932.mo6343(c13533M35335.m30797(c97210, c23929), i9);
                            C18051 c18052 = this.f10933;
                            if (c18052 != null) {
                                c18052.m41096(i9);
                            }
                        } catch (Exception unused) {
                        }
                    } else {
                        this.f10932.mo6343(-1.0f, i9);
                        C18051 c18053 = this.f10933;
                        if (c18053 != null) {
                            c18053.m41096(i9);
                        }
                    }
                    this.f12833.m51208(i9, this, c9729, i8, iM26497);
                }
                i8 = i4 + 1;
                i9++;
                c97210 = c9729;
                z2 = z;
            } catch (Throwable th) {
                try {
                    c24481M11808.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        int i10 = i9;
        c24481M11808.close();
        this.f10929 = iM11834;
        this.f10927 = i10;
        if (iM22745 != 0) {
            this.f12798.m49687(iM11834, i10);
        }
        C22076 c22077 = this.f12798;
        c22077.m49677(i10, c22077.size(), i3 - i2, iM22745);
        if (c14146.f40228) {
            int i11 = this.f10937;
            if (i11 >= iM11834) {
                this.f10937 = i11 + iM22745;
                return;
            }
            return;
        }
        int i12 = this.f10929;
        int i13 = this.f10927;
        int iM26498 = c23929.m26497();
        C24991 c24991 = c14146.f40252.f24113;
        if (c24991.f79773) {
            int iM11836 = m11834(c24991.f79772);
            int iM11837 = m11834(c24991.f79771);
            C13533 c13534 = this.f12798.get(iM11836);
            C13533 c13535 = this.f12798.get(iM11837);
            int iMin = Math.min(i12, c13534.f38063);
            int iMax = Math.max(i13, c13535.f38063 + 1);
            for (int i14 = iMin; i14 < i12; i14++) {
                this.f12833.m51208(i14, this, c9729, this.f12798.m49682(i14), iM26498);
            }
            while (i13 < iMax) {
                this.f12833.m51208(i13, this, c9729, this.f12798.m49682(i13), iM26498);
                i13++;
            }
            i12 = iMin;
            i13 = iMax;
        }
        this.f12833.m51214(i12, i13);
        if (iM22745 != 0) {
            if (c18051 != null) {
                if (c18051.m41097(iM11834)) {
                    this.f10933 = c18051;
                }
            } else {
                this.f10933 = C18051.m41091(this.f10932);
            }
        }
        if (this.f10933 == null) {
            this.f10933 = C18051.m41091(this.f10932);
        }
        int iM41095 = this.f10933.m41095();
        this.f10937 = iM41095;
        float fMax = Math.max(0.0f, this.f10932.getFloat(iM41095));
        if (this.f12798.size() >= 50 || m11826() >= 10000) {
            fMax = Math.max(this.f10926, fMax);
        }
        this.f10926 = fMax;
        this.f12800 = m11805(0);
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ֫ */
    public final void mo10187(float f) {
        if (this.f10935 == 0.0f) {
            this.f10930.incrementAndGet();
            mo10198();
            if (this.f10937 < this.f12798.size()) {
                this.f10940 = m10184();
                this.f10935 = f;
            }
        }
        this.f12800 = m11805(0);
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ᩸ */
    public final void mo10206() throws Throwable {
        boolean zM11801 = m11801();
        C14146 c14146 = this.f12821;
        if (!zM11801) {
            if (c14146.f40275 == this && c14146.m32583()) {
                return;
            }
            mo10199(this.f12815);
            return;
        }
        this.f10935 = 0.0f;
        this.f10930.incrementAndGet();
        mo10198();
        this.f12800 = m11805(0);
        this.f10931 = false;
        this.f10926 = 0.0f;
        Arrays.fill(this.f10932.m28296(), -1.0f);
        m10176();
        m10178();
        c14146.mo27928();
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ֫ */
    public final void mo10192(C11996 c11996) {
        super.mo10192(c11996);
        c11996.writeInt(this.f10937);
    }
}
