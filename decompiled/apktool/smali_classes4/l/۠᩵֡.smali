.class public final Ll/۠᩵֡;
.super Ll/ۡ֨֡;
.source "Z90G"


# instance fields
.field public final ֫:Ll/ۜۚ֡;

.field public final ۧ:Ll/ᩳ֨֡;


# direct methods
.method public constructor <init>(ILl/ᩳ֨֡;)V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ll/ۜۚ֡;

    invoke-direct {v0}, Ll/ۜۚ֡;-><init>()V

    iput-object v0, p0, Ll/۠᩵֡;->֫:Ll/ۜۚ֡;

    .line 20
    invoke-virtual {v0, p1}, Ll/ۜۚ֡;->֫(I)V

    .line 21
    iput-object p2, p0, Ll/۠᩵֡;->ۧ:Ll/ᩳ֨֡;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩵֨֡;)Ll/ܳ᩵֡;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ۨۚ֡;)V
    .locals 2

    .line 38
    iget-object v0, p0, Ll/۠᩵֡;->ۧ:Ll/ᩳ֨֡;

    iget-object v1, p0, Ll/۠᩵֡;->֫:Ll/ۜۚ֡;

    invoke-interface {p1, v0, v1}, Ll/ۨۚ֡;->֫(Ll/ᩳ֨֡;Ll/֡ۚ֡;)V

    return-void
.end method

.method public final ܿ()Ll/ۨ֡֡;
    .locals 1

    .line 26
    iget-object v0, p0, Ll/۠᩵֡;->֫:Ll/ۜۚ֡;

    return-object v0
.end method
