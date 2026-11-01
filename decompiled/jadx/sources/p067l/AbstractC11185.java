package p067l;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8RB */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11185 implements InterfaceC6076 {

    /* JADX INFO: renamed from: ۙ */
    public Looper f31039;

    /* JADX INFO: renamed from: ۫ */
    public AbstractC6974 f31040;

    /* JADX INFO: renamed from: ۬ */
    public C15512 f31041;

    /* JADX INFO: renamed from: ۗ */
    public final ArrayList f31038 = new ArrayList(1);

    /* JADX INFO: renamed from: ᩹ */
    public final HashSet f31044 = new HashSet(1);

    /* JADX INFO: renamed from: ᩶ */
    public final C10099 f31042 = new C10099();

    /* JADX INFO: renamed from: ᩸ */
    public final C16658 f31043 = new C16658();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo11865(InterfaceC2830 interfaceC2830);

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public /* synthetic */ void mo11867(C13010 c13010) {
    }

    /* JADX INFO: renamed from: ܳ */
    public void mo25807() {
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ܽ */
    public /* synthetic */ boolean mo13821() {
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    public void mo25808() {
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ᩳ */
    public /* synthetic */ AbstractC6974 mo13822() {
        return null;
    }

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo11869();

    /* JADX INFO: renamed from: ֫ */
    public final void m25803(AbstractC6974 abstractC6974) {
        this.f31040 = abstractC6974;
        Iterator it = this.f31038.iterator();
        while (it.hasNext()) {
            ((InterfaceC4735) it.next()).mo5358(this, abstractC6974);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C10099 m25806(C17474 c17474) {
        return this.f31042.m23557(0, c17474);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C10099 m25805(int i, C17474 c17474) {
        return this.f31042.m23557(i, c17474);
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final void mo13813(Handler handler, InterfaceC16803 interfaceC16803) {
        handler.getClass();
        this.f31042.m23558(handler, interfaceC16803);
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final void mo13814(Handler handler, InterfaceC22695 interfaceC22695) {
        handler.getClass();
        this.f31043.m37720(handler, interfaceC22695);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16658 m25802(C17474 c17474) {
        return this.f31043.m37717(0, c17474);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16658 m25801(int i, C17474 c17474) {
        return this.f31043.m37717(i, c17474);
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m25804() {
        return !this.f31044.isEmpty();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C15512 m25809() {
        C15512 c15512 = this.f31041;
        C23877.m52958(c15512);
        return c15512;
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final void mo13817(InterfaceC16803 interfaceC16803) {
        this.f31042.m23562(interfaceC16803);
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final void mo13818(InterfaceC22695 interfaceC22695) {
        this.f31043.m37722(interfaceC22695);
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final void mo13816(InterfaceC4735 interfaceC4735, InterfaceC2830 interfaceC2830, C15512 c15512) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f31039;
        C23877.m52957(looper == null || looper == looperMyLooper);
        this.f31041 = c15512;
        AbstractC6974 abstractC6974 = this.f31040;
        this.f31038.add(interfaceC4735);
        if (this.f31039 == null) {
            this.f31039 = looperMyLooper;
            this.f31044.add(interfaceC4735);
            mo11865(interfaceC2830);
        } else if (abstractC6974 != null) {
            mo13815(interfaceC4735);
            interfaceC4735.mo5358(this, abstractC6974);
        }
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final void mo13815(InterfaceC4735 interfaceC4735) {
        this.f31039.getClass();
        HashSet hashSet = this.f31044;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC4735);
        if (zIsEmpty) {
            mo25807();
        }
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ܽ */
    public final void mo13820(InterfaceC4735 interfaceC4735) {
        HashSet hashSet = this.f31044;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC4735);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        mo25808();
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ۧ */
    public final void mo13819(InterfaceC4735 interfaceC4735) {
        ArrayList arrayList = this.f31038;
        arrayList.remove(interfaceC4735);
        if (arrayList.isEmpty()) {
            this.f31039 = null;
            this.f31040 = null;
            this.f31041 = null;
            this.f31044.clear();
            mo11869();
            return;
        }
        mo13820(interfaceC4735);
    }
}
