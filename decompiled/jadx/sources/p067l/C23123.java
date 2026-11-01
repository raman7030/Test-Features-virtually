package p067l;

/* JADX INFO: renamed from: l.᩸᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23123 extends AbstractC23793 {

    /* JADX INFO: renamed from: ۘ */
    public final byte[] f72671;

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo5057(C10738 c10738) {
        return false;
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo5058(C10738 c10738) {
        return false;
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo5060() {
        return true;
    }

    public C23123(String str, EnumC8055 enumC8055, boolean z, int i, byte[] bArr) {
        super(str, EnumC13420.TYPE_TXT, enumC8055, z, i);
        this.f72671 = (bArr == null || bArr.length <= 0) ? C17422.f52081 : bArr;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final byte[] m51565() {
        return this.f72671;
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ֫ */
    public final void mo5056(C19099 c19099) {
        byte[] bArr = this.f72671;
        c19099.m43388(bArr.length, bArr);
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo5059(AbstractC23793 abstractC23793) {
        if (!(abstractC23793 instanceof C23123)) {
            return false;
        }
        byte[] bArr = ((C23123) abstractC23793).f72671;
        byte[] bArr2 = this.f72671;
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

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ֫ */
    public final C21467 mo5054(boolean z) {
        return new C21467(C21562.unmodifiableMap(this.f43820), 0, 0, 0, z, this.f72671);
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ֫ */
    public final C16771 mo5053(C10738 c10738) {
        C21467 c21467Mo5054 = mo5054(false);
        c21467Mo5054.m48642(c10738);
        return new C16771(c10738, c21467Mo5054.mo27466(), c21467Mo5054.getName(), c21467Mo5054);
    }

    @Override // p067l.AbstractC23793, p067l.AbstractC15351
    /* JADX INFO: renamed from: ֫ */
    public final void mo5055(StringBuilder sb) {
        super.mo5055(sb);
        sb.append(" text: '");
        byte[] bArr = C17422.f52082;
        byte[] bArr2 = this.f72671;
        String strM39667 = C17422.m39667(0, bArr2.length, bArr2);
        if (20 < strM39667.length()) {
            sb.append((CharSequence) strM39667, 0, 17);
            sb.append("...");
        } else {
            sb.append(strM39667);
        }
        sb.append('\'');
    }
}
