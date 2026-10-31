.class public final Ll/֫᩺ܿ;
.super Ll/ۜ᩺ܿ;
.source "964V"


# instance fields
.field public final ۙ:I


# direct methods
.method public constructor <init>(IILl/ܿۖ᩷;)V
    .locals 2

    const/4 v0, 0x2

    .line 401
    invoke-static {p1, p2, v0}, Ll/ۢ᩺ܿ;->֫(III)J

    move-result-wide v0

    long-to-int p1, v0

    invoke-direct {p0, p1, p3}, Ll/ۜ᩺ܿ;-><init>(ILl/ܿۖ᩷;)V

    .line 402
    iput p2, p0, Ll/֫᩺ܿ;->ۙ:I

    return-void
.end method


# virtual methods
.method public final finish()Ljava/lang/String;
    .locals 1

    .line 416
    iget-object v0, p0, Ll/ۜ᩺ܿ;->᩶:Ljava/lang/StringBuilder;

    invoke-static {v0}, Ll/ۢ᩺ܿ;->֫(Ljava/lang/StringBuilder;)V

    .line 335
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)V
    .locals 3

    .line 407
    iget v0, p0, Ll/ۜ᩺ܿ;->᩹:I

    .line 489
    iget-object v1, p0, Ll/ۜ᩺ܿ;->᩶:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    iget v2, p0, Ll/֫᩺ܿ;->ۙ:I

    rem-int/2addr v0, v2

    if-nez v0, :cond_0

    const/16 v0, 0xa

    .line 490
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    const/4 v0, 0x7

    :goto_0
    if-ltz v0, :cond_1

    ushr-int v2, p1, v0

    and-int/lit8 v2, v2, 0x1

    add-int/lit8 v2, v2, 0x30

    int-to-char v2, v2

    .line 409
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/16 p1, 0x20

    .line 411
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method
