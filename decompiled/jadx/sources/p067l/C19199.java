package p067l;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ᩳ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19199 {

    /* JADX INFO: renamed from: ֫ */
    public String f57378;

    /* JADX INFO: renamed from: ۧ */
    public long f57379;

    /* JADX INFO: renamed from: ܳ */
    public long f57380;

    /* JADX INFO: renamed from: ܿ */
    public volatile boolean f57382;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ViewOnClickListenerC20541 f57384;

    /* JADX INFO: renamed from: ܽ */
    public final AtomicInteger f57381 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ᩳ */
    public final Object f57383 = new Object();

    /* JADX INFO: renamed from: ֫ */
    public final void m43685(String str) {
        C13045.m29867(str, "name");
        ViewOnClickListenerC20541 viewOnClickListenerC20541 = this.f57384;
        Iterator it = viewOnClickListenerC20541.f63491.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (C13045.m29864((Object) ((InterfaceC19370) it.next()).getName(), (Object) str)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        ((InterfaceC19370) viewOnClickListenerC20541.f63491.get(i2)).mo39142(true);
        C14366 c14366 = viewOnClickListenerC20541.f63489;
        if (c14366 == null) {
            C13045.m29866("adapter");
            throw null;
        }
        c14366.notifyItemChanged(i2);
        int iM43682 = m43682();
        C4694 c4694 = viewOnClickListenerC20541.f63495;
        if (c4694 == null) {
            C13045.m29866("recyclerView");
            throw null;
        }
        int iM9947 = c4694.m9947() - 1;
        if (5 >= iM9947) {
            iM9947 = 5;
        }
        if (i2 >= iM43682 && iM43682 + iM9947 > i2) {
            i = iM43682;
        } else if (i2 >= iM9947) {
            i = i2;
        }
        m43683(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43686(ViewOnClickListenerC12355 viewOnClickListenerC12355) {
        C13045.m29867(viewOnClickListenerC12355, "holder");
        if (System.currentTimeMillis() - this.f57380 < 300) {
            viewOnClickListenerC12355.itemView.setAlpha(0.0f);
            C18514.m42063(viewOnClickListenerC12355.itemView, 0.0f, 1.0f).m30122();
        }
        String str = this.f57378;
        if (str != null && System.currentTimeMillis() - this.f57379 > 800) {
            str = null;
        }
        if (str != null) {
            if (str.equals(viewOnClickListenerC12355.m28439().getName())) {
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(C23223.f72995 & C23223.m51761(553648127, 620756991)), new ColorDrawable(0)});
                transitionDrawable.setCrossFadeEnabled(true);
                viewOnClickListenerC12355.m28438().setBackground(transitionDrawable);
                transitionDrawable.startTransition(EnumC5674.f13824);
                this.f57378 = null;
                return;
            }
            if (viewOnClickListenerC12355.m28438().getBackground() != null) {
                viewOnClickListenerC12355.m28438().setBackground(null);
            }
        }
    }

    public C19199(ViewOnClickListenerC20541 viewOnClickListenerC20541) {
        this.f57384 = viewOnClickListenerC20541;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m43682() {
        C4694 c4694 = this.f57384.f63495;
        if (c4694 != null) {
            return c4694.m9943();
        }
        C13045.m29866("recyclerView");
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43683(int i) {
        C4694 c4694 = this.f57384.f63495;
        if (c4694 != null) {
            c4694.m9945(i);
        } else {
            C13045.m29866("recyclerView");
            throw null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43681(ViewOnClickListenerC20541 viewOnClickListenerC20541, final C19199 c19199) {
        AbstractC9381 lifecycle = viewOnClickListenerC20541.getLifecycle();
        C13045.m29865(lifecycle, "<get-lifecycle>(...)");
        C22179 c22179 = C22179.f70167;
        while (lifecycle.mo21805() != EnumC15415.DESTROYED) {
            try {
                C4694 c4694 = viewOnClickListenerC20541.f63495;
                if (c4694 == null) {
                    C13045.m29866("recyclerView");
                    throw null;
                }
                if (!c4694.m9949() && !c19199.f57382 && lifecycle.mo21805().m35142(EnumC15415.STARTED)) {
                    C4694 c4695 = viewOnClickListenerC20541.f63495;
                    if (c4695 != null) {
                        int iM9943 = c4695.m9943();
                        List list = viewOnClickListenerC20541.f63491;
                        int i = c19199.f57381.get();
                        if (iM9943 < 0 || iM9943 >= list.size()) {
                            SystemClock.sleep(50L);
                        } else {
                            int size = list.size();
                            int i2 = iM9943;
                            while (true) {
                                if (i2 >= size) {
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 < iM9943) {
                                            C4694 c4696 = viewOnClickListenerC20541.f63495;
                                            if (c4696 == null) {
                                                C13045.m29866("recyclerView");
                                                throw null;
                                            }
                                            if (c4696.m9949() || c19199.f57382 || i != c19199.f57381.get()) {
                                                break;
                                                break;
                                                break;
                                            }
                                            C4694 c4697 = viewOnClickListenerC20541.f63495;
                                            if (c4697 == null) {
                                                C13045.m29866("recyclerView");
                                                throw null;
                                            }
                                            if (iM9943 != c4697.m9943()) {
                                                break;
                                            }
                                            InterfaceC19370 interfaceC19370 = (InterfaceC19370) list.get(i3);
                                            int iMo39150 = interfaceC19370.mo39150();
                                            if (iMo39150 != 0) {
                                                C13596 c13596Mo11392 = c22179.mo11392((AbstractC18422) null, interfaceC19370, iMo39150);
                                                C13045.m29865(c13596Mo11392, "loadDataIcon(...)");
                                                interfaceC19370.mo39132(c13596Mo11392);
                                                C4694 c4698 = viewOnClickListenerC20541.f63495;
                                                if (c4698 == null) {
                                                    C13045.m29866("recyclerView");
                                                    throw null;
                                                }
                                                c4698.post(new RunnableC24031(c19199, interfaceC19370, 1));
                                            }
                                            if (lifecycle.mo21805() == EnumC15415.DESTROYED) {
                                                return;
                                            } else {
                                                i3++;
                                            }
                                        } else {
                                            while (i == c19199.f57381.get()) {
                                                synchronized (c19199.f57383) {
                                                    c19199.f57383.wait(1000L);
                                                    C10027 c10027 = C10027.f27775;
                                                }
                                                if (lifecycle.mo21805() == EnumC15415.DESTROYED) {
                                                    return;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                } else {
                                    C4694 c4699 = viewOnClickListenerC20541.f63495;
                                    if (c4699 == null) {
                                        C13045.m29866("recyclerView");
                                        throw null;
                                    }
                                    if (c4699.m9949() || c19199.f57382 || i != c19199.f57381.get()) {
                                        break;
                                        break;
                                        break;
                                    }
                                    C4694 c46910 = viewOnClickListenerC20541.f63495;
                                    if (c46910 == null) {
                                        C13045.m29866("recyclerView");
                                        throw null;
                                    }
                                    if (iM9943 != c46910.m9943()) {
                                        break;
                                    }
                                    final InterfaceC19370 interfaceC19371 = (InterfaceC19370) list.get(i2);
                                    int iMo39151 = interfaceC19371.mo39150();
                                    if (iMo39151 != 0) {
                                        C13596 c13596Mo11393 = c22179.mo11392((AbstractC18422) null, interfaceC19371, iMo39151);
                                        C13045.m29865(c13596Mo11393, "loadDataIcon(...)");
                                        interfaceC19371.mo39132(c13596Mo11393);
                                        C4694 c46911 = viewOnClickListenerC20541.f63495;
                                        if (c46911 == null) {
                                            C13045.m29866("recyclerView");
                                            throw null;
                                        }
                                        c46911.post(new Runnable() { // from class: l.ܽ֡᩷
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                this.f53295.m43687(interfaceC19371);
                                            }
                                        });
                                    }
                                    if (lifecycle.mo21805() == EnumC15415.DESTROYED) {
                                        return;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        }
                    } else {
                        C13045.m29866("recyclerView");
                        throw null;
                    }
                } else {
                    SystemClock.sleep(50L);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43687(InterfaceC19370 interfaceC19370) {
        ViewOnClickListenerC20541 viewOnClickListenerC20541 = this.f57384;
        C4694 c4694 = viewOnClickListenerC20541.f63495;
        if (c4694 == null) {
            C13045.m29866("recyclerView");
            throw null;
        }
        int childCount = c4694.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C4694 c4695 = viewOnClickListenerC20541.f63495;
            if (c4695 == null) {
                C13045.m29866("recyclerView");
                throw null;
            }
            View childAt = c4695.getChildAt(i);
            if (childAt != null) {
                C4694 c4696 = viewOnClickListenerC20541.f63495;
                if (c4696 == null) {
                    C13045.m29866("recyclerView");
                    throw null;
                }
                AbstractC5462 childViewHolder = c4696.getChildViewHolder(childAt);
                C13045.m29862((Object) childViewHolder, "null cannot be cast to non-null type bin.mt.plus.FilePickerActivity.FileListHolder");
                ViewOnClickListenerC12355 viewOnClickListenerC12355 = (ViewOnClickListenerC12355) childViewHolder;
                C13596 icon = interfaceC19370.getIcon();
                if (viewOnClickListenerC12355.m28439() == interfaceC19370 && icon != null) {
                    ImageView imageViewM28441 = viewOnClickListenerC12355.m28441();
                    Drawable drawable = imageViewM28441.getDrawable();
                    if (drawable == null) {
                        drawable = new ColorDrawable(0);
                    }
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, icon.m30927()});
                    transitionDrawable.setCrossFadeEnabled(true);
                    imageViewM28441.setImageDrawable(transitionDrawable);
                    transitionDrawable.startTransition(300);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43688(boolean z) {
        this.f57382 = true;
        this.f57381.incrementAndGet();
        C22179 c22179 = C22179.f70167;
        for (InterfaceC19370 interfaceC19370 : this.f57384.f63491) {
            if (interfaceC19370.getIcon() == null) {
                interfaceC19370.mo39133(c22179.mo13204(interfaceC19370));
                int iMo11393 = c22179.mo11393(interfaceC19370);
                if (iMo11393 != 0) {
                    interfaceC19370.mo39140(iMo11393);
                }
            }
        }
        if (z) {
            this.f57380 = System.currentTimeMillis();
        }
        C14366 c14366 = this.f57384.f63489;
        if (c14366 == null) {
            C13045.m29866("adapter");
            throw null;
        }
        c14366.notifyDataSetChanged();
        this.f57382 = false;
        synchronized (this.f57383) {
            this.f57383.notifyAll();
            C10027 c10027 = C10027.f27775;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX INFO: renamed from: ֫ */
    public final void m43684(Integer num, String str) {
        Object next;
        if (str != null) {
            ViewOnClickListenerC20541 viewOnClickListenerC20541 = this.f57384;
            List list = viewOnClickListenerC20541.f63491;
            C13045.m29867(list, "<this>");
            Iterator it = new C20281(new C8881(list)).iterator();
            while (true) {
                C20952 c20952 = (C20952) it;
                if (!c20952.hasNext()) {
                    next = null;
                    break;
                }
                next = c20952.next();
                InterfaceC19370 interfaceC19370 = (InterfaceC19370) ((C6199) next).m14048();
                if (interfaceC19370.isDirectory() && C13045.m29864((Object) interfaceC19370.getName(), (Object) str)) {
                    break;
                }
            }
            C6199 c6199 = (C6199) next;
            int iM14049 = c6199 != null ? c6199.m14049() : 0;
            C4694 c4694 = viewOnClickListenerC20541.f63495;
            if (c4694 == null) {
                C13045.m29866("recyclerView");
                throw null;
            }
            int iM9947 = c4694.m9947() - 1;
            if (5 >= iM9947) {
                iM9947 = 5;
            }
            if (num == null) {
                num = Integer.valueOf(iM14049);
                if (iM14049 < iM9947) {
                    num = 0;
                }
            } else if (iM14049 < num.intValue() || num.intValue() + iM9947 <= iM14049) {
                num = Integer.valueOf(iM14049);
                if (iM14049 < iM9947) {
                    num = 0;
                }
            }
        } else if (num == null) {
            num = 0;
        }
        m43683(num.intValue());
        if (str != null) {
            this.f57378 = str;
            this.f57379 = System.currentTimeMillis();
        }
    }
}
