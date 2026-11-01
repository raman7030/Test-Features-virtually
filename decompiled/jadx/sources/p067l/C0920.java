package p067l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import bin.p000mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.֫ۘ */
/* JADX INFO: compiled from: K22K */
/* JADX INFO: loaded from: classes2.dex */
public final class C0920 {

    /* JADX INFO: renamed from: ۢ */
    public static C0920 f8305;

    /* JADX INFO: renamed from: ֫ */
    public C1012 f8307;

    /* JADX INFO: renamed from: ۧ */
    public final WeakHashMap f8308 = new WeakHashMap(0);

    /* JADX INFO: renamed from: ܳ */
    public WeakHashMap f8309;

    /* JADX INFO: renamed from: ܽ */
    public boolean f8310;

    /* JADX INFO: renamed from: ܿ */
    public C1502 f8311;

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC1513 f8312;

    /* JADX INFO: renamed from: ᩻ */
    public TypedValue f8313;

    /* JADX INFO: renamed from: ᩷ */
    public static final PorterDuff.Mode f8306 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ۜ */
    public static final C1128 f8304 = new C1128(6);

    /* JADX INFO: renamed from: ֫ */
    private synchronized Drawable m7577(Context context, long j) {
        C1117 c1117 = (C1117) this.f8308.get(context);
        if (c1117 == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c1117.m17612(j, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c1117.m17613(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    private synchronized void m7579(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C1117 c1117 = (C1117) this.f8308.get(context);
            if (c1117 == null) {
                c1117 = new C1117();
                this.f8308.put(context, c1117);
            }
            c1117.m17611(j, new WeakReference(constantState));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m7587(Context context) {
        C1117 c1117 = (C1117) this.f8308.get(context);
        if (c1117 != null) {
            c1117.m17609();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m7588(InterfaceC1513 interfaceC1513) {
        this.f8312 = interfaceC1513;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized ColorStateList m7589(Context context, int i) {
        ColorStateList colorStateList;
        C1502 c1502;
        WeakHashMap weakHashMap = this.f8309;
        ColorStateList colorStateListM27621 = null;
        colorStateList = (weakHashMap == null || (c1502 = (C1502) weakHashMap.get(context)) == null) ? null : (ColorStateList) c1502.m34385(i, (Integer) null);
        if (colorStateList == null) {
            InterfaceC1513 interfaceC1513 = this.f8312;
            if (interfaceC1513 != null) {
                colorStateListM27621 = ((C1348) interfaceC1513).m27621(context, i);
            }
            if (colorStateListM27621 != null) {
                if (this.f8309 == null) {
                    this.f8309 = new WeakHashMap();
                }
                C1502 c1503 = (C1502) this.f8309.get(context);
                if (c1503 == null) {
                    c1503 = new C1502();
                    this.f8309.put(context, c1503);
                }
                c1503.m34387(i, colorStateListM27621);
            }
            colorStateList = colorStateListM27621;
        }
        return colorStateList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static synchronized PorterDuffColorFilter m7576(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C1128 c1128 = f8304;
        c1128.getClass();
        int i2 = (i + 31) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c1128.m6785(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: ֫ */
    public static synchronized C0920 m7578() {
        if (f8305 == null) {
            C0920 c0920 = new C0920();
            f8305 = c0920;
            m7582(c0920);
        }
        return f8305;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7582(C0920 c0920) {
        if (Build.VERSION.SDK_INT < 24) {
            c0920.m7581("vector", new C1198());
            c0920.m7581("animated-vector", new C1338());
            c0920.m7581("animated-selector", new C1443());
            c0920.m7581("drawable", new C1408());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized Drawable m7585(Context context, int i) {
        return m7586(context, i, false);
    }

    /* JADX INFO: renamed from: ܽ */
    private Drawable m7583(Context context, int i) {
        if (this.f8313 == null) {
            this.f8313 = new TypedValue();
        }
        TypedValue typedValue = this.f8313;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableM7577 = m7577(context, j);
        if (drawableM7577 != null) {
            return drawableM7577;
        }
        InterfaceC1513 interfaceC1513 = this.f8312;
        LayerDrawable layerDrawableM27622 = interfaceC1513 == null ? null : ((C1348) interfaceC1513).m27622(this, context, i);
        if (layerDrawableM27622 != null) {
            layerDrawableM27622.setChangingConfigurations(typedValue.changingConfigurations);
            m7579(context, j, layerDrawableM27622);
        }
        return layerDrawableM27622;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r11.f8307.getOrDefault(r0, null) != null) goto L15;
     */
    /* JADX INFO: renamed from: ᩳ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Drawable m7584(Context context, int i) {
        int next;
        C1012 c1012 = this.f8307;
        if (c1012 != null && !c1012.isEmpty()) {
            C1502 c1502 = this.f8311;
            if (c1502 != null) {
                String str = (String) c1502.m34385(i, (Integer) null);
                if (!"appcompat_skip_skip".equals(str)) {
                    if (str != null) {
                    }
                }
            } else {
                this.f8311 = new C1502();
            }
            if (this.f8313 == null) {
                this.f8313 = new TypedValue();
            }
            TypedValue typedValue = this.f8313;
            Resources resources = context.getResources();
            resources.getValue(i, typedValue, true);
            long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
            Drawable drawableM7577 = m7577(context, j);
            if (drawableM7577 != null) {
                return drawableM7577;
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null && charSequence.toString().endsWith(".xml")) {
                try {
                    XmlResourceParser xml = resources.getXml(i);
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    String name = xml.getName();
                    this.f8311.m34387(i, name);
                    InterfaceC1968 interfaceC1968 = (InterfaceC1968) this.f8307.getOrDefault(name, null);
                    if (interfaceC1968 != null) {
                        drawableM7577 = interfaceC1968.mo21141(context, xml, attributeSetAsAttributeSet, context.getTheme());
                    }
                    if (drawableM7577 != null) {
                        drawableM7577.setChangingConfigurations(typedValue.changingConfigurations);
                        m7579(context, j, drawableM7577);
                    }
                } catch (Exception unused) {
                }
            }
            if (drawableM7577 == null) {
                this.f8311.m34387(i, "appcompat_skip_skip");
            }
            return drawableM7577;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m7581(String str, InterfaceC1968 interfaceC1968) {
        if (this.f8307 == null) {
            this.f8307 = new C1012();
        }
        this.f8307.put(str, interfaceC1968);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7580(Drawable drawable, C1130 c1130, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = c1130.f20689;
            if (z || c1130.f20690) {
                PorterDuffColorFilter porterDuffColorFilterM7576 = null;
                ColorStateList colorStateList = z ? c1130.f20691 : null;
                PorterDuff.Mode mode = c1130.f20690 ? c1130.f20692 : f8306;
                if (colorStateList != null && mode != null) {
                    porterDuffColorFilterM7576 = m7576(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilterM7576);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized Drawable m7586(Context context, int i, boolean z) {
        Drawable drawableM7584;
        boolean z2 = false;
        if (!this.f8310) {
            this.f8310 = true;
            Drawable drawableM7585 = m7585(context, R.drawable.MT_Protector);
            if (drawableM7585 == null || (!(drawableM7585 instanceof C23845) && !"android.graphics.drawable.VectorDrawable".equals(drawableM7585.getClass().getName()))) {
                this.f8310 = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
        drawableM7584 = m7584(context, i);
        if (drawableM7584 == null) {
            drawableM7584 = m7583(context, i);
        }
        if (drawableM7584 == null) {
            drawableM7584 = C0886.m5548(context, i);
        }
        if (drawableM7584 != null) {
            ColorStateList colorStateListM7589 = m7589(context, i);
            PorterDuff.Mode mode = null;
            if (colorStateListM7589 != null) {
                drawableM7584 = C1248.m23653(drawableM7584.mutate());
                C1248.m23645(drawableM7584, colorStateListM7589);
                if (this.f8312 != null && i == R.drawable.MT_Protector) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
                if (mode != null) {
                    C1248.m23648(drawableM7584, mode);
                }
            } else {
                InterfaceC1513 interfaceC1513 = this.f8312;
                if (interfaceC1513 == null || !((C1348) interfaceC1513).m27623(context, i, drawableM7584)) {
                    InterfaceC1513 interfaceC1514 = this.f8312;
                    if (interfaceC1514 != null && ((C1348) interfaceC1514).m27624(context, i, drawableM7584)) {
                        z2 = true;
                    }
                    if (!z2 && z) {
                        drawableM7584 = null;
                    }
                }
            }
        }
        if (drawableM7584 != null) {
            C1602.m38505(drawableM7584);
        }
        return drawableM7584;
    }
}
