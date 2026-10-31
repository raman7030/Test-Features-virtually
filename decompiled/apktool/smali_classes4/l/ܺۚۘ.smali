.class public final Ll/ܺۚۘ;
.super Ljava/lang/Object;
.source "V8A0"


# instance fields
.field public final ֫:Ll/ܺ᩺ܺ;

.field public final ۧ:Ll/ۢ᩺ܺ;


# direct methods
.method public constructor <init>(Ljava/io/ByteArrayInputStream;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Ll/ۢ᩺ܺ;

    invoke-direct {v0, p1}, Ll/ۢ᩺ܺ;-><init>(Ljava/io/ByteArrayInputStream;)V

    iput-object v0, p0, Ll/ܺۚۘ;->ۧ:Ll/ۢ᩺ܺ;

    .line 39
    new-instance p1, Ll/ܺ᩺ܺ;

    invoke-direct {p1, v0}, Ll/ܺ᩺ܺ;-><init>(Ll/ۢ᩺ܺ;)V

    iput-object p1, p0, Ll/ܺۚۘ;->֫:Ll/ܺ᩺ܺ;

    return-void
.end method


# virtual methods
.method public final ֫()B
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ܺۚۘ;->֫:Ll/ܺ᩺ܺ;

    .line 213
    invoke-virtual {v0}, Ll/ܺ᩺ܺ;->readUnsignedByte()I

    move-result v0

    int-to-byte v0, v0

    return v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 63
    iget-object v0, p0, Ll/ܺۚۘ;->֫:Ll/ܺ᩺ܺ;

    invoke-virtual {v0, p1}, Ll/ܺ᩺ܺ;->skipBytes(I)I

    move-result v0

    if-ne p1, v0, :cond_0

    return-void

    .line 64
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/ۘۚۘ;)V
    .locals 6

    .line 43
    sget-object v0, Ll/ۘۚۘ;->ۗ:Ll/ۘۚۘ;

    if-ne p1, v0, :cond_0

    goto :goto_1

    .line 45
    :cond_0
    invoke-virtual {p1}, Ll/ۘۚۘ;->֫()B

    move-result v0

    int-to-long v0, v0

    iget-object v2, p0, Ll/ܺۚۘ;->ۧ:Ll/ۢ᩺ܺ;

    invoke-virtual {v2}, Ll/ۢ᩺ܺ;->֫()J

    move-result-wide v3

    add-long/2addr v3, v0

    invoke-virtual {p1}, Ll/ۘۚۘ;->֫()B

    move-result p1

    not-int p1, p1

    int-to-long v0, p1

    and-long/2addr v0, v3

    invoke-virtual {v2}, Ll/ۢ᩺ܺ;->֫()J

    move-result-wide v2

    sub-long/2addr v0, v2

    :goto_0
    const-wide/16 v2, 0x1

    sub-long v2, v0, v2

    const-wide/16 v4, 0x0

    cmp-long p1, v0, v4

    if-lez p1, :cond_1

    .line 47
    invoke-virtual {p0}, Ll/ܺۚۘ;->֫()B

    move-wide v0, v2

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final ֫(Ll/ᩴۚۘ;)V
    .locals 0

    .line 44
    invoke-interface {p1, p0}, Ll/ᩴۚۘ;->ܽ(Ll/ܺۚۘ;)V

    .line 45
    invoke-interface {p1, p0}, Ll/ᩴۚۘ;->ۧ(Ll/ܺۚۘ;)V

    .line 46
    invoke-interface {p1, p0}, Ll/ᩴۚۘ;->֫(Ll/ܺۚۘ;)V

    return-void
.end method

.method public final ֫([B)V
    .locals 1

    .line 55
    iget-object v0, p0, Ll/ܺۚۘ;->֫:Ll/ܺ᩺ܺ;

    invoke-virtual {v0, p1}, Ll/ܺ᩺ܺ;->readFully([B)V

    return-void
.end method

.method public final ۧ()C
    .locals 1

    .line 89
    iget-object v0, p0, Ll/ܺۚۘ;->֫:Ll/ܺ᩺ܺ;

    .line 207
    invoke-virtual {v0}, Ll/ܺ᩺ܺ;->readUnsignedShort()I

    move-result v0

    int-to-char v0, v0

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 93
    iget-object v0, p0, Ll/ܺۚۘ;->֫:Ll/ܺ᩺ܺ;

    invoke-virtual {v0}, Ll/ܺ᩺ܺ;->readInt()I

    move-result v0

    return v0
.end method

.method public final ܿ()J
    .locals 4

    .line 93
    iget-object v0, p0, Ll/ܺۚۘ;->֫:Ll/ܺ᩺ܺ;

    invoke-virtual {v0}, Ll/ܺ᩺ܺ;->readInt()I

    move-result v0

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method

.method public final ᩳ()S
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ܺۚۘ;->֫:Ll/ܺ᩺ܺ;

    .line 193
    invoke-virtual {v0}, Ll/ܺ᩺ܺ;->readUnsignedShort()I

    move-result v0

    int-to-short v0, v0

    return v0
.end method
