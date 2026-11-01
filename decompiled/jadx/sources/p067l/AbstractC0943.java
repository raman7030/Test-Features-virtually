package p067l;

import android.content.ComponentName;
import android.content.Intent;

/* JADX INFO: renamed from: l.֫᩶ */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0943 {

    /* JADX INFO: renamed from: ֫ */
    public final ComponentName f9620;

    /* JADX INFO: renamed from: ۧ */
    public boolean f9621;

    /* JADX INFO: renamed from: ܽ */
    public int f9622;

    /* JADX INFO: renamed from: ֫ */
    public void mo8836() {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8838(Intent intent);

    /* JADX INFO: renamed from: ۧ */
    public void mo8839() {
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo8840() {
    }

    public AbstractC0943(ComponentName componentName) {
        this.f9620 = componentName;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8837(int i) {
        if (!this.f9621) {
            this.f9621 = true;
            this.f9622 = i;
        } else {
            if (this.f9622 == i) {
                return;
            }
            StringBuilder sbM34408 = C15033.m34408(i, "Given job ID ", " is different than previous ");
            sbM34408.append(this.f9622);
            throw new IllegalArgumentException(sbM34408.toString());
        }
    }
}
