.class public final Ll/᩺᩵֫;
.super Ljava/lang/Object;
.source "28U3"


# instance fields
.field public final ֫:Z

.field public final ۧ:I

.field public final ܽ:Ll/۬᩵֫;

.field public final ܿ:[I

.field public final ᩳ:[Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    .line 230
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x1

    .line 231
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x3

    .line 232
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x4

    .line 233
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method

.method public constructor <init>(Ll/۬᩵֫;Z[I[Z)V
    .locals 4

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iget v0, p1, Ll/۬᩵֫;->ᩳ:I

    iput v0, p0, Ll/᩺᩵֫;->ۧ:I

    .line 67
    array-length v1, p3

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    array-length v1, p4

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->֫(Z)V

    .line 68
    iput-object p1, p0, Ll/᩺᩵֫;->ܽ:Ll/۬᩵֫;

    if-eqz p2, :cond_1

    if-le v0, v3, :cond_1

    const/4 v2, 0x1

    .line 69
    :cond_1
    iput-boolean v2, p0, Ll/᩺᩵֫;->֫:Z

    .line 70
    invoke-virtual {p3}, [I->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    iput-object p1, p0, Ll/᩺᩵֫;->ܿ:[I

    .line 71
    invoke-virtual {p4}, [Z->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Z

    iput-object p1, p0, Ll/᩺᩵֫;->ᩳ:[Z

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

    .line 211
    const-class v2, Ll/᩺᩵֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 214
    :cond_1
    check-cast p1, Ll/᩺᩵֫;

    .line 215
    iget-boolean v2, p0, Ll/᩺᩵֫;->֫:Z

    iget-boolean v3, p1, Ll/᩺᩵֫;->֫:Z

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/᩺᩵֫;->ܽ:Ll/۬᩵֫;

    iget-object v3, p1, Ll/᩺᩵֫;->ܽ:Ll/۬᩵֫;

    .line 216
    invoke-virtual {v2, v3}, Ll/۬᩵֫;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/᩺᩵֫;->ܿ:[I

    iget-object v3, p1, Ll/᩺᩵֫;->ܿ:[I

    .line 217
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/᩺᩵֫;->ᩳ:[Z

    iget-object p1, p1, Ll/᩺᩵֫;->ᩳ:[Z

    .line 218
    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([Z[Z)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 223
    iget-object v0, p0, Ll/᩺᩵֫;->ܽ:Ll/۬᩵֫;

    invoke-virtual {v0}, Ll/۬᩵֫;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 224
    iget-boolean v1, p0, Ll/᩺᩵֫;->֫:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 225
    iget-object v1, p0, Ll/᩺᩵֫;->ܿ:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 226
    iget-object v0, p0, Ll/᩺᩵֫;->ᩳ:[Z

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final ֫(I)Ll/۠ᩴ֫;
    .locals 1

    .line 93
    iget-object v0, p0, Ll/᩺᩵֫;->ܽ:Ll/۬᩵֫;

    invoke-virtual {v0, p1}, Ll/۬᩵֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/۬᩵֫;
    .locals 1

    .line 83
    iget-object v0, p0, Ll/᩺᩵֫;->ܽ:Ll/۬᩵֫;

    return-object v0
.end method

.method public final ֫(IZ)Z
    .locals 1

    .line 130
    iget-object v0, p0, Ll/᩺᩵֫;->ܿ:[I

    aget p1, v0, p1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    if-eqz p2, :cond_0

    const/4 p2, 0x3

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 191
    iget-object v0, p0, Ll/᩺᩵֫;->ܽ:Ll/۬᩵֫;

    iget v0, v0, Ll/۬᩵֫;->ܿ:I

    return v0
.end method

.method public final ۧ(I)Z
    .locals 1

    .line 186
    iget-object v0, p0, Ll/᩺᩵֫;->ᩳ:[Z

    aget-boolean p1, v0, p1

    return p1
.end method

.method public final ܽ()Z
    .locals 6

    .line 143
    iget-object v0, p0, Ll/᩺᩵֫;->ᩳ:[Z

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-boolean v4, v0, v3

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    return v5

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public final ᩳ()Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 163
    :goto_0
    iget-object v2, p0, Ll/᩺᩵֫;->ܿ:[I

    array-length v2, v2

    if-ge v1, v2, :cond_1

    .line 164
    invoke-virtual {p0, v1, v0}, Ll/᩺᩵֫;->֫(IZ)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method
