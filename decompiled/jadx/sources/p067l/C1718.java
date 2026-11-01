package p067l;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿ᩻ */
/* JADX INFO: compiled from: 45OX */
/* JADX INFO: loaded from: classes5.dex */
public final class C1718 extends AbstractC1360 {

    /* JADX INFO: renamed from: ֡ */
    public ArrayList f57231;

    /* JADX INFO: renamed from: ֨ */
    public C1364 f57232;

    /* JADX INFO: renamed from: ֫ */
    public C1753 f57233;

    /* JADX INFO: renamed from: ۖ */
    public boolean f57234;

    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC1927 f57235;

    /* JADX INFO: renamed from: ۚ */
    public boolean f57236;

    /* JADX INFO: renamed from: ۜ */
    public C1379 f57237;

    /* JADX INFO: renamed from: ۠ */
    public boolean f57238;

    /* JADX INFO: renamed from: ۡ */
    public InterfaceC1088 f57239;

    /* JADX INFO: renamed from: ۢ */
    public C1753 f57240;

    /* JADX INFO: renamed from: ۧ */
    public C1609 f57241;

    /* JADX INFO: renamed from: ܳ */
    public C1959 f57242;

    /* JADX INFO: renamed from: ܶ */
    public final InterfaceC1927 f57243;

    /* JADX INFO: renamed from: ܺ */
    public boolean f57244;

    /* JADX INFO: renamed from: ܽ */
    public boolean f57245;

    /* JADX INFO: renamed from: ܿ */
    public Context f57246;

    /* JADX INFO: renamed from: ᩳ */
    public View f57247;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f57248;

    /* JADX INFO: renamed from: ᩵ */
    public boolean f57249;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC1962 f57250;

    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC0867 f57251;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f57252;

    /* JADX INFO: renamed from: ᩹ */
    public Context f57253;

    /* JADX INFO: renamed from: ᩻ */
    public int f57254;

    /* JADX INFO: renamed from: ۙ */
    public static final AccelerateInterpolator f57230 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: ۗ */
    public static final DecelerateInterpolator f57229 = new DecelerateInterpolator();

    public C1718(Activity activity, boolean z) {
        new ArrayList();
        this.f57231 = new ArrayList();
        this.f57254 = 0;
        this.f57245 = true;
        this.f57236 = true;
        this.f57235 = new C0948(this);
        this.f57243 = new C1403(this);
        this.f57250 = new C1683(this);
        View decorView = activity.getWindow().getDecorView();
        m43633(decorView);
        if (z) {
            return;
        }
        this.f57247 = decorView.findViewById(R.id.content);
    }

    public C1718(Dialog dialog) {
        new ArrayList();
        this.f57231 = new ArrayList();
        this.f57254 = 0;
        this.f57245 = true;
        this.f57236 = true;
        this.f57235 = new C0948(this);
        this.f57243 = new C1403(this);
        this.f57250 = new C1683(this);
        m43633(dialog.getWindow().getDecorView());
    }

