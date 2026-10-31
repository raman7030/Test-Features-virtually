package l;

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
public abstract class AbstractC18004 extends C16445 {
    public static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    public static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final InterfaceC17298 NODE_ADAPTER = new C1776();
    public static final InterfaceC14475 SPARSE_VALUES_ADAPTER = new C10949();
    public final View mHost;
    public final AccessibilityManager mManager;
    public C16592 mNodeProvider;
    public final Rect mTempScreenRect = new Rect();
    public final Rect mTempParentRect = new Rect();
    public final Rect mTempVisibleRect = new Rect();
    public final int[] mTempGlobalRect = new int[2];
    public int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    public int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    public int mHoveredVirtualViewId = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m42057(int i) {
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

    public void onPopulateNodeForHost(C14369 c14369) {
    }

    public abstract void onPopulateNodeForVirtualView(int i, C14369 c14369);

    public void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
    }

    public AbstractC18004(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        int i = C17648.f53953;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // l.C16445
    public C20721 getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new C16592(this);
        }
        return this.mNodeProvider;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.mManager.isEnabled() && this.mManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
                m42053(virtualViewAt);
                if (virtualViewAt != Integer.MIN_VALUE) {
                    return true;
                }
            } else {
                if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
                    return false;
                }
                m42053(Integer.MIN_VALUE);
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
                                int iM42057 = m42057(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i < repeatCount && m42052(iM42057, (Rect) null)) {
                                    i++;
                                    z = true;
                                }
                                return z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                m42044();
                                return true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    m42044();
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return m42052(2, (Rect) null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return m42052(1, (Rect) null);
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
            m42052(i, rect);
        }
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42043(int i, Rect rect) {
        obtainAccessibilityNodeInfo(i).m34278(rect);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m42052(int i, Rect rect) {
        C14369 c14369M18270;
        C13309 c13309M42054 = m42054();
        int i2 = this.mKeyboardFocusedVirtualViewId;
        Object obj = null;
        C14369 c14369 = i2 == Integer.MIN_VALUE ? null : (C14369) c13309M42054.m32284(i2, (Integer) null);
        if (i == 1 || i == 2) {
            View view = this.mHost;
            int i3 = C17648.f53953;
            boolean z = view.getLayoutDirection() == 1;
            InterfaceC14475 interfaceC14475 = SPARSE_VALUES_ADAPTER;
            InterfaceC17298 interfaceC17298 = NODE_ADAPTER;
            ((C10949) interfaceC14475).getClass();
            int iM32287 = c13309M42054.m32287();
            ArrayList arrayList = new ArrayList(iM32287);
            for (int i4 = 0; i4 < iM32287; i4++) {
                arrayList.add((C14369) c13309M42054.m32290(i4));
            }
            Collections.sort(arrayList, new C23648(z, interfaceC17298));
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size = arrayList.size();
                int iLastIndexOf = (c14369 == null ? -1 : arrayList.lastIndexOf(c14369)) + 1;
                if (iLastIndexOf < size) {
                    obj = arrayList.get(iLastIndexOf);
                }
            } else {
                int size2 = arrayList.size();
                if (c14369 != null) {
                    size2 = arrayList.indexOf(c14369);
                }
                int i5 = size2 - 1;
                if (i5 >= 0) {
                    obj = arrayList.get(i5);
                }
            }
            c14369M18270 = (C14369) obj;
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i6 = this.mKeyboardFocusedVirtualViewId;
            if (i6 != Integer.MIN_VALUE) {
                m42043(i6, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m42041(this.mHost, i, rect2);
            }
            c14369M18270 = C6715.m18270(c13309M42054, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, c14369, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return requestKeyboardFocusForVirtualView(c14369M18270 != null ? c13309M42054.m32282(c13309M42054.m32283(c14369M18270)) : Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C13309 m42054() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        C13309 c13309 = new C13309();
        for (int i = 0; i < arrayList.size(); i++) {
            c13309.m32289(((Integer) arrayList.get(i)).intValue(), m42055(((Integer) arrayList.get(i)).intValue()));
        }
        return c13309;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Rect m42041(View view, int i, Rect rect) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m42044() {
        int i = this.mKeyboardFocusedVirtualViewId;
        return i != Integer.MIN_VALUE && onPerformActionForVirtualView(i, 16, null);
    }

    public final boolean sendEventForVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, m42042(i, i2));
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
        AccessibilityEvent accessibilityEventM42042 = m42042(i, 2048);
        accessibilityEventM42042.setContentChangeTypes(i2);
        parent.requestSendAccessibilityEvent(this.mHost, accessibilityEventM42042);
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m42053(int i) {
        int i2 = this.mHoveredVirtualViewId;
        if (i2 == i) {
            return;
        }
        this.mHoveredVirtualViewId = i;
        sendEventForVirtualView(i, 128);
        sendEventForVirtualView(i2, 256);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AccessibilityEvent m42042(int i, int i2) {
        if (i == -1) {
            return m42049(i2);
        }
        return m42050(i, i2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private AccessibilityEvent m42049(int i) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
        this.mHost.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    @Override // l.C16445
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private AccessibilityEvent m42050(int i, int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        C14369 c14369ObtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i);
        accessibilityEventObtain.getText().add(c14369ObtainAccessibilityNodeInfo.m34335());
        accessibilityEventObtain.setContentDescription(c14369ObtainAccessibilityNodeInfo.m34325());
        accessibilityEventObtain.setScrollable(c14369ObtainAccessibilityNodeInfo.m34332());
        accessibilityEventObtain.setPassword(c14369ObtainAccessibilityNodeInfo.m34331());
        accessibilityEventObtain.setEnabled(c14369ObtainAccessibilityNodeInfo.m34297());
        accessibilityEventObtain.setChecked(c14369ObtainAccessibilityNodeInfo.m34334());
        onPopulateEventForVirtualView(i, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(c14369ObtainAccessibilityNodeInfo.m34315());
        accessibilityEventObtain.setSource(this.mHost, i);
        accessibilityEventObtain.setPackageName(this.mHost.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    public C14369 obtainAccessibilityNodeInfo(int i) {
        if (i == -1) {
            return m42051();
        }
        return m42055(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C14369 m42051() {
        C14369 c14369M34267 = C14369.m34267(this.mHost);
        View view = this.mHost;
        int i = C17648.f53953;
        view.onInitializeAccessibilityNodeInfo(c14369M34267.m34312());
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (c14369M34267.m34300() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c14369M34267.m34277(((Integer) arrayList.get(i2)).intValue(), this.mHost);
        }
        return c14369M34267;
    }

    @Override // l.C16445
    public void onInitializeAccessibilityNodeInfo(View view, C14369 c14369) {
        super.onInitializeAccessibilityNodeInfo(view, c14369);
        onPopulateNodeForHost(c14369);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C14369 m42055(int i) {
        C14369 c14369M34271 = C14369.m34271();
        c14369M34271.m34311(true);
        c14369M34271.m34337(true);
        c14369M34271.m34281("android.view.View");
        Rect rect = INVALID_PARENT_BOUNDS;
        c14369M34271.m34317(rect);
        c14369M34271.m34326(rect);
        c14369M34271.m34318(this.mHost);
        onPopulateNodeForVirtualView(i, c14369M34271);
        if (c14369M34271.m34335() == null && c14369M34271.m34325() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        c14369M34271.m34278(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iM34274 = c14369M34271.m34274();
        if ((iM34274 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iM34274 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        c14369M34271.m34328(this.mHost.getContext().getPackageName());
        c14369M34271.m34302(i, this.mHost);
        if (this.mAccessibilityFocusedVirtualViewId == i) {
            c14369M34271.m34287(true);
            c14369M34271.m34275(128);
        } else {
            c14369M34271.m34287(false);
            c14369M34271.m34275(64);
        }
        boolean z = this.mKeyboardFocusedVirtualViewId == i;
        if (z) {
            c14369M34271.m34275(2);
        } else if (c14369M34271.m34314()) {
            c14369M34271.m34275(1);
        }
        c14369M34271.m34293(z);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        c14369M34271.m34303(this.mTempScreenRect);
        if (this.mTempScreenRect.equals(rect)) {
            c14369M34271.m34278(this.mTempScreenRect);
            this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                c14369M34271.m34326(this.mTempScreenRect);
                if (m42048(this.mTempScreenRect)) {
                    c14369M34271.m34330(true);
                }
            }
        }
        return c14369M34271;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        if (i == -1) {
            return m42047(i2, bundle);
        }
        return m42046(i, i2, bundle);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m42047(int i, Bundle bundle) {
        View view = this.mHost;
        int i2 = C17648.f53953;
        return view.performAccessibilityAction(i, bundle);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m42046(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return requestKeyboardFocusForVirtualView(i);
        }
        if (i2 == 2) {
            return clearKeyboardFocusForVirtualView(i);
        }
        if (i2 == 64) {
            return m42056(i);
        }
        if (i2 == 128) {
            return m42045(i);
        }
        return onPerformActionForVirtualView(i, i2, bundle);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m42048(Rect rect) {
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

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m42056(int i) {
        int i2;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i2 = this.mAccessibilityFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m42045(i2);
        }
        this.mAccessibilityFocusedVirtualViewId = i;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 32768);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m42045(int i) {
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
