package l;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D2TL */
/* JADX INFO: loaded from: classes3.dex */
public final class C14286 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34067(Intent intent, ArrayList arrayList) {
        ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), null, (Uri) arrayList.get(0)));
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            clipData.addItem(new ClipData.Item((Uri) arrayList.get(i)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }
}
