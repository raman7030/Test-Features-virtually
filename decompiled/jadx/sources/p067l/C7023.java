package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes3.dex */
public final class C7023 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۡۤۧ, reason: not valid java name and contains not printable characters */
    private static final short[] f81982 = {351, 12347, 12345, 12324, 12321, 12334, 12328, 12351, 12308, 12334, 12339, 12330, 12328, 12351, 12327, 12338, 12308, 12326, 12330, 12351, 12328, 12323, 12334, 12325, 12330, 12329, 12327, 12334, 12308, 12329, 12322, 12325, 12308, 12328, 12324, 12325, 12349, 12334, 12345, 12351, 12330, 12332, 12345, 12334, 12334, 12326, 12334, 12325, 12351, 12389, 12351, 12339, 12351, 28053, 24179, 24888, 32453, 23710, 28608, 21268, 27002, 12328, 12329, 12334, 12333, 12332, 12323, 12321, 12327, 12296, 12297, 12302, 12301, 12300, 12291, 12289, 12295};

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C18107 f18294;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ boolean f18295;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ boolean f18296;

    /* JADX INFO: renamed from: ܳ */
    public C12744 f18297;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ AbstractC18422 f18298;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ Runnable f18299;

    /* JADX INFO: renamed from: ᩻ */
    public List f18300;

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 38941. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public void mo3405() {
        /*
            Method dump skipped, instruction units count: 3894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C7023.mo3405():void");
    }

    public C7023(C18107 c18107, AbstractC18422 abstractC18422, boolean z, boolean z2, Runnable runnable) {
        this.f18294 = c18107;
        this.f18298 = abstractC18422;
        this.f18296 = z;
        this.f18295 = z2;
        this.f18299 = runnable;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        this.f18297 = this.f18294.m41218(true, this.f18298.mo41975(this.f18296));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C18107 c18107 = this.f18294;
        C14084 c14084 = c18107.f54068;
        AbstractC18422 abstractC18422 = c18107.f54077;
        AbstractC18422 abstractC18423 = this.f18298;
        if (abstractC18422 != abstractC18423) {
            return;
        }
        if (this.f18297.m29270()) {
            if (this.f18295) {
                c18107.m41187(Collections.EMPTY_LIST, false);
                c14084.m31983();
                return;
            }
            return;
        }
        c18107.m41187(this.f18300, false);
        if (this.f18300.size() == 3 && (abstractC18423 instanceof C18310) && c18107.m41284().equals("/data/data/")) {
            Set set = (Set) C7480.stream(this.f18300).filter(new C23117(0)).map(new C23787(0)).collect(C24205.toSet());
            if (set.contains(C7050.m16234()) && set.contains("com.google.android.gms")) {
                C20671 c20671BuildDialog = c18107.m41282().buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                c20671BuildDialog.m46710(R.string.MT_Protector);
                c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩶᩷ܳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.f68557.f18294.m41282().m12273("https://mt.cc/download");
                    }
                });
                c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c20671BuildDialog.m46732();
            }
        }
        c14084.m31983();
        Runnable runnable = this.f18299;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f18297.m29270()) {
            return;
        }
        boolean z = exc instanceof C3924;
        C18107 c18107 = this.f18294;
        if (z || (exc instanceof C20807)) {
            C22682.m50794(0, exc.getMessage()).m50804();
        } else {
            c18107.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
        }
        c18107.m41202();
        if (this.f18295) {
            c18107.m41187(Collections.EMPTY_LIST, false);
            c18107.f54068.m31983();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f18297.m29269();
    }
}
