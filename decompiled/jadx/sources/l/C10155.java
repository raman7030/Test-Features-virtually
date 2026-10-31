package l;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes4.dex */
public final class C10155 extends C13876 implements InterfaceC18383 {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public int f30537;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f30538;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5921 f30539;

    @Override // l.C13876
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean mo25497() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10155(C5921 c5921) {
        super(C13876.m33247("<>"));
        this.f30539 = c5921;
        this.f30538 = C11266.m27878(17.0f);
        this.f30537 = C11266.m27878(20.0f);
        m33262((InterfaceC18383) this);
    }

    @Override // l.C13876
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo25493(int i) {
        return i == 0 ? this.f30537 : this.f41370 * i;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private int m25492() {
        C5921 c5921 = this.f30539;
        if (c5921.f18158.isEmpty()) {
            return 1;
        }
        int i = ((C0941) c5921.f18158.peek()).m3358() > 0 ? 3 : 1;
        if (c5921.f18158.size() >= 2) {
            i++;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m25498() {
        int iM25492 = m25492();
        if (iM25492 <= 2) {
            notifyDataSetChanged();
        } else {
            notifyItemRangeChanged(0, iM25492 + 2);
        }
    }

    @Override // l.C13876, l.AbstractC19902
    public final int getItemCount() {
        if (this.f30539.f18158.isEmpty()) {
            return 2;
        }
        return m25492() + 2 + super.getItemCount();
    }

    @Override // l.C13876, l.AbstractC19902
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int iM25492 = m25492();
        if (i2 < iM25492) {
            return 2;
        }
        int i3 = i2 - iM25492;
        if (i3 == 0) {
            return 1;
        }
        return super.getItemViewType(i3 - 1);
    }

    @Override // l.C13876, l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C15092(C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 1) {
            return new C15092(C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false));
        }
        if (i != 2) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        return new ViewOnClickListenerC3099(this.f30539, C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.C13876, l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        int i2;
        if (i == 0) {
            ((C15092) abstractC3255).f46096.setText(R.string.MT_Protector);
            return;
        }
        int i3 = -1;
        int i4 = i - 1;
        int iM25492 = m25492();
        C5921 c5921 = this.f30539;
        if (i4 >= iM25492) {
            int i5 = i4 - iM25492;
            if (i5 != 0) {
                super.onBindViewHolder(abstractC3255, i5 - 1);
                return;
            }
            C15092 c15092 = (C15092) abstractC3255;
            C0941 c0941 = (C0941) c5921.f18158.peek();
            c15092.f46096.setText(c5921.getString(R.string.MT_Protector, Integer.valueOf(c0941.m3358())) + " - " + c0941.m3360());
            c15092.f46095.setOnClickListener(new View.OnClickListener() { // from class: l.۬۟᩷
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final C10155 c10155 = this.f38880;
                    C21282 c21282 = new C21282(c10155.f30539.requireContext(), view, 0);
                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c21282.m48302(new InterfaceC14930() { // from class: l.۫۟᩷
                        @Override // l.InterfaceC14930
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            C5921 c5922 = c10155.f30539;
                            int itemId = menuItem.getItemId();
                            if (itemId == R.string.MT_Protector) {
                                c5922.f18161.m33275();
                                return true;
                            }
                            if (itemId == R.string.MT_Protector) {
                                c5922.f18161.m33264(true);
                                return true;
                            }
                            if (itemId == R.string.MT_Protector) {
                                c5922.f18161.m33275();
                                c5922.f18161.m33264(false);
                            }
                            return true;
                        }
                    });
                    c21282.m48305();
                }
            });
            return;
        }
        ViewOnClickListenerC3099 viewOnClickListenerC3099 = (ViewOnClickListenerC3099) abstractC3255;
        int[] iArr = new int[5];
        iArr[0] = 0;
        iArr[1] = -1;
        iArr[2] = -1;
        iArr[3] = -1;
        iArr[4] = -1;
        if (!c5921.f18158.isEmpty()) {
            if (((C0941) c5921.f18158.peek()).m3358() > 0) {
                iArr[1] = 1;
                iArr[2] = 2;
                i2 = 3;
            } else {
                i2 = 1;
            }
            if (c5921.f18158.size() >= 2) {
                iArr[i2] = 3;
                i2++;
            }
            iArr[i2] = 4;
        }
        if (i4 >= 0 && i4 < 5) {
            i3 = iArr[i4];
        }
        viewOnClickListenerC3099.f9696 = i3;
        TextView textView = viewOnClickListenerC3099.f9693;
        ImageView imageView = viewOnClickListenerC3099.f9695;
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
                throw new RuntimeException(C19370.m44628(i3, "MenuType = "));
            }
            imageView.setImageResource(R.drawable.MT_Protector);
            textView.setText(R.string.MT_Protector);
        }
    }

    @Override // l.C13876
    /* JADX INFO: renamed from: ۜ */
    public final int mo15999() {
        return m25492() + 2;
    }

    @Override // l.C13876
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo25499(String str) {
        C5175 c5175M3356 = ((C0941) this.f30539.f18158.peek()).m3356(str);
        if (c5175M3356 == null) {
            return 0;
        }
        return c5175M3356.f16179.size();
    }

    @Override // l.C13876
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC3255 mo25494(ViewGroup viewGroup) {
        C5921 c5921 = this.f30539;
        View viewInflate = LayoutInflater.from(c5921.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewInflate.getLayoutParams();
        marginLayoutParams.leftMargin = this.f41370 + this.f30538;
        viewInflate.setLayoutParams(marginLayoutParams);
        return new ViewOnClickListenerC8038(c5921, viewInflate);
    }

    @Override // l.C13876
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo25496(AbstractC3255 abstractC3255, String str, int i) {
        ViewOnClickListenerC8038 viewOnClickListenerC8038 = (ViewOnClickListenerC8038) abstractC3255;
        C5921 c5921 = this.f30539;
        C5175 c5175M3356 = ((C0941) c5921.f18158.peek()).m3356(str);
        C19287 c19287 = (C19287) c5175M3356.f16179.get(i);
        SpannableString spannableString = new SpannableString(c19287.f60682);
        spannableString.setSpan(new BackgroundColorSpan(C21943.f70257 & (-1593835521)), c19287.f60676, c19287.f60677, 33);
        viewOnClickListenerC8038.f24777.setText(spannableString);
        viewOnClickListenerC8038.f24780 = c5175M3356;
        viewOnClickListenerC8038.f24778 = c19287;
        viewOnClickListenerC8038.f24779 = i;
        TextPaint paint = viewOnClickListenerC8038.f24777.getPaint();
        if (c5921.f18162 == null || c5921.f18162.m44838(str)) {
            if (((C0941) c5921.f18158.peek()).f3565.contains(str + " " + i)) {
                viewOnClickListenerC8038.f24777.setTextColor(C21943.f70273);
                viewOnClickListenerC8038.f24777.setAlpha(0.8f);
            } else {
                viewOnClickListenerC8038.f24777.setTextColor(C21943.f70275);
                viewOnClickListenerC8038.f24777.setAlpha(1.0f);
            }
            paint.setFlags(paint.getFlags() & (-17));
            return;
        }
        viewOnClickListenerC8038.f24777.setTextColor(C21943.f70273);
        viewOnClickListenerC8038.f24777.setAlpha(1.0f);
        paint.setFlags(paint.getFlags() | 16);
    }

    @Override // l.InterfaceC18383
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo25495(String str, ImageView imageView, TextView textView) {
        TextPaint paint = textView.getPaint();
        C5921 c5921 = this.f30539;
        if (c5921.f18162 == null || c5921.f18162.m44838(str)) {
            if (((C0941) c5921.f18158.peek()).f3565.contains(str)) {
                textView.setTextColor(C21943.f70273);
                textView.setAlpha(0.8f);
            } else {
                textView.setTextColor(C21943.f70275);
                textView.setAlpha(1.0f);
            }
            paint.setFlags(paint.getFlags() & (-17));
            return;
        }
        textView.setTextColor(C21943.f70273);
        textView.setAlpha(1.0f);
        paint.setFlags(paint.getFlags() | 16);
    }
}
