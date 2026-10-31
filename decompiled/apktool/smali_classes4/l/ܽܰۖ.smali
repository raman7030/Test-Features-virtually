.class public final Ll/ܽܰۖ;
.super Ljava/lang/Object;
.source "J9EH"


# static fields
.field public static final ֫:Ljava/nio/charset/Charset;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 35
    sget-object v0, Ll/۠ܰۖ;->ᩳ:Ljava/nio/charset/Charset;

    sput-object v0, Ll/ܽܰۖ;->֫:Ljava/nio/charset/Charset;

    return-void
.end method

.method public static ֫(Ll/ۖ֫ۘ;[B[B)[B
    .locals 2

    .line 124
    array-length v0, p2

    new-array v0, v0, [B

    .line 126
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    invoke-static {}, Ll/ܰ۟ۖ;->֫()Ll/᩵۟ۖ;

    move-result-object p0

    .line 127
    sget-object v1, Ll/ᩴ۟ۖ;->᩶:Ll/ᩴ۟ۖ;

    invoke-interface {p0, v1, p1}, Ll/᩵۟ۖ;->֫(Ll/ᩴ۟ۖ;[B)V

    .line 128
    array-length p1, p2

    invoke-interface {p0, p1, p2, v0}, Ll/᩵۟ۖ;->֫(I[B[B)I

    move-result p1

    .line 129
    invoke-interface {p0, v0, p1}, Ll/᩵۟ۖ;->doFinal([BI)I
    :try_end_0
    .catch Ll/۠۟ۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 131
    new-instance p1, Ll/ۙ᩺ۖ;

    .line 34
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 131
    throw p1
.end method

.method public static varargs ֫(Ll/ۖ֫ۘ;[B[[B)[B
    .locals 2

    :try_start_0
    const-string v0, "HMACT64"

    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Ll/ۖ֫ۘ;->ۧ(Ljava/lang/String;)Ll/ۚ۟ۖ;

    move-result-object p0

    .line 93
    invoke-interface {p0, p1}, Ll/ۚ۟ۖ;->init([B)V

    .line 94
    array-length p1, p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    aget-object v1, p2, v0

    .line 95
    invoke-interface {p0, v1}, Ll/ۚ۟ۖ;->update([B)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 97
    :cond_0
    invoke-interface {p0}, Ll/ۚ۟ۖ;->֫()[B

    move-result-object p0
    :try_end_0
    .catch Ll/۠۟ۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 99
    new-instance p1, Ll/ۙ᩺ۖ;

    .line 34
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 99
    throw p1
.end method

.method public static varargs ֫(Ll/ۖ֫ۘ;[[B)[B
    .locals 3

    :try_start_0
    const-string v0, "MD5"

    .line 105
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Ll/ۖ֫ۘ;->֫(Ljava/lang/String;)Ll/ܺ֫ۘ;

    move-result-object p0

    .line 106
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 107
    invoke-virtual {p0, v2}, Ll/ܺ֫ۘ;->֫([B)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 109
    :cond_0
    invoke-virtual {p0}, Ll/ܺ֫ۘ;->֫()[B

    move-result-object p0
    :try_end_0
    .catch Ll/۠۟ۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 111
    new-instance p1, Ll/ۙ᩺ۖ;

    .line 34
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 111
    throw p1
.end method
