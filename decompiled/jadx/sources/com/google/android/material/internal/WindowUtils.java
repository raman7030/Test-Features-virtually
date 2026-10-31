package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class WindowUtils {
    public static final String TAG = "WindowUtils";

    public static Rect getCurrentWindowBounds(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getCurrentWindowBounds(windowManager);
        }
        return Api17Impl.getCurrentWindowBounds(windowManager);
    }

    public class Api30Impl {
        public static Rect getCurrentWindowBounds(WindowManager windowManager) {
            return windowManager.getCurrentWindowMetrics().getBounds();
        }
    }

    public class Api17Impl {
        public static Rect getCurrentWindowBounds(WindowManager windowManager) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Rect rect = new Rect();
            rect.right = point.x;
            rect.bottom = point.y;
            return rect;
        }
    }

    public class Api14Impl {
        public static Rect getCurrentWindowBounds(WindowManager windowManager) {
            int i;
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point realSizeForDisplay = getRealSizeForDisplay(defaultDisplay);
            Rect rect = new Rect();
            int i2 = realSizeForDisplay.x;
            if (i2 == 0 || (i = realSizeForDisplay.y) == 0) {
                defaultDisplay.getRectSize(rect);
                return rect;
            }
            rect.right = i2;
            rect.bottom = i;
            return rect;
        }

        public static Point getRealSizeForDisplay(Display display) {
            Point point = new Point();
            try {
                Method declaredMethod = Display.class.getDeclaredMethod("getRealSize", Point.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(display, point);
                return point;
            } catch (IllegalAccessException unused) {
                String unused2 = WindowUtils.TAG;
                return point;
            } catch (NoSuchMethodException unused3) {
                String unused4 = WindowUtils.TAG;
                return point;
            } catch (InvocationTargetException unused5) {
                String unused6 = WindowUtils.TAG;
                return point;
            }
        }
    }
}
