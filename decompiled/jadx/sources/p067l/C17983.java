package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܽۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8V9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17983 extends AbstractC11811 {

    /* JADX INFO: renamed from: ۗ */
    public final boolean f53701;

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ۧ */
    public final void mo9269(Appendable appendable, int i, C2421 c2421) {
    }

    @Override // p067l.AbstractC11811, p067l.AbstractC13152
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC13152 mo12956() {
        return this;
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ܺ */
    public final String mo5244() {
        return "#declaration";
    }

    @Override // p067l.AbstractC11811, p067l.AbstractC13152
    /* JADX INFO: renamed from: ᩳ */
    public final /* bridge */ /* synthetic */ int mo12957() {
        return 0;
    }

    public C17983(String str, boolean z) {
        C18515.m42065((Object) str);
        this.f32967 = str;
        this.f53701 = z;
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ֫ */
    public final void mo9268(Appendable appendable, int i, C2421 c2421) throws IOException {
        Appendable appendableAppend = appendable.append("<");
        boolean z = this.f53701;
        appendableAppend.append(z ? "!" : "?").append(m27070());
        C17173 c17173Mo27062 = mo27062();
        c17173Mo27062.getClass();
        int i2 = 0;
        while (true) {
            if (i2 < c17173Mo27062.f51129 && C17173.m38880(c17173Mo27062, c17173Mo27062.f51128[i2])) {
                i2++;
            } else {
                if (i2 >= c17173Mo27062.f51129) {
                    break;
                }
                C11140 c11140 = new C11140(c17173Mo27062.f51128[i2], (String) c17173Mo27062.f51127[i2], c17173Mo27062);
                int i3 = i2 + 1;
                String key = c11140.getKey();
                String value = c11140.getValue();
                if (!key.equals("#declaration")) {
                    appendable.append(' ');
                    appendable.append(key);
                    if (!value.isEmpty()) {
                        appendable.append("=\"");
                        C14492.m33143(appendable, value, c2421, true, false, false, false);
                        appendable.append('\"');
                    }
                }
                i2 = i3;
            }
        }
        appendable.append(z ? "!" : "?").append(">");
    }

    @Override // p067l.AbstractC13152
    public final String toString() {
        return mo5239();
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: clone */
    public final Object mo55709clone() {
        return (C17983) super.mo55709clone();
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: clone */
    public final AbstractC13152 mo55709clone() {
        return (C17983) super.mo55709clone();
    }
}
