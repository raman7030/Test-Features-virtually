package p067l;

import android.graphics.Paint;
import android.text.TextUtils;
import com.google.android.material.motion.MotionUtils;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z81J */
/* JADX INFO: loaded from: classes4.dex */
public final class C21083 {
    /* JADX INFO: renamed from: ֫ */
    public static String m47580(C17117 c17117) {
        C23948 c23948 = new C23948();
        PrintWriter printWriter = new PrintWriter(c23948);
        C3707 c3707 = c17117.f50563.f28799;
        float f = c3707.f7837;
        float f2 = c3707.f7831;
        float f3 = c3707.f7843;
        float f4 = c3707.f7833;
        C21143 c21143 = c3707.f7836;
        printWriter.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        printWriter.print("<svg xmlns=\"http://www.w3.org/2000/svg\"");
        printWriter.print(" width=\"" + f + "\"");
        printWriter.print(" height=\"" + f2 + "\"");
        printWriter.print(" viewBox=\"0 0 " + f3 + " " + f4 + "\"");
        printWriter.println(">");
        ArrayList arrayList = new ArrayList();
        m47582(c21143, arrayList);
        if (!arrayList.isEmpty()) {
            printWriter.println("  <defs>");
            for (int i = 0; i < arrayList.size(); i++) {
                C6390 c6390 = (C6390) arrayList.get(i);
                printWriter.println("    <clipPath id=\"" + C20778.m46922(i, "clip") + "\">");
                String str = c6390.f20268;
                if (!TextUtils.isEmpty(str)) {
                    printWriter.println("      <path d=\"" + str + "\" />");
                }
                printWriter.println("    </clipPath>");
            }
            printWriter.println("  </defs>");
        }
        m47581(c21143, printWriter, 1, arrayList);
        printWriter.println("</svg>");
        printWriter.flush();
        return c23948.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47582(C21143 c21143, ArrayList arrayList) {
        for (AbstractC3036 abstractC3036 : c21143.f66435) {
            if (abstractC3036 instanceof C6390) {
                arrayList.add((C6390) abstractC3036);
            } else if (abstractC3036 instanceof C21143) {
                m47582((C21143) abstractC3036, arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47581(C21143 c21143, PrintWriter printWriter, int i, ArrayList arrayList) {
        int i2;
        int iIndexOf;
        String strM47763 = c21143.m47763();
        float f = c21143.f66438;
        float f2 = c21143.f66437;
        float f3 = c21143.f66440;
        float f4 = c21143.f66445;
        float f5 = c21143.f66436;
        float f6 = c21143.f66443;
        float f7 = c21143.f66442;
        ArrayList arrayList2 = c21143.f66435;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if ((obj instanceof C6390) && (iIndexOf = arrayList.indexOf((C6390) obj)) >= 0) {
                arrayList3.add(Integer.valueOf(iIndexOf));
            }
        }
        boolean z = (TextUtils.isEmpty(strM47763) && f == 0.0f && f2 == 0.0f && f3 == 0.0f && f4 == 1.0f && f5 == 1.0f && arrayList2.size() <= 1 && arrayList3.size() <= 0) ? false : true;
        if (z) {
            printWriter.print(m47583(i) + "<g");
            if (!TextUtils.isEmpty(strM47763)) {
                printWriter.print(" id=\"" + strM47763 + "\"");
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
                printWriter.println(m47583(i2) + "<g clip-path=\"url(#clip" + ((Integer) arrayList3.get(i3)).intValue() + ")\">");
                i3++;
                i2++;
            }
        } else {
            z = z;
            i2 = i;
        }
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof C20472) {
                C20472 c20472 = (C20472) obj2;
                printWriter.print(m47583(i2) + "<path");
                String str = c20472.f20268;
                if (!TextUtils.isEmpty(str)) {
                    printWriter.print(" d=\"" + str + "\"");
                }
                int iM54275 = c20472.f63217.m54275();
                if (iM54275 != 0) {
                    printWriter.print(" fill=\"" + m47579(iM54275) + "\"");
                }
                int iM54276 = c20472.f63214.m54275();
                if (iM54276 != 0) {
                    printWriter.print(" stroke=\"" + m47579(iM54276) + "\"");
                }
                float f8 = c20472.f63218;
                if (f8 > 0.0f) {
                    printWriter.print(" stroke-width=\"" + f8 + "\"");
                }
                Paint.Cap cap = c20472.f63221;
                if (cap != null) {
                    String lowerCase = cap.toString().toLowerCase();
                    if (!"butt".equals(lowerCase)) {
                        printWriter.print(" stroke-linecap=\"" + lowerCase + "\"");
                    }
                }
                Paint.Join join = c20472.f63216;
                if (join != null) {
                    String lowerCase2 = join.toString().toLowerCase();
                    if (!"miter".equals(lowerCase2)) {
                        printWriter.print(" stroke-linejoin=\"" + lowerCase2 + "\"");
                    }
                }
                float f9 = c20472.f63219;
                if (f9 != 1.0f) {
                    printWriter.print(" fill-opacity=\"" + f9 + "\"");
                }
                float f10 = c20472.f63222;
                if (f10 != 1.0f) {
                    printWriter.print(" stroke-opacity=\"" + f10 + "\"");
                }
                printWriter.println(" />");
            } else if (obj2 instanceof C21143) {
                m47581((C21143) obj2, printWriter, i2, arrayList);
            }
        }
        if (z) {
            if (!arrayList3.isEmpty()) {
                int size2 = arrayList3.size();
                for (int i4 = 1; i4 < size2; i4++) {
                    StringBuilder sb3 = new StringBuilder();
                    i2--;
                    sb3.append(m47583(i2));
                    sb3.append("</g>");
                    printWriter.println(sb3.toString());
                }
            }
            printWriter.println(m47583(i2 - 1) + "</g>");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m47583(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(EnumC2483.f3919);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m47579(int i) {
        return (i & (-16777216)) != -16777216 ? String.format("#%06X%02X", Integer.valueOf(i & 16777215), Integer.valueOf(i >>> 24)) : String.format("#%06X", Integer.valueOf(i & 16777215));
    }
}
