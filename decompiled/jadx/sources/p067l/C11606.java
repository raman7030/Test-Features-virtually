package p067l;

import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.ۢܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: X992 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11606 {

    /* JADX INFO: renamed from: ֫ */
    public C16298 f32371;

    /* JADX INFO: renamed from: ۜ */
    public TextView f32372;

    /* JADX INFO: renamed from: ۧ */
    public DialogInterfaceC2564 f32373;

    /* JADX INFO: renamed from: ܳ */
    public ViewOnClickListenerC23564 f32374;

    /* JADX INFO: renamed from: ܽ */
    public ArrayList f32375;

    /* JADX INFO: renamed from: ܿ */
    public C22894 f32376;

    /* JADX INFO: renamed from: ᩳ */
    public C11400 f32377;

    /* JADX INFO: renamed from: ᩻ */
    public final LinkedList f32378 = new LinkedList();

    public C11606(Main main, ArrayList arrayList) {
        this.f32375 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f32375.add(new C22335(this, (PackageInfo) arrayList.get(i)));
        }
        View viewM12252 = main.m12252(R.layout.MT_Protector);
        C24790 c24790 = (C24790) viewM12252.findViewById(R.id.searchView);
        this.f32372 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        C11400 c11400 = (C11400) viewM12252.findViewById(R.id.MT_Protector);
        this.f32377 = c11400;
        C16298 c16298 = new C16298(this);
        this.f32371 = c16298;
        c11400.setAdapter((ListAdapter) c16298);
        c11400.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ᩳܽ᩻
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                C11606.m26718(this.f59776, i2);
            }
        });
        c11400.setFastScrollEnabled(true);
        C7040.m16181(c11400);
        c24790.m54458(new C18981(this));
        C20671 c20671BuildDialog = main.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC24050(1, this));
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f32373 = c20671BuildDialog.m46709();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m26718(C11606 c11606, int i) {
        C16298 c16298 = c11606.f32371;
        C22335 c22335 = (C22335) c16298.f47900.get(i);
        c22335.f70508 = !c22335.f70508;
        c16298.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26717(C11606 c11606) {
        if (c11606.f32376 != null) {
            ArrayList arrayList = new ArrayList();
            for (C22335 c22335 : c11606.f32375) {
                if (c22335.f70508) {
                    arrayList.add(c22335.f70507);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            C22894 c22894 = c11606.f32376;
            C18310.m41730((List) c22894.f72051, (C18107) c22894.f72052, arrayList);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26728(ViewOnClickListenerC23564 viewOnClickListenerC23564) {
        this.f32373.m3847(-3, C7050.m16224(R.string.MT_Protector), null);
        this.f32374 = viewOnClickListenerC23564;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26726(int i) {
        this.f32372.setText(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26727(C22894 c22894) {
        this.f32376 = c22894;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26725() {
        Button buttonM3861;
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f32373;
        dialogInterfaceC2564.m3862();
        if (this.f32374 != null && (buttonM3861 = dialogInterfaceC2564.m3861()) != null) {
            buttonM3861.setOnClickListener(this.f32374);
        }
        LinkedList linkedList = new LinkedList();
        for (C22335 c22335 : this.f32375) {
            if (c22335.f70509) {
                linkedList.add(c22335);
            }
        }
        C4081.f8987.execute(new RunnableC4457(2, this, linkedList));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26719(C11606 c11606, LinkedList linkedList) {
        final C22335 c22335;
        while (c11606.f32373.m3855()) {
            while (!c11606.f32378.isEmpty()) {
                int iMax = Math.max(1, (c11606.f32377.getLastVisiblePosition() - c11606.f32377.getFirstVisiblePosition()) + 1);
                synchronized (c11606.f32378) {
                    while (c11606.f32378.size() > iMax) {
                        c11606.f32378.removeFirst();
                    }
                    c22335 = (C22335) c11606.f32378.removeLast();
                }
                if (c22335.f70509) {
                    c22335.f70509 = false;
                    final BitmapDrawable bitmapDrawableM18675 = RunnableC8046.m18675(c22335.f70507);
                    C7050.m16212(new Runnable() { // from class: l.ۜܽ᩻
                        @Override // java.lang.Runnable
                        public final void run() {
                            C22335 c22336 = c22335;
                            C0878 c0878 = c22336.f70510;
                            boolean z = c22336.f70506;
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
                while (c11606.f32373.m3855() && c11606.f32377.m26368()) {
                    SystemClock.sleep(100L);
                }
                if (!c11606.f32373.m3855()) {
                    return;
                }
            }
            while (!linkedList.isEmpty()) {
                if (c11606.f32378.isEmpty()) {
                    final C22335 c22336 = (C22335) linkedList.removeFirst();
                    if (c22336.f70509) {
                        c22336.f70509 = false;
                        final BitmapDrawable bitmapDrawableM18676 = RunnableC8046.m18675(c22336.f70507);
                        C7050.m16212(new Runnable() { // from class: l.ۜܽ᩻
                            @Override // java.lang.Runnable
                            public final void run() {
                                C22335 c22337 = c22336;
                                C0878 c0878 = c22337.f70510;
                                boolean z = c22337.f70506;
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
                    while (c11606.f32373.m3855() && c11606.f32377.m26368()) {
                        SystemClock.sleep(100L);
                    }
                    if (!c11606.f32373.m3855()) {
                        return;
                    }
                }
            }
            return;
        }
    }
}
