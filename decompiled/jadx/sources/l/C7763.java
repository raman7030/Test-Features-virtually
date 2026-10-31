package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7763 extends BaseAdapter {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Bitmap f23997;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Bitmap f23998;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f23999;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Bitmap f24000;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Bitmap f24001;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Bitmap f24002;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Bitmap f24003;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Bitmap f24004;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C7763(ActivityC21107 activityC21107) {
        this.f23999 = activityC21107;
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        int iM27878 = C11266.m27878(32.0f);
        int iM27879 = C11266.m27878(16.0f);
        int iM278710 = C11266.m27878(15.0f);
        paint.setStyle(Paint.Style.FILL);
        if (C21943.f70270) {
            paint.setShadowLayer(2.5f, 1.0f, 1.0f, 1342177280);
        }
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(Typeface.MONOSPACE);
        paint2.setTextSize(C11266.m27880(20.0f));
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        float f = fontMetrics.bottom;
        float f2 = fontMetrics.top;
        float f3 = iM278710;
        float f4 = (f3 - f2) - ((f - f2) / 2.0f);
        String[] strArr = {"C", "S", "I", "F", "M", "J"};
        Bitmap[] bitmapArr = new Bitmap[6];
        int i = 0;
        for (int i2 = 6; i < i2; i2 = 6) {
            paint.setColor(activityC21107.f68090[i].mo7429());
            paint2.setColor(activityC21107.f68090[i].mo7430());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM27878, iM27878, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            float f5 = iM27879;
            canvas.drawCircle(f5, f5, f3, paint);
            canvas.drawText(strArr[i], f5, f4, paint2);
            bitmapArr[i] = bitmapCreateBitmap;
            i++;
        }
        this.f24003 = bitmapArr[0];
        this.f24000 = bitmapArr[1];
        this.f24004 = bitmapArr[2];
        this.f24002 = bitmapArr[3];
        this.f24001 = bitmapArr[4];
        this.f23997 = bitmapArr[5];
        AbstractC21294 abstractC21294 = C19883.f64184;
        paint.setColor(abstractC21294.mo7429());
        this.f23998 = Bitmap.createBitmap(iM27878, iM27878, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(this.f23998);
        float f6 = iM27879;
        canvas2.drawCircle(f6, f6, f3, paint);
        Drawable drawableM14305 = C4925.m14305(R.drawable.MT_Protector);
        int i3 = (iM27878 - iM27879) / 2;
        int i4 = iM27879 + i3;
        drawableM14305.setBounds(i3, i3, i4, i4);
        drawableM14305.setTint(abstractC21294.mo7430());
        drawableM14305.draw(canvas2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ActivityC21107 activityC21107 = this.f23999;
        switch (C15523.f47451[activityC21107.f68093.m42621().ordinal()]) {
            case 1:
                return 2;
            case 2:
                if (activityC21107.f68093.f56843 == null) {
                    return 0;
                }
                return activityC21107.f68093.f56843.f77604.size() + activityC21107.f68093.f56843.f77603.size();
            case 3:
                return ((C0644) activityC21107.f68093.f56846.peek()).f2492.size();
            case 4:
                return 4;
            case 5:
                return activityC21107.f68093.f56850.size() + activityC21107.f68093.f56852.size();
            case 6:
                return ((C0644) activityC21107.f68093.f56854.peek()).f2492.size();
            case 7:
                boolean z = activityC21107.f68093.f56830;
                C18284 c18284 = activityC21107.f68093;
                return z ? c18284.f56845 : c18284.f56839.length;
            case 8:
                return activityC21107.f68093.f56835.size() + activityC21107.f68093.f56836.size();
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ActivityC21107 activityC21107 = this.f23999;
        View view2 = view;
        if (view == null) {
            View viewInflate = activityC21107.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            View viewFindViewById = viewInflate.findViewById(R.id.textView1);
            viewInflate.setTag(viewFindViewById);
            View viewFindViewById2 = viewInflate.findViewById(R.id.icon);
            viewFindViewById.setTag(viewFindViewById2);
            viewFindViewById2.setTag(viewInflate.findViewById(R.id.textView2));
            view2 = viewInflate;
        }
        TextView textView = (TextView) view2.getTag();
        ImageView imageView = (ImageView) textView.getTag();
        TextView textView2 = (TextView) imageView.getTag();
        imageView.setVisibility(0);
        textView2.setVisibility(8);
        switch (C15523.f47451[activityC21107.f68093.m42621().ordinal()]) {
            case 1:
                if (i == 0) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f24003);
                } else if (i == 1) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f24000);
                    return view2;
                }
                return view2;
            case 2:
                if (i < activityC21107.f68093.f56843.f77603.size()) {
                    textView.setText(((C23928) activityC21107.f68093.f56843.f77603.get(i)).f77602);
                    imageView.setImageBitmap(this.f23998);
                    return view2;
                }
                textView.setText((CharSequence) activityC21107.f68093.f56843.f77604.get(i - activityC21107.f68093.f56843.f77603.size()));
                imageView.setImageBitmap(this.f24003);
                return view2;
            case 3:
                String strM50835 = ((C11258) ((C0644) activityC21107.f68093.f56846.peek()).f2492.get(i)).m27862().m50835();
                textView.setText(strM50835.substring(1, strM50835.length() - 1));
                imageView.setImageBitmap(this.f24003);
                return view2;
            case 4:
                if (i == 0) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f24004);
                    return view2;
                }
                if (i == 1) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f24002);
                    return view2;
                }
                if (i == 2) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f24001);
                    return view2;
                }
                if (i == 3) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f23997);
                    return view2;
                }
                return view2;
            case 5:
                textView2.setVisibility(0);
                if (i >= activityC21107.f68093.f56852.size()) {
                    arrayList = activityC21107.f68093.f56850;
                    i -= activityC21107.f68093.f56852.size();
                } else {
                    arrayList = activityC21107.f68093.f56852;
                }
                C13889 c13889 = (C13889) arrayList.get(i);
                textView.setText(c13889.f41402.f70681.m28273());
                textView2.setText(c13889.f41402.f70680.m31312());
                imageView.setImageBitmap(this.f24001);
                return view2;
            case 6:
                textView2.setVisibility(0);
                C13889 c138810 = (C13889) ((C0644) activityC21107.f68093.f56854.peek()).f2492.get(i);
                textView.setText(c138810.f41402.f70681.m28273());
                textView2.setText(c138810.f41402.f70680.m31312());
                imageView.setImageBitmap(this.f24001);
                return view2;
            case 7:
                C11467[] c11467Arr = activityC21107.f68093.f56839;
                if (activityC21107.f68093.f56830) {
                    i = activityC21107.f68093.f56853[i];
                }
                textView.setText(c11467Arr[i].m28273());
                imageView.setVisibility(8);
                return view2;
            case 8:
                textView2.setVisibility(0);
                if (i >= activityC21107.f68093.f56836.size()) {
                    arrayList2 = activityC21107.f68093.f56835;
                    i -= activityC21107.f68093.f56836.size();
                } else {
                    arrayList2 = activityC21107.f68093.f56836;
                }
                C23062 c23062 = (C23062) arrayList2.get(i);
                textView.setText(c23062.f74187.f57398.m28273());
                textView2.setText(c23062.f74187.f57397.m50835());
                imageView.setImageBitmap(this.f24002);
                return view2;
            default:
                return view2;
        }
    }
}
