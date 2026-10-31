.class public final Ll/ܶ᩻ܳ;
.super Ljava/lang/Object;
.source "K7HV"

# interfaces
.implements Ll/ۚ᩻ܳ;


# instance fields
.field public final ֫:Ll/ۗ᩻᩻;


# direct methods
.method public constructor <init>(Ll/ۗ᩻᩻;)V
    .locals 0

    .line 284
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 285
    iput-object p1, p0, Ll/ܶ᩻ܳ;->֫:Ll/ۗ᩻᩻;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/ArrayList;
    .locals 5

    .line 290
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 291
    iget-object v1, p0, Ll/ܶ᩻ܳ;->֫:Ll/ۗ᩻᩻;

    iget-object v1, v1, Ll/ۗ᩻᩻;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 292
    new-instance v3, Ll/֨᩻ܳ;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v3, v4, v2}, Ll/֨᩻ܳ;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ֫(Ll/֨᩻ܳ;)V
    .locals 2

    .line 299
    iget-object v0, p0, Ll/ܶ᩻ܳ;->֫:Ll/ۗ᩻᩻;

    iget-object v0, v0, Ll/ۗ᩻᩻;->ܰ:Ljava/util/HashMap;

    invoke-virtual {p1}, Ll/֨᩻ܳ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ll/֨᩻ܳ;->ܽ()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    invoke-static {}, Ll/۫᩻᩻;->᩻()V

    return-void
.end method

.method public final ۧ(Ll/֨᩻ܳ;)V
    .locals 1

    .line 305
    iget-object v0, p0, Ll/ܶ᩻ܳ;->֫:Ll/ۗ᩻᩻;

    iget-object v0, v0, Ll/ۗ᩻᩻;->ܰ:Ljava/util/HashMap;

    invoke-virtual {p1}, Ll/֨᩻ܳ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    invoke-static {}, Ll/۫᩻᩻;->᩻()V

    return-void
.end method
