package p067l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۖᩴ */
/* JADX INFO: compiled from: H56R */
/* JADX INFO: loaded from: classes2.dex */
public final class C0976 implements InterfaceC0867 {

    /* JADX INFO: renamed from: ֫ */
    public C1698 f11246;

    /* JADX INFO: renamed from: ۖ */
    public boolean f11247;

    /* JADX INFO: renamed from: ۘ */
    public C1326 f11248;

    /* JADX INFO: renamed from: ۜ */
    public Drawable f11249;

    /* JADX INFO: renamed from: ۡ */
    public CharSequence f11250;

    /* JADX INFO: renamed from: ۢ */
    public Drawable f11251;

    /* JADX INFO: renamed from: ۧ */
    public View f11252;

    /* JADX INFO: renamed from: ܳ */
    public CharSequence f11253;

    /* JADX INFO: renamed from: ܺ */
    public CharSequence f11254;

    /* JADX INFO: renamed from: ܽ */
    public int f11255;

    /* JADX INFO: renamed from: ܿ */
    public int f11256;

    /* JADX INFO: renamed from: ᩳ */
    public Drawable f11257;

    /* JADX INFO: renamed from: ᩴ */
    public Window.Callback f11258;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f11259;

    /* JADX INFO: renamed from: ᩻ */
    public Drawable f11260;

    @Override // p067l.InterfaceC0867
    /* JADX INFO: renamed from: ᩷ */
    public final void mo4558() {
    }

