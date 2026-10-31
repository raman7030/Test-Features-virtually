package l;

import android.content.DialogInterface;
import android.content.Intent;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;

/* JADX INFO: renamed from: l.֨᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1413 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C18258 f5084;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f5085;

    public C1413(ActivityC21107 activityC21107) {
        this.f5085 = activityC21107;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f5085);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C3454 c3454 = new C3454();
        this.f5085.f68093.f56834.m27860(c3454);
        c3454.m10578();
        byte[] bArr = new byte[c3454.m10579()];
        c3454.m10576(new C1547(bArr));
        this.f5084 = C2405.m7781("", bArr, ApplicationC20075.f65008.mo18251((byte) 0, "dex_decompile_engine"));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        boolean zM52607 = this.f5084.f56780.m52607();
        ActivityC21107 activityC21107 = this.f5085;
        if (!zM52607) {
            C23881 c23881 = this.f5084.f56780;
            c23881.getClass();
            activityC21107.m10221(C1575.m5392(c23881, R.string.MT_Protector), false);
            return;
        }
        C5652 c5652 = activityC21107.f68094;
        C18258 c18258 = this.f5084;
        String strM23341 = C9045.m23341(new StringBuilder(), activityC21107.f68093.f56844, ".java");
        int i = ActivityC14946.f45553;
        C2956.m9014(ActivityC21107.class, c18258, "textViewer_dec");
        Intent intent = new Intent(C4925.m14335(), (Class<?>) ActivityC14946.class);
        intent.putExtra(e.s, 2);
        intent.putExtra("title", strM23341);
        intent.putExtra("saveStateOnResult", true);
        c5652.m15940(intent);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f5085.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
