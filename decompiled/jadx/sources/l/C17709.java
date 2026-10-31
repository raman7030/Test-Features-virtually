package l;

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
public final class C17709 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f54186;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f54187;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f54188;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile boolean f54190;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19121 f54192;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f54189 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f54191 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41439(String str) {
        C11233.m27805(str, "name");
        ViewOnClickListenerC19121 viewOnClickListenerC19121 = this.f54192;
        Iterator it = viewOnClickListenerC19121.f60259.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (C11233.m27802((Object) ((InterfaceC17889) it.next()).getName(), (Object) str)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        ((InterfaceC17889) viewOnClickListenerC19121.f60259.get(i2)).mo36976(true);
        C12623 c12623 = viewOnClickListenerC19121.f60257;
        if (c12623 == null) {
            C11233.m27804("adapter");
            throw null;
        }
        c12623.notifyItemChanged(i2);
        int iM41436 = m41436();
        C2447 c2447 = viewOnClickListenerC19121.f60263;
        if (c2447 == null) {
            C11233.m27804("recyclerView");
            throw null;
        }
        int iM7899 = c2447.m7899() - 1;
        if (5 >= iM7899) {
            iM7899 = 5;
        }
        if (i2 >= iM41436 && iM41436 + iM7899 > i2) {
            i = iM41436;
        } else if (i2 >= iM7899) {
            i = i2;
        }
        m41437(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41440(ViewOnClickListenerC10507 viewOnClickListenerC10507) {
        C11233.m27805(viewOnClickListenerC10507, "holder");
        if (System.currentTimeMillis() - this.f54188 < 300) {
            viewOnClickListenerC10507.itemView.setAlpha(0.0f);
            C16989.m39820(viewOnClickListenerC10507.itemView, 0.0f, 1.0f).m28077();
        }
        String str = this.f54186;
        if (str != null && System.currentTimeMillis() - this.f54187 > 800) {
            str = null;
        }
        if (str != null) {
            if (str.equals(viewOnClickListenerC10507.m26406().getName())) {
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(C21943.f70284 & C21943.m49424(553648127, 620756991)), new ColorDrawable(0)});
                transitionDrawable.setCrossFadeEnabled(true);
                viewOnClickListenerC10507.m26405().setBackground(transitionDrawable);
                transitionDrawable.startTransition(EnumC3478.f11019);
                this.f54186 = null;
                return;
            }
            if (viewOnClickListenerC10507.m26405().getBackground() != null) {
                viewOnClickListenerC10507.m26405().setBackground(null);
            }
        }
    }

