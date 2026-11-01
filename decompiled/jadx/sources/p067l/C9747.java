package p067l;

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
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9747 extends BaseAdapter {

    /* JADX INFO: renamed from: ۗ */
    public Bitmap f26911;

    /* JADX INFO: renamed from: ۙ */
    public Bitmap f26912;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ ActivityC22429 f26913;

    /* JADX INFO: renamed from: ۫ */
    public Bitmap f26914;

    /* JADX INFO: renamed from: ۬ */
    public Bitmap f26915;

    /* JADX INFO: renamed from: ᩶ */
    public Bitmap f26916;

    /* JADX INFO: renamed from: ᩸ */
    public Bitmap f26917;

    /* JADX INFO: renamed from: ᩹ */
    public Bitmap f26918;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C9747(ActivityC22429 activityC22429) {
        this.f26913 = activityC22429;
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        int iM29939 = C13076.m29939(32.0f);
        int iM299310 = C13076.m29939(16.0f);
        int iM299311 = C13076.m29939(15.0f);
        paint.setStyle(Paint.Style.FILL);
        if (C23223.f72981) {
            paint.setShadowLayer(2.5f, 1.0f, 1.0f, 1342177280);
        }
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(Typeface.MONOSPACE);
        paint2.setTextSize(C13076.m29941(20.0f));
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        float f = fontMetrics.bottom;
        float f2 = fontMetrics.top;
        float f3 = iM299311;
        float f4 = (f3 - f2) - ((f - f2) / 2.0f);
        String[] strArr = {"C", "S", "I", "F", "M", "J"};
        Bitmap[] bitmapArr = new Bitmap[6];
        int i = 0;
        for (int i2 = 6; i < i2; i2 = 6) {
            paint.setColor(activityC22429.f70772[i].mo9511());
            paint2.setColor(activityC22429.f70772[i].mo9512());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM29939, iM29939, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            float f5 = iM299310;
            canvas.drawCircle(f5, f5, f3, paint);
            canvas.drawText(strArr[i], f5, f4, paint2);
            bitmapArr[i] = bitmapCreateBitmap;
            i++;
        }
        this.f26917 = bitmapArr[0];
        this.f26914 = bitmapArr[1];
        this.f26918 = bitmapArr[2];
        this.f26916 = bitmapArr[3];
        this.f26915 = bitmapArr[4];
        this.f26911 = bitmapArr[5];
        AbstractC22606 abstractC22606 = C21265.f66820;
        paint.setColor(abstractC22606.mo9511());
        this.f26912 = Bitmap.createBitmap(iM29939, iM29939, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(this.f26912);
        float f6 = iM299310;
        canvas2.drawCircle(f6, f6, f3, paint);
        Drawable drawableM16202 = C7050.m16202(R.drawable.MT_Protector);
        int i3 = (iM29939 - iM299310) / 2;
        int i4 = iM299310 + i3;
        drawableM16202.setBounds(i3, i3, i4, i4);
        drawableM16202.setTint(abstractC22606.mo9512());
        drawableM16202.draw(canvas2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ActivityC22429 activityC22429 = this.f26913;
        switch (C17122.f50583[activityC22429.f70775.m44881().ordinal()]) {
            case 1:
                return 2;
            case 2:
                if (activityC22429.f70775.f60060 == null) {
                    return 0;
                }
                return activityC22429.f70775.f60060.f80355.size() + activityC22429.f70775.f60060.f80354.size();
            case 3:
                return ((C2981) activityC22429.f70775.f60063.peek()).f5264.size();
            case 4:
                return 4;
            case 5:
                return activityC22429.f70775.f60067.size() + activityC22429.f70775.f60069.size();
            case 6:
                return ((C2981) activityC22429.f70775.f60071.peek()).f5264.size();
            case 7:
                boolean z = activityC22429.f70775.f60047;
                C19746 c19746 = activityC22429.f70775;
                return z ? c19746.f60062 : c19746.f60056.length;
            case 8:
                return activityC22429.f70775.f60052.size() + activityC22429.f70775.f60053.size();
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ActivityC22429 activityC22429 = this.f26913;
        View view2 = view;
        if (view == null) {
            View viewInflate = activityC22429.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
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
        switch (C17122.f50583[activityC22429.f70775.m44881().ordinal()]) {
            case 1:
                if (i == 0) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f26917);
                } else if (i == 1) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f26914);
                    return view2;
                }
                return view2;
            case 2:
                if (i < activityC22429.f70775.f60060.f80354.size()) {
                    textView.setText(((C25110) activityC22429.f70775.f60060.f80354.get(i)).f80353);
                    imageView.setImageBitmap(this.f26912);
                    return view2;
                }
                textView.setText((CharSequence) activityC22429.f70775.f60060.f80355.get(i - activityC22429.f70775.f60060.f80354.size()));
                imageView.setImageBitmap(this.f26917);
                return view2;
            case 3:
                String strM53168 = ((C13068) ((C2981) activityC22429.f70775.f60063.peek()).f5264.get(i)).m29923().m53168();
                textView.setText(strM53168.substring(1, strM53168.length() - 1));
                imageView.setImageBitmap(this.f26917);
                return view2;
            case 4:
                if (i == 0) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f26918);
                    return view2;
                }
                if (i == 1) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f26916);
                    return view2;
                }
                if (i == 2) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f26915);
                    return view2;
                }
                if (i == 3) {
                    textView.setText(R.string.MT_Protector);
                    imageView.setImageBitmap(this.f26911);
                    return view2;
                }
                return view2;
            case 5:
                textView2.setVisibility(0);
                if (i >= activityC22429.f70775.f60069.size()) {
                    arrayList = activityC22429.f70775.f60067;
                    i -= activityC22429.f70775.f60069.size();
                } else {
                    arrayList = activityC22429.f70775.f60069;
                }
                C15568 c15568 = (C15568) arrayList.get(i);
                textView.setText(c15568.f44483.f73398.m30317());
                textView2.setText(c15568.f44483.f73397.m33398());
                imageView.setImageBitmap(this.f26915);
                return view2;
            case 6:
                textView2.setVisibility(0);
                C15568 c15569 = (C15568) ((C2981) activityC22429.f70775.f60071.peek()).f5264.get(i);
                textView.setText(c15569.f44483.f73398.m30317());
                textView2.setText(c15569.f44483.f73397.m33398());
                imageView.setImageBitmap(this.f26915);
                return view2;
            case 7:
                C13266[] c13266Arr = activityC22429.f70775.f60056;
                if (activityC22429.f70775.f60047) {
                    i = activityC22429.f70775.f60070[i];
                }
                textView.setText(c13266Arr[i].m30317());
                imageView.setVisibility(8);
                return view2;
            case 8:
                textView2.setVisibility(0);
                if (i >= activityC22429.f70775.f60053.size()) {
                    arrayList2 = activityC22429.f70775.f60052;
                    i -= activityC22429.f70775.f60053.size();
                } else {
                    arrayList2 = activityC22429.f70775.f60053;
                }
                C24286 c24286 = (C24286) arrayList2.get(i);
                textView.setText(c24286.f76932.f60619.m30317());
                textView2.setText(c24286.f76932.f60618.m53168());
                imageView.setImageBitmap(this.f26916);
                return view2;
            default:
                return view2;
        }
    }
}
