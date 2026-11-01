package p067l;

import java.io.PrintStream;

/* JADX INFO: renamed from: l.ۚ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 24FJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C7690 implements Cloneable {

    /* JADX INFO: renamed from: ۗ */
    public int f20157;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C3666 f20159;

    /* JADX INFO: renamed from: ᩶ */
    public int f20160;

    /* JADX INFO: renamed from: ᩹ */
    public int[] f20162;

    /* JADX INFO: renamed from: ᩸ */
    public C9820 f20161 = new C9820(false);

    /* JADX INFO: renamed from: ۙ */
    public AbstractC6462[] f20158 = new AbstractC6462[16];

    public C7690(C3666 c3666) {
        this.f20159 = c3666;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7690 m17803() {
        try {
            C7690 c7690 = (C7690) clone();
            c7690.f20161 = new C9820(this.f20161);
            c7690.f20158 = (AbstractC6462[]) this.f20158.clone();
            int[] iArr = this.f20162;
            if (iArr != null) {
                c7690.f20162 = (int[]) iArr.clone();
            }
            if (this.f20159.f7754) {
                System.err.println("duping state " + this);
                m17804(-1);
            }
            return c7690;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17806(AbstractC6462 abstractC6462) {
        C3666 c3666 = this.f20159;
        if (c3666.f7754) {
            System.err.println("   pushing " + abstractC6462);
        }
        int i = C22443.f70811[abstractC6462.mo5577().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 8) {
            abstractC6462 = c3666.f7750.f69134;
        } else if (i == 9) {
            return;
        }
        AbstractC6462[] abstractC6462Arr = (AbstractC6462[]) C8377.m19515(this.f20157 + 2, this.f20158);
        this.f20158 = abstractC6462Arr;
        int i2 = this.f20157;
        this.f20157 = i2 + 1;
        abstractC6462Arr[i2] = abstractC6462;
        int iM7029 = C3666.m7029(abstractC6462);
        if (iM7029 != 1) {
            if (iM7029 == 2) {
                AbstractC6462[] abstractC6462Arr2 = this.f20158;
                int i3 = this.f20157;
                this.f20157 = i3 + 1;
                abstractC6462Arr2[i3] = null;
            } else {
                throw new AssertionError(abstractC6462);
            }
        }
        int i4 = this.f20157;
        if (i4 > c3666.f7741) {
            c3666.f7741 = i4;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC6462 m17807() {
        if (this.f20159.f7754) {
            System.err.println("   popping 1");
        }
        int i = this.f20157 - 1;
        this.f20157 = i;
        AbstractC6462[] abstractC6462Arr = this.f20158;
        AbstractC6462 abstractC6462 = abstractC6462Arr[i];
        abstractC6462Arr[i] = null;
        C1446.m31704(abstractC6462 != null && C3666.m7029(abstractC6462) == 1);
        return abstractC6462;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC6462 m17809() {
        if (this.f20159.f7754) {
            System.err.println("   popping 2");
        }
        int i = this.f20157;
        int i2 = i - 2;
        this.f20157 = i2;
        AbstractC6462[] abstractC6462Arr = this.f20158;
        AbstractC6462 abstractC6462 = abstractC6462Arr[i2];
        abstractC6462Arr[i2] = null;
        C1446.m31704(abstractC6462Arr[i - 1] == null && abstractC6462 != null && C3666.m7029(abstractC6462) == 2);
        return abstractC6462;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m17808(int i) {
        if (this.f20159.f7754) {
            System.err.println("   popping " + i);
        }
        while (i > 0) {
            AbstractC6462[] abstractC6462Arr = this.f20158;
            int i2 = this.f20157 - 1;
            this.f20157 = i2;
            abstractC6462Arr[i2] = null;
            i--;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17805(AbstractC6462 abstractC6462) {
        C3666 c3666 = this.f20159;
        C8374 c8374 = c3666.f7766;
        if (c3666.f7735) {
            int i = C22443.f70811[abstractC6462.mo5577().ordinal()];
            if (i == 10 || i == 11) {
                int iM7029 = C3666.m7029(abstractC6462);
                C1446.m31704(c8374.m19486(c8374.m19459(this.f20158[this.f20157 - iM7029]), c8374.m19459(abstractC6462), true));
                this.f20158[this.f20157 - iM7029] = abstractC6462;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17804(int i) {
        PrintStream printStream = System.err;
        StringBuilder sb = new StringBuilder("stackMap for ");
        C3666 c3666 = this.f20159;
        sb.append(c3666.f7734.f20407);
        sb.append(".");
        sb.append(c3666.f7734);
        printStream.print(sb.toString());
        if (i == -1) {
            System.out.println();
        } else {
            System.out.println(" at " + i);
        }
        System.err.println(" stack (from bottom):");
        for (int i2 = 0; i2 < this.f20157; i2++) {
            PrintStream printStream2 = System.err;
            StringBuilder sbM34408 = C15033.m34408(i2, EnumC2483.f3919, ": ");
            sbM34408.append(this.f20158[i2]);
            printStream2.println(sbM34408.toString());
        }
        int i3 = c3666.f7733;
        do {
            i3--;
            if (i3 < 0) {
                i3 = 0;
                break;
            }
        } while (!this.f20161.m22915(i3));
        if (i3 >= 0) {
            System.err.println(" locals:");
        }
        for (int i4 = 0; i4 <= i3; i4++) {
            System.err.print(EnumC2483.f3919 + i4 + ": ");
            if (this.f20161.m22915(i4)) {
                C17747 c17747 = c3666.f7761[i4];
                if (c17747 == null) {
                    System.err.println("(none)");
                } else {
                    C13818 c13818 = c17747.f53006;
                    if (c13818 == null) {
                        System.err.println("UNKNOWN!");
                    } else {
                        System.err.println("" + c13818 + " of type " + c13818.mo18010(c3666.f7766));
                    }
                }
            } else {
                System.err.println("undefined");
            }
        }
        if (this.f20160 != 0) {
            System.err.print(" locks:");
            for (int i5 = 0; i5 < this.f20160; i5++) {
                System.err.print(" " + this.f20162[i5]);
            }
            System.err.println();
        }
    }
}
