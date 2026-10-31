.class public final Ll/᩸֡֨;
.super Ll/۫֡֨;
.source "643O"

# interfaces
.implements Ll/ۢ᩹۠;


# instance fields
.field public final ֫֫:Z

.field public ۟:Ll/ۡ֡۠;

.field public final ۧ֫:Ll/ۖܶ۠;

.field public ܰ:Ll/ۘ֡֨;

.field public final ܽ֫:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۤܶ۠;)V
    .locals 6

    const-wide/16 v1, 0x1

    move-object v0, p0

    move-object v3, p3

    move-object v4, p2

    move-object v5, p1

    .line 1804
    invoke-direct/range {v0 .. v5}, Ll/۫֡֨;-><init>(JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    const/4 p1, -0x1

    .line 1805
    iput p1, p0, Ll/᩸֡֨;->ܽ֫:I

    .line 1806
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/᩸֡֨;->ۧ֫:Ll/ۖܶ۠;

    const/4 p1, 0x0

    .line 1807
    iput-boolean p1, p0, Ll/᩸֡֨;->֫֫:Z

    return-void
.end method

.method public constructor <init>(Ll/۫֡֨;Ll/ۖܶ۠;Z)V
    .locals 6

    .line 1815
    iget-object v3, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v4, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    iget-object v5, p1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    const-wide/16 v1, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ll/۫֡֨;-><init>(JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    .line 1816
    iput-object p2, p0, Ll/᩸֡֨;->ۧ֫:Ll/ۖܶ۠;

    .line 1817
    iget p1, p1, Ll/۫֡֨;->᩺:I

    iput p1, p0, Ll/᩸֡֨;->ܽ֫:I

    .line 1823
    iput-boolean p3, p0, Ll/᩸֡֨;->֫֫:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩸֡֨;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩸֡֨;->֫֫:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/᩸֡֨;)Ll/ۖܶ۠;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸֡֨;->ۧ֫:Ll/ۖܶ۠;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩸֡֨;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩸֡֨;->ܽ֫:I

    return p0
.end method


# virtual methods
.method public final ֫(Ll/۠᩹۠;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1844
    invoke-virtual {p1, p0, p2}, Ll/۠᩹۠;->֫(Ll/᩸֡֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/᩺᩸۠;
    .locals 1

    .line 1834
    sget-object v0, Ll/᩺᩸۠;->ܳ֫:Ll/᩺᩸۠;

    return-object v0
.end method

.method public final ۫֫()Z
    .locals 1

    .line 1829
    iget-boolean v0, p0, Ll/᩸֡֨;->֫֫:Z

    return v0
.end method

.method public final ۬֫()Ll/ۖܶ۠;
    .locals 1

    .line 1826
    iget-object v0, p0, Ll/᩸֡֨;->ۧ֫:Ll/ۖܶ۠;

    return-object v0
.end method
