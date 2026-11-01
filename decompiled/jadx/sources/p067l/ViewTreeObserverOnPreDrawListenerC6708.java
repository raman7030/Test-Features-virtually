package p067l;

import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۙۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnPreDrawListenerC6708 implements ViewTreeObserver.OnPreDrawListener, InterfaceC18749 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C14084 f17402;

    /* JADX INFO: renamed from: ۙ */
    public final List f17403;

    /* JADX INFO: renamed from: ۬ */
    public final int f17404;

    /* JADX INFO: renamed from: ᩶ */
    public final C5367 f17405;

    /* JADX INFO: renamed from: ᩸ */
    public final String f17406;

    /* JADX INFO: renamed from: ᩹ */
    public final String f17407;

    public ViewTreeObserverOnPreDrawListenerC6708(C14084 c14084, int i, String str, String str2, List list) {
        this.f17402 = c14084;
        this.f17405 = new C5367(c14084);
        this.f17404 = i;
        this.f17407 = str;
        this.f17406 = str2;
        this.f17403 = list == null ? Collections.EMPTY_LIST : new ArrayList(list);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        String str;
        C14084 c14084 = this.f17402;
        AbstractC18422 abstractC18422M41270 = c14084.f39931.m41270();
        if (abstractC18422M41270.m41987() != this.f17404 || !C12826.equals(abstractC18422M41270.m41982(), this.f17407)) {
            m15305();
            return true;
        }
        if (c14084.f39931.m41282().getLifecycle().mo21805().m35142(EnumC15415.RESUMED) && !c14084.f39931.m41266()) {
            List list = this.f17403;
            if (!list.isEmpty()) {
                m15305();
                c14084.f39931.m41227((Collection) list, true);
                return true;
            }
            List listM41240 = c14084.f39931.m41240();
            int i = 0;
            while (true) {
                int size = listM41240.size();
                str = this.f17406;
                if (i >= size) {
                    i = -1;
                    break;
                }
                InterfaceC19370 interfaceC19370 = (InterfaceC19370) listM41240.get(i);
                if (!interfaceC19370.mo39147() && !interfaceC19370.isDirectory() && interfaceC19370.getPath().equals(str)) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                m15305();
                return true;
            }
            if (!this.f17405.m11628(i)) {
                return false;
            }
            c14084.m31985(str);
            m15305();
        }
        return true;
    }

    @Override // p067l.InterfaceC18749
    /* JADX INFO: renamed from: ֫ */
    public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
        if (enumC24133 == EnumC24133.ON_DESTROY) {
            m15305();
        } else if (enumC24133 == EnumC24133.ON_RESUME) {
            this.f17402.f39912.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m15305() {
        C14084 c14084 = this.f17402;
        c14084.f39912.getViewTreeObserver().removeOnPreDrawListener(this);
        c14084.f39931.m41282().getLifecycle().mo21807(this);
        if (c14084.f39918 == this) {
            c14084.f39918 = null;
        }
    }
}
