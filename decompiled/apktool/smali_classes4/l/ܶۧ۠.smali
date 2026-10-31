.class public abstract Ll/ܶۧ۠;
.super Ljava/lang/Object;
.source "A451"

# interfaces
.implements Ll/ۘ۬֨;


# instance fields
.field public ֫:Ll/ۜ۫֨;

.field public ۧ:Ll/֨᩸۠;

.field public ܽ:Z

.field public final synthetic ᩳ:Ll/᩹ܽ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;ZLl/ۜ۫֨;Ll/֨᩸۠;)V
    .locals 0

    .line 1027
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶۧ۠;->ᩳ:Ll/᩹ܽ۠;

    .line 1028
    iput-boolean p2, p0, Ll/ܶۧ۠;->ܽ:Z

    .line 1029
    iput-object p3, p0, Ll/ܶۧ۠;->֫:Ll/ۜ۫֨;

    .line 1030
    iput-object p4, p0, Ll/ܶۧ۠;->ۧ:Ll/֨᩸۠;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "MethodCheckContext"

    return-object v0
.end method

.method public final ֫()Ll/֡ۨ֨;
    .locals 1

    .line 1049
    iget-object v0, p0, Ll/ܶۧ۠;->֫:Ll/ۜ۫֨;

    iget-object v0, v0, Ll/ۜ۫֨;->ۧ:Ll/֡ۨ֨;

    return-object v0
.end method

.method public final ֫(Ll/ۗ۠۠;Ll/ۙ֨֨;Ll/ۙ֨֨;)Ll/֨᩸۠;
    .locals 0

    .line 1045
    iget-object p1, p0, Ll/ܶۧ۠;->ۧ:Ll/֨᩸۠;

    return-object p1
.end method

.method public ֫(Ll/ۗ۠۠;Ll/ܽܶ۠;)V
    .locals 0

    .line 1041
    new-instance p1, Ll/᩻ۧ۠;

    invoke-direct {p1, p2}, Ll/᩻ۧ۠;-><init>(Ll/ܽܶ۠;)V

    throw p1
.end method

.method public ֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z
    .locals 3

    .line 1034
    iget-object v0, p0, Ll/ܶۧ۠;->֫:Ll/ۜ۫֨;

    iget-object v0, v0, Ll/ۜ۫֨;->ۧ:Ll/֡ۨ֨;

    .line 1035
    iget-boolean v1, p0, Ll/ܶۧ۠;->ܽ:Z

    iget-object v2, p0, Ll/ܶۧ۠;->ᩳ:Ll/᩹ܽ۠;

    if-eqz v1, :cond_0

    .line 1036
    iget-object v1, v2, Ll/᩹ܽ۠;->ܳ֫:Ll/ۛ᩸֨;

    invoke-virtual {v0, p1}, Ll/֡ۨ֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    invoke-virtual {v0, p2}, Ll/֡ۨ֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    invoke-virtual {v1, p1, p2, p3}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result p1

    return p1

    .line 1037
    :cond_0
    iget-object v1, v2, Ll/᩹ܽ۠;->ܳ֫:Ll/ۛ᩸֨;

    invoke-virtual {v0, p1}, Ll/֡ۨ֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    invoke-virtual {v0, p2}, Ll/֡ۨ֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    invoke-virtual {v1, p1, p2, p3}, Ll/ۛ᩸֨;->ᩳ(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result p1

    return p1
.end method

.method public final ۧ()Ll/ۜ۫֨;
    .locals 1

    .line 1053
    iget-object v0, p0, Ll/ܶۧ۠;->֫:Ll/ۜ۫֨;

    return-object v0
.end method
