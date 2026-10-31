package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14524 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f44510;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f44511;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C1556 f44512;

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        InterfaceC17889 interfaceC17889 = (InterfaceC17889) this.f44511.get(i);
        C17183 c17183 = ((ViewOnTouchListenerC23697) abstractC3255).f76742;
        c17183.m40423().setText(interfaceC17889.mo36985());
        CharSequence charSequenceMo29720 = interfaceC17889.mo29720();
        if (charSequenceMo29720 != null) {
            c17183.m40416().setText(charSequenceMo29720);
        } else if (interfaceC17889.mo24437()) {
            c17183.m40416().setText(C22927.m51020(interfaceC17889.getSize()));
        } else {
            c17183.m40416().setText((CharSequence) null);
        }
        C14615 c14615M40418 = c17183.m40418();
        if (interfaceC17889.mo36978()) {
            c14615M40418.setVisibility(0);
            c14615M40418.setText("->");
        } else if (interfaceC17889.mo25860()) {
            c14615M40418.setVisibility(0);
            c14615M40418.setText("* ");
        } else {
            c14615M40418.setVisibility(4);
            c14615M40418.setText(" ");
        }
        CharSequence charSequenceMo21183 = interfaceC17889.mo21183();
        if (charSequenceMo21183 == null) {
            charSequenceMo21183 = C17283.m40577(interfaceC17889.getTime());
        }
        c17183.m40419().setText(charSequenceMo21183);
        C11813 icon = interfaceC17889.getIcon();
        if (icon != null) {
            c17183.m40420().setImageDrawable(icon.m28878());
        }
    }

    public C14524(AbstractActivityC3346 abstractActivityC3346, ArrayList arrayList, C1556 c1556) {
        this.f44510 = abstractActivityC3346;
        this.f44511 = arrayList;
        this.f44512 = c1556;
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewOnTouchListenerC23697 viewOnTouchListenerC23697 = new ViewOnTouchListenerC23697(LayoutInflater.from(this.f44510).inflate(R.layout.MT_Protector, viewGroup, false));
        viewOnTouchListenerC23697.f76743 = this.f44512;
        ViewGroup viewGroup2 = (ViewGroup) viewOnTouchListenerC23697.itemView;
        C17183 c17183 = (C17183) viewGroup2.getChildAt(0);
        viewOnTouchListenerC23697.f76742 = c17183;
        c17183.m40422();
        c17183.m40423().setSingleLine(C19890.f64287 == 1);
        c17183.m40423().setMaxLines(C19890.f64287);
        int i2 = C19890.f64277;
        if (i2 == 1) {
            c17183.m40423().setTextSize(2, 13.0f);
            c17183.m40416().setTextSize(2, 10.0f);
            c17183.m40418().setTextSize(2, 10.0f);
            c17183.m40419().setTextSize(2, 10.0f);
        } else if (i2 == 2) {
            c17183.m40423().setTextSize(2, 15.0f);
            c17183.m40416().setTextSize(2, 11.0f);
            c17183.m40418().setTextSize(2, 11.0f);
            c17183.m40419().setTextSize(2, 11.0f);
        } else if (i2 == 3) {
            c17183.m40423().setTextSize(2, 17.0f);
            c17183.m40416().setTextSize(2, 12.0f);
            c17183.m40418().setTextSize(2, 12.0f);
            c17183.m40419().setTextSize(2, 12.0f);
        }
        View childAt = viewGroup2.getChildAt(1);
        childAt.setAlpha(0.75f);
        childAt.setOnTouchListener(viewOnTouchListenerC23697);
        childAt.setFocusable(true);
        childAt.setClickable(true);
        return viewOnTouchListenerC23697;
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f44511.size();
    }
}
