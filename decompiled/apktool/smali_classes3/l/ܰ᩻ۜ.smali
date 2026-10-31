.class public final Ll/ܰ᩻ۜ;
.super Ljava/lang/Object;
.source "079R"


# instance fields
.field public final ֫:I

.field public final ۧ:[B

.field public final ܽ:[B


# direct methods
.method public constructor <init>(I[B[B)V
    .locals 0

    .line 501
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 502
    iput p1, p0, Ll/ܰ᩻ۜ;->֫:I

    .line 503
    iput-object p2, p0, Ll/ܰ᩻ۜ;->ۧ:[B

    .line 504
    iput-object p3, p0, Ll/ܰ᩻ۜ;->ܽ:[B

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 4

    .line 511
    iget v0, p0, Ll/ܰ᩻ۜ;->֫:I

    int-to-long v0, v0

    iget-object v2, p0, Ll/ܰ᩻ۜ;->ۧ:[B

    array-length v2, v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method
