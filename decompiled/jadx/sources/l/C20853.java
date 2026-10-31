package l;

import android.view.View;
import android.view.ViewGroup;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: renamed from: l.᩷ۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7K5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20853 implements InterfaceC0345, InterfaceC8402 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47673(int i) {
        int i2;
        if (i < -1) {
            return false;
        }
        return i == -1 || (i2 = i & 255) == 0 || i2 == 255 || (i & 65280) == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static View m47672(ViewGroup viewGroup, float f, float f2) {
        View viewM47672;
        float scrollX = f + viewGroup.getScrollX();
        float scrollY = f2 + viewGroup.getScrollY();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            int left = childAt.getLeft();
            int top = childAt.getTop();
            int right = childAt.getRight();
            int bottom = childAt.getBottom();
            if (scrollX >= left && scrollX <= right && scrollY >= top && scrollY <= bottom) {
                return (!(childAt instanceof ViewGroup) || (viewM47672 = m47672((ViewGroup) childAt, scrollX - ((float) childAt.getLeft()), scrollY - ((float) childAt.getTop()))) == null) ? childAt : viewM47672;
            }
        }
        return null;
    }

    @Override // l.InterfaceC8402
    /* JADX INFO: renamed from: ֫ */
    public void mo11709(CharSequence charSequence, C3463 c3463, C19012 c19012) throws IOException {
        String string = charSequence.toString();
        C19562 c19562 = new C19562();
        c19562.f63231 = true;
        c19562.f63232 = 28;
        C0657 c0657M24627 = C9684.m24627(string, c19562.m44986(), c19562);
        C22357 c22357 = new C22357();
        c22357.f72435 = 28;
        C11418 c11418 = new C11418();
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
            c11418.m28186(strTrim);
            c11418.append('\n');
        }
        C21652.m48913(new C22706(c11418), c0657M24627, c22357);
        c19012.append((CharSequence) c11418.toString());
    }
}
