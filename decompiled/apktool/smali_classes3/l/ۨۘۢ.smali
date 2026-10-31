.class public final Ll/ۨۘۢ;
.super Ljava/lang/Object;
.source "47AI"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    .line 394
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 395
    iput-object p1, p0, Ll/ۨۘۢ;->֫:Ljava/lang/String;

    .line 396
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۨۘۢ;->ۧ:Ljava/util/List;

    return-void
.end method
