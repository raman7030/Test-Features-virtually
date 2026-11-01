package p067l;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import bin.p000mt.plus.R;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ᩳ۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U998 */
/* JADX INFO: loaded from: classes5.dex */
public class C19552 extends AbstractC5907 {

    /* JADX INFO: renamed from: ۤ֫ */
    public static final HashMap f59523 = new HashMap();

    /* JADX INFO: renamed from: ۫֫ */
    public static final /* synthetic */ int f59524 = 0;

    static {
        m44400(R.color.MT_Protector, R.style.MT_Protector, "default");
        m44400(R.color.MT_Protector, R.style.MT_Protector, "black");
        m44400(R.color.MT_Protector, R.style.MT_Protector, "purple");
        m44400(R.color.MT_Protector, R.style.MT_Protector, "blue");
        m44400(R.color.MT_Protector, R.style.MT_Protector, "dodger_blue");
        m44400(R.color.MT_Protector, R.style.MT_Protector, "royal_blue");
        m44400(R.color.MT_Protector, R.style.MT_Protector, "dark_salmon");
        m44400(R.color.MT_Protector, R.style.MT_Protector, "orange");
        m44400(R.color.MT_Protector, R.style.MT_Protector, "pink");
        m44400(R.color.MT_Protector, R.style.MT_Protector, "green");
        m44400(R.color.MT_Protector, R.style.MT_Protector, "deep_green");
        m44400(R.color.MT_Protector, R.style.MT_Protector, "teal");
        m44400(R.color.MT_Protector, R.style.MT_Protector, "light_gray");
        m44400(R.color.MT_Protector, R.style.MT_Protector, "light_blue");
        m44400(R.color.MT_Protector, R.style.MT_Protector, "light_salmon");
        m44400(R.color.MT_Protector, R.style.MT_Protector, "monet1");
        m44400(R.color.MT_Protector, R.style.MT_Protector, "monet2");
        m44400(R.color.MT_Protector, R.style.MT_Protector, "monet3");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m44400(int i, int i2, String str) {
        f59523.put(str, new C18210(str, i, i2));
    }

    /* JADX INFO: renamed from: ܽ */
    public static C18210 m44402(String str) {
        if (str == null) {
            str = "default";
        }
        if (str.startsWith("monet") && Build.VERSION.SDK_INT < 31) {
            str = "default";
        }
        HashMap map = f59523;
        C18210 c18210 = (C18210) map.get(str);
        if (c18210 != null) {
            return c18210;
        }
        C18210 c18211 = (C18210) map.get("default");
        C12826.requireNonNull(c18211);
        return c18211;
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public static int m44401() {
        return m44402(ApplicationC21448.f67650.getString("theme", "default")).f54359;
    }

    public C19552(Context context) {
        super(context);
    }

    public C19552(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C19552(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C19552(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // p067l.AbstractC5907
    /* JADX INFO: renamed from: ֫ */
    public final void mo8363(final AbstractActivityC5549 abstractActivityC5549) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        int i = 18;
        int[] iArr = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};
        if (Build.VERSION.SDK_INT < 31) {
            viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
            viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
            i = 15;
        }
        C18881[] c18881Arr = new C18881[i];
        for (int i2 = 0; i2 < i; i2++) {
            c18881Arr[i2] = (C18881) viewM12252.findViewById(iArr[i2]);
        }
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۧ۬᩷
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = C19552.f59524;
                C18881 c18881 = (C18881) view;
                if (!C19552.m44402(ApplicationC21448.f67650.getString("theme", "default")).f54358.equals(c18881.m42968())) {
                    ApplicationC21448.f67650.edit().putString("theme", c18881.m42968()).apply();
                    C13106.m30004(abstractActivityC5549);
                    this.f36139.m9019((Serializable) c18881.m42968());
                }
                dialogInterfaceC2564M46732.dismiss();
            }
        };
        C18210 c18210M44402 = m44402(ApplicationC21448.f67650.getString("theme", "default"));
        for (int i3 = 0; i3 < i; i3++) {
            C18881 c18881 = c18881Arr[i3];
            c18881.m42967(c18881.m42968().equals(c18210M44402.f54358));
            c18881.setOnClickListener(onClickListener);
        }
    }
}
