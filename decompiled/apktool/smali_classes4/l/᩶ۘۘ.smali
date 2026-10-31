.class public Ll/᩶ۘۘ;
.super Ljava/lang/Object;
.source "77W6"


# instance fields
.field public ֫:Ll/᩷ۘۘ;

.field public ۜ:I

.field public ۡ:J

.field public ۢ:I

.field public ۧ:I

.field public ܳ:Ljava/lang/String;

.field public ܺ:J

.field public ܽ:I

.field public ܿ:Ll/۠ۘۘ;

.field public ᩳ:Ll/ܺۘۘ;

.field public ᩷:[B

.field public ᩻:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 76
    new-instance v0, Ll/᩻ۘۘ;

    invoke-direct {v0}, Ll/᩻ۘۘ;-><init>()V

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    iput-object v0, p0, Ll/᩶ۘۘ;->֫:Ll/᩷ۘۘ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 6

    .line 222
    iget-object v0, p0, Ll/᩶ۘۘ;->ᩳ:Ll/ܺۘۘ;

    iget v1, v0, Ll/ܺۘۘ;->۬֫:I

    .line 224
    iget v2, p0, Ll/᩶ۘۘ;->ܽ:I

    if-le v1, v2, :cond_0

    move v1, v2

    :cond_0
    if-nez v1, :cond_1

    goto :goto_0

    .line 229
    :cond_1
    iget-object v2, v0, Ll/ܺۘۘ;->۫֫:[B

    array-length v3, v2

    iget v0, v0, Ll/ܺۘۘ;->ۛ֫:I

    if-le v3, v0, :cond_2

    iget-object v3, p0, Ll/᩶ۘۘ;->᩷:[B

    array-length v4, v3

    iget v5, p0, Ll/᩶ۘۘ;->ۢ:I

    if-le v4, v5, :cond_2

    array-length v4, v2

    add-int v5, v0, v1

    if-lt v4, v5, :cond_2

    array-length v3, v3

    .line 237
    :cond_2
    iget-object v3, p0, Ll/᩶ۘۘ;->᩷:[B

    iget v4, p0, Ll/᩶ۘۘ;->ۢ:I

    invoke-static {v2, v0, v3, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 239
    iget v0, p0, Ll/᩶ۘۘ;->ۢ:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/᩶ۘۘ;->ۢ:I

    .line 240
    iget-object v0, p0, Ll/᩶ۘۘ;->ᩳ:Ll/ܺۘۘ;

    iget v2, v0, Ll/ܺۘۘ;->ۛ֫:I

    add-int/2addr v2, v1

    iput v2, v0, Ll/ܺۘۘ;->ۛ֫:I

    .line 241
    iget-wide v2, p0, Ll/᩶ۘۘ;->ܺ:J

    int-to-long v4, v1

    add-long/2addr v2, v4

    iput-wide v2, p0, Ll/᩶ۘۘ;->ܺ:J

    .line 242
    iget v2, p0, Ll/᩶ۘۘ;->ܽ:I

    sub-int/2addr v2, v1

    iput v2, p0, Ll/᩶ۘۘ;->ܽ:I

    .line 243
    iget v2, v0, Ll/ܺۘۘ;->۬֫:I

    sub-int/2addr v2, v1

    iput v2, v0, Ll/ܺۘۘ;->۬֫:I

    if-nez v2, :cond_3

    const/4 v1, 0x0

    .line 245
    iput v1, v0, Ll/ܺۘۘ;->ۛ֫:I

    :cond_3
    :goto_0
    return-void
.end method
