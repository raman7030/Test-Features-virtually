package p067l;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.PowerManager;

/* JADX INFO: renamed from: l.ۤ᩹ */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes4.dex */
public final class C1366 extends AbstractC0943 {

    /* JADX INFO: renamed from: ۜ */
    public boolean f34691;

    /* JADX INFO: renamed from: ܳ */
    public boolean f34692;

    /* JADX INFO: renamed from: ܿ */
    public final PowerManager.WakeLock f34693;

    /* JADX INFO: renamed from: ᩳ */
    public final Context f34694;

    /* JADX INFO: renamed from: ᩻ */
    public final PowerManager.WakeLock f34695;

    public C1366(ContextWrapper contextWrapper, ComponentName componentName) {
        super(componentName);
        this.f34694 = contextWrapper.getApplicationContext();
        PowerManager powerManager = (PowerManager) contextWrapper.getSystemService("power");
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
        this.f34693 = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
        PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
        this.f34695 = wakeLockNewWakeLock2;
        wakeLockNewWakeLock2.setReferenceCounted(false);
    }

    @Override // p067l.AbstractC0943
    /* JADX INFO: renamed from: ֫ */
    public final void mo8838(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setComponent(this.f9620);
        if (this.f34694.startService(intent2) != null) {
            synchronized (this) {
                if (!this.f34692) {
                    this.f34692 = true;
                    if (!this.f34691) {
                        this.f34693.acquire(60000L);
                    }
                }
            }
        }
    }

    @Override // p067l.AbstractC0943
    /* JADX INFO: renamed from: ܽ */
    public final void mo8840() {
        synchronized (this) {
            this.f34692 = false;
        }
    }

    @Override // p067l.AbstractC0943
    /* JADX INFO: renamed from: ۧ */
    public final void mo8839() {
        synchronized (this) {
            if (!this.f34691) {
                this.f34691 = true;
                this.f34695.acquire(600000L);
                this.f34693.release();
            }
        }
    }

    @Override // p067l.AbstractC0943
    /* JADX INFO: renamed from: ֫ */
    public final void mo8836() {
        synchronized (this) {
            if (this.f34691) {
                if (this.f34692) {
                    this.f34693.acquire(60000L);
                }
                this.f34691 = false;
                this.f34695.release();
            }
        }
    }
}
