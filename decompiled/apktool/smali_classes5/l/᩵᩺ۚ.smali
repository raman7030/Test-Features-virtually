.class public final synthetic Ll/᩵᩺ۚ;
.super Ljava/lang/Object;
.source "B7FA"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩶:Ljava/util/function/Function;

.field public final synthetic ᩸:Ll/֡᩺ۚ;

.field public final synthetic ᩹:Ljava/util/function/Function;


# direct methods
.method public synthetic constructor <init>(Ll/֡᩺ۚ;Ljava/util/function/Function;Ljava/util/function/Function;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵᩺ۚ;->᩸:Ll/֡᩺ۚ;

    iput-object p2, p0, Ll/᩵᩺ۚ;->᩹:Ljava/util/function/Function;

    iput-object p3, p0, Ll/᩵᩺ۚ;->᩶:Ljava/util/function/Function;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 5

    .line 2
    check-cast p1, Ll/᩹ᩳ֨;

    .line 259
    invoke-virtual {p1}, Ll/᩹ᩳ֨;->ܿ()Z

    move-result v0

    iget-object v1, p0, Ll/᩵᩺ۚ;->᩸:Ll/֡᩺ۚ;

    iget-object v2, p0, Ll/᩵᩺ۚ;->᩹:Ljava/util/function/Function;

    if-eqz v0, :cond_1

    .line 260
    iget-object v0, v1, Ll/֡᩺ۚ;->᩸:Ljava/util/ArrayList;

    new-instance v1, Ll/᩵ۗۚ;

    .line 261
    invoke-interface {v2, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺۤۚ;

    move-object v3, p1

    check-cast v3, Ll/֨ᩳ֨;

    .line 262
    invoke-virtual {v3}, Ll/֨ᩳ֨;->᩻()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 263
    check-cast p1, Ll/ۙᩳ֨;

    invoke-virtual {p1}, Ll/ۙᩳ֨;->᩷()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 265
    :cond_0
    invoke-virtual {p1}, Ll/ۙᩳ֨;->᩷()Ljava/lang/String;

    move-result-object p1

    iget-object v4, p0, Ll/᩵᩺ۚ;->᩶:Ljava/util/function/Function;

    invoke-interface {v4, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺۤۚ;

    :goto_0
    invoke-direct {v1, v2, v3, p1}, Ll/᩵ۗۚ;-><init>(Ll/ܺۤۚ;Ljava/lang/Integer;Ljava/lang/Object;)V

    .line 260
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 267
    :cond_1
    iget-object v0, v1, Ll/֡᩺ۚ;->᩹:Ljava/util/ArrayList;

    invoke-interface {v2, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺۤۚ;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
