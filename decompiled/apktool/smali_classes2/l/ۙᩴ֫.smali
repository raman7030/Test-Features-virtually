.class public Ll/ۙᩴ֫;
.super Ljava/lang/Object;
.source "78PS"


# instance fields
.field public final ֫:Z

.field public final ۧ:J

.field public final ܳ:Z

.field public final ܽ:Z

.field public final ܿ:J

.field public final ᩳ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1847
    new-instance v0, Ll/᩶ᩴ֫;

    invoke-direct {v0}, Ll/᩶ᩴ֫;-><init>()V

    .line 1967
    new-instance v1, Ll/ۙᩴ֫;

    invoke-direct {v1, v0}, Ll/ۙᩴ֫;-><init>(Ll/᩶ᩴ֫;)V

    const/4 v0, 0x3

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    .line 0
    invoke-static {v2, v3, v4, v0, v1}, Ll/ۚ۬ۚ;->֫(IIIII)V

    const/4 v0, 0x5

    .line 2071
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x6

    .line 2072
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x7

    .line 2073
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method

.method public constructor <init>(Ll/᩶ᩴ֫;)V
    .locals 2

    .line 2020
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2021
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 2023
    invoke-static {p1}, Ll/᩶ᩴ֫;->ܿ(Ll/᩶ᩴ֫;)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۙᩴ֫;->ܿ:J

    .line 2024
    invoke-static {p1}, Ll/᩶ᩴ֫;->ۧ(Ll/᩶ᩴ֫;)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۙᩴ֫;->ۧ:J

    .line 2025
    invoke-static {p1}, Ll/᩶ᩴ֫;->ᩳ(Ll/᩶ᩴ֫;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۙᩴ֫;->ᩳ:Z

    .line 2026
    invoke-static {p1}, Ll/᩶ᩴ֫;->ܽ(Ll/᩶ᩴ֫;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۙᩴ֫;->ܽ:Z

    .line 2027
    invoke-static {p1}, Ll/᩶ᩴ֫;->ܳ(Ll/᩶ᩴ֫;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۙᩴ֫;->ܳ:Z

    .line 2028
    invoke-static {p1}, Ll/᩶ᩴ֫;->֫(Ll/᩶ᩴ֫;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ۙᩴ֫;->֫:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 2041
    :cond_0
    instance-of v1, p1, Ll/ۙᩴ֫;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 2045
    :cond_1
    check-cast p1, Ll/ۙᩴ֫;

    .line 2047
    iget-wide v3, p0, Ll/ۙᩴ֫;->ܿ:J

    iget-wide v5, p1, Ll/ۙᩴ֫;->ܿ:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-wide v3, p0, Ll/ۙᩴ֫;->ۧ:J

    iget-wide v5, p1, Ll/ۙᩴ֫;->ۧ:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-boolean v1, p0, Ll/ۙᩴ֫;->ᩳ:Z

    iget-boolean v3, p1, Ll/ۙᩴ֫;->ᩳ:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Ll/ۙᩴ֫;->ܽ:Z

    iget-boolean v3, p1, Ll/ۙᩴ֫;->ܽ:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Ll/ۙᩴ֫;->ܳ:Z

    iget-boolean v3, p1, Ll/ۙᩴ֫;->ܳ:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Ll/ۙᩴ֫;->֫:Z

    iget-boolean p1, p1, Ll/ۙᩴ֫;->֫:Z

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 7

    .line 2057
    iget-wide v0, p0, Ll/ۙᩴ֫;->ܿ:J

    const/16 v2, 0x20

    ushr-long v3, v0, v2

    xor-long/2addr v0, v3

    long-to-int v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 2058
    iget-wide v3, p0, Ll/ۙᩴ֫;->ۧ:J

    ushr-long v5, v3, v2

    xor-long v2, v3, v5

    long-to-int v0, v2

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 2059
    iget-boolean v0, p0, Ll/ۙᩴ֫;->ᩳ:Z

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 2060
    iget-boolean v0, p0, Ll/ۙᩴ֫;->ܽ:Z

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 2061
    iget-boolean v0, p0, Ll/ۙᩴ֫;->ܳ:Z

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 2062
    iget-boolean v0, p0, Ll/ۙᩴ֫;->֫:Z

    add-int/2addr v1, v0

    return v1
.end method
