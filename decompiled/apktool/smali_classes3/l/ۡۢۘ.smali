.class public abstract Ll/ۡۢۘ;
.super Ll/ᩳۢۘ;
.source "S7V8"


# instance fields
.field public ۖ:[B

.field public ۘ:[B


# direct methods
.method public constructor <init>(Ll/᩹᩷ۘ;[B[B)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Ll/ᩳۢۘ;-><init>(Ll/᩹᩷ۘ;)V

    .line 37
    iput-object p2, p0, Ll/ۡۢۘ;->ۘ:[B

    .line 38
    iput-object p3, p0, Ll/ۡۢۘ;->ۖ:[B

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 274
    iget-object v0, p0, Ll/ۡۢۘ;->ۖ:[B

    invoke-static {v0}, Ll/᩵ۡۘ;->ۧ([B)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;[B)[B
    .locals 3

    const/4 v0, 0x0

    .line 205
    :try_start_0
    invoke-static {p1}, Ll/᩶᩷ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ll/᩻ۡۘ;

    invoke-virtual {v1, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    .line 206
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻ۡۘ;

    .line 207
    invoke-interface {v1}, Ll/ᩳۡۘ;->init()V

    .line 208
    iget-object v2, p0, Ll/ۡۢۘ;->ۖ:[B

    invoke-interface {v1, v2}, Ll/᩻ۡۘ;->֫([B)V

    .line 210
    invoke-interface {v1, p2}, Ll/ᩳۡۘ;->update([B)V

    .line 211
    invoke-interface {v1}, Ll/ᩳۡۘ;->sign()[B

    move-result-object p2

    .line 213
    sget-object v1, Ll/᩵ۡۘ;->ܽ:[B

    .line 397
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 393
    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const/4 v1, 0x2

    new-array v1, v1, [[B

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p2, v1, p1

    .line 215
    invoke-static {v1}, Ll/ܺ᩻ۘ;->֫([[B)Ll/ܺ᩻ۘ;

    move-result-object p1

    iget-object p1, p1, Ll/ܺ᩻ۘ;->֫:[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 217
    :catch_0
    iget-object p1, p0, Ll/ᩳۢۘ;->ܿ:Ll/᩹᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    sget-object p1, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    .line 217
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0
.end method

.method public final ۧ()[B
    .locals 7

    .line 919
    iget-boolean v0, p0, Ll/ᩳۢۘ;->ܽ:Z

    if-nez v0, :cond_0

    .line 258
    new-instance v0, Ll/ܺ᩻ۘ;

    invoke-direct {v0}, Ll/ܺ᩻ۘ;-><init>()V

    .line 259
    invoke-virtual {p0}, Ll/ۡۢۘ;->ᩳ()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 260
    iget-object v1, p0, Ll/ۡۢۘ;->ۘ:[B

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 261
    iget-object v1, p0, Ll/ۡۢۘ;->ۖ:[B

    array-length v2, v1

    iget-object v3, p0, Ll/ۡۢۘ;->ۘ:[B

    array-length v3, v3

    add-int/2addr v2, v3

    new-array v3, v2, [B

    .line 262
    array-length v4, v1

    const/4 v5, 0x0

    invoke-static {v1, v5, v3, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 263
    iget-object v1, p0, Ll/ۡۢۘ;->ۘ:[B

    iget-object v4, p0, Ll/ۡۢۘ;->ۖ:[B

    array-length v4, v4

    array-length v6, v1

    invoke-static {v1, v5, v3, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 65
    invoke-virtual {v0, v5, v2, v3}, Ll/ܺ᩻ۘ;->ܽ(II[B)V

    .line 265
    iget-object v1, p0, Ll/ᩳۢۘ;->ۜ:Ljava/lang/String;

    .line 397
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v1, v2}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 265
    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 266
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ᩳ()I

    move-result v1

    new-array v2, v1, [B

    .line 267
    invoke-virtual {v0, v5, v1, v2}, Ll/ܺ᩻ۘ;->֫(II[B)V

    return-object v2

    .line 256
    :cond_0
    new-instance v0, Ll/۫᩷ۘ;

    const-string v1, "key is encrypted."

    .line 39
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 256
    throw v0
.end method

.method public final ۧ([B)[B
    .locals 1

    .line 198
    invoke-virtual {p0}, Ll/ۡۢۘ;->᩻()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Ll/ۡۢۘ;->֫(Ljava/lang/String;[B)[B

    move-result-object p1

    return-object p1
.end method

.method public abstract ܳ()Ljava/lang/String;
.end method

.method public final ܽ([B)Z
    .locals 6

    .line 113
    iget v0, p0, Ll/ᩳۢۘ;->ۡ:I

    const/4 v1, 0x2

    iget-object v2, p0, Ll/ᩳۢۘ;->ܿ:Ll/᩹᩷ۘ;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v0, v1, :cond_4

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    goto/16 :goto_0

    :cond_0
    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 131
    :try_start_0
    new-instance v0, Ll/ܺ᩻ۘ;

    invoke-direct {v0, p1}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 132
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p1

    .line 133
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v1

    if-ne p1, v1, :cond_1

    .line 138
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    invoke-static {p1}, Ll/᩵ۡۘ;->֫([B)Ljava/lang/String;

    .line 139
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    iput-object p1, p0, Ll/ۡۢۘ;->ۘ:[B

    .line 142
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    .line 143
    invoke-virtual {p0}, Ll/ᩳۢۘ;->ܽ()I

    move-result v1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Ll/ۡۢۘ;->ۖ:[B

    .line 144
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    .line 409
    array-length v0, p1

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, p1, v4, v0, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 144
    iput-object v5, p0, Ll/ᩳۢۘ;->ۜ:Ljava/lang/String;

    return v3

    .line 135
    :cond_1
    new-instance p1, Ll/۫᩷ۘ;

    const-string v0, "check failed"

    .line 39
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 135
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    :catch_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    sget-object p1, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    .line 148
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v4

    :cond_2
    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    :try_start_1
    const-string v0, "keypairgen_fromprivate.eddsa"

    .line 156
    invoke-static {v0}, Ll/᩶᩷ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ll/ܺۢۘ;

    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    .line 158
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺۢۘ;

    .line 159
    invoke-virtual {p0}, Ll/ۡۢۘ;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ll/ܺۢۘ;->֫(Ljava/lang/String;[B)V

    .line 160
    invoke-interface {v0}, Ll/ܺۢۘ;->֫()[B

    move-result-object p1

    iput-object p1, p0, Ll/ۡۢۘ;->ۘ:[B

    .line 161
    invoke-interface {v0}, Ll/ܺۢۘ;->ۧ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ۡۢۘ;->ۖ:[B
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/LinkageError; {:try_start_1 .. :try_end_1} :catch_1

    return v3

    .line 164
    :catch_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    sget-object p1, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    .line 164
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v4

    .line 170
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    sget-object p1, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    .line 170
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v4

    .line 114
    :cond_4
    :goto_0
    new-instance v0, Ll/ܺ᩻ۘ;

    invoke-direct {v0, p1}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 115
    array-length p1, p1

    invoke-virtual {v0, p1}, Ll/ܺ᩻ۘ;->ܽ(I)V

    :try_start_2
    const-string p1, ""

    .line 118
    invoke-virtual {v0, v3, p1}, Ll/ܺ᩻ۘ;->֫(ILjava/lang/String;)[[B

    move-result-object p1

    .line 119
    aget-object p1, p1, v4

    iput-object p1, p0, Ll/ۡۢۘ;->ۖ:[B
    :try_end_2
    .catch Ll/۫᩷ۘ; {:try_start_2 .. :try_end_2} :catch_2

    return v3

    .line 121
    :catch_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    sget-object p1, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v4
.end method

.method public final ܿ()[B
    .locals 4

    .line 179
    invoke-super {p0}, Ll/ᩳۢۘ;->ܿ()[B

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 183
    :cond_0
    iget-object v0, p0, Ll/ۡۢۘ;->ۘ:[B

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 186
    :cond_1
    invoke-virtual {p0}, Ll/ۡۢۘ;->ᩳ()[B

    move-result-object v0

    .line 187
    iget-object v1, p0, Ll/ۡۢۘ;->ۘ:[B

    const/4 v2, 0x2

    new-array v2, v2, [[B

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    .line 188
    invoke-static {v2}, Ll/ܺ᩻ۘ;->֫([[B)Ll/ܺ᩻ۘ;

    move-result-object v0

    iget-object v0, v0, Ll/ܺ᩻ۘ;->֫:[B

    return-object v0
.end method

.method public final ᩳ()[B
    .locals 2

    .line 193
    invoke-virtual {p0}, Ll/ۡۢۘ;->᩻()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ll/᩵ۡۘ;->ܽ:[B

    .line 397
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 393
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    return-object v0
.end method

.method public abstract ᩻()Ljava/lang/String;
.end method
