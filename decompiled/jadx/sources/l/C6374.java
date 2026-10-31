package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۛ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6NE */
/* JADX INFO: loaded from: classes2.dex */
public final class C6374 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f19715;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f19716;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f19717;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C13409 f19718;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f19719;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f19720;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f19721;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f19722;

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6374 m17676(C7744 c7744, C12164 c12164, String str, boolean z, int i, boolean z2, Runnable runnable, Supplier supplier) {
        boolean z3;
        CharSequence charSequence;
        CharSequence charSequence2;
        C6374 c6374 = new C6374();
        c6374.f19717 = new ArrayList();
        try {
            C13429 c13429 = new C13429(c6374, c7744, runnable, supplier);
            if (z) {
                try {
                    if (str.indexOf(36) >= 0 || str.indexOf(92) >= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } catch (Throwable th) {
                    try {
                        c13429.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                z3 = false;
            }
            StringBuilder sb = z3 ? new StringBuilder() : null;
            if (z2 && i > 0) {
                ArrayDeque<C12724> arrayDeque = new ArrayDeque();
                while (C12268.m29803(c12164)) {
                    runnable.run();
                    C12724 c12724 = arrayDeque.size() == i ? (C12724) arrayDeque.removeFirst() : new C12724(c7744, c12164.pattern(), runnable);
                    c12724.m31013(c12164, z3);
                    arrayDeque.addLast(c12724);
                }
                for (C12724 c12725 : arrayDeque) {
                    runnable.run();
                    int iStart = c12725.start(0);
                    int iEnd = c12725.end(0);
                    if (sb == null) {
                        charSequence2 = str;
                    } else {
                        sb.setLength(0);
                        C13574.m32630(c12725, sb, str);
                        charSequence2 = sb;
                    }
                    c13429.m32457(iStart, iEnd, charSequence2);
                }
            } else {
                C12724 c12726 = z3 ? new C12724(c7744, c12164.pattern(), runnable) : null;
                while (C12268.m29803(c12164)) {
                    runnable.run();
                    if (c12726 != null) {
                        c12726.m31013(c12164, true);
                    }
                    int iStart2 = c12164.start();
                    int iEnd2 = c12164.end();
                    if (sb == null) {
                        charSequence = str;
                    } else {
                        sb.setLength(0);
                        C13574.m32630(c12726, sb, str);
                        charSequence = sb;
                    }
                    c13429.m32457(iStart2, iEnd2, charSequence);
                    if (i > 0 && c6374.f19722 == i) {
                        break;
                    }
                }
            }
            c13429.finish();
            runnable.run();
            c13429.close();
            return c6374;
        } catch (Error | RuntimeException | C14501 e) {
            c6374.close();
            throw e;
        }
    }

    public final int count() {
        return this.f19722;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17689(final C12392 c12392, final InterfaceC7785 interfaceC7785, final boolean z) {
        if (this.f19721) {
            throw new IllegalStateException("Replacement plan is consumed");
        }
        this.f19721 = true;
        if (this.f19722 == 0) {
            return;
        }
        if (c12392.m30436() != interfaceC7785) {
            throw new IllegalStateException("Replacement owner changed");
        }
        boolean[] zArr = {false};
        final RunnableC11381 runnableC11381 = new RunnableC11381(1, zArr, c12392);
        try {
            if (!interfaceC7785.mo1596(new Runnable() { // from class: l.ۙ᩺ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C6374.m17680(this.f15634, interfaceC7785, runnableC11381, c12392, z);
                }
            })) {
                throw new IllegalStateException("Replacement owner is unavailable");
            }
            if (zArr[0] && c12392.m30436() == interfaceC7785 && c12392.f37211) {
                c12392.m30397();
            }
            c12392.requestFocus();
            c12392.m30430(false);
        } catch (Throwable th) {
            if (zArr[0] && c12392.m30436() == interfaceC7785 && c12392.f37211) {
                c12392.m30397();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17680(C6374 c6374, InterfaceC7785 interfaceC7785, RunnableC11381 runnableC11381, C12392 c12392, boolean z) {
        int i;
        C21856 c3552 = c6374.f19719 ? null : new C3552(interfaceC7785, runnableC11381);
        int i2 = -1;
        for (int size = c6374.f19717.size() - 1; size >= 0; size--) {
            if (c12392.m30436() != interfaceC7785) {
                throw new IllegalStateException("Replacement owner changed");
            }
            C10608 c10608 = (C10608) c6374.f19717.get(size);
            if (c3552 != null) {
                if (i2 >= 0 && i2 - c10608.f31865 > 256) {
                    c3552.m49244();
                }
                int i3 = c10608.f31869;
                int i4 = c10608.f31865;
                String str = c10608.f31868;
                int length = str.length();
                c3552.delete(i3, i4);
                c3552.m49243(i3, 0, length, str);
            } else {
                runnableC11381.run();
                C13409 c13409 = c6374.f19718;
                if (c13409 == null) {
                    interfaceC7785.replace(c10608.f31869, c10608.f31865, c10608.f31868);
                } else {
                    int i5 = c10608.f31869;
                    int i6 = c10608.f31865;
                    int i7 = c10608.f31867;
                    interfaceC7785.replace(i5, i6, c13409, i7, c10608.f31866 + i7);
                }
            }
            i2 = c10608.f31869;
        }
        if (c3552 != null) {
            c3552.m49244();
        }
        if (c12392.m30436() != interfaceC7785) {
            throw new IllegalStateException("Replacement owner changed");
        }
        if (z) {
            i = c6374.f19716;
        } else {
            long j = ((long) c6374.f19715) + c6374.f19720;
            i = (int) j;
            if (j != i) {
                throw new ArithmeticException();
            }
        }
        c12392.mo25919(i);
        c12392.m30501(false);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f19721 = true;
        this.f19717.clear();
        C13409 c13409 = this.f19718;
        if (c13409 != null) {
            c13409.close();
            this.f19718 = null;
        }
    }
}
