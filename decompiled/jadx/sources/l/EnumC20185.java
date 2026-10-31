package l;

import com.alipay.sdk.m.t.e;
import com.umeng.analytics.pro.am;
import org.bouncycastle.asn1.BERTags;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.᩶۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7EE */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC20185 {
    NONE(0, "n/a", false),
    CLASS(1, Name.LABEL, false),
    FIELD(2, "field", false),
    METHOD(4, e.s, false),
    INNER_CLASS(8, "inner-class", false),
    MODULE(16, am.e, false),
    REQUIRES(32, "requires", false),
    EXPORTS(64, "exports", false),
    OPENS(128, "opens", false),
    METHOD_PARAMETERS(256, "method parameters", false),
    MODULE_DIRECTIVES(BERTags.FLAGS, "module directives", false),
    ORDINARY(512, "ordinary", true),
    VALUE_OBJECTS(512, "value classes and objects", true);


    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f65337;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f65338;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f65339;

    EnumC20185(int i, String str, boolean z) {
        this.f65339 = i;
        this.f65337 = str;
        this.f65338 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m46421() {
        return this.f65339;
    }

    public String getName() {
        return this.f65337;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m46424() {
        return this.f65338;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m46423(EnumC20185... enumC20185Arr) {
        for (EnumC20185 enumC20185 : enumC20185Arr) {
            if ((enumC20185.f65339 & this.f65339) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m46422(EnumC6073 enumC6073) {
        return (enumC6073.m16975() & this.f65339) != 0;
    }
}
