.class public final Ll/᩹᩵ۜ;
.super Ljava/lang/Exception;
.source "86KX"


# instance fields
.field public final ᩶:Ljava/util/List;

.field public final ᩸:Ljava/lang/String;

.field public final ᩹:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 312
    invoke-direct {p0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 313
    iput-object p1, p0, Ll/᩹᩵ۜ;->᩸:Ljava/lang/String;

    .line 314
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/᩹᩵ۜ;->᩶:Ljava/util/List;

    .line 315
    new-instance p1, Ljava/util/ArrayList;

    new-instance p2, Ljava/util/LinkedHashSet;

    invoke-direct {p2, p4}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/᩹᩵ۜ;->᩹:Ljava/util/List;

    return-void
.end method
