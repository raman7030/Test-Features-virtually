package p067l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 19LE */
/* JADX INFO: loaded from: classes3.dex */
public final class C11193 {

    /* JADX INFO: renamed from: ֫ */
    public Bitmap f31074;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f31075 = new ArrayList();

    public C11193(byte[] bArr) throws IOException {
        m25827(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        this.f31074 = bitmapDecodeByteArray;
        if (bitmapDecodeByteArray == null) {
            throw new IOException("Decode bitmap failed");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m25827(byte[] bArr) throws IOException {
        C14677 c14677 = new C14677(bArr);
        C23395.m52060((InterfaceC21384) c14677, 1196314761);
        C23395.m52060((InterfaceC21384) c14677, 169478669);
        boolean z = false;
        while (c14677.available() > 0) {
            int iM33579 = c14677.m33579();
            C15885 c15885 = new C15885();
            c15885.f45988 = c14677.readInt();
            byte[] bArr2 = new byte[iM33579];
            c14677.m33576(iM33579, bArr2);
            c15885.f45987 = bArr2;
            c15885.f45986 = c14677.m33579();
            this.f31075.add(c15885);
            if (c15885.f45988 == 1413563465) {
                z = true;
            }
        }
        if (!z) {
            throw new IOException("Data chunk not found");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte[] m25832() {
        ArrayList<C15885> arrayList = this.f31075;
        Iterator it = arrayList.iterator();
        int length = 8;
        while (it.hasNext()) {
            length += ((C15885) it.next()).f45987.length + 12;
        }
        C11996 c11996 = new C11996(length);
        c11996.writeInt(1196314761);
        c11996.writeInt(169478669);
        for (C15885 c15885 : arrayList) {
            c11996.m27450(c15885.f45987.length);
            c11996.writeInt(c15885.f45988);
            c11996.write(c15885.f45987);
            c11996.m27450(c15885.f45986);
        }
        return c11996.m27458();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25828(BufferedOutputStream bufferedOutputStream) {
        int width = this.f31074.getWidth();
        int height = this.f31074.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width + 2, height + 2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(false);
        paint.setFilterBitmap(false);
        canvas.drawBitmap(this.f31074, 1.0f, 1.0f, paint);
        canvas.translate(1.0f, 1.0f);
        C14020 c14020M25836 = m25836();
        if (c14020M25836 != null) {
            Rect rect = c14020M25836.f39536;
            ArrayList<C6644> arrayList = c14020M25836.f39538;
            ArrayList<C6644> arrayList2 = c14020M25836.f39537;
            paint.setColor(-16777216);
            for (C6644 c6644 : arrayList2) {
                canvas.drawRect(c6644.f17145, -1.0f, c6644.f17144, 0.0f, paint);
            }
            for (C6644 c6645 : arrayList) {
                canvas.drawRect(-1.0f, c6645.f17145, 0.0f, c6645.f17144, paint);
            }
            if (!rect.equals(C14020.m31815(arrayList2, arrayList, width, height))) {
                canvas.drawRect(rect.left, height, width - rect.right, height + 1, paint);
                canvas.drawRect(width, rect.top, width + 1, height - rect.bottom, paint);
            }
        }
        C18568 c18568M25835 = m25835();
        if (c18568M25835 != null) {
            paint.setColor(-65536);
            float f = height;
            float f2 = height + 1;
            canvas.drawRect(0.0f, f, c18568M25835.f55416, f2, paint);
            float f3 = width;
            canvas.drawRect(width - c18568M25835.f55417, f, f3, f2, paint);
            float f4 = width + 1;
            canvas.drawRect(f3, 0.0f, f4, c18568M25835.f55418, paint);
            canvas.drawRect(f3, height - c18568M25835.f55418, f4, f, paint);
        }
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C14020 m25836() {
        for (C15885 c15885 : this.f31075) {
            if (c15885.f45988 == 1666478190) {
                C14020 c14020 = new C14020();
                C14677 c14677 = new C14677(c15885.f45987);
                c14677.skipBytes(1);
                byte b = c14677.readByte();
                byte b2 = c14677.readByte();
                int i = c14677.readByte();
                int i2 = c14677.readInt();
                int i3 = c14677.readInt();
                Rect rect = c14020.f39536;
                rect.left = c14677.m33579();
                rect.right = c14677.m33579();
                rect.top = c14677.m33579();
                rect.bottom = c14677.m33579();
                int i4 = c14677.readInt();
                c14677.seek(i2);
                for (int i5 = b / 2; i5 > 0; i5--) {
                    c14020.f39537.add(new C6644(c14677.m33579(), c14677.m33579()));
                }
                c14677.seek(i3);
                for (int i6 = b2 / 2; i6 > 0; i6--) {
                    c14020.f39538.add(new C6644(c14677.m33579(), c14677.m33579()));
                }
                c14677.seek(i4);
                c14020.f39535 = new int[i];
                for (byte b3 = 0; b3 < i; b3 = (byte) (b3 + 1)) {
                    c14020.f39535[b3] = c14677.m33579();
                }
                c14020.m31818(this.f31074);
                return c14020;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25829(C14020 c14020) {
        c14020.m31818(this.f31074);
        c14020.m31820(this.f31074);
        ArrayList<C15885> arrayList = this.f31075;
        for (C15885 c15885 : arrayList) {
            if (c15885.f45988 == 1666478190) {
                c15885.f45987 = c14020.m31819();
                c15885.m36014();
                return;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C15885) arrayList.get(i)).f45988 == 1413563465) {
                C15885 c15886 = new C15885();
                c15886.f45988 = 1666478190;
                c15886.f45987 = c14020.m31819();
                c15886.m36014();
                arrayList.add(i, c15886);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final C18568 m25835() {
        for (C15885 c15885 : this.f31075) {
            if (c15885.f45988 == 1649176686) {
                C18568 c18568 = new C18568();
                C14677 c14677 = new C14677(c15885.f45987);
                c18568.f55416 = c14677.readInt();
                c18568.f55418 = c14677.readInt();
                c18568.f55417 = c14677.readInt();
                c18568.f55415 = c14677.readInt();
                return c18568;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25830(C18568 c18568) {
        ArrayList<C15885> arrayList = this.f31075;
        if (c18568 == null) {
            C7480.removeIf(arrayList, new C21922(0));
            return;
        }
        for (C15885 c15885 : arrayList) {
            if (c15885.f45988 == 1649176686) {
                c15885.f45987 = c18568.m42257();
                c15885.m36014();
                return;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C15885) arrayList.get(i)).f45988 == 1413563465) {
                C15885 c15886 = new C15885();
                c15886.f45988 = 1649176686;
                c15886.f45987 = c18568.m42257();
                c15886.m36014();
                arrayList.add(i, c15886);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m25833() {
        Iterator it = this.f31075.iterator();
        while (it.hasNext()) {
            if (((C15885) it.next()).f45988 == 1666478190) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m25831() {
        int i;
        ArrayList arrayList = this.f31075;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C15885) it.next()).f45988 == 1666478190) {
                return false;
            }
        }
        int width = this.f31074.getWidth();
        int height = this.f31074.getHeight();
        if (width >= 3 && height >= 3 && Color.alpha(this.f31074.getPixel(0, 0)) == 0) {
            int i2 = height - 1;
            if (Color.alpha(this.f31074.getPixel(0, i2)) == 0) {
                int i3 = width - 1;
                if (Color.alpha(this.f31074.getPixel(i3, 0)) == 0 && Color.alpha(this.f31074.getPixel(i3, i2)) == 0) {
                    int i4 = width - 2;
                    int[] iArr = new int[i4];
                    int i5 = height - 2;
                    int[] iArr2 = new int[i5];
                    int i6 = i4;
                    this.f31074.getPixels(iArr, 0, width, 1, 0, i4, 1);
                    this.f31074.getPixels(iArr2, 0, 1, 0, 1, 1, i5);
                    ArrayList arrayListM25826 = m25826(iArr);
                    ArrayList arrayListM25827 = m25826(iArr2);
                    if (arrayListM25826 != null && arrayListM25827 != null) {
                        this.f31074.getPixels(iArr, 0, width, 1, i2, i6, 1);
                        this.f31074.getPixels(iArr2, 0, 1, i3, 1, 1, i5);
                        C18568 c18568 = new C18568();
                        if (!C23573.stream(iArr).allMatch(new C24603()) && !C23573.stream(iArr2).allMatch(new C8510())) {
                            int i7 = 0;
                            while (true) {
                                i = i6;
                                if (i7 >= i || iArr[i7] != -65536) {
                                    break;
                                }
                                iArr[i7] = 0;
                                c18568.f55416++;
                                i7++;
                                i6 = i;
                            }
                            for (int i8 = width - 3; i8 >= 0 && iArr[i8] == -65536; i8--) {
                                iArr[i8] = 0;
                                c18568.f55417++;
                            }
                            for (int i9 = 0; i9 < i5 && iArr2[i9] == -65536; i9++) {
                                iArr2[i9] = 0;
                                c18568.f55418++;
                            }
                            for (int i10 = height - 3; i10 >= 0 && iArr2[i10] == -65536; i10--) {
                                iArr2[i10] = 0;
                                c18568.f55415++;
                            }
                            if (c18568.f55416 == 0 && c18568.f55418 == 0 && c18568.f55417 == 0 && c18568.f55415 == 0) {
                                c18568 = null;
                            }
                            ArrayList arrayListM25828 = m25826(iArr);
                            ArrayList arrayListM25829 = m25826(iArr2);
                            if (arrayListM25828 != null && arrayListM25829 != null && arrayListM25828.size() <= 1 && arrayListM25829.size() <= 1 && arrayListM25828.size() == arrayListM25829.size()) {
                                C14020 c14020 = new C14020();
                                c14020.f39537.addAll(arrayListM25826);
                                c14020.f39538.addAll(arrayListM25827);
                                if (arrayListM25828.isEmpty()) {
                                    c14020.f39536.set(C14020.m31815(c14020.f39537, c14020.f39538, i, i5));
                                } else {
                                    C6644 c6644 = (C6644) arrayListM25828.get(0);
                                    C6644 c6645 = (C6644) arrayListM25829.get(0);
                                    Rect rect = c14020.f39536;
                                    rect.left = c6644.f17145;
                                    rect.right = i - c6644.f17144;
                                    rect.top = c6645.f17145;
                                    rect.bottom = i5 - c6645.f17144;
                                }
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i5, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                Paint paint = new Paint();
                                paint.setAntiAlias(false);
                                paint.setFilterBitmap(false);
                                canvas.drawBitmap(this.f31074, -1.0f, -1.0f, paint);
                                this.f31074 = bitmapCreateBitmap;
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    this.f31074.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                                    arrayList.clear();
                                    m25827(byteArrayOutputStream.toByteArray());
                                    m25829(c14020);
                                    m25830(c18568);
                                    return true;
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m25826(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i = -1;
        boolean z = false;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            if (Color.alpha(i3) == 0) {
                i3 = 0;
            }
            if (i3 != -16777216) {
                if (i3 != 0) {
                    return null;
                }
                if (z) {
                    arrayList.add(new C6644(i, i2));
                    z = false;
                }
            } else if (!z) {
                i = i2;
                z = true;
            }
        }
        if (z) {
            arrayList.add(new C6644(i, length));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Bitmap m25834() {
        return this.f31074;
    }
}
