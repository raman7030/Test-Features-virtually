package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import bin.p000mt.plus.R;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܶ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A924 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17156 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ AbstractActivityC5549 f51091;

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC18228 f51092;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ String f51093;

    /* JADX INFO: renamed from: ᩻ */
    public AbstractC17043 f51094;

    public C17156(AbstractActivityC5549 abstractActivityC5549, String str) {
        this.f51091 = abstractActivityC5549;
        this.f51093 = str;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22245(this.f51091, R.string.MT_Protector, 200, new Runnable() { // from class: l.֨᩻ۡ
            @Override // java.lang.Runnable
            public final void run() {
                C17156 c17156 = this.f7937;
                c17156.f26234.m33952(new Runnable() { // from class: l.۠᩻ۡ
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC18228 interfaceC18228 = c17156.f51092;
                        if (interfaceC18228 != null) {
                            interfaceC18228.cancel();
                        }
                    }
                });
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0051  */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        String strGroup;
        C11349 c11349 = new C11349();
        c11349.m26289(C21852.f68752);
        String str = this.f51093;
        c11349.m26292(str);
        C10678 c10678M26284 = c11349.m26284();
        InterfaceC18228 interfaceC18228M42716 = C21852.f68753.m42716(c10678M26284);
        this.f51092 = interfaceC18228M42716;
        C20066 c20066Execute = interfaceC18228M42716.execute();
        AbstractC2630 abstractC2630M45436 = c20066Execute.m45436();
        InputStream inputStreamM4011 = abstractC2630M45436 != null ? abstractC2630M45436.m4011() : null;
        if (inputStreamM4011 == null) {
            throw new IllegalStateException("Response does not contain body: ".concat(str));
        }
        AbstractC17043 abstractC17043 = C17853.f53280;
        String strM45435 = c20066Execute.m45435("Content-Disposition");
        if (strM45435 != null) {
            Matcher matcher = Pattern.compile("filename=\"?([^\"]+)\"?").matcher(strM45435);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            } else {
                strGroup = (String) C9179.m21131(1, c10678M26284.m24591().m30826());
            }
        } else {
            strGroup = (String) C9179.m21131(1, c10678M26284.m24591().m30826());
        }
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(strGroup);
        this.f51094 = abstractC17043M38684;
        abstractC17043M38684.m38651(inputStreamM4011);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C13851 c13851M9395;
        C4463 c4463M9371 = C4463.m9371(this.f51094.getName(), true);
        boolean zM9390 = c4463M9371.m9390();
        AbstractActivityC5549 abstractActivityC5549 = this.f51091;
        if (zM9390 && (c13851M9395 = c4463M9371.m9395()) != null) {
            C7816.m18080(abstractActivityC5549, this.f51094, c4463M9371.m9394()).m18086(c13851M9395);
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri uriM38667 = this.f51094.m38667();
        intent.setDataAndType(uriM38667, c4463M9371.m9394());
        intent.addFlags(268435456);
        C5065.m10798(intent, uriM38667);
        abstractActivityC5549.startActivity(intent);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f51091.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
