package l;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۙ᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4ZV */
/* JADX INFO: loaded from: classes3.dex */
public final class C4918 extends AbstractViewOnClickListenerC12490 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15510 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static HashMap f15511 = new HashMap();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f15512;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private synchronized void m14295() {
        this.f37525.clear();
        this.f37525.add(new C22557(this, this.f34527, R.string.MT_Protector, "/", "/system", C19883.f64190));
        this.f37525.add(new C22557(this, this.f34527, R.string.MT_Protector, C16293.f50120.mo23554(), (String) null, C19883.f64180));
        for (C4216 c4216 : (ArrayList) C19739.m45451()) {
            String path = c4216.f13687.getPath();
            this.f37525.add(new C22557(this, this.f34527, c4216.f13686, path, C19883.f64180, (C4027) null));
        }
        this.f15512 = this.f37525.size();
        for (C4027 c4027 : C18844.m43546()) {
            String strM12120 = c4027.m12120();
            this.f37525.add(new C22557(this, this.f34527, c4027.f12781, strM12120, C19883.f64181, c4027));
        }
        f15511.clear();
        for (int i = 0; i < this.f37525.size(); i++) {
            C22557 c22557 = (C22557) this.f37525.get(i);
            String str = c22557.f72949;
            if (str != null) {
                f15511.put(str.toLowerCase(), c22557.f72952);
            }
        }
        for (C4027 c4028 : C18844.m43547()) {
            C13843.putIfAbsent(f15511, c4028.m12120().toLowerCase(), c4028.f12781);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14291(C4918 c4918, C20441 c20441) {
        c4918.getClass();
        int bindingAdapterPosition = c20441.getBindingAdapterPosition();
        C3318 c3318 = c4918.f37526;
        int iM10143 = (bindingAdapterPosition - c3318.m10143(c4918)) - 1;
        if (iM10143 >= c4918.f15512) {
            c4918.f37525.remove(iM10143);
            C18844.m43534(iM10143 - c4918.f15512);
            c3318.notifyItemRangeRemoved(bindingAdapterPosition, 1);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14292(C4918 c4918, C20441 c20441, C20441 c20442) {
        c4918.getClass();
        int bindingAdapterPosition = c20441.getBindingAdapterPosition();
        int bindingAdapterPosition2 = c20442.getBindingAdapterPosition();
        C3318 c3318 = c4918.f37526;
        int iM10143 = (bindingAdapterPosition - c3318.m10143(c4918)) - 1;
        int iM10144 = (bindingAdapterPosition2 - c3318.m10143(c4918)) - 1;
        int i = c4918.f15512;
        C18844.m43535(iM10143 - i, iM10144 - i);
        C6055.m16890(iM10143, iM10144, c4918.f37525);
        c3318.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m14294(C4918 c4918, C20441 c20441) {
        c4918.getClass();
        int bindingAdapterPosition = c20441.getBindingAdapterPosition();
        C3318 c3318 = c4918.f37526;
        int iM10143 = (bindingAdapterPosition - c3318.m10143(c4918)) - 1;
        if (iM10143 >= c4918.f15512) {
            c4918.f37525.remove(iM10143);
            C18844.m43542(iM10143 - c4918.f15512);
            c3318.notifyItemRangeRemoved(bindingAdapterPosition, 1);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ۚ᩸ܳ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.֨᩸ܳ] */
    public C4918(Main main, final C3318 c3318) {
        String strM14327 = C4925.m14327(R.string.MT_Protector);
        super(main, strM14327, strM14327, c3318);
        C19739.m45450(main, new InterfaceC1008() { // from class: l.ۚ᩸ܳ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                C4918.m14293(this.f17396, c3318);
            }
        });
        C18844.m43537(main, (C1390) new InterfaceC1008() { // from class: l.֨᩸ܳ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                C4918.m14290(this.f5030, c3318);
            }
        });
        m14295();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14293(C4918 c4918, C3318 c3318) {
        c4918.m14295();
        c3318.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14290(C4918 c4918, C3318 c3318) {
        c4918.m14295();
        c3318.notifyDataSetChanged();
    }

    @Override // l.AbstractViewOnClickListenerC12490
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo14296() {
        m14295();
    }

    @Override // l.AbstractViewOnClickListenerC12490, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f37526.m10155()) {
            return false;
        }
        C21282 c21282 = new C21282(this.f34527, view, 8388693);
        C7716.m20669(view);
        c21282.m48306();
        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c21282.m48302(new InterfaceC14930() { // from class: l.۠᩸ܳ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                if (menuItem.getItemId() != R.string.MT_Protector) {
                    return false;
                }
                this.f25846.f34527.m129();
                return true;
            }
        });
        c21282.m48305();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m14289(String str) {
        if (str.length() > 1 && str.endsWith("/")) {
            str = C15472.m36561(1, 0, str);
        }
        return (String) f15511.get(str.toLowerCase());
    }

    @Override // l.AbstractViewOnClickListenerC12490
    /* JADX INFO: renamed from: ֫ */
    public final void mo2774(AbstractViewOnLongClickListenerC14606 abstractViewOnLongClickListenerC14606, int i) {
        long jM15219;
        long jM15220;
        C20441 c20441 = (C20441) abstractViewOnLongClickListenerC14606;
        C22557 c22557 = (C22557) this.f37525.get(i);
        c20441.f65939 = c22557;
        TextView textView = c20441.f44700;
        c20441.f44703.setText(c22557.f72952);
        c20441.f65940.m7860(EnumC15830.Visible);
        String string = "";
        if (c22557.f72951 == null) {
            String str = c22557.f72954;
            C2426 c2426 = c20441.f65940;
            try {
                if (str.equals("/")) {
                    C15955 c15955M8086 = C2551.m8086();
                    if (c15955M8086 != null) {
                        jM15219 = c15955M8086.m37730();
                        jM15220 = c15955M8086.m37731();
                    } else {
                        C5292 c5292 = new C5292("/system", "/data");
                        jM15219 = c5292.m15219();
                        jM15220 = c5292.m15220();
                    }
                } else {
                    C5292 c5293 = new C5292(str);
                    long jM152110 = c5293.m15219();
                    long jM15221 = c5293.m15220();
                    jM15219 = jM152110;
                    jM15220 = jM15221;
                }
                if (jM15220 != 0) {
                    long j = jM15220 - jM15219;
                    c2426.m7859((int) ((100 * j) / jM15220));
                    string = c2426.getContext().getString(R.string.MT_Protector, C22927.m51020(j), C22927.m51020(jM15219));
                }
            } catch (Throwable unused) {
            }
            textView.setText(string);
        } else {
            textView.setText("");
        }
        if (textView.length() == 0) {
            c20441.f65940.m7859(0);
            c20441.f65940.m7860(EnumC15830.Invisible);
            textView.setText(c22557.f72949);
        }
        c20441.f44704.m26232(c22557.f72950.f64248);
        c20441.itemView.setOnClickListener(c22557);
        this.f37526.m10148((AbstractViewOnLongClickListenerC14606) c20441);
    }
}
