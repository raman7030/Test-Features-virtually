.class public final Ll/᩷ܺۧ;
.super Ll/ܳܺۧ;
.source "A8NB"


# instance fields
.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:[I

.field public final ܿ:[I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(II[I[II)V
    .locals 1

    const-string v0, "MLLT"

    .line 40
    invoke-direct {p0, v0}, Ll/ܳܺۧ;-><init>(Ljava/lang/String;)V

    .line 41
    iput p1, p0, Ll/᩷ܺۧ;->ܳ:I

    .line 42
    iput p2, p0, Ll/᩷ܺۧ;->ۧ:I

    .line 43
    iput p5, p0, Ll/᩷ܺۧ;->ᩳ:I

    .line 44
    iput-object p3, p0, Ll/᩷ܺۧ;->ܽ:[I

    .line 45
    iput-object p4, p0, Ll/᩷ܺۧ;->ܿ:[I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 53
    const-class v2, Ll/᩷ܺۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 56
    :cond_1
    check-cast p1, Ll/᩷ܺۧ;

    .line 57
    iget v2, p0, Ll/᩷ܺۧ;->ܳ:I

    iget v3, p1, Ll/᩷ܺۧ;->ܳ:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/᩷ܺۧ;->ۧ:I

    iget v3, p1, Ll/᩷ܺۧ;->ۧ:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/᩷ܺۧ;->ᩳ:I

    iget v3, p1, Ll/᩷ܺۧ;->ᩳ:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/᩷ܺۧ;->ܽ:[I

    iget-object v3, p1, Ll/᩷ܺۧ;->ܽ:[I

    .line 60
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/᩷ܺۧ;->ܿ:[I

    iget-object p1, p1, Ll/᩷ܺۧ;->ܿ:[I

    .line 61
    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 67
    iget v0, p0, Ll/᩷ܺۧ;->ܳ:I

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    .line 68
    iget v1, p0, Ll/᩷ܺۧ;->ۧ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 69
    iget v1, p0, Ll/᩷ܺۧ;->ᩳ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 70
    iget-object v1, p0, Ll/᩷ܺۧ;->ܽ:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 71
    iget-object v0, p0, Ll/᩷ܺۧ;->ܿ:[I

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([I)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method
