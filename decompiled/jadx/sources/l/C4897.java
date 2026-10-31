package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes3.dex */
public final class C4897 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۡۤۧ, reason: not valid java name and contains not printable characters */
    private static final short[] f15459 = {351, 12347, 12345, 12324, 12321, 12334, 12328, 12351, 12308, 12334, 12339, 12330, 12328, 12351, 12327, 12338, 12308, 12326, 12330, 12351, 12328, 12323, 12334, 12325, 12330, 12329, 12327, 12334, 12308, 12329, 12322, 12325, 12308, 12328, 12324, 12325, 12349, 12334, 12345, 12351, 12330, 12332, 12345, 12334, 12334, 12326, 12334, 12325, 12351, 12389, 12351, 12339, 12351, 28053, 24179, 24888, 32453, 23710, 28608, 21268, 27002, 12328, 12329, 12334, 12333, 12332, 12323, 12321, 12327, 12296, 12297, 12302, 12301, 12300, 12291, 12289, 12295};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f15460;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f15461;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f15462;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10917 f15463;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16891 f15464;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f15465;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public List f15466;

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 38941. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public void mo1009() {
        /*
            Method dump skipped, instruction units count: 3894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4897.mo1009():void");
    }

    public C4897(C16560 c16560, AbstractC16891 abstractC16891, boolean z, boolean z2, Runnable runnable) {
        this.f15460 = c16560;
        this.f15464 = abstractC16891;
        this.f15462 = z;
        this.f15461 = z2;
        this.f15465 = runnable;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        this.f15463 = this.f15460.m38992(true, this.f15464.mo39734(this.f15462));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C16560 c16560 = this.f15460;
        C12327 c12327 = c16560.f50891;
        AbstractC16891 abstractC16891 = c16560.f50900;
        AbstractC16891 abstractC16892 = this.f15464;
        if (abstractC16891 != abstractC16892) {
            return;
        }
        if (this.f15463.m27225()) {
            if (this.f15461) {
                c16560.m38961(Collections.EMPTY_LIST, false);
                c12327.m29923();
                return;
            }
            return;
        }
        c16560.m38961(this.f15466, false);
        if (this.f15466.size() == 3 && (abstractC16892 instanceof C16773) && c16560.m39058().equals("/data/data/")) {
            Set set = (Set) C5378.stream(this.f15466).filter(new C21831(0)).map(new C22536(0)).collect(C22976.toSet());
            if (set.contains(C4925.m14337()) && set.contains("com.google.android.gms")) {
                C19258 c19258BuildDialog = c16560.m39056().buildDialog();
                c19258BuildDialog.m44433(R.string.MT_Protector);
                c19258BuildDialog.m44416(R.string.MT_Protector);
                c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩶᩷ܳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.f65882.f15460.m39056().m10237("https://mt.cc/download");
                    }
                });
                c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c19258BuildDialog.m44438();
            }
        }
        c12327.m29923();
        Runnable runnable = this.f15465;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f15463.m27225()) {
            return;
        }
        boolean z = exc instanceof C1637;
        C16560 c16560 = this.f15460;
        if (z || (exc instanceof C19401)) {
            C21374.m48458(0, exc.getMessage()).m48468();
        } else {
            c16560.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
        }
        c16560.m38976();
        if (this.f15461) {
            c16560.m38961(Collections.EMPTY_LIST, false);
            c16560.f50891.m29923();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f15463.m27224();
    }
}
