.class public final Ll/᩵۠֡;
.super Ll/۠ܶ֡;
.source "C4UC"


# static fields
.field public static ᩹:Ll/֡ۛۡ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 37
    new-instance v0, Ll/֡ۛۡ;

    const/16 v1, 0xc8

    invoke-direct {v0, v1}, Ll/֡ۛۡ;-><init>(I)V

    sput-object v0, Ll/᩵۠֡;->᩹:Ll/֡ۛۡ;

    return-void
.end method

.method public static ֫(I)Ll/᩵۠֡;
    .locals 1

    .line 40
    sget-object v0, Ll/᩵۠֡;->᩹:Ll/֡ۛۡ;

    invoke-virtual {v0}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵۠֡;

    if-eqz v0, :cond_0

    .line 42
    iput p0, v0, Ll/۠ܶ֡;->᩸:I

    return-object v0

    .line 44
    :cond_0
    new-instance v0, Ll/᩵۠֡;

    .line 55
    invoke-direct {v0, p0}, Ll/۠ܶ֡;-><init>(I)V

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ۗ᩵ۚ;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ()D
    .locals 2

    const-wide v0, 0x41dfffffffc00000L    # 2.147483647E9

    return-wide v0
.end method

.method public final ܿ()V
    .locals 1

    .line 51
    sget-object v0, Ll/᩵۠֡;->᩹:Ll/֡ۛۡ;

    invoke-virtual {v0, p0}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    return-void
.end method
