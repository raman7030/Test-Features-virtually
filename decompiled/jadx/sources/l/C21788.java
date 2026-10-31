package l;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.᩸᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97TY */
/* JADX INFO: loaded from: classes.dex */
public final class C21788 implements InterfaceC9773 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15436 f69789;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Inflater f69791;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17714 f69792 = new C17714();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17714 f69790 = new C17714();

    @Override // l.InterfaceC9773
    public final /* synthetic */ void reset() {
    }

    @Override // l.InterfaceC9773
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC13571 mo6617(int i, int i2, byte[] bArr) {
        return C14710.m35002(this, bArr, i2);
    }

    public C21788(List list) {
        C15436 c15436 = new C15436();
        this.f69789 = c15436;
        c15436.m36483(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    @Override // l.InterfaceC9773
    /* JADX INFO: renamed from: ֫ */
    public final void mo6618(byte[] bArr, int i, int i2, C21062 c21062, InterfaceC23483 interfaceC23483) {
        C19811 c19811M36481;
        C17714 c17714 = this.f69792;
        c17714.m41462(i2 + i, bArr);
        c17714.m41484(i);
        if (this.f69791 == null) {
            this.f69791 = new Inflater();
        }
        Inflater inflater = this.f69791;
        String str = C3603.f11424;
        if (c17714.m41457() > 0 && c17714.m41477() == 120) {
            C17714 c17715 = this.f69790;
            if (C3603.m11032(c17714, c17715, inflater)) {
                c17714.m41462(c17715.m41483(), c17715.m41482());
            }
        }
        C15436 c15436 = this.f69789;
        c15436.m36482();
        int iM41457 = c17714.m41457();
        if (iM41457 < 2 || c17714.m41464() != iM41457) {
            c19811M36481 = null;
        } else {
            c15436.m36484(c17714);
            c19811M36481 = c15436.m36481(c17714);
        }
        interfaceC23483.accept(new C12866(-9223372036854775807L, 5000000L, c19811M36481 != null ? AbstractC14545.of((Object) c19811M36481) : AbstractC14545.of()));
    }
}
