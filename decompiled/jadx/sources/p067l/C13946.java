package p067l;

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
public final class C13946 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f39335;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC19370 f39336;

    /* JADX INFO: renamed from: ܽ */
    public final LinkedList f39337 = new LinkedList();

    /* JADX INFO: renamed from: ᩳ */
    public final String f39338;

    public C13946(InterfaceC19370 interfaceC19370, String str) {
        this.f39336 = interfaceC19370;
        this.f39338 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19370 m31720() {
        return this.f39336;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31721(C11450 c11450) {
        this.f39336 = c11450;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m31724() {
        return this.f39338;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m31723() {
        return this.f39336.getName();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m31725() {
        return C11419.m26403(this.f39338, this.f39336.getName());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31722(final AbstractC18422 abstractC18422, ImageView imageView, ExecutorService executorService, final C11400 c11400) {
        imageView.setTag(this);
        synchronized (this.f39337) {
            this.f39337.add(imageView);
        }
        final InterfaceC12665 interfaceC12665Mo16735 = abstractC18422.mo16735();
        if (this.f39336.getIcon() != null) {
            imageView.setImageDrawable(this.f39336.getIcon().m30927());
            return;
        }
        final C13596 c13596 = interfaceC12665Mo16735.mo13204(this.f39336).f66886;
        imageView.setImageDrawable(c13596.m30927());
        final int iMo11393 = interfaceC12665Mo16735.mo11393(this.f39336);
        if (iMo11393 == 0) {
            this.f39336.mo39132(c13596);
        } else {
            executorService.execute(new Runnable() { // from class: l.ۙۙܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C13946.m31717(this.f16956, c11400, interfaceC12665Mo16735, abstractC18422, iMo11393, c13596);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31717(C13946 c13946, C11400 c11400, InterfaceC12665 interfaceC12665, AbstractC18422 abstractC18422, int i, C13596 c13596) {
        while (c11400.m26368()) {
            SystemClock.sleep(10L);
            if (!c13946.m31719()) {
                return;
            }
            int i2 = C1717.f57146;
            if (!c11400.isAttachedToWindow()) {
                return;
            }
        }
        C13596 c13596Mo11392 = interfaceC12665.mo11392(abstractC18422, c13946.f39336, i);
        c13946.f39336.mo39132(c13596Mo11392);
        if (c13596Mo11392 == c13596 || !c13946.m31719()) {
            return;
        }
        final C14616 c14616 = new C14616();
        c14616.f41725 = c13946;
        C7050.m16212(new Runnable() { // from class: l.ۗۙܳ
            @Override // java.lang.Runnable
            public final void run() {
                C14616 c14617 = c14616;
                if (c14617.f41725.m31719()) {
                    synchronized (c14617.f41725.f39337) {
                        for (ImageView imageView : c14617.f41725.f39337) {
                            Drawable drawable = imageView.getDrawable();
                            if (drawable == null) {
                                drawable = new ColorDrawable(0);
                            }
                            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, c14617.f41725.m31720().getIcon().m30927()});
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
    /* JADX INFO: renamed from: ܿ */
    public boolean m31719() {
        if (this.f39337.isEmpty()) {
            return false;
        }
        synchronized (this.f39337) {
            ListIterator listIterator = this.f39337.listIterator();
            while (listIterator.hasNext()) {
                if (((ImageView) listIterator.next()).getTag() != this) {
                    listIterator.remove();
                }
            }
        }
        return !this.f39337.isEmpty();
    }
}
