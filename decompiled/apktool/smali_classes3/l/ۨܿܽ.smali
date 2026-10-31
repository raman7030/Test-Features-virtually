.class public final Ll/ۨܿܽ;
.super Ljava/lang/Object;
.source "Y6J0"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ll/۠ܿܽ;

.field public final ܽ:Ljava/util/HashMap;

.field public final ᩳ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ll/۠ܿܽ;)V
    .locals 13

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۨܿܽ;->֫:Ljava/util/ArrayList;

    .line 15
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/ۨܿܽ;->ܽ:Ljava/util/HashMap;

    .line 16
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/ۨܿܽ;->ᩳ:Ljava/util/HashMap;

    .line 19
    iput-object p1, p0, Ll/ۨܿܽ;->ۧ:Ll/۠ܿܽ;

    .line 20
    new-instance v1, Ll/ۛܿܽ;

    invoke-direct {v1}, Ll/ۛܿܽ;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    invoke-virtual {p1}, Ll/۠ᩳܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶ܿܽ;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 23
    :cond_0
    new-instance p1, Ll/ۤܿܽ;

    const/4 v1, 0x0

    invoke-direct {p1, v1}, Ll/ۤܿܽ;-><init>(I)V

    invoke-static {v0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 24
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶ܿܽ;

    .line 26
    invoke-virtual {v1}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v3

    .line 27
    invoke-virtual {p1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-nez v4, :cond_1

    goto :goto_2

    .line 28
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :goto_2
    add-int/lit8 v4, v2, 0x1

    .line 29
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    iget-object v3, p0, Ll/ۨܿܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v2, v3, :cond_2

    iget-object v3, p0, Ll/ۨܿܽ;->֫:Ljava/util/ArrayList;

    new-instance v4, Ll/ۛܿܽ;

    invoke-direct {v4}, Ll/ۛܿܽ;-><init>()V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    :cond_2
    iget-object v3, p0, Ll/ۨܿܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛܿܽ;

    .line 32
    iget-object v3, v2, Ll/ۛܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    iget-object v3, p0, Ll/ۨܿܽ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ll/ۤᩳܽ;->ۘ֫()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    iget-object v2, p0, Ll/ۨܿܽ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ll/ۤᩳܽ;->ۘ֫()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 71
    :cond_3
    iget-object p1, p0, Ll/ۨܿܽ;->֫:Ljava/util/ArrayList;

    iget-object v0, p0, Ll/ۨܿܽ;->ۧ:Ll/۠ܿܽ;

    invoke-virtual {v0}, Ll/۠ᩳܽ;->֡֫()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ܿܽ;

    .line 72
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 73
    invoke-virtual {v1}, Ll/֡ܿܽ;->۠()I

    move-result v4

    if-nez v4, :cond_5

    .line 74
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛܿܽ;

    iget-object v3, v3, Ll/ۛܿܽ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 77
    :cond_5
    invoke-virtual {v1}, Ll/ۘᩳܽ;->ܶ֫()Ljava/lang/Iterable;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۚܿܽ;

    .line 78
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 79
    invoke-virtual {v5}, Ll/ᩴᩳܽ;->ۙ֫()Ll/֨ۡᩴ;

    move-result-object v7

    check-cast v7, Ll/ܺۢᩴ;

    invoke-virtual {v7}, Ll/ܺۢᩴ;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۛܿܽ;

    new-instance v8, Ll/ܺۢᩴ;

    invoke-direct {v8}, Ll/ܺۢᩴ;-><init>()V

    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    const/4 v7, 0x0

    .line 80
    :goto_4
    invoke-virtual {v5}, Ll/ᩴᩳܽ;->ۙ֫()Ll/֨ۡᩴ;

    move-result-object v8

    check-cast v8, Ll/ܺۢᩴ;

    invoke-virtual {v8}, Ll/ܺۢᩴ;->size()I

    move-result v8

    if-ge v7, v8, :cond_9

    .line 81
    invoke-virtual {v5}, Ll/ᩴᩳܽ;->ۙ֫()Ll/֨ۡᩴ;

    move-result-object v8

    check-cast v8, Ll/ܺۢᩴ;

    invoke-virtual {v8, v7}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v8

    .line 82
    invoke-direct {p0, v8}, Ll/ۨܿܽ;->֫(I)Ll/ۛܿܽ;

    move-result-object v9

    .line 83
    invoke-virtual {v6, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܺۢᩴ;

    if-nez v10, :cond_8

    .line 84
    new-instance v10, Ll/ܺۢᩴ;

    invoke-direct {v10}, Ll/ܺۢᩴ;-><init>()V

    invoke-virtual {v6, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    :cond_8
    invoke-virtual {v10, v8}, Ll/ܺۢᩴ;->add(I)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 87
    :cond_9
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۛܿܽ;

    .line 88
    invoke-virtual {v6, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ܺۢᩴ;

    if-nez v9, :cond_a

    goto :goto_5

    .line 90
    :cond_a
    invoke-virtual {v3, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/֡ܿܽ;

    if-nez v10, :cond_b

    .line 92
    new-instance v10, Ll/֡ܿܽ;

    invoke-virtual {v1}, Ll/ۘᩳܽ;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Ll/ۘᩳܽ;->ᩴۧ()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v10, v11, v12}, Ll/֡ܿܽ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    invoke-virtual {v3, v8, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    iget-object v8, v8, Ll/ۛܿܽ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    :cond_b
    invoke-virtual {v5}, Ll/ᩴᩳܽ;->ܺ()I

    move-result v8

    invoke-virtual {v10, v8, v9}, Ll/֡ܿܽ;->֫(ILl/ܺۢᩴ;)V

    goto :goto_5

    .line 103
    :cond_c
    iget-object p1, p0, Ll/ۨܿܽ;->ۧ:Ll/۠ܿܽ;

    invoke-virtual {p1}, Ll/۠ᩳܽ;->᩹()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_d
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶܿܽ;

    .line 104
    invoke-virtual {v0}, Ll/ܶܿܽ;->᩷()I

    move-result v1

    if-nez v1, :cond_e

    .line 105
    iget-object v1, p0, Ll/ۨܿܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛܿܽ;

    iget-object v1, v1, Ll/ۛܿܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 108
    :cond_e
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 109
    invoke-virtual {v0}, Ll/᩸ᩳܽ;->ᩳ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩸ܿܽ;

    .line 110
    invoke-virtual {v3}, Ll/᩹ᩳܽ;->ᩳۧ()I

    move-result v4

    invoke-direct {p0, v4}, Ll/ۨܿܽ;->֫(I)Ll/ۛܿܽ;

    move-result-object v4

    .line 111
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܶܿܽ;

    if-nez v5, :cond_f

    .line 113
    new-instance v5, Ll/ܶܿܽ;

    invoke-direct {v5}, Ll/ܶܿܽ;-><init>()V

    .line 114
    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    iget-object v4, v4, Ll/ۛܿܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    :cond_f
    invoke-virtual {v3}, Ll/᩹ᩳܽ;->ᩴ֫()I

    move-result v4

    invoke-virtual {v3}, Ll/᩹ᩳܽ;->ᩳۧ()I

    move-result v3

    invoke-virtual {v5, v4, v3}, Ll/ܶܿܽ;->֫(II)V

    goto :goto_7

    .line 39
    :cond_10
    iget-object p1, p0, Ll/ۨܿܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    return-void
.end method

.method private ֫(I)Ll/ۛܿܽ;
    .locals 4

    ushr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    .line 61
    iget-object v1, p0, Ll/ۨܿܽ;->ᩳ:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶ܿܽ;

    const v2, 0xffff

    and-int/2addr v2, p1

    ushr-int/lit8 p1, p1, 0x18

    .line 63
    iget-object v3, p0, Ll/ۨܿܽ;->ۧ:Ll/۠ܿܽ;

    invoke-virtual {v3}, Ll/۠ᩳܽ;->᩻()I

    move-result v3

    if-ne p1, v3, :cond_0

    if-eqz v1, :cond_0

    .line 271
    iget-object p1, v1, Ll/᩶ܿܽ;->۬:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v2, p1, :cond_0

    .line 64
    invoke-virtual {v1, v2}, Ll/᩶ܿܽ;->ܽ(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 65
    iget-object p1, p0, Ll/ۨܿܽ;->ܽ:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛܿܽ;

    return-object p1

    .line 67
    :cond_0
    iget-object p1, p0, Ll/ۨܿܽ;->֫:Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛܿܽ;

    return-object p1
.end method
