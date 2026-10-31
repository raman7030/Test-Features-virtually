package l;

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
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 44RH */
/* JADX INFO: loaded from: classes3.dex */
public final class C14369 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int f43310;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AccessibilityNodeInfo f43311;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f43312 = -1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m34270(int i) {
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
    public C14369(Object obj) {
        this.f43311 = (AccessibilityNodeInfo) obj;
    }

    public C14369(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f43311 = accessibilityNodeInfo;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14369 m34264(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C14369(accessibilityNodeInfo);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AccessibilityNodeInfo m34312() {
        return this.f43311;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C14369 m34267(View view) {
        return new C14369(AccessibilityNodeInfo.obtain(view));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C14369 m34271() {
        return new C14369(AccessibilityNodeInfo.obtain());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14369 m34265(C14369 c14369) {
        return new C14369(AccessibilityNodeInfo.obtain(c14369.f43311));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m34327(View view) {
        this.f43312 = -1;
        this.f43311.setSource(view);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34302(int i, View view) {
        this.f43312 = i;
        this.f43311.setSource(view, i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m34300() {
        return this.f43311.getChildCount();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34279(View view) {
        this.f43311.addChild(view);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34277(int i, View view) {
        this.f43311.addChild(view, i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m34274() {
        return this.f43311.getActions();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34275(int i) {
        this.f43311.addAction(i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private ArrayList m34268(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f43311;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34283(C13847 c13847) {
        this.f43311.addAction((AccessibilityNodeInfo.AccessibilityAction) c13847.f41307);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34307(C13847 c13847) {
        this.f43311.removeAction((AccessibilityNodeInfo.AccessibilityAction) c13847.f41307);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34276(int i, Bundle bundle) {
        this.f43311.performAction(i, bundle);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m34316(int i) {
        this.f43311.setMovementGranularities(i);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m34321() {
        return this.f43311.getMovementGranularities();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m34318(View view) {
        this.f43311.setParent(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34278(Rect rect) {
        this.f43311.getBoundsInParent(rect);
    }

    @Deprecated
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m34317(Rect rect) {
        this.f43311.setBoundsInParent(rect);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34303(Rect rect) {
        this.f43311.getBoundsInScreen(rect);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m34326(Rect rect) {
        this.f43311.setBoundsInScreen(rect);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34308(boolean z) {
        this.f43311.setCheckable(z);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m34334() {
        return this.f43311.isChecked();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m34320(boolean z) {
        this.f43311.setChecked(z);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m34314() {
        return this.f43311.isFocusable();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m34337(boolean z) {
        this.f43311.setFocusable(z);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m34289() {
        return this.f43311.isFocused();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m34293(boolean z) {
        this.f43311.setFocused(z);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m34273() {
        return this.f43311.isVisibleToUser();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m34330(boolean z) {
        this.f43311.setVisibleToUser(z);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m34294() {
        return this.f43311.isAccessibilityFocused();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34287(boolean z) {
        this.f43311.setAccessibilityFocused(z);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m34272() {
        return this.f43311.isSelected();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m34288(boolean z) {
        this.f43311.setSelected(z);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m34299() {
        return this.f43311.isClickable();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m34329(boolean z) {
        this.f43311.setClickable(z);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m34291() {
        return this.f43311.isLongClickable();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m34298(boolean z) {
        this.f43311.setLongClickable(z);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m34297() {
        return this.f43311.isEnabled();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m34311(boolean z) {
        this.f43311.setEnabled(z);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m34331() {
        return this.f43311.isPassword();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m34332() {
        return this.f43311.isScrollable();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m34313(boolean z) {
        this.f43311.setScrollable(z);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final CharSequence m34309() {
        return this.f43311.getPackageName();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m34328(CharSequence charSequence) {
        this.f43311.setPackageName(charSequence);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence m34315() {
        return this.f43311.getClassName();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34281(CharSequence charSequence) {
        this.f43311.setClassName(charSequence);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m34336(CharSequence charSequence) {
        this.f43311.setText(charSequence);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34280(View view, CharSequence charSequence) {
        int iKeyAt;
        if (Build.VERSION.SDK_INT < 26) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f43311;
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(bin.mt.plus.R.id.MT_Protector);
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
            accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", bin.mt.plus.R.id.MT_Protector);
            SparseArray sparseArray2 = (SparseArray) view.getTag(bin.mt.plus.R.id.MT_Protector);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                view.setTag(bin.mt.plus.R.id.MT_Protector, sparseArray2);
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
                        iKeyAt = f43310;
                        f43310 = iKeyAt + 1;
                        break;
                    }
                }
                sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArr[i3]));
                ClickableSpan clickableSpan2 = clickableSpanArr[i3];
                Spanned spanned = (Spanned) charSequence;
                m34268("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                m34268("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                m34268("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                m34268("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
            }
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final CharSequence m34335() {
        boolean zIsEmpty = m34268("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f43311;
        if (!zIsEmpty) {
            ArrayList arrayListM34268 = m34268("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            ArrayList arrayListM34269 = m34268("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList arrayListM342610 = m34268("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList arrayListM342611 = m34268("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
            for (int i = 0; i < arrayListM34268.size(); i++) {
                spannableString.setSpan(new C10321(((Integer) arrayListM342611.get(i)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) arrayListM34268.get(i)).intValue(), ((Integer) arrayListM34269.get(i)).intValue(), ((Integer) arrayListM342610.get(i)).intValue());
            }
            return spannableString;
        }
        return accessibilityNodeInfo.getText();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CharSequence m34325() {
        return this.f43311.getContentDescription();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34305(CharSequence charSequence) {
        this.f43311.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m34310(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f43311;
        if (i >= 30) {
            C7498.m20128(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34284(C16486 c16486) {
        this.f43311.setCollectionInfo(c16486 == null ? null : (AccessibilityNodeInfo.CollectionInfo) c16486.f50681);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34286(C17898 c17898) {
        this.f43311.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) c17898.f54662);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34285(C17192 c17192) {
        this.f43311.setRangeInfo((AccessibilityNodeInfo.RangeInfo) c17192.f52710);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34282(String str) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f43311;
        if (i >= 26) {
            accessibilityNodeInfo.setHintText(str);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m34319(CharSequence charSequence) {
        this.f43311.setError(charSequence);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34304(View view) {
        this.f43311.setLabelFor(view);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m34295() {
        this.f43311.setCanOpenPopup(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m34266(int i, boolean z) {
        Bundle extras = this.f43311.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m34269(int i) {
        Bundle extras = this.f43311.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34301(int i) {
        this.f43311.setMaxTextLength(i);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m34322(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f43311.setTraversalAfter(view);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m34324(boolean z) {
        this.f43311.setDismissable(z);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m34323(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f43311;
        if (i >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m34296(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f43311.setScreenReaderFocusable(z);
        } else {
            m34266(1, z);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m34292() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f43311.isShowingHintText();
        }
        return m34269(4);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m34290(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f43311.setShowingHintText(z);
        } else {
            m34266(4, z);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34333(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f43311.setHeading(z);
        } else {
            m34266(2, z);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34306(String str) {
        this.f43311.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", str);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f43311;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C14369)) {
            return false;
        }
        C14369 c14369 = (C14369) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = c14369.f43311;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f43311;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f43312 == c14369.f43312;
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
        boolean zM34269;
        boolean zM342610;
        ?? arrayList;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m34278(rect);
        sb.append("; boundsInParent: " + rect);
        m34303(rect);
        sb.append("; boundsInScreen: " + rect);
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f43311;
        if (i >= 34) {
            C10843.m27097(accessibilityNodeInfo, rect);
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
        sb.append(m34335());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        if (i >= 30) {
            charSequence = C7498.m20126(accessibilityNodeInfo);
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
            string = C1670.m5668(accessibilityNodeInfo);
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
            charSequence3 = C10843.m27095(accessibilityNodeInfo);
        } else {
            charSequence3 = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        }
        sb.append(charSequence3);
        sb.append("; granularScrollingSupported: ");
        sb.append(m34269(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(i >= 24 ? accessibilityNodeInfo.isImportantForAccessibility() : true);
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        if (i >= 33) {
            zM34269 = C1670.m5670(accessibilityNodeInfo);
        } else {
            zM34269 = m34269(8388608);
        }
        sb.append(zM34269);
        sb.append("; accessibilityDataSensitive: ");
        if (i >= 34) {
            zM342610 = C10843.m27105(accessibilityNodeInfo);
        } else {
            zM342610 = m34269(64);
        }
        sb.append(zM342610);
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (actionList != null) {
            arrayList = new ArrayList();
            int size = actionList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(new C13847(actionList.get(i2), 0, null, null, null));
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C13847 c13847 = (C13847) arrayList.get(i3);
            String strM34270 = m34270(c13847.m33204());
            if (strM34270.equals("ACTION_UNKNOWN") && c13847.m33207() != null) {
                strM34270 = c13847.m33207().toString();
            }
            sb.append(strM34270);
            if (i3 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
