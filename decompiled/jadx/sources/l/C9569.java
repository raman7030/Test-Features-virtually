package l;

import android.widget.Spinner;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public final class C9569 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Spinner f29024;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Runnable f29025;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C21730 f29026;

    public C9569(Spinner spinner) {
        this.f29024 = spinner;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24444(C9569 c9569, int i) {
        if (i >= 0) {
            ArrayList arrayList = C8863.f26982;
            if (i >= arrayList.size()) {
                return;
            }
            c9569.m24447((AbstractC13262) arrayList.get(i));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24446(C9569 c9569) {
        int selectedItemPosition = c9569.f29024.getSelectedItemPosition();
        if (selectedItemPosition < 0) {
            return false;
        }
        ArrayList arrayList = C8863.f26982;
        if (selectedItemPosition >= arrayList.size()) {
            return false;
        }
        return c9569.m24447((AbstractC13262) arrayList.get(selectedItemPosition));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m24450(C9569 c9569) {
        int selectedItemPosition = c9569.f29024.getSelectedItemPosition();
        if (selectedItemPosition >= 0) {
            ArrayList arrayList = C8863.f26982;
            if (selectedItemPosition < arrayList.size()) {
                c9569.m24447((AbstractC13262) arrayList.get(selectedItemPosition));
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m24449(C9569 c9569) {
        return c9569.f29026 != null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C21730 m24448(C9569 c9569) {
        return c9569.f29026;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24445(C9569 c9569, Runnable runnable) {
        c9569.f29025 = runnable;
        runnable.run();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m24447(AbstractC13262 abstractC13262) {
        abstractC13262.mo32196();
        this.f29026 = abstractC13262 instanceof C22435 ? ((C22435) abstractC13262).m50362() : null;
        Runnable runnable = this.f29025;
        if (runnable != null) {
            runnable.run();
        }
        return this.f29026 != null;
    }
}
