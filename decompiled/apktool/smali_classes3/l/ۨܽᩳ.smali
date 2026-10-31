.class public final synthetic Ll/ۨܽᩳ;
.super Ljava/lang/Object;
.source "L19N"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨܽᩳ;->᩸:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ۨܽᩳ;->᩸:Ljava/util/List;

    .line 369
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ᩳᩳ;

    .line 370
    invoke-virtual {v1}, Ll/֫ᩳᩳ;->run()V

    goto :goto_0

    :cond_0
    return-void
.end method
