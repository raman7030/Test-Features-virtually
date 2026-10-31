.class public final Ll/ۨۡۚ;
.super Ll/֡᩵ۚ;
.source "151T"


# instance fields
.field public final synthetic ᩸:Ll/᩺ۡۚ;


# direct methods
.method public constructor <init>(Ll/᩺ۡۚ;)V
    .locals 0

    .line 83
    iput-object p1, p0, Ll/ۨۡۚ;->᩸:Ll/᩺ۡۚ;

    .line 42
    invoke-direct {p0}, Ljava/util/AbstractSequentialList;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 87
    iget-object v0, p0, Ll/ۨۡۚ;->᩸:Ll/᩺ۡۚ;

    iget-object v1, v0, Ll/᩺ۡۚ;->᩹:Ljava/util/SortedSet;

    invoke-static {v1}, Ll/᩸ۗܺ;->֫(Ljava/lang/Iterable;)Ll/᩸ۗܺ;

    move-result-object v1

    iget v0, v0, Ll/᩺ۡۚ;->᩸:I

    add-int/lit8 v0, v0, 0x1

    .line 88
    invoke-virtual {v1, v0}, Ll/᩸ۗܺ;->֫(I)Ll/᩸ۗܺ;

    move-result-object v0

    invoke-static {}, Ll/ܰۡۚ;->֫()Ll/ܽܶܺ;

    move-result-object v1

    .line 89
    invoke-virtual {v0, v1}, Ll/᩸ۗܺ;->֫(Ll/ܽܶܺ;)Ll/᩸ۗܺ;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 94
    iget-object v0, p0, Ll/ۨۡۚ;->᩸:Ll/᩺ۡۚ;

    iget v0, v0, Ll/᩺ۡۚ;->᩸:I

    add-int/lit8 v0, v0, 0x1

    return v0
.end method
