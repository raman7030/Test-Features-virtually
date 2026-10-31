.class public Ll/ۧۨۖ;
.super Ll/ܽۨۖ;
.source "W9GA"


# instance fields
.field public ܿ:I


# direct methods
.method public constructor <init>(ILl/᩹ۛۖ;Ll/᩺ۛۖ;JJI)V
    .locals 0

    .line 23
    invoke-direct/range {p0 .. p7}, Ll/ܽۨۖ;-><init>(ILl/᩹ۛۖ;Ll/᩺ۛۖ;JJ)V

    .line 24
    iput p8, p0, Ll/ۧۨۖ;->ܿ:I

    return-void
.end method


# virtual methods
.method public final ۜ()I
    .locals 2

    .line 137
    invoke-virtual {p0}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v0

    check-cast v0, Ll/᩻ۨۖ;

    invoke-virtual {v0}, Ll/᩻ۨۖ;->ᩳ()I

    move-result v0

    const/high16 v1, 0x10000

    mul-int v0, v0, v1

    .line 33
    iget v1, p0, Ll/ۧۨۖ;->ܿ:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 29
    iget v0, p0, Ll/ۧۨۖ;->ܿ:I

    return v0
.end method
