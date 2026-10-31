.class public final Ll/֨ۖܽ;
.super Ljava/io/OutputStream;
.source "54YN"


# instance fields
.field public ᩸:J

.field public final ᩹:Ll/۠ۖܽ;


# direct methods
.method public constructor <init>(JLl/᩻ۖܽ;)V
    .locals 0

    .line 311
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 312
    iput-wide p1, p0, Ll/֨ۖܽ;->᩸:J

    .line 313
    iput-object p3, p0, Ll/֨ۖܽ;->᩹:Ll/۠ۖܽ;

    return-void
.end method


# virtual methods
.method public final flush()V
    .locals 1

    .line 339
    iget-object v0, p0, Ll/֨ۖܽ;->᩹:Ll/۠ۖܽ;

    invoke-interface {v0}, Ll/۠ۖܽ;->flush()V

    return-void
.end method

.method public final write(I)V
    .locals 5

    .line 318
    iget-wide v0, p0, Ll/֨ۖܽ;->᩸:J

    iget-object v2, p0, Ll/֨ۖܽ;->᩹:Ll/۠ۖܽ;

    invoke-interface {v2, v0, v1}, Ll/۠ۖܽ;->seek(J)V

    .line 319
    iget-wide v0, p0, Ll/֨ۖܽ;->᩸:J

    const-wide/16 v3, 0x1

    add-long/2addr v0, v3

    iput-wide v0, p0, Ll/֨ۖܽ;->᩸:J

    .line 320
    invoke-interface {v2, p1}, Ll/۠ۖܽ;->write(I)V

    return-void
.end method

.method public final write([B)V
    .locals 5

    .line 325
    iget-wide v0, p0, Ll/֨ۖܽ;->᩸:J

    iget-object v2, p0, Ll/֨ۖܽ;->᩹:Ll/۠ۖܽ;

    invoke-interface {v2, v0, v1}, Ll/۠ۖܽ;->seek(J)V

    .line 326
    iget-wide v0, p0, Ll/֨ۖܽ;->᩸:J

    array-length v3, p1

    int-to-long v3, v3

    add-long/2addr v0, v3

    iput-wide v0, p0, Ll/֨ۖܽ;->᩸:J

    .line 327
    invoke-interface {v2, p1}, Ll/۠ۖܽ;->write([B)V

    return-void
.end method

.method public final write([BII)V
    .locals 5

    .line 332
    iget-wide v0, p0, Ll/֨ۖܽ;->᩸:J

    iget-object v2, p0, Ll/֨ۖܽ;->᩹:Ll/۠ۖܽ;

    invoke-interface {v2, v0, v1}, Ll/۠ۖܽ;->seek(J)V

    .line 333
    iget-wide v0, p0, Ll/֨ۖܽ;->᩸:J

    int-to-long v3, p3

    add-long/2addr v0, v3

    iput-wide v0, p0, Ll/֨ۖܽ;->᩸:J

    .line 334
    invoke-interface {v2, p1, p2, p3}, Ll/۠ۖܽ;->write([BII)V

    return-void
.end method
