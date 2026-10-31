package l;

/* JADX INFO: renamed from: l.᩸᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes.dex */
public final class C21837 extends AbstractC22542 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final byte[] f69962;

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo2718(C8806 c8806) {
        return false;
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo2719(C8806 c8806) {
        return false;
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2721() {
        return true;
    }

    public C21837(String str, EnumC5983 enumC5983, boolean z, int i, byte[] bArr) {
        super(str, EnumC11628.TYPE_TXT, enumC5983, z, i);
        this.f69962 = (bArr == null || bArr.length <= 0) ? C15839.f48943 : bArr;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final byte[] m49214() {
        return this.f69962;
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ֫ */
    public final void mo2717(C17603 c17603) {
        byte[] bArr = this.f69962;
        c17603.m41142(bArr.length, bArr);
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo2720(AbstractC22542 abstractC22542) {
        if (!(abstractC22542 instanceof C21837)) {
            return false;
        }
        byte[] bArr = ((C21837) abstractC22542).f69962;
        byte[] bArr2 = this.f69962;
        if ((bArr2 == null && bArr != null) || bArr.length != bArr2.length) {
            return false;
        }
        int length = bArr2.length;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            length = i;
        }
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ֫ */
    public final C20095 mo2715(boolean z) {
        return new C20095(C20195.unmodifiableMap(this.f40739), 0, 0, 0, z, this.f69962);
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ֫ */
    public final C15154 mo2714(C8806 c8806) {
        C20095 c20095Mo2715 = mo2715(false);
        c20095Mo2715.m46326(c8806);
        return new C15154(c8806, c20095Mo2715.mo25446(), c20095Mo2715.getName(), c20095Mo2715);
    }

    @Override // l.AbstractC22542, l.AbstractC13660
    /* JADX INFO: renamed from: ֫ */
    public final void mo2716(StringBuilder sb) {
        super.mo2716(sb);
        sb.append(" text: '");
        byte[] bArr = C15839.f48944;
        byte[] bArr2 = this.f69962;
        String strM37495 = C15839.m37495(0, bArr2.length, bArr2);
        if (20 < strM37495.length()) {
            sb.append((CharSequence) strM37495, 0, 17);
            sb.append("...");
        } else {
            sb.append(strM37495);
        }
        sb.append('\'');
    }
}
