package p067l;

import java.io.IOException;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۜ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7F3 */
/* JADX INFO: loaded from: classes3.dex */
public class C8792 implements InterfaceC13980 {

    /* JADX INFO: renamed from: ᩸ */
    public final EnumC6799 f23858;

    /* JADX INFO: renamed from: ᩹ */
    public final C17450 f23859;

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo5158() {
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public int mo7908() {
        return 0;
    }

    public C8792(C5263 c5263, EnumC6799 enumC6799) {
        this.f23858 = enumC6799;
        this.f23859 = c5263.m11354(enumC6799.m15521());
    }

    @Override // p067l.InterfaceC13980
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC4079 mo16297(C5263 c5263) {
        C17450 c17450M11356;
        if (this instanceof C20863) {
            C20863 c20863 = (C20863) this;
            final C17450 c17450 = c20863.f65552;
            if (!c17450.mo20303() && c17450.m39779() == EnumC12758.f35911 && this.f23858.m15519() == EnumC12758.f35904) {
                C18189 c18189FindFirst = C7480.stream(c5263.f12390.values()).filter(new Predicate() { // from class: l.ܳ۫ۚ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C20697.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo55838negate() {
                        return C20697.$default$negate(this);
                    }

                    /* JADX INFO: renamed from: or */
                    public /* synthetic */ Predicate m36813or(Predicate predicate) {
                        return C20697.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C17450 c17451 = (C17450) obj;
                        return c17451.mo20303() && c17451.m39779() == EnumC12758.f35911 && c17451.m39777(c17450);
                    }
                }).findFirst();
                if (c18189FindFirst.isPresent()) {
                    c17450M11356 = (C17450) c18189FindFirst.get();
                } else {
                    c17450M11356 = c5263.m11356((AbstractC4711) new C22698((C17450) c17450.f52180.f10654));
                }
                c20863.f65552 = c17450M11356;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public C17450 mo15436(final C17450 c17450, C5263 c5263) {
        if (C24885.f79478[c17450.m39779().ordinal()] != 2 || this.f23858.m15519() != EnumC12758.f35925) {
            return c17450;
        }
        C18189 c18189FindAny = C7480.stream(c5263.f12390.values()).filter(new Predicate() { // from class: l.ܿ۫ۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m42922or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                C17450 c17451 = (C17450) obj;
                return c17451.m39779() == EnumC12758.f35925 && c17451.f52180.f10654.equals(c17450);
            }
        }).findAny();
        if (c18189FindAny.isPresent()) {
            return (C17450) c18189FindAny.get();
        }
        return c5263.m11356((AbstractC4711) new C15991(c17450));
    }

    @Override // p067l.InterfaceC4079
    public int getLength() {
        return mo7908() + 6;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18818(this.f23859.f23817);
        c8121.m18816(mo7908());
    }

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC6799 m20355() {
        return this.f23858;
    }
}
