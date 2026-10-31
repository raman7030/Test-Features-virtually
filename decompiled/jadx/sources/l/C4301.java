package l;

import android.view.View;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۙ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AOV */
/* JADX INFO: loaded from: classes2.dex */
public final class C4301 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f13875 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BooleanSupplier f13877;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2890 f13878;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5712 f13879;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int f13873 = ApplicationC20075.f65008.getInt("tfcgi", 0);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean f13874 = ApplicationC20075.f65008.getBoolean("tfcge", false);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean f13876 = ApplicationC20075.f65008.getBoolean("tfrge", false);

    public C4301(AbstractActivityC0772 abstractActivityC0772, final C12392 c12392) {
        C11003.requireNonNull(c12392);
        this.f13877 = new BooleanSupplier() { // from class: l.ܶ֡ᩳ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return c12392.m30441();
            }
        };
        C5712 c5712 = (C5712) abstractActivityC0772.m10241(R.id.MT_Protector);
        this.f13879 = c5712;
        C2890 c2890 = (C2890) abstractActivityC0772.m10241(R.id.MT_Protector);
        this.f13878 = c2890;
        m12888();
        c2890.m8835(c5712, c12392, c12392);
        c5712.m16131(new C19824());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4301(View view, final C12392 c12392) {
        this(view, new BooleanSupplier() { // from class: l.ܶ֡ᩳ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return c12392.m30441();
            }
        }, c12392);
        C11003.requireNonNull(c12392);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4301(View view, BooleanSupplier booleanSupplier, InterfaceC16685 interfaceC16685) {
        this.f13877 = booleanSupplier;
        C5712 c5712 = (C5712) view.findViewById(R.id.MT_Protector);
        this.f13879 = c5712;
        C2890 c2890 = (C2890) view.findViewById(R.id.MT_Protector);
        this.f13878 = c2890;
        m12888();
        c2890.m8835(c5712, interfaceC16685, interfaceC16685 instanceof View ? (View) interfaceC16685 : null);
        c5712.m16131(new C19824());
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m12886() {
        return f13876;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m12885(boolean z) {
        C22870.m50970(ApplicationC20075.f65008, "tfrge", z);
        f13876 = z;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m12887() {
        return f13874;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m12883(boolean z) {
        if (f13874 != z) {
            f13874 = z;
            C1802.m5990("tfcge", 5000L, new RunnableC7828(0));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12890(boolean z) {
        C2890 c2890 = this.f13878;
        C5712 c5712 = this.f13879;
        if (z) {
            c5712.setVisibility(0);
            c2890.setVisibility(0);
        } else {
            c5712.setVisibility(8);
            c2890.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12888() {
        m12890(ApplicationC20075.f65010.getBoolean("symbol_input", true) && !this.f13877.getAsBoolean());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12889(InterfaceC23586 interfaceC23586, InterfaceC1973 interfaceC1973, C10235 c10235, C10235 c10236) {
        ArrayList arrayList = new ArrayList(C8239.m21821());
        int iM30482 = interfaceC1973.mo6482().m30482();
        C5712 c5712 = this.f13879;
        c5712.setBackgroundColor(iM30482);
        c5712.m16130(arrayList, interfaceC1973, c10235, c10236);
        c5712.m16128(f13873);
        C8239.m21819().m1668(interfaceC23586, new C21235(0, this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12881(C4301 c4301) {
        c4301.f13879.m16129(new ArrayList(C8239.m21821()));
        c4301.m12888();
    }
}
