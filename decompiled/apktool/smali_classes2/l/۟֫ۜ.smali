.class public final Ll/۟֫ۜ;
.super Ljava/lang/Object;
.source "E76K"


# instance fields
.field public final ֫:[B

.field public final ۧ:[B

.field public final ܽ:I

.field public final ᩳ:Z


# direct methods
.method public constructor <init>([B[BIZ)V
    .locals 0

    .line 408
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 409
    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Ll/۟֫ۜ;->ۧ:[B

    .line 410
    invoke-virtual {p2}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Ll/۟֫ۜ;->֫:[B

    .line 411
    iput p3, p0, Ll/۟֫ۜ;->ܽ:I

    .line 412
    iput-boolean p4, p0, Ll/۟֫ۜ;->ᩳ:Z

    return-void
.end method
