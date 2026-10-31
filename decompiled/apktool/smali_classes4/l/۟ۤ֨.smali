.class public final Ll/۟ۤ֨;
.super Ll/ۧۛ֨;
.source "M43N"


# instance fields
.field public final synthetic ᩹:Ll/ۜۨ֨;


# direct methods
.method public constructor <init>(Ll/ۜۨ֨;)V
    .locals 0

    .line 1055
    iput-object p1, p0, Ll/۟ۤ֨;->᩹:Ll/ۜۨ֨;

    invoke-direct {p0, p1}, Ll/ۧۛ֨;-><init>(Ll/ۜۨ֨;)V

    return-void
.end method


# virtual methods
.method public final ۧ(Ll/֨֨֨;Ll/᩵֨֨;Ll/ۙ֨֨;Z)Ll/ۖܶ۠;
    .locals 4

    .line 1059
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 1060
    invoke-virtual {p1}, Ll/֨֨֨;->۫֫()Ll/ۙ֨֨;

    move-result-object v1

    .line 1061
    iget-object v2, p0, Ll/۟ۤ֨;->᩹:Ll/ۜۨ֨;

    if-eqz v1, :cond_0

    .line 1062
    new-instance v1, Ll/᩻ۛ֨;

    const/4 v3, 0x0

    new-array v3, v3, [Ll/᩵֨֨;

    invoke-direct {v1, v2, p1, p2, v3}, Ll/᩻ۛ֨;-><init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/᩵֨֨;[Ll/᩵֨֨;)V

    .line 227
    invoke-virtual {v0, v1}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    .line 1064
    :cond_0
    new-instance v1, Ll/ܳۛ֨;

    invoke-direct {v1, v2, p1, p3, p2}, Ll/ܳۛ֨;-><init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/ۙ֨֨;Ll/᩵֨֨;)V

    .line 227
    invoke-virtual {v0, v1}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    if-eqz p4, :cond_1

    .line 1067
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1

    .line 1070
    :cond_1
    sget-object p4, Ll/᩵֨֨;->ۙ:Ll/᩵֨֨;

    if-ne p2, p4, :cond_2

    .line 1071
    new-instance p4, Ll/᩷ۛ֨;

    invoke-direct {p4, v2, p1, p3}, Ll/᩷ۛ֨;-><init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/ۙ֨֨;)V

    .line 227
    invoke-virtual {v0, p4}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    .line 1074
    :cond_2
    new-instance p4, Ll/ܳۨ֨;

    invoke-direct {p4, v2, p1, p3, p2}, Ll/ܳۨ֨;-><init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/ۙ֨֨;Ll/᩵֨֨;)V

    .line 227
    invoke-virtual {v0, p4}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    .line 1076
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method
