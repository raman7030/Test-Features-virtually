.class public final Ll/۫ۧ۠;
.super Ljava/lang/Object;
.source "A451"


# instance fields
.field public ֫:Ll/ܰ۬֨;

.field public ۧ:Ll/ۖܶ۠;

.field public final synthetic ܳ:Ll/᩹ܽ۠;

.field public ܽ:Z

.field public ܿ:Ll/ܽܽ۠;

.field public ᩳ:Ll/۠ۧ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;)V
    .locals 1

    .line 4940
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۧ۠;->ܳ:Ll/᩹ܽ۠;

    .line 4942
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/۫ۧ۠;->ۧ:Ll/ۖܶ۠;

    const/4 v0, 0x0

    .line 4944
    iput-object v0, p0, Ll/۫ۧ۠;->ܿ:Ll/ܽܽ۠;

    .line 4946
    iget-object p1, p1, Ll/᩹ܽ۠;->۟:Ll/ۚ֫۠;

    iput-object p1, p0, Ll/۫ۧ۠;->ᩳ:Ll/۠ۧ۠;

    const/4 p1, 0x0

    .line 4948
    iput-boolean p1, p0, Ll/۫ۧ۠;->ܽ:Z

    .line 4949
    sget-object p1, Ll/ܰ۬֨;->᩶:Ll/ܰ۬֨;

    iput-object p1, p0, Ll/۫ۧ۠;->֫:Ll/ܰ۬֨;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۫ۧ۠;)Ll/ۖܶ۠;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫ۧ۠;->ۧ:Ll/ۖܶ۠;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/۫ۧ۠;Ll/ܰ۬֨;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/۫ۧ۠;->֫:Ll/ܰ۬֨;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/۫ۧ۠;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/۫ۧ۠;->ܽ:Z

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/۫ۧ۠;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/۫ۧ۠;->ܽ:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۛ֡֨;Ll/֡ۨ֨;Ll/᩻ۗ֨;Ll/֨᩸۠;)Ll/ۜ۫֨;
    .locals 9

    .line 4962
    iget-object v0, p0, Ll/۫ۧ۠;->ܳ:Ll/᩹ܽ۠;

    if-nez p3, :cond_0

    .line 4963
    iget-object p3, v0, Ll/᩹ܽ۠;->ᩴ:Ll/۫۫֨;

    iget-object p3, p3, Ll/۫۫֨;->᩷:Ll/۬۬֨;

    goto :goto_0

    .line 4964
    :cond_0
    iget-object p3, p3, Ll/᩻ۗ֨;->֫:Ll/ۘ۬֨;

    invoke-interface {p3}, Ll/ۘ۬֨;->ۧ()Ll/ۜ۫֨;

    move-result-object p3

    :goto_0
    move-object v7, p3

    .line 4965
    new-instance p3, Ll/ۜ۫֨;

    iget-object v2, v0, Ll/᩹ܽ۠;->ᩴ:Ll/۫۫֨;

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Ll/۫ۧ۠;->֫:Ll/ܰ۬֨;

    iget-object v5, p0, Ll/۫ۧ۠;->ܿ:Ll/ܽܽ۠;

    move-object v1, p3

    move-object v4, p1

    move-object v6, p2

    move-object v8, p4

    invoke-direct/range {v1 .. v8}, Ll/ۜ۫֨;-><init>(Ll/۫۫֨;Ll/ܰ۬֨;Ll/ۛ֡֨;Ll/ܽܽ۠;Ll/֡ۨ֨;Ll/ۜ۫֨;Ll/֨᩸۠;)V

    return-object p3
.end method

.method public final ֫()Ll/ܰ۬֨;
    .locals 1

    .line 4997
    iget-object v0, p0, Ll/۫ۧ۠;->֫:Ll/ܰ۬֨;

    return-object v0
.end method

.method public final ֫(Ll/ۛ֡֨;Ll/ۙ֨֨;)V
    .locals 3

    .line 4957
    new-instance v0, Ll/۬ۧ۠;

    iget-object v1, p0, Ll/۫ۧ۠;->ܳ:Ll/᩹ܽ۠;

    iget-object v1, v1, Ll/᩹ܽ۠;->ۘ:Ll/۫ۧ۠;

    iget-object v1, v1, Ll/۫ۧ۠;->ܿ:Ll/ܽܽ۠;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2, p2}, Ll/۬ۧ۠;-><init>(Ll/ܽܽ۠;Ll/ۛ֡֨;Ll/ܽܶ۠;Ll/ۙ֨֨;)V

    .line 4958
    iget-object p1, p0, Ll/۫ۧ۠;->ۧ:Ll/ۖܶ۠;

    invoke-virtual {p1, v0}, Ll/ۖܶ۠;->֫(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/۫ۧ۠;->ۧ:Ll/ۖܶ۠;

    return-void
.end method

.method public final ֫(Ll/ۛ֡֨;Ll/ܽܶ۠;)V
    .locals 3

    .line 4952
    new-instance v0, Ll/۬ۧ۠;

    iget-object v1, p0, Ll/۫ۧ۠;->ܳ:Ll/᩹ܽ۠;

    iget-object v1, v1, Ll/᩹ܽ۠;->ۘ:Ll/۫ۧ۠;

    iget-object v1, v1, Ll/۫ۧ۠;->ܿ:Ll/ܽܽ۠;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, p2, v2}, Ll/۬ۧ۠;-><init>(Ll/ܽܽ۠;Ll/ۛ֡֨;Ll/ܽܶ۠;Ll/ۙ֨֨;)V

    .line 4953
    iget-object p1, p0, Ll/۫ۧ۠;->ۧ:Ll/ۖܶ۠;

    invoke-virtual {p1, v0}, Ll/ۖܶ۠;->֫(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/۫ۧ۠;->ۧ:Ll/ۖܶ۠;

    return-void
.end method
