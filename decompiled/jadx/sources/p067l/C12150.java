package p067l;

import android.view.View;
import android.widget.EditText;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۤ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12150 {

    /* JADX INFO: renamed from: ֫ */
    public View f33962;

    /* JADX INFO: renamed from: ۧ */
    public final String f33963;

    /* JADX INFO: renamed from: ܳ */
    public final int f33964;

    /* JADX INFO: renamed from: ܽ */
    public final Supplier f33965;

    /* JADX INFO: renamed from: ܿ */
    public View f33966;

    /* JADX INFO: renamed from: ᩳ */
    public EditText f33967;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C8126 f33968;

    public C12150(C8126 c8126, int i, String str, Supplier supplier) {
        this.f33968 = c8126;
        this.f33964 = i;
        this.f33963 = str;
        this.f33965 = supplier;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28073(int i, int i2, int i3, View view) {
        View viewFindViewById = view.findViewById(i);
        C12826.requireNonNull(viewFindViewById);
        this.f33966 = viewFindViewById;
        EditText editText = (EditText) view.findViewById(i2);
        C12826.requireNonNull(editText);
        this.f33967 = editText;
        View viewFindViewById2 = view.findViewById(i3);
        C12826.requireNonNull(viewFindViewById2);
        this.f33962 = viewFindViewById2;
        this.f33967.setKeyListener(null);
        this.f33962.setOnClickListener(new View.OnClickListener() { // from class: l.۫۫ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C12150 c12150 = this.f40386;
                C8126 c8126 = c12150.f33968;
                String strM33872 = c8126.f21418.m33872(c12150.f33964);
                if (strM33872 != null) {
                    C7050.m16211((CharSequence) (c8126.f21420 ? strM33872.toUpperCase() : strM33872.toLowerCase()));
                }
            }
        });
        m28072();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28072() {
        C8126 c8126 = this.f33968;
        C14831 c14831 = c8126.f21418;
        int i = this.f33964;
        String strM33872 = c14831.m33872(i);
        boolean z = c8126.f21418.m33873(i) && strM33872 != null;
        this.f33966.setVisibility(z ? 0 : 8);
        this.f33967.setVisibility(z ? 0 : 8);
        this.f33962.setVisibility(z ? 0 : 8);
        if (z) {
            this.f33967.setText(c8126.f21420 ? strM33872.toUpperCase() : strM33872.toLowerCase());
        }
    }
}
