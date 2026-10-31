.class public final Ll/᩷ۡۚ;
.super Ljava/lang/Object;
.source "C5XG"

# interfaces
.implements Ll/᩵֫ۚ;


# instance fields
.field public final synthetic ֫:Ljava/util/ArrayList;

.field public final synthetic ۧ:Ljava/util/ArrayList;

.field public final synthetic ܽ:I

.field public final synthetic ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 617
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/᩷ۡۚ;->ܽ:I

    iput-object p2, p0, Ll/᩷ۡۚ;->ۧ:Ljava/util/ArrayList;

    iput-object p3, p0, Ll/᩷ۡۚ;->ᩳ:Ljava/util/ArrayList;

    iput-object p4, p0, Ll/᩷ۡۚ;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ۜ()Ljava/util/List;
    .locals 1

    .line 632
    iget-object v0, p0, Ll/᩷ۡۚ;->ᩳ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۢ()Ljava/lang/Iterable;
    .locals 1

    .line 638
    iget-object v0, p0, Ll/᩷ۡۚ;->֫:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ᩷()Ljava/lang/Iterable;
    .locals 1

    .line 626
    iget-object v0, p0, Ll/᩷ۡۚ;->ۧ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ᩻()I
    .locals 1

    .line 620
    iget v0, p0, Ll/᩷ۡۚ;->ܽ:I

    return v0
.end method
