.class public final Ll/ܺۛۖ;
.super Ljava/lang/Object;
.source "I9FN"

# interfaces
.implements Ll/ۚ֫ۘ;


# instance fields
.field public ֫:I

.field public ۧ:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 55
    iget v0, p0, Ll/ܺۛۖ;->֫:I

    return v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 64
    iput p1, p0, Ll/ܺۛۖ;->ۧ:I

    return-void
.end method

.method public final ֫(Ll/֡֫ۘ;)V
    .locals 1

    .line 50
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Receiving SMBv1 messages not supported in SMBJ"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()I
    .locals 1

    .line 60
    iget v0, p0, Ll/ܺۛۖ;->ۧ:I

    return v0
.end method

.method public final ۧ(Ll/֡֫ۘ;)V
    .locals 3

    .line 33
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܺ()I

    move-result v0

    iput v0, p0, Ll/ܺۛۖ;->֫:I

    const/4 v0, 0x4

    new-array v1, v0, [B

    .line 34
    fill-array-data v1, :array_0

    .line 318
    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->֫(I[B)V

    const/16 v0, 0x72

    .line 35
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->֫(B)V

    const-wide/16 v0, 0x0

    .line 36
    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(J)V

    const/16 v2, 0x18

    .line 37
    invoke-virtual {p1, v2}, Ll/ۤܰۖ;->֫(B)V

    const v2, 0xc853

    .line 38
    invoke-virtual {p1, v2}, Ll/ۤܰۖ;->ۧ(I)V

    const/4 v2, 0x0

    .line 39
    invoke-virtual {p1, v2}, Ll/ۤܰۖ;->ۧ(I)V

    .line 40
    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ܽ(J)V

    .line 41
    invoke-virtual {p1}, Ll/֡֫ۘ;->ۖ()V

    .line 42
    invoke-virtual {p1, v2}, Ll/ۤܰۖ;->ۧ(I)V

    .line 43
    invoke-virtual {p1, v2}, Ll/ۤܰۖ;->ۧ(I)V

    .line 44
    invoke-virtual {p1, v2}, Ll/ۤܰۖ;->ۧ(I)V

    .line 45
    invoke-virtual {p1, v2}, Ll/ۤܰۖ;->ۧ(I)V

    return-void

    nop

    :array_0
    .array-data 1
        -0x1t
        0x53t
        0x4dt
        0x42t
    .end array-data
.end method
