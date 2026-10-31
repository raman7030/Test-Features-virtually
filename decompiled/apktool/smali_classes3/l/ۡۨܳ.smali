.class public final Ll/ۡۨܳ;
.super Ljava/io/OutputStream;
.source "F8CE"

# interfaces
.implements Ll/֡᩸ܿ;


# instance fields
.field public ۗ:J

.field public ۙ:J

.field public ᩶:J

.field public ᩸:J

.field public final ᩹:Lnet/sf/sevenzipjbinding/NativeXZOutputStream;


# direct methods
.method public constructor <init>(Lnet/sf/sevenzipjbinding/NativeXZOutputStream;J)V
    .locals 0

    .line 330
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 331
    iput-object p1, p0, Ll/ۡۨܳ;->᩹:Lnet/sf/sevenzipjbinding/NativeXZOutputStream;

    .line 332
    iput-wide p2, p0, Ll/ۡۨܳ;->ۙ:J

    return-void
.end method

.method private ֫(I)V
    .locals 8

    .line 368
    iget-wide v0, p0, Ll/ۡۨܳ;->ۗ:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۡۨܳ;->ۗ:J

    .line 369
    iget-wide v0, p0, Ll/ۡۨܳ;->᩶:J

    add-long/2addr v0, v2

    const-wide/32 v4, 0x100000

    .line 370
    rem-long v4, v0, v4

    sub-long v4, v0, v4

    .line 371
    iget-wide v6, p0, Ll/ۡۨܳ;->᩸:J

    add-long/2addr v6, v4

    iput-wide v6, p0, Ll/ۡۨܳ;->᩸:J

    sub-long/2addr v0, v4

    .line 372
    iput-wide v0, p0, Ll/ۡۨܳ;->᩶:J

    .line 373
    iget-wide v0, p0, Ll/ۡۨܳ;->ۙ:J

    const-wide/16 v4, 0x0

    cmp-long p1, v0, v4

    if-gtz p1, :cond_0

    return-void

    :cond_0
    cmp-long p1, v2, v0

    if-ltz p1, :cond_1

    .line 377
    iput-wide v4, p0, Ll/ۡۨܳ;->ۙ:J

    .line 378
    iget-object p1, p0, Ll/ۡۨܳ;->᩹:Lnet/sf/sevenzipjbinding/NativeXZOutputStream;

    invoke-virtual {p1}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->flush()V

    .line 379
    iget-wide v0, p0, Ll/ۡۨܳ;->ۗ:J

    iput-wide v0, p0, Ll/ۡۨܳ;->᩸:J

    .line 380
    iput-wide v4, p0, Ll/ۡۨܳ;->᩶:J

    return-void

    :cond_1
    sub-long/2addr v0, v2

    .line 382
    iput-wide v0, p0, Ll/ۡۨܳ;->ۙ:J

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 356
    iget-object v0, p0, Ll/ۡۨܳ;->᩹:Lnet/sf/sevenzipjbinding/NativeXZOutputStream;

    invoke-virtual {v0}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->close()V

    .line 357
    iget-wide v0, p0, Ll/ۡۨܳ;->ۗ:J

    iput-wide v0, p0, Ll/ۡۨܳ;->᩸:J

    const-wide/16 v0, 0x0

    .line 358
    iput-wide v0, p0, Ll/ۡۨܳ;->᩶:J

    return-void
.end method

.method public final flush()V
    .locals 2

    .line 349
    iget-object v0, p0, Ll/ۡۨܳ;->᩹:Lnet/sf/sevenzipjbinding/NativeXZOutputStream;

    invoke-virtual {v0}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->flush()V

    .line 350
    iget-wide v0, p0, Ll/ۡۨܳ;->ۗ:J

    iput-wide v0, p0, Ll/ۡۨܳ;->᩸:J

    const-wide/16 v0, 0x0

    .line 351
    iput-wide v0, p0, Ll/ۡۨܳ;->᩶:J

    return-void
.end method

.method public final write(I)V
    .locals 1

    .line 337
    iget-object v0, p0, Ll/ۡۨܳ;->᩹:Lnet/sf/sevenzipjbinding/NativeXZOutputStream;

    invoke-virtual {v0, p1}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->write(I)V

    const/4 p1, 0x1

    .line 338
    invoke-direct {p0, p1}, Ll/ۡۨܳ;->֫(I)V

    return-void
.end method

.method public final write([BII)V
    .locals 1

    .line 343
    iget-object v0, p0, Ll/ۡۨܳ;->᩹:Lnet/sf/sevenzipjbinding/NativeXZOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->write([BII)V

    .line 344
    invoke-direct {p0, p3}, Ll/ۡۨܳ;->֫(I)V

    return-void
.end method

.method public final ֫()J
    .locals 2

    .line 363
    iget-wide v0, p0, Ll/ۡۨܳ;->᩸:J

    return-wide v0
.end method
