.class public final Ll/۟ᩳۜ;
.super Ljava/lang/Object;
.source "B7AT"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 461
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 462
    iput-object p1, p0, Ll/۟ᩳۜ;->֫:Ljava/lang/String;

    .line 463
    iput-boolean p2, p0, Ll/۟ᩳۜ;->ۧ:Z

    return-void
.end method

.method public static ֫(IILjava/lang/CharSequence;)Ll/۟ᩳۜ;
    .locals 6

    const/4 v0, 0x0

    if-lt p0, p1, :cond_1

    .line 471
    new-instance p2, Ll/۟ᩳۜ;

    if-ge p0, p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    const-string p0, ""

    invoke-direct {p2, p0, v0}, Ll/۟ᩳۜ;-><init>(Ljava/lang/String;Z)V

    return-object p2

    .line 473
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    sub-int v2, p1, p0

    const/16 v3, 0x1e0

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge p0, p1, :cond_3

    const/16 v3, 0xf0

    if-ge v2, v3, :cond_3

    add-int/lit8 v3, p0, 0x1

    .line 477
    invoke-interface {p2, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    .line 478
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 479
    invoke-static {v4}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v4

    if-eqz v4, :cond_2

    if-ge v3, p1, :cond_2

    .line 480
    invoke-interface {p2, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    .line 481
    invoke-static {v4}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 482
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 p0, p0, 0x2

    goto :goto_1

    :cond_2
    move p0, v3

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 488
    :cond_3
    new-instance p2, Ll/۟ᩳۜ;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    if-ge p0, p1, :cond_4

    const/4 v0, 0x1

    :cond_4
    invoke-direct {p2, v1, v0}, Ll/۟ᩳۜ;-><init>(Ljava/lang/String;Z)V

    return-object p2
.end method
