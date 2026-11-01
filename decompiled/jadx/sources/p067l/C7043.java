package p067l;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۙ᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4ZV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7043 extends AbstractViewOnClickListenerC14239 {

    /* JADX INFO: renamed from: ۛ */
    public static final /* synthetic */ int f18343 = 0;

    /* JADX INFO: renamed from: ۨ */
    public static HashMap f18344 = new HashMap();

    /* JADX INFO: renamed from: ۤ */
    public int f18345;

    /* JADX INFO: renamed from: ܿ */
    private synchronized void m16192() {
        this.f40548.clear();
        this.f40548.add(new C23807(this, this.f37526, R.string.MT_Protector, "/", "/system", C21265.f66826));
        this.f40548.add(new C23807(this, this.f37526, R.string.MT_Protector, C17853.f53287.mo25505(), (String) null, C21265.f66816));
        for (C6376 c6376 : (ArrayList) C21129.m47755()) {
            String path = c6376.f16500.getPath();
            this.f40548.add(new C23807(this, this.f37526, c6376.f16499, path, C21265.f66816, (C6196) null));
        }
        this.f18345 = this.f40548.size();
        for (C6196 c6196 : C20278.m45812()) {
            String strM14040 = c6196.m14040();
            this.f40548.add(new C23807(this, this.f37526, c6196.f15596, strM14040, C21265.f66817, c6196));
        }
        f18344.clear();
        for (int i = 0; i < this.f40548.size(); i++) {
            C23807 c23807 = (C23807) this.f40548.get(i);
            String str = c23807.f75676;
            if (str != null) {
                f18344.put(str.toLowerCase(), c23807.f75679);
            }
        }
        for (C6196 c6197 : C20278.m45813()) {
            C15525.putIfAbsent(f18344, c6197.m14040().toLowerCase(), c6197.f15596);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16188(C7043 c7043, C21796 c21796) {
        c7043.getClass();
        int bindingAdapterPosition = c21796.getBindingAdapterPosition();
        C5522 c5522 = c7043.f40549;
        int iM12179 = (bindingAdapterPosition - c5522.m12179(c7043)) - 1;
        if (iM12179 >= c7043.f18345) {
            c7043.f40548.remove(iM12179);
            C20278.m45800(iM12179 - c7043.f18345);
            c5522.notifyItemRangeRemoved(bindingAdapterPosition, 1);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16189(C7043 c7043, C21796 c21796, C21796 c21797) {
        c7043.getClass();
        int bindingAdapterPosition = c21796.getBindingAdapterPosition();
        int bindingAdapterPosition2 = c21797.getBindingAdapterPosition();
        C5522 c5522 = c7043.f40549;
        int iM12179 = (bindingAdapterPosition - c5522.m12179(c7043)) - 1;
        int iM121710 = (bindingAdapterPosition2 - c5522.m12179(c7043)) - 1;
        int i = c7043.f18345;
        C20278.m45801(iM12179 - i, iM121710 - i);
        C8123.m18819(iM12179, iM121710, c7043.f40548);
        c5522.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m16191(C7043 c7043, C21796 c21796) {
        c7043.getClass();
        int bindingAdapterPosition = c21796.getBindingAdapterPosition();
        C5522 c5522 = c7043.f40549;
        int iM12179 = (bindingAdapterPosition - c5522.m12179(c7043)) - 1;
        if (iM12179 >= c7043.f18345) {
            c7043.f40548.remove(iM12179);
            C20278.m45808(iM12179 - c7043.f18345);
            c5522.notifyItemRangeRemoved(bindingAdapterPosition, 1);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ۚ᩸ܳ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.֨᩸ܳ] */
    public C7043(Main main, final C5522 c5522) {
        String strM16224 = C7050.m16224(R.string.MT_Protector);
        super(main, strM16224, strM16224, c5522);
        C21129.m47754(main, new InterfaceC3326() { // from class: l.ۚ᩸ܳ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                C7043.m16190(this.f20240, c5522);
            }
        });
        C20278.m45803(main, (C3690) new InterfaceC3326() { // from class: l.֨᩸ܳ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                C7043.m16187(this.f7802, c5522);
            }
        });
        m16192();
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m16190(C7043 c7043, C5522 c5522) {
        c7043.m16192();
        c5522.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m16187(C7043 c7043, C5522 c5522) {
        c7043.m16192();
        c5522.notifyDataSetChanged();
    }

    @Override // p067l.AbstractViewOnClickListenerC14239
    /* JADX INFO: renamed from: ᩳ */
    public final void mo16193() {
        m16192();
    }

    @Override // p067l.AbstractViewOnClickListenerC14239, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f40549.m12191()) {
            return false;
        }
        C1898 c1898 = new C1898(this.f37526, view, 8388693);
        C9702.m22649(view);
        c1898.m50640();
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c1898.m50636(new InterfaceC1583() { // from class: l.۠᩸ܳ
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                if (menuItem.getItemId() != R.string.MT_Protector) {
                    return false;
                }
                this.f28759.f37526.m127();
                return true;
            }
        });
        c1898.m50639();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m16186(String str) {
        if (str.length() > 1 && str.endsWith("/")) {
            str = C17073.m38720(1, 0, str);
        }
        return (String) f18344.get(str.toLowerCase());
    }

    @Override // p067l.AbstractViewOnClickListenerC14239
    /* JADX INFO: renamed from: ֫ */
    public final void mo5113(AbstractViewOnLongClickListenerC16250 abstractViewOnLongClickListenerC16250, int i) {
        long jM17122;
        long jM17123;
        C21796 c21796 = (C21796) abstractViewOnLongClickListenerC16250;
        C23807 c23807 = (C23807) this.f40548.get(i);
        c21796.f68614 = c23807;
        TextView textView = c21796.f47806;
        c21796.f47809.setText(c23807.f75679);
        c21796.f68615.m9908(EnumC17413.Visible);
        String string = "";
        if (c23807.f75678 == null) {
            String str = c23807.f75681;
            C4674 c4674 = c21796.f68615;
            try {
                if (str.equals("/")) {
                    C17532 c17532M10117 = C4793.m10117();
                    if (c17532M10117 != null) {
                        jM17122 = c17532M10117.m39905();
                        jM17123 = c17532M10117.m39906();
                    } else {
                        C7398 c7398 = new C7398("/system", "/data");
                        jM17122 = c7398.m17122();
                        jM17123 = c7398.m17123();
                    }
                } else {
                    C7398 c7399 = new C7398(str);
                    long jM17124 = c7399.m17122();
                    long jM17125 = c7399.m17123();
                    jM17122 = jM17124;
                    jM17123 = jM17125;
                }
                if (jM17123 != 0) {
                    long j = jM17123 - jM17122;
                    c4674.m9907((int) ((100 * j) / jM17123));
                    string = c4674.getContext().getString(R.string.MT_Protector, C24158.m53411(j), C24158.m53411(jM17122));
                }
            } catch (Throwable unused) {
            }
            textView.setText(string);
        } else {
            textView.setText("");
        }
        if (textView.length() == 0) {
            c21796.f68615.m9907(0);
            c21796.f68615.m9908(EnumC17413.Invisible);
            textView.setText(c23807.f75676);
        }
        c21796.f47810.m28261(c23807.f75677.f66884);
        c21796.itemView.setOnClickListener(c23807);
        this.f40549.m12184((AbstractViewOnLongClickListenerC16250) c21796);
    }
}
