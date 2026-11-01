package org.chromium.support_lib_boundary;

import android.content.Context;
import android.webkit.WebView;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import p067l.C24719;

/* JADX INFO: loaded from: classes2.dex */
public interface WebViewBuilderBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Baseline {
        public static final int DEFAULT = 0;
    }

    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConfigField {
        public static final int BASELINE = 0;
        public static final int JAVASCRIPT_INTERFACE = 1;
    }

    WebView build(Context context, Consumer consumer);

    public class Config implements Consumer {
        public int baseline = 0;

        /* JADX INFO: renamed from: ᩹ */
        public ArrayList f81802 = new ArrayList();

        /* JADX INFO: renamed from: ᩸ */
        public ArrayList f81801 = new ArrayList();

        /* JADX INFO: renamed from: ᩶ */
        public ArrayList f81800 = new ArrayList();

        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return C24719.$default$andThen(this, consumer);
        }

        public void addJavascriptInterface(Object obj, String str, List list) {
            this.f81802.add(obj);
            this.f81801.add(str);
            this.f81800.add(list);
        }

        @Override // java.util.function.Consumer
        public void accept(BiConsumer biConsumer) {
            biConsumer.accept(0, Integer.valueOf(this.baseline));
            biConsumer.accept(1, new Object[]{this.f81802, this.f81801, this.f81800});
        }
    }
}
