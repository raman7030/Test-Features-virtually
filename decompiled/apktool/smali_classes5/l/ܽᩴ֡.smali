.class public final Ll/ܽᩴ֡;
.super Ll/᩺ۘ֡;
.source "A2DO"


# instance fields
.field public final ۧ:I

.field public final ܽ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Ll/ۨۘ֡;-><init>()V

    const/16 v0, 0x20

    .line 55
    iput v0, p0, Ll/ܽᩴ֡;->ܽ:I

    const/16 v0, 0x7f

    .line 56
    iput v0, p0, Ll/ܽᩴ֡;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫(ILjava/io/StringWriter;)Z
    .locals 5

    .line 112
    iget v0, p0, Ll/ܽᩴ֡;->ܽ:I

    const/4 v1, 0x0

    if-lt p1, v0, :cond_0

    iget v0, p0, Ll/ܽᩴ֡;->ۧ:I

    if-gt p1, v0, :cond_0

    return v1

    :cond_0
    const v0, 0xffff

    const/4 v2, 0x1

    const-string v3, "\\u"

    if-le p1, v0, :cond_1

    .line 109
    invoke-static {p1}, Ljava/lang/Character;->toChars(I)[C

    move-result-object p1

    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-char v1, p1, v1

    .line 138
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v1, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-char p1, p1, v2

    .line 138
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    .line 110
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 118
    invoke-virtual {p2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return v2

    .line 120
    :cond_1
    invoke-virtual {p2, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    shr-int/lit8 v0, p1, 0xc

    and-int/lit8 v0, v0, 0xf

    .line 121
    sget-object v1, Ll/ۨۘ֡;->֫:[C

    aget-char v0, v1, v0

    invoke-virtual {p2, v0}, Ljava/io/Writer;->write(I)V

    shr-int/lit8 v0, p1, 0x8

    and-int/lit8 v0, v0, 0xf

    .line 122
    aget-char v0, v1, v0

    invoke-virtual {p2, v0}, Ljava/io/Writer;->write(I)V

    shr-int/lit8 v0, p1, 0x4

    and-int/lit8 v0, v0, 0xf

    .line 123
    aget-char v0, v1, v0

    invoke-virtual {p2, v0}, Ljava/io/Writer;->write(I)V

    and-int/lit8 p1, p1, 0xf

    .line 124
    aget-char p1, v1, p1

    invoke-virtual {p2, p1}, Ljava/io/Writer;->write(I)V

    return v2
.end method
