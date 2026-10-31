.class public final synthetic Ll/ᩴܿ۠;
.super Ljava/lang/Object;
.source "X44P"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final synthetic ᩸:Ljava/util/Collection;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Collection;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴܿ۠;->᩸:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1310
    new-instance v0, Ll/ܶܿ۠;

    iget-object v1, p0, Ll/ᩴܿ۠;->᩸:Ljava/util/Collection;

    invoke-direct {v0, v1}, Ll/ܶܿ۠;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method
