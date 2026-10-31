.class public final Ll/ۡ۟֫;
.super Ljava/lang/Object;
.source "W8Q2"


# static fields
.field public static final ܿ:Ll/ۡ۟֫;


# instance fields
.field public final ֫:Ll/᩷֨֫;

.field public final ۧ:J

.field public final ܽ:J

.field public final ᩳ:J


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 2769
    new-instance v7, Ll/ۡ۟֫;

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ll/ۡ۟֫;-><init>(JJJ)V

    sput-object v7, Ll/ۡ۟֫;->ܿ:Ll/ۡ۟֫;

    return-void
.end method

.method public constructor <init>(JJJ)V
    .locals 0

    .line 2781
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2782
    iput-wide p1, p0, Ll/ۡ۟֫;->ۧ:J

    .line 2783
    iput-wide p3, p0, Ll/ۡ۟֫;->ܽ:J

    .line 2784
    iput-wide p5, p0, Ll/ۡ۟֫;->ᩳ:J

    .line 2785
    new-instance p1, Ll/᩷֨֫;

    invoke-direct {p1}, Ll/᩷֨֫;-><init>()V

    iput-object p1, p0, Ll/ۡ۟֫;->֫:Ll/᩷֨֫;

    return-void
.end method
