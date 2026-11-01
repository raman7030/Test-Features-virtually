package p067l;

import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: renamed from: l.ۚᩳ */
/* JADX INFO: compiled from: TB8W */
/* JADX INFO: loaded from: classes2.dex */
public final class C1115 {

    /* JADX INFO: renamed from: ֫ */
    public Intent f19902;

    /* JADX INFO: renamed from: ۧ */
    public int f19903;

    /* JADX INFO: renamed from: ܽ */
    public int f19904;

    /* JADX INFO: renamed from: ᩳ */
    public final IntentSender f19905;

    public C1115(IntentSender intentSender) {
        C13045.m29867(intentSender, "intentSender");
        this.f19905 = intentSender;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17557(Intent intent) {
        this.f19902 = intent;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17556(int i, int i2) {
        this.f19904 = i;
        this.f19903 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C1255 m17555() {
        return new C1255(this.f19905, this.f19902, this.f19903, this.f19904);
    }
}
