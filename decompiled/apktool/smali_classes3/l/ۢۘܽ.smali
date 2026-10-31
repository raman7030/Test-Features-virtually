.class public final Ll/ۢۘܽ;
.super Ljava/lang/Object;
.source "X7GP"


# instance fields
.field public final ֫:Ll/ܺۢᩴ;

.field public final ۧ:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/ۢۘܽ;->ۧ:Ljava/lang/StringBuilder;

    .line 15
    new-instance v0, Ll/ܺۢᩴ;

    invoke-direct {v0}, Ll/ܺۢᩴ;-><init>()V

    iput-object v0, p0, Ll/ۢۘܽ;->֫:Ll/ܺۢᩴ;

    return-void
.end method

.method public static ֫(C)V
    .locals 1

    const/16 v0, 0x9

    if-eq p0, v0, :cond_0

    const/16 v0, 0xa

    if-eq p0, v0, :cond_0

    const/16 v0, 0xd

    if-eq p0, v0, :cond_0

    const/16 v0, 0x20

    if-eq p0, v0, :cond_0

    .line 204
    invoke-static {p0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    const-string p0, "null"

    return-object p0

    :cond_0
    const-string v0, "\n"

    const-string v1, "\\n"

    .line 188
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "\r"

    const-string v1, "\\r"

    .line 189
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "\t"

    const-string v1, "\\t"

    .line 190
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(I)I
    .locals 3

    .line 114
    iget-object v0, p0, Ll/ۢۘܽ;->֫:Ll/ܺۢᩴ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, -0x1

    if-gez p1, :cond_0

    return v1

    .line 125
    :cond_0
    invoke-virtual {v0}, Ll/ܺۢᩴ;->size()I

    move-result v2

    if-ne p1, v2, :cond_2

    .line 126
    invoke-virtual {v0}, Ll/ܺۢᩴ;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    return p1

    .line 132
    :cond_1
    invoke-virtual {v0}, Ll/ܺۢᩴ;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, Ll/ܺۢᩴ;->getInt(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    return p1

    .line 140
    :cond_2
    invoke-virtual {v0}, Ll/ܺۢᩴ;->size()I

    move-result v2

    if-le p1, v2, :cond_3

    .line 143
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v1

    .line 148
    :cond_3
    invoke-virtual {v0, p1}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v0

    .line 150
    iget-object v1, p0, Ll/ۢۘܽ;->ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-ge p1, v2, :cond_4

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result p1

    goto :goto_0

    :cond_4
    const/16 p1, 0x3f

    .line 152
    :goto_0
    invoke-static {p1}, Ll/ۢۘܽ;->֫(C)V

    return v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 9

    if-eqz p1, :cond_0

    .line 19
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "null"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    const/16 v0, 0x1f4

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 20
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v2, v0, :cond_1

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_2

    .line 23
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 27
    :cond_2
    :goto_1
    iget-object v0, p0, Ll/ۢۘܽ;->֫:Ll/ܺۢᩴ;

    invoke-virtual {v0}, Ll/ܺۢᩴ;->clear()V

    .line 28
    iget-object v2, p0, Ll/ۢۘܽ;->ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 30
    new-instance v3, Ll/۟ۖܽ;

    invoke-direct {v3}, Ll/۟ۖܽ;-><init>()V

    .line 31
    new-instance v4, Ljava/io/StringReader;

    invoke-direct {v4, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ll/۟ۖܽ;->֫(Ljava/io/Reader;)V

    .line 33
    invoke-virtual {v3}, Ll/۟ۖܽ;->ܿ()I

    move-result p1

    :goto_2
    const/16 v4, 0x32

    const/4 v5, 0x1

    if-eq p1, v5, :cond_7

    const/4 v5, 0x4

    if-ne p1, v5, :cond_6

    .line 49
    invoke-virtual {v3}, Ll/۟ۖܽ;->ܺ()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 51
    invoke-static {p1}, Ll/ۢۘܽ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    :cond_3
    if-eqz p1, :cond_6

    .line 55
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_6

    .line 57
    invoke-virtual {v3}, Ll/۟ۖܽ;->ۢ()I

    move-result v5

    .line 61
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v6, 0x0

    .line 66
    :goto_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v6, v7, :cond_5

    .line 67
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    add-int v8, v5, v6

    .line 69
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    invoke-virtual {v0, v8}, Ll/ܺۢᩴ;->add(I)Z

    .line 72
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v8

    if-gt v8, v4, :cond_4

    .line 73
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 74
    invoke-static {v7}, Ll/ۢۘܽ;->֫(C)V

    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 78
    :cond_5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-le p1, v4, :cond_6

    .line 80
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 86
    :cond_6
    invoke-virtual {v3}, Ll/۟ۖܽ;->ۖ()I

    move-result p1

    goto :goto_2

    .line 91
    :cond_7
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 92
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result p1

    const/16 v3, 0xc8

    if-ge p1, v3, :cond_8

    .line 94
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۢۘܽ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    goto :goto_4

    .line 97
    :cond_8
    invoke-virtual {v2, v1, v3}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۢۘܽ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    :goto_4
    invoke-virtual {v0}, Ll/ܺۢᩴ;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_9

    return-void

    .line 213
    :cond_9
    invoke-virtual {v0}, Ll/ܺۢᩴ;->size()I

    move-result p1

    invoke-static {p1, v4}, Ljava/lang/Math;->min(II)I

    move-result p1

    :goto_5
    if-ge v1, p1, :cond_a

    .line 216
    invoke-virtual {v0, v1}, Ll/ܺۢᩴ;->getInt(I)I

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_a
    return-void
.end method
