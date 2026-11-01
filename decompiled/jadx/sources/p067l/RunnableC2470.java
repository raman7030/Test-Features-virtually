package p067l;

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
public final /* synthetic */ class RunnableC2470 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f3858;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f3859;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f3860;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f3861;

    public /* synthetic */ RunnableC2470(Object obj, Object obj2, Object obj3, int i) {
        this.f3860 = i;
        this.f3861 = obj;
        this.f3859 = obj2;
        this.f3858 = obj3;
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
        InterfaceC3751 value;
        int i = this.f3860;
        Object obj = this.f3858;
        Object obj2 = this.f3859;
        Object obj3 = this.f3861;
        int i2 = 1;
        switch (i) {
            case 0:
                C3141.m5362((EnumC15251) obj, (C3141) obj3, (Throwable) obj2);
                return;
            case 1:
                C14387 c14387 = (C14387) obj2;
                C9154 c9154 = (C9154) obj;
                try {
                    C19561 c19561 = new C19561(((C12574) obj3).m28981());
                    try {
                        C5738 entry = c19561.getEntry("resources.arsc");
                        if (entry != null) {
                            C24538 c24538 = new C24538(c19561.m44448(entry));
                            c24538.m54128();
                            String strSubstring = c14387.getPath().substring(1);
                            Iterator it2 = c24538.mo23906().iterator();
                            while (it2.hasNext()) {
                                for (InterfaceC3080 interfaceC3080 : ((InterfaceC6434) it2.next()).mo14714()) {
                                    String typeName = interfaceC3080.getTypeName();
                                    switch (typeName.hashCode()) {
                                        case -891985903:
                                            if (!typeName.equals("string")) {
                                                it = interfaceC3080.mo5201().iterator();
                                                while (it.hasNext()) {
                                                    for (InterfaceC22528 interfaceC22528 : ((InterfaceC9116) it.next()).mo20696()) {
                                                        if (!interfaceC22528.mo31474()) {
                                                            value = interfaceC22528.getValue();
                                                            if (!value.mo7252() && value.mo7251().getValue().equals(strSubstring)) {
                                                                C7050.m16212(new RunnableC12711(i2, c9154, interfaceC22528));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case -475309713:
                                            if (!typeName.equals("plurals")) {
                                                it = interfaceC3080.mo5201().iterator();
                                                while (it.hasNext()) {
                                                    while (r7.hasNext()) {
                                                        if (!interfaceC22528.mo31474()) {
                                                            value = interfaceC22528.getValue();
                                                            if (!value.mo7252()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 3355:
                                            if (!typeName.equals("id")) {
                                                it = interfaceC3080.mo5201().iterator();
                                                while (it.hasNext()) {
                                                    while (r7.hasNext()) {
                                                        if (!interfaceC22528.mo31474()) {
                                                            value = interfaceC22528.getValue();
                                                            if (!value.mo7252()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 3004913:
                                            if (!typeName.equals("attr")) {
                                                it = interfaceC3080.mo5201().iterator();
                                                while (it.hasNext()) {
                                                    while (r7.hasNext()) {
                                                        if (!interfaceC22528.mo31474()) {
                                                            value = interfaceC22528.getValue();
                                                            if (!value.mo7252()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 93090393:
                                            if (!typeName.equals("array")) {
                                                it = interfaceC3080.mo5201().iterator();
                                                while (it.hasNext()) {
                                                    while (r7.hasNext()) {
                                                        if (!interfaceC22528.mo31474()) {
                                                            value = interfaceC22528.getValue();
                                                            if (!value.mo7252()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 109780401:
                                            if (!typeName.equals("style")) {
                                                it = interfaceC3080.mo5201().iterator();
                                                while (it.hasNext()) {
                                                    while (r7.hasNext()) {
                                                        if (!interfaceC22528.mo31474()) {
                                                            value = interfaceC22528.getValue();
                                                            if (!value.mo7252()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            it = interfaceC3080.mo5201().iterator();
                                            while (it.hasNext()) {
                                                while (r7.hasNext()) {
                                                    if (!interfaceC22528.mo31474()) {
                                                        value = interfaceC22528.getValue();
                                                        if (!value.mo7252()) {
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
                        c19561.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            c19561.close();
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
