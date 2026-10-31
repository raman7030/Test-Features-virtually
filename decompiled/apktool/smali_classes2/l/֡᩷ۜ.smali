.class public final Ll/֡᩷ۜ;
.super Ljava/lang/Object;
.source "N7AJ"


# instance fields
.field public ֫:J

.field public ۖ:J

.field public ۘ:Z

.field public ۜ:Z

.field public ۡ:J

.field public ۢ:Ljava/lang/String;

.field public final ۧ:Ljava/util/ArrayList;

.field public ܳ:Ljava/lang/String;

.field public ܺ:Ljava/lang/String;

.field public final ܽ:Ll/ܶ᩵ܿ;

.field public ܿ:Ljava/lang/String;

.field public ᩳ:J

.field public final ᩴ:Ljava/lang/String;

.field public ᩷:Ljava/lang/String;

.field public ᩻:J


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V
    .locals 3

    .line 676
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 663
    iput-wide v0, p0, Ll/֡᩷ۜ;->ᩳ:J

    .line 664
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Ll/֡᩷ۜ;->ۧ:Ljava/util/ArrayList;

    const-string v2, "absent"

    .line 665
    iput-object v2, p0, Ll/֡᩷ۜ;->ۢ:Ljava/lang/String;

    .line 670
    iput-wide v0, p0, Ll/֡᩷ۜ;->᩻:J

    .line 677
    iput-object p1, p0, Ll/֡᩷ۜ;->ܽ:Ll/ܶ᩵ܿ;

    .line 678
    iput-object p2, p0, Ll/֡᩷ۜ;->ᩴ:Ljava/lang/String;

    return-void
.end method
