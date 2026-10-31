package l;

import bin.mt.plus.Main;
import java.util.Iterator;
import java.util.List;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ܿܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1YB */
/* JADX INFO: loaded from: classes5.dex */
public final class C17387 implements InterfaceC15466 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15975 f53214;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f53215;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f53216;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f53217;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18090 f53218;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f53219;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3545 f53220;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f53221;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Iterator f53222;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f53223;

    public C17387(C15975 c15975, long j, long j2, C18090 c18090, boolean[] zArr, C3545 c3545) {
        this.f53214 = c15975;
        this.f53219 = j;
        this.f53217 = j2;
        this.f53218 = c18090;
        this.f53216 = zArr;
        this.f53220 = c3545;
    }

    @Override // l.InterfaceC15466
    /* JADX INFO: renamed from: ֫ */
    public final void mo16356(long j, long j2) {
        C15975 c15975 = this.f53214;
        c15975.m50130(j, j2);
        c15975.m11541(this.f53219 + j, this.f53217);
    }

    @Override // l.InterfaceC15466
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo16358() {
        C18090 c18090 = this.f53218;
        if (!c18090.m42213()) {
            this.f53223 = false;
            this.f53221 = false;
            return true;
        }
        this.f53216[0] = true;
        C3545 c3545 = this.f53220;
        if (C22523.m50505(c3545)) {
            if (this.f53215 == null) {
                this.f53215 = C22523.m50498(c18090, c3545, this);
            }
            this.f53223 = false;
            C12079 c12079 = new C12079((Main) null, c18090);
            c12079.m29463(new BooleanSupplier() { // from class: l.ᩳܰܳ
                @Override // java.util.function.BooleanSupplier
                public final boolean getAsBoolean() {
                    return this.f56344.f53214.mo1526();
                }
            });
            boolean zM29465 = c12079.m29465(this.f53215);
            this.f53221 = zM29465;
            return zM29465;
        }
        if (this.f53222 == null) {
            this.f53222 = C10395.m26216();
        }
        if (this.f53222.hasNext()) {
            c18090.m42192((String) this.f53222.next());
            this.f53223 = true;
            this.f53221 = false;
            return true;
        }
        this.f53223 = false;
        boolean zM29464 = new C12079((Main) null, c18090).m29464();
        this.f53221 = zM29464;
        return zM29464;
    }

    @Override // l.InterfaceC15466
    /* JADX INFO: renamed from: ᩺ */
    public final boolean mo16359() {
        return this.f53223;
    }

    @Override // l.InterfaceC15466
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo16357() {
        return this.f53221;
    }

    @Override // l.InterfaceC15466
    public final void cancel() {
        this.f53214.cancel();
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f53214.mo1526();
    }
}
