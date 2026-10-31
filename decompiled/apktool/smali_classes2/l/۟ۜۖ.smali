.class public abstract Ll/۟ۜۖ;
.super Ljava/lang/Object;
.source "J9OT"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:I

.field public ᩳ:Ll/֫᩷ۖ;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 182
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x64

    .line 48
    iput p1, p0, Ll/۟ۜۖ;->ۧ:I

    const p1, 0x7fffffff

    .line 51
    iput p1, p0, Ll/۟ۜۖ;->ܽ:I

    return-void
.end method

.method public static ֫(Ljava/io/InputStream;I)I
    .locals 3

    and-int/lit16 v0, p1, 0x80

    if-nez v0, :cond_0

    return p1

    :cond_0
    and-int/lit8 p1, p1, 0x7f

    const/4 v0, 0x7

    :goto_0
    const/16 v1, 0x20

    const/4 v2, -0x1

    if-ge v0, v1, :cond_3

    .line 539
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v1

    if-eq v1, v2, :cond_2

    and-int/lit8 v2, v1, 0x7f

    shl-int/2addr v2, v0

    or-int/2addr p1, v2

    and-int/lit16 v1, v1, 0x80

    if-nez v1, :cond_1

    return p1

    :cond_1
    add-int/lit8 v0, v0, 0x7

    goto :goto_0

    .line 541
    :cond_2
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object p0

    throw p0

    :cond_3
    :goto_1
    const/16 v1, 0x40

    if-ge v0, v1, :cond_6

    .line 550
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v1

    if-eq v1, v2, :cond_5

    and-int/lit16 v1, v1, 0x80

    if-nez v1, :cond_4

    return p1

    :cond_4
    add-int/lit8 v0, v0, 0x7

    goto :goto_1

    .line 552
    :cond_5
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object p0

    throw p0

    .line 558
    :cond_6
    invoke-static {}, Ll/֫᩵ۖ;->ܳ()Ll/֫᩵ۖ;

    move-result-object p0

    throw p0
.end method

.method public static ֫(J)J
    .locals 4

    const/4 v0, 0x1

    ushr-long v0, p0, v0

    const-wide/16 v2, 0x1

    and-long/2addr p0, v2

    neg-long p0, p0

    xor-long/2addr p0, v0

    return-wide p0
.end method

.method public static ֫(Ljava/io/InputStream;)Ll/۟ۜۖ;
    .locals 2

    if-nez p0, :cond_0

    .line 68
    sget-object p0, Ll/ܰᩴۖ;->֫:[B

    const/4 v0, 0x0

    .line 112
    array-length v1, p0

    .line 117
    invoke-static {v0, v0, v1, p0}, Ll/۟ۜۖ;->֫(ZII[B)Ll/۟ۜۖ;

    move-result-object p0

    return-object p0

    .line 70
    :cond_0
    new-instance v0, Ll/᩺ۜۖ;

    invoke-direct {v0, p0}, Ll/᩺ۜۖ;-><init>(Ljava/io/InputStream;)V

    return-object v0
.end method

.method public static ֫(ZII[B)Ll/۟ۜۖ;
    .locals 1

    .line 123
    new-instance v0, Ll/ۨۜۖ;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ۨۜۖ;-><init>(ZII[B)V

    .line 130
    :try_start_0
    invoke-virtual {v0, p2}, Ll/ۨۜۖ;->ܽ(I)I
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 139
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static ܿ(I)I
    .locals 1

    ushr-int/lit8 v0, p0, 0x1

    and-int/lit8 p0, p0, 0x1

    neg-int p0, p0

    xor-int/2addr p0, v0

    return p0
.end method


# virtual methods
.method public abstract ֡()I
.end method

.method public abstract ֨()Ljava/lang/String;
.end method

.method public abstract ֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;
.end method

.method public final ֫()V
    .locals 2

    .line 176
    iget v0, p0, Ll/۟ۜۖ;->֫:I

    iget v1, p0, Ll/۟ۜۖ;->ۧ:I

    if-ge v0, v1, :cond_0

    return-void

    .line 133
    :cond_0
    new-instance v0, Ll/֫᩵ۖ;

    const-string v1, "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."

    .line 24
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 177
    throw v0
.end method

.method public abstract ֫(I)V
.end method

.method public abstract ֫(ILl/ۢ֡ۖ;Ll/ᩳۘۖ;)V
.end method

.method public abstract ֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V
.end method

.method public abstract ۖ()J
.end method

.method public abstract ۘ()I
.end method

.method public abstract ۚ()J
.end method

.method public abstract ۜ()I
.end method

.method public abstract ۠()Ljava/lang/String;
.end method

.method public abstract ۡ()F
.end method

.method public abstract ۢ()J
.end method

.method public abstract ۧ()I
.end method

.method public abstract ۧ(I)V
.end method

.method public abstract ܳ()Ll/ۛۜۖ;
.end method

.method public abstract ܶ()I
.end method

.method public abstract ܺ()I
.end method

.method public abstract ܽ()I
.end method

.method public abstract ܽ(I)I
.end method

.method public abstract ܿ()Z
.end method

.method public abstract ᩳ()Z
.end method

.method public abstract ᩳ(I)Z
.end method

.method public abstract ᩴ()I
.end method

.method public abstract ᩵()J
.end method

.method public abstract ᩷()I
.end method

.method public abstract ᩸()I
.end method

.method public abstract ᩹()J
.end method

.method public abstract ᩻()D
.end method
