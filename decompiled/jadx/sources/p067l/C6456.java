package p067l;

import android.view.View;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۙ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AOV */
/* JADX INFO: loaded from: classes2.dex */
public final class C6456 {

    /* JADX INFO: renamed from: ᩳ */
    public static final /* synthetic */ int f16690 = 0;

    /* JADX INFO: renamed from: ֫ */
    public final BooleanSupplier f16692;

    /* JADX INFO: renamed from: ۧ */
    public final C5115 f16693;

    /* JADX INFO: renamed from: ܽ */
    public final C7797 f16694;

    /* JADX INFO: renamed from: ܳ */
    public static int f16688 = ApplicationC21448.f67649.getInt("tfcgi", 0);

    /* JADX INFO: renamed from: ܿ */
    public static boolean f16689 = ApplicationC21448.f67649.getBoolean("tfcge", false);

    /* JADX INFO: renamed from: ᩻ */
    public static boolean f16691 = ApplicationC21448.f67649.getBoolean("tfrge", false);

    public C6456(AbstractActivityC3102 abstractActivityC3102, final C14146 c14146) {
        C12826.requireNonNull(c14146);
        this.f16692 = new BooleanSupplier() { // from class: l.ܶ֡ᩳ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return c14146.m32505();
            }
        };
        C7797 c7797 = (C7797) abstractActivityC3102.m12277(R.id.MT_Protector);
        this.f16694 = c7797;
        C5115 c5115 = (C5115) abstractActivityC3102.m12277(R.id.MT_Protector);
        this.f16693 = c5115;
        m14752();
        c5115.m10902(c7797, c14146, c14146);
        c7797.m18050(new C21209());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6456(View view, final C14146 c14146) {
        this(view, new BooleanSupplier() { // from class: l.ܶ֡ᩳ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return c14146.m32505();
            }
        }, c14146);
        C12826.requireNonNull(c14146);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6456(View view, BooleanSupplier booleanSupplier, InterfaceC18226 interfaceC18226) {
        this.f16692 = booleanSupplier;
        C7797 c7797 = (C7797) view.findViewById(R.id.MT_Protector);
        this.f16694 = c7797;
        C5115 c5115 = (C5115) view.findViewById(R.id.MT_Protector);
        this.f16693 = c5115;
        m14752();
        c5115.m10902(c7797, interfaceC18226, interfaceC18226 instanceof View ? (View) interfaceC18226 : null);
        c7797.m18050(new C21209());
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m14750() {
        return f16691;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m14749(boolean z) {
        C24104.m53360(ApplicationC21448.f67649, "tfrge", z);
        f16691 = z;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m14751() {
        return f16689;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m14747(boolean z) {
        if (f16689 != z) {
            f16689 = z;
            C4081.m8187("tfcge", 5000L, new RunnableC9808(0));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14754(boolean z) {
        C5115 c5115 = this.f16693;
        C7797 c7797 = this.f16694;
        if (z) {
            c7797.setVisibility(0);
            c5115.setVisibility(0);
        } else {
            c7797.setVisibility(8);
            c5115.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14752() {
        m14754(ApplicationC21448.f67650.getBoolean("symbol_input", true) && !this.f16692.getAsBoolean());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14753(InterfaceC24784 interfaceC24784, InterfaceC4244 interfaceC4244, C12096 c12096, C12096 c12097) {
        ArrayList arrayList = new ArrayList(C10199.m23790());
        int iM32546 = interfaceC4244.mo8623().m32546();
        C7797 c7797 = this.f16694;
        c7797.setBackgroundColor(iM32546);
        c7797.m18049(arrayList, interfaceC4244, c12096, c12097);
        c7797.m18047(f16688);
        C10199.m23788().m4066(interfaceC24784, new C22550(0, this));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m14745(C6456 c6456) {
        c6456.f16694.m18048(new ArrayList(C10199.m23790()));
        c6456.m14752();
    }
}
