package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import bin.p000mt.json.JSON;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.DataInputStream;

/* JADX INFO: renamed from: l.ۨܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D77Z */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13544 implements InterfaceC20295, InterfaceC6427, InterfaceC17905 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f38097;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f38098;

    public /* synthetic */ C13544(Object obj, Object obj2) {
        this.f38097 = obj;
        this.f38098 = obj2;
    }

    @Override // p067l.InterfaceC6427
    /* JADX INFO: renamed from: ֫ */
    public C14663 mo13964(int i) {
        return C24272.m53611((C24272) this.f38097, (C11319) this.f38098, i);
    }

    @Override // p067l.InterfaceC17905
    /* JADX INFO: renamed from: ֫ */
    public C5276 mo24636(String str, String str2, String str3) {
        return C5276.m11411(str, str2, "fatal", null, C9417.m21913(MotionUtils.EASING_TYPE_PATH, (String) this.f38097, "policyRevision", (String) this.f38098).add("operation", "check_parent_links").add("backendReason", str3).add("changed", false).add("stateKnown", true).add("warnings", JSON.array()));
    }

    @Override // p067l.InterfaceC20295
    /* JADX INFO: renamed from: ۧ */
    public void mo8469(final AbstractC17043 abstractC17043) {
        boolean z;
        C18107 c18107 = (C18107) this.f38097;
        final InterfaceC19370 interfaceC19370 = (InterfaceC19370) this.f38098;
        final Main mainM41282 = c18107.m41282();
        int i = ActivityC12426.f34729;
        try {
            DataInputStream dataInputStream = new DataInputStream(abstractC17043.mo29987());
            try {
                z = ((long) dataInputStream.readInt()) == 2135247942;
                try {
                    dataInputStream.close();
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception unused2) {
            z = false;
        }
        String strM16224 = C7050.m16224(R.string.MT_Protector);
        SpannableString spannableString = new SpannableString(((Object) strM16224) + "\n" + C7050.m16224(R.string.MT_Protector));
        spannableString.setSpan(new ForegroundColorSpan(C23223.f73004), strM16224.length() + 1, spannableString.length(), 17);
        spannableString.setSpan(new AbsoluteSizeSpan(C13076.m29941(12.0f)), strM16224.length() + 1, spannableString.length(), 17);
        C20671 c20671BuildDialog = mainM41282.buildDialog();
        c20671BuildDialog.m46730(abstractC17043.getName());
        c20671BuildDialog.m46718(ApplicationC21448.f67649.getBoolean("ewrp", false) ? spannableString : strM16224);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩹᩹ۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = ActivityC12426.f34729;
                int i4 = C20966.f65864;
                AbstractActivityC5549 abstractActivityC5549 = mainM41282;
                Intent intent = new Intent(abstractActivityC5549, (Class<?>) ActivityC12426.class);
                intent.addFlags(268435456);
                intent.setAction("android.intent.action.VIEW");
                intent.setData(abstractC17043.m38680());
                abstractActivityC5549.startActivity(intent);
                C11245.m26044(interfaceC19370, 2000);
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡᩹ۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = ActivityC12426.f34729;
                int i4 = C20966.f65864;
                AbstractActivityC5549 abstractActivityC5549 = mainM41282;
                Intent intent = new Intent(abstractActivityC5549, (Class<?>) ActivityC17874.class);
                intent.addFlags(268435456);
                intent.setAction("android.intent.action.VIEW");
                intent.setData(abstractC17043.m38680());
                abstractActivityC5549.startActivity(intent);
                C11245.m26044(interfaceC19370, 2000);
            }
        });
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        if (z) {
            dialogInterfaceC2564M46732.m3859().setEnabled(false);
        }
        C10884.m25069(dialogInterfaceC2564M46732);
        dialogInterfaceC2564M46732.m3861().setOnClickListener(new ViewOnClickListenerC23557(dialogInterfaceC2564M46732, spannableString, strM16224, 2));
    }
}
