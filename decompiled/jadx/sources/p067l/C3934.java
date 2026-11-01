package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.֫ۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3934 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f8525;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC16003 f8526;

    /* JADX INFO: renamed from: ܽ */
    public LinkedList f8527;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ ActivityC18686 f8528;

    public C3934() {
        throw null;
    }

    public C3934(ActivityC18686 activityC18686, LinkedList linkedList, AbstractC16003 abstractC16003, boolean z) {
        this.f8528 = activityC18686;
        this.f8527 = linkedList;
        this.f8526 = abstractC16003;
        this.f8525 = z;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m7760() {
        boolean z = this.f8525;
        ActivityC18686 activityC18686 = this.f8528;
        AbstractC16003 abstractC16003 = this.f8526;
        if (z || !abstractC16003.mo19366()) {
            abstractC16003.m36361(activityC18686);
            m7759();
            return;
        }
        activityC18686.m42603();
        ActivityC18686.m42571(activityC18686, abstractC16003);
        C20671 c20671BuildDialog = activityC18686.buildDialog();
        c20671BuildDialog.m46730(C8597.m20011(25, abstractC16003.mo16325()));
        c20671BuildDialog.m46710(R.string.MT_Protector);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩺ۤ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                final C3934 c3934 = this.f76646;
                c3934.f8526.mo19364(c3934.f8528, false, new Runnable() { // from class: l.۟ۤ᩷
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3934 c3935 = c3934;
                        c3935.f8526.m36361(c3935.f8528);
                        c3935.m7759();
                    }
                });
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܰۤ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C3934 c3934 = this.f44141;
                c3934.f8526.m36361(c3934.f8528);
                c3934.m7759();
            }
        });
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7759() {
        LinkedList linkedList = this.f8527;
        if (linkedList.isEmpty()) {
            return;
        }
        ((C3934) linkedList.removeFirst()).m7760();
    }
}
