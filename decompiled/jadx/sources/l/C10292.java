package l;

import android.view.View;
import android.widget.EditText;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۤ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10292 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public View f30999;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f31000;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f31001;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Supplier f31002;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public View f31003;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EditText f31004;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6058 f31005;

    public C10292(C6058 c6058, int i, String str, Supplier supplier) {
        this.f31005 = c6058;
        this.f31001 = i;
        this.f31000 = str;
        this.f31002 = supplier;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26049(int i, int i2, int i3, View view) {
        View viewFindViewById = view.findViewById(i);
        C11003.requireNonNull(viewFindViewById);
        this.f31003 = viewFindViewById;
        EditText editText = (EditText) view.findViewById(i2);
        C11003.requireNonNull(editText);
        this.f31004 = editText;
        View viewFindViewById2 = view.findViewById(i3);
        C11003.requireNonNull(viewFindViewById2);
        this.f30999 = viewFindViewById2;
        this.f31004.setKeyListener(null);
        this.f30999.setOnClickListener(new View.OnClickListener() { // from class: l.۫۫ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C10292 c10292 = this.f37371;
                C6058 c6058 = c10292.f31005;
                String strM31781 = c6058.f18562.m31781(c10292.f31001);
                if (strM31781 != null) {
                    C4925.m14314((CharSequence) (c6058.f18564 ? strM31781.toUpperCase() : strM31781.toLowerCase()));
                }
            }
        });
        m26048();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26048() {
        C6058 c6058 = this.f31005;
        C13113 c13113 = c6058.f18562;
        int i = this.f31001;
        String strM31781 = c13113.m31781(i);
        boolean z = c6058.f18562.m31782(i) && strM31781 != null;
        this.f31003.setVisibility(z ? 0 : 8);
        this.f31004.setVisibility(z ? 0 : 8);
        this.f30999.setVisibility(z ? 0 : 8);
        if (z) {
            this.f31004.setText(c6058.f18564 ? strM31781.toUpperCase() : strM31781.toLowerCase());
        }
    }
}
