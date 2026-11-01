package p067l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩻ۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E7PU */
/* JADX INFO: loaded from: classes2.dex */
public final class C24651 extends C21261 {

    /* JADX INFO: renamed from: ۚ */
    public static final Pattern f78010 = Pattern.compile("(?sm).*^\\s*@deprecated( |$).*");

    /* JADX INFO: renamed from: ֡ */
    public final StringBuilder f78011;

    /* JADX INFO: renamed from: ᩴ */
    public String f78012;

    /* JADX INFO: renamed from: ᩵ */
    public C8558 f78013;

    public C24651(EnumC2522 enumC2522, C5876 c5876, char[] cArr, int i) {
        super(enumC2522, c5876, cArr, i);
        this.f78012 = null;
        this.f78013 = new C8558();
        this.f78011 = new StringBuilder();
    }

    @Override // p067l.C21261, p067l.InterfaceC7217
    public final String getText() throws Throwable {
        if (!this.f66808 && this.f66809 == EnumC2522.JAVADOC) {
            mo48021();
        }
        return this.f78012;
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
    @Override // p067l.C21261
    /* JADX INFO: renamed from: ܺ */
    public final void mo48021() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C24651.mo48021():void");
    }
}
