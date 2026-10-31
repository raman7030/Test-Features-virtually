package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩻ۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E7PU */
/* JADX INFO: loaded from: classes2.dex */
public final class C23446 extends C19879 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Pattern f75262 = Pattern.compile("(?sm).*^\\s*@deprecated( |$).*");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final StringBuilder f75263;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f75264;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C6513 f75265;

    public C23446(EnumC0162 enumC0162, C3691 c3691, char[] cArr, int i) {
        super(enumC0162, c3691, cArr, i);
        this.f75264 = null;
        this.f75265 = new C6513();
        this.f75263 = new StringBuilder();
    }

    @Override // l.C19879, l.InterfaceC5102
    public final String getText() throws Throwable {
        if (!this.f64172 && this.f64173 == EnumC0162.JAVADOC) {
            mo45710();
        }
        return this.f75264;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0070 A[Catch: all -> 0x010b, TryCatch #0 {all -> 0x010b, blocks: (B:21:0x0041, B:24:0x0049, B:26:0x0056, B:29:0x005d, B:34:0x006a, B:36:0x0070, B:39:0x0079, B:42:0x0081, B:43:0x0096, B:45:0x009e, B:46:0x00a2, B:48:0x00a8, B:50:0x00cd, B:49:0x00bb, B:33:0x0067, B:52:0x00d4, B:54:0x00da, B:57:0x00e2, B:59:0x00e8, B:60:0x00eb, B:61:0x00f6), top: B:78:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0079 A[Catch: all -> 0x010b, TRY_LEAVE, TryCatch #0 {all -> 0x010b, blocks: (B:21:0x0041, B:24:0x0049, B:26:0x0056, B:29:0x005d, B:34:0x006a, B:36:0x0070, B:39:0x0079, B:42:0x0081, B:43:0x0096, B:45:0x009e, B:46:0x00a2, B:48:0x00a8, B:50:0x00cd, B:49:0x00bb, B:33:0x0067, B:52:0x00d4, B:54:0x00da, B:57:0x00e2, B:59:0x00e8, B:60:0x00eb, B:61:0x00f6), top: B:78:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0096 A[Catch: all -> 0x010b, TryCatch #0 {all -> 0x010b, blocks: (B:21:0x0041, B:24:0x0049, B:26:0x0056, B:29:0x005d, B:34:0x006a, B:36:0x0070, B:39:0x0079, B:42:0x0081, B:43:0x0096, B:45:0x009e, B:46:0x00a2, B:48:0x00a8, B:50:0x00cd, B:49:0x00bb, B:33:0x0067, B:52:0x00d4, B:54:0x00da, B:57:0x00e2, B:59:0x00e8, B:60:0x00eb, B:61:0x00f6), top: B:78:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2 A[Catch: all -> 0x010b, TryCatch #0 {all -> 0x010b, blocks: (B:21:0x0041, B:24:0x0049, B:26:0x0056, B:29:0x005d, B:34:0x006a, B:36:0x0070, B:39:0x0079, B:42:0x0081, B:43:0x0096, B:45:0x009e, B:46:0x00a2, B:48:0x00a8, B:50:0x00cd, B:49:0x00bb, B:33:0x0067, B:52:0x00d4, B:54:0x00da, B:57:0x00e2, B:59:0x00e8, B:60:0x00eb, B:61:0x00f6), top: B:78:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a8 A[Catch: all -> 0x010b, TryCatch #0 {all -> 0x010b, blocks: (B:21:0x0041, B:24:0x0049, B:26:0x0056, B:29:0x005d, B:34:0x006a, B:36:0x0070, B:39:0x0079, B:42:0x0081, B:43:0x0096, B:45:0x009e, B:46:0x00a2, B:48:0x00a8, B:50:0x00cd, B:49:0x00bb, B:33:0x0067, B:52:0x00d4, B:54:0x00da, B:57:0x00e2, B:59:0x00e8, B:60:0x00eb, B:61:0x00f6), top: B:78:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb A[Catch: all -> 0x010b, TryCatch #0 {all -> 0x010b, blocks: (B:21:0x0041, B:24:0x0049, B:26:0x0056, B:29:0x005d, B:34:0x006a, B:36:0x0070, B:39:0x0079, B:42:0x0081, B:43:0x0096, B:45:0x009e, B:46:0x00a2, B:48:0x00a8, B:50:0x00cd, B:49:0x00bb, B:33:0x0067, B:52:0x00d4, B:54:0x00da, B:57:0x00e2, B:59:0x00e8, B:60:0x00eb, B:61:0x00f6), top: B:78:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x009e A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x006e -> B:51:0x00d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0081 -> B:51:0x00d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x009e -> B:51:0x00d1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // l.C19879
    /* JADX INFO: renamed from: ܺ */
    public final void mo45710() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23446.mo45710():void");
    }
}
