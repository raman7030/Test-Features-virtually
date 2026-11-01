package p067l;

import android.content.Intent;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܽۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I94M */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC17993 extends AbstractActivityC3102 {

    /* JADX INFO: renamed from: ᩴۧ */
    public AbstractC17043 f53740;

    /* JADX INFO: renamed from: ᩵ۧ */
    public String f53741;

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ֫ */
    public final void mo5272(Exception exc) {
    }

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ֫֫ */
    public final String mo5273() {
        return "null";
    }

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "SyntaxPreviewActivity";
    }

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ᩳ֫ */
    public final boolean mo5282() {
        Intent intent = getIntent();
        this.f53741 = intent.getStringExtra("syntaxName");
        this.f53740 = C18524.m42105(intent);
        return this.f53741 != null;
    }

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ܽ֫ */
    public final String mo5280() {
        return this.f53741;
    }

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ᩺ */
    public final String mo5284() {
        return this.f53740.mo25505();
    }

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ۨ */
    public final String mo5276() {
        return this.f53740.getName();
    }

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ܰ */
    public final String mo5277() {
        return "TEMPORARY:" + this.f53741;
    }

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ܿ֫ */
    public final String mo5281() {
        if (this.f53740.mo25094()) {
            return this.f53740.m38647();
        }
        return getString(R.string.MT_Protector);
    }

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ܽ */
    public final void mo5279(String str) {
        this.f53740.m38668(str);
    }
}
