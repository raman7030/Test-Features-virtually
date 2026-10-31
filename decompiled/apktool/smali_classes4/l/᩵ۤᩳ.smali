.class public final Ll/᩵ۤᩳ;
.super Ljava/lang/Object;
.source "U8WA"


# direct methods
.method public static ֫(ZLjava/util/List;Ll/᩺۬ۡ;)V
    .locals 7

    .line 58
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ܳۘ;

    .line 121
    invoke-interface {v1, p0}, Ll/ᩴܳۘ;->֫(Z)I

    move-result v3

    .line 122
    invoke-interface {v1, p0}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result v4

    if-ne v3, v4, :cond_1

    .line 123
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-ne v3, v5, :cond_1

    goto :goto_0

    :cond_1
    const/16 v5, 0xa

    .line 126
    invoke-interface {p2, v5, v2, v3}, Ll/᩺۬ۡ;->lastIndexOf(CII)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    if-eq v2, v3, :cond_2

    .line 128
    invoke-interface {v1, v2, p0}, Ll/ᩴܳۘ;->ۧ(IZ)V

    sub-int/2addr v3, v2

    .line 129
    invoke-static {p0, v1, v3}, Ll/᩵ۤᩳ;->֫(ZLl/֡ܳۘ;I)V

    .line 132
    :cond_2
    invoke-interface {v1, p0}, Ll/֡ܳۘ;->ۧ(Z)I

    move-result v3

    invoke-interface {v1, p0}, Ll/֡ܳۘ;->ᩳ(Z)I

    move-result v6

    if-ne v3, v6, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v2, v4, -0x1

    .line 135
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    invoke-interface {p2, v5, v2, v3}, Ll/᩺۬ۡ;->indexOf(CII)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_4

    .line 137
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    goto :goto_1

    :cond_4
    add-int/lit8 v2, v2, 0x1

    :goto_1
    if-eq v4, v2, :cond_0

    .line 143
    invoke-interface {v1, v2, p0}, Ll/ᩴܳۘ;->ᩳ(IZ)V

    goto :goto_0

    .line 63
    :cond_5
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 64
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ܳۘ;

    if-nez p2, :cond_6

    goto :goto_5

    .line 67
    :cond_6
    invoke-interface {p2, p0}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result v1

    invoke-interface {v0, p0}, Ll/ᩴܳۘ;->֫(Z)I

    move-result v2

    if-lt v1, v2, :cond_e

    const/4 v1, 0x0

    :goto_3
    const/4 v2, 0x2

    if-ge v1, v2, :cond_b

    if-nez v1, :cond_7

    const/4 v2, 0x1

    goto :goto_4

    :cond_7
    const/4 v2, 0x0

    .line 84
    :goto_4
    invoke-interface {p2, v2}, Ll/ᩴܳۘ;->֫(Z)I

    move-result v3

    .line 85
    invoke-interface {v0, v2}, Ll/ᩴܳۘ;->֫(Z)I

    move-result v4

    if-ge v3, v4, :cond_8

    .line 87
    invoke-interface {v0, v3, v2}, Ll/ᩴܳۘ;->ۧ(IZ)V

    sub-int/2addr v4, v3

    .line 88
    invoke-static {v2, v0, v4}, Ll/᩵ۤᩳ;->֫(ZLl/֡ܳۘ;I)V

    .line 92
    :cond_8
    invoke-interface {p2, v2}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result v3

    .line 93
    invoke-interface {v0, v2}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result v4

    if-ge v3, v4, :cond_9

    .line 95
    invoke-interface {p2, v4, v2}, Ll/ᩴܳۘ;->ᩳ(IZ)V

    .line 100
    :cond_9
    invoke-interface {p2, v2}, Ll/֡ܳۘ;->ᩳ(Z)I

    move-result v3

    .line 101
    invoke-interface {v0, v2}, Ll/֡ܳۘ;->ᩳ(Z)I

    move-result v4

    if-ge v3, v4, :cond_a

    .line 103
    invoke-interface {p2, v4, v2}, Ll/֡ܳۘ;->֫(IZ)V

    :cond_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 106
    :cond_b
    invoke-interface {p2}, Ll/֡ܳۘ;->ܳ()Ljava/util/List;

    move-result-object v1

    .line 107
    invoke-interface {v0}, Ll/֡ܳۘ;->ܳ()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_d

    if-nez v1, :cond_c

    .line 110
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 112
    :cond_c
    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 114
    :cond_d
    invoke-interface {p2, v1}, Ll/֡ܳۘ;->֫(Ljava/util/List;)V

    .line 69
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_2

    :cond_e
    :goto_5
    move-object p2, v0

    goto :goto_2

    :cond_f
    return-void
.end method

.method public static ֫(ZLl/֡ܳۘ;I)V
    .locals 2

    .line 157
    invoke-interface {p1}, Ll/֡ܳۘ;->ܳ()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 159
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴܳۘ;

    if-eqz p0, :cond_0

    .line 161
    invoke-interface {v0}, Ll/ᩴܳۘ;->ᩳ()I

    move-result v1

    add-int/2addr v1, p2

    invoke-interface {v0, v1}, Ll/ᩴܳۘ;->ܿ(I)V

    .line 162
    invoke-interface {v0}, Ll/ᩴܳۘ;->֫()I

    move-result v1

    add-int/2addr v1, p2

    invoke-interface {v0, v1}, Ll/ᩴܳۘ;->ܽ(I)V

    goto :goto_0

    .line 164
    :cond_0
    invoke-interface {v0}, Ll/ᩴܳۘ;->ܿ()I

    move-result v1

    add-int/2addr v1, p2

    invoke-interface {v0, v1}, Ll/ᩴܳۘ;->ܳ(I)V

    .line 165
    invoke-interface {v0}, Ll/ᩴܳۘ;->᩻()I

    move-result v1

    add-int/2addr v1, p2

    invoke-interface {v0, v1}, Ll/ᩴܳۘ;->ۧ(I)V

    goto :goto_0

    :cond_1
    return-void
.end method
