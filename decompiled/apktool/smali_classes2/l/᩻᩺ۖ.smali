.class public final Ll/᩻᩺ۖ;
.super Ll/ܽۨۖ;
.source "C9FL"


# instance fields
.field public ۜ:B

.field public ܳ:Ll/᩹ۛۖ;

.field public ܿ:J

.field public ᩷:Ljava/util/EnumSet;

.field public ᩻:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ll/ܽۨۖ;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/᩹ۛۖ;Ljava/util/EnumSet;Ljava/util/EnumSet;)V
    .locals 1

    .line 49
    sget-object v0, Ll/᩺ۛۖ;->ᩳ֫:Ll/᩺ۛۖ;

    invoke-direct {p0, p1, v0}, Ll/ܽۨۖ;-><init>(Ll/᩹ۛۖ;Ll/᩺ۛۖ;)V

    .line 50
    iput-object p1, p0, Ll/᩻᩺ۖ;->ܳ:Ll/᩹ۛۖ;

    .line 51
    invoke-static {p2}, Ll/ܶܰۖ;->֫(Ljava/util/Collection;)J

    move-result-wide p1

    long-to-int p2, p1

    int-to-byte p1, p2

    iput-byte p1, p0, Ll/᩻᩺ۖ;->ۜ:B

    .line 52
    invoke-static {p3}, Ll/ܶܰۖ;->֫(Ljava/util/Collection;)J

    move-result-wide p1

    iput-wide p1, p0, Ll/᩻᩺ۖ;->ܿ:J

    return-void
.end method


# virtual methods
.method public final ֫([B)V
    .locals 0

    .line 111
    iput-object p1, p0, Ll/᩻᩺ۖ;->᩻:[B

    return-void
.end method

.method public final ۜ()[B
    .locals 1

    .line 115
    iget-object v0, p0, Ll/᩻᩺ۖ;->᩻:[B

    return-object v0
.end method

.method public final ۧ(Ll/֡֫ۘ;)V
    .locals 3

    .line 72
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    .line 73
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v0

    int-to-long v0, v0

    const-class v2, Ll/ܳ᩺ۖ;

    invoke-static {v0, v1, v2}, Ll/ܶܰۖ;->֫(JLjava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    iput-object v0, p0, Ll/᩻᩺ۖ;->᩷:Ljava/util/EnumSet;

    .line 74
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v0

    .line 75
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v1

    if-lez v1, :cond_0

    .line 82
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ᩳ(I)V

    .line 280
    new-array v0, v1, [B

    .line 293
    invoke-virtual {p1, v1, v0}, Ll/ۤܰۖ;->ۧ(I[B)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    new-array v0, p1, [B

    .line 76
    :goto_0
    iput-object v0, p0, Ll/᩻᩺ۖ;->᩻:[B

    return-void
.end method

.method public final ᩳ(Ll/֡֫ۘ;)V
    .locals 5

    .line 57
    iget v0, p0, Ll/ܽۨۖ;->ᩳ:I

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 91
    iget-object v0, p0, Ll/᩻᩺ۖ;->ܳ:Ll/᩹ۛۖ;

    invoke-virtual {v0}, Ll/᩹ۛۖ;->֫()Z

    const/4 v0, 0x0

    .line 94
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->֫(B)V

    .line 59
    iget-byte v1, p0, Ll/᩻᩺ۖ;->ۜ:B

    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->֫(B)V

    .line 60
    iget-wide v1, p0, Ll/᩻᩺ۖ;->ܿ:J

    const-wide/16 v3, 0xff

    and-long/2addr v1, v3

    invoke-virtual {p1, v1, v2}, Ll/ۤܰۖ;->ۧ(J)V

    .line 61
    invoke-virtual {p1}, Ll/֡֫ۘ;->ۘ()V

    const/16 v1, 0x58

    .line 62
    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->ۧ(I)V

    .line 63
    iget-object v1, p0, Ll/᩻᩺ۖ;->᩻:[B

    if-eqz v1, :cond_0

    array-length v0, v1

    :cond_0
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    const-wide/16 v0, 0x0

    .line 64
    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ܽ(J)V

    .line 65
    iget-object v0, p0, Ll/᩻᩺ۖ;->᩻:[B

    if-eqz v0, :cond_1

    .line 318
    array-length v1, v0

    invoke-virtual {p1, v1, v0}, Ll/ۤܰۖ;->֫(I[B)V

    :cond_1
    return-void
.end method

.method public final ᩷()Ljava/util/EnumSet;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/᩻᩺ۖ;->᩷:Ljava/util/EnumSet;

    return-object v0
.end method
