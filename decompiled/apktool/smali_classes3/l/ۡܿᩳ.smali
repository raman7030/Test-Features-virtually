.class public final Ll/ۡܿᩳ;
.super Ljava/lang/Object;
.source "V1VQ"

# interfaces
.implements Ll/֡ܿᩳ;


# instance fields
.field public ֫:[B

.field public ۧ:I

.field public ܽ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>([BII)V
    .locals 2

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    add-int v0, p2, p3

    .line 14
    array-length v1, p1

    if-gt v0, v1, :cond_0

    .line 16
    iput-object p1, p0, Ll/ۡܿᩳ;->֫:[B

    .line 17
    iput p2, p0, Ll/ۡܿᩳ;->ᩳ:I

    .line 18
    iput p3, p0, Ll/ۡܿᩳ;->ܽ:I

    const/4 p1, 0x0

    .line 19
    iput p1, p0, Ll/ۡܿᩳ;->ۧ:I

    return-void

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final reset()V
    .locals 1

    const/4 v0, 0x0

    .line 34
    iput v0, p0, Ll/ۡܿᩳ;->ۧ:I

    return-void
.end method

.method public final size()J
    .locals 2

    .line 24
    iget v0, p0, Ll/ۡܿᩳ;->ܽ:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public final ֫()J
    .locals 2

    .line 29
    iget v0, p0, Ll/ۡܿᩳ;->ۧ:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public final synthetic ֫(JLl/᩻ۖܽ;)V
    .locals 0

    .line 0
    invoke-static {p0, p3, p1, p2}, Ll/ۘܿᩳ;->֫(Ll/֡ܿᩳ;Ll/᩻ۖܽ;J)V

    return-void
.end method

.method public final ֫(Ljava/io/OutputStream;J)V
    .locals 3

    .line 39
    invoke-virtual {p0}, Ll/ۡܿᩳ;->ۧ()J

    move-result-wide v0

    cmp-long v2, p2, v0

    if-gtz v2, :cond_0

    .line 41
    iget v0, p0, Ll/ۡܿᩳ;->ᩳ:I

    iget v1, p0, Ll/ۡܿᩳ;->ۧ:I

    add-int/2addr v0, v1

    long-to-int v1, p2

    iget-object v2, p0, Ll/ۡܿᩳ;->֫:[B

    invoke-virtual {p1, v2, v0, v1}, Ljava/io/OutputStream;->write([BII)V

    .line 42
    iget p1, p0, Ll/ۡܿᩳ;->ۧ:I

    int-to-long v0, p1

    add-long/2addr v0, p2

    long-to-int p1, v0

    iput p1, p0, Ll/ۡܿᩳ;->ۧ:I

    return-void

    .line 40
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1
.end method

.method public final synthetic ֫(Ljava/security/MessageDigest;J)V
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3}, Ll/ۘܿᩳ;->֫(Ll/֡ܿᩳ;Ljava/security/MessageDigest;J)V

    return-void
.end method

.method public final ۧ()J
    .locals 4

    .line 19
    invoke-virtual {p0}, Ll/ۡܿᩳ;->size()J

    move-result-wide v0

    invoke-virtual {p0}, Ll/ۡܿᩳ;->֫()J

    move-result-wide v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public final synthetic ܽ()Ll/֡ܿᩳ;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/ۘܿᩳ;->֫(Ll/֡ܿᩳ;)Ll/֡ܿᩳ;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()I
    .locals 1

    .line 50
    iget v0, p0, Ll/ۡܿᩳ;->ᩳ:I

    return v0
.end method

.method public final ᩳ()[B
    .locals 1

    .line 46
    iget-object v0, p0, Ll/ۡܿᩳ;->֫:[B

    return-object v0
.end method
