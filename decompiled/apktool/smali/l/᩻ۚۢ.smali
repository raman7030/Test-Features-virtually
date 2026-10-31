.class public final Ll/᩻ۚۢ;
.super Ljava/lang/Object;
.source "M7AP"


# instance fields
.field public final ֫:Ll/۠ܳܳ;

.field public final ۧ:Ll/ᩳۜܳ;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ۢۧ᩻;Ll/۠ܳܳ;)V
    .locals 0

    .line 490
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 491
    iput-object p1, p0, Ll/᩻ۚۢ;->ܽ:Ljava/lang/String;

    .line 492
    iput-object p2, p0, Ll/᩻ۚۢ;->ۧ:Ll/ᩳۜܳ;

    .line 493
    iput-object p3, p0, Ll/᩻ۚۢ;->֫:Ll/۠ܳܳ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ll/۠ܳܳ;)Ll/᩻ۚۢ;
    .locals 2

    .line 507
    new-instance v0, Ll/᩻ۚۢ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1}, Ll/᩻ۚۢ;-><init>(Ljava/lang/String;Ll/ۢۧ᩻;Ll/۠ܳܳ;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;Ll/ۢۧ᩻;)Ll/᩻ۚۢ;
    .locals 2

    .line 500
    new-instance v0, Ll/᩻ۚۢ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Ll/᩻ۚۢ;-><init>(Ljava/lang/String;Ll/ۢۧ᩻;Ll/۠ܳܳ;)V

    return-object v0
.end method
