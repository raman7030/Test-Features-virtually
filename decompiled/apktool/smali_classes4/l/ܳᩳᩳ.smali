.class public final Ll/ܳᩳᩳ;
.super Ljava/lang/Object;
.source "L19N"


# instance fields
.field public ֫:Ll/ۧܽᩳ;

.field public ۧ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>([B)V
    .locals 3

    .line 394
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 392
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܳᩳᩳ;->ۧ:Ljava/util/HashMap;

    .line 395
    new-instance v0, Ll/ܽܽᩳ;

    invoke-direct {v0, p1}, Ll/ܽܽᩳ;-><init>([B)V

    .line 396
    invoke-virtual {v0}, Ll/ܽܽᩳ;->֫()Ll/ۧܽᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ܳᩳᩳ;->֫:Ll/ۧܽᩳ;

    .line 64
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 66
    :goto_0
    invoke-virtual {v0}, Ll/ܽܽᩳ;->֫()Ll/ۧܽᩳ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 67
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 397
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧܽᩳ;

    .line 398
    iget-object v1, p0, Ll/ܳᩳᩳ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ll/ۧܽᩳ;->ۧ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    return-void
.end method
