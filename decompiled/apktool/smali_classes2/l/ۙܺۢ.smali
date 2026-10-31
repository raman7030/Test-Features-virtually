.class public final Ll/ۙܺۢ;
.super Ljava/lang/Object;
.source "F75A"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ᩸:J

.field public final ᩹:Z


# direct methods
.method public constructor <init>(JZ)V
    .locals 3

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-eqz v2, :cond_0

    .line 17
    iput-wide p1, p0, Ll/ۙܺۢ;->᩸:J

    .line 18
    iput-boolean p3, p0, Ll/ۙܺۢ;->᩹:Z

    return-void

    .line 15
    :cond_0
    new-instance p1, Ll/᩺ܺۢ;

    const-string p2, "Unable to open ELF search session"

    .line 12
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 15
    throw p1
.end method

.method public static ֫(Ljava/lang/String;Z)Ll/ۙܺۢ;
    .locals 3

    .line 25
    new-instance v0, Ll/ۙܺۢ;

    .line 26
    invoke-static {p0, p1}, Lbin/mt/radare2/Radare2Native;->nativeOpenElfSearchSession(Ljava/lang/String;Z)J

    move-result-wide v1

    invoke-direct {v0, v1, v2, p1}, Ll/ۙܺۢ;-><init>(JZ)V

    return-object v0
.end method

.method public static ֫(II)V
    .locals 1

    if-ltz p0, :cond_3

    const/4 v0, -0x1

    if-lt p1, v0, :cond_2

    if-ltz p1, :cond_1

    if-gt p0, p1, :cond_0

    goto :goto_0

    .line 86
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "offset must not exceed knownTotalCount"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void

    .line 83
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "knownTotalCount must be -1 or non-negative"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 77
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "offset must be non-negative"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 105
    iget-wide v0, p0, Ll/ۙܺۢ;->᩸:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-void

    .line 109
    :cond_0
    iput-wide v2, p0, Ll/ۙܺۢ;->᩸:J

    .line 110
    invoke-static {v0, v1}, Lbin/mt/radare2/Radare2Native;->nativeCloseElfSearchSession(J)V

    return-void
.end method

.method public final ֫(IIJ)Ll/۫ܺۢ;
    .locals 10

    .line 56
    iget-boolean v0, p0, Ll/ۙܺۢ;->᩹:Z

    if-eqz v0, :cond_3

    .line 59
    invoke-static {p1, p2}, Ll/ۙܺۢ;->֫(II)V

    const-wide/16 v0, -0x1

    cmp-long v2, p3, v0

    if-ltz v2, :cond_2

    .line 94
    iget-wide v3, p0, Ll/ۙܺۢ;->᩸:J

    const-wide/16 v0, 0x0

    cmp-long v2, v3, v0

    if-eqz v2, :cond_1

    const/16 v6, 0x400

    move v5, p1

    move v7, p2

    move-wide v8, p3

    .line 64
    invoke-static/range {v3 .. v9}, Lbin/mt/radare2/Radare2Native;->nativeReadElfSearchSessionStrings(JIIIJ)Ljava/lang/String;

    move-result-object p1

    .line 63
    invoke-static {p1}, Ll/᩻ۖۢ;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, Ll/۫ܺۢ;->֫(Lbin/mt/json/JSONObject;)Ll/۫ܺۢ;

    move-result-object p1

    .line 66
    iget p2, p1, Ll/۫ܺۢ;->ᩳ:I

    iget p3, p1, Ll/۫ܺۢ;->ܿ:I

    if-gt p2, p3, :cond_0

    iget-wide p2, p1, Ll/۫ܺۢ;->ܽ:J

    cmp-long p4, p2, v0

    if-ltz p4, :cond_0

    return-object p1

    .line 67
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid ELF string search page"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 95
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ELF search session is closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 61
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "scanOffset must be -1 or non-negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 57
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Symbol search session cannot read ELF strings"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(IILjava/lang/String;)Ll/᩸ܺۢ;
    .locals 9

    .line 34
    iget-boolean v0, p0, Ll/ۙܺۢ;->᩹:Z

    if-nez v0, :cond_2

    .line 37
    invoke-static {p3}, Ll/ܶܺۢ;->ۧ(Ljava/lang/String;)V

    .line 41
    invoke-static {p1, p2}, Ll/ۙܺۢ;->֫(II)V

    .line 94
    iget-wide v1, p0, Ll/ۙܺۢ;->᩸:J

    const-wide/16 v3, 0x0

    cmp-long v0, v1, v3

    if-eqz v0, :cond_1

    const-string v4, ""

    const/4 v5, 0x1

    const/16 v7, 0x400

    move-object v3, p3

    move v6, p1

    move v8, p2

    .line 43
    invoke-static/range {v1 .. v8}, Lbin/mt/radare2/Radare2Native;->nativeReadElfSearchSessionItems(JLjava/lang/String;Ljava/lang/String;ZIII)Ljava/lang/String;

    move-result-object p1

    .line 42
    invoke-static {p1}, Ll/᩻ۖۢ;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ܺۢ;->֫(Lbin/mt/json/JSONObject;)Ll/᩸ܺۢ;

    move-result-object p1

    .line 45
    iget p2, p1, Ll/᩸ܺۢ;->ᩳ:I

    iget p3, p1, Ll/᩸ܺۢ;->ܿ:I

    if-gt p2, p3, :cond_0

    return-object p1

    .line 46
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "offset must not exceed totalCount"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 95
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ELF search session is closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 35
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "String-only search session cannot read ELF items"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
