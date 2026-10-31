package l;

import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ۙܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 29SR */
/* JADX INFO: loaded from: classes2.dex */
public final class C4779 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8307 f15156;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f15157;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Drawable f15158;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC20302 f15159;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f15160;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C9503 f15161;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f15162;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public TextView f15163;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final LinkedList f15164 = new LinkedList();

    public C4779(AbstractActivityC3346 abstractActivityC3346, ArrayList arrayList) {
        this.f15162 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f15162.add(new C22418(this, (C11372) arrayList.get(i), i));
        }
        abstractActivityC3346.getClass();
        Drawable drawableMutate = C0881.m3234(abstractActivityC3346, R.drawable.MT_Protector).mutate();
        this.f15158 = drawableMutate;
        drawableMutate.setColorFilter(C14096.m33704(C21943.f70269));
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        C23592 c23592 = (C23592) viewM10216.findViewById(R.id.searchView);
        this.f15163 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        C9503 c9503 = (C9503) viewM10216.findViewById(R.id.MT_Protector);
        this.f15161 = c9503;
        C8307 c8307 = new C8307(this);
        this.f15156 = c8307;
        c9503.setAdapter((ListAdapter) c8307);
        c9503.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ۚܽ᩻
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                C4779.m13949(this.f17029, i2);
            }
        });
        c9503.setFastScrollEnabled(true);
        C4915.m14284(c9503);
        c23592.m52055(new C1251(this));
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC12148(1, this, arrayList));
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f15160 = c19258BuildDialog.m44415();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13949(C4779 c4779, int i) {
        C8307 c8307 = c4779.f15156;
        int i2 = ((C22418) c8307.f25505.get(i)).f72651;
        if (c4779.f15157 != i2) {
            c4779.f15157 = i2;
            c8307.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13951(C4779 c4779, List list) {
        InterfaceC20302 interfaceC20302 = c4779.f15159;
        if (interfaceC20302 != null) {
            int i = c4779.f15157;
            interfaceC20302.mo42938(i, (C11372) list.get(i));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m13962(int i) {
        this.f15163.setText(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13961(InterfaceC20302 interfaceC20302) {
        this.f15159 = interfaceC20302;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13960(int i) {
        this.f15157 = i;
        this.f15161.setSelection(i);
        this.f15156.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13959() {
        this.f15160.m1449();
        LinkedList linkedList = new LinkedList();
        for (C22418 c22418 : this.f15162) {
            if (c22418.f72649) {
                linkedList.add(c22418);
            }
        }
        ExecutorService executorService = C1802.f6208;
        executorService.execute(new Runnable() { // from class: l.֡ܽ᩻
            @Override // java.lang.Runnable
            public final void run() {
                C4779.m13948(this.f2219);
            }
        });
        executorService.execute(new RunnableC0667(1, this, linkedList));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13948(C4779 c4779) {
        Iterator it = c4779.f15162.iterator();
        while (it.hasNext()) {
            ((C22418) it.next()).f72648.m28131();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13950(C4779 c4779, LinkedList linkedList) {
        final C22418 c22418;
        while (c4779.f15160.m1442()) {
            while (!c4779.f15164.isEmpty()) {
                int iMax = Math.max(1, (c4779.f15161.getLastVisiblePosition() - c4779.f15161.getFirstVisiblePosition()) + 1);
                synchronized (c4779.f15164) {
                    while (c4779.f15164.size() > iMax) {
                        c4779.f15164.removeFirst();
                    }
                    c22418 = (C22418) c4779.f15164.removeLast();
                }
                if (c22418.f72649) {
                    c22418.f72649 = false;
                    final BitmapDrawable bitmapDrawableM16749 = RunnableC5974.m16749(c22418.f72648.f34031);
                    C4925.m14315(new Runnable() { // from class: l.᩸ܽ᩻
                        @Override // java.lang.Runnable
                        public final void run() {
                            C22418 c22419 = c22418;
                            C0734 c0734 = c22419.f72647;
                            boolean z = c22419.f72646;
                            BitmapDrawable bitmapDrawable = bitmapDrawableM16749;
                            if (!z) {
                                c0734.setDrawable(bitmapDrawable);
                                return;
                            }
                            Drawable drawable = c0734.getDrawable();
                            bitmapDrawable.setBounds(drawable.getBounds());
                            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
                            c0734.setDrawable(transitionDrawable);
                            transitionDrawable.setCrossFadeEnabled(true);
                            transitionDrawable.startTransition(300);
                        }
                    });
                }
                while (c4779.f15160.m1442() && c4779.f15161.m24358()) {
                    SystemClock.sleep(100L);
                }
                if (!c4779.f15160.m1442()) {
                    return;
                }
            }
            while (!linkedList.isEmpty()) {
                if (c4779.f15164.isEmpty()) {
                    final C22418 c22419 = (C22418) linkedList.removeFirst();
                    if (c22419.f72649) {
                        c22419.f72649 = false;
                        final BitmapDrawable bitmapDrawableM167410 = RunnableC5974.m16749(c22419.f72648.f34031);
                        C4925.m14315(new Runnable() { // from class: l.᩸ܽ᩻
                            @Override // java.lang.Runnable
                            public final void run() {
                                C22418 c224110 = c22419;
                                C0734 c0734 = c224110.f72647;
                                boolean z = c224110.f72646;
                                BitmapDrawable bitmapDrawable = bitmapDrawableM167410;
                                if (!z) {
                                    c0734.setDrawable(bitmapDrawable);
                                    return;
                                }
                                Drawable drawable = c0734.getDrawable();
                                bitmapDrawable.setBounds(drawable.getBounds());
                                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
                                c0734.setDrawable(transitionDrawable);
                                transitionDrawable.setCrossFadeEnabled(true);
                                transitionDrawable.startTransition(300);
                            }
                        });
                    }
                    while (c4779.f15160.m1442() && c4779.f15161.m24358()) {
                        SystemClock.sleep(100L);
                    }
                    if (!c4779.f15160.m1442()) {
                        return;
                    }
                }
            }
            return;
        }
    }
}
