package l;

import android.content.Intent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I94M */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC16440 extends AbstractActivityC0772 {

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f50561;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public String f50562;

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ֫ */
    public final void mo2943(Exception exc) {
    }

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ֫֫ */
    public final String mo2944() {
        return "null";
    }

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "SyntaxPreviewActivity";
    }

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ᩳ֫ */
    public final boolean mo2953() {
        Intent intent = getIntent();
        this.f50562 = intent.getStringExtra("syntaxName");
        this.f50561 = C16999.m39862(intent);
        return this.f50562 != null;
    }

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ܽ֫ */
    public final String mo2951() {
        return this.f50562;
    }

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ᩺ */
    public final String mo2955() {
        return this.f50561.mo23554();
    }

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ۨ */
    public final String mo2947() {
        return this.f50561.getName();
    }

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ܰ */
    public final String mo2948() {
        return "TEMPORARY:" + this.f50562;
    }

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ܿ֫ */
    public final String mo2952() {
        if (this.f50561.mo23120()) {
            return this.f50561.m36489();
        }
        return getString(R.string.MT_Protector);
    }

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ܽ */
    public final void mo2950(String str) {
        this.f50561.m36510(str);
    }
}
