package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۫ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4QJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12245 extends AbstractC15772 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13217 f36500;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C23095 f36501;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C18304 f36502;

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ۧ */
    public final int mo3385() {
        return 12;
    }

    public C12245(C23095 c23095) {
        if (c23095 == null) {
            throw new NullPointerException("prototype == null");
        }
        this.f36501 = c23095;
        C13922 c13922M51259 = c23095.m51259();
        int size = c13922M51259.size();
        StringBuilder sb = new StringBuilder(size + 1);
        char cCharAt = c23095.m51261().m20300().charAt(0);
        sb.append(cCharAt == '[' ? 'L' : cCharAt);
        for (int i = 0; i < size; i++) {
            char cCharAt2 = c13922M51259.getType(i).m20300().charAt(0);
            if (cCharAt2 == '[') {
                cCharAt2 = 'L';
            }
            sb.append(cCharAt2);
        }
        this.f36500 = new C13217(sb.toString());
        C13922 c13922M512510 = c23095.m51259();
        this.f36502 = c13922M512510.size() == 0 ? null : new C18304(c13922M512510);
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3779 mo2862() {
        return EnumC3779.TYPE_PROTO_ID_ITEM;
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo2863(C1662 c1662) {
        C2076 c2076M5631 = c1662.m5631();
        C16892 c16892M5632 = c1662.m5632();
        C4484 c4484M5612 = c1662.m5612();
        c16892M5632.m39751(this.f36501.m51261());
        c2076M5631.m6832(this.f36500);
        C18304 c18304 = this.f36502;
        if (c18304 != null) {
            this.f36502 = (C18304) c4484M5612.m13223(c18304);
        }
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo3384(C1662 c1662, C18241 c18241) {
        C2076 c2076M5631 = c1662.m5631();
        C13217 c13217 = this.f36500;
        int iM6830 = c2076M5631.m6830(c13217);
        C16892 c16892M5632 = c1662.m5632();
        C23095 c23095 = this.f36501;
        int iM39747 = c16892M5632.m39747(c23095.m51261());
        C18304 c18304 = this.f36502;
        int iM9390 = c18304 == null ? 0 : c18304.m9390();
        if (c18241.m42506()) {
            StringBuilder sb = new StringBuilder();
            sb.append(c23095.m51261().mo2463());
            sb.append(" proto(");
            C13922 c13922M51259 = c23095.m51259();
            int size = c13922M51259.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(c13922M51259.getType(i).mo2463());
            }
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            c18241.m42501(0, m37189() + ' ' + sb.toString());
            c18241.m42501(4, "  shorty_idx:      " + C14712.m35008(iM6830) + " // " + c13217.m32052());
            c18241.m42501(4, "  return_type_idx: " + C14712.m35008(iM39747) + " // " + c23095.m51261().mo2463());
            c18241.m42501(4, "  parameters_off:  ".concat(C14712.m35008(iM9390)));
        }
        c18241.m42514(iM6830);
        c18241.m42514(iM39747);
        c18241.m42514(iM9390);
    }
}
