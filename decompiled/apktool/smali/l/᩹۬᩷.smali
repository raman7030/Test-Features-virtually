.class public final Ll/᩹۬᩷;
.super Ljava/lang/Object;
.source "J1IP"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ۙ:J

.field public final ᩶:Ll/ܶ᩵ܿ;

.field public final ᩸:Ll/ܶ᩵ܿ;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ljava/lang/String;J)V
    .locals 0

    .line 209
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 210
    iput-object p1, p0, Ll/᩹۬᩷;->᩸:Ll/ܶ᩵ܿ;

    .line 211
    iput-object p2, p0, Ll/᩹۬᩷;->᩶:Ll/ܶ᩵ܿ;

    .line 212
    iput-object p3, p0, Ll/᩹۬᩷;->᩹:Ljava/lang/String;

    .line 213
    iput-wide p4, p0, Ll/᩹۬᩷;->ۙ:J

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    .line 203
    check-cast p1, Ll/᩹۬᩷;

    .line 218
    iget-wide v0, p1, Ll/᩹۬᩷;->ۙ:J

    iget-wide v2, p0, Ll/᩹۬᩷;->ۙ:J

    sub-long/2addr v0, v2

    long-to-int p1, v0

    return p1
.end method
