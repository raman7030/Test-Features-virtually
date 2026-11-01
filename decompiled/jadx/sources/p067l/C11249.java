package p067l;

import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۢۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB32 */
/* JADX INFO: loaded from: classes3.dex */
public class C11249 extends AbstractC7545 {

    /* JADX INFO: renamed from: ֫֫ */
    public final C7350 f31313;

    /* JADX INFO: renamed from: ۖ֫ */
    public final C7350 f31314;

    /* JADX INFO: renamed from: ۗ */
    public boolean f31315;

    /* JADX INFO: renamed from: ۘ֫ */
    public final C7350 f31316;

    /* JADX INFO: renamed from: ۙ */
    public boolean f31317;

    /* JADX INFO: renamed from: ۛ */
    public final C7350 f31318;

    /* JADX INFO: renamed from: ۜ֫ */
    public boolean f31319;

    /* JADX INFO: renamed from: ۟ */
    public final C7350 f31320;

    /* JADX INFO: renamed from: ۡ֫ */
    public final C7350 f31321;

    /* JADX INFO: renamed from: ۢ֫ */
    public boolean f31322;

    /* JADX INFO: renamed from: ۤ */
    public final C7350 f31323;

    /* JADX INFO: renamed from: ۧ֫ */
    public final C7350 f31324;

    /* JADX INFO: renamed from: ۨ */
    public final C7350 f31325;

    /* JADX INFO: renamed from: ۫ */
    public final C7350 f31326;

    /* JADX INFO: renamed from: ۬ */
    public final C7350 f31327;

    /* JADX INFO: renamed from: ܰ */
    public final C7350 f31328;

    /* JADX INFO: renamed from: ܳ֫ */
    public final C7350 f31329;

    /* JADX INFO: renamed from: ܺ֫ */
    public final C7350 f31330;

    /* JADX INFO: renamed from: ܽ֫ */
    public final C7350 f31331;

    /* JADX INFO: renamed from: ܿ֫ */
    public final C7350 f31332;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final C7350 f31333;

    /* JADX INFO: renamed from: ᩷֫ */
    public C23631 f31334;

    /* JADX INFO: renamed from: ᩺ */
    public final C7350 f31335;

    /* JADX INFO: renamed from: ᩻֫ */
    public final C7350 f31336;