    public C0976(C1326 c1326, boolean z) {
        Drawable drawable;
        this.f11255 = 0;
        this.f11248 = c1326;
        this.f11254 = c1326.getTitle();
        this.f11250 = c1326.getSubtitle();
        this.f11247 = this.f11254 != null;
        this.f11251 = c1326.getNavigationIcon();
        C1970 c1970M53129 = C1970.m53129(c1326.getContext(), null, C1010.f13503, R.attr.MT_Protector, 0);
        int i = 15;
        this.f11257 = c1970M53129.m53148(15);
        if (z) {
            CharSequence charSequenceM53150 = c1970M53129.m53150(27);
            if (!TextUtils.isEmpty(charSequenceM53150)) {
                this.f11247 = true;
                this.f11254 = charSequenceM53150;
                if ((this.f11256 & 8) != 0) {
                    c1326.setTitle(charSequenceM53150);
                    if (this.f11247) {
                        C1717.m43551(c1326.getRootView(), charSequenceM53150);
                    }
                }
            }
            CharSequence charSequenceM53151 = c1970M53129.m53150(25);
            if (!TextUtils.isEmpty(charSequenceM53151)) {
                this.f11250 = charSequenceM53151;
                if ((this.f11256 & 8) != 0) {
                    c1326.setSubtitle(charSequenceM53151);
                }
            }
            Drawable drawableM53148 = c1970M53129.m53148(20);
            if (drawableM53148 != null) {
                this.f11249 = drawableM53148;
                m10480();
            }
            Drawable drawableM53149 = c1970M53129.m53148(17);
            if (drawableM53149 != null) {
                this.f11260 = drawableM53149;
                m10480();
            }
            if (this.f11251 == null && (drawable = this.f11257) != null) {
                mo4544(drawable);
            }
            mo4543(c1970M53129.m53142(10, 0));
            int iM53139 = c1970M53129.m53139(9, 0);
            if (iM53139 != 0) {
                View viewInflate = LayoutInflater.from(c1326.getContext()).inflate(iM53139, (ViewGroup) c1326, false);
                View view = this.f11252;
                if (view != null && (this.f11256 & 16) != 0) {
                    c1326.removeView(view);
                }
                this.f11252 = viewInflate;
                if (viewInflate != null && (this.f11256 & 16) != 0) {
                    c1326.addView(viewInflate);
                }
                mo4543(this.f11256 | 16);
            }
            int iM53144 = c1970M53129.m53144(13, 0);
            if (iM53144 > 0) {
                ViewGroup.LayoutParams layoutParams = c1326.getLayoutParams();
                layoutParams.height = iM53144;
                c1326.setLayoutParams(layoutParams);
            }
            int iM53132 = c1970M53129.m53132(7, -1);
            int iM53133 = c1970M53129.m53132(3, -1);
            if (iM53132 >= 0 || iM53133 >= 0) {
                c1326.setContentInsetsRelative(Math.max(iM53132, 0), Math.max(iM53133, 0));
            }
            int iM531310 = c1970M53129.m53139(28, 0);
            if (iM531310 != 0) {
                c1326.setTitleTextAppearance(c1326.getContext(), iM531310);
            }
            int iM531311 = c1970M53129.m53139(26, 0);
            if (iM531311 != 0) {
                c1326.setSubtitleTextAppearance(c1326.getContext(), iM531311);
            }
            int iM531312 = c1970M53129.m53139(22, 0);
            if (iM531312 != 0) {
                c1326.setPopupTheme(iM531312);
            }
        } else {
            if (c1326.getNavigationIcon() != null) {
                this.f11257 = c1326.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f11256 = i;
        }
        c1970M53129.m53146();
        if (R.string.MT_Protector != this.f11255) {
            this.f11255 = R.string.MT_Protector;
            if (TextUtils.isEmpty(c1326.getNavigationContentDescription())) {
                mo4552(this.f11255);
            }
        }
        this.f11253 = c1326.getNavigationContentDescription();
        c1326.setNavigationOnClickListener(new ViewOnClickListenerC1291(this));
    }

    /* JADX INFO: renamed from: ܺ */
    public final C1326 m10483() {
        return this.f11248;
    }

    @Override // p067l.InterfaceC0867
    public final Context getContext() {
        return this.f11248.getContext();
    }

    @Override // p067l.InterfaceC0867
    /* JADX INFO: renamed from: ۧ */
    public final void mo4552(int i) {
        this.f11253 = i == 0 ? null : this.f11248.getContext().getString(i);
        m10479();
    }

    @Override // p067l.InterfaceC0867
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo4559() {
        return this.f11248.hasExpandedActionView();
    }

    @Override // p067l.InterfaceC0867
    public final void collapseActionView() {
        this.f11248.collapseActionView();
    }

    @Override // p067l.InterfaceC0867
    /* JADX INFO: renamed from: ֫ */
    public final void mo4546(Window.Callback callback) {
        this.f11258 = callback;
    }

    @Override // p067l.InterfaceC0867
    /* JADX INFO: renamed from: ֫ */
    public final void mo4547(CharSequence charSequence) {
        if (this.f11247) {
            return;
        }
        this.f11254 = charSequence;
        if ((this.f11256 & 8) != 0) {
            C1326 c1326 = this.f11248;
            c1326.setTitle(charSequence);
            if (this.f11247) {
                C1717.m43551(c1326.getRootView(), charSequence);
            }
        }
    }

    /* JADX INFO: renamed from: ۘ */
    private void m10480() {
        Drawable drawable;
        int i = this.f11256;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f11249) == null) {
            drawable = this.f11260;
        }
        this.f11248.setLogo(drawable);
    }

    @Override // p067l.InterfaceC0867
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4549() {
        return this.f11248.canShowOverflowMenu();
    }

    @Override // p067l.InterfaceC0867
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo4557() {
        return this.f11248.isOverflowMenuShowing();
    }

    @Override // p067l.InterfaceC0867
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo4554() {
        return this.f11248.isOverflowMenuShowPending();
    }

    @Override // p067l.InterfaceC0867
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo4555() {
        return this.f11248.showOverflowMenu();
    }

    @Override // p067l.InterfaceC0867
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4553() {
        return this.f11248.hideOverflowMenu();
    }

    @Override // p067l.InterfaceC0867
    /* JADX INFO: renamed from: ܿ */
    public final void mo4556() {
        this.f11259 = true;
    }

    @Override // p067l.InterfaceC0867
    /* JADX INFO: renamed from: ֫ */
    public final void mo4545(Menu menu, InterfaceC1714 interfaceC1714) {
        C1698 c1698 = this.f11246;
        C1326 c1326 = this.f11248;
        if (c1698 == null) {
            C1698 c1699 = new C1698(c1326.getContext());
            this.f11246 = c1699;
            c1699.m24459(R.id.MT_Protector);
        }
        this.f11246.setCallback(interfaceC1714);
        c1326.setMenu((C0994) menu, this.f11246);
    }

    @Override // p067l.InterfaceC0867
    /* JADX INFO: renamed from: ۜ */
    public final void mo4550() {
        this.f11248.dismissPopupMenus();
    }

    @Override // p067l.InterfaceC0867
    /* JADX INFO: renamed from: ۢ */
    public final int mo4551() {
        return this.f11256;
    }

    @Override // p067l.InterfaceC0867
    /* JADX INFO: renamed from: ֫ */
    public final void mo4543(int i) {
        View view;
        int i2 = this.f11256 ^ i;
        this.f11256 = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            C1326 c1326 = this.f11248;
            if (i3 != 0) {
                if ((i & 4) != 0) {
                    m10479();
                }
                if ((this.f11256 & 4) != 0) {
                    Drawable drawable = this.f11251;
                    if (drawable == null) {
                        drawable = this.f11257;
                    }
                    c1326.setNavigationIcon(drawable);
                } else {
                    c1326.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                m10480();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    c1326.setTitle(this.f11254);
                    c1326.setSubtitle(this.f11250);
                } else {
                    c1326.setTitle((CharSequence) null);
                    c1326.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f11252) == null) {
                return;
            }
            if ((i & 16) != 0) {
                c1326.addView(view);
            } else {
                c1326.removeView(view);
            }
        }
    }

    @Override // p067l.InterfaceC0867
    /* JADX INFO: renamed from: ֫ */
    public final void mo4548(boolean z) {
        this.f11248.setCollapsible(z);
    }

    @Override // p067l.InterfaceC0867
    /* JADX INFO: renamed from: ֫ */
    public final C1612 mo4542(int i, long j) {
        C1612 c1612M43544 = C1717.m43544(this.f11248);
        c1612M43544.m38759(i == 0 ? 1.0f : 0.0f);
        c1612M43544.m38760(j);
        c1612M43544.m38762(new C1641(this, i));
        return c1612M43544;
    }

    @Override // p067l.InterfaceC0867
    /* JADX INFO: renamed from: ֫ */
    public final void mo4544(Drawable drawable) {
        this.f11251 = drawable;
        int i = this.f11256 & 4;
        C1326 c1326 = this.f11248;
        if (i == 0) {
            c1326.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = this.f11257;
        }
        c1326.setNavigationIcon(drawable);
    }

    /* JADX INFO: renamed from: ۖ */
    private void m10479() {
        if ((this.f11256 & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f11253);
            C1326 c1326 = this.f11248;
            if (zIsEmpty) {
                c1326.setNavigationContentDescription(this.f11255);
            } else {
                c1326.setNavigationContentDescription(this.f11253);
            }
        }
    }

    @Override // p067l.InterfaceC0867
    public final void setVisibility(int i) {
        this.f11248.setVisibility(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10481(InterfaceC1714 interfaceC1714, InterfaceC1834 interfaceC1834) {
        this.f11248.setMenuCallbacks(interfaceC1714, interfaceC1834);
    }

    /* JADX INFO: renamed from: ۡ */
    public final Menu m10482() {
        return this.f11248.getMenu();
    }
}
