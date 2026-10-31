.class public final Ll/᩻ܶ֫;
.super Ll/ܿܶ֫;
.source "W8NJ"


# instance fields
.field public final ۗ:Landroid/net/Uri;

.field public final ۙ:Ljava/util/Map;

.field public final ۬:I


# direct methods
.method public constructor <init>(ILl/᩹۠֫;Ljava/util/Map;[BLandroid/net/Uri;)V
    .locals 2

    const-string v0, "Response code: "

    .line 0
    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x7d4

    .line 461
    invoke-direct {p0, v1, p2, v0}, Ll/ܿܶ֫;-><init>(ILjava/io/IOException;Ljava/lang/String;)V

    .line 467
    iput p1, p0, Ll/᩻ܶ֫;->۬:I

    .line 477
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 478
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    .line 479
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 481
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    if-nez v0, :cond_0

    .line 483
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_1

    .line 484
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 480
    :goto_1
    invoke-virtual {p1, p3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 486
    :cond_1
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 469
    iput-object p1, p0, Ll/᩻ܶ֫;->ۙ:Ljava/util/Map;

    .line 470
    invoke-virtual {p4}, [B->clone()Ljava/lang/Object;

    .line 471
    iput-object p5, p0, Ll/᩻ܶ֫;->ۗ:Landroid/net/Uri;

    return-void
.end method
