.class public abstract Ll/ᩴۧ۠;
.super Ll/ۚܽ۠;
.source "A451"


# instance fields
.field public final synthetic ܰ:Ll/᩹ܽ۠;

.field public ᩺:Ll/ۛ֡֨;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;Ll/֨ᩴ֨;Ll/ۛ֡֨;Ljava/lang/String;)V
    .locals 0

    .line 3977
    iput-object p1, p0, Ll/ᩴۧ۠;->ܰ:Ll/᩹ܽ۠;

    .line 3978
    invoke-direct {p0, p1, p2, p4}, Ll/ۚܽ۠;-><init>(Ll/᩹ܽ۠;Ll/֨ᩴ֨;Ljava/lang/String;)V

    .line 3979
    iput-object p3, p0, Ll/ᩴۧ۠;->᩺:Ll/ۛ֡֨;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 3989
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 3921
    iget-object v1, p0, Ll/ۚܽ۠;->ۛ:Ljava/lang/String;

    .line 3989
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " wrongSym="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ᩴۧ۠;->᩺:Ll/ۛ֡֨;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۤܶ۠;Ll/᩶֡֨;)Ll/ۛ֡֨;
    .locals 3

    .line 3994
    iget-object v0, p0, Ll/ᩴۧ۠;->᩺:Ll/ۛ֡֨;

    iget-object v1, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    invoke-virtual {v1}, Ll/֨ᩴ֨;->ۧ()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/ܶᩴ֨;->᩷:Ll/ܶᩴ֨;

    invoke-virtual {v1, v2}, Ll/֨ᩴ֨;->֫(Ll/ܶᩴ֨;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3995
    iget-object v1, p0, Ll/ᩴۧ۠;->ܰ:Ll/᩹ܽ۠;

    iget-object v1, v1, Ll/᩹ܽ۠;->ܳ֫:Ll/ۛ᩸֨;

    iget-object v0, v0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p2, v0}, Ll/ۛ᩸֨;->֫(Ll/ۤܶ۠;Ll/᩶֡֨;Ll/ۙ֨֨;)Ll/۫ۚ֨;

    move-result-object p1

    iget-object p1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    return-object p1

    :cond_0
    return-object v0
.end method

.method public ۗ()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/ۛ֫۠;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
