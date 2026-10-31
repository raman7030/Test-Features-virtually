.class public final Ll/۠۬ᩳ;
.super Ljava/lang/Object;
.source "66UB"


# instance fields
.field public final ֫:J

.field public final ۜ:Ll/᩸۬ᩳ;

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:J

.field public final ܿ:I

.field public final ᩳ:Z

.field public volatile ᩻:J


# direct methods
.method public constructor <init>(Ll/᩸۬ᩳ;JJIIIZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Ll/۠۬ᩳ;->ۜ:Ll/᩸۬ᩳ;

    .line 19
    iput-wide p2, p0, Ll/۠۬ᩳ;->ܽ:J

    .line 20
    iput-wide p4, p0, Ll/۠۬ᩳ;->᩻:J

    .line 21
    iput p6, p0, Ll/۠۬ᩳ;->ۧ:I

    .line 22
    iput p7, p0, Ll/۠۬ᩳ;->ܿ:I

    .line 23
    iput p8, p0, Ll/۠۬ᩳ;->ܳ:I

    .line 24
    iput-boolean p9, p0, Ll/۠۬ᩳ;->ᩳ:Z

    .line 25
    invoke-static {p6, p8, p9}, Ll/ۧ۫ᩳ;->֫(IIZ)J

    move-result-wide p1

    iput-wide p1, p0, Ll/۠۬ᩳ;->֫:J

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 15
    iget-wide v0, p0, Ll/۠۬ᩳ;->᩻:J

    return-wide v0
.end method
