package p067l;

import android.widget.Spinner;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public final class C11463 {

    /* JADX INFO: renamed from: ֫ */
    public final Spinner f31971;

    /* JADX INFO: renamed from: ۧ */
    public Runnable f31972;

    /* JADX INFO: renamed from: ܽ */
    public C23021 f31973;

    public C11463(Spinner spinner) {
        this.f31971 = spinner;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26456(C11463 c11463, int i) {
        if (i >= 0) {
            ArrayList arrayList = C10792.f29905;
            if (i >= arrayList.size()) {
                return;
            }
            c11463.m26459((AbstractC14973) arrayList.get(i));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m26458(C11463 c11463) {
        int selectedItemPosition = c11463.f31971.getSelectedItemPosition();
        if (selectedItemPosition < 0) {
            return false;
        }
        ArrayList arrayList = C10792.f29905;
        if (selectedItemPosition >= arrayList.size()) {
            return false;
        }
        return c11463.m26459((AbstractC14973) arrayList.get(selectedItemPosition));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m26462(C11463 c11463) {
        int selectedItemPosition = c11463.f31971.getSelectedItemPosition();
        if (selectedItemPosition >= 0) {
            ArrayList arrayList = C10792.f29905;
            if (selectedItemPosition < arrayList.size()) {
                c11463.m26459((AbstractC14973) arrayList.get(selectedItemPosition));
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m26461(C11463 c11463) {
        return c11463.f31973 != null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C23021 m26460(C11463 c11463) {
        return c11463.f31973;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26457(C11463 c11463, Runnable runnable) {
        c11463.f31972 = runnable;
        runnable.run();
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m26459(AbstractC14973 abstractC14973) {
        abstractC14973.mo34295();
        this.f31973 = abstractC14973 instanceof C23691 ? ((C23691) abstractC14973).m52703() : null;
        Runnable runnable = this.f31972;
        if (runnable != null) {
            runnable.run();
        }
        return this.f31973 != null;
    }
}
