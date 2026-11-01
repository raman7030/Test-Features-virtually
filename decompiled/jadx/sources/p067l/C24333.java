package p067l;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩺ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A7MK */
/* JADX INFO: loaded from: classes.dex */
public class C24333 extends AbstractC15615 {

    /* JADX INFO: renamed from: ֫ */
    public LinkedHashMap f77093 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۧ */
    public AbstractC15615 f77094;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C4257 f77095;

    @Override // p067l.AbstractC15615
    /* JADX INFO: renamed from: ֫ */
    public boolean mo28285(C18511 c18511, C11281 c11281) {
        return false;
    }

    public C24333(C4257 c4257) {
        this.f77095 = c4257;
        this.f77094 = c4257.f9436;
    }

    @Override // p067l.AbstractC15615
    /* JADX INFO: renamed from: ֫ */
    public C13818 mo22319(C18511 c18511) {
        C13818 c13818Mo22319 = this.f77094.mo22319(c18511);
        if (c13818Mo22319 != null) {
            return c13818Mo22319;
        }
        C13818 c13818 = new C13818(c18511.f20409, c18511.f20408, c18511.f20406, this.f77095.f9437);
        c13818.m17993(c18511.mo18000());
        this.f77093.put(c18511, c13818);
        return c13818;
    }

    @Override // p067l.AbstractC15615
    /* JADX INFO: renamed from: ۧ */
    public final C13818 mo32808(final C18511 c18511) {
        C13818 c13818Mo32808 = this.f77094.mo32808(c18511);
        return c13818Mo32808 != null ? c13818Mo32808 : (C13818) C7480.stream(this.f77093.entrySet()).filter(new Predicate() { // from class: l.ۨܽ۠
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
            public /* synthetic */ Predicate m30960or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                C18511 c18512 = (C18511) ((Map.Entry) obj).getKey();
                c18512.getClass();
                C4848 c4848M10276of = C4848.m10276of((Object) c18512);
                C18511 c18513 = c18511;
                c18513.getClass();
                return c4848M10276of.containsAll(C4848.m10276of((Object) c18513));
            }
        }).findFirst().map(new C18117(2)).orElse(null);
    }

    @Override // p067l.AbstractC15615
    /* JADX INFO: renamed from: ֫ */
    public final C4848 mo32804(int i) {
        LinkedHashMap linkedHashMap = this.f77093;
        if (linkedHashMap.isEmpty()) {
            return C4848.m10283();
        }
        C20271 c20271 = new C20271();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C13818 c13818 = (C13818) entry.getValue();
            C18537 c18537 = this.f77095.f9430;
            c18537.f55352 = i;
            C11281 c11281M42166 = c18537.m42166(c13818, (AbstractC14355) null);
            if ((((C18511) entry.getKey()).f20409 & 1152921504606846976L) != 0) {
                if (!this.f77094.mo28285((C18511) entry.getKey(), c11281M42166)) {
                }
            }
            c20271.m45777(c11281M42166);
        }
        return c20271.m45783();
    }

    @Override // p067l.AbstractC15615
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC13154 mo32805(AbstractC13154 abstractC13154) {
        C4848 c4848Mo32804 = mo32804(abstractC13154.f18924);
        if (!c4848Mo32804.m10293()) {
            return abstractC13154;
        }
        C18537 c18537 = this.f77095.f9430;
        c18537.f55352 = abstractC13154.f18924;
        return c18537.m42145(0L, c4848Mo32804.m10286(abstractC13154));
    }

    @Override // p067l.AbstractC15615
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14355 mo32806(AbstractC14355 abstractC14355) {
        for (C13818 c13818 : this.f77093.values()) {
            C4257 c4257 = this.f77095;
            C18537 c18537 = c4257.f9430;
            int i = abstractC14355.f18924;
            c18537.f55352 = i;
            C18537 c18538 = c4257.f9430;
            c18538.f55352 = i;
            C5916 c5916M42148 = c18537.m42148(c18538.m42166(c13818, (AbstractC14355) null), abstractC14355);
            c5916M42148.f18925 = abstractC14355.f18925;
            abstractC14355 = c5916M42148;
        }
        return abstractC14355;
    }

    @Override // p067l.AbstractC15615
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15615 mo32807() {
        C4257 c4257 = this.f77095;
        AbstractC15615 abstractC15615 = this.f77094;
        c4257.f9436 = abstractC15615;
        return abstractC15615;
    }
}
