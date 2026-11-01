package p067l;

import android.net.wifi.WifiManager;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܰ᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes3.dex */
public final class C15747 {

    /* JADX INFO: renamed from: ܳ */
    public final WeakReference f45589;

    /* JADX INFO: renamed from: ܿ */
    public WifiManager.MulticastLock f45591;

    /* JADX INFO: renamed from: ܽ */
    public final C7350 f45590 = new C7350();

    /* JADX INFO: renamed from: ᩳ */
    public final LinkedHashMap f45592 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۧ */
    public final LinkedHashMap f45588 = new LinkedHashMap();

    /* JADX INFO: renamed from: ֫ */
    public final AtomicInteger f45587 = new AtomicInteger();

    /* JADX INFO: renamed from: ֫ */
    private synchronized void m35790(String str) {
        if (this.f45592.remove(str) != null) {
            m35800();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private synchronized void m35791(String str, C12752 c12752) {
        this.f45592.put(str, c12752);
        m35800();
    }

    public C15747(DialogInterfaceC2564 dialogInterfaceC2564) {
        this.f45589 = new WeakReference(dialogInterfaceC2564);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35794(C15747 c15747, AbstractActivityC5549 abstractActivityC5549) {
        try {
            WifiManager wifiManager = (WifiManager) abstractActivityC5549.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                return;
            }
            WifiManager.MulticastLock multicastLockCreateMulticastLock = wifiManager.createMulticastLock(abstractActivityC5549.getPackageName() + ":NetworkServiceScanner");
            multicastLockCreateMulticastLock.setReferenceCounted(false);
            multicastLockCreateMulticastLock.acquire();
            c15747.f45591 = multicastLockCreateMulticastLock;
        } catch (RuntimeException unused) {
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m35802(C15747 c15747) {
        WifiManager.MulticastLock multicastLock = c15747.f45591;
        c15747.f45591 = null;
        if (multicastLock == null || !multicastLock.isHeld()) {
            return;
        }
        try {
            multicastLock.release();
        } catch (RuntimeException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35797(C15747 c15747, C22140 c22140, String str, C12752 c12752) {
        synchronized (c15747) {
            if (!c22140.m49926() && !c15747.m35798()) {
                c15747.m35791(str, c12752);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35796(C15747 c15747, C22140 c22140, String str) {
        synchronized (c15747) {
            if (!c22140.m49926() && !c15747.m35798()) {
                c15747.m35790(str);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35795(C15747 c15747, C12752 c12752) {
        synchronized (c15747) {
            if (!c15747.f45588.containsKey(c12752.f35809)) {
                c15747.f45588.put(c12752.f35809, c12752);
                c15747.m35800();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m35800() {
        Collection<C12752> collectionValues = this.f45592.values();
        Collection<C12752> collectionValues2 = this.f45588.values();
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C12752 c12752 : collectionValues) {
            if (linkedHashSet.add(c12752.f35809)) {
                arrayList.add(c12752);
            }
        }
        for (C12752 c12753 : collectionValues2) {
            if (linkedHashSet.add(c12753.f35809)) {
                arrayList.add(c12753);
            }
        }
        this.f45590.mo4062(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public boolean m35798() {
        DialogInterfaceC2564 dialogInterfaceC2564 = (DialogInterfaceC2564) this.f45589.get();
        return dialogInterfaceC2564 == null || !dialogInterfaceC2564.m3855();
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m35801(C15747 c15747) {
        if (c15747.f45587.decrementAndGet() == 0) {
            C7050.m16212(new RunnableC24465(c15747));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35793(C15747 c15747, int i) {
        if (i != 0) {
            c15747.f45587.set(i);
        } else {
            C7050.m16212(new RunnableC24465(c15747));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m35792(C15747 c15747) {
        TextView textView;
        DialogInterfaceC2564 dialogInterfaceC2564 = (DialogInterfaceC2564) c15747.f45589.get();
        if (dialogInterfaceC2564 == null || !dialogInterfaceC2564.m3855() || (textView = (TextView) dialogInterfaceC2564.m3846(R.id.MT_Protector)) == null) {
            return;
        }
        textView.setText(R.string.MT_Protector);
    }
}
