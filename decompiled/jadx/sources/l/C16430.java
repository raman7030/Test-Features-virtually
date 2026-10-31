package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܽۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8V9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16430 extends AbstractC9936 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f50521;

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ۧ */
    public final void mo7190(Appendable appendable, int i, C0056 c0056) {
    }

    @Override // l.AbstractC9936, l.AbstractC11347
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC11347 mo10980() {
        return this;
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ܺ */
    public final String mo2915() {
        return "#declaration";
    }

    @Override // l.AbstractC9936, l.AbstractC11347
    /* JADX INFO: renamed from: ᩳ */
    public final /* bridge */ /* synthetic */ int mo10981() {
        return 0;
    }

    public C16430(String str, boolean z) {
        C16990.m39822((Object) str);
        this.f30009 = str;
        this.f50521 = z;
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ֫ */
    public final void mo7189(Appendable appendable, int i, C0056 c0056) throws IOException {
        Appendable appendableAppend = appendable.append("<");
        boolean z = this.f50521;
        appendableAppend.append(z ? "!" : "?").append(m25053());
        C15578 c15578Mo25045 = mo25045();
        c15578Mo25045.getClass();
        int i2 = 0;
        while (true) {
            if (i2 < c15578Mo25045.f47997 && C15578.m36719(c15578Mo25045, c15578Mo25045.f47996[i2])) {
                i2++;
            } else {
                if (i2 >= c15578Mo25045.f47997) {
                    break;
                }
                C9230 c9230 = new C9230(c15578Mo25045.f47996[i2], (String) c15578Mo25045.f47995[i2], c15578Mo25045);
                int i3 = i2 + 1;
                String key = c9230.getKey();
                String value = c9230.getValue();
                if (!key.equals("#declaration")) {
                    appendable.append(' ');
                    appendable.append(key);
                    if (!value.isEmpty()) {
                        appendable.append("=\"");
                        C12757.m31059(appendable, value, c0056, true, false, false, false);
                        appendable.append('\"');
                    }
                }
                i2 = i3;
            }
        }
        appendable.append(z ? "!" : "?").append(">");
    }

    @Override // l.AbstractC11347
    public final String toString() {
        return mo2910();
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: clone */
    public final Object mo2918clone() {
        return (C16430) super.mo2918clone();
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: clone */
    public final AbstractC11347 mo2918clone() {
        return (C16430) super.mo2918clone();
    }
}
