package bin.mt.json;

import java.io.Writer;
import l.C18386;
import l.C2158;

/* JADX INFO: loaded from: classes.dex */
public abstract class WriterConfig {
    public static WriterConfig MINIMAL = new C18386();
    public static WriterConfig PRETTY_PRINT = PrettyPrint.indentWithSpaces(2);

    public abstract C2158 createWriter(Writer writer);
}
