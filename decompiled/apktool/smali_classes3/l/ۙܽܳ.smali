.class public final synthetic Ll/ۙܽܳ;
.super Ljava/lang/Object;
.source "970R"

# interfaces
.implements Ll/᩸ܽܳ;


# instance fields
.field public final synthetic ֫:I

.field public final synthetic ۧ:[J


# direct methods
.method public synthetic constructor <init>(I[J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ۙܽܳ;->֫:I

    iput-object p2, p0, Ll/ۙܽܳ;->ۧ:[J

    return-void
.end method


# virtual methods
.method public final ֫(II)V
    .locals 5

    .line 729
    iget p1, p0, Ll/ۙܽܳ;->֫:I

    sub-int/2addr p2, p1

    ushr-int/lit8 p1, p2, 0x6

    .line 730
    iget-object v0, p0, Ll/ۙܽܳ;->ۧ:[J

    aget-wide v1, v0, p1

    and-int/lit8 p2, p2, 0x3f

    const-wide/16 v3, 0x1

    shl-long/2addr v3, p2

    or-long/2addr v1, v3

    aput-wide v1, v0, p1

    return-void
.end method
