package p067l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16172 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f47616;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f47617;

    /* JADX INFO: renamed from: ܽ */
    public final C3847 f47618;

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        InterfaceC19370 interfaceC19370 = (InterfaceC19370) this.f47617.get(i);
        C18699 c18699 = ((ViewOnTouchListenerC24890) abstractC5462).f79492;
        c18699.m42668().setText(interfaceC19370.mo39151());
        CharSequence charSequenceMo31782 = interfaceC19370.mo31782();
        if (charSequenceMo31782 != null) {
            c18699.m42661().setText(charSequenceMo31782);
        } else if (interfaceC19370.mo26449()) {
            c18699.m42661().setText(C24158.m53411(interfaceC19370.getSize()));
        } else {
            c18699.m42661().setText((CharSequence) null);
        }
        C1567 c1567M42663 = c18699.m42663();
        if (interfaceC19370.mo39144()) {
            c1567M42663.setVisibility(0);
            c1567M42663.setText("->");
        } else if (interfaceC19370.mo27882()) {
            c1567M42663.setVisibility(0);
            c1567M42663.setText("* ");
        } else {
            c1567M42663.setVisibility(4);
            c1567M42663.setText(" ");
        }
        CharSequence charSequenceMo23149 = interfaceC19370.mo23149();
        if (charSequenceMo23149 == null) {
            charSequenceMo23149 = C18794.m42828(interfaceC19370.getTime());
        }
        c18699.m42664().setText(charSequenceMo23149);
        C13596 icon = interfaceC19370.getIcon();
        if (icon != null) {
            c18699.m42665().setImageDrawable(icon.m30927());
        }
    }

    public C16172(AbstractActivityC5549 abstractActivityC5549, ArrayList arrayList, C3847 c3847) {
        this.f47616 = abstractActivityC5549;
        this.f47617 = arrayList;
        this.f47618 = c3847;
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewOnTouchListenerC24890 viewOnTouchListenerC24890 = new ViewOnTouchListenerC24890(LayoutInflater.from(this.f47616).inflate(R.layout.MT_Protector, viewGroup, false));
        viewOnTouchListenerC24890.f79493 = this.f47618;
        ViewGroup viewGroup2 = (ViewGroup) viewOnTouchListenerC24890.itemView;
        C18699 c18699 = (C18699) viewGroup2.getChildAt(0);
        viewOnTouchListenerC24890.f79492 = c18699;
        c18699.m42667();
        c18699.m42668().setSingleLine(C21272.f66922 == 1);
        c18699.m42668().setMaxLines(C21272.f66922);
        int i2 = C21272.f66913;
        if (i2 == 1) {
            c18699.m42668().setTextSize(2, 13.0f);
            c18699.m42661().setTextSize(2, 10.0f);
            c18699.m42663().setTextSize(2, 10.0f);
            c18699.m42664().setTextSize(2, 10.0f);
        } else if (i2 == 2) {
            c18699.m42668().setTextSize(2, 15.0f);
            c18699.m42661().setTextSize(2, 11.0f);
            c18699.m42663().setTextSize(2, 11.0f);
            c18699.m42664().setTextSize(2, 11.0f);
        } else if (i2 == 3) {
            c18699.m42668().setTextSize(2, 17.0f);
            c18699.m42661().setTextSize(2, 12.0f);
            c18699.m42663().setTextSize(2, 12.0f);
            c18699.m42664().setTextSize(2, 12.0f);
        }
        View childAt = viewGroup2.getChildAt(1);
        childAt.setAlpha(0.75f);
        childAt.setOnTouchListener(viewOnTouchListenerC24890);
        childAt.setFocusable(true);
        childAt.setClickable(true);
        return viewOnTouchListenerC24890;
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f47617.size();
    }
}
