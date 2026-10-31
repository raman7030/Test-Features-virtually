package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩷֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z2OJ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20539 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC9250 f66149;

    public AbstractC20539(AbstractC9250 abstractC9250) {
        if (abstractC9250 == null) {
            throw new IllegalArgumentException("Expecting non-null transport");
        }
        this.f66149 = abstractC9250;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11491 m47030(C10080 c10080, EnumC22074... enumC22074Arr) throws IOException {
        C11491 c11491M23747 = this.f66149.m23747(c10080);
        int iM35552 = c11491M23747.m35552();
        for (EnumC22074 enumC22074 : enumC22074Arr) {
            if (enumC22074 != null && enumC22074.m49668(iM35552)) {
                return c11491M23747;
            }
        }
        EnumC22074 enumC22074M49667 = EnumC22074.m49667(iM35552);
        C9375 c9375 = new C9375(String.format("%s returned error code: 0x%08X %s", "NetrShareEnum[1]", Integer.valueOf(iM35552), enumC22074M49667 == null ? "" : MotionUtils.EASING_TYPE_FORMAT_START + enumC22074M49667 + MotionUtils.EASING_TYPE_FORMAT_END));
        EnumC22074.m49667(iM35552);
        throw c9375;
    }
}
