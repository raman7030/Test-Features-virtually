.class public final Ll/ۖۚۘ;
.super Ljava/lang/Object;
.source "A8AG"


# instance fields
.field public final ֫:Ll/ۖ᩺ܺ;

.field public final ۧ:Ll/ۡ᩺ܺ;

.field public ܽ:I


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 2

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ll/ۡ᩺ܺ;

    .line 43
    invoke-direct {v0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 37
    iput-object v0, p0, Ll/ۖۚۘ;->ۧ:Ll/ۡ᩺ܺ;

    .line 38
    new-instance p1, Ll/ۖ᩺ܺ;

    .line 47
    new-instance v1, Ljava/io/DataOutputStream;

    invoke-direct {v1, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {p1, v1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 38
    iput-object p1, p0, Ll/ۖۚۘ;->֫:Ll/ۖ᩺ܺ;

    const/high16 p1, 0x20000

    .line 27
    iput p1, p0, Ll/ۖۚۘ;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 55
    iget v0, p0, Ll/ۖۚۘ;->ܽ:I

    add-int/lit8 v1, v0, 0x4

    .line 56
    iput v1, p0, Ll/ۖۚۘ;->ܽ:I

    .line 57
    invoke-virtual {p0, v0}, Ll/ۖۚۘ;->ۧ(I)V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 75
    iget-object v0, p0, Ll/ۖۚۘ;->֫:Ll/ۖ᩺ܺ;

    invoke-virtual {v0, p1}, Ll/ۖ᩺ܺ;->writeByte(I)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 111
    iget-object v0, p0, Ll/ۖۚۘ;->֫:Ll/ۖ᩺ܺ;

    invoke-virtual {v0, p1}, Ll/ۖ᩺ܺ;->writeChars(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/ۘۚۘ;)V
    .locals 6

    .line 42
    sget-object v0, Ll/ۘۚۘ;->ۗ:Ll/ۘۚۘ;

    if-ne p1, v0, :cond_0

    goto :goto_1

    .line 44
    :cond_0
    invoke-virtual {p1}, Ll/ۘۚۘ;->֫()B

    move-result v0

    int-to-long v0, v0

    iget-object v2, p0, Ll/ۖۚۘ;->ۧ:Ll/ۡ᩺ܺ;

    invoke-virtual {v2}, Ll/ۡ᩺ܺ;->֫()J

    move-result-wide v3

    add-long/2addr v3, v0

    invoke-virtual {p1}, Ll/ۘۚۘ;->֫()B

    move-result p1

    not-int p1, p1

    int-to-long v0, p1

    and-long/2addr v0, v3

    .line 45
    invoke-virtual {v2}, Ll/ۡ᩺ܺ;->֫()J

    move-result-wide v2

    sub-long/2addr v0, v2

    :goto_0
    const-wide/16 v2, 0x1

    sub-long v2, v0, v2

    const-wide/16 v4, 0x0

    cmp-long p1, v0, v4

    if-lez p1, :cond_1

    const/4 p1, 0x0

    .line 54
    invoke-virtual {p0, p1}, Ll/ۖۚۘ;->֫(I)V

    move-wide v0, v2

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final ֫([B)V
    .locals 1

    .line 63
    iget-object v0, p0, Ll/ۖۚۘ;->֫:Ll/ۖ᩺ܺ;

    invoke-virtual {v0, p1}, Ljava/io/FilterOutputStream;->write([B)V

    return-void
.end method

.method public final ۧ(I)V
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ۖۚۘ;->֫:Ll/ۖ᩺ܺ;

    invoke-virtual {v0, p1}, Ll/ۖ᩺ܺ;->writeInt(I)V

    return-void
.end method

.method public final ܽ(I)V
    .locals 1

    .line 79
    iget-object v0, p0, Ll/ۖۚۘ;->֫:Ll/ۖ᩺ܺ;

    invoke-virtual {v0, p1}, Ll/ۖ᩺ܺ;->writeShort(I)V

    return-void
.end method
