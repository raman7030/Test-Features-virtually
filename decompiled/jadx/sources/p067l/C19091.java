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

/* JADX INFO: renamed from: l.ܿ᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes5.dex */
public final class C19091 extends C15556 implements InterfaceC19840 {

    /* JADX INFO: renamed from: ܺ֫ */
    public final /* synthetic */ C16408 f56960;

    /* JADX INFO: renamed from: ۡ֫ */
    public int f56959 = C13076.m29939(17.0f);

    /* JADX INFO: renamed from: ۖ֫ */
    public int f56958 = C13076.m29939(20.0f);

    @Override // p067l.C15556
    /* JADX INFO: renamed from: ۘ */
    public final boolean mo27516() {
        return true;
    }

    public C19091(C16408 c16408) {
        this.f56960 = c16408;
        m35381((InterfaceC19840) this);
    }

    @Override // p067l.C15556
    /* JADX INFO: renamed from: ֫ */
    public final int mo27512(int i) {
        return i == 0 ? this.f56958 : this.f44451 * i;
    }

    /* JADX INFO: renamed from: ֨ */
    private int m43368() {
        C16408 c16408 = this.f56960;
        if (c16408.f48226.isEmpty()) {
            return 1;
        }
        int i = ((C3263) c16408.f48226.peek()).m5677() > 0 ? 3 : 1;
        if (c16408.f48226.size() >= 2) {
            i++;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: ۚ */
    public final void m43370() {
        int iM43368 = m43368();
        if (iM43368 <= 2) {
            notifyDataSetChanged();
        } else {
            notifyItemRangeChanged(0, iM43368 + 2);
        }
    }

    @Override // p067l.C15556, p067l.AbstractC21283
    public final int getItemCount() {
        if (this.f56960.f48226.isEmpty()) {
            return 2;
        }
        return m43368() + 2 + super.getItemCount();
    }

    @Override // p067l.C15556, p067l.AbstractC21283
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int iM43368 = m43368();
        if (i2 < iM43368) {
            return 2;
        }
        int i3 = i2 - iM43368;
        if (i3 == 0) {
            return 1;
        }
        return super.getItemViewType(i3 - 1);
    }

    @Override // p067l.C15556, p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C13333(C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 1) {
            return new C13333(C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false));
        }
        if (i != 2) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        return new ViewOnClickListenerC13057(this.f56960, C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.C15556, p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        int i2;
        if (i == 0) {
            ((C13333) abstractC5462).f37445.setText(R.string.MT_Protector);
            return;
        }
        int i3 = -1;
        int i4 = i - 1;
        int iM43368 = m43368();
        C16408 c16408 = this.f56960;
        if (i4 >= iM43368) {
            int i5 = i4 - iM43368;
            if (i5 != 0) {
                super.onBindViewHolder(abstractC5462, i5 - 1);
                return;
            }
            C13333 c13333 = (C13333) abstractC5462;
            final C3263 c3263 = (C3263) c16408.f48226.peek();
            c13333.f37445.setText(c16408.getString(R.string.MT_Protector, Integer.valueOf(c3263.m5677())) + " - " + C8597.m20011(300, c3263.m5679()));
            c13333.f37444.setOnClickListener(new View.OnClickListener() { // from class: l.ܽ᩷ۢ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final C19091 c19091 = this.f55028;
                    C1898 c1898 = new C1898(c19091.f56960.requireContext(), view, 0);
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    final C3263 c3264 = c3263;
                    c1898.m50636(new InterfaceC1583() { // from class: l.ᩳ᩷ۢ
                        @Override // p067l.InterfaceC1583
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            C19091.m43369(c19091, c3264, menuItem);
                            return true;
                        }
                    });
                    c1898.m50639();
                }
            });
            return;
        }
        ViewOnClickListenerC13057 viewOnClickListenerC13057 = (ViewOnClickListenerC13057) abstractC5462;
        int[] iArr = new int[5];
        iArr[0] = 0;
        iArr[1] = -1;
        iArr[2] = -1;
        iArr[3] = -1;
        iArr[4] = -1;
        if (!c16408.f48226.isEmpty()) {
            if (((C3263) c16408.f48226.peek()).m5677() > 0) {
                iArr[1] = 1;
                iArr[2] = 2;
                i2 = 3;
            } else {
                i2 = 1;
            }
            if (c16408.f48226.size() >= 2) {
                iArr[i2] = 3;
                i2++;
            }
            iArr[i2] = 4;
        }
        if (i4 >= 0 && i4 < 5) {
            i3 = iArr[i4];
        }
        viewOnClickListenerC13057.f36715 = i3;
        TextView textView = viewOnClickListenerC13057.f36712;
        ImageView imageView = viewOnClickListenerC13057.f36714;
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

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m43369(C19091 c19091, C3263 c3263, MenuItem menuItem) {
        C16408 c16408 = c19091.f56960;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            c16408.f48229.m35394();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c16408.f48229.m35383(true);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c16408.f48229.m35394();
            c16408.f48229.m35383(false);
        } else if (itemId == R.string.MT_Protector) {
            C7050.m16211((CharSequence) C7480.stream(c3263.m5674()).sorted().map(new C5631(1)).collect(C24205.joining("\n")));
        }
    }

    @Override // p067l.C15556
    /* JADX INFO: renamed from: ۜ */
    public final int mo17934() {
        return m43368() + 2;
    }

    @Override // p067l.C15556
    /* JADX INFO: renamed from: ۧ */
    public final int mo27518(String str) {
        C7287 c7287M5675 = ((C3263) this.f56960.f48226.peek()).m5675(str);
        if (c7287M5675 == null) {
            return 0;
        }
        return c7287M5675.f19020.size();
    }

    @Override // p067l.C15556
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5462 mo27513(ViewGroup viewGroup) {
        C16408 c16408 = this.f56960;
        View viewInflate = LayoutInflater.from(c16408.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewInflate.getLayoutParams();
        marginLayoutParams.leftMargin = this.f44451 + this.f56959;
        viewInflate.setLayoutParams(marginLayoutParams);
        return new ViewOnClickListenerC7968(c16408, viewInflate);
    }

    @Override // p067l.C15556
    /* JADX INFO: renamed from: ֫ */
    public final void mo27515(AbstractC5462 abstractC5462, String str, int i) {
        ViewOnClickListenerC7968 viewOnClickListenerC7968 = (ViewOnClickListenerC7968) abstractC5462;
        C16408 c16408 = this.f56960;
        C7287 c7287M5675 = ((C3263) c16408.f48226.peek()).m5675(str);
        C20699 c20699 = (C20699) c7287M5675.f19020.get(i);
        SpannableString spannableString = new SpannableString(c20699.f63912);
        spannableString.setSpan(new BackgroundColorSpan(C23223.f72969 & (-1593835521)), c20699.f63906, c20699.f63907, 33);
        viewOnClickListenerC7968.f20945.setText(spannableString);
        viewOnClickListenerC7968.f20947 = c7287M5675;
        viewOnClickListenerC7968.f20946 = c20699;
        viewOnClickListenerC7968.f20948 = i;
        TextPaint paint = viewOnClickListenerC7968.f20945.getPaint();
        if (c16408.f48224 == null || c16408.f48224.m32119(str)) {
            if (((C3263) c16408.f48226.peek()).f6342.contains(str + " " + i)) {
                viewOnClickListenerC7968.f20945.setTextColor(C23223.f72984);
                viewOnClickListenerC7968.f20945.setAlpha(0.8f);
            } else {
                viewOnClickListenerC7968.f20945.setTextColor(C23223.f72986);
                viewOnClickListenerC7968.f20945.setAlpha(1.0f);
            }
            paint.setFlags(paint.getFlags() & (-17));
            return;
        }
        viewOnClickListenerC7968.f20945.setTextColor(C23223.f72984);
        viewOnClickListenerC7968.f20945.setAlpha(1.0f);
        paint.setFlags(paint.getFlags() | 16);
    }

    @Override // p067l.InterfaceC19840
    /* JADX INFO: renamed from: ֫ */
    public final void mo27514(String str, ImageView imageView, TextView textView) {
        TextPaint paint = textView.getPaint();
        C16408 c16408 = this.f56960;
        if (c16408.f48224 == null || c16408.f48224.m32119(str)) {
            if (((C3263) c16408.f48226.peek()).f6342.contains(str)) {
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
