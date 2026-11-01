package p067l;

import android.view.View;
import android.view.ViewGroup;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: renamed from: l.᩷ۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7K5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22187 implements InterfaceC2696, InterfaceC10354 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m50001(int i) {
        int i2;
        if (i < -1) {
            return false;
        }
        return i == -1 || (i2 = i & 255) == 0 || i2 == 255 || (i & 65280) == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static View m50000(ViewGroup viewGroup, float f, float f2) {
        View viewM50000;
        float scrollX = f + viewGroup.getScrollX();
        float scrollY = f2 + viewGroup.getScrollY();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            int left = childAt.getLeft();
            int top = childAt.getTop();
            int right = childAt.getRight();
            int bottom = childAt.getBottom();
            if (scrollX >= left && scrollX <= right && scrollY >= top && scrollY <= bottom) {
                return (!(childAt instanceof ViewGroup) || (viewM50000 = m50000((ViewGroup) childAt, scrollX - ((float) childAt.getLeft()), scrollY - ((float) childAt.getTop()))) == null) ? childAt : viewM50000;
            }
        }
        return null;
    }

    @Override // p067l.InterfaceC10354
    /* JADX INFO: renamed from: ֫ */
    public void mo13645(CharSequence charSequence, C5660 c5660, C20438 c20438) throws IOException {
        String string = charSequence.toString();
        C20960 c20960 = new C20960();
        c20960.f65850 = true;
        c20960.f65851 = 28;
        C2993 c2993M26641 = C11572.m26641(string, c20960.m47281(), c20960);
        C23616 c23616 = new C23616();
        c23616.f75161 = 28;
        C13220 c13220 = new C13220();
        BufferedReader bufferedReader = new BufferedReader(new StringReader(string));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            String strTrim = line.trim();
            if (!strTrim.startsWith("#")) {
                break;
            }
            c13220.m30230(strTrim);
            c13220.append('\n');
        }
        C22946.m51262(new C23948(c13220), c2993M26641, c23616);
        c20438.append((CharSequence) c13220.toString());
    }
}
