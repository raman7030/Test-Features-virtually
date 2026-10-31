.class public final Ll/ۨܶۖ;
.super Ll/۟᩶ۚ;
.source "05ZF"


# direct methods
.method public constructor <init>(Ll/ۜ᩶ۚ;)V
    .locals 1

    .line 13
    new-instance v0, Ll/ۛܶۖ;

    .line 72
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    invoke-direct {p0, p1, v0}, Ll/۟᩶ۚ;-><init>(Ll/ۜ᩶ۚ;Ll/ܳۙۚ;)V

    return-void
.end method


# virtual methods
.method public final ۧ()Ljava/lang/String;
    .locals 2

    .line 9
    iget-object v0, p0, Ll/۟᩶ۚ;->ܽ:Ljava/lang/String;

    iget-object v1, p0, Ll/۟᩶ۚ;->ᩳ:Ll/ܳۙۚ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Ll/ܳۙۚ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
