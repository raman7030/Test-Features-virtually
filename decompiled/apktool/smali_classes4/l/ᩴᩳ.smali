.class public final Ll/ᩴᩳ;
.super Ljava/lang/Object;
.source "YB7L"


# instance fields
.field public final ֫:Ll/۟ۢ֫;

.field public final ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/۟ۢ֫;)V
    .locals 0

    .line 471
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 472
    iput-object p1, p0, Ll/ᩴᩳ;->֫:Ll/۟ۢ֫;

    .line 473
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ᩴᩳ;->ۧ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 482
    iget-object v0, p0, Ll/ᩴᩳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿۡ֫;

    .line 483
    iget-object v3, p0, Ll/ᩴᩳ;->֫:Ll/۟ۢ֫;

    invoke-virtual {v3, v2}, Ll/۟ۢ֫;->ۧ(Ll/ܳۡ֫;)V

    goto :goto_0

    .line 485
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final ֫(Ll/ܿۡ֫;)V
    .locals 1

    .line 477
    iget-object v0, p0, Ll/ᩴᩳ;->֫:Ll/۟ۢ֫;

    invoke-virtual {v0, p1}, Ll/۟ۢ֫;->֫(Ll/ܳۡ֫;)V

    .line 478
    iget-object v0, p0, Ll/ᩴᩳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
