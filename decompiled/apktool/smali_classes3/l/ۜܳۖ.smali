.class public final Ll/ۜܳۖ;
.super Ljava/lang/Object;
.source "J84Z"

# interfaces
.implements Ll/ܶᩳۖ;


# instance fields
.field public final synthetic ᩸:Ll/ۚᩳۖ;


# direct methods
.method public constructor <init>(Ll/ۚᩳۖ;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜܳۖ;->᩸:Ll/ۚᩳۖ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ܽۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;
    .locals 1

    .line 57
    invoke-virtual {p2}, Ll/ܽۜۖ;->֫()Ljava/lang/Class;

    move-result-object p2

    const-class v0, Ljava/lang/Object;

    if-ne p2, v0, :cond_0

    .line 58
    new-instance p2, Ll/ۢܳۖ;

    iget-object v0, p0, Ll/ۜܳۖ;->᩸:Ll/ۚᩳۖ;

    invoke-direct {p2, p1, v0}, Ll/ۢܳۖ;-><init>(Ll/۫ܽۖ;Ll/ۚᩳۖ;)V

    return-object p2

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
