package p067l;

import android.os.Bundle;
import android.view.View;
import bin.p000mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.ܶۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes5.dex */
public class C16684 extends ComponentCallbacksC11117 {

    /* JADX INFO: renamed from: ۗ */
    public int[] f49109;

    /* JADX INFO: renamed from: ۙ */
    public C14121 f49110;

    /* JADX INFO: renamed from: ۛ */
    public boolean f49111;

    /* JADX INFO: renamed from: ۤ */
    public boolean f49112;

    /* JADX INFO: renamed from: ۨ */
    public C14849 f49113;

    /* JADX INFO: renamed from: ۫ */
    public String f49114;

    /* JADX INFO: renamed from: ۬ */
    public int f49115;

    /* JADX INFO: renamed from: ᩶ */
    public List f49116;

    /* JADX INFO: renamed from: ᩸ */
    public C2603 f49117;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f49118;

    /* JADX INFO: renamed from: ᩺ */
    public C5946 f49119;

    public C16684() {
        super(R.layout.MT_Protector);
        this.f49111 = true;
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5946 c5946 = (C5946) new C6874(requireActivity()).m15765(C5946.class);
        this.f49119 = c5946;
        c5946.m13355().m4066(this, new C23488(3, this));
        this.f49117 = new C2603(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m37767(C16684 c16684, C14121 c14121) {
        c16684.f49110 = c14121;
        c16684.f49119.m13325(c16684, new C18191(7, c16684));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37763(C16684 c16684) {
        if (c16684.f49111) {
            c16684.f49111 = false;
            c16684.f49118 = false;
            c16684.f49112 = false;
            AbstractC17043 abstractC17043M29392 = c16684.f49110.m32105().m29392("strings");
            if (abstractC17043M29392.mo25094()) {
                try {
                    C6514 c6514 = new C6514(new GZIPInputStream(abstractC17043M29392.mo29987()));
                    try {
                        if (c6514.readInt() == 830747697) {
                            int i = c6514.readInt();
                            c16684.f49116 = new ArrayList(i);
                            byte[] bArr = new byte[1024];
                            for (int i2 = 0; i2 < i; i2++) {
                                int i3 = c6514.read();
                                if (i3 == -1) {
                                    throw new EOFException();
                                }
                                if (i3 != 0) {
                                    c16684.f49118 = true;
                                    c16684.f49116.add(new C17355(c6514.m14942(bArr), c6514.m14942(bArr)));
                                } else {
                                    c16684.f49116.add(new C17355(c6514.m14942(bArr)));
                                }
                            }
                            c16684.m37779();
                            AbstractC17043 abstractC17043M29393 = c16684.f49110.m32105().m29392("strings_changed");
                            if (c16684.f49118) {
                                abstractC17043M29393.getClass();
                                abstractC17043M29393.m38661(new byte[]{1}, 0, 1);
                            } else {
                                abstractC17043M29393.mo25503();
                            }
                            c16684.f49117.notifyDataSetChanged();
                            c6514.close();
                            return;
                        }
                        c6514.close();
                    } catch (Throwable th) {
                        try {
                            c6514.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    C5946 c5946 = c16684.f49119;
                    if (c5946 != null) {
                        c5946.m13320(th3);
                    }
                }
            }
            new C8639(c16684, R.string.MT_Protector).m22250();
        }
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onViewCreated(View view, Bundle bundle) {
        C14849 c14849 = (C14849) view.findViewById(R.id.MT_Protector);
        this.f49113 = c14849;
        c14849.setTag("RecyclerView3");
        this.f49113.setAdapter(this.f49117);
        this.f49119.m13331(getViewLifecycleOwner(), new C19368(this));
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m37775(C16684 c16684) {
        c16684.f49113.scrollToPosition(0);
        c16684.f49117.m3902();
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onDestroyView() {
        super.onDestroyView();
        this.f49113.setAdapter(null);
        this.f49113 = null;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m37788() {
        m37762(this.f49116);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m37762(List list) {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C11879(this.f49110.m32105().m29392("strings").mo25506(false)));
            try {
                C7855.m18154(bufferedOutputStream, 830747697);
                C7855.m18154(bufferedOutputStream, list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C17355 c17355 = (C17355) it.next();
                    bufferedOutputStream.write(c17355.f51753 ? 255 : 0);
                    String str = c17355.f51752;
                    C7855.m18154(bufferedOutputStream, C7855.m18152(str));
                    C7855.m18155(bufferedOutputStream, str);
                    if (c17355.f51753) {
                        String str2 = c17355.f51751;
                        C7855.m18154(bufferedOutputStream, C7855.m18152(str2));
                        C7855.m18155(bufferedOutputStream, str2);
                    }
                }
                bufferedOutputStream.close();
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            C5946 c5946 = this.f49119;
            if (c5946 != null) {
                c5946.m13320((Throwable) e);
            }
        }
        AbstractC17043 abstractC17043M29392 = this.f49110.m32105().m29392("strings_changed");
        if (this.f49118) {
            try {
                abstractC17043M29392.getClass();
                abstractC17043M29392.m38661(new byte[]{1}, 0, 1);
                return;
            } catch (IOException e2) {
                C5946 c5947 = this.f49119;
                if (c5947 != null) {
                    c5947.m13320((Throwable) e2);
                    return;
                }
                return;
            }
        }
        abstractC17043M29392.mo25503();
    }

    /* JADX INFO: renamed from: ۖ */
    public static void m37770(C16684 c16684) {
        AbstractC17043 abstractC17043M29392 = c16684.f49110.m32105().m29392("stringsFilter");
        if (!c16684.f49112) {
            abstractC17043M29392.mo25503();
            return;
        }
        C11996 c11996M45308 = C19965.m45308(1143374470);
        c11996M45308.m27443((CharSequence) c16684.f49114);
        c11996M45308.writeInt(c16684.f49115);
        for (int i = 0; i < c16684.f49115; i++) {
            c11996M45308.writeInt(c16684.f49109[i]);
        }
        try {
            abstractC17043M29392.m38654(c11996M45308);
        } catch (IOException e) {
            if (c16684.f49119 != null) {
                c16684.f49119.m13320((Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m37779() {
        AbstractC17043 abstractC17043M29392 = this.f49110.m32105().m29392("stringsFilter");
        if (abstractC17043M29392.mo25094()) {
            C14677 c14677M38686 = abstractC17043M29392.m38686();
            if (c14677M38686.readInt() == 1143374470) {
                this.f49112 = true;
                this.f49114 = c14677M38686.m33591();
                int i = c14677M38686.readInt();
                this.f49115 = i;
                int[] iArr = this.f49109;
                if (iArr == null || iArr.length < i) {
                    this.f49109 = new int[i];
                }
                for (int i2 = 0; i2 < this.f49115; i2++) {
                    this.f49109[i2] = c14677M38686.readInt();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public static void m37771(C16684 c16684) {
        new C22051(c16684, (AbstractActivityC5549) c16684.requireActivity(), c16684.f49112, C4605.m9734()).m42958();
    }

    /* JADX INFO: renamed from: ܺ */
    public static void m37780(C16684 c16684) {
        ActivityC18686 activityC18686 = (ActivityC18686) c16684.requireActivity();
        C24164 c24164 = new C24164(activityC18686);
        c24164.m53440(R.string.MT_Protector);
        c24164.mo51878((Runnable) null);
        c24164.mo51883();
        final C10651 c10651 = new C10651(c16684, c24164, activityC18686);
        final C0977 c0977 = new C0977();
        for (C17355 c17355 : c16684.f49116) {
            if (c17355.f51753) {
                c0977.put(c17355.f51752, c17355.f51751);
            }
        }
        final C14121 c14121 = c16684.f49110;
        new Thread(new Runnable() { // from class: l.֫ܽۢ
            @Override // java.lang.Runnable
            public final void run() {
                final C23380 c23380 = new C23380();
                final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                C14121 c14122 = c14121;
                c14122.m32094(concurrentLinkedQueue, "", true, (Predicate) null);
                final InterfaceC22710 interfaceC22710 = c10651;
                interfaceC22710.mo24484(0);
                final C20689 c20689 = new C20689(concurrentLinkedQueue.size());
                c20689.m46753(new C23132(interfaceC22710));
                final C0977 c0978 = c0977;
                Runnable runnable = new Runnable() { // from class: l.ܽܽۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC15206 interfaceC15206;
                        String string;
                        while (true) {
                            ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                            if (concurrentLinkedQueue2.isEmpty() || (interfaceC15206 = (InterfaceC15206) concurrentLinkedQueue2.poll()) == null || interfaceC22710.mo24482()) {
                                return;
                            }
                            c20689.m46754(1);
                            String strMo33763 = interfaceC15206.mo33763();
                            C14317 c14317 = new C14317(strMo33763);
                            C23948 c23948 = new C23948(strMo33763.length());
                            int i = 0;
                            int i2 = 0;
                            while (true) {
                                string = null;
                                if (!c14317.m32891()) {
                                    break;
                                }
                                String str = (String) c0978.getOrDefault(c14317.f40914, null);
                                if (str != null) {
                                    c23948.append((CharSequence) strMo33763, i2, c14317.f40916);
                                    try {
                                        C15693.m35744(c23948, str);
                                    } catch (IOException unused) {
                                    }
                                    i2 = c14317.f40912;
                                    i++;
                                }
                            }
                            if (i != 0) {
                                c23380.m52023(i);
                                if (i2 < strMo33763.length()) {
                                    c23948.append((CharSequence) strMo33763, i2, strMo33763.length());
                                }
                                string = c23948.toString();
                            }
                            if (string != null) {
                                interfaceC15206.mo33758(string);
                            }
                        }
                    }
                };
                c14122.m32085();
                c14122.m32103(false);
                C5275.m11400((int) (C19110.f57020 * 0.66f), runnable);
                c14122.m32103(true);
                c14122.m32122();
                C7050.m16212(new RunnableC19642(0, interfaceC22710, c23380));
            }
        }).start();
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC21283 m37786() {
        return this.f49117;
    }

    /* JADX INFO: renamed from: ܽ */
    public final List m37787() {
        return this.f49116;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m37789() {
        boolean z;
        Iterator it = this.f49116.iterator();
        while (it.hasNext()) {
            if (((C17355) it.next()).f51753) {
                z = true;
                this.f49118 = z;
            }
        }
        z = false;
        this.f49118 = z;
    }
}
