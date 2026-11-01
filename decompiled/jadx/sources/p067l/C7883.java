package p067l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;

/* JADX INFO: renamed from: l.ۛۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X59Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C7883 extends C0949 {

    /* JADX INFO: renamed from: ܳ */
    public final BroadcastReceiver.PendingResult f20695;

    /* JADX INFO: renamed from: ܽ */
    public final Context f20696;

    /* JADX INFO: renamed from: ܿ */
    public C1439 f20697;

    /* JADX INFO: renamed from: ᩳ */
    public final Intent f20698;

    public C7883(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.f20696 = context;
        this.f20698 = intent;
        this.f20695 = pendingResult;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18205(C1439 c1439) {
        this.f20697 = c1439;
    }

    @Override // p067l.C0949
    /* JADX INFO: renamed from: ֫ */
    public final void mo9242() {
        new C1582(this.f20696, this.f20697.m31479()).m37519((KeyEvent) this.f20698.getParcelableExtra("android.intent.extra.KEY_EVENT"));
        this.f20697.m31478();
        this.f20695.finish();
    }

    @Override // p067l.C0949
    /* JADX INFO: renamed from: ۧ */
    public final void mo9243() {
        this.f20697.m31478();
        this.f20695.finish();
    }

    @Override // p067l.C0949
    /* JADX INFO: renamed from: ܽ */
    public final void mo9244() {
        this.f20697.m31478();
        this.f20695.finish();
    }
}
