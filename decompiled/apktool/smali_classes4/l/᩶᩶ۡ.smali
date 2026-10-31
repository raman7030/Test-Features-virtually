.class public final Ll/᩶᩶ۡ;
.super Ljava/lang/Object;
.source "UBKB"


# instance fields
.field public final ֫:I

.field public ۧ:Ll/᩶᩶ۡ;

.field public final ܽ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    .line 1053
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1054
    iput p1, p0, Ll/᩶᩶ۡ;->ܽ:I

    .line 1055
    iput p2, p0, Ll/᩶᩶ۡ;->֫:I

    .line 1056
    iput p3, p0, Ll/᩶᩶ۡ;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 1068
    iget v0, p0, Ll/᩶᩶ۡ;->֫:I

    return v0
.end method

.method public final ֫(Ll/᩶᩶ۡ;)V
    .locals 0

    .line 1076
    iput-object p1, p0, Ll/᩶᩶ۡ;->ۧ:Ll/᩶᩶ۡ;

    return-void
.end method

.method public final ۧ()Ll/᩶᩶ۡ;
    .locals 1

    .line 1072
    iget-object v0, p0, Ll/᩶᩶ۡ;->ۧ:Ll/᩶᩶ۡ;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 1060
    iget v0, p0, Ll/᩶᩶ۡ;->ܽ:I

    return v0
.end method

.method public final ܿ()Ll/ۗ᩶ۡ;
    .locals 10

    .line 1082
    iget-object v0, p0, Ll/᩶᩶ۡ;->ۧ:Ll/᩶᩶ۡ;

    if-eqz v0, :cond_0

    .line 1060
    iget v1, v0, Ll/᩶᩶ۡ;->ܽ:I

    .line 1068
    iget v2, v0, Ll/᩶᩶ۡ;->֫:I

    .line 1064
    iget v0, v0, Ll/᩶᩶ۡ;->ᩳ:I

    goto :goto_0

    .line 1082
    :cond_0
    iget v1, p0, Ll/᩶᩶ۡ;->ܽ:I

    iget v2, p0, Ll/᩶᩶ۡ;->֫:I

    iget v0, p0, Ll/᩶᩶ۡ;->ᩳ:I

    :goto_0
    move v9, v0

    move v7, v1

    move v8, v2

    .line 1088
    new-instance v0, Ll/ۗ᩶ۡ;

    iget v5, p0, Ll/᩶᩶ۡ;->֫:I

    iget v6, p0, Ll/᩶᩶ۡ;->ᩳ:I

    iget v4, p0, Ll/᩶᩶ۡ;->ܽ:I

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Ll/ۗ᩶ۡ;-><init>(IIIIII)V

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 1064
    iget v0, p0, Ll/᩶᩶ۡ;->ᩳ:I

    return v0
.end method
