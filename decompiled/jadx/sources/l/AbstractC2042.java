package l;

import android.content.ComponentName;
import android.content.Intent;

/* JADX INFO: renamed from: l.֫᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2042 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ComponentName f6837;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f6838;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f6839;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo6710() {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo6712(Intent intent);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo6713() {
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo6714() {
    }

    public AbstractC2042(ComponentName componentName) {
        this.f6837 = componentName;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6711(int i) {
        if (!this.f6838) {
            this.f6838 = true;
            this.f6839 = i;
        } else {
            if (this.f6839 == i) {
                return;
            }
            StringBuilder sbM32308 = C13325.m32308(i, "Given job ID ", " is different than previous ");
            sbM32308.append(this.f6839);
            throw new IllegalArgumentException(sbM32308.toString());
        }
    }
}
