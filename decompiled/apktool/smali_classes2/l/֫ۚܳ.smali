.class public final synthetic Ll/֫ۚܳ;
.super Ljava/lang/Object;
.source "W1YM"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ll/ۖۢܳ;

.field public final synthetic ᩶:Ljava/util/ArrayList;

.field public final synthetic ᩸:Ljava/util/ArrayList;

.field public final synthetic ᩹:Ll/ܽۢܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ܽۢܳ;Ll/ۖۢܳ;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Ll/֫ۚܳ;->᩸:Ljava/util/ArrayList;

    iput-object p1, p0, Ll/֫ۚܳ;->᩹:Ll/ܽۢܳ;

    iput-object p4, p0, Ll/֫ۚܳ;->᩶:Ljava/util/ArrayList;

    iput-object p2, p0, Ll/֫ۚܳ;->ۙ:Ll/ۖۢܳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 61
    iget-object v0, p0, Ll/֫ۚܳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤۢܳ;

    .line 62
    invoke-virtual {v2}, Ll/ۤۢܳ;->֫()V

    goto :goto_0

    .line 64
    :cond_0
    iget-object v1, p0, Ll/֫ۚܳ;->᩹:Ll/ܽۢܳ;

    invoke-virtual {v1}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v2

    new-instance v3, Ll/ۧۚܳ;

    iget-object v4, p0, Ll/֫ۚܳ;->ۙ:Ll/ۖۢܳ;

    iget-object v5, p0, Ll/֫ۚܳ;->᩶:Ljava/util/ArrayList;

    invoke-direct {v3, v1, v4, v5, v0}, Ll/ۧۚܳ;-><init>(Ll/ܽۢܳ;Ll/ۖۢܳ;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {v2, v1, v5, v3}, Ll/ܽ᩷ܳ;->֫(Ll/ܽۢܳ;Ljava/util/List;Ljava/lang/Runnable;)V

    return-void
.end method
