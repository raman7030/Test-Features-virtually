package l;

import android.os.Bundle;
import android.view.View;
import bin.mt.plus.R;
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
public class C15063 extends ComponentCallbacksC9205 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int[] f45991;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12366 f45992;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f45993;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f45994;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C13132 f45995;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f45996;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f45997;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f45998;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C0247 f45999;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f46000;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C3764 f46001;

    public C15063() {
        super(R.layout.MT_Protector);
        this.f45993 = true;
    }

    @Override // l.ComponentCallbacksC9205
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3764 c3764 = (C3764) new C4741(requireActivity()).m13885(C3764.class);
        this.f46001 = c3764;
        c3764.m11419().m1668(this, new C22222(3, this));
        this.f45999 = new C0247(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m35609(C15063 c15063, C12366 c12366) {
        c15063.f45992 = c12366;
        c15063.f46001.m11389(c15063, new C16648(7, c15063));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35605(C15063 c15063) {
        if (c15063.f45993) {
            c15063.f45993 = false;
            c15063.f46000 = false;
            c15063.f45994 = false;
            AbstractC15440 abstractC15440M27330 = c15063.f45992.m30044().m27330("strings");
            if (abstractC15440M27330.mo23120()) {
                try {
                    C4362 c4362 = new C4362(new GZIPInputStream(abstractC15440M27330.mo27926()));
                    try {
                        if (c4362.readInt() == 830747697) {
                            int i = c4362.readInt();
                            c15063.f45998 = new ArrayList(i);
                            byte[] bArr = new byte[1024];
                            for (int i2 = 0; i2 < i; i2++) {
                                int i3 = c4362.read();
                                if (i3 == -1) {
                                    throw new EOFException();
                                }
                                if (i3 != 0) {
                                    c15063.f46000 = true;
                                    c15063.f45998.add(new C15769(c4362.m13078(bArr), c4362.m13078(bArr)));
                                } else {
                                    c15063.f45998.add(new C15769(c4362.m13078(bArr)));
                                }
                            }
                            c15063.m35621();
                            AbstractC15440 abstractC15440M27331 = c15063.f45992.m30044().m27330("strings_changed");
                            if (c15063.f46000) {
                                abstractC15440M27331.getClass();
                                abstractC15440M27331.m36503(new byte[]{1}, 0, 1);
                            } else {
                                abstractC15440M27331.mo23552();
                            }
                            c15063.f45999.notifyDataSetChanged();
                            c4362.close();
                            return;
                        }
                        c4362.close();
                    } catch (Throwable th) {
                        try {
                            c4362.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    C3764 c3764 = c15063.f46001;
                    if (c3764 != null) {
                        c3764.m11384(th3);
                    }
                }
            }
            new C6598(c15063, R.string.MT_Protector).m20274();
        }
    }

    @Override // l.ComponentCallbacksC9205
    public final void onViewCreated(View view, Bundle bundle) {
        C13132 c13132 = (C13132) view.findViewById(R.id.MT_Protector);
        this.f45995 = c13132;
        c13132.setTag("RecyclerView3");
        this.f45995.setAdapter(this.f45999);
        this.f46001.m11395(getViewLifecycleOwner(), new C17887(this));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m35617(C15063 c15063) {
        c15063.f45995.scrollToPosition(0);
        c15063.f45999.m1504();
    }

    @Override // l.ComponentCallbacksC9205
    public final void onDestroyView() {
        super.onDestroyView();
        this.f45995.setAdapter(null);
        this.f45995 = null;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m35630() {
        m35604(this.f45998);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m35604(List list) {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C10007(this.f45992.m30044().m27330("strings").mo23555(false)));
            try {
                C5773.m16235(bufferedOutputStream, 830747697);
                C5773.m16235(bufferedOutputStream, list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C15769 c15769 = (C15769) it.next();
                    bufferedOutputStream.write(c15769.f48614 ? 255 : 0);
                    String str = c15769.f48613;
                    C5773.m16235(bufferedOutputStream, C5773.m16233(str));
                    C5773.m16236(bufferedOutputStream, str);
                    if (c15769.f48614) {
                        String str2 = c15769.f48612;
                        C5773.m16235(bufferedOutputStream, C5773.m16233(str2));
                        C5773.m16236(bufferedOutputStream, str2);
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
            C3764 c3764 = this.f46001;
            if (c3764 != null) {
                c3764.m11384((Throwable) e);
            }
        }
        AbstractC15440 abstractC15440M27330 = this.f45992.m30044().m27330("strings_changed");
        if (this.f46000) {
            try {
                abstractC15440M27330.getClass();
                abstractC15440M27330.m36503(new byte[]{1}, 0, 1);
                return;
            } catch (IOException e2) {
                C3764 c3765 = this.f46001;
                if (c3765 != null) {
                    c3765.m11384((Throwable) e2);
                    return;
                }
                return;
            }
        }
        abstractC15440M27330.mo23552();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m35612(C15063 c15063) {
        AbstractC15440 abstractC15440M27330 = c15063.f45992.m30044().m27330("stringsFilter");
        if (!c15063.f45994) {
            abstractC15440M27330.mo23552();
            return;
        }
        C10130 c10130M43030 = C18515.m43030(1143374470);
        c10130M43030.m25423((CharSequence) c15063.f45996);
        c10130M43030.writeInt(c15063.f45997);
        for (int i = 0; i < c15063.f45997; i++) {
            c10130M43030.writeInt(c15063.f45991[i]);
        }
        try {
            abstractC15440M27330.m36496(c10130M43030);
        } catch (IOException e) {
            if (c15063.f46001 != null) {
                c15063.f46001.m11384((Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m35621() {
        AbstractC15440 abstractC15440M27330 = this.f45992.m30044().m27330("stringsFilter");
        if (abstractC15440M27330.mo23120()) {
            C12951 c12951M36528 = abstractC15440M27330.m36528();
            if (c12951M36528.readInt() == 1143374470) {
                this.f45994 = true;
                this.f45996 = c12951M36528.m31504();
                int i = c12951M36528.readInt();
                this.f45997 = i;
                int[] iArr = this.f45991;
                if (iArr == null || iArr.length < i) {
                    this.f45991 = new int[i];
                }
                for (int i2 = 0; i2 < this.f45997; i2++) {
                    this.f45991[i2] = c12951M36528.readInt();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m35613(C15063 c15063) {
        new C20710(c15063, (AbstractActivityC3346) c15063.requireActivity(), c15063.f45994, C2353.m7663()).m40707();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m35622(C15063 c15063) {
        ActivityC17169 activityC17169 = (ActivityC17169) c15063.requireActivity();
        C22933 c22933 = new C22933(activityC17169);
        c22933.m51049(R.string.MT_Protector);
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        final C8715 c8715 = new C8715(c15063, c22933, activityC17169);
        final C2727 c2727 = new C2727();
        for (C15769 c15769 : c15063.f45998) {
            if (c15769.f48614) {
                c2727.put(c15769.f48613, c15769.f48612);
            }
        }
        final C12366 c12366 = c15063.f45992;
        new Thread(new Runnable() { // from class: l.֫ܽۢ
            @Override // java.lang.Runnable
            public final void run() {
                final C22108 c22108 = new C22108();
                final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                C12366 c12367 = c12366;
                c12367.m30033(concurrentLinkedQueue, "", true, (Predicate) null);
                final InterfaceC21403 interfaceC21403 = c8715;
                interfaceC21403.mo22515(0);
                final C19277 c19277 = new C19277(concurrentLinkedQueue.size());
                c19277.m44459(new C21847(interfaceC21403));
                final C2727 c2728 = c2727;
                Runnable runnable = new Runnable() { // from class: l.ܽܽۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC13508 interfaceC13508;
                        String string;
                        while (true) {
                            ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                            if (concurrentLinkedQueue2.isEmpty() || (interfaceC13508 = (InterfaceC13508) concurrentLinkedQueue2.poll()) == null || interfaceC21403.mo22513()) {
                                return;
                            }
                            c19277.m44460(1);
                            String strMo31675 = interfaceC13508.mo31675();
                            C12572 c12572 = new C12572(strMo31675);
                            C22706 c22706 = new C22706(strMo31675.length());
                            int i = 0;
                            int i2 = 0;
                            while (true) {
                                string = null;
                                if (!c12572.m30816()) {
                                    break;
                                }
                                String str = (String) c2728.getOrDefault(c12572.f37888, null);
                                if (str != null) {
                                    c22706.append((CharSequence) strMo31675, i2, c12572.f37890);
                                    try {
                                        C14020.m33624(c22706, str);
                                    } catch (IOException unused) {
                                    }
                                    i2 = c12572.f37886;
                                    i++;
                                }
                            }
                            if (i != 0) {
                                c22108.m49685(i);
                                if (i2 < strMo31675.length()) {
                                    c22706.append((CharSequence) strMo31675, i2, strMo31675.length());
                                }
                                string = c22706.toString();
                            }
                            if (string != null) {
                                interfaceC13508.mo31670(string);
                            }
                        }
                    }
                };
                c12367.m30024();
                c12367.m30042(false);
                C3058.m9358((int) (C17615.f53826 * 0.66f), runnable);
                c12367.m30042(true);
                c12367.m30061();
                C4925.m14315(new RunnableC18175(0, interfaceC21403, c22108));
            }
        }).start();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC19902 m35628() {
        return this.f45999;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m35629() {
        return this.f45998;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m35631() {
        boolean z;
        Iterator it = this.f45998.iterator();
        while (it.hasNext()) {
            if (((C15769) it.next()).f48614) {
                z = true;
                this.f46000 = z;
            }
        }
        z = false;
        this.f46000 = z;
    }
}
