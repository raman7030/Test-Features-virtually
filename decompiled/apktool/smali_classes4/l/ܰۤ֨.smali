.class public final Ll/ܰۤ֨;
.super Ll/ۧۛ֨;
.source "M43N"


# instance fields
.field public final synthetic ᩹:Ll/ۜۨ֨;


# direct methods
.method public constructor <init>(Ll/ۜۨ֨;)V
    .locals 0

    .line 1039
    iput-object p1, p0, Ll/ܰۤ֨;->᩹:Ll/ۜۨ֨;

    invoke-direct {p0, p1}, Ll/ۧۛ֨;-><init>(Ll/ۜۨ֨;)V

    return-void
.end method


# virtual methods
.method public final ۧ(Ll/֨֨֨;Ll/᩵֨֨;Ll/ۙ֨֨;Z)Ll/ۖܶ۠;
    .locals 3

    .line 1042
    new-instance p4, Ll/ᩴܶ۠;

    invoke-direct {p4}, Ll/ᩴܶ۠;-><init>()V

    .line 1043
    invoke-virtual {p1}, Ll/֨֨֨;->۫֫()Ll/ۙ֨֨;

    move-result-object v0

    .line 1044
    iget-object v1, p0, Ll/ܰۤ֨;->᩹:Ll/ۜۨ֨;

    if-eqz v0, :cond_0

    .line 1045
    new-instance v0, Ll/᩻ۛ֨;

    const/4 v2, 0x0

    new-array v2, v2, [Ll/᩵֨֨;

    invoke-direct {v0, v1, p1, p2, v2}, Ll/᩻ۛ֨;-><init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/᩵֨֨;[Ll/᩵֨֨;)V

    .line 227
    invoke-virtual {p4, v0}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    .line 1047
    :cond_0
    new-instance v0, Ll/ۖۛ֨;

    invoke-direct {v0, v1, p1, p3, p2}, Ll/ۖۛ֨;-><init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/ۙ֨֨;Ll/᩵֨֨;)V

    .line 227
    invoke-virtual {p4, v0}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    .line 1048
    invoke-virtual {p4}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method
