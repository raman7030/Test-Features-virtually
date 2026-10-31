.class public final Ll/ܰ֫۠;
.super Ll/ᩴۧ۠;
.source "A451"


# instance fields
.field public final synthetic ֫֫:Ll/᩹ܽ۠;

.field public final ۟:Ll/᩸ۘ֨;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;Ll/᩸ۘ֨;)V
    .locals 3

    .line 4697
    iput-object p1, p0, Ll/ܰ֫۠;->֫֫:Ll/᩹ܽ۠;

    .line 4698
    sget-object v0, Ll/֨ᩴ֨;->ܰ:Ll/֨ᩴ֨;

    iget-object v1, p2, Ll/᩷֡֨;->ۙ:Ll/ۛ֡֨;

    const-string v2, "BadClassFileError"

    invoke-direct {p0, p1, v0, v1, v2}, Ll/ᩴۧ۠;-><init>(Ll/᩹ܽ۠;Ll/֨ᩴ֨;Ll/ۛ֡֨;Ljava/lang/String;)V

    .line 4699
    iget-object p1, v1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iput-object p1, p0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 4700
    iput-object p2, p0, Ll/ܰ֫۠;->۟:Ll/᩸ۘ֨;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬۠۠;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۤܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ܽܶ۠;
    .locals 6

    .line 4705
    iget-object p3, p0, Ll/ܰ֫۠;->֫֫:Ll/᩹ܽ۠;

    iget-object v0, p3, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    iget-object p3, p3, Ll/᩹ܽ۠;->ܶ:Ll/᩹ܶ۠;

    invoke-virtual {p3}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v2

    iget-object p3, p0, Ll/ܰ֫۠;->۟:Ll/᩸ۘ֨;

    iget-object p4, p3, Ll/᩷֡֨;->ۙ:Ll/ۛ֡֨;

    .line 2575
    invoke-virtual {p3}, Ll/᩷֡֨;->֫()Ll/ܽܶ۠;

    move-result-object p3

    const/4 p5, 0x2

    new-array v5, p5, [Ljava/lang/Object;

    const/4 p5, 0x0

    aput-object p4, v5, p5

    const/4 p4, 0x1

    aput-object p3, v5, p4

    const-string v4, "cant.access"

    move-object v1, p1

    move-object v3, p2

    .line 4705
    invoke-virtual/range {v0 .. v5}, Ll/ۛ۠۠;->֫(Ll/۬۠۠;Ll/ܳ۠۠;Ll/ۗ۠۠;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object p1

    .line 4708
    sget-object p2, Ll/᩶۠۠;->ۗ:Ll/᩶۠۠;

    invoke-virtual {p1, p2}, Ll/ܽܶ۠;->ۧ(Ll/᩶۠۠;)V

    return-object p1
.end method
