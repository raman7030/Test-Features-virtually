package l;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩺ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A7MK */
/* JADX INFO: loaded from: classes.dex */
public class C23111 extends AbstractC13938 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f74348 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC13938 f74349;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1987 f74350;

    @Override // l.AbstractC13938
    /* JADX INFO: renamed from: ֫ */
    public boolean mo26256(C16986 c16986, C9378 c9378) {
        return false;
    }

    public C23111(C1987 c1987) {
        this.f74350 = c1987;
        this.f74349 = c1987.f6656;
    }

    @Override // l.AbstractC13938
    /* JADX INFO: renamed from: ֫ */
    public C12048 mo20342(C16986 c16986) {
        C12048 c12048Mo20342 = this.f74349.mo20342(c16986);
        if (c12048Mo20342 != null) {
            return c12048Mo20342;
        }
        C12048 c12048 = new C12048(c16986.f17563, c16986.f17562, c16986.f17560, this.f74350.f6657);
        c12048.m16074(c16986.mo16081());
        this.f74348.put(c16986, c12048);
        return c12048;
    }

    @Override // l.AbstractC13938
    /* JADX INFO: renamed from: ۧ */
    public final C12048 mo30736(final C16986 c16986) {
        C12048 c12048Mo30736 = this.f74349.mo30736(c16986);
        return c12048Mo30736 != null ? c12048Mo30736 : (C12048) C5378.stream(this.f74348.entrySet()).filter(new Predicate() { // from class: l.ۨܽ۠
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                C16986 c16987 = (C16986) ((Map.Entry) obj).getKey();
                c16987.getClass();
                C2609 c2609Of = C2609.of((Object) c16987);
                C16986 c16988 = c16986;
                c16988.getClass();
                return c2609Of.containsAll(C2609.of((Object) c16988));
            }
        }).findFirst().map(new C16571(2)).orElse(null);
    }

    @Override // l.AbstractC13938
    /* JADX INFO: renamed from: ֫ */
    public final C2609 mo30732(int i) {
        LinkedHashMap linkedHashMap = this.f74348;
        if (linkedHashMap.isEmpty()) {
            return C2609.m8239();
        }
        C18837 c18837 = new C18837();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C12048 c12048 = (C12048) entry.getValue();
            C17013 c17013 = this.f74350.f6650;
            c17013.f52172 = i;
            C9378 c9378M39923 = c17013.m39923(c12048, (AbstractC12612) null);
            if ((((C16986) entry.getKey()).f17563 & 1152921504606846976L) != 0) {
                if (!this.f74349.mo26256((C16986) entry.getKey(), c9378M39923)) {
                }
            }
            c18837.m43511(c9378M39923);
        }
        return c18837.m43517();
    }

    @Override // l.AbstractC13938
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11349 mo30733(AbstractC11349 abstractC11349) {
        C2609 c2609Mo30732 = mo30732(abstractC11349.f16085);
        if (!c2609Mo30732.m8249()) {
            return abstractC11349;
        }
        C17013 c17013 = this.f74350.f6650;
        c17013.f52172 = abstractC11349.f16085;
        return c17013.m39902(0L, c2609Mo30732.m8242(abstractC11349));
    }

    @Override // l.AbstractC13938
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12612 mo30734(AbstractC12612 abstractC12612) {
        for (C12048 c12048 : this.f74348.values()) {
            C1987 c1987 = this.f74350;
            C17013 c17013 = c1987.f6650;
            int i = abstractC12612.f16085;
            c17013.f52172 = i;
            C17013 c17014 = c1987.f6650;
            c17014.f52172 = i;
            C3733 c3733M39905 = c17013.m39905(c17014.m39923(c12048, (AbstractC12612) null), abstractC12612);
            c3733M39905.f16086 = abstractC12612.f16086;
            abstractC12612 = c3733M39905;
        }
        return abstractC12612;
    }

    @Override // l.AbstractC13938
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC13938 mo30735() {
        C1987 c1987 = this.f74350;
        AbstractC13938 abstractC13938 = this.f74349;
        c1987.f6656 = abstractC13938;
        return abstractC13938;
    }
}
