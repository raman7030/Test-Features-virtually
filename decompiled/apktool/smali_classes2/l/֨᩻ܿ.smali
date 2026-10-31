.class public final synthetic Ll/֨᩻ܿ;
.super Ljava/lang/Object;
.source "A7IB"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۠᩻ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/۠᩻ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨᩻ܿ;->᩸:Ll/۠᩻ܿ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 103
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 104
    iget-object v1, p0, Ll/֨᩻ܿ;->᩸:Ll/۠᩻ܿ;

    iget-object v1, v1, Ll/۠᩻ܿ;->ᩳ:Ll/ۛ᩻ܿ;

    invoke-static {v1}, Ll/ۛ᩻ܿ;->ۧ(Ll/ۛ᩻ܿ;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶᩻ܿ;

    .line 105
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v3, v2, Ll/᩸᩻ܿ;

    if-eqz v3, :cond_3

    .line 106
    invoke-virtual {v2}, Ll/᩶᩻ܿ;->֫()Ll/᩸᩻ܿ;

    move-result-object v2

    iget v2, v2, Ll/᩸᩻ܿ;->֫:I

    const/4 v3, 0x1

    if-eq v2, v3, :cond_2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 108
    :cond_1
    sget-object v2, Ll/ۡ᩻ܿ;->֫:Ll/ۡ᩻ܿ;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 107
    :cond_2
    sget-object v2, Ll/ᩴ᩻ܿ;->֫:Ll/ᩴ᩻ܿ;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 0
    :cond_3
    instance-of v3, v2, Ll/ۙ᩻ܿ;

    if-eqz v3, :cond_0

    .line 111
    invoke-virtual {v2}, Ll/᩶᩻ܿ;->ۧ()Ll/ۙ᩻ܿ;

    move-result-object v2

    iget-object v2, v2, Ll/ۙ᩻ܿ;->֫:Ll/ۖ᩻ܿ;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 114
    :cond_4
    invoke-static {v0}, Ll/֡᩻ܿ;->֫(Ljava/util/ArrayList;)V

    .line 115
    invoke-static {}, Ll/֡᩻ܿ;->ܿ()V

    return-void
.end method
