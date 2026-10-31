.class public final Ll/᩷ܿᩳ;
.super Ljava/lang/Object;
.source "OB8U"


# instance fields
.field public final ֫:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 32
    iput-object p1, p0, Ll/᩷ܿᩳ;->֫:Ljava/nio/ByteBuffer;

    return-void

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "buf == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(I)V
    .locals 4

    .line 152
    iget-object v0, p0, Ll/᩷ܿᩳ;->֫:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    if-lt v1, p1, :cond_0

    .line 157
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-void

    .line 153
    :cond_0
    new-instance v1, Ll/ܳܿᩳ;

    const-string v2, "Truncated contents. Need: "

    const-string v3, " bytes, available: "

    .line 0
    invoke-static {p1, v2, v3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 155
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 28
    invoke-direct {v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 155
    throw v1
.end method


# virtual methods
.method public final ֫()Ll/ܿܿᩳ;
    .locals 12

    .line 37
    iget-object v0, p0, Ll/᩷ܿᩳ;->֫:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v1

    .line 38
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 41
    :cond_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    and-int/lit8 v3, v2, 0x1f

    const/16 v4, 0x80

    const/4 v5, 0x0

    const/16 v6, 0x1f

    if-ne v3, v6, :cond_4

    const/4 v3, 0x0

    .line 112
    :cond_1
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 115
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v6

    const v7, 0xffffff

    if-gt v3, v7, :cond_2

    shl-int/lit8 v3, v3, 0x7

    and-int/lit8 v7, v6, 0x7f

    or-int/2addr v3, v7

    and-int/2addr v6, v4

    if-nez v6, :cond_1

    goto :goto_0

    .line 117
    :cond_2
    new-instance v0, Ll/ܳܿᩳ;

    const-string v1, "Tag number too large"

    .line 28
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 117
    throw v0

    .line 113
    :cond_3
    new-instance v0, Ll/ܳܿᩳ;

    const-string v1, "Truncated tag number"

    .line 28
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 113
    throw v0

    :cond_4
    :goto_0
    and-int/lit8 v6, v2, 0x20

    const/4 v7, 0x1

    if-eqz v6, :cond_5

    const/4 v6, 0x1

    goto :goto_1

    :cond_5
    const/4 v6, 0x0

    .line 45
    :goto_1
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v8

    if-eqz v8, :cond_13

    .line 48
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v8

    and-int/lit16 v9, v8, 0xff

    and-int/lit16 v10, v8, 0x80

    if-nez v10, :cond_6

    and-int/lit8 v4, v8, 0x7f

    .line 54
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v5

    sub-int/2addr v5, v1

    .line 55
    invoke-direct {p0, v4}, Ll/᩷ܿᩳ;->֫(I)V

    goto/16 :goto_6

    :cond_6
    if-eq v9, v4, :cond_b

    and-int/lit8 v4, v8, 0x7f

    const/4 v6, 0x4

    if-gt v4, v6, :cond_a

    const/4 v6, 0x0

    :goto_2
    if-ge v5, v4, :cond_9

    .line 138
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v7

    if-eqz v7, :cond_8

    .line 141
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v7

    const v8, 0x7fffff

    if-gt v6, v8, :cond_7

    shl-int/lit8 v6, v6, 0x8

    and-int/lit16 v7, v7, 0xff

    or-int/2addr v6, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 143
    :cond_7
    new-instance v0, Ll/ܳܿᩳ;

    const-string v1, "Length too large"

    .line 28
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 143
    throw v0

    .line 139
    :cond_8
    new-instance v0, Ll/ܳܿᩳ;

    const-string v1, "Truncated length"

    .line 28
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 139
    throw v0

    .line 59
    :cond_9
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v4

    sub-int/2addr v4, v1

    .line 60
    invoke-direct {p0, v6}, Ll/᩷ܿᩳ;->֫(I)V

    move v5, v4

    move v4, v6

    goto/16 :goto_6

    .line 134
    :cond_a
    new-instance v0, Ll/ܳܿᩳ;

    const-string v1, "Length too large: "

    const-string v2, " bytes"

    .line 0
    invoke-static {v4, v1, v2}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 28
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 134
    throw v0

    .line 63
    :cond_b
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v4

    sub-int/2addr v4, v1

    const-string v5, " bytes read"

    const-string v8, "Truncated indefinite-length contents: "

    if-eqz v6, :cond_e

    .line 192
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v6

    .line 193
    :goto_3
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v9

    if-eqz v9, :cond_d

    .line 195
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v9

    if-le v9, v7, :cond_c

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v9

    invoke-virtual {v0, v9}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v9

    if-nez v9, :cond_c

    .line 196
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v5

    sub-int/2addr v5, v6

    .line 197
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v6

    add-int/lit8 v6, v6, 0x2

    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_5

    .line 201
    :cond_c
    invoke-virtual {p0}, Ll/᩷ܿᩳ;->֫()Ll/ܿܿᩳ;

    goto :goto_3

    .line 204
    :cond_d
    new-instance v1, Ll/ܳܿᩳ;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 206
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    sub-int/2addr v0, v6

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 28
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 206
    throw v1

    :cond_e
    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 165
    :goto_4
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v9

    if-eqz v9, :cond_12

    .line 170
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v9

    add-int/lit8 v10, v6, 0x1

    if-ltz v10, :cond_11

    if-nez v9, :cond_10

    if-eqz v7, :cond_f

    add-int/lit8 v5, v6, -0x1

    :goto_5
    move v11, v5

    move v5, v4

    move v4, v11

    .line 71
    :goto_6
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v6

    .line 72
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 73
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v1

    .line 74
    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 75
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v6

    .line 76
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v7

    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 77
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 80
    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    add-int/2addr v5, v4

    .line 81
    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 82
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 83
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 85
    new-instance v1, Ll/ܿܿᩳ;

    and-int/lit16 v2, v2, 0xff

    shr-int/lit8 v2, v2, 0x6

    .line 88
    invoke-direct {v1, v6, v0, v2, v3}, Ll/ܿܿᩳ;-><init>(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;II)V

    return-object v1

    :cond_f
    const/4 v6, 0x1

    const/4 v7, 0x1

    goto :goto_7

    :cond_10
    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_7
    move v6, v10

    goto :goto_4

    .line 173
    :cond_11
    new-instance v0, Ll/ܳܿᩳ;

    const-string v1, "Indefinite-length contents too long"

    .line 28
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 173
    throw v0

    .line 166
    :cond_12
    new-instance v0, Ll/ܳܿᩳ;

    .line 0
    invoke-static {v6, v8, v5}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 28
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 166
    throw v0

    .line 46
    :cond_13
    new-instance v0, Ll/ܳܿᩳ;

    const-string v1, "Missing length"

    .line 28
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 46
    throw v0
.end method
