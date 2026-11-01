package p067l;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۠ۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10088 extends AbstractC5462 {

    /* JADX INFO: renamed from: ֫ */
    public final TextView f28001;

    /* JADX INFO: renamed from: ۧ */
    public final View f28002;

    /* JADX INFO: renamed from: ܽ */
    public final TextView f28003;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C16792 f28004;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10088(C16792 c16792, View view) {
        super(view);
        this.f28004 = c16792;
        C21272.m48052(view);
        this.f28003 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f28001 = (TextView) view.findViewById(R.id.MT_Protector);
        View viewFindViewById = view.findViewById(R.id.drag);
        this.f28002 = viewFindViewById;
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ۚۤ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C10088 c10088 = this.f19379;
                C16792 c16793 = c10088.f28004;
                int bindingAdapterPosition = c10088.getBindingAdapterPosition();
                if (bindingAdapterPosition <= 0 || bindingAdapterPosition > c16793.f49491.size()) {
                    return;
                }
                C16792.m38046(c16793, (C15419) c16793.f49491.get(bindingAdapterPosition - 1), false);
            }
        });
        viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: l.֨ۤ᩻
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                C10088 c10088 = this.f6685;
                C16792 c16793 = c10088.f28004;
                if (motionEvent.getActionMasked() != 0 || !C16792.m38050(c16793, c10088.getBindingAdapterPosition())) {
                    return false;
                }
                c16793.f49492.m7555(c10088);
                return false;
            }
        });
    }
}
