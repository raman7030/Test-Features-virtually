.class public final Ll/᩻ۚܳ;
.super Ljava/lang/Object;
.source "C12B"


# instance fields
.field public ֫:I

.field public ۧ:J


# direct methods
.method public constructor <init>(Ll/ۗ᩺ۡ;)V
    .locals 2

    .line 216
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 217
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩻ۚܳ;->ۧ:J

    .line 218
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ۜ()I

    move-result p1

    iput p1, p0, Ll/᩻ۚܳ;->֫:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 224
    const-class v2, Ll/᩻ۚܳ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 226
    :cond_1
    check-cast p1, Ll/᩻ۚܳ;

    .line 228
    iget-wide v2, p0, Ll/᩻ۚܳ;->ۧ:J

    iget-wide v4, p1, Ll/᩻ۚܳ;->ۧ:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_2

    return v1

    .line 229
    :cond_2
    iget v2, p0, Ll/᩻ۚܳ;->֫:I

    iget p1, p1, Ll/᩻ۚܳ;->֫:I

    if-ne v2, p1, :cond_3

    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 5

    const/16 v0, 0x20

    .line 234
    iget-wide v1, p0, Ll/᩻ۚܳ;->ۧ:J

    ushr-long v3, v1, v0

    xor-long v0, v1, v3

    long-to-int v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 235
    iget v0, p0, Ll/᩻ۚܳ;->֫:I

    add-int/2addr v1, v0

    return v1
.end method
