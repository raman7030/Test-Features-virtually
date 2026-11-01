package p067l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۜ᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89CO */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC9117 extends AbstractC22529 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public TextView f24686;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ActivityC11800 f24687;

    @Override // p067l.AbstractC22529
    /* JADX INFO: renamed from: ֫ */
    public final void mo21060(AbstractC15562 abstractC15562) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC9117(ActivityC11800 activityC11800, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC11800).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f24687 = activityC11800;
        this.itemView.setOnClickListener(this);
        TextView textView = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f24686 = textView;
        textView.setText(C9688.m22586().toString());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String[] strArr = (String[]) C23573.stream(EnumC14619.values()).map(new C24721(2)).toArray(new C16492());
        C20671 c20671BuildDialog = this.f24687.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46723(strArr, C9688.m22586().ordinal(), new DialogInterface.OnClickListener() { // from class: l.᩻᩻ܿ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C9688.m22585(EnumC14619.values()[i]);
                this.f80617.f24686.setText(C9688.m22586().toString());
                dialogInterface.dismiss();
            }
        });
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46732();
    }
}
