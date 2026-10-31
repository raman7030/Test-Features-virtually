.class public final Ll/ܺܿᩳ;
.super Ljava/lang/Object;
.source "Z1WM"

# interfaces
.implements Ll/֡ܿᩳ;


# instance fields
.field public ֫:I

.field public ۧ:Ll/֡ܿᩳ;

.field public ܽ:J

.field public ܿ:[Ll/֡ܿᩳ;

.field public ᩳ:J


# direct methods
.method public varargs constructor <init>([Ll/֡ܿᩳ;)V
    .locals 7

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    array-length v0, p1

    if-eqz v0, :cond_1

    .line 17
    iput-object p1, p0, Ll/ܺܿᩳ;->ܿ:[Ll/֡ܿᩳ;

    const/4 v0, 0x0

    .line 18
    iput v0, p0, Ll/ܺܿᩳ;->֫:I

    .line 19
    aget-object v1, p1, v0

    iput-object v1, p0, Ll/ܺܿᩳ;->ۧ:Ll/֡ܿᩳ;

    const-wide/16 v1, 0x0

    .line 20
    iput-wide v1, p0, Ll/ܺܿᩳ;->ܽ:J

    .line 21
    iput-wide v1, p0, Ll/ܺܿᩳ;->ᩳ:J

    .line 22
    array-length v1, p1

    :goto_0
    if-ge v0, v1, :cond_0

    aget-object v2, p1, v0

    .line 23
    iget-wide v3, p0, Ll/ܺܿᩳ;->ᩳ:J

    invoke-interface {v2}, Ll/֡ܿᩳ;->size()J

    move-result-wide v5

    add-long/2addr v5, v3

    iput-wide v5, p0, Ll/ܺܿᩳ;->ᩳ:J

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 16
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final reset()V
    .locals 4

    const/4 v0, 0x0

    .line 39
    iput v0, p0, Ll/ܺܿᩳ;->֫:I

    .line 40
    iget-object v1, p0, Ll/ܺܿᩳ;->ܿ:[Ll/֡ܿᩳ;

    aget-object v2, v1, v0

    iput-object v2, p0, Ll/ܺܿᩳ;->ۧ:Ll/֡ܿᩳ;

    const-wide/16 v2, 0x0

    .line 41
    iput-wide v2, p0, Ll/ܺܿᩳ;->ܽ:J

    .line 42
    array-length v2, v1

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 43
    invoke-interface {v3}, Ll/֡ܿᩳ;->reset()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final size()J
    .locals 2

    .line 29
    iget-wide v0, p0, Ll/ܺܿᩳ;->ᩳ:J

    return-wide v0
.end method

.method public final ֫()J
    .locals 2

    .line 34
    iget-wide v0, p0, Ll/ܺܿᩳ;->ܽ:J

    return-wide v0
.end method

.method public final synthetic ֫(JLl/᩻ۖܽ;)V
    .locals 0

    .line 0
    invoke-static {p0, p3, p1, p2}, Ll/ۘܿᩳ;->֫(Ll/֡ܿᩳ;Ll/᩻ۖܽ;J)V

    return-void
.end method

.method public final ֫(Ljava/io/OutputStream;J)V
    .locals 6

    .line 49
    invoke-virtual {p0}, Ll/ܺܿᩳ;->ۧ()J

    move-result-wide v0

    cmp-long v2, p2, v0

    if-gtz v2, :cond_2

    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_1

    .line 52
    iget-object v2, p0, Ll/ܺܿᩳ;->ۧ:Ll/֡ܿᩳ;

    invoke-interface {v2}, Ll/֡ܿᩳ;->ۧ()J

    move-result-wide v2

    invoke-static {p2, p3, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    .line 53
    iget-object v4, p0, Ll/ܺܿᩳ;->ۧ:Ll/֡ܿᩳ;

    invoke-interface {v4, p1, v2, v3}, Ll/֡ܿᩳ;->֫(Ljava/io/OutputStream;J)V

    sub-long/2addr p2, v2

    .line 55
    iget-wide v4, p0, Ll/ܺܿᩳ;->ܽ:J

    add-long/2addr v4, v2

    iput-wide v4, p0, Ll/ܺܿᩳ;->ܽ:J

    .line 56
    iget-object v2, p0, Ll/ܺܿᩳ;->ۧ:Ll/֡ܿᩳ;

    invoke-interface {v2}, Ll/֡ܿᩳ;->ۧ()J

    move-result-wide v2

    cmp-long v4, v2, v0

    if-nez v4, :cond_0

    iget v0, p0, Ll/ܺܿᩳ;->֫:I

    iget-object v1, p0, Ll/ܺܿᩳ;->ܿ:[Ll/֡ܿᩳ;

    array-length v2, v1

    add-int/lit8 v2, v2, -0x1

    if-ge v0, v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 57
    iput v0, p0, Ll/ܺܿᩳ;->֫:I

    aget-object v0, v1, v0

    iput-object v0, p0, Ll/ܺܿᩳ;->ۧ:Ll/֡ܿᩳ;

    goto :goto_0

    :cond_1
    return-void

    .line 50
    :cond_2
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
    invoke-virtual {p0}, Ll/ܺܿᩳ;->size()J

    move-result-wide v0

    invoke-virtual {p0}, Ll/ܺܿᩳ;->֫()J

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
