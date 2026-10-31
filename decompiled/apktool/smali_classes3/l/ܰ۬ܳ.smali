.class public final Ll/ܰ۬ܳ;
.super Ljava/lang/Object;
.source "M2AR"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final ᩸:Ljava/util/HashMap;

.field public final ᩹:Z


# direct methods
.method public constructor <init>(Ljava/util/HashMap;Z)V
    .locals 0

    .line 461
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 462
    iput-object p1, p0, Ll/ܰ۬ܳ;->᩸:Ljava/util/HashMap;

    .line 463
    iput-boolean p2, p0, Ll/ܰ۬ܳ;->᩹:Z

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    .line 457
    check-cast p1, Ll/ᩳۜܳ;

    check-cast p2, Ll/ᩳۜܳ;

    const/4 v0, 0x0

    if-ne p1, p2, :cond_0

    return v0

    .line 470
    :cond_0
    invoke-interface {p1}, Ll/ᩳۜܳ;->᩵֫()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 472
    :cond_1
    invoke-interface {p2}, Ll/ᩳۜܳ;->᩵֫()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 474
    :cond_2
    invoke-interface {p1}, Ll/ᩳۜܳ;->ۡۧ()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    .line 476
    :cond_3
    invoke-interface {p2}, Ll/ᩳۜܳ;->ۡۧ()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_0

    .line 479
    :cond_4
    invoke-interface {p1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 480
    invoke-interface {p2}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_6

    :goto_0
    const p1, -0x3b9aca00

    return p1

    .line 483
    :cond_5
    invoke-interface {p2}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_6

    :goto_1
    const p1, 0x3b9aca00

    return p1

    .line 488
    :cond_6
    invoke-interface {p1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_b

    .line 489
    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v0

    sget v1, Ll/۟۬ܳ;->֫:I

    const/16 v1, 0x2e

    .line 622
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    const-string v3, ""

    const/4 v4, -0x1

    if-eq v2, v4, :cond_8

    if-nez v2, :cond_7

    goto :goto_2

    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 625
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_8
    :goto_2
    move-object v0, v3

    .line 489
    :goto_3
    invoke-interface {p2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 622
    invoke-virtual {v2, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    if-eq v1, v4, :cond_a

    if-nez v1, :cond_9

    goto :goto_4

    :cond_9
    add-int/lit8 v1, v1, 0x1

    .line 625
    invoke-virtual {v2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 489
    :cond_a
    :goto_4
    invoke-virtual {v0, v3}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v0

    :cond_b
    if-nez v0, :cond_c

    .line 493
    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ܰ۬ܳ;->᩸:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۤ۬ܳ;

    invoke-interface {p2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۤ۬ܳ;

    invoke-virtual {p1, p2}, Ll/ۤ۬ܳ;->֫(Ll/ۤ۬ܳ;)I

    move-result v0

    .line 495
    :cond_c
    iget-boolean p1, p0, Ll/ܰ۬ܳ;->᩹:Z

    if-eqz p1, :cond_d

    neg-int p1, v0

    return p1

    :cond_d
    return v0
.end method
