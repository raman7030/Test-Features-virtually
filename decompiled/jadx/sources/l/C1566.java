package l;

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
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K22K */
/* JADX INFO: loaded from: classes2.dex */
public final class C1566 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C1566 f5524;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C3432 f5526;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final WeakHashMap f5527 = new WeakHashMap(0);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public WeakHashMap f5528;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f5529;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C13309 f5530;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC13519 f5531;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public TypedValue f5532;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final PorterDuff.Mode f5525 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C5759 f5523 = new C5759(6);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized Drawable m5348(Context context, long j) {
        C5549 c5549 = (C5549) this.f5527.get(context);
        if (c5549 == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c5549.m15697(j, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c5549.m15698(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized void m5350(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C5549 c5549 = (C5549) this.f5527.get(context);
            if (c5549 == null) {
                c5549 = new C5549();
                this.f5527.put(context, c5549);
            }
            c5549.m15696(j, new WeakReference(constantState));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m5358(Context context) {
        C5549 c5549 = (C5549) this.f5527.get(context);
        if (c5549 != null) {
            c5549.m15694();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m5359(InterfaceC13519 interfaceC13519) {
        this.f5531 = interfaceC13519;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized ColorStateList m5360(Context context, int i) {
        ColorStateList colorStateList;
        C13309 c13309;
        WeakHashMap weakHashMap = this.f5528;
        ColorStateList colorStateListM25599 = null;
        colorStateList = (weakHashMap == null || (c13309 = (C13309) weakHashMap.get(context)) == null) ? null : (ColorStateList) c13309.m32284(i, (Integer) null);
        if (colorStateList == null) {
            InterfaceC13519 interfaceC13519 = this.f5531;
            if (interfaceC13519 != null) {
                colorStateListM25599 = ((C10199) interfaceC13519).m25599(context, i);
            }
            if (colorStateListM25599 != null) {
                if (this.f5528 == null) {
                    this.f5528 = new WeakHashMap();
                }
                C13309 c133010 = (C13309) this.f5528.get(context);
                if (c133010 == null) {
                    c133010 = new C13309();
                    this.f5528.put(context, c133010);
                }
                c133010.m32286(i, colorStateListM25599);
            }
            colorStateList = colorStateListM25599;
        }
        return colorStateList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized PorterDuffColorFilter m5347(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C5759 c5759 = f5523;
        c5759.getClass();
        int i2 = (i + 31) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c5759.m4553(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized C1566 m5349() {
        if (f5524 == null) {
            C1566 c1566 = new C1566();
            f5524 = c1566;
            m5353(c1566);
        }
        return f5524;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5353(C1566 c1566) {
        if (Build.VERSION.SDK_INT < 24) {
            c1566.m5352("vector", new C7170());
            c1566.m5352("animated-vector", new C9993());
            c1566.m5352("animated-selector", new C12109());
            c1566.m5352("drawable", new C11404());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized Drawable m5356(Context context, int i) {
        return m5357(context, i, false);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private Drawable m5354(Context context, int i) {
        if (this.f5532 == null) {
            this.f5532 = new TypedValue();
        }
        TypedValue typedValue = this.f5532;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableM5348 = m5348(context, j);
        if (drawableM5348 != null) {
            return drawableM5348;
        }
        InterfaceC13519 interfaceC13519 = this.f5531;
        LayerDrawable layerDrawableM25600 = interfaceC13519 == null ? null : ((C10199) interfaceC13519).m25600(this, context, i);
        if (layerDrawableM25600 != null) {
            layerDrawableM25600.setChangingConfigurations(typedValue.changingConfigurations);
            m5350(context, j, layerDrawableM25600);
        }
        return layerDrawableM25600;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r11.f5526.getOrDefault(r0, null) != null) goto L15;
     */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Drawable m5355(Context context, int i) {
        int next;
        C3432 c3432 = this.f5526;
        if (c3432 != null && !c3432.isEmpty()) {
            C13309 c13309 = this.f5530;
            if (c13309 != null) {
                String str = (String) c13309.m32284(i, (Integer) null);
                if (!"appcompat_skip_skip".equals(str)) {
                    if (str != null) {
                    }
                }
            } else {
                this.f5530 = new C13309();
            }
            if (this.f5532 == null) {
                this.f5532 = new TypedValue();
            }
            TypedValue typedValue = this.f5532;
            Resources resources = context.getResources();
            resources.getValue(i, typedValue, true);
            long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
            Drawable drawableM5348 = m5348(context, j);
            if (drawableM5348 != null) {
                return drawableM5348;
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
                    this.f5530.m32286(i, name);
                    InterfaceC22692 interfaceC22692 = (InterfaceC22692) this.f5526.getOrDefault(name, null);
                    if (interfaceC22692 != null) {
                        drawableM5348 = interfaceC22692.mo19194(context, xml, attributeSetAsAttributeSet, context.getTheme());
                    }
                    if (drawableM5348 != null) {
                        drawableM5348.setChangingConfigurations(typedValue.changingConfigurations);
                        m5350(context, j, drawableM5348);
                    }
                } catch (Exception unused) {
                }
            }
            if (drawableM5348 == null) {
                this.f5530.m32286(i, "appcompat_skip_skip");
            }
            return drawableM5348;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5352(String str, InterfaceC22692 interfaceC22692) {
        if (this.f5526 == null) {
            this.f5526 = new C3432();
        }
        this.f5526.put(str, interfaceC22692);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5351(Drawable drawable, C5800 c5800, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = c5800.f17836;
            if (z || c5800.f17837) {
                PorterDuffColorFilter porterDuffColorFilterM5347 = null;
                ColorStateList colorStateList = z ? c5800.f17838 : null;
                PorterDuff.Mode mode = c5800.f17837 ? c5800.f17839 : f5525;
                if (colorStateList != null && mode != null) {
                    porterDuffColorFilterM5347 = m5347(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilterM5347);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized Drawable m5357(Context context, int i, boolean z) {
        Drawable drawableM5355;
        boolean z2 = false;
        if (!this.f5529) {
            this.f5529 = true;
            Drawable drawableM5356 = m5356(context, R.drawable.MT_Protector);
            if (drawableM5356 == null || (!(drawableM5356 instanceof C22597) && !"android.graphics.drawable.VectorDrawable".equals(drawableM5356.getClass().getName()))) {
                this.f5529 = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
        drawableM5355 = m5355(context, i);
        if (drawableM5355 == null) {
            drawableM5355 = m5354(context, i);
        }
        if (drawableM5355 == null) {
            drawableM5355 = C0881.m3234(context, i);
        }
        if (drawableM5355 != null) {
            ColorStateList colorStateListM5360 = m5360(context, i);
            PorterDuff.Mode mode = null;
            if (colorStateListM5360 != null) {
                drawableM5355 = C8184.m21684(drawableM5355.mutate());
                C8184.m21676(drawableM5355, colorStateListM5360);
                if (this.f5531 != null && i == R.drawable.MT_Protector) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
                if (mode != null) {
                    C8184.m21679(drawableM5355, mode);
                }
            } else {
                InterfaceC13519 interfaceC13519 = this.f5531;
                if (interfaceC13519 == null || !((C10199) interfaceC13519).m25601(context, i, drawableM5355)) {
                    InterfaceC13519 interfaceC135110 = this.f5531;
                    if (interfaceC135110 != null && ((C10199) interfaceC135110).m25602(context, i, drawableM5355)) {
                        z2 = true;
                    }
                    if (!z2 && z) {
                        drawableM5355 = null;
                    }
                }
            }
        }
        if (drawableM5355 != null) {
            C15320.m36347(drawableM5355);
        }
        return drawableM5355;
    }
}
