.class public final Ll/ܰۘ֫;
.super Ljava/lang/Object;
.source "Z8JL"


# instance fields
.field public final ֫:I

.field public final ۧ:[J

.field public final ܳ:[I

.field public final ܽ:[Ljava/lang/String;

.field public final ܿ:I

.field public final ᩳ:[Ll/ۧ᩵֫;

.field public final ᩻:[Landroid/net/Uri;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x3

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    .line 0
    invoke-static {v2, v3, v4, v0, v1}, Ll/ۚ۬ۚ;->֫(IIIII)V

    const/16 v0, 0x8

    const/16 v1, 0x9

    const/4 v2, 0x5

    const/4 v3, 0x6

    const/4 v4, 0x7

    invoke-static {v2, v3, v4, v0, v1}, Ll/ۚ۬ۚ;->֫(IIIII)V

    const/16 v0, 0xa

    .line 642
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    const/4 v0, 0x0

    new-array v4, v0, [I

    new-array v5, v0, [Ll/ۧ᩵֫;

    new-array v6, v0, [J

    new-array v7, v0, [Ljava/lang/String;

    const/4 v2, -0x1

    const/4 v3, -0x1

    move-object v1, p0

    .line 117
    invoke-direct/range {v1 .. v7}, Ll/ܰۘ֫;-><init>(II[I[Ll/ۧ᩵֫;[J[Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(II[I[Ll/ۧ᩵֫;[J[Ljava/lang/String;)V
    .locals 3

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 142
    array-length v0, p3

    array-length v1, p4

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 144
    iput p1, p0, Ll/ܰۘ֫;->֫:I

    .line 145
    iput p2, p0, Ll/ܰۘ֫;->ܿ:I

    .line 146
    iput-object p3, p0, Ll/ܰۘ֫;->ܳ:[I

    .line 147
    iput-object p4, p0, Ll/ܰۘ֫;->ᩳ:[Ll/ۧ᩵֫;

    .line 148
    iput-object p5, p0, Ll/ܰۘ֫;->ۧ:[J

    .line 151
    array-length p1, p4

    new-array p1, p1, [Landroid/net/Uri;

    iput-object p1, p0, Ll/ܰۘ֫;->᩻:[Landroid/net/Uri;

    .line 152
    :goto_1
    iget-object p1, p0, Ll/ܰۘ֫;->᩻:[Landroid/net/Uri;

    array-length p2, p1

    if-ge v2, p2, :cond_2

    .line 153
    aget-object p2, p4, v2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    goto :goto_2

    :cond_1
    iget-object p2, p2, Ll/ۧ᩵֫;->ܽ:Ll/ۨᩴ֫;

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    iget-object p2, p2, Ll/ۨᩴ֫;->᩻:Landroid/net/Uri;

    :goto_2
    aput-object p2, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 155
    :cond_2
    iput-object p6, p0, Ll/ܰۘ֫;->ܽ:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_2

    .line 233
    const-class v1, Ll/ܰۘ֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 236
    :cond_1
    check-cast p1, Ll/ܰۘ֫;

    .line 237
    iget v1, p0, Ll/ܰۘ֫;->֫:I

    iget v2, p1, Ll/ܰۘ֫;->֫:I

    if-ne v1, v2, :cond_2

    iget v1, p0, Ll/ܰۘ֫;->ܿ:I

    iget v2, p1, Ll/ܰۘ֫;->ܿ:I

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Ll/ܰۘ֫;->ᩳ:[Ll/ۧ᩵֫;

    iget-object v2, p1, Ll/ܰۘ֫;->ᩳ:[Ll/ۧ᩵֫;

    .line 240
    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ܰۘ֫;->ܳ:[I

    iget-object v2, p1, Ll/ܰۘ֫;->ܳ:[I

    .line 241
    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ܰۘ֫;->ۧ:[J

    iget-object v2, p1, Ll/ܰۘ֫;->ۧ:[J

    .line 242
    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([J[J)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ܰۘ֫;->ܽ:[Ljava/lang/String;

    iget-object p1, p1, Ll/ܰۘ֫;->ܽ:[Ljava/lang/String;

    .line 245
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 252
    iget v0, p0, Ll/ܰۘ֫;->֫:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ܰۘ֫;->ܿ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    const-wide/16 v1, 0x0

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 254
    iget-object v1, p0, Ll/ܰۘ֫;->ᩳ:[Ll/ۧ᩵֫;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 255
    iget-object v0, p0, Ll/ܰۘ֫;->ܳ:[I

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([I)I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 256
    iget-object v1, p0, Ll/ܰۘ֫;->ۧ:[J

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([J)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x3c1

    .line 259
    iget-object v0, p0, Ll/ܰۘ֫;->ܽ:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    return v1
.end method

.method public final ֫(I)I
    .locals 3

    const/4 v0, 0x1

    add-int/2addr p1, v0

    .line 177
    :goto_0
    iget-object v1, p0, Ll/ܰۘ֫;->ܳ:[I

    array-length v2, v1

    if-ge p1, v2, :cond_1

    .line 178
    aget v1, v1, p1

    if-eqz v1, :cond_1

    if-ne v1, v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return p1
.end method

.method public final ֫()Ll/ܰۘ֫;
    .locals 10

    .line 616
    iget-object v0, p0, Ll/ܰۘ֫;->ܳ:[I

    array-length v1, v0

    const/4 v3, 0x0

    .line 617
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 618
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v5

    const/4 v0, 0x0

    .line 619
    invoke-static {v5, v1, v2, v0}, Ljava/util/Arrays;->fill([IIII)V

    .line 625
    iget-object v0, p0, Ll/ܰۘ֫;->ۧ:[J

    array-length v1, v0

    .line 626
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 627
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v7

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 628
    invoke-static {v7, v1, v2, v8, v9}, Ljava/util/Arrays;->fill([JIIJ)V

    .line 285
    iget-object v0, p0, Ll/ܰۘ֫;->ᩳ:[Ll/ۧ᩵֫;

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, [Ll/ۧ᩵֫;

    .line 286
    iget-object v0, p0, Ll/ܰۘ֫;->ܽ:[Ljava/lang/String;

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, [Ljava/lang/String;

    .line 287
    new-instance v0, Ll/ܰۘ֫;

    iget v4, p0, Ll/ܰۘ֫;->ܿ:I

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Ll/ܰۘ֫;-><init>(II[I[Ll/ۧ᩵֫;[J[Ljava/lang/String;)V

    return-object v0
.end method
