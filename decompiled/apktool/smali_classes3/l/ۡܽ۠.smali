.class public abstract Ll/ۡܽ۠;
.super Ll/֨ۧ۠;
.source "A451"


# instance fields
.field public ܳ:Ll/ۢ֡۠;


# direct methods
.method public constructor <init>(Ll/ۙ֨֨;Ll/ܽܽ۠;Ll/ۢ֡۠;Ll/ۖܶ۠;Ll/ۖܶ۠;Ll/ۤܶ۠;)V
    .locals 6

    move-object v0, p0

    move-object v1, p6

    move-object v2, p1

    move-object v3, p4

    move-object v4, p5

    move-object v5, p2

    .line 3492
    invoke-direct/range {v0 .. v5}, Ll/֨ۧ۠;-><init>(Ll/ۤܶ۠;Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;Ll/ܽܽ۠;)V

    .line 3493
    iput-object p3, p0, Ll/ۡܽ۠;->ܳ:Ll/ۢ֡۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֫ۤ֨;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۛ֡֨;)Ll/ۛ֡֨;
    .locals 1

    .line 3510
    iget-object p1, p4, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object p2, Ll/֨ᩴ֨;->ۛ:Ll/֨ᩴ֨;

    if-ne p1, p2, :cond_0

    .line 3511
    invoke-virtual {p4}, Ll/ۛ֡֨;->᩹()Ll/ۛ֡֨;

    move-result-object p1

    check-cast p1, Ll/ۨ֫۠;

    .line 3512
    iget-object p2, p0, Ll/֨ۧ۠;->ᩳ:Ll/ۙ֨֨;

    .line 4604
    iget-object p3, p1, Ll/ۨ֫۠;->᩺:Ll/ۖܶ۠;

    invoke-virtual {p3}, Ll/ۖܶ۠;->ᩳ()Ll/ۖܶ۠;

    move-result-object p3

    .line 4605
    iget-object p4, p1, Ll/ۨ֫۠;->ܰ:Ll/᩹ܽ۠;

    iget-object p4, p4, Ll/᩹ܽ۠;->ܳ֫:Ll/ۛ᩸֨;

    const/4 v0, 0x1

    invoke-virtual {p4, p3, p2, v0}, Ll/ۛ᩸֨;->֫(Ll/ۖܶ۠;Ll/ۙ֨֨;Z)Ll/ܽ۫ᩴ;

    move-result-object p2

    invoke-virtual {p2, p1}, Ll/ܽ۫ᩴ;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛ֡֨;

    return-object p1

    :cond_0
    return-object p4
.end method

.method public ֫(Ll/֡ۨ֨;)Ll/ۡܽ۠;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract ֫(Ll/ۛ֡֨;)Ll/᩷֡۠;
.end method
