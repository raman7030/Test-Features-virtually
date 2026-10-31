package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes.dex */
public final class C22266 extends AbstractC20546 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2450 f72238;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f72239;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f72240;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22266(Main main, boolean z, C16560 c16560, C2450 c2450) {
        super(main);
        this.f72239 = z;
        this.f72240 = c16560;
        this.f72238 = c2450;
    }

    @Override // l.AbstractC20546
    /* JADX INFO: renamed from: ۘ */
    public final void mo47064() {
        AbstractC15440 abstractC15440M39866;
        EnumC6434 enumC6434M47071 = m47071();
        long jM47065 = m47065();
        if (jM47065 == -2) {
            m47075().requestFocus();
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        if (jM47065 != -1 && jM47065 < 65536 && (enumC6434M47071 == EnumC6434.ZIP || enumC6434M47071 == EnumC6434.SEVEN_ZIP)) {
            m47075().requestFocus();
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        boolean z = this.f72239 && m47066();
        C2450 c2450 = this.f72238;
        String strM39020 = z ? this.f72240.m39020() : c2450.m7926();
        if (m47067()) {
            m47060();
            if (enumC6434M47071 == EnumC6434.ZIP) {
                int i = C15104.f46193;
                C0994 c0994 = new C0994(C16953.class);
                c0994.m3478(c2450.m7909());
                c0994.m3474("outputDir", strM39020);
                c0994.m3474("password", m47072());
                c0994.m3470(m47074(), "level");
                c0994.m3475("deleteSources", m47063());
                c0994.m3471(jM47065, "splitSize");
                C24009.m52847(c0994, c2450, z);
                return;
            }
            if (enumC6434M47071 == EnumC6434.SEVEN_ZIP) {
                int i2 = C15104.f46193;
                C0994 c0995 = new C0994(C13093.class);
                c0995.m3478(c2450.m7909());
                c0995.m3474("outputDir", strM39020);
                c0995.m3474("password", m47072());
                c0995.m3470(m47069(), "level");
                c0995.m3475("headerEncryption", m47070());
                c0995.m3475("deleteSources", m47063());
                c0995.m3471(jM47065, "splitSize");
                C24009.m52847(c0995, c2450, z);
                return;
            }
            int i3 = C15104.f46193;
            C0994 c0996 = new C0994(C22971.class);
            c0996.m3478(c2450.m7909());
            c0996.m3474("outputDir", strM39020);
            c0996.m3470(enumC6434M47071.ordinal(), "format");
            c0996.m3470(m47073(), "level");
            c0996.m3475("deleteSources", m47063());
            C24009.m52847(c0996, c2450, z);
            return;
        }
        String strM47068 = m47068();
        boolean z2 = z && !strM47068.startsWith("/");
        AbstractC15440 abstractC15440M39867 = strM47068.startsWith("/") ? C16999.m39866(strM47068, new String[0]) : C16999.m39866(strM39020, strM47068);
        if (jM47065 == -1 || enumC6434M47071 != EnumC6434.SEVEN_ZIP) {
            abstractC15440M39866 = abstractC15440M39867;
        } else {
            abstractC15440M39866 = C16999.m39866(abstractC15440M39867.mo23554() + ".001", new String[0]);
        }
        boolean zMo23120 = abstractC15440M39866.mo23120();
        RunnableC21561 runnableC21561 = new RunnableC21561(this, enumC6434M47071, c2450, abstractC15440M39867, jM47065, zMo23120, z2);
        if (!zMo23120) {
            runnableC21561.run();
            return;
        }
        if (!abstractC15440M39866.mo23119()) {
            C21374.m48457(abstractC15440M39866.mo23113() ? R.string.MT_Protector : R.string.MT_Protector);
            return;
        }
        C19258 c19258BuildDialog = c2450.m7917().buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44424(c2450.m7917().getString(R.string.MT_Protector, abstractC15440M39866.getName()));
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC18040(1, runnableC21561));
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }
}
