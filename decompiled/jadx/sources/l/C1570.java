package l;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.֫ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9Q3 */
/* JADX INFO: loaded from: classes2.dex */
public class C1570 extends C17798 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C1570 f5566 = new C1570(0);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Map f5567;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Map f5568;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Map f5569;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Map f5570;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C1570 m5384() {
        return new C1570();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7174 m5385(C17757 c17757, int i) {
        return (C7174) this.f5568.get(new C13523(c17757, i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5386(C16114 c16114) {
        C7174 c7174;
        Map map;
        Map map2;
        if (c16114.m38019() == EnumC9997.IMMUTABLE || c16114.m38019() == EnumC9997.MUTABLE) {
            if (c16114.mo16212().m1138() == EnumC18463.MESSAGE) {
                if (c16114.mo16213() == null) {
                    throw new IllegalStateException("Registered message-type extension had null default instance: " + c16114.mo16212().mo1141());
                }
                c7174 = new C7174(c16114.mo16212(), c16114.mo16213());
            } else {
                c7174 = new C7174(c16114.mo16212(), null);
            }
            EnumC9997 enumC9997M38019 = c16114.m38019();
            C0117 c0117 = c7174.f21972;
            if (!c0117.m1126()) {
                throw new IllegalArgumentException("ExtensionRegistry.add() was given a FieldDescriptor for a regular (non-extension) field.");
            }
            int i = C22696.f73333[enumC9997M38019.ordinal()];
            if (i == 1) {
                map = this.f5569;
                map2 = this.f5568;
            } else {
                if (i != 2) {
                    return;
                }
                map = this.f5567;
                map2 = this.f5570;
            }
            map.put(c0117.mo1141(), c7174);
            map2.put(new C13523(c0117.m1144(), c0117.getNumber()), c7174);
            if (c0117.m1144().m41593().m39380() && c0117.getType() == EnumC19169.f60400 && c0117.m1136() && c0117.m1123() == c0117.m1147()) {
                map.put(c0117.m1147().mo1141(), c7174);
            }
        }
    }

    public C1570() {
        this.f5569 = new HashMap();
        this.f5567 = new HashMap();
        this.f5568 = new HashMap();
        this.f5570 = new HashMap();
    }

    public C1570(int i) {
        super(C17798.f54419);
        Map map = Collections.EMPTY_MAP;
        this.f5569 = map;
        this.f5567 = map;
        this.f5568 = map;
        this.f5570 = map;
    }
}
