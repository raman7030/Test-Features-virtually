.class public final synthetic Ll/ܳ᩺᩷;
.super Ljava/lang/Object;
.source "P1EM"

# interfaces
.implements Ll/۠ۛ᩷;


# instance fields
.field public final synthetic ᩶:Z

.field public final synthetic ᩸:Ll/ۡ᩺᩷;

.field public final synthetic ᩹:Ll/ܶۛ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۡ᩺᩷;Ll/ܶۛ᩷;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳ᩺᩷;->᩸:Ll/ۡ᩺᩷;

    iput-object p2, p0, Ll/ܳ᩺᩷;->᩹:Ll/ܶۛ᩷;

    iput-boolean p3, p0, Ll/ܳ᩺᩷;->᩶:Z

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)Ljava/util/List;
    .locals 9

    .line 2
    check-cast p1, Ll/֨᩺᩷;

    .line 99
    invoke-interface {p1}, Ll/֨᩺᩷;->getPath()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ܳ᩺᩷;->᩸:Ll/ۡ᩺᩷;

    invoke-virtual {v1, v0}, Ll/ۡ᩺᩷;->֫(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 100
    invoke-interface {p1}, Ll/֨᩺᩷;->֫()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    if-nez p1, :cond_0

    goto/16 :goto_2

    .line 103
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 104
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻᩻ܽ;

    .line 105
    iget v4, v3, Ll/᩻᩻ܽ;->ܳ:I

    iget v5, v3, Ll/᩻᩻ܽ;->֫:I

    iget v6, v3, Ll/᩻᩻ܽ;->ܽ:I

    const/4 v7, 0x1

    if-ne v4, v7, :cond_1

    .line 106
    iget-object v4, p0, Ll/ܳ᩺᩷;->᩹:Ll/ܶۛ᩷;

    invoke-virtual {v4}, Ll/ܶۛ᩷;->get()Ll/۫ۘܽ;

    move-result-object v4

    iget-object v3, v3, Ll/᩻᩻ܽ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 107
    iget-boolean v3, p0, Ll/ܳ᩺᩷;->᩶:Z

    const/4 v7, 0x0

    if-eqz v3, :cond_2

    .line 108
    invoke-virtual {v4}, Ll/۫ۘܽ;->matches()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 109
    new-instance v3, Ll/᩵ۛ᩷;

    invoke-direct {v3, v7}, Ll/᩵ۛ᩷;-><init>(I)V

    .line 110
    iput v6, v3, Ll/᩵ۛ᩷;->᩸:I

    .line 111
    iput v5, v3, Ll/᩵ۛ᩷;->᩹:I

    .line 112
    invoke-virtual {v3, v6, v5, p1}, Ll/᩵ۛ᩷;->֫(IILjava/lang/CharSequence;)V

    .line 113
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 39
    :cond_2
    invoke-static {v4}, Ll/ۛۜᩳ;->֫(Ll/۫ۘܽ;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 117
    new-instance v3, Ll/᩵ۛ᩷;

    invoke-direct {v3, v7}, Ll/᩵ۛ᩷;-><init>(I)V

    .line 118
    new-instance v7, Ll/ۢۘܽ;

    invoke-direct {v7}, Ll/ۢۘܽ;-><init>()V

    .line 120
    :try_start_0
    invoke-virtual {p1, v6, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ll/ۢۘܽ;->֫(Ljava/lang/String;)V

    .line 121
    invoke-virtual {v4}, Ll/۫ۘܽ;->start()I

    move-result v8

    invoke-virtual {v7, v8}, Ll/ۢۘܽ;->֫(I)I

    move-result v8

    add-int/2addr v8, v6

    iput v8, v3, Ll/᩵ۛ᩷;->᩸:I

    .line 122
    invoke-virtual {v4}, Ll/۫ۘܽ;->end()I

    move-result v4

    invoke-virtual {v7, v4}, Ll/ۢۘܽ;->֫(I)I

    move-result v4

    add-int/2addr v4, v6

    iput v4, v3, Ll/᩵ۛ᩷;->᩹:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 126
    :catch_0
    iput v6, v3, Ll/᩵ۛ᩷;->᩸:I

    .line 127
    iput v5, v3, Ll/᩵ۛ᩷;->᩹:I

    .line 130
    :goto_1
    iget v4, v3, Ll/᩵ۛ᩷;->᩸:I

    iget v5, v3, Ll/᩵ۛ᩷;->᩹:I

    invoke-virtual {v3, v4, v5, p1}, Ll/᩵ۛ᩷;->֫(IILjava/lang/CharSequence;)V

    .line 132
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 137
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    move-object v1, v2

    :cond_5
    :goto_2
    return-object v1
.end method
