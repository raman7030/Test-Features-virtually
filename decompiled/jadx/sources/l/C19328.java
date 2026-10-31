package l;

import android.os.Bundle;
import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.᩵۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes5.dex */
public class C19328 extends ComponentCallbacksC9205 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int[] f60757;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f60758;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f60759;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f60760;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C13132 f60761;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f60762;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f60763;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f60764;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15798 f60765;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C19452 f60766;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C3764 f60767;

    public C19328() {
        super(R.layout.MT_Protector);
        this.f60759 = true;
    }

    @Override // l.ComponentCallbacksC9205
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3764 c3764 = (C3764) new C4741(requireActivity()).m13885(C3764.class);
        this.f60767 = c3764;
        c3764.m11411().m1668(this, new InterfaceC1008() { // from class: l.֫۟᩷
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                C19328.m44526(this.f5855, (C19452) obj);
            }
        });
        this.f60765 = new C15798(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44526(C19328 c19328, C19452 c19452) {
        c19328.f60766 = c19452;
        c19328.f60767.m11391(c19328, new C6367(c19328));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44521(C19328 c19328) {
        if (c19328.f60759) {
            c19328.f60759 = false;
            c19328.f60764 = false;
            c19328.f60760 = false;
            try {
                AbstractC15440 abstractC15440M27330 = c19328.f60766.m44854().m27330("strings");
                if (abstractC15440M27330.mo23120()) {
                    byte[] bArrM36506 = abstractC15440M27330.m36506();
                    int i = C3878.f12396;
                    C12951 c12951 = new C12951(C3878.m11708(bArrM36506, bArrM36506.length));
                    if (c12951.readInt() == 830747697) {
                        int i2 = c12951.readInt();
                        c19328.f60758 = new ArrayList(i2);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if (c12951.m31498()) {
                                c19328.f60764 = true;
                                c19328.f60758.add(new C23560(c12951.m31504(), c12951.m31504()));
                            } else {
                                c19328.f60758.add(new C23560(c12951.m31504()));
                            }
                        }
                        c19328.m44537();
                        AbstractC15440 abstractC15440M27331 = c19328.f60766.m44854().m27330("strings_changed");
                        if (c19328.f60764) {
                            abstractC15440M27331.getClass();
                            abstractC15440M27331.m36503(new byte[]{1}, 0, 1);
                        } else {
                            abstractC15440M27331.mo23552();
                        }
                        c19328.f60765.notifyDataSetChanged();
                        return;
                    }
                }
            } catch (Throwable th) {
                C3764 c3764 = c19328.f60767;
                if (c3764 != null) {
                    c3764.m11384(th);
                }
            }
            c19328.m44544(R.string.MT_Protector);
        }
    }

    @Override // l.ComponentCallbacksC9205
    public final void onViewCreated(View view, Bundle bundle) {
        C13132 c13132 = (C13132) view.findViewById(R.id.MT_Protector);
        this.f60761 = c13132;
        c13132.setTag("RecyclerView3");
        this.f60761.setAdapter(this.f60765);
        this.f60767.m11394(getViewLifecycleOwner(), new C7516(0, this));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44534(C19328 c19328) {
        c19328.f60761.scrollToPosition(0);
        c19328.f60765.m37255();
    }

    @Override // l.ComponentCallbacksC9205
    public final void onDestroyView() {
        super.onDestroyView();
        this.f60761.setAdapter(null);
        this.f60761 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44544(final int i) {
        final ActivityC17169 activityC17169 = (ActivityC17169) requireActivity();
        Runnable runnable = new Runnable() { // from class: l.ۧ۟᩷
            @Override // java.lang.Runnable
            public final void run() {
                new C16504(this.f32627, activityC17169, i).m20274();
            }
        };
        if (activityC17169.m40366()) {
            if (this.f60758 == null) {
                this.f60758 = Collections.EMPTY_LIST;
                this.f60760 = false;
                this.f60764 = false;
                this.f60765.notifyDataSetChanged();
            }
            activityC17169.m40363(runnable);
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m44547() {
        m44520(this.f60758);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m44520(List list) {
        C10130 c10130M43030 = C18515.m43030(830747697);
        c10130M43030.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C23560 c23560 = (C23560) it.next();
            c10130M43030.m25425(c23560.f75636);
            c10130M43030.m25423((CharSequence) c23560.f75635);
            if (c23560.f75636) {
                c10130M43030.m25423((CharSequence) c23560.f75634);
            }
        }
        AbstractC15440 abstractC15440M27330 = this.f60766.m44854().m27330("strings");
        try {
            byte[] bArrM25444 = c10130M43030.m25444();
            int i = C3878.f12396;
            abstractC15440M27330.m36502(C3878.m11707(bArrM25444, bArrM25444.length));
        } catch (IOException e) {
            C3764 c3764 = this.f60767;
            if (c3764 != null) {
                c3764.m11384((Throwable) e);
            }
        }
        AbstractC15440 abstractC15440M27331 = this.f60766.m44854().m27330("strings_changed");
        if (!this.f60764) {
            abstractC15440M27331.mo23552();
            return;
        }
        try {
            abstractC15440M27331.getClass();
            abstractC15440M27331.m36503(new byte[]{1}, 0, 1);
        } catch (IOException e2) {
            C3764 c3765 = this.f60767;
            if (c3765 != null) {
                c3765.m11384((Throwable) e2);
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m44529(C19328 c19328) {
        AbstractC15440 abstractC15440M27330 = c19328.f60766.m44854().m27330("stringsFilter");
        if (!c19328.f60760) {
            abstractC15440M27330.mo23552();
            return;
        }
        C10130 c10130M43030 = C18515.m43030(1143374470);
        c10130M43030.m25423((CharSequence) c19328.f60762);
        c10130M43030.writeInt(c19328.f60763);
        for (int i = 0; i < c19328.f60763; i++) {
            c10130M43030.writeInt(c19328.f60757[i]);
        }
        try {
            abstractC15440M27330.m36496(c10130M43030);
        } catch (IOException e) {
            if (c19328.f60767 != null) {
                c19328.f60767.m11384((Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m44537() {
        AbstractC15440 abstractC15440M27330 = this.f60766.m44854().m27330("stringsFilter");
        if (abstractC15440M27330.mo23120()) {
            C12951 c12951M36528 = abstractC15440M27330.m36528();
            if (c12951M36528.readInt() == 1143374470) {
                this.f60760 = true;
                this.f60762 = c12951M36528.m31504();
                int i = c12951M36528.readInt();
                this.f60763 = i;
                int[] iArr = this.f60757;
                if (iArr == null || iArr.length < i) {
                    this.f60757 = new int[i];
                }
                for (int i2 = 0; i2 < this.f60763; i2++) {
                    this.f60757[i2] = c12951M36528.readInt();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m44530(C19328 c19328) {
        new C17916(c19328, (AbstractActivityC3346) c19328.requireActivity(), c19328.f60760, C2353.m7663()).m40707();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m44538(C19328 c19328) {
        ActivityC17169 activityC17169 = (ActivityC17169) c19328.requireActivity();
        C22933 c22933 = new C22933(activityC17169);
        c22933.m51049(R.string.MT_Protector);
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        final C14387 c14387 = new C14387(c19328, c22933, activityC17169);
        final C2727 c2727 = new C2727();
        for (C23560 c23560 : c19328.f60758) {
            if (c23560.f75636) {
                c2727.put(c23560.f75635, c23560.f75634);
            }
        }
        final C19452 c19452 = c19328.f60766;
        new Thread(new Runnable() { // from class: l.ܰۨ᩷
            @Override // java.lang.Runnable
            public final void run() {
                final InterfaceC21403 interfaceC21403 = c14387;
                C19452 c19453 = c19452;
                final C9200 c9200 = new C9200(c19453, true);
                try {
                    c9200.f27877 = c19453.m44833();
                    final C22108 c22108 = new C22108();
                    final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    c19453.m44822(concurrentLinkedQueue, "", true, (Set) null);
                    interfaceC21403.mo22515(0);
                    final C19277 c19277 = new C19277(concurrentLinkedQueue.size());
                    c19277.m44459(new C21847(interfaceC21403));
                    final C2727 c2728 = c2727;
                    Runnable runnable = new Runnable() { // from class: l.ۨۨ᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC1438 interfaceC1438;
                            while (true) {
                                ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                                if (concurrentLinkedQueue2.isEmpty() || (interfaceC1438 = (InterfaceC1438) concurrentLinkedQueue2.poll()) == null || interfaceC21403.mo22513()) {
                                    return;
                                }
                                c19277.m44460(1);
                                String strMo4946 = interfaceC1438.mo4946();
                                List<C24032> listM23633 = c9200.m23633(interfaceC1438.getPath());
                                String string = null;
                                if (listM23633 != null) {
                                    StringBuilder sb = new StringBuilder(strMo4946.length());
                                    int i = 0;
                                    int i2 = 0;
                                    for (C24032 c24032 : listM23633) {
                                        if (c24032.f77861 == 1) {
                                            String str = (String) c2728.getOrDefault(c24032.f77864, null);
                                            if (str != null) {
                                                sb.append((CharSequence) strMo4946, i2, c24032.f77862);
                                                sb.append(C10753.m26948(str));
                                                i2 = c24032.f77859;
                                                i++;
                                            }
                                        }
                                    }
                                    if (i != 0) {
                                        c22108.m49685(i);
                                        if (i2 < strMo4946.length()) {
                                            sb.append((CharSequence) strMo4946, i2, strMo4946.length());
                                        }
                                        string = sb.toString();
                                    }
                                }
                                if (string != null) {
                                    interfaceC1438.mo4947(string);
                                }
                            }
                        }
                    };
                    c19453.m44830(false);
                    C3058.m9358((int) (C17615.f53826 * 0.66f), runnable);
                    c19453.m44830(true);
                    C4925.m14315(new RunnableC2180(3, interfaceC21403, c22108));
                } catch (Exception e) {
                    C4925.m14315(new Runnable() { // from class: l.ۛۨ᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            Exception exc = e;
                            InterfaceC21403 interfaceC21404 = interfaceC21403;
                            c9200.m23634(interfaceC21404.mo22516(), exc);
                            interfaceC21404.mo22514();
                        }
                    });
                }
            }
        }).start();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC19902 m44545() {
        return this.f60765;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m44546() {
        return this.f60758;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m44548() {
        boolean z;
        Iterator it = this.f60758.iterator();
        while (it.hasNext()) {
            if (((C23560) it.next()).f75636) {
                z = true;
                this.f60764 = z;
            }
        }
        z = false;
        this.f60764 = z;
    }
}
