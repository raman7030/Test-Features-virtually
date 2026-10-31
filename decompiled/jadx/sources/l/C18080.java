package l;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import bin.mt.plus.R;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ᩳ۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U998 */
/* JADX INFO: loaded from: classes5.dex */
public class C18080 extends AbstractC3723 {

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f56311 = new HashMap();

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f56312 = 0;

    static {
        m42141(R.color.MT_Protector, R.style.MT_Protector, "default");
        m42141(R.color.MT_Protector, R.style.MT_Protector, "black");
        m42141(R.color.MT_Protector, R.style.MT_Protector, "purple");
        m42141(R.color.MT_Protector, R.style.MT_Protector, "blue");
        m42141(R.color.MT_Protector, R.style.MT_Protector, "dodger_blue");
        m42141(R.color.MT_Protector, R.style.MT_Protector, "royal_blue");
        m42141(R.color.MT_Protector, R.style.MT_Protector, "dark_salmon");
        m42141(R.color.MT_Protector, R.style.MT_Protector, "orange");
        m42141(R.color.MT_Protector, R.style.MT_Protector, "pink");
        m42141(R.color.MT_Protector, R.style.MT_Protector, "green");
        m42141(R.color.MT_Protector, R.style.MT_Protector, "deep_green");
        m42141(R.color.MT_Protector, R.style.MT_Protector, "teal");
        m42141(R.color.MT_Protector, R.style.MT_Protector, "light_gray");
        m42141(R.color.MT_Protector, R.style.MT_Protector, "light_blue");
        m42141(R.color.MT_Protector, R.style.MT_Protector, "light_salmon");
        m42141(R.color.MT_Protector, R.style.MT_Protector, "monet1");
        m42141(R.color.MT_Protector, R.style.MT_Protector, "monet2");
        m42141(R.color.MT_Protector, R.style.MT_Protector, "monet3");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42141(int i, int i2, String str) {
        f56311.put(str, new C16668(str, i, i2));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C16668 m42143(String str) {
        if (str == null) {
            str = "default";
        }
        if (str.startsWith("monet") && Build.VERSION.SDK_INT < 31) {
            str = "default";
        }
        HashMap map = f56311;
        C16668 c16668 = (C16668) map.get(str);
        if (c16668 != null) {
            return c16668;
        }
        C16668 c16669 = (C16668) map.get("default");
        C11003.requireNonNull(c16669);
        return c16669;
    }

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static int m42142() {
        return m42143(ApplicationC20075.f65010.getString("theme", "default")).f51174;
    }

    public C18080(Context context) {
        super(context);
    }

    public C18080(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C18080(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C18080(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // l.AbstractC3723
    /* JADX INFO: renamed from: ֫ */
    public final void mo6161(final AbstractActivityC3346 abstractActivityC3346) {
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        int i = 18;
        int[] iArr = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};
        if (Build.VERSION.SDK_INT < 31) {
            viewM10216.findViewById(R.id.MT_Protector).setVisibility(8);
            viewM10216.findViewById(R.id.MT_Protector).setVisibility(8);
            i = 15;
        }
        C17374[] c17374Arr = new C17374[i];
        for (int i2 = 0; i2 < i; i2++) {
            c17374Arr[i2] = (C17374) viewM10216.findViewById(iArr[i2]);
        }
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۧ۬᩷
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = C18080.f56312;
                C17374 c17374 = (C17374) view;
                if (!C18080.m42143(ApplicationC20075.f65010.getString("theme", "default")).f51173.equals(c17374.m40716())) {
                    ApplicationC20075.f65010.edit().putString("theme", c17374.m40716()).apply();
                    C11297.m27943(abstractActivityC3346);
                    this.f33144.m6893((Serializable) c17374.m40716());
                }
                dialogInterfaceC0206M44438.dismiss();
            }
        };
        C16668 c16668M42143 = m42143(ApplicationC20075.f65010.getString("theme", "default"));
        for (int i3 = 0; i3 < i; i3++) {
            C17374 c17374 = c17374Arr[i3];
            c17374.m40715(c17374.m40716().equals(c16668M42143.f51173));
            c17374.setOnClickListener(onClickListener);
        }
    }
}
