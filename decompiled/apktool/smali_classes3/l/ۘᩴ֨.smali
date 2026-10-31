.class public final enum Ll/ۘᩴ֨;
.super Ll/ᩴᩴ֨;
.source "8404"


# direct methods
.method public synthetic constructor <init>()V
    .locals 4

    const/16 v0, 0x3e

    const-wide/high16 v1, -0x8000000000000000L

    const-string v3, "NON_SEALED"

    .line 0
    invoke-direct {p0, v3, v0, v1, v2}, Ll/ۘᩴ֨;-><init>(Ljava/lang/String;IJ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJ)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-wide v3, p3

    .line 533
    invoke-direct/range {v0 .. v5}, Ll/ᩴᩴ֨;-><init>(Ljava/lang/String;IJI)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "non-sealed"

    return-object v0
.end method
