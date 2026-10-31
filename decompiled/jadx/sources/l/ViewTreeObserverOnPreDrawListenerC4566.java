package l;

import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۙۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnPreDrawListenerC4566 implements ViewTreeObserver.OnPreDrawListener, InterfaceC17236 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12327 f14573;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f14574;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f14575;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3155 f14576;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f14577;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f14578;

    public ViewTreeObserverOnPreDrawListenerC4566(C12327 c12327, int i, String str, String str2, List list) {
        this.f14573 = c12327;
        this.f14576 = new C3155(c12327);
        this.f14575 = i;
        this.f14578 = str;
        this.f14577 = str2;
        this.f14574 = list == null ? Collections.EMPTY_LIST : new ArrayList(list);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        String str;
        C12327 c12327 = this.f14573;
        AbstractC16891 abstractC16891M39044 = c12327.f36917.m39044();
        if (abstractC16891M39044.m39746() != this.f14575 || !C11003.equals(abstractC16891M39044.m39741(), this.f14578)) {
            m13417();
            return true;
        }
        if (c12327.f36917.m39056().getLifecycle().mo19832().m33028(EnumC13728.RESUMED) && !c12327.f36917.m39040()) {
            List list = this.f14574;
            if (!list.isEmpty()) {
                m13417();
                c12327.f36917.m39001((Collection) list, true);
                return true;
            }
            List listM39014 = c12327.f36917.m39014();
            int i = 0;
            while (true) {
                int size = listM39014.size();
                str = this.f14577;
                if (i >= size) {
                    i = -1;
                    break;
                }
                InterfaceC17889 interfaceC17889 = (InterfaceC17889) listM39014.get(i);
                if (!interfaceC17889.mo36981() && !interfaceC17889.isDirectory() && interfaceC17889.getPath().equals(str)) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                m13417();
                return true;
            }
            if (!this.f14576.m9584(i)) {
                return false;
            }
            c12327.m29925(str);
            m13417();
        }
        return true;
    }

    @Override // l.InterfaceC17236
    /* JADX INFO: renamed from: ֫ */
    public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
        if (enumC22901 == EnumC22901.ON_DESTROY) {
            m13417();
        } else if (enumC22901 == EnumC22901.ON_RESUME) {
            this.f14573.f36898.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m13417() {
        C12327 c12327 = this.f14573;
        c12327.f36898.getViewTreeObserver().removeOnPreDrawListener(this);
        c12327.f36917.m39056().getLifecycle().mo19834(this);
        if (c12327.f36904 == this) {
            c12327.f36904 = null;
        }
    }
}
