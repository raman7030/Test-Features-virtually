package l;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 359P */
/* JADX INFO: loaded from: classes4.dex */
public final class C13978 extends AbstractC1129 implements InterfaceC17486 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC6079 f41689;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f41690;

    public C13978(String str, Collection collection) {
        this.f41690 = str;
        this.f41689 = C21036.m47863(collection);
    }

    @Override // l.InterfaceC22404
    public final String getType() {
        return this.f41690;
    }

    @Override // l.InterfaceC22404
    public final Set getElements() {
        return this.f41689;
    }
}
