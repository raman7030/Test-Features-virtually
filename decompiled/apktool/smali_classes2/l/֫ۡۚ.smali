.class public final Ll/֫ۡۚ;
.super Ljava/util/AbstractList;
.source "V5R8"


# static fields
.field public static final ᩶:Ll/֫ۡۚ;


# instance fields
.field public ᩸:I

.field public final ᩹:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 44
    new-instance v0, Ll/֫ۡۚ;

    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/֫ۡۚ;-><init>(Ll/ܳ۬ܺ;)V

    sput-object v0, Ll/֫ۡۚ;->᩶:Ll/֫ۡۚ;

    return-void
.end method

.method public constructor <init>(Ll/ܳ۬ܺ;)V
    .locals 1

    .line 50
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    const/4 v0, 0x0

    .line 48
    iput v0, p0, Ll/֫ۡۚ;->᩸:I

    .line 51
    iput-object p1, p0, Ll/֫ۡۚ;->᩹:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 56
    iget-object v0, p0, Ll/֫ۡۚ;->᩹:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩻ۡۚ;

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 61
    iget-object v0, p0, Ll/֫ۡۚ;->᩹:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
