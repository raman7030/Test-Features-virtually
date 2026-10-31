package l;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes3.dex */
public final class C8122 extends AbstractC3255 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TextView f25088;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View f25089;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f25090;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15176 f25091;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8122(C15176 c15176, View view) {
        super(view);
        this.f25091 = c15176;
        C19890.m45741(view);
        this.f25090 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f25088 = (TextView) view.findViewById(R.id.MT_Protector);
        View viewFindViewById = view.findViewById(R.id.drag);
        this.f25089 = viewFindViewById;
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ۚۤ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8122 c8122 = this.f16542;
                C15176 c15177 = c8122.f25091;
                int bindingAdapterPosition = c8122.getBindingAdapterPosition();
                if (bindingAdapterPosition <= 0 || bindingAdapterPosition > c15177.f46366.size()) {
                    return;
                }
                C15176.m35887(c15177, (C13732) c15177.f46366.get(bindingAdapterPosition - 1), false);
            }
        });
        viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: l.֨ۤ᩻
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                C8122 c8122 = this.f3914;
                C15176 c15177 = c8122.f25091;
                if (motionEvent.getActionMasked() != 0 || !C15176.m35891(c15177, c8122.getBindingAdapterPosition())) {
                    return false;
                }
                c15177.f46367.m5326(c8122);
                return false;
            }
        });
    }
}
