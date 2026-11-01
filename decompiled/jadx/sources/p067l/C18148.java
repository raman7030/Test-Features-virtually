package p067l;

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
public final class C18148 {
    /* JADX INFO: renamed from: ֫ */
    public static C8761 m41327(Activity activity, FoldingFeature foldingFeature) {
        C24854 c24854;
        C18819 c18819;
        Rect rectM20609;
        int i;
        int type = foldingFeature.getType();
        if (type != 1) {
            if (type == 2) {
                c24854 = C24854.f79397;
            }
            return null;
        }
        c24854 = C24854.f79396;
        int state = foldingFeature.getState();
        if (state != 1) {
            if (state == 2) {
                c18819 = C18819.f56199;
            }
            return null;
        }
        c18819 = C18819.f56198;
        Rect bounds = foldingFeature.getBounds();
        C13045.m29865(bounds, "oemFeature.bounds");
        C7164 c7164 = new C7164(bounds);
        C8917.f24162.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            rectM20609 = C7835.m18114(activity);
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
                rectM20609 = new Rect((Rect) objInvoke);
            } catch (IllegalAccessException unused) {
                rectM20609 = C8917.m20609(activity);
            } catch (NoSuchFieldException unused2) {
                rectM20609 = C8917.m20609(activity);
            } catch (NoSuchMethodException unused3) {
                rectM20609 = C8917.m20609(activity);
            } catch (InvocationTargetException unused4) {
                rectM20609 = C8917.m20609(activity);
            }
        } else if (i2 >= 28) {
            rectM20609 = C8917.m20609(activity);
        } else if (i2 >= 24) {
            Rect rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!C11859.m27166(activity)) {
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
            rectM20609 = rect;
        } else {
            Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
            C13045.m29865(defaultDisplay2, "defaultDisplay");
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
            rectM20609 = rect2;
        }
        Rect rectM37087 = new C16292(rectM20609).m37087();
        if ((c7164.m16470() != 0 || c7164.m16474() != 0) && ((c7164.m16474() == rectM37087.width() || c7164.m16470() == rectM37087.height()) && ((c7164.m16474() >= rectM37087.width() || c7164.m16470() >= rectM37087.height()) && (c7164.m16474() != rectM37087.width() || c7164.m16470() != rectM37087.height())))) {
            Rect bounds2 = foldingFeature.getBounds();
            C13045.m29865(bounds2, "oemFeature.bounds");
            return new C8761(new C7164(bounds2), c24854, c18819);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18975 m41328(Activity activity, WindowLayoutInfo windowLayoutInfo) {
        C8761 c8761M41327;
        C13045.m29867(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        C13045.m29865(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                C13045.m29865(foldingFeature, "feature");
                c8761M41327 = m41327(activity, foldingFeature);
            } else {
                c8761M41327 = null;
            }
            if (c8761M41327 != null) {
                arrayList.add(c8761M41327);
            }
        }
        return new C18975(arrayList);
    }
}
