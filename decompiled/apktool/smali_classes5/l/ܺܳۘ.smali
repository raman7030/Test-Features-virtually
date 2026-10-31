.class public final Ll/ܺܳۘ;
.super Ll/ۛܿۘ;
.source "V1N0"


# instance fields
.field public final ܽ:Ljava/util/Collection;


# direct methods
.method public constructor <init>(IILjava/util/List;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Ll/ۛܿۘ;-><init>(II)V

    .line 31
    iput-object p3, p0, Ll/ܺܳۘ;->ܽ:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public final ᩻()Ll/۬ܿۘ;
    .locals 2

    .line 37
    new-instance v0, Ll/ۡܳۘ;

    iget-object v1, p0, Ll/ܺܳۘ;->ܽ:Ljava/util/Collection;

    invoke-direct {v0, v1}, Ll/ۡܳۘ;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method
