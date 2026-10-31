.class public final Ll/ۘۙۚ;
.super Ll/ۡۙۚ;
.source "74QP"


# instance fields
.field public ۜ:Ljava/util/ArrayList;

.field public ᩷:I

.field public ᩻:Ljava/util/ArrayList;


# direct methods
.method public static ֫(Ljava/util/ArrayList;)[Ljava/lang/Object;
    .locals 5

    .line 182
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 184
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 185
    instance-of v4, v3, Ll/᩹ۙۚ;

    if-eqz v4, :cond_0

    .line 186
    check-cast v3, Ll/᩹ۙۚ;

    invoke-virtual {v3}, Ll/᩹ۙۚ;->֫()Ll/֨᩶ۚ;

    move-result-object v3

    .line 188
    :cond_0
    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method


# virtual methods
.method public final ֫(Ll/ܶ᩶ۚ;)V
    .locals 8

    .line 132
    iget-object v0, p0, Ll/ۘۙۚ;->ۜ:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ۘۙۚ;->᩻:Ljava/util/ArrayList;

    iget v3, p0, Ll/ۘۙۚ;->᩷:I

    const/4 v2, -0x1

    if-eq v3, v2, :cond_4

    if-eqz v3, :cond_4

    const/4 v2, 0x1

    if-eq v3, v2, :cond_3

    const/4 v2, 0x2

    if-eq v3, v2, :cond_2

    const/4 v1, 0x3

    if-eq v3, v1, :cond_1

    const/4 v1, 0x4

    if-ne v3, v1, :cond_0

    const/4 v5, 0x1

    .line 147
    invoke-static {v0}, Ll/ۘۙۚ;->֫(Ljava/util/ArrayList;)[Ljava/lang/Object;

    move-result-object v7

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Ll/ܶ᩶ۚ;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    return-void

    .line 150
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_1
    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    .line 144
    invoke-virtual/range {v2 .. v7}, Ll/ܶ᩶ۚ;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    return-void

    .line 141
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Ll/ܶ᩶ۚ;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    return-void

    .line 138
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v1}, Ll/ۘۙۚ;->֫(Ljava/util/ArrayList;)[Ljava/lang/Object;

    move-result-object v6

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Ll/ܶ᩶ۚ;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    return-void

    .line 135
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v1}, Ll/ۘۙۚ;->֫(Ljava/util/ArrayList;)[Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-static {v0}, Ll/ۘۙۚ;->֫(Ljava/util/ArrayList;)[Ljava/lang/Object;

    move-result-object v7

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Ll/ܶ᩶ۚ;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    return-void
.end method
