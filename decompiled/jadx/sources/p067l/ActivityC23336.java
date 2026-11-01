package p067l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes2.dex */
public class ActivityC23336 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ᩵ۧ */
    public static final /* synthetic */ int f73409 = 0;

    /* JADX INFO: renamed from: ۖۧ */
    public C8331 f73410;

    /* JADX INFO: renamed from: ۘۧ */
    public C14102 f73411;

    /* JADX INFO: renamed from: ۜۧ */
    public String f73412;

    /* JADX INFO: renamed from: ۡۧ */
    public Drawable f73413;

    /* JADX INFO: renamed from: ۢۧ */
    public AbstractC14973 f73414;

    /* JADX INFO: renamed from: ܳۧ */
    public boolean f73415;

    /* JADX INFO: renamed from: ܺۧ */
    public List f73416;

    /* JADX INFO: renamed from: ܿۧ */
    public List f73417;

    /* JADX INFO: renamed from: ᩳۧ */
    public C24677 f73418;

    /* JADX INFO: renamed from: ᩴۧ */
    public List f73419;

    /* JADX INFO: renamed from: ᩷ۧ */
    public Drawable f73420;

    /* JADX INFO: renamed from: ᩻ۧ */
    public String f73421;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "SignatureKeyActivity";
    }

    /* JADX INFO: renamed from: ܺ */
    public static void m51973(ActivityC23336 activityC23336) {
        activityC23336.getClass();
        new C18642(activityC23336).m22250();
    }

    public ActivityC23336() {
        List list = Collections.EMPTY_LIST;
        this.f73419 = list;
        this.f73416 = list;
        this.f73417 = list;
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f73415 = getIntent().getBooleanExtra("fromDialog", false);
        m12277(R.layout.MT_Protector);
        m12277(R.string.MT_Protector);
        C1326 c1326 = (C1326) m12277(R.id.MT_Protector);
        this.f13392 = c1326;
        m12263(c1326);
        m12268();
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC19291(1, this));
        this.f73411 = (C14102) m12277(R.id.MT_Protector);
        this.f73413 = C21265.f66847.f66886.m30928();
        this.f73420 = C21265.f66831.f66886.m30928();
        new C18642(this).m22250();
        C14849 c14849 = (C14849) m12277(R.id.MT_Protector);
        C24677 c24677 = new C24677(this);
        this.f73418 = c24677;
        c14849.setAdapter(c24677);
        this.f73410 = ViewOnClickListenerC20541.m46366(this, new C9057(this));
        this.f73411.m32017(new C22469(this));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51960(ActivityC23336 activityC23336, String str) {
        AbstractC14973 abstractC14973 = activityC23336.f73414;
        if (abstractC14973 == null) {
            return;
        }
        try {
            C10844 c10844 = new C10844(str);
            try {
                String strMo15886 = abstractC14973.mo15886();
                c10844.m24986(strMo15886 + ".x509.pem");
                StringBuilder sb = new StringBuilder();
                sb.append("-----BEGIN CERTIFICATE-----\n");
                String strEncodeToString = Base64.encodeToString(abstractC14973.m34296().getEncoded(), 2);
                StringBuilder sb2 = new StringBuilder();
                int i = 0;
                while (i < strEncodeToString.length()) {
                    int i2 = i + 64;
                    sb2.append((CharSequence) strEncodeToString, i, Math.min(i2, strEncodeToString.length()));
                    sb2.append("\n");
                    i = i2;
                }
                sb.append(sb2.toString());
                sb.append("\n-----END CERTIFICATE-----");
                c10844.write(sb.toString().getBytes());
                c10844.m24986(strMo15886 + ".pk8");
                c10844.write(abstractC14973.m34292().getEncoded());
                C22682.m50793(R.string.MT_Protector);
                c10844.close();
            } catch (Throwable th) {
                try {
                    c10844.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            activityC23336.m12259(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd = menu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector);
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setIcon(R.drawable.MT_Protector);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.MT_Protector) {
            return false;
        }
        C20671 c20671BuildDialog = buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46710(R.string.MT_Protector);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        TextView textView = (TextView) dialogInterfaceC2564M46732.m3846(android.R.id.message);
        C21852.m49285(dialogInterfaceC2564M46732.m3845(), true).mo40282(textView, textView.getText().toString());
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51964(ActivityC23336 activityC23336, AbstractC14973 abstractC14973, Runnable runnable) {
        if (abstractC14973.mo34294()) {
            C23691.f75409 = true;
            C10792.m24865(new C15959(runnable), abstractC14973, activityC23336);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51963(ActivityC23336 activityC23336, AbstractC14973 abstractC14973) {
        try {
            activityC23336.m51959(abstractC14973);
        } catch (Exception e) {
            activityC23336.m12259(e, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m51959(AbstractC14973 abstractC14973) throws CertificateEncodingException {
        X509Certificate x509CertificateM34296 = abstractC14973.m34296();
        byte[] encoded = x509CertificateM34296.getEncoded();
        abstractC14973.mo15880();
        final C3434 c3434 = new C3434();
        View viewM12252 = m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.textView1)).setText(R.string.MT_Protector);
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView3 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView4 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView5 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView6 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView7 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView8 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView9 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView10 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        C0990 c0990 = (C0990) viewM12252.findViewById(R.id.addColon);
        C0990 c0991 = (C0990) viewM12252.findViewById(R.id.upperCase);
        viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
        if (abstractC14973 instanceof C23691) {
            textView2.setText(R.string.MT_Protector);
        } else if (abstractC14973 instanceof C21680) {
            textView2.setText(R.string.MT_Protector);
        } else if ((abstractC14973 instanceof C6927) || (abstractC14973 instanceof C14303)) {
            textView2.setText(R.string.MT_Protector);
        }
        textView2.setText(textView2.getText().toString().replaceAll("\\(.*\\)|（.*）", "").trim());
        if (Build.VERSION.SDK_INT >= 23) {
            textView6.setHyphenationFrequency(2);
            textView7.setHyphenationFrequency(2);
            textView8.setHyphenationFrequency(2);
            textView9.setHyphenationFrequency(2);
            textView10.setHyphenationFrequency(2);
        }
        textView.setOnClickListener(ViewOnClickListenerC16447.m37362());
        textView2.setOnClickListener(ViewOnClickListenerC16447.m37362());
        textView3.setOnClickListener(ViewOnClickListenerC16447.m37362());
        textView4.setOnClickListener(ViewOnClickListenerC16447.m37362());
        textView5.setOnClickListener(ViewOnClickListenerC16447.m37362());
        textView6.setOnClickListener(ViewOnClickListenerC16447.m37362());
        textView7.setOnClickListener(ViewOnClickListenerC16447.m37362());
        textView8.setOnClickListener(ViewOnClickListenerC16447.m37362());
        textView9.setOnClickListener(ViewOnClickListenerC16447.m37362());
        textView10.setOnClickListener(ViewOnClickListenerC16447.m37362());
        textView.setText(abstractC14973.mo15882());
        final RunnableC15721 runnableC15721 = new RunnableC15721(c3434, textView6, textView7, textView8, textView9, textView10);
        C20671 c20671BuildDialog = buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        c0991.setChecked(ApplicationC21448.f67649.getBoolean("apk_signature_info_upper_case", true));
        c0990.setChecked(ApplicationC21448.f67649.getBoolean("apk_signature_info_add_colon", true));
        c0991.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۟᩶ܽ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = ActivityC23336.f73409;
                ApplicationC21448.f67649.edit().putBoolean("apk_signature_info_upper_case", z).apply();
                runnableC15721.run();
            }
        });
        c0990.setOnCheckedChangeListener(new C3890(0, runnableC15721));
        dialogInterfaceC2564M46732.m3859().setOnClickListener(new View.OnClickListener() { // from class: l.ۧۙܽ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC23336.f73409;
                ActivityC23336 activityC23336 = this.f35399;
                activityC23336.getClass();
                C10140.m23624(activityC23336, c3434);
            }
        });
        String sigAlgName = x509CertificateM34296.getSigAlgName();
        String sigAlgOID = x509CertificateM34296.getSigAlgOID();
        if (sigAlgName.equals(sigAlgOID) && (sigAlgName = C19588.m44503(sigAlgOID)) == null) {
            sigAlgName = sigAlgOID;
        }
        textView3.setText(sigAlgName);
        textView4.setText(C18794.m42823(x509CertificateM34296.getNotBefore().getTime()));
        textView5.setText(C18794.m42823(x509CertificateM34296.getNotAfter().getTime()));
        C10140.m23623(this, viewM12252, x509CertificateM34296);
        c3434.m6094(encoded);
        runnableC15721.run();
    }
}
