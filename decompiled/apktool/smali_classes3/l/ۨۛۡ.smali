.class public final Ll/ۨۛۡ;
.super Ljava/lang/Object;
.source "86JZ"


# instance fields
.field public ֫:I

.field public ۧ:J

.field public ܽ:I

.field public final synthetic ܿ:Ll/᩺ۛۡ;

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Ll/᩺ۛۡ;J)V
    .locals 0

    .line 260
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨۛۡ;->ܿ:Ll/᩺ۛۡ;

    iput-wide p2, p0, Ll/ۨۛۡ;->ۧ:J

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 10

    .line 262
    iget-object v0, p0, Ll/ۨۛۡ;->ܿ:Ll/᩺ۛۡ;

    invoke-static {v0}, Ll/᩺ۛۡ;->֫(Ll/᩺ۛۡ;)Ll/ۤۛۡ;

    move-result-object v1

    invoke-static {v1}, Ll/ۤۛۡ;->ܺ(Ll/ۤۛۡ;)Z

    move-result v1

    const-wide/16 v2, 0x1

    if-nez v1, :cond_0

    iget-wide v4, p0, Ll/ۨۛۡ;->ۧ:J

    add-long/2addr v4, v2

    iput-wide v4, p0, Ll/ۨۛۡ;->ۧ:J

    invoke-static {v0}, Ll/᩺ۛۡ;->ܽ(Ll/᩺ۛۡ;)I

    move-result v0

    return v0

    .line 263
    :cond_0
    iget v1, p0, Ll/ۨۛۡ;->ܽ:I

    if-nez v1, :cond_3

    .line 264
    invoke-static {v0}, Ll/᩺ۛۡ;->ۧ(Ll/᩺ۛۡ;)Ll/۫ۛۡ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫ۛۡ;->֫()I

    move-result v1

    and-int/lit8 v4, v1, 0x7f

    add-int/lit8 v4, v4, 0x1

    .line 265
    iput v4, p0, Ll/ۨۛۡ;->ܽ:I

    int-to-long v4, v4

    .line 266
    invoke-static {v0}, Ll/᩺ۛۡ;->֫(Ll/᩺ۛۡ;)Ll/ۤۛۡ;

    move-result-object v6

    invoke-static {v6}, Ll/ۤۛۡ;->ۜ(Ll/ۤۛۡ;)I

    move-result v6

    int-to-long v6, v6

    invoke-static {v0}, Ll/᩺ۛۡ;->֫(Ll/᩺ۛۡ;)Ll/ۤۛۡ;

    move-result-object v8

    invoke-static {v8}, Ll/ۤۛۡ;->᩻(Ll/ۤۛۡ;)I

    move-result v8

    int-to-long v8, v8

    mul-long v6, v6, v8

    iget-wide v8, p0, Ll/ۨۛۡ;->ۧ:J

    sub-long/2addr v6, v8

    cmp-long v8, v4, v6

    if-gtz v8, :cond_2

    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 268
    :goto_0
    iput-boolean v1, p0, Ll/ۨۛۡ;->ᩳ:Z

    if-eqz v1, :cond_3

    .line 269
    invoke-static {v0}, Ll/᩺ۛۡ;->ܽ(Ll/᩺ۛۡ;)I

    move-result v1

    iput v1, p0, Ll/ۨۛۡ;->֫:I

    goto :goto_1

    .line 267
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "TGA packet exceeds frame bounds"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 271
    :cond_3
    :goto_1
    iget v1, p0, Ll/ۨۛۡ;->ܽ:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/ۨۛۡ;->ܽ:I

    .line 272
    iget-wide v4, p0, Ll/ۨۛۡ;->ۧ:J

    add-long/2addr v4, v2

    iput-wide v4, p0, Ll/ۨۛۡ;->ۧ:J

    .line 273
    iget-boolean v1, p0, Ll/ۨۛۡ;->ᩳ:Z

    if-eqz v1, :cond_4

    iget v0, p0, Ll/ۨۛۡ;->֫:I

    return v0

    :cond_4
    invoke-static {v0}, Ll/᩺ۛۡ;->ܽ(Ll/᩺ۛۡ;)I

    move-result v0

    return v0
.end method
