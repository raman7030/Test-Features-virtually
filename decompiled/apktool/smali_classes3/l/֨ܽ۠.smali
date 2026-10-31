.class public Ll/֨ܽ۠;
.super Ll/ᩴۧ۠;
.source "A451"


# instance fields
.field public final synthetic ۟:Ll/᩹ܽ۠;


# direct methods
.method public constructor <init>(Ll/ۛ֡֨;Ll/᩹ܽ۠;)V
    .locals 2

    .line 4523
    iput-object p2, p0, Ll/֨ܽ۠;->۟:Ll/᩹ܽ۠;

    .line 4524
    sget-object v0, Ll/֨ᩴ֨;->ܳ֫:Ll/֨ᩴ֨;

    const-string v1, "static error"

    invoke-direct {p0, p2, v0, p1, v1}, Ll/ᩴۧ۠;-><init>(Ll/᩹ܽ۠;Ll/֨ᩴ֨;Ll/ۛ֡֨;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/۬۠۠;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۤܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ܽܶ۠;
    .locals 6

    .line 4535
    iget-object p3, p0, Ll/ᩴۧ۠;->᩺:Ll/ۛ֡֨;

    iget-object p4, p3, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object p5, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    iget-object p6, p0, Ll/֨ܽ۠;->۟:Ll/᩹ܽ۠;

    if-ne p4, p5, :cond_0

    iget-object p4, p3, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    sget-object p5, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {p4, p5}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result p4

    if-eqz p4, :cond_0

    .line 4536
    iget-object p4, p6, Ll/᩹ܽ۠;->ܳ֫:Ll/ۛ᩸֨;

    iget-object p5, p3, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {p4, p5}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p4

    iget-object p4, p4, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    goto :goto_0

    :cond_0
    move-object p4, p3

    .line 4538
    :goto_0
    iget-object v0, p6, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    iget-object p5, p6, Ll/᩹ܽ۠;->ܶ:Ll/᩹ܶ۠;

    invoke-virtual {p5}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v2

    .line 4539
    invoke-static {p3}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object p3

    const/4 p5, 0x2

    new-array v5, p5, [Ljava/lang/Object;

    const/4 p5, 0x0

    aput-object p3, v5, p5

    const/4 p3, 0x1

    aput-object p4, v5, p3

    const-string v4, "non-static.cant.be.ref"

    move-object v1, p1

    move-object v3, p2

    .line 4538
    invoke-virtual/range {v0 .. v5}, Ll/ۛ۠۠;->֫(Ll/۬۠۠;Ll/ܳ۠۠;Ll/ۗ۠۠;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object p1

    return-object p1
.end method
