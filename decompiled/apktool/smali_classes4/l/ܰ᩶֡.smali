.class public final Ll/ܰ᩶֡;
.super Ll/ܽۙ֡;
.source "65W0"


# instance fields
.field public final ᩸:B


# direct methods
.method public constructor <init>(B)V
    .locals 0

    .line 53
    invoke-direct {p0}, Ll/ܽۙ֡;-><init>()V

    .line 54
    iput-byte p1, p0, Ll/ܰ᩶֡;->᩸:B

    return-void
.end method

.method public constructor <init>(Ll/ۧۗ֡;)V
    .locals 2

    .line 44
    invoke-direct {p0}, Ll/ܽۙ֡;-><init>()V

    const/4 v0, 0x1

    .line 45
    invoke-virtual {p1, v0}, Ll/ۧۗ֡;->ۧ(I)[B

    move-result-object p1

    invoke-static {p1}, Ll/ۗ᩻ۚ;->ۧ([B)J

    move-result-wide v0

    long-to-int p1, v0

    int-to-byte p1, p1

    iput-byte p1, p0, Ll/ܰ᩶֡;->᩸:B

    return-void
.end method


# virtual methods
.method public final hashCode()I
    .locals 1

    .line 94
    iget-byte v0, p0, Ll/ܰ᩶֡;->᩸:B

    return v0
.end method

.method public final ֫(I)I
    .locals 0

    add-int/lit8 p1, p1, 0x2

    return p1
.end method

.method public final ֫(Ll/֫ۗ֡;)V
    .locals 1

    .line 65
    sget-object v0, Ll/ۘۙ֡;->۬:Ll/ۘۙ֡;

    iget-byte v0, v0, Ll/ۘۙ֡;->᩸:B

    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ۧ(I)V

    .line 66
    iget-byte v0, p0, Ll/ܰ᩶֡;->᩸:B

    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ۧ(I)V

    return-void
.end method

.method public final ۖ()Ll/ۘۙ֡;
    .locals 1

    .line 89
    sget-object v0, Ll/ۘۙ֡;->۬:Ll/ۘۙ֡;

    return-object v0
.end method

.method public final ۧ(Ll/ܽۙ֡;)I
    .locals 1

    .line 80
    check-cast p1, Ll/ܰ᩶֡;

    .line 82
    iget-byte p1, p1, Ll/ܰ᩶֡;->᩸:B

    iget-byte v0, p0, Ll/ܰ᩶֡;->᩸:B

    if-ge v0, p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    if-le v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
