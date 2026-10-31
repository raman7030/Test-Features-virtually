package l;

import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۢۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB32 */
/* JADX INFO: loaded from: classes3.dex */
public class C9344 extends AbstractC5447 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C5242 f28364;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final C5242 f28365;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f28366;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final C5242 f28367;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f28368;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C5242 f28369;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f28370;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C5242 f28371;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final C5242 f28372;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f28373;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C5242 f28374;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C5242 f28375;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5242 f28376;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C5242 f28377;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5242 f28378;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5242 f28379;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final C5242 f28380;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final C5242 f28381;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final C5242 f28382;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C5242 f28383;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C5242 f28384;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public C22372 f28385;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C5242 f28386;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final C5242 f28387;

    public C9344() {
        Boolean bool = Boolean.FALSE;
        this.f28382 = new C5242(bool);
        this.f28368 = true;
        this.f28378 = new C5242(bool);
        this.f28379 = new C5242(bool);
        this.f28386 = new C5242(bool);
        this.f28381 = new C5242(bool);
        this.f28374 = new C5242(bool);
        this.f28372 = new C5242(bool);
        this.f28365 = new C5242(bool);
        this.f28383 = new C5242(bool);
        this.f28371 = new C5242(bool);
        this.f28367 = new C5242(Boolean.TRUE);
        this.f28387 = new C5242(bool);
        this.f28376 = new C5242(bool);
        this.f28384 = new C5242(bool);
        this.f28377 = new C5242(bool);
        this.f28369 = new C5242(bool);
        this.f28375 = new C5242();
        this.f28364 = new C5242(0);
        this.f28380 = new C5242();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24107(C22372 c22372) {
        C22372 c22373 = this.f28385;
        if (c22373 == c22372) {
            return;
        }
        boolean z = c22373 != null;
        this.f28385 = c22372;
        this.f28370 = false;
        this.f28373 = false;
        this.f28378.mo1669(Boolean.valueOf(this.f28366));
        if (z) {
            this.f28368 = true;
            this.f28382.mo1669(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24114(C22372 c22372, boolean z) {
        if (this.f28385 == c22372) {
            if (!z) {
                this.f28370 = false;
            }
            this.f28373 = false;
            this.f28378.mo1669(Boolean.valueOf(this.f28366));
            this.f28368 = true;
            this.f28382.mo1669(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m24135(C22372 c22372) {
        if (this.f28385 == c22372 && m24142()) {
            this.f28373 = true;
            Boolean bool = Boolean.TRUE;
            this.f28382.mo1669(bool);
            this.f28378.mo1669(bool);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24126(C22372 c22372) {
        if (this.f28385 == c22372) {
            this.f28370 = true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24110(C22372 c22372, View view, C12392 c12392) {
        this.f28382.m1668(c22372.getViewLifecycleOwner(), new C6521(this, c12392, view, 0));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24106(C16021 c16021) {
        this.f28382.m1665((InterfaceC1008) c16021);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24125(C16021 c16021) {
        this.f28382.m1670((InterfaceC1008) c16021);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m24142() {
        return this.f28370 || ((Boolean) this.f28382.m1662()).booleanValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24111(C22372 c22372, ProgressBar progressBar) {
        this.f28378.m1668(c22372.getViewLifecycleOwner(), new C14281(0, progressBar));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24116(boolean z) {
        this.f28366 = z;
        this.f28378.mo1669(Boolean.valueOf(z || this.f28373));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24115(C22372 c22372, MenuItem... menuItemArr) {
        this.f28379.m1668(c22372.getViewLifecycleOwner(), new C17104(0, menuItemArr));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24130(C22372 c22372, final MenuItem... menuItemArr) {
        this.f28379.m1668(c22372.getViewLifecycleOwner(), new InterfaceC1008() { // from class: l.᩷ۘᩳ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                Boolean bool = (Boolean) obj;
                for (MenuItem menuItem : menuItemArr) {
                    menuItem.setVisible(bool.booleanValue());
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24113(C22372 c22372, C20550 c20550) {
        this.f28379.m1668(c22372.getViewLifecycleOwner(), c20550);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m24147(boolean z) {
        this.f28379.mo1669(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m24138(C22372 c22372, MenuItem menuItem) {
        m24103(c22372, menuItem, this.f28386);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m24133(boolean z) {
        this.f28386.mo1669(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24144(C22372 c22372, MenuItem menuItem) {
        m24103(c22372, menuItem, this.f28381);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m24117(boolean z) {
        this.f28381.mo1669(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24127(C22372 c22372, MenuItem menuItem) {
        m24103(c22372, menuItem, this.f28374);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m24137(boolean z) {
        this.f28374.mo1669(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m24119(C22372 c22372, MenuItem menuItem) {
        m24103(c22372, menuItem, this.f28372);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m24134(boolean z) {
        this.f28372.mo1669(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m24122(C22372 c22372, MenuItem menuItem) {
        m24102(c22372, menuItem, this.f28365);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m24118(boolean z) {
        C5242 c5242 = this.f28365;
        if (((Boolean) c5242.m1662()).booleanValue() != z) {
            c5242.mo1669(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m24132(C22372 c22372, MenuItem menuItem) {
        m24102(c22372, menuItem, this.f28383);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m24123(boolean z) {
        C5242 c5242 = this.f28383;
        if (((Boolean) c5242.m1662()).booleanValue() != z) {
            c5242.mo1669(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24109(C22372 c22372, final MenuItem menuItem, final MenuItem menuItem2) {
        InterfaceC1008 interfaceC1008 = new InterfaceC1008() { // from class: l.᩻ۘᩳ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                C9344.m24100(this.f75282, menuItem, menuItem2);
            }
        };
        this.f28371.m1668(c22372.getViewLifecycleOwner(), interfaceC1008);
        this.f28367.m1668(c22372.getViewLifecycleOwner(), interfaceC1008);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24100(C9344 c9344, MenuItem menuItem, MenuItem menuItem2) {
        C5242 c5242 = c9344.f28367;
        C5242 c5243 = c9344.f28371;
        boolean z = false;
        boolean z2 = ((Boolean) c5243.m1662()).booleanValue() && ((Boolean) c5242.m1662()).booleanValue();
        if (menuItem.isVisible() != z2) {
            menuItem.setVisible(z2);
        }
        if (((Boolean) c5243.m1662()).booleanValue() && !((Boolean) c5242.m1662()).booleanValue()) {
            z = true;
        }
        if (menuItem2.isVisible() != z) {
            menuItem2.setVisible(z);
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m24120(boolean z) {
        this.f28371.mo1669(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m24143(boolean z) {
        this.f28367.mo1669(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m24146(C22372 c22372, MenuItem menuItem) {
        m24102(c22372, menuItem, this.f28387);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m24121(boolean z) {
        C5242 c5242 = this.f28387;
        if (((Boolean) c5242.m1662()).booleanValue() != z) {
            c5242.mo1669(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m24139(boolean z) {
        C5242 c5242 = this.f28376;
        if (((Boolean) c5242.m1662()).booleanValue() != z) {
            c5242.mo1669(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24128(C22372 c22372, MenuItem menuItem, MenuItem menuItem2) {
        this.f28384.m1668(c22372.getViewLifecycleOwner(), new C17810(0, menuItem, menuItem2));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24145(boolean z) {
        C5242 c5242 = this.f28384;
        if (((Boolean) c5242.m1662()).booleanValue() != z) {
            c5242.mo1669(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24108(C22372 c22372, MenuItem menuItem) {
        m24102(c22372, menuItem, this.f28377);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24131(boolean z) {
        C5242 c5242 = this.f28377;
        if (((Boolean) c5242.m1662()).booleanValue() != z) {
            c5242.mo1669(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m24136(C22372 c22372, MenuItem menuItem) {
        m24102(c22372, menuItem, this.f28369);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m24141(boolean z) {
        C5242 c5242 = this.f28369;
        if (((Boolean) c5242.m1662()).booleanValue() != z) {
            c5242.mo1669(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24112(C22372 c22372, TextView textView) {
        InterfaceC23586 viewLifecycleOwner = c22372.getViewLifecycleOwner();
        C11003.requireNonNull(textView);
        this.f28375.m1668(viewLifecycleOwner, new C14531(1, textView));
        this.f28364.m1668(c22372.getViewLifecycleOwner(), new C20799(textView));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24105(String str) {
        C5242 c5242 = this.f28375;
        if (C11003.equals(c5242.m1662(), str)) {
            return;
        }
        c5242.mo1669(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24104(int i) {
        C5242 c5242 = this.f28364;
        if (((Integer) c5242.m1662()).intValue() != i) {
            c5242.mo1669(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24129(C22372 c22372, TextView textView) {
        InterfaceC23586 viewLifecycleOwner = c22372.getViewLifecycleOwner();
        C11003.requireNonNull(textView);
        this.f28380.m1668(viewLifecycleOwner, new C14531(1, textView));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24124(String str) {
        C5242 c5242 = this.f28380;
        if (C11003.equals(c5242.m1662(), str)) {
            return;
        }
        c5242.mo1669(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m24103(C22372 c22372, MenuItem menuItem, C5242 c5242) {
        InterfaceC23586 viewLifecycleOwner = c22372.getViewLifecycleOwner();
        C11003.requireNonNull(menuItem);
        c5242.m1668(viewLifecycleOwner, new C19323(menuItem));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24102(C22372 c22372, MenuItem menuItem, C5242 c5242) {
        InterfaceC23586 viewLifecycleOwner = c22372.getViewLifecycleOwner();
        C11003.requireNonNull(menuItem);
        c5242.m1668(viewLifecycleOwner, new C16564(0, menuItem));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m24140(C22372 c22372, MenuItem menuItem) {
        InterfaceC23586 viewLifecycleOwner = c22372.getViewLifecycleOwner();
        C11003.requireNonNull(menuItem);
        this.f28376.m1668(viewLifecycleOwner, new C22222(1, menuItem));
    }
}
