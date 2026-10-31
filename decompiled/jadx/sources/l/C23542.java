package l;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: l.᩻۟, reason: contains not printable characters */
/* JADX INFO: compiled from: K4SO */
/* JADX INFO: loaded from: classes.dex */
public class C23542 extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20721 f75594;

    public C23542(C20721 c20721) {
        this.f75594 = c20721;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C14369 c14369Mo39088 = this.f75594.mo39088(i);
        if (c14369Mo39088 == null) {
            return null;
        }
        return c14369Mo39088.m34312();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f75594.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f75594.mo39089(i, i2, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C14369 c14369Mo39090 = this.f75594.mo39090(i);
        if (c14369Mo39090 == null) {
            return null;
        }
        return c14369Mo39090.m34312();
    }
}
