package l;

import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: renamed from: l.ۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB8W */
/* JADX INFO: loaded from: classes2.dex */
public final class C5507 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Intent f17061;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f17062;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f17063;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final IntentSender f17064;

    public C5507(IntentSender intentSender) {
        C11233.m27805(intentSender, "intentSender");
        this.f17064 = intentSender;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15642(Intent intent) {
        this.f17061 = intent;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15641(int i, int i2) {
        this.f17063 = i;
        this.f17062 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8329 m15640() {
        return new C8329(this.f17064, this.f17061, this.f17062, this.f17063);
    }
}
