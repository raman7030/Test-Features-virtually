.class public abstract Ll/ۘ᩷ܺ;
.super Ljava/lang/Object;
.source "UBCN"


# instance fields
.field public final ֫:I

.field public final ۧ:J

.field public final ܽ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ll/۠ۢܺ;IIIJ)V
    .locals 0

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    .line 116
    invoke-static {p2}, Ll/᩷ۨۡ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 121
    iput p2, p0, Ll/ۘ᩷ܺ;->ܽ:I

    .line 122
    iput p3, p0, Ll/ۘ᩷ܺ;->֫:I

    .line 124
    iput p4, p0, Ll/ۘ᩷ܺ;->ᩳ:I

    .line 125
    iput-wide p5, p0, Ll/ۘ᩷ܺ;->ۧ:J

    return-void

    .line 117
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid opcode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 113
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "format == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public ֫()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(I)I
    .locals 1

    .line 169
    iget v0, p0, Ll/ۘ᩷ܺ;->ᩳ:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public final ۖ()S
    .locals 1

    .line 140
    iget v0, p0, Ll/ۘ᩷ܺ;->ܽ:I

    int-to-short v0, v0

    return v0
.end method

.method public ۘ()S
    .locals 2

    .line 499
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۜ()I
    .locals 6

    .line 237
    iget-wide v0, p0, Ll/ۘ᩷ܺ;->ۧ:J

    long-to-int v2, v0

    int-to-byte v3, v2

    int-to-long v3, v3

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    and-int/lit16 v0, v2, 0xff

    return v0

    .line 238
    :cond_0
    new-instance v2, Ll/֡ۧܺ;

    invoke-static {v0, v1}, Ll/ܳᩴܺ;->֫(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Literal out of range: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 60
    invoke-direct {v2, v0, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 238
    throw v2
.end method

.method public final ۡ()S
    .locals 6

    .line 225
    iget-wide v0, p0, Ll/ۘ᩷ܺ;->ۧ:J

    long-to-int v2, v0

    int-to-short v2, v2

    int-to-long v3, v2

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    return v2

    .line 226
    :cond_0
    new-instance v2, Ll/֡ۧܺ;

    invoke-static {v0, v1}, Ll/ܳᩴܺ;->֫(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Literal out of range: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 60
    invoke-direct {v2, v0, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 226
    throw v2
.end method

.method public final ۢ()I
    .locals 5

    const-wide/16 v0, -0x8

    .line 249
    iget-wide v2, p0, Ll/ۘ᩷ܺ;->ۧ:J

    cmp-long v4, v2, v0

    if-ltz v4, :cond_0

    const-wide/16 v0, 0x7

    cmp-long v4, v2, v0

    if-gtz v4, :cond_0

    long-to-int v0, v2

    and-int/lit8 v0, v0, 0xf

    return v0

    .line 250
    :cond_0
    new-instance v0, Ll/֡ۧܺ;

    invoke-static {v2, v3}, Ll/ܳᩴܺ;->֫(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Literal out of range: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 60
    invoke-direct {v0, v1, v2}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 250
    throw v0
.end method

.method public ۧ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ(I)I
    .locals 2

    .line 169
    iget v0, p0, Ll/ۘ᩷ܺ;->ᩳ:I

    sub-int/2addr v0, p1

    int-to-byte p1, v0

    if-ne v0, p1, :cond_0

    and-int/lit16 p1, v0, 0xff

    return p1

    .line 197
    :cond_0
    new-instance p1, Ll/֡ۧܺ;

    .line 198
    invoke-static {v0}, Ll/ܳᩴܺ;->֫(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Target out of range: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 60
    invoke-direct {p1, v0, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 198
    throw p1
.end method

.method public final ܳ()I
    .locals 1

    .line 144
    iget v0, p0, Ll/ۘ᩷ܺ;->֫:I

    return v0
.end method

.method public final ܺ()I
    .locals 1

    .line 133
    iget v0, p0, Ll/ۘ᩷ܺ;->ܽ:I

    return v0
.end method

.method public ܽ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ(I)S
    .locals 2

    .line 169
    iget v0, p0, Ll/ۘ᩷ܺ;->ᩳ:I

    sub-int/2addr v0, p1

    int-to-short p1, v0

    if-ne v0, p1, :cond_0

    return p1

    .line 181
    :cond_0
    new-instance p1, Ll/֡ۧܺ;

    .line 182
    invoke-static {v0}, Ll/ܳᩴܺ;->֫(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Target out of range: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 60
    invoke-direct {p1, v0, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 182
    throw p1
.end method

.method public ܿ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ᩳ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract ᩴ()I
.end method

.method public final ᩷()I
    .locals 6

    .line 213
    iget-wide v0, p0, Ll/ۘ᩷ܺ;->ۧ:J

    long-to-int v2, v0

    int-to-long v3, v2

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    return v2

    .line 214
    :cond_0
    new-instance v2, Ll/֡ۧܺ;

    invoke-static {v0, v1}, Ll/ܳᩴܺ;->֫(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Literal out of range: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 60
    invoke-direct {v2, v0, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 214
    throw v2
.end method

.method public final ᩻()J
    .locals 2

    .line 205
    iget-wide v0, p0, Ll/ۘ᩷ܺ;->ۧ:J

    return-wide v0
.end method
