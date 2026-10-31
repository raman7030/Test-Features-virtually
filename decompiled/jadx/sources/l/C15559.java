package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import bin.mt.plus.R;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܶ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A924 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15559 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f47959;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC16687 f47960;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f47961;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f47962;

    public C15559(AbstractActivityC3346 abstractActivityC3346, String str) {
        this.f47959 = abstractActivityC3346;
        this.f47961 = str;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20269(this.f47959, R.string.MT_Protector, 200, new Runnable() { // from class: l.֨᩻ۡ
            @Override // java.lang.Runnable
            public final void run() {
                C15559 c15559 = this.f5164;
                c15559.f23322.m31860(new Runnable() { // from class: l.۠᩻ۡ
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC16687 interfaceC16687 = c15559.f47960;
                        if (interfaceC16687 != null) {
                            interfaceC16687.cancel();
                        }
                    }
                });
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0051  */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        String strGroup;
        C9449 c9449 = new C9449();
        c9449.m24279(C20500.f66073);
        String str = this.f47961;
        c9449.m24282(str);
        C8743 c8743M24274 = c9449.m24274();
        InterfaceC16687 interfaceC16687M40469 = C20500.f66074.m40469(c8743M24274);
        this.f47960 = interfaceC16687M40469;
        C18621 c18621Execute = interfaceC16687M40469.execute();
        AbstractC0275 abstractC0275M43170 = c18621Execute.m43170();
        InputStream inputStreamM1611 = abstractC0275M43170 != null ? abstractC0275M43170.m1611() : null;
        if (inputStreamM1611 == null) {
            throw new IllegalStateException("Response does not contain body: ".concat(str));
        }
        AbstractC15440 abstractC15440 = C16293.f50113;
        String strM43169 = c18621Execute.m43169("Content-Disposition");
        if (strM43169 != null) {
            Matcher matcher = Pattern.compile("filename=\"?([^\"]+)\"?").matcher(strM43169);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            } else {
                strGroup = (String) C7166.m19188(1, c8743M24274.m22622().m28779());
            }
        } else {
            strGroup = (String) C7166.m19188(1, c8743M24274.m22622().m28779());
        }
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(strGroup);
        this.f47962 = abstractC15440M36526;
        abstractC15440M36526.m36493(inputStreamM1611);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C12082 c12082M7316;
        C2204 c2204M7292 = C2204.m7292(this.f47962.getName(), true);
        boolean zM7311 = c2204M7292.m7311();
        AbstractActivityC3346 abstractActivityC3346 = this.f47959;
        if (zM7311 && (c12082M7316 = c2204M7292.m7316()) != null) {
            C5732.m16161(abstractActivityC3346, this.f47962, c2204M7292.m7315()).m16167(c12082M7316);
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri uriM36509 = this.f47962.m36509();
        intent.setDataAndType(uriM36509, c2204M7292.m7315());
        intent.addFlags(268435456);
        C2837.m8731(intent, uriM36509);
        abstractActivityC3346.startActivity(intent);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f47959.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
