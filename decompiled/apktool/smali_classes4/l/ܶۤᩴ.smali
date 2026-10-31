.class public Ll/ܶۤᩴ;
.super Ljava/lang/Object;
.source "N673"


# instance fields
.field public a:[Ll/֡ۤᩴ;

.field public b:Ll/֡ۤᩴ;

.field public c:Ll/۠ۤᩴ;

.field public d:Ll/۠ۤᩴ;

.field public e:I

.field public f:I

.field public g:I

.field public final h:I


# direct methods
.method public constructor <init>([Ll/֡ۤᩴ;III)V
    .locals 0

    .line 3341
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3342
    iput-object p1, p0, Ll/ܶۤᩴ;->a:[Ll/֡ۤᩴ;

    .line 3343
    iput p2, p0, Ll/ܶۤᩴ;->h:I

    .line 3344
    iput p3, p0, Ll/ܶۤᩴ;->e:I

    iput p3, p0, Ll/ܶۤᩴ;->f:I

    .line 3345
    iput p4, p0, Ll/ܶۤᩴ;->g:I

    const/4 p1, 0x0

    .line 3346
    iput-object p1, p0, Ll/ܶۤᩴ;->b:Ll/֡ۤᩴ;

    return-void
.end method


# virtual methods
.method public final a()Ll/֡ۤᩴ;
    .locals 6

    .line 3354
    iget-object v0, p0, Ll/ܶۤᩴ;->b:Ll/֡ۤᩴ;

    if-eqz v0, :cond_0

    .line 3355
    iget-object v0, v0, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    .line 3359
    iput-object v0, p0, Ll/ܶۤᩴ;->b:Ll/֡ۤᩴ;

    return-object v0

    .line 3360
    :cond_1
    iget v0, p0, Ll/ܶۤᩴ;->f:I

    iget v1, p0, Ll/ܶۤᩴ;->g:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_9

    iget-object v0, p0, Ll/ܶۤᩴ;->a:[Ll/֡ۤᩴ;

    if-eqz v0, :cond_9

    array-length v1, v0

    iget v3, p0, Ll/ܶۤᩴ;->e:I

    if-le v1, v3, :cond_9

    if-gez v3, :cond_2

    goto/16 :goto_4

    .line 3363
    :cond_2
    invoke-static {v0, v3}, Ll/ۧۤᩴ;->k([Ll/֡ۤᩴ;I)Ll/֡ۤᩴ;

    move-result-object v4

    if-eqz v4, :cond_6

    iget v5, v4, Ll/֡ۤᩴ;->a:I

    if-gez v5, :cond_6

    .line 3364
    instance-of v5, v4, Ll/ۖۤᩴ;

    if-eqz v5, :cond_4

    .line 3365
    check-cast v4, Ll/ۖۤᩴ;

    iget-object v4, v4, Ll/ۖۤᩴ;->e:[Ll/֡ۤᩴ;

    iput-object v4, p0, Ll/ܶۤᩴ;->a:[Ll/֡ۤᩴ;

    .line 3386
    iget-object v4, p0, Ll/ܶۤᩴ;->d:Ll/۠ۤᩴ;

    if-eqz v4, :cond_3

    .line 3388
    iget-object v5, v4, Ll/۠ۤᩴ;->d:Ll/۠ۤᩴ;

    iput-object v5, p0, Ll/ܶۤᩴ;->d:Ll/۠ۤᩴ;

    goto :goto_1

    .line 3390
    :cond_3
    new-instance v4, Ll/۠ۤᩴ;

    .line 3304
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 3391
    :goto_1
    iput-object v0, v4, Ll/۠ۤᩴ;->c:[Ll/֡ۤᩴ;

    .line 3392
    iput v1, v4, Ll/۠ۤᩴ;->a:I

    .line 3393
    iput v3, v4, Ll/۠ۤᩴ;->b:I

    .line 3394
    iget-object v0, p0, Ll/ܶۤᩴ;->c:Ll/۠ۤᩴ;

    iput-object v0, v4, Ll/۠ۤᩴ;->d:Ll/۠ۤᩴ;

    .line 3395
    iput-object v4, p0, Ll/ܶۤᩴ;->c:Ll/۠ۤᩴ;

    move-object v0, v2

    goto :goto_0

    .line 3370
    :cond_4
    instance-of v0, v4, Ll/᩸ۤᩴ;

    if-eqz v0, :cond_5

    .line 3371
    check-cast v4, Ll/᩸ۤᩴ;

    iget-object v0, v4, Ll/᩸ۤᩴ;->f:Ll/᩹ۤᩴ;

    goto :goto_2

    :cond_5
    move-object v0, v2

    goto :goto_2

    :cond_6
    move-object v0, v4

    .line 3375
    :goto_2
    iget-object v4, p0, Ll/ܶۤᩴ;->c:Ll/۠ۤᩴ;

    if-eqz v4, :cond_8

    .line 3405
    :goto_3
    iget-object v3, p0, Ll/ܶۤᩴ;->c:Ll/۠ۤᩴ;

    if-eqz v3, :cond_7

    iget v4, p0, Ll/ܶۤᩴ;->e:I

    iget v5, v3, Ll/۠ۤᩴ;->a:I

    add-int/2addr v4, v5

    iput v4, p0, Ll/ܶۤᩴ;->e:I

    if-lt v4, v1, :cond_7

    .line 3407
    iget v1, v3, Ll/۠ۤᩴ;->b:I

    iput v1, p0, Ll/ܶۤᩴ;->e:I

    .line 3408
    iget-object v1, v3, Ll/۠ۤᩴ;->c:[Ll/֡ۤᩴ;

    iput-object v1, p0, Ll/ܶۤᩴ;->a:[Ll/֡ۤᩴ;

    .line 3409
    iput-object v2, v3, Ll/۠ۤᩴ;->c:[Ll/֡ۤᩴ;

    .line 3410
    iget-object v1, v3, Ll/۠ۤᩴ;->d:Ll/۠ۤᩴ;

    .line 3411
    iget-object v4, p0, Ll/ܶۤᩴ;->d:Ll/۠ۤᩴ;

    iput-object v4, v3, Ll/۠ۤᩴ;->d:Ll/۠ۤᩴ;

    .line 3412
    iput-object v1, p0, Ll/ܶۤᩴ;->c:Ll/۠ۤᩴ;

    .line 3413
    iput-object v3, p0, Ll/ܶۤᩴ;->d:Ll/۠ۤᩴ;

    move v1, v5

    goto :goto_3

    :cond_7
    if-nez v3, :cond_0

    .line 3415
    iget v2, p0, Ll/ܶۤᩴ;->e:I

    iget v3, p0, Ll/ܶۤᩴ;->h:I

    add-int/2addr v2, v3

    iput v2, p0, Ll/ܶۤᩴ;->e:I

    if-lt v2, v1, :cond_0

    .line 3416
    iget v1, p0, Ll/ܶۤᩴ;->f:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ܶۤᩴ;->f:I

    iput v1, p0, Ll/ܶۤᩴ;->e:I

    goto/16 :goto_0

    .line 3377
    :cond_8
    iget v2, p0, Ll/ܶۤᩴ;->h:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/ܶۤᩴ;->e:I

    if-lt v3, v1, :cond_0

    .line 3378
    iget v1, p0, Ll/ܶۤᩴ;->f:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ܶۤᩴ;->f:I

    iput v1, p0, Ll/ܶۤᩴ;->e:I

    goto/16 :goto_0

    .line 3362
    :cond_9
    :goto_4
    iput-object v2, p0, Ll/ܶۤᩴ;->b:Ll/֡ۤᩴ;

    return-object v2
.end method
