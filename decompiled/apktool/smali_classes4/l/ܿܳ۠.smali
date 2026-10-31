.class public final synthetic Ll/ܿܳ۠;
.super Ljava/lang/Object;
.source "K7QT"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Iterable;

.field public final synthetic ᩹:Ll/ᩳܳ۠;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ll/ᩳܳ۠;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿܳ۠;->᩸:Ljava/lang/Iterable;

    iput-object p2, p0, Ll/ܿܳ۠;->᩹:Ll/ᩳܳ۠;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Iterable;

    const/4 v1, 0x0

    .line 1174
    iget-object v2, p0, Ll/ܿܳ۠;->᩸:Ljava/lang/Iterable;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ܿܳ۠;->᩹:Ll/ᩳܳ۠;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ll/۠ۜܳ;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Ll/۠ۜܳ;-><init>(I)V

    invoke-static {v0, v1}, Ll/᩹۠۠;->֫(Ljava/lang/Iterable;Ljava/util/function/Function;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
