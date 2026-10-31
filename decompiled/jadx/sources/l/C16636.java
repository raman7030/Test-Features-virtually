package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7DV */
/* JADX INFO: loaded from: classes5.dex */
public class C16636 implements InterfaceC12218 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15869 f51084;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f51085 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f51086;

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo2829() {
        return true;
    }

    @Override // l.InterfaceC12218
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC1800 mo14394(C3046 c3046) {
        Iterator it = this.f51085.iterator();
        while (it.hasNext()) {
            ((C10993) it.next()).mo14394(c3046);
        }
        return this;
    }

    public C16636(C15869 c15869, boolean z) {
        this.f51084 = c15869;
        this.f51086 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m39168(C10993 c10993) {
        this.f51085.add(c10993);
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16889(this.f51084.f20943);
        ArrayList arrayList = this.f51085;
        c6053.m16889(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC1800) it.next()).mo2828(c6053);
        }
    }

    @Override // l.InterfaceC1800
    public int getLength() {
        return C5378.stream(this.f51085).flatMapToInt(new C1820()).sum() + 4;
    }
}
