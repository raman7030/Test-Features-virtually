.class public abstract Ll/ᩴۜۖ;
.super Ljava/lang/Object;
.source "C9P0"

# interfaces
.implements Ll/۫֡ۖ;


# static fields
.field public static final EMPTY_REGISTRY:Ll/ᩳۘۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 52
    invoke-static {}, Ll/ᩳۘۖ;->֫()Ll/ᩳۘۖ;

    move-result-object v0

    sput-object v0, Ll/ᩴۜۖ;->EMPTY_REGISTRY:Ll/ᩳۘۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private ֫(Ll/ۡ֡ۖ;)Ll/ۡ֡ۖ;
    .locals 1

    if-eqz p1, :cond_1

    .line 43
    invoke-interface {p1}, Ll/ܺ֡ۖ;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 44
    :cond_0
    invoke-direct {p0, p1}, Ll/ᩴۜۖ;->ۧ(Ll/ۡ֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ll/ᩳ֨ۖ;->֫()Ll/֫᩵ۖ;

    move-result-object v0

    .line 46
    invoke-virtual {v0, p1}, Ll/֫᩵ۖ;->֫(Ll/ۡ֡ۖ;)V

    throw v0

    :cond_1
    :goto_0
    return-object p1
.end method

.method private ۧ(Ll/ۡ֡ۖ;)Ll/ᩳ֨ۖ;
    .locals 1

    .line 29
    instance-of v0, p1, Ll/ۘۜۖ;

    if-eqz v0, :cond_0

    .line 30
    check-cast p1, Ll/ۘۜۖ;

    invoke-virtual {p1}, Ll/ۘۜۖ;->newUninitializedMessageException()Ll/ᩳ֨ۖ;

    move-result-object p1

    return-object p1

    .line 32
    :cond_0
    new-instance p1, Ll/ᩳ֨ۖ;

    invoke-direct {p1}, Ll/ᩳ֨ۖ;-><init>()V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Ll/ᩴۜۖ;->parseDelimitedFrom(Ljava/io/InputStream;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parseDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1, p2}, Ll/ᩴۜۖ;->parseDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public parseDelimitedFrom(Ljava/io/InputStream;)Ll/ۡ֡ۖ;
    .locals 1

    .line 249
    sget-object v0, Ll/ᩴۜۖ;->EMPTY_REGISTRY:Ll/ᩳۘۖ;

    invoke-virtual {p0, p1, v0}, Ll/ᩴۜۖ;->parseDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public parseDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;
    .locals 0

    .line 244
    invoke-virtual {p0, p1, p2}, Ll/ᩴۜۖ;->parsePartialDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ᩴۜۖ;->֫(Ll/ۡ֡ۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Ll/ᩴۜۖ;->parseFrom(Ljava/io/InputStream;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parseFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1, p2}, Ll/ᩴۜۖ;->parseFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Ll/ᩴۜۖ;->parseFrom(Ljava/nio/ByteBuffer;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1, p2}, Ll/ᩴۜۖ;->parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parseFrom(Ll/ۛۜۖ;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Ll/ᩴۜۖ;->parseFrom(Ll/ۛۜۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1, p2}, Ll/ᩴۜۖ;->parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parseFrom(Ll/۟ۜۖ;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Ll/ᩴۜۖ;->parseFrom(Ll/۟ۜۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parseFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1, p2}, Ll/ᩴۜۖ;->parseFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parseFrom([B)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Ll/ᩴۜۖ;->parseFrom([B)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parseFrom([BII)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1, p2, p3}, Ll/ᩴۜۖ;->parseFrom([BII)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parseFrom([BIILl/ᩳۘۖ;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/ᩴۜۖ;->parseFrom([BIILl/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parseFrom([BLl/ᩳۘۖ;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1, p2}, Ll/ᩴۜۖ;->parseFrom([BLl/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public parseFrom(Ljava/io/InputStream;)Ll/ۡ֡ۖ;
    .locals 1

    .line 214
    sget-object v0, Ll/ᩴۜۖ;->EMPTY_REGISTRY:Ll/ᩳۘۖ;

    invoke-virtual {p0, p1, v0}, Ll/ᩴۜۖ;->parseFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public parseFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;
    .locals 0

    .line 209
    invoke-virtual {p0, p1, p2}, Ll/ᩴۜۖ;->parsePartialFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ᩴۜۖ;->֫(Ll/ۡ֡ۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public parseFrom(Ljava/nio/ByteBuffer;)Ll/ۡ֡ۖ;
    .locals 1

    .line 126
    sget-object v0, Ll/ᩴۜۖ;->EMPTY_REGISTRY:Ll/ᩳۘۖ;

    invoke-virtual {p0, p1, v0}, Ll/ᩴۜۖ;->parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;
    .locals 4

    .line 158
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 160
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v2

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    .line 159
    invoke-static {v1, v3, p1, v0}, Ll/۟ۜۖ;->֫(ZII[B)Ll/۟ۜۖ;

    move-result-object p1

    goto :goto_0

    .line 163
    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1297
    invoke-static {}, Ll/᩸֨ۖ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 164
    new-instance v0, Ll/ܰۜۖ;

    invoke-direct {v0, p1, v1}, Ll/ܰۜۖ;-><init>(Ljava/nio/ByteBuffer;Z)V

    move-object p1, v0

    goto :goto_0

    .line 170
    :cond_1
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    new-array v2, v0, [B

    .line 171
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    const/4 p1, 0x0

    const/4 v3, 0x1

    .line 172
    invoke-static {v3, p1, v0, v2}, Ll/۟ۜۖ;->֫(ZII[B)Ll/۟ۜۖ;

    move-result-object p1

    .line 111
    :goto_0
    invoke-interface {p0, p1, p2}, Ll/۫֡ۖ;->parsePartialFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۡ֡ۖ;

    .line 113
    :try_start_0
    invoke-virtual {p1, v1}, Ll/۟ۜۖ;->֫(I)V
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    invoke-direct {p0, p2}, Ll/ᩴۜۖ;->֫(Ll/ۡ֡ۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 115
    invoke-virtual {p1, p2}, Ll/֫᩵ۖ;->֫(Ll/ۡ֡ۖ;)V

    throw p1
.end method

.method public parseFrom(Ll/ۛۜۖ;)Ll/ۡ֡ۖ;
    .locals 1

    .line 102
    sget-object v0, Ll/ᩴۜۖ;->EMPTY_REGISTRY:Ll/ᩳۘۖ;

    invoke-virtual {p0, p1, v0}, Ll/ᩴۜۖ;->parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;
    .locals 0

    .line 97
    invoke-virtual {p0, p1, p2}, Ll/ᩴۜۖ;->parsePartialFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ᩴۜۖ;->֫(Ll/ۡ֡ۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public parseFrom(Ll/۟ۜۖ;)Ll/ۡ֡ۖ;
    .locals 1

    .line 68
    sget-object v0, Ll/ᩴۜۖ;->EMPTY_REGISTRY:Ll/ᩳۘۖ;

    invoke-virtual {p0, p1, v0}, Ll/ᩴۜۖ;->parseFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public parseFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;
    .locals 0

    .line 63
    invoke-interface {p0, p1, p2}, Ll/۫֡ۖ;->parsePartialFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۡ֡ۖ;

    invoke-direct {p0, p1}, Ll/ᩴۜۖ;->֫(Ll/ۡ֡ۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public parseFrom([B)Ll/ۡ֡ۖ;
    .locals 1

    .line 185
    sget-object v0, Ll/ᩴۜۖ;->EMPTY_REGISTRY:Ll/ᩳۘۖ;

    invoke-virtual {p0, p1, v0}, Ll/ᩴۜۖ;->parseFrom([BLl/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public parseFrom([BII)Ll/ۡ֡ۖ;
    .locals 1

    .line 174
    sget-object v0, Ll/ᩴۜۖ;->EMPTY_REGISTRY:Ll/ᩳۘۖ;

    invoke-virtual {p0, p1, p2, p3, v0}, Ll/ᩴۜۖ;->parseFrom([BIILl/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public parseFrom([BIILl/ᩳۘۖ;)Ll/ۡ֡ۖ;
    .locals 0

    .line 168
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/ᩴۜۖ;->parsePartialFrom([BIILl/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ᩴۜۖ;->֫(Ll/ۡ֡ۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public parseFrom([BLl/ᩳۘۖ;)Ll/ۡ֡ۖ;
    .locals 2

    const/4 v0, 0x0

    .line 180
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1, p2}, Ll/ᩴۜۖ;->parseFrom([BIILl/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parsePartialDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Ll/ᩴۜۖ;->parsePartialDelimitedFrom(Ljava/io/InputStream;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parsePartialDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1, p2}, Ll/ᩴۜۖ;->parsePartialDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public parsePartialDelimitedFrom(Ljava/io/InputStream;)Ll/ۡ֡ۖ;
    .locals 1

    .line 238
    sget-object v0, Ll/ᩴۜۖ;->EMPTY_REGISTRY:Ll/ᩳۘۖ;

    invoke-virtual {p0, p1, v0}, Ll/ᩴۜۖ;->parsePartialDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public parsePartialDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;
    .locals 2

    .line 223
    :try_start_0
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 227
    :cond_0
    invoke-static {p1, v0}, Ll/۟ۜۖ;->֫(Ljava/io/InputStream;I)I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 231
    new-instance v1, Ll/ܺۜۖ;

    invoke-direct {v1, p1, v0}, Ll/ܺۜۖ;-><init>(Ljava/io/InputStream;I)V

    .line 232
    invoke-virtual {p0, v1, p2}, Ll/ᩴۜۖ;->parsePartialFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 229
    new-instance p2, Ll/֫᩵ۖ;

    .line 36
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 229
    throw p2
.end method

.method public bridge synthetic parsePartialFrom(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Ll/ᩴۜۖ;->parsePartialFrom(Ljava/io/InputStream;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parsePartialFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1, p2}, Ll/ᩴۜۖ;->parsePartialFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parsePartialFrom(Ll/ۛۜۖ;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Ll/ᩴۜۖ;->parsePartialFrom(Ll/ۛۜۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parsePartialFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1, p2}, Ll/ᩴۜۖ;->parsePartialFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parsePartialFrom(Ll/۟ۜۖ;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Ll/ᩴۜۖ;->parsePartialFrom(Ll/۟ۜۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parsePartialFrom([B)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Ll/ᩴۜۖ;->parsePartialFrom([B)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parsePartialFrom([BII)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1, p2, p3}, Ll/ᩴۜۖ;->parsePartialFrom([BII)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parsePartialFrom([BIILl/ᩳۘۖ;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/ᩴۜۖ;->parsePartialFrom([BIILl/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parsePartialFrom([BLl/ᩳۘۖ;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1, p2}, Ll/ᩴۜۖ;->parsePartialFrom([BLl/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public parsePartialFrom(Ljava/io/InputStream;)Ll/ۡ֡ۖ;
    .locals 1

    .line 203
    sget-object v0, Ll/ᩴۜۖ;->EMPTY_REGISTRY:Ll/ᩳۘۖ;

    invoke-virtual {p0, p1, v0}, Ll/ᩴۜۖ;->parsePartialFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public parsePartialFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;
    .locals 1

    .line 191
    invoke-static {p1}, Ll/۟ۜۖ;->֫(Ljava/io/InputStream;)Ll/۟ۜۖ;

    move-result-object p1

    .line 192
    invoke-interface {p0, p1, p2}, Ll/۫֡ۖ;->parsePartialFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۡ֡ۖ;

    const/4 v0, 0x0

    .line 194
    :try_start_0
    invoke-virtual {p1, v0}, Ll/۟ۜۖ;->֫(I)V
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    .line 196
    invoke-virtual {p1, p2}, Ll/֫᩵ۖ;->֫(Ll/ۡ֡ۖ;)V

    throw p1
.end method

.method public parsePartialFrom(Ll/ۛۜۖ;)Ll/ۡ֡ۖ;
    .locals 1

    .line 91
    sget-object v0, Ll/ᩴۜۖ;->EMPTY_REGISTRY:Ll/ᩳۘۖ;

    invoke-virtual {p0, p1, v0}, Ll/ᩴۜۖ;->parsePartialFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public parsePartialFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;
    .locals 1

    .line 76
    invoke-virtual {p1}, Ll/ۛۜۖ;->ܽ()Ll/۟ۜۖ;

    move-result-object p1

    .line 77
    invoke-interface {p0, p1, p2}, Ll/۫֡ۖ;->parsePartialFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۡ֡ۖ;

    const/4 v0, 0x0

    .line 79
    :try_start_0
    invoke-virtual {p1, v0}, Ll/۟ۜۖ;->֫(I)V
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    .line 81
    invoke-virtual {p1, p2}, Ll/֫᩵ۖ;->֫(Ll/ۡ֡ۖ;)V

    throw p1
.end method

.method public parsePartialFrom(Ll/۟ۜۖ;)Ll/ۡ֡ۖ;
    .locals 1

    .line 57
    sget-object v0, Ll/ᩴۜۖ;->EMPTY_REGISTRY:Ll/ᩳۘۖ;

    invoke-interface {p0, p1, v0}, Ll/۫֡ۖ;->parsePartialFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۡ֡ۖ;

    return-object p1
.end method

.method public parsePartialFrom([B)Ll/ۡ֡ۖ;
    .locals 3

    .line 161
    array-length v0, p1

    sget-object v1, Ll/ᩴۜۖ;->EMPTY_REGISTRY:Ll/ᩳۘۖ;

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v2, v0, v1}, Ll/ᩴۜۖ;->parsePartialFrom([BIILl/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public parsePartialFrom([BII)Ll/ۡ֡ۖ;
    .locals 1

    .line 150
    sget-object v0, Ll/ᩴۜۖ;->EMPTY_REGISTRY:Ll/ᩳۘۖ;

    invoke-virtual {p0, p1, p2, p3, v0}, Ll/ᩴۜۖ;->parsePartialFrom([BIILl/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public parsePartialFrom([BIILl/ᩳۘۖ;)Ll/ۡ֡ۖ;
    .locals 1

    const/4 v0, 0x0

    .line 117
    invoke-static {v0, p2, p3, p1}, Ll/۟ۜۖ;->֫(ZII[B)Ll/۟ۜۖ;

    move-result-object p1

    .line 135
    invoke-interface {p0, p1, p4}, Ll/۫֡ۖ;->parsePartialFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۡ֡ۖ;

    .line 137
    :try_start_0
    invoke-virtual {p1, v0}, Ll/۟ۜۖ;->֫(I)V
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    .line 139
    invoke-virtual {p1, p2}, Ll/֫᩵ۖ;->֫(Ll/ۡ֡ۖ;)V

    throw p1
.end method

.method public parsePartialFrom([BLl/ᩳۘۖ;)Ll/ۡ֡ۖ;
    .locals 2

    const/4 v0, 0x0

    .line 156
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1, p2}, Ll/ᩴۜۖ;->parsePartialFrom([BIILl/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1
.end method
