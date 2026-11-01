package p067l;

import android.os.Bundle;
import android.view.View;
import bin.p000mt.plus.R;
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
public class C20738 extends ComponentCallbacksC11117 {

    /* JADX INFO: renamed from: ۗ */
    public int[] f63989;

    /* JADX INFO: renamed from: ۙ */
    public List f63990;

    /* JADX INFO: renamed from: ۛ */
    public boolean f63991;

    /* JADX INFO: renamed from: ۤ */
    public boolean f63992;

    /* JADX INFO: renamed from: ۨ */
    public C14849 f63993;

    /* JADX INFO: renamed from: ۫ */
    public String f63994;

    /* JADX INFO: renamed from: ۬ */
    public int f63995;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f63996;

    /* JADX INFO: renamed from: ᩸ */
    public C17383 f63997;

    /* JADX INFO: renamed from: ᩹ */
    public C20856 f63998;

    /* JADX INFO: renamed from: ᩺ */
    public C5946 f63999;

    public C20738() {
        super(R.layout.MT_Protector);
        this.f63991 = true;
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5946 c5946 = (C5946) new C6874(requireActivity()).m15765(C5946.class);
        this.f63999 = c5946;
        c5946.m13347().m4066(this, new InterfaceC3326() { // from class: l.֫۟᩷
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                C20738.m46820(this.f8634, (C20856) obj);
            }
        });
        this.f63997 = new C17383(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m46820(C20738 c20738, C20856 c20856) {
        c20738.f63998 = c20856;
        c20738.f63999.m13327(c20738, new C8420(c20738));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46815(C20738 c20738) {
        if (c20738.f63991) {
            c20738.f63991 = false;
            c20738.f63996 = false;
            c20738.f63992 = false;
            try {
                AbstractC17043 abstractC17043M29392 = c20738.f63998.m47150().m29392("strings");
                if (abstractC17043M29392.mo25094()) {
                    byte[] bArrM38664 = abstractC17043M29392.m38664();
                    int i = C6054.f15203;
                    C14677 c14677 = new C14677(C6054.m13644(bArrM38664, bArrM38664.length));
                    if (c14677.readInt() == 830747697) {
                        int i2 = c14677.readInt();
                        c20738.f63990 = new ArrayList(i2);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if (c14677.m33585()) {
                                c20738.f63996 = true;
                                c20738.f63990.add(new C24760(c14677.m33591(), c14677.m33591()));
                            } else {
                                c20738.f63990.add(new C24760(c14677.m33591()));
                            }
                        }
                        c20738.m46831();
                        AbstractC17043 abstractC17043M29393 = c20738.f63998.m47150().m29392("strings_changed");
                        if (c20738.f63996) {
                            abstractC17043M29393.getClass();
                            abstractC17043M29393.m38661(new byte[]{1}, 0, 1);
                        } else {
                            abstractC17043M29393.mo25503();
                        }
                        c20738.f63997.notifyDataSetChanged();
                        return;
                    }
                }
            } catch (Throwable th) {
                C5946 c5946 = c20738.f63999;
                if (c5946 != null) {
                    c5946.m13320(th);
                }
            }
            c20738.m46838(R.string.MT_Protector);
        }
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onViewCreated(View view, Bundle bundle) {
        C14849 c14849 = (C14849) view.findViewById(R.id.MT_Protector);
        this.f63993 = c14849;
        c14849.setTag("RecyclerView3");
        this.f63993.setAdapter(this.f63997);
        this.f63999.m13330(getViewLifecycleOwner(), new C9512(0, this));
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m46828(C20738 c20738) {
        c20738.f63993.scrollToPosition(0);
        c20738.f63997.m39426();
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onDestroyView() {
        super.onDestroyView();
        this.f63993.setAdapter(null);
        this.f63993 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46838(final int i) {
        final ActivityC18686 activityC18686 = (ActivityC18686) requireActivity();
        Runnable runnable = new Runnable() { // from class: l.ۧ۟᩷
            @Override // java.lang.Runnable
            public final void run() {
                new C18054(this.f35604, activityC18686, i).m22250();
            }
        };
        if (activityC18686.m42611()) {
            if (this.f63990 == null) {
                this.f63990 = Collections.EMPTY_LIST;
                this.f63992 = false;
                this.f63996 = false;
                this.f63997.notifyDataSetChanged();
            }
            activityC18686.m42608(runnable);
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m46841() {
        m46814(this.f63990);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m46814(List list) {
        C11996 c11996M45308 = C19965.m45308(830747697);
        c11996M45308.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C24760 c24760 = (C24760) it.next();
            c11996M45308.m27445(c24760.f78382);
            c11996M45308.m27443((CharSequence) c24760.f78381);
            if (c24760.f78382) {
                c11996M45308.m27443((CharSequence) c24760.f78380);
            }
        }
        AbstractC17043 abstractC17043M29392 = this.f63998.m47150().m29392("strings");
        try {
            byte[] bArrM27464 = c11996M45308.m27464();
            int i = C6054.f15203;
            abstractC17043M29392.m38660(C6054.m13643(bArrM27464, bArrM27464.length));
        } catch (IOException e) {
            C5946 c5946 = this.f63999;
            if (c5946 != null) {
                c5946.m13320((Throwable) e);
            }
        }
        AbstractC17043 abstractC17043M29393 = this.f63998.m47150().m29392("strings_changed");
        if (!this.f63996) {
            abstractC17043M29393.mo25503();
            return;
        }
        try {
            abstractC17043M29393.getClass();
            abstractC17043M29393.m38661(new byte[]{1}, 0, 1);
        } catch (IOException e2) {
            C5946 c5947 = this.f63999;
            if (c5947 != null) {
                c5947.m13320((Throwable) e2);
            }
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public static void m46823(C20738 c20738) {
        AbstractC17043 abstractC17043M29392 = c20738.f63998.m47150().m29392("stringsFilter");
        if (!c20738.f63992) {
            abstractC17043M29392.mo25503();
            return;
        }
        C11996 c11996M45308 = C19965.m45308(1143374470);
        c11996M45308.m27443((CharSequence) c20738.f63994);
        c11996M45308.writeInt(c20738.f63995);
        for (int i = 0; i < c20738.f63995; i++) {
            c11996M45308.writeInt(c20738.f63989[i]);
        }
        try {
            abstractC17043M29392.m38654(c11996M45308);
        } catch (IOException e) {
            if (c20738.f63999 != null) {
                c20738.f63999.m13320((Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m46831() {
        AbstractC17043 abstractC17043M29392 = this.f63998.m47150().m29392("stringsFilter");
        if (abstractC17043M29392.mo25094()) {
            C14677 c14677M38686 = abstractC17043M29392.m38686();
            if (c14677M38686.readInt() == 1143374470) {
                this.f63992 = true;
                this.f63994 = c14677M38686.m33591();
                int i = c14677M38686.readInt();
                this.f63995 = i;
                int[] iArr = this.f63989;
                if (iArr == null || iArr.length < i) {
                    this.f63989 = new int[i];
                }
                for (int i2 = 0; i2 < this.f63995; i2++) {
                    this.f63989[i2] = c14677M38686.readInt();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public static void m46824(C20738 c20738) {
        new C19396(c20738, (AbstractActivityC5549) c20738.requireActivity(), c20738.f63992, C4605.m9734()).m42958();
    }

    /* JADX INFO: renamed from: ܺ */
    public static void m46832(C20738 c20738) {
        ActivityC18686 activityC18686 = (ActivityC18686) c20738.requireActivity();
        C24164 c24164 = new C24164(activityC18686);
        c24164.m53440(R.string.MT_Protector);
        c24164.mo51878((Runnable) null);
        c24164.mo51883();
        final C16042 c16042 = new C16042(c20738, c24164, activityC18686);
        final C0977 c0977 = new C0977();
        for (C24760 c24760 : c20738.f63990) {
            if (c24760.f78382) {
                c0977.put(c24760.f78381, c24760.f78380);
            }
        }
        final C20856 c20856 = c20738.f63998;
        new Thread(new Runnable() { // from class: l.ܰۨ᩷
            @Override // java.lang.Runnable
            public final void run() {
                final InterfaceC22710 interfaceC22710 = c16042;
                C20856 c20857 = c20856;
                final C11113 c11113 = new C11113(c20857, true);
                try {
                    c11113.f30823 = c20857.m47129();
                    final C23380 c23380 = new C23380();
                    final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    c20857.m47118(concurrentLinkedQueue, "", true, (Set) null);
                    interfaceC22710.mo24484(0);
                    final C20689 c20689 = new C20689(concurrentLinkedQueue.size());
                    c20689.m46753(new C23132(interfaceC22710));
                    final C0977 c0978 = c0977;
                    Runnable runnable = new Runnable() { // from class: l.ۨۨ᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC3736 interfaceC3736;
                            while (true) {
                                ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                                if (concurrentLinkedQueue2.isEmpty() || (interfaceC3736 = (InterfaceC3736) concurrentLinkedQueue2.poll()) == null || interfaceC22710.mo24482()) {
                                    return;
                                }
                                c20689.m46754(1);
                                String strMo7189 = interfaceC3736.mo7189();
                                List<C25209> listM25632 = c11113.m25632(interfaceC3736.getPath());
                                String string = null;
                                if (listM25632 != null) {
                                    StringBuilder sb = new StringBuilder(strMo7189.length());
                                    int i = 0;
                                    int i2 = 0;
                                    for (C25209 c25209 : listM25632) {
                                        if (c25209.f80613 == 1) {
                                            String str = (String) c0978.getOrDefault(c25209.f80616, null);
                                            if (str != null) {
                                                sb.append((CharSequence) strMo7189, i2, c25209.f80614);
                                                sb.append(C12588.m28992(str));
                                                i2 = c25209.f80611;
                                                i++;
                                            }
                                        }
                                    }
                                    if (i != 0) {
                                        c23380.m52023(i);
                                        if (i2 < strMo7189.length()) {
                                            sb.append((CharSequence) strMo7189, i2, strMo7189.length());
                                        }
                                        string = sb.toString();
                                    }
                                }
                                if (string != null) {
                                    interfaceC3736.mo7190(string);
                                }
                            }
                        }
                    };
                    c20857.m47126(false);
                    C5275.m11400((int) (C19110.f57020 * 0.66f), runnable);
                    c20857.m47126(true);
                    C7050.m16212(new RunnableC4440(3, interfaceC22710, c23380));
                } catch (Exception e) {
                    C7050.m16212(new Runnable() { // from class: l.ۛۨ᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            Exception exc = e;
                            InterfaceC22710 interfaceC22711 = interfaceC22710;
                            c11113.m25633(interfaceC22711.mo24485(), exc);
                            interfaceC22711.mo24483();
                        }
                    });
                }
            }
        }).start();
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC21283 m46839() {
        return this.f63997;
    }

    /* JADX INFO: renamed from: ܽ */
    public final List m46840() {
        return this.f63990;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m46842() {
        boolean z;
        Iterator it = this.f63990.iterator();
        while (it.hasNext()) {
            if (((C24760) it.next()).f78382) {
                z = true;
                this.f63996 = z;
            }
        }
        z = false;
        this.f63996 = z;
    }
}
