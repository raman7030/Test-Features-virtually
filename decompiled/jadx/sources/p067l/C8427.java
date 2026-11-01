package p067l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۛ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6NE */
/* JADX INFO: loaded from: classes2.dex */
public final class C8427 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public int f22588;

    /* JADX INFO: renamed from: ۙ */
    public int f22589;

    /* JADX INFO: renamed from: ۤ */
    public ArrayList f22590;

    /* JADX INFO: renamed from: ۫ */
    public C15113 f22591;

    /* JADX INFO: renamed from: ۬ */
    public boolean f22592;

    /* JADX INFO: renamed from: ᩶ */
    public long f22593;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f22594;

    /* JADX INFO: renamed from: ᩹ */
    public int f22595;

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX INFO: renamed from: ֫ */
    public static C8427 m19621(C9729 c9729, C13929 c13929, String str, boolean z, int i, boolean z2, Runnable runnable, Supplier supplier) {
        boolean z3;
        CharSequence charSequence;
        CharSequence charSequence2;
        C8427 c8427 = new C8427();
        c8427.f22590 = new ArrayList();
        try {
            C15132 c15132 = new C15132(c8427, c9729, runnable, supplier);
            if (z) {
                try {
                    if (str.indexOf(36) >= 0 || str.indexOf(92) >= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } catch (Throwable th) {
                    try {
                        c15132.close();
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
                ArrayDeque<C14462> arrayDeque = new ArrayDeque();
                while (C14028.m31865(c13929)) {
                    runnable.run();
                    C14462 c14462 = arrayDeque.size() == i ? (C14462) arrayDeque.removeFirst() : new C14462(c9729, c13929.pattern(), runnable);
                    c14462.m33093(c13929, z3);
                    arrayDeque.addLast(c14462);
                }
                for (C14462 c14463 : arrayDeque) {
                    runnable.run();
                    int iStart = c14463.start(0);
                    int iEnd = c14463.end(0);
                    if (sb == null) {
                        charSequence2 = str;
                    } else {
                        sb.setLength(0);
                        C15269.m34742(c14463, sb, str);
                        charSequence2 = sb;
                    }
                    c15132.m34559(iStart, iEnd, charSequence2);
                }
            } else {
                C14462 c14464 = z3 ? new C14462(c9729, c13929.pattern(), runnable) : null;
                while (C14028.m31865(c13929)) {
                    runnable.run();
                    if (c14464 != null) {
                        c14464.m33093(c13929, true);
                    }
                    int iStart2 = c13929.start();
                    int iEnd2 = c13929.end();
                    if (sb == null) {
                        charSequence = str;
                    } else {
                        sb.setLength(0);
                        C15269.m34742(c14464, sb, str);
                        charSequence = sb;
                    }
                    c15132.m34559(iStart2, iEnd2, charSequence);
                    if (i > 0 && c8427.f22595 == i) {
                        break;
                    }
                }
            }
            c15132.finish();
            runnable.run();
            c15132.close();
            return c8427;
        } catch (Error | RuntimeException | C16150 e) {
            c8427.close();
            throw e;
        }
    }

    public final int count() {
        return this.f22595;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19634(final C14146 c14146, final InterfaceC9768 interfaceC9768, final boolean z) {
        if (this.f22594) {
            throw new IllegalStateException("Replacement plan is consumed");
        }
        this.f22594 = true;
        if (this.f22595 == 0) {
            return;
        }
        if (c14146.m32500() != interfaceC9768) {
            throw new IllegalStateException("Replacement owner changed");
        }
        boolean[] zArr = {false};
        final RunnableC13185 runnableC13185 = new RunnableC13185(1, zArr, c14146);
        try {
            if (!interfaceC9768.mo3994(new Runnable() { // from class: l.ۙ᩺ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C8427.m19625(this.f18468, interfaceC9768, runnableC13185, c14146, z);
                }
            })) {
                throw new IllegalStateException("Replacement owner is unavailable");
            }
            if (zArr[0] && c14146.m32500() == interfaceC9768 && c14146.f40228) {
                c14146.m32461();
            }
            c14146.requestFocus();
            c14146.m32494(false);
        } catch (Throwable th) {
            if (zArr[0] && c14146.m32500() == interfaceC9768 && c14146.f40228) {
                c14146.m32461();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19625(C8427 c8427, InterfaceC9768 interfaceC9768, RunnableC13185 runnableC13185, C14146 c14146, boolean z) {
        int i;
        C23141 c5745 = c8427.f22592 ? null : new C5745(interfaceC9768, runnableC13185);
        int i2 = -1;
        for (int size = c8427.f22590.size() - 1; size >= 0; size--) {
            if (c14146.m32500() != interfaceC9768) {
                throw new IllegalStateException("Replacement owner changed");
            }
            C12451 c12451 = (C12451) c8427.f22590.get(size);
            if (c5745 != null) {
                if (i2 >= 0 && i2 - c12451.f34836 > 256) {
                    c5745.m51595();
                }
                int i3 = c12451.f34840;
                int i4 = c12451.f34836;
                String str = c12451.f34839;
                int length = str.length();
                c5745.delete(i3, i4);
                c5745.m51594(i3, 0, length, str);
            } else {
                runnableC13185.run();
                C15113 c15113 = c8427.f22591;
                if (c15113 == null) {
                    interfaceC9768.replace(c12451.f34840, c12451.f34836, c12451.f34839);
                } else {
                    int i5 = c12451.f34840;
                    int i6 = c12451.f34836;
                    int i7 = c12451.f34838;
                    interfaceC9768.replace(i5, i6, c15113, i7, c12451.f34837 + i7);
                }
            }
            i2 = c12451.f34840;
        }
        if (c5745 != null) {
            c5745.m51595();
        }
        if (c14146.m32500() != interfaceC9768) {
            throw new IllegalStateException("Replacement owner changed");
        }
        if (z) {
            i = c8427.f22589;
        } else {
            long j = ((long) c8427.f22588) + c8427.f22593;
            i = (int) j;
            if (j != i) {
                throw new ArithmeticException();
            }
        }
        c14146.mo27941(i);
        c14146.m32565(false);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f22594 = true;
        this.f22590.clear();
        C15113 c15113 = this.f22591;
        if (c15113 != null) {
            c15113.close();
            this.f22591 = null;
        }
    }
}
