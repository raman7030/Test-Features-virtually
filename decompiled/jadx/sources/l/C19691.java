package l;

import android.graphics.Paint;
import android.text.TextUtils;
import com.google.android.material.motion.MotionUtils;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z81J */
/* JADX INFO: loaded from: classes4.dex */
public final class C19691 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m45283(C15518 c15518) {
        C22706 c22706 = new C22706();
        PrintWriter printWriter = new PrintWriter(c22706);
        C1408 c1408 = c15518.f47431.f25886;
        float f = c1408.f5066;
        float f2 = c1408.f5060;
        float f3 = c1408.f5072;
        float f4 = c1408.f5062;
        C19754 c19754 = c1408.f5065;
        printWriter.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        printWriter.print("<svg xmlns=\"http://www.w3.org/2000/svg\"");
        printWriter.print(" width=\"" + f + "\"");
        printWriter.print(" height=\"" + f2 + "\"");
        printWriter.print(" viewBox=\"0 0 " + f3 + " " + f4 + "\"");
        printWriter.println(">");
        ArrayList arrayList = new ArrayList();
        m45285(c19754, arrayList);
        if (!arrayList.isEmpty()) {
            printWriter.println("  <defs>");
            for (int i = 0; i < arrayList.size(); i++) {
                C4231 c4231 = (C4231) arrayList.get(i);
                printWriter.println("    <clipPath id=\"" + C19370.m44628(i, "clip") + "\">");
                String str = c4231.f17422;
                if (!TextUtils.isEmpty(str)) {
                    printWriter.println("      <path d=\"" + str + "\" />");
                }
                printWriter.println("    </clipPath>");
            }
            printWriter.println("  </defs>");
        }
        m45284(c19754, printWriter, 1, arrayList);
        printWriter.println("</svg>");
        printWriter.flush();
        return c22706.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45285(C19754 c19754, ArrayList arrayList) {
        for (AbstractC0702 abstractC0702 : c19754.f63800) {
            if (abstractC0702 instanceof C4231) {
                arrayList.add((C4231) abstractC0702);
            } else if (abstractC0702 instanceof C19754) {
                m45285((C19754) abstractC0702, arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45284(C19754 c19754, PrintWriter printWriter, int i, ArrayList arrayList) {
        int i2;
        int iIndexOf;
        String strM45456 = c19754.m45456();
        float f = c19754.f63803;
        float f2 = c19754.f63802;
        float f3 = c19754.f63805;
        float f4 = c19754.f63810;
        float f5 = c19754.f63801;
        float f6 = c19754.f63808;
        float f7 = c19754.f63807;
        ArrayList arrayList2 = c19754.f63800;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if ((obj instanceof C4231) && (iIndexOf = arrayList.indexOf((C4231) obj)) >= 0) {
                arrayList3.add(Integer.valueOf(iIndexOf));
            }
        }
        boolean z = (TextUtils.isEmpty(strM45456) && f == 0.0f && f2 == 0.0f && f3 == 0.0f && f4 == 1.0f && f5 == 1.0f && arrayList2.size() <= 1 && arrayList3.size() <= 0) ? false : true;
        if (z) {
            printWriter.print(m45286(i) + "<g");
            if (!TextUtils.isEmpty(strM45456)) {
                printWriter.print(" id=\"" + strM45456 + "\"");
            }
            if (!arrayList3.isEmpty()) {
                printWriter.print(" clip-path=\"url(#clip" + ((Integer) arrayList3.get(0)).intValue() + ")\"");
            }
            ArrayList arrayList4 = new ArrayList();
            if (f != 0.0f || f2 != 0.0f) {
                arrayList4.add("translate(" + f + " " + f2 + MotionUtils.EASING_TYPE_FORMAT_END);
            }
            if (f3 != 0.0f) {
                if (f6 == 0.0f && f7 == 0.0f) {
                    arrayList4.add("rotate(" + f3 + MotionUtils.EASING_TYPE_FORMAT_END);
                } else {
                    arrayList4.add("rotate(" + f3 + " " + f6 + " " + f7 + MotionUtils.EASING_TYPE_FORMAT_END);
                }
            }
            if (f4 != 1.0f || f5 != 1.0f) {
                arrayList4.add("scale(" + f4 + " " + f5 + MotionUtils.EASING_TYPE_FORMAT_END);
            }
            if (!arrayList4.isEmpty()) {
                StringBuilder sb = new StringBuilder(" transform=\"");
                StringBuilder sb2 = new StringBuilder();
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb2.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        } else {
                            sb2.append((CharSequence) " ");
                        }
                    }
                }
                sb.append(sb2.toString());
                sb.append("\"");
                printWriter.print(sb.toString());
            }
            printWriter.println(">");
            i2 = i + 1;
            int size = arrayList3.size();
            int i3 = 1;
            while (i3 < size) {
                printWriter.println(m45286(i2) + "<g clip-path=\"url(#clip" + ((Integer) arrayList3.get(i3)).intValue() + ")\">");
                i3++;
                i2++;
            }
        } else {
            z = z;
            i2 = i;
        }
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof C19048) {
                C19048 c19048 = (C19048) obj2;
                printWriter.print(m45286(i2) + "<path");
                String str = c19048.f17422;
                if (!TextUtils.isEmpty(str)) {
                    printWriter.print(" d=\"" + str + "\"");
                }
                int iM51877 = c19048.f59988.m51877();
                if (iM51877 != 0) {
                    printWriter.print(" fill=\"" + m45282(iM51877) + "\"");
                }
                int iM51878 = c19048.f59985.m51877();
                if (iM51878 != 0) {
                    printWriter.print(" stroke=\"" + m45282(iM51878) + "\"");
                }
                float f8 = c19048.f59989;
                if (f8 > 0.0f) {
                    printWriter.print(" stroke-width=\"" + f8 + "\"");
                }
                Paint.Cap cap = c19048.f59992;
                if (cap != null) {
                    String lowerCase = cap.toString().toLowerCase();
                    if (!"butt".equals(lowerCase)) {
                        printWriter.print(" stroke-linecap=\"" + lowerCase + "\"");
                    }
                }
                Paint.Join join = c19048.f59987;
                if (join != null) {
                    String lowerCase2 = join.toString().toLowerCase();
                    if (!"miter".equals(lowerCase2)) {
                        printWriter.print(" stroke-linejoin=\"" + lowerCase2 + "\"");
                    }
                }
                float f9 = c19048.f59990;
                if (f9 != 1.0f) {
                    printWriter.print(" fill-opacity=\"" + f9 + "\"");
                }
                float f10 = c19048.f59993;
                if (f10 != 1.0f) {
                    printWriter.print(" stroke-opacity=\"" + f10 + "\"");
                }
                printWriter.println(" />");
            } else if (obj2 instanceof C19754) {
                m45284((C19754) obj2, printWriter, i2, arrayList);
            }
        }
        if (z) {
            if (!arrayList3.isEmpty()) {
                int size2 = arrayList3.size();
                for (int i4 = 1; i4 < size2; i4++) {
                    StringBuilder sb3 = new StringBuilder();
                    i2--;
                    sb3.append(m45286(i2));
                    sb3.append("</g>");
                    printWriter.println(sb3.toString());
                }
            }
            printWriter.println(m45286(i2 - 1) + "</g>");
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m45286(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(EnumC0121.f1143);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m45282(int i) {
        return (i & (-16777216)) != -16777216 ? String.format("#%06X%02X", Integer.valueOf(i & 16777215), Integer.valueOf(i >>> 24)) : String.format("#%06X", Integer.valueOf(i & 16777215));
    }
}
