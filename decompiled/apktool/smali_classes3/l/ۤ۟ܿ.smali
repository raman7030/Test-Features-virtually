.class public final Ll/ۤ۟ܿ;
.super Ljava/lang/Object;
.source "X4M8"


# static fields
.field public static final ܳ:[B


# instance fields
.field public final ֫:Ll/ܿۖ᩷;

.field public ۧ:I

.field public ܽ:Z

.field public final ܿ:Ll/ۧܽܳ;

.field public final ᩳ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 424
    sput-object v0, Ll/ۤ۟ܿ;->ܳ:[B

    return-void
.end method

.method public constructor <init>(Ll/ۧܽܳ;IILl/ܿۖ᩷;)V
    .locals 1

    .line 433
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 430
    iput-boolean v0, p0, Ll/ۤ۟ܿ;->ܽ:Z

    .line 434
    iput-object p1, p0, Ll/ۤ۟ܿ;->ܿ:Ll/ۧܽܳ;

    .line 435
    iput p2, p0, Ll/ۤ۟ܿ;->ۧ:I

    .line 436
    iput p3, p0, Ll/ۤ۟ܿ;->ᩳ:I

    .line 437
    iput-object p4, p0, Ll/ۤ۟ܿ;->֫:Ll/ܿۖ᩷;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 7

    .line 457
    iget-boolean v0, p0, Ll/ۤ۟ܿ;->ܽ:Z

    if-eqz v0, :cond_0

    .line 458
    iget v2, p0, Ll/ۤ۟ܿ;->ۧ:I

    const/4 v5, 0x0

    iget-object v6, p0, Ll/ۤ۟ܿ;->֫:Ll/ܿۖ᩷;

    iget-object v1, p0, Ll/ۤ۟ܿ;->ܿ:Ll/ۧܽܳ;

    iget v3, p0, Ll/ۤ۟ܿ;->ᩳ:I

    sget-object v4, Ll/ۤ۟ܿ;->ܳ:[B

    invoke-virtual/range {v1 .. v6}, Ll/ۧܽܳ;->֫(II[BILl/ܿۖ᩷;)V

    const/4 v0, 0x0

    .line 459
    iput-boolean v0, p0, Ll/ۤ۟ܿ;->ܽ:Z

    :cond_0
    return-void
.end method

.method public final ֫(I[B)V
    .locals 6

    if-nez p1, :cond_0

    return-void

    .line 445
    :cond_0
    iget v1, p0, Ll/ۤ۟ܿ;->ۧ:I

    iget-boolean v0, p0, Ll/ۤ۟ܿ;->ܽ:Z

    if-eqz v0, :cond_1

    iget v0, p0, Ll/ۤ۟ܿ;->ᩳ:I

    move v2, v0

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    iget-object v5, p0, Ll/ۤ۟ܿ;->֫:Ll/ܿۖ᩷;

    iget-object v0, p0, Ll/ۤ۟ܿ;->ܿ:Ll/ۧܽܳ;

    move-object v3, p2

    move v4, p1

    invoke-virtual/range {v0 .. v5}, Ll/ۧܽܳ;->֫(II[BILl/ܿۖ᩷;)V

    .line 448
    :try_start_0
    iget p2, p0, Ll/ۤ۟ܿ;->ۧ:I

    int-to-long v0, p2

    int-to-long p1, p1

    add-long/2addr v0, p1

    long-to-int p1, v0

    int-to-long v2, p1

    cmp-long p2, v0, v2

    if-nez p2, :cond_2

    iput p1, p0, Ll/ۤ۟ܿ;->ۧ:I
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    .line 452
    iput-boolean p1, p0, Ll/ۤ۟ܿ;->ܽ:Z

    return-void

    .line 0
    :cond_2
    :try_start_1
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
    :try_end_1
    .catch Ljava/lang/ArithmeticException; {:try_start_1 .. :try_end_1} :catch_0

    .line 450
    :catch_0
    new-instance p1, Ll/۟֫ܳ;

    invoke-direct {p1}, Ll/۟֫ܳ;-><init>()V

    throw p1
.end method
