package p067l;

import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0719o;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M5GJ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18413 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f54981;

    /* JADX INFO: renamed from: ۖ */
    public boolean f54982;

    /* JADX INFO: renamed from: ۘ */
    public ArrayList f54983;

    /* JADX INFO: renamed from: ۜ */
    public int f54984;

    /* JADX INFO: renamed from: ۡ */
    public int f54985;

    /* JADX INFO: renamed from: ۢ */
    public ArrayList f54986;

    /* JADX INFO: renamed from: ۧ */
    public boolean f54987;

    /* JADX INFO: renamed from: ܳ */
    public CharSequence f54988;

    /* JADX INFO: renamed from: ܺ */
    public int f54989;

    /* JADX INFO: renamed from: ܽ */
    public int f54990;

    /* JADX INFO: renamed from: ܿ */
    public int f54991;

    /* JADX INFO: renamed from: ᩳ */
    public CharSequence f54992;

    /* JADX INFO: renamed from: ᩴ */
    public ArrayList f54993;

    /* JADX INFO: renamed from: ᩵ */
    public int f54994;

    /* JADX INFO: renamed from: ᩷ */
    public String f54995;

    /* JADX INFO: renamed from: ᩻ */
    public int f54996;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC18413 mo41915(AbstractC9724 abstractC9724);

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC18413 mo41916(ComponentCallbacksC11117 componentCallbacksC11117, EnumC15415 enumC15415);

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC18413 mo41917(AbstractC16003 abstractC16003);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo41921(int i, ComponentCallbacksC11117 componentCallbacksC11117, String str, int i2);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo41926();

    /* JADX INFO: renamed from: ۧ */
    public abstract AbstractC18413 mo41927(ComponentCallbacksC11117 componentCallbacksC11117);

    /* JADX INFO: renamed from: ۧ */
    public abstract AbstractC18413 mo41928(AbstractC16003 abstractC16003);

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo41930();

    /* JADX INFO: renamed from: ܽ */
    public abstract AbstractC18413 mo41931(ComponentCallbacksC11117 componentCallbacksC11117);

    /* JADX INFO: renamed from: ᩳ */
    public abstract void mo41933();

    /* JADX INFO: renamed from: ֫ */
    public final void m41924(C13050 c13050) {
        this.f54986.add(c13050);
        c13050.f36699 = this.f54996;
        c13050.f36701 = this.f54984;
        c13050.f36696 = this.f54985;
        c13050.f36702 = this.f54989;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41925(AbstractC23136 abstractC23136) {
        mo41921(R.id.MT_Protector, abstractC23136, null, 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41923(ComponentCallbacksC11117 componentCallbacksC11117, String str) {
        mo41921(R.id.MT_Protector, componentCallbacksC11117, str, 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41920(int i, ComponentCallbacksC11117 componentCallbacksC11117, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        mo41921(i, componentCallbacksC11117, str, 2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41922(ComponentCallbacksC11117 componentCallbacksC11117) {
        m41924(new C13050(componentCallbacksC11117, 7));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41919(int i, int i2) {
        this.f54996 = i;
        this.f54984 = i2;
        this.f54985 = 0;
        this.f54989 = 0;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m41929() {
        this.f54994 = C0719o.a.f2897c;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41918() {
        if (!this.f54987) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f54981 = true;
        this.f54995 = null;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m41932() {
        this.f54982 = true;
    }
}
