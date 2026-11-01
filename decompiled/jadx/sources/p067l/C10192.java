package p067l;

import java.util.Collection;

/* JADX INFO: renamed from: l.۠ܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes4.dex */
public class C10192 extends AbstractC15635 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C23603 f28257;

    /* JADX INFO: renamed from: ᩳ */
    public Collection f28258;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10192(C23603 c23603, InterfaceC4317 interfaceC4317, EnumC2483... enumC2483Arr) {
        super(interfaceC4317, enumC2483Arr);
        this.f28257 = c23603;
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public boolean mo22380(EnumC2483 enumC2483, String str) {
        Collection collectionUnmodifiableCollection;
        if (!this.f44742.contains(enumC2483)) {
            return false;
        }
        this.f44740 = true;
        if (str == null) {
            collectionUnmodifiableCollection = null;
        } else {
            C3486 c3486Mo8426 = mo8426();
            c3486Mo8426.m6222(str);
            collectionUnmodifiableCollection = C21562.unmodifiableCollection(c3486Mo8426);
        }
        this.f28258 = collectionUnmodifiableCollection;
        return true;
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ܽ */
    public Collection mo8427() {
        return this.f28258;
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public void mo22379(Iterable iterable) {
        C3486 c3486Mo8428;
        if (iterable == null) {
            c3486Mo8428 = mo8428();
        } else {
            this.f44740 = true;
            C3486 c3486Mo8426 = mo8426();
            c3486Mo8426.m6221(iterable, c3486Mo8426.f6993.f75136);
            c3486Mo8428 = c3486Mo8426;
        }
        this.f28258 = C21562.unmodifiableCollection(c3486Mo8428);
    }

    /* JADX INFO: renamed from: ᩻ */
    public C3486 mo8428() {
        C3486 c3486Mo8426 = mo8426();
        c3486Mo8426.m6222((String) null);
        return c3486Mo8426;
    }

    /* JADX INFO: renamed from: ۜ */
    public C3486 mo8426() {
        return new C3486(this.f28257);
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public boolean mo22381(InterfaceC22097 interfaceC22097) {
        return C23603.m52418(this.f28257, this.f28258, interfaceC22097);
    }
}
