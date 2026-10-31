.class public final Ll/ۢۡۚ;
.super Ll/ۢ۬֡;
.source "C5XG"


# instance fields
.field public final synthetic ֫:I

.field public final synthetic ۧ:Ljava/util/ArrayList;

.field public final synthetic ܽ:I


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;II)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 653
    iput p2, p0, Ll/ۢۡۚ;->ܽ:I

    iput p3, p0, Ll/ۢۡۚ;->֫:I

    iput-object p1, p0, Ll/ۢۡۚ;->ۧ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 656
    iget v0, p0, Ll/ۢۡۚ;->ܽ:I

    return v0
.end method

.method public final ۧ()Ljava/util/List;
    .locals 1

    .line 667
    iget-object v0, p0, Ll/ۢۡۚ;->ۧ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 661
    iget v0, p0, Ll/ۢۡۚ;->֫:I

    return v0
.end method
