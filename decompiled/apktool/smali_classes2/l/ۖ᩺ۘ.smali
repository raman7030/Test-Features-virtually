.class public final Ll/ۖ᩺ۘ;
.super Ljava/lang/Object;
.source "VB2X"


# direct methods
.method public static ֫(I)B
    .locals 2

    const/16 v0, -0x80

    if-lt p0, v0, :cond_0

    const/16 v0, 0x7f

    if-lt v0, p0, :cond_0

    int-to-byte p0, p0

    return p0

    .line 37
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " can\'t be represented as byte (out of range)"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(D)F
    .locals 4

    .line 67
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_0

    const/high16 p0, 0x7fc00000    # Float.NaN

    return p0

    .line 68
    :cond_0
    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-eqz v0, :cond_2

    const-wide/16 v0, 0x0

    cmpg-double v2, p0, v0

    if-gez v2, :cond_1

    const/high16 p0, -0x800000    # Float.NEGATIVE_INFINITY

    return p0

    :cond_1
    const/high16 p0, 0x7f800000    # Float.POSITIVE_INFINITY

    return p0

    :cond_2
    const-wide v0, -0x3810000020000000L    # -3.4028234663852886E38

    cmpg-double v2, p0, v0

    if-ltz v2, :cond_4

    const-wide v0, 0x47efffffe0000000L    # 3.4028234663852886E38

    cmpg-double v2, v0, p0

    if-ltz v2, :cond_4

    double-to-float v0, p0

    float-to-double v1, v0

    cmpl-double v3, v1, p0

    if-nez v3, :cond_3

    return v0

    .line 71
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p0, " can\'t be represented as float (imprecise)"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 69
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p0, " can\'t be represented as float (out of range)"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Landroid/content/Intent;Landroid/net/Uri;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "content"

    .line 22
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 23
    invoke-virtual {p0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/4 p1, 0x2

    .line 24
    invoke-virtual {p0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_0
    return-void
.end method

.method public static ۧ(I)C
    .locals 2

    if-ltz p0, :cond_0

    const v0, 0xffff

    if-lt v0, p0, :cond_0

    int-to-char p0, p0

    return p0

    .line 32
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " can\'t be represented as char"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
