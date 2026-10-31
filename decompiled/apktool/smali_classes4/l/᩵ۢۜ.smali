.class public final Ll/᩵ۢۜ;
.super Ljava/lang/Object;
.source "D6W4"


# instance fields
.field public final ֫:Z

.field public final ۧ:Ljava/util/Map;

.field public final ܽ:Ljava/util/List;

.field public final ܿ:J

.field public final ᩳ:Z


# direct methods
.method public constructor <init>(ZZJLjava/util/List;)V
    .locals 0

    .line 355
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 356
    iput-boolean p1, p0, Ll/᩵ۢۜ;->ᩳ:Z

    .line 357
    iput-boolean p2, p0, Ll/᩵ۢۜ;->֫:Z

    .line 358
    iput-wide p3, p0, Ll/᩵ۢۜ;->ܿ:J

    .line 0
    new-instance p1, Ljava/util/ArrayList;

    invoke-interface {p5}, Ljava/util/Collection;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 359
    iput-object p1, p0, Ll/᩵ۢۜ;->ܽ:Ljava/util/List;

    .line 360
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 361
    invoke-interface {p5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ᩴۢۜ;

    .line 362
    iget-object p4, p3, Ll/ᩴۢۜ;->ܽ:Ljava/lang/String;

    invoke-interface {p1, p4, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 364
    :cond_1
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Ll/᩵ۢۜ;->ۧ:Ljava/util/Map;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩵ۢۜ;)Ljava/util/Map;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵ۢۜ;->ۧ:Ljava/util/Map;

    return-object p0
.end method
