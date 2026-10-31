.class public final synthetic Ll/ܰۧۢ;
.super Ljava/lang/Object;
.source "R1EE"

# interfaces
.implements Ll/۠ۛ᩷;


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/ۤܽۢ;

.field public final synthetic ᩹:[C


# direct methods
.method public synthetic constructor <init>(Ll/ۤܽۢ;[CI)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰۧۢ;->᩸:Ll/ۤܽۢ;

    iput-object p2, p0, Ll/ܰۧۢ;->᩹:[C

    iput p3, p0, Ll/ܰۧۢ;->᩶:I

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)Ljava/util/List;
    .locals 9

    .line 2
    iget-object v0, p0, Ll/ܰۧۢ;->᩸:Ll/ۤܽۢ;

    .line 4
    iget-object v1, p0, Ll/ܰۧۢ;->᩹:[C

    .line 6
    iget v2, p0, Ll/ܰۧۢ;->᩶:I

    .line 8
    check-cast p1, Ll/ܰ֫ۢ;

    .line 247
    :try_start_0
    invoke-virtual {v0}, Ll/ۤܽۢ;->get()Ll/᩺ۖܽ;

    move-result-object v0

    .line 248
    invoke-interface {p1, v0}, Ll/ܰ֫ۢ;->֫(Ll/᩺ۖܽ;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 249
    invoke-virtual {v0}, Ll/᩺ۖܽ;->֫()Ll/ۨۖܽ;

    move-result-object p1

    .line 251
    invoke-virtual {p1}, Ll/ۨۖܽ;->getValue()[C

    move-result-object v0

    invoke-virtual {p1}, Ll/ۨۖܽ;->length()I

    move-result v3

    .line 250
    sget v4, Ll/ۗᩳۢ;->֫:I

    .line 158
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 160
    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/16 v8, 0x1f4

    if-ge v7, v8, :cond_1

    .line 161
    invoke-static {v3, v2, v6, v0, v1}, Ll/ۗᩳۢ;->֫(III[C[C)I

    move-result v6

    const/4 v7, -0x1

    if-ne v6, v7, :cond_0

    goto :goto_1

    :cond_0
    add-int v7, v6, v2

    .line 163
    filled-new-array {v6, v7}, [I

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v6, v7

    goto :goto_0

    .line 252
    :cond_1
    :goto_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 253
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 254
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [I

    .line 255
    new-instance v3, Ll/᩵ۛ᩷;

    invoke-direct {v3, v5}, Ll/᩵ۛ᩷;-><init>(I)V

    .line 256
    aget v4, v2, v5

    iput v4, v3, Ll/᩵ۛ᩷;->᩸:I

    const/4 v6, 0x1

    .line 257
    aget v2, v2, v6

    iput v2, v3, Ll/᩵ۛ᩷;->᩹:I

    .line 258
    invoke-virtual {v3, v4, v2, p1}, Ll/᩵ۛ᩷;->֫(IILjava/lang/CharSequence;)V

    .line 259
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_2
    return-object v0

    :catchall_0
    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method
