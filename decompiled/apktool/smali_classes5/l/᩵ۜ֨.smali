.class public final Ll/᩵ۜ֨;
.super Ll/ۚۜ֨;
.source "N1T0"


# instance fields
.field public final ܽ:Ljava/util/zip/CRC32;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    iput-object v0, p0, Ll/᩵ۜ֨;->ܽ:Ljava/util/zip/CRC32;

    const/4 v0, 0x4

    .line 13
    iput v0, p0, Ll/ۚۜ֨;->ۧ:I

    const-string v0, "CRC32"

    .line 14
    iput-object v0, p0, Ll/ۚۜ֨;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫([BII)V
    .locals 1

    .line 19
    iget-object v0, p0, Ll/᩵ۜ֨;->ܽ:Ljava/util/zip/CRC32;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V

    return-void
.end method

.method public final ֫()[B
    .locals 4

    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 25
    iget-object v1, p0, Ll/᩵ۜ֨;->ܽ:Ljava/util/zip/CRC32;

    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v2

    long-to-int v3, v2

    const/4 v2, 0x0

    invoke-static {v2, v3, v0}, Ll/ᩳ᩸ۡ;->ۧ(II[B)V

    .line 26
    invoke-virtual {v1}, Ljava/util/zip/CRC32;->reset()V

    return-object v0
.end method
