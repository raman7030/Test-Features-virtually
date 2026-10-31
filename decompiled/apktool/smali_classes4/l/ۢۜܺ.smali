.class public final Ll/ۢۜܺ;
.super Ll/ܿ᩷ܺ;
.source "UBFO"


# instance fields
.field public final ܳ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/֫ۜܺ;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x4

    .line 40
    invoke-direct {p0, v0, p1, v1}, Ll/ۛۜܺ;-><init>(Ljava/lang/String;Ll/֫ۜܺ;I)V

    .line 42
    new-instance p1, Ll/᩷ۜܺ;

    .line 32
    invoke-direct {p1}, Ll/ܺۜܺ;-><init>()V

    const/4 v0, 0x0

    .line 43
    invoke-virtual {p1, v0}, Ll/ܺۜܺ;->֫(I)V

    .line 45
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۢۜܺ;->ܳ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ۢ()V
    .locals 0

    return-void
.end method

.method public final ᩳ()Ljava/util/Collection;
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ۢۜܺ;->ܳ:Ljava/util/List;

    return-object v0
.end method
