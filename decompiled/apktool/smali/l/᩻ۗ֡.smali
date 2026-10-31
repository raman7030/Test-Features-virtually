.class public final Ll/᩻ۗ֡;
.super Ljava/lang/Object;
.source "54VR"


# static fields
.field public static final ᩳ:Ljava/lang/Object;


# instance fields
.field public ֫:[I

.field public ۧ:I

.field public ܽ:[Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 36
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/᩻ۗ֡;->ᩳ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-array v0, p1, [I

    iput-object v0, p0, Ll/᩻ۗ֡;->֫:[I

    .line 53
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Ll/᩻ۗ֡;->ܽ:[Ljava/lang/Object;

    const/4 p1, 0x0

    .line 54
    iput p1, p0, Ll/᩻ۗ֡;->ۧ:I

    return-void
.end method

.method public static ֫(II[I)I
    .locals 4

    const/4 v0, -0x1

    move v1, p0

    :goto_0
    sub-int v2, v1, v0

    const/4 v3, 0x1

    if-le v2, v3, :cond_1

    add-int v2, v1, v0

    .line 341
    div-int/lit8 v2, v2, 0x2

    .line 343
    aget v3, p2, v2

    if-ge v3, p1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    if-ne v1, p0, :cond_2

    not-int p0, p0

    return p0

    .line 351
    :cond_2
    aget p0, p2, v1

    if-ne p0, p1, :cond_3

    return v1

    :cond_3
    not-int p0, v1

    return p0
.end method


# virtual methods
.method public final ֫(I)V
    .locals 4

    .line 325
    iget-object v0, p0, Ll/᩻ۗ֡;->֫:[I

    array-length v1, v0

    if-ge v1, p1, :cond_0

    .line 326
    new-array v1, p1, [I

    .line 327
    new-array p1, p1, [Ljava/lang/Object;

    .line 329
    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 330
    iget-object v0, p0, Ll/᩻ۗ֡;->ܽ:[Ljava/lang/Object;

    array-length v2, v0

    invoke-static {v0, v3, p1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 332
    iput-object v1, p0, Ll/᩻ۗ֡;->֫:[I

    .line 333
    iput-object p1, p0, Ll/᩻ۗ֡;->ܽ:[Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 6

    .line 285
    iget v0, p0, Ll/᩻ۗ֡;->ۧ:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/᩻ۗ֡;->֫:[I

    add-int/lit8 v2, v0, -0x1

    aget v1, v1, v2

    if-gt p1, v1, :cond_0

    .line 286
    invoke-virtual {p0, p1, p2}, Ll/᩻ۗ֡;->ۧ(ILjava/lang/Object;)V

    return-void

    .line 295
    :cond_0
    iget-object v1, p0, Ll/᩻ۗ֡;->֫:[I

    array-length v2, v1

    if-lt v0, v2, :cond_1

    add-int/lit8 v2, v0, 0x1

    .line 296
    array-length v1, v1

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 298
    new-array v2, v1, [I

    .line 299
    new-array v1, v1, [Ljava/lang/Object;

    .line 302
    iget-object v3, p0, Ll/᩻ۗ֡;->֫:[I

    array-length v4, v3

    const/4 v5, 0x0

    invoke-static {v3, v5, v2, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 303
    iget-object v3, p0, Ll/᩻ۗ֡;->ܽ:[Ljava/lang/Object;

    array-length v4, v3

    invoke-static {v3, v5, v1, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 305
    iput-object v2, p0, Ll/᩻ۗ֡;->֫:[I

    .line 306
    iput-object v1, p0, Ll/᩻ۗ֡;->ܽ:[Ljava/lang/Object;

    .line 309
    :cond_1
    iget-object v1, p0, Ll/᩻ۗ֡;->֫:[I

    aput p1, v1, v0

    .line 310
    iget-object p1, p0, Ll/᩻ۗ֡;->ܽ:[Ljava/lang/Object;

    aput-object p2, p1, v0

    add-int/lit8 v0, v0, 0x1

    .line 311
    iput v0, p0, Ll/᩻ۗ֡;->ۧ:I

    return-void
.end method

.method public final ۧ(I)Ljava/lang/Object;
    .locals 2

    .line 70
    iget-object v0, p0, Ll/᩻ۗ֡;->֫:[I

    iget v1, p0, Ll/᩻ۗ֡;->ۧ:I

    invoke-static {v1, p1, v0}, Ll/᩻ۗ֡;->֫(II[I)I

    move-result p1

    if-ltz p1, :cond_1

    .line 72
    iget-object v0, p0, Ll/᩻ۗ֡;->ܽ:[Ljava/lang/Object;

    aget-object p1, v0, p1

    sget-object v0, Ll/᩻ۗ֡;->ᩳ:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۧ(ILjava/lang/Object;)V
    .locals 6

    .line 133
    iget-object v0, p0, Ll/᩻ۗ֡;->֫:[I

    iget v1, p0, Ll/᩻ۗ֡;->ۧ:I

    invoke-static {v1, p1, v0}, Ll/᩻ۗ֡;->֫(II[I)I

    move-result v0

    if-ltz v0, :cond_0

    .line 136
    iget-object p1, p0, Ll/᩻ۗ֡;->ܽ:[Ljava/lang/Object;

    aput-object p2, p1, v0

    return-void

    :cond_0
    not-int v0, v0

    .line 140
    iget v1, p0, Ll/᩻ۗ֡;->ۧ:I

    if-ge v0, v1, :cond_1

    iget-object v2, p0, Ll/᩻ۗ֡;->ܽ:[Ljava/lang/Object;

    aget-object v3, v2, v0

    sget-object v4, Ll/᩻ۗ֡;->ᩳ:Ljava/lang/Object;

    if-ne v3, v4, :cond_1

    .line 141
    iget-object v1, p0, Ll/᩻ۗ֡;->֫:[I

    aput p1, v1, v0

    .line 142
    aput-object p2, v2, v0

    return-void

    .line 153
    :cond_1
    iget-object v2, p0, Ll/᩻ۗ֡;->֫:[I

    array-length v3, v2

    if-lt v1, v3, :cond_2

    add-int/lit8 v1, v1, 0x1

    .line 154
    array-length v2, v2

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 156
    new-array v2, v1, [I

    .line 157
    new-array v1, v1, [Ljava/lang/Object;

    .line 160
    iget-object v3, p0, Ll/᩻ۗ֡;->֫:[I

    array-length v4, v3

    const/4 v5, 0x0

    invoke-static {v3, v5, v2, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 161
    iget-object v3, p0, Ll/᩻ۗ֡;->ܽ:[Ljava/lang/Object;

    array-length v4, v3

    invoke-static {v3, v5, v1, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 163
    iput-object v2, p0, Ll/᩻ۗ֡;->֫:[I

    .line 164
    iput-object v1, p0, Ll/᩻ۗ֡;->ܽ:[Ljava/lang/Object;

    .line 167
    :cond_2
    iget v1, p0, Ll/᩻ۗ֡;->ۧ:I

    sub-int/2addr v1, v0

    if-eqz v1, :cond_3

    .line 169
    iget-object v2, p0, Ll/᩻ۗ֡;->֫:[I

    add-int/lit8 v3, v0, 0x1

    invoke-static {v2, v0, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 170
    iget-object v1, p0, Ll/᩻ۗ֡;->ܽ:[Ljava/lang/Object;

    iget v2, p0, Ll/᩻ۗ֡;->ۧ:I

    sub-int/2addr v2, v0

    invoke-static {v1, v0, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 173
    :cond_3
    iget-object v1, p0, Ll/᩻ۗ֡;->֫:[I

    aput p1, v1, v0

    .line 174
    iget-object p1, p0, Ll/᩻ۗ֡;->ܽ:[Ljava/lang/Object;

    aput-object p2, p1, v0

    .line 175
    iget p1, p0, Ll/᩻ۗ֡;->ۧ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/᩻ۗ֡;->ۧ:I

    return-void
.end method
