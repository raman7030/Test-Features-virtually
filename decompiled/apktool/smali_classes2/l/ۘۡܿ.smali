.class public final Ll/ۘۡܿ;
.super Ljava/lang/Object;
.source "Q6ZO"


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 383
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 384
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۘۡܿ;->ۧ:Ljava/util/ArrayList;

    .line 385
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۘۡܿ;->֫:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 395
    iget-object v0, p0, Ll/ۘۡܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/᩸᩷ܿ;)I
    .locals 1

    .line 403
    iget-object v0, p0, Ll/ۘۡܿ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public final ֫(I)Ll/᩸᩷ܿ;
    .locals 1

    .line 399
    iget-object v0, p0, Ll/ۘۡܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩸᩷ܿ;

    return-object p1
.end method

.method public final ۧ(Ll/᩸᩷ܿ;)V
    .locals 3

    .line 388
    iget-object v0, p0, Ll/ۘۡܿ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 389
    iget-object v1, p0, Ll/ۘۡܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
