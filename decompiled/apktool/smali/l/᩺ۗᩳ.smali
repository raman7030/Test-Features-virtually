.class public final Ll/᩺ۗᩳ;
.super Ljava/lang/Object;
.source "I6U1"


# static fields
.field public static final ܽ:Ll/᩺ۗᩳ;


# instance fields
.field public final ֫:Ll/ۨۗᩳ;

.field public final ۧ:J


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 983
    new-instance v0, Ll/᩺ۗᩳ;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1e

    .line 984
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v1

    sget-object v3, Ll/᩷ۗᩳ;->֫:Ll/᩷ۗᩳ;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, v1, v2}, Ll/᩺ۗᩳ;-><init>(J)V

    sput-object v0, Ll/᩺ۗᩳ;->ܽ:Ll/᩺ۗᩳ;

    return-void
.end method

.method public constructor <init>(J)V
    .locals 1

    .line 990
    new-instance v0, Ll/ۨۗᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 994
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 995
    iput-wide p1, p0, Ll/᩺ۗᩳ;->ۧ:J

    .line 996
    iput-object v0, p0, Ll/᩺ۗᩳ;->֫:Ll/ۨۗᩳ;

    return-void
.end method
