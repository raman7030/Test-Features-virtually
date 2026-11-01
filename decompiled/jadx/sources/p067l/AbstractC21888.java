package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩷֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z2OJ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21888 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11159 f68826;

    public AbstractC21888(AbstractC11159 abstractC11159) {
        if (abstractC11159 == null) {
            throw new IllegalArgumentException("Expecting non-null transport");
        }
        this.f68826 = abstractC11159;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13289 m49353(C11948 c11948, EnumC23347... enumC23347Arr) throws IOException {
        C13289 c13289M25748 = this.f68826.m25748(c11948);
        int iM37708 = c13289M25748.m37708();
        for (EnumC23347 enumC23347 : enumC23347Arr) {
            if (enumC23347 != null && enumC23347.m52006(iM37708)) {
                return c13289M25748;
            }
        }
        EnumC23347 enumC23347M52005 = EnumC23347.m52005(iM37708);
        C11278 c11278 = new C11278(String.format("%s returned error code: 0x%08X %s", "NetrShareEnum[1]", Integer.valueOf(iM37708), enumC23347M52005 == null ? "" : MotionUtils.EASING_TYPE_FORMAT_START + enumC23347M52005 + MotionUtils.EASING_TYPE_FORMAT_END));
        EnumC23347.m52005(iM37708);
        throw c11278;
    }
}
