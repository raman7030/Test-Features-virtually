.class public final Ll/ܰۡۧ;
.super Ll/ܳܺۧ;
.source "M8II"


# instance fields
.field public final ۧ:Ljava/lang/String;

.field public final ܳ:I

.field public final ܽ:J

.field public final ܿ:J

.field public final ᩳ:I

.field public final ᩻:[Ll/ܳܺۧ;


# direct methods
.method public constructor <init>(Ljava/lang/String;IIJJ[Ll/ܳܺۧ;)V
    .locals 1

    const-string v0, "CHAP"

    .line 49
    invoke-direct {p0, v0}, Ll/ܳܺۧ;-><init>(Ljava/lang/String;)V

    .line 50
    iput-object p1, p0, Ll/ܰۡۧ;->ۧ:Ljava/lang/String;

    .line 51
    iput p2, p0, Ll/ܰۡۧ;->ܳ:I

    .line 52
    iput p3, p0, Ll/ܰۡۧ;->ᩳ:I

    .line 53
    iput-wide p4, p0, Ll/ܰۡۧ;->ܿ:J

    .line 54
    iput-wide p6, p0, Ll/ܰۡۧ;->ܽ:J

    .line 55
    iput-object p8, p0, Ll/ܰۡۧ;->᩻:[Ll/ܳܺۧ;

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

    if-eqz p1, :cond_2

    .line 73
    const-class v2, Ll/ܰۡۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 76
    :cond_1
    check-cast p1, Ll/ܰۡۧ;

    .line 77
    iget v2, p0, Ll/ܰۡۧ;->ܳ:I

    iget v3, p1, Ll/ܰۡۧ;->ܳ:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/ܰۡۧ;->ᩳ:I

    iget v3, p1, Ll/ܰۡۧ;->ᩳ:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Ll/ܰۡۧ;->ܿ:J

    iget-wide v4, p1, Ll/ܰۡۧ;->ܿ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Ll/ܰۡۧ;->ܽ:J

    iget-wide v4, p1, Ll/ܰۡۧ;->ܽ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-object v2, p0, Ll/ܰۡۧ;->ۧ:Ljava/lang/String;

    iget-object v3, p1, Ll/ܰۡۧ;->ۧ:Ljava/lang/String;

    .line 81
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/ܰۡۧ;->᩻:[Ll/ܳܺۧ;

    iget-object p1, p1, Ll/ܰۡۧ;->᩻:[Ll/ܳܺۧ;

    .line 82
    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 88
    iget v0, p0, Ll/ܰۡۧ;->ܳ:I

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    .line 89
    iget v1, p0, Ll/ܰۡۧ;->ᩳ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 90
    iget-wide v1, p0, Ll/ܰۡۧ;->ܿ:J

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 91
    iget-wide v1, p0, Ll/ܰۡۧ;->ܽ:J

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 92
    iget-object v1, p0, Ll/ܰۡۧ;->ۧ:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method
