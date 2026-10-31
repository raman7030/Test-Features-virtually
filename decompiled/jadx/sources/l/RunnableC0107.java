package l;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6NC */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0107 implements Runnable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1084;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1085;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1086;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1087;

    public /* synthetic */ RunnableC0107(Object obj, Object obj2, Object obj3, int i) {
        this.f1086 = i;
        this.f1087 = obj;
        this.f1085 = obj2;
        this.f1084 = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00e5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7 A[Catch: all -> 0x011c, TryCatch #2 {all -> 0x011c, blocks: (B:13:0x0041, B:16:0x004b, B:17:0x0067, B:19:0x006d, B:20:0x007b, B:22:0x0081, B:23:0x008f, B:43:0x00c9, B:44:0x00d1, B:46:0x00d7, B:47:0x00e5, B:49:0x00eb, B:51:0x00f7, B:53:0x0101, B:55:0x010f, B:25:0x0093, B:28:0x009c, B:31:0x00a5, B:34:0x00ae, B:37:0x00b7, B:40:0x00c0), top: B:74:0x0041, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb A[Catch: all -> 0x011c, TryCatch #2 {all -> 0x011c, blocks: (B:13:0x0041, B:16:0x004b, B:17:0x0067, B:19:0x006d, B:20:0x007b, B:22:0x0081, B:23:0x008f, B:43:0x00c9, B:44:0x00d1, B:46:0x00d7, B:47:0x00e5, B:49:0x00eb, B:51:0x00f7, B:53:0x0101, B:55:0x010f, B:25:0x0093, B:28:0x009c, B:31:0x00a5, B:34:0x00ae, B:37:0x00b7, B:40:0x00c0), top: B:74:0x0041, outer: #1 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        InterfaceC1454 value;
        int i = this.f1086;
        Object obj = this.f1084;
        Object obj2 = this.f1085;
        Object obj3 = this.f1087;
        int i2 = 1;
        switch (i) {
            case 0:
                C0813.m3049((EnumC13555) obj, (C0813) obj3, (Throwable) obj2);
                return;
            case 1:
                C12645 c12645 = (C12645) obj2;
                C7140 c7140 = (C7140) obj;
                try {
                    C18090 c18090 = new C18090(((C10738) obj3).m26937());
                    try {
                        C3545 entry = c18090.getEntry("resources.arsc");
                        if (entry != null) {
                            C23326 c23326 = new C23326(c18090.m42189(entry));
                            c23326.m51731();
                            String strSubstring = c12645.getPath().substring(1);
                            Iterator it2 = c23326.mo21936().iterator();
                            while (it2.hasNext()) {
                                for (InterfaceC0748 interfaceC0748 : ((InterfaceC4277) it2.next()).mo12850()) {
                                    String typeName = interfaceC0748.getTypeName();
                                    switch (typeName.hashCode()) {
                                        case -891985903:
                                            if (!typeName.equals("string")) {
                                                it = interfaceC0748.mo2872().iterator();
                                                while (it.hasNext()) {
                                                    for (InterfaceC21211 interfaceC21211 : ((InterfaceC7099) it.next()).mo18746()) {
                                                        if (!interfaceC21211.mo29412()) {
                                                            value = interfaceC21211.getValue();
                                                            if (!value.mo5009() && value.mo5008().getValue().equals(strSubstring)) {
                                                                C4925.m14315(new RunnableC10882(i2, c7140, interfaceC21211));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case -475309713:
                                            if (!typeName.equals("plurals")) {
                                                it = interfaceC0748.mo2872().iterator();
                                                while (it.hasNext()) {
                                                    while (r7.hasNext()) {
                                                        if (!interfaceC21211.mo29412()) {
                                                            value = interfaceC21211.getValue();
                                                            if (!value.mo5009()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 3355:
                                            if (!typeName.equals("id")) {
                                                it = interfaceC0748.mo2872().iterator();
                                                while (it.hasNext()) {
                                                    while (r7.hasNext()) {
                                                        if (!interfaceC21211.mo29412()) {
                                                            value = interfaceC21211.getValue();
                                                            if (!value.mo5009()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 3004913:
                                            if (!typeName.equals("attr")) {
                                                it = interfaceC0748.mo2872().iterator();
                                                while (it.hasNext()) {
                                                    while (r7.hasNext()) {
                                                        if (!interfaceC21211.mo29412()) {
                                                            value = interfaceC21211.getValue();
                                                            if (!value.mo5009()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 93090393:
                                            if (!typeName.equals("array")) {
                                                it = interfaceC0748.mo2872().iterator();
                                                while (it.hasNext()) {
                                                    while (r7.hasNext()) {
                                                        if (!interfaceC21211.mo29412()) {
                                                            value = interfaceC21211.getValue();
                                                            if (!value.mo5009()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 109780401:
                                            if (!typeName.equals("style")) {
                                                it = interfaceC0748.mo2872().iterator();
                                                while (it.hasNext()) {
                                                    while (r7.hasNext()) {
                                                        if (!interfaceC21211.mo29412()) {
                                                            value = interfaceC21211.getValue();
                                                            if (!value.mo5009()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            it = interfaceC0748.mo2872().iterator();
                                            while (it.hasNext()) {
                                                while (r7.hasNext()) {
                                                    if (!interfaceC21211.mo29412()) {
                                                        value = interfaceC21211.getValue();
                                                        if (!value.mo5009()) {
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            }
                        }
                        c18090.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            c18090.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable unused) {
                    return;
                }
            default:
                String str = (String) obj2;
                Bitmap bitmap = (Bitmap) obj;
                ImageView imageView = (ImageView) ((WeakReference) obj3).get();
                if (imageView == null || !str.equals(imageView.getTag())) {
                    return;
                }
                Drawable drawable = imageView.getDrawable();
                if (drawable == null) {
                    drawable = new ColorDrawable(0);
                }
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, new BitmapDrawable(imageView.getResources(), bitmap)});
                transitionDrawable.setCrossFadeEnabled(true);
                imageView.setImageDrawable(transitionDrawable);
                transitionDrawable.startTransition(300);
                return;
        }
    }
}
