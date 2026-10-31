.class public final Ll/֫ܶ᩵;
.super Ll/᩷ܶ᩵;


# direct methods
.method public static ֫(Ljava/lang/Iterable;)I
    .locals 1

    .line 39
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result p0

    return p0

    :cond_0
    const/16 p0, 0xa

    return p0
.end method

.method public static ֫(Ljava/util/List;)I
    .locals 1

    const-string v0, "<this>"

    .line 0
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 237
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    return p0
.end method

.method public static ֫(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܺ᩹᩵;I)Ljava/lang/String;
    .locals 9

    and-int/lit8 v0, p5, 0x2

    const-string v1, ""

    if-eqz v0, :cond_0

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object v5, p2

    :goto_0
    and-int/lit8 p2, p5, 0x4

    if-eqz p2, :cond_1

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object v6, p3

    :goto_1
    and-int/lit8 p2, p5, 0x20

    if-eqz p2, :cond_2

    const/4 p4, 0x0

    :cond_2
    move-object v8, p4

    const-string p2, "<this>"

    .line 0
    invoke-static {p0, p2}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3667
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "..."

    move-object v2, p0

    move-object v3, p2

    move-object v4, p1

    invoke-static/range {v2 .. v8}, Ll/᩷ܶ᩵;->֫(Ljava/lang/Iterable;Ljava/lang/StringBuilder;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ܺ᩹᩵;)V

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 21
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const-string v0, "singletonList(...)"

    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static varargs ֫([Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 81
    array-length v0, p0

    if-lez v0, :cond_0

    .line 13
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const-string v0, "asList(...)"

    .line 134
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    .line 81
    :cond_0
    sget-object p0, Ll/ۡܶ᩵;->᩸:Ll/ۡܶ᩵;

    return-object p0
.end method

.method public static synthetic ֫(Ljava/lang/StringBuilder;Ljava/util/ArrayList;)V
    .locals 7

    const-string v4, ""

    const-string v5, "..."

    const-string v2, "\n"

    const/4 v6, 0x0

    move-object v0, p1

    move-object v1, p0

    move-object v3, v4

    .line 3644
    invoke-static/range {v0 .. v6}, Ll/᩷ܶ᩵;->֫(Ljava/lang/Iterable;Ljava/lang/StringBuilder;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ܺ᩹᩵;)V

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;Ll/ܺ᩹᩵;)V
    .locals 6

    const-string v0, "<this>"

    .line 0
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 305
    invoke-static {p0}, Ll/֫ܶ᩵;->֫(Ljava/util/List;)I

    move-result v0

    const/4 v1, 0x0

    if-ltz v0, :cond_3

    const/4 v2, 0x0

    .line 306
    :goto_0
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 307
    invoke-interface {p1, v3}, Ll/ܺ᩹᩵;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    goto :goto_1

    :cond_0
    if-eq v2, v1, :cond_1

    .line 311
    invoke-virtual {p0, v2, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    :goto_1
    if-eq v1, v0, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    move v1, v2

    .line 315
    :cond_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v1, p1, :cond_4

    .line 316
    invoke-static {p0}, Ll/֫ܶ᩵;->֫(Ljava/util/List;)I

    move-result p1

    if-gt v1, p1, :cond_4

    .line 317
    :goto_2
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    if-eq p1, v1, :cond_4

    add-int/lit8 p1, p1, -0x1

    goto :goto_2

    :cond_4
    return-void
.end method
