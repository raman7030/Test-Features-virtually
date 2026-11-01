package p067l;

import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.umeng.analytics.pro.C0655am;
import org.bouncycastle.asn1.BERTags;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.᩶۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7EE */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC21552 {
    NONE(0, "n/a", false),
    CLASS(1, Name.LABEL, false),
    FIELD(2, "field", false),
    METHOD(4, AbstractC0213e.f995s, false),
    INNER_CLASS(8, "inner-class", false),
    MODULE(16, C0655am.f2344e, false),
    REQUIRES(32, "requires", false),
    EXPORTS(64, "exports", false),
    OPENS(128, "opens", false),
    METHOD_PARAMETERS(256, "method parameters", false),
    MODULE_DIRECTIVES(BERTags.FLAGS, "module directives", false),
    ORDINARY(512, "ordinary", true),
    VALUE_OBJECTS(512, "value classes and objects", true);


    /* JADX INFO: renamed from: ᩶ */
    public final String f67985;

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f67986;

    /* JADX INFO: renamed from: ᩹ */
    public final int f67987;

    EnumC21552(int i, String str, boolean z) {
        this.f67987 = i;
        this.f67985 = str;
        this.f67986 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public int m48740() {
        return this.f67987;
    }

    public String getName() {
        return this.f67985;
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean m48743() {
        return this.f67986;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m48742(EnumC21552... enumC21552Arr) {
        for (EnumC21552 enumC21552 : enumC21552Arr) {
            if ((enumC21552.f67987 & this.f67987) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m48741(EnumC8140 enumC8140) {
        return (enumC8140.m18904() & this.f67987) != 0;
    }
}
