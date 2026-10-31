package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚ֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J8YL */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4991 implements InterfaceC0072 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char f15715;

    @Override // l.InterfaceC0072
    /* JADX INFO: renamed from: ۧ */
    public final int mo1022() {
        return 1;
    }

    public AbstractC4991(char c) {
        this.f15715 = c;
    }

    @Override // l.InterfaceC0072
    /* JADX INFO: renamed from: ܽ */
    public final char mo1023() {
        return this.f15715;
    }

    @Override // l.InterfaceC0072
    /* JADX INFO: renamed from: ֫ */
    public final char mo1020() {
        return this.f15715;
    }

    @Override // l.InterfaceC0072
    /* JADX INFO: renamed from: ֫ */
    public final int mo1021(C16132 c16132, C16132 c16133) {
        AbstractC0197 c17131;
        ArrayList arrayList = c16133.f49701;
        if ((c16132.m38040() || c16133.m38042()) && c16133.m38044() % 3 != 0) {
            if ((c16133.m38044() + c16132.m38044()) % 3 == 0) {
                return 0;
            }
        }
        int size = c16132.f49701.size();
        char c = this.f15715;
        int i = 2;
        if (size < 2 || arrayList.size() < 2) {
            String.valueOf(c);
            c17131 = new C17131();
            i = 1;
        } else {
            String.valueOf(c);
            c17131 = new C3020();
        }
        C4431 c4431 = new C4431();
        c4431.m13153(c16132.m38041(i));
        C12897 c12897M38043 = c16132.m38043();
        for (AbstractC0197 abstractC0197 : C7959.m21266(c12897M38043, (C12897) arrayList.get(0))) {
            c17131.m1343(abstractC0197);
            c4431.m13152(abstractC0197.m1351());
        }
        c4431.m13153(c16133.m38039(i));
        c17131.m1342(c4431.m13151());
        c12897M38043.m1350(c17131);
        return i;
    }
}
