package l;

import java.io.PrintStream;

/* JADX INFO: renamed from: l.ۚ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 24FJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5599 implements Cloneable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f17313;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1365 f17315;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f17316;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int[] f17318;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C7841 f17317 = new C7841(false);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC4308[] f17314 = new AbstractC4308[16];

    public C5599(C1365 c1365) {
        this.f17315 = c1365;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5599 m15882() {
        try {
            C5599 c5599 = (C5599) clone();
            c5599.f17317 = new C7841(this.f17317);
            c5599.f17314 = (AbstractC4308[]) this.f17314.clone();
            int[] iArr = this.f17318;
            if (iArr != null) {
                c5599.f17318 = (int[]) iArr.clone();
            }
            if (this.f17315.f4982) {
                System.err.println("duping state " + this);
                m15883(-1);
            }
            return c5599;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15885(AbstractC4308 abstractC4308) {
        C1365 c1365 = this.f17315;
        if (c1365.f4982) {
            System.err.println("   pushing " + abstractC4308);
        }
        int i = C21122.f68129[abstractC4308.mo3258().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 8) {
            abstractC4308 = c1365.f4978.f66452;
        } else if (i == 9) {
            return;
        }
        AbstractC4308[] abstractC4308Arr = (AbstractC4308[]) C6322.m17575(this.f17313 + 2, this.f17314);
        this.f17314 = abstractC4308Arr;
        int i2 = this.f17313;
        this.f17313 = i2 + 1;
        abstractC4308Arr[i2] = abstractC4308;
        int iM4791 = C1365.m4791(abstractC4308);
        if (iM4791 != 1) {
            if (iM4791 == 2) {
                AbstractC4308[] abstractC4308Arr2 = this.f17314;
                int i3 = this.f17313;
                this.f17313 = i3 + 1;
                abstractC4308Arr2[i3] = null;
            } else {
                throw new AssertionError(abstractC4308);
            }
        }
        int i4 = this.f17313;
        if (i4 > c1365.f4969) {
            c1365.f4969 = i4;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m15886() {
        if (this.f17315.f4982) {
            System.err.println("   popping 1");
        }
        int i = this.f17313 - 1;
        this.f17313 = i;
        AbstractC4308[] abstractC4308Arr = this.f17314;
        AbstractC4308 abstractC4308 = abstractC4308Arr[i];
        abstractC4308Arr[i] = null;
        C12171.m29642(abstractC4308 != null && C1365.m4791(abstractC4308) == 1);
        return abstractC4308;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m15888() {
        if (this.f17315.f4982) {
            System.err.println("   popping 2");
        }
        int i = this.f17313;
        int i2 = i - 2;
        this.f17313 = i2;
        AbstractC4308[] abstractC4308Arr = this.f17314;
        AbstractC4308 abstractC4308 = abstractC4308Arr[i2];
        abstractC4308Arr[i2] = null;
        C12171.m29642(abstractC4308Arr[i - 1] == null && abstractC4308 != null && C1365.m4791(abstractC4308) == 2);
        return abstractC4308;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m15887(int i) {
        if (this.f17315.f4982) {
            System.err.println("   popping " + i);
        }
        while (i > 0) {
            AbstractC4308[] abstractC4308Arr = this.f17314;
            int i2 = this.f17313 - 1;
            this.f17313 = i2;
            abstractC4308Arr[i2] = null;
            i--;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15884(AbstractC4308 abstractC4308) {
        C1365 c1365 = this.f17315;
        C6319 c6319 = c1365.f4994;
        if (c1365.f4963) {
            int i = C21122.f68129[abstractC4308.mo3258().ordinal()];
            if (i == 10 || i == 11) {
                int iM4791 = C1365.m4791(abstractC4308);
                C12171.m29642(c6319.m17546(c6319.m17519(this.f17314[this.f17313 - iM4791]), c6319.m17519(abstractC4308), true));
                this.f17314[this.f17313 - iM4791] = abstractC4308;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15883(int i) {
        PrintStream printStream = System.err;
        StringBuilder sb = new StringBuilder("stackMap for ");
        C1365 c1365 = this.f17315;
        sb.append(c1365.f4962.f17561);
        sb.append(".");
        sb.append(c1365.f4962);
        printStream.print(sb.toString());
        if (i == -1) {
            System.out.println();
        } else {
            System.out.println(" at " + i);
        }
        System.err.println(" stack (from bottom):");
        for (int i2 = 0; i2 < this.f17313; i2++) {
            PrintStream printStream2 = System.err;
            StringBuilder sbM32308 = C13325.m32308(i2, EnumC0121.f1143, ": ");
            sbM32308.append(this.f17314[i2]);
            printStream2.println(sbM32308.toString());
        }
        int i3 = c1365.f4961;
        do {
            i3--;
            if (i3 < 0) {
                i3 = 0;
                break;
            }
        } while (!this.f17317.m20950(i3));
        if (i3 >= 0) {
            System.err.println(" locals:");
        }
        for (int i4 = 0; i4 <= i3; i4++) {
            System.err.print(EnumC0121.f1143 + i4 + ": ");
            if (this.f17317.m20950(i4)) {
                C16181 c16181 = c1365.f4989[i4];
                if (c16181 == null) {
                    System.err.println("(none)");
                } else {
                    C12048 c12048 = c16181.f49840;
                    if (c12048 == null) {
                        System.err.println("UNKNOWN!");
                    } else {
                        System.err.println("" + c12048 + " of type " + c12048.mo16091(c1365.f4994));
                    }
                }
            } else {
                System.err.println("undefined");
            }
        }
        if (this.f17316 != 0) {
            System.err.print(" locks:");
            for (int i5 = 0; i5 < this.f17316; i5++) {
                System.err.print(" " + this.f17318[i5]);
            }
            System.err.println();
        }
    }
}