    public C11249() {
        Boolean bool = Boolean.FALSE;
        this.f31331 = new C7350(bool);
        this.f31317 = true;
        this.f31327 = new C7350(bool);
        this.f31328 = new C7350(bool);
        this.f31335 = new C7350(bool);
        this.f31330 = new C7350(bool);
        this.f31323 = new C7350(bool);
        this.f31321 = new C7350(bool);
        this.f31314 = new C7350(bool);
        this.f31332 = new C7350(bool);
        this.f31320 = new C7350(bool);
        this.f31316 = new C7350(Boolean.TRUE);
        this.f31336 = new C7350(bool);
        this.f31325 = new C7350(bool);
        this.f31333 = new C7350(bool);
        this.f31326 = new C7350(bool);
        this.f31318 = new C7350(bool);
        this.f31324 = new C7350();
        this.f31313 = new C7350(0);
        this.f31329 = new C7350();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26116(C23631 c23631) {
        C23631 c23632 = this.f31334;
        if (c23632 == c23631) {
            return;
        }
        boolean z = c23632 != null;
        this.f31334 = c23631;
        this.f31319 = false;
        this.f31322 = false;
        this.f31327.mo4067(Boolean.valueOf(this.f31315));
        if (z) {
            this.f31317 = true;
            this.f31331.mo4067(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26123(C23631 c23631, boolean z) {
        if (this.f31334 == c23631) {
            if (!z) {
                this.f31319 = false;
            }
            this.f31322 = false;
            this.f31327.mo4067(Boolean.valueOf(this.f31315));
            this.f31317 = true;
            this.f31331.mo4067(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m26144(C23631 c23631) {
        if (this.f31334 == c23631 && m26151()) {
            this.f31322 = true;
            Boolean bool = Boolean.TRUE;
            this.f31331.mo4067(bool);
            this.f31327.mo4067(bool);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26135(C23631 c23631) {
        if (this.f31334 == c23631) {
            this.f31319 = true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26119(C23631 c23631, View view, C14146 c14146) {
        this.f31331.m4066(c23631.getViewLifecycleOwner(), new C8566(this, c14146, view, 0));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26115(C17595 c17595) {
        this.f31331.m4063((InterfaceC3326) c17595);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26134(C17595 c17595) {
        this.f31331.m4068((InterfaceC3326) c17595);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m26151() {
        return this.f31319 || ((Boolean) this.f31331.m4060()).booleanValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26120(C23631 c23631, ProgressBar progressBar) {
        this.f31327.m4066(c23631.getViewLifecycleOwner(), new C15941(0, progressBar));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26125(boolean z) {
        this.f31315 = z;
        this.f31327.mo4067(Boolean.valueOf(z || this.f31322));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26124(C23631 c23631, MenuItem... menuItemArr) {
        this.f31328.m4066(c23631.getViewLifecycleOwner(), new C18624(0, menuItemArr));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26139(C23631 c23631, final MenuItem... menuItemArr) {
        this.f31328.m4066(c23631.getViewLifecycleOwner(), new InterfaceC3326() { // from class: l.᩷ۘᩳ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                Boolean bool = (Boolean) obj;
                for (MenuItem menuItem : menuItemArr) {
                    menuItem.setVisible(bool.booleanValue());
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26122(C23631 c23631, C21899 c21899) {
        this.f31328.m4066(c23631.getViewLifecycleOwner(), c21899);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m26156(boolean z) {
        this.f31328.mo4067(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m26147(C23631 c23631, MenuItem menuItem) {
        m26112(c23631, menuItem, this.f31335);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m26142(boolean z) {
        this.f31335.mo4067(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m26153(C23631 c23631, MenuItem menuItem) {
        m26112(c23631, menuItem, this.f31330);
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m26126(boolean z) {
        this.f31330.mo4067(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26136(C23631 c23631, MenuItem menuItem) {
        m26112(c23631, menuItem, this.f31323);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m26146(boolean z) {
        this.f31323.mo4067(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m26128(C23631 c23631, MenuItem menuItem) {
        m26112(c23631, menuItem, this.f31321);
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m26143(boolean z) {
        this.f31321.mo4067(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m26131(C23631 c23631, MenuItem menuItem) {
        m26111(c23631, menuItem, this.f31314);
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m26127(boolean z) {
        C7350 c7350 = this.f31314;
        if (((Boolean) c7350.m4060()).booleanValue() != z) {
            c7350.mo4067(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m26141(C23631 c23631, MenuItem menuItem) {
        m26111(c23631, menuItem, this.f31332);
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m26132(boolean z) {
        C7350 c7350 = this.f31332;
        if (((Boolean) c7350.m4060()).booleanValue() != z) {
            c7350.mo4067(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26118(C23631 c23631, final MenuItem menuItem, final MenuItem menuItem2) {
        InterfaceC3326 interfaceC3326 = new InterfaceC3326() { // from class: l.᩻ۘᩳ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                C11249.m26109(this.f78029, menuItem, menuItem2);
            }
        };
        this.f31320.m4066(c23631.getViewLifecycleOwner(), interfaceC3326);
        this.f31316.m4066(c23631.getViewLifecycleOwner(), interfaceC3326);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m26109(C11249 c11249, MenuItem menuItem, MenuItem menuItem2) {
        C7350 c7350 = c11249.f31316;
        C7350 c7351 = c11249.f31320;
        boolean z = false;
        boolean z2 = ((Boolean) c7351.m4060()).booleanValue() && ((Boolean) c7350.m4060()).booleanValue();
        if (menuItem.isVisible() != z2) {
            menuItem.setVisible(z2);
        }
        if (((Boolean) c7351.m4060()).booleanValue() && !((Boolean) c7350.m4060()).booleanValue()) {
            z = true;
        }
        if (menuItem2.isVisible() != z) {
            menuItem2.setVisible(z);
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m26129(boolean z) {
        this.f31320.mo4067(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m26152(boolean z) {
        this.f31316.mo4067(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m26155(C23631 c23631, MenuItem menuItem) {
        m26111(c23631, menuItem, this.f31336);
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m26130(boolean z) {
        C7350 c7350 = this.f31336;
        if (((Boolean) c7350.m4060()).booleanValue() != z) {
            c7350.mo4067(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m26148(boolean z) {
        C7350 c7350 = this.f31325;
        if (((Boolean) c7350.m4060()).booleanValue() != z) {
            c7350.mo4067(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26137(C23631 c23631, MenuItem menuItem, MenuItem menuItem2) {
        this.f31333.m4066(c23631.getViewLifecycleOwner(), new C19295(0, menuItem, menuItem2));
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m26154(boolean z) {
        C7350 c7350 = this.f31333;
        if (((Boolean) c7350.m4060()).booleanValue() != z) {
            c7350.mo4067(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26117(C23631 c23631, MenuItem menuItem) {
        m26111(c23631, menuItem, this.f31326);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26140(boolean z) {
        C7350 c7350 = this.f31326;
        if (((Boolean) c7350.m4060()).booleanValue() != z) {
            c7350.mo4067(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m26145(C23631 c23631, MenuItem menuItem) {
        m26111(c23631, menuItem, this.f31318);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m26150(boolean z) {
        C7350 c7350 = this.f31318;
        if (((Boolean) c7350.m4060()).booleanValue() != z) {
            c7350.mo4067(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26121(C23631 c23631, TextView textView) {
        InterfaceC24784 viewLifecycleOwner = c23631.getViewLifecycleOwner();
        C12826.requireNonNull(textView);
        this.f31324.m4066(viewLifecycleOwner, new C16179(1, textView));
        this.f31313.m4066(c23631.getViewLifecycleOwner(), new C22136(textView));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26114(String str) {
        C7350 c7350 = this.f31324;
        if (C12826.equals(c7350.m4060(), str)) {
            return;
        }
        c7350.mo4067(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26113(int i) {
        C7350 c7350 = this.f31313;
        if (((Integer) c7350.m4060()).intValue() != i) {
            c7350.mo4067(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26138(C23631 c23631, TextView textView) {
        InterfaceC24784 viewLifecycleOwner = c23631.getViewLifecycleOwner();
        C12826.requireNonNull(textView);
        this.f31329.m4066(viewLifecycleOwner, new C16179(1, textView));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26133(String str) {
        C7350 c7350 = this.f31329;
        if (C12826.equals(c7350.m4060(), str)) {
            return;
        }
        c7350.mo4067(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m26112(C23631 c23631, MenuItem menuItem, C7350 c7350) {
        InterfaceC24784 viewLifecycleOwner = c23631.getViewLifecycleOwner();
        C12826.requireNonNull(menuItem);
        c7350.m4066(viewLifecycleOwner, new C20733(menuItem));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26111(C23631 c23631, MenuItem menuItem, C7350 c7350) {
        InterfaceC24784 viewLifecycleOwner = c23631.getViewLifecycleOwner();
        C12826.requireNonNull(menuItem);
        c7350.m4066(viewLifecycleOwner, new C18111(0, menuItem));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m26149(C23631 c23631, MenuItem menuItem) {
        InterfaceC24784 viewLifecycleOwner = c23631.getViewLifecycleOwner();
        C12826.requireNonNull(menuItem);
        this.f31325.m4066(viewLifecycleOwner, new C23488(1, menuItem));
    }
}
