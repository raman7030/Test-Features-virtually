package l;

import android.content.DialogInterface;
import android.text.InputFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X81I */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5794 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10235 f17823;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ImageView f17824;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C10235 f17825;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f17826 = true;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f17827;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f17828;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo16272(int i, int i2);

    public AbstractC5794(AbstractActivityC3346 abstractActivityC3346, int i, int i2) {
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        C10235 c10235 = (C10235) viewM10216.findViewById(R.id.MT_Protector);
        this.f17825 = c10235;
        C10235 c10236 = (C10235) viewM10216.findViewById(R.id.editText2);
        this.f17823 = c10236;
        ImageView imageView = (ImageView) viewM10216.findViewById(R.id.MT_Protector);
        this.f17824 = imageView;
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        c10235.mo25910((CharSequence) String.valueOf(i));
        c10236.mo25910((CharSequence) String.valueOf(i2));
        this.f17827 = Math.max(1, i);
        this.f17828 = Math.max(1, i2);
        c10235.m25897(new InputFilter[]{new InputFilter.LengthFilter(6)});
        c10236.m25897(new InputFilter[]{new InputFilter.LengthFilter(6)});
        c10235.m30313(new C12144(this));
        c10236.m30313(new C10028(this));
        imageView.setOnClickListener(new ViewOnClickListenerC14274(2, this));
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        DialogInterfaceC0206 dialogInterfaceC0206M19253 = C7187.m19253(c19258BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC0206M19253.m1447().setOnClickListener(new ViewOnClickListenerC14316(this, dialogInterfaceC0206M19253));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16265(AbstractC5794 abstractC5794) {
        ImageView imageView = abstractC5794.f17824;
        boolean z = abstractC5794.f17826;
        abstractC5794.f17826 = !z;
        if (!z) {
            imageView.setImageResource(R.drawable.MT_Protector);
            try {
                int i = Integer.parseInt(abstractC5794.f17825.m30436().toString());
                int i2 = Integer.parseInt(abstractC5794.f17823.m30436().toString());
                if (i <= 0 || i2 <= 0) {
                    return;
                }
                abstractC5794.f17827 = i;
                abstractC5794.f17828 = i2;
                return;
            } catch (Exception unused) {
                return;
            }
        }
        imageView.setImageResource(R.drawable.MT_Protector);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16266(AbstractC5794 abstractC5794, DialogInterfaceC0206 dialogInterfaceC0206) {
        C10235 c10235 = abstractC5794.f17823;
        C10235 c10236 = abstractC5794.f17825;
        try {
            int i = Integer.parseInt(c10236.m30436().toString());
            try {
                int i2 = Integer.parseInt(c10235.m30436().toString());
                dialogInterfaceC0206.dismiss();
                abstractC5794.mo16272(i, i2);
            } catch (Exception unused) {
                c10235.requestFocus();
                C21374.m48457(R.string.MT_Protector);
            }
        } catch (Exception unused2) {
            c10236.requestFocus();
            C21374.m48457(R.string.MT_Protector);
        }
    }
}
