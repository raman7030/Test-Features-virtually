package l;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩹ۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4Q2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22116 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23527 f71797;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C15765 f71798;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20000 f71799;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7299 f71800;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12238 f71801;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13648 f71802;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10122 f71803;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC11242 f71804;

    public AbstractC22116(C15765 c15765, InterfaceC7299 interfaceC7299, C14416 c14416, C3855 c3855, C3149 c3149, C5971 c5971, C15142 c15142, InterfaceC23527 interfaceC23527) {
        this.f71798 = c15765;
        this.f71800 = interfaceC7299;
        this.f71804 = c14416;
        this.f71799 = c3855;
        this.f71803 = c3149;
        this.f71802 = c5971;
        this.f71801 = c15142;
        this.f71797 = interfaceC23527;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49717(C23589 c23589, Set set) {
        C15765 c15765 = this.f71798;
        c15765.m37178(29, 0);
        C15765.m37168(c15765, ((C14416) this.f71804).mo8575(c23589));
        C15765.m37168(c15765, set.size());
        AbstractC4628 abstractC4628ListIterator = AbstractC14545.m34731(AbstractC10232.m25862(AbstractC14534.f44527), set).listIterator(0);
        while (abstractC4628ListIterator.hasNext()) {
            InterfaceC9272 interfaceC9272 = (InterfaceC9272) abstractC4628ListIterator.next();
            InterfaceC7299 interfaceC7299 = this.f71800;
            InterfaceC23527 interfaceC23527 = this.f71797;
            C15765.m37168(c15765, interfaceC7299.mo8575(interfaceC23527.mo51994(interfaceC9272)));
            C0949 c0949 = (C0949) this;
            c0949.f3574.mo44614(c0949, interfaceC23527.mo51991(interfaceC9272));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49710(List list) {
        C15765 c15765 = this.f71798;
        c15765.m37178(28, 0);
        C15765.m37168(c15765, list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0949 c0949 = (C0949) this;
            c0949.f3574.mo44614(c0949, it.next());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49718(boolean z) {
        this.f71798.m37178(31, z ? 1 : 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49704(byte b) {
        this.f71798.m37173(0, b);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49705(char c) {
        this.f71798.m37176(3, c);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49706(double d) {
        this.f71798.m37170(d);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49714(C18672 c18672) {
        this.f71798.m37176(27, ((C3855) this.f71799).mo8575(c18672));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49720(C18672 c18672) {
        this.f71798.m37176(25, ((C3855) this.f71799).mo8575(c18672));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49707(float f) {
        this.f71798.m37171(f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49708(int i) {
        this.f71798.m37173(4, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49709(long j) {
        this.f71798.m37177(j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49712(C12321 c12321) {
        this.f71798.m37176(26, ((C3149) this.f71803).mo8575(c12321));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49703() {
        this.f71798.write(30);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49719(int i) {
        this.f71798.m37173(2, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49711(C7382 c7382) {
        this.f71798.m37176(23, this.f71800.mo8575(c7382));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49716(C23589 c23589) {
        this.f71798.m37176(24, ((C14416) this.f71804).mo8575(c23589));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49713(C13026 c13026) {
        this.f71798.m37176(21, ((C5971) this.f71802).mo8575(c13026));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49715(C21494 c21494) {
        this.f71798.m37176(22, ((C15142) this.f71801).mo8575(c21494));
    }
}
