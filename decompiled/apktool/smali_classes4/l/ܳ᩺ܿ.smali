.class public final Ll/ܳ᩺ܿ;
.super Ll/ۜ᩺ܿ;
.source "964V"


# instance fields
.field public final ۙ:I


# direct methods
.method public constructor <init>(IILl/ܿۖ᩷;)V
    .locals 2

    const/4 v0, 0x1

    .line 372
    invoke-static {p1, p2, v0}, Ll/ۢ᩺ܿ;->֫(III)J

    move-result-wide v0

    long-to-int p1, v0

    invoke-direct {p0, p1, p3}, Ll/ۜ᩺ܿ;-><init>(ILl/ܿۖ᩷;)V

    .line 373
    iput p2, p0, Ll/ܳ᩺ܿ;->ۙ:I

    return-void
.end method


# virtual methods
.method public final finish()Ljava/lang/String;
    .locals 1

    .line 391
    iget-object v0, p0, Ll/ۜ᩺ܿ;->᩶:Ljava/lang/StringBuilder;

    invoke-static {v0}, Ll/ۢ᩺ܿ;->֫(Ljava/lang/StringBuilder;)V

    .line 335
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)V
    .locals 4

    .line 378
    iget v0, p0, Ll/ۜ᩺ܿ;->᩹:I

    const/16 v1, 0xa

    .line 489
    iget-object v2, p0, Ll/ۜ᩺ܿ;->᩶:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    iget v3, p0, Ll/ܳ᩺ܿ;->ۙ:I

    rem-int/2addr v0, v3

    if-nez v0, :cond_0

    .line 490
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 379
    :cond_0
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-ge p1, v1, :cond_1

    const-string p1, "   "

    .line 381
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_1
    const/16 v0, 0x64

    if-ge p1, v0, :cond_2

    const-string p1, "  "

    .line 383
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_2
    const/16 p1, 0x20

    .line 385
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method
