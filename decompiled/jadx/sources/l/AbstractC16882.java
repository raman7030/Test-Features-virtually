package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.o;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M5GJ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16882 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f51800;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f51801;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ArrayList f51802;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f51803;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f51804;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ArrayList f51805;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f51806;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence f51807;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f51808;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f51809;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f51810;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public CharSequence f51811;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ArrayList f51812;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f51813;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f51814;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f51815;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract AbstractC16882 mo39674(AbstractC7739 abstractC7739);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract AbstractC16882 mo39675(ComponentCallbacksC9205 componentCallbacksC9205, EnumC13728 enumC13728);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract AbstractC16882 mo39676(AbstractC14346 abstractC14346);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo39680(int i, ComponentCallbacksC9205 componentCallbacksC9205, String str, int i2);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract int mo39685();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC16882 mo39686(ComponentCallbacksC9205 componentCallbacksC9205);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC16882 mo39687(AbstractC14346 abstractC14346);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract int mo39689();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC16882 mo39690(ComponentCallbacksC9205 componentCallbacksC9205);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public abstract void mo39692();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39683(C11239 c11239) {
        this.f51805.add(c11239);
        c11239.f33699 = this.f51815;
        c11239.f33701 = this.f51803;
        c11239.f33696 = this.f51804;
        c11239.f33702 = this.f51808;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39684(AbstractC21851 abstractC21851) {
        mo39680(R.id.MT_Protector, abstractC21851, null, 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39682(ComponentCallbacksC9205 componentCallbacksC9205, String str) {
        mo39680(R.id.MT_Protector, componentCallbacksC9205, str, 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39679(int i, ComponentCallbacksC9205 componentCallbacksC9205, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        mo39680(i, componentCallbacksC9205, str, 2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39681(ComponentCallbacksC9205 componentCallbacksC9205) {
        m39683(new C11239(componentCallbacksC9205, 7));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39678(int i, int i2) {
        this.f51815 = i;
        this.f51803 = i2;
        this.f51804 = 0;
        this.f51808 = 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m39688() {
        this.f51813 = o.a.c;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39677() {
        if (!this.f51806) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f51800 = true;
        this.f51814 = null;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m39691() {
        this.f51801 = true;
    }
}
