.class public final Ll/᩻᩺ܿ;
.super Ll/ۜ᩺ܿ;
.source "964V"


# instance fields
.field public final ۙ:I


# direct methods
.method public constructor <init>(IILl/ܿۖ᩷;)V
    .locals 2

    const/4 v0, 0x0

    .line 350
    invoke-static {p1, p2, v0}, Ll/ۢ᩺ܿ;->֫(III)J

    move-result-wide v0

    long-to-int p1, v0

    invoke-direct {p0, p1, p3}, Ll/ۜ᩺ܿ;-><init>(ILl/ܿۖ᩷;)V

    .line 351
    iput p2, p0, Ll/᩻᩺ܿ;->ۙ:I

    return-void
.end method


# virtual methods
.method public final finish()Ljava/lang/String;
    .locals 1

    .line 362
    iget-object v0, p0, Ll/ۜ᩺ܿ;->᩶:Ljava/lang/StringBuilder;

    invoke-static {v0}, Ll/ۢ᩺ܿ;->֫(Ljava/lang/StringBuilder;)V

    .line 335
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)V
    .locals 3

    .line 356
    iget v0, p0, Ll/ۜ᩺ܿ;->᩹:I

    .line 489
    iget-object v1, p0, Ll/ۜ᩺ܿ;->᩶:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    iget v2, p0, Ll/᩻᩺ܿ;->ۙ:I

    rem-int/2addr v0, v2

    if-nez v0, :cond_0

    const/16 v0, 0xa

    .line 490
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 357
    :cond_0
    invoke-static {}, Ll/ۢ᩺ܿ;->֫()[C

    move-result-object v0

    ushr-int/lit8 v2, p1, 0x4

    aget-char v0, v0, v2

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {}, Ll/ۢ᩺ܿ;->֫()[C

    move-result-object v0

    and-int/lit8 p1, p1, 0xf

    aget-char p1, v0, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 p1, 0x20

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method