    /* JADX INFO: renamed from: ֫ */
    private void m43633(View view) {
        InterfaceC0867 wrapper;
        C1364 c1364 = (C1364) view.findViewById(bin.p000mt.plus.R.id.MT_Protector);
        this.f57232 = c1364;
        if (c1364 != null) {
            c1364.m28468(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(bin.p000mt.plus.R.id.MT_Protector);
        if (callbackFindViewById instanceof InterfaceC0867) {
            wrapper = (InterfaceC0867) callbackFindViewById;
        } else if (callbackFindViewById instanceof C1326) {
            wrapper = ((C1326) callbackFindViewById).getWrapper();
        } else {
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
        }
        this.f57251 = wrapper;
        this.f57242 = (C1959) view.findViewById(bin.p000mt.plus.R.id.MT_Protector);
        C1609 c1609 = (C1609) view.findViewById(bin.p000mt.plus.R.id.MT_Protector);
        this.f57241 = c1609;
        InterfaceC0867 interfaceC0867 = this.f57251;
        if (interfaceC0867 == null || this.f57242 == null || c1609 == null) {
            throw new IllegalStateException("WindowDecorActionBar can only be used with a compatible window decor layout");
        }
        this.f57246 = interfaceC0867.getContext();
        if ((this.f57251.mo4551() & 4) != 0) {
            this.f57244 = true;
        }
        C1858 c1858M49274 = C1858.m49274(this.f57246);
        c1858M49274.m49275();
        this.f57251.getClass();
        m43635(c1858M49274.m49277());
        TypedArray typedArrayObtainStyledAttributes = this.f57246.obtainStyledAttributes(null, C1010.f13503, bin.p000mt.plus.R.attr.MT_Protector, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            if (!this.f57232.m28479()) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f57248 = true;
            this.f57232.m28473(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            C1717.m43547(this.f57241, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ܳ */
    public final void mo28327() {
        m43635(C1858.m49274(this.f57246).m49277());
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m43635(boolean z) {
        if (!z) {
            this.f57251.mo4558();
            this.f57241.getClass();
        } else {
            this.f57241.getClass();
            this.f57251.mo4558();
        }
        this.f57251.getClass();
        this.f57251.mo4548(false);
        this.f57232.m28469(false);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m43638(int i) {
        this.f57254 = i;
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ᩳ */
    public final void mo28332(boolean z) {
        C1379 c1379;
        this.f57238 = z;
        if (z || (c1379 = this.f57237) == null) {
            return;
        }
        c1379.m29099();
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ֫ */
    public final void mo28320(boolean z) {
        if (z == this.f57249) {
            return;
        }
        this.f57249 = z;
        ArrayList arrayList = this.f57231;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC1465) arrayList.get(i)).m32868();
        }
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ֫ */
    public final void mo28319(CharSequence charSequence) {
        this.f57251.mo4547(charSequence);
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ܽ */
    public final void mo28329(boolean z) {
        int i = z ? 4 : 0;
        int iMo4551 = this.f57251.mo4551();
        this.f57244 = true;
        this.f57251.mo4543((i & 4) | (iMo4551 & (-5)));
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ܽ */
    public final int mo28328() {
        return this.f57251.mo4551();
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC1018 mo28316(InterfaceC1088 interfaceC1088) {
        C1753 c1753 = this.f57233;
        if (c1753 != null) {
            c1753.mo12804();
        }
        this.f57232.m28473(false);
        this.f57242.m52860();
        C1753 c1754 = new C1753(this, this.f57242.getContext(), interfaceC1088);
        if (!c1754.m45080()) {
            return null;
        }
        this.f57233 = c1754;
        c1754.mo12819();
        this.f57242.m52854(c1754);
        m43640(true);
        return c1754;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m43639(boolean z) {
        this.f57245 = z;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m43640(boolean z) {
        C1612 c1612Mo4542;
        C1612 c1612M52850;
        if (z) {
            if (!this.f57252) {
                this.f57252 = true;
                m43634(false);
            }
        } else if (this.f57252) {
            this.f57252 = false;
            m43634(false);
        }
        if (!this.f57241.isLaidOut()) {
            if (z) {
                this.f57251.setVisibility(4);
                this.f57242.setVisibility(0);
                return;
            } else {
                this.f57251.setVisibility(0);
                this.f57242.setVisibility(8);
                return;
            }
        }
        if (z) {
            c1612M52850 = this.f57251.mo4542(4, 100L);
            c1612Mo4542 = this.f57242.m52850(0, 200L);
        } else {
            c1612Mo4542 = this.f57251.mo4542(0, 200L);
            c1612M52850 = this.f57242.m52850(8, 100L);
        }
        C1379 c1379 = new C1379();
        c1379.m29103(c1612M52850, c1612Mo4542);
        c1379.m29106();
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m43636() {
        if (this.f57234) {
            this.f57234 = false;
            m43634(true);
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m43641() {
        if (this.f57234) {
            return;
        }
        this.f57234 = true;
        m43634(true);
    }

    /* JADX INFO: renamed from: ۜ */
    private void m43634(boolean z) {
        boolean z2 = this.f57234;
        boolean z3 = this.f57252;
        InterfaceC1962 interfaceC1962 = this.f57250;
        View view = this.f57247;
        if (z3 || !z2) {
            if (this.f57236) {
                return;
            }
            this.f57236 = true;
            C1379 c1379 = this.f57237;
            if (c1379 != null) {
                c1379.m29099();
            }
            this.f57241.setVisibility(0);
            int i = this.f57254;
            InterfaceC1927 interfaceC1927 = this.f57243;
            if (i == 0 && (this.f57238 || z)) {
                this.f57241.setTranslationY(0.0f);
                float f = -this.f57241.getHeight();
                if (z) {
                    int[] iArr = {0, 0};
                    this.f57241.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                this.f57241.setTranslationY(f);
                C1379 c13710 = new C1379();
                C1612 c1612M43544 = C1717.m43544(this.f57241);
                c1612M43544.m38765(0.0f);
                c1612M43544.m38763(interfaceC1962);
                c13710.m29102(c1612M43544);
                if (this.f57245 && view != null) {
                    view.setTranslationY(f);
                    C1612 c1612M43545 = C1717.m43544(view);
                    c1612M43545.m38765(0.0f);
                    c13710.m29102(c1612M43545);
                }
                c13710.m29100(f57229);
                c13710.m29105();
                c13710.m29101((C3395) interfaceC1927);
                this.f57237 = c13710;
                c13710.m29106();
            } else {
                this.f57241.setAlpha(1.0f);
                this.f57241.setTranslationY(0.0f);
                if (this.f57245 && view != null) {
                    view.setTranslationY(0.0f);
                }
                ((C1403) interfaceC1927).onAnimationEnd();
            }
            C1364 c1364 = this.f57232;
            if (c1364 != null) {
                C1717.m43585(c1364);
                return;
            }
            return;
        }
        if (this.f57236) {
            this.f57236 = false;
            C1379 c13711 = this.f57237;
            if (c13711 != null) {
                c13711.m29099();
            }
            int i2 = this.f57254;
            InterfaceC1927 interfaceC1928 = this.f57235;
            if (i2 == 0 && (this.f57238 || z)) {
                this.f57241.setAlpha(1.0f);
                this.f57241.m38708(true);
                C1379 c13712 = new C1379();
                float f2 = -this.f57241.getHeight();
                if (z) {
                    int[] iArr2 = {0, 0};
                    this.f57241.getLocationInWindow(iArr2);
                    f2 -= iArr2[1];
                }
                C1612 c1612M43546 = C1717.m43544(this.f57241);
                c1612M43546.m38765(f2);
                c1612M43546.m38763(interfaceC1962);
                c13712.m29102(c1612M43546);
                if (this.f57245 && view != null) {
                    C1612 c1612M43547 = C1717.m43544(view);
                    c1612M43547.m38765(f2);
                    c13712.m29102(c1612M43547);
                }
                c13712.m29100(f57230);
                c13712.m29105();
                c13712.m29101((C3395) interfaceC1928);
                this.f57237 = c13712;
                c13712.m29106();
                return;
            }
            ((C0948) interfaceC1928).onAnimationEnd();
        }
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ᩳ */
    public final Context mo28331() {
        if (this.f57253 == null) {
            TypedValue typedValue = new TypedValue();
            this.f57246.getTheme().resolveAttribute(bin.p000mt.plus.R.attr.MT_Protector, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f57253 = new ContextThemeWrapper(this.f57246, i);
            } else {
                this.f57253 = this.f57246;
            }
        }
        return this.f57253;
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ֫ */
    public final void mo28318(Drawable drawable) {
        this.f57251.mo4544(drawable);
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ֫ */
    public final void mo28317(int i) {
        this.f57251.mo4552(i);
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m43637() {
        C1379 c1379 = this.f57237;
        if (c1379 != null) {
            c1379.m29099();
            this.f57237 = null;
        }
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo28326() {
        InterfaceC0867 interfaceC0867 = this.f57251;
        if (interfaceC0867 == null || !interfaceC0867.mo4559()) {
            return false;
        }
        this.f57251.collapseActionView();
        return true;
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ۧ */
    public final void mo28325(boolean z) {
        if (this.f57244) {
            return;
        }
        mo28329(z);
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo28322(int i, KeyEvent keyEvent) {
        C0994 c0994Mo12816;
        C1753 c1753 = this.f57233;
        if (c1753 == null || (c0994Mo12816 = c1753.mo12816()) == null) {
            return false;
        }
        c0994Mo12816.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return c0994Mo12816.performShortcut(i, keyEvent, 0);
    }
}
