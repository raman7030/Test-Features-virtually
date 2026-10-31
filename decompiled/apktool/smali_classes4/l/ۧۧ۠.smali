.class public final Ll/ۧۧ۠;
.super Ll/ۚܽ۠;
.source "A451"


# instance fields
.field public final ܰ:Ll/ۤܶ۠;

.field public final synthetic ᩺:Ll/᩹ܽ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;Ll/ۤܶ۠;)V
    .locals 2

    .line 4003
    iput-object p1, p0, Ll/ۧۧ۠;->᩺:Ll/᩹ܽ۠;

    .line 4004
    sget-object v0, Ll/֨ᩴ֨;->ۨ:Ll/֨ᩴ֨;

    const-string v1, "bad var use"

    invoke-direct {p0, p1, v0, v1}, Ll/ۚܽ۠;-><init>(Ll/᩹ܽ۠;Ll/֨ᩴ֨;Ljava/lang/String;)V

    .line 4005
    iput-object p2, p0, Ll/ۧۧ۠;->ܰ:Ll/ۤܶ۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬۠۠;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۤܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ܽܶ۠;
    .locals 6

    .line 4010
    iget-object p3, p0, Ll/ۧۧ۠;->᩺:Ll/᩹ܽ۠;

    iget-object v0, p3, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    iget-object p3, p3, Ll/᩹ܽ۠;->ܶ:Ll/᩹ܶ۠;

    invoke-virtual {p3}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v2

    const/4 p3, 0x1

    new-array v5, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    iget-object p4, p0, Ll/ۧۧ۠;->ܰ:Ll/ۤܶ۠;

    aput-object p4, v5, p3

    const-string v4, "illegal.ref.to.restricted.type"

    move-object v1, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, Ll/ۛ۠۠;->֫(Ll/۬۠۠;Ll/ܳ۠۠;Ll/ۗ۠۠;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object p1

    return-object p1
.end method
