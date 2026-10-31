package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.᩷ܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AO6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21002 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m47820(C5067 c5067) throws XmlPullParserException, IOException {
        C16061 c16061 = new C16061();
        c16061.setInput(c5067, "utf-8");
        ArrayList arrayList = new ArrayList();
        Stack stack = new Stack();
        while (true) {
            int next = c16061.next();
            if (next == 1) {
                return C9679.m24609(arrayList, "\n");
            }
            if (next == 2) {
                C0539 c0539 = new C0539(c16061.getName());
                if (stack.isEmpty()) {
                    arrayList.add(c0539);
                } else {
                    ((C0539) stack.peek()).mo2278(c0539);
                }
                stack.push(c0539);
                int attributeCount = c16061.getAttributeCount();
                int i = 0;
                while (i < attributeCount) {
                    int iM37974 = c16061.m37974(i);
                    String attributeName = c16061.getAttributeName(i);
                    String attributeValue = c16061.getAttributeValue(i);
                    C16061 c16062 = c16061;
                    Stack stack2 = stack;
                    int i2 = attributeCount;
                    ArrayList arrayList2 = arrayList;
                    int i3 = i;
                    switch (iM37974) {
                        case 16:
                            attributeName = C16014.m37867(attributeName, "-null");
                            attributeValue = "";
                            break;
                        case 32:
                            if (attributeName.endsWith("-null") || attributeName.endsWith("-str") || attributeName.endsWith("-interned") || attributeName.endsWith("-hex") || attributeName.endsWith("-base64") || attributeName.endsWith("-int") || attributeName.endsWith("-long") || attributeName.endsWith("-float") || attributeName.endsWith("-double") || attributeName.endsWith("-bool")) {
                                attributeName = attributeName.concat("-str");
                            }
                            break;
                        case 48:
                            attributeName = C16014.m37867(attributeName, "-interned");
                            break;
                        case 64:
                            attributeName = C16014.m37867(attributeName, "-hex");
                            break;
                        case 80:
                            attributeName = C16014.m37867(attributeName, "-base64");
                            break;
                        case 96:
                            attributeName = C16014.m37867(attributeName, "-int");
                            break;
                        case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                            attributeName = C16014.m37867(attributeName, "-int");
                            attributeValue = !attributeValue.startsWith("-") ? "0x".concat(attributeValue) : C20087.m46305(1, attributeValue, new StringBuilder("-0x"));
                            break;
                        case 128:
                            attributeName = C16014.m37867(attributeName, "-long");
                            break;
                        case 144:
                            attributeName = C16014.m37867(attributeName, "-long");
                            attributeValue = !attributeValue.startsWith("-") ? "0x".concat(attributeValue) : C20087.m46305(1, attributeValue, new StringBuilder("-0x"));
                            break;
                        case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                            attributeName = C16014.m37867(attributeName, "-float");
                            break;
                        case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                            attributeName = C16014.m37867(attributeName, "-double");
                            break;
                        case 192:
                        case 208:
                            attributeName = C16014.m37867(attributeName, "-bool");
                            break;
                    }
                    c0539.mo2276(attributeName, attributeValue);
                    i = i3 + 1;
                    stack = stack2;
                    c16061 = c16062;
                    attributeCount = i2;
                    arrayList = arrayList2;
                }
            } else if (next != 3) {
                if (next == 4 && !stack.isEmpty()) {
                    ((C0539) stack.peek()).mo2278(new C19591(c16061.getText()));
                }
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
            stack = stack;
            c16061 = c16061;
            arrayList = arrayList;
        }
    }
}
