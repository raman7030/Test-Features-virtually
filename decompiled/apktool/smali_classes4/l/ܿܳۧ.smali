.class public final Ll/ܿܳۧ;
.super Ljava/lang/Object;
.source "763M"


# instance fields
.field public final ֫:J

.field public final ۧ:I


# direct methods
.method public constructor <init>(IJ)V
    .locals 0

    .line 213
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 214
    iput p1, p0, Ll/ܿܳۧ;->ۧ:I

    .line 215
    iput-wide p2, p0, Ll/ܿܳۧ;->֫:J

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܿܳۧ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ܿܳۧ;->֫:J

    return-wide v0
.end method

.method public static bridge synthetic ۧ(Ll/ܿܳۧ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܿܳۧ;->ۧ:I

    return p0
.end method


# virtual methods
.method public final ֫()Z
    .locals 2

    const/4 v0, 0x1

    .line 220
    iget v1, p0, Ll/ܿܳۧ;->ۧ:I

    if-eqz v1, :cond_1

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return v0
.end method
