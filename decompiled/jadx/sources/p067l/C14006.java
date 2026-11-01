package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۫ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4QJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14006 extends AbstractC17358 {

    /* JADX INFO: renamed from: ۙ */
    public final C14930 f39517;

    /* JADX INFO: renamed from: ᩶ */
    public final C24318 f39518;

    /* JADX INFO: renamed from: ᩹ */
    public C19765 f39519;

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ۧ */
    public final int mo5704() {
        return 12;
    }

    public C14006(C24318 c24318) {
        if (c24318 == null) {
            throw new NullPointerException("prototype == null");
        }
        this.f39518 = c24318;
        C15600 c15600M53653 = c24318.m53653();
        int size = c15600M53653.size();
        StringBuilder sb = new StringBuilder(size + 1);
        char cCharAt = c24318.m53655().m22277().charAt(0);
        sb.append(cCharAt == '[' ? 'L' : cCharAt);
        for (int i = 0; i < size; i++) {
            char cCharAt2 = c15600M53653.getType(i).m22277().charAt(0);
            if (cCharAt2 == '[') {
                cCharAt2 = 'L';
            }
            sb.append(cCharAt2);
        }
        this.f39517 = new C14930(sb.toString());
        C15600 c15600M53654 = c24318.m53653();
        this.f39519 = c15600M53654.size() == 0 ? null : new C19765(c15600M53654);
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5960 mo5191() {
        return EnumC5960.TYPE_PROTO_ID_ITEM;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5192(C3948 c3948) {
        C4342 c4342M7861 = c3948.m7861();
        C18423 c18423M7862 = c3948.m7862();
        C6630 c6630M7842 = c3948.m7842();
        c18423M7862.m41992(this.f39518.m53655());
        c4342M7861.m8958(this.f39517);
        C19765 c19765 = this.f39519;
        if (c19765 != null) {
            this.f39519 = (C19765) c6630M7842.m15105(c19765);
        }
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5703(C3948 c3948, C19705 c19705) {
        C4342 c4342M7861 = c3948.m7861();
        C14930 c14930 = this.f39517;
        int iM8956 = c4342M7861.m8956(c14930);
        C18423 c18423M7862 = c3948.m7862();
        C24318 c24318 = this.f39518;
        int iM41988 = c18423M7862.m41988(c24318.m53655());
        C19765 c19765 = this.f39519;
        int iM11432 = c19765 == null ? 0 : c19765.m11432();
        if (c19705.m44765()) {
            StringBuilder sb = new StringBuilder();
            sb.append(c24318.m53655().mo4819());
            sb.append(" proto(");
            C15600 c15600M53653 = c24318.m53653();
            int size = c15600M53653.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(c15600M53653.getType(i).mo4819());
            }
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            c19705.m44760(0, m39359() + ' ' + sb.toString());
            c19705.m44760(4, "  shorty_idx:      " + C16351.m37155(iM8956) + " // " + c14930.m34150());
            c19705.m44760(4, "  return_type_idx: " + C16351.m37155(iM41988) + " // " + c24318.m53655().mo4819());
            c19705.m44760(4, "  parameters_off:  ".concat(C16351.m37155(iM11432)));
        }
        c19705.m44773(iM8956);
        c19705.m44773(iM41988);
        c19705.m44773(iM11432);
    }
}
