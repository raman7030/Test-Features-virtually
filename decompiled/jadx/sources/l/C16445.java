package l;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86A7 */
/* JADX INFO: loaded from: classes4.dex */
public class C16445 {
    public static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate mBridge;
    public final View.AccessibilityDelegate mOriginalDelegate;

    public C16445() {
        this(DEFAULT_DELEGATE);
    }

    public C16445(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new C10802(this);
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, C14369 c14369) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, c14369.m34312());
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public C20721 getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.mOriginalDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C20721(accessibilityNodeProvider);
        }
        return null;
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        List listM38749 = m38749(view);
        boolean zPerformAccessibilityAction = false;
        for (int i2 = 0; i2 < listM38749.size(); i2++) {
            C13847 c13847 = (C13847) listM38749.get(i2);
            if (c13847.m33204() == i) {
                zPerformAccessibilityAction = c13847.m33206(view);
                break;
            }
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.mOriginalDelegate.performAccessibilityAction(view, i, bundle);
        }
        return (zPerformAccessibilityAction || i != R.id.MT_Protector || bundle == null) ? zPerformAccessibilityAction : m38750(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m38750(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.MT_Protector);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m38751(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m38751(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i = 0; clickableSpanArr != null && i < clickableSpanArr.length; i++) {
                if (clickableSpan.equals(clickableSpanArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m38749(View view) {
        List list = (List) view.getTag(R.id.MT_Protector);
        return list == null ? Collections.EMPTY_LIST : list;
    }
}
