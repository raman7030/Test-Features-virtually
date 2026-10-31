.class public final Ll/֡۬ᩳ;
.super Ljava/lang/Object;
.source "56UC"


# instance fields
.field public final ֫:[B

.field public final ۧ:Ljava/util/zip/CRC32;

.field public final ܽ:Ll/۬ۜܽ;

.field public final ᩳ:Ll/ۚ۬ᩳ;


# direct methods
.method public constructor <init>(Ll/ۚ۬ᩳ;I)V
    .locals 1

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    iput-object v0, p0, Ll/֡۬ᩳ;->ۧ:Ljava/util/zip/CRC32;

    .line 96
    iput-object p1, p0, Ll/֡۬ᩳ;->ᩳ:Ll/ۚ۬ᩳ;

    .line 97
    new-array p1, p2, [B

    iput-object p1, p0, Ll/֡۬ᩳ;->֫:[B

    .line 98
    new-instance p2, Ll/۬ۜܽ;

    invoke-direct {p2, p1}, Ll/۬ۜܽ;-><init>([B)V

    iput-object p2, p0, Ll/֡۬ᩳ;->ܽ:Ll/۬ۜܽ;

    return-void
.end method
