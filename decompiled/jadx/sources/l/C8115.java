package l;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠ۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y2OD */
/* JADX INFO: loaded from: classes3.dex */
public final class C8115 implements InterfaceC6141, Serializable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f25074;

    public C8115() {
        C22061.m49620(2, "expectedValuesPerKey");
        this.f25074 = 2;
    }

    @Override // l.InterfaceC6141
    public final Object get() {
        return new ArrayList(this.f25074);
    }
}
