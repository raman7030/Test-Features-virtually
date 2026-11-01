package p067l;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 83VO */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19479 extends C1658 {
    public static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    public static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final InterfaceC18808 NODE_ADAPTER = new C4056();
    public static final InterfaceC16125 SPARSE_VALUES_ADAPTER = new C12774();
    public final View mHost;
    public final AccessibilityManager mManager;
    public C18137 mNodeProvider;
    public final Rect mTempScreenRect = new Rect();
    public final Rect mTempParentRect = new Rect();
    public final Rect mTempVisibleRect = new Rect();
    public final int[] mTempGlobalRect = new int[2];
    public int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    public int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    public int mHoveredVirtualViewId = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ᩳ */
    public static int m44307(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    public abstract int getVirtualViewAt(float f, float f2);

    public abstract void getVisibleVirtualViews(List list);

    public abstract boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle);

    public void onPopulateEventForHost(AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(C1555 c1555) {
    }

    public abstract void onPopulateNodeForVirtualView(int i, C1555 c1555);

    public void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
    }

    public AbstractC19479(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        int i = C1717.f57146;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // p067l.C1658
    public C1870 getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new C18137(this);
        }
        return this.mNodeProvider;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.mManager.isEnabled() && this.mManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
                m44303(virtualViewAt);
                if (virtualViewAt != Integer.MIN_VALUE) {
                    return true;
                }
            } else {
                if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
                    return false;
                }
                m44303(Integer.MIN_VALUE);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int iM44307 = m44307(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i < repeatCount && m44302(iM44307, (Rect) null)) {
                                    i++;
                                    z = true;
                                }
                                return z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                m44294();
                                return true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    m44294();
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return m44302(2, (Rect) null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return m44302(1, (Rect) null);
                }
            }
        }
        return false;
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int i2 = this.mKeyboardFocusedVirtualViewId;
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (z) {
            m44302(i, rect);
        }
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m44293(int i, Rect rect) {
        obtainAccessibilityNodeInfo(i).m36411(rect);
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m44302(int i, Rect rect) {
        C1555 c1555M20218;
        C1502 c1502M44304 = m44304();
        int i2 = this.mKeyboardFocusedVirtualViewId;
        Object obj = null;
        C1555 c1555 = i2 == Integer.MIN_VALUE ? null : (C1555) c1502M44304.m34385(i2, (Integer) null);
        if (i == 1 || i == 2) {
            View view = this.mHost;
            int i3 = C1717.f57146;
            boolean z = view.getLayoutDirection() == 1;
            InterfaceC16125 interfaceC16125 = SPARSE_VALUES_ADAPTER;
            InterfaceC18808 interfaceC18808 = NODE_ADAPTER;
            ((C12774) interfaceC16125).getClass();
            int iM34388 = c1502M44304.m34388();
            ArrayList arrayList = new ArrayList(iM34388);
            for (int i4 = 0; i4 < iM34388; i4++) {
                arrayList.add((C1555) c1502M44304.m34391(i4));
            }
            Collections.sort(arrayList, new C24843(z, interfaceC18808));
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size = arrayList.size();
                int iLastIndexOf = (c1555 == null ? -1 : arrayList.lastIndexOf(c1555)) + 1;
                if (iLastIndexOf < size) {
                    obj = arrayList.get(iLastIndexOf);
                }
            } else {
                int size2 = arrayList.size();
                if (c1555 != null) {
                    size2 = arrayList.indexOf(c1555);
                }
                int i5 = size2 - 1;
                if (i5 >= 0) {
                    obj = arrayList.get(i5);
                }
            }
            c1555M20218 = (C1555) obj;
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i6 = this.mKeyboardFocusedVirtualViewId;
            if (i6 != Integer.MIN_VALUE) {
                m44293(i6, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m44291(this.mHost, i, rect2);
            }
            c1555M20218 = C8750.m20218(c1502M44304, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, c1555, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return requestKeyboardFocusForVirtualView(c1555M20218 != null ? c1502M44304.m34383(c1502M44304.m34384(c1555M20218)) : Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: ܽ */
    private C1502 m44304() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        C1502 c1502 = new C1502();
        for (int i = 0; i < arrayList.size(); i++) {
            c1502.m34390(((Integer) arrayList.get(i)).intValue(), m44305(((Integer) arrayList.get(i)).intValue()));
        }
        return c1502;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Rect m44291(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i == 130) {
            rect.set(0, -1, width, -1);
            return rect;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m44294() {
        int i = this.mKeyboardFocusedVirtualViewId;
        return i != Integer.MIN_VALUE && onPerformActionForVirtualView(i, 16, null);
    }

    public final boolean sendEventForVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, m44292(i, i2));
    }

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i) {
        invalidateVirtualView(i, 0);
    }

    public final void invalidateVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventM44292 = m44292(i, 2048);
        accessibilityEventM44292.setContentChangeTypes(i2);
        parent.requestSendAccessibilityEvent(this.mHost, accessibilityEventM44292);
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    /* JADX INFO: renamed from: ܳ */
    private void m44303(int i) {
        int i2 = this.mHoveredVirtualViewId;
        if (i2 == i) {
            return;
        }
        this.mHoveredVirtualViewId = i;
        sendEventForVirtualView(i, 128);
        sendEventForVirtualView(i2, 256);
    }

    /* JADX INFO: renamed from: ֫ */
    private AccessibilityEvent m44292(int i, int i2) {
        if (i == -1) {
            return m44299(i2);
        }
        return m44300(i, i2);
    }

    /* JADX INFO: renamed from: ۧ */
    private AccessibilityEvent m44299(int i) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
        this.mHost.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    @Override // p067l.C1658
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    /* JADX INFO: renamed from: ۧ */
    private AccessibilityEvent m44300(int i, int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        C1555 c1555ObtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i);
        accessibilityEventObtain.getText().add(c1555ObtainAccessibilityNodeInfo.m36468());
        accessibilityEventObtain.setContentDescription(c1555ObtainAccessibilityNodeInfo.m36458());
        accessibilityEventObtain.setScrollable(c1555ObtainAccessibilityNodeInfo.m36465());
        accessibilityEventObtain.setPassword(c1555ObtainAccessibilityNodeInfo.m36464());
        accessibilityEventObtain.setEnabled(c1555ObtainAccessibilityNodeInfo.m36430());
        accessibilityEventObtain.setChecked(c1555ObtainAccessibilityNodeInfo.m36467());
        onPopulateEventForVirtualView(i, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(c1555ObtainAccessibilityNodeInfo.m36448());
        accessibilityEventObtain.setSource(this.mHost, i);
        accessibilityEventObtain.setPackageName(this.mHost.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    public C1555 obtainAccessibilityNodeInfo(int i) {
        if (i == -1) {
            return m44301();
        }
        return m44305(i);
    }

    /* JADX INFO: renamed from: ۧ */
    private C1555 m44301() {
        C1555 c1555M36400 = C1555.m36400(this.mHost);
        View view = this.mHost;
        int i = C1717.f57146;
        view.onInitializeAccessibilityNodeInfo(c1555M36400.m36445());
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (c1555M36400.m36433() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c1555M36400.m36410(((Integer) arrayList.get(i2)).intValue(), this.mHost);
        }
        return c1555M36400;
    }

    @Override // p067l.C1658
    public void onInitializeAccessibilityNodeInfo(View view, C1555 c1555) {
        super.onInitializeAccessibilityNodeInfo(view, c1555);
        onPopulateNodeForHost(c1555);
    }

    /* JADX INFO: renamed from: ܽ */
    private C1555 m44305(int i) {
        C1555 c1555M36404 = C1555.m36404();
        c1555M36404.m36444(true);
        c1555M36404.m36470(true);
        c1555M36404.m36414("android.view.View");
        Rect rect = INVALID_PARENT_BOUNDS;
        c1555M36404.m36450(rect);
        c1555M36404.m36459(rect);
        c1555M36404.m36451(this.mHost);
        onPopulateNodeForVirtualView(i, c1555M36404);
        if (c1555M36404.m36468() == null && c1555M36404.m36458() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        c1555M36404.m36411(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iM36407 = c1555M36404.m36407();
        if ((iM36407 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iM36407 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        c1555M36404.m36461(this.mHost.getContext().getPackageName());
        c1555M36404.m36435(i, this.mHost);
        if (this.mAccessibilityFocusedVirtualViewId == i) {
            c1555M36404.m36420(true);
            c1555M36404.m36408(128);
        } else {
            c1555M36404.m36420(false);
            c1555M36404.m36408(64);
        }
        boolean z = this.mKeyboardFocusedVirtualViewId == i;
        if (z) {
            c1555M36404.m36408(2);
        } else if (c1555M36404.m36447()) {
            c1555M36404.m36408(1);
        }
        c1555M36404.m36426(z);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        c1555M36404.m36436(this.mTempScreenRect);
        if (this.mTempScreenRect.equals(rect)) {
            c1555M36404.m36411(this.mTempScreenRect);
            this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                c1555M36404.m36459(this.mTempScreenRect);
                if (m44298(this.mTempScreenRect)) {
                    c1555M36404.m36463(true);
                }
            }
        }
        return c1555M36404;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        if (i == -1) {
            return m44297(i2, bundle);
        }
        return m44296(i, i2, bundle);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m44297(int i, Bundle bundle) {
        View view = this.mHost;
        int i2 = C1717.f57146;
        return view.performAccessibilityAction(i, bundle);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m44296(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return requestKeyboardFocusForVirtualView(i);
        }
        if (i2 == 2) {
            return clearKeyboardFocusForVirtualView(i);
        }
        if (i2 == 64) {
            return m44306(i);
        }
        if (i2 == 128) {
            return m44295(i);
        }
        return onPerformActionForVirtualView(i, i2, bundle);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m44298(Rect rect) {
        if (rect == null || rect.isEmpty() || this.mHost.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.mHost.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    /* JADX INFO: renamed from: ܿ */
    private boolean m44306(int i) {
        int i2;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i2 = this.mAccessibilityFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m44295(i2);
        }
        this.mAccessibilityFocusedVirtualViewId = i;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 32768);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m44295(int i) {
        if (this.mAccessibilityFocusedVirtualViewId != i) {
            return false;
        }
        this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 65536);
        return true;
    }

    public final boolean requestKeyboardFocusForVirtualView(int i) {
        int i2;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i2 = this.mKeyboardFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = i;
        onVirtualViewKeyboardFocusChanged(i, true);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean clearKeyboardFocusForVirtualView(int i) {
        if (this.mKeyboardFocusedVirtualViewId != i) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i, false);
        sendEventForVirtualView(i, 8);
        return true;
    }
}
