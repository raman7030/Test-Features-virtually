package p067l;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 359P */
/* JADX INFO: loaded from: classes4.dex */
public final class C15653 extends AbstractC3441 implements InterfaceC18987 {

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC8146 f44772;

    /* JADX INFO: renamed from: ᩹ */
    public final String f44773;

    public C15653(String str, Collection collection) {
        this.f44773 = str;
        this.f44772 = C22361.m50193(collection);
    }

    @Override // p067l.InterfaceC23661
    public final String getType() {
        return this.f44773;
    }

    @Override // p067l.InterfaceC23661
    public final Set getElements() {
        return this.f44772;
    }
}
