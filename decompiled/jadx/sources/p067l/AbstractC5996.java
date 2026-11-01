package p067l;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
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
public abstract class AbstractC5996 implements InterfaceC18588 {

    /* JADX INFO: renamed from: ۢ֫ */
    public static final AtomicInteger f14840 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩷֫ */
    public static final Handler f14841 = new HandlerC22090(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۙ */
    public WeakReference f14844;

    /* JADX INFO: renamed from: ۛ */
    public int f14845;

    /* JADX INFO: renamed from: ۟ */
    public CharSequence f14847;

    /* JADX INFO: renamed from: ۨ */
    public Bundle f14850;

    /* JADX INFO: renamed from: ۫ */
    public boolean f14851;

    /* JADX INFO: renamed from: ᩳ֫ */
    public C18736 f14857;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f14859;

    /* JADX INFO: renamed from: ᩺ */
    public C22103 f14861;

    /* JADX INFO: renamed from: ᩻֫ */
    public CharSequence f14862;

    /* JADX INFO: renamed from: ܳ֫ */
    public final Object f14854 = new Object();

    /* JADX INFO: renamed from: ܿ֫ */
    public EnumC16053 f14856 = EnumC16053.CREATED;

    /* JADX INFO: renamed from: ۧ֫ */
    public final WeakReference f14849 = new WeakReference(this);

    /* JADX INFO: renamed from: ᩹ */
    public final C7350 f14860 = new C7350(this);

    /* JADX INFO: renamed from: ܽ֫ */
    public int f14855 = -1;

    /* JADX INFO: renamed from: ۜ֫ */
    public final AtomicBoolean f14846 = new AtomicBoolean();

    /* JADX INFO: renamed from: ֫֫ */
    public final AtomicBoolean f14842 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۤ */
    public CountDownLatch f14848 = new CountDownLatch(1);

    /* JADX INFO: renamed from: ۬ */
    public ArrayList f14852 = new ArrayList();

    /* JADX INFO: renamed from: ۗ */
    public ArrayList f14843 = new ArrayList();

    /* JADX INFO: renamed from: ᩶ */
    public ArrayList f14858 = new ArrayList();

    /* JADX INFO: renamed from: ܰ */
    public C10748 f14853 = C10748.m24756(20);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736);

