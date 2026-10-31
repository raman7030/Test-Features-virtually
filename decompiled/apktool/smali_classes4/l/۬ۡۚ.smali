.class public final Ll/۬ۡۚ;
.super Ll/۠۬֡;
.source "P5I3"


# instance fields
.field public final synthetic ᩸:Ll/ۘܽۚ;


# direct methods
.method public constructor <init>(Ll/ۘܽۚ;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Ll/۬ۡۚ;->᩸:Ll/ۘܽۚ;

    return-void
.end method


# virtual methods
.method public final getValue()Ljava/util/List;
    .locals 4

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 58
    new-instance v1, Ll/ۙۡۚ;

    invoke-direct {v1, p0}, Ll/ۙۡۚ;-><init>(Ll/۬ۡۚ;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    new-instance v1, Ll/ۚܿۚ;

    iget-object v2, p0, Ll/۬ۡۚ;->᩸:Ll/ۘܽۚ;

    invoke-interface {v2}, Ll/ۘܽۚ;->ܺ()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ll/ۚܿۚ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    new-instance v1, Ll/ۗۡۚ;

    invoke-direct {v1, p0}, Ll/ۗۡۚ;-><init>(Ll/۬ۡۚ;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    invoke-interface {v2}, Ll/ۘܽۚ;->ۢ()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method
