.class public abstract Ll/ۨۘ֡;
.super Ljava/lang/Object;
.source "52DI"


# static fields
.field public static final ֫:[C


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [C

    .line 38
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۨۘ֡;->֫:[C

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract ֫(Ljava/lang/CharSequence;ILjava/io/StringWriter;)I
.end method

.method public final ֫(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 6

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 67
    :cond_0
    :try_start_0
    new-instance v0, Ljava/io/StringWriter;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/io/StringWriter;-><init>(I)V

    .line 90
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    :cond_1
    :goto_0
    if-ge v2, v1, :cond_4

    .line 92
    invoke-virtual {p0, p1, v2, v0}, Ll/ۨۘ֡;->֫(Ljava/lang/CharSequence;ILjava/io/StringWriter;)I

    move-result v3

    if-nez v3, :cond_3

    .line 96
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 97
    invoke-virtual {v0, v3}, Ljava/io/Writer;->write(I)V

    add-int/lit8 v4, v2, 0x1

    .line 99
    invoke-static {v3}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v3

    if-eqz v3, :cond_2

    if-ge v4, v1, :cond_2

    .line 100
    invoke-interface {p1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 101
    invoke-static {v3}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 102
    invoke-virtual {v0, v3}, Ljava/io/Writer;->write(I)V

    add-int/lit8 v2, v2, 0x2

    goto :goto_0

    :cond_2
    move v2, v4

    goto :goto_0

    :cond_3
    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_1

    .line 111
    invoke-static {p1, v2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->charCount(I)I

    move-result v5

    add-int/2addr v2, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 69
    :cond_4
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 72
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
