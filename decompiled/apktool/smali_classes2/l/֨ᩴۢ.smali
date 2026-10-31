.class public final Ll/֨ᩴۢ;
.super Ljava/lang/Object;
.source "V7AU"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    .line 2135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2136
    iput-object p1, p0, Ll/֨ᩴۢ;->ۧ:Ljava/lang/String;

    .line 2137
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/֨ᩴۢ;->ܽ:Ljava/util/List;

    .line 2138
    iput-object p2, p0, Ll/֨ᩴۢ;->֫:Ljava/lang/String;

    return-void
.end method
