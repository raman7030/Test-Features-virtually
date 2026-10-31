package l;

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
public final class C9285 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Bitmap f28125;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f28126 = new ArrayList();

    public C9285(byte[] bArr) throws IOException {
        m23818(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        this.f28125 = bitmapDecodeByteArray;
        if (bitmapDecodeByteArray == null) {
            throw new IOException("Decode bitmap failed");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23818(byte[] bArr) throws IOException {
        C12951 c12951 = new C12951(bArr);
        C22124.m49722((InterfaceC20008) c12951, 1196314761);
        C22124.m49722((InterfaceC20008) c12951, 169478669);
        boolean z = false;
        while (c12951.available() > 0) {
            int iM31492 = c12951.m31492();
            C14222 c14222 = new C14222();
            c14222.f42895 = c12951.readInt();
            byte[] bArr2 = new byte[iM31492];
            c12951.m31489(iM31492, bArr2);
            c14222.f42894 = bArr2;
            c14222.f42893 = c12951.m31492();
            this.f28126.add(c14222);
            if (c14222.f42895 == 1413563465) {
                z = true;
            }
        }
        if (!z) {
            throw new IOException("Data chunk not found");
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m23823() {
        ArrayList<C14222> arrayList = this.f28126;
        Iterator it = arrayList.iterator();
        int length = 8;
        while (it.hasNext()) {
            length += ((C14222) it.next()).f42894.length + 12;
        }
        C10130 c10130 = new C10130(length);
        c10130.writeInt(1196314761);
        c10130.writeInt(169478669);
        for (C14222 c14222 : arrayList) {
            c10130.m25430(c14222.f42894.length);
            c10130.writeInt(c14222.f42895);
            c10130.write(c14222.f42894);
            c10130.m25430(c14222.f42893);
        }
        return c10130.m25438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23819(BufferedOutputStream bufferedOutputStream) {
        int width = this.f28125.getWidth();
        int height = this.f28125.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width + 2, height + 2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(false);
        paint.setFilterBitmap(false);
        canvas.drawBitmap(this.f28125, 1.0f, 1.0f, paint);
        canvas.translate(1.0f, 1.0f);
        C12260 c12260M23827 = m23827();
        if (c12260M23827 != null) {
            Rect rect = c12260M23827.f36519;
            ArrayList<C4499> arrayList = c12260M23827.f36521;
            ArrayList<C4499> arrayList2 = c12260M23827.f36520;
            paint.setColor(-16777216);
            for (C4499 c4499 : arrayList2) {
                canvas.drawRect(c4499.f14318, -1.0f, c4499.f14317, 0.0f, paint);
            }
            for (C4499 c44910 : arrayList) {
                canvas.drawRect(-1.0f, c44910.f14318, 0.0f, c44910.f14317, paint);
            }
            if (!rect.equals(C12260.m29753(arrayList2, arrayList, width, height))) {
                canvas.drawRect(rect.left, height, width - rect.right, height + 1, paint);
                canvas.drawRect(width, rect.top, width + 1, height - rect.bottom, paint);
            }
        }
        C17045 c17045M23826 = m23826();
        if (c17045M23826 != null) {
            paint.setColor(-65536);
            float f = height;
            float f2 = height + 1;
            canvas.drawRect(0.0f, f, c17045M23826.f52234, f2, paint);
            float f3 = width;
            canvas.drawRect(width - c17045M23826.f52235, f, f3, f2, paint);
            float f4 = width + 1;
            canvas.drawRect(f3, 0.0f, f4, c17045M23826.f52236, paint);
            canvas.drawRect(f3, height - c17045M23826.f52236, f4, f, paint);
        }
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12260 m23827() {
        for (C14222 c14222 : this.f28126) {
            if (c14222.f42895 == 1666478190) {
                C12260 c12260 = new C12260();
                C12951 c12951 = new C12951(c14222.f42894);
                c12951.skipBytes(1);
                byte b = c12951.readByte();
                byte b2 = c12951.readByte();
                int i = c12951.readByte();
                int i2 = c12951.readInt();
                int i3 = c12951.readInt();
                Rect rect = c12260.f36519;
                rect.left = c12951.m31492();
                rect.right = c12951.m31492();
                rect.top = c12951.m31492();
                rect.bottom = c12951.m31492();
                int i4 = c12951.readInt();
                c12951.seek(i2);
                for (int i5 = b / 2; i5 > 0; i5--) {
                    c12260.f36520.add(new C4499(c12951.m31492(), c12951.m31492()));
                }
                c12951.seek(i3);
                for (int i6 = b2 / 2; i6 > 0; i6--) {
                    c12260.f36521.add(new C4499(c12951.m31492(), c12951.m31492()));
                }
                c12951.seek(i4);
                c12260.f36518 = new int[i];
                for (byte b3 = 0; b3 < i; b3 = (byte) (b3 + 1)) {
                    c12260.f36518[b3] = c12951.m31492();
                }
                c12260.m29756(this.f28125);
                return c12260;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23820(C12260 c12260) {
        c12260.m29756(this.f28125);
        c12260.m29758(this.f28125);
        ArrayList<C14222> arrayList = this.f28126;
        for (C14222 c14222 : arrayList) {
            if (c14222.f42895 == 1666478190) {
                c14222.f42894 = c12260.m29757();
                c14222.m33882();
                return;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C14222) arrayList.get(i)).f42895 == 1413563465) {
                C14222 c14223 = new C14222();
                c14223.f42895 = 1666478190;
                c14223.f42894 = c12260.m29757();
                c14223.m33882();
                arrayList.add(i, c14223);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17045 m23826() {
        for (C14222 c14222 : this.f28126) {
            if (c14222.f42895 == 1649176686) {
                C17045 c17045 = new C17045();
                C12951 c12951 = new C12951(c14222.f42894);
                c17045.f52234 = c12951.readInt();
                c17045.f52236 = c12951.readInt();
                c17045.f52235 = c12951.readInt();
                c17045.f52233 = c12951.readInt();
                return c17045;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23821(C17045 c17045) {
        ArrayList<C14222> arrayList = this.f28126;
        if (c17045 == null) {
            C5378.removeIf(arrayList, new C20574(0));
            return;
        }
        for (C14222 c14222 : arrayList) {
            if (c14222.f42895 == 1649176686) {
                c14222.f42894 = c17045.m40012();
                c14222.m33882();
                return;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C14222) arrayList.get(i)).f42895 == 1413563465) {
                C14222 c14223 = new C14222();
                c14223.f42895 = 1649176686;
                c14223.f42894 = c17045.m40012();
                c14223.m33882();
                arrayList.add(i, c14223);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m23824() {
        Iterator it = this.f28126.iterator();
        while (it.hasNext()) {
            if (((C14222) it.next()).f42895 == 1666478190) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m23822() {
        int i;
        ArrayList arrayList = this.f28126;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C14222) it.next()).f42895 == 1666478190) {
                return false;
            }
        }
        int width = this.f28125.getWidth();
        int height = this.f28125.getHeight();
        if (width >= 3 && height >= 3 && Color.alpha(this.f28125.getPixel(0, 0)) == 0) {
            int i2 = height - 1;
            if (Color.alpha(this.f28125.getPixel(0, i2)) == 0) {
                int i3 = width - 1;
                if (Color.alpha(this.f28125.getPixel(i3, 0)) == 0 && Color.alpha(this.f28125.getPixel(i3, i2)) == 0) {
                    int i4 = width - 2;
                    int[] iArr = new int[i4];
                    int i5 = height - 2;
                    int[] iArr2 = new int[i5];
                    int i6 = i4;
                    this.f28125.getPixels(iArr, 0, width, 1, 0, i4, 1);
                    this.f28125.getPixels(iArr2, 0, 1, 0, 1, 1, i5);
                    ArrayList arrayListM23817 = m23817(iArr);
                    ArrayList arrayListM23818 = m23817(iArr2);
                    if (arrayListM23817 != null && arrayListM23818 != null) {
                        this.f28125.getPixels(iArr, 0, width, 1, i2, i6, 1);
                        this.f28125.getPixels(iArr2, 0, 1, i3, 1, 1, i5);
                        C17045 c17045 = new C17045();
                        if (!C22311.stream(iArr).allMatch(new C23395()) && !C22311.stream(iArr2).allMatch(new C6462())) {
                            int i7 = 0;
                            while (true) {
                                i = i6;
                                if (i7 >= i || iArr[i7] != -65536) {
                                    break;
                                }
                                iArr[i7] = 0;
                                c17045.f52234++;
                                i7++;
                                i6 = i;
                            }
                            for (int i8 = width - 3; i8 >= 0 && iArr[i8] == -65536; i8--) {
                                iArr[i8] = 0;
                                c17045.f52235++;
                            }
                            for (int i9 = 0; i9 < i5 && iArr2[i9] == -65536; i9++) {
                                iArr2[i9] = 0;
                                c17045.f52236++;
                            }
                            for (int i10 = height - 3; i10 >= 0 && iArr2[i10] == -65536; i10--) {
                                iArr2[i10] = 0;
                                c17045.f52233++;
                            }
                            if (c17045.f52234 == 0 && c17045.f52236 == 0 && c17045.f52235 == 0 && c17045.f52233 == 0) {
                                c17045 = null;
                            }
                            ArrayList arrayListM23819 = m23817(iArr);
                            ArrayList arrayListM238110 = m23817(iArr2);
                            if (arrayListM23819 != null && arrayListM238110 != null && arrayListM23819.size() <= 1 && arrayListM238110.size() <= 1 && arrayListM23819.size() == arrayListM238110.size()) {
                                C12260 c12260 = new C12260();
                                c12260.f36520.addAll(arrayListM23817);
                                c12260.f36521.addAll(arrayListM23818);
                                if (arrayListM23819.isEmpty()) {
                                    c12260.f36519.set(C12260.m29753(c12260.f36520, c12260.f36521, i, i5));
                                } else {
                                    C4499 c4499 = (C4499) arrayListM23819.get(0);
                                    C4499 c44910 = (C4499) arrayListM238110.get(0);
                                    Rect rect = c12260.f36519;
                                    rect.left = c4499.f14318;
                                    rect.right = i - c4499.f14317;
                                    rect.top = c44910.f14318;
                                    rect.bottom = i5 - c44910.f14317;
                                }
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i5, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                Paint paint = new Paint();
                                paint.setAntiAlias(false);
                                paint.setFilterBitmap(false);
                                canvas.drawBitmap(this.f28125, -1.0f, -1.0f, paint);
                                this.f28125 = bitmapCreateBitmap;
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    this.f28125.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                                    arrayList.clear();
                                    m23818(byteArrayOutputStream.toByteArray());
                                    m23820(c12260);
                                    m23821(c17045);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m23817(int[] iArr) {
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
                    arrayList.add(new C4499(i, i2));
                    z = false;
                }
            } else if (!z) {
                i = i2;
                z = true;
            }
        }
        if (z) {
            arrayList.add(new C4499(i, length));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Bitmap m23825() {
        return this.f28125;
    }
}
