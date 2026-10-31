.class public final Ll/ۚᩴܺ;
.super Ljava/lang/Object;
.source "K3GW"


# instance fields
.field public final ֫:Ljava/lang/StringBuffer;

.field public final ۧ:Ll/᩻ᩴܺ;

.field public final ܳ:Ll/᩻ᩴܺ;

.field public final ܽ:I

.field public final ܿ:Ljava/lang/StringBuffer;

.field public final ᩳ:Ljava/io/Writer;


# direct methods
.method public constructor <init>(Ljava/io/StringWriter;IILjava/lang/String;)V
    .locals 3

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-lt p2, v0, :cond_1

    if-lt p3, v0, :cond_0

    .line 118
    new-instance v0, Ljava/io/StringWriter;

    const/16 v1, 0x3e8

    invoke-direct {v0, v1}, Ljava/io/StringWriter;-><init>(I)V

    .line 119
    new-instance v2, Ljava/io/StringWriter;

    invoke-direct {v2, v1}, Ljava/io/StringWriter;-><init>(I)V

    .line 121
    iput-object p1, p0, Ll/ۚᩴܺ;->ᩳ:Ljava/io/Writer;

    .line 122
    iput p2, p0, Ll/ۚᩴܺ;->ܽ:I

    .line 123
    invoke-virtual {v0}, Ljava/io/StringWriter;->getBuffer()Ljava/lang/StringBuffer;

    move-result-object p1

    iput-object p1, p0, Ll/ۚᩴܺ;->֫:Ljava/lang/StringBuffer;

    .line 124
    invoke-virtual {v2}, Ljava/io/StringWriter;->getBuffer()Ljava/lang/StringBuffer;

    move-result-object p1

    iput-object p1, p0, Ll/ۚᩴܺ;->ܿ:Ljava/lang/StringBuffer;

    .line 125
    new-instance p1, Ll/᩻ᩴܺ;

    const-string v1, ""

    .line 98
    invoke-direct {p1, v0, p2, v1}, Ll/᩻ᩴܺ;-><init>(Ljava/io/StringWriter;ILjava/lang/String;)V

    .line 125
    iput-object p1, p0, Ll/ۚᩴܺ;->ۧ:Ll/᩻ᩴܺ;

    .line 126
    new-instance p1, Ll/᩻ᩴܺ;

    invoke-direct {p1, v2, p3, p4}, Ll/᩻ᩴܺ;-><init>(Ljava/io/StringWriter;ILjava/lang/String;)V

    iput-object p1, p0, Ll/ۚᩴܺ;->ܳ:Ll/᩻ᩴܺ;

    return-void

    .line 111
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "rightWidth < 1"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 107
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "leftWidth < 1"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 103
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "out == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 74
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    .line 75
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    .line 77
    new-instance v2, Ljava/io/StringWriter;

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x3

    invoke-direct {v2, v0}, Ljava/io/StringWriter;-><init>(I)V

    .line 78
    new-instance v0, Ll/ۚᩴܺ;

    const-string v1, ""

    invoke-direct {v0, v2, p1, p2, v1}, Ll/ۚᩴܺ;-><init>(Ljava/io/StringWriter;IILjava/lang/String;)V

    .line 149
    :try_start_0
    iget-object p1, v0, Ll/ۚᩴܺ;->ۧ:Ll/᩻ᩴܺ;

    .line 82
    invoke-virtual {p1, p0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 158
    iget-object p0, v0, Ll/ۚᩴܺ;->ܳ:Ll/᩻ᩴܺ;

    .line 83
    invoke-virtual {p0, p3}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 167
    iget-object p0, v0, Ll/ۚᩴܺ;->ܿ:Ljava/lang/StringBuffer;

    iget-object p1, v0, Ll/ۚᩴܺ;->֫:Ljava/lang/StringBuffer;

    iget-object p2, v0, Ll/ۚᩴܺ;->ܳ:Ll/᩻ᩴܺ;

    iget-object p3, v0, Ll/ۚᩴܺ;->ۧ:Ll/᩻ᩴܺ;

    :try_start_1
    invoke-static {p1, p3}, Ll/ۚᩴܺ;->֫(Ljava/lang/StringBuffer;Ljava/io/Writer;)V

    .line 168
    invoke-static {p0, p2}, Ll/ۚᩴܺ;->֫(Ljava/lang/StringBuffer;Ljava/io/Writer;)V

    .line 169
    invoke-direct {v0}, Ll/ۚᩴܺ;->֫()V

    .line 216
    invoke-static {p1, p3}, Ll/ۚᩴܺ;->֫(Ljava/lang/StringBuffer;Ljava/io/Writer;)V

    .line 218
    :goto_0
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->length()I

    move-result v1

    const/16 v3, 0xa

    if-eqz v1, :cond_0

    .line 219
    invoke-virtual {p2, v3}, Ll/᩻ᩴܺ;->write(I)V

    .line 220
    invoke-direct {v0}, Ll/ۚᩴܺ;->֫()V

    goto :goto_0

    .line 229
    :cond_0
    invoke-static {p0, p2}, Ll/ۚᩴܺ;->֫(Ljava/lang/StringBuffer;Ljava/io/Writer;)V

    .line 231
    :goto_1
    invoke-virtual {p0}, Ljava/lang/StringBuffer;->length()I

    move-result p1

    if-eqz p1, :cond_1

    .line 232
    invoke-virtual {p3, v3}, Ll/᩻ᩴܺ;->write(I)V

    .line 233
    invoke-direct {v0}, Ll/ۚᩴܺ;->֫()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 89
    :cond_1
    invoke-virtual {v2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    .line 173
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    .line 85
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "shouldn\'t happen"

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method private ֫()V
    .locals 8

    .line 185
    :goto_0
    iget-object v0, p0, Ll/ۚᩴܺ;->֫:Ljava/lang/StringBuffer;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-gez v2, :cond_0

    goto :goto_1

    .line 190
    :cond_0
    iget-object v3, p0, Ll/ۚᩴܺ;->ܿ:Ljava/lang/StringBuffer;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-gez v1, :cond_1

    :goto_1
    return-void

    :cond_1
    const/4 v4, 0x0

    .line 195
    iget-object v5, p0, Ll/ۚᩴܺ;->ᩳ:Ljava/io/Writer;

    if-eqz v2, :cond_2

    .line 196
    invoke-virtual {v0, v4, v2}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_2
    if-eqz v1, :cond_4

    .line 200
    iget v6, p0, Ll/ۚᩴܺ;->ܽ:I

    sub-int/2addr v6, v2

    :goto_2
    if-lez v6, :cond_3

    const/16 v7, 0x20

    .line 262
    invoke-virtual {v5, v7}, Ljava/io/Writer;->write(I)V

    add-int/lit8 v6, v6, -0x1

    goto :goto_2

    .line 201
    :cond_3
    invoke-virtual {v3, v4, v1}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_4
    const/16 v6, 0xa

    .line 204
    invoke-virtual {v5, v6}, Ljava/io/Writer;->write(I)V

    add-int/lit8 v2, v2, 0x1

    .line 206
    invoke-virtual {v0, v4, v2}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    .line 207
    invoke-virtual {v3, v4, v1}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;

    goto :goto_0
.end method

.method public static ֫(Ljava/lang/StringBuffer;Ljava/io/Writer;)V
    .locals 1

    .line 247
    invoke-virtual {p0}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    .line 249
    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result p0

    const/16 v0, 0xa

    if-eq p0, v0, :cond_0

    .line 250
    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(I)V

    :cond_0
    return-void
.end method
