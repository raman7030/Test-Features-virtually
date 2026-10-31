package l;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: renamed from: l.᩷۟, reason: contains not printable characters */
/* JADX INFO: compiled from: K4SO */
/* JADX INFO: loaded from: classes4.dex */
public class C20721 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AccessibilityNodeProvider f66728;

    /* JADX INFO: renamed from: ֫ */
    public C14369 mo39088(int i) {
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo39089(int i, int i2, Bundle bundle) {
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public C14369 mo39090(int i) {
        return null;
    }

    public C20721() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f66728 = new C6609(this);
        } else {
            this.f66728 = new C23542(this);
        }
    }

    public C20721(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f66728 = accessibilityNodeProvider;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m47327() {
        return this.f66728;
    }
}
