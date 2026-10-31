.class public final Ll/ܶۡܺ;
.super Ljava/lang/Object;
.source "GBHS"


# instance fields
.field public ֫:Ll/ᩴۡܺ;

.field public ۧ:I

.field public ܽ:Ll/֫ۖܺ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 659
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܶۡܺ;-><init>()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܶۡܺ;)Ll/ᩴۡܺ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۡܺ;->֫:Ll/ᩴۡܺ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ܶۡܺ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܶۡܺ;->ۧ:I

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ܶۡܺ;)Ll/֫ۖܺ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۡܺ;->ܽ:Ll/֫ۖܺ;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 707
    instance-of v0, p1, Ll/᩸ۡܺ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 711
    :cond_0
    check-cast p1, Ll/᩸ۡܺ;

    .line 712
    iget v0, p0, Ll/ܶۡܺ;->ۧ:I

    iget-object v1, p0, Ll/ܶۡܺ;->ܽ:Ll/֫ۖܺ;

    iget-object v2, p0, Ll/ܶۡܺ;->֫:Ll/ᩴۡܺ;

    invoke-static {p1, v0, v1, v2}, Ll/᩸ۡܺ;->֫(Ll/᩸ۡܺ;ILl/֫ۖܺ;Ll/ᩴۡܺ;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 720
    iget v0, p0, Ll/ܶۡܺ;->ۧ:I

    iget-object v1, p0, Ll/ܶۡܺ;->ܽ:Ll/֫ۖܺ;

    iget-object v2, p0, Ll/ܶۡܺ;->֫:Ll/ᩴۡܺ;

    sget v3, Ll/᩸ۡܺ;->ۙ:I

    if-eqz v2, :cond_0

    .line 307
    invoke-virtual {v2}, Ll/ᩴۡܺ;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    mul-int/lit8 v2, v2, 0x1f

    .line 309
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v1, v0

    return v1
.end method

.method public final ֫()Ll/᩸ۡܺ;
    .locals 4

    .line 699
    new-instance v0, Ll/᩸ۡܺ;

    iget v1, p0, Ll/ܶۡܺ;->ۧ:I

    iget-object v2, p0, Ll/ܶۡܺ;->ܽ:Ll/֫ۖܺ;

    iget-object v3, p0, Ll/ܶۡܺ;->֫:Ll/ᩴۡܺ;

    invoke-direct {v0, v1, v2, v3}, Ll/᩸ۡܺ;-><init>(ILl/֫ۖܺ;Ll/ᩴۡܺ;)V

    return-object v0
.end method

.method public final ֫(ILl/֫ۖܺ;Ll/ᩴۡܺ;)V
    .locals 0

    .line 687
    iput p1, p0, Ll/ܶۡܺ;->ۧ:I

    .line 688
    iput-object p2, p0, Ll/ܶۡܺ;->ܽ:Ll/֫ۖܺ;

    .line 689
    iput-object p3, p0, Ll/ܶۡܺ;->֫:Ll/ᩴۡܺ;

    return-void
.end method
