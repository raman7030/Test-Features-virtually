package p067l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import bin.p000mt.plus.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ܿ᩺ */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C1717 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f57146 = 0;

    /* JADX INFO: renamed from: ۜ */
    public static WeakHashMap f57147;

    /* JADX INFO: renamed from: ܿ */
    public static Field f57151;

    /* JADX INFO: renamed from: ᩳ */
    public static boolean f57152;

    /* JADX INFO: renamed from: ᩻ */
    public static ThreadLocal f57153;

    /* JADX INFO: renamed from: ۧ */
    public static final int[] f57148 = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};

    /* JADX INFO: renamed from: ܽ */
    public static final C1106 f57150 = new C1106();

    /* JADX INFO: renamed from: ܳ */
    public static final ViewTreeObserverOnGlobalLayoutListenerC1946 f57149 = new ViewTreeObserverOnGlobalLayoutListenerC1946();

    /* JADX INFO: renamed from: ֫ */
    public static void m43553(View view, AbstractC1507 abstractC1507) {
        if (Build.VERSION.SDK_INT >= 30) {
            C1669.m41422(view, abstractC1507);
            return;
        }
        int i = C1997.f77532;
        Object tag = view.getTag(R.id.MT_Protector);
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC1437 = new ViewOnApplyWindowInsetsListenerC1437(view, abstractC1507);
        view.setTag(R.id.MT_Protector, viewOnApplyWindowInsetsListenerC1437);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC1437);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Rect m43542() {
        if (f57153 == null) {
            f57153 = new ThreadLocal();
        }
        Rect rect = (Rect) f57153.get();
        if (rect == null) {
            rect = new Rect();
            f57153.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43548(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1526.m35211(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43555(View view, C1658 c1658) {
        if (c1658 == null && (m43577(view) instanceof C1378)) {
            c1658 = new C1658();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c1658 == null ? null : c1658.getBridge());
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m43541(C14849 c14849) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C1141.m18786(c14849);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43559(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C1141.m18780(viewGroup, i);
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public static boolean m43565(View view) {
        return m43577(view) != null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C1658 m43569(View view) {
        View.AccessibilityDelegate accessibilityDelegateM43577 = m43577(view);
        if (accessibilityDelegateM43577 == null) {
            return null;
        }
        if (accessibilityDelegateM43577 instanceof C1378) {
            return ((C1378) accessibilityDelegateM43577).f35464;
        }
        return new C1658(accessibilityDelegateM43577);
    }

    /* JADX INFO: renamed from: ܽ */
    public static View.AccessibilityDelegate m43577(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C1526.m35210(view);
        }
        if (f57152) {
            return null;
        }
        if (f57151 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f57151 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f57152 = true;
                return null;
            }
        }
        try {
            Object obj = f57151.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f57152 = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m43540(View view, String str, InterfaceC1100 interfaceC1100) {
        int iM35322;
        ArrayList arrayListM43580 = m43580(view);
        int i = 0;
        while (true) {
            if (i >= arrayListM43580.size()) {
                int i2 = -1;
                for (int i3 = 0; i3 < 32 && i2 == -1; i3++) {
                    int i4 = f57148[i3];
                    boolean z = true;
                    for (int i5 = 0; i5 < arrayListM43580.size(); i5++) {
                        z &= ((C1529) arrayListM43580.get(i5)).m35322() != i4;
                    }
                    if (z) {
                        i2 = i4;
                    }
                }
                iM35322 = i2;
                break;
            }
            if (TextUtils.equals(str, ((C1529) arrayListM43580.get(i)).m35325())) {
                iM35322 = ((C1529) arrayListM43580.get(i)).m35322();
                break;
            }
            i++;
        }
        if (iM35322 != -1) {
            C1529 c1529 = new C1529(iM35322, str, interfaceC1100);
            C1658 c1658M43569 = m43569(view);
            if (c1658M43569 == null) {
                c1658M43569 = new C1658();
            }
            m43555(view, c1658M43569);
            m43581(c1529.m35322(), view);
            m43580(view).add(c1529);
            m43546(0, view);
        }
        return iM35322;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43554(View view, C1529 c1529, String str, InterfaceC1100 interfaceC1100) {
        if (interfaceC1100 == null && str == null) {
            m43583(c1529.m35322(), view);
            return;
        }
        C1529 c1529M35323 = c1529.m35323(str, interfaceC1100);
        C1658 c1658M43569 = m43569(view);
        if (c1658M43569 == null) {
            c1658M43569 = new C1658();
        }
        m43555(view, c1658M43569);
        m43581(c1529M35323.m35322(), view);
        m43580(view).add(c1529M35323);
        m43546(0, view);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m43583(int i, View view) {
        m43581(i, view);
        m43546(0, view);
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m43581(int i, View view) {
        ArrayList arrayListM43580 = m43580(view);
        for (int i2 = 0; i2 < arrayListM43580.size(); i2++) {
            if (((C1529) arrayListM43580.get(i2)).m35322() == i) {
                arrayListM43580.remove(i2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static ArrayList m43580(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.MT_Protector);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.MT_Protector, arrayList2);
        return arrayList2;
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static C1612 m43544(View view) {
        if (f57147 == null) {
            f57147 = new WeakHashMap();
        }
        C1612 c1612 = (C1612) f57147.get(view);
        if (c1612 != null) {
            return c1612;
        }
        C1612 c1613 = new C1612(view);
        f57147.put(view, c1613);
        return c1613;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43547(View view, float f) {
        C1491.m33785(view, f);
    }

    /* JADX INFO: renamed from: ۜ */
    public static float m43566(View view) {
        return C1491.m33803(view);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m43572(View view, float f) {
        C1491.m33801(view, f);
    }

    /* JADX INFO: renamed from: ۡ */
    public static float m43567(View view) {
        return C1491.m33802(view);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43552(View view, String str) {
        C1491.m33788(view, str);
    }

    /* JADX INFO: renamed from: ۢ */
    public static String m43568(View view) {
        return C1491.m33805(view);
    }

    /* JADX INFO: renamed from: ᩵ */
    public static void m43585(View view) {
        C1071.m15434(view);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43556(View view, InterfaceC1666 interfaceC1666) {
        C1491.m33789(view, interfaceC1666);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C1914 m43570(View view, C1914 c1914) {
        WindowInsets windowInsetsM51171 = c1914.m51171();
        if (windowInsetsM51171 != null) {
            WindowInsets windowInsetsM15435 = C1071.m15435(view, windowInsetsM51171);
            if (!windowInsetsM15435.equals(windowInsetsM51171)) {
                return C1914.m51162(view, windowInsetsM15435);
            }
        }
        return c1914;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1914 m43545(View view, C1914 c1914) {
        WindowInsets windowInsetsM51171 = c1914.m51171();
        if (windowInsetsM51171 != null) {
            WindowInsets windowInsetsM15433 = C1071.m15433(view, windowInsetsM51171);
            if (!windowInsetsM15433.equals(windowInsetsM51171)) {
                return C1914.m51162(view, windowInsetsM15433);
            }
        }
        return c1914;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static C1914 m43586(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1456.m32149(view);
        }
        return C1491.m33806(view);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43557(View view, C1914 c1914, Rect rect) {
        C1491.m33784(view, c1914, rect);
    }

    @Deprecated
    /* JADX INFO: renamed from: ܺ */
    public static C1459 m43576(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C1211.m21949(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new C1459(window, view);
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String[] m43563(C1978 c1978) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C0947.m9141(c1978);
        }
        return (String[]) c1978.getTag(R.id.MT_Protector);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static C1028 m43543(View view, C1028 c1028) {
        if (Log.isLoggable("ViewCompat", 3)) {
            C12826.toString(c1028);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C0947.m9139(view, c1028);
        }
        InterfaceC1736 interfaceC1736 = (InterfaceC1736) view.getTag(R.id.MT_Protector);
        InterfaceC1701 interfaceC1701 = f57150;
        if (interfaceC1736 != null) {
            C1028 c1028Mo10982 = interfaceC1736.mo10982(view, c1028);
            if (c1028Mo10982 == null) {
                return null;
            }
            if (view instanceof InterfaceC1701) {
                interfaceC1701 = (InterfaceC1701) view;
            }
            return interfaceC1701.onReceiveContent(c1028Mo10982);
        }
        if (view instanceof InterfaceC1701) {
            interfaceC1701 = (InterfaceC1701) view;
        }
        return interfaceC1701.onReceiveContent(c1028);
    }

    /* JADX INFO: renamed from: ܳ */
    public static ColorStateList m43575(View view) {
        return C1491.m33783(view);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43549(View view, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        C1491.m33786(view, colorStateList);
        if (i == 21) {
            Drawable background = view.getBackground();
            boolean z = (C1491.m33783(view) == null && C1491.m33800(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public static PorterDuff.Mode m43587(View view) {
        return C1491.m33800(view);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43550(View view, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        C1491.m33787(view, mode);
        if (i == 21) {
            Drawable background = view.getBackground();
            boolean z = (C1491.m33783(view) == null && C1491.m33800(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public static boolean m43584(View view) {
        return C1491.m33799(view);
    }

    /* JADX INFO: renamed from: ۖ */
    public static float m43564(View view) {
        return C1491.m33808(view);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m43579(View view, float f) {
        C1491.m33804(view, f);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m43578(int i, View view) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect rectM43542 = m43542();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectM43542.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectM43542.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m43539(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                m43539((View) parent2);
            }
        }
        if (z && rectM43542.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectM43542);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m43571(int i, View view) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect rectM43542 = m43542();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectM43542.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectM43542.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m43539(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                m43539((View) parent2);
            }
        }
        if (z && rectM43542.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectM43542);
        }
    }

    /* JADX INFO: renamed from: ֡ */
    public static void m43539(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43560(ViewGroup viewGroup, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            C1456.m32151(viewGroup, i, i2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43561(ViewGroup viewGroup, C1176 c1176) {
        if (Build.VERSION.SDK_INT >= 24) {
            C1351.m28014(viewGroup, (PointerIcon) (c1176 != null ? c1176.m20278() : null));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m43573(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C1141.m18781(view, charSequence);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m43574(View view, boolean z) {
        new C0896(R.id.MT_Protector, 0, 28, Boolean.class).m48702(view, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43551(View view, CharSequence charSequence) {
        new C1246(R.id.MT_Protector, 8, 28, CharSequence.class).m48702(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC1946 viewTreeObserverOnGlobalLayoutListenerC1946 = f57149;
        if (charSequence != null) {
            viewTreeObserverOnGlobalLayoutListenerC1946.m52297(view);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC1946.m52298(view);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static CharSequence m43582(View view) {
        return (CharSequence) new C1246(R.id.MT_Protector, 8, 28, CharSequence.class).m48701(view);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43562(C0990 c0990, CharSequence charSequence) {
        new C1596(R.id.MT_Protector, 64, 30, CharSequence.class).m48702(c0990, charSequence);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43558(View view, boolean z) {
        new C1911(R.id.MT_Protector, 0, 28, Boolean.class).m48702(view, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43546(int i, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m43582(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(m43582(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(m43582(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError unused) {
                    view.getParent().getClass();
                }
            }
        }
    }
}
