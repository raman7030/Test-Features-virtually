package p067l;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.ܰܰ */
/* JADX INFO: compiled from: 44RH */
/* JADX INFO: loaded from: classes3.dex */
public final class C1529 {

    /* JADX INFO: renamed from: ۖ */
    public static final C1529 f44375;

    /* JADX INFO: renamed from: ۘ */
    public static final C1529 f44376;

    /* JADX INFO: renamed from: ۜ */
    public static final C1529 f44377;

    /* JADX INFO: renamed from: ۡ */
    public static final C1529 f44378;

    /* JADX INFO: renamed from: ܳ */
    public static final C1529 f44380;

    /* JADX INFO: renamed from: ܺ */
    public static final C1529 f44381;

    /* JADX INFO: renamed from: ᩴ */
    public static final C1529 f44383;

    /* JADX INFO: renamed from: ᩷ */
    public static final C1529 f44384;

    /* JADX INFO: renamed from: ᩻ */
    public static final C1529 f44385;

    /* JADX INFO: renamed from: ֫ */
    public final Object f44386;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC1100 f44387;

    /* JADX INFO: renamed from: ܽ */
    public final int f44388;

    /* JADX INFO: renamed from: ᩳ */
    public final Class f44389;

    /* JADX INFO: renamed from: ۢ */
    public static final C1529 f44379 = new C1529(1, (String) null);

    /* JADX INFO: renamed from: ܿ */
    public static final C1529 f44382 = new C1529(2, (String) null);

    static {
        new C1529(4, (String) null);
        new C1529(8, (String) null);
        f44380 = new C1529(16, (String) null);
        new C1529(32, (String) null);
        new C1529(64, (String) null);
        new C1529(128, (String) null);
        new C1529(C1275.class, 256);
        new C1529(C1275.class, 512);
        new C1529(C1625.class, 1024);
        new C1529(C1625.class, 2048);
        f44375 = new C1529(4096, (String) null);
        f44378 = new C1529(8192, (String) null);
        new C1529(16384, (String) null);
        new C1529(32768, (String) null);
        new C1529(65536, (String) null);
        new C1529(C1800.class, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        f44384 = new C1529(262144, (String) null);
        f44385 = new C1529(524288, (String) null);
        f44377 = new C1529(1048576, (String) null);
        new C1529(C0855.class, 2097152);
        int i = Build.VERSION.SDK_INT;
        new C1529(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C1529(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, C1030.class);
        f44376 = new C1529(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
        new C1529(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
        f44381 = new C1529(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
        new C1529(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
        new C1529(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new C1529(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new C1529(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new C1529(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new C1529(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
        f44383 = new C1529(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, C1765.class);
        new C1529(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, C0960.class);
        new C1529(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new C1529(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new C1529(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new C1529(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new C1529(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new C1529(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new C1529(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new C1529(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new C1529(i >= 34 ? C1380.m29139() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public C1529(int i, String str) {
        this(null, i, str, null, null);
    }

    public C1529(int i, CharSequence charSequence, InterfaceC1100 interfaceC1100) {
        this(null, i, charSequence, interfaceC1100, null);
    }

    public C1529(Class cls, int i) {
        this(null, i, null, null, cls);
    }

    public C1529(Object obj, int i, CharSequence charSequence, InterfaceC1100 interfaceC1100, Class cls) {
        this.f44388 = i;
        this.f44387 = interfaceC1100;
        if (obj == null) {
            this.f44386 = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
        } else {
            this.f44386 = obj;
        }
        this.f44389 = cls;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m35322() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f44386).getId();
    }

    /* JADX INFO: renamed from: ۧ */
    public final CharSequence m35325() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f44386).getLabel();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35324(View view) {
        InterfaceC1100 interfaceC1100 = this.f44387;
        if (interfaceC1100 == null) {
            return false;
        }
        Class cls = this.f44389;
        AbstractC1310 abstractC1310 = null;
        if (cls != null) {
            try {
                AbstractC1310 abstractC1311 = (AbstractC1310) cls.getDeclaredConstructor(null).newInstance(null);
                try {
                    abstractC1311.getClass();
                } catch (Exception unused) {
                }
                abstractC1310 = abstractC1311;
            } catch (Exception unused2) {
            }
        }
        return interfaceC1100.perform(view, abstractC1310);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C1529 m35323(CharSequence charSequence, InterfaceC1100 interfaceC1100) {
        return new C1529(null, this.f44388, charSequence, interfaceC1100, this.f44389);
    }

    public final int hashCode() {
        Object obj = this.f44386;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1529)) {
            return false;
        }
        Object obj2 = ((C1529) obj).f44386;
        Object obj3 = this.f44386;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM36403 = C1555.m36403(this.f44388);
        if (strM36403.equals("ACTION_UNKNOWN") && m35325() != null) {
            strM36403 = m35325().toString();
        }
        sb.append(strM36403);
        return sb.toString();
    }
}
