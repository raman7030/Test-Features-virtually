package bin.p000mt.json;

import java.io.Writer;
import p067l.C19843;
import p067l.C4420;

/* JADX INFO: loaded from: classes.dex */
public abstract class WriterConfig {
    public static WriterConfig MINIMAL = new C19843();
    public static WriterConfig PRETTY_PRINT = PrettyPrint.indentWithSpaces(2);

    public abstract C4420 createWriter(Writer writer);
}