    public C17709(ViewOnClickListenerC19121 viewOnClickListenerC19121) {
        this.f54192 = viewOnClickListenerC19121;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41436() {
        C2447 c2447 = this.f54192.f60263;
        if (c2447 != null) {
            return c2447.m7895();
        }
        C11233.m27804("recyclerView");
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41437(int i) {
        C2447 c2447 = this.f54192.f60263;
        if (c2447 != null) {
            c2447.m7897(i);
        } else {
            C11233.m27804("recyclerView");
            throw null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41435(ViewOnClickListenerC19121 viewOnClickListenerC19121, final C17709 c17709) {
        AbstractC7379 lifecycle = viewOnClickListenerC19121.getLifecycle();
        C11233.m27803(lifecycle, "<get-lifecycle>(...)");
        C20844 c20844 = C20844.f67485;
        while (lifecycle.mo19832() != EnumC13728.DESTROYED) {
            try {
                C2447 c2447 = viewOnClickListenerC19121.f60263;
                if (c2447 == null) {
                    C11233.m27804("recyclerView");
                    throw null;
                }
                if (!c2447.m7901() && !c17709.f54190 && lifecycle.mo19832().m33028(EnumC13728.STARTED)) {
                    C2447 c2448 = viewOnClickListenerC19121.f60263;
                    if (c2448 != null) {
                        int iM7895 = c2448.m7895();
                        List list = viewOnClickListenerC19121.f60259;
                        int i = c17709.f54189.get();
                        if (iM7895 < 0 || iM7895 >= list.size()) {
                            SystemClock.sleep(50L);
                        } else {
                            int size = list.size();
                            int i2 = iM7895;
                            while (true) {
                                if (i2 >= size) {
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 < iM7895) {
                                            C2447 c2449 = viewOnClickListenerC19121.f60263;
                                            if (c2449 == null) {
                                                C11233.m27804("recyclerView");
                                                throw null;
                                            }
                                            if (c2449.m7901() || c17709.f54190 || i != c17709.f54189.get()) {
                                                break;
                                                break;
                                                break;
                                            }
                                            C2447 c24410 = viewOnClickListenerC19121.f60263;
                                            if (c24410 == null) {
                                                C11233.m27804("recyclerView");
                                                throw null;
                                            }
                                            if (iM7895 != c24410.m7895()) {
                                                break;
                                            }
                                            InterfaceC17889 interfaceC17889 = (InterfaceC17889) list.get(i3);
                                            int iMo36984 = interfaceC17889.mo36984();
                                            if (iMo36984 != 0) {
                                                C11813 c11813Mo9350 = c20844.mo9350((AbstractC16891) null, interfaceC17889, iMo36984);
                                                C11233.m27803(c11813Mo9350, "loadDataIcon(...)");
                                                interfaceC17889.mo36966(c11813Mo9350);
                                                C2447 c24411 = viewOnClickListenerC19121.f60263;
                                                if (c24411 == null) {
                                                    C11233.m27804("recyclerView");
                                                    throw null;
                                                }
                                                c24411.post(new RunnableC22793(c17709, interfaceC17889, 1));
                                            }
                                            if (lifecycle.mo19832() == EnumC13728.DESTROYED) {
                                                return;
                                            } else {
                                                i3++;
                                            }
                                        } else {
                                            while (i == c17709.f54189.get()) {
                                                synchronized (c17709.f54191) {
                                                    c17709.f54191.wait(1000L);
                                                    C8058 c8058 = C8058.f24861;
                                                }
                                                if (lifecycle.mo19832() == EnumC13728.DESTROYED) {
                                                    return;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                } else {
                                    C2447 c24412 = viewOnClickListenerC19121.f60263;
                                    if (c24412 == null) {
                                        C11233.m27804("recyclerView");
                                        throw null;
                                    }
                                    if (c24412.m7901() || c17709.f54190 || i != c17709.f54189.get()) {
                                        break;
                                        break;
                                        break;
                                    }
                                    C2447 c24413 = viewOnClickListenerC19121.f60263;
                                    if (c24413 == null) {
                                        C11233.m27804("recyclerView");
                                        throw null;
                                    }
                                    if (iM7895 != c24413.m7895()) {
                                        break;
                                    }
                                    final InterfaceC17889 interfaceC178810 = (InterfaceC17889) list.get(i2);
                                    int iMo36985 = interfaceC178810.mo36984();
                                    if (iMo36985 != 0) {
                                        C11813 c11813Mo9351 = c20844.mo9350((AbstractC16891) null, interfaceC178810, iMo36985);
                                        C11233.m27803(c11813Mo9351, "loadDataIcon(...)");
                                        interfaceC178810.mo36966(c11813Mo9351);
                                        C2447 c24414 = viewOnClickListenerC19121.f60263;
                                        if (c24414 == null) {
                                            C11233.m27804("recyclerView");
                                            throw null;
                                        }
                                        c24414.post(new Runnable() { // from class: l.ܽ֡᩷
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                this.f50128.m41441(interfaceC178810);
                                            }
                                        });
                                    }
                                    if (lifecycle.mo19832() == EnumC13728.DESTROYED) {
                                        return;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        }
                    } else {
                        C11233.m27804("recyclerView");
                        throw null;
                    }
                } else {
                    SystemClock.sleep(50L);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41441(InterfaceC17889 interfaceC17889) {
        ViewOnClickListenerC19121 viewOnClickListenerC19121 = this.f54192;
        C2447 c2447 = viewOnClickListenerC19121.f60263;
        if (c2447 == null) {
            C11233.m27804("recyclerView");
            throw null;
        }
        int childCount = c2447.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C2447 c2448 = viewOnClickListenerC19121.f60263;
            if (c2448 == null) {
                C11233.m27804("recyclerView");
                throw null;
            }
            View childAt = c2448.getChildAt(i);
            if (childAt != null) {
                C2447 c2449 = viewOnClickListenerC19121.f60263;
                if (c2449 == null) {
                    C11233.m27804("recyclerView");
                    throw null;
                }
                AbstractC3255 childViewHolder = c2449.getChildViewHolder(childAt);
                C11233.m27800((Object) childViewHolder, "null cannot be cast to non-null type bin.mt.plus.FilePickerActivity.FileListHolder");
                ViewOnClickListenerC10507 viewOnClickListenerC10507 = (ViewOnClickListenerC10507) childViewHolder;
                C11813 icon = interfaceC17889.getIcon();
                if (viewOnClickListenerC10507.m26406() == interfaceC17889 && icon != null) {
                    ImageView imageViewM26408 = viewOnClickListenerC10507.m26408();
                    Drawable drawable = imageViewM26408.getDrawable();
                    if (drawable == null) {
                        drawable = new ColorDrawable(0);
                    }
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, icon.m28878()});
                    transitionDrawable.setCrossFadeEnabled(true);
                    imageViewM26408.setImageDrawable(transitionDrawable);
                    transitionDrawable.startTransition(300);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41442(boolean z) {
        this.f54190 = true;
        this.f54189.incrementAndGet();
        C20844 c20844 = C20844.f67485;
        for (InterfaceC17889 interfaceC17889 : this.f54192.f60259) {
            if (interfaceC17889.getIcon() == null) {
                interfaceC17889.mo36967(c20844.mo11258(interfaceC17889));
                int iMo9351 = c20844.mo9351(interfaceC17889);
                if (iMo9351 != 0) {
                    interfaceC17889.mo36974(iMo9351);
                }
            }
        }
        if (z) {
            this.f54188 = System.currentTimeMillis();
        }
        C12623 c12623 = this.f54192.f60257;
        if (c12623 == null) {
            C11233.m27804("adapter");
            throw null;
        }
        c12623.notifyDataSetChanged();
        this.f54190 = false;
        synchronized (this.f54191) {
            this.f54191.notifyAll();
            C8058 c8058 = C8058.f24861;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41438(Integer num, String str) {
        Object next;
        if (str != null) {
            ViewOnClickListenerC19121 viewOnClickListenerC19121 = this.f54192;
            List list = viewOnClickListenerC19121.f60259;
            C11233.m27805(list, "<this>");
            Iterator it = new C18847(new C6852(list)).iterator();
            while (true) {
                C19553 c19553 = (C19553) it;
                if (!c19553.hasNext()) {
                    next = null;
                    break;
                }
                next = c19553.next();
                InterfaceC17889 interfaceC17889 = (InterfaceC17889) ((C4030) next).m12127();
                if (interfaceC17889.isDirectory() && C11233.m27802((Object) interfaceC17889.getName(), (Object) str)) {
                    break;
                }
            }
            C4030 c4030 = (C4030) next;
            int iM12128 = c4030 != null ? c4030.m12128() : 0;
            C2447 c2447 = viewOnClickListenerC19121.f60263;
            if (c2447 == null) {
                C11233.m27804("recyclerView");
                throw null;
            }
            int iM7899 = c2447.m7899() - 1;
            if (5 >= iM7899) {
                iM7899 = 5;
            }
            if (num == null) {
                num = Integer.valueOf(iM12128);
                if (iM12128 < iM7899) {
                    num = 0;
                }
            } else if (iM12128 < num.intValue() || num.intValue() + iM7899 <= iM12128) {
                num = Integer.valueOf(iM12128);
                if (iM12128 < iM7899) {
                    num = 0;
                }
            }
        } else if (num == null) {
            num = 0;
        }
        m41437(num.intValue());
        if (str != null) {
            this.f54186 = str;
            this.f54187 = System.currentTimeMillis();
        }
    }
}
