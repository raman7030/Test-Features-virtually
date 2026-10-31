package l;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۘ۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAJH */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3817 implements InterfaceC17066 {

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f12033 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static final Handler f12034 = new HandlerC20751(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public WeakReference f12037;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f12038;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public CharSequence f12040;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Bundle f12043;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f12044;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C17222 f12050;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f12052;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C20765 f12054;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public CharSequence f12055;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final Object f12047 = new Object();

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public EnumC14399 f12049 = EnumC14399.CREATED;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final WeakReference f12042 = new WeakReference(this);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C5242 f12053 = new C5242(this);

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f12048 = -1;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f12039 = new AtomicBoolean();

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f12035 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public CountDownLatch f12041 = new CountDownLatch(1);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f12045 = new ArrayList();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ArrayList f12036 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f12051 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C8817 f12046 = C8817.m22786(20);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222);

    /* JADX INFO: renamed from: ֫ */
    public void mo3270(AbstractActivityC3346 abstractActivityC3346, C17222 c17222, boolean z) {
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public abstract CharSequence mo2778();

    /* JADX INFO: renamed from: ۠ */
    public abstract C11813 mo2779();

    /* JADX INFO: renamed from: ۡ */
    public boolean mo3145() {
        return !(this instanceof C19032);
    }

    /* JADX INFO: renamed from: ۢ */
    public abstract C17222 mo2780();

    /* JADX INFO: renamed from: ۧ */
    public abstract DialogInterfaceC0206 mo10130(AbstractActivityC3346 abstractActivityC3346);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo2781(C17222 c17222);

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo2782();

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public boolean mo11562() {
        return !(this instanceof C9013);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo11519(Intent intent) {
        this.f12038 = intent.getIntExtra("TaskId", -1);
        this.f12043 = intent.getBundleExtra("TaskArgument");
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m11544() {
        return this.f12038;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Bundle m11543() {
        return this.f12043;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m11514(String str) {
        if (!this.f12043.containsKey(str)) {
            throw new RuntimeException("Key not found in input data");
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String[] m11558(String str) {
        C12951 c12951M31485 = C12951.m31485(m11560(str));
        int i = c12951M31485.readInt();
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = c12951M31485.m31504();
        }
        return strArr;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m11556(String str) {
        m11514(str);
        String string = this.f12043.getString(str);
        C11003.requireNonNull(string);
        return string;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m11517(String str) {
        return C9523.m24404(m11556(str));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m11531(String str) {
        return C9523.m24392(m11556(str));
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m11515(String str) {
        return C16999.m39866(m11556(str), new String[0]);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m11535(String str) {
        return this.f12043.getString(str);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m11548(String str) {
        m11514(str);
        return this.f12043.getInt(str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m11527(String str) {
        m11514(str);
        return this.f12043.getLong(str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m11552(String str) {
        m11514(str);
        return this.f12043.getBoolean(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m11560(String str) {
        m11514(str);
        Object obj = this.f12043.get(str);
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (!(obj instanceof String)) {
            throw new RuntimeException(C5368.m15337(obj, "Unknown: "));
        }
        AbstractC15440 abstractC15440M39866 = C16999.m39866((String) obj, new String[0]);
        try {
            byte[] bArrM36506 = abstractC15440M39866.m36506();
            this.f12036.add(abstractC15440M39866);
            return bArrM36506;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Serializable m11529(String str) {
        m11514(str);
        return this.f12043.getSerializable(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 m11526() {
        AbstractC13921 abstractC13921M28856 = C11806.m28856(m11560("ARG_STATELESS_VISITOR"), true);
        if (abstractC13921M28856 instanceof AutoCloseable) {
            this.f12051.add((AutoCloseable) abstractC13921M28856);
        }
        return abstractC13921M28856;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 m11553() {
        AbstractC13921 abstractC13921M28856 = C11806.m28856(m11560("ARG_STATELESS_VISITOR2"), true);
        if (abstractC13921M28856 instanceof AutoCloseable) {
            this.f12051.add((AutoCloseable) abstractC13921M28856);
        }
        return abstractC13921M28856;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C11667 m11533() {
        byte[] byteArray = this.f12043.getByteArray("ARG_SIGNATURE_OPTIONS");
        if (byteArray == null) {
            return null;
        }
        C12951 c12951 = new C12951(byteArray);
        return new C11667(AbstractC13262.m32189(c12951.m31496()), EnumC8139.values()[c12951.readByte()], c12951.m31487(), c12951.m31498());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m11542(C16560 c16560) {
        return m11556("ARG_CURRENT_WINDOW_DIGEST").equals(c16560.m39022());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m11525(C16560 c16560) {
        return m11556("ARG_ANOTHER_WINDOW_DIGEST").equals(c16560.m39022());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11523(EnumC14399 enumC14399) {
        if (enumC14399 == EnumC14399.FINISHED) {
            try {
                this.f12041.await();
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this.f12047) {
            this.f12049 = enumC14399;
        }
    }

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final boolean m11516() {
        return this.f12049 == EnumC14399.FINISHED;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m11551(C17222 c17222) {
        this.f12050 = c17222;
    }

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final C17222 m11537() {
        return this.f12050;
    }

    public void cancel() {
        this.f12052 = true;
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        if (this.f12052) {
            return true;
        }
        C20765 c20765 = this.f12054;
        return c20765 != null && c20765.mo19832() == EnumC13728.DESTROYED;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C5242 m11532() {
        return this.f12053;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11521(C2406 c2406) {
        if (this.f12049 == EnumC14399.FINISHED) {
            throw new IllegalStateException("Can not add FinallyListener after finished");
        }
        this.f12045.add(c2406);
    }

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final void m11528() {
        AbstractActivityC3346 abstractActivityC3346Mo11549 = mo11549();
        if (abstractActivityC3346Mo11549 != null) {
            C4925.m14315(new RunnableC23572(0, this, abstractActivityC3346Mo11549));
        } else {
            this.f12041.countDown();
            C15104.m35790(this);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11513(AbstractC3817 abstractC3817, AbstractActivityC3346 abstractActivityC3346) {
        abstractC3817.m11512(abstractActivityC3346, true);
        abstractC3817.f12041.countDown();
        C15104.m35790(abstractC3817);
    }

    /* JADX INFO: renamed from: ֫ */
    public C17222 mo3144(Exception exc) {
        return C17222.m40517(exc);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11524(C17222 c17222) {
        C9340 c9340M132;
        boolean zM24089;
        DialogInterfaceC0206 dialogInterfaceC0206M11518 = m11518();
        ArrayList arrayList = this.f12045;
        if (dialogInterfaceC0206M11518 != null && dialogInterfaceC0206M11518.m1442()) {
            if (f12034.hasMessages(this.f12038)) {
                C4925.m14316(new RunnableC20760(3, dialogInterfaceC0206M11518), 50L);
            } else {
                dialogInterfaceC0206M11518.dismiss();
            }
            AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) C5350.m15313(dialogInterfaceC0206M11518.m1432());
            C11003.requireNonNull(abstractActivityC3346);
            boolean z = this.f12044;
            mo3270(abstractActivityC3346, c17222, z);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC15810) it.next()).mo9078(abstractActivityC3346, c17222, z);
            }
            if (c17222.m40525() && mo11562()) {
                c17222.m40523(abstractActivityC3346);
            }
        } else if (c17222.m40525() && mo11562()) {
            PendingIntent activity = PendingIntent.getActivity(C4925.m14335(), 0, new Intent(C4925.m14335(), (Class<?>) ActivityC9667.class), 67108864);
            C21093 c21093 = new C21093(C4925.m14335(), "MTaskService3");
            c21093.m48000();
            c21093.m48003();
            c21093.m47996(C4925.m14327(R.string.MT_Protector));
            c21093.m47995(mo2778());
            c21093.m47993(activity);
            c21093.m47999();
            c21093.m47998(true);
            ServiceC8961.f27218.notify(this.f12038 + 10000, c21093.m47991());
        }
        if (c17222.m40525()) {
            C15104.m35785(this);
        }
        Main mainM36593 = C15528.m36593();
        if (mainM36593 != null && (c9340M132 = mainM36593.m132()) != null) {
            if (this.f12043.containsKey("ARG_CURRENT_WINDOW_LEFT")) {
                zM24089 = this.f12043.getBoolean("ARG_CURRENT_WINDOW_LEFT");
            } else {
                zM24089 = c9340M132.m24089();
            }
            mo2777(mainM36593, zM24089 ? c9340M132.m24091() : c9340M132.m24072(), !zM24089 ? c9340M132.m24091() : c9340M132.m24072(), c17222);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC15810) it2.next()).getClass();
            }
        }
        mo2781(c17222);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((InterfaceC15810) it3.next()).getClass();
        }
        Iterator it4 = this.f12036.iterator();
        while (it4.hasNext()) {
            ((AbstractC15440) it4.next()).mo23552();
        }
        Iterator it5 = this.f12051.iterator();
        while (it5.hasNext()) {
            C0349.m1793((AutoCloseable) it5.next());
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m11550(AbstractActivityC3346 abstractActivityC3346) {
        m11512(abstractActivityC3346, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11512(AbstractActivityC3346 abstractActivityC3346, boolean z) {
        synchronized (this.f12047) {
            if (m11516()) {
                return;
            }
            DialogInterfaceC0206 dialogInterfaceC0206M11518 = m11518();
            if (dialogInterfaceC0206M11518 != null && dialogInterfaceC0206M11518.m1442()) {
                if (C5350.m15313(dialogInterfaceC0206M11518.m1432()) == abstractActivityC3346) {
                    return;
                } else {
                    dialogInterfaceC0206M11518.dismiss();
                }
            }
            this.f12044 = z;
            mo11530();
            DialogInterfaceC0206 dialogInterfaceC0206Mo10130 = mo10130(abstractActivityC3346);
            abstractActivityC3346.m10225(dialogInterfaceC0206Mo10130);
            this.f12037 = new WeakReference(dialogInterfaceC0206Mo10130);
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC3346 mo11549() {
        return C15528.m36593();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 m11518() {
        WeakReference weakReference = this.f12037;
        if (weakReference == null) {
            return null;
        }
        return (DialogInterfaceC0206) weakReference.get();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m11536(int i) {
        mo11546(C4925.m14327(i));
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void mo11546(String str) {
        this.f12055 = str;
        this.f12039.set(true);
        m11559();
    }

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m11557() {
        return this.f12055;
    }

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public final boolean m11561() {
        return this.f12039.compareAndSet(true, false);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m11555(int i) {
        mo11520(C4925.m14327(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo11520(CharSequence charSequence) {
        this.f12040 = charSequence;
        this.f12035.set(true);
        m11559();
    }

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m11534() {
        return this.f12040;
    }

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final boolean m11547() {
        return this.f12035.compareAndSet(true, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11541(long j, long j2) {
        mo11538(C19277.m44456(j, j2));
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public void mo11538(int i) {
        if (this.f12048 != i) {
            this.f12048 = i;
            m11559();
        }
    }

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final int m11539() {
        return this.f12048;
    }

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public void mo11530() {
        this.f12039.set(true);
        this.f12035.set(true);
    }

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public final void m11559() {
        if (this.f12046.m22791()) {
            int i = this.f12038;
            WeakReference weakReference = this.f12042;
            Handler handler = f12034;
            handler.sendMessageDelayed(handler.obtainMessage(i, weakReference), 20L);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11522(AbstractActivityC3346 abstractActivityC3346) {
        AbstractC7379 lifecycle = abstractActivityC3346.getLifecycle();
        if (lifecycle.mo19832() == EnumC13728.DESTROYED) {
            cancel();
        } else {
            this.f12054 = (C20765) lifecycle;
        }
    }

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final C17222 m11545() {
        return mo1526() ? C17222.m40521() : C17222.m40520();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m11510(String[] strArr) {
        return (List) C22311.stream(strArr).map(new C6639(0)).collect(C22976.toList());
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC3817 m11554() {
        C9462 c9462 = new C9462();
        c9462.f12038 = this.f12038;
        c9462.f12050 = this.f12050;
        c9462.f12055 = C4925.m14327(R.string.MT_Protector);
        c9462.f12040 = mo2778();
        c9462.f12049 = EnumC14399.FINISHED;
        return c9462;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC13077 mo11540() {
        m11536(R.string.MT_Protector);
        mo11538(0);
        return new C8756(this);
    }
}
