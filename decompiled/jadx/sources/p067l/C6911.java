package p067l;

import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ۙܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 29SR */
/* JADX INFO: loaded from: classes2.dex */
public final class C6911 {

    /* JADX INFO: renamed from: ֫ */
    public C10264 f17988;

    /* JADX INFO: renamed from: ۜ */
    public int f17989;

    /* JADX INFO: renamed from: ۧ */
    public Drawable f17990;

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC21664 f17991;

    /* JADX INFO: renamed from: ܽ */
    public DialogInterfaceC2564 f17992;

    /* JADX INFO: renamed from: ܿ */
    public C11400 f17993;

    /* JADX INFO: renamed from: ᩳ */
    public ArrayList f17994;

    /* JADX INFO: renamed from: ᩷ */
    public TextView f17995;

    /* JADX INFO: renamed from: ᩻ */
    public final LinkedList f17996 = new LinkedList();

    public C6911(AbstractActivityC5549 abstractActivityC5549, ArrayList arrayList) {
        this.f17994 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f17994.add(new C23675(this, (C13176) arrayList.get(i), i));
        }
        abstractActivityC5549.getClass();
        Drawable drawableMutate = C0886.m5548(abstractActivityC5549, R.drawable.MT_Protector).mutate();
        this.f17990 = drawableMutate;
        drawableMutate.setColorFilter(C15766.m35830(C23223.f72980));
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        C24790 c24790 = (C24790) viewM12252.findViewById(R.id.searchView);
        this.f17995 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        C11400 c11400 = (C11400) viewM12252.findViewById(R.id.MT_Protector);
        this.f17993 = c11400;
        C10264 c10264 = new C10264(this);
        this.f17988 = c10264;
        c11400.setAdapter((ListAdapter) c10264);
        c11400.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ۚܽ᩻
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                C6911.m15829(this.f19869, i2);
            }
        });
        c11400.setFastScrollEnabled(true);
        C7040.m16181(c11400);
        c24790.m54458(new C3558(this));
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC13914(1, this, arrayList));
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f17992 = c20671BuildDialog.m46709();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m15829(C6911 c6911, int i) {
        C10264 c10264 = c6911.f17988;
        int i2 = ((C23675) c10264.f28416.get(i)).f75378;
        if (c6911.f17989 != i2) {
            c6911.f17989 = i2;
            c10264.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m15831(C6911 c6911, List list) {
        InterfaceC21664 interfaceC21664 = c6911.f17991;
        if (interfaceC21664 != null) {
            int i = c6911.f17989;
            interfaceC21664.mo45214(i, (C13176) list.get(i));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m15842(int i) {
        this.f17995.setText(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15841(InterfaceC21664 interfaceC21664) {
        this.f17991 = interfaceC21664;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15840(int i) {
        this.f17989 = i;
        this.f17993.setSelection(i);
        this.f17988.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15839() {
        this.f17992.m3862();
        LinkedList linkedList = new LinkedList();
        for (C23675 c23675 : this.f17994) {
            if (c23675.f75376) {
                linkedList.add(c23675);
            }
        }
        ExecutorService executorService = C4081.f8987;
        executorService.execute(new Runnable() { // from class: l.֡ܽ᩻
            @Override // java.lang.Runnable
            public final void run() {
                C6911.m15828(this.f4993);
            }
        });
        executorService.execute(new RunnableC3003(1, this, linkedList));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m15828(C6911 c6911) {
        Iterator it = c6911.f17994.iterator();
        while (it.hasNext()) {
            ((C23675) it.next()).f75375.m30175();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m15830(C6911 c6911, LinkedList linkedList) {
        final C23675 c23675;
        while (c6911.f17992.m3855()) {
            while (!c6911.f17996.isEmpty()) {
                int iMax = Math.max(1, (c6911.f17993.getLastVisiblePosition() - c6911.f17993.getFirstVisiblePosition()) + 1);
                synchronized (c6911.f17996) {
                    while (c6911.f17996.size() > iMax) {
                        c6911.f17996.removeFirst();
                    }
                    c23675 = (C23675) c6911.f17996.removeLast();
                }
                if (c23675.f75376) {
                    c23675.f75376 = false;
                    final BitmapDrawable bitmapDrawableM18675 = RunnableC8046.m18675(c23675.f75375.f37028);
                    C7050.m16212(new Runnable() { // from class: l.᩸ܽ᩻
                        @Override // java.lang.Runnable
                        public final void run() {
                            C23675 c23676 = c23675;
                            C0878 c0878 = c23676.f75374;
                            boolean z = c23676.f75373;
                            BitmapDrawable bitmapDrawable = bitmapDrawableM18675;
                            if (!z) {
                                c0878.setDrawable(bitmapDrawable);
                                return;
                            }
                            Drawable drawable = c0878.getDrawable();
                            bitmapDrawable.setBounds(drawable.getBounds());
                            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
                            c0878.setDrawable(transitionDrawable);
                            transitionDrawable.setCrossFadeEnabled(true);
                            transitionDrawable.startTransition(300);
                        }
                    });
                }
                while (c6911.f17992.m3855() && c6911.f17993.m26368()) {
                    SystemClock.sleep(100L);
                }
                if (!c6911.f17992.m3855()) {
                    return;
                }
            }
            while (!linkedList.isEmpty()) {
                if (c6911.f17996.isEmpty()) {
                    final C23675 c23676 = (C23675) linkedList.removeFirst();
                    if (c23676.f75376) {
                        c23676.f75376 = false;
                        final BitmapDrawable bitmapDrawableM18676 = RunnableC8046.m18675(c23676.f75375.f37028);
                        C7050.m16212(new Runnable() { // from class: l.᩸ܽ᩻
                            @Override // java.lang.Runnable
                            public final void run() {
                                C23675 c23677 = c23676;
                                C0878 c0878 = c23677.f75374;
                                boolean z = c23677.f75373;
                                BitmapDrawable bitmapDrawable = bitmapDrawableM18676;
                                if (!z) {
                                    c0878.setDrawable(bitmapDrawable);
                                    return;
                                }
                                Drawable drawable = c0878.getDrawable();
                                bitmapDrawable.setBounds(drawable.getBounds());
                                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
                                c0878.setDrawable(transitionDrawable);
                                transitionDrawable.setCrossFadeEnabled(true);
                                transitionDrawable.startTransition(300);
                            }
                        });
                    }
                    while (c6911.f17992.m3855() && c6911.f17993.m26368()) {
                        SystemClock.sleep(100L);
                    }
                    if (!c6911.f17992.m3855()) {
                        return;
                    }
                }
            }
            return;
        }
    }
}
