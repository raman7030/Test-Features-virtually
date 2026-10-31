.class public final Ll/ۤ۬ܳ;
.super Ljava/lang/Object;
.source "M2AR"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public ᩸:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/text/Collator;Ljava/lang/String;Z)V
    .locals 8

    .line 504
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 502
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۤ۬ܳ;->᩸:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eqz p3, :cond_0

    .line 506
    new-instance p3, Ll/ۛ۬ܳ;

    invoke-direct {p3, p1, p2, v1}, Ll/ۛ۬ܳ;-><init>(Ljava/text/Collator;Ljava/lang/String;Z)V

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 509
    :cond_0
    invoke-static {}, Ll/۟۬ܳ;->֫()Ljava/util/regex/Pattern;

    move-result-object p3

    invoke-virtual {p3, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p3

    const/4 v0, 0x0

    .line 511
    :goto_0
    invoke-virtual {p3}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    .line 512
    invoke-virtual {p3}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v2

    .line 513
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    .line 516
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v0, v4

    .line 517
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 518
    iget-object v5, p0, Ll/ۤ۬ܳ;->᩸:Ljava/util/ArrayList;

    new-instance v6, Ll/ۛ۬ܳ;

    const/16 v7, 0x30

    if-gt v7, v4, :cond_2

    const/16 v7, 0x39

    if-gt v4, v7, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    invoke-direct {v6, p1, v2, v3}, Ll/ۛ۬ܳ;-><init>(Ljava/text/Collator;Ljava/lang/String;Z)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 520
    :cond_3
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-ne v0, p1, :cond_4

    const/4 v1, 0x1

    :cond_4
    invoke-static {v1}, Ll/۫ۙ;->֫(Z)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 501
    check-cast p1, Ll/ۤ۬ܳ;

    invoke-virtual {p0, p1}, Ll/ۤ۬ܳ;->֫(Ll/ۤ۬ܳ;)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۤ۬ܳ;)I
    .locals 3

    .line 526
    iget-object v0, p0, Ll/ۤ۬ܳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 527
    iget-object p1, p1, Ll/ۤ۬ܳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 528
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 529
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ۬ܳ;

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ۬ܳ;

    invoke-virtual {v1, v2}, Ll/ۛ۬ܳ;->֫(Ll/ۛ۬ܳ;)I

    move-result v1

    if-eqz v1, :cond_0

    return v1

    .line 533
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p1, 0x1

    return p1

    .line 536
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, -0x1

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method
