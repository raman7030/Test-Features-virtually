.class public final Ll/ᩳۚ֨;
.super Ll/֡֡֨;
.source "843X"


# instance fields
.field public final synthetic ᩴ֫:Ll/᩷ۚ֨;


# direct methods
.method public constructor <init>(Ll/᩷ۚ֨;Ll/ۤܶ۠;)V
    .locals 1

    .line 403
    iput-object p1, p0, Ll/ᩳۚ֨;->ᩴ֫:Ll/᩷ۚ֨;

    invoke-direct {p0, p2}, Ll/֡֡֨;-><init>(Ll/ۤܶ۠;)V

    .line 405
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p2

    iput-object p2, p0, Ll/֡֡֨;->ۨ:Ll/ۖܶ۠;

    .line 406
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p2

    iput-object p2, p0, Ll/֡֡֨;->ܰ:Ll/ۖܶ۠;

    .line 407
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p2

    iput-object p2, p0, Ll/֡֡֨;->ܿ֫:Ll/ۖܶ۠;

    .line 408
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p2

    iput-object p2, p0, Ll/֡֡֨;->ۡ֫:Ll/ۖܶ۠;

    .line 409
    invoke-static {p1}, Ll/᩷ۚ֨;->ܽ(Ll/᩷ۚ֨;)Ll/ۛܶ۠;

    move-result-object p2

    iget-object p2, p2, Ll/ۛܶ۠;->ۚۧ:Ll/ۤܶ۠;

    invoke-virtual {p1, p2}, Ll/᩷ۚ֨;->֫(Ll/ۤܶ۠;)Ll/֡֡֨;

    move-result-object p1

    .line 410
    new-instance p2, Ll/ۢᩴ֨;

    sget-object v0, Ll/ۡᩴ֨;->ۙ:Ll/ۡᩴ֨;

    .line 412
    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Ll/ۢᩴ֨;-><init>(Ll/֡֡֨;Ljava/util/EnumSet;)V

    .line 413
    invoke-static {p2}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/֡֡֨;->᩻֫:Ll/ۖܶ۠;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 417
    iget-object v0, p0, Ll/ᩳۚ֨;->ᩴ֫:Ll/᩷ۚ֨;

    invoke-static {v0}, Ll/᩷ۚ֨;->ۧ(Ll/᩷ۚ֨;)Ll/ܳܶ۠;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "compiler.misc.unnamed.module"

    invoke-virtual {v0, v2, v1}, Ll/ܳܶ۠;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
