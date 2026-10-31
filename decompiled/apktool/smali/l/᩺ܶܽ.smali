.class public final Ll/᩺ܶܽ;
.super Ljava/lang/Object;
.source "D77D"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ll/ܰܶܽ;

.field public final ܽ:Ll/ܰܶܽ;


# direct methods
.method public constructor <init>(Ll/ܰܶܽ;Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x0

    .line 330
    invoke-direct {p0, p1, v0}, Ll/᩺ܶܽ;-><init>(Ll/ܰܶܽ;Ll/ܰܶܽ;)V

    .line 331
    iget-object p1, p0, Ll/᩺ܶܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public constructor <init>(Ll/ܰܶܽ;Ll/ܰܶܽ;)V
    .locals 1

    .line 324
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 322
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩺ܶܽ;->֫:Ljava/util/ArrayList;

    .line 325
    iput-object p1, p0, Ll/᩺ܶܽ;->ۧ:Ll/ܰܶܽ;

    .line 326
    iput-object p2, p0, Ll/᩺ܶܽ;->ܽ:Ll/ܰܶܽ;

    return-void
.end method
