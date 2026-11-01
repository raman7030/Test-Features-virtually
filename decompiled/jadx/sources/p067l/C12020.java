package p067l;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۤ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes4.dex */
public final class C12020 extends C15556 implements InterfaceC19840 {

    /* JADX INFO: renamed from: ۖ֫ */
    public int f33499;

    /* JADX INFO: renamed from: ۡ֫ */
    public int f33500;

    /* JADX INFO: renamed from: ܺ֫ */
    public final /* synthetic */ C7996 f33501;

    @Override // p067l.C15556
    /* JADX INFO: renamed from: ۘ */
    public final boolean mo27516() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12020(C7996 c7996) {
        super(C15556.m35366("<>"));
        this.f33501 = c7996;
        this.f33500 = C13076.m29939(17.0f);
        this.f33499 = C13076.m29939(20.0f);
        m35381((InterfaceC19840) this);
    }

    @Override // p067l.C15556
    /* JADX INFO: renamed from: ֫ */
    public final int mo27512(int i) {
        return i == 0 ? this.f33499 : this.f44451 * i;
    }

    /* JADX INFO: renamed from: ֨ */
    private int m27511() {
        C7996 c7996 = this.f33501;
        if (c7996.f21012.isEmpty()) {
            return 1;
        }
        int i = ((C3263) c7996.f21012.peek()).m5677() > 0 ? 3 : 1;
        if (c7996.f21012.size() >= 2) {
            i++;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: ۚ */
    public final void m27517() {
        int iM27511 = m27511();
        if (iM27511 <= 2) {
            notifyDataSetChanged();
        } else {
            notifyItemRangeChanged(0, iM27511 + 2);
        }
    }

    @Override // p067l.C15556, p067l.AbstractC21283
    public final int getItemCount() {
        if (this.f33501.f21012.isEmpty()) {
            return 2;
        }
        return m27511() + 2 + super.getItemCount();
    }

    @Override // p067l.C15556, p067l.AbstractC21283
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int iM27511 = m27511();
        if (i2 < iM27511) {
            return 2;
        }
        int i3 = i2 - iM27511;
        if (i3 == 0) {
            return 1;
        }
        return super.getItemViewType(i3 - 1);
    }

    @Override // p067l.C15556, p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C16712(C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 1) {
            return new C16712(C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false));
        }
        if (i != 2) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        return new ViewOnClickListenerC5314(this.f33501, C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.C15556, p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        int i2;
        if (i == 0) {
            ((C16712) abstractC5462).f49216.setText(R.string.MT_Protector);
            return;
        }
        int i3 = -1;
        int i4 = i - 1;
        int iM27511 = m27511();
        C7996 c7996 = this.f33501;
        if (i4 >= iM27511) {
            int i5 = i4 - iM27511;
            if (i5 != 0) {
                super.onBindViewHolder(abstractC5462, i5 - 1);
                return;
            }
            C16712 c16712 = (C16712) abstractC5462;
            C3263 c3263 = (C3263) c7996.f21012.peek();
            c16712.f49216.setText(c7996.getString(R.string.MT_Protector, Integer.valueOf(c3263.m5677())) + " - " + c3263.m5679());
            c16712.f49215.setOnClickListener(new View.OnClickListener() { // from class: l.۬۟᩷
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final C12020 c12020 = this.f41926;
                    C1898 c1898 = new C1898(c12020.f33501.requireContext(), view, 0);
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c1898.m50636(new InterfaceC1583() { // from class: l.۫۟᩷
                        @Override // p067l.InterfaceC1583
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            C7996 c7997 = c12020.f33501;
                            int itemId = menuItem.getItemId();
                            if (itemId == R.string.MT_Protector) {
                                c7997.f21015.m35394();
                                return true;
                            }
                            if (itemId == R.string.MT_Protector) {
                                c7997.f21015.m35383(true);
                                return true;
                            }
                            if (itemId == R.string.MT_Protector) {
                                c7997.f21015.m35394();
                                c7997.f21015.m35383(false);
                            }
                            return true;
                        }
                    });
                    c1898.m50639();
                }
            });
            return;
        }
        ViewOnClickListenerC5314 viewOnClickListenerC5314 = (ViewOnClickListenerC5314) abstractC5462;
        int[] iArr = new int[5];
        iArr[0] = 0;
        iArr[1] = -1;
        iArr[2] = -1;
        iArr[3] = -1;
        iArr[4] = -1;
        if (!c7996.f21012.isEmpty()) {
            if (((C3263) c7996.f21012.peek()).m5677() > 0) {
                iArr[1] = 1;
                iArr[2] = 2;
                i2 = 3;
            } else {
                i2 = 1;
            }
            if (c7996.f21012.size() >= 2) {
                iArr[i2] = 3;
                i2++;
            }
            iArr[i2] = 4;
        }
        if (i4 >= 0 && i4 < 5) {
            i3 = iArr[i4];
        }
        viewOnClickListenerC5314.f12499 = i3;
        TextView textView = viewOnClickListenerC5314.f12496;
        ImageView imageView = viewOnClickListenerC5314.f12498;
        if (i3 == 0) {
            imageView.setImageResource(R.drawable.MT_Protector);
            textView.setText(R.string.MT_Protector);
            return;
        }
        if (i3 == 1) {
            imageView.setImageResource(R.drawable.MT_Protector);
            textView.setText(R.string.MT_Protector);
            return;
        }
        if (i3 == 2) {
            imageView.setImageResource(R.drawable.MT_Protector);
            textView.setText(R.string.MT_Protector);
        } else if (i3 == 3) {
            imageView.setImageResource(R.drawable.MT_Protector);
            textView.setText(R.string.MT_Protector);
        } else {
            if (i3 != 4) {
                throw new RuntimeException(C20778.m46922(i3, "MenuType = "));
            }
            imageView.setImageResource(R.drawable.MT_Protector);
            textView.setText(R.string.MT_Protector);
        }
    }

    @Override // p067l.C15556
    /* JADX INFO: renamed from: ۜ */
    public final int mo17934() {
        return m27511() + 2;
    }

    @Override // p067l.C15556
    /* JADX INFO: renamed from: ۧ */
    public final int mo27518(String str) {
        C7287 c7287M5675 = ((C3263) this.f33501.f21012.peek()).m5675(str);
        if (c7287M5675 == null) {
            return 0;
        }
        return c7287M5675.f19020.size();
    }

    @Override // p067l.C15556
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5462 mo27513(ViewGroup viewGroup) {
        C7996 c7996 = this.f33501;
        View viewInflate = LayoutInflater.from(c7996.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewInflate.getLayoutParams();
        marginLayoutParams.leftMargin = this.f44451 + this.f33500;
        viewInflate.setLayoutParams(marginLayoutParams);
        return new ViewOnClickListenerC10008(c7996, viewInflate);
    }

    @Override // p067l.C15556
    /* JADX INFO: renamed from: ֫ */
    public final void mo27515(AbstractC5462 abstractC5462, String str, int i) {
        ViewOnClickListenerC10008 viewOnClickListenerC10008 = (ViewOnClickListenerC10008) abstractC5462;
        C7996 c7996 = this.f33501;
        C7287 c7287M5675 = ((C3263) c7996.f21012.peek()).m5675(str);
        C20699 c20699 = (C20699) c7287M5675.f19020.get(i);
        SpannableString spannableString = new SpannableString(c20699.f63912);
        spannableString.setSpan(new BackgroundColorSpan(C23223.f72969 & (-1593835521)), c20699.f63906, c20699.f63907, 33);
        viewOnClickListenerC10008.f27691.setText(spannableString);
        viewOnClickListenerC10008.f27694 = c7287M5675;
        viewOnClickListenerC10008.f27692 = c20699;
        viewOnClickListenerC10008.f27693 = i;
        TextPaint paint = viewOnClickListenerC10008.f27691.getPaint();
        if (c7996.f21016 == null || c7996.f21016.m47134(str)) {
            if (((C3263) c7996.f21012.peek()).f6342.contains(str + " " + i)) {
                viewOnClickListenerC10008.f27691.setTextColor(C23223.f72984);
                viewOnClickListenerC10008.f27691.setAlpha(0.8f);
            } else {
                viewOnClickListenerC10008.f27691.setTextColor(C23223.f72986);
                viewOnClickListenerC10008.f27691.setAlpha(1.0f);
            }
            paint.setFlags(paint.getFlags() & (-17));
            return;
        }
        viewOnClickListenerC10008.f27691.setTextColor(C23223.f72984);
        viewOnClickListenerC10008.f27691.setAlpha(1.0f);
        paint.setFlags(paint.getFlags() | 16);
    }

    @Override // p067l.InterfaceC19840
    /* JADX INFO: renamed from: ֫ */
    public final void mo27514(String str, ImageView imageView, TextView textView) {
        TextPaint paint = textView.getPaint();
        C7996 c7996 = this.f33501;
        if (c7996.f21016 == null || c7996.f21016.m47134(str)) {
            if (((C3263) c7996.f21012.peek()).f6342.contains(str)) {
                textView.setTextColor(C23223.f72984);
                textView.setAlpha(0.8f);
            } else {
                textView.setTextColor(C23223.f72986);
                textView.setAlpha(1.0f);
            }
            paint.setFlags(paint.getFlags() & (-17));
            return;
        }
        textView.setTextColor(C23223.f72984);
        textView.setAlpha(1.0f);
        paint.setFlags(paint.getFlags() | 16);
    }
}
