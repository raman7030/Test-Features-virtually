.class public final Ll/۟֫۠;
.super Ll/ᩴۧ۠;
.source "A451"


# instance fields
.field public final synthetic ۟:Ll/᩹ܽ۠;


# direct methods
.method public constructor <init>(Ll/ۛ֡֨;Ll/᩹ܽ۠;)V
    .locals 2

    .line 4682
    iput-object p2, p0, Ll/۟֫۠;->۟:Ll/᩹ܽ۠;

    .line 4683
    sget-object v0, Ll/֨ᩴ֨;->֫֫:Ll/֨ᩴ֨;

    const-string v1, "BadConstructorReferenceError"

    invoke-direct {p0, p2, v0, p1, v1}, Ll/ᩴۧ۠;-><init>(Ll/᩹ܽ۠;Ll/֨ᩴ֨;Ll/ۛ֡֨;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬۠۠;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۤܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ܽܶ۠;
    .locals 6

    .line 4688
    iget-object p3, p0, Ll/۟֫۠;->۟:Ll/᩹ܽ۠;

    iget-object v0, p3, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    iget-object p3, p3, Ll/᩹ܽ۠;->ܶ:Ll/᩹ܶ۠;

    invoke-virtual {p3}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v2

    iget-object p3, p4, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object p3, p3, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 4689
    invoke-virtual {p4}, Ll/ۙ֨֨;->۫()Ll/ۙ֨֨;

    move-result-object p4

    const/4 p5, 0x3

    new-array v5, p5, [Ljava/lang/Object;

    const/4 p5, 0x0

    aput-object p3, v5, p5

    const/4 p3, 0x1

    aput-object p6, v5, p3

    const/4 p3, 0x2

    aput-object p4, v5, p3

    const-string v4, "cant.access.inner.cls.constr"

    move-object v1, p1

    move-object v3, p2

    .line 4688
    invoke-virtual/range {v0 .. v5}, Ll/ۛ۠۠;->֫(Ll/۬۠۠;Ll/ܳ۠۠;Ll/ۗ۠۠;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object p1

    return-object p1
.end method