    /* JADX INFO: renamed from: ֫ */
    public void mo5589(AbstractActivityC5549 abstractActivityC5549, C18736 c18736, boolean z) {
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public abstract CharSequence mo5123();

    /* JADX INFO: renamed from: ۠ */
    public abstract C13596 mo5124();

    /* JADX INFO: renamed from: ۡ */
    public boolean mo5459() {
        return !(this instanceof C20457);
    }

    /* JADX INFO: renamed from: ۢ */
    public abstract C18736 mo5125();

    /* JADX INFO: renamed from: ۧ */
    public abstract DialogInterfaceC2564 mo12166(AbstractActivityC5549 abstractActivityC5549);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo5126(C18736 c18736);

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo5127();

    /* JADX INFO: renamed from: ᩹֫ */
    public boolean mo13498() {
        return !(this instanceof C10935);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo13455(Intent intent) {
        this.f14845 = intent.getIntExtra("TaskId", -1);
        this.f14850 = intent.getBundleExtra("TaskArgument");
    }

    /* JADX INFO: renamed from: ۫ */
    public final int m13480() {
        return this.f14845;
    }

    /* JADX INFO: renamed from: ۨ */
    public final Bundle m13479() {
        return this.f14850;
    }

    /* JADX INFO: renamed from: ᩸ */
    private void m13450(String str) {
        if (!this.f14850.containsKey(str)) {
            throw new RuntimeException("Key not found in input data");
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    public final String[] m13494(String str) {
        C14677 c14677M33572 = C14677.m33572(m13496(str));
        int i = c14677M33572.readInt();
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = c14677M33572.m33591();
        }
        return strArr;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final String m13492(String str) {
        m13450(str);
        String string = this.f14850.getString(str);
        C12826.requireNonNull(string);
        return string;
    }

    /* JADX INFO: renamed from: ֨ */
    public final String m13453(String str) {
        return C11419.m26414(m13492(str));
    }

    /* JADX INFO: renamed from: ۚ */
    public final String m13467(String str) {
        return C11419.m26402(m13492(str));
    }

    /* JADX INFO: renamed from: ֡ */
    public final AbstractC17043 m13451(String str) {
        return C18524.m42109(m13492(str), new String[0]);
    }

    /* JADX INFO: renamed from: ۠ */
    public final String m13471(String str) {
        return this.f14850.getString(str);
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m13484(String str) {
        m13450(str);
        return this.f14850.getInt(str);
    }

    /* JADX INFO: renamed from: ۖ */
    public final long m13463(String str) {
        m13450(str);
        return this.f14850.getLong(str);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m13488(String str) {
        m13450(str);
        return this.f14850.getBoolean(str);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final byte[] m13496(String str) {
        m13450(str);
        Object obj = this.f14850.get(str);
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (!(obj instanceof String)) {
            throw new RuntimeException(C7470.m17246(obj, "Unknown: "));
        }
        AbstractC17043 abstractC17043M42109 = C18524.m42109((String) obj, new String[0]);
        try {
            byte[] bArrM38664 = abstractC17043M42109.m38664();
            this.f14843.add(abstractC17043M42109);
            return bArrM38664;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public final Serializable m13465(String str) {
        m13450(str);
        return this.f14850.getSerializable(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫֫ */
    public final AbstractC15599 m13462() {
        AbstractC15599 abstractC15599M30905 = C13589.m30905(m13496("ARG_STATELESS_VISITOR"), true);
        if (abstractC15599M30905 instanceof AutoCloseable) {
            this.f14858.add((AutoCloseable) abstractC15599M30905);
        }
        return abstractC15599M30905;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܽ֫ */
    public final AbstractC15599 m13489() {
        AbstractC15599 abstractC15599M30905 = C13589.m30905(m13496("ARG_STATELESS_VISITOR2"), true);
        if (abstractC15599M30905 instanceof AutoCloseable) {
            this.f14858.add((AutoCloseable) abstractC15599M30905);
        }
        return abstractC15599M30905;
    }

    /* JADX INFO: renamed from: ۛ */
    public final C13457 m13469() {
        byte[] byteArray = this.f14850.getByteArray("ARG_SIGNATURE_OPTIONS");
        if (byteArray == null) {
            return null;
        }
        C14677 c14677 = new C14677(byteArray);
        return new C13457(AbstractC14973.m34288(c14677.m33583()), EnumC10104.values()[c14677.readByte()], c14677.m33574(), c14677.m33585());
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m13478(C18107 c18107) {
        return m13492("ARG_CURRENT_WINDOW_DIGEST").equals(c18107.m41248());
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m13461(C18107 c18107) {
        return m13492("ARG_ANOTHER_WINDOW_DIGEST").equals(c18107.m41248());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13459(EnumC16053 enumC16053) {
        if (enumC16053 == EnumC16053.FINISHED) {
            try {
                this.f14848.await();
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this.f14854) {
            this.f14856 = enumC16053;
        }
    }

    /* JADX INFO: renamed from: ֡֫ */
    public final boolean m13452() {
        return this.f14856 == EnumC16053.FINISHED;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m13487(C18736 c18736) {
        this.f14857 = c18736;
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public final C18736 m13473() {
        return this.f14857;
    }

    public void cancel() {
        this.f14859 = true;
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        if (this.f14859) {
            return true;
        }
        C22103 c22103 = this.f14861;
        return c22103 != null && c22103.mo21805() == EnumC15415.DESTROYED;
    }

    /* JADX INFO: renamed from: ۚ */
    public final C7350 m13468() {
        return this.f14860;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13457(C4655 c4655) {
        if (this.f14856 == EnumC16053.FINISHED) {
            throw new IllegalStateException("Can not add FinallyListener after finished");
        }
        this.f14852.add(c4655);
    }

    /* JADX INFO: renamed from: ۗ֫ */
    public final void m13464() {
        AbstractActivityC5549 abstractActivityC5549Mo13485 = mo13485();
        if (abstractActivityC5549Mo13485 != null) {
            C7050.m16212(new RunnableC24771(0, this, abstractActivityC5549Mo13485));
        } else {
            this.f14848.countDown();
            C16723.m37948(this);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m13449(AbstractC5996 abstractC5996, AbstractActivityC5549 abstractActivityC5549) {
        abstractC5996.m13448(abstractActivityC5549, true);
        abstractC5996.f14848.countDown();
        C16723.m37948(abstractC5996);
    }

    /* JADX INFO: renamed from: ֫ */
    public C18736 mo5458(Exception exc) {
        return C18736.m42764(exc);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13460(C18736 c18736) {
        C11245 c11245M130;
        boolean zM26098;
        DialogInterfaceC2564 dialogInterfaceC2564M13454 = m13454();
        ArrayList arrayList = this.f14852;
        if (dialogInterfaceC2564M13454 != null && dialogInterfaceC2564M13454.m3855()) {
            if (f14841.hasMessages(this.f14845)) {
                C7050.m16213(new RunnableC22099(3, dialogInterfaceC2564M13454), 50L);
            } else {
                dialogInterfaceC2564M13454.dismiss();
            }
            AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) C7453.m17221(dialogInterfaceC2564M13454.m3845());
            C12826.requireNonNull(abstractActivityC5549);
            boolean z = this.f14851;
            mo5589(abstractActivityC5549, c18736, z);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC17394) it.next()).mo11130(abstractActivityC5549, c18736, z);
            }
            if (c18736.m42772() && mo13498()) {
                c18736.m42770(abstractActivityC5549);
            }
        } else if (c18736.m42772() && mo13498()) {
            PendingIntent activity = PendingIntent.getActivity(C7050.m16232(), 0, new Intent(C7050.m16232(), (Class<?>) ActivityC11556.class), 67108864);
            C1888 c1888 = new C1888(C7050.m16232(), "MTaskService3");
            c1888.m50330();
            c1888.m50333();
            c1888.m50326(C7050.m16224(R.string.MT_Protector));
            c1888.m50325(mo5123());
            c1888.m50323(activity);
            c1888.m50329();
            c1888.m50328(true);
            ServiceC10885.f30152.notify(this.f14845 + 10000, c1888.m50321());
        }
        if (c18736.m42772()) {
            C16723.m37943(this);
        }
        Main mainM38753 = C17127.m38753();
        if (mainM38753 != null && (c11245M130 = mainM38753.m130()) != null) {
            if (this.f14850.containsKey("ARG_CURRENT_WINDOW_LEFT")) {
                zM26098 = this.f14850.getBoolean("ARG_CURRENT_WINDOW_LEFT");
            } else {
                zM26098 = c11245M130.m26098();
            }
            mo5122(mainM38753, zM26098 ? c11245M130.m26100() : c11245M130.m26081(), !zM26098 ? c11245M130.m26100() : c11245M130.m26081(), c18736);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC17394) it2.next()).getClass();
            }
        }
        mo5126(c18736);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((InterfaceC17394) it3.next()).getClass();
        }
        Iterator it4 = this.f14843.iterator();
        while (it4.hasNext()) {
            ((AbstractC17043) it4.next()).mo25503();
        }
        Iterator it5 = this.f14858.iterator();
        while (it5.hasNext()) {
            C2700.m4192((AutoCloseable) it5.next());
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m13486(AbstractActivityC5549 abstractActivityC5549) {
        m13448(abstractActivityC5549, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m13448(AbstractActivityC5549 abstractActivityC5549, boolean z) {
        synchronized (this.f14854) {
            if (m13452()) {
                return;
            }
            DialogInterfaceC2564 dialogInterfaceC2564M13454 = m13454();
            if (dialogInterfaceC2564M13454 != null && dialogInterfaceC2564M13454.m3855()) {
                if (C7453.m17221(dialogInterfaceC2564M13454.m3845()) == abstractActivityC5549) {
                    return;
                } else {
                    dialogInterfaceC2564M13454.dismiss();
                }
            }
            this.f14851 = z;
            mo13466();
            DialogInterfaceC2564 dialogInterfaceC2564Mo12166 = mo12166(abstractActivityC5549);
            abstractActivityC5549.m12261(dialogInterfaceC2564Mo12166);
            this.f14844 = new WeakReference(dialogInterfaceC2564Mo12166);
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public AbstractActivityC5549 mo13485() {
        return C17127.m38753();
    }

    /* JADX INFO: renamed from: ֨ */
    public final DialogInterfaceC2564 m13454() {
        WeakReference weakReference = this.f14844;
        if (weakReference == null) {
            return null;
        }
        return (DialogInterfaceC2564) weakReference.get();
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m13472(int i) {
        mo13482(C7050.m16224(i));
    }

    /* JADX INFO: renamed from: ܶ */
    public void mo13482(String str) {
        this.f14862 = str;
        this.f14846.set(true);
        m13495();
    }

    /* JADX INFO: renamed from: ᩴ֫ */
    public final CharSequence m13493() {
        return this.f14862;
    }

    /* JADX INFO: renamed from: ᩸֫ */
    public final boolean m13497() {
        return this.f14846.compareAndSet(true, false);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m13491(int i) {
        mo13456(C7050.m16224(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo13456(CharSequence charSequence) {
        this.f14847 = charSequence;
        this.f14842.set(true);
        m13495();
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final CharSequence m13470() {
        return this.f14847;
    }

    /* JADX INFO: renamed from: ܶ֫ */
    public final boolean m13483() {
        return this.f14842.compareAndSet(true, false);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m13477(long j, long j2) {
        mo13474(C20689.m46750(j, j2));
    }

    /* JADX INFO: renamed from: ۢ */
    public void mo13474(int i) {
        if (this.f14855 != i) {
            this.f14855 = i;
            m13495();
        }
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public final int m13475() {
        return this.f14855;
    }

    /* JADX INFO: renamed from: ۙ֫ */
    public void mo13466() {
        this.f14846.set(true);
        this.f14842.set(true);
    }

    /* JADX INFO: renamed from: ᩶֫ */
    public final void m13495() {
        if (this.f14853.m24761()) {
            int i = this.f14845;
            WeakReference weakReference = this.f14849;
            Handler handler = f14841;
            handler.sendMessageDelayed(handler.obtainMessage(i, weakReference), 20L);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13458(AbstractActivityC5549 abstractActivityC5549) {
        AbstractC9381 lifecycle = abstractActivityC5549.getLifecycle();
        if (lifecycle.mo21805() == EnumC15415.DESTROYED) {
            cancel();
        } else {
            this.f14861 = (C22103) lifecycle;
        }
    }

    /* JADX INFO: renamed from: ۬֫ */
    public final C18736 m13481() {
        return mo3924() ? C18736.m42768() : C18736.m42767();
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m13446(String[] strArr) {
        return (List) C23573.stream(strArr).map(new C8678(0)).collect(C24205.toList());
    }

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC5996 m13490() {
        C11361 c11361 = new C11361();
        c11361.f14845 = this.f14845;
        c11361.f14857 = this.f14857;
        c11361.f14862 = C7050.m16224(R.string.MT_Protector);
        c11361.f14847 = mo5123();
        c11361.f14856 = EnumC16053.FINISHED;
        return c11361;
    }

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC14797 mo13476() {
        m13472(R.string.MT_Protector);
        mo13474(0);
        return new C10690(this);
    }
}
