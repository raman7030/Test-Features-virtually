package l;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.ܰܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44RH */
/* JADX INFO: loaded from: classes3.dex */
public final class C13847 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C13847 f41296;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C13847 f41297;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C13847 f41298;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C13847 f41299;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C13847 f41301;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C13847 f41302;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C13847 f41304;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C13847 f41305;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C13847 f41306;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f41307;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5198 f41308;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f41309;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Class f41310;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C13847 f41300 = new C13847(1, (String) null);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C13847 f41303 = new C13847(2, (String) null);

    static {
        new C13847(4, (String) null);
        new C13847(8, (String) null);
        f41301 = new C13847(16, (String) null);
        new C13847(32, (String) null);
        new C13847(64, (String) null);
        new C13847(128, (String) null);
        new C13847(C8726.class, 256);
        new C13847(C8726.class, 512);
        new C13847(C15780.class, 1024);
        new C13847(C15780.class, 2048);
        f41296 = new C13847(4096, (String) null);
        f41299 = new C13847(8192, (String) null);
        new C13847(16384, (String) null);
        new C13847(32768, (String) null);
        new C13847(65536, (String) null);
        new C13847(C19310.class, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        f41305 = new C13847(262144, (String) null);
        f41306 = new C13847(524288, (String) null);
        f41298 = new C13847(1048576, (String) null);
        new C13847(C0258.class, 2097152);
        int i = Build.VERSION.SDK_INT;
        new C13847(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C13847(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, C3787.class);
        f41297 = new C13847(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
        new C13847(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
        f41302 = new C13847(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
        new C13847(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
        new C13847(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new C13847(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new C13847(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new C13847(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new C13847(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
        f41304 = new C13847(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, C18604.class);
        new C13847(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, C2376.class);
        new C13847(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new C13847(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new C13847(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new C13847(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new C13847(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new C13847(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new C13847(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new C13847(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new C13847(i >= 34 ? C10843.m27094() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public C13847(int i, String str) {
        this(null, i, str, null, null);
    }

    public C13847(int i, CharSequence charSequence, InterfaceC5198 interfaceC5198) {
        this(null, i, charSequence, interfaceC5198, null);
    }

    public C13847(Class cls, int i) {
        this(null, i, null, null, cls);
    }

    public C13847(Object obj, int i, CharSequence charSequence, InterfaceC5198 interfaceC5198, Class cls) {
        this.f41309 = i;
        this.f41308 = interfaceC5198;
        if (obj == null) {
            this.f41307 = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
        } else {
            this.f41307 = obj;
        }
        this.f41310 = cls;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m33204() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f41307).getId();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CharSequence m33207() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f41307).getLabel();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33206(View view) {
        InterfaceC5198 interfaceC5198 = this.f41308;
        if (interfaceC5198 == null) {
            return false;
        }
        Class cls = this.f41310;
        AbstractC9432 abstractC9432 = null;
        if (cls != null) {
            try {
                AbstractC9432 abstractC9433 = (AbstractC9432) cls.getDeclaredConstructor(null).newInstance(null);
                try {
                    abstractC9433.getClass();
                } catch (Exception unused) {
                }
                abstractC9432 = abstractC9433;
            } catch (Exception unused2) {
            }
        }
        return interfaceC5198.perform(view, abstractC9432);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13847 m33205(CharSequence charSequence, InterfaceC5198 interfaceC5198) {
        return new C13847(null, this.f41309, charSequence, interfaceC5198, this.f41310);
    }

    public final int hashCode() {
        Object obj = this.f41307;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C13847)) {
            return false;
        }
        Object obj2 = ((C13847) obj).f41307;
        Object obj3 = this.f41307;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM34270 = C14369.m34270(this.f41309);
        if (strM34270.equals("ACTION_UNKNOWN") && m33207() != null) {
            strM34270 = m33207().toString();
        }
        sb.append(strM34270);
        return sb.toString();
    }
}
