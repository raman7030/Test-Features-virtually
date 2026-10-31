.class public abstract Ll/ۜۖܽ;
.super Ljava/lang/Object;
.source "C145"

# interfaces
.implements Ll/ۖۖܽ;


# instance fields
.field public final ᩶:Landroid/os/ParcelFileDescriptor;

.field public ᩸:Z

.field public final ᩹:I


# direct methods
.method public constructor <init>(Landroid/os/ParcelFileDescriptor;)V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Ll/ۜۖܽ;->᩸:Z

    .line 15
    iput-object p1, p0, Ll/ۜۖܽ;->᩶:Landroid/os/ParcelFileDescriptor;

    .line 16
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFd()I

    move-result p1

    iput p1, p0, Ll/ۜۖܽ;->᩹:I

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 62
    iget-boolean v0, p0, Ll/ۜۖܽ;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 65
    iput-boolean v0, p0, Ll/ۜۖܽ;->᩸:Z

    .line 66
    iget-object v0, p0, Ll/ۜۖܽ;->᩶:Landroid/os/ParcelFileDescriptor;

    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V

    return-void
.end method

.method public final isClosed()Z
    .locals 1

    .line 57
    iget-boolean v0, p0, Ll/ۜۖܽ;->᩸:Z

    return v0
.end method

.method public final length()J
    .locals 2

    .line 37
    iget v0, p0, Ll/ۜۖܽ;->᩹:I

    invoke-static {v0}, Lbin/mt/plus/Features3;->length(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final position()J
    .locals 2

    .line 47
    iget v0, p0, Ll/ۜۖܽ;->᩹:I

    invoke-static {v0}, Lbin/mt/plus/Features3;->tell(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final read([BII)I
    .locals 1

    .line 26
    iget v0, p0, Ll/ۜۖܽ;->᩹:I

    invoke-static {v0, p1, p2, p3}, Lbin/mt/plus/Features3;->read(I[BII)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    :cond_0
    return p1
.end method

.method public final seek(J)V
    .locals 1

    .line 21
    iget v0, p0, Ll/ۜۖܽ;->᩹:I

    invoke-static {v0, p1, p2}, Lbin/mt/plus/Features3;->seek(IJ)V

    return-void
.end method

.method public final setLength(J)V
    .locals 1

    .line 42
    iget v0, p0, Ll/ۜۖܽ;->᩹:I

    invoke-static {v0, p1, p2}, Lbin/mt/plus/Features3;->truncate(IJ)V

    return-void
.end method

.method public final write([BII)V
    .locals 1

    .line 32
    iget v0, p0, Ll/ۜۖܽ;->᩹:I

    invoke-static {v0, p1, p2, p3}, Lbin/mt/plus/Features3;->write(I[BII)V

    return-void
.end method

.method public final synthetic ֫ܽ()Ljava/nio/channels/FileChannel;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۧ(JJ)Ll/ۖۖܽ;
    .locals 7

    .line 47
    new-instance v6, Ll/᩷ۖܽ;

    invoke-interface {p0}, Ll/ۖۖܽ;->ۡ()Ll/ۖۖܽ;

    move-result-object v1

    move-object v0, v6

    move-wide v2, p1

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Ll/᩷ۖܽ;-><init>(Ll/ۖۖܽ;JJ)V

    return-object v6
.end method

.method public final ܺ()V
    .locals 1

    .line 52
    iget v0, p0, Ll/ۜۖܽ;->᩹:I

    invoke-static {v0}, Lbin/mt/plus/Features3;->sync(I)V

    return-void
.end method

.method public final ܽ(JJ)Ll/ۖۖܽ;
    .locals 7

    .line 51
    new-instance v6, Ll/᩷ۖܽ;

    move-object v0, v6

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Ll/᩷ۖܽ;-><init>(Ll/ۖۖܽ;JJ)V

    return-object v6
.end method

.method public final synthetic ᩻ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
