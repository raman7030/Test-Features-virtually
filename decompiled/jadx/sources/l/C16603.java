package l;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AMJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16603 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6726 m39100(Activity activity, FoldingFeature foldingFeature) {
        C23659 c23659;
        C17309 c17309;
        Rect rectM18660;
        int i;
        int type = foldingFeature.getType();
        if (type != 1) {
            if (type == 2) {
                c23659 = C23659.f76651;
            }
            return null;
        }
        c23659 = C23659.f76650;
        int state = foldingFeature.getState();
        if (state != 1) {
            if (state == 2) {
                c17309 = C17309.f53018;
            }
            return null;
        }
        c17309 = C17309.f53017;
        Rect bounds = foldingFeature.getBounds();
        C11233.m27803(bounds, "oemFeature.bounds");
        C5046 c5046 = new C5046(bounds);
        C6890.f21285.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            rectM18660 = C5752.m16195(activity);
        } else if (i2 >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rectM18660 = new Rect((Rect) objInvoke);
            } catch (IllegalAccessException unused) {
                rectM18660 = C6890.m18660(activity);
            } catch (NoSuchFieldException unused2) {
                rectM18660 = C6890.m18660(activity);
            } catch (NoSuchMethodException unused3) {
                rectM18660 = C6890.m18660(activity);
            } catch (InvocationTargetException unused4) {
                rectM18660 = C6890.m18660(activity);
            }
        } else if (i2 >= 28) {
            rectM18660 = C6890.m18660(activity);
        } else if (i2 >= 24) {
            Rect rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!C9986.m25149(activity)) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                int i3 = rect.bottom + dimensionPixelSize;
                if (i3 == point.y) {
                    rect.bottom = i3;
                } else {
                    int i4 = rect.right + dimensionPixelSize;
                    if (i4 == point.x) {
                        rect.right = i4;
                    }
                }
            }
            rectM18660 = rect;
        } else {
            Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
            C11233.m27803(defaultDisplay2, "defaultDisplay");
            Point point2 = new Point();
            defaultDisplay2.getRealSize(point2);
            Rect rect2 = new Rect();
            int i5 = point2.x;
            if (i5 == 0 || (i = point2.y) == 0) {
                defaultDisplay2.getRectSize(rect2);
            } else {
                rect2.right = i5;
                rect2.bottom = i;
            }
            rectM18660 = rect2;
        }
        Rect rectM34940 = new C14650(rectM18660).m34940();
        if ((c5046.m14566() != 0 || c5046.m14570() != 0) && ((c5046.m14570() == rectM34940.width() || c5046.m14566() == rectM34940.height()) && ((c5046.m14570() >= rectM34940.width() || c5046.m14566() >= rectM34940.height()) && (c5046.m14570() != rectM34940.width() || c5046.m14566() != rectM34940.height())))) {
            Rect bounds2 = foldingFeature.getBounds();
            C11233.m27803(bounds2, "oemFeature.bounds");
            return new C6726(new C5046(bounds2), c23659, c17309);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17473 m39101(Activity activity, WindowLayoutInfo windowLayoutInfo) {
        C6726 c6726M39100;
        C11233.m27805(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        C11233.m27803(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                C11233.m27803(foldingFeature, "feature");
                c6726M39100 = m39100(activity, foldingFeature);
            } else {
                c6726M39100 = null;
            }
            if (c6726M39100 != null) {
                arrayList.add(c6726M39100);
            }
        }
        return new C17473(arrayList);
    }
}
