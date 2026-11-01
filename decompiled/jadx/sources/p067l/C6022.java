package p067l;

/* JADX INFO: renamed from: l.ۘۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9RC */
/* JADX INFO: loaded from: classes3.dex */
public final class C6022 extends AbstractC19433 {
    @Override // p067l.AbstractC24797
    /* JADX INFO: renamed from: ֫ */
    public final String mo4127() {
        return "ParameterIII";
    }

    @Override // p067l.AbstractC19433
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9923(C2993 c2993) {
        for (C17430 c17430 : c2993.mo5036()) {
            if (EnumC17248.PRIVATE.m39032(c17430.mo13086()) && EnumC17248.STATIC.m39032(c17430.mo13086()) && c17430.getType().equals("[S")) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.AbstractC19433
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13533(C3349 c3349) {
        return EnumC17248.STATIC.m39032(c3349.mo5854());
    }
}
