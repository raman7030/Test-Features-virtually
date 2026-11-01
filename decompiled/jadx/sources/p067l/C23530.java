package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩹ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes.dex */
public final class C23530 extends AbstractC21895 {

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C4697 f74962;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ boolean f74963;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C18107 f74964;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23530(Main main, boolean z, C18107 c18107, C4697 c4697) {
        super(main);
        this.f74963 = z;
        this.f74964 = c18107;
        this.f74962 = c4697;
    }

    @Override // p067l.AbstractC21895
    /* JADX INFO: renamed from: ۘ */
    public final void mo49387() {
        AbstractC17043 abstractC17043M42109;
        EnumC8483 enumC8483M49394 = m49394();
        long jM49388 = m49388();
        if (jM49388 == -2) {
            m49398().requestFocus();
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        if (jM49388 != -1 && jM49388 < 65536 && (enumC8483M49394 == EnumC8483.ZIP || enumC8483M49394 == EnumC8483.SEVEN_ZIP)) {
            m49398().requestFocus();
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        boolean z = this.f74963 && m49389();
        C4697 c4697 = this.f74962;
        String strM41246 = z ? this.f74964.m41246() : c4697.m9974();
        if (m49390()) {
            m49383();
            if (enumC8483M49394 == EnumC8483.ZIP) {
                int i = C16723.f49313;
                C3313 c3313 = new C3313(C18481.class);
                c3313.m5781(c4697.m9957());
                c3313.m5777("outputDir", strM41246);
                c3313.m5777("password", m49395());
                c3313.m5773(m49397(), "level");
                c3313.m5778("deleteSources", m49386());
                c3313.m5774(jM49388, "splitSize");
                C25187.m55253(c3313, c4697, z);
                return;
            }
            if (enumC8483M49394 == EnumC8483.SEVEN_ZIP) {
                int i2 = C16723.f49313;
                C3313 c3314 = new C3313(C14812.class);
                c3314.m5781(c4697.m9957());
                c3314.m5777("outputDir", strM41246);
                c3314.m5777("password", m49395());
                c3314.m5773(m49392(), "level");
                c3314.m5778("headerEncryption", m49393());
                c3314.m5778("deleteSources", m49386());
                c3314.m5774(jM49388, "splitSize");
                C25187.m55253(c3314, c4697, z);
                return;
            }
            int i3 = C16723.f49313;
            C3313 c3315 = new C3313(C24200.class);
            c3315.m5781(c4697.m9957());
            c3315.m5777("outputDir", strM41246);
            c3315.m5773(enumC8483M49394.ordinal(), "format");
            c3315.m5773(m49396(), "level");
            c3315.m5778("deleteSources", m49386());
            C25187.m55253(c3315, c4697, z);
            return;
        }
        String strM49391 = m49391();
        boolean z2 = z && !strM49391.startsWith("/");
        AbstractC17043 abstractC17043M421010 = strM49391.startsWith("/") ? C18524.m42109(strM49391, new String[0]) : C18524.m42109(strM41246, strM49391);
        if (jM49388 == -1 || enumC8483M49394 != EnumC8483.SEVEN_ZIP) {
            abstractC17043M42109 = abstractC17043M421010;
        } else {
            abstractC17043M42109 = C18524.m42109(abstractC17043M421010.mo25505() + ".001", new String[0]);
        }
        boolean zMo25094 = abstractC17043M42109.mo25094();
        RunnableC22860 runnableC22860 = new RunnableC22860(this, enumC8483M49394, c4697, abstractC17043M421010, jM49388, zMo25094, z2);
        if (!zMo25094) {
            runnableC22860.run();
            return;
        }
        if (!abstractC17043M42109.mo25093()) {
            C22682.m50793(abstractC17043M42109.mo25087() ? R.string.MT_Protector : R.string.MT_Protector);
            return;
        }
        C20671 c20671BuildDialog = c4697.m9965().buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46718(c4697.m9965().getString(R.string.MT_Protector, abstractC17043M42109.getName()));
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC19514(1, runnableC22860));
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }
}
