package l;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import net.engio.mbassy.listener.MessageHandler;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.۬۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8L1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13125 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C4659 f39263 = new C4659();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Random f39264 = new Random();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f39265;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C11715 f39270;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C20369 f39271 = new C20369();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C22485 f39269 = new C22485();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f39267 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC4846 f39266 = AbstractC4846.f15313;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f39268 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized String m31792() {
        return this.f39265;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized String m31793(AbstractC4846 abstractC4846, C15894 c15894) {
        return m31784(abstractC4846.mo14105(c15894.f49112, this.f39269).f72806, c15894).f10209;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m31794(C0425 c0425) {
        C11715 c11715;
        String str = this.f39265;
        if (str != null) {
            C3248 c3248 = (C3248) this.f39267.get(str);
            c3248.getClass();
            m31786(c3248);
        }
        Iterator it = this.f39267.values().iterator();
        while (it.hasNext()) {
            C3248 c3249 = (C3248) it.next();
            it.remove();
            if (c3249.f10207 && (c11715 = this.f39270) != null) {
                c11715.m28607(c0425, c3249.f10209);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m31795(C0425 c0425, int i) {
        this.f39270.getClass();
        boolean z = i == 0;
        Iterator it = this.f39267.values().iterator();
        while (it.hasNext()) {
            C3248 c3248 = (C3248) it.next();
            if (c3248.m9944(c0425)) {
                it.remove();
                if (c3248.f10207) {
                    boolean zEquals = c3248.f10209.equals(this.f39265);
                    if (z && zEquals) {
                        boolean unused = c3248.f10205;
                    }
                    if (zEquals) {
                        m31786(c3248);
                    }
                    this.f39270.m28607(c0425, c3248.f10209);
                }
            }
        }
        m31791(c0425);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m31797(C0425 c0425) {
        this.f39270.getClass();
        if (c0425.f1892.m14110()) {
            return;
        }
        C15894 c15894 = c0425.f1895;
        if (c15894 != null) {
            if (c15894.f49111 < m31789()) {
                return;
            }
            C3248 c3248 = (C3248) this.f39267.get(this.f39265);
            if (c3248 != null && c3248.f10210 == -1 && c3248.f10206 != c0425.f1893) {
                return;
            }
        }
        C3248 c3248M31784 = m31784(c0425.f1893, c0425.f1895);
        if (this.f39265 == null) {
            this.f39265 = c3248M31784.f10209;
        }
        C15894 c15895 = c0425.f1895;
        if (c15895 != null && c15895.m37669()) {
            C15894 c15896 = c0425.f1895;
            Object obj = c15896.f49112;
            C3248 c3248M31785 = m31784(c0425.f1893, new C15894(c15896.f49108, c15896.f49111, obj));
            if (!c3248M31785.f10207) {
                c3248M31785.f10207 = true;
                c0425.f1892.mo14105(c0425.f1895.f49112, this.f39269);
                this.f39269.m50433(c0425.f1895.f49108);
                Math.max(0L, C3603.m11037(0L) + C3603.m11037(this.f39269.f72804));
                this.f39270.getClass();
            }
        }
        if (!c3248M31784.f10207) {
            c3248M31784.f10207 = true;
            this.f39270.getClass();
        }
        if (c3248M31784.f10209.equals(this.f39265) && !c3248M31784.f10205) {
            c3248M31784.f10205 = true;
            this.f39270.m28606(c0425, c3248M31784.f10209);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m31798(C0425 c0425) {
        this.f39270.getClass();
        AbstractC4846 abstractC4846 = this.f39266;
        this.f39266 = c0425.f1892;
        Iterator it = this.f39267.values().iterator();
        while (it.hasNext()) {
            C3248 c3248 = (C3248) it.next();
            if (!c3248.m9945(abstractC4846, this.f39266) || c3248.m9944(c0425)) {
                it.remove();
                if (c3248.f10207) {
                    if (c3248.f10209.equals(this.f39265)) {
                        m31786(c3248);
                    }
                    this.f39270.m28607(c0425, c3248.f10209);
                }
            }
        }
        m31791(c0425);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31796(C11715 c11715) {
        this.f39270 = c11715;
    }

    @RequiresNonNull({MessageHandler.Properties.Listener})
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m31791(C0425 c0425) {
        AbstractC4846 abstractC4846 = c0425.f1892;
        int i = c0425.f1893;
        C15894 c15894 = c0425.f1895;
        boolean zM14110 = abstractC4846.m14110();
        HashMap map = this.f39267;
        if (zM14110) {
            String str = this.f39265;
            if (str != null) {
                C3248 c3248 = (C3248) map.get(str);
                c3248.getClass();
                m31786(c3248);
                return;
            }
            return;
        }
        C3248 c3249 = (C3248) map.get(this.f39265);
        this.f39265 = m31784(i, c15894).f10209;
        m31797(c0425);
        if (c15894 != null) {
            long j = c15894.f49111;
            if (c15894.m37669()) {
                if (c3249 != null && c3249.f10210 == j && c3249.f10204 != null && c3249.f10204.f49108 == c15894.f49108 && c3249.f10204.f49109 == c15894.f49109) {
                    return;
                }
                m31784(i, new C15894(j, c15894.f49112));
                this.f39270.getClass();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31786(C3248 c3248) {
        if (c3248.f10210 != -1) {
            this.f39268 = c3248.f10210;
        }
        this.f39265 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long m31789() {
        C3248 c3248 = (C3248) this.f39267.get(this.f39265);
        if (c3248 != null && c3248.f10210 != -1) {
            return c3248.f10210;
        }
        return this.f39268 + 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C3248 m31784(int i, C15894 c15894) {
        HashMap map = this.f39267;
        C3248 c3248 = null;
        long j = C13132.FOREVER_NS;
        for (C3248 c3249 : map.values()) {
            c3249.m9946(i, c15894);
            if (c3249.m9943(i, c15894)) {
                long j2 = c3249.f10210;
                if (j2 == -1 || j2 < j) {
                    c3248 = c3249;
                    j = j2;
                } else if (j2 == j) {
                    String str = C3603.f11424;
                    if (c3248.f10204 != null && c3249.f10204 != null) {
                        c3248 = c3249;
                    }
                }
            }
        }
        if (c3248 != null) {
            return c3248;
        }
        String strM31787 = m31787();
        C3248 c32410 = new C3248(this, strM31787, i, c15894);
        map.put(strM31787, c32410);
        return c32410;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m31787() {
        byte[] bArr = new byte[12];
        f39264.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }
}
