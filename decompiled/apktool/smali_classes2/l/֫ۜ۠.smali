.class public final Ll/֫ۜ۠;
.super Ll/᩷ۜ۠;
.source "Z5U8"


# instance fields
.field public final synthetic ܿ:Ll/᩶ۜ۠;


# direct methods
.method public constructor <init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/EnumSet;)V
    .locals 0

    .line 880
    iput-object p1, p0, Ll/֫ۜ۠;->ܿ:Ll/᩶ۜ۠;

    invoke-direct {p0, p1, p2, p3, p4}, Ll/᩷ۜ۠;-><init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final ֫(ILl/ۛ֡֨;)V
    .locals 6

    .line 882
    iget-object p2, p0, Ll/֫ۜ۠;->ܿ:Ll/᩶ۜ۠;

    iget v0, p2, Ll/᩶ۜ۠;->ܳ:I

    add-int/2addr v0, p1

    .line 883
    iget-boolean p1, p2, Ll/᩶ۜ۠;->᩺:Z

    if-eqz p1, :cond_2

    iget-boolean p1, p2, Ll/᩶ۜ۠;->ܰ:Z

    if-nez p1, :cond_2

    .line 893
    invoke-virtual {p2}, Ll/᩶ۜ۠;->ۧ()C

    move-result p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_2

    .line 895
    invoke-virtual {p2}, Ll/᩶ۜ۠;->ۧ()C

    move-result v2

    .line 896
    invoke-virtual {p2}, Ll/᩶ۜ۠;->ۧ()C

    .line 897
    invoke-virtual {p2}, Ll/᩶ۜ۠;->ۧ()C

    move-result v3

    .line 898
    invoke-virtual {p2}, Ll/᩶ۜ۠;->ۧ()C

    .line 899
    invoke-virtual {p2}, Ll/᩶ۜ۠;->ۧ()C

    move-result v4

    if-nez v2, :cond_1

    .line 902
    iget-object v2, p2, Ll/᩶ۜ۠;->ۗ:[I

    array-length v5, v2

    if-lt v4, v5, :cond_0

    add-int/lit8 v5, v4, 0x1

    .line 903
    array-length v2, v2

    add-int/lit8 v2, v2, 0x8

    .line 904
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 905
    iget-object v5, p2, Ll/᩶ۜ۠;->ۗ:[I

    .line 906
    invoke-static {v5, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    iput-object v2, p2, Ll/᩶ۜ۠;->ۗ:[I

    .line 908
    :cond_0
    iget-object v2, p2, Ll/᩶ۜ۠;->ۗ:[I

    aput v3, v2, v4

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 913
    :cond_2
    iput v0, p2, Ll/᩶ۜ۠;->ܳ:I

    return-void
.end method
