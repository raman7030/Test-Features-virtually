.class public final Ll/ܽۡۜ;
.super Ljava/lang/Object;
.source "R6YN"


# instance fields
.field public final ֫:J

.field public final ۧ:[B

.field public final ܽ:J

.field public final ܿ:J

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(JJLjava/lang/String;[B)V
    .locals 2

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p6, p0, Ll/ܽۡۜ;->ۧ:[B

    .line 84
    iput-wide p1, p0, Ll/ܽۡۜ;->֫:J

    .line 85
    array-length p6, p6

    int-to-long v0, p6

    add-long/2addr p1, v0

    iput-wide p1, p0, Ll/ܽۡۜ;->ܽ:J

    .line 86
    iput-wide p3, p0, Ll/ܽۡۜ;->ܿ:J

    .line 87
    iput-object p5, p0, Ll/ܽۡۜ;->ᩳ:Ljava/lang/String;

    return-void
.end method
