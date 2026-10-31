.class public final Ll/᩻ܰܿ;
.super Ljava/lang/Object;
.source "D5GW"


# instance fields
.field public final ֫:Z

.field public final ۧ:J

.field public final ܽ:Z

.field public final ܿ:I

.field public final ᩳ:I


# direct methods
.method public synthetic constructor <init>(IIIJZZ)V
    .locals 7

    move-object v0, p0

    move-wide v1, p4

    move v3, p1

    move v4, p2

    move v5, p6

    move v6, p7

    .line 0
    invoke-direct/range {v0 .. v6}, Ll/᩻ܰܿ;-><init>(JIIZZ)V

    return-void
.end method

.method public constructor <init>(JIIZZ)V
    .locals 0

    .line 1204
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1205
    iput-wide p1, p0, Ll/᩻ܰܿ;->ۧ:J

    .line 1206
    iput p3, p0, Ll/᩻ܰܿ;->ܿ:I

    .line 1207
    iput p4, p0, Ll/᩻ܰܿ;->ᩳ:I

    .line 1208
    iput-boolean p5, p0, Ll/᩻ܰܿ;->ܽ:Z

    .line 1209
    iput-boolean p6, p0, Ll/᩻ܰܿ;->֫:Z

    return-void
.end method

.method public static ֫(JIIZZ)Ll/᩻ܰܿ;
    .locals 8

    .line 1215
    new-instance v7, Ll/᩻ܰܿ;

    move-object v0, v7

    move-wide v1, p0

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Ll/᩻ܰܿ;-><init>(JIIZZ)V

    return-object v7
.end method
