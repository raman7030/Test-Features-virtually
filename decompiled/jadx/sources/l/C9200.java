package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P1EM */
/* JADX INFO: loaded from: classes3.dex */
public final class C9200 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C19452 f27875;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f27876;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Map f27877;

    public C9200(C19452 c19452, boolean z) {
        this.f27875 = c19452;
        this.f27876 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m23633(String str) {
        return (List) this.f27877.get(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23634(ActivityC17169 activityC17169, Exception exc) {
        activityC17169.m10223(exc, (DialogInterface.OnDismissListener) null);
        boolean z = exc instanceof C5672;
        if (z) {
            C5672 c5672 = (C5672) exc;
            C19287 c19287M44466 = C19287.m44466(c5672.f17514, c5672.f17513);
            c19287M44466.f60678 = false;
            activityC17169.m40354(c5672.m15979(), c19287M44466);
            this.f27875.m44818(c5672.m15979());
        }
        if (z || (exc instanceof C1580)) {
            C21374.m48457(R.string.MT_Protector);
        }
    }
}
