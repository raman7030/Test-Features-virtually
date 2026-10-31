.class public final Ll/ܳ᩶ܽ;
.super Ljava/lang/Object;
.source "P676"


# instance fields
.field public ֫:Ll/᩻᩶ܽ;


# virtual methods
.method public final ֫(Ljava/util/Set;)V
    .locals 4

    .line 1532
    iget-object v0, p0, Ll/ܳ᩶ܽ;->֫:Ll/᩻᩶ܽ;

    iget-object v1, v0, Ll/᩻᩶ܽ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 1533
    iget-object v1, v0, Ll/᩻᩶ܽ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 1535
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x2f

    .line 1536
    invoke-virtual {v1, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    .line 1538
    iget-object v2, v0, Ll/᩻᩶ܽ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 1540
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/᩻᩶ܽ;->֫(Ljava/lang/String;)Ll/᩻᩶ܽ;

    move-result-object v3

    .line 1541
    iget-object v3, v3, Ll/᩻᩶ܽ;->᩹:Ljava/util/ArrayList;

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1544
    :cond_1
    invoke-virtual {v0}, Ll/᩻᩶ܽ;->֫()V

    return-void
.end method
