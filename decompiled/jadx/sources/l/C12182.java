package l;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.SystemClock;
import android.widget.ImageView;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.۫ۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4UF */
/* JADX INFO: loaded from: classes3.dex */
public final class C12182 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f36324;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC17889 f36325;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final LinkedList f36326 = new LinkedList();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f36327;

    public C12182(InterfaceC17889 interfaceC17889, String str) {
        this.f36325 = interfaceC17889;
        this.f36327 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17889 m29658() {
        return this.f36325;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29659(C9555 c9555) {
        this.f36325 = c9555;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m29662() {
        return this.f36327;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m29661() {
        return this.f36325.getName();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m29663() {
        return C9523.m24393(this.f36327, this.f36325.getName());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29660(final AbstractC16891 abstractC16891, ImageView imageView, ExecutorService executorService, final C9503 c9503) {
        imageView.setTag(this);
        synchronized (this.f36326) {
            this.f36326.add(imageView);
        }
        final InterfaceC10834 interfaceC10834Mo14827 = abstractC16891.mo14827();
        if (this.f36325.getIcon() != null) {
            imageView.setImageDrawable(this.f36325.getIcon().m28878());
            return;
        }
        final C11813 c11813 = interfaceC10834Mo14827.mo11258(this.f36325).f64250;
        imageView.setImageDrawable(c11813.m28878());
        final int iMo9351 = interfaceC10834Mo14827.mo9351(this.f36325);
        if (iMo9351 == 0) {
            this.f36325.mo36966(c11813);
        } else {
            executorService.execute(new Runnable() { // from class: l.ۙۙܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C12182.m29655(this.f14140, c9503, interfaceC10834Mo14827, abstractC16891, iMo9351, c11813);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29655(C12182 c12182, C9503 c9503, InterfaceC10834 interfaceC10834, AbstractC16891 abstractC16891, int i, C11813 c11813) {
        while (c9503.m24358()) {
            SystemClock.sleep(10L);
            if (!c12182.m29657()) {
                return;
            }
            int i2 = C17648.f53953;
            if (!c9503.isAttachedToWindow()) {
                return;
            }
        }
        C11813 c11813Mo9350 = interfaceC10834.mo9350(abstractC16891, c12182.f36325, i);
        c12182.f36325.mo36966(c11813Mo9350);
        if (c11813Mo9350 == c11813 || !c12182.m29657()) {
            return;
        }
        final C12887 c12887 = new C12887();
        c12887.f38682 = c12182;
        C4925.m14315(new Runnable() { // from class: l.ۗۙܳ
            @Override // java.lang.Runnable
            public final void run() {
                C12887 c12888 = c12887;
                if (c12888.f38682.m29657()) {
                    synchronized (c12888.f38682.f36326) {
                        for (ImageView imageView : c12888.f38682.f36326) {
                            Drawable drawable = imageView.getDrawable();
                            if (drawable == null) {
                                drawable = new ColorDrawable(0);
                            }
                            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, c12888.f38682.m29658().getIcon().m28878()});
                            transitionDrawable.setCrossFadeEnabled(true);
                            imageView.setImageDrawable(transitionDrawable);
                            transitionDrawable.startTransition(300);
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean m29657() {
        if (this.f36326.isEmpty()) {
            return false;
        }
        synchronized (this.f36326) {
            ListIterator listIterator = this.f36326.listIterator();
            while (listIterator.hasNext()) {
                if (((ImageView) listIterator.next()).getTag() != this) {
                    listIterator.remove();
                }
            }
        }
        return !this.f36326.isEmpty();
    }
}
