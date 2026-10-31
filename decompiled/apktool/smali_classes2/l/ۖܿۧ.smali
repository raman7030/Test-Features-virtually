.class public final Ll/ۖܿۧ;
.super Ljava/lang/Object;
.source "R8K8"


# instance fields
.field public final ֫:I

.field public final ۧ:[[[I

.field public final ܳ:Ll/ۛܽۧ;

.field public final ܽ:[I

.field public final ܿ:[I

.field public final ᩳ:[Ll/ۛܽۧ;


# direct methods
.method public constructor <init>([I[Ll/ۛܽۧ;[I[[[ILl/ۛܽۧ;)V
    .locals 0

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 135
    iput-object p1, p0, Ll/ۖܿۧ;->ܿ:[I

    .line 136
    iput-object p2, p0, Ll/ۖܿۧ;->ᩳ:[Ll/ۛܽۧ;

    .line 137
    iput-object p4, p0, Ll/ۖܿۧ;->ۧ:[[[I

    .line 138
    iput-object p3, p0, Ll/ۖܿۧ;->ܽ:[I

    .line 139
    iput-object p5, p0, Ll/ۖܿۧ;->ܳ:Ll/ۛܽۧ;

    .line 140
    array-length p1, p1

    iput p1, p0, Ll/ۖܿۧ;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 145
    iget v0, p0, Ll/ۖܿۧ;->֫:I

    return v0
.end method

.method public final ֫(I)I
    .locals 1

    .line 167
    iget-object v0, p0, Ll/ۖܿۧ;->ܿ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ֫(II)I
    .locals 9

    .line 275
    iget-object v0, p0, Ll/ۖܿۧ;->ᩳ:[Ll/ۛܽۧ;

    aget-object v1, v0, p1

    invoke-virtual {v1, p2}, Ll/ۛܽۧ;->֫(I)Ll/۬᩵֫;

    move-result-object v1

    iget v1, v1, Ll/۬᩵֫;->ᩳ:I

    .line 277
    new-array v2, v1, [I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v1, :cond_1

    .line 280
    invoke-virtual {p0, p1, p2, v4}, Ll/ۖܿۧ;->֫(III)I

    move-result v6

    const/4 v7, 0x4

    if-eq v6, v7, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v5, 0x1

    .line 284
    aput v4, v2, v5

    move v5, v6

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 287
    :cond_1
    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    const/16 v2, 0x10

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 306
    :goto_2
    array-length v7, v1

    if-ge v3, v7, :cond_3

    .line 307
    aget v7, v1, v3

    .line 309
    aget-object v8, v0, p1

    .line 310
    invoke-virtual {v8, p2}, Ll/ۛܽۧ;->֫(I)Ll/۬᩵֫;

    move-result-object v8

    invoke-virtual {v8, v7}, Ll/۬᩵֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object v7

    iget-object v7, v7, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    add-int/lit8 v8, v6, 0x1

    if-nez v6, :cond_2

    move-object v4, v7

    goto :goto_3

    .line 314
    :cond_2
    invoke-static {v4, v7}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    xor-int/lit8 v6, v6, 0x1

    or-int/2addr v5, v6

    .line 316
    :goto_3
    iget-object v6, p0, Ll/ۖܿۧ;->ۧ:[[[I

    aget-object v6, v6, p1

    aget-object v6, v6, p2

    aget v6, v6, v3

    and-int/lit8 v6, v6, 0x18

    .line 317
    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    move-result v2

    add-int/lit8 v3, v3, 0x1

    move v6, v8

    goto :goto_2

    :cond_3
    if-eqz v5, :cond_4

    .line 323
    iget-object p2, p0, Ll/ۖܿۧ;->ܽ:[I

    aget p1, p2, p1

    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1

    :cond_4
    return v2
.end method

.method public final ֫(III)I
    .locals 1

    .line 240
    iget-object v0, p0, Ll/ۖܿۧ;->ۧ:[[[I

    aget-object p1, v0, p1

    aget-object p1, p1, p2

    aget p1, p1, p3

    and-int/lit8 p1, p1, 0x7

    return p1
.end method

.method public final ۧ()Ll/ۛܽۧ;
    .locals 1

    .line 329
    iget-object v0, p0, Ll/ۖܿۧ;->ܳ:Ll/ۛܽۧ;

    return-object v0
.end method

.method public final ۧ(I)Ll/ۛܽۧ;
    .locals 1

    .line 177
    iget-object v0, p0, Ll/ۖܿۧ;->ᩳ:[Ll/ۛܽۧ;

    aget-object p1, v0, p1

    return-object p1
.end method
