.class public final synthetic Ll/۬ܳܿ;
.super Ljava/lang/Object;
.source "89CO"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۫ܳܿ;


# direct methods
.method public synthetic constructor <init>(Ll/۫ܳܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ܳܿ;->᩸:Ll/۫ܳܿ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 117
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 118
    iget-object v1, p0, Ll/۬ܳܿ;->᩸:Ll/۫ܳܿ;

    iget-object v1, v1, Ll/۫ܳܿ;->ᩳ:Ll/ۢ᩻ܿ;

    invoke-static {v1}, Ll/ۢ᩻ܿ;->ۧ(Ll/ۢ᩻ܿ;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰܳܿ;

    .line 119
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v4, v2, Ll/ۛܳܿ;

    if-eqz v4, :cond_3

    .line 120
    invoke-virtual {v2}, Ll/ܰܳܿ;->֫()Ll/ۛܳܿ;

    move-result-object v2

    iget v2, v2, Ll/ۛܳܿ;->֫:I

    if-eq v2, v3, :cond_2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 122
    :cond_1
    sget-object v2, Ll/ۡ᩻ܿ;->֫:Ll/ۡ᩻ܿ;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 121
    :cond_2
    sget-object v2, Ll/ᩴ᩻ܿ;->֫:Ll/ᩴ᩻ܿ;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 0
    :cond_3
    instance-of v3, v2, Ll/۟ܳܿ;

    if-eqz v3, :cond_0

    .line 125
    invoke-virtual {v2}, Ll/ܰܳܿ;->ۧ()Ll/۟ܳܿ;

    move-result-object v2

    iget-object v2, v2, Ll/۟ܳܿ;->֫:Ll/ۖ᩻ܿ;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    const/4 v1, -0x1

    const/4 v2, 0x0

    .line 132
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v2, v4, :cond_6

    .line 133
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۖ᩻ܿ;

    .line 134
    invoke-virtual {v4}, Ll/ۖ᩻ܿ;->֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "builtin:systemTranslate"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    const-string v5, "builtin:translate"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_2

    :cond_5
    move v1, v2

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    add-int/2addr v1, v3

    .line 143
    new-instance v2, Ll/᩹ܳܿ;

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Ll/᩹ܳܿ;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 145
    :cond_7
    invoke-static {v0}, Ll/ۙܳܿ;->֫(Ljava/util/ArrayList;)V

    .line 146
    invoke-static {}, Ll/ۙܳܿ;->ܳ()V

    return-void
.end method
