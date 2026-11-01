package p067l;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ۟ */
/* JADX INFO: compiled from: 44RH */
/* JADX INFO: loaded from: classes3.dex */
public final class C1555 {

    /* JADX INFO: renamed from: ܽ */
    public static int f46401;

    /* JADX INFO: renamed from: ֫ */
    public final AccessibilityNodeInfo f46402;

    /* JADX INFO: renamed from: ۧ */
    public int f46403 = -1;

    /* JADX INFO: renamed from: ᩳ */
    public static String m36403(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT /* 131072 */:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    @Deprecated
    public C1555(Object obj) {
        this.f46402 = (AccessibilityNodeInfo) obj;
    }

    public C1555(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f46402 = accessibilityNodeInfo;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1555 m36397(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C1555(accessibilityNodeInfo);
    }

    /* JADX INFO: renamed from: ܶ */
    public final AccessibilityNodeInfo m36445() {
        return this.f46402;
    }

    /* JADX INFO: renamed from: ܳ */
    public static C1555 m36400(View view) {
        return new C1555(AccessibilityNodeInfo.obtain(view));
    }

    /* JADX INFO: renamed from: ᩸ */
    public static C1555 m36404() {
        return new C1555(AccessibilityNodeInfo.obtain());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1555 m36398(C1555 c1555) {
        return new C1555(AccessibilityNodeInfo.obtain(c1555.f46402));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m36460(View view) {
        this.f46403 = -1;
        this.f46402.setSource(view);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36435(int i, View view) {
        this.f46403 = i;
        this.f46402.setSource(view, i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m36433() {
        return this.f46402.getChildCount();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36412(View view) {
        this.f46402.addChild(view);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36410(int i, View view) {
        this.f46402.addChild(view, i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final int m36407() {
        return this.f46402.getActions();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36408(int i) {
        this.f46402.addAction(i);
    }

    /* JADX INFO: renamed from: ܽ */
    private ArrayList m36401(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f46402;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36416(C1529 c1529) {
        this.f46402.addAction((AccessibilityNodeInfo.AccessibilityAction) c1529.f44386);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36440(C1529 c1529) {
        this.f46402.removeAction((AccessibilityNodeInfo.AccessibilityAction) c1529.f44386);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36409(int i, Bundle bundle) {
        this.f46402.performAction(i, bundle);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m36449(int i) {
        this.f46402.setMovementGranularities(i);
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m36454() {
        return this.f46402.getMovementGranularities();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m36451(View view) {
        this.f46402.setParent(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void m36411(Rect rect) {
        this.f46402.getBoundsInParent(rect);
    }

    @Deprecated
    /* JADX INFO: renamed from: ܽ */
    public final void m36450(Rect rect) {
        this.f46402.setBoundsInParent(rect);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36436(Rect rect) {
        this.f46402.getBoundsInScreen(rect);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m36459(Rect rect) {
        this.f46402.setBoundsInScreen(rect);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36441(boolean z) {
        this.f46402.setCheckable(z);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m36467() {
        return this.f46402.isChecked();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m36453(boolean z) {
        this.f46402.setChecked(z);
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m36447() {
        return this.f46402.isFocusable();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m36470(boolean z) {
        this.f46402.setFocusable(z);
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m36422() {
        return this.f46402.isFocused();
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m36426(boolean z) {
        this.f46402.setFocused(z);
    }

    /* JADX INFO: renamed from: ֨ */
    public final boolean m36406() {
        return this.f46402.isVisibleToUser();
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m36463(boolean z) {
        this.f46402.setVisibleToUser(z);
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m36427() {
        return this.f46402.isAccessibilityFocused();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36420(boolean z) {
        this.f46402.setAccessibilityFocused(z);
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m36405() {
        return this.f46402.isSelected();
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m36421(boolean z) {
        this.f46402.setSelected(z);
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m36432() {
        return this.f46402.isClickable();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m36462(boolean z) {
        this.f46402.setClickable(z);
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m36424() {
        return this.f46402.isLongClickable();
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m36431(boolean z) {
        this.f46402.setLongClickable(z);
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m36430() {
        return this.f46402.isEnabled();
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m36444(boolean z) {
        this.f46402.setEnabled(z);
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m36464() {
        return this.f46402.isPassword();
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m36465() {
        return this.f46402.isScrollable();
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m36446(boolean z) {
        this.f46402.setScrollable(z);
    }

    /* JADX INFO: renamed from: ܳ */
    public final CharSequence m36442() {
        return this.f46402.getPackageName();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m36461(CharSequence charSequence) {
        this.f46402.setPackageName(charSequence);
    }

    /* JADX INFO: renamed from: ܽ */
    public final CharSequence m36448() {
        return this.f46402.getClassName();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36414(CharSequence charSequence) {
        this.f46402.setClassName(charSequence);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m36469(CharSequence charSequence) {
        this.f46402.setText(charSequence);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36413(View view, CharSequence charSequence) {
        int iKeyAt;
        if (Build.VERSION.SDK_INT < 26) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f46402;
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(bin.p000mt.plus.R.id.MT_Protector);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < sparseArray.size(); i++) {
                    if (((WeakReference) sparseArray.valueAt(i)).get() == null) {
                        arrayList.add(Integer.valueOf(i));
                    }
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    sparseArray.remove(((Integer) arrayList.get(i2)).intValue());
                }
            }
            ClickableSpan[] clickableSpanArr = charSequence instanceof Spanned ? (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class) : null;
            if (clickableSpanArr == null || clickableSpanArr.length <= 0) {
                return;
            }
            accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", bin.p000mt.plus.R.id.MT_Protector);
            SparseArray sparseArray2 = (SparseArray) view.getTag(bin.p000mt.plus.R.id.MT_Protector);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                view.setTag(bin.p000mt.plus.R.id.MT_Protector, sparseArray2);
            }
            for (int i3 = 0; i3 < clickableSpanArr.length; i3++) {
                ClickableSpan clickableSpan = clickableSpanArr[i3];
                int i4 = 0;
                while (true) {
                    if (i4 < sparseArray2.size()) {
                        if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i4)).get())) {
                            iKeyAt = sparseArray2.keyAt(i4);
                            break;
                        }
                        i4++;
                    } else {
                        iKeyAt = f46401;
                        f46401 = iKeyAt + 1;
                        break;
                    }
                }
                sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArr[i3]));
                ClickableSpan clickableSpan2 = clickableSpanArr[i3];
                Spanned spanned = (Spanned) charSequence;
                m36401("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                m36401("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                m36401("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                m36401("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
            }
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final CharSequence m36468() {
        boolean zIsEmpty = m36401("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f46402;
        if (!zIsEmpty) {
            ArrayList arrayListM36401 = m36401("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            ArrayList arrayListM36402 = m36401("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList arrayListM36403 = m36401("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList arrayListM36404 = m36401("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
            for (int i = 0; i < arrayListM36401.size(); i++) {
                spannableString.setSpan(new C1354(((Integer) arrayListM36404.get(i)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) arrayListM36401.get(i)).intValue(), ((Integer) arrayListM36402.get(i)).intValue(), ((Integer) arrayListM36403.get(i)).intValue());
            }
            return spannableString;
        }
        return accessibilityNodeInfo.getText();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final CharSequence m36458() {
        return this.f46402.getContentDescription();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36438(CharSequence charSequence) {
        this.f46402.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m36443(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f46402;
        if (i >= 30) {
            C1214.m22104(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36417(C1660 c1660) {
        this.f46402.setCollectionInfo(c1660 == null ? null : (AccessibilityNodeInfo.CollectionInfo) c1660.f53858);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36419(C1730 c1730) {
        this.f46402.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) c1730.f57859);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36418(C1695 c1695) {
        this.f46402.setRangeInfo((AccessibilityNodeInfo.RangeInfo) c1695.f55891);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36415(String str) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f46402;
        if (i >= 26) {
            accessibilityNodeInfo.setHintText(str);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m36452(CharSequence charSequence) {
        this.f46402.setError(charSequence);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36437(View view) {
        this.f46402.setLabelFor(view);
    }

    /* JADX INFO: renamed from: ۠ */
    public final void m36428() {
        this.f46402.setCanOpenPopup(true);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m36399(int i, boolean z) {
        Bundle extras = this.f46402.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private boolean m36402(int i) {
        Bundle extras = this.f46402.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36434(int i) {
        this.f46402.setMaxTextLength(i);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m36455(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f46402.setTraversalAfter(view);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m36457(boolean z) {
        this.f46402.setDismissable(z);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m36456(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f46402;
        if (i >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m36429(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f46402.setScreenReaderFocusable(z);
        } else {
            m36399(1, z);
        }
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m36425() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f46402.isShowingHintText();
        }
        return m36402(4);
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m36423(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f46402.setShowingHintText(z);
        } else {
            m36399(4, z);
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m36466(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f46402.setHeading(z);
        } else {
            m36399(2, z);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36439(String str) {
        this.f46402.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", str);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f46402;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1555)) {
            return false;
        }
        C1555 c1555 = (C1555) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = c1555.f46402;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f46402;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f46403 == c1555.f46403;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    public final String toString() {
        CharSequence charSequence;
        CharSequence charSequence2;
        String string;
        CharSequence charSequence3;
        boolean zM36402;
        boolean zM36403;
        ?? arrayList;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m36411(rect);
        sb.append("; boundsInParent: " + rect);
        m36436(rect);
        sb.append("; boundsInScreen: " + rect);
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f46402;
        if (i >= 34) {
            C1380.m29142(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(m36468());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        if (i >= 30) {
            charSequence = C1214.m22102(accessibilityNodeInfo);
        } else {
            charSequence = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        }
        sb.append(charSequence);
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; tooltipText: ");
        if (i >= 28) {
            charSequence2 = accessibilityNodeInfo.getTooltipText();
        } else {
            charSequence2 = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        sb.append(charSequence2);
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        if (i >= 33) {
            string = C0925.m7898(accessibilityNodeInfo);
        } else {
            string = accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb.append(string);
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        sb.append(accessibilityNodeInfo.isChecked());
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(i >= 23 ? accessibilityNodeInfo.isContextClickable() : false);
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; containerTitle: ");
        if (i >= 34) {
            charSequence3 = C1380.m29140(accessibilityNodeInfo);
        } else {
            charSequence3 = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        }
        sb.append(charSequence3);
        sb.append("; granularScrollingSupported: ");
        sb.append(m36402(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(i >= 24 ? accessibilityNodeInfo.isImportantForAccessibility() : true);
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        if (i >= 33) {
            zM36402 = C0925.m7900(accessibilityNodeInfo);
        } else {
            zM36402 = m36402(8388608);
        }
        sb.append(zM36402);
        sb.append("; accessibilityDataSensitive: ");
        if (i >= 34) {
            zM36403 = C1380.m29150(accessibilityNodeInfo);
        } else {
            zM36403 = m36402(64);
        }
        sb.append(zM36403);
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (actionList != null) {
            arrayList = new ArrayList();
            int size = actionList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(new C1529(actionList.get(i2), 0, null, null, null));
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C1529 c1529 = (C1529) arrayList.get(i3);
            String strM36403 = m36403(c1529.m35322());
            if (strM36403.equals("ACTION_UNKNOWN") && c1529.m35325() != null) {
                strM36403 = c1529.m35325().toString();
            }
            sb.append(strM36403);
            if (i3 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
