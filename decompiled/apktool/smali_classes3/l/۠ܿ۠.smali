.class public final Ll/۠ܿ۠;
.super Ljava/lang/Object;
.source "X44P"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ᩸:Ljava/util/Iterator;

.field public final synthetic ᩹:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;)V
    .locals 0

    .line 1291
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ܿ۠;->᩹:Ljava/lang/Iterable;

    .line 1292
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Ll/۠ܿ۠;->᩸:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1296
    iget-object v0, p0, Ll/۠ܿ۠;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 1301
    iget-object v0, p0, Ll/۠ܿ۠;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-static {v0}, Ll/۠֨ᩴ;->toPath(Ljava/io/File;)Ll/᩷۠ᩴ;

    move-result-object v0

    return-object v0
.end method
