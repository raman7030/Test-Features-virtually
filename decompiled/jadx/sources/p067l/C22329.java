package p067l;

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
public final class C22329 {
    /* JADX INFO: renamed from: ֫ */
    public static String m50150(C7184 c7184) throws XmlPullParserException, IOException {
        C17633 c17633 = new C17633();
        c17633.setInput(c7184, "utf-8");
        ArrayList arrayList = new ArrayList();
        Stack stack = new Stack();
        while (true) {
            int next = c17633.next();
            if (next == 1) {
                return C11567.m26623(arrayList, "\n");
            }
            if (next == 2) {
                C2881 c2881 = new C2881(c17633.getName());
                if (stack.isEmpty()) {
                    arrayList.add(c2881);
                } else {
                    ((C2881) stack.peek()).mo4645(c2881);
                }
                stack.push(c2881);
                int attributeCount = c17633.getAttributeCount();
                int i = 0;
                while (i < attributeCount) {
                    int iM40162 = c17633.m40162(i);
                    String attributeName = c17633.getAttributeName(i);
                    String attributeValue = c17633.getAttributeValue(i);
                    C17633 c17634 = c17633;
                    Stack stack2 = stack;
                    int i2 = attributeCount;
                    ArrayList arrayList2 = arrayList;
                    int i3 = i;
                    switch (iM40162) {
                        case 16:
                            attributeName = C17588.m40053(attributeName, "-null");
                            attributeValue = "";
                            break;
                        case 32:
                            if (attributeName.endsWith("-null") || attributeName.endsWith("-str") || attributeName.endsWith("-interned") || attributeName.endsWith("-hex") || attributeName.endsWith("-base64") || attributeName.endsWith("-int") || attributeName.endsWith("-long") || attributeName.endsWith("-float") || attributeName.endsWith("-double") || attributeName.endsWith("-bool")) {
                                attributeName = attributeName.concat("-str");
                            }
                            break;
                        case 48:
                            attributeName = C17588.m40053(attributeName, "-interned");
                            break;
                        case 64:
                            attributeName = C17588.m40053(attributeName, "-hex");
                            break;
                        case 80:
                            attributeName = C17588.m40053(attributeName, "-base64");
                            break;
                        case 96:
                            attributeName = C17588.m40053(attributeName, "-int");
                            break;
                        case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                            attributeName = C17588.m40053(attributeName, "-int");
                            attributeValue = !attributeValue.startsWith("-") ? "0x".concat(attributeValue) : C21459.m48621(1, attributeValue, new StringBuilder("-0x"));
                            break;
                        case 128:
                            attributeName = C17588.m40053(attributeName, "-long");
                            break;
                        case 144:
                            attributeName = C17588.m40053(attributeName, "-long");
                            attributeValue = !attributeValue.startsWith("-") ? "0x".concat(attributeValue) : C21459.m48621(1, attributeValue, new StringBuilder("-0x"));
                            break;
                        case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                            attributeName = C17588.m40053(attributeName, "-float");
                            break;
                        case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                            attributeName = C17588.m40053(attributeName, "-double");
                            break;
                        case 192:
                        case 208:
                            attributeName = C17588.m40053(attributeName, "-bool");
                            break;
                    }
                    c2881.mo4643(attributeName, attributeValue);
                    i = i3 + 1;
                    stack = stack2;
                    c17633 = c17634;
                    attributeCount = i2;
                    arrayList = arrayList2;
                }
            } else if (next != 3) {
                if (next == 4 && !stack.isEmpty()) {
                    ((C2881) stack.peek()).mo4645(new C20988(c17633.getText()));
                }
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
            stack = stack;
            c17633 = c17633;
            arrayList = arrayList;
        }
    }
}
