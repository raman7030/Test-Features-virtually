.class public final Ll/ۙۜۜ;
.super Ljava/lang/Object;
.source "87AO"


# instance fields
.field public final ֫:J

.field public final ۜ:J

.field public final ۢ:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:J

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:Z

.field public final ᩷:J

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJJIJLjava/lang/String;J)V
    .locals 0

    .line 553
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 554
    iput-object p1, p0, Ll/ۙۜۜ;->ܿ:Ljava/lang/String;

    const-string p1, ""

    if-nez p2, :cond_0

    move-object p2, p1

    .line 555
    :cond_0
    iput-object p2, p0, Ll/ۙۜۜ;->ܳ:Ljava/lang/String;

    if-nez p3, :cond_1

    move-object p3, p1

    .line 556
    :cond_1
    iput-object p3, p0, Ll/ۙۜۜ;->ۧ:Ljava/lang/String;

    .line 557
    iput-boolean p4, p0, Ll/ۙۜۜ;->ᩳ:Z

    .line 558
    iput-wide p5, p0, Ll/ۙۜۜ;->ۜ:J

    .line 559
    iput-wide p7, p0, Ll/ۙۜۜ;->ܽ:J

    .line 560
    iput p9, p0, Ll/ۙۜۜ;->᩻:I

    .line 561
    iput-wide p10, p0, Ll/ۙۜۜ;->֫:J

    .line 562
    iput-object p12, p0, Ll/ۙۜۜ;->ۢ:Ljava/lang/String;

    .line 563
    iput-wide p13, p0, Ll/ۙۜۜ;->᩷:J

    return-void
.end method
